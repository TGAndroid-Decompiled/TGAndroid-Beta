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
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pr;
public final class f9 extends b5 {
    public boolean f45334w2;
    public final ca f45335x2;

    public f9(ca caVar, Context context, boolean z4, File file, boolean z10, boolean z11, ba baVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, s6 s6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar2, oh.b bVar, i5 i5Var, q9 q9Var) {
        super(context, z4, file, z10, z11, baVar, activity, i10, bitmap, bitmap2, i11, arrayList, s6Var, i12, i13, cropState, baVar2, bVar, i5Var, q9Var);
        this.f45335x2 = caVar;
    }

    @Override
    public final void B(boolean z4) {
        ca caVar = this.f45335x2;
        caVar.l1.a(true, z4, caVar.f45093f0);
    }

    @Override
    public final void C() {
        ca caVar = this.f45335x2;
        caVar.f45134s1.O0(false);
        caVar.Z0.clearAnimation();
        ViewPropertyAnimator duration = caVar.Z0.animate().alpha(0.0f).setDuration(180L);
        pr prVar = pr.f30184g;
        duration.setInterpolator(prVar).start();
        if (caVar.f45085d0 != 2) {
            caVar.V0.clearAnimation();
            caVar.V0.animate().alpha(0.0f).setDuration(180L).setInterpolator(prVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z4, boolean z10) {
        long j10;
        ca caVar = this.f45335x2;
        if (z4) {
            caVar.f45113m1.setVisibility(0);
            caVar.f45113m1.setAlpha(0.0f);
            caVar.f45113m1.clearAnimation();
            caVar.f45113m1.animate().alpha(1.0f).setDuration(180L).setInterpolator(pr.f30184g).start();
            return;
        }
        caVar.f45113m1.a(false, z10);
        caVar.f45113m1.clearAnimation();
        ViewPropertyAnimator interpolator = caVar.f45113m1.animate().alpha(0.0f).withEndAction(new org.telegram.ui.web.s0(this, 28)).setDuration(180L).setInterpolator(pr.f30184g);
        if (z10) {
            j10 = 500;
        } else {
            j10 = 0;
        }
        interpolator.setStartDelay(j10).start();
    }

    @Override
    public final boolean f0(jm jmVar) {
        ca caVar = this.f45335x2;
        Activity activity = caVar.f45077b;
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    caVar.f45144v2 = jmVar;
                    return false;
                }
                return true;
            } else if (i10 >= 23 && activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                caVar.f45144v2 = jmVar;
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
        ca caVar = this.f45335x2;
        caVar.l1.b(caVar.Z0.getText());
        f5 f5Var = caVar.l1;
        if (z4 && this.f45334w2) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5Var.a(false, z10, null);
    }

    @Override
    public final void i(boolean z4) {
        float f10;
        eg.j jVar;
        if (!q()) {
            z4 = false;
        }
        ca caVar = this.f45335x2;
        caVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = caVar.Z0.animate();
        float f11 = 0.0f;
        if (caVar.f45085d0 == -1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator duration = animate.alpha(f10).setDuration(180L);
        pr prVar = pr.f30184g;
        duration.setInterpolator(prVar).start();
        caVar.V0.clearAnimation();
        ViewPropertyAnimator animate2 = caVar.V0.animate();
        int i10 = caVar.f45085d0;
        animate2.alpha((i10 == -1 || i10 == 2) ? 1.0f : 1.0f).setDuration(180L).setInterpolator(prVar).start();
        V0(false, z4);
        if (z4 && (jVar = this.G0) != null) {
            C0(jVar);
        }
        T0();
        this.f44961i2 = true;
        this.f45334w2 = false;
    }

    @Override
    public final void k() {
        this.f45334w2 = false;
        V0(q(), false);
        this.f45335x2.l1.a(false, false, null);
    }

    @Override
    public final void l() {
        this.f45334w2 = true;
        this.f45335x2.f45134s1.O0(false);
        V0(false, false);
    }

    @Override
    public final void n(boolean z4) {
        this.f45335x2.f45113m1.a(z4, false);
    }

    @Override
    public final void r0() {
        ca caVar = this.f45335x2;
        caVar.Z0.f45517f.d();
        caVar.l0(0, false, true);
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
        this.f45335x2.f45134s1.O0(false);
    }

    @Override
    public final void z0(boolean z4) {
        ca caVar = this.f45335x2;
        q9 q9Var = caVar.U0;
        if (q9Var != null) {
            q9Var.x(6, z4);
            fg.i0 i0Var = caVar.f45097g1;
            if (i0Var != null) {
                ((og0) i0Var.f6337c).a(caVar.U0.k(), true);
            }
        }
        r9 r9Var = caVar.Z0;
        if (r9Var != null) {
            r9Var.f45511b0 = z4;
            r9Var.I.b(z4);
        }
    }
}
