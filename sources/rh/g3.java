package rh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class g3 {

    public final int f47153a;

    public final int f47154b;

    public final int f47155c;
    public final int d;

    public final p3 f47156e;

    public g3(p3 p3Var, int i10, int i11, int i12, int i13) {
        this.f47156e = p3Var;
        this.f47153a = i10;
        this.f47154b = i11;
        this.f47155c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        p3 p3Var = this.f47156e;
        ArrayList arrayList = p3Var.f47348h3;
        int i10 = this.f47153a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = p3Var.f47348h3;
        int i11 = this.f47154b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        TL_iv.PageBlock pageBlock2 = aVar2.f47028b;
        int i12 = this.d;
        TL_iv.PageBlock pageBlockL1 = p3.L1(p3Var, aVar, this.f47155c, i10 == i11 ? i12 : -1);
        TL_iv.PageBlock pageBlockL2 = i10 == i11 ? null : p3.L1(p3Var, aVar2, 0, i12);
        if (pageBlockL1 != null) {
            aVar.f47028b = pageBlockL1;
        }
        if (pageBlockL2 != null) {
            aVar2.f47028b = pageBlockL2;
        }
        try {
            ArrayList<TL_iv.PageBlock> arrayListY2 = p3Var.Y2(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> arrayListA2 = p3Var.A2(i10, i11);
            ArrayList<TLRPC.Document> arrayListZ2 = p3Var.z2(i10, i11);
            aVar.f47028b = pageBlock;
            aVar2.f47028b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = arrayListY2;
            richMessage.photos = arrayListA2;
            richMessage.documents = arrayListZ2;
            return richMessage;
        } catch (Throwable th) {
            aVar.f47028b = pageBlock;
            aVar2.f47028b = pageBlock2;
            throw th;
        }
    }
}
