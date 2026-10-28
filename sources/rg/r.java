package rg;

import android.view.View;
import bi.mc;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n91;
public final class r extends n91 {
    public final mc f47563a;

    public r(mc mcVar) {
        this.f47563a = mcVar;
    }

    @Override
    public final View d(int i10) {
        mc mcVar = this.f47563a;
        if (i10 != 1) {
            if (i10 != 2) {
                return (u) mcVar.f5111b;
            }
            return (x) mcVar.d;
        }
        return (t) mcVar.f5112c;
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
