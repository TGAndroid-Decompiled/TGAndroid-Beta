package tg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sa;
import org.telegram.ui.ww0;
public final class w0 implements a5.i {
    public final sa f49088a;
    public final y0 f49089b;

    public w0(y0 y0Var, sa saVar) {
        this.f49089b = y0Var;
        this.f49088a = saVar;
    }

    @Override
    public final void a(int i10) {
        y0 y0Var = this.f49089b;
        ArrayList arrayList = y0Var.d;
        if (((ww0) arrayList.get(i10)).f45566a == 0) {
            y0Var.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            y0Var.N.requestLayout();
        } else if (((ww0) arrayList.get(i10)).f45566a == 14) {
            y0Var.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            y0Var.N.requestLayout();
        } else if (((ww0) arrayList.get(i10)).f45566a == 40) {
            y0Var.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            y0Var.N.requestLayout();
        } else if (((ww0) arrayList.get(i10)).f45566a == 28) {
            y0Var.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            y0Var.N.requestLayout();
        }
        d();
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        sa saVar = this.f49088a;
        saVar.f32495b = f7;
        saVar.f32496c = i10;
        saVar.invalidate();
        y0 y0Var = this.f49089b;
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
        y0 y0Var = this.f49089b;
        v0 v0Var = y0Var.f49130n;
        ArrayList arrayList = y0Var.d;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i12);
            if (!y0Var.f49133w || !(x0Var.f49117f instanceof n0)) {
                int i13 = x0Var.f49114a;
                l0 l0Var = x0Var.e;
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
            if (x0Var.f49117f instanceof n0) {
                x0Var.setTranslationX(-f7);
                x0Var.f49115b.setTranslationX(f7);
                x0Var.f49116c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = y0Var.G;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((ww0) arrayList.get(y0Var.G)).f45566a) == 0 || i11 == 14 || i11 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = y0Var.H;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((ww0) arrayList.get(y0Var.H)).f45566a) == 0 || i10 == 14 || i10 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            y0Var.f49129f = 1.0f;
            float f10 = y0Var.I;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            y0Var.e = f10;
            y0Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - y0Var.I;
            y0Var.e = f11;
            y0Var.f49129f = f11;
            y0Var.h = true;
        } else if (z11) {
            float f12 = y0Var.I;
            y0Var.e = f12;
            y0Var.f49129f = f12;
            y0Var.h = false;
        } else {
            y0Var.e = 0.0f;
            y0Var.f49129f = 0.0f;
            y0Var.h = true;
        }
        int i16 = (int) ((1.0f - y0Var.e) * 255.0f);
        if (i16 != y0Var.K) {
            y0Var.K = i16;
            y0Var.f49131r.invalidate();
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 26));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
