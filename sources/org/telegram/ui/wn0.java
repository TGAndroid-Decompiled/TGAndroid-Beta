package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wn0 extends AsyncTask {
    public final wc.a f42922a;
    public final go0 f42923b;

    public wn0(go0 go0Var, wc.a aVar) {
        this.f42923b = go0Var;
        this.f42922a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        go0 go0Var = this.f42923b;
        if (go0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.f5.v0(go0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            go0Var.f37288w0 = str;
            go0Var.t0();
        }
        go0Var.H0(true, false);
        go0Var.D0(false);
    }
}
