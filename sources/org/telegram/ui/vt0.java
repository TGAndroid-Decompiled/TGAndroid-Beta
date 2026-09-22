package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class vt0 extends AnimatorListenerAdapter {
    public final int f38621a;
    public final PhotoViewer f38622b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.f38622b = photoViewer;
        this.f38621a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        bv0 bv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f38622b;
        int i12 = photoViewer.f31386u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f24217b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f24217b.f14307a;
            cropAreaView.f22257n0 = 0.0f;
            cropAreaView.f22258o0 = 1.0f;
            cropAreaView.f22259p0 = 0.0f;
            cropAreaView.f22260q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f31242e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f31242e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f31242e0.invalidate();
            photoViewer.f31242e0.post(new fj0(23, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f31396v5.m(false, true);
            photoViewer.f31406w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31350q5.setVisibility(8);
            org.telegram.ui.Components.vf0 vf0Var = photoViewer.f31350q5;
            vf0Var.d = null;
            vf0Var.f29064a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31342p6 = null;
        int i14 = photoViewer.f31386u4;
        photoViewer.f31386u4 = this.f38621a;
        ci.j4 j4Var = photoViewer.f1().L;
        if (photoViewer.f31386u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4Var.b(z10);
        ci.j4 j4Var2 = photoViewer.K1;
        if (j4Var2 != null) {
            if (photoViewer.f31386u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            j4Var2.b(z11);
        }
        if (photoViewer.f31386u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f31226c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f31226c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f31230c6 = photoViewer.f31274h6;
            photoViewer.f31239d6 = photoViewer.f31283i6;
            photoViewer.f31248e6 = photoViewer.f31291j6;
            photoViewer.f31257f6 = photoViewer.f31300k6;
        } else {
            float q22 = photoViewer.q2(false);
            photoViewer.f31248e6 = q22;
            photoViewer.f31210a6 = q22;
            photoViewer.v3(q22);
            photoViewer.f31230c6 = 0.0f;
            photoViewer.f31239d6 = 0.0f;
        }
        photoViewer.f31334o6 = -1;
        photoViewer.f31242e0.invalidate();
        gv0 gv0Var = photoViewer.f31284i7;
        if (gv0Var != null) {
            PhotoViewer photoViewer2 = gv0Var.d;
            photoViewer2.d = gv0Var.f34009c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f31233d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f31259g0.setFocusable(false);
            photoViewer2.f31242e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f31242e0.setAlpha(1.0f);
            ArrayList arrayList = gv0Var.f34008b;
            int i15 = gv0Var.f34007a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, gv0Var.f34009c.E((MessageObject) arrayList.get(i15), null, gv0Var.f34007a, true, false));
            photoViewer.f31284i7 = null;
            lu0 lu0Var = new lu0();
            lu0Var.f35553c = false;
            photoViewer.j3(false, false, lu0Var);
            photoViewer.j3(true, true, lu0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        t5 t5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var, property, 0.0f));
        t5 t5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var2, property2, 1.0f));
        qg.n2 n2Var = photoViewer.p5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, property2, 1.0f));
        }
        ai.n4 n4Var = photoViewer.f31369s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f31226c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f31279i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f31226c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f31243e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f31243e1;
            if (photoViewer.f31235d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31243e1, property2, 1.0f));
        }
        if (photoViewer.f31252f1.getTag() != null) {
            org.telegram.ui.Components.p90 p90Var = photoViewer.f31252f1;
            if (!photoViewer.f31235d2 && photoViewer.J4 && ((bv0Var = photoViewer.d) == null || bv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            p90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31252f1, property2, 1.0f));
        }
        if (photoViewer.f31260g1.getTag() != null) {
            zs0 zs0Var = photoViewer.f31260g1;
            if (!photoViewer.f31235d2) {
                i13 = 0;
            }
            zs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31260g1, property2, 1.0f));
        }
        View view = photoViewer.f31286j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31286j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ut0(this, i14));
        animatorSet.start();
    }
}
