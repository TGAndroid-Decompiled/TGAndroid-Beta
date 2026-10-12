package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class yb0 extends org.telegram.ui.Cells.j3 {
    public boolean f42125x;
    public final ac0 f42126y;

    public yb0(ac0 ac0Var, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, false, false, -1, c6Var);
        this.f42126y = ac0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f42125x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ac0 ac0Var = this.f42126y;
        if (isEmpty) {
            ac0Var.f34171s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ac0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f42125x = true;
                parseLong = ac0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f42125x = false;
            }
            TextView textView = ac0Var.f34171s;
            if (ac0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.m2) ac0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
