package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class rc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bm0, org.telegram.ui.Components.n91, org.telegram.ui.ActionBar.z1 {
    public final int f39475a;
    public final ce1 f39476b;

    public rc1(ce1 ce1Var, int i10) {
        this.f39475a = i10;
        this.f39476b = ce1Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            ce1 ce1Var = this.f39476b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
                    ce1Var.Y0(3, true);
                    return;
                } else {
                    ce1Var.Y0(1, true);
                    return;
                }
            }
            ce1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ce1 ce1Var = this.f39476b;
        if (!(ce1Var.B1 instanceof oj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                cd1 cd1Var = ce1Var.f34577a;
                AndroidUtilities.calcDrawableColor(drawable);
                cd1Var.b(ce1Var.P0(drawable), drawable, Float.valueOf(ce1Var.l1));
                if (!z11 && ce1Var.F1 && ce1Var.f34637w1 == null) {
                    ce1Var.f34639x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    ce1Var.i1();
                    ce1Var.f34639x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                ce1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        ce1 ce1Var = this.f39476b;
        if (!ce1Var.E1) {
            return;
        }
        ce1Var.f34639x0.getBackground();
        float f7 = 1.0f;
        if (ce1Var.B0 != null) {
            f7 = (ce1Var.f34639x0.getScaleX() - 1.0f) / (ce1Var.f34643y1 - 1.0f);
        }
        ce1Var.f34639x0.setTranslationX(i10 * f7);
        ce1Var.f34639x0.setTranslationY(i11 * f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10;
        switch (this.f39475a) {
            case 3:
                this.f39476b.f34627s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f39476b.O0(false);
                return;
            case 5:
                ce1 ce1Var = this.f39476b;
                org.telegram.ui.ActionBar.e6 e6Var = ce1Var.f34626s;
                if (e6Var.f19451j == 4294967296L) {
                    e6Var.f19451j = 0L;
                    e6Var.f19452k = 0L;
                    e6Var.f19453l = 0L;
                    e6Var.f19454m = 0L;
                    ce1Var.m1(false);
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                }
                ce1Var.v = true;
                org.telegram.ui.ActionBar.g6.q1(true);
                ce1Var.Y0(2, false);
                return;
            case 6:
                ce1 ce1Var2 = this.f39476b;
                org.telegram.ui.ActionBar.e6 e6Var2 = ce1Var2.f34626s;
                if (org.telegram.ui.ActionBar.g6.a1() && org.telegram.ui.ActionBar.g6.I.f19503i0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = e6Var2.f19465y;
                    e6Var2.f19451j = z5Var.d;
                    e6Var2.f19452k = z5Var.e;
                    e6Var2.f19453l = z5Var.f20550f;
                    e6Var2.f19454m = z5Var.f20551g;
                    e6Var2.f19455n = z5Var.h;
                    String str = z5Var.f20549c;
                    e6Var2.f19456o = str;
                    float f7 = z5Var.f20554k;
                    e6Var2.f19457p = f7;
                    ce1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = ce1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) ce1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && e6Var2.f19456o.equals(tL_wallPaper.slug)) {
                                    ce1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        ce1Var2.W0 = null;
                    }
                    ce1Var2.v = true;
                    org.telegram.ui.Components.m91 m91Var = ce1Var2.J0[1];
                    if (ce1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m91Var.a(z10, true);
                    ce1Var2.m1(false);
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                }
                Drawable background = ce1Var2.f34639x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cd0) {
                    org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) background;
                    cd0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        if (ce1Var2.l1 < 0.0f) {
                            ce1Var2.f34639x0.getImageReceiver().setGradientBitmap(cd0Var.f23700k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = ce1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = ce1Var2.l1;
                        if (f10 < 0.0f) {
                            ce1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = ce1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(ce1Var2.l1);
                }
                org.telegram.ui.ActionBar.g6.q1(true);
                ce1Var2.Y0(2, false);
                return;
            default:
                ce1 ce1Var3 = this.f39476b;
                org.telegram.ui.ActionBar.e6 e6Var3 = ce1Var3.f34626s;
                if (e6Var3.f19451j == 4294967296L) {
                    e6Var3.f19451j = 0L;
                    e6Var3.f19452k = 0L;
                    e6Var3.f19453l = 0L;
                    e6Var3.f19454m = 0L;
                    ce1Var3.m1(false);
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                }
                ce1Var3.v = true;
                org.telegram.ui.ActionBar.g6.q1(true);
                ce1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
