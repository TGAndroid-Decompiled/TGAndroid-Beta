package tf;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import hh.oa;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.fe;

public final class d {

    public final long[] f48178a;

    public final CharSequence[] f48179b;

    public final CharSequence[] f48180c;
    public final StaticLayout[] d;

    public final StaticLayout[] f48181e;

    public int f48182f;

    public int f48183g;
    public DecimalFormat h;

    public d(long j10, long j11, boolean z10, float f10, int i10, TextPaint textPaint, TextPaint textPaint2) {
        long j12;
        float f11;
        int i11;
        long jMax;
        boolean z11;
        int i12;
        d dVar;
        float f12;
        long j13;
        long j14;
        long j15;
        long jMax2;
        long j16;
        int i13;
        boolean z12;
        int i14;
        float f13;
        long j17;
        int iMax;
        ?? obj = new Object();
        obj.f48183g = 255;
        if (z10) {
            long j18 = j10 - j11;
            if (j18 == 0) {
                j12 = j11 - 1;
                i11 = 3;
            } else {
                if (j18 >= 6) {
                    long j19 = j18 / 2;
                    if (j19 < 6) {
                        j12 = j11;
                        i11 = (int) ((j18 % 2) + j19 + 1);
                        f11 = 2.0f;
                    } else {
                        float f14 = j18 / 5.0f;
                        if (f14 <= 0.0f) {
                            jMax = Math.max(2L, j18 + 1);
                        } else {
                            j12 = j11;
                            f11 = f14;
                            i11 = 6;
                        }
                    }
                    obj.f48178a = new long[i11];
                    obj.f48179b = new CharSequence[i11];
                    obj.d = new StaticLayout[i11];
                    if (f10 > 0.0f) {
                        obj.f48180c = new CharSequence[i11];
                        obj.f48181e = new StaticLayout[i11];
                    }
                    if (f11 / f10 < 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i12 = 0;
                    dVar = obj;
                    while (i12 < i11) {
                        long j20 = ((long) (i12 * f11)) + j12;
                        dVar.f48178a[i12] = j20;
                        dVar.f48179b[i12] = dVar.b(0, textPaint, j20, i10);
                        if (f10 > 0.0f) {
                            f12 = dVar.f48178a[i12] / f10;
                            if (z11) {
                                j13 = (long) f12;
                                if (f12 - j13 >= 0.01f || i10 == 1 || i10 == 2) {
                                    dVar.f48180c[i12] = dVar.b(1, textPaint2, j13, i10);
                                } else {
                                    dVar.f48180c[i12] = "";
                                }
                            } else {
                                dVar.f48180c[i12] = dVar.b(1, textPaint2, (long) f12, i10);
                            }
                        }
                        i12++;
                        dVar = this;
                    }
                    return;
                }
                jMax = Math.max(2L, j18 + 1);
                j12 = j11;
                i11 = (int) jMax;
            }
            f11 = 1.0f;
            obj.f48178a = new long[i11];
            obj.f48179b = new CharSequence[i11];
            obj.d = new StaticLayout[i11];
            if (f10 > 0.0f) {
                obj.f48180c = new CharSequence[i11];
                obj.f48181e = new StaticLayout[i11];
            }
            if (f11 / f10 < 1.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            i12 = 0;
            dVar = obj;
            while (i12 < i11) {
                long j21 = ((long) (i12 * f11)) + j12;
                dVar.f48178a[i12] = j21;
                dVar.f48179b[i12] = dVar.b(0, textPaint, j21, i10);
                if (f10 > 0.0f) {
                    f12 = dVar.f48178a[i12] / f10;
                    if (z11) {
                        j13 = (long) f12;
                        if (f12 - j13 >= 0.01f) {
                            dVar.f48180c[i12] = dVar.b(1, textPaint2, j13, i10);
                        } else {
                            dVar.f48180c[i12] = dVar.b(1, textPaint2, j13, i10);
                        }
                    } else {
                        dVar.f48180c[i12] = dVar.b(1, textPaint2, (long) f12, i10);
                    }
                }
                i12++;
                dVar = this;
            }
            return;
        }
        if (j10 > 100) {
            j14 = 0;
            if ((j10 / 5) % 10.0f != 0.0f) {
                j15 = 10 * ((j10 / 10) + 1);
            }
            jMax2 = Math.max(1L, (long) Math.ceil(j15 / 5.0d));
            if (j15 < 6) {
                j16 = j15 / 2;
                if (j16 < 6) {
                    i13 = (int) (j16 + 1);
                    iMax = j15 % 2 != j14 ? i13 + 1 : iMax;
                } else {
                    i13 = 6;
                }
                obj.f48178a = new long[i13];
                obj.f48179b = new CharSequence[i13];
                obj.d = new StaticLayout[i13];
                if (f10 > 0.0f) {
                    obj.f48180c = new CharSequence[i13];
                    obj.f48181e = new StaticLayout[i13];
                }
                if (jMax2 / f10 < 1.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i14 = 1;
                while (i14 < i13) {
                    long j22 = ((long) i14) * jMax2;
                    obj.f48178a[i14] = j22;
                    long j23 = jMax2;
                    obj.f48179b[i14] = obj.b(0, textPaint, j22, i10);
                    if (f10 > 0.0f) {
                        f13 = obj.f48178a[i14] / f10;
                        if (z12) {
                            j17 = (long) f13;
                            if (f13 - j17 >= 0.01f || i10 == 1 || i10 == 2) {
                                obj.f48180c[i14] = obj.b(1, textPaint2, j17, i10);
                            } else {
                                obj.f48180c[i14] = "";
                            }
                        } else {
                            obj.f48180c[i14] = obj.b(1, textPaint2, (long) f13, i10);
                        }
                    }
                    i14++;
                    jMax2 = j23;
                }
            }
            iMax = (int) Math.max(2L, j15 + 1);
            i13 = iMax;
            obj.f48178a = new long[i13];
            obj.f48179b = new CharSequence[i13];
            obj.d = new StaticLayout[i13];
            if (f10 > 0.0f) {
                obj.f48180c = new CharSequence[i13];
                obj.f48181e = new StaticLayout[i13];
            }
            if (jMax2 / f10 < 1.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            i14 = 1;
            while (i14 < i13) {
                long j24 = ((long) i14) * jMax2;
                obj.f48178a[i14] = j24;
                long j25 = jMax2;
                obj.f48179b[i14] = obj.b(0, textPaint, j24, i10);
                if (f10 > 0.0f) {
                    f13 = obj.f48178a[i14] / f10;
                    if (z12) {
                        j17 = (long) f13;
                        if (f13 - j17 >= 0.01f) {
                            obj.f48180c[i14] = obj.b(1, textPaint2, j17, i10);
                        } else {
                            obj.f48180c[i14] = obj.b(1, textPaint2, j17, i10);
                        }
                    } else {
                        obj.f48180c[i14] = obj.b(1, textPaint2, (long) f13, i10);
                    }
                }
                i14++;
                jMax2 = j25;
            }
        }
        j14 = 0;
        j15 = j10;
        jMax2 = Math.max(1L, (long) Math.ceil(j15 / 5.0d));
        if (j15 < 6) {
            j16 = j15 / 2;
            if (j16 < 6) {
                i13 = (int) (j16 + 1);
                if (j15 % 2 != j14) {
                }
            } else {
                i13 = 6;
            }
            obj.f48178a = new long[i13];
            obj.f48179b = new CharSequence[i13];
            obj.d = new StaticLayout[i13];
            if (f10 > 0.0f) {
                obj.f48180c = new CharSequence[i13];
                obj.f48181e = new StaticLayout[i13];
            }
            if (jMax2 / f10 < 1.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            i14 = 1;
            while (i14 < i13) {
                long j26 = ((long) i14) * jMax2;
                obj.f48178a[i14] = j26;
                long j27 = jMax2;
                obj.f48179b[i14] = obj.b(0, textPaint, j26, i10);
                if (f10 > 0.0f) {
                    f13 = obj.f48178a[i14] / f10;
                    if (z12) {
                        j17 = (long) f13;
                        if (f13 - j17 >= 0.01f) {
                            obj.f48180c[i14] = obj.b(1, textPaint2, j17, i10);
                        } else {
                            obj.f48180c[i14] = obj.b(1, textPaint2, j17, i10);
                        }
                    } else {
                        obj.f48180c[i14] = obj.b(1, textPaint2, (long) f13, i10);
                    }
                }
                i14++;
                jMax2 = j27;
            }
        }
        iMax = (int) Math.max(2L, j15 + 1);
        i13 = iMax;
        obj.f48178a = new long[i13];
        obj.f48179b = new CharSequence[i13];
        obj.d = new StaticLayout[i13];
        if (f10 > 0.0f) {
            obj.f48180c = new CharSequence[i13];
            obj.f48181e = new StaticLayout[i13];
        }
        if (jMax2 / f10 < 1.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        i14 = 1;
        while (i14 < i13) {
            long j28 = ((long) i14) * jMax2;
            obj.f48178a[i14] = j28;
            long j29 = jMax2;
            obj.f48179b[i14] = obj.b(0, textPaint, j28, i10);
            if (f10 > 0.0f) {
                f13 = obj.f48178a[i14] / f10;
                if (z12) {
                    j17 = (long) f13;
                    if (f13 - j17 >= 0.01f) {
                        obj.f48180c[i14] = obj.b(1, textPaint2, j17, i10);
                    } else {
                        obj.f48180c[i14] = obj.b(1, textPaint2, j17, i10);
                    }
                } else {
                    obj.f48180c[i14] = obj.b(1, textPaint2, (long) f13, i10);
                }
            }
            i14++;
            jMax2 = j29;
        }
    }

    public final void a(Canvas canvas, int i10, int i11, float f10, float f11, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr = this.f48181e;
        StaticLayout[] staticLayoutArr2 = this.d;
        StaticLayout staticLayout = (i10 == 0 ? staticLayoutArr2 : staticLayoutArr)[i11];
        if (staticLayout == null) {
            CharSequence charSequence = (i10 == 0 ? this.f48179b : this.f48180c)[i11];
            if (i10 == 0) {
                staticLayoutArr = staticLayoutArr2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i11] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f10, textPaint.ascent() + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i10, TextPaint textPaint, long j10, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return AndroidUtilities.formatWholeNumber((int) j10, 0);
            }
            if (i10 != 1) {
                return oa.X0(false, i0.a.m(j10, ' ', new StringBuilder("XTR ")), 0.65f, null);
            }
            return "≈" + BillingController.getInstance().formatCurrency(j10, "USD");
        }
        if (i10 == 1) {
            return "≈" + BillingController.getInstance().formatCurrency(j10, "USD");
        }
        if (this.h == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.h = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            this.h.setMaximumFractionDigits(6);
            this.h.setGroupingUsed(false);
        }
        this.h.setMaximumFractionDigits(j10 <= 1000000000 ? 6 : 2);
        return fe.f0("TON " + this.h.format(j10 / 1.0E9d), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
    }
}
