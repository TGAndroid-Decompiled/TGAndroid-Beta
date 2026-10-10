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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.k71;
import org.telegram.ui.t61;
import org.telegram.ui.zn;
public final class w extends k71 {
    public final ll0 f54721d2;
    public final n2 f54722e2;
    public final a0 f54723f2;

    public w(a0 a0Var, n2 n2Var, Context context, int i10, boolean z10, e6 e6Var, ll0 ll0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, e6Var, 16);
        this.f54723f2 = a0Var;
        this.f54721d2 = ll0Var;
        this.f54722e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f54723f2.f54493a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        xh.m mVar = this.f54723f2.f54495c;
        ll0 ll0Var = this.f54721d2;
        n2 n2Var = this.f54722e2;
        if (n2Var != null && !ll0Var.A0 && ll0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                mVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new ad(mVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new yh.f0(this, 15)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                s5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f20048id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f54662g = longValue;
            obj.h = longValue;
            ll0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(mVar);
        }
    }

    @Override
    public final void q() {
        a0 a0Var = this.f54723f2;
        if (!a0Var.v) {
            a0Var.v = true;
            if (!a0Var.d) {
                a0Var.f54494b.updateViewLayout(a0Var.f54495c, a0Var.b(true));
            }
            n2 n2Var = this.f54722e2;
            if (n2Var instanceof zn) {
                ((zn) n2Var).U9();
            }
            ll0 ll0Var = this.f54721d2;
            if (ll0Var.getDelegate() != null) {
                ll0Var.getDelegate().q();
            }
        }
    }

    @Override
    public final void r(t61 t61Var, n0 n0Var) {
        this.f54721d2.l(t61Var, n0Var, false);
        AndroidUtilities.hideKeyboard(this.f54723f2.f54495c);
    }

    @Override
    public final boolean u() {
        ll0 ll0Var = this.f54721d2;
        if (ll0Var.getDelegate() != null) {
            return ll0Var.getDelegate().q();
        }
        return false;
    }
}
