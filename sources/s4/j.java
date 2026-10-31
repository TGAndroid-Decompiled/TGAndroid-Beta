package s4;

import ag.p2;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.v2;
import org.telegram.ui.Components.ms;
public class j extends f1 {
    public static TimeInterpolator E;
    public Interpolator f47945o;
    public final ArrayList f47946p = new ArrayList();
    public final ArrayList f47947q = new ArrayList();
    public final ArrayList f47948r = new ArrayList();
    public final ArrayList f47949s = new ArrayList();
    public final ArrayList f47950t = new ArrayList();
    public final ArrayList f47951u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f47952w = new ArrayList();
    public final ArrayList f47953x = new ArrayList();
    public final ArrayList f47954y = new ArrayList();
    public final ArrayList f47955z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z10 = v2.f18448a;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final h hVar) {
        View view;
        j jVar;
        final h hVar2;
        c1 c1Var = hVar.f47935a;
        View view2 = null;
        if (c1Var == null) {
            view = null;
        } else {
            view = c1Var.f47898a;
        }
        c1 c1Var2 = hVar.f47936b;
        if (c1Var2 != null) {
            view2 = c1Var2.f47898a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f47969g).setStartDelay(0L);
            arrayList.add(hVar.f47935a);
            startDelay.translationX(hVar.e - hVar.f47937c);
            startDelay.translationY(hVar.f47938f - hVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final j f47916b;

                {
                    this.f47916b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            c1 c1Var3 = hVar.f47935a;
                            this.f47916b.O();
                            return;
                        default:
                            c1 c1Var4 = hVar.f47936b;
                            this.f47916b.O();
                            return;
                    }
                }
            });
            jVar = this;
            hVar2 = hVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f47972k).setListener(new g(jVar, hVar2, startDelay, view, 0)).start();
        } else {
            jVar = this;
            hVar2 = hVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(hVar2.f47936b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(jVar.f47968f).setStartDelay(i() - jVar.f47968f).setInterpolator(jVar.f47972k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final j f47916b;

                {
                    this.f47916b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            c1 c1Var3 = hVar2.f47935a;
                            this.f47916b.O();
                            return;
                        default:
                            c1 c1Var4 = hVar2.f47936b;
                            this.f47916b.O();
                            return;
                    }
                }
            });
            animate.setListener(new g(jVar, hVar2, animate, view3, 1)).start();
        }
    }

    public void C(c1 c1Var, i iVar) {
        int i10 = iVar.f47943b;
        int i11 = iVar.f47944c;
        int i12 = iVar.d;
        int i13 = iVar.e;
        View view = c1Var.f47898a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f47955z.add(c1Var);
        animate.setUpdateListener(new p2(27, this, c1Var));
        Interpolator interpolator = this.f47945o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f47970i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new ms(this, c1Var, i14, view, i15, animate, 1)).start();
    }

    public void D(c1 c1Var) {
        View view = c1Var.f47898a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(c1Var);
        if (this.f47973l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f47973l).setInterpolator(this.f47971j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new c(this, c1Var, 0));
        animate.setListener(new f(this, c1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c1) arrayList.get(size)).f47898a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f47952w.clear();
            this.f47953x.clear();
        }
    }

    public final void H(ArrayList arrayList, c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            if (J(hVar, c1Var) && hVar.f47935a == null && hVar.f47936b == null) {
                arrayList.remove(hVar);
            }
        }
    }

    public final void I(h hVar) {
        c1 c1Var = hVar.f47935a;
        if (c1Var != null) {
            J(hVar, c1Var);
        }
        c1 c1Var2 = hVar.f47936b;
        if (c1Var2 != null) {
            J(hVar, c1Var2);
        }
    }

    public boolean J(h hVar, c1 c1Var) {
        if (hVar.f47936b == c1Var) {
            hVar.f47936b = null;
        } else if (hVar.f47935a == c1Var) {
            hVar.f47935a = null;
        } else {
            return false;
        }
        View view = c1Var.f47898a;
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

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(c1 c1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        c1Var.f47898a.animate().setInterpolator(E);
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
        View view = c1Var.f47898a;
        view.animate().cancel();
        ArrayList arrayList = this.f47948r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((i) arrayList.get(size)).f47942a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        H(this.f47949s, c1Var);
        if (this.f47946p.remove(c1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(c1Var);
        }
        if (this.f47947q.remove(c1Var)) {
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
        ArrayList arrayList4 = this.f47951u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((i) arrayList5.get(size4)).f47942a == c1Var) {
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
        ArrayList arrayList6 = this.f47950t;
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
        if (!this.A.remove(c1Var)) {
            if (!this.f47954y.remove(c1Var)) {
                if (!this.B.remove(c1Var)) {
                    if (!this.f47955z.remove(c1Var)) {
                        G();
                        return;
                    } else {
                        boolean z10 = v2.f18448a;
                        throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
                    }
                }
                boolean z11 = v2.f18448a;
                throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
            }
            boolean z12 = v2.f18448a;
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        boolean z13 = v2.f18448a;
        throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f47948r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = (i) arrayList.get(size);
            View view = iVar.f47942a.f47898a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(iVar.f47942a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f47946p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((c1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f47947q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c1 c1Var = (c1) arrayList3.get(size3);
            View view2 = c1Var.f47898a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(c1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f47949s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((h) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f47951u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                i iVar2 = (i) arrayList6.get(size6);
                View view3 = iVar2.f47942a.f47898a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(iVar2.f47942a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f47950t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                c1 c1Var2 = (c1) arrayList8.get(size8);
                View view4 = c1Var2.f47898a;
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
        E(this.f47955z);
        E(this.f47954y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f47947q.isEmpty() && this.f47949s.isEmpty() && this.f47948r.isEmpty() && this.f47946p.isEmpty() && this.f47955z.isEmpty() && this.A.isEmpty() && this.f47954y.isEmpty() && this.B.isEmpty() && this.f47951u.isEmpty() && this.f47950t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j10;
        long j11;
        ArrayList arrayList = this.f47946p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f47948r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f47949s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f47947q;
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
                this.f47951u.add(arrayList5);
                arrayList2.clear();
                e eVar = new e(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((i) arrayList5.get(0)).f47942a.f47898a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.h0.f46123a;
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
                    View view2 = ((h) arrayList6.get(0)).f47935a.f47898a;
                    long j12 = this.d;
                    WeakHashMap weakHashMap2 = r0.h0.f46123a;
                    view2.postOnAnimationDelayed(eVar2, j12);
                } else {
                    eVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f47950t.add(arrayList7);
                arrayList4.clear();
                e eVar3 = new e(this, arrayList7, 2);
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
                    View view3 = ((c1) arrayList7.get(0)).f47898a;
                    WeakHashMap weakHashMap3 = r0.h0.f46123a;
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
        View view = c1Var.f47898a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f47947q.add(c1Var);
        F();
    }

    @Override
    public boolean q(c1 c1Var, c1 c1Var2, ac.g gVar, int i10, int i11, int i12, int i13) {
        if (c1Var == c1Var2) {
            return r(c1Var, gVar, i10, i11, i12, i13);
        }
        View view = c1Var.f47898a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(c1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.f47898a;
        R(c1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f47949s.add(new h(c1Var, c1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public boolean r(c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
        View view = c1Var.f47898a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c1Var.f47898a.getTranslationY());
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
        this.f47948r.add(new i(c1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override
    public void s(c1 c1Var, ac.g gVar) {
        R(c1Var);
        this.f47946p.add(c1Var);
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
