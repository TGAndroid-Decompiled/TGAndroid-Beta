package th;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 {
    public final int f48453a;
    public final int f48454b;
    public final int f48455c;
    public final int d;
    public final p3 f48456e;

    public g3(p3 p3Var, int i10, int i11, int i12, int i13) {
        this.f48456e = p3Var;
        this.f48453a = i10;
        this.f48454b = i11;
        this.f48455c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock L1;
        p3 p3Var = this.f48456e;
        ArrayList arrayList = p3Var.f48646h3;
        int i11 = this.f48453a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = p3Var.f48646h3;
        int i12 = this.f48454b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f48328b;
        TL_iv.PageBlock pageBlock2 = aVar2.f48328b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock L12 = p3.L1(p3Var, aVar, this.f48455c, i10);
        if (i11 == i12) {
            L1 = null;
        } else {
            L1 = p3.L1(p3Var, aVar2, 0, i13);
        }
        if (L12 != null) {
            aVar.f48328b = L12;
        }
        if (L1 != null) {
            aVar2.f48328b = L1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = p3Var.Y2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = p3Var.A2(i11, i12);
            ArrayList<TLRPC.Document> z22 = p3Var.z2(i11, i12);
            aVar.f48328b = pageBlock;
            aVar2.f48328b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f48328b = pageBlock;
            aVar2.f48328b = pageBlock2;
            throw th2;
        }
    }
}
