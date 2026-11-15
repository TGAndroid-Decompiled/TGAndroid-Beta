package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import org.telegram.ui.ActionBar.t1;
public final class t implements w, org.telegram.ui.ActionBar.q1, o0 {
    public final int f54397a;
    public final Serializable f54398b;
    public final Object f54399c;

    public t(int i7, Serializable serializable, Object obj) {
        this.f54397a = i7;
        this.f54399c = obj;
        this.f54398b = serializable;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        vf.c.q((Context) this.f54399c, Uri.parse((String) this.f54398b), true, false);
    }

    @Override
    public void mo26run() {
        switch (this.f54397a) {
            case 0:
                ((x) this.f54399c).a((byte[]) this.f54398b);
                return;
            default:
                ((WidgetEngineBackend) this.f54399c).lambda$send$10((byte[]) this.f54398b);
                return;
        }
    }

    @Override
    public Object run() {
        r0 r0Var = (r0) this.f54399c;
        byte[] bArr = (byte[]) this.f54398b;
        synchronized (r0Var) {
            if (bArr != null) {
                try {
                    if (r0Var.f54391e.size() + bArr.length <= 16777216) {
                        r0Var.f54391e.write(bArr, 0, bArr.length);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            r0Var.f54391e.reset();
            throw new IllegalStateException("Widget engine: argument too large");
        }
        return null;
    }
}
