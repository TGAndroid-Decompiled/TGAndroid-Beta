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
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class ts0 extends AnimatorListenerAdapter {

    public final int f43002a;

    public final PhotoViewer f43003b;

    public ts0(PhotoViewer photoViewer, int i10) {
        this.f43003b = photoViewer;
        this.f43002a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        au0 au0Var;
        PhotoViewer photoViewer = this.f43003b;
        int i10 = photoViewer.f35731q4;
        if (i10 == 1) {
            photoViewer.f35802y1.a();
            uf.n nVar = photoViewer.f35802y1.f28602b;
            nVar.d = null;
            nVar.F = false;
            photoViewer.Q0.setVisibility(8);
            photoViewer.f35802y1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.f35802y1.f28602b.f48626a;
            cropAreaView.f26357j0 = 0.0f;
            cropAreaView.f26358k0 = 1.0f;
            cropAreaView.f26359l0 = 0.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i10 == 2) {
            try {
                photoViewer.f35583a0.removeView(photoViewer.E1);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            photoViewer.E1 = null;
        } else if (i10 == 3) {
            photoViewer.H1.n0(false);
            try {
                photoViewer.f35583a0.removeView(photoViewer.H1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.H1 = null;
        } else if (i10 == 4) {
            photoViewer.K1 = true;
            photoViewer.f35583a0.invalidate();
            photoViewer.f35583a0.post(new ff0(29, this, photoViewer.J1));
            photoViewer.J1 = null;
            photoViewer.f35741r5.m(false, true);
            photoViewer.f35751s5.m(false, true);
        } else if (i10 == 5) {
            photoViewer.f35696m5.setVisibility(8);
            org.telegram.ui.Components.we0 we0Var = photoViewer.f35696m5;
            we0Var.d = null;
            we0Var.f34166a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f35689l6 = null;
        int i11 = photoViewer.f35731q4;
        photoViewer.f35731q4 = this.f43002a;
        photoViewer.f1().H.b(photoViewer.f35731q4 != 0);
        lh.a4 a4Var = photoViewer.G1;
        if (a4Var != null) {
            a4Var.b(photoViewer.f35731q4 != 3);
        }
        if (photoViewer.f35731q4 != 3) {
            photoViewer.V5 = 0.0f;
        }
        if (photoViewer.Y1 == 1) {
            photoViewer.f35802y1.setVisibility(0);
        }
        if (photoViewer.Y1 == 11 && (i11 == 3 || i11 == 2 || i11 == 1 || i11 == 4)) {
            photoViewer.Y5 = photoViewer.f35616d6;
            photoViewer.Z5 = photoViewer.f35626e6;
            photoViewer.f35587a6 = photoViewer.f35636f6;
            photoViewer.f35597b6 = photoViewer.f35645g6;
        } else {
            float fR2 = photoViewer.r2(false);
            photoViewer.f35587a6 = fR2;
            photoViewer.W5 = fR2;
            photoViewer.w3(fR2);
            photoViewer.Y5 = 0.0f;
            photoViewer.Z5 = 0.0f;
        }
        photoViewer.f35681k6 = -1;
        photoViewer.f35583a0.invalidate();
        fu0 fu0Var = photoViewer.f35627e7;
        if (fu0Var != null) {
            PhotoViewer photoViewer2 = fu0Var.d;
            photoViewer2.d = fu0Var.f38208c;
            WindowManager.LayoutParams layoutParams = photoViewer2.Z;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f35601c0.setFocusable(false);
            photoViewer2.f35583a0.setFocusable(false);
            photoViewer2.H0.setAlpha(255);
            photoViewer2.f35583a0.setAlpha(1.0f);
            ArrayList arrayList = fu0Var.f38207b;
            int i12 = fu0Var.f38206a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i12, fu0Var.f38208c.E((MessageObject) arrayList.get(i12), null, fu0Var.f38206a, true, false));
            photoViewer.f35627e7 = null;
            kt0 kt0Var = new kt0();
            kt0Var.f39885c = false;
            photoViewer.k3(false, false, kt0Var);
            photoViewer.k3(true, true, kt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        ag.w wVar = photoViewer.L0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(wVar, (Property<ag.w, Float>) property, 0.0f));
        ag.w wVar2 = photoViewer.L0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(wVar2, (Property<ag.w, Float>) property2, 1.0f));
        zf.n2 n2Var = photoViewer.f35688l5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, (Property<zf.n2, Float>) property2, 1.0f));
        }
        jh.a3 a3Var = photoViewer.f35715o5;
        if (a3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(a3Var, (Property<jh.a3, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<org.telegram.ui.Components.wo0, Float>) property, 0.0f));
        if (photoViewer.Y1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.B, (Property<ag.d2, Float>) property, 0.0f));
        }
        if (photoViewer.f35622e2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.M1, (Property<qt0, Float>) property, 0.0f));
        }
        int i13 = photoViewer.Y1;
        if (i13 == 0 || i13 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.J0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i13 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35802y1, (Property<org.telegram.ui.Components.ge0, Float>) property2, 1.0f));
        }
        if (photoViewer.f35584a1.getTag() != null) {
            photoViewer.f35584a1.setVisibility(photoViewer.Z1 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35584a1, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
        }
        if (photoViewer.f35592b1.getTag() != null) {
            photoViewer.f35592b1.setVisibility((!photoViewer.Z1 && photoViewer.F4 && ((au0Var = photoViewer.d) == null || au0Var.N())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35592b1, (Property<org.telegram.ui.Components.r80, Float>) property2, 1.0f));
        }
        if (photoViewer.f35602c1.getTag() != null) {
            photoViewer.f35602c1.setVisibility(photoViewer.Z1 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35602c1, (Property<xr0, Float>) property2, 1.0f));
        }
        View view = photoViewer.f35630f0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35630f0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ss0(this, i11));
        animatorSet.start();
    }
}
