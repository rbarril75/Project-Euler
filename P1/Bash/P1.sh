sum=0

for i in {1..333}
do
  i=$(($i * 3))
  if [ $(($i % 15)) -ne 0 ]
  then
    sum=$(($sum + $i))
  fi
done

for i in {1..199}
do
  i=$(($i * 5))
  sum=$(($sum + $i))
done

echo $sum
