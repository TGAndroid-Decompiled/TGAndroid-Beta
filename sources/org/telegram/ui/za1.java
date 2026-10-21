package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class za1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.yl0, org.telegram.ui.Components.g91, org.telegram.ui.ActionBar.a2 {
    public final int f43705a;
    public final kc1 f43706b;

    public za1(kc1 kc1Var, int i10) {
        this.f43705a = i10;
        this.f43706b = kc1Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            kc1 kc1Var = this.f43706b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
                    kc1Var.Y0(3, true);
                    return;
                } else {
                    kc1Var.Y0(1, true);
                    return;
                }
            }
            kc1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kc1 kc1Var = this.f43706b;
        if (!(kc1Var.B1 instanceof sh1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                kb1 kb1Var = kc1Var.f38517a;
                AndroidUtilities.calcDrawableColor(drawable);
                kb1Var.b(kc1Var.P0(drawable), drawable, Float.valueOf(kc1Var.l1));
                if (!z11 && kc1Var.F1 && kc1Var.f38577w1 == null) {
                    kc1Var.f38579x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    kc1Var.i1();
                    kc1Var.f38579x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                kc1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        kc1 kc1Var = this.f43706b;
        if (!kc1Var.E1) {
            return;
        }
        kc1Var.f38579x0.getBackground();
        float f7 = 1.0f;
        if (kc1Var.B0 != null) {
            f7 = (kc1Var.f38579x0.getScaleX() - 1.0f) / (kc1Var.f38583y1 - 1.0f);
        }
        kc1Var.f38579x0.setTranslationX(i10 * f7);
        kc1Var.f38579x0.setTranslationY(i11 * f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f43705a) {
            case 3:
                this.f43706b.f38567s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f43706b.O0(false);
                return;
            case 5:
                kc1 kc1Var = this.f43706b;
                org.telegram.ui.ActionBar.f6 f6Var = kc1Var.f38566s;
                if (f6Var.f20838j == 4294967296L) {
                    f6Var.f20838j = 0L;
                    f6Var.f20839k = 0L;
                    f6Var.f20840l = 0L;
                    f6Var.f20841m = 0L;
                    kc1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                kc1Var.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                kc1Var.Y0(2, false);
                return;
            case 6:
                kc1 kc1Var2 = this.f43706b;
                org.telegram.ui.ActionBar.f6 f6Var2 = kc1Var2.f38566s;
                if (org.telegram.ui.ActionBar.h6.a1() && org.telegram.ui.ActionBar.h6.I.f20893i0.d != 0) {
                    org.telegram.ui.ActionBar.a6 a6Var = f6Var2.f20852y;
                    f6Var2.f20838j = a6Var.d;
                    f6Var2.f20839k = a6Var.e;
                    f6Var2.f20840l = a6Var.f20620f;
                    f6Var2.f20841m = a6Var.f20621g;
                    f6Var2.f20842n = a6Var.h;
                    String str = a6Var.f20619c;
                    f6Var2.f20843o = str;
                    float f7 = a6Var.f20624k;
                    f6Var2.f20844p = f7;
                    kc1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = kc1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) kc1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.f20843o.equals(tL_wallPaper.slug)) {
                                    kc1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        kc1Var2.W0 = null;
                    }
                    kc1Var2.v = true;
                    org.telegram.ui.Components.f91 f91Var = kc1Var2.J0[1];
                    if (kc1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f91Var.a(z10, true);
                    kc1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                Drawable background = kc1Var2.f38579x0.getBackground();
                if (background instanceof org.telegram.ui.Components.wc0) {
                    org.telegram.ui.Components.wc0 wc0Var = (org.telegram.ui.Components.wc0) background;
                    wc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (kc1Var2.l1 < 0.0f) {
                            kc1Var2.f38579x0.getImageReceiver().setGradientBitmap(wc0Var.f32076k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = kc1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = kc1Var2.l1;
                        if (f10 < 0.0f) {
                            kc1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = kc1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(kc1Var2.l1);
                }
                org.telegram.ui.ActionBar.h6.q1(true);
                kc1Var2.Y0(2, false);
                return;
            default:
                kc1 kc1Var3 = this.f43706b;
                org.telegram.ui.ActionBar.f6 f6Var3 = kc1Var3.f38566s;
                if (f6Var3.f20838j == 4294967296L) {
                    f6Var3.f20838j = 0L;
                    f6Var3.f20839k = 0L;
                    f6Var3.f20840l = 0L;
                    f6Var3.f20841m = 0L;
                    kc1Var3.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                kc1Var3.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                kc1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
