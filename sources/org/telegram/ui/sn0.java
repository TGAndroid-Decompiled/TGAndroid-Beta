package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sn0 extends AsyncTask {
    public final cc.a f42735a;
    public final co0 f42736b;

    public sn0(co0 co0Var, cc.a aVar) {
        this.f42736b = co0Var;
        this.f42735a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        co0 co0Var = this.f42736b;
        if (co0Var.M0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.y4.w0(co0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            co0Var.f37272s0 = str;
            co0Var.s0();
        }
        co0Var.G0(true, false);
        co0Var.C0(false);
    }
}
