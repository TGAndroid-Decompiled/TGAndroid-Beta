package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class z0 implements c20 {
    public final int f51411a;

    public z0(int i7) {
        this.f51411a = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51411a) {
            case 0:
                View view = (View) obj;
                if (view instanceof g) {
                    ((g) view).setChecked(false);
                    return;
                }
                return;
            case 1:
                ((View) obj).invalidate();
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }
}
