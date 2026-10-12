package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class uf0 implements Runnable {
    public final int f40669a;
    public final Object f40670b;
    public final Object f40671c;
    public final Object d;

    public uf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f40669a = i10;
        this.f40670b = callback;
        this.f40671c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uf0.run():void");
    }

    public uf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40669a = i10;
        this.f40670b = obj;
        this.d = obj2;
        this.f40671c = obj3;
    }
}
