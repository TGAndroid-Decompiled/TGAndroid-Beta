package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class t21 implements ResultCallback {
    public final f31 f37607a;

    public t21(f31 f31Var) {
        this.f37607a = f31Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f37607a.c0(list);
        f31.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f37607a.getParentActivity(), tL_error.text, 0).show();
    }
}
