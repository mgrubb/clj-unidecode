;;;
;;; Copyright (c) 2012 Michael Grubb
;;; All rights reserved.
;;; 
;;; Redistribution and use in source and binary forms, with or without
;;; modification, are permitted provided that the following conditions
;;; are met:
;;; 1. Redistributions of source code must retain the above copyright
;;;    notice, this list of conditions and the following disclaimer.
;;; 2. Redistributions in binary form must reproduce the above copyright
;;;    notice, this list of conditions and the following disclaimer in the
;;;    documentation and/or other materials provided with the distribution.
;;; 3. The name of the author may not be used to endorse or promote products
;;;    derived from this software without specific prior written permission.
;;; 
;;; THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
;;; IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
;;; OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
;;; IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
;;; INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
;;; NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
;;; DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
;;; THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
;;; (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
;;; THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
;;;

(ns clj-unidecode.maps.X1e)
(def decode [
  "A" ;; 0x00
  "a" ;; 0x01
  "B" ;; 0x02
  "b" ;; 0x03
  "B" ;; 0x04
  "b" ;; 0x05
  "B" ;; 0x06
  "b" ;; 0x07
  "C" ;; 0x08
  "c" ;; 0x09
  "D" ;; 0x0a
  "d" ;; 0x0b
  "D" ;; 0x0c
  "d" ;; 0x0d
  "D" ;; 0x0e
  "d" ;; 0x0f
  "D" ;; 0x10
  "d" ;; 0x11
  "D" ;; 0x12
  "d" ;; 0x13
  "E" ;; 0x14
  "e" ;; 0x15
  "E" ;; 0x16
  "e" ;; 0x17
  "E" ;; 0x18
  "e" ;; 0x19
  "E" ;; 0x1a
  "e" ;; 0x1b
  "E" ;; 0x1c
  "e" ;; 0x1d
  "F" ;; 0x1e
  "f" ;; 0x1f
  "G" ;; 0x20
  "g" ;; 0x21
  "H" ;; 0x22
  "h" ;; 0x23
  "H" ;; 0x24
  "h" ;; 0x25
  "H" ;; 0x26
  "h" ;; 0x27
  "H" ;; 0x28
  "h" ;; 0x29
  "H" ;; 0x2a
  "h" ;; 0x2b
  "I" ;; 0x2c
  "i" ;; 0x2d
  "I" ;; 0x2e
  "i" ;; 0x2f
  "K" ;; 0x30
  "k" ;; 0x31
  "K" ;; 0x32
  "k" ;; 0x33
  "K" ;; 0x34
  "k" ;; 0x35
  "L" ;; 0x36
  "l" ;; 0x37
  "L" ;; 0x38
  "l" ;; 0x39
  "L" ;; 0x3a
  "l" ;; 0x3b
  "L" ;; 0x3c
  "l" ;; 0x3d
  "M" ;; 0x3e
  "m" ;; 0x3f
  "M" ;; 0x40
  "m" ;; 0x41
  "M" ;; 0x42
  "m" ;; 0x43
  "N" ;; 0x44
  "n" ;; 0x45
  "N" ;; 0x46
  "n" ;; 0x47
  "N" ;; 0x48
  "n" ;; 0x49
  "N" ;; 0x4a
  "n" ;; 0x4b
  "O" ;; 0x4c
  "o" ;; 0x4d
  "O" ;; 0x4e
  "o" ;; 0x4f
  "O" ;; 0x50
  "o" ;; 0x51
  "O" ;; 0x52
  "o" ;; 0x53
  "P" ;; 0x54
  "p" ;; 0x55
  "P" ;; 0x56
  "p" ;; 0x57
  "R" ;; 0x58
  "r" ;; 0x59
  "R" ;; 0x5a
  "r" ;; 0x5b
  "R" ;; 0x5c
  "r" ;; 0x5d
  "R" ;; 0x5e
  "r" ;; 0x5f
  "S" ;; 0x60
  "s" ;; 0x61
  "S" ;; 0x62
  "s" ;; 0x63
  "S" ;; 0x64
  "s" ;; 0x65
  "S" ;; 0x66
  "s" ;; 0x67
  "S" ;; 0x68
  "s" ;; 0x69
  "T" ;; 0x6a
  "t" ;; 0x6b
  "T" ;; 0x6c
  "t" ;; 0x6d
  "T" ;; 0x6e
  "t" ;; 0x6f
  "T" ;; 0x70
  "t" ;; 0x71
  "U" ;; 0x72
  "u" ;; 0x73
  "U" ;; 0x74
  "u" ;; 0x75
  "U" ;; 0x76
  "u" ;; 0x77
  "U" ;; 0x78
  "u" ;; 0x79
  "U" ;; 0x7a
  "u" ;; 0x7b
  "V" ;; 0x7c
  "v" ;; 0x7d
  "V" ;; 0x7e
  "v" ;; 0x7f
  "W" ;; 0x80
  "w" ;; 0x81
  "W" ;; 0x82
  "w" ;; 0x83
  "W" ;; 0x84
  "w" ;; 0x85
  "W" ;; 0x86
  "w" ;; 0x87
  "W" ;; 0x88
  "w" ;; 0x89
  "X" ;; 0x8a
  "x" ;; 0x8b
  "X" ;; 0x8c
  "x" ;; 0x8d
  "Y" ;; 0x8e
  "y" ;; 0x8f
  "Z" ;; 0x90
  "z" ;; 0x91
  "Z" ;; 0x92
  "z" ;; 0x93
  "Z" ;; 0x94
  "z" ;; 0x95
  "h" ;; 0x96
  "t" ;; 0x97
  "w" ;; 0x98
  "y" ;; 0x99
  "a" ;; 0x9a
  "S" ;; 0x9b
  "[?]" ;; 0x9c
  "[?]" ;; 0x9d
  "[?]" ;; 0x9e
  "[?]" ;; 0x9f
  "A" ;; 0xa0
  "a" ;; 0xa1
  "A" ;; 0xa2
  "a" ;; 0xa3
  "A" ;; 0xa4
  "a" ;; 0xa5
  "A" ;; 0xa6
  "a" ;; 0xa7
  "A" ;; 0xa8
  "a" ;; 0xa9
  "A" ;; 0xaa
  "a" ;; 0xab
  "A" ;; 0xac
  "a" ;; 0xad
  "A" ;; 0xae
  "a" ;; 0xaf
  "A" ;; 0xb0
  "a" ;; 0xb1
  "A" ;; 0xb2
  "a" ;; 0xb3
  "A" ;; 0xb4
  "a" ;; 0xb5
  "A" ;; 0xb6
  "a" ;; 0xb7
  "E" ;; 0xb8
  "e" ;; 0xb9
  "E" ;; 0xba
  "e" ;; 0xbb
  "E" ;; 0xbc
  "e" ;; 0xbd
  "E" ;; 0xbe
  "e" ;; 0xbf
  "E" ;; 0xc0
  "e" ;; 0xc1
  "E" ;; 0xc2
  "e" ;; 0xc3
  "E" ;; 0xc4
  "e" ;; 0xc5
  "E" ;; 0xc6
  "e" ;; 0xc7
  "I" ;; 0xc8
  "i" ;; 0xc9
  "I" ;; 0xca
  "i" ;; 0xcb
  "O" ;; 0xcc
  "o" ;; 0xcd
  "O" ;; 0xce
  "o" ;; 0xcf
  "O" ;; 0xd0
  "o" ;; 0xd1
  "O" ;; 0xd2
  "o" ;; 0xd3
  "O" ;; 0xd4
  "o" ;; 0xd5
  "O" ;; 0xd6
  "o" ;; 0xd7
  "O" ;; 0xd8
  "o" ;; 0xd9
  "O" ;; 0xda
  "o" ;; 0xdb
  "O" ;; 0xdc
  "o" ;; 0xdd
  "O" ;; 0xde
  "o" ;; 0xdf
  "O" ;; 0xe0
  "o" ;; 0xe1
  "O" ;; 0xe2
  "o" ;; 0xe3
  "U" ;; 0xe4
  "u" ;; 0xe5
  "U" ;; 0xe6
  "u" ;; 0xe7
  "U" ;; 0xe8
  "u" ;; 0xe9
  "U" ;; 0xea
  "u" ;; 0xeb
  "U" ;; 0xec
  "u" ;; 0xed
  "U" ;; 0xee
  "u" ;; 0xef
  "U" ;; 0xf0
  "u" ;; 0xf1
  "Y" ;; 0xf2
  "y" ;; 0xf3
  "Y" ;; 0xf4
  "y" ;; 0xf5
  "Y" ;; 0xf6
  "y" ;; 0xf7
  "Y" ;; 0xf8
  "y" ;; 0xf9
  "[?]" ;; 0xfa
  "[?]" ;; 0xfb
  "[?]" ;; 0xfc
  "[?]" ;; 0xfd
  "[?]" ;; 0xfe
])
