package xh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xb;
public final class b implements Runnable {
    public final int f45254a;
    public final h f45255b;

    public b(h hVar, int i10) {
        this.f45254a = i10;
        this.f45255b = hVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f45254a;
        h hVar = this.f45255b;
        switch (i10) {
            case 0:
                b bVar = hVar.f45493n0;
                int currentTime = hVar.getConnectionsManager().getCurrentTime();
                ai.w wVar = hVar.R;
                if (hVar.P <= 0 && hVar.G <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                wVar.setEnabled(z10);
                if (currentTime < hVar.G) {
                    hVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (hVar.m0 == null) {
                        hVar.m0 = new SpannableStringBuilder("l");
                        uq uqVar = new uq(R.drawable.mini_switch_lock, 0);
                        uqVar.setTopOffset(1);
                        hVar.m0.setSpan(uqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hVar.m0).append((CharSequence) h.j0(hVar.G - currentTime));
                    hVar.R.f(spannableStringBuilder, true);
                    pc pcVar = hVar.f45477a0;
                    if (pcVar != null) {
                        tb tbVar = pcVar.e;
                        if ((tbVar instanceof xb) && tbVar.isAttachedToWindow()) {
                            em.p(R.string.BotStarsWithdrawalToast, new Object[]{h.j0(hVar.G - currentTime)}, ((xb) hVar.f45477a0.e).f29000b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 1000L);
                    return;
                }
                hVar.R.f(null, true);
                ai.w wVar2 = hVar.R;
                if (hVar.O) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) hVar.P);
                }
                wVar2.g(z7.V0(false, formatPluralStringSpaced, hVar.T), true, true);
                return;
            case 1:
                h.U(hVar);
                return;
            case 2:
                h.V(hVar);
                return;
            case 3:
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            case 4:
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            default:
                hVar.S.setLoading(false);
                return;
        }
    }
}
