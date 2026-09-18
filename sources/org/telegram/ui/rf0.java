package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class rf0 implements Runnable {
    public final int f37222a;
    public final Object f37223b;
    public final Object f37224c;
    public final Object d;

    public rf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f37222a = i10;
        this.f37223b = callback;
        this.f37224c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rf0.run():void");
    }

    public rf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37222a = i10;
        this.f37223b = obj;
        this.d = obj2;
        this.f37224c = obj3;
    }
}
