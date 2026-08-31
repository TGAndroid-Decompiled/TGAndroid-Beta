package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class rb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.kl0, org.telegram.ui.Components.o81, org.telegram.ui.ActionBar.c2 {
    public final int f40917a;
    public final ed1 f40918b;

    public rb1(ed1 ed1Var, int i10) {
        this.f40917a = i10;
        this.f40918b = ed1Var;
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
            ed1 ed1Var = this.f40918b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    ed1Var.Y0(3, true);
                    return;
                } else {
                    ed1Var.Y0(1, true);
                    return;
                }
            }
            ed1Var.Y0(2, true);
        }
    }

    @Override
    public void d(int i10, int i11) {
        ed1 ed1Var = this.f40918b;
        if (!ed1Var.B1) {
            return;
        }
        ed1Var.f36538u0.getBackground();
        float f10 = 1.0f;
        if (ed1Var.f36549y0 != null) {
            f10 = (ed1Var.f36538u0.getScaleX() - 1.0f) / (ed1Var.f36541v1 - 1.0f);
        }
        ed1Var.f36538u0.setTranslationX(i10 * f10);
        ed1Var.f36538u0.setTranslationY(i11 * f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ed1 ed1Var = this.f40918b;
        if (!(ed1Var.f36550y1 instanceof pi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z4 && drawable != null) {
                dc1 dc1Var = ed1Var.f36486a;
                AndroidUtilities.calcDrawableColor(drawable);
                dc1Var.b(ed1Var.P0(drawable), drawable, Float.valueOf(ed1Var.f36514i1));
                if (!z10 && ed1Var.C1 && ed1Var.f36537t1 == null) {
                    ed1Var.f36538u0.getImageReceiver().setCrossfadeWithOldImage(false);
                    ed1Var.i1();
                    ed1Var.f36538u0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                ed1Var.V0();
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
        switch (this.f40917a) {
            case 3:
                this.f40918b.f36526p0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f40918b.O0(false);
                return;
            case 5:
                ed1 ed1Var = this.f40918b;
                org.telegram.ui.ActionBar.i6 i6Var = ed1Var.f36533s;
                if (i6Var.f21474j == 4294967296L) {
                    i6Var.f21474j = 0L;
                    i6Var.f21475k = 0L;
                    i6Var.f21476l = 0L;
                    i6Var.f21477m = 0L;
                    ed1Var.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                ed1Var.v = true;
                org.telegram.ui.ActionBar.k6.p1(true);
                ed1Var.Y0(2, false);
                return;
            case 6:
                ed1 ed1Var2 = this.f40918b;
                org.telegram.ui.ActionBar.i6 i6Var2 = ed1Var2.f36533s;
                if (org.telegram.ui.ActionBar.k6.Z0() && org.telegram.ui.ActionBar.k6.I.f21513f0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.f21488y;
                    i6Var2.f21474j = d6Var.d;
                    i6Var2.f21475k = d6Var.f21285e;
                    i6Var2.f21476l = d6Var.f21286f;
                    i6Var2.f21477m = d6Var.f21287g;
                    i6Var2.f21478n = d6Var.h;
                    String str = d6Var.f21284c;
                    i6Var2.f21479o = str;
                    float f10 = d6Var.f21290k;
                    i6Var2.f21480p = f10;
                    ed1Var2.f36514i1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = ed1Var2.R0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) ed1Var2.R0.get(i11);
                                if (tL_wallPaper.pattern && i6Var2.f21479o.equals(tL_wallPaper.slug)) {
                                    ed1Var2.T0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        ed1Var2.T0 = null;
                    }
                    ed1Var2.v = true;
                    org.telegram.ui.Components.n81 n81Var = ed1Var2.G0[1];
                    if (ed1Var2.T0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    n81Var.a(z4, true);
                    ed1Var2.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                Drawable background = ed1Var2.f36538u0.getBackground();
                if (background instanceof org.telegram.ui.Components.fc0) {
                    org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) background;
                    fc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (ed1Var2.f36514i1 < 0.0f) {
                            ed1Var2.f36538u0.getImageReceiver().setGradientBitmap(fc0Var.f26879k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = ed1Var2.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = ed1Var2.f36514i1;
                        if (f11 < 0.0f) {
                            ed1Var2.f36514i1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = ed1Var2.Q0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(ed1Var2.f36514i1);
                }
                org.telegram.ui.ActionBar.k6.p1(true);
                ed1Var2.Y0(2, false);
                return;
            default:
                ed1 ed1Var3 = this.f40918b;
                org.telegram.ui.ActionBar.i6 i6Var3 = ed1Var3.f36533s;
                if (i6Var3.f21474j == 4294967296L) {
                    i6Var3.f21474j = 0L;
                    i6Var3.f21475k = 0L;
                    i6Var3.f21476l = 0L;
                    i6Var3.f21477m = 0L;
                    ed1Var3.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                ed1Var3.v = true;
                org.telegram.ui.ActionBar.k6.p1(true);
                ed1Var3.Y0(2, false);
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
