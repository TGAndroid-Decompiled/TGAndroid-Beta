package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class t21 implements ResultCallback {
    public final e31 f37536a;

    public t21(e31 e31Var) {
        this.f37536a = e31Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f37536a.c0(list);
        e31.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f37536a.getParentActivity(), tL_error.text, 0).show();
    }
}
