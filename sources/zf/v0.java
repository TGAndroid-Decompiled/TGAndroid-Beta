package zf;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ka;
import org.telegram.ui.gw0;
public final class v0 implements m2.e {
    public final ka f50731a;
    public final x0 f50732b;

    public v0(x0 x0Var, ka kaVar) {
        this.f50732b = x0Var;
        this.f50731a = kaVar;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        x0 x0Var = this.f50732b;
        u0 u0Var = x0Var.f50776n;
        ArrayList arrayList = x0Var.d;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i11);
            if (!x0Var.f50779w || !(w0Var.f50762f instanceof n0)) {
                int i12 = w0Var.f50758a;
                l0 l0Var = w0Var.f50761e;
                if (i12 == x0Var.C) {
                    f10 = (-w0Var.getMeasuredWidth()) * x0Var.E;
                    l0Var.setOffset(f10);
                } else if (i12 == x0Var.D) {
                    f10 = ((-w0Var.getMeasuredWidth()) * x0Var.E) + w0Var.getMeasuredWidth();
                    l0Var.setOffset(f10);
                } else {
                    l0Var.setOffset(w0Var.getMeasuredWidth());
                }
            }
            if (w0Var.f50762f instanceof n0) {
                w0Var.setTranslationX(-f10);
                w0Var.f50759b.setTranslationX(f10);
                w0Var.f50760c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = x0Var.C;
        if (i13 >= 0 && i13 < arrayList.size() && ((i10 = ((gw0) arrayList.get(x0Var.C)).f38610a) == 0 || i10 == 14 || i10 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i14 = x0Var.D;
        if (i14 >= 0 && i14 < arrayList.size() && ((i9 = ((gw0) arrayList.get(x0Var.D)).f38610a) == 0 || i9 == 14 || i9 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            x0Var.f50775f = 1.0f;
            float f11 = x0Var.E;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            x0Var.f50774e = f11;
            x0Var.h = true;
        } else if (z10) {
            float f12 = 1.0f - x0Var.E;
            x0Var.f50774e = f12;
            x0Var.f50775f = f12;
            x0Var.h = true;
        } else if (z11) {
            float f13 = x0Var.E;
            x0Var.f50774e = f13;
            x0Var.f50775f = f13;
            x0Var.h = false;
        } else {
            x0Var.f50774e = 0.0f;
            x0Var.f50775f = 0.0f;
            x0Var.h = true;
        }
        int i15 = (int) ((1.0f - x0Var.f50774e) * 255.0f);
        if (i15 != x0Var.G) {
            x0Var.G = i15;
            x0Var.f50777r.invalidate();
            AndroidUtilities.runOnUIThread(new pf.o1(this, 28));
        }
    }

    @Override
    public final void b(int i9) {
        x0 x0Var = this.f50732b;
        ArrayList arrayList = x0Var.d;
        if (((gw0) arrayList.get(i9)).f38610a == 0) {
            x0Var.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            x0Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i9)).f38610a == 14) {
            x0Var.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            x0Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i9)).f38610a == 40) {
            x0Var.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            x0Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i9)).f38610a == 28) {
            x0Var.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            x0Var.J.requestLayout();
        }
        a();
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        int i11;
        ka kaVar = this.f50731a;
        kaVar.f30044b = f10;
        kaVar.f30045c = i9;
        kaVar.invalidate();
        x0 x0Var = this.f50732b;
        x0Var.C = i9;
        if (i10 > 0) {
            i11 = i9 + 1;
        } else {
            i11 = i9 - 1;
        }
        x0Var.D = i11;
        x0Var.E = f10;
        a();
    }

    @Override
    public final void d(int i9) {
    }
}
