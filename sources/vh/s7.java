package vh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.s9;
public final class s7 extends b4 {
    public boolean f51934i2;
    public final o8 f51935j2;

    public s7(o8 o8Var, Context context, boolean z10, File file, boolean z11, boolean z12, n8 n8Var, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, n5 n5Var, int i12, int i13, ye yeVar, s9 s9Var, th.b bVar, j4 j4Var, d8 d8Var) {
        super(context, z10, file, z11, z12, n8Var, activity, i10, bitmap, bitmap2, i11, arrayList, n5Var, i12, i13, yeVar, s9Var, bVar, j4Var, d8Var);
        this.f51935j2 = o8Var;
    }

    @Override
    public final void B(boolean z10) {
        o8 o8Var = this.f51935j2;
        o8Var.f51649o1.a(true, z10, o8Var.f51631i0);
    }

    @Override
    public final void C() {
        o8 o8Var = this.f51935j2;
        o8Var.f51672v1.L0(false);
        o8Var.f51613c1.clearAnimation();
        ViewPropertyAnimator duration = o8Var.f51613c1.animate().alpha(0.0f).setDuration(180L);
        gr grVar = gr.f26496g;
        duration.setInterpolator(grVar).start();
        if (o8Var.f51625g0 != 2) {
            o8Var.Y0.clearAnimation();
            o8Var.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(grVar).start();
        }
        S0(o(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        long j10;
        o8 o8Var = this.f51935j2;
        if (z10) {
            o8Var.f51652p1.setVisibility(0);
            o8Var.f51652p1.setAlpha(0.0f);
            o8Var.f51652p1.clearAnimation();
            o8Var.f51652p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.f26496g).start();
            return;
        }
        o8Var.f51652p1.a(false, z11);
        o8Var.f51652p1.clearAnimation();
        ViewPropertyAnimator interpolator = o8Var.f51652p1.animate().alpha(0.0f).withEndAction(new d0(this, 17)).setDuration(180L).setInterpolator(gr.f26496g);
        if (z11) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final void e(boolean z10) {
        boolean z11;
        o8 o8Var = this.f51935j2;
        o8Var.f51649o1.b(o8Var.f51613c1.getText());
        g4 g4Var = o8Var.f51649o1;
        if (z10 && this.f51934i2) {
            z11 = true;
        } else {
            z11 = false;
        }
        g4Var.a(false, z11, null);
    }

    @Override
    public final void f(boolean z10) {
        float f7;
        jg.j jVar;
        if (!o()) {
            z10 = false;
        }
        o8 o8Var = this.f51935j2;
        o8Var.f51613c1.clearAnimation();
        ViewPropertyAnimator animate = o8Var.f51613c1.animate();
        float f10 = 0.0f;
        if (o8Var.f51625g0 == -1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f7).setDuration(180L);
        gr grVar = gr.f26496g;
        duration.setInterpolator(grVar).start();
        o8Var.Y0.clearAnimation();
        ViewPropertyAnimator animate2 = o8Var.Y0.animate();
        int i10 = o8Var.f51625g0;
        if (i10 == -1 || i10 == 2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).setDuration(180L).setInterpolator(grVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.f50986s0) != null) {
            z0(jVar);
        }
        Q0();
        this.U1 = true;
        this.f51934i2 = false;
    }

    @Override
    public final void g() {
        this.f51934i2 = false;
        S0(o(), false);
        this.f51935j2.f51649o1.a(false, false, null);
    }

    @Override
    public final void h() {
        this.f51934i2 = true;
        this.f51935j2.f51672v1.L0(false);
        S0(false, false);
    }

    @Override
    public final void j(boolean z10) {
        this.f51935j2.f51652p1.a(z10, false);
    }

    @Override
    public final void o0() {
        o8 o8Var = this.f51935j2;
        o8Var.f51613c1.f51340f.d();
        o8Var.k0(0, false, true);
        jg.j jVar = this.f50986s0;
        if ((jVar instanceof jg.g3) && !this.f50988t0) {
            jg.g3 g3Var = (jg.g3) jVar;
            this.f50988t0 = true;
            g3Var.q();
            View focusedView = g3Var.getFocusedView();
            focusedView.requestFocus();
            org.telegram.messenger.i0.J3(focusedView);
        }
    }

    @Override
    public final void w() {
        this.f51935j2.f51672v1.L0(false);
    }

    @Override
    public final void w0(boolean z10) {
        o8 o8Var = this.f51935j2;
        d8 d8Var = o8Var.X0;
        if (d8Var != null) {
            d8Var.x(6, z10);
            kg.f0 f0Var = o8Var.f51635j1;
            if (f0Var != null) {
                ((kf0) f0Var.f11064c).a(o8Var.X0.k(), true);
            }
        }
        e8 e8Var = o8Var.f51613c1;
        if (e8Var != null) {
            e8Var.f51338d0 = z10;
            e8Var.L.b(z10);
        }
    }
}
