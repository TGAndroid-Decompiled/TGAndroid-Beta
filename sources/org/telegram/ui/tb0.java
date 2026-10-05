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
public final class tb0 extends org.telegram.ui.Cells.j3 {
    public boolean f40839x;
    public final vb0 f40840y;

    public tb0(vb0 vb0Var, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, false, false, -1, d6Var);
        this.f40840y = vb0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f40839x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        vb0 vb0Var = this.f40840y;
        if (isEmpty) {
            vb0Var.f41700s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > vb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f40839x = true;
                parseLong = vb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f40839x = false;
            }
            TextView textView = vb0Var.f41700s;
            if (vb0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.n2) vb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
