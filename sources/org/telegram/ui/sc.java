package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class sc implements ResultCallback {
    public final int f42353a;
    public final tc f42354b;

    public sc(tc tcVar, int i10) {
        this.f42354b = tcVar;
        this.f42353a = i10;
    }

    @Override
    public final void onComplete(Object obj) {
        NotificationCenter.getInstance(this.f42353a).doOnIdle(new org.telegram.ui.ActionBar.c(23, this, (List) obj));
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f42354b.getContext(), tL_error.text, 0).show();
    }
}
