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

(ns clj-unidecode.maps.X0b)
(def decode [
  "[?]" ;; 0x00
  "N" ;; 0x01
  "N" ;; 0x02
  "H" ;; 0x03
  "[?]" ;; 0x04
  "a" ;; 0x05
  "aa" ;; 0x06
  "i" ;; 0x07
  "ii" ;; 0x08
  "u" ;; 0x09
  "uu" ;; 0x0a
  "R" ;; 0x0b
  "L" ;; 0x0c
  "[?]" ;; 0x0d
  "[?]" ;; 0x0e
  "e" ;; 0x0f
  "ai" ;; 0x10
  "[?]" ;; 0x11
  "[?]" ;; 0x12
  "o" ;; 0x13
  "au" ;; 0x14
  "k" ;; 0x15
  "kh" ;; 0x16
  "g" ;; 0x17
  "gh" ;; 0x18
  "ng" ;; 0x19
  "c" ;; 0x1a
  "ch" ;; 0x1b
  "j" ;; 0x1c
  "jh" ;; 0x1d
  "ny" ;; 0x1e
  "tt" ;; 0x1f
  "tth" ;; 0x20
  "dd" ;; 0x21
  "ddh" ;; 0x22
  "nn" ;; 0x23
  "t" ;; 0x24
  "th" ;; 0x25
  "d" ;; 0x26
  "dh" ;; 0x27
  "n" ;; 0x28
  "[?]" ;; 0x29
  "p" ;; 0x2a
  "ph" ;; 0x2b
  "b" ;; 0x2c
  "bh" ;; 0x2d
  "m" ;; 0x2e
  "y" ;; 0x2f
  "r" ;; 0x30
  "[?]" ;; 0x31
  "l" ;; 0x32
  "ll" ;; 0x33
  "[?]" ;; 0x34
  "" ;; 0x35
  "sh" ;; 0x36
  "ss" ;; 0x37
  "s" ;; 0x38
  "h" ;; 0x39
  "[?]" ;; 0x3a
  "[?]" ;; 0x3b
  "'" ;; 0x3c
  "'" ;; 0x3d
  "aa" ;; 0x3e
  "i" ;; 0x3f
  "ii" ;; 0x40
  "u" ;; 0x41
  "uu" ;; 0x42
  "R" ;; 0x43
  "[?]" ;; 0x44
  "[?]" ;; 0x45
  "[?]" ;; 0x46
  "e" ;; 0x47
  "ai" ;; 0x48
  "[?]" ;; 0x49
  "[?]" ;; 0x4a
  "o" ;; 0x4b
  "au" ;; 0x4c
  "" ;; 0x4d
  "[?]" ;; 0x4e
  "[?]" ;; 0x4f
  "[?]" ;; 0x50
  "[?]" ;; 0x51
  "[?]" ;; 0x52
  "[?]" ;; 0x53
  "[?]" ;; 0x54
  "[?]" ;; 0x55
  "+" ;; 0x56
  "+" ;; 0x57
  "[?]" ;; 0x58
  "[?]" ;; 0x59
  "[?]" ;; 0x5a
  "[?]" ;; 0x5b
  "rr" ;; 0x5c
  "rh" ;; 0x5d
  "[?]" ;; 0x5e
  "yy" ;; 0x5f
  "RR" ;; 0x60
  "LL" ;; 0x61
  "[?]" ;; 0x62
  "[?]" ;; 0x63
  "[?]" ;; 0x64
  "[?]" ;; 0x65
  "0" ;; 0x66
  "1" ;; 0x67
  "2" ;; 0x68
  "3" ;; 0x69
  "4" ;; 0x6a
  "5" ;; 0x6b
  "6" ;; 0x6c
  "7" ;; 0x6d
  "8" ;; 0x6e
  "9" ;; 0x6f
  "" ;; 0x70
  "[?]" ;; 0x71
  "[?]" ;; 0x72
  "[?]" ;; 0x73
  "[?]" ;; 0x74
  "[?]" ;; 0x75
  "[?]" ;; 0x76
  "[?]" ;; 0x77
  "[?]" ;; 0x78
  "[?]" ;; 0x79
  "[?]" ;; 0x7a
  "[?]" ;; 0x7b
  "[?]" ;; 0x7c
  "[?]" ;; 0x7d
  "[?]" ;; 0x7e
  "[?]" ;; 0x7f
  "[?]" ;; 0x80
  "[?]" ;; 0x81
  "N" ;; 0x82
  "H" ;; 0x83
  "[?]" ;; 0x84
  "a" ;; 0x85
  "aa" ;; 0x86
  "i" ;; 0x87
  "ii" ;; 0x88
  "u" ;; 0x89
  "uu" ;; 0x8a
  "[?]" ;; 0x8b
  "[?]" ;; 0x8c
  "[?]" ;; 0x8d
  "e" ;; 0x8e
  "ee" ;; 0x8f
  "ai" ;; 0x90
  "[?]" ;; 0x91
  "o" ;; 0x92
  "oo" ;; 0x93
  "au" ;; 0x94
  "k" ;; 0x95
  "[?]" ;; 0x96
  "[?]" ;; 0x97
  "[?]" ;; 0x98
  "ng" ;; 0x99
  "c" ;; 0x9a
  "[?]" ;; 0x9b
  "j" ;; 0x9c
  "[?]" ;; 0x9d
  "ny" ;; 0x9e
  "tt" ;; 0x9f
  "[?]" ;; 0xa0
  "[?]" ;; 0xa1
  "[?]" ;; 0xa2
  "nn" ;; 0xa3
  "t" ;; 0xa4
  "[?]" ;; 0xa5
  "[?]" ;; 0xa6
  "[?]" ;; 0xa7
  "n" ;; 0xa8
  "nnn" ;; 0xa9
  "p" ;; 0xaa
  "[?]" ;; 0xab
  "[?]" ;; 0xac
  "[?]" ;; 0xad
  "m" ;; 0xae
  "y" ;; 0xaf
  "r" ;; 0xb0
  "rr" ;; 0xb1
  "l" ;; 0xb2
  "ll" ;; 0xb3
  "lll" ;; 0xb4
  "v" ;; 0xb5
  "[?]" ;; 0xb6
  "ss" ;; 0xb7
  "s" ;; 0xb8
  "h" ;; 0xb9
  "[?]" ;; 0xba
  "[?]" ;; 0xbb
  "[?]" ;; 0xbc
  "[?]" ;; 0xbd
  "aa" ;; 0xbe
  "i" ;; 0xbf
  "ii" ;; 0xc0
  "u" ;; 0xc1
  "uu" ;; 0xc2
  "[?]" ;; 0xc3
  "[?]" ;; 0xc4
  "[?]" ;; 0xc5
  "e" ;; 0xc6
  "ee" ;; 0xc7
  "ai" ;; 0xc8
  "[?]" ;; 0xc9
  "o" ;; 0xca
  "oo" ;; 0xcb
  "au" ;; 0xcc
  "" ;; 0xcd
  "[?]" ;; 0xce
  "[?]" ;; 0xcf
  "[?]" ;; 0xd0
  "[?]" ;; 0xd1
  "[?]" ;; 0xd2
  "[?]" ;; 0xd3
  "[?]" ;; 0xd4
  "[?]" ;; 0xd5
  "[?]" ;; 0xd6
  "+" ;; 0xd7
  "[?]" ;; 0xd8
  "[?]" ;; 0xd9
  "[?]" ;; 0xda
  "[?]" ;; 0xdb
  "[?]" ;; 0xdc
  "[?]" ;; 0xdd
  "[?]" ;; 0xde
  "[?]" ;; 0xdf
  "[?]" ;; 0xe0
  "[?]" ;; 0xe1
  "[?]" ;; 0xe2
  "[?]" ;; 0xe3
  "[?]" ;; 0xe4
  "[?]" ;; 0xe5
  "0" ;; 0xe6
  "1" ;; 0xe7
  "2" ;; 0xe8
  "3" ;; 0xe9
  "4" ;; 0xea
  "5" ;; 0xeb
  "6" ;; 0xec
  "7" ;; 0xed
  "8" ;; 0xee
  "9" ;; 0xef
  "+10+" ;; 0xf0
  "+100+" ;; 0xf1
  "+1000+" ;; 0xf2
  "[?]" ;; 0xf3
  "[?]" ;; 0xf4
  "[?]" ;; 0xf5
  "[?]" ;; 0xf6
  "[?]" ;; 0xf7
  "[?]" ;; 0xf8
  "[?]" ;; 0xf9
  "[?]" ;; 0xfa
  "[?]" ;; 0xfb
  "[?]" ;; 0xfc
  "[?]" ;; 0xfd
  "[?]" ;; 0xfe
])
