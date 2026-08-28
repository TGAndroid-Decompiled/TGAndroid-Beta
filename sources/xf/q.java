package xf;

import android.view.View;
import gh.x9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e71;
public final class q extends e71 {
    public final x9 f49309a;

    public q(x9 x9Var) {
        this.f49309a = x9Var;
    }

    @Override
    public final View d(int i9) {
        x9 x9Var = this.f49309a;
        if (i9 != 1) {
            if (i9 != 2) {
                return (t) x9Var.f9186b;
            }
            return (w) x9Var.d;
        }
        return (s) x9Var.f9187c;
    }

    @Override
    public final int e() {
        return 3;
    }

    @Override
    public final CharSequence g(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                return LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase();
            }
            return LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase();
        }
        return LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override
    public final int h(int i9) {
        return i9;
    }

    @Override
    public final void b(View view, int i9, int i10) {
    }
}
