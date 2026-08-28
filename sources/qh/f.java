package qh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f46370a;
    public final p f46371b;
    public final a f46372c;

    public f(p pVar, a aVar, int i9) {
        this.f46370a = i9;
        this.f46371b = pVar;
        this.f46372c = aVar;
    }

    @Override
    public final void run() {
        int i9 = this.f46370a;
        a aVar = this.f46372c;
        p pVar = this.f46371b;
        switch (i9) {
            case 0:
                o3 o3Var = pVar.f46606r;
                View z12 = o3Var.z1(aVar);
                if (z12 instanceof f4) {
                    ((f4) z12).h(aVar, o3Var.getMapDelegate());
                    return;
                } else {
                    o3Var.U2.N(false);
                    return;
                }
            case 1:
                pVar.f46606r.W4(aVar, 0);
                return;
            case 2:
                pVar.f46606r.W4(aVar, 1);
                return;
            case 3:
                pVar.f46606r.W4(aVar, 2);
                return;
            case 4:
                pVar.f46606r.W4(aVar, 3);
                return;
            case 5:
                pVar.f46606r.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                o3 o3Var2 = pVar.f46606r;
                ArrayList arrayList = o3.f46559o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                o3Var2.U4(this.f46372c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                o3 o3Var3 = pVar.f46606r;
                ArrayList arrayList2 = o3.f46559o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                o3Var3.U4(this.f46372c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                pVar.f46606r.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                pVar.f46606r.V4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
