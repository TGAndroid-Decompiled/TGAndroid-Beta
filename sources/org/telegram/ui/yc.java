package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class yc implements ResultCallback {
    public final int f44312a;
    public final zc f44313b;

    public yc(zc zcVar, int i10) {
        this.f44313b = zcVar;
        this.f44312a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f44312a).doOnIdle(new org.telegram.ui.ActionBar.p(21, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f44313b.getContext(), tL_error.text, 0).show();
    }
}
