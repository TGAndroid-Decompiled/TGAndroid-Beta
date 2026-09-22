package s4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.xs;
public class j extends f1 {
    public static TimeInterpolator E;
    public Interpolator f42728o;
    public final ArrayList f42729p = new ArrayList();
    public final ArrayList f42730q = new ArrayList();
    public final ArrayList f42731r = new ArrayList();
    public final ArrayList f42732s = new ArrayList();
    public final ArrayList f42733t = new ArrayList();
    public final ArrayList f42734u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f42735w = new ArrayList();
    public final ArrayList f42736x = new ArrayList();
    public final ArrayList f42737y = new ArrayList();
    public final ArrayList f42738z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z10 = BuildVars.DEBUG_VERSION;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final h hVar) {
        View view;
        j jVar;
        final h hVar2;
        c1 c1Var = hVar.f42716a;
        View view2 = null;
        if (c1Var == null) {
            view = null;
        } else {
            view = c1Var.f42671a;
        }
        c1 c1Var2 = hVar.f42717b;
        if (c1Var2 != null) {
            view2 = c1Var2.f42671a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f42754g).setStartDelay(0L);
            arrayList.add(hVar.f42716a);
            startDelay.translationX(hVar.e - hVar.f42718c);
            startDelay.translationY(hVar.f42719f - hVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final j f42689b;

                {
                    this.f42689b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            c1 c1Var3 = hVar.f42716a;
                            this.f42689b.O();
                            return;
                        default:
                            c1 c1Var4 = hVar.f42717b;
                            this.f42689b.O();
                            return;
                    }
                }
            });
            jVar = this;
            hVar2 = hVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f42757k).setListener(new g(jVar, hVar2, startDelay, view, 0)).start();
        } else {
            jVar = this;
            hVar2 = hVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(hVar2.f42717b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(jVar.f42753f).setStartDelay(i() - jVar.f42753f).setInterpolator(jVar.f42757k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final j f42689b;

                {
                    this.f42689b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            c1 c1Var3 = hVar2.f42716a;
                            this.f42689b.O();
                            return;
                        default:
                            c1 c1Var4 = hVar2.f42717b;
                            this.f42689b.O();
                            return;
                    }
                }
            });
            animate.setListener(new g(jVar, hVar2, animate, view3, 1)).start();
        }
    }

    public void C(c1 c1Var, i iVar) {
        int i10 = iVar.f42723b;
        int i11 = iVar.f42724c;
        int i12 = iVar.d;
        int i13 = iVar.e;
        View view = c1Var.f42671a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f42738z.add(c1Var);
        animate.setUpdateListener(new ai.x(28, this, c1Var));
        Interpolator interpolator = this.f42728o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f42755i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new xs(this, c1Var, i14, view, i15, animate, 1)).start();
    }

    public void D(c1 c1Var) {
        View view = c1Var.f42671a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(c1Var);
        if (this.f42758l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f42758l).setInterpolator(this.f42756j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new c(this, c1Var, 0));
        animate.setListener(new f(this, c1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c1) arrayList.get(size)).f42671a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f42735w.clear();
            this.f42736x.clear();
        }
    }

    public final void H(ArrayList arrayList, c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            if (J(hVar, c1Var) && hVar.f42716a == null && hVar.f42717b == null) {
                arrayList.remove(hVar);
            }
        }
    }

    public final void I(h hVar) {
        c1 c1Var = hVar.f42716a;
        if (c1Var != null) {
            J(hVar, c1Var);
        }
        c1 c1Var2 = hVar.f42717b;
        if (c1Var2 != null) {
            J(hVar, c1Var2);
        }
    }

    public boolean J(h hVar, c1 c1Var) {
        if (hVar.f42717b == c1Var) {
            hVar.f42717b = null;
        } else if (hVar.f42716a == c1Var) {
            hVar.f42716a = null;
        } else {
            return false;
        }
        View view = c1Var.f42671a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(c1Var);
        return true;
    }

    public long K(long j3, long j10, long j11) {
        return Math.max(j10, j11) + j3;
    }

    public long L() {
        return this.d;
    }

    public final void R(c1 c1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        c1Var.f42671a.animate().setInterpolator(E);
        f(c1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(c1 c1Var, List list) {
        if (list.isEmpty() && !t(c1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(c1 c1Var) {
        View view = c1Var.f42671a;
        view.animate().cancel();
        ArrayList arrayList = this.f42731r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((i) arrayList.get(size)).f42722a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        H(this.f42732s, c1Var);
        if (this.f42729p.remove(c1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(c1Var);
        }
        if (this.f42730q.remove(c1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(c1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, c1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f42734u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((i) arrayList5.get(size4)).f42722a == c1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(c1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f42733t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(c1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f42737y.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f42738z.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f42731r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = (i) arrayList.get(size);
            View view = iVar.f42722a.f42671a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(iVar.f42722a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f42729p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((c1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f42730q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c1 c1Var = (c1) arrayList3.get(size3);
            View view2 = c1Var.f42671a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(c1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f42732s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((h) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f42734u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                i iVar2 = (i) arrayList6.get(size6);
                View view3 = iVar2.f42722a.f42671a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(iVar2.f42722a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f42733t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                c1 c1Var2 = (c1) arrayList8.get(size8);
                View view4 = c1Var2.f42671a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(c1Var2);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.v;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                I((h) arrayList10.get(size10));
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        E(this.A);
        E(this.f42738z);
        E(this.f42737y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f42730q.isEmpty() && this.f42732s.isEmpty() && this.f42731r.isEmpty() && this.f42729p.isEmpty() && this.f42738z.isEmpty() && this.A.isEmpty() && this.f42737y.isEmpty() && this.B.isEmpty() && this.f42734u.isEmpty() && this.f42733t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j3;
        long j10;
        ArrayList arrayList = this.f42729p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f42731r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f42732s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f42730q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                D((c1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f42734u.add(arrayList5);
                arrayList2.clear();
                e eVar = new e(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((i) arrayList5.get(0)).f42722a.f42671a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.i0.f41839a;
                    view.postOnAnimationDelayed(eVar, L);
                } else {
                    eVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.v.add(arrayList6);
                arrayList3.clear();
                e eVar2 = new e(this, arrayList6, 1);
                if (this.C && !isEmpty) {
                    View view2 = ((h) arrayList6.get(0)).f42716a.f42671a;
                    long j11 = this.d;
                    WeakHashMap weakHashMap2 = r0.i0.f41839a;
                    view2.postOnAnimationDelayed(eVar2, j11);
                } else {
                    eVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f42733t.add(arrayList7);
                arrayList4.clear();
                e eVar3 = new e(this, arrayList7, 2);
                if (this.C && (!isEmpty || !isEmpty2 || !isEmpty3)) {
                    long j12 = 0;
                    if (!isEmpty) {
                        j3 = this.d;
                    } else {
                        j3 = 0;
                    }
                    if (!isEmpty2) {
                        j10 = j();
                    } else {
                        j10 = 0;
                    }
                    if (!isEmpty3) {
                        j12 = i();
                    }
                    long K = K(j3, j10, j12);
                    View view3 = ((c1) arrayList7.get(0)).f42671a;
                    WeakHashMap weakHashMap3 = r0.i0.f41839a;
                    view3.postOnAnimationDelayed(eVar3, K);
                    return;
                }
                eVar3.run();
            }
        }
    }

    @Override
    public void p(c1 c1Var) {
        R(c1Var);
        View view = c1Var.f42671a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f42730q.add(c1Var);
        F();
    }

    @Override
    public boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        if (c1Var == c1Var2) {
            return r(c1Var, q0Var, i10, i11, i12, i13);
        }
        View view = c1Var.f42671a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(c1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.f42671a;
        R(c1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f42732s.add(new h(c1Var, c1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.f42671a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c1Var.f42671a.getTranslationY());
        R(c1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(c1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f42731r.add(new i(c1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override
    public void s(c1 c1Var, b2.q0 q0Var) {
        R(c1Var);
        this.f42729p.add(c1Var);
        F();
    }

    public void F() {
    }

    public void M() {
    }

    public void N() {
    }

    public void O() {
    }

    public void Q() {
    }

    public void P(c1 c1Var) {
    }

    public void z(c1 c1Var) {
    }
}
