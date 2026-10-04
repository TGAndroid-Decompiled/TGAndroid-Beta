package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class zc implements ResultCallback {
    public final int f43753a;
    public final ad f43754b;

    public zc(ad adVar, int i10) {
        this.f43754b = adVar;
        this.f43753a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f43753a).doOnIdle(new org.telegram.ui.ActionBar.g6(18, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f43754b.getContext(), tL_error.text, 0).show();
    }
}
