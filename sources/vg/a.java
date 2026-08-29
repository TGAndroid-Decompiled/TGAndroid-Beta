package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.web.t1;
import vd.c;
public final class a implements vd.b {
    public final c f49598a;
    public final c f49599b;
    public final vd.a f49600c;
    public final vd.a d;
    public final x2 f49601e;
    public final t1 f49602f;
    public boolean h;

    public a(x2 x2Var, t1 t1Var) {
        jr jrVar = jr.h;
        this.f49598a = new c(1, this, jrVar, 350L);
        this.f49599b = new c(2, this, jrVar, 350L);
        this.f49600c = new vd.a(0, this, jrVar, 350L, true);
        this.d = new vd.a(3, this, jrVar, 350L, true);
        this.h = true;
        this.f49601e = x2Var;
        this.f49602f = t1Var;
    }

    @Override
    public final void N(int i10, float f9, float f10, c cVar) {
        int i11;
        x2 x2Var = this.f49601e;
        if (i10 == 1) {
            x2Var.setTranslationX(this.f49598a.f49510e);
        }
        if (i10 == 2) {
            x2Var.setTranslationY(this.f49599b.f49510e);
        }
        vd.a aVar = this.d;
        vd.a aVar2 = this.f49600c;
        if (i10 == 0) {
            x2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f49505e) * aVar2.f49505e);
            x2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f9));
            x2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f9));
            if (f9 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            x2Var.setVisibility(i11);
        }
        if (i10 == 3) {
            x2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f49505e) * aVar2.f49505e);
        }
        t1 t1Var = this.f49602f;
        if (t1Var != null) {
            t1Var.run();
        }
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
