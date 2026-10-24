package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xn0 extends AsyncTask {
    public final wc.a f43649a;
    public final ho0 f43650b;

    public xn0(ho0 ho0Var, wc.a aVar) {
        this.f43650b = ho0Var;
        this.f43649a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ho0 ho0Var = this.f43650b;
        if (ho0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.d5.v0(ho0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            ho0Var.f37949w0 = str;
            ho0Var.t0();
        }
        ho0Var.H0(true, false);
        ho0Var.D0(false);
    }
}
