package t4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import d5.f0;
import d5.x;
public final class h {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] f47663i = {0, 119, -120, -1};
    public static final byte[] f47664j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f47665a;
    public final Paint f47666b;
    public final Canvas f47667c;
    public final b d;
    public final a f47668e;
    public final g f47669f;
    public Bitmap f47670g;

    public h(int i9, int i10) {
        Paint paint = new Paint();
        this.f47665a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f47666b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f47667c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.f47668e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f47669f = new g(i9, i10);
    }

    public static byte[] a(int i9, int i10, x xVar) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) xVar.i(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            if (i14 < 8) {
                if ((i14 & 1) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                if ((i14 & 2) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i14 & 4) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                iArr[i14] = d(255, i11, i12, i13);
            } else {
                int i15 = 127;
                if ((i14 & 1) != 0) {
                    i9 = 127;
                } else {
                    i9 = 0;
                }
                if ((i14 & 2) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i14 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i14] = d(255, i9, i10, i15);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i27 = 0; i27 < 256; i27++) {
            int i28 = 255;
            if (i27 < 8) {
                if ((i27 & 1) != 0) {
                    i25 = 255;
                } else {
                    i25 = 0;
                }
                if ((i27 & 2) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i27 & 4) == 0) {
                    i28 = 0;
                }
                iArr[i27] = d(63, i25, i26, i28);
            } else {
                int i29 = i27 & 136;
                int i30 = 170;
                int i31 = 85;
                if (i29 != 0) {
                    if (i29 != 8) {
                        int i32 = 43;
                        if (i29 != 128) {
                            if (i29 == 136) {
                                if ((i27 & 1) != 0) {
                                    i21 = 43;
                                } else {
                                    i21 = 0;
                                }
                                if ((i27 & 16) != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                int i33 = i21 + i22;
                                if ((i27 & 2) != 0) {
                                    i23 = 43;
                                } else {
                                    i23 = 0;
                                }
                                if ((i27 & 32) != 0) {
                                    i24 = 85;
                                } else {
                                    i24 = 0;
                                }
                                int i34 = i23 + i24;
                                if ((i27 & 4) == 0) {
                                    i32 = 0;
                                }
                                if ((i27 & 64) == 0) {
                                    i31 = 0;
                                }
                                iArr[i27] = d(255, i33, i34, i32 + i31);
                            }
                        } else {
                            if ((i27 & 1) != 0) {
                                i17 = 43;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i17 + 127;
                            if ((i27 & 16) != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i35 + i18;
                            if ((i27 & 2) != 0) {
                                i19 = 43;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i19 + 127;
                            if ((i27 & 32) != 0) {
                                i20 = 85;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i37 + i20;
                            if ((i27 & 4) == 0) {
                                i32 = 0;
                            }
                            int i39 = i32 + 127;
                            if ((i27 & 64) == 0) {
                                i31 = 0;
                            }
                            iArr[i27] = d(255, i36, i38, i39 + i31);
                        }
                    } else {
                        if ((i27 & 1) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        if ((i27 & 16) != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        int i40 = i13 + i14;
                        if ((i27 & 2) != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        if ((i27 & 32) != 0) {
                            i16 = 170;
                        } else {
                            i16 = 0;
                        }
                        int i41 = i15 + i16;
                        if ((i27 & 4) == 0) {
                            i31 = 0;
                        }
                        if ((i27 & 64) == 0) {
                            i30 = 0;
                        }
                        iArr[i27] = d(127, i40, i41, i31 + i30);
                    }
                } else {
                    if ((i27 & 1) != 0) {
                        i9 = 85;
                    } else {
                        i9 = 0;
                    }
                    if ((i27 & 16) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i42 = i9 + i10;
                    if ((i27 & 2) != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if ((i27 & 32) != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    int i43 = i11 + i12;
                    if ((i27 & 4) == 0) {
                        i31 = 0;
                    }
                    if ((i27 & 64) == 0) {
                        i30 = 0;
                    }
                    iArr[i27] = d(255, i42, i43, i31 + i30);
                }
            }
        }
        return iArr;
    }

    public static int d(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: t4.h.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(x xVar, int i9) {
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = xVar.i(8);
        xVar.s(8);
        int i17 = 2;
        int i18 = i9 - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i18 > 0) {
            int i19 = xVar.i(i15);
            int i20 = xVar.i(i15);
            if ((i20 & 128) != 0) {
                iArr = iArr2;
            } else if ((i20 & 64) != 0) {
                iArr = b10;
            } else {
                iArr = c10;
            }
            if ((i20 & 1) != 0) {
                i13 = xVar.i(i15);
                i14 = xVar.i(i15);
                i10 = xVar.i(i15);
                i12 = xVar.i(i15);
                i11 = i18 - 6;
            } else {
                int i21 = xVar.i(4) << 4;
                i10 = xVar.i(4) << 4;
                i11 = i18 - 4;
                i12 = xVar.i(i17) << 6;
                i13 = xVar.i(6) << i17;
                i14 = i21;
            }
            if (i13 == 0) {
                i14 = 0;
                i10 = 0;
                i12 = 255;
            }
            double d = i13;
            double d9 = i14 - 128;
            double d10 = i10 - 128;
            iArr[i19] = d((byte) (255 - (i12 & 255)), f0.h((int) ((1.402d * d9) + d), 0, 255), f0.h((int) ((d - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), f0.h((int) ((d10 * 1.772d) + d), 0, 255));
            i18 = i11;
            i16 = i16;
            c10 = c10;
            i15 = 8;
            i17 = 2;
        }
        return new a(i16, iArr2, b10, c10);
    }

    public static c g(x xVar) {
        byte[] bArr;
        int i9 = xVar.i(16);
        xVar.s(4);
        int i10 = xVar.i(2);
        boolean h10 = xVar.h();
        xVar.s(1);
        byte[] bArr2 = f0.f4353f;
        if (i10 == 1) {
            xVar.s(xVar.i(8) * 16);
        } else if (i10 == 0) {
            int i11 = xVar.i(16);
            int i12 = xVar.i(16);
            if (i11 > 0) {
                bArr2 = new byte[i11];
                xVar.k(i11, bArr2);
            }
            if (i12 > 0) {
                bArr = new byte[i12];
                xVar.k(i12, bArr);
                return new c(bArr2, bArr, h10, i9);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, h10, i9);
    }
}
