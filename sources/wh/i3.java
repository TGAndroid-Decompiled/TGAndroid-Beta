package wh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 {
    public final int f49786a;
    public final int f49787b;
    public final int f49788c;
    public final int d;
    public final r3 f49789e;

    public i3(r3 r3Var, int i10, int i11, int i12, int i13) {
        this.f49789e = r3Var;
        this.f49786a = i10;
        this.f49787b = i11;
        this.f49788c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock L1;
        r3 r3Var = this.f49789e;
        ArrayList arrayList = r3Var.f49987i3;
        int i11 = this.f49786a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = r3Var.f49987i3;
        int i12 = this.f49787b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f49616b;
        TL_iv.PageBlock pageBlock2 = aVar2.f49616b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock L12 = r3.L1(r3Var, aVar, this.f49788c, i10);
        if (i11 == i12) {
            L1 = null;
        } else {
            L1 = r3.L1(r3Var, aVar2, 0, i13);
        }
        if (L12 != null) {
            aVar.f49616b = L12;
        }
        if (L1 != null) {
            aVar2.f49616b = L1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = r3Var.Y2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = r3Var.A2(i11, i12);
            ArrayList<TLRPC.Document> z22 = r3Var.z2(i11, i12);
            aVar.f49616b = pageBlock;
            aVar2.f49616b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f49616b = pageBlock;
            aVar2.f49616b = pageBlock2;
            throw th2;
        }
    }
}
