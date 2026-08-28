package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class ye0 implements Runnable {
    public final int f44847a;
    public final Object f44848b;
    public final Object f44849c;
    public final Object d;

    public ye0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i9) {
        this.f44847a = i9;
        this.f44848b = callback;
        this.f44849c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye0.run():void");
    }

    public ye0(Object obj, Object obj2, Object obj3, int i9) {
        this.f44847a = i9;
        this.f44848b = obj;
        this.d = obj2;
        this.f44849c = obj3;
    }
}
