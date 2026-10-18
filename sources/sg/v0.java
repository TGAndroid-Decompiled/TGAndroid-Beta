package sg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sa;
import org.telegram.ui.qw0;
public final class v0 implements z4.e {
    public final sa f46488a;
    public final x0 f46489b;

    public v0(x0 x0Var, sa saVar) {
        this.f46489b = x0Var;
        this.f46488a = saVar;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        int i12;
        sa saVar = this.f46488a;
        saVar.f30230b = f7;
        saVar.f30231c = i10;
        saVar.invalidate();
        x0 x0Var = this.f46489b;
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

    @Override
    public final void b(int i10) {
        x0 x0Var = this.f46489b;
        ArrayList arrayList = x0Var.d;
        if (((qw0) arrayList.get(i10)).f40533a == 0) {
            x0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            x0Var.N.requestLayout();
        } else if (((qw0) arrayList.get(i10)).f40533a == 14) {
            x0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            x0Var.N.requestLayout();
        } else if (((qw0) arrayList.get(i10)).f40533a == 40) {
            x0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            x0Var.N.requestLayout();
        } else if (((qw0) arrayList.get(i10)).f40533a == 28) {
            x0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            x0Var.N.requestLayout();
        }
        d();
    }

    public final void d() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        x0 x0Var = this.f46489b;
        u0 u0Var = x0Var.f46528n;
        ArrayList arrayList = x0Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i12);
            if (!x0Var.f46531w || !(w0Var.f46517f instanceof n0)) {
                int i13 = w0Var.f46514a;
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
            if (w0Var.f46517f instanceof n0) {
                w0Var.setTranslationX(-f7);
                w0Var.f46515b.setTranslationX(f7);
                w0Var.f46516c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = x0Var.G;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((qw0) arrayList.get(x0Var.G)).f40533a) == 0 || i11 == 14 || i11 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = x0Var.H;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((qw0) arrayList.get(x0Var.H)).f40533a) == 0 || i10 == 14 || i10 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            x0Var.f46527f = 1.0f;
            float f10 = x0Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            x0Var.e = f10;
            x0Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - x0Var.I;
            x0Var.e = f11;
            x0Var.f46527f = f11;
            x0Var.h = true;
        } else if (z11) {
            float f12 = x0Var.I;
            x0Var.e = f12;
            x0Var.f46527f = f12;
            x0Var.h = false;
        } else {
            x0Var.e = 0.0f;
            x0Var.f46527f = 0.0f;
            x0Var.h = true;
        }
        int i16 = (int) ((1.0f - x0Var.e) * 255.0f);
        if (i16 != x0Var.K) {
            x0Var.K = i16;
            x0Var.f46529r.invalidate();
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(this, 23));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
