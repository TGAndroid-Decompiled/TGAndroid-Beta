package rg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ua;
import org.telegram.ui.mx0;
public final class w0 implements z4.e {
    public final ua f47715a;
    public final y0 f47716b;

    public w0(y0 y0Var, ua uaVar) {
        this.f47716b = y0Var;
        this.f47715a = uaVar;
    }

    @Override
    public final void a(int i10) {
        y0 y0Var = this.f47716b;
        ArrayList arrayList = y0Var.d;
        if (((mx0) arrayList.get(i10)).f40143a == 0) {
            y0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            y0Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).f40143a == 14) {
            y0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            y0Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).f40143a == 40) {
            y0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            y0Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).f40143a == 28) {
            y0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            y0Var.N.requestLayout();
        }
        d();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        ua uaVar = this.f47715a;
        uaVar.f31123b = f7;
        uaVar.f31124c = i10;
        uaVar.invalidate();
        y0 y0Var = this.f47716b;
        y0Var.G = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        y0Var.H = i12;
        y0Var.I = f7;
        d();
    }

    public final void d() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        y0 y0Var = this.f47716b;
        v0 v0Var = y0Var.f47739n;
        ArrayList arrayList = y0Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i12);
            if (!y0Var.f47742w || !(x0Var.f47728f instanceof n0)) {
                int i13 = x0Var.f47724a;
                l0 l0Var = x0Var.f47727e;
                if (i13 == y0Var.G) {
                    f7 = (-x0Var.getMeasuredWidth()) * y0Var.I;
                    l0Var.setOffset(f7);
                } else if (i13 == y0Var.H) {
                    f7 = ((-x0Var.getMeasuredWidth()) * y0Var.I) + x0Var.getMeasuredWidth();
                    l0Var.setOffset(f7);
                } else {
                    l0Var.setOffset(x0Var.getMeasuredWidth());
                }
            }
            if (x0Var.f47728f instanceof n0) {
                x0Var.setTranslationX(-f7);
                x0Var.f47725b.setTranslationX(f7);
                x0Var.f47726c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = y0Var.G;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((mx0) arrayList.get(y0Var.G)).f40143a) == 0 || i11 == 14 || i11 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = y0Var.H;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((mx0) arrayList.get(y0Var.H)).f40143a) == 0 || i10 == 14 || i10 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            y0Var.f47738f = 1.0f;
            float f10 = y0Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            y0Var.f47737e = f10;
            y0Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - y0Var.I;
            y0Var.f47737e = f11;
            y0Var.f47738f = f11;
            y0Var.h = true;
        } else if (z11) {
            float f12 = y0Var.I;
            y0Var.f47737e = f12;
            y0Var.f47738f = f12;
            y0Var.h = false;
        } else {
            y0Var.f47737e = 0.0f;
            y0Var.f47738f = 0.0f;
            y0Var.h = true;
        }
        int i16 = (int) ((1.0f - y0Var.f47737e) * 255.0f);
        if (i16 != y0Var.K) {
            y0Var.K = i16;
            y0Var.f47740r.invalidate();
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(this, 27));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
