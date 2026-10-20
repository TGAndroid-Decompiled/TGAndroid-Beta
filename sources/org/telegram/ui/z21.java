package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z21 extends org.telegram.ui.Components.im0 {
    public final Context f43619c;

    public z21(Context context) {
        this.f43619c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 1) {
            ti.a aVar = ti.e.d;
            aVar.a();
            if (aVar.d) {
                if (b10 != 2 && b10 != 3 && b10 != 4 && b10 != 5 && b10 != 8) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return 7;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0 && i10 != 7) {
            if (i10 == 1 || i10 == 8) {
                return 1;
            }
            if (i10 != 6 && i10 != 9) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        String string2;
        boolean z10;
        String string3;
        ti.a aVar = ti.e.d;
        aVar.a();
        boolean z11 = aVar.d;
        int i11 = b1Var.f45920f;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) b1Var.f45917a;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            l4Var.setText(string3);
        } else if (i11 == 1) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) b1Var.f45917a;
            if (i10 != 1 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            v8Var.setEnabled(z10);
            if (i10 == 1) {
                v8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z11, false);
                return;
            }
            String string4 = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            ti.a aVar2 = ti.e.f47224i;
            aVar2.a();
            v8Var.f(string4, aVar2.d, false);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) b1Var.f45917a;
            baVar.setEnabled(z11);
            if (i10 == 2) {
                baVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.n(((si.q0) ti.e.e.a()).f46755a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string5 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                si.m0 m0Var = (si.m0) ti.e.f47222f.a();
                if (m0Var == si.m0.f46732a) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (m0Var == si.m0.f46733b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                baVar.c(string5, string2, false, true);
            } else if (i10 == 4) {
                baVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.n(((si.n0) ti.e.f47223g.a()).f46740a, " FPS", new StringBuilder()), false, true);
            } else {
                baVar.c(LocaleController.getString(R.string.RoundVideoBitrate), a31.U(ti.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) b1Var.f45917a;
            if (i10 == 6) {
                string = LocaleController.getString(R.string.RoundVideoGeneralInfo);
            } else {
                string = LocaleController.getString(R.string.RoundVideoCompositionInfo);
            }
            d9Var.setText(string);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ba baVar;
        Context context = this.f43619c;
        if (i10 == 0) {
            baVar = new org.telegram.ui.Cells.l4(context);
        } else if (i10 == 1) {
            baVar = new org.telegram.ui.Cells.v8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context);
            baVar2.setCanDisable(true);
            baVar = baVar2;
        } else {
            baVar = new org.telegram.ui.Cells.d9(context);
        }
        baVar.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(baVar);
    }
}
