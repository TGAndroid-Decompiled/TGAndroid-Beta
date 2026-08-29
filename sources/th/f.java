package th;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f48429a;
    public final p f48430b;
    public final a f48431c;

    public f(p pVar, a aVar, int i10) {
        this.f48429a = i10;
        this.f48430b = pVar;
        this.f48431c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f48429a;
        a aVar = this.f48431c;
        p pVar = this.f48430b;
        switch (i10) {
            case 0:
                p3 p3Var = pVar.f48623r;
                View z12 = p3Var.z1(aVar);
                if (z12 instanceof g4) {
                    ((g4) z12).h(aVar, p3Var.getMapDelegate());
                    return;
                } else {
                    p3Var.U2.N(false);
                    return;
                }
            case 1:
                pVar.f48623r.W4(aVar, 0);
                return;
            case 2:
                pVar.f48623r.W4(aVar, 1);
                return;
            case 3:
                pVar.f48623r.W4(aVar, 2);
                return;
            case 4:
                pVar.f48623r.W4(aVar, 3);
                return;
            case 5:
                pVar.f48623r.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                p3 p3Var2 = pVar.f48623r;
                ArrayList arrayList = p3.f48633o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                p3Var2.U4(this.f48431c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                p3 p3Var3 = pVar.f48623r;
                ArrayList arrayList2 = p3.f48633o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                p3Var3.U4(this.f48431c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                pVar.f48623r.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                pVar.f48623r.V4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
