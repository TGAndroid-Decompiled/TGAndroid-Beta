package zg;

import android.graphics.Rect;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import xf.g0;
public final class d {
    public final c f48106b;
    public final c f48107c;
    public long e;
    public final RenderNode f48105a = ah.b.k();
    public final Rect d = new Rect();

    public d(e eVar) {
        int i10;
        if (eVar.f48108a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f48107c = cVar;
            cVar.e = 4;
            cVar.f48101f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), g0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f48106b = cVar2;
            cVar2.e = 8;
            cVar2.f48101f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (eVar.f48110c) {
            c cVar3 = new c(eVar, "blur", 0, false);
            this.f48106b = cVar3;
            boolean z10 = eVar.f48109b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            cVar3.e = i10;
            cVar3.f48101f = i11;
            cVar3.d(AndroidUtilities.dpf2(40.0f), g0.b());
            this.f48107c = null;
        } else {
            c cVar4 = new c(eVar, "blur", 1, false);
            this.f48106b = cVar4;
            cVar4.e = 8;
            cVar4.f48101f = 8;
            cVar4.c(AndroidUtilities.dpf2(40.0f));
            cVar4.e(g0.b());
            this.f48107c = null;
        }
    }
}
