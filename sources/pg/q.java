package pg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n81;
public final class q extends n81 {
    public final ai.d1 f41187a;

    public q(ai.d1 d1Var) {
        this.f41187a = d1Var;
    }

    @Override
    public final View d(int i10) {
        ai.d1 d1Var = this.f41187a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (t) d1Var.f692b;
            }
            return (w) d1Var.d;
        }
        return (s) d1Var.f693c;
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
