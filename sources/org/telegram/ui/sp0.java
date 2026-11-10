package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f49909a;
    public final PhotoViewer f49910b;

    public sp0(PhotoViewer photoViewer, int i7) {
        this.f49910b = photoViewer;
        this.f49909a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7;
        xq0 xq0Var;
        int i10;
        boolean z10;
        PhotoViewer photoViewer = this.f49910b;
        int i11 = photoViewer.f41517t4;
        int i12 = 8;
        if (i11 == 1) {
            photoViewer.C1.a();
            og.o oVar = photoViewer.C1.f33527b;
            oVar.d = null;
            oVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f33527b.f21012a;
            cropAreaView.f31332n0 = 0.0f;
            cropAreaView.f31333o0 = 1.0f;
            cropAreaView.f31334p0 = 0.0f;
            cropAreaView.f31335q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i11 == 2) {
            try {
                photoViewer.f41382e0.removeView(photoViewer.I1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.I1 = null;
        } else if (i11 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f41382e0.removeView(photoViewer.L1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.L1 = null;
        } else if (i11 == 4) {
            photoViewer.O1 = true;
            photoViewer.f41382e0.invalidate();
            photoViewer.f41382e0.post(new tn0(5, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f41526u5.m(false, true);
            photoViewer.f41535v5.m(false, true);
        } else if (i11 == 5) {
            photoViewer.f41481p5.setVisibility(8);
            org.telegram.ui.Components.ud0 ud0Var = photoViewer.f41481p5;
            ud0Var.d = null;
            ud0Var.f38624a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f41473o6 = null;
        int i13 = photoViewer.f41517t4;
        photoViewer.f41517t4 = this.f49909a;
        fi.q3 q3Var = photoViewer.a1().L;
        if (photoViewer.f41517t4 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        q3Var.b(z9);
        fi.q3 q3Var2 = photoViewer.K1;
        if (q3Var2 != null) {
            if (photoViewer.f41517t4 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            q3Var2.b(z10);
        }
        if (photoViewer.f41517t4 != 3) {
            photoViewer.Y5 = 0.0f;
        }
        if (photoViewer.f41366c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f41366c2 == 11 && (i13 == 3 || i13 == 2 || i13 == 1 || i13 == 4)) {
            photoViewer.f41360b6 = photoViewer.f41407g6;
            photoViewer.f41370c6 = photoViewer.f41416h6;
            photoViewer.f41378d6 = photoViewer.f41424i6;
            photoViewer.f41388e6 = photoViewer.f41431j6;
        } else {
            float o22 = photoViewer.o2(false);
            photoViewer.f41378d6 = o22;
            photoViewer.Z5 = o22;
            photoViewer.t3(o22);
            photoViewer.f41360b6 = 0.0f;
            photoViewer.f41370c6 = 0.0f;
        }
        photoViewer.f41465n6 = -1;
        photoViewer.f41382e0.invalidate();
        br0 br0Var = photoViewer.h7;
        if (br0Var != null) {
            PhotoViewer photoViewer2 = br0Var.d;
            photoViewer2.d = br0Var.f44121c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f41373d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f41401g0.setFocusable(false);
            photoViewer2.f41382e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f41382e0.setAlpha(1.0f);
            ArrayList arrayList = br0Var.f44120b;
            int i14 = br0Var.f44119a;
            photoViewer2.X1(null, null, null, null, arrayList, null, null, i14, br0Var.f44121c.E((org.telegram.messenger.ij) arrayList.get(i14), null, br0Var.f44119a, true, false));
            photoViewer.h7 = null;
            iq0 iq0Var = new iq0();
            iq0Var.f46722c = false;
            photoViewer.h3(false, false, iq0Var);
            photoViewer.h3(true, true, iq0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bi.m5 m5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(m5Var, property, 0.0f));
        bi.m5 m5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(m5Var2, property2, 1.0f));
        tg.c2 c2Var = photoViewer.f41472o5;
        if (c2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(c2Var, property2, 1.0f));
        }
        di.b3 b3Var = photoViewer.f41500r5;
        if (b3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(b3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f41366c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f41420i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i15 = photoViewer.f41366c2;
        if (i15 != 0 && i15 != 4) {
            if (i15 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f41383e1.getTag() != null) {
            org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f41383e1;
            if (photoViewer.d2) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            f0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41383e1, property2, 1.0f));
        }
        if (photoViewer.f41393f1.getTag() != null) {
            org.telegram.ui.Components.y70 y70Var = photoViewer.f41393f1;
            if (!photoViewer.d2 && photoViewer.I4 && ((xq0Var = photoViewer.d) == null || xq0Var.O())) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            y70Var.setVisibility(i7);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41393f1, property2, 1.0f));
        }
        if (photoViewer.f41402g1.getTag() != null) {
            ap0 ap0Var = photoViewer.f41402g1;
            if (!photoViewer.d2) {
                i12 = 0;
            }
            ap0Var.setVisibility(i12);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41402g1, property2, 1.0f));
        }
        View view = photoViewer.f41426j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41426j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new rp0(this, i13));
        animatorSet.start();
    }
}
