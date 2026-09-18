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
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.g71;
import org.telegram.ui.p61;
import org.telegram.ui.zn;
import yh.u3;
import yh.w2;
public final class x extends g71 {
    public final qk0 f49437d2;
    public final n2 f49438e2;
    public final b0 f49439f2;

    public x(b0 b0Var, n2 n2Var, Context context, int i10, boolean z10, e6 e6Var, qk0 qk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, e6Var, 16);
        this.f49439f2 = b0Var;
        this.f49437d2 = qk0Var;
        this.f49438e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f49439f2.f49226a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        u3 u3Var = this.f49439f2.f49228c;
        qk0 qk0Var = this.f49437d2;
        n2 n2Var = this.f49438e2;
        if (n2Var != null && !qk0Var.A0 && qk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
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
                longValue = document.f18302id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49378g = longValue;
            obj.h = longValue;
            qk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(u3Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f49439f2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f49227b.updateViewLayout(b0Var.f49228c, b0Var.b(true));
            }
            n2 n2Var = this.f49438e2;
            if (n2Var instanceof zn) {
                ((zn) n2Var).P9();
            }
            qk0 qk0Var = this.f49437d2;
            if (qk0Var.getDelegate() != null) {
                qk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(p61 p61Var, o0 o0Var) {
        this.f49437d2.l(p61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f49439f2.f49228c);
    }

    @Override
    public final boolean u() {
        qk0 qk0Var = this.f49437d2;
        if (qk0Var.getDelegate() != null) {
            return qk0Var.getDelegate().k();
        }
        return false;
    }
}
