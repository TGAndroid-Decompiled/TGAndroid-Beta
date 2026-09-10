package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class z21 implements ResultCallback {
    public final k31 f39194a;

    public z21(k31 k31Var) {
        this.f39194a = k31Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f39194a.c0(list);
        k31.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f39194a.getParentActivity(), tL_error.text, 0).show();
    }
}
