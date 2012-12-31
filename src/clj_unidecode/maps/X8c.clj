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

(ns clj-unidecode.maps.X8c)
(def decode [
  "Yu " ;; 0x00
  "Shui " ;; 0x01
  "Shen " ;; 0x02
  "Diao " ;; 0x03
  "Chan " ;; 0x04
  "Liang " ;; 0x05
  "Zhun " ;; 0x06
  "Sui " ;; 0x07
  "Tan " ;; 0x08
  "Shen " ;; 0x09
  "Yi " ;; 0x0a
  "Mou " ;; 0x0b
  "Chen " ;; 0x0c
  "Die " ;; 0x0d
  "Huang " ;; 0x0e
  "Jian " ;; 0x0f
  "Xie " ;; 0x10
  "Nue " ;; 0x11
  "Ye " ;; 0x12
  "Wei " ;; 0x13
  "E " ;; 0x14
  "Yu " ;; 0x15
  "Xuan " ;; 0x16
  "Chan " ;; 0x17
  "Zi " ;; 0x18
  "An " ;; 0x19
  "Yan " ;; 0x1a
  "Di " ;; 0x1b
  "Mi " ;; 0x1c
  "Pian " ;; 0x1d
  "Xu " ;; 0x1e
  "Mo " ;; 0x1f
  "Dang " ;; 0x20
  "Su " ;; 0x21
  "Xie " ;; 0x22
  "Yao " ;; 0x23
  "Bang " ;; 0x24
  "Shi " ;; 0x25
  "Qian " ;; 0x26
  "Mi " ;; 0x27
  "Jin " ;; 0x28
  "Man " ;; 0x29
  "Zhe " ;; 0x2a
  "Jian " ;; 0x2b
  "Miu " ;; 0x2c
  "Tan " ;; 0x2d
  "Zen " ;; 0x2e
  "Qiao " ;; 0x2f
  "Lan " ;; 0x30
  "Pu " ;; 0x31
  "Jue " ;; 0x32
  "Yan " ;; 0x33
  "Qian " ;; 0x34
  "Zhan " ;; 0x35
  "Chen " ;; 0x36
  "Gu " ;; 0x37
  "Qian " ;; 0x38
  "Hong " ;; 0x39
  "Xia " ;; 0x3a
  "Jue " ;; 0x3b
  "Hong " ;; 0x3c
  "Han " ;; 0x3d
  "Hong " ;; 0x3e
  "Xi " ;; 0x3f
  "Xi " ;; 0x40
  "Huo " ;; 0x41
  "Liao " ;; 0x42
  "Han " ;; 0x43
  "Du " ;; 0x44
  "Long " ;; 0x45
  "Dou " ;; 0x46
  "Jiang " ;; 0x47
  "Qi " ;; 0x48
  "Shi " ;; 0x49
  "Li " ;; 0x4a
  "Deng " ;; 0x4b
  "Wan " ;; 0x4c
  "Bi " ;; 0x4d
  "Shu " ;; 0x4e
  "Xian " ;; 0x4f
  "Feng " ;; 0x50
  "Zhi " ;; 0x51
  "Zhi " ;; 0x52
  "Yan " ;; 0x53
  "Yan " ;; 0x54
  "Shi " ;; 0x55
  "Chu " ;; 0x56
  "Hui " ;; 0x57
  "Tun " ;; 0x58
  "Yi " ;; 0x59
  "Tun " ;; 0x5a
  "Yi " ;; 0x5b
  "Jian " ;; 0x5c
  "Ba " ;; 0x5d
  "Hou " ;; 0x5e
  "E " ;; 0x5f
  "Cu " ;; 0x60
  "Xiang " ;; 0x61
  "Huan " ;; 0x62
  "Jian " ;; 0x63
  "Ken " ;; 0x64
  "Gai " ;; 0x65
  "Qu " ;; 0x66
  "Fu " ;; 0x67
  "Xi " ;; 0x68
  "Bin " ;; 0x69
  "Hao " ;; 0x6a
  "Yu " ;; 0x6b
  "Zhu " ;; 0x6c
  "Jia " ;; 0x6d
  "[?] " ;; 0x6e
  "Xi " ;; 0x6f
  "Bo " ;; 0x70
  "Wen " ;; 0x71
  "Huan " ;; 0x72
  "Bin " ;; 0x73
  "Di " ;; 0x74
  "Zong " ;; 0x75
  "Fen " ;; 0x76
  "Yi " ;; 0x77
  "Zhi " ;; 0x78
  "Bao " ;; 0x79
  "Chai " ;; 0x7a
  "Han " ;; 0x7b
  "Pi " ;; 0x7c
  "Na " ;; 0x7d
  "Pi " ;; 0x7e
  "Gou " ;; 0x7f
  "Na " ;; 0x80
  "You " ;; 0x81
  "Diao " ;; 0x82
  "Mo " ;; 0x83
  "Si " ;; 0x84
  "Xiu " ;; 0x85
  "Huan " ;; 0x86
  "Kun " ;; 0x87
  "He " ;; 0x88
  "He " ;; 0x89
  "Mo " ;; 0x8a
  "Han " ;; 0x8b
  "Mao " ;; 0x8c
  "Li " ;; 0x8d
  "Ni " ;; 0x8e
  "Bi " ;; 0x8f
  "Yu " ;; 0x90
  "Jia " ;; 0x91
  "Tuan " ;; 0x92
  "Mao " ;; 0x93
  "Pi " ;; 0x94
  "Xi " ;; 0x95
  "E " ;; 0x96
  "Ju " ;; 0x97
  "Mo " ;; 0x98
  "Chu " ;; 0x99
  "Tan " ;; 0x9a
  "Huan " ;; 0x9b
  "Jue " ;; 0x9c
  "Bei " ;; 0x9d
  "Zhen " ;; 0x9e
  "Yuan " ;; 0x9f
  "Fu " ;; 0xa0
  "Cai " ;; 0xa1
  "Gong " ;; 0xa2
  "Te " ;; 0xa3
  "Yi " ;; 0xa4
  "Hang " ;; 0xa5
  "Wan " ;; 0xa6
  "Pin " ;; 0xa7
  "Huo " ;; 0xa8
  "Fan " ;; 0xa9
  "Tan " ;; 0xaa
  "Guan " ;; 0xab
  "Ze " ;; 0xac
  "Zhi " ;; 0xad
  "Er " ;; 0xae
  "Zhu " ;; 0xaf
  "Shi " ;; 0xb0
  "Bi " ;; 0xb1
  "Zi " ;; 0xb2
  "Er " ;; 0xb3
  "Gui " ;; 0xb4
  "Pian " ;; 0xb5
  "Bian " ;; 0xb6
  "Mai " ;; 0xb7
  "Dai " ;; 0xb8
  "Sheng " ;; 0xb9
  "Kuang " ;; 0xba
  "Fei " ;; 0xbb
  "Tie " ;; 0xbc
  "Yi " ;; 0xbd
  "Chi " ;; 0xbe
  "Mao " ;; 0xbf
  "He " ;; 0xc0
  "Bi " ;; 0xc1
  "Lu " ;; 0xc2
  "Ren " ;; 0xc3
  "Hui " ;; 0xc4
  "Gai " ;; 0xc5
  "Pian " ;; 0xc6
  "Zi " ;; 0xc7
  "Jia " ;; 0xc8
  "Xu " ;; 0xc9
  "Zei " ;; 0xca
  "Jiao " ;; 0xcb
  "Gai " ;; 0xcc
  "Zang " ;; 0xcd
  "Jian " ;; 0xce
  "Ying " ;; 0xcf
  "Xun " ;; 0xd0
  "Zhen " ;; 0xd1
  "She " ;; 0xd2
  "Bin " ;; 0xd3
  "Bin " ;; 0xd4
  "Qiu " ;; 0xd5
  "She " ;; 0xd6
  "Chuan " ;; 0xd7
  "Zang " ;; 0xd8
  "Zhou " ;; 0xd9
  "Lai " ;; 0xda
  "Zan " ;; 0xdb
  "Si " ;; 0xdc
  "Chen " ;; 0xdd
  "Shang " ;; 0xde
  "Tian " ;; 0xdf
  "Pei " ;; 0xe0
  "Geng " ;; 0xe1
  "Xian " ;; 0xe2
  "Mai " ;; 0xe3
  "Jian " ;; 0xe4
  "Sui " ;; 0xe5
  "Fu " ;; 0xe6
  "Tan " ;; 0xe7
  "Cong " ;; 0xe8
  "Cong " ;; 0xe9
  "Zhi " ;; 0xea
  "Ji " ;; 0xeb
  "Zhang " ;; 0xec
  "Du " ;; 0xed
  "Jin " ;; 0xee
  "Xiong " ;; 0xef
  "Shun " ;; 0xf0
  "Yun " ;; 0xf1
  "Bao " ;; 0xf2
  "Zai " ;; 0xf3
  "Lai " ;; 0xf4
  "Feng " ;; 0xf5
  "Cang " ;; 0xf6
  "Ji " ;; 0xf7
  "Sheng " ;; 0xf8
  "Ai " ;; 0xf9
  "Zhuan " ;; 0xfa
  "Fu " ;; 0xfb
  "Gou " ;; 0xfc
  "Sai " ;; 0xfd
  "Ze " ;; 0xfe
  "Liao " ;; 0xff
])
