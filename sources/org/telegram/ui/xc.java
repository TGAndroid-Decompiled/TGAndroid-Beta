package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class xc implements ResultCallback {
    public final int f39882a;
    public final yc f39883b;

    public xc(yc ycVar, int i10) {
        this.f39883b = ycVar;
        this.f39882a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f39882a).doOnIdle(new org.telegram.ui.ActionBar.a6(20, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f39883b.getContext(), tL_error.text, 0).show();
    }
}
