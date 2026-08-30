package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f45884a;
    public final p f45885b;
    public final a f45886c;

    public f(p pVar, a aVar, int i10) {
        this.f45884a = i10;
        this.f45885b = pVar;
        this.f45886c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45884a;
        a aVar = this.f45886c;
        p pVar = this.f45885b;
        switch (i10) {
            case 0:
                r3 r3Var = pVar.f46059r;
                View z12 = r3Var.z1(aVar);
                if (z12 instanceof i4) {
                    ((i4) z12).h(aVar, r3Var.getMapDelegate());
                    return;
                } else {
                    r3Var.V2.N(false);
                    return;
                }
            case 1:
                pVar.f46059r.W4(aVar, 0);
                return;
            case 2:
                pVar.f46059r.W4(aVar, 1);
                return;
            case 3:
                pVar.f46059r.W4(aVar, 2);
                return;
            case 4:
                pVar.f46059r.W4(aVar, 3);
                return;
            case 5:
                pVar.f46059r.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                r3 r3Var2 = pVar.f46059r;
                ArrayList arrayList = r3.f46106p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                r3Var2.U4(this.f45886c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                r3 r3Var3 = pVar.f46059r;
                ArrayList arrayList2 = r3.f46106p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                r3Var3.U4(this.f45886c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                pVar.f46059r.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                pVar.f46059r.V4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
