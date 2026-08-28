package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class uc implements ResultCallback {
    public final int f43213a;
    public final vc f43214b;

    public uc(vc vcVar, int i9) {
        this.f43214b = vcVar;
        this.f43213a = i9;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f43213a).doOnIdle(new org.telegram.messenger.voip.l0(26, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f43214b.getContext(), tL_error.text, 0).show();
    }
}
