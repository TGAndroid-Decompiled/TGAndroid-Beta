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
    public boolean f37386x;
    public final ub0 f37387y;

    public sb0(ub0 ub0Var, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, false, false, -1, e6Var);
        this.f37387y = ub0Var;
    }

    @Override
    public final void b(Editable editable) {
        int i10;
        int i11;
        if (this.f37386x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ub0 ub0Var = this.f37387y;
        if (isEmpty) {
            ub0Var.f38199s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ub0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.f37386x = true;
                parseLong = ub0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.f37386x = false;
            }
            TextView textView = ub0Var.f38199s;
            if (ub0Var.getConnectionsManager().isTestBackend()) {
                i10 = R.string.RequireMonthlyFeePriceTest5Minutes;
            } else {
                i10 = R.string.RequireMonthlyFeePrice;
            }
            BillingController billingController = BillingController.getInstance();
            i11 = ((org.telegram.ui.ActionBar.o2) ub0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i11).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
