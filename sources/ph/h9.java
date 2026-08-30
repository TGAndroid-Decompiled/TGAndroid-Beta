package ph;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.nr;
public final class h9 extends c5 {
    public boolean f41719w2;
    public final da f41720x2;

    public h9(da daVar, Context context, boolean z4, File file, boolean z10, boolean z11, ca caVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, u6 u6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, nh.b bVar, k5 k5Var, s9 s9Var) {
        super(context, z4, file, z10, z11, caVar, activity, i10, bitmap, bitmap2, i11, arrayList, u6Var, i12, i13, cropState, baVar, bVar, k5Var, s9Var);
        this.f41720x2 = daVar;
    }

    @Override
    public final void B(boolean z4) {
        da daVar = this.f41720x2;
        daVar.l1.a(true, z4, daVar.f41490f0);
    }

    @Override
    public final void C() {
        da daVar = this.f41720x2;
        daVar.f41531s1.O0(false);
        daVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = daVar.Z0.animate().alpha(0.0f).setDuration(180L);
        nr nrVar = nr.f27347g;
        duration.setInterpolator(nrVar).start();
        if (daVar.f41483d0 != 2) {
            daVar.V0.clearAnimation();
            daVar.V0.animate().alpha(0.0f).setDuration(180L).setInterpolator(nrVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z4, boolean z10) {
        long j10;
        da daVar = this.f41720x2;
        if (z4) {
            daVar.f41510m1.setVisibility(0);
            daVar.f41510m1.setAlpha(0.0f);
            daVar.f41510m1.clearAnimation();
            daVar.f41510m1.animate().alpha(1.0f).setDuration(180L).setInterpolator(nr.f27347g).start();
            return;
        }
        daVar.f41510m1.a(false, z10);
        daVar.f41510m1.clearAnimation();
        ViewPropertyAnimator interpolator = daVar.f41510m1.animate().alpha(0.0f).withEndAction(new org.telegram.ui.web.o0(this, 27)).setDuration(180L).setInterpolator(nr.f27347g);
        if (z10) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final boolean f0(hm hmVar) {
        da daVar = this.f41720x2;
        Activity activity = daVar.f41475b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    daVar.f41541v2 = hmVar;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                daVar.f41541v2 = hmVar;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void g(boolean z4) {
        boolean z10;
        da daVar = this.f41720x2;
        daVar.l1.b(daVar.Z0.getText());
        g5 g5Var = daVar.l1;
        if (z4 && this.f41719w2) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5Var.a(false, z10, null);
    }

    @Override
    public final void h(boolean z4) {
        float f10;
        dg.j jVar;
        if (!p()) {
            z4 = false;
        }
        da daVar = this.f41720x2;
        daVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = daVar.Z0.animate();
        float f11 = 0.0f;
        if (daVar.f41483d0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        nr nrVar = nr.f27347g;
        duration.setInterpolator(nrVar).start();
        daVar.V0.clearAnimation();
        ViewPropertyAnimator animate2 = daVar.V0.animate();
        int i10 = daVar.f41483d0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(nrVar).start();
        V0(false, z4);
        if (z4 && (jVar = this.G0) != null) {
            C0(jVar);
        }
        T0();
        this.f41342i2 = true;
        this.f41719w2 = false;
    }

    @Override
    public final void j() {
        this.f41719w2 = false;
        V0(p(), false);
        this.f41720x2.l1.a(false, false, null);
    }

    @Override
    public final void k() {
        this.f41719w2 = true;
        this.f41720x2.f41531s1.O0(false);
        V0(false, false);
    }

    @Override
    public final void m(boolean z4) {
        this.f41720x2.f41510m1.a(z4, false);
    }

    @Override
    public final void r0() {
        da daVar = this.f41720x2;
        daVar.Z0.f41809f.d();
        daVar.l0(0, false, true);
        dg.j jVar = this.G0;
        if ((jVar instanceof dg.b4) && !this.H0) {
            dg.b4 b4Var = (dg.b4) jVar;
            this.H0 = true;
            b4Var.q();
            View focusedView = b4Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void y() {
        this.f41720x2.f41531s1.O0(false);
    }

    @Override
    public final void z0(boolean z4) {
        da daVar = this.f41720x2;
        s9 s9Var = daVar.U0;
        if (s9Var != null) {
            s9Var.x(6, z4);
            eg.i0 i0Var = daVar.f41494g1;
            if (i0Var != null) {
                ((mg0) i0Var.f5302c).a(daVar.U0.k(), true);
            }
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            t9Var.f41804b0 = z4;
            t9Var.I.b(z4);
        }
    }
}
