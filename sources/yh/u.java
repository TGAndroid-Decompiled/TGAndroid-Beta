package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u implements Runnable {
    public final int f52039a;
    public final Object f52040b;
    public final Object f52041c;
    public final Object d;
    public final Object f52042e;
    public final Object f52043f;

    public u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f52039a = i10;
        this.f52041c = obj;
        this.d = obj2;
        this.f52042e = obj3;
        this.f52043f = obj4;
        this.f52040b = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: yh.u.run():void");
    }

    public u(t5 t5Var, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i10) {
        this.f52039a = i10;
        this.f52041c = t5Var;
        this.f52040b = tL_error;
        this.d = callback2;
        this.f52042e = tLObject;
        this.f52043f = tL_inputInvoiceStars;
    }

    public u(t5 t5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f52039a = 5;
        this.f52041c = t5Var;
        this.f52042e = b2Var;
        this.d = tLObject;
        this.f52043f = inputSavedStarGift;
        this.f52040b = callback;
    }
}
