package yf;

import android.view.View;
import hh.w9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g71;

public final class q extends g71 {

    public final w9 f50037a;

    public q(w9 w9Var) {
        this.f50037a = w9Var;
    }

    @Override
    public final View d(int i10) {
        w9 w9Var = this.f50037a;
        if (i10 != 1) {
            return i10 != 2 ? (t) w9Var.f10305b : (w) w9Var.d;
        }
        return (s) w9Var.f10306c;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase();
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
