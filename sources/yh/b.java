package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.zb;
public final class b implements Runnable {
    public final int f47322a;
    public final g f47323b;

    public b(g gVar, int i10) {
        this.f47322a = i10;
        this.f47323b = gVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f47322a;
        g gVar = this.f47323b;
        switch (i10) {
            case 0:
                b bVar = gVar.f47518n0;
                int currentTime = gVar.getConnectionsManager().getCurrentTime();
                bi.q qVar = gVar.R;
                if (gVar.P <= 0 && gVar.G <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                qVar.setEnabled(z10);
                if (currentTime < gVar.G) {
                    gVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (gVar.m0 == null) {
                        gVar.m0 = new SpannableStringBuilder("l");
                        rq rqVar = new rq(R.drawable.mini_switch_lock, 0);
                        rqVar.setTopOffset(1);
                        gVar.m0.setSpan(rqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    rc rcVar = gVar.f47502a0;
                    if (rcVar != null) {
                        vb vbVar = rcVar.e;
                        if ((vbVar instanceof zb) && vbVar.isAttachedToWindow()) {
                            ok.q(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((zb) gVar.f47502a0.e).f30942b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 1000L);
                    return;
                }
                gVar.R.f(null, true);
                bi.q qVar2 = gVar.R;
                if (gVar.O) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) gVar.P);
                }
                qVar2.g(w7.V0(false, formatPluralStringSpaced, gVar.T), true, true);
                return;
            case 1:
                g.U(gVar);
                return;
            case 2:
                g.V(gVar);
                return;
            case 3:
                nf.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                nf.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                gVar.S.setLoading(false);
                return;
        }
    }
}
