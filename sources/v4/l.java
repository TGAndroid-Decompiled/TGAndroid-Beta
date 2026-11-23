package v4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ns;
public class l extends h1 {
    public static TimeInterpolator E;
    public Interpolator f59296o;
    public final ArrayList f59297p = new ArrayList();
    public final ArrayList f59298q = new ArrayList();
    public final ArrayList f59299r = new ArrayList();
    public final ArrayList f59300s = new ArrayList();
    public final ArrayList f59301t = new ArrayList();
    public final ArrayList f59302u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f59303w = new ArrayList();
    public final ArrayList f59304x = new ArrayList();
    public final ArrayList f59305y = new ArrayList();
    public final ArrayList f59306z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z10 = s2.f26829a;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final j jVar) {
        View view;
        l lVar;
        final j jVar2;
        f1 f1Var = jVar.f59283a;
        View view2 = null;
        if (f1Var == null) {
            view = null;
        } else {
            view = f1Var.f59245a;
        }
        f1 f1Var2 = jVar.f59284b;
        if (f1Var2 != null) {
            view2 = f1Var2.f59245a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f59321g).setStartDelay(0L);
            arrayList.add(jVar.f59283a);
            startDelay.translationX(jVar.f59286e - jVar.f59285c);
            startDelay.translationY(jVar.f59287f - jVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f59234b;

                {
                    this.f59234b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            f1 f1Var3 = jVar.f59283a;
                            this.f59234b.O();
                            return;
                        default:
                            f1 f1Var4 = jVar.f59284b;
                            this.f59234b.O();
                            return;
                    }
                }
            });
            lVar = this;
            jVar2 = jVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f59324k).setListener(new i(lVar, jVar2, startDelay, view, 0)).start();
        } else {
            lVar = this;
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f59284b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f59320f).setStartDelay(i() - lVar.f59320f).setInterpolator(lVar.f59324k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f59234b;

                {
                    this.f59234b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            f1 f1Var3 = jVar2.f59283a;
                            this.f59234b.O();
                            return;
                        default:
                            f1 f1Var4 = jVar2.f59284b;
                            this.f59234b.O();
                            return;
                    }
                }
            });
            animate.setListener(new i(lVar, jVar2, animate, view3, 1)).start();
        }
    }

    public void C(f1 f1Var, k kVar) {
        int i7 = kVar.f59293b;
        int i10 = kVar.f59294c;
        int i11 = kVar.d;
        int i12 = kVar.f59295e;
        View view = f1Var.f59245a;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f59306z.add(f1Var);
        animate.setUpdateListener(new f(0, this, f1Var));
        Interpolator interpolator = this.f59296o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f59322i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new ns(this, f1Var, i13, view, i14, animate, 1)).start();
    }

    public void D(f1 f1Var) {
        View view = f1Var.f59245a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(f1Var);
        if (this.f59325l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f59325l).setInterpolator(this.f59323j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new d(this, f1Var, 0));
        animate.setListener(new h(this, f1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f1) arrayList.get(size)).f59245a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f59303w.clear();
            this.f59304x.clear();
        }
    }

    public final void H(ArrayList arrayList, f1 f1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (J(jVar, f1Var) && jVar.f59283a == null && jVar.f59284b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final void I(j jVar) {
        f1 f1Var = jVar.f59283a;
        if (f1Var != null) {
            J(jVar, f1Var);
        }
        f1 f1Var2 = jVar.f59284b;
        if (f1Var2 != null) {
            J(jVar, f1Var2);
        }
    }

    public boolean J(j jVar, f1 f1Var) {
        if (jVar.f59284b == f1Var) {
            jVar.f59284b = null;
        } else if (jVar.f59283a == f1Var) {
            jVar.f59283a = null;
        } else {
            return false;
        }
        View view = f1Var.f59245a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(f1Var);
        return true;
    }

    public long K(long j3, long j10, long j11) {
        return Math.max(j10, j11) + j3;
    }

    public long L() {
        return this.d;
    }

    public final void R(f1 f1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        f1Var.f59245a.animate().setInterpolator(E);
        f(f1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(f1 f1Var, List list) {
        if (list.isEmpty() && !t(f1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(f1 f1Var) {
        View view = f1Var.f59245a;
        view.animate().cancel();
        ArrayList arrayList = this.f59299r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((k) arrayList.get(size)).f59292a == f1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(f1Var);
                arrayList.remove(size);
            }
        }
        H(this.f59300s, f1Var);
        if (this.f59297p.remove(f1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(f1Var);
        }
        if (this.f59298q.remove(f1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(f1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, f1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f59302u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((k) arrayList5.get(size4)).f59292a == f1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(f1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f59301t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(f1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(f1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (!this.A.remove(f1Var)) {
            if (!this.f59305y.remove(f1Var)) {
                if (!this.B.remove(f1Var)) {
                    if (!this.f59306z.remove(f1Var)) {
                        G();
                        return;
                    } else {
                        boolean z10 = s2.f26829a;
                        throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
                    }
                }
                boolean z11 = s2.f26829a;
                throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
            }
            boolean z12 = s2.f26829a;
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        boolean z13 = s2.f26829a;
        throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f59299r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.f59292a.f59245a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(kVar.f59292a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f59297p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((f1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f59298q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f1 f1Var = (f1) arrayList3.get(size3);
            View view2 = f1Var.f59245a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(f1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f59300s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((j) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f59302u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                k kVar2 = (k) arrayList6.get(size6);
                View view3 = kVar2.f59292a.f59245a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(kVar2.f59292a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f59301t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                f1 f1Var2 = (f1) arrayList8.get(size8);
                View view4 = f1Var2.f59245a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(f1Var2);
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
                I((j) arrayList10.get(size10));
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        E(this.A);
        E(this.f59306z);
        E(this.f59305y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f59298q.isEmpty() && this.f59300s.isEmpty() && this.f59299r.isEmpty() && this.f59297p.isEmpty() && this.f59306z.isEmpty() && this.A.isEmpty() && this.f59305y.isEmpty() && this.B.isEmpty() && this.f59302u.isEmpty() && this.f59301t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j3;
        long j10;
        ArrayList arrayList = this.f59297p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f59299r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f59300s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f59298q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                D((f1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f59302u.add(arrayList5);
                arrayList2.clear();
                g gVar = new g(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((k) arrayList5.get(0)).f59292a.f59245a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.i0.f56367a;
                    view.postOnAnimationDelayed(gVar, L);
                } else {
                    gVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.v.add(arrayList6);
                arrayList3.clear();
                g gVar2 = new g(this, arrayList6, 1);
                if (this.C && !isEmpty) {
                    View view2 = ((j) arrayList6.get(0)).f59283a.f59245a;
                    long j11 = this.d;
                    WeakHashMap weakHashMap2 = r0.i0.f56367a;
                    view2.postOnAnimationDelayed(gVar2, j11);
                } else {
                    gVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f59301t.add(arrayList7);
                arrayList4.clear();
                g gVar3 = new g(this, arrayList7, 2);
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
                    View view3 = ((f1) arrayList7.get(0)).f59245a;
                    WeakHashMap weakHashMap3 = r0.i0.f56367a;
                    view3.postOnAnimationDelayed(gVar3, K);
                    return;
                }
                gVar3.run();
            }
        }
    }

    @Override
    public void p(f1 f1Var) {
        R(f1Var);
        View view = f1Var.f59245a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f59298q.add(f1Var);
        F();
    }

    @Override
    public boolean q(f1 f1Var, f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        if (f1Var == f1Var2) {
            return r(f1Var, r0Var, i7, i10, i11, i12);
        }
        View view = f1Var.f59245a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(f1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f1Var2.f59245a;
        R(f1Var2);
        view2.setTranslationX(-((int) ((i11 - i7) - translationX)));
        view2.setTranslationY(-((int) ((i12 - i10) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f59300s.add(new j(f1Var, f1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public boolean r(f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.f59245a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) f1Var.f59245a.getTranslationY());
        R(f1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(f1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f59299r.add(new k(f1Var, translationX, translationY, i11, i12));
        F();
        return true;
    }

    @Override
    public void s(f1 f1Var, e2.r0 r0Var) {
        R(f1Var);
        this.f59297p.add(f1Var);
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

    public void P(f1 f1Var) {
    }

    public void z(f1 f1Var) {
    }
}
