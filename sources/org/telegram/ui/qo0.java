package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qo0 extends AsyncTask {
    public final wc.a f39198a;
    public final ap0 f39199b;

    public qo0(ap0 ap0Var, wc.a aVar) {
        this.f39199b = ap0Var;
        this.f39198a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qo0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ap0 ap0Var = this.f39199b;
        if (ap0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.g5.v0(ap0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            ap0Var.f34042w0 = str;
            ap0Var.t0();
        }
        ap0Var.H0(true, false);
        ap0Var.D0(false);
    }
}
