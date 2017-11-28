const express = require('express');

let votes = [];

let app = express();

// set up handlebars view engine
let handlebars = require('express-handlebars')
	.create({ defaultLayout:'main' });
app.engine('handlebars', handlebars.engine);
app.set('view engine', 'handlebars');

app.set('port', process.env.PORT || 3000);

app.use(express.static(__dirname + '/public'));

// home page shows images and voting
app.get('/', function(req, res) {
	res.render('home');
});
app.get('/admin', function(req, res) {
	res.render('admin');
});

app.get('/viewLog', function(req, res) {
	res.render('viewLog');
});

app.get('/nonfaculty', function(req, res) {
	res.render('nonfaculty');
});

app.get('/faculty', function(req, res) {
	res.render('faculty');
});
//results page shows results of selection
app.get('/results/:pet', function(req, res) {
	const thisDate = new Date;
	
	votes.push({
		ip: req.headers['x-forwarded-for'] || req.connection.remoteAddress,
		timestamp: thisDate.toLocaleDateString()
	});
	
	res.render('results', 	
	{
	petName: req.params.pet,
	votes: votes,
	showResults: req.query.showResults === 'true'
	}
	);
});

// 404 catch-all handler (middleware)
app.use(function(req, res, next){
	res.status(404);
	res.render('404');
});

// 500 error handler (middleware)
app.use(function(err, req, res, next){
	console.error(err.stack);
	res.status(500);
	res.render('500');
});

app.listen(app.get('port'), function(){
  console.log( 'Express started on http://localhost:' +
    app.get('port') + '; press Ctrl-C to terminate.' );
});
