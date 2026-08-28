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
public final class za0 extends org.telegram.ui.Cells.j3 {
    public boolean f45095x;
    public final bb0 f45096y;

    public za0(bb0 bb0Var, Context context, String str, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, str, false, false, -1, b6Var);
        this.f45096y = bb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i9;
        int i10;
        if (this.f45095x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        bb0 bb0Var = this.f45096y;
        if (isEmpty) {
            bb0Var.f36815s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > bb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f45095x = true;
                parseLong = bb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f45095x = false;
            }
            TextView textView = bb0Var.f36815s;
            if (bb0Var.getConnectionsManager().isTestBackend()) {
                i9 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i9 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.o2) bb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i9, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
