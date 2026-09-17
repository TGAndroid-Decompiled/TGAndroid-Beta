package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class rf0 implements Runnable {
    public final int f37217a;
    public final Object f37218b;
    public final Object f37219c;
    public final Object d;

    public rf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f37217a = i10;
        this.f37218b = callback;
        this.f37219c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rf0.run():void");
    }

    public rf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37217a = i10;
        this.f37218b = obj;
        this.d = obj2;
        this.f37219c = obj3;
    }
}
