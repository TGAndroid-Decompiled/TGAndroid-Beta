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
    public boolean f38493x;
    public final xb0 f38494y;

    public vb0(xb0 xb0Var, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, false, false, -1, e6Var);
        this.f38494y = xb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f38493x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        xb0 xb0Var = this.f38494y;
        if (isEmpty) {
            xb0Var.f39573s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > xb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f38493x = true;
                parseLong = xb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f38493x = false;
            }
            TextView textView = xb0Var.f39573s;
            if (xb0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.n2) xb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
