package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class zc implements ResultCallback {
    public final int f40212a;
    public final ad f40213b;

    public zc(ad adVar, int i10) {
        this.f40213b = adVar;
        this.f40212a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f40212a).doOnIdle(new l4(14, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f40213b.getContext(), tL_error.text, 0).show();
    }
}
