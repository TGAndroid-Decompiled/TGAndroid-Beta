package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u implements Runnable {
    public final int f52038a;
    public final Object f52039b;
    public final Object f52040c;
    public final Object d;
    public final Object f52041e;
    public final Object f52042f;

    public u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f52038a = i10;
        this.f52040c = obj;
        this.d = obj2;
        this.f52041e = obj3;
        this.f52042f = obj4;
        this.f52039b = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: yh.u.run():void");
    }

    public u(t5 t5Var, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i10) {
        this.f52038a = i10;
        this.f52040c = t5Var;
        this.f52039b = tL_error;
        this.d = callback2;
        this.f52041e = tLObject;
        this.f52042f = tL_inputInvoiceStars;
    }

    public u(t5 t5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f52038a = 5;
        this.f52040c = t5Var;
        this.f52041e = b2Var;
        this.d = tLObject;
        this.f52042f = inputSavedStarGift;
        this.f52039b = callback;
    }
}
