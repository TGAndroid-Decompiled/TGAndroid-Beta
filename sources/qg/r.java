package qg;

import ai.uc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.v81;
public final class r extends v81 {
    public final uc f44597a;

    public r(uc ucVar) {
        this.f44597a = ucVar;
    }

    @Override
    public final View d(int i10) {
        uc ucVar = this.f44597a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (u) ucVar.f2277b;
            }
            return (x) ucVar.d;
        }
        return (t) ucVar.f2278c;
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
