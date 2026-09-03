package wh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 {
    public final int f49823a;
    public final int f49824b;
    public final int f49825c;
    public final int d;
    public final r3 f49826e;

    public i3(r3 r3Var, int i10, int i11, int i12, int i13) {
        this.f49826e = r3Var;
        this.f49823a = i10;
        this.f49824b = i11;
        this.f49825c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock K1;
        r3 r3Var = this.f49826e;
        ArrayList arrayList = r3Var.f50024i3;
        int i11 = this.f49823a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = r3Var.f50024i3;
        int i12 = this.f49824b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f49653b;
        TL_iv.PageBlock pageBlock2 = aVar2.f49653b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock K12 = r3.K1(r3Var, aVar, this.f49825c, i10);
        if (i11 == i12) {
            K1 = null;
        } else {
            K1 = r3.K1(r3Var, aVar2, 0, i13);
        }
        if (K12 != null) {
            aVar.f49653b = K12;
        }
        if (K1 != null) {
            aVar2.f49653b = K1;
        }
        try {
            ArrayList<TL_iv.PageBlock> X2 = r3Var.X2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> z22 = r3Var.z2(i11, i12);
            ArrayList<TLRPC.Document> y22 = r3Var.y2(i11, i12);
            aVar.f49653b = pageBlock;
            aVar2.f49653b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = X2;
            richMessage.photos = z22;
            richMessage.documents = y22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f49653b = pageBlock;
            aVar2.f49653b = pageBlock2;
            throw th2;
        }
    }
}
