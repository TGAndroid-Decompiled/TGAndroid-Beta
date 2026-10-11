package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class xc implements ResultCallback {
    public final int f44072a;
    public final yc f44073b;

    public xc(yc ycVar, int i10) {
        this.f44073b = ycVar;
        this.f44072a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f44072a).doOnIdle(new org.telegram.ui.ActionBar.a6(20, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f44073b.getContext(), tL_error.text, 0).show();
    }
}
