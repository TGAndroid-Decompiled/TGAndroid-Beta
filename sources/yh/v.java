package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v implements Runnable {
    public final int f52114a;
    public final Object f52115b;
    public final Object f52116c;
    public final Object d;
    public final Object f52117e;
    public final Object f52118f;

    public v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f52114a = i10;
        this.f52116c = obj;
        this.d = obj2;
        this.f52117e = obj3;
        this.f52118f = obj4;
        this.f52115b = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: yh.v.run():void");
    }

    public v(u5 u5Var, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i10) {
        this.f52114a = i10;
        this.f52116c = u5Var;
        this.f52115b = tL_error;
        this.d = callback2;
        this.f52117e = tLObject;
        this.f52118f = tL_inputInvoiceStars;
    }

    public v(u5 u5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f52114a = 5;
        this.f52116c = u5Var;
        this.f52117e = b2Var;
        this.d = tLObject;
        this.f52118f = inputSavedStarGift;
        this.f52115b = callback;
    }
}
