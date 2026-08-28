package qh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 implements Runnable {
    public final int f46439a;
    public final x1 f46440b;
    public final a f46441c;

    public i1(x1 x1Var, a aVar, int i9) {
        this.f46439a = i9;
        this.f46440b = x1Var;
        this.f46441c = aVar;
    }

    @Override
    public final void run() {
        int i9 = this.f46439a;
        a aVar = this.f46441c;
        x1 x1Var = this.f46440b;
        switch (i9) {
            case 0:
                o3 o3Var = x1Var.L;
                ArrayList arrayList = o3.f46559o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                o3Var.U4(this.f46441c, pageblockpullquote, 0, 0, false, false);
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
                o3 o3Var2 = x1Var.L;
                ArrayList arrayList2 = o3.f46559o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                o3Var2.U4(this.f46441c, pageblockblockquote, 0, 0, false, false);
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
                if (z12 instanceof f4) {
                    ((f4) z12).h(aVar, x1Var.L.getMapDelegate());
                    return;
                } else {
                    x1Var.L.U2.N(false);
                    return;
                }
        }
    }
}
