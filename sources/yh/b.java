package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.am;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wb;
public final class b implements Runnable {
    public final int f52501a;
    public final g f52502b;

    public b(g gVar, int i10) {
        this.f52501a = i10;
        this.f52502b = gVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f52501a;
        g gVar = this.f52502b;
        switch (i10) {
            case 0:
                b bVar = gVar.f52807n0;
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
                        gr grVar = new gr(R.drawable.mini_switch_lock, 0);
                        grVar.setTopOffset(1);
                        gVar.m0.setSpan(grVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    sc scVar = gVar.f52790a0;
                    if (scVar != null) {
                        wb wbVar = scVar.f30532e;
                        if ((wbVar instanceof ac) && wbVar.isAttachedToWindow()) {
                            am.r(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((ac) gVar.f52790a0.f30532e).f24277b);
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
                qVar2.g(p7.W0(false, formatPluralStringSpaced, gVar.T), true, true);
                return;
            case 1:
                g.U(gVar);
                return;
            case 2:
                g.V(gVar);
                return;
            case 3:
                of.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                of.f.s(gVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                gVar.S.setLoading(false);
                return;
        }
    }
}
