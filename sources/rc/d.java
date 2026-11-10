package rc;

import h2.j0;
public abstract class d {
    public static final int[] f54454a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final byte[] f54455b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i14 = 0;
        while (true) {
            int i15 = i14 / 8;
            if (bArr.length <= i15) {
                i11 = -1;
            } else {
                if (bArr.length - 1 == i15) {
                    i7 = 0;
                } else {
                    i7 = bArr[i15 + 1];
                }
                int i16 = (i14 % 24) / 6;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                i11 = 0;
                            } else {
                                i10 = bArr[i15];
                            }
                        } else {
                            i12 = (bArr[i15] << 2) & 60;
                            i13 = (i7 >> 6) & 3;
                        }
                    } else {
                        i12 = (bArr[i15] << 4) & 48;
                        i13 = (i7 >> 4) & 15;
                    }
                    i11 = i12 | i13;
                } else {
                    i10 = bArr[i15] >> 2;
                }
                i11 = i10 & 63;
            }
            if (i11 < 0) {
                break;
            }
            sb2.append((char) f54455b[i11]);
            i14 += 6;
        }
        for (int length2 = sb2.length(); length2 < length; length2++) {
            sb2.append('=');
        }
        return sb2.toString();
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                                break;
                            default:
                        }
                }
            }
            return false;
        }
        return true;
    }

    public static void c(f5.u uVar, int[] iArr, int[] iArr2, j0 j0Var) {
        int i7;
        int s5;
        int s9;
        int i10 = 0;
        while (i10 < iArr2.length) {
            int m10 = j0Var.m(uVar, iArr);
            if (m10 >= 0 && m10 <= 15) {
                iArr2[i10] = m10;
            } else {
                switch (m10) {
                    case 16:
                        i7 = iArr2[i10 - 1];
                        s5 = uVar.s(iArr, 2) + 3;
                        break;
                    case 17:
                        s9 = uVar.s(iArr, 3) + 3;
                        s5 = s9;
                        i7 = 0;
                        break;
                    case 18:
                        s9 = uVar.s(iArr, 7) + 11;
                        s5 = s9;
                        i7 = 0;
                        break;
                    default:
                        throw new Exception(String.format("[%s] Bad code length '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), iArr));
                }
                for (int i11 = 0; i11 < s5; i11++) {
                    iArr2[i10 + i11] = i7;
                }
                i10 += s5 - 1;
            }
            i10++;
        }
    }

    public static int d(f5.u uVar, int[] iArr, j0 j0Var) {
        int i7;
        int m10 = j0Var.m(uVar, iArr);
        int i10 = 2;
        int i11 = 5;
        switch (m10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m10 + 1;
            case 4:
                i10 = 1;
                break;
            case 5:
                i10 = 1;
                i11 = 7;
                break;
            case 6:
                i11 = 9;
                break;
            case 7:
                i11 = 13;
                break;
            case 8:
                i11 = 17;
                i10 = 3;
                break;
            case 9:
                i11 = 25;
                i10 = 3;
                break;
            case 10:
                i11 = 33;
                i10 = 4;
                break;
            case 11:
                i11 = 49;
                i10 = 4;
                break;
            case 12:
                i7 = 65;
                i10 = 5;
                i11 = i7;
                break;
            case 13:
                i7 = 97;
                i10 = 5;
                i11 = i7;
                break;
            case 14:
                i11 = 129;
                i10 = 6;
                break;
            case 15:
                i11 = 193;
                i10 = 6;
                break;
            case 16:
                i11 = 257;
                i10 = 7;
                break;
            case 17:
                i11 = 385;
                i10 = 7;
                break;
            case 18:
                i11 = 513;
                i10 = 8;
                break;
            case 19:
                i11 = 769;
                i10 = 8;
                break;
            case 20:
                i11 = 1025;
                i10 = 9;
                break;
            case 21:
                i11 = 1537;
                i10 = 9;
                break;
            case 22:
                i11 = 2049;
                i10 = 10;
                break;
            case 23:
                i11 = 3073;
                i10 = 10;
                break;
            case 24:
                i11 = 4097;
                i10 = 11;
                break;
            case 25:
                i11 = 6145;
                i10 = 11;
                break;
            case 26:
                i11 = 8193;
                i10 = 12;
                break;
            case 27:
                i11 = 12289;
                i10 = 12;
                break;
            case 28:
                i11 = 16385;
                i10 = 13;
                break;
            case 29:
                i11 = 24577;
                i10 = 13;
                break;
            default:
                throw new Exception(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), Integer.valueOf(iArr[0])));
        }
        return uVar.s(iArr, i10) + i11;
    }

    public static void e(f5.u uVar, int[] iArr, j0[] j0VarArr) {
        int s5 = uVar.s(iArr, 5) + 257;
        int s9 = uVar.s(iArr, 5) + 1;
        int s10 = uVar.s(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i7 = 0; i7 < s10; i7++) {
            iArr2[f54454a[i7]] = (byte) uVar.s(iArr, 3);
        }
        j0 j0Var = new j0(iArr2);
        int[] iArr3 = new int[s5];
        c(uVar, iArr, iArr3, j0Var);
        j0 j0Var2 = new j0(iArr3);
        int[] iArr4 = new int[s9];
        c(uVar, iArr, iArr4, j0Var);
        j0 j0Var3 = new j0(iArr4);
        j0VarArr[0] = j0Var2;
        j0VarArr[1] = j0Var3;
    }

    public static int f(f5.u uVar, int[] iArr, int i7) {
        int i10;
        int i11 = 1;
        switch (i7) {
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
                return i7 - 254;
            case 265:
                i10 = 11;
                break;
            case 266:
                i10 = 13;
                break;
            case 267:
                i10 = 15;
                break;
            case 268:
                i10 = 17;
                break;
            case 269:
                i10 = 19;
                i11 = 2;
                break;
            case 270:
                i10 = 23;
                i11 = 2;
                break;
            case 271:
                i10 = 27;
                i11 = 2;
                break;
            case 272:
                i10 = 31;
                i11 = 2;
                break;
            case 273:
                i10 = 35;
                i11 = 3;
                break;
            case 274:
                i10 = 43;
                i11 = 3;
                break;
            case 275:
                i10 = 51;
                i11 = 3;
                break;
            case 276:
                i10 = 59;
                i11 = 3;
                break;
            case 277:
                i10 = 67;
                i11 = 4;
                break;
            case 278:
                i10 = 83;
                i11 = 4;
                break;
            case 279:
                i10 = 99;
                i11 = 4;
                break;
            case 280:
                i10 = 115;
                i11 = 4;
                break;
            case 281:
                i10 = 131;
                i11 = 5;
                break;
            case 282:
                i10 = 163;
                i11 = 5;
                break;
            case 283:
                i10 = 195;
                i11 = 5;
                break;
            case 284:
                i10 = 227;
                i11 = 5;
                break;
            case 285:
                return 258;
            default:
                throw new Exception(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i7), Integer.valueOf(iArr[0])));
        }
        return uVar.s(iArr, i11) + i10;
    }
}
