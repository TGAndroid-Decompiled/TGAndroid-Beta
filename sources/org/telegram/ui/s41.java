package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s41 extends org.telegram.ui.Components.lm0 {
    public final Context f39971c;

    public s41(Context context) {
        this.f39971c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 1) {
            si.a aVar = si.e.d;
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
        si.a aVar = si.e.d;
        aVar.a();
        boolean z11 = aVar.d;
        int i11 = b1Var.f44841f;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) b1Var.f44838a;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            m4Var.setText(string3);
        } else if (i11 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) b1Var.f44838a;
            if (i10 != 1 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            w8Var.setEnabled(z10);
            if (i10 == 1) {
                w8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z11, false);
                return;
            }
            String string4 = LocaleController.getString(R.string.RoundVideoCompositionEnabled);
            si.a aVar2 = si.e.f45489i;
            aVar2.a();
            w8Var.f(string4, aVar2.d, false);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) b1Var.f44838a;
            caVar.setEnabled(z11);
            if (i10 == 2) {
                caVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a1.g.n(((li.s0) si.e.e.a()).f14956a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string5 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                li.o0 o0Var = (li.o0) si.e.f45487f.a();
                if (o0Var == li.o0.f14934a) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (o0Var == li.o0.f14935b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                caVar.c(string5, string2, false, true);
            } else if (i10 == 4) {
                caVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a1.g.n(((li.p0) si.e.f45488g.a()).f14942a, " FPS", new StringBuilder()), false, true);
            } else {
                caVar.c(LocaleController.getString(R.string.RoundVideoBitrate), t41.U(si.e.h.a()), false, false);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) b1Var.f44838a;
            if (i10 == 6) {
                string = LocaleController.getString(R.string.RoundVideoGeneralInfo);
            } else {
                string = LocaleController.getString(R.string.RoundVideoCompositionInfo);
            }
            e9Var.setText(string);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ca caVar;
        Context context = this.f39971c;
        if (i10 == 0) {
            caVar = new org.telegram.ui.Cells.m4(context);
        } else if (i10 == 1) {
            caVar = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ca caVar2 = new org.telegram.ui.Cells.ca(context);
            caVar2.setCanDisable(true);
            caVar = caVar2;
        } else {
            caVar = new org.telegram.ui.Cells.e9(context);
        }
        caVar.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(caVar);
    }
}
