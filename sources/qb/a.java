package qb;

import com.google.android.exoplayer2.upstream.w;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import mb.h;

public abstract class a {

    public static final char[] f46178a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(w wVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (wVar.d() < 11) {
                throw lb.c.a();
            }
            int iE = wVar.e(11);
            sb2.append(f(iE / 45));
            sb2.append(f(iE % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (wVar.d() < 6) {
                throw lb.c.a();
            }
            sb2.append(f(wVar.e(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    public static void b(w wVar, StringBuilder sb2, int i10, mb.c cVar, ArrayList arrayList) {
        Charset charsetForName;
        boolean z10;
        byte b10;
        if (i10 * 8 > wVar.d()) {
            throw lb.c.a();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) wVar.e(8);
        }
        if (cVar == null) {
            Charset charset = h.f17946b;
            boolean z11 = true;
            if (i10 <= 2 || !(((b10 = bArr[0]) == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2))) {
                boolean z12 = charset != null;
                boolean z13 = i10 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                boolean z14 = z12;
                int i13 = 0;
                boolean z15 = true;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i15 < i10 && (z11 || z14 || z15)) {
                    Charset charset2 = charset;
                    byte b11 = bArr[i15];
                    boolean z16 = z11;
                    int i24 = b11 & 255;
                    if (z15) {
                        if (i16 > 0) {
                            if ((b11 & 128) != 0) {
                                i16--;
                            }
                            if (z16) {
                                if (i24 <= 127 && i24 < 160) {
                                    z16 = false;
                                } else if (i24 > 159 && (i24 < 192 || i24 == 215 || i24 == 247)) {
                                    i21++;
                                }
                            }
                            if (!z14) {
                                if (i17 > 0) {
                                    if (i24 >= 64 || i24 == 127 || i24 > 252) {
                                        z14 = false;
                                    } else {
                                        i17--;
                                    }
                                } else if (i24 != 128 || i24 == 160 || i24 > 239) {
                                    z14 = false;
                                } else if (i24 <= 160 || i24 >= 224) {
                                    if (i24 > 127) {
                                        i17++;
                                        int i25 = i22 + 1;
                                        if (i25 > i13) {
                                            i13 = i25;
                                            i22 = i13;
                                        } else {
                                            i22 = i25;
                                        }
                                    } else {
                                        i22 = 0;
                                    }
                                    i23 = 0;
                                } else {
                                    i14++;
                                    int i26 = i23 + 1;
                                    if (i26 > i11) {
                                        i11 = i26;
                                        i23 = i11;
                                    } else {
                                        i23 = i26;
                                    }
                                    i22 = 0;
                                }
                            }
                            i15++;
                            charset = charset2;
                            z11 = z16;
                        } else {
                            z10 = z15;
                            if ((b11 & 128) != 0) {
                                if ((b11 & 64) != 0) {
                                    int i27 = i16 + 1;
                                    if ((b11 & 32) == 0) {
                                        i18++;
                                    } else {
                                        i27 = i16 + 2;
                                        if ((b11 & 16) == 0) {
                                            i19++;
                                        } else {
                                            i16 += 3;
                                            if ((b11 & 8) == 0) {
                                                i20++;
                                            }
                                            if (z16) {
                                                if (i24 <= 127) {
                                                    if (i24 > 159) {
                                                        i21++;
                                                    }
                                                } else if (i24 > 159) {
                                                    i21++;
                                                }
                                            }
                                            if (!z14) {
                                                if (i17 > 0) {
                                                    if (i24 >= 64) {
                                                        z14 = false;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                } else if (i24 != 128) {
                                                    z14 = false;
                                                } else {
                                                    z14 = false;
                                                }
                                            }
                                            i15++;
                                            charset = charset2;
                                            z11 = z16;
                                        }
                                    }
                                    i16 = i27;
                                }
                            }
                        }
                        z15 = false;
                        if (z16) {
                            if (i24 <= 127) {
                                if (i24 > 159) {
                                    i21++;
                                }
                            } else if (i24 > 159) {
                                i21++;
                            }
                        }
                        if (!z14) {
                            if (i17 > 0) {
                                if (i24 >= 64) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                            } else if (i24 != 128) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                        }
                        i15++;
                        charset = charset2;
                        z11 = z16;
                    } else {
                        z10 = z15;
                    }
                    z15 = z10;
                    if (z16) {
                        if (i24 <= 127) {
                            if (i24 > 159) {
                                i21++;
                            }
                        } else if (i24 > 159) {
                            i21++;
                        }
                    }
                    if (!z14) {
                        if (i17 > 0) {
                            if (i24 >= 64) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                        } else if (i24 != 128) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                    }
                    i15++;
                    charset = charset2;
                    z11 = z16;
                }
                Charset charset3 = charset;
                boolean z17 = z11;
                boolean z18 = z15;
                boolean z19 = (!z18 || i16 <= 0) ? z18 : false;
                boolean z20 = (!z14 || i17 <= 0) ? z14 : false;
                if (z19 && (z13 || i18 + i19 + i20 > 0)) {
                    charsetForName = StandardCharsets.UTF_8;
                } else if (z20 && (h.d || i11 >= 3 || i13 >= 3)) {
                    charsetForName = charset3;
                } else if (z17 && z20) {
                    if (!(i11 == 2 && i14 == 2) && i21 * 10 < i10) {
                        charsetForName = StandardCharsets.ISO_8859_1;
                    } else {
                        charsetForName = charset3;
                    }
                } else if (z17) {
                    charsetForName = StandardCharsets.ISO_8859_1;
                } else if (z20) {
                    charsetForName = charset3;
                } else {
                    charsetForName = z19 ? StandardCharsets.UTF_8 : h.f17945a;
                }
            } else {
                charsetForName = StandardCharsets.UTF_16;
            }
        } else {
            charsetForName = Charset.forName(cVar.name());
        }
        sb2.append(new String(bArr, charsetForName));
        arrayList.add(bArr);
    }

    public static void c(w wVar, StringBuilder sb2, int i10) {
        if (h.f17947c == null) {
            throw lb.c.a();
        }
        if (i10 * 13 > wVar.d()) {
            throw lb.c.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iE = wVar.e(13);
            int i12 = (iE % 96) | ((iE / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & 255);
            bArr[i11 + 1] = (byte) (i13 & 255);
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, h.f17947c));
    }

    public static void d(w wVar, StringBuilder sb2, int i10) {
        if (h.f17946b == null) {
            throw lb.c.a();
        }
        if (i10 * 13 > wVar.d()) {
            throw lb.c.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iE = wVar.e(13);
            int i12 = (iE % 192) | ((iE / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, h.f17946b));
    }

    public static void e(w wVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (wVar.d() < 10) {
                throw lb.c.a();
            }
            int iE = wVar.e(10);
            if (iE >= 1000) {
                throw lb.c.a();
            }
            sb2.append(f(iE / 100));
            sb2.append(f((iE / 10) % 10));
            sb2.append(f(iE % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (wVar.d() < 7) {
                throw lb.c.a();
            }
            int iE2 = wVar.e(7);
            if (iE2 >= 100) {
                throw lb.c.a();
            }
            sb2.append(f(iE2 / 10));
            sb2.append(f(iE2 % 10));
            return;
        }
        if (i10 == 1) {
            if (wVar.d() < 4) {
                throw lb.c.a();
            }
            int iE3 = wVar.e(4);
            if (iE3 >= 10) {
                throw lb.c.a();
            }
            sb2.append(f(iE3));
        }
    }

    public static char f(int i10) throws lb.c {
        char[] cArr = f46178a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw lb.c.a();
    }
}
