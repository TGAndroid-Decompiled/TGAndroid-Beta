package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g implements Runnable {
    public final int f45981a;
    public final q f45982b;
    public final a f45983c;

    public g(q qVar, a aVar, int i10) {
        this.f45981a = i10;
        this.f45982b = qVar;
        this.f45983c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45981a;
        a aVar = this.f45983c;
        q qVar = this.f45982b;
        switch (i10) {
            case 0:
                s3 s3Var = qVar.f46156r;
                View y12 = s3Var.y1(aVar);
                if (y12 instanceof j4) {
                    ((j4) y12).h(aVar, s3Var.getMapDelegate());
                    return;
                } else {
                    s3Var.V2.N(false);
                    return;
                }
            case 1:
                qVar.f46156r.V4(aVar, 0);
                return;
            case 2:
                qVar.f46156r.V4(aVar, 1);
                return;
            case 3:
                qVar.f46156r.V4(aVar, 2);
                return;
            case 4:
                qVar.f46156r.V4(aVar, 3);
                return;
            case 5:
                qVar.f46156r.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                s3 s3Var2 = qVar.f46156r;
                ArrayList arrayList = s3.f46203p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.T4(this.f45983c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                s3 s3Var3 = qVar.f46156r;
                ArrayList arrayList2 = s3.f46203p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var3.T4(this.f45983c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                qVar.f46156r.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                qVar.f46156r.U4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
