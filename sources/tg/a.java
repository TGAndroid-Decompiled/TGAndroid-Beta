package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.voip.u2;
import ud.c;

public final class a implements ud.b {

    public final c f48221a;

    public final c f48222b;

    public final ud.a f48223c;
    public final ud.a d;

    public final u2 f48224e;

    public final qf.b f48225f;
    public boolean h;

    public a(u2 u2Var, qf.b bVar) {
        er erVar = er.h;
        this.f48221a = new c(1, this, erVar, 350L);
        this.f48222b = new c(2, this, erVar, 350L);
        this.f48223c = new ud.a(0, this, erVar, 350L, true);
        this.d = new ud.a(3, this, erVar, 350L, true);
        this.h = true;
        this.f48224e = u2Var;
        this.f48225f = bVar;
    }

    @Override
    public final void o(int i10, float f10, float f11, c cVar) {
        u2 u2Var = this.f48224e;
        if (i10 == 1) {
            u2Var.setTranslationX(this.f48221a.f48502e);
        }
        if (i10 == 2) {
            u2Var.setTranslationY(this.f48222b.f48502e);
        }
        ud.a aVar = this.d;
        ud.a aVar2 = this.f48223c;
        if (i10 == 0) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f48497e) * aVar2.f48497e);
            u2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            u2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            u2Var.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        if (i10 == 3) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f48497e) * aVar2.f48497e);
        }
        qf.b bVar = this.f48225f;
        if (bVar != null) {
            bVar.run();
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
