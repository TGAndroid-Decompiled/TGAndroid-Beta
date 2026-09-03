package vh;

import org.telegram.tgnet.tl.TL_iv;
public final class v5 {
    public final TL_iv.PageBlock f46313a;
    public final int f46314b;
    public final int f46315c;
    public final boolean d;
    public final boolean e;

    public v5(TL_iv.PageBlock pageBlock, int i10, int i11) {
        this(pageBlock, i10, i11, false, false);
    }

    public v5(TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        this.f46313a = pageBlock;
        this.f46314b = i10;
        this.f46315c = i11;
        this.d = z4;
        this.e = z10;
    }
}
