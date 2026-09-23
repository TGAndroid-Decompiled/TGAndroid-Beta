package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ul;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.yb;
public final class b implements Runnable {
    public final int f46908a;
    public final g f46909b;

    public b(g gVar, int i10) {
        this.f46908a = i10;
        this.f46909b = gVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f46908a;
        g gVar = this.f46909b;
        switch (i10) {
            case 0:
                b bVar = gVar.f47091n0;
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
                        pq pqVar = new pq(R.drawable.mini_switch_lock, 0);
                        pqVar.setTopOffset(1);
                        gVar.m0.setSpan(pqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    qc qcVar = gVar.f47075a0;
                    if (qcVar != null) {
                        ub ubVar = qcVar.e;
                        if ((ubVar instanceof yb) && ubVar.isAttachedToWindow()) {
                            ul.q(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((yb) gVar.f47075a0.e).f30192b);
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
