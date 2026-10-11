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
public final class sb0 extends org.telegram.ui.Cells.j3 {
    public boolean f41699x;
    public final ub0 f41700y;

    public sb0(ub0 ub0Var, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, false, false, -1, d6Var);
        this.f41700y = ub0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f41699x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ub0 ub0Var = this.f41700y;
        if (isEmpty) {
            ub0Var.f42511s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ub0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f41699x = true;
                parseLong = ub0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f41699x = false;
            }
            TextView textView = ub0Var.f42511s;
            if (ub0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.m2) ub0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
