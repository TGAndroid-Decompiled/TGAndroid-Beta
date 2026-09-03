package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class xb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.jl0, org.telegram.ui.Components.n81, org.telegram.ui.ActionBar.c2 {
    public final int f43006a;
    public final jd1 f43007b;

    public xb1(jd1 jd1Var, int i10) {
        this.f43006a = i10;
        this.f43007b = jd1Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f10);
            jd1 jd1Var = this.f43007b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
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
    public void d(int i10, int i11) {
        jd1 jd1Var = this.f43007b;
        if (!jd1Var.B1) {
            return;
        }
        jd1Var.f38013u0.getBackground();
        float f10 = 1.0f;
        if (jd1Var.f38024y0 != null) {
            f10 = (jd1Var.f38013u0.getScaleX() - 1.0f) / (jd1Var.f38016v1 - 1.0f);
        }
        jd1Var.f38013u0.setTranslationX(i10 * f10);
        jd1Var.f38013u0.setTranslationY(i11 * f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        jd1 jd1Var = this.f43007b;
        if (!(jd1Var.f38025y1 instanceof vi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z4 && drawable != null) {
                ic1 ic1Var = jd1Var.f37961a;
                AndroidUtilities.calcDrawableColor(drawable);
                ic1Var.b(jd1Var.P0(drawable), drawable, Float.valueOf(jd1Var.f37989i1));
                if (!z10 && jd1Var.C1 && jd1Var.f38012t1 == null) {
                    jd1Var.f38013u0.getImageReceiver().setCrossfadeWithOldImage(false);
                    jd1Var.i1();
                    jd1Var.f38013u0.getImageReceiver().setCrossfadeWithOldImage(true);
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
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean z4;
        switch (this.f43006a) {
            case 3:
                this.f43007b.f38001p0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f43007b.O0(false);
                return;
            case 5:
                jd1 jd1Var = this.f43007b;
                org.telegram.ui.ActionBar.i6 i6Var = jd1Var.f38008s;
                if (i6Var.f21476j == 4294967296L) {
                    i6Var.f21476j = 0L;
                    i6Var.f21477k = 0L;
                    i6Var.f21478l = 0L;
                    i6Var.f21479m = 0L;
                    jd1Var.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                jd1Var.v = true;
                org.telegram.ui.ActionBar.k6.p1(true);
                jd1Var.Y0(2, false);
                return;
            case 6:
                jd1 jd1Var2 = this.f43007b;
                org.telegram.ui.ActionBar.i6 i6Var2 = jd1Var2.f38008s;
                if (org.telegram.ui.ActionBar.k6.Z0() && org.telegram.ui.ActionBar.k6.I.f21515f0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.f21490y;
                    i6Var2.f21476j = d6Var.d;
                    i6Var2.f21477k = d6Var.f21287e;
                    i6Var2.f21478l = d6Var.f21288f;
                    i6Var2.f21479m = d6Var.f21289g;
                    i6Var2.f21480n = d6Var.h;
                    String str = d6Var.f21286c;
                    i6Var2.f21481o = str;
                    float f10 = d6Var.f21292k;
                    i6Var2.f21482p = f10;
                    jd1Var2.f37989i1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = jd1Var2.R0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) jd1Var2.R0.get(i11);
                                if (tL_wallPaper.pattern && i6Var2.f21481o.equals(tL_wallPaper.slug)) {
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
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                Drawable background = jd1Var2.f38013u0.getBackground();
                if (background instanceof org.telegram.ui.Components.fc0) {
                    org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) background;
                    fc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (jd1Var2.f37989i1 < 0.0f) {
                            jd1Var2.f38013u0.getImageReceiver().setGradientBitmap(fc0Var.f26878k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = jd1Var2.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = jd1Var2.f37989i1;
                        if (f11 < 0.0f) {
                            jd1Var2.f37989i1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = jd1Var2.Q0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(jd1Var2.f37989i1);
                }
                org.telegram.ui.ActionBar.k6.p1(true);
                jd1Var2.Y0(2, false);
                return;
            default:
                jd1 jd1Var3 = this.f43007b;
                org.telegram.ui.ActionBar.i6 i6Var3 = jd1Var3.f38008s;
                if (i6Var3.f21476j == 4294967296L) {
                    i6Var3.f21476j = 0L;
                    i6Var3.f21477k = 0L;
                    i6Var3.f21478l = 0L;
                    i6Var3.f21479m = 0L;
                    jd1Var3.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                jd1Var3.v = true;
                org.telegram.ui.ActionBar.k6.p1(true);
                jd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
