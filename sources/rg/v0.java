package rg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qa;
import org.telegram.ui.mx0;
public final class v0 implements z4.e {
    public final qa f42542a;
    public final x0 f42543b;

    public v0(x0 x0Var, qa qaVar) {
        this.f42543b = x0Var;
        this.f42542a = qaVar;
    }

    @Override
    public final void a(int i10) {
        x0 x0Var = this.f42543b;
        ArrayList arrayList = x0Var.d;
        if (((mx0) arrayList.get(i10)).f35903a == 0) {
            x0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            x0Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).f35903a == 14) {
            x0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            x0Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).f35903a == 40) {
            x0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            x0Var.N.requestLayout();
        } else if (((mx0) arrayList.get(i10)).f35903a == 28) {
            x0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            x0Var.N.requestLayout();
        }
        d();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        qa qaVar = this.f42542a;
        qaVar.f27249b = f7;
        qaVar.f27250c = i10;
        qaVar.invalidate();
        x0 x0Var = this.f42543b;
        x0Var.G = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        x0Var.H = i12;
        x0Var.I = f7;
        d();
    }

    public final void d() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        x0 x0Var = this.f42543b;
        u0 u0Var = x0Var.f42562n;
        ArrayList arrayList = x0Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i12);
            if (!x0Var.f42565w || !(w0Var.f42553f instanceof n0)) {
                int i13 = w0Var.f42550a;
                l0 l0Var = w0Var.e;
                if (i13 == x0Var.G) {
                    f7 = (-w0Var.getMeasuredWidth()) * x0Var.I;
                    l0Var.setOffset(f7);
                } else if (i13 == x0Var.H) {
                    f7 = ((-w0Var.getMeasuredWidth()) * x0Var.I) + w0Var.getMeasuredWidth();
                    l0Var.setOffset(f7);
                } else {
                    l0Var.setOffset(w0Var.getMeasuredWidth());
                }
            }
            if (w0Var.f42553f instanceof n0) {
                w0Var.setTranslationX(-f7);
                w0Var.f42551b.setTranslationX(f7);
                w0Var.f42552c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = x0Var.G;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((mx0) arrayList.get(x0Var.G)).f35903a) == 0 || i11 == 14 || i11 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = x0Var.H;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((mx0) arrayList.get(x0Var.H)).f35903a) == 0 || i10 == 14 || i10 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            x0Var.f42561f = 1.0f;
            float f10 = x0Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            x0Var.e = f10;
            x0Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - x0Var.I;
            x0Var.e = f11;
            x0Var.f42561f = f11;
            x0Var.h = true;
        } else if (z11) {
            float f12 = x0Var.I;
            x0Var.e = f12;
            x0Var.f42561f = f12;
            x0Var.h = false;
        } else {
            x0Var.e = 0.0f;
            x0Var.f42561f = 0.0f;
            x0Var.h = true;
        }
        int i16 = (int) ((1.0f - x0Var.e) * 255.0f);
        if (i16 != x0Var.K) {
            x0Var.K = i16;
            x0Var.f42563r.invalidate();
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 27));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
