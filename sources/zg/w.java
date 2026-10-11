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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.j71;
import org.telegram.ui.s61;
import org.telegram.ui.zn;
public final class w extends j71 {
    public final ml0 f54764d2;
    public final m2 f54765e2;
    public final a0 f54766f2;

    public w(a0 a0Var, m2 m2Var, Context context, int i10, boolean z10, d6 d6Var, ml0 ml0Var, m2 m2Var2) {
        super(m2Var, context, false, null, i10, z10, d6Var, 16);
        this.f54766f2 = a0Var;
        this.f54764d2 = ml0Var;
        this.f54765e2 = m2Var2;
    }

    @Override
    public final void m() {
        this.f54766f2.f54536a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        xh.m mVar = this.f54766f2.f54538c;
        ml0 ml0Var = this.f54764d2;
        m2 m2Var = this.f54765e2;
        if (m2Var != null && !ml0Var.A0 && ml0Var.getWindowType() != 13 && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
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
                longValue = document.f20038id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f54705g = longValue;
            obj.h = longValue;
            ml0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(mVar);
        }
    }

    @Override
    public final void q() {
        a0 a0Var = this.f54766f2;
        if (!a0Var.v) {
            a0Var.v = true;
            if (!a0Var.d) {
                a0Var.f54537b.updateViewLayout(a0Var.f54538c, a0Var.b(true));
            }
            m2 m2Var = this.f54765e2;
            if (m2Var instanceof zn) {
                ((zn) m2Var).U9();
            }
            ml0 ml0Var = this.f54764d2;
            if (ml0Var.getDelegate() != null) {
                ml0Var.getDelegate().q();
            }
        }
    }

    @Override
    public final void r(s61 s61Var, n0 n0Var) {
        this.f54764d2.l(s61Var, n0Var, false);
        AndroidUtilities.hideKeyboard(this.f54766f2.f54538c);
    }

    @Override
    public final boolean u() {
        ml0 ml0Var = this.f54764d2;
        if (ml0Var.getDelegate() != null) {
            return ml0Var.getDelegate().q();
        }
        return false;
    }
}
