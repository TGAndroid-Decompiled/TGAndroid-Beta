package rh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public final class f implements Runnable {

    public final int f47129a;

    public final p f47130b;

    public final a f47131c;

    public f(p pVar, a aVar, int i10) {
        this.f47129a = i10;
        this.f47130b = pVar;
        this.f47131c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f47129a;
        a aVar = this.f47131c;
        p pVar = this.f47130b;
        switch (i10) {
            case 0:
                p3 p3Var = pVar.f47324r;
                View viewZ1 = p3Var.z1(aVar);
                if (!(viewZ1 instanceof g4)) {
                    p3Var.U2.N(false);
                } else {
                    ((g4) viewZ1).h(aVar, p3Var.getMapDelegate());
                }
                break;
            case 1:
                pVar.f47324r.W4(aVar, 0);
                break;
            case 2:
                pVar.f47324r.W4(aVar, 1);
                break;
            case 3:
                pVar.f47324r.W4(aVar, 2);
                break;
            case 4:
                pVar.f47324r.W4(aVar, 3);
                break;
            case 5:
                pVar.f47324r.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                p3 p3Var2 = pVar.f47324r;
                ArrayList arrayList = p3.f47334o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                p3Var2.U4(this.f47131c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                p3 p3Var3 = pVar.f47324r;
                ArrayList arrayList2 = p3.f47334o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                p3Var3.U4(this.f47131c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                pVar.f47324r.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                pVar.f47324r.V4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
