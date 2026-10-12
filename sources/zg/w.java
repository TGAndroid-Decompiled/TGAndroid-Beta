package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
import org.telegram.ui.n71;
import org.telegram.ui.w61;
public final class w extends n71 {
    public final nl0 f54909d2;
    public final m2 f54910e2;
    public final a0 f54911f2;

    public w(a0 a0Var, m2 m2Var, Context context, int i10, boolean z10, c6 c6Var, nl0 nl0Var, m2 m2Var2) {
        super(m2Var, context, false, null, i10, z10, c6Var, 16);
        this.f54911f2 = a0Var;
        this.f54909d2 = nl0Var;
        this.f54910e2 = m2Var2;
    }

    @Override
    public final void m() {
        this.f54911f2.f54681a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        xh.m mVar = this.f54911f2.f54683c;
        nl0 nl0Var = this.f54909d2;
        m2 m2Var = this.f54910e2;
        if (m2Var != null && !nl0Var.A0 && nl0Var.getWindowType() != 13 && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
            try {
                mVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new zc(mVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new yh.f0(this, 15)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                s5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f19809id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f54850g = longValue;
            obj.h = longValue;
            nl0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(mVar);
        }
    }

    @Override
    public final void q() {
        a0 a0Var = this.f54911f2;
        if (!a0Var.v) {
            a0Var.v = true;
            if (!a0Var.d) {
                a0Var.f54682b.updateViewLayout(a0Var.f54683c, a0Var.b(true));
            }
            m2 m2Var = this.f54910e2;
            if (m2Var instanceof eo) {
                ((eo) m2Var).U9();
            }
            nl0 nl0Var = this.f54909d2;
            if (nl0Var.getDelegate() != null) {
                nl0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(w61 w61Var, n0 n0Var) {
        this.f54909d2.l(w61Var, n0Var, false);
        AndroidUtilities.hideKeyboard(this.f54911f2.f54683c);
    }

    @Override
    public final boolean u() {
        nl0 nl0Var = this.f54909d2;
        if (nl0Var.getDelegate() != null) {
            return nl0Var.getDelegate().k();
        }
        return false;
    }
}
