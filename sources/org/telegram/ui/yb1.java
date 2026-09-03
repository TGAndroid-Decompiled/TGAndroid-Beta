package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class yb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.il0, org.telegram.ui.Components.n81, org.telegram.ui.ActionBar.c2 {
    public final int f40226a;
    public final jd1 f40227b;

    public yb1(jd1 jd1Var, int i10) {
        this.f40226a = i10;
        this.f40227b = jd1Var;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean i32 = s1Var.i3(f10);
            jd1 jd1Var = this.f40227b;
            if (i32) {
                if (s1Var.getMessageObject().isOutOwner()) {
                    jd1Var.Y0(3, true);
                    return;
                } else {
                    jd1Var.Y0(1, true);
                    return;
                }
            }
            jd1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        jd1 jd1Var = this.f40227b;
        if (!(jd1Var.f35242y1 instanceof ui1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z4 && drawable != null) {
                jc1 jc1Var = jd1Var.f35179a;
                AndroidUtilities.calcDrawableColor(drawable);
                jc1Var.b(jd1Var.P0(drawable), drawable, Float.valueOf(jd1Var.f35206i1));
                if (!z10 && jd1Var.C1 && jd1Var.f35229t1 == null) {
                    jd1Var.f35230u0.getImageReceiver().setCrossfadeWithOldImage(false);
                    jd1Var.i1();
                    jd1Var.f35230u0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                jd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        jd1 jd1Var = this.f40227b;
        if (!jd1Var.B1) {
            return;
        }
        jd1Var.f35230u0.getBackground();
        float f10 = 1.0f;
        if (jd1Var.f35241y0 != null) {
            f10 = (jd1Var.f35230u0.getScaleX() - 1.0f) / (jd1Var.f35233v1 - 1.0f);
        }
        jd1Var.f35230u0.setTranslationX(i10 * f10);
        jd1Var.f35230u0.setTranslationY(i11 * f10);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean z4;
        switch (this.f40226a) {
            case 3:
                this.f40227b.f35218p0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f40227b.O0(false);
                return;
            case 5:
                jd1 jd1Var = this.f40227b;
                org.telegram.ui.ActionBar.h6 h6Var = jd1Var.f35225s;
                if (h6Var.f19742j == 4294967296L) {
                    h6Var.f19742j = 0L;
                    h6Var.f19743k = 0L;
                    h6Var.f19744l = 0L;
                    h6Var.f19745m = 0L;
                    jd1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                jd1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                jd1Var.Y0(2, false);
                return;
            case 6:
                jd1 jd1Var2 = this.f40227b;
                org.telegram.ui.ActionBar.h6 h6Var2 = jd1Var2.f35225s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f19789f0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.f19756y;
                    h6Var2.f19742j = c6Var.d;
                    h6Var2.f19743k = c6Var.e;
                    h6Var2.f19744l = c6Var.f19532f;
                    h6Var2.f19745m = c6Var.f19533g;
                    h6Var2.f19746n = c6Var.h;
                    String str = c6Var.f19531c;
                    h6Var2.f19747o = str;
                    float f10 = c6Var.f19536k;
                    h6Var2.f19748p = f10;
                    jd1Var2.f35206i1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = jd1Var2.R0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) jd1Var2.R0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.f19747o.equals(tL_wallPaper.slug)) {
                                    jd1Var2.T0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        jd1Var2.T0 = null;
                    }
                    jd1Var2.v = true;
                    org.telegram.ui.Components.m81 m81Var = jd1Var2.G0[1];
                    if (jd1Var2.T0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    m81Var.a(z4, true);
                    jd1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = jd1Var2.f35230u0.getBackground();
                if (background instanceof org.telegram.ui.Components.ec0) {
                    org.telegram.ui.Components.ec0 ec0Var = (org.telegram.ui.Components.ec0) background;
                    ec0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (jd1Var2.f35206i1 < 0.0f) {
                            jd1Var2.f35230u0.getImageReceiver().setGradientBitmap(ec0Var.f24580k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = jd1Var2.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = jd1Var2.f35206i1;
                        if (f11 < 0.0f) {
                            jd1Var2.f35206i1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = jd1Var2.Q0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(jd1Var2.f35206i1);
                }
                org.telegram.ui.ActionBar.j6.p1(true);
                jd1Var2.Y0(2, false);
                return;
            default:
                jd1 jd1Var3 = this.f40227b;
                org.telegram.ui.ActionBar.h6 h6Var3 = jd1Var3.f35225s;
                if (h6Var3.f19742j == 4294967296L) {
                    h6Var3.f19742j = 0L;
                    h6Var3.f19743k = 0L;
                    h6Var3.f19744l = 0L;
                    h6Var3.f19745m = 0L;
                    jd1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                jd1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                jd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
