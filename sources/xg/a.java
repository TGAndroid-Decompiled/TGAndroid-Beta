package xg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.voip.v2;
import vh.z1;
import xd.c;
public final class a implements xd.b {
    public final c f47069a;
    public final c f47070b;
    public final xd.a f47071c;
    public final xd.a d;
    public final v2 e;
    public final z1 f47072f;
    public boolean h;

    public a(v2 v2Var, z1 z1Var) {
        mr mrVar = mr.h;
        this.f47069a = new c(1, this, mrVar, 350L);
        this.f47070b = new c(2, this, mrVar, 350L);
        this.f47071c = new xd.a(0, this, mrVar, 350L, true);
        this.d = new xd.a(3, this, mrVar, 350L, true);
        this.h = true;
        this.e = v2Var;
        this.f47072f = z1Var;
    }

    @Override
    public final void L(int i10, float f10, float f11, c cVar) {
        int i11;
        v2 v2Var = this.e;
        if (i10 == 1) {
            v2Var.setTranslationX(this.f47069a.e);
        }
        if (i10 == 2) {
            v2Var.setTranslationY(this.f47070b.e);
        }
        xd.a aVar = this.d;
        xd.a aVar2 = this.f47071c;
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
        z1 z1Var = this.f47072f;
        if (z1Var != null) {
            z1Var.run();
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
