package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class tf0 implements Runnable {
    public final int f40099a;
    public final Object f40100b;
    public final Object f40101c;
    public final Object d;

    public tf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f40099a = i10;
        this.f40100b = callback;
        this.f40101c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tf0.run():void");
    }

    public tf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40099a = i10;
        this.f40100b = obj;
        this.d = obj2;
        this.f40101c = obj3;
    }
}
