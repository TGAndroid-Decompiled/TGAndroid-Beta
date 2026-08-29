package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class xe0 implements Runnable {
    public final int f44575a;
    public final Object f44576b;
    public final Object f44577c;
    public final Object d;

    public xe0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f44575a = i10;
        this.f44576b = callback;
        this.f44577c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.run():void");
    }

    public xe0(Object obj, Object obj2, Object obj3, int i10) {
        this.f44575a = i10;
        this.f44576b = obj;
        this.d = obj2;
        this.f44577c = obj3;
    }
}
