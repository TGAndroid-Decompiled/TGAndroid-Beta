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
public final class ya0 extends org.telegram.ui.Cells.i3 {
    public boolean f43434x;
    public final ab0 f43435y;

    public ya0(ab0 ab0Var, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, false, false, -1, d6Var);
        this.f43435y = ab0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f43434x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ab0 ab0Var = this.f43435y;
        if (isEmpty) {
            ab0Var.f35333s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ab0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f43434x = true;
                parseLong = ab0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f43434x = false;
            }
            TextView textView = ab0Var.f35333s;
            if (ab0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.n2) ab0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
