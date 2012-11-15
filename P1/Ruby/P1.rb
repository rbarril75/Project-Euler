$sum = 0

(1..333).each do |i|
	i = i * 3
	if i % 15 != 0
		$sum += i
	end
end

(1..199).each do |i|
	$sum += i * 5
end

puts $sum