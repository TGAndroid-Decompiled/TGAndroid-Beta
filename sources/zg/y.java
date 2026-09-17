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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.i71;
import org.telegram.ui.r61;
import yh.w3;
import yh.y2;
public final class y extends i71 {
    public final gk0 f49211d2;
    public final o2 f49212e2;
    public final c0 f49213f2;

    public y(c0 c0Var, o2 o2Var, Context context, int i10, boolean z10, f6 f6Var, gk0 gk0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i10, z10, f6Var, 16);
        this.f49213f2 = c0Var;
        this.f49211d2 = gk0Var;
        this.f49212e2 = o2Var2;
    }

    @Override
    public final void m() {
        this.f49213f2.f49006a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        w3 w3Var = this.f49213f2.f49008c;
        gk0 gk0Var = this.f49211d2;
        o2 o2Var = this.f49212e2;
        if (o2Var != null && !gk0Var.A0 && gk0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
            try {
                w3Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new vc(w3Var, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new y2(this, 10)).j();
        } else if (l4 == null && document == null) {
        } else {
            if (document != null) {
                o5.h(UserConfig.selectedAccount).e(document);
            }
            if (l4 == null) {
                longValue = document.f18127id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49151g = longValue;
            obj.h = longValue;
            gk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(w3Var);
        }
    }

    @Override
    public final void q() {
        c0 c0Var = this.f49213f2;
        if (!c0Var.v) {
            c0Var.v = true;
            if (!c0Var.d) {
                c0Var.f49007b.updateViewLayout(c0Var.f49008c, c0Var.b(true));
            }
            o2 o2Var = this.f49212e2;
            if (o2Var instanceof bo) {
                ((bo) o2Var).P9();
            }
            gk0 gk0Var = this.f49211d2;
            if (gk0Var.getDelegate() != null) {
                gk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(r61 r61Var, p0 p0Var) {
        this.f49211d2.l(r61Var, p0Var, false);
        AndroidUtilities.hideKeyboard(this.f49213f2.f49008c);
    }

    @Override
    public final boolean u() {
        gk0 gk0Var = this.f49211d2;
        if (gk0Var.getDelegate() != null) {
            return gk0Var.getDelegate().k();
        }
        return false;
    }
}
