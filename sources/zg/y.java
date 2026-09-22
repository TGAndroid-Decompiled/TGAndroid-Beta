package zg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.j71;
import org.telegram.ui.s61;
import org.telegram.ui.zn;
import yh.s2;
import yh.u3;
public final class y extends j71 {
    public final sk0 f49506d2;
    public final n2 f49507e2;
    public final c0 f49508f2;

    public y(c0 c0Var, n2 n2Var, Context context, int i10, boolean z10, f6 f6Var, sk0 sk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, f6Var, 16);
        this.f49508f2 = c0Var;
        this.f49506d2 = sk0Var;
        this.f49507e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f49508f2.f49303a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        u3 u3Var = this.f49508f2.f49305c;
        sk0 sk0Var = this.f49506d2;
        n2 n2Var = this.f49507e2;
        if (n2Var != null && !sk0Var.A0 && sk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                u3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(u3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new s2(this, 11)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                p5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f18349id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49448g = longValue;
            obj.h = longValue;
            sk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(u3Var);
        }
    }

    @Override
    public final void q() {
        c0 c0Var = this.f49508f2;
        if (!c0Var.v) {
            c0Var.v = true;
            if (!c0Var.d) {
                c0Var.f49304b.updateViewLayout(c0Var.f49305c, c0Var.b(true));
            }
            n2 n2Var = this.f49507e2;
            if (n2Var instanceof zn) {
                ((zn) n2Var).P9();
            }
            sk0 sk0Var = this.f49506d2;
            if (sk0Var.getDelegate() != null) {
                sk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(s61 s61Var, p0 p0Var) {
        this.f49506d2.l(s61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f49508f2.f49305c);
    }

    @Override
    public final boolean u() {
        sk0 sk0Var = this.f49506d2;
        if (sk0Var.getDelegate() != null) {
            return sk0Var.getDelegate().k();
        }
        return false;
    }
}
