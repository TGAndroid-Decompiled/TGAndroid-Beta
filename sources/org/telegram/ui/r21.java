package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class r21 implements ResultCallback {
    public final d31 f41340a;

    public r21(d31 d31Var) {
        this.f41340a = d31Var;
    }

    @Override
    public final void onComplete(Object obj) {
        List list = (List) obj;
        this.f41340a.b0(list);
        d31.S = list;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f41340a.getParentActivity(), tL_error.text, 0).show();
    }
}
