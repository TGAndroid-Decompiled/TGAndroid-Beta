package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.h71;
import org.telegram.ui.q61;
import yh.v3;
import yh.x2;
public final class y extends h71 {
    public final fk0 f49181d2;
    public final n2 f49182e2;
    public final c0 f49183f2;

    public y(c0 c0Var, n2 n2Var, Context context, int i10, boolean z10, e6 e6Var, fk0 fk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, e6Var, 16);
        this.f49183f2 = c0Var;
        this.f49181d2 = fk0Var;
        this.f49182e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f49183f2.f48976a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        v3 v3Var = this.f49183f2.f48978c;
        fk0 fk0Var = this.f49181d2;
        n2 n2Var = this.f49182e2;
        if (n2Var != null && !fk0Var.A0 && fk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                v3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new vc(v3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new x2(this, 10)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                o5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f18115id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49121g = longValue;
            obj.h = longValue;
            fk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(v3Var);
        }
    }

    @Override
    public final void q() {
        c0 c0Var = this.f49183f2;
        if (!c0Var.v) {
            c0Var.v = true;
            if (!c0Var.d) {
                c0Var.f48977b.updateViewLayout(c0Var.f48978c, c0Var.b(true));
            }
            n2 n2Var = this.f49182e2;
            if (n2Var instanceof bo) {
                ((bo) n2Var).P9();
            }
            fk0 fk0Var = this.f49181d2;
            if (fk0Var.getDelegate() != null) {
                fk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(q61 q61Var, p0 p0Var) {
        this.f49181d2.l(q61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f49183f2.f48978c);
    }

    @Override
    public final boolean u() {
        fk0 fk0Var = this.f49181d2;
        if (fk0Var.getDelegate() != null) {
            return fk0Var.getDelegate().k();
        }
        return false;
    }
}
