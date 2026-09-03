package ph;

import android.content.Context;
import android.view.View;
import oh.d6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.v31;
public final class a extends d81 {
    public final Context f44402a;
    public final nr0 f44403b;

    public a(nr0 nr0Var, Context context) {
        this.f44403b = nr0Var;
        this.f44402a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        d6 d6Var;
        l lVar = (l) view;
        nr0 nr0Var = this.f44403b;
        if (i10 == 0) {
            d6Var = nr0Var.f44440e;
        } else {
            d6Var = (d6) nr0Var.f44441f.get(i10 - 1);
        }
        d6Var.H(null);
        lVar.setList(d6Var);
        lVar.setVisibleHeight(nr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new l(this.f44403b, this.f44402a);
    }

    @Override
    public final int e() {
        return this.f44403b.f44441f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((d6) this.f44403b.f44441f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = v31.D(((d6) this.f44403b.f44441f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
