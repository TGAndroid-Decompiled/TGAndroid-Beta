package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

public final class uc implements ResultCallback {

    public final int f43183a;

    public final vc f43184b;

    public uc(vc vcVar, int i10) {
        this.f43184b = vcVar;
        this.f43183a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f43183a).doOnIdle(new org.telegram.messenger.voip.l0(26, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f43184b.getContext(), tL_error.text, 0).show();
    }
}
