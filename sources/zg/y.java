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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.c71;
import org.telegram.ui.l61;
import org.telegram.ui.xn;
import yh.r2;
import yh.t3;
public final class y extends c71 {
    public final sk0 f49504d2;
    public final o2 f49505e2;
    public final c0 f49506f2;

    public y(c0 c0Var, o2 o2Var, Context context, int i10, boolean z10, e6 e6Var, sk0 sk0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i10, z10, e6Var, 16);
        this.f49506f2 = c0Var;
        this.f49504d2 = sk0Var;
        this.f49505e2 = o2Var2;
    }

    @Override
    public final void m() {
        this.f49506f2.f49299a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        t3 t3Var = this.f49506f2.f49301c;
        sk0 sk0Var = this.f49504d2;
        o2 o2Var = this.f49505e2;
        if (o2Var != null && !sk0Var.A0 && sk0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
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
                longValue = document.f18335id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49445g = longValue;
            obj.h = longValue;
            sk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(t3Var);
        }
    }

    @Override
    public final void q() {
        c0 c0Var = this.f49506f2;
        if (!c0Var.v) {
            c0Var.v = true;
            if (!c0Var.d) {
                c0Var.f49300b.updateViewLayout(c0Var.f49301c, c0Var.b(true));
            }
            o2 o2Var = this.f49505e2;
            if (o2Var instanceof xn) {
                ((xn) o2Var).P9();
            }
            sk0 sk0Var = this.f49504d2;
            if (sk0Var.getDelegate() != null) {
                sk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(l61 l61Var, p0 p0Var) {
        this.f49504d2.l(l61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f49506f2.f49301c);
    }

    @Override
    public final boolean u() {
        sk0 sk0Var = this.f49504d2;
        if (sk0Var.getDelegate() != null) {
            return sk0Var.getDelegate().k();
        }
        return false;
    }
}
