package yg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.voip.w2;
import wh.v1;
import xd.c;
public final class a implements xd.b {
    public final c f50948a;
    public final c f50949b;
    public final xd.a f50950c;
    public final xd.a d;
    public final w2 f50951e;
    public final v1 f50952f;
    public boolean h;

    public a(w2 w2Var, v1 v1Var) {
        pr prVar = pr.h;
        this.f50948a = new c(1, this, prVar, 350L);
        this.f50949b = new c(2, this, prVar, 350L);
        this.f50950c = new xd.a(0, this, prVar, 350L, true);
        this.d = new xd.a(3, this, prVar, 350L, true);
        this.h = true;
        this.f50951e = w2Var;
        this.f50952f = v1Var;
    }

    @Override
    public final void L(int i10, float f10, float f11, c cVar) {
        int i11;
        w2 w2Var = this.f50951e;
        if (i10 == 1) {
            w2Var.setTranslationX(this.f50948a.f50510e);
        }
        if (i10 == 2) {
            w2Var.setTranslationY(this.f50949b.f50510e);
        }
        xd.a aVar = this.d;
        xd.a aVar2 = this.f50950c;
        if (i10 == 0) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f50505e) * aVar2.f50505e);
            w2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            w2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            w2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            w2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f50505e) * aVar2.f50505e);
        }
        v1 v1Var = this.f50952f;
        if (v1Var != null) {
            v1Var.run();
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
