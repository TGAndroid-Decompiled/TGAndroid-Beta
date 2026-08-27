package rh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public final class i1 implements Runnable {

    public final int f47185a;

    public final x1 f47186b;

    public final a f47187c;

    public i1(x1 x1Var, a aVar, int i10) {
        this.f47185a = i10;
        this.f47186b = x1Var;
        this.f47187c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f47185a;
        a aVar = this.f47187c;
        x1 x1Var = this.f47186b;
        switch (i10) {
            case 0:
                p3 p3Var = x1Var.L;
                ArrayList arrayList = p3.f47334o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                p3Var.U4(this.f47187c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                x1Var.L.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                x1Var.L.V4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                x1Var.L.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                p3 p3Var2 = x1Var.L;
                ArrayList arrayList2 = p3.f47334o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                p3Var2.U4(this.f47187c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                x1Var.L.W4(aVar, 0);
                break;
            case 6:
                x1Var.L.W4(aVar, 1);
                break;
            case 7:
                x1Var.L.W4(aVar, 2);
                break;
            case 8:
                x1Var.L.W4(aVar, 3);
                break;
            default:
                View viewZ1 = x1Var.L.z1(aVar);
                if (!(viewZ1 instanceof g4)) {
                    x1Var.L.U2.N(false);
                } else {
                    ((g4) viewZ1).h(aVar, x1Var.L.getMapDelegate());
                }
                break;
        }
    }
}
