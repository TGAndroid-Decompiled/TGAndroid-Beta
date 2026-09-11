package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class v21 implements ResultCallback {
    public final g31 f41392a;

    public v21(g31 g31Var) {
        this.f41392a = g31Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f41392a.c0(list);
        g31.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f41392a.getParentActivity(), tL_error.text, 0).show();
    }
}
