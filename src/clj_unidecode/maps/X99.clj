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

(ns clj-unidecode.maps.X99)
(def decode [
  "Hai " ;; 0x00
  "Ren " ;; 0x01
  "Tian " ;; 0x02
  "Jiao " ;; 0x03
  "Jia " ;; 0x04
  "Bing " ;; 0x05
  "Yao " ;; 0x06
  "Tong " ;; 0x07
  "Ci " ;; 0x08
  "Xiang " ;; 0x09
  "Yang " ;; 0x0a
  "Yang " ;; 0x0b
  "Er " ;; 0x0c
  "Yan " ;; 0x0d
  "Le " ;; 0x0e
  "Yi " ;; 0x0f
  "Can " ;; 0x10
  "Bo " ;; 0x11
  "Nei " ;; 0x12
  "E " ;; 0x13
  "Bu " ;; 0x14
  "Jun " ;; 0x15
  "Dou " ;; 0x16
  "Su " ;; 0x17
  "Yu " ;; 0x18
  "Shi " ;; 0x19
  "Yao " ;; 0x1a
  "Hun " ;; 0x1b
  "Guo " ;; 0x1c
  "Shi " ;; 0x1d
  "Jian " ;; 0x1e
  "Zhui " ;; 0x1f
  "Bing " ;; 0x20
  "Xian " ;; 0x21
  "Bu " ;; 0x22
  "Ye " ;; 0x23
  "Tan " ;; 0x24
  "Fei " ;; 0x25
  "Zhang " ;; 0x26
  "Wei " ;; 0x27
  "Guan " ;; 0x28
  "E " ;; 0x29
  "Nuan " ;; 0x2a
  "Hun " ;; 0x2b
  "Hu " ;; 0x2c
  "Huang " ;; 0x2d
  "Tie " ;; 0x2e
  "Hui " ;; 0x2f
  "Jian " ;; 0x30
  "Hou " ;; 0x31
  "He " ;; 0x32
  "Xing " ;; 0x33
  "Fen " ;; 0x34
  "Wei " ;; 0x35
  "Gu " ;; 0x36
  "Cha " ;; 0x37
  "Song " ;; 0x38
  "Tang " ;; 0x39
  "Bo " ;; 0x3a
  "Gao " ;; 0x3b
  "Xi " ;; 0x3c
  "Kui " ;; 0x3d
  "Liu " ;; 0x3e
  "Sou " ;; 0x3f
  "Tao " ;; 0x40
  "Ye " ;; 0x41
  "Yun " ;; 0x42
  "Mo " ;; 0x43
  "Tang " ;; 0x44
  "Man " ;; 0x45
  "Bi " ;; 0x46
  "Yu " ;; 0x47
  "Xiu " ;; 0x48
  "Jin " ;; 0x49
  "San " ;; 0x4a
  "Kui " ;; 0x4b
  "Zhuan " ;; 0x4c
  "Shan " ;; 0x4d
  "Chi " ;; 0x4e
  "Dan " ;; 0x4f
  "Yi " ;; 0x50
  "Ji " ;; 0x51
  "Rao " ;; 0x52
  "Cheng " ;; 0x53
  "Yong " ;; 0x54
  "Tao " ;; 0x55
  "Hui " ;; 0x56
  "Xiang " ;; 0x57
  "Zhan " ;; 0x58
  "Fen " ;; 0x59
  "Hai " ;; 0x5a
  "Meng " ;; 0x5b
  "Yan " ;; 0x5c
  "Mo " ;; 0x5d
  "Chan " ;; 0x5e
  "Xiang " ;; 0x5f
  "Luo " ;; 0x60
  "Zuan " ;; 0x61
  "Nang " ;; 0x62
  "Shi " ;; 0x63
  "Ding " ;; 0x64
  "Ji " ;; 0x65
  "Tuo " ;; 0x66
  "Xing " ;; 0x67
  "Tun " ;; 0x68
  "Xi " ;; 0x69
  "Ren " ;; 0x6a
  "Yu " ;; 0x6b
  "Chi " ;; 0x6c
  "Fan " ;; 0x6d
  "Yin " ;; 0x6e
  "Jian " ;; 0x6f
  "Shi " ;; 0x70
  "Bao " ;; 0x71
  "Si " ;; 0x72
  "Duo " ;; 0x73
  "Yi " ;; 0x74
  "Er " ;; 0x75
  "Rao " ;; 0x76
  "Xiang " ;; 0x77
  "Jia " ;; 0x78
  "Le " ;; 0x79
  "Jiao " ;; 0x7a
  "Yi " ;; 0x7b
  "Bing " ;; 0x7c
  "Bo " ;; 0x7d
  "Dou " ;; 0x7e
  "E " ;; 0x7f
  "Yu " ;; 0x80
  "Nei " ;; 0x81
  "Jun " ;; 0x82
  "Guo " ;; 0x83
  "Hun " ;; 0x84
  "Xian " ;; 0x85
  "Guan " ;; 0x86
  "Cha " ;; 0x87
  "Kui " ;; 0x88
  "Gu " ;; 0x89
  "Sou " ;; 0x8a
  "Chan " ;; 0x8b
  "Ye " ;; 0x8c
  "Mo " ;; 0x8d
  "Bo " ;; 0x8e
  "Liu " ;; 0x8f
  "Xiu " ;; 0x90
  "Jin " ;; 0x91
  "Man " ;; 0x92
  "San " ;; 0x93
  "Zhuan " ;; 0x94
  "Nang " ;; 0x95
  "Shou " ;; 0x96
  "Kui " ;; 0x97
  "Guo " ;; 0x98
  "Xiang " ;; 0x99
  "Fen " ;; 0x9a
  "Ba " ;; 0x9b
  "Ni " ;; 0x9c
  "Bi " ;; 0x9d
  "Bo " ;; 0x9e
  "Tu " ;; 0x9f
  "Han " ;; 0xa0
  "Fei " ;; 0xa1
  "Jian " ;; 0xa2
  "An " ;; 0xa3
  "Ai " ;; 0xa4
  "Fu " ;; 0xa5
  "Xian " ;; 0xa6
  "Wen " ;; 0xa7
  "Xin " ;; 0xa8
  "Fen " ;; 0xa9
  "Bin " ;; 0xaa
  "Xing " ;; 0xab
  "Ma " ;; 0xac
  "Yu " ;; 0xad
  "Feng " ;; 0xae
  "Han " ;; 0xaf
  "Di " ;; 0xb0
  "Tuo " ;; 0xb1
  "Tuo " ;; 0xb2
  "Chi " ;; 0xb3
  "Xun " ;; 0xb4
  "Zhu " ;; 0xb5
  "Zhi " ;; 0xb6
  "Pei " ;; 0xb7
  "Xin " ;; 0xb8
  "Ri " ;; 0xb9
  "Sa " ;; 0xba
  "Yin " ;; 0xbb
  "Wen " ;; 0xbc
  "Zhi " ;; 0xbd
  "Dan " ;; 0xbe
  "Lu " ;; 0xbf
  "You " ;; 0xc0
  "Bo " ;; 0xc1
  "Bao " ;; 0xc2
  "Kuai " ;; 0xc3
  "Tuo " ;; 0xc4
  "Yi " ;; 0xc5
  "Qu " ;; 0xc6
  "[?] " ;; 0xc7
  "Qu " ;; 0xc8
  "Jiong " ;; 0xc9
  "Bo " ;; 0xca
  "Zhao " ;; 0xcb
  "Yuan " ;; 0xcc
  "Peng " ;; 0xcd
  "Zhou " ;; 0xce
  "Ju " ;; 0xcf
  "Zhu " ;; 0xd0
  "Nu " ;; 0xd1
  "Ju " ;; 0xd2
  "Pi " ;; 0xd3
  "Zang " ;; 0xd4
  "Jia " ;; 0xd5
  "Ling " ;; 0xd6
  "Zhen " ;; 0xd7
  "Tai " ;; 0xd8
  "Fu " ;; 0xd9
  "Yang " ;; 0xda
  "Shi " ;; 0xdb
  "Bi " ;; 0xdc
  "Tuo " ;; 0xdd
  "Tuo " ;; 0xde
  "Si " ;; 0xdf
  "Liu " ;; 0xe0
  "Ma " ;; 0xe1
  "Pian " ;; 0xe2
  "Tao " ;; 0xe3
  "Zhi " ;; 0xe4
  "Rong " ;; 0xe5
  "Teng " ;; 0xe6
  "Dong " ;; 0xe7
  "Xun " ;; 0xe8
  "Quan " ;; 0xe9
  "Shen " ;; 0xea
  "Jiong " ;; 0xeb
  "Er " ;; 0xec
  "Hai " ;; 0xed
  "Bo " ;; 0xee
  "Zhu " ;; 0xef
  "Yin " ;; 0xf0
  "Luo " ;; 0xf1
  "Shuu " ;; 0xf2
  "Dan " ;; 0xf3
  "Xie " ;; 0xf4
  "Liu " ;; 0xf5
  "Ju " ;; 0xf6
  "Song " ;; 0xf7
  "Qin " ;; 0xf8
  "Mang " ;; 0xf9
  "Liang " ;; 0xfa
  "Han " ;; 0xfb
  "Tu " ;; 0xfc
  "Xuan " ;; 0xfd
  "Tui " ;; 0xfe
  "Jun " ;; 0xff
])
