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
import org.telegram.ui.Components.jt;
public class l extends g1 {
    public static TimeInterpolator E;
    public Interpolator f47822o;
    public final ArrayList f47823p = new ArrayList();
    public final ArrayList f47824q = new ArrayList();
    public final ArrayList f47825r = new ArrayList();
    public final ArrayList f47826s = new ArrayList();
    public final ArrayList f47827t = new ArrayList();
    public final ArrayList f47828u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f47829w = new ArrayList();
    public final ArrayList f47830x = new ArrayList();
    public final ArrayList f47831y = new ArrayList();
    public final ArrayList f47832z = new ArrayList();
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

    public void B(final j jVar) {
        View view;
        l lVar;
        final j jVar2;
        e1 e1Var = jVar.f47812a;
        View view2 = null;
        if (e1Var == null) {
            view = null;
        } else {
            view = e1Var.f47773a;
        }
        e1 e1Var2 = jVar.f47813b;
        if (e1Var2 != null) {
            view2 = e1Var2.f47773a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f47840g).setStartDelay(0L);
            arrayList.add(jVar.f47812a);
            startDelay.translationX(jVar.e - jVar.f47814c);
            startDelay.translationY(jVar.f47815f - jVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f47791b;

                {
                    this.f47791b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            e1 e1Var3 = jVar.f47812a;
                            this.f47791b.O();
                            return;
                        default:
                            e1 e1Var4 = jVar.f47813b;
                            this.f47791b.O();
                            return;
                    }
                }
            });
            lVar = this;
            jVar2 = jVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f47843k).setListener(new i(lVar, jVar2, startDelay, view, 0)).start();
        } else {
            lVar = this;
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f47813b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f47839f).setStartDelay(i() - lVar.f47839f).setInterpolator(lVar.f47843k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f47791b;

                {
                    this.f47791b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            e1 e1Var3 = jVar2.f47812a;
                            this.f47791b.O();
                            return;
                        default:
                            e1 e1Var4 = jVar2.f47813b;
                            this.f47791b.O();
                            return;
                    }
                }
            });
            animate.setListener(new i(lVar, jVar2, animate, view3, 1)).start();
        }
    }

    public void C(e1 e1Var, k kVar) {
        int i10 = kVar.f47817b;
        int i11 = kVar.f47818c;
        int i12 = kVar.d;
        int i13 = kVar.e;
        View view = e1Var.f47773a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f47832z.add(e1Var);
        animate.setUpdateListener(new bh.b0(28, this, e1Var));
        Interpolator interpolator = this.f47822o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f47841i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new jt(this, e1Var, i14, view, i15, animate, 1)).start();
    }

    public void D(e1 e1Var) {
        View view = e1Var.f47773a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(e1Var);
        if (this.f47844l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f47844l).setInterpolator(this.f47842j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new e(this, e1Var, 0));
        animate.setListener(new h(this, e1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((e1) arrayList.get(size)).f47773a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f47829w.clear();
            this.f47830x.clear();
        }
    }

    public final void H(ArrayList arrayList, e1 e1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (J(jVar, e1Var) && jVar.f47812a == null && jVar.f47813b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final void I(j jVar) {
        e1 e1Var = jVar.f47812a;
        if (e1Var != null) {
            J(jVar, e1Var);
        }
        e1 e1Var2 = jVar.f47813b;
        if (e1Var2 != null) {
            J(jVar, e1Var2);
        }
    }

    public boolean J(j jVar, e1 e1Var) {
        if (jVar.f47813b == e1Var) {
            jVar.f47813b = null;
        } else if (jVar.f47812a == e1Var) {
            jVar.f47812a = null;
        } else {
            return false;
        }
        View view = e1Var.f47773a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(e1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(e1 e1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        e1Var.f47773a.animate().setInterpolator(E);
        f(e1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(e1 e1Var, List list) {
        if (list.isEmpty() && !t(e1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(e1 e1Var) {
        View view = e1Var.f47773a;
        view.animate().cancel();
        ArrayList arrayList = this.f47825r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((k) arrayList.get(size)).f47816a == e1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(e1Var);
                arrayList.remove(size);
            }
        }
        H(this.f47826s, e1Var);
        if (this.f47823p.remove(e1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(e1Var);
        }
        if (this.f47824q.remove(e1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(e1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, e1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f47828u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((k) arrayList5.get(size4)).f47816a == e1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(e1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f47827t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(e1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(e1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(e1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f47831y.remove(e1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(e1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f47832z.remove(e1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f47825r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.f47816a.f47773a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(kVar.f47816a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f47823p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((e1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f47824q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            e1 e1Var = (e1) arrayList3.get(size3);
            View view2 = e1Var.f47773a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(e1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f47826s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((j) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f47828u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                k kVar2 = (k) arrayList6.get(size6);
                View view3 = kVar2.f47816a.f47773a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(kVar2.f47816a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f47827t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                e1 e1Var2 = (e1) arrayList8.get(size8);
                View view4 = e1Var2.f47773a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(e1Var2);
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
        E(this.f47832z);
        E(this.f47831y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f47824q.isEmpty() && this.f47826s.isEmpty() && this.f47825r.isEmpty() && this.f47823p.isEmpty() && this.f47832z.isEmpty() && this.A.isEmpty() && this.f47831y.isEmpty() && this.B.isEmpty() && this.f47828u.isEmpty() && this.f47827t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j10;
        long j11;
        ArrayList arrayList = this.f47823p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f47825r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f47826s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f47824q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                D((e1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f47828u.add(arrayList5);
                arrayList2.clear();
                g gVar = new g(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((k) arrayList5.get(0)).f47816a.f47773a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.i0.f47143a;
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
                    View view2 = ((j) arrayList6.get(0)).f47812a.f47773a;
                    long j12 = this.d;
                    WeakHashMap weakHashMap2 = r0.i0.f47143a;
                    view2.postOnAnimationDelayed(gVar2, j12);
                } else {
                    gVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f47827t.add(arrayList7);
                arrayList4.clear();
                g gVar3 = new g(this, arrayList7, 2);
                if (this.C && (!isEmpty || !isEmpty2 || !isEmpty3)) {
                    long j13 = 0;
                    if (!isEmpty) {
                        j10 = this.d;
                    } else {
                        j10 = 0;
                    }
                    if (!isEmpty2) {
                        j11 = j();
                    } else {
                        j11 = 0;
                    }
                    if (!isEmpty3) {
                        j13 = i();
                    }
                    long K = K(j10, j11, j13);
                    View view3 = ((e1) arrayList7.get(0)).f47773a;
                    WeakHashMap weakHashMap3 = r0.i0.f47143a;
                    view3.postOnAnimationDelayed(gVar3, K);
                    return;
                }
                gVar3.run();
            }
        }
    }

    @Override
    public void p(e1 e1Var) {
        R(e1Var);
        View view = e1Var.f47773a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f47824q.add(e1Var);
        F();
    }

    @Override
    public boolean q(e1 e1Var, e1 e1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        if (e1Var == e1Var2) {
            return r(e1Var, v0Var, i10, i11, i12, i13);
        }
        View view = e1Var.f47773a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(e1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = e1Var2.f47773a;
        R(e1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f47826s.add(new j(e1Var, e1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public boolean r(e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        View view = e1Var.f47773a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) e1Var.f47773a.getTranslationY());
        R(e1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(e1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f47825r.add(new k(e1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override
    public void s(e1 e1Var, b2.v0 v0Var) {
        R(e1Var);
        this.f47823p.add(e1Var);
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

    public void P(e1 e1Var) {
    }

    public void z(e1 e1Var) {
    }
}
