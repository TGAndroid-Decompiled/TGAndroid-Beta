package qg;

import ai.vc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
public final class r extends d91 {
    public final vc f45025a;

    public r(vc vcVar) {
        this.f45025a = vcVar;
    }

    @Override
    public final View d(int i10) {
        vc vcVar = this.f45025a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (u) vcVar.f2335b;
            }
            return (x) vcVar.d;
        }
        return (t) vcVar.f2336c;
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
