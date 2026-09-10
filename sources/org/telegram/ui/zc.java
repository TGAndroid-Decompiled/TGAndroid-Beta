package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class zc implements ResultCallback {
    public final int f39256a;
    public final ad f39257b;

    public zc(ad adVar, int i10) {
        this.f39257b = adVar;
        this.f39256a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f39256a).doOnIdle(new n(17, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f39257b.getContext(), tL_error.text, 0).show();
    }
}
