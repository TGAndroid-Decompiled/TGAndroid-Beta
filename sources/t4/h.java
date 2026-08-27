package t4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import d5.g0;
import d5.y;

public final class h {
    public static final byte[] h = {0, 7, 8, 15};

    public static final byte[] f48074i = {0, 119, -120, -1};

    public static final byte[] f48075j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    public final Paint f48076a;

    public final Paint f48077b;

    public final Canvas f48078c;
    public final b d;

    public final a f48079e;

    public final g f48080f;

    public Bitmap f48081g;

    public h(int i10, int i11) {
        Paint paint = new Paint();
        this.f48076a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f48077b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f48078c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.f48079e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f48080f = new g(i10, i11);
    }

    public static byte[] a(int i10, int i11, y yVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) yVar.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static void e(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        boolean z11;
        int i18;
        y yVar = new y(bArr, bArr.length);
        int i19 = i11;
        int i20 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (yVar.b() != 0) {
            int i21 = 8;
            int i22 = yVar.i(8);
            if (i22 != 240) {
                int i23 = 3;
                int i24 = 2;
                int i25 = 4;
                switch (i22) {
                    case 16:
                        if (i10 == 3) {
                            bArr2 = bArrA == null ? f48074i : bArrA;
                        } else if (i10 == 2) {
                            bArr2 = bArrA3 == null ? h : bArrA3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z12 = false;
                        while (true) {
                            int i26 = yVar.i(2);
                            if (i26 != 0) {
                                i13 = i26;
                            } else {
                                if (yVar.h()) {
                                    int i27 = yVar.i(3) + 3;
                                    i13 = yVar.i(2);
                                    i14 = i27;
                                } else {
                                    if (yVar.h()) {
                                        i13 = 0;
                                    } else {
                                        int i28 = yVar.i(2);
                                        if (i28 == 0) {
                                            i13 = 0;
                                            z12 = true;
                                        } else if (i28 == 1) {
                                            z12 = z12;
                                            i13 = 0;
                                            i14 = 2;
                                        } else if (i28 == 2) {
                                            i14 = yVar.i(4) + 12;
                                            i13 = yVar.i(2);
                                            z12 = z12;
                                        } else if (i28 != 3) {
                                            z12 = z12;
                                            i13 = 0;
                                        } else {
                                            int i29 = yVar.i(8) + 29;
                                            i13 = yVar.i(2);
                                            i14 = i29;
                                        }
                                        i14 = 0;
                                    }
                                    if (i14 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            i13 = bArr2[i13];
                                        }
                                        paint.setColor(iArr[i13]);
                                        canvas.drawRect(i19, i20, i19 + i14, i20 + 1, paint);
                                    }
                                    i19 += i14;
                                    if (z12) {
                                        yVar.c();
                                    } else {
                                        paint = paint;
                                        z12 = z12;
                                    }
                                }
                                if (i14 == 0) {
                                }
                                i19 += i14;
                                if (z12) {
                                    yVar.c();
                                } else {
                                    paint = paint;
                                    z12 = z12;
                                }
                            }
                            i14 = 1;
                            if (i14 == 0) {
                            }
                            i19 += i14;
                            if (z12) {
                                yVar.c();
                            } else {
                                paint = paint;
                                z12 = z12;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i10 == 3 ? bArrA2 == null ? f48075j : bArrA2 : null;
                        boolean z13 = false;
                        while (true) {
                            int i30 = yVar.i(i25);
                            if (i30 != 0) {
                                z10 = z13;
                                i17 = i30;
                                i15 = 1;
                            } else if (yVar.h()) {
                                if (yVar.h()) {
                                    int i31 = yVar.i(i24);
                                    if (i31 == 0) {
                                        z10 = z13;
                                        i15 = 1;
                                    } else if (i31 != 1) {
                                        if (i31 == i24) {
                                            i15 = yVar.i(i25) + 9;
                                            i16 = yVar.i(i25);
                                        } else if (i31 != i23) {
                                            z10 = z13;
                                            i15 = 0;
                                        } else {
                                            i15 = yVar.i(i21) + 25;
                                            i16 = yVar.i(i25);
                                        }
                                        i17 = i16;
                                    } else {
                                        z10 = z13;
                                        i15 = 2;
                                    }
                                    i17 = 0;
                                } else {
                                    i15 = yVar.i(i24) + 4;
                                    i17 = yVar.i(i25);
                                }
                                z10 = z13;
                            } else {
                                int i32 = yVar.i(i23);
                                if (i32 != 0) {
                                    i15 = i32 + 2;
                                    z10 = z13;
                                } else {
                                    z10 = true;
                                    i15 = 0;
                                }
                                i17 = 0;
                            }
                            if (i15 != 0 && paint != 0) {
                                if (bArr3 != 0) {
                                    i17 = bArr3[i17];
                                }
                                paint.setColor(iArr[i17]);
                                canvas.drawRect(i19, i20, i19 + i15, i20 + 1, paint);
                            }
                            i19 += i15;
                            if (z10) {
                                yVar.c();
                            } else {
                                z13 = z10;
                                i23 = 3;
                                i24 = 2;
                                i25 = 4;
                                i21 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z14 = false;
                        while (true) {
                            int i33 = yVar.i(8);
                            if (i33 != 0) {
                                z11 = z14;
                                i18 = 1;
                            } else if (yVar.h()) {
                                z11 = z14;
                                i18 = yVar.i(7);
                                i33 = yVar.i(8);
                            } else {
                                int i34 = yVar.i(7);
                                if (i34 != 0) {
                                    z11 = z14;
                                    i18 = i34;
                                    i33 = 0;
                                } else {
                                    i33 = 0;
                                    z11 = true;
                                    i18 = 0;
                                }
                            }
                            if (i18 != 0 && paint != 0) {
                                paint.setColor(iArr[i33]);
                                canvas.drawRect(i19, i20, i19 + i18, i20 + 1, paint);
                            }
                            i19 += i18;
                            if (!z11) {
                                z14 = z11;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i22) {
                            case 32:
                                bArrA3 = a(4, 4, yVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, yVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, yVar);
                                break;
                        }
                        break;
                }
            } else {
                i20 += 2;
                i19 = i11;
            }
        }
    }

    public static a f(y yVar, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = yVar.i(8);
        yVar.s(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i19 > 0) {
            int i20 = yVar.i(i16);
            int i21 = yVar.i(i16);
            if ((i21 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i21 & 64) != 0 ? iArrB : iArrC;
            }
            if ((i21 & 1) != 0) {
                i14 = yVar.i(i16);
                i15 = yVar.i(i16);
                i11 = yVar.i(i16);
                i13 = yVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i22 = yVar.i(6) << i18;
                int i23 = yVar.i(4) << 4;
                i11 = yVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = yVar.i(i18) << 6;
                i14 = i22;
                i15 = i23;
            }
            if (i14 == 0) {
                i15 = 0;
                i11 = 0;
                i13 = 255;
            }
            double d = i14;
            double d10 = i15 - 128;
            double d11 = i11 - 128;
            iArr[i20] = d((byte) (255 - (i13 & 255)), g0.h((int) ((1.402d * d10) + d), 0, 255), g0.h((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), g0.h((int) ((d11 * 1.772d) + d), 0, 255));
            i19 = i12;
            i17 = i17;
            iArrC = iArrC;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr2, iArrB, iArrC);
    }

    public static c g(y yVar) {
        byte[] bArr;
        int i10 = yVar.i(16);
        yVar.s(4);
        int i11 = yVar.i(2);
        boolean zH = yVar.h();
        yVar.s(1);
        byte[] bArr2 = g0.f4799f;
        if (i11 != 1) {
            if (i11 == 0) {
                int i12 = yVar.i(16);
                int i13 = yVar.i(16);
                if (i12 > 0) {
                    bArr2 = new byte[i12];
                    yVar.k(i12, bArr2);
                }
                if (i13 > 0) {
                    bArr = new byte[i13];
                    yVar.k(i13, bArr);
                }
            }
            return new c(bArr2, bArr, zH, i10);
        }
        yVar.s(yVar.i(8) * 16);
        bArr = bArr2;
        return new c(bArr2, bArr, zH, i10);
    }
}
