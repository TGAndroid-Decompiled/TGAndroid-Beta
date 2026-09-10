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
public final class vb0 extends org.telegram.ui.Cells.i3 {
    public boolean f37524x;
    public final xb0 f37525y;

    public vb0(xb0 xb0Var, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, false, false, -1, f6Var);
        this.f37525y = xb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f37524x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        xb0 xb0Var = this.f37525y;
        if (isEmpty) {
            xb0Var.f38667s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > xb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f37524x = true;
                parseLong = xb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f37524x = false;
            }
            TextView textView = xb0Var.f38667s;
            if (xb0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.p2) xb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
