# Makefile for GCD.c
# Daniel Schmelter
# lab8
# dschmelt
# 12-3-15

GCD: GCD.o
	gcc -o GCD GCD.o

GCD.o: GCD.c
	gcc -c -std=c99 GCD.c

clean:
	rm -f GCD GCD.o

submit: Makefile GCD.c
	submit cmps012a-pt.f15 lab8 Makefile GCD.c
