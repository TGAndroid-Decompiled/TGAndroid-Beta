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
import org.telegram.ui.c71;
import org.telegram.ui.l61;
import org.telegram.ui.yn;
import yh.r2;
import yh.t3;
public final class x extends c71 {
    public final sk0 f53542d2;
    public final n2 f53543e2;
    public final b0 f53544f2;

    public x(b0 b0Var, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, sk0 sk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f53544f2 = b0Var;
        this.f53542d2 = sk0Var;
        this.f53543e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f53544f2.f53316a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        t3 t3Var = this.f53544f2.f53318c;
        sk0 sk0Var = this.f53542d2;
        n2 n2Var = this.f53543e2;
        if (n2Var != null && !sk0Var.A0 && sk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                t3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new yc(t3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new r2(this, 11)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                q5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f20043id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f53480g = longValue;
            obj.h = longValue;
            sk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(t3Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f53544f2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f53317b.updateViewLayout(b0Var.f53318c, b0Var.b(true));
            }
            n2 n2Var = this.f53543e2;
            if (n2Var instanceof yn) {
                ((yn) n2Var).O9();
            }
            sk0 sk0Var = this.f53542d2;
            if (sk0Var.getDelegate() != null) {
                sk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(l61 l61Var, o0 o0Var) {
        this.f53542d2.l(l61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f53544f2.f53318c);
    }

    @Override
    public final boolean u() {
        sk0 sk0Var = this.f53542d2;
        if (sk0Var.getDelegate() != null) {
            return sk0Var.getDelegate().k();
        }
        return false;
    }
}
