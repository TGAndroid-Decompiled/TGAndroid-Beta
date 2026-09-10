package yg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
import org.telegram.ui.l71;
import org.telegram.ui.u61;
import xh.t3;
public final class y extends l71 {
    public final pk0 f47161d2;
    public final p2 f47162e2;
    public final c0 f47163f2;

    public y(c0 c0Var, p2 p2Var, Context context, int i10, boolean z10, f6 f6Var, pk0 pk0Var, p2 p2Var2) {
        super(p2Var, context, false, null, i10, z10, f6Var, 16);
        this.f47163f2 = c0Var;
        this.f47161d2 = pk0Var;
        this.f47162e2 = p2Var2;
    }

    @Override
    public final void m() {
        this.f47163f2.f46950a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        t3 t3Var = this.f47163f2.f46952c;
        pk0 pk0Var = this.f47161d2;
        p2 p2Var = this.f47162e2;
        if (p2Var != null && !pk0Var.A0 && pk0Var.getWindowType() != 13 && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            try {
                t3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new wc(t3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new xh.x(this, 17)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                p5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f17201id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f47102g = longValue;
            obj.h = longValue;
            pk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(t3Var);
        }
    }

    @Override
    public final void q() {
        c0 c0Var = this.f47163f2;
        if (!c0Var.v) {
            c0Var.v = true;
            if (!c0Var.d) {
                c0Var.f46951b.updateViewLayout(c0Var.f46952c, c0Var.b(true));
            }
            p2 p2Var = this.f47162e2;
            if (p2Var instanceof eo) {
                ((eo) p2Var).P9();
            }
            pk0 pk0Var = this.f47161d2;
            if (pk0Var.getDelegate() != null) {
                pk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(u61 u61Var, p0 p0Var) {
        this.f47161d2.l(u61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f47163f2.f46952c);
    }

    @Override
    public final boolean u() {
        pk0 pk0Var = this.f47161d2;
        if (pk0Var.getDelegate() != null) {
            return pk0Var.getDelegate().k();
        }
        return false;
    }
}
