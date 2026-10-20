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
import org.telegram.ui.Components.gt;
public class k extends e1 {
    public static TimeInterpolator E;
    public Interpolator f45980o;
    public final ArrayList f45981p = new ArrayList();
    public final ArrayList f45982q = new ArrayList();
    public final ArrayList f45983r = new ArrayList();
    public final ArrayList f45984s = new ArrayList();
    public final ArrayList f45985t = new ArrayList();
    public final ArrayList f45986u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f45987w = new ArrayList();
    public final ArrayList f45988x = new ArrayList();
    public final ArrayList f45989y = new ArrayList();
    public final ArrayList f45990z = new ArrayList();
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

    public void B(final i iVar) {
        View view;
        k kVar;
        final i iVar2;
        b1 b1Var = iVar.f45970a;
        View view2 = null;
        if (b1Var == null) {
            view = null;
        } else {
            view = b1Var.f45917a;
        }
        b1 b1Var2 = iVar.f45971b;
        if (b1Var2 != null) {
            view2 = b1Var2.f45917a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f45998g).setStartDelay(0L);
            arrayList.add(iVar.f45970a);
            startDelay.translationX(iVar.e - iVar.f45972c);
            startDelay.translationY(iVar.f45973f - iVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k f45949b;

                {
                    this.f45949b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            b1 b1Var3 = iVar.f45970a;
                            this.f45949b.O();
                            return;
                        default:
                            b1 b1Var4 = iVar.f45971b;
                            this.f45949b.O();
                            return;
                    }
                }
            });
            kVar = this;
            iVar2 = iVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f46001k).setListener(new h(kVar, iVar2, startDelay, view, 0)).start();
        } else {
            kVar = this;
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f45971b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f45997f).setStartDelay(i() - kVar.f45997f).setInterpolator(kVar.f46001k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k f45949b;

                {
                    this.f45949b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            b1 b1Var3 = iVar2.f45970a;
                            this.f45949b.O();
                            return;
                        default:
                            b1 b1Var4 = iVar2.f45971b;
                            this.f45949b.O();
                            return;
                    }
                }
            });
            animate.setListener(new h(kVar, iVar2, animate, view3, 1)).start();
        }
    }

    public void C(b1 b1Var, j jVar) {
        int i10 = jVar.f45978b;
        int i11 = jVar.f45979c;
        int i12 = jVar.d;
        int i13 = jVar.e;
        View view = b1Var.f45917a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f45990z.add(b1Var);
        animate.setUpdateListener(new sg.i1(1, this, b1Var));
        Interpolator interpolator = this.f45980o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f45999i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new gt(this, b1Var, i14, view, i15, animate, 1)).start();
    }

    public void D(b1 b1Var) {
        View view = b1Var.f45917a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(b1Var);
        if (this.f46002l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f46002l).setInterpolator(this.f46000j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new d(this, b1Var, 0));
        animate.setListener(new g(this, b1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b1) arrayList.get(size)).f45917a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f45987w.clear();
            this.f45988x.clear();
        }
    }

    public final void H(ArrayList arrayList, b1 b1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (J(iVar, b1Var) && iVar.f45970a == null && iVar.f45971b == null) {
                arrayList.remove(iVar);
            }
        }
    }

    public final void I(i iVar) {
        b1 b1Var = iVar.f45970a;
        if (b1Var != null) {
            J(iVar, b1Var);
        }
        b1 b1Var2 = iVar.f45971b;
        if (b1Var2 != null) {
            J(iVar, b1Var2);
        }
    }

    public boolean J(i iVar, b1 b1Var) {
        if (iVar.f45971b == b1Var) {
            iVar.f45971b = null;
        } else if (iVar.f45970a == b1Var) {
            iVar.f45970a = null;
        } else {
            return false;
        }
        View view = b1Var.f45917a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(b1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(b1 b1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        b1Var.f45917a.animate().setInterpolator(E);
        f(b1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(b1 b1Var, List list) {
        if (list.isEmpty() && !t(b1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(b1 b1Var) {
        View view = b1Var.f45917a;
        view.animate().cancel();
        ArrayList arrayList = this.f45983r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) arrayList.get(size)).f45977a == b1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(b1Var);
                arrayList.remove(size);
            }
        }
        H(this.f45984s, b1Var);
        if (this.f45981p.remove(b1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(b1Var);
        }
        if (this.f45982q.remove(b1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(b1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, b1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f45986u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList5.get(size4)).f45977a == b1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(b1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f45985t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(b1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(b1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(b1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f45989y.remove(b1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(b1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f45990z.remove(b1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f45983r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList.get(size);
            View view = jVar.f45977a.f45917a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jVar.f45977a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f45981p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((b1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f45982q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            b1 b1Var = (b1) arrayList3.get(size3);
            View view2 = b1Var.f45917a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(b1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f45984s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((i) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f45986u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                j jVar2 = (j) arrayList6.get(size6);
                View view3 = jVar2.f45977a.f45917a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(jVar2.f45977a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f45985t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                b1 b1Var2 = (b1) arrayList8.get(size8);
                View view4 = b1Var2.f45917a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(b1Var2);
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
                I((i) arrayList10.get(size10));
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        E(this.A);
        E(this.f45990z);
        E(this.f45989y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f45982q.isEmpty() && this.f45984s.isEmpty() && this.f45983r.isEmpty() && this.f45981p.isEmpty() && this.f45990z.isEmpty() && this.A.isEmpty() && this.f45989y.isEmpty() && this.B.isEmpty() && this.f45986u.isEmpty() && this.f45985t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j10;
        long j11;
        ArrayList arrayList = this.f45981p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f45983r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f45984s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f45982q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                D((b1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f45986u.add(arrayList5);
                arrayList2.clear();
                f fVar = new f(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((j) arrayList5.get(0)).f45977a.f45917a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.i0.f44826a;
                    view.postOnAnimationDelayed(fVar, L);
                } else {
                    fVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.v.add(arrayList6);
                arrayList3.clear();
                f fVar2 = new f(this, arrayList6, 1);
                if (this.C && !isEmpty) {
                    View view2 = ((i) arrayList6.get(0)).f45970a.f45917a;
                    long j12 = this.d;
                    WeakHashMap weakHashMap2 = r0.i0.f44826a;
                    view2.postOnAnimationDelayed(fVar2, j12);
                } else {
                    fVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f45985t.add(arrayList7);
                arrayList4.clear();
                f fVar3 = new f(this, arrayList7, 2);
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
                    View view3 = ((b1) arrayList7.get(0)).f45917a;
                    WeakHashMap weakHashMap3 = r0.i0.f44826a;
                    view3.postOnAnimationDelayed(fVar3, K);
                    return;
                }
                fVar3.run();
            }
        }
    }

    @Override
    public void p(b1 b1Var) {
        R(b1Var);
        View view = b1Var.f45917a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f45982q.add(b1Var);
        F();
    }

    @Override
    public boolean q(b1 b1Var, b1 b1Var2, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        if (b1Var == b1Var2) {
            return r(b1Var, u0Var, i10, i11, i12, i13);
        }
        View view = b1Var.f45917a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(b1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = b1Var2.f45917a;
        R(b1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f45984s.add(new i(b1Var, b1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public boolean r(b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        View view = b1Var.f45917a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) b1Var.f45917a.getTranslationY());
        R(b1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(b1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f45983r.add(new j(b1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override
    public void s(b1 b1Var, b2.u0 u0Var) {
        R(b1Var);
        this.f45981p.add(b1Var);
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

    public void P(b1 b1Var) {
    }

    public void z(b1 b1Var) {
    }
}
