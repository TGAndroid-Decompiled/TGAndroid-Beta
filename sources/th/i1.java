package th;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 implements Runnable {
    public final int f48485a;
    public final x1 f48486b;
    public final a f48487c;

    public i1(x1 x1Var, a aVar, int i10) {
        this.f48485a = i10;
        this.f48486b = x1Var;
        this.f48487c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48485a;
        a aVar = this.f48487c;
        x1 x1Var = this.f48486b;
        switch (i10) {
            case 0:
                p3 p3Var = x1Var.L;
                ArrayList arrayList = p3.f48633o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                p3Var.U4(this.f48487c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                x1Var.L.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                x1Var.L.V4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                x1Var.L.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                p3 p3Var2 = x1Var.L;
                ArrayList arrayList2 = p3.f48633o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                p3Var2.U4(this.f48487c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                x1Var.L.W4(aVar, 0);
                return;
            case 6:
                x1Var.L.W4(aVar, 1);
                return;
            case 7:
                x1Var.L.W4(aVar, 2);
                return;
            case 8:
                x1Var.L.W4(aVar, 3);
                return;
            default:
                View z12 = x1Var.L.z1(aVar);
                if (z12 instanceof g4) {
                    ((g4) z12).h(aVar, x1Var.L.getMapDelegate());
                    return;
                } else {
                    x1Var.L.U2.N(false);
                    return;
                }
        }
    }
}
