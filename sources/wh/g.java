package wh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g implements Runnable {
    public final int f49783a;
    public final q f49784b;
    public final a f49785c;

    public g(q qVar, a aVar, int i10) {
        this.f49783a = i10;
        this.f49784b = qVar;
        this.f49785c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f49783a;
        a aVar = this.f49785c;
        q qVar = this.f49784b;
        switch (i10) {
            case 0:
                r3 r3Var = qVar.f49966r;
                View y12 = r3Var.y1(aVar);
                if (y12 instanceof i4) {
                    ((i4) y12).h(aVar, r3Var.getMapDelegate());
                    return;
                } else {
                    r3Var.V2.N(false);
                    return;
                }
            case 1:
                qVar.f49966r.V4(aVar, 0);
                return;
            case 2:
                qVar.f49966r.V4(aVar, 1);
                return;
            case 3:
                qVar.f49966r.V4(aVar, 2);
                return;
            case 4:
                qVar.f49966r.V4(aVar, 3);
                return;
            case 5:
                qVar.f49966r.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                r3 r3Var2 = qVar.f49966r;
                ArrayList arrayList = r3.f50010p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                r3Var2.T4(this.f49785c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                r3 r3Var3 = qVar.f49966r;
                ArrayList arrayList2 = r3.f50010p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                r3Var3.T4(this.f49785c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                qVar.f49966r.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                qVar.f49966r.U4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
