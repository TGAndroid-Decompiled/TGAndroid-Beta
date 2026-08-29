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
public final class rs0 extends AnimatorListenerAdapter {
    public final int f42195a;
    public final PhotoViewer f42196b;

    public rs0(PhotoViewer photoViewer, int i10) {
        this.f42196b = photoViewer;
        this.f42195a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        xt0 xt0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f42196b;
        int i12 = photoViewer.f35795q4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.f35866y1.a();
            wf.n nVar = photoViewer.f35866y1.f31657b;
            nVar.d = null;
            nVar.F = false;
            photoViewer.Q0.setVisibility(8);
            photoViewer.f35866y1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.f35866y1.f31657b.f49953a;
            cropAreaView.f26372j0 = 0.0f;
            cropAreaView.f26373k0 = 1.0f;
            cropAreaView.f26374l0 = 0.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f35647a0.removeView(photoViewer.E1);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.E1 = null;
        } else if (i12 == 3) {
            photoViewer.H1.n0(false);
            try {
                photoViewer.f35647a0.removeView(photoViewer.H1.getView());
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            photoViewer.H1 = null;
        } else if (i12 == 4) {
            photoViewer.K1 = true;
            photoViewer.f35647a0.invalidate();
            photoViewer.f35647a0.post(new lf0(26, this, photoViewer.J1));
            photoViewer.J1 = null;
            photoViewer.f35805r5.m(false, true);
            photoViewer.f35814s5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f35759m5.setVisibility(8);
            org.telegram.ui.Components.ff0 ff0Var = photoViewer.f35759m5;
            ff0Var.d = null;
            ff0Var.f28390a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f35752l6 = null;
        int i14 = photoViewer.f35795q4;
        photoViewer.f35795q4 = this.f42195a;
        nh.w3 w3Var = photoViewer.f1().H;
        if (photoViewer.f35795q4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w3Var.b(z10);
        nh.w3 w3Var2 = photoViewer.G1;
        if (w3Var2 != null) {
            if (photoViewer.f35795q4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            w3Var2.b(z11);
        }
        if (photoViewer.f35795q4 != 3) {
            photoViewer.V5 = 0.0f;
        }
        if (photoViewer.Y1 == 1) {
            photoViewer.f35866y1.setVisibility(0);
        }
        if (photoViewer.Y1 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.Y5 = photoViewer.f35679d6;
            photoViewer.Z5 = photoViewer.f35689e6;
            photoViewer.f35652a6 = photoViewer.f35699f6;
            photoViewer.f35662b6 = photoViewer.f35708g6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f35652a6 = r22;
            photoViewer.W5 = r22;
            photoViewer.w3(r22);
            photoViewer.Y5 = 0.0f;
            photoViewer.Z5 = 0.0f;
        }
        photoViewer.f35744k6 = -1;
        photoViewer.f35647a0.invalidate();
        cu0 cu0Var = photoViewer.f35690e7;
        if (cu0Var != null) {
            PhotoViewer photoViewer2 = cu0Var.d;
            photoViewer2.d = cu0Var.f37216c;
            WindowManager.LayoutParams layoutParams = photoViewer2.Z;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f35666c0.setFocusable(false);
            photoViewer2.f35647a0.setFocusable(false);
            photoViewer2.H0.setAlpha(255);
            photoViewer2.f35647a0.setAlpha(1.0f);
            ArrayList arrayList = cu0Var.f37215b;
            int i15 = cu0Var.f37214a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, cu0Var.f37216c.E((MessageObject) arrayList.get(i15), null, cu0Var.f37214a, true, false));
            photoViewer.f35690e7 = null;
            ht0 ht0Var = new ht0();
            ht0Var.f39049c = false;
            photoViewer.k3(false, false, ht0Var);
            photoViewer.k3(true, true, ht0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bg.u1 u1Var = photoViewer.L0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(u1Var, property, 0.0f));
        bg.u1 u1Var2 = photoViewer.L0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(u1Var2, property2, 1.0f));
        bg.u3 u3Var = photoViewer.f35751l5;
        if (u3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(u3Var, property2, 1.0f));
        }
        lh.z2 z2Var = photoViewer.f35778o5;
        if (z2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(z2Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property, 0.0f));
        if (photoViewer.Y1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.B, property, 0.0f));
        }
        if (photoViewer.f35685e2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.M1, property, 0.0f));
        }
        int i16 = photoViewer.Y1;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35866y1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.J0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, property2, 1.0f));
        }
        if (photoViewer.f35648a1.getTag() != null) {
            org.telegram.ui.ActionBar.m0 m0Var = photoViewer.f35648a1;
            if (photoViewer.Z1) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            m0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35648a1, property2, 1.0f));
        }
        if (photoViewer.f35657b1.getTag() != null) {
            org.telegram.ui.Components.a90 a90Var = photoViewer.f35657b1;
            if (!photoViewer.Z1 && photoViewer.F4 && ((xt0Var = photoViewer.d) == null || xt0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            a90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35657b1, property2, 1.0f));
        }
        if (photoViewer.f35667c1.getTag() != null) {
            vr0 vr0Var = photoViewer.f35667c1;
            if (!photoViewer.Z1) {
                i13 = 0;
            }
            vr0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35667c1, property2, 1.0f));
        }
        View view = photoViewer.f35693f0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35693f0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new qs0(this, i14));
        animatorSet.start();
    }
}
