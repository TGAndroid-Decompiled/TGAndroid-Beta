package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 implements Runnable {
    public final int f46022a;
    public final y1 f46023b;
    public final a f46024c;

    public j1(y1 y1Var, a aVar, int i10) {
        this.f46022a = i10;
        this.f46023b = y1Var;
        this.f46024c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f46022a;
        a aVar = this.f46024c;
        y1 y1Var = this.f46023b;
        switch (i10) {
            case 0:
                s3 s3Var = y1Var.M;
                ArrayList arrayList = s3.f46203p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var.T4(this.f46024c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                y1Var.M.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                y1Var.M.U4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                y1Var.M.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                s3 s3Var2 = y1Var.M;
                ArrayList arrayList2 = s3.f46203p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.T4(this.f46024c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                y1Var.M.V4(aVar, 0);
                return;
            case 6:
                y1Var.M.V4(aVar, 1);
                return;
            case 7:
                y1Var.M.V4(aVar, 2);
                return;
            case 8:
                y1Var.M.V4(aVar, 3);
                return;
            default:
                View y12 = y1Var.M.y1(aVar);
                if (y12 instanceof j4) {
                    ((j4) y12).h(aVar, y1Var.M.getMapDelegate());
                    return;
                } else {
                    y1Var.M.V2.N(false);
                    return;
                }
        }
    }
}
