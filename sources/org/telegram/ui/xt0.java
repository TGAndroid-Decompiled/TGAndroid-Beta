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
public final class xt0 extends AnimatorListenerAdapter {
    public final int f44159a;
    public final PhotoViewer f44160b;

    public xt0(PhotoViewer photoViewer, int i10) {
        this.f44160b = photoViewer;
        this.f44159a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        ev0 ev0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f44160b;
        int i12 = photoViewer.f33885u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f33342b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f33342b.f15318a;
            cropAreaView.f23926n0 = 0.0f;
            cropAreaView.f23927o0 = 1.0f;
            cropAreaView.f23928p0 = 0.0f;
            cropAreaView.f23929q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33741e0.removeView(photoViewer.I1);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33741e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33741e0.invalidate();
            photoViewer.f33741e0.post(new og0(28, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33895v5.m(false, true);
            photoViewer.f33905w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33849q5.setVisibility(8);
            org.telegram.ui.Components.pg0 pg0Var = photoViewer.f33849q5;
            pg0Var.d = null;
            pg0Var.f29494a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33841p6 = null;
        int i14 = photoViewer.f33885u4;
        photoViewer.f33885u4 = this.f44159a;
        ci.h4 h4Var = photoViewer.f1().L;
        if (photoViewer.f33885u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4Var.b(z10);
        ci.h4 h4Var2 = photoViewer.K1;
        if (h4Var2 != null) {
            if (photoViewer.f33885u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            h4Var2.b(z11);
        }
        if (photoViewer.f33885u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33724c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33724c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33728c6 = photoViewer.f33773h6;
            photoViewer.f33737d6 = photoViewer.f33782i6;
            photoViewer.f33747e6 = photoViewer.f33790j6;
            photoViewer.f33756f6 = photoViewer.f33799k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33747e6 = r22;
            photoViewer.f33708a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33728c6 = 0.0f;
            photoViewer.f33737d6 = 0.0f;
        }
        photoViewer.f33833o6 = -1;
        photoViewer.f33741e0.invalidate();
        jv0 jv0Var = photoViewer.f33783i7;
        if (jv0Var != null) {
            PhotoViewer photoViewer2 = jv0Var.d;
            photoViewer2.d = jv0Var.f39288c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33731d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33758g0.setFocusable(false);
            photoViewer2.f33741e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33741e0.setAlpha(1.0f);
            ArrayList arrayList = jv0Var.f39287b;
            int i15 = jv0Var.f39286a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, jv0Var.f39288c.E((MessageObject) arrayList.get(i15), null, jv0Var.f39286a, true, false));
            photoViewer.f33783i7 = null;
            ou0 ou0Var = new ou0();
            ou0Var.f40777c = false;
            photoViewer.k3(false, false, ou0Var);
            photoViewer.k3(true, true, ou0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        w5 w5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(w5Var, property, 0.0f));
        w5 w5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(w5Var2, property2, 1.0f));
        qg.o2 o2Var = photoViewer.p5;
        if (o2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o2Var, property2, 1.0f));
        }
        ai.o4 o4Var = photoViewer.f33868s5;
        if (o4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33724c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33778i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33724c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33742e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33742e1;
            if (photoViewer.f33733d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33742e1, property2, 1.0f));
        }
        if (photoViewer.f33751f1.getTag() != null) {
            org.telegram.ui.Components.ka0 ka0Var = photoViewer.f33751f1;
            if (!photoViewer.f33733d2 && photoViewer.J4 && ((ev0Var = photoViewer.d) == null || ev0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ka0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33751f1, property2, 1.0f));
        }
        if (photoViewer.f33759g1.getTag() != null) {
            bt0 bt0Var = photoViewer.f33759g1;
            if (!photoViewer.f33733d2) {
                i13 = 0;
            }
            bt0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33759g1, property2, 1.0f));
        }
        View view = photoViewer.f33785j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33785j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new wt0(this, i14));
        animatorSet.start();
    }
}
