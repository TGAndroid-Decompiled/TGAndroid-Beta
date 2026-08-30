package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 implements Runnable {
    public final int f45925a;
    public final y1 f45926b;
    public final a f45927c;

    public i1(y1 y1Var, a aVar, int i10) {
        this.f45925a = i10;
        this.f45926b = y1Var;
        this.f45927c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45925a;
        a aVar = this.f45927c;
        y1 y1Var = this.f45926b;
        switch (i10) {
            case 0:
                r3 r3Var = y1Var.M;
                ArrayList arrayList = r3.f46106p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                r3Var.U4(this.f45927c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                y1Var.M.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                y1Var.M.V4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                y1Var.M.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                r3 r3Var2 = y1Var.M;
                ArrayList arrayList2 = r3.f46106p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                r3Var2.U4(this.f45927c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                y1Var.M.W4(aVar, 0);
                return;
            case 6:
                y1Var.M.W4(aVar, 1);
                return;
            case 7:
                y1Var.M.W4(aVar, 2);
                return;
            case 8:
                y1Var.M.W4(aVar, 3);
                return;
            default:
                View z12 = y1Var.M.z1(aVar);
                if (z12 instanceof i4) {
                    ((i4) z12).h(aVar, y1Var.M.getMapDelegate());
                    return;
                } else {
                    y1Var.M.V2.N(false);
                    return;
                }
        }
    }
}
