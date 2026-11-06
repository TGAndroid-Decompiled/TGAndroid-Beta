package v4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.bs;
public class k extends f1 {
    public static TimeInterpolator E;
    public Interpolator f57007o;
    public final ArrayList f57008p = new ArrayList();
    public final ArrayList f57009q = new ArrayList();
    public final ArrayList f57010r = new ArrayList();
    public final ArrayList f57011s = new ArrayList();
    public final ArrayList f57012t = new ArrayList();
    public final ArrayList f57013u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f57014w = new ArrayList();
    public final ArrayList f57015x = new ArrayList();
    public final ArrayList f57016y = new ArrayList();
    public final ArrayList f57017z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z9 = r2.f25199a;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final i iVar) {
        View view;
        k kVar;
        final i iVar2;
        d1 d1Var = iVar.f56995a;
        View view2 = null;
        if (d1Var == null) {
            view = null;
        } else {
            view = d1Var.f56951a;
        }
        d1 d1Var2 = iVar.f56996b;
        if (d1Var2 != null) {
            view2 = d1Var2.f56951a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f57026g).setStartDelay(0L);
            arrayList.add(iVar.f56995a);
            startDelay.translationX(iVar.f56998e - iVar.f56997c);
            startDelay.translationY(iVar.f56999f - iVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k f56948b;

                {
                    this.f56948b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            d1 d1Var3 = iVar.f56995a;
                            this.f56948b.O();
                            return;
                        default:
                            d1 d1Var4 = iVar.f56996b;
                            this.f56948b.O();
                            return;
                    }
                }
            });
            kVar = this;
            iVar2 = iVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f57029k).setListener(new h(kVar, iVar2, startDelay, view, 0)).start();
        } else {
            kVar = this;
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f56996b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f57025f).setStartDelay(i() - kVar.f57025f).setInterpolator(kVar.f57029k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k f56948b;

                {
                    this.f56948b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            d1 d1Var3 = iVar2.f56995a;
                            this.f56948b.O();
                            return;
                        default:
                            d1 d1Var4 = iVar2.f56996b;
                            this.f56948b.O();
                            return;
                    }
                }
            });
            animate.setListener(new h(kVar, iVar2, animate, view3, 1)).start();
        }
    }

    public void C(d1 d1Var, j jVar) {
        int i7 = jVar.f57001b;
        int i10 = jVar.f57002c;
        int i11 = jVar.d;
        int i12 = jVar.f57003e;
        View view = d1Var.f56951a;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f57017z.add(d1Var);
        animate.setUpdateListener(new e(0, this, d1Var));
        Interpolator interpolator = this.f57007o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f57027i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new bs(this, d1Var, i13, view, i14, animate, 1)).start();
    }

    public void D(d1 d1Var) {
        View view = d1Var.f56951a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(d1Var);
        if (this.f57030l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f57030l).setInterpolator(this.f57028j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new c(this, d1Var, 0));
        animate.setListener(new g(this, d1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((d1) arrayList.get(size)).f56951a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f57014w.clear();
            this.f57015x.clear();
        }
    }

    public final void H(ArrayList arrayList, d1 d1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (J(iVar, d1Var) && iVar.f56995a == null && iVar.f56996b == null) {
                arrayList.remove(iVar);
            }
        }
    }

    public final void I(i iVar) {
        d1 d1Var = iVar.f56995a;
        if (d1Var != null) {
            J(iVar, d1Var);
        }
        d1 d1Var2 = iVar.f56996b;
        if (d1Var2 != null) {
            J(iVar, d1Var2);
        }
    }

    public boolean J(i iVar, d1 d1Var) {
        if (iVar.f56996b == d1Var) {
            iVar.f56996b = null;
        } else if (iVar.f56995a == d1Var) {
            iVar.f56995a = null;
        } else {
            return false;
        }
        View view = d1Var.f56951a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(d1Var);
        return true;
    }

    public long K(long j3, long j10, long j11) {
        return Math.max(j10, j11) + j3;
    }

    public long L() {
        return this.d;
    }

    public final void R(d1 d1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        d1Var.f56951a.animate().setInterpolator(E);
        f(d1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(d1 d1Var, List list) {
        if (list.isEmpty() && !t(d1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(d1 d1Var) {
        View view = d1Var.f56951a;
        view.animate().cancel();
        ArrayList arrayList = this.f57010r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) arrayList.get(size)).f57000a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(d1Var);
                arrayList.remove(size);
            }
        }
        H(this.f57011s, d1Var);
        if (this.f57008p.remove(d1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(d1Var);
        }
        if (this.f57009q.remove(d1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(d1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, d1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f57013u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList5.get(size4)).f57000a == d1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(d1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f57012t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(d1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(d1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (!this.A.remove(d1Var)) {
            if (!this.f57016y.remove(d1Var)) {
                if (!this.B.remove(d1Var)) {
                    if (!this.f57017z.remove(d1Var)) {
                        G();
                        return;
                    } else {
                        boolean z9 = r2.f25199a;
                        throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
                    }
                }
                boolean z10 = r2.f25199a;
                throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
            }
            boolean z11 = r2.f25199a;
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        boolean z12 = r2.f25199a;
        throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f57010r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList.get(size);
            View view = jVar.f57000a.f56951a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jVar.f57000a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f57008p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((d1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f57009q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            d1 d1Var = (d1) arrayList3.get(size3);
            View view2 = d1Var.f56951a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(d1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f57011s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((i) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f57013u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                j jVar2 = (j) arrayList6.get(size6);
                View view3 = jVar2.f57000a.f56951a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(jVar2.f57000a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f57012t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                d1 d1Var2 = (d1) arrayList8.get(size8);
                View view4 = d1Var2.f56951a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(d1Var2);
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
        E(this.f57017z);
        E(this.f57016y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f57009q.isEmpty() && this.f57011s.isEmpty() && this.f57010r.isEmpty() && this.f57008p.isEmpty() && this.f57017z.isEmpty() && this.A.isEmpty() && this.f57016y.isEmpty() && this.B.isEmpty() && this.f57013u.isEmpty() && this.f57012t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j3;
        long j10;
        ArrayList arrayList = this.f57008p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f57010r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f57011s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f57009q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                D((d1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f57013u.add(arrayList5);
                arrayList2.clear();
                f fVar = new f(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((j) arrayList5.get(0)).f57000a.f56951a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.i0.f54097a;
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
                    View view2 = ((i) arrayList6.get(0)).f56995a.f56951a;
                    long j11 = this.d;
                    WeakHashMap weakHashMap2 = r0.i0.f54097a;
                    view2.postOnAnimationDelayed(fVar2, j11);
                } else {
                    fVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f57012t.add(arrayList7);
                arrayList4.clear();
                f fVar3 = new f(this, arrayList7, 2);
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
                    View view3 = ((d1) arrayList7.get(0)).f56951a;
                    WeakHashMap weakHashMap3 = r0.i0.f54097a;
                    view3.postOnAnimationDelayed(fVar3, K);
                    return;
                }
                fVar3.run();
            }
        }
    }

    @Override
    public void p(d1 d1Var) {
        R(d1Var);
        View view = d1Var.f56951a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f57009q.add(d1Var);
        F();
    }

    @Override
    public boolean q(d1 d1Var, d1 d1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        if (d1Var == d1Var2) {
            return r(d1Var, r0Var, i7, i10, i11, i12);
        }
        View view = d1Var.f56951a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(d1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = d1Var2.f56951a;
        R(d1Var2);
        view2.setTranslationX(-((int) ((i11 - i7) - translationX)));
        view2.setTranslationY(-((int) ((i12 - i10) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f57011s.add(new i(d1Var, d1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public boolean r(d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = d1Var.f56951a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) d1Var.f56951a.getTranslationY());
        R(d1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(d1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f57010r.add(new j(d1Var, translationX, translationY, i11, i12));
        F();
        return true;
    }

    @Override
    public void s(d1 d1Var, e2.r0 r0Var) {
        R(d1Var);
        this.f57008p.add(d1Var);
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

    public void P(d1 d1Var) {
    }

    public void z(d1 d1Var) {
    }
}
