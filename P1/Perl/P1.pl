$sum = 0;

for ($i = 3; $i < 1000; $i += 3) {
	if ($i % 15 != 0) {
		$sum += $i;
	}
}

for ($i = 5; $i < 1000; $i += 5) {
	$sum += $i;
}

print $sum . "\n";
