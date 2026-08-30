package xg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.voip.v2;
public final class b implements xd.b {
    public final xd.c f46975a;
    public final xd.c f46976b;
    public final xd.a f46977c;
    public final xd.a d;
    public final v2 e;
    public final a f46978f;
    public boolean h;

    public b(v2 v2Var, a aVar) {
        nr nrVar = nr.h;
        this.f46975a = new xd.c(1, this, nrVar, 350L);
        this.f46976b = new xd.c(2, this, nrVar, 350L);
        this.f46977c = new xd.a(0, this, nrVar, 350L, true);
        this.d = new xd.a(3, this, nrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f46978f = aVar;
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.f46975a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.f46976b.e);
        }
        xd.a aVar = this.d;
        xd.a aVar2 = this.f46977c;
        if (i10 == 0) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
            v2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            v2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            v2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            v2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.e) * aVar2.e);
        }
        a aVar3 = this.f46978f;
        if (aVar3 != null) {
            aVar3.run();
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
