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

(ns clj-unidecode.maps.X95)
(def decode [
  "Xiao " ;; 0x00
  "Suo " ;; 0x01
  "Li " ;; 0x02
  "Zheng " ;; 0x03
  "Chu " ;; 0x04
  "Guo " ;; 0x05
  "Gao " ;; 0x06
  "Tie " ;; 0x07
  "Xiu " ;; 0x08
  "Cuo " ;; 0x09
  "Lue " ;; 0x0a
  "Feng " ;; 0x0b
  "Xin " ;; 0x0c
  "Liu " ;; 0x0d
  "Kai " ;; 0x0e
  "Jian " ;; 0x0f
  "Rui " ;; 0x10
  "Ti " ;; 0x11
  "Lang " ;; 0x12
  "Qian " ;; 0x13
  "Ju " ;; 0x14
  "A " ;; 0x15
  "Qiang " ;; 0x16
  "Duo " ;; 0x17
  "Tian " ;; 0x18
  "Cuo " ;; 0x19
  "Mao " ;; 0x1a
  "Ben " ;; 0x1b
  "Qi " ;; 0x1c
  "De " ;; 0x1d
  "Kua " ;; 0x1e
  "Kun " ;; 0x1f
  "Chang " ;; 0x20
  "Xi " ;; 0x21
  "Gu " ;; 0x22
  "Luo " ;; 0x23
  "Chui " ;; 0x24
  "Zhui " ;; 0x25
  "Jin " ;; 0x26
  "Zhi " ;; 0x27
  "Xian " ;; 0x28
  "Juan " ;; 0x29
  "Huo " ;; 0x2a
  "Pou " ;; 0x2b
  "Tan " ;; 0x2c
  "Ding " ;; 0x2d
  "Jian " ;; 0x2e
  "Ju " ;; 0x2f
  "Meng " ;; 0x30
  "Zi " ;; 0x31
  "Qie " ;; 0x32
  "Ying " ;; 0x33
  "Kai " ;; 0x34
  "Qiang " ;; 0x35
  "Song " ;; 0x36
  "E " ;; 0x37
  "Cha " ;; 0x38
  "Qiao " ;; 0x39
  "Zhong " ;; 0x3a
  "Duan " ;; 0x3b
  "Sou " ;; 0x3c
  "Huang " ;; 0x3d
  "Huan " ;; 0x3e
  "Ai " ;; 0x3f
  "Du " ;; 0x40
  "Mei " ;; 0x41
  "Lou " ;; 0x42
  "Zi " ;; 0x43
  "Fei " ;; 0x44
  "Mei " ;; 0x45
  "Mo " ;; 0x46
  "Zhen " ;; 0x47
  "Bo " ;; 0x48
  "Ge " ;; 0x49
  "Nie " ;; 0x4a
  "Tang " ;; 0x4b
  "Juan " ;; 0x4c
  "Nie " ;; 0x4d
  "Na " ;; 0x4e
  "Liu " ;; 0x4f
  "Hao " ;; 0x50
  "Bang " ;; 0x51
  "Yi " ;; 0x52
  "Jia " ;; 0x53
  "Bin " ;; 0x54
  "Rong " ;; 0x55
  "Biao " ;; 0x56
  "Tang " ;; 0x57
  "Man " ;; 0x58
  "Luo " ;; 0x59
  "Beng " ;; 0x5a
  "Yong " ;; 0x5b
  "Jing " ;; 0x5c
  "Di " ;; 0x5d
  "Zu " ;; 0x5e
  "Xuan " ;; 0x5f
  "Liu " ;; 0x60
  "Tan " ;; 0x61
  "Jue " ;; 0x62
  "Liao " ;; 0x63
  "Pu " ;; 0x64
  "Lu " ;; 0x65
  "Dui " ;; 0x66
  "Lan " ;; 0x67
  "Pu " ;; 0x68
  "Cuan " ;; 0x69
  "Qiang " ;; 0x6a
  "Deng " ;; 0x6b
  "Huo " ;; 0x6c
  "Lei " ;; 0x6d
  "Huan " ;; 0x6e
  "Zhuo " ;; 0x6f
  "Lian " ;; 0x70
  "Yi " ;; 0x71
  "Cha " ;; 0x72
  "Biao " ;; 0x73
  "La " ;; 0x74
  "Chan " ;; 0x75
  "Xiang " ;; 0x76
  "Chang " ;; 0x77
  "Chang " ;; 0x78
  "Jiu " ;; 0x79
  "Ao " ;; 0x7a
  "Die " ;; 0x7b
  "Qu " ;; 0x7c
  "Liao " ;; 0x7d
  "Mi " ;; 0x7e
  "Chang " ;; 0x7f
  "Men " ;; 0x80
  "Ma " ;; 0x81
  "Shuan " ;; 0x82
  "Shan " ;; 0x83
  "Huo " ;; 0x84
  "Men " ;; 0x85
  "Yan " ;; 0x86
  "Bi " ;; 0x87
  "Han " ;; 0x88
  "Bi " ;; 0x89
  "San " ;; 0x8a
  "Kai " ;; 0x8b
  "Kang " ;; 0x8c
  "Beng " ;; 0x8d
  "Hong " ;; 0x8e
  "Run " ;; 0x8f
  "San " ;; 0x90
  "Xian " ;; 0x91
  "Xian " ;; 0x92
  "Jian " ;; 0x93
  "Min " ;; 0x94
  "Xia " ;; 0x95
  "Yuru " ;; 0x96
  "Dou " ;; 0x97
  "Zha " ;; 0x98
  "Nao " ;; 0x99
  "Jian " ;; 0x9a
  "Peng " ;; 0x9b
  "Xia " ;; 0x9c
  "Ling " ;; 0x9d
  "Bian " ;; 0x9e
  "Bi " ;; 0x9f
  "Run " ;; 0xa0
  "He " ;; 0xa1
  "Guan " ;; 0xa2
  "Ge " ;; 0xa3
  "Ge " ;; 0xa4
  "Fa " ;; 0xa5
  "Chu " ;; 0xa6
  "Hong " ;; 0xa7
  "Gui " ;; 0xa8
  "Min " ;; 0xa9
  "Se " ;; 0xaa
  "Kun " ;; 0xab
  "Lang " ;; 0xac
  "Lu " ;; 0xad
  "Ting " ;; 0xae
  "Sha " ;; 0xaf
  "Ju " ;; 0xb0
  "Yue " ;; 0xb1
  "Yue " ;; 0xb2
  "Chan " ;; 0xb3
  "Qu " ;; 0xb4
  "Lin " ;; 0xb5
  "Chang " ;; 0xb6
  "Shai " ;; 0xb7
  "Kun " ;; 0xb8
  "Yan " ;; 0xb9
  "Min " ;; 0xba
  "Yan " ;; 0xbb
  "E " ;; 0xbc
  "Hun " ;; 0xbd
  "Yu " ;; 0xbe
  "Wen " ;; 0xbf
  "Xiang " ;; 0xc0
  "Bao " ;; 0xc1
  "Xiang " ;; 0xc2
  "Qu " ;; 0xc3
  "Yao " ;; 0xc4
  "Wen " ;; 0xc5
  "Ban " ;; 0xc6
  "An " ;; 0xc7
  "Wei " ;; 0xc8
  "Yin " ;; 0xc9
  "Kuo " ;; 0xca
  "Que " ;; 0xcb
  "Lan " ;; 0xcc
  "Du " ;; 0xcd
  "[?] " ;; 0xce
  "Phwung " ;; 0xcf
  "Tian " ;; 0xd0
  "Nie " ;; 0xd1
  "Ta " ;; 0xd2
  "Kai " ;; 0xd3
  "He " ;; 0xd4
  "Que " ;; 0xd5
  "Chuang " ;; 0xd6
  "Guan " ;; 0xd7
  "Dou " ;; 0xd8
  "Qi " ;; 0xd9
  "Kui " ;; 0xda
  "Tang " ;; 0xdb
  "Guan " ;; 0xdc
  "Piao " ;; 0xdd
  "Kan " ;; 0xde
  "Xi " ;; 0xdf
  "Hui " ;; 0xe0
  "Chan " ;; 0xe1
  "Pi " ;; 0xe2
  "Dang " ;; 0xe3
  "Huan " ;; 0xe4
  "Ta " ;; 0xe5
  "Wen " ;; 0xe6
  "[?] " ;; 0xe7
  "Men " ;; 0xe8
  "Shuan " ;; 0xe9
  "Shan " ;; 0xea
  "Yan " ;; 0xeb
  "Han " ;; 0xec
  "Bi " ;; 0xed
  "Wen " ;; 0xee
  "Chuang " ;; 0xef
  "Run " ;; 0xf0
  "Wei " ;; 0xf1
  "Xian " ;; 0xf2
  "Hong " ;; 0xf3
  "Jian " ;; 0xf4
  "Min " ;; 0xf5
  "Kang " ;; 0xf6
  "Men " ;; 0xf7
  "Zha " ;; 0xf8
  "Nao " ;; 0xf9
  "Gui " ;; 0xfa
  "Wen " ;; 0xfb
  "Ta " ;; 0xfc
  "Min " ;; 0xfd
  "Lu " ;; 0xfe
  "Kai " ;; 0xff
])
