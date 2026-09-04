package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class yc implements ResultCallback {
    public final int f43075a;
    public final zc f43076b;

    public yc(zc zcVar, int i10) {
        this.f43076b = zcVar;
        this.f43075a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f43075a).doOnIdle(new org.telegram.ui.ActionBar.c6(20, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f43076b.getContext(), tL_error.text, 0).show();
    }
}
