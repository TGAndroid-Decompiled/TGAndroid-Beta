package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class rd implements Runnable {
    public final int f41609a;
    public final oe f41610b;
    public final int f41611c;

    public rd(oe oeVar, int i10, int i11) {
        this.f41609a = i11;
        this.f41610b = oeVar;
        this.f41611c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f41609a;
        int i11 = this.f41611c;
        oe oeVar = this.f41610b;
        switch (i10) {
            case 0:
                of.f.s(oeVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                rd rdVar = oeVar.f40666i1;
                fi.o oVar = oeVar.Y0;
                org.telegram.ui.Components.sc.e();
                if (oeVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    oeVar.W0 = true;
                    oeVar.X0 = oeVar.N0.amount;
                } else {
                    oeVar.W0 = false;
                    oeVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                oeVar.V0 = true;
                oVar.setText(Long.toString(oeVar.X0));
                oVar.setSelection(oVar.getText().length());
                oeVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                rdVar.run();
                return;
            default:
                rd rdVar2 = oeVar.f40666i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                fe feVar = oeVar.Q0;
                if (oeVar.X0 <= 0 && oeVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                feVar.setEnabled(z10);
                if (currentTime < oeVar.L0) {
                    feVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (oeVar.f40665h1 == null) {
                        oeVar.f40665h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(R.drawable.mini_switch_lock, 0);
                        grVar.setTopOffset(1);
                        oeVar.f40665h1.setSpan(grVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) oeVar.f40665h1).append((CharSequence) yh.g.j0(oeVar.L0 - currentTime));
                    feVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.sc scVar = oeVar.Z0;
                    if (scVar != null) {
                        org.telegram.ui.Components.wb wbVar = scVar.f30532e;
                        if ((wbVar instanceof org.telegram.ui.Components.ac) && wbVar.isAttachedToWindow()) {
                            org.telegram.messenger.am.r(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(oeVar.L0 - currentTime)}, ((org.telegram.ui.Components.ac) oeVar.Z0.f30532e).f24277b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(rdVar2);
                    AndroidUtilities.runOnUIThread(rdVar2, 1000L);
                    return;
                }
                feVar.f(null, true);
                if (oeVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) oeVar.X0);
                }
                feVar.g(yh.p7.W0(false, formatPluralStringSpaced, oeVar.R0), true, true);
                return;
        }
    }
}
