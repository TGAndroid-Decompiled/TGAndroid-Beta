package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vn0 extends AsyncTask {
    public final wc.a f42244a;
    public final fo0 f42245b;

    public vn0(fo0 fo0Var, wc.a aVar) {
        this.f42245b = fo0Var;
        this.f42244a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vn0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        fo0 fo0Var = this.f42245b;
        if (fo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.f5.v0(fo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            fo0Var.f37005w0 = str;
            fo0Var.t0();
        }
        fo0Var.H0(true, false);
        fo0Var.D0(false);
    }
}
