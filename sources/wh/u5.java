package wh;

import org.telegram.tgnet.tl.TL_iv;
public final class u5 {
    public final TL_iv.PageBlock f50084a;
    public final int f50085b;
    public final int f50086c;
    public final boolean d;
    public final boolean f50087e;

    public u5(TL_iv.PageBlock pageBlock, int i10, int i11) {
        this(pageBlock, i10, i11, false, false);
    }

    public u5(TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        this.f50084a = pageBlock;
        this.f50085b = i10;
        this.f50086c = i11;
        this.d = z4;
        this.f50087e = z10;
    }
}
