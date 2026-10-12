package qg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;
public final class q extends c91 {
    public final bi.v0 f43520a;

    public q(bi.v0 v0Var) {
        this.f43520a = v0Var;
    }

    @Override
    public final View d(int i10) {
        bi.v0 v0Var = this.f43520a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (t) v0Var.f3847b;
            }
            return (w) v0Var.d;
        }
        return (s) v0Var.f3848c;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase();
            }
            return LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase();
        }
        return LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
