package zh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wb;
public final class b implements Runnable {
    public final int f50291a;
    public final g f50292b;

    public b(g gVar, int i10) {
        this.f50291a = i10;
        this.f50292b = gVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f50291a;
        g gVar = this.f50292b;
        switch (i10) {
            case 0:
                b bVar = gVar.f50559n0;
                int currentTime = gVar.getConnectionsManager().getCurrentTime();
                ci.p pVar = gVar.R;
                if (gVar.P <= 0 && gVar.G <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                pVar.setEnabled(z10);
                if (currentTime < gVar.G) {
                    gVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (gVar.m0 == null) {
                        gVar.m0 = new SpannableStringBuilder("l");
                        br brVar = new br(R.drawable.mini_switch_lock, 0);
                        brVar.setTopOffset(1);
                        gVar.m0.setSpan(brVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gVar.m0).append((CharSequence) g.j0(gVar.G - currentTime));
                    gVar.R.f(spannableStringBuilder, true);
                    sc scVar = gVar.f50543a0;
                    if (scVar != null) {
                        wb wbVar = scVar.e;
                        if ((wbVar instanceof ac) && wbVar.isAttachedToWindow()) {
                            sk.r(R.string.BotStarsWithdrawalToast, new Object[]{g.j0(gVar.G - currentTime)}, ((ac) gVar.f50543a0.e).f23192b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 1000L);
                    return;
                }
                gVar.R.f(null, true);
                ci.p pVar2 = gVar.R;
                if (gVar.O) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) gVar.P);
                }
                pVar2.g(p7.W0(false, formatPluralStringSpaced, gVar.T), true, true);
                return;
            case 1:
                g.U(gVar);
                return;
            case 2:
                g.V(gVar);
                return;
            case 3:
                pf.d.r(gVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                pf.d.r(gVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                gVar.S.setLoading(false);
                return;
        }
    }
}
