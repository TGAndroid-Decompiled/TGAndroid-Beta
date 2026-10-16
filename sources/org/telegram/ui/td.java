package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class td implements Runnable {
    public final int f40077a;
    public final qe f40078b;
    public final int f40079c;

    public td(qe qeVar, int i10, int i11) {
        this.f40077a = i11;
        this.f40078b = qeVar;
        this.f40079c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f40077a;
        int i11 = this.f40079c;
        qe qeVar = this.f40078b;
        switch (i10) {
            case 0:
                pf.d.r(qeVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                td tdVar = qeVar.f39125i1;
                gi.o oVar = qeVar.Y0;
                org.telegram.ui.Components.sc.e();
                if (qeVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    qeVar.W0 = true;
                    qeVar.X0 = qeVar.N0.amount;
                } else {
                    qeVar.W0 = false;
                    qeVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                qeVar.V0 = true;
                oVar.setText(Long.toString(qeVar.X0));
                oVar.setSelection(oVar.getText().length());
                qeVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                tdVar.run();
                return;
            default:
                td tdVar2 = qeVar.f39125i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                he heVar = qeVar.Q0;
                if (qeVar.X0 <= 0 && qeVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                heVar.setEnabled(z10);
                if (currentTime < qeVar.L0) {
                    heVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (qeVar.f39124h1 == null) {
                        qeVar.f39124h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.mini_switch_lock, 0);
                        brVar.setTopOffset(1);
                        qeVar.f39124h1.setSpan(brVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) qeVar.f39124h1).append((CharSequence) zh.g.j0(qeVar.L0 - currentTime));
                    heVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.sc scVar = qeVar.Z0;
                    if (scVar != null) {
                        org.telegram.ui.Components.wb wbVar = scVar.e;
                        if ((wbVar instanceof org.telegram.ui.Components.ac) && wbVar.isAttachedToWindow()) {
                            org.telegram.messenger.sk.r(R.string.BotStarsWithdrawalToast, new Object[]{zh.g.j0(qeVar.L0 - currentTime)}, ((org.telegram.ui.Components.ac) qeVar.Z0.e).f23192b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(tdVar2);
                    AndroidUtilities.runOnUIThread(tdVar2, 1000L);
                    return;
                }
                heVar.f(null, true);
                if (qeVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) qeVar.X0);
                }
                heVar.g(zh.p7.W0(false, formatPluralStringSpaced, qeVar.R0), true, true);
                return;
        }
    }
}
