package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.lj0;
public final class d7 extends AnimatorListenerAdapter {
    public final int f48352a;
    public final u7 f48353b;

    public d7(u7 u7Var, int i10) {
        this.f48352a = i10;
        this.f48353b = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a3 t10;
        lj0 lj0Var;
        switch (this.f48352a) {
            case 0:
                super.onAnimationEnd(animator);
                u7 u7Var = this.f48353b;
                r7 r7Var = u7Var.f48959s0;
                j7 j7Var = u7Var.v;
                if (j7Var != null) {
                    j7Var.a(true);
                }
                u7Var.o();
                u7Var.J0.unlock();
                n5 n5Var = u7Var.f48964u1;
                if (n5Var != null) {
                    n5Var.b();
                    AndroidUtilities.removeFromParent(u7Var.f48964u1);
                    u7Var.f48964u1 = null;
                }
                ImageReceiver imageReceiver = r7Var.f48842b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    r7Var.f48842b = null;
                }
                ImageReceiver imageReceiver2 = r7Var.f48843c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    r7Var.f48843c.setVisible(true, true);
                }
                if (r7Var.d != null && (t10 = u7Var.t()) != null && (lj0Var = t10.f48196o1.d) != null) {
                    lj0 lj0Var2 = r7Var.d;
                    lj0Var2.getClass();
                    lj0Var2.f25001c = lj0Var.f25001c;
                    lj0Var2.f25002f = lj0Var.f25002f;
                    lj0Var2.f25000b = lj0Var.f25000b;
                    lj0Var2.f24999a = System.currentTimeMillis();
                    lj0Var2.c();
                }
                k2.v vVar = u7Var.G0;
                if (vVar != null) {
                    vVar.b();
                }
                SurfaceView surfaceView = u7Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                u7Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new k5(this, 8));
                } catch (Exception unused) {
                }
                u7Var.m0 = false;
                u7Var.d = false;
                j2 j2Var = u7Var.f48950o1;
                if (j2Var != null) {
                    j2Var.run();
                    u7Var.f48950o1 = null;
                    return;
                }
                return;
            case 1:
                u7 u7Var2 = this.f48353b;
                a3 a3Var = null;
                u7Var2.H = null;
                u7Var2.Z = 0.0f;
                u7Var2.f48927d0 = 0.0f;
                k7 k7Var = u7Var2.f48947n0;
                if (k7Var != null) {
                    a3Var = k7Var.getCurrentPeerView();
                }
                if (a3Var != null) {
                    a3Var.invalidate();
                    return;
                }
                return;
            default:
                u7 u7Var3 = this.f48353b;
                r7 r7Var2 = u7Var3.f48959s0;
                u7Var3.U = 1.0f;
                u7Var3.o();
                u7.f48915x1 = false;
                j7 j7Var2 = u7Var3.v;
                if (j7Var2 != null) {
                    j7Var2.a(true);
                }
                i7 i7Var = u7Var3.f48958s;
                if (i7Var != null) {
                    i7Var.invalidate();
                }
                ImageReceiver imageReceiver3 = r7Var2.f48842b;
                if (imageReceiver3 != null && !u7Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    r7Var2.f48842b = null;
                }
                ImageReceiver imageReceiver4 = r7Var2.f48843c;
                if (imageReceiver4 != null && !u7Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    r7Var2.f48843c.setVisible(true, true);
                    r7Var2.f48843c = null;
                }
                a3 t11 = u7Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                t0 t0Var = u7Var3.A0;
                if (t0Var != null) {
                    t0Var.v((1.0f - u7Var3.V) * u7Var3.U);
                }
                if (u7Var3.f48969w1) {
                    u7Var3.f48969w1 = false;
                    u7Var3.p();
                    AndroidUtilities.runOnUIThread(new j2(u7Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (u7Var3.f48964u1 == null && u7Var3.v != null) {
                        n5 n5Var2 = new n5(u7Var3.v.getContext(), u7Var3.f48958s);
                        u7Var3.f48964u1 = n5Var2;
                        n5Var2.setAlpha(0.0f);
                        u7Var3.v.addView(u7Var3.f48964u1);
                    }
                    n5 n5Var3 = u7Var3.f48964u1;
                    if (n5Var3 != null) {
                        n5Var3.setOnClickListener(new org.telegram.ui.web.c(this, 28));
                        u7Var3.f48964u1.animate().alpha(1.0f).setDuration(150L).setListener(new n7(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                u7Var3.P();
                u7Var3.J0.unlock();
                return;
        }
    }
}
