package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class wc implements ResultCallback {
    public final int f42925a;
    public final xc f42926b;

    public wc(xc xcVar, int i10) {
        this.f42926b = xcVar;
        this.f42925a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        org.telegram.messenger.zs.f(this.f42925a).d(new h0(17, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f42926b.getContext(), tL_error.text, 0).show();
    }
}
