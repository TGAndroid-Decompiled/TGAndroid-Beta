package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.RadialProgressView;

public final class v20 extends tg.b {
    public final OvershootInterpolator d;

    public int f43332e;

    public final s50 f43333f;

    public v20(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f43333f = s50Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        r50 r50Var;
        boolean z10;
        float interpolation;
        float f12;
        float f13;
        int i10;
        float f14;
        RadialProgressView radialProgressView;
        org.telegram.ui.Components.s9 s9Var;
        org.telegram.ui.Components.s9 s9Var2;
        RectF rectF;
        float f15;
        int iDp;
        float measuredWidth;
        float y10;
        org.telegram.ui.Components.s9 s9Var3;
        float fDp;
        float f16;
        Paint paint;
        float f17;
        float f18;
        float f19;
        r50 r50Var2;
        int i11;
        boolean z11;
        boolean z12;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        r50 r50Var3;
        int i12;
        r50 r50Var4;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        r50 r50Var5;
        r50 r50Var6;
        s50 s50Var = this.f43333f;
        Paint paint2 = s50Var.F1;
        org.telegram.ui.Components.voip.u2 u2Var = s50Var.f42479r;
        org.telegram.ui.Components.voip.u2 u2Var2 = s50Var.v;
        Matrix matrix = s50Var.O0;
        org.telegram.ui.Components.s9 s9Var4 = s50Var.J0;
        org.telegram.ui.Components.s9 s9Var5 = s50Var.I0;
        RectF rectF2 = s50Var.f42480r0;
        Paint paint3 = s50Var.P0;
        RadialProgressView radialProgressView2 = s50Var.f42410a0;
        y30 y30Var = s50Var.P;
        int[] iArr = s50Var.T1;
        org.telegram.ui.Components.voip.u2 u2Var3 = s50Var.f42501w;
        Paint paint4 = s50Var.E1;
        if (s50Var.f42442h2 && s50Var.f42420c2) {
            return;
        }
        int measuredWidth2 = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - s50Var.K1;
        s50Var.K1 = jElapsedRealtime;
        if (j10 > 20) {
            j10 = 17;
        }
        long j11 = j10;
        r50 r50Var7 = s50Var.J1;
        if (r50Var7 != null) {
            r50Var7.b(0, measuredWidth2, getMeasuredHeight(), j11, s50Var.K0);
        }
        s9Var5.f32356a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        s9Var5.f32357b = com.google.android.recaptcha.internal.a.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        s9Var4.f32356a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        s9Var4.f32357b = com.google.android.recaptcha.internal.a.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f28 = s50Var.L0;
        float f29 = s50Var.K0;
        if (f28 != f29) {
            f10 = 0.6f;
            float f30 = s50Var.M0;
            f11 = 0.0f;
            float f31 = (j11 * f30) + f29;
            s50Var.K0 = f31;
            if (f30 > 0.0f) {
                if (f31 > f28) {
                    s50Var.K0 = f28;
                }
            } else if (f31 < f28) {
                s50Var.K0 = f28;
            }
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
        }
        r50 r50Var8 = s50Var.I1;
        if (r50Var8 != null && r50Var8.f41815i == 3) {
            radialProgressView2.D = true;
            if (Math.abs(radialProgressView2.f26492n) < 360.0f) {
                z10 = false;
            }
            if (z10) {
                f19 = s50Var.H1;
                if (f19 != 1.0f) {
                    r50Var5 = s50Var.I1;
                    if (r50Var5 == null) {
                        s50Var.H1 = (j11 / 180.0f) + f19;
                    } else {
                        s50Var.H1 = (j11 / 180.0f) + f19;
                    }
                    if (s50Var.H1 >= 1.0f) {
                        s50Var.H1 = 1.0f;
                        s50Var.I1 = null;
                        r50Var6 = s50Var.J1;
                        if (r50Var6 != null) {
                            radialProgressView2.D = false;
                        }
                    }
                    s50Var.S1 = true;
                }
                if (s50Var.S1) {
                    paint2 = paint2;
                    matrix = matrix;
                    radialProgressView2 = radialProgressView2;
                    z10 = z10;
                } else {
                    paint2 = paint2;
                    matrix = matrix;
                    radialProgressView2 = radialProgressView2;
                    z10 = z10;
                }
                r50Var2 = s50Var.J1;
                if (r50Var2 != null) {
                    i12 = r50Var2.f41815i;
                    if (i12 != 1) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    i11 = 3;
                    if (s50Var.J1.f41815i != 3) {
                    }
                    if (s50Var.I1 == null) {
                        if (z11) {
                            f22 = s50Var.L1;
                            if (f22 != 1.0f) {
                                f23 = (j11 / 350.0f) + f22;
                                s50Var.L1 = f23;
                                if (f23 > 1.0f) {
                                    s50Var.L1 = 1.0f;
                                }
                            } else if (!z11) {
                                f20 = s50Var.L1;
                                if (f20 != 0.0f) {
                                    f21 = f20 - (j11 / 350.0f);
                                    s50Var.L1 = f21;
                                    if (f21 < 0.0f) {
                                        s50Var.L1 = 0.0f;
                                    }
                                }
                            }
                        } else if (!z11) {
                            f20 = s50Var.L1;
                            if (f20 != 0.0f) {
                                f21 = f20 - (j11 / 350.0f);
                                s50Var.L1 = f21;
                                if (f21 < 0.0f) {
                                    s50Var.L1 = 0.0f;
                                }
                            }
                        }
                    } else if (z11) {
                        f22 = s50Var.L1;
                        if (f22 != 1.0f) {
                            f23 = (j11 / 350.0f) + f22;
                            s50Var.L1 = f23;
                            if (f23 > 1.0f) {
                                s50Var.L1 = 1.0f;
                            }
                        } else if (!z11) {
                            f20 = s50Var.L1;
                            if (f20 != 0.0f) {
                                f21 = f20 - (j11 / 350.0f);
                                s50Var.L1 = f21;
                                if (f21 < 0.0f) {
                                    s50Var.L1 = 0.0f;
                                }
                            }
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                    if (z12) {
                        f26 = s50Var.M1;
                        if (f26 != 1.0f) {
                            f27 = (j11 / 350.0f) + f26;
                            s50Var.M1 = f27;
                            if (f27 > 1.0f) {
                                s50Var.M1 = 1.0f;
                            }
                        } else if (!z12) {
                            f24 = s50Var.M1;
                            if (f24 != 0.0f) {
                                f25 = f24 - (j11 / 350.0f);
                                s50Var.M1 = f25;
                                if (f25 < 0.0f) {
                                    s50Var.M1 = 0.0f;
                                }
                            }
                        }
                    } else if (!z12) {
                        f24 = s50Var.M1;
                        if (f24 != 0.0f) {
                            f25 = f24 - (j11 / 350.0f);
                            s50Var.M1 = f25;
                            if (f25 < 0.0f) {
                                s50Var.M1 = 0.0f;
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    z11 = false;
                }
                if (s50Var.I1 == null) {
                    if (z11) {
                        f22 = s50Var.L1;
                        if (f22 != 1.0f) {
                            f23 = (j11 / 350.0f) + f22;
                            s50Var.L1 = f23;
                            if (f23 > 1.0f) {
                                s50Var.L1 = 1.0f;
                            }
                        } else if (!z11) {
                            f20 = s50Var.L1;
                            if (f20 != 0.0f) {
                                f21 = f20 - (j11 / 350.0f);
                                s50Var.L1 = f21;
                                if (f21 < 0.0f) {
                                    s50Var.L1 = 0.0f;
                                }
                            }
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                } else if (z11) {
                    f22 = s50Var.L1;
                    if (f22 != 1.0f) {
                        f23 = (j11 / 350.0f) + f22;
                        s50Var.L1 = f23;
                        if (f23 > 1.0f) {
                            s50Var.L1 = 1.0f;
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                } else if (!z11) {
                    f20 = s50Var.L1;
                    if (f20 != 0.0f) {
                        f21 = f20 - (j11 / 350.0f);
                        s50Var.L1 = f21;
                        if (f21 < 0.0f) {
                            s50Var.L1 = 0.0f;
                        }
                    }
                }
                if (z12) {
                    f26 = s50Var.M1;
                    if (f26 != 1.0f) {
                        f27 = (j11 / 350.0f) + f26;
                        s50Var.M1 = f27;
                        if (f27 > 1.0f) {
                            s50Var.M1 = 1.0f;
                        }
                    } else if (!z12) {
                        f24 = s50Var.M1;
                        if (f24 != 0.0f) {
                            f25 = f24 - (j11 / 350.0f);
                            s50Var.M1 = f25;
                            if (f25 < 0.0f) {
                                s50Var.M1 = 0.0f;
                            }
                        }
                    }
                } else if (!z12) {
                    f24 = s50Var.M1;
                    if (f24 != 0.0f) {
                        f25 = f24 - (j11 / 350.0f);
                        s50Var.M1 = f25;
                        if (f25 < 0.0f) {
                            s50Var.M1 = 0.0f;
                        }
                    }
                }
            } else {
                paint2 = paint2;
                matrix = matrix;
                radialProgressView2 = radialProgressView2;
                z10 = z10;
            }
            interpolation = (this.d.getInterpolation(s50Var.L1) * f10) + 0.4f;
            s9Var4.e(s50Var.K0, 1.0f);
            s9Var5.e(s50Var.K0, 1.0f);
            if (s50Var.I1 == null) {
                f12 = 25.909092f;
                f13 = 25.0f;
                i10 = 0;
                while (i10 < 2) {
                    float fDp2 = AndroidUtilities.dp(f12);
                    if (i10 != 0) {
                        if (i10 == 1) {
                        }
                        f14 = interpolation;
                        radialProgressView = radialProgressView2;
                        s9Var = s9Var4;
                        s9Var2 = s9Var5;
                        rectF = rectF3;
                    } else {
                        if (i10 == 1) {
                        }
                        f14 = interpolation;
                        radialProgressView = radialProgressView2;
                        s9Var = s9Var4;
                        s9Var2 = s9Var5;
                        rectF = rectF3;
                    }
                    i10++;
                    rectF3 = rectF;
                    s9Var5 = s9Var2;
                    radialProgressView2 = radialProgressView;
                    interpolation = f14;
                    s9Var4 = s9Var;
                }
            } else {
                f12 = 25.909092f;
                f13 = 25.0f;
                i10 = 0;
                while (i10 < 2) {
                    float fDp3 = AndroidUtilities.dp(f12);
                    if (i10 != 0) {
                        if (i10 == 1) {
                        }
                        f14 = interpolation;
                        radialProgressView = radialProgressView2;
                        s9Var = s9Var4;
                        s9Var2 = s9Var5;
                        rectF = rectF3;
                    } else {
                        if (i10 == 1) {
                        }
                        f14 = interpolation;
                        radialProgressView = radialProgressView2;
                        s9Var = s9Var4;
                        s9Var2 = s9Var5;
                        rectF = rectF3;
                    }
                    i10++;
                    rectF3 = rectF;
                    s9Var5 = s9Var2;
                    radialProgressView2 = radialProgressView;
                    interpolation = f14;
                    s9Var4 = s9Var;
                }
            }
            super.dispatchDraw(canvas);
            if (s50Var.W1.f33668r != null) {
                return;
            }
            invalidate();
        }
        if (r50Var8 != null && (r50Var = s50Var.J1) != null && r50Var.f41815i == 3) {
            radialProgressView2.D = true;
            radialProgressView2.E = 1.0f;
        }
        z10 = true;
        if (z10) {
            f19 = s50Var.H1;
            if (f19 != 1.0f) {
                r50Var5 = s50Var.I1;
                if (r50Var5 == null && r50Var5.f41815i == 3) {
                    s50Var.H1 = (j11 / 100.0f) + f19;
                } else {
                    s50Var.H1 = (j11 / 180.0f) + f19;
                }
                if (s50Var.H1 >= 1.0f) {
                    s50Var.H1 = 1.0f;
                    s50Var.I1 = null;
                    r50Var6 = s50Var.J1;
                    if (r50Var6 != null && r50Var6.f41815i == 3) {
                        radialProgressView2.D = false;
                    }
                }
                s50Var.S1 = true;
            }
            if (s50Var.S1 || (r50Var4 = s50Var.J1) == null) {
                paint2 = paint2;
                matrix = matrix;
                radialProgressView2 = radialProgressView2;
                z10 = z10;
            } else {
                s50Var.S1 = false;
                r50 r50Var9 = s50Var.I1;
                if (r50Var9 != null) {
                    s50.S(s50Var, r50Var9.f41815i, iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int i15 = iArr[2];
                    int i16 = iArr[3];
                    s50.S(s50Var, s50Var.J1.f41815i, iArr);
                    iD = i0.b.d(s50Var.H1, i13, iArr[0]);
                    iD2 = i0.b.d(s50Var.H1, i14, iArr[1]);
                    iD3 = i0.b.d(s50Var.H1, i15, iArr[2]);
                    iD4 = i0.b.d(s50Var.H1, i16, iArr[3]);
                } else {
                    s50.S(s50Var, r50Var4.f41815i, iArr);
                    iD = iArr[0];
                    iD2 = iArr[1];
                    iD3 = iArr[2];
                    iD4 = iArr[3];
                }
                if (this.f43332e != iD) {
                    RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.b.k(iD, 60), i0.b.k(iD, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                    s50Var.N0 = radialGradient;
                    paint3.setShader(radialGradient);
                    this.f43332e = iD;
                }
                u2Var2.a(iD3, iD2);
                u2Var.a(iD3, iD2);
                s50Var.f42462n.a(iD3, iD2);
                s50Var.f42431f.a(iD3, iD2);
                org.telegram.ui.Components.voip.u2 u2Var4 = s50Var.f42484s;
                int i17 = org.telegram.ui.ActionBar.g6.Dg;
                u2Var4.a(org.telegram.ui.ActionBar.g6.w0(null, i17, false), org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                s50Var.h.a(iD2, iD4);
            }
            r50Var2 = s50Var.J1;
            if (r50Var2 != null) {
                i12 = r50Var2.f41815i;
                if (i12 != 1 || i12 == 0 || s50.p1(i12)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i11 = 3;
                z12 = s50Var.J1.f41815i != 3;
                if (s50Var.I1 == null && (r50Var3 = s50Var.J1) != null && r50Var3.f41815i == i11) {
                    float f32 = s50Var.L1 - (j11 / 180.0f);
                    s50Var.L1 = f32;
                    if (f32 < f11) {
                        s50Var.L1 = 0.0f;
                    }
                } else if (z11) {
                    f22 = s50Var.L1;
                    if (f22 != 1.0f) {
                        f23 = (j11 / 350.0f) + f22;
                        s50Var.L1 = f23;
                        if (f23 > 1.0f) {
                            s50Var.L1 = 1.0f;
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                } else if (!z11) {
                    f20 = s50Var.L1;
                    if (f20 != 0.0f) {
                        f21 = f20 - (j11 / 350.0f);
                        s50Var.L1 = f21;
                        if (f21 < 0.0f) {
                            s50Var.L1 = 0.0f;
                        }
                    }
                }
                if (z12) {
                    f26 = s50Var.M1;
                    if (f26 != 1.0f) {
                        f27 = (j11 / 350.0f) + f26;
                        s50Var.M1 = f27;
                        if (f27 > 1.0f) {
                            s50Var.M1 = 1.0f;
                        }
                    } else if (!z12) {
                        f24 = s50Var.M1;
                        if (f24 != 0.0f) {
                            f25 = f24 - (j11 / 350.0f);
                            s50Var.M1 = f25;
                            if (f25 < 0.0f) {
                                s50Var.M1 = 0.0f;
                            }
                        }
                    }
                } else if (!z12) {
                    f24 = s50Var.M1;
                    if (f24 != 0.0f) {
                        f25 = f24 - (j11 / 350.0f);
                        s50Var.M1 = f25;
                        if (f25 < 0.0f) {
                            s50Var.M1 = 0.0f;
                        }
                    }
                }
            } else {
                i11 = 3;
                z11 = false;
            }
            if (s50Var.I1 == null) {
                if (z11) {
                    f22 = s50Var.L1;
                    if (f22 != 1.0f) {
                        f23 = (j11 / 350.0f) + f22;
                        s50Var.L1 = f23;
                        if (f23 > 1.0f) {
                            s50Var.L1 = 1.0f;
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                } else if (!z11) {
                    f20 = s50Var.L1;
                    if (f20 != 0.0f) {
                        f21 = f20 - (j11 / 350.0f);
                        s50Var.L1 = f21;
                        if (f21 < 0.0f) {
                            s50Var.L1 = 0.0f;
                        }
                    }
                }
            } else if (z11) {
                f22 = s50Var.L1;
                if (f22 != 1.0f) {
                    f23 = (j11 / 350.0f) + f22;
                    s50Var.L1 = f23;
                    if (f23 > 1.0f) {
                        s50Var.L1 = 1.0f;
                    }
                } else if (!z11) {
                    f20 = s50Var.L1;
                    if (f20 != 0.0f) {
                        f21 = f20 - (j11 / 350.0f);
                        s50Var.L1 = f21;
                        if (f21 < 0.0f) {
                            s50Var.L1 = 0.0f;
                        }
                    }
                }
            } else if (!z11) {
                f20 = s50Var.L1;
                if (f20 != 0.0f) {
                    f21 = f20 - (j11 / 350.0f);
                    s50Var.L1 = f21;
                    if (f21 < 0.0f) {
                        s50Var.L1 = 0.0f;
                    }
                }
            }
            if (z12) {
                f26 = s50Var.M1;
                if (f26 != 1.0f) {
                    f27 = (j11 / 350.0f) + f26;
                    s50Var.M1 = f27;
                    if (f27 > 1.0f) {
                        s50Var.M1 = 1.0f;
                    }
                } else if (!z12) {
                    f24 = s50Var.M1;
                    if (f24 != 0.0f) {
                        f25 = f24 - (j11 / 350.0f);
                        s50Var.M1 = f25;
                        if (f25 < 0.0f) {
                            s50Var.M1 = 0.0f;
                        }
                    }
                }
            } else if (!z12) {
                f24 = s50Var.M1;
                if (f24 != 0.0f) {
                    f25 = f24 - (j11 / 350.0f);
                    s50Var.M1 = f25;
                    if (f25 < 0.0f) {
                        s50Var.M1 = 0.0f;
                    }
                }
            }
        } else {
            paint2 = paint2;
            matrix = matrix;
            radialProgressView2 = radialProgressView2;
            z10 = z10;
        }
        interpolation = (this.d.getInterpolation(s50Var.L1) * f10) + 0.4f;
        s9Var4.e(s50Var.K0, 1.0f);
        s9Var5.e(s50Var.K0, 1.0f);
        if (s50Var.I1 == null && s50Var.J1 != null && !s50Var.r1()) {
            r50 r50Var10 = s50Var.J1;
            f12 = 25.909092f;
            int i18 = r50Var10.f41815i;
            f13 = 25.0f;
            if (i18 == 3 || s50Var.I1.f41815i == 3) {
                if (i18 == 3) {
                    f18 = s50Var.H1;
                    paint = paint4;
                    paint.setShader(s50Var.I1.f41814g);
                    f17 = 1.0f;
                } else {
                    paint = paint4;
                    f17 = 1.0f;
                    float f33 = 1.0f - s50Var.H1;
                    paint.setShader(r50Var10.f41814g);
                    f18 = f33;
                }
                int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kg, false), s50Var.Q1, f17);
                Paint paint5 = paint2;
                paint5.setColor(offsetColor);
                float measuredWidth3 = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                float y11 = (int) (u2Var3.getY() + AndroidUtilities.dp(25.0f));
                Matrix matrix2 = matrix;
                matrix2.setTranslate(measuredWidth3, y11);
                s50Var.N0.setLocalMatrix(matrix2);
                paint.setAlpha(76);
                canvas.save();
                canvas.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleY() * 1.0f, measuredWidth3, y11);
                canvas.save();
                float fX = com.google.android.recaptcha.internal.a.x(0.807f, s50Var.K0, 0.5f, 0.878f) * s50Var.M1;
                canvas.scale(fX, fX, measuredWidth3, y11);
                canvas.save();
                canvas.scale(1.2f, 1.2f, measuredWidth3, y11);
                canvas.drawCircle(measuredWidth3, y11, AndroidUtilities.dp(160.0f), paint3);
                canvas.restore();
                canvas.restore();
                if (s50Var.W0 != null) {
                    canvas.save();
                    float fB = com.google.android.recaptcha.internal.a.B(0.807f, s50Var.K0, 0.878f, interpolation);
                    canvas.scale(fB, fB, measuredWidth3, y11);
                    s9Var4.a(measuredWidth3, y11, canvas, paint);
                    canvas.restore();
                    canvas.save();
                    float fB2 = com.google.android.recaptcha.internal.a.B(0.704f, s50Var.K0, 0.926f, interpolation);
                    canvas.scale(fB2, fB2, measuredWidth3, y11);
                    s9Var5.a(measuredWidth3, y11, canvas, paint);
                    canvas.restore();
                }
                paint.setAlpha(255);
                if (z10) {
                    canvas.drawCircle(measuredWidth3, y11, AndroidUtilities.dp(25.909092f), paint);
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Og, false));
                    if (f18 != 0.0f) {
                        paint.setAlpha((int) (f18 * 255.0f));
                        paint.setShader(null);
                        canvas.drawCircle(measuredWidth3, y11, AndroidUtilities.dp(25.909092f), paint);
                    }
                }
                canvas.drawCircle(measuredWidth3, y11, AndroidUtilities.dp(25.0f) * f18, paint5);
                if (!z10) {
                    radialProgressView2.a(canvas, measuredWidth3, y11);
                }
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            if (s50Var.W1.f33668r != null) {
                return;
            }
            invalidate();
        }
        f12 = 25.909092f;
        f13 = 25.0f;
        i10 = 0;
        while (i10 < 2) {
            float fDp4 = AndroidUtilities.dp(f12);
            if (i10 != 0 && s50Var.I1 != null) {
                if (!s50Var.r1()) {
                    paint4.setShader(s50Var.I1.f41814g);
                }
                f15 = 1.0f - s50Var.H1;
                if (s50Var.I1.f41815i == 3) {
                    iDp = AndroidUtilities.dp(2.0f);
                    fDp4 -= iDp * f15;
                    if (r27.getShader() != null) {
                    }
                    if (s50Var.r1()) {
                        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false);
                        int i19 = org.telegram.ui.ActionBar.g6.Kg;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(iW0, org.telegram.ui.ActionBar.g6.w0(null, i19, false), s50Var.Q1, 1.0f);
                        r27.setColor(offsetColor2);
                        r27.setShader(null);
                        int i20 = org.telegram.ui.ActionBar.g6.f23190kg;
                        u2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false), org.telegram.ui.ActionBar.g6.w0(null, i19, false), s50Var.Q1, 1.0f), offsetColor2);
                        u2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false), org.telegram.ui.ActionBar.g6.w0(null, i19, false), s50Var.Q1, 1.0f), offsetColor2);
                    }
                    measuredWidth = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    y10 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix.setTranslate(measuredWidth, y10);
                    s50Var.N0.setLocalMatrix(matrix);
                    r27.setAlpha((int) (s50Var.R0 * 76.0f * f15));
                    canvas.save();
                    canvas.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth, y10);
                    canvas.save();
                    float fX2 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f34 = s50Var.M1;
                    canvas.scale(f34 * fX2, f34 * fX2, measuredWidth, y10);
                    if (i10 != 1) {
                    }
                    canvas.restore();
                    if (s50Var.r1()) {
                        s9Var2 = s9Var5;
                        s9Var3 = s9Var4;
                    } else {
                        s9Var2 = s9Var5;
                        s9Var3 = s9Var4;
                    }
                    if (s50.B3) {
                        if (i10 == 0) {
                            r27.setAlpha((int) (s50Var.S0 * 255.0f));
                        } else {
                            r27.setAlpha((int) (s50Var.S0 * f15 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        r27.setAlpha(255);
                    } else {
                        r27.setAlpha((int) (f15 * 255.0f));
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float fDp5 = AndroidUtilities.dp(24.0f);
                    float f35 = (fDp4 - measuredWidth4) + measuredWidth4;
                    float f36 = s50Var.R0;
                    float f37 = f35 * f36;
                    float f38 = ((fDp4 - fDp5) + fDp5) * f36;
                    float f39 = measuredWidth + f37;
                    f14 = interpolation;
                    s9Var = s9Var3;
                    rectF = rectF3;
                    rectF.set(measuredWidth - f37, y10 - f38, f39, y10 + f38);
                    fDp = (fDp4 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    r27.setAlpha((int) (s50Var.R0 * r27.getAlpha()));
                    canvas.drawRoundRect(rectF, fDp, fDp, r27);
                    if (i10 == 1) {
                        f16 = 4.0f;
                        if (s50Var.J1.f41815i == 3) {
                            if (s50Var.r1()) {
                                radialProgressView = radialProgressView2;
                                radialProgressView.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView = radialProgressView2;
                            }
                            radialProgressView.a(canvas, measuredWidth, y10);
                        } else {
                            radialProgressView = radialProgressView2;
                        }
                    } else {
                        radialProgressView = radialProgressView2;
                        f16 = 4.0f;
                    }
                    canvas.restore();
                    if (y30Var == null) {
                    }
                } else {
                    if (r27.getShader() != null) {
                    }
                    if (s50Var.r1()) {
                        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false);
                        int i110 = org.telegram.ui.ActionBar.g6.Kg;
                        int offsetColor3 = AndroidUtilities.getOffsetColor(iW1, org.telegram.ui.ActionBar.g6.w0(null, i110, false), s50Var.Q1, 1.0f);
                        r27.setColor(offsetColor3);
                        r27.setShader(null);
                        int i21 = org.telegram.ui.ActionBar.g6.f23190kg;
                        u2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false), org.telegram.ui.ActionBar.g6.w0(null, i110, false), s50Var.Q1, 1.0f), offsetColor3);
                        u2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false), org.telegram.ui.ActionBar.g6.w0(null, i110, false), s50Var.Q1, 1.0f), offsetColor3);
                    }
                    measuredWidth = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    y10 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix.setTranslate(measuredWidth, y10);
                    s50Var.N0.setLocalMatrix(matrix);
                    r27.setAlpha((int) (s50Var.R0 * 76.0f * f15));
                    canvas.save();
                    canvas.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth, y10);
                    canvas.save();
                    float fX3 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f310 = s50Var.M1;
                    canvas.scale(f310 * fX3, f310 * fX3, measuredWidth, y10);
                    if (i10 != 1) {
                    }
                    canvas.restore();
                    if (s50Var.r1()) {
                        s9Var2 = s9Var5;
                        s9Var3 = s9Var4;
                    } else {
                        s9Var2 = s9Var5;
                        s9Var3 = s9Var4;
                    }
                    if (s50.B3) {
                        if (i10 == 0) {
                            r27.setAlpha((int) (s50Var.S0 * 255.0f));
                        } else {
                            r27.setAlpha((int) (s50Var.S0 * f15 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        r27.setAlpha(255);
                    } else {
                        r27.setAlpha((int) (f15 * 255.0f));
                    }
                    float measuredWidth5 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float fDp6 = AndroidUtilities.dp(24.0f);
                    float f311 = (fDp4 - measuredWidth5) + measuredWidth5;
                    float f312 = s50Var.R0;
                    float f313 = f311 * f312;
                    float f314 = ((fDp4 - fDp6) + fDp6) * f312;
                    float f315 = measuredWidth + f313;
                    f14 = interpolation;
                    s9Var = s9Var3;
                    rectF = rectF3;
                    rectF.set(measuredWidth - f313, y10 - f314, f315, y10 + f314);
                    fDp = (fDp4 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    r27.setAlpha((int) (s50Var.R0 * r27.getAlpha()));
                    canvas.drawRoundRect(rectF, fDp, fDp, r27);
                    if (i10 == 1) {
                        f16 = 4.0f;
                        if (s50Var.J1.f41815i == 3) {
                            if (s50Var.r1()) {
                                radialProgressView = radialProgressView2;
                                radialProgressView.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView = radialProgressView2;
                            }
                            radialProgressView.a(canvas, measuredWidth, y10);
                        } else {
                            radialProgressView = radialProgressView2;
                        }
                    } else {
                        radialProgressView = radialProgressView2;
                        f16 = 4.0f;
                    }
                    canvas.restore();
                    if (y30Var == null) {
                    }
                }
            } else if (i10 == 1 || s50Var.J1 == null) {
                f14 = interpolation;
                radialProgressView = radialProgressView2;
                s9Var = s9Var4;
                s9Var2 = s9Var5;
                rectF = rectF3;
            } else {
                if (!s50Var.r1()) {
                    r27.setShader(s50Var.J1.f41814g);
                }
                f15 = s50Var.H1;
                if (s50Var.J1.f41815i == 3) {
                    iDp = AndroidUtilities.dp(2.0f);
                    fDp4 -= iDp * f15;
                    if (r27.getShader() != null && !s50Var.r1()) {
                        r27.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kg, false), s50Var.Q1, 1.0f));
                    }
                    if (s50Var.r1()) {
                        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false);
                        int i111 = org.telegram.ui.ActionBar.g6.Kg;
                        int offsetColor4 = AndroidUtilities.getOffsetColor(iW2, org.telegram.ui.ActionBar.g6.w0(null, i111, false), s50Var.Q1, 1.0f);
                        r27.setColor(offsetColor4);
                        r27.setShader(null);
                        int i22 = org.telegram.ui.ActionBar.g6.f23190kg;
                        u2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i22, false), org.telegram.ui.ActionBar.g6.w0(null, i111, false), s50Var.Q1, 1.0f), offsetColor4);
                        u2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i22, false), org.telegram.ui.ActionBar.g6.w0(null, i111, false), s50Var.Q1, 1.0f), offsetColor4);
                    }
                    measuredWidth = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    y10 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix.setTranslate(measuredWidth, y10);
                    s50Var.N0.setLocalMatrix(matrix);
                    r27.setAlpha((int) (s50Var.R0 * 76.0f * f15));
                    canvas.save();
                    canvas.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth, y10);
                    canvas.save();
                    float fX4 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f316 = s50Var.M1;
                    canvas.scale(f316 * fX4, f316 * fX4, measuredWidth, y10);
                    if (i10 != 1 && !s50Var.r1() && LiteMode.isEnabled(512)) {
                        canvas.save();
                        canvas.scale(1.2f, 1.2f, measuredWidth, y10);
                        int alpha = paint3.getAlpha();
                        paint3.setAlpha((int) ((1.0f - s50Var.f42500v3.f48497e) * s50Var.R0 * alpha));
                        canvas.drawCircle(measuredWidth, y10, AndroidUtilities.dp(160.0f), paint3);
                        paint3.setAlpha(alpha);
                        canvas.restore();
                    }
                    canvas.restore();
                    if (s50Var.r1() || s50Var.R0 <= 0.0f) {
                        s9Var2 = s9Var5;
                        s9Var3 = s9Var4;
                    } else {
                        canvas.save();
                        float fX5 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, interpolation, 0.878f);
                        canvas.scale(fX5, fX5, measuredWidth, y10);
                        s9Var3 = s9Var4;
                        s9Var3.a(measuredWidth, y10, canvas, r27);
                        canvas.restore();
                        canvas.save();
                        float fX6 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.704f, interpolation, 0.926f);
                        canvas.scale(fX6, fX6, measuredWidth, y10);
                        s9Var2 = s9Var5;
                        s9Var2.a(measuredWidth, y10, canvas, r27);
                        canvas.restore();
                    }
                    if (s50.B3) {
                        if (i10 == 0) {
                            r27.setAlpha((int) (s50Var.S0 * 255.0f));
                        } else {
                            r27.setAlpha((int) (s50Var.S0 * f15 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        r27.setAlpha(255);
                    } else {
                        r27.setAlpha((int) (f15 * 255.0f));
                    }
                    float measuredWidth6 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float fDp7 = AndroidUtilities.dp(24.0f);
                    float f317 = (fDp4 - measuredWidth6) + measuredWidth6;
                    float f318 = s50Var.R0;
                    float f319 = f317 * f318;
                    float f3110 = ((fDp4 - fDp7) + fDp7) * f318;
                    float f3111 = measuredWidth + f319;
                    f14 = interpolation;
                    s9Var = s9Var3;
                    rectF = rectF3;
                    rectF.set(measuredWidth - f319, y10 - f3110, f3111, y10 + f3110);
                    fDp = (fDp4 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    r27.setAlpha((int) (s50Var.R0 * r27.getAlpha()));
                    canvas.drawRoundRect(rectF, fDp, fDp, r27);
                    if (i10 == 1) {
                        f16 = 4.0f;
                        if (s50Var.J1.f41815i == 3) {
                            if (s50Var.r1()) {
                                radialProgressView = radialProgressView2;
                                radialProgressView.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView = radialProgressView2;
                            }
                            radialProgressView.a(canvas, measuredWidth, y10);
                        } else {
                            radialProgressView = radialProgressView2;
                        }
                    } else {
                        radialProgressView = radialProgressView2;
                        f16 = 4.0f;
                    }
                    canvas.restore();
                    if (y30Var == null && y30Var.getVisibility() == 0) {
                        r27.setAlpha((int) (y30Var.getAlpha() * 255.0f));
                        float x8 = y30Var.getX() - getX();
                        float y12 = y30Var.getY() - getY();
                        rectF.set(x8, y12, y30Var.getMeasuredWidth() + x8, y30Var.getMeasuredHeight() + y12);
                        canvas.save();
                        canvas.scale(y30Var.getScaleX(), y30Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), r27);
                        canvas.restore();
                    }
                } else {
                    if (r27.getShader() != null) {
                    }
                    if (s50Var.r1()) {
                        int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false);
                        int i112 = org.telegram.ui.ActionBar.g6.Kg;
                        int offsetColor5 = AndroidUtilities.getOffsetColor(iW3, org.telegram.ui.ActionBar.g6.w0(null, i112, false), s50Var.Q1, 1.0f);
                        r27.setColor(offsetColor5);
                        r27.setShader(null);
                        int i23 = org.telegram.ui.ActionBar.g6.f23190kg;
                        u2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false), org.telegram.ui.ActionBar.g6.w0(null, i112, false), s50Var.Q1, 1.0f), offsetColor5);
                        u2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false), org.telegram.ui.ActionBar.g6.w0(null, i112, false), s50Var.Q1, 1.0f), offsetColor5);
                    }
                    measuredWidth = (int) ((u2Var3.getMeasuredWidth() / 2.0f) + u2Var3.getX());
                    y10 = (int) (u2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix.setTranslate(measuredWidth, y10);
                    s50Var.N0.setLocalMatrix(matrix);
                    r27.setAlpha((int) (s50Var.R0 * 76.0f * f15));
                    canvas.save();
                    canvas.scale(u2Var3.getScaleX() * 1.0f, u2Var3.getScaleX() * 1.0f, measuredWidth, y10);
                    canvas.save();
                    float fX7 = com.google.android.recaptcha.internal.a.x(s50Var.K0, 0.807f, 0.5f, 0.878f);
                    float f3112 = s50Var.M1;
                    canvas.scale(f3112 * fX7, f3112 * fX7, measuredWidth, y10);
                    if (i10 != 1) {
                    }
                    canvas.restore();
                    if (s50Var.r1()) {
                        s9Var2 = s9Var5;
                        s9Var3 = s9Var4;
                    } else {
                        s9Var2 = s9Var5;
                        s9Var3 = s9Var4;
                    }
                    if (s50.B3) {
                        if (i10 == 0) {
                            r27.setAlpha((int) (s50Var.S0 * 255.0f));
                        } else {
                            r27.setAlpha((int) (s50Var.S0 * f15 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        r27.setAlpha(255);
                    } else {
                        r27.setAlpha((int) (f15 * 255.0f));
                    }
                    float measuredWidth7 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float fDp8 = AndroidUtilities.dp(24.0f);
                    float f3113 = (fDp4 - measuredWidth7) + measuredWidth7;
                    float f3114 = s50Var.R0;
                    float f3115 = f3113 * f3114;
                    float f3116 = ((fDp4 - fDp8) + fDp8) * f3114;
                    float f3117 = measuredWidth + f3115;
                    f14 = interpolation;
                    s9Var = s9Var3;
                    rectF = rectF3;
                    rectF.set(measuredWidth - f3115, y10 - f3116, f3117, y10 + f3116);
                    fDp = (fDp4 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    r27.setAlpha((int) (s50Var.R0 * r27.getAlpha()));
                    canvas.drawRoundRect(rectF, fDp, fDp, r27);
                    if (i10 == 1) {
                        f16 = 4.0f;
                        if (s50Var.J1.f41815i == 3) {
                            if (s50Var.r1()) {
                                radialProgressView = radialProgressView2;
                                radialProgressView.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView = radialProgressView2;
                            }
                            radialProgressView.a(canvas, measuredWidth, y10);
                        } else {
                            radialProgressView = radialProgressView2;
                        }
                    } else {
                        radialProgressView = radialProgressView2;
                        f16 = 4.0f;
                    }
                    canvas.restore();
                    if (y30Var == null) {
                    }
                }
            }
            i10++;
            rectF3 = rectF;
            s9Var5 = s9Var2;
            radialProgressView2 = radialProgressView;
            interpolation = f14;
            s9Var4 = s9Var;
        }
        super.dispatchDraw(canvas);
        if (s50Var.W1.f33668r != null) {
            return;
        }
        invalidate();
        z10 = true;
        if (z10) {
            f19 = s50Var.H1;
            if (f19 != 1.0f) {
                r50Var5 = s50Var.I1;
                if (r50Var5 == null) {
                    s50Var.H1 = (j11 / 180.0f) + f19;
                } else {
                    s50Var.H1 = (j11 / 180.0f) + f19;
                }
                if (s50Var.H1 >= 1.0f) {
                    s50Var.H1 = 1.0f;
                    s50Var.I1 = null;
                    r50Var6 = s50Var.J1;
                    if (r50Var6 != null) {
                        radialProgressView2.D = false;
                    }
                }
                s50Var.S1 = true;
            }
            if (s50Var.S1) {
                paint2 = paint2;
                matrix = matrix;
                radialProgressView2 = radialProgressView2;
                z10 = z10;
            } else {
                paint2 = paint2;
                matrix = matrix;
                radialProgressView2 = radialProgressView2;
                z10 = z10;
            }
            r50Var2 = s50Var.J1;
            if (r50Var2 != null) {
                i12 = r50Var2.f41815i;
                if (i12 != 1) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                i11 = 3;
                if (s50Var.J1.f41815i != 3) {
                }
                if (s50Var.I1 == null) {
                    if (z11) {
                        f22 = s50Var.L1;
                        if (f22 != 1.0f) {
                            f23 = (j11 / 350.0f) + f22;
                            s50Var.L1 = f23;
                            if (f23 > 1.0f) {
                                s50Var.L1 = 1.0f;
                            }
                        } else if (!z11) {
                            f20 = s50Var.L1;
                            if (f20 != 0.0f) {
                                f21 = f20 - (j11 / 350.0f);
                                s50Var.L1 = f21;
                                if (f21 < 0.0f) {
                                    s50Var.L1 = 0.0f;
                                }
                            }
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                } else if (z11) {
                    f22 = s50Var.L1;
                    if (f22 != 1.0f) {
                        f23 = (j11 / 350.0f) + f22;
                        s50Var.L1 = f23;
                        if (f23 > 1.0f) {
                            s50Var.L1 = 1.0f;
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                } else if (!z11) {
                    f20 = s50Var.L1;
                    if (f20 != 0.0f) {
                        f21 = f20 - (j11 / 350.0f);
                        s50Var.L1 = f21;
                        if (f21 < 0.0f) {
                            s50Var.L1 = 0.0f;
                        }
                    }
                }
                if (z12) {
                    f26 = s50Var.M1;
                    if (f26 != 1.0f) {
                        f27 = (j11 / 350.0f) + f26;
                        s50Var.M1 = f27;
                        if (f27 > 1.0f) {
                            s50Var.M1 = 1.0f;
                        }
                    } else if (!z12) {
                        f24 = s50Var.M1;
                        if (f24 != 0.0f) {
                            f25 = f24 - (j11 / 350.0f);
                            s50Var.M1 = f25;
                            if (f25 < 0.0f) {
                                s50Var.M1 = 0.0f;
                            }
                        }
                    }
                } else if (!z12) {
                    f24 = s50Var.M1;
                    if (f24 != 0.0f) {
                        f25 = f24 - (j11 / 350.0f);
                        s50Var.M1 = f25;
                        if (f25 < 0.0f) {
                            s50Var.M1 = 0.0f;
                        }
                    }
                }
            } else {
                i11 = 3;
                z11 = false;
            }
            if (s50Var.I1 == null) {
                if (z11) {
                    f22 = s50Var.L1;
                    if (f22 != 1.0f) {
                        f23 = (j11 / 350.0f) + f22;
                        s50Var.L1 = f23;
                        if (f23 > 1.0f) {
                            s50Var.L1 = 1.0f;
                        }
                    } else if (!z11) {
                        f20 = s50Var.L1;
                        if (f20 != 0.0f) {
                            f21 = f20 - (j11 / 350.0f);
                            s50Var.L1 = f21;
                            if (f21 < 0.0f) {
                                s50Var.L1 = 0.0f;
                            }
                        }
                    }
                } else if (!z11) {
                    f20 = s50Var.L1;
                    if (f20 != 0.0f) {
                        f21 = f20 - (j11 / 350.0f);
                        s50Var.L1 = f21;
                        if (f21 < 0.0f) {
                            s50Var.L1 = 0.0f;
                        }
                    }
                }
            } else if (z11) {
                f22 = s50Var.L1;
                if (f22 != 1.0f) {
                    f23 = (j11 / 350.0f) + f22;
                    s50Var.L1 = f23;
                    if (f23 > 1.0f) {
                        s50Var.L1 = 1.0f;
                    }
                } else if (!z11) {
                    f20 = s50Var.L1;
                    if (f20 != 0.0f) {
                        f21 = f20 - (j11 / 350.0f);
                        s50Var.L1 = f21;
                        if (f21 < 0.0f) {
                            s50Var.L1 = 0.0f;
                        }
                    }
                }
            } else if (!z11) {
                f20 = s50Var.L1;
                if (f20 != 0.0f) {
                    f21 = f20 - (j11 / 350.0f);
                    s50Var.L1 = f21;
                    if (f21 < 0.0f) {
                        s50Var.L1 = 0.0f;
                    }
                }
            }
            if (z12) {
                f26 = s50Var.M1;
                if (f26 != 1.0f) {
                    f27 = (j11 / 350.0f) + f26;
                    s50Var.M1 = f27;
                    if (f27 > 1.0f) {
                        s50Var.M1 = 1.0f;
                    }
                } else if (!z12) {
                    f24 = s50Var.M1;
                    if (f24 != 0.0f) {
                        f25 = f24 - (j11 / 350.0f);
                        s50Var.M1 = f25;
                        if (f25 < 0.0f) {
                            s50Var.M1 = 0.0f;
                        }
                    }
                }
            } else if (!z12) {
                f24 = s50Var.M1;
                if (f24 != 0.0f) {
                    f25 = f24 - (j11 / 350.0f);
                    s50Var.M1 = f25;
                    if (f25 < 0.0f) {
                        s50Var.M1 = 0.0f;
                    }
                }
            }
        } else {
            paint2 = paint2;
            matrix = matrix;
            radialProgressView2 = radialProgressView2;
            z10 = z10;
        }
        interpolation = (this.d.getInterpolation(s50Var.L1) * f10) + 0.4f;
        s9Var4.e(s50Var.K0, 1.0f);
        s9Var5.e(s50Var.K0, 1.0f);
        if (s50Var.I1 == null) {
            f12 = 25.909092f;
            f13 = 25.0f;
            i10 = 0;
            while (i10 < 2) {
                float fDp9 = AndroidUtilities.dp(f12);
                if (i10 != 0) {
                    if (i10 == 1) {
                    }
                    f14 = interpolation;
                    radialProgressView = radialProgressView2;
                    s9Var = s9Var4;
                    s9Var2 = s9Var5;
                    rectF = rectF3;
                } else {
                    if (i10 == 1) {
                    }
                    f14 = interpolation;
                    radialProgressView = radialProgressView2;
                    s9Var = s9Var4;
                    s9Var2 = s9Var5;
                    rectF = rectF3;
                }
                i10++;
                rectF3 = rectF;
                s9Var5 = s9Var2;
                radialProgressView2 = radialProgressView;
                interpolation = f14;
                s9Var4 = s9Var;
            }
        } else {
            f12 = 25.909092f;
            f13 = 25.0f;
            i10 = 0;
            while (i10 < 2) {
                float fDp10 = AndroidUtilities.dp(f12);
                if (i10 != 0) {
                    if (i10 == 1) {
                    }
                    f14 = interpolation;
                    radialProgressView = radialProgressView2;
                    s9Var = s9Var4;
                    s9Var2 = s9Var5;
                    rectF = rectF3;
                } else {
                    if (i10 == 1) {
                    }
                    f14 = interpolation;
                    radialProgressView = radialProgressView2;
                    s9Var = s9Var4;
                    s9Var2 = s9Var5;
                    rectF = rectF3;
                }
                i10++;
                rectF3 = rectF;
                s9Var5 = s9Var2;
                radialProgressView2 = radialProgressView;
                interpolation = f14;
                s9Var4 = s9Var;
            }
        }
        super.dispatchDraw(canvas);
        if (s50Var.W1.f33668r != null) {
            return;
        }
        invalidate();
    }
}
