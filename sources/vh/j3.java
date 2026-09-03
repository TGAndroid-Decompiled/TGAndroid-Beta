package vh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 {
    public final int f46028a;
    public final int f46029b;
    public final int f46030c;
    public final int d;
    public final s3 e;

    public j3(s3 s3Var, int i10, int i11, int i12, int i13) {
        this.e = s3Var;
        this.f46028a = i10;
        this.f46029b = i11;
        this.f46030c = i12;
        this.d = i13;
    }

    public final TL_iv.RichMessage a() {
        int i10;
        TL_iv.PageBlock K1;
        s3 s3Var = this.e;
        ArrayList arrayList = s3Var.f46217i3;
        int i11 = this.f46028a;
        a aVar = (a) arrayList.get(i11);
        ArrayList arrayList2 = s3Var.f46217i3;
        int i12 = this.f46029b;
        a aVar2 = (a) arrayList2.get(i12);
        TL_iv.PageBlock pageBlock = aVar.f45853b;
        TL_iv.PageBlock pageBlock2 = aVar2.f45853b;
        int i13 = this.d;
        if (i11 == i12) {
            i10 = i13;
        } else {
            i10 = -1;
        }
        TL_iv.PageBlock K12 = s3.K1(s3Var, aVar, this.f46030c, i10);
        if (i11 == i12) {
            K1 = null;
        } else {
            K1 = s3.K1(s3Var, aVar2, 0, i13);
        }
        if (K12 != null) {
            aVar.f45853b = K12;
        }
        if (K1 != null) {
            aVar2.f45853b = K1;
        }
        try {
            ArrayList<TL_iv.PageBlock> X2 = s3Var.X2(i11, i12 + 1, 0, false);
            ArrayList<TLRPC.Photo> z22 = s3Var.z2(i11, i12);
            ArrayList<TLRPC.Document> y22 = s3Var.y2(i11, i12);
            aVar.f45853b = pageBlock;
            aVar2.f45853b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = X2;
            richMessage.photos = z22;
            richMessage.documents = y22;
            return richMessage;
        } catch (Throwable th2) {
            aVar.f45853b = pageBlock;
            aVar2.f45853b = pageBlock2;
            throw th2;
        }
    }
}
