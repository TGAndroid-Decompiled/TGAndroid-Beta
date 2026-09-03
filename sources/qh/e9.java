package qh;

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
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pr;
public final class e9 extends a5 {
    public boolean f45308w2;
    public final ba f45309x2;

    public e9(ba baVar, Context context, boolean z4, File file, boolean z10, boolean z11, aa aaVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, r6 r6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar2, oh.b bVar, h5 h5Var, p9 p9Var) {
        super(context, z4, file, z10, z11, aaVar, activity, i10, bitmap, bitmap2, i11, arrayList, r6Var, i12, i13, cropState, baVar2, bVar, h5Var, p9Var);
        this.f45309x2 = baVar;
    }

    @Override
    public final void B(boolean z4) {
        ba baVar = this.f45309x2;
        baVar.l1.a(true, z4, baVar.f45059f0);
    }

    @Override
    public final void C() {
        ba baVar = this.f45309x2;
        baVar.f45100s1.O0(false);
        baVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = baVar.Z0.animate().alpha(0.0f).setDuration(180L);
        pr prVar = pr.f30169g;
        duration.setInterpolator(prVar).start();
        if (baVar.f45051d0 != 2) {
            baVar.V0.clearAnimation();
            baVar.V0.animate().alpha(0.0f).setDuration(180L).setInterpolator(prVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z4, boolean z10) {
        long j10;
        ba baVar = this.f45309x2;
        if (z4) {
            baVar.f45079m1.setVisibility(0);
            baVar.f45079m1.setAlpha(0.0f);
            baVar.f45079m1.clearAnimation();
            baVar.f45079m1.animate().alpha(1.0f).setDuration(180L).setInterpolator(pr.f30169g).start();
            return;
        }
        baVar.f45079m1.a(false, z10);
        baVar.f45079m1.clearAnimation();
        ViewPropertyAnimator interpolator = baVar.f45079m1.animate().alpha(0.0f).withEndAction(new org.telegram.ui.web.s0(this, 28)).setDuration(180L).setInterpolator(pr.f30169g);
        if (z10) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final boolean f0(im imVar) {
        ba baVar = this.f45309x2;
        Activity activity = baVar.f45043b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    baVar.f45110v2 = imVar;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                baVar.f45110v2 = imVar;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void h(boolean z4) {
        boolean z10;
        ba baVar = this.f45309x2;
        baVar.l1.b(baVar.Z0.getText());
        e5 e5Var = baVar.l1;
        if (z4 && this.f45308w2) {
            z10 = true;
        } else {
            z10 = false;
        }
        e5Var.a(false, z10, null);
    }

    @Override
    public final void i(boolean z4) {
        float f10;
        eg.j jVar;
        if (!q()) {
            z4 = false;
        }
        ba baVar = this.f45309x2;
        baVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = baVar.Z0.animate();
        float f11 = 0.0f;
        if (baVar.f45051d0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        pr prVar = pr.f30169g;
        duration.setInterpolator(prVar).start();
        baVar.V0.clearAnimation();
        ViewPropertyAnimator animate2 = baVar.V0.animate();
        int i10 = baVar.f45051d0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(prVar).start();
        V0(false, z4);
        if (z4 && (jVar = this.G0) != null) {
            C0(jVar);
        }
        T0();
        this.f44938i2 = true;
        this.f45308w2 = false;
    }

    @Override
    public final void k() {
        this.f45308w2 = false;
        V0(q(), false);
        this.f45309x2.l1.a(false, false, null);
    }

    @Override
    public final void l() {
        this.f45308w2 = true;
        this.f45309x2.f45100s1.O0(false);
        V0(false, false);
    }

    @Override
    public final void n(boolean z4) {
        this.f45309x2.f45079m1.a(z4, false);
    }

    @Override
    public final void r0() {
        ba baVar = this.f45309x2;
        baVar.Z0.f45574f.d();
        baVar.l0(0, false, true);
        eg.j jVar = this.G0;
        if ((jVar instanceof eg.z3) && !this.H0) {
            eg.z3 z3Var = (eg.z3) jVar;
            this.H0 = true;
            z3Var.q();
            View focusedView = z3Var.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    @Override
    public final void y() {
        this.f45309x2.f45100s1.O0(false);
    }

    @Override
    public final void z0(boolean z4) {
        ba baVar = this.f45309x2;
        p9 p9Var = baVar.U0;
        if (p9Var != null) {
            p9Var.x(6, z4);
            fg.i0 i0Var = baVar.f45063g1;
            if (i0Var != null) {
                ((og0) i0Var.f6337c).a(baVar.U0.k(), true);
            }
        }
        q9 q9Var = baVar.Z0;
        if (q9Var != null) {
            q9Var.f45568b0 = z4;
            q9Var.I.b(z4);
        }
    }
}
