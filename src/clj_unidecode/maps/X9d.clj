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

(ns clj-unidecode.maps.X9d)
(def decode [
  "Fou " ;; 0x00
  "Yiao " ;; 0x01
  "Jue " ;; 0x02
  "Jue " ;; 0x03
  "Pi " ;; 0x04
  "Huan " ;; 0x05
  "Zhen " ;; 0x06
  "Bao " ;; 0x07
  "Yan " ;; 0x08
  "Ya " ;; 0x09
  "Zheng " ;; 0x0a
  "Fang " ;; 0x0b
  "Feng " ;; 0x0c
  "Wen " ;; 0x0d
  "Ou " ;; 0x0e
  "Te " ;; 0x0f
  "Jia " ;; 0x10
  "Nu " ;; 0x11
  "Ling " ;; 0x12
  "Mie " ;; 0x13
  "Fu " ;; 0x14
  "Tuo " ;; 0x15
  "Wen " ;; 0x16
  "Li " ;; 0x17
  "Bian " ;; 0x18
  "Zhi " ;; 0x19
  "Ge " ;; 0x1a
  "Yuan " ;; 0x1b
  "Zi " ;; 0x1c
  "Qu " ;; 0x1d
  "Xiao " ;; 0x1e
  "Zhi " ;; 0x1f
  "Dan " ;; 0x20
  "Ju " ;; 0x21
  "You " ;; 0x22
  "Gu " ;; 0x23
  "Zhong " ;; 0x24
  "Yu " ;; 0x25
  "Yang " ;; 0x26
  "Rong " ;; 0x27
  "Ya " ;; 0x28
  "Tie " ;; 0x29
  "Yu " ;; 0x2a
  "Shigi " ;; 0x2b
  "Ying " ;; 0x2c
  "Zhui " ;; 0x2d
  "Wu " ;; 0x2e
  "Er " ;; 0x2f
  "Gua " ;; 0x30
  "Ai " ;; 0x31
  "Zhi " ;; 0x32
  "Yan " ;; 0x33
  "Heng " ;; 0x34
  "Jiao " ;; 0x35
  "Ji " ;; 0x36
  "Lie " ;; 0x37
  "Zhu " ;; 0x38
  "Ren " ;; 0x39
  "Yi " ;; 0x3a
  "Hong " ;; 0x3b
  "Luo " ;; 0x3c
  "Ru " ;; 0x3d
  "Mou " ;; 0x3e
  "Ge " ;; 0x3f
  "Ren " ;; 0x40
  "Jiao " ;; 0x41
  "Xiu " ;; 0x42
  "Zhou " ;; 0x43
  "Zhi " ;; 0x44
  "Luo " ;; 0x45
  "Chidori " ;; 0x46
  "Toki " ;; 0x47
  "Ten " ;; 0x48
  "Luan " ;; 0x49
  "Jia " ;; 0x4a
  "Ji " ;; 0x4b
  "Yu " ;; 0x4c
  "Huan " ;; 0x4d
  "Tuo " ;; 0x4e
  "Bu " ;; 0x4f
  "Wu " ;; 0x50
  "Juan " ;; 0x51
  "Yu " ;; 0x52
  "Bo " ;; 0x53
  "Xun " ;; 0x54
  "Xun " ;; 0x55
  "Bi " ;; 0x56
  "Xi " ;; 0x57
  "Jun " ;; 0x58
  "Ju " ;; 0x59
  "Tu " ;; 0x5a
  "Jing " ;; 0x5b
  "Ti " ;; 0x5c
  "E " ;; 0x5d
  "E " ;; 0x5e
  "Kuang " ;; 0x5f
  "Hu " ;; 0x60
  "Wu " ;; 0x61
  "Shen " ;; 0x62
  "Lai " ;; 0x63
  "Ikaruga " ;; 0x64
  "Kakesu " ;; 0x65
  "Lu " ;; 0x66
  "Ping " ;; 0x67
  "Shu " ;; 0x68
  "Fu " ;; 0x69
  "An " ;; 0x6a
  "Zhao " ;; 0x6b
  "Peng " ;; 0x6c
  "Qin " ;; 0x6d
  "Qian " ;; 0x6e
  "Bei " ;; 0x6f
  "Diao " ;; 0x70
  "Lu " ;; 0x71
  "Que " ;; 0x72
  "Jian " ;; 0x73
  "Ju " ;; 0x74
  "Tu " ;; 0x75
  "Ya " ;; 0x76
  "Yuan " ;; 0x77
  "Qi " ;; 0x78
  "Li " ;; 0x79
  "Ye " ;; 0x7a
  "Zhui " ;; 0x7b
  "Kong " ;; 0x7c
  "Zhui " ;; 0x7d
  "Kun " ;; 0x7e
  "Sheng " ;; 0x7f
  "Qi " ;; 0x80
  "Jing " ;; 0x81
  "Yi " ;; 0x82
  "Yi " ;; 0x83
  "Jing " ;; 0x84
  "Zi " ;; 0x85
  "Lai " ;; 0x86
  "Dong " ;; 0x87
  "Qi " ;; 0x88
  "Chun " ;; 0x89
  "Geng " ;; 0x8a
  "Ju " ;; 0x8b
  "Qu " ;; 0x8c
  "Isuka " ;; 0x8d
  "Kikuitadaki " ;; 0x8e
  "Ji " ;; 0x8f
  "Shu " ;; 0x90
  "[?] " ;; 0x91
  "Chi " ;; 0x92
  "Miao " ;; 0x93
  "Rou " ;; 0x94
  "An " ;; 0x95
  "Qiu " ;; 0x96
  "Ti " ;; 0x97
  "Hu " ;; 0x98
  "Ti " ;; 0x99
  "E " ;; 0x9a
  "Jie " ;; 0x9b
  "Mao " ;; 0x9c
  "Fu " ;; 0x9d
  "Chun " ;; 0x9e
  "Tu " ;; 0x9f
  "Yan " ;; 0xa0
  "He " ;; 0xa1
  "Yuan " ;; 0xa2
  "Pian " ;; 0xa3
  "Yun " ;; 0xa4
  "Mei " ;; 0xa5
  "Hu " ;; 0xa6
  "Ying " ;; 0xa7
  "Dun " ;; 0xa8
  "Mu " ;; 0xa9
  "Ju " ;; 0xaa
  "Tsugumi " ;; 0xab
  "Cang " ;; 0xac
  "Fang " ;; 0xad
  "Gu " ;; 0xae
  "Ying " ;; 0xaf
  "Yuan " ;; 0xb0
  "Xuan " ;; 0xb1
  "Weng " ;; 0xb2
  "Shi " ;; 0xb3
  "He " ;; 0xb4
  "Chu " ;; 0xb5
  "Tang " ;; 0xb6
  "Xia " ;; 0xb7
  "Ruo " ;; 0xb8
  "Liu " ;; 0xb9
  "Ji " ;; 0xba
  "Gu " ;; 0xbb
  "Jian " ;; 0xbc
  "Zhun " ;; 0xbd
  "Han " ;; 0xbe
  "Zi " ;; 0xbf
  "Zi " ;; 0xc0
  "Ni " ;; 0xc1
  "Yao " ;; 0xc2
  "Yan " ;; 0xc3
  "Ji " ;; 0xc4
  "Li " ;; 0xc5
  "Tian " ;; 0xc6
  "Kou " ;; 0xc7
  "Ti " ;; 0xc8
  "Ti " ;; 0xc9
  "Ni " ;; 0xca
  "Tu " ;; 0xcb
  "Ma " ;; 0xcc
  "Jiao " ;; 0xcd
  "Gao " ;; 0xce
  "Tian " ;; 0xcf
  "Chen " ;; 0xd0
  "Li " ;; 0xd1
  "Zhuan " ;; 0xd2
  "Zhe " ;; 0xd3
  "Ao " ;; 0xd4
  "Yao " ;; 0xd5
  "Yi " ;; 0xd6
  "Ou " ;; 0xd7
  "Chi " ;; 0xd8
  "Zhi " ;; 0xd9
  "Liao " ;; 0xda
  "Rong " ;; 0xdb
  "Lou " ;; 0xdc
  "Bi " ;; 0xdd
  "Shuang " ;; 0xde
  "Zhuo " ;; 0xdf
  "Yu " ;; 0xe0
  "Wu " ;; 0xe1
  "Jue " ;; 0xe2
  "Yin " ;; 0xe3
  "Quan " ;; 0xe4
  "Si " ;; 0xe5
  "Jiao " ;; 0xe6
  "Yi " ;; 0xe7
  "Hua " ;; 0xe8
  "Bi " ;; 0xe9
  "Ying " ;; 0xea
  "Su " ;; 0xeb
  "Huang " ;; 0xec
  "Fan " ;; 0xed
  "Jiao " ;; 0xee
  "Liao " ;; 0xef
  "Yan " ;; 0xf0
  "Kao " ;; 0xf1
  "Jiu " ;; 0xf2
  "Xian " ;; 0xf3
  "Xian " ;; 0xf4
  "Tu " ;; 0xf5
  "Mai " ;; 0xf6
  "Zun " ;; 0xf7
  "Yu " ;; 0xf8
  "Ying " ;; 0xf9
  "Lu " ;; 0xfa
  "Tuan " ;; 0xfb
  "Xian " ;; 0xfc
  "Xue " ;; 0xfd
  "Yi " ;; 0xfe
  "Pi " ;; 0xff
])