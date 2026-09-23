package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.i61;
import org.telegram.ui.xn;
import org.telegram.ui.z61;
import yh.u3;
import yh.w2;
public final class y extends z61 {
    public final gk0 f49132d2;
    public final n2 f49133e2;
    public final c0 f49134f2;

    public y(c0 c0Var, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, gk0 gk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f49134f2 = c0Var;
        this.f49132d2 = gk0Var;
        this.f49133e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f49134f2.f48927a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        u3 u3Var = this.f49134f2.f48929c;
        gk0 gk0Var = this.f49132d2;
        n2 n2Var = this.f49133e2;
        if (n2Var != null && !gk0Var.A0 && gk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                u3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(u3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new w2(this, 10)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                q5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f18089id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49072g = longValue;
            obj.h = longValue;
            gk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(u3Var);
        }
    }

    @Override
    public final void q() {
        c0 c0Var = this.f49134f2;
        if (!c0Var.v) {
            c0Var.v = true;
            if (!c0Var.d) {
                c0Var.f48928b.updateViewLayout(c0Var.f48929c, c0Var.b(true));
            }
            n2 n2Var = this.f49133e2;
            if (n2Var instanceof xn) {
                ((xn) n2Var).P9();
            }
            gk0 gk0Var = this.f49132d2;
            if (gk0Var.getDelegate() != null) {
                gk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(i61 i61Var, p0 p0Var) {
        this.f49132d2.l(i61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f49134f2.f48929c);
    }

    @Override
    public final boolean u() {
        gk0 gk0Var = this.f49132d2;
        if (gk0Var.getDelegate() != null) {
            return gk0Var.getDelegate().k();
        }
        return false;
    }
}
