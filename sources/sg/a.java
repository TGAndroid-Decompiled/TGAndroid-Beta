package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.voip.u2;
import pf.o1;
import td.c;
public final class a implements td.b {
    public final c f47572a;
    public final c f47573b;
    public final td.a f47574c;
    public final td.a d;
    public final u2 f47575e;
    public final o1 f47576f;
    public boolean h;

    public a(u2 u2Var, o1 o1Var) {
        gr grVar = gr.h;
        this.f47572a = new c(1, this, grVar, 350L);
        this.f47573b = new c(2, this, grVar, 350L);
        this.f47574c = new td.a(0, this, grVar, 350L, true);
        this.d = new td.a(3, this, grVar, 350L, true);
        this.h = true;
        this.f47575e = u2Var;
        this.f47576f = o1Var;
    }

    @Override
    public final void J0(int i9, float f10, float f11, c cVar) {
        int i10;
        u2 u2Var = this.f47575e;
        if (i9 == 1) {
            u2Var.setTranslationX(this.f47572a.f47780e);
        }
        if (i9 == 2) {
            u2Var.setTranslationY(this.f47573b.f47780e);
        }
        td.a aVar = this.d;
        td.a aVar2 = this.f47574c;
        if (i9 == 0) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f47775e) * aVar2.f47775e);
            u2Var.setScaleX(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            u2Var.setScaleY(AndroidUtilities.lerp(0.3f, 1.0f, f10));
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u2Var.setVisibility(i10);
        }
        if (i9 == 3) {
            u2Var.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, aVar.f47775e) * aVar2.f47775e);
        }
        o1 o1Var = this.f47576f;
        if (o1Var != null) {
            o1Var.run();
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
