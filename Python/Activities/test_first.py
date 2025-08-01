import pytest
import math

def test_sqrt():
   num = 25
   assert math.sqrt(num) == 5

def testsquare():
   num = 7
   assert num*num == 40

def test_equality():# issue with speling,test should be there in beginning
   assert 10 == 11