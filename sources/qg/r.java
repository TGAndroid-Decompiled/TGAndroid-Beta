package qg;

import ai.tc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u81;
public final class r extends u81 {
    public final tc f44626a;

    public r(tc tcVar) {
        this.f44626a = tcVar;
    }

    @Override
    public final View d(int i10) {
        tc tcVar = this.f44626a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (u) tcVar.f2230b;
            }
            return (x) tcVar.d;
        }
        return (t) tcVar.f2231c;
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
