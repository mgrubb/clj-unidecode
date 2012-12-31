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

(ns clj-unidecode.maps.X88)
(def decode [
  "Ci " ;; 0x00
  "Xiang " ;; 0x01
  "She " ;; 0x02
  "Luo " ;; 0x03
  "Qin " ;; 0x04
  "Ying " ;; 0x05
  "Chai " ;; 0x06
  "Li " ;; 0x07
  "Ze " ;; 0x08
  "Xuan " ;; 0x09
  "Lian " ;; 0x0a
  "Zhu " ;; 0x0b
  "Ze " ;; 0x0c
  "Xie " ;; 0x0d
  "Mang " ;; 0x0e
  "Xie " ;; 0x0f
  "Qi " ;; 0x10
  "Rong " ;; 0x11
  "Jian " ;; 0x12
  "Meng " ;; 0x13
  "Hao " ;; 0x14
  "Ruan " ;; 0x15
  "Huo " ;; 0x16
  "Zhuo " ;; 0x17
  "Jie " ;; 0x18
  "Bin " ;; 0x19
  "He " ;; 0x1a
  "Mie " ;; 0x1b
  "Fan " ;; 0x1c
  "Lei " ;; 0x1d
  "Jie " ;; 0x1e
  "La " ;; 0x1f
  "Mi " ;; 0x20
  "Li " ;; 0x21
  "Chun " ;; 0x22
  "Li " ;; 0x23
  "Qiu " ;; 0x24
  "Nie " ;; 0x25
  "Lu " ;; 0x26
  "Du " ;; 0x27
  "Xiao " ;; 0x28
  "Zhu " ;; 0x29
  "Long " ;; 0x2a
  "Li " ;; 0x2b
  "Long " ;; 0x2c
  "Feng " ;; 0x2d
  "Ye " ;; 0x2e
  "Beng " ;; 0x2f
  "Shang " ;; 0x30
  "Gu " ;; 0x31
  "Juan " ;; 0x32
  "Ying " ;; 0x33
  "[?] " ;; 0x34
  "Xi " ;; 0x35
  "Can " ;; 0x36
  "Qu " ;; 0x37
  "Quan " ;; 0x38
  "Du " ;; 0x39
  "Can " ;; 0x3a
  "Man " ;; 0x3b
  "Jue " ;; 0x3c
  "Jie " ;; 0x3d
  "Zhu " ;; 0x3e
  "Zha " ;; 0x3f
  "Xie " ;; 0x40
  "Huang " ;; 0x41
  "Niu " ;; 0x42
  "Pei " ;; 0x43
  "Nu " ;; 0x44
  "Xin " ;; 0x45
  "Zhong " ;; 0x46
  "Mo " ;; 0x47
  "Er " ;; 0x48
  "Ke " ;; 0x49
  "Mie " ;; 0x4a
  "Xi " ;; 0x4b
  "Xing " ;; 0x4c
  "Yan " ;; 0x4d
  "Kan " ;; 0x4e
  "Yuan " ;; 0x4f
  "[?] " ;; 0x50
  "Ling " ;; 0x51
  "Xuan " ;; 0x52
  "Shu " ;; 0x53
  "Xian " ;; 0x54
  "Tong " ;; 0x55
  "Long " ;; 0x56
  "Jie " ;; 0x57
  "Xian " ;; 0x58
  "Ya " ;; 0x59
  "Hu " ;; 0x5a
  "Wei " ;; 0x5b
  "Dao " ;; 0x5c
  "Chong " ;; 0x5d
  "Wei " ;; 0x5e
  "Dao " ;; 0x5f
  "Zhun " ;; 0x60
  "Heng " ;; 0x61
  "Qu " ;; 0x62
  "Yi " ;; 0x63
  "Yi " ;; 0x64
  "Bu " ;; 0x65
  "Gan " ;; 0x66
  "Yu " ;; 0x67
  "Biao " ;; 0x68
  "Cha " ;; 0x69
  "Yi " ;; 0x6a
  "Shan " ;; 0x6b
  "Chen " ;; 0x6c
  "Fu " ;; 0x6d
  "Gun " ;; 0x6e
  "Fen " ;; 0x6f
  "Shuai " ;; 0x70
  "Jie " ;; 0x71
  "Na " ;; 0x72
  "Zhong " ;; 0x73
  "Dan " ;; 0x74
  "Ri " ;; 0x75
  "Zhong " ;; 0x76
  "Zhong " ;; 0x77
  "Xie " ;; 0x78
  "Qi " ;; 0x79
  "Xie " ;; 0x7a
  "Ran " ;; 0x7b
  "Zhi " ;; 0x7c
  "Ren " ;; 0x7d
  "Qin " ;; 0x7e
  "Jin " ;; 0x7f
  "Jun " ;; 0x80
  "Yuan " ;; 0x81
  "Mei " ;; 0x82
  "Chai " ;; 0x83
  "Ao " ;; 0x84
  "Niao " ;; 0x85
  "Hui " ;; 0x86
  "Ran " ;; 0x87
  "Jia " ;; 0x88
  "Tuo " ;; 0x89
  "Ling " ;; 0x8a
  "Dai " ;; 0x8b
  "Bao " ;; 0x8c
  "Pao " ;; 0x8d
  "Yao " ;; 0x8e
  "Zuo " ;; 0x8f
  "Bi " ;; 0x90
  "Shao " ;; 0x91
  "Tan " ;; 0x92
  "Ju " ;; 0x93
  "He " ;; 0x94
  "Shu " ;; 0x95
  "Xiu " ;; 0x96
  "Zhen " ;; 0x97
  "Yi " ;; 0x98
  "Pa " ;; 0x99
  "Bo " ;; 0x9a
  "Di " ;; 0x9b
  "Wa " ;; 0x9c
  "Fu " ;; 0x9d
  "Gun " ;; 0x9e
  "Zhi " ;; 0x9f
  "Zhi " ;; 0xa0
  "Ran " ;; 0xa1
  "Pan " ;; 0xa2
  "Yi " ;; 0xa3
  "Mao " ;; 0xa4
  "Tuo " ;; 0xa5
  "Na " ;; 0xa6
  "Kou " ;; 0xa7
  "Xian " ;; 0xa8
  "Chan " ;; 0xa9
  "Qu " ;; 0xaa
  "Bei " ;; 0xab
  "Gun " ;; 0xac
  "Xi " ;; 0xad
  "Ne " ;; 0xae
  "Bo " ;; 0xaf
  "Horo " ;; 0xb0
  "Fu " ;; 0xb1
  "Yi " ;; 0xb2
  "Chi " ;; 0xb3
  "Ku " ;; 0xb4
  "Ren " ;; 0xb5
  "Jiang " ;; 0xb6
  "Jia " ;; 0xb7
  "Cun " ;; 0xb8
  "Mo " ;; 0xb9
  "Jie " ;; 0xba
  "Er " ;; 0xbb
  "Luo " ;; 0xbc
  "Ru " ;; 0xbd
  "Zhu " ;; 0xbe
  "Gui " ;; 0xbf
  "Yin " ;; 0xc0
  "Cai " ;; 0xc1
  "Lie " ;; 0xc2
  "Kamishimo " ;; 0xc3
  "Yuki " ;; 0xc4
  "Zhuang " ;; 0xc5
  "Dang " ;; 0xc6
  "[?] " ;; 0xc7
  "Kun " ;; 0xc8
  "Ken " ;; 0xc9
  "Niao " ;; 0xca
  "Shu " ;; 0xcb
  "Jia " ;; 0xcc
  "Kun " ;; 0xcd
  "Cheng " ;; 0xce
  "Li " ;; 0xcf
  "Juan " ;; 0xd0
  "Shen " ;; 0xd1
  "Pou " ;; 0xd2
  "Ge " ;; 0xd3
  "Yi " ;; 0xd4
  "Yu " ;; 0xd5
  "Zhen " ;; 0xd6
  "Liu " ;; 0xd7
  "Qiu " ;; 0xd8
  "Qun " ;; 0xd9
  "Ji " ;; 0xda
  "Yi " ;; 0xdb
  "Bu " ;; 0xdc
  "Zhuang " ;; 0xdd
  "Shui " ;; 0xde
  "Sha " ;; 0xdf
  "Qun " ;; 0xe0
  "Li " ;; 0xe1
  "Lian " ;; 0xe2
  "Lian " ;; 0xe3
  "Ku " ;; 0xe4
  "Jian " ;; 0xe5
  "Fou " ;; 0xe6
  "Chan " ;; 0xe7
  "Bi " ;; 0xe8
  "Gun " ;; 0xe9
  "Tao " ;; 0xea
  "Yuan " ;; 0xeb
  "Ling " ;; 0xec
  "Chi " ;; 0xed
  "Chang " ;; 0xee
  "Chou " ;; 0xef
  "Duo " ;; 0xf0
  "Biao " ;; 0xf1
  "Liang " ;; 0xf2
  "Chang " ;; 0xf3
  "Pei " ;; 0xf4
  "Pei " ;; 0xf5
  "Fei " ;; 0xf6
  "Yuan " ;; 0xf7
  "Luo " ;; 0xf8
  "Guo " ;; 0xf9
  "Yan " ;; 0xfa
  "Du " ;; 0xfb
  "Xi " ;; 0xfc
  "Zhi " ;; 0xfd
  "Ju " ;; 0xfe
  "Qi " ;; 0xff
])
