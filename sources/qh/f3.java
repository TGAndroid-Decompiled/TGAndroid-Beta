package qh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 {
    public final int f46381a;
    public final int f46382b;
    public final int f46383c;
    public final int d;
    public final o3 f46384e;

    public f3(o3 o3Var, int i9, int i10, int i11, int i12) {
        this.f46384e = o3Var;
        this.f46381a = i9;
        this.f46382b = i10;
        this.f46383c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        int i9;
        TL_iv.PageBlock L1;
        o3 o3Var = this.f46384e;
        ArrayList arrayList = o3Var.f46573h3;
        int i10 = this.f46381a;
        a aVar = (a) arrayList.get(i10);
        ArrayList arrayList2 = o3Var.f46573h3;
        int i11 = this.f46382b;
        a aVar2 = (a) arrayList2.get(i11);
        TL_iv.PageBlock pageBlock = aVar.f46269b;
        TL_iv.PageBlock pageBlock2 = aVar2.f46269b;
        int i12 = this.d;
        if (i10 == i11) {
            i9 = i12;
        } else {
            i9 = -1;
        }
        TL_iv.PageBlock L12 = o3.L1(o3Var, aVar, this.f46383c, i9);
        if (i10 == i11) {
            L1 = null;
        } else {
            L1 = o3.L1(o3Var, aVar2, 0, i12);
        }
        if (L12 != null) {
            aVar.f46269b = L12;
        }
        if (L1 != null) {
            aVar2.f46269b = L1;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = o3Var.Y2(i10, i11 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = o3Var.A2(i10, i11);
            ArrayList<TLRPC.Document> z22 = o3Var.z2(i10, i11);
            aVar.f46269b = pageBlock;
            aVar2.f46269b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th) {
            aVar.f46269b = pageBlock;
            aVar2.f46269b = pageBlock2;
            throw th;
        }
    }
}
