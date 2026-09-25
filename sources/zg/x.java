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
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.a71;
import org.telegram.ui.j61;
import org.telegram.ui.wn;
import yh.r2;
import yh.t3;
public final class x extends a71 {
    public final qk0 f49457d2;
    public final m2 f49458e2;
    public final b0 f49459f2;

    public x(b0 b0Var, m2 m2Var, Context context, int i10, boolean z10, d6 d6Var, qk0 qk0Var, m2 m2Var2) {
        super(m2Var, context, false, null, i10, z10, d6Var, 16);
        this.f49459f2 = b0Var;
        this.f49457d2 = qk0Var;
        this.f49458e2 = m2Var2;
    }

    @Override
    public final void m() {
        this.f49459f2.f49246a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        t3 t3Var = this.f49459f2.f49248c;
        qk0 qk0Var = this.f49457d2;
        m2 m2Var = this.f49458e2;
        if (m2Var != null && !qk0Var.A0 && qk0Var.getWindowType() != 13 && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
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
                longValue = document.f18342id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49398g = longValue;
            obj.h = longValue;
            qk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(t3Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f49459f2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f49247b.updateViewLayout(b0Var.f49248c, b0Var.b(true));
            }
            m2 m2Var = this.f49458e2;
            if (m2Var instanceof wn) {
                ((wn) m2Var).P9();
            }
            qk0 qk0Var = this.f49457d2;
            if (qk0Var.getDelegate() != null) {
                qk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(j61 j61Var, o0 o0Var) {
        this.f49457d2.l(j61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f49459f2.f49248c);
    }

    @Override
    public final boolean u() {
        qk0 qk0Var = this.f49457d2;
        if (qk0Var.getDelegate() != null) {
            return qk0Var.getDelegate().k();
        }
        return false;
    }
}
