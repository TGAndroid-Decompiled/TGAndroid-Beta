package x4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import h5.d0;
import h5.v;
public final class h {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] f50395i = {0, 119, -120, -1};
    public static final byte[] f50396j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f50397a;
    public final Paint f50398b;
    public final Canvas f50399c;
    public final b d;
    public final a f50400e;
    public final g f50401f;
    public Bitmap f50402g;

    public h(int i10, int i11) {
        Paint paint = new Paint();
        this.f50397a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f50398b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f50399c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.f50400e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f50401f = new g(i10, i11);
    }

    public static byte[] a(int i10, int i11, v vVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) vVar.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                if ((i15 & 1) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i15 & 2) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if ((i15 & 4) != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = d(255, i12, i13, i14);
            } else {
                int i16 = 127;
                if ((i15 & 1) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i15 & 2) != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if ((i15 & 4) == 0) {
                    i16 = 0;
                }
                iArr[i15] = d(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    public static int[] c() {
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
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = 255;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = d(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 != 0) {
                    if (i30 != 8) {
                        int i33 = 43;
                        if (i30 != 128) {
                            if (i30 == 136) {
                                if ((i28 & 1) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i28 & 16) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i34 = i22 + i23;
                                if ((i28 & 2) != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if ((i28 & 32) != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                int i35 = i24 + i25;
                                if ((i28 & 4) == 0) {
                                    i33 = 0;
                                }
                                if ((i28 & 64) == 0) {
                                    i32 = 0;
                                }
                                iArr[i28] = d(255, i34, i35, i33 + i32);
                            }
                        } else {
                            if ((i28 & 1) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + 127;
                            if ((i28 & 16) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i28 & 2) != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i20 + 127;
                            if ((i28 & 32) != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i38 + i21;
                            if ((i28 & 4) == 0) {
                                i33 = 0;
                            }
                            int i40 = i33 + 127;
                            if ((i28 & 64) == 0) {
                                i32 = 0;
                            }
                            iArr[i28] = d(255, i37, i39, i40 + i32);
                        }
                    } else {
                        if ((i28 & 1) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i41 = i14 + i15;
                        if ((i28 & 2) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        int i42 = i16 + i17;
                        if ((i28 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i31 = 0;
                        }
                        iArr[i28] = d(127, i41, i42, i32 + i31);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i43 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i44 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = d(255, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: x4.h.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(v vVar, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = vVar.i(8);
        vVar.s(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c3 = c();
        while (i19 > 0) {
            int i20 = vVar.i(i16);
            int i21 = vVar.i(i16);
            if ((i21 & 128) != 0) {
                iArr = iArr2;
            } else if ((i21 & 64) != 0) {
                iArr = b10;
            } else {
                iArr = c3;
            }
            if ((i21 & 1) != 0) {
                i14 = vVar.i(i16);
                i15 = vVar.i(i16);
                i11 = vVar.i(i16);
                i13 = vVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i22 = vVar.i(4) << 4;
                i11 = vVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = vVar.i(i18) << 6;
                i14 = vVar.i(6) << i18;
                i15 = i22;
            }
            if (i14 == 0) {
                i15 = 0;
                i11 = 0;
                i13 = 255;
            }
            double d = i14;
            double d10 = i15 - 128;
            double d11 = i11 - 128;
            iArr[i20] = d((byte) (255 - (i13 & 255)), d0.h((int) ((1.402d * d10) + d), 0, 255), d0.h((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), d0.h((int) ((d11 * 1.772d) + d), 0, 255));
            i19 = i12;
            i17 = i17;
            c3 = c3;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr2, b10, c3);
    }

    public static c g(v vVar) {
        byte[] bArr;
        int i10 = vVar.i(16);
        vVar.s(4);
        int i11 = vVar.i(2);
        boolean h9 = vVar.h();
        vVar.s(1);
        byte[] bArr2 = d0.f7241f;
        if (i11 == 1) {
            vVar.s(vVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = vVar.i(16);
            int i13 = vVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                vVar.k(i12, bArr2);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                vVar.k(i13, bArr);
                return new c(bArr2, bArr, h9, i10);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, h9, i10);
    }
}
