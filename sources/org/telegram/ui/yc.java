package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class yc implements ResultCallback {
    public final int f39880a;
    public final zc f39881b;

    public yc(zc zcVar, int i10) {
        this.f39881b = zcVar;
        this.f39880a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f39880a).doOnIdle(new org.telegram.ui.ActionBar.c6(20, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f39881b.getContext(), tL_error.text, 0).show();
    }
}
