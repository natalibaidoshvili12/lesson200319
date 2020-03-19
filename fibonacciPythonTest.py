import unittest
from fibonacciPython import check
class FibonacciPythonTest(unittest.TestCase):
    def test0(self):
        self.assertEqual(0,check(0))
    def test1(self):
        self.assertEqual(0,check(1))
    def test2(self):
        self.assertEqual(1,check(2))
    def test3(self):
        self.assertEqual(1,check(3))
    def test4(self):
        self.assertEqual(2,check(4))
    def test5(self):
        self.assertEqual(3,check(5))
    def test6(self):
        self.assertEqual(5,check(6))
    def test7(self):
        self.assertEqual(8,check(7))
