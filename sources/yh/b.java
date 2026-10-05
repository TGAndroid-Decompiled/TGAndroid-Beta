package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.zb;
public final class b implements Runnable {
    public final int f51116a;
    public final h f51117b;

    public b(h hVar, int i10) {
        this.f51116a = i10;
        this.f51117b = hVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f51116a;
        h hVar = this.f51117b;
        switch (i10) {
            case 0:
                b bVar = hVar.f51391s0;
                int currentTime = hVar.getConnectionsManager().getCurrentTime();
                bi.q qVar = hVar.f51367a0;
                if (hVar.Y <= 0 && hVar.P <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                qVar.setEnabled(z10);
                if (currentTime < hVar.P) {
                    hVar.f51367a0.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (hVar.f51389r0 == null) {
                        hVar.f51389r0 = new SpannableStringBuilder("l");
                        rq rqVar = new rq(R.drawable.mini_switch_lock, 0);
                        rqVar.setTopOffset(1);
                        hVar.f51389r0.setSpan(rqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hVar.f51389r0).append((CharSequence) h.r0(hVar.P - currentTime));
                    hVar.f51367a0.f(spannableStringBuilder, true);
                    rc rcVar = hVar.f51380j0;
                    if (rcVar != null) {
                        vb vbVar = rcVar.f30423e;
                        if ((vbVar instanceof zb) && vbVar.isAttachedToWindow()) {
                            bi.p(R.string.BotStarsWithdrawalToast, new Object[]{h.r0(hVar.P - currentTime)}, ((zb) hVar.f51380j0.f30423e).f33480b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 1000L);
                    return;
                }
                hVar.f51367a0.f(null, true);
                bi.q qVar2 = hVar.f51367a0;
                if (hVar.X) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) hVar.Y);
                }
                qVar2.g(z7.b1(false, formatPluralStringSpaced, hVar.f51371c0), true, true);
                return;
            case 1:
                h.U(hVar);
                return;
            case 2:
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                return;
            case 3:
                h.S(hVar);
                return;
            case 4:
                nf.f.s(hVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                return;
            default:
                hVar.f51369b0.setLoading(false);
                return;
        }
    }
}
