package vh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 {
    public final int f45931a;
    public final int f45932b;
    public final int f45933c;
    public final int d;
    public final r3 e;

    public i3(r3 r3Var, int i10, int i11, int i12, int i13) {
        this.e = r3Var;
        this.f45931a = i10;
        this.f45932b = i11;
        this.f45933c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock L1;
        r3 r3Var = this.e;
        ArrayList arrayList = r3Var.f46120i3;
        int i11 = this.f45931a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = r3Var.f46120i3;
        int i12 = this.f45932b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f45775b;
        TL_iv.PageBlock pageBlock2 = aVar2.f45775b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock L12 = r3.L1(r3Var, aVar, this.f45933c, i10);
        if (i11 == i12) {
            L1 = null;
        } else {
            L1 = r3.L1(r3Var, aVar2, 0, i13);
        }
        if (L12 != null) {
            aVar.f45775b = L12;
        }
        if (L1 != null) {
            aVar2.f45775b = L1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = r3Var.Y2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = r3Var.A2(i11, i12);
            ArrayList<TLRPC.Document> z22 = r3Var.z2(i11, i12);
            aVar.f45775b = pageBlock;
            aVar2.f45775b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f45775b = pageBlock;
            aVar2.f45775b = pageBlock2;
            throw th2;
        }
    }
}
