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
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.j71;
import org.telegram.ui.s61;
import org.telegram.ui.zn;
import yh.s2;
import yh.u3;
public final class x extends j71 {
    public final pk0 f49483d2;
    public final n2 f49484e2;
    public final b0 f49485f2;

    public x(b0 b0Var, n2 n2Var, Context context, int i10, boolean z10, f6 f6Var, pk0 pk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, f6Var, 16);
        this.f49485f2 = b0Var;
        this.f49483d2 = pk0Var;
        this.f49484e2 = n2Var2;
    }

    @Override
    public final void m() {
        this.f49485f2.f49272a.invalidate();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        u3 u3Var = this.f49485f2.f49274c;
        pk0 pk0Var = this.f49483d2;
        n2 n2Var = this.f49484e2;
        if (n2Var != null && !pk0Var.A0 && pk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
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
                longValue = document.f18334id;
            } else {
                longValue = l4.longValue();
            }
            ?? obj = new Object();
            obj.f49424g = longValue;
            obj.h = longValue;
            pk0Var.l(view, obj, false);
            AndroidUtilities.hideKeyboard(u3Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f49485f2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f49273b.updateViewLayout(b0Var.f49274c, b0Var.b(true));
            }
            n2 n2Var = this.f49484e2;
            if (n2Var instanceof zn) {
                ((zn) n2Var).P9();
            }
            pk0 pk0Var = this.f49483d2;
            if (pk0Var.getDelegate() != null) {
                pk0Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void r(s61 s61Var, o0 o0Var) {
        this.f49483d2.l(s61Var, o0Var, false);
        AndroidUtilities.hideKeyboard(this.f49485f2.f49274c);
    }

    @Override
    public final boolean u() {
        pk0 pk0Var = this.f49483d2;
        if (pk0Var.getDelegate() != null) {
            return pk0Var.getDelegate().k();
        }
        return false;
    }
}
