package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class yc implements ResultCallback {
    public final int f40472a;
    public final zc f40473b;

    public yc(zc zcVar, int i10) {
        this.f40473b = zcVar;
        this.f40472a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f40472a).doOnIdle(new yb(2, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f40473b.getContext(), tL_error.text, 0).show();
    }
}
