package ph;

import android.content.Context;
import android.view.View;
import oh.d6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.w31;
public final class a extends e81 {
    public final Context f44371a;
    public final or0 f44372b;

    public a(or0 or0Var, Context context) {
        this.f44372b = or0Var;
        this.f44371a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        d6 d6Var;
        l lVar = (l) view;
        or0 or0Var = this.f44372b;
        if (i10 == 0) {
            d6Var = or0Var.f44409e;
        } else {
            d6Var = (d6) or0Var.f44410f.get(i10 - 1);
        }
        d6Var.H(null);
        lVar.setList(d6Var);
        lVar.setVisibleHeight(or0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new l(this.f44372b, this.f44371a);
    }

    @Override
    public final int e() {
        return this.f44372b.f44410f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((d6) this.f44372b.f44410f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = w31.D(((d6) this.f44372b.f44410f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
