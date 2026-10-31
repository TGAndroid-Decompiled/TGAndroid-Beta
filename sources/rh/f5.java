package rh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class f5 implements Runnable {
    public final int f46900a = 0;
    public final boolean f46901b;
    public final long f46902c;
    public final boolean d;
    public final Object e;
    public final Object f46903f;
    public final TLObject h;
    public final TLObject f46904n;
    public final Object f46905r;

    public f5(e6 e6Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, ph.u3 u3Var) {
        this.e = e6Var;
        this.f46903f = zArr;
        this.h = starGift;
        this.f46901b = z10;
        this.d = z11;
        this.f46902c = j10;
        this.f46904n = tL_textWithEntities;
        this.f46905r = u3Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: rh.f5.run():void");
    }

    public f5(vh.o8 o8Var, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, vh.d0 d0Var) {
        this.e = o8Var;
        this.f46903f = tLObject;
        this.h = tL_startLive;
        this.f46901b = z10;
        this.f46902c = j10;
        this.d = z11;
        this.f46904n = tL_error;
        this.f46905r = d0Var;
    }
}
