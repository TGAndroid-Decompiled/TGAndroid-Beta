package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class v21 implements ResultCallback {
    public final g31 f41419a;

    public v21(g31 g31Var) {
        this.f41419a = g31Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f41419a.c0(list);
        g31.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f41419a.getParentActivity(), tL_error.text, 0).show();
    }
}
