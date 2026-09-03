package wh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 implements Runnable {
    public final int f49841a;
    public final z1 f49842b;
    public final a f49843c;

    public j1(z1 z1Var, a aVar, int i10) {
        this.f49841a = i10;
        this.f49842b = z1Var;
        this.f49843c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f49841a;
        a aVar = this.f49843c;
        z1 z1Var = this.f49842b;
        switch (i10) {
            case 0:
                r3 r3Var = z1Var.M;
                ArrayList arrayList = r3.f50010p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                r3Var.T4(this.f49843c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                z1Var.M.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                z1Var.M.U4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                z1Var.M.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                r3 r3Var2 = z1Var.M;
                ArrayList arrayList2 = r3.f50010p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                r3Var2.T4(this.f49843c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                z1Var.M.V4(aVar, 0);
                return;
            case 6:
                z1Var.M.V4(aVar, 1);
                return;
            case 7:
                z1Var.M.V4(aVar, 2);
                return;
            case 8:
                z1Var.M.V4(aVar, 3);
                return;
            default:
                View y12 = z1Var.M.y1(aVar);
                if (y12 instanceof i4) {
                    ((i4) y12).h(aVar, z1Var.M.getMapDelegate());
                    return;
                } else {
                    z1Var.M.V2.N(false);
                    return;
                }
        }
    }
}
