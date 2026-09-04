package qg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
public final class q extends a81 {
    public final bi.v0 f44517a;

    public q(bi.v0 v0Var) {
        this.f44517a = v0Var;
    }

    @Override
    public final View d(int i10) {
        bi.v0 v0Var = this.f44517a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (t) v0Var.f3883b;
            }
            return (w) v0Var.d;
        }
        return (s) v0Var.f3884c;
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
