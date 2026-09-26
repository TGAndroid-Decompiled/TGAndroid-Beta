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
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.a71;
import org.telegram.ui.j61;
import org.telegram.ui.wn;
import yh.r2;
import yh.t3;
public final class x extends a71 {
    public final rk0 f49455d2;
    public final m2 f49456e2;
    public final b0 f49457f2;

    public x(b0 b0Var, m2 m2Var, Context context, int i10, boolean z10, d6 d6Var, rk0 rk0Var, m2 m2Var2) {
        super(m2Var, context, false, null, i10, z10, d6Var, 16);
        this.f49457f2 = b0Var;
        this.f49455d2 = rk0Var;
        this.f49456e2 = m2Var2;
    }

    @Override
    public final void m() {
        this.f49457f2.f49244a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        t3 t3Var = this.f49457f2.f49246c;
        rk0 rk0Var = this.f49455d2;
        m2 m2Var = this.f49456e2;
        if (m2Var != null && !rk0Var.A0 && rk0Var.getWindowType() != 13 && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
            try {
                t3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(t3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new r2(this, 11)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                q5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f18341id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49396g = longValue;
            obj.h = longValue;
            rk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(t3Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f49457f2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f49245b.updateViewLayout(b0Var.f49246c, b0Var.b(true));
            }
            m2 m2Var = this.f49456e2;
            if (m2Var instanceof wn) {
                ((wn) m2Var).P9();
            }
            rk0 rk0Var = this.f49455d2;
            if (rk0Var.getDelegate() != null) {
                rk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(j61 j61Var, o0 o0Var) {
        this.f49455d2.l(j61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f49457f2.f49246c);
    }

    @Override
    public final boolean u() {
        rk0 rk0Var = this.f49455d2;
        if (rk0Var.getDelegate() != null) {
            return rk0Var.getDelegate().k();
        }
        return false;
    }
}
