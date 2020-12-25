# jCrackme
# https://crackmes.one/crackme/5ab77f5e33c5d40ad448c794

This is the sullution for jcrackme from crackmes.one

This crackme took a keyfile and checked the length. The file needed to contain exactly 10101 chars. the 10000th char needed to be a #, and the
first 10001 could be any char execpt a-f. 
The value of the 10000th char was unknown. It had to be ^= 0x30 ==19. 
19 =^ 0x30 equals 35. Checking an ascii table, hex value 35 is the hashtag char. After confirming the key worked, a
keygen was written and varified.
