package tg;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import e0.f0;
import org.telegram.messenger.i0;
public final class e {
    public final d f48721b;
    public final d f48722c;
    public long e;
    public final RenderNode f48720a = w.n();
    public final Rect d = new Rect();

    public e(f fVar) {
        int i10;
        boolean z10 = fVar.f48723a;
        boolean z11 = fVar.f48725c;
        if (z10) {
            if (z11) {
                d dVar = new d(fVar, "glass", 0, true);
                this.f48722c = dVar;
                dVar.e = 4;
                dVar.f48716f = 4;
                dVar.d(i0.N(6.0f), f0.d());
            } else {
                d dVar2 = new d(fVar, "glass", 1, true);
                this.f48722c = dVar2;
                dVar2.e = 4;
                dVar2.f48716f = 4;
                dVar2.c(i0.N(6.0f));
                dVar2.e(f0.d());
            }
            d dVar3 = new d(fVar, "blur", 0, false);
            this.f48721b = dVar3;
            dVar3.e = 8;
            dVar3.f48716f = 8;
            dVar3.c(i0.N(38.34f));
        } else if (z11) {
            d dVar4 = new d(fVar, "blur", 0, false);
            this.f48721b = dVar4;
            boolean z12 = fVar.f48724b;
            if (z12) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z12 ? 16 : 8;
            dVar4.e = i10;
            dVar4.f48716f = i11;
            dVar4.d(i0.N(40.0f), f0.d());
            this.f48722c = null;
        } else {
            d dVar5 = new d(fVar, "blur", 1, false);
            this.f48721b = dVar5;
            dVar5.e = 8;
            dVar5.f48716f = 8;
            dVar5.c(i0.N(40.0f));
            dVar5.e(f0.d());
            this.f48722c = null;
        }
    }

    public static void a(e eVar, RectF rectF) {
        Rect rect = eVar.d;
        float f7 = rectF.left;
        float f10 = 16;
        rect.left = Math.round(f7 - (f7 % f10));
        float f11 = rectF.top;
        rect.top = Math.round(f11 - (f11 % f10));
        float f12 = rectF.right;
        rect.right = Math.round((f10 - (f12 % f10)) + f12);
        float f13 = rectF.bottom;
        rect.bottom = Math.round((f10 - (f13 % f10)) + f13);
    }
}
