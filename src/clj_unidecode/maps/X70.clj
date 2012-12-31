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

(ns clj-unidecode.maps.X70)
(def decode [
  "You " ;; 0x00
  "Yang " ;; 0x01
  "Lu " ;; 0x02
  "Si " ;; 0x03
  "Jie " ;; 0x04
  "Ying " ;; 0x05
  "Du " ;; 0x06
  "Wang " ;; 0x07
  "Hui " ;; 0x08
  "Xie " ;; 0x09
  "Pan " ;; 0x0a
  "Shen " ;; 0x0b
  "Biao " ;; 0x0c
  "Chan " ;; 0x0d
  "Mo " ;; 0x0e
  "Liu " ;; 0x0f
  "Jian " ;; 0x10
  "Pu " ;; 0x11
  "Se " ;; 0x12
  "Cheng " ;; 0x13
  "Gu " ;; 0x14
  "Bin " ;; 0x15
  "Huo " ;; 0x16
  "Xian " ;; 0x17
  "Lu " ;; 0x18
  "Qin " ;; 0x19
  "Han " ;; 0x1a
  "Ying " ;; 0x1b
  "Yong " ;; 0x1c
  "Li " ;; 0x1d
  "Jing " ;; 0x1e
  "Xiao " ;; 0x1f
  "Ying " ;; 0x20
  "Sui " ;; 0x21
  "Wei " ;; 0x22
  "Xie " ;; 0x23
  "Huai " ;; 0x24
  "Hao " ;; 0x25
  "Zhu " ;; 0x26
  "Long " ;; 0x27
  "Lai " ;; 0x28
  "Dui " ;; 0x29
  "Fan " ;; 0x2a
  "Hu " ;; 0x2b
  "Lai " ;; 0x2c
  "[?] " ;; 0x2d
  "[?] " ;; 0x2e
  "Ying " ;; 0x2f
  "Mi " ;; 0x30
  "Ji " ;; 0x31
  "Lian " ;; 0x32
  "Jian " ;; 0x33
  "Ying " ;; 0x34
  "Fen " ;; 0x35
  "Lin " ;; 0x36
  "Yi " ;; 0x37
  "Jian " ;; 0x38
  "Yue " ;; 0x39
  "Chan " ;; 0x3a
  "Dai " ;; 0x3b
  "Rang " ;; 0x3c
  "Jian " ;; 0x3d
  "Lan " ;; 0x3e
  "Fan " ;; 0x3f
  "Shuang " ;; 0x40
  "Yuan " ;; 0x41
  "Zhuo " ;; 0x42
  "Feng " ;; 0x43
  "She " ;; 0x44
  "Lei " ;; 0x45
  "Lan " ;; 0x46
  "Cong " ;; 0x47
  "Qu " ;; 0x48
  "Yong " ;; 0x49
  "Qian " ;; 0x4a
  "Fa " ;; 0x4b
  "Guan " ;; 0x4c
  "Que " ;; 0x4d
  "Yan " ;; 0x4e
  "Hao " ;; 0x4f
  "Hyeng " ;; 0x50
  "Sa " ;; 0x51
  "Zan " ;; 0x52
  "Luan " ;; 0x53
  "Yan " ;; 0x54
  "Li " ;; 0x55
  "Mi " ;; 0x56
  "Shan " ;; 0x57
  "Tan " ;; 0x58
  "Dang " ;; 0x59
  "Jiao " ;; 0x5a
  "Chan " ;; 0x5b
  "[?] " ;; 0x5c
  "Hao " ;; 0x5d
  "Ba " ;; 0x5e
  "Zhu " ;; 0x5f
  "Lan " ;; 0x60
  "Lan " ;; 0x61
  "Nang " ;; 0x62
  "Wan " ;; 0x63
  "Luan " ;; 0x64
  "Xun " ;; 0x65
  "Xian " ;; 0x66
  "Yan " ;; 0x67
  "Gan " ;; 0x68
  "Yan " ;; 0x69
  "Yu " ;; 0x6a
  "Huo " ;; 0x6b
  "Si " ;; 0x6c
  "Mie " ;; 0x6d
  "Guang " ;; 0x6e
  "Deng " ;; 0x6f
  "Hui " ;; 0x70
  "Xiao " ;; 0x71
  "Xiao " ;; 0x72
  "Hu " ;; 0x73
  "Hong " ;; 0x74
  "Ling " ;; 0x75
  "Zao " ;; 0x76
  "Zhuan " ;; 0x77
  "Jiu " ;; 0x78
  "Zha " ;; 0x79
  "Xie " ;; 0x7a
  "Chi " ;; 0x7b
  "Zhuo " ;; 0x7c
  "Zai " ;; 0x7d
  "Zai " ;; 0x7e
  "Can " ;; 0x7f
  "Yang " ;; 0x80
  "Qi " ;; 0x81
  "Zhong " ;; 0x82
  "Fen " ;; 0x83
  "Niu " ;; 0x84
  "Jiong " ;; 0x85
  "Wen " ;; 0x86
  "Po " ;; 0x87
  "Yi " ;; 0x88
  "Lu " ;; 0x89
  "Chui " ;; 0x8a
  "Pi " ;; 0x8b
  "Kai " ;; 0x8c
  "Pan " ;; 0x8d
  "Yan " ;; 0x8e
  "Kai " ;; 0x8f
  "Pang " ;; 0x90
  "Mu " ;; 0x91
  "Chao " ;; 0x92
  "Liao " ;; 0x93
  "Gui " ;; 0x94
  "Kang " ;; 0x95
  "Tun " ;; 0x96
  "Guang " ;; 0x97
  "Xin " ;; 0x98
  "Zhi " ;; 0x99
  "Guang " ;; 0x9a
  "Guang " ;; 0x9b
  "Wei " ;; 0x9c
  "Qiang " ;; 0x9d
  "[?] " ;; 0x9e
  "Da " ;; 0x9f
  "Xia " ;; 0xa0
  "Zheng " ;; 0xa1
  "Zhu " ;; 0xa2
  "Ke " ;; 0xa3
  "Zhao " ;; 0xa4
  "Fu " ;; 0xa5
  "Ba " ;; 0xa6
  "Duo " ;; 0xa7
  "Duo " ;; 0xa8
  "Ling " ;; 0xa9
  "Zhuo " ;; 0xaa
  "Xuan " ;; 0xab
  "Ju " ;; 0xac
  "Tan " ;; 0xad
  "Pao " ;; 0xae
  "Jiong " ;; 0xaf
  "Pao " ;; 0xb0
  "Tai " ;; 0xb1
  "Tai " ;; 0xb2
  "Bing " ;; 0xb3
  "Yang " ;; 0xb4
  "Tong " ;; 0xb5
  "Han " ;; 0xb6
  "Zhu " ;; 0xb7
  "Zha " ;; 0xb8
  "Dian " ;; 0xb9
  "Wei " ;; 0xba
  "Shi " ;; 0xbb
  "Lian " ;; 0xbc
  "Chi " ;; 0xbd
  "Huang " ;; 0xbe
  "[?] " ;; 0xbf
  "Hu " ;; 0xc0
  "Shuo " ;; 0xc1
  "Lan " ;; 0xc2
  "Jing " ;; 0xc3
  "Jiao " ;; 0xc4
  "Xu " ;; 0xc5
  "Xing " ;; 0xc6
  "Quan " ;; 0xc7
  "Lie " ;; 0xc8
  "Huan " ;; 0xc9
  "Yang " ;; 0xca
  "Xiao " ;; 0xcb
  "Xiu " ;; 0xcc
  "Xian " ;; 0xcd
  "Yin " ;; 0xce
  "Wu " ;; 0xcf
  "Zhou " ;; 0xd0
  "Yao " ;; 0xd1
  "Shi " ;; 0xd2
  "Wei " ;; 0xd3
  "Tong " ;; 0xd4
  "Xue " ;; 0xd5
  "Zai " ;; 0xd6
  "Kai " ;; 0xd7
  "Hong " ;; 0xd8
  "Luo " ;; 0xd9
  "Xia " ;; 0xda
  "Zhu " ;; 0xdb
  "Xuan " ;; 0xdc
  "Zheng " ;; 0xdd
  "Po " ;; 0xde
  "Yan " ;; 0xdf
  "Hui " ;; 0xe0
  "Guang " ;; 0xe1
  "Zhe " ;; 0xe2
  "Hui " ;; 0xe3
  "Kao " ;; 0xe4
  "[?] " ;; 0xe5
  "Fan " ;; 0xe6
  "Shao " ;; 0xe7
  "Ye " ;; 0xe8
  "Hui " ;; 0xe9
  "[?] " ;; 0xea
  "Tang " ;; 0xeb
  "Jin " ;; 0xec
  "Re " ;; 0xed
  "[?] " ;; 0xee
  "Xi " ;; 0xef
  "Fu " ;; 0xf0
  "Jiong " ;; 0xf1
  "Che " ;; 0xf2
  "Pu " ;; 0xf3
  "Jing " ;; 0xf4
  "Zhuo " ;; 0xf5
  "Ting " ;; 0xf6
  "Wan " ;; 0xf7
  "Hai " ;; 0xf8
  "Peng " ;; 0xf9
  "Lang " ;; 0xfa
  "Shan " ;; 0xfb
  "Hu " ;; 0xfc
  "Feng " ;; 0xfd
  "Chi " ;; 0xfe
  "Rong " ;; 0xff
])
