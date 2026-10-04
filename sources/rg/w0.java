package rg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ta;
import org.telegram.ui.ex0;
public final class w0 implements z4.e {
    public final ta f46331a;
    public final y0 f46332b;

    public w0(y0 y0Var, ta taVar) {
        this.f46332b = y0Var;
        this.f46331a = taVar;
    }

    @Override
    public final void a(int i10) {
        y0 y0Var = this.f46332b;
        ArrayList arrayList = y0Var.d;
        if (((ex0) arrayList.get(i10)).f36107a == 0) {
            y0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            y0Var.N.requestLayout();
        } else if (((ex0) arrayList.get(i10)).f36107a == 14) {
            y0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            y0Var.N.requestLayout();
        } else if (((ex0) arrayList.get(i10)).f36107a == 40) {
            y0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            y0Var.N.requestLayout();
        } else if (((ex0) arrayList.get(i10)).f36107a == 28) {
            y0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            y0Var.N.requestLayout();
        }
        d();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        ta taVar = this.f46331a;
        taVar.f31000b = f7;
        taVar.f31001c = i10;
        taVar.invalidate();
        y0 y0Var = this.f46332b;
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
        y0 y0Var = this.f46332b;
        v0 v0Var = y0Var.f46387n;
        ArrayList arrayList = y0Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i12);
            if (!y0Var.f46390w || !(x0Var.f46356f instanceof o0)) {
                int i13 = x0Var.f46352a;
                m0 m0Var = x0Var.f46355e;
                if (i13 == y0Var.G) {
                    f7 = (-x0Var.getMeasuredWidth()) * y0Var.I;
                    m0Var.setOffset(f7);
                } else if (i13 == y0Var.H) {
                    f7 = ((-x0Var.getMeasuredWidth()) * y0Var.I) + x0Var.getMeasuredWidth();
                    m0Var.setOffset(f7);
                } else {
                    m0Var.setOffset(x0Var.getMeasuredWidth());
                }
            }
            if (x0Var.f46356f instanceof o0) {
                x0Var.setTranslationX(-f7);
                x0Var.f46353b.setTranslationX(f7);
                x0Var.f46354c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = y0Var.G;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((ex0) arrayList.get(y0Var.G)).f36107a) == 0 || i11 == 14 || i11 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = y0Var.H;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((ex0) arrayList.get(y0Var.H)).f36107a) == 0 || i10 == 14 || i10 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            y0Var.f46386f = 1.0f;
            float f10 = y0Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            y0Var.f46385e = f10;
            y0Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - y0Var.I;
            y0Var.f46385e = f11;
            y0Var.f46386f = f11;
            y0Var.h = true;
        } else if (z11) {
            float f12 = y0Var.I;
            y0Var.f46385e = f12;
            y0Var.f46386f = f12;
            y0Var.h = false;
        } else {
            y0Var.f46385e = 0.0f;
            y0Var.f46386f = 0.0f;
            y0Var.h = true;
        }
        int i16 = (int) ((1.0f - y0Var.f46385e) * 255.0f);
        if (i16 != y0Var.K) {
            y0Var.K = i16;
            y0Var.f46388r.invalidate();
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 28));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
