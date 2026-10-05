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
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.a71;
import org.telegram.ui.j61;
import org.telegram.ui.yn;
import yh.o2;
import yh.u3;
public final class v extends a71 {
    public final sk0 f53533d2;
    public final n2 f53534e2;
    public final z f53535f2;

    public v(z zVar, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, sk0 sk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f53535f2 = zVar;
        this.f53533d2 = sk0Var;
        this.f53534e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f53535f2.f53550a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        u3 u3Var = this.f53535f2.f53552c;
        sk0 sk0Var = this.f53533d2;
        n2 n2Var = this.f53534e2;
        if (n2Var != null && !sk0Var.A0 && sk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                u3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new yc(u3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new o2(this, 12)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                q5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f20053id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f53472g = longValue;
            obj.h = longValue;
            sk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(u3Var);
        }
    }

    @Override
    public final void q() {
        z zVar = this.f53535f2;
        if (!zVar.v) {
            zVar.v = true;
            if (!zVar.d) {
                zVar.f53551b.updateViewLayout(zVar.f53552c, zVar.b(true));
            }
            n2 n2Var = this.f53534e2;
            if (n2Var instanceof yn) {
                ((yn) n2Var).O9();
            }
            sk0 sk0Var = this.f53533d2;
            if (sk0Var.getDelegate() != null) {
                sk0Var.getDelegate().E();
            }
        }
    }

    @Override
    public final void r(j61 j61Var, m0 m0Var) {
        this.f53533d2.l(j61Var, m0Var, false);
        AndroidUtilities.hideKeyboard(this.f53535f2.f53552c);
    }

    @Override
    public final boolean u() {
        sk0 sk0Var = this.f53533d2;
        if (sk0Var.getDelegate() != null) {
            return sk0Var.getDelegate().E();
        }
        return false;
    }
}
