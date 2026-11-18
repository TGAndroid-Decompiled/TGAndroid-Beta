package pi;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import e2.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.s2;
import org.telegram.messenger.xi;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.bn;
import org.telegram.ui.qe;
import v4.c1;
import v4.f1;
public abstract class k extends v4.k {
    public static final lr V = new lr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final bn F;
    public final ck0 G;
    public boolean N;
    public f1 O;
    public go P;
    public boolean Q;
    public final i6 R;
    public qe T;
    public qe U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public k(bn bnVar, ck0 ck0Var, i6 i6Var) {
        this.R = i6Var;
        this.F = bnVar;
        this.G = ck0Var;
        this.f59169o = V;
        this.f59152n = true;
        this.f59151m = false;
    }

    @Override
    public final void B(v4.i iVar) {
        View view;
        v4.i iVar2;
        f1 f1Var = iVar.f59153a;
        View view2 = null;
        if (f1Var == null) {
            view = null;
        } else {
            view = f1Var.f59122a;
        }
        f1 f1Var2 = iVar.f59154b;
        if (f1Var2 != null) {
            view2 = f1Var2.f59122a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.f59153a);
            duration.translationX(iVar.f59156e - iVar.f59155c);
            duration.translationY(iVar.f59157f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new h(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f59154b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new h(this, iVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(f1 f1Var, v4.j jVar) {
        T(f1Var, jVar, false);
    }

    @Override
    public final boolean J(v4.i iVar, f1 f1Var) {
        mz0 mz0Var;
        if (s2.f26723a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(f1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f1Var.f59122a;
        if (this.K.contains(view) && (mz0Var = (mz0) this.U.run()) != null) {
            mz0Var.a(view);
        }
        if (iVar.f59154b == f1Var) {
            iVar.f59154b = null;
        } else if (iVar.f59153a == f1Var) {
            iVar.f59153a = null;
        } else {
            return false;
        }
        X(view);
        d(f1Var);
        return true;
    }

    @Override
    public final long L() {
        return 0L;
    }

    @Override
    public void N() {
        this.G.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.L;
            if (!arrayList.isEmpty()) {
                ((Runnable) arrayList.remove(0)).run();
            } else {
                U();
                return;
            }
        }
    }

    public final void T(final v4.f1 r21, v4.j r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: pi.k.T(v4.f1, v4.j, boolean):void");
    }

    public final void U() {
        mz0 mz0Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (!this.K.isEmpty() && (mz0Var = (mz0) this.U.run()) != null) {
            ArrayList arrayList2 = mz0Var.f37677c;
            if (!mz0Var.f37678e) {
                mz0Var.f37678e = true;
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    lz0 lz0Var = (lz0) obj2;
                    Runnable runnable = lz0Var.d;
                    if (runnable != null) {
                        mz0.b(runnable);
                        lz0Var.d = null;
                    }
                }
                arrayList2.clear();
                kz0 kz0Var = mz0Var.f37675a;
                if (kz0Var != null) {
                    kz0Var.h();
                }
                Runnable runnable2 = mz0Var.d;
                if (runnable2 != null) {
                    mz0Var.d = null;
                    mz0.b(runnable2);
                }
            }
        }
    }

    public final void V(aj ajVar) {
        if (ajVar == null) {
            return;
        }
        ArrayList arrayList = ajVar.d;
        zi ziVar = ajVar.f22908m;
        if (arrayList.size() == 0) {
            ziVar.f28308i = true;
            return;
        }
        if (ziVar.f28303b == 0 && ziVar.d == 0 && ziVar.f28302a == 0 && ziVar.f28304c == 0) {
            ck0 ck0Var = this.G;
            int childCount = ck0Var.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = ck0Var.getChildAt(i7);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    fj messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().f32391w0 && arrayList.contains(messageObject)) {
                        ziVar.f28303b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        ziVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        ziVar.f28302a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        ziVar.f28304c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        ziVar.f28314o = q1Var.d2();
                        ziVar.f28310k = q1Var.L2();
                        ziVar.f28311l = q1Var.K2();
                        ziVar.f28315p = true;
                        break;
                    }
                }
                i7++;
            }
        }
        this.I.add(ajVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof g0;
        ck0 ck0Var = this.G;
        if (z10) {
            int measuredHeight = (ck0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((g0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof sa) {
            int measuredHeight2 = (ck0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((sa) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof q1) {
            q1 q1Var = (q1) view;
            q1Var.getTransitionParams().e();
            q1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof u0) {
            t0 transitionParams = ((u0) view).getTransitionParams();
            transitionParams.f31820b = false;
            transitionParams.f31821c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(qe qeVar, qe qeVar2) {
        this.T = qeVar;
        this.U = qeVar2;
    }

    public final boolean Z(View view) {
        f1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f59171q.contains(T) || this.f59178y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(f1 f1Var, r0 r0Var, r0 r0Var2) {
        ArrayList arrayList;
        int i7;
        boolean a10 = super.a(f1Var, r0Var, r0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f59171q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((f1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i7 += ((f1) arrayList.get(i11)).f59122a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((f1) arrayList.get(i12)).f59122a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        f1 T = this.G.T(view);
        if (T != null) {
            if (this.f59170p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(f1 f1Var) {
        mz0 mz0Var;
        Animator animator = (Animator) this.J.remove(f1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f1Var.f59122a;
        if (this.K.contains(view) && (mz0Var = (mz0) this.U.run()) != null) {
            mz0Var.a(view);
        }
        super.f(f1Var);
        X(view);
    }

    @Override
    public void g() {
        if (s2.f26723a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((aj) obj).f22908m.f28315p = false;
        }
        arrayList.clear();
        U();
        go goVar = this.P;
        if (goVar != null) {
            goVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f59172r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.j jVar = (v4.j) arrayList2.get(size2);
            X(jVar.f59161a.f59122a);
            v(jVar.f59161a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f59170p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            f1 f1Var = (f1) arrayList3.get(size3);
            X(f1Var.f59122a);
            d(f1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f59171q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            f1 f1Var2 = (f1) arrayList4.get(size4);
            X(f1Var2.f59122a);
            u(f1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f59173s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((v4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f59175u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                v4.j jVar2 = (v4.j) arrayList7.get(size7);
                X(jVar2.f59161a.f59122a);
                v(jVar2.f59161a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f59174t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                f1 f1Var3 = (f1) arrayList9.get(size9);
                X(f1Var3.f59122a);
                u(f1Var3);
                arrayList9.remove(size9);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        ArrayList arrayList10 = this.v;
        for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
            ArrayList arrayList11 = (ArrayList) arrayList10.get(size10);
            for (int size11 = arrayList11.size() - 1; size11 >= 0; size11--) {
                I((v4.i) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f59179z);
        E(this.f59178y);
        E(this.B);
        e();
    }

    @Override
    public final long i() {
        return 250L;
    }

    @Override
    public final long j() {
        return 250L;
    }

    @Override
    public final r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        r0 l10 = super.l(c1Var, f1Var, i7, list);
        View view = f1Var.f59122a;
        if (view instanceof q1) {
            ?? obj = new Object();
            obj.f10687a = l10.f10687a;
            obj.f10688b = l10.f10688b;
            x1 transitionParams = ((q1) view).getTransitionParams();
            obj.f55673c = transitionParams.f32302b;
            obj.d = transitionParams.f32307c;
            obj.f55674e = transitionParams.d;
            obj.f55675f = transitionParams.f32315e;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: pi.k.m():void");
    }

    @Override
    public final void p(f1 f1Var) {
        R(f1Var);
        View view = f1Var.f59122a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().f32334i = true;
        }
        this.f59171q.add(f1Var);
    }

    @Override
    public final boolean q(f1 f1Var, f1 f1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        float translationX;
        if (f1Var == f1Var2) {
            return r(f1Var, r0Var, i7, i10, i11, i12);
        }
        View view = f1Var.f59122a;
        if (view instanceof q1) {
            translationX = ((q1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(f1Var);
        int i13 = (int) ((i11 - i7) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f1Var2.f59122a;
        R(f1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.f59173s.add(new v4.i(f1Var, f1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public final boolean r(f1 f1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
        int translationX;
        int i13;
        q1 q1Var;
        u0 u0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean a10;
        View view;
        int i14;
        boolean z10;
        boolean z11;
        float f15;
        boolean z12;
        int i15;
        float f16;
        aj ajVar;
        int i16;
        boolean z13;
        boolean P3;
        float f17;
        View view2 = f1Var.f59122a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i7 + ((int) q1Var2.getAnimationOffsetX());
            if (q1Var2.getTransitionParams().f32382t2 != q1Var2.getTopMediaOffset()) {
                i13 = (q1Var2.getTransitionParams().f32382t2 - q1Var2.getTopMediaOffset()) + i10;
            } else {
                i13 = i10;
            }
            q1Var = q1Var2;
            u0Var = null;
        } else if (view2 instanceof u0) {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            u0Var = (u0) view2;
            q1Var = null;
        } else {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            q1Var = null;
            u0Var = null;
        }
        int i17 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f18 = q1Var.getPhotoImage().L0;
            float f19 = q1Var.getPhotoImage().M0;
            float f20 = q1Var.getPhotoImage().N0;
            float f21 = q1Var.getPhotoImage().O0;
            f10 = 0.0f;
            int i18 = 0;
            for (int i19 = 4; i18 < i19; i19 = 4) {
                iArr[i18] = q1Var.getPhotoImage().X0[i18];
                i18++;
            }
            f12 = f18;
            f13 = f19;
            f11 = f21;
            f14 = f20;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        R(f1Var);
        int i20 = i11 - i17;
        int i21 = i12 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f22 = f11;
        u0 u0Var2 = u0Var;
        ?? jVar = new v4.j(f1Var, i17, translationY, i11, i12);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f32384u0;
            Rect rect = transitionParams.E0;
            aj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                q1Var.setAnimationOffsetX(-i20);
            }
            boolean z14 = r0Var instanceof i;
            ck0 ck0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                i iVar = (i) r0Var;
                i14 = i20;
                if (transitionParams.f32391w0 && iVar.f55675f != f10 && iVar.f55674e != f10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                jVar.f55683n = z13;
                if (z13) {
                    ck0Var.setClipChildren(false);
                    ck0Var.invalidate();
                    transitionParams.f32326g0 = true;
                    if (q1Var.getMessageObject().h4()) {
                        transitionParams.f32357n0 = f12;
                        transitionParams.f32360o0 = f13;
                        transitionParams.f32364p0 = f14;
                        transitionParams.f32368q0 = f22;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.f32357n0 = photoImage.L0;
                        transitionParams.f32360o0 = photoImage.M0;
                        transitionParams.f32364p0 = photoImage.N0;
                        transitionParams.f32368q0 = photoImage.O0;
                        transitionParams.B0 = photoImage.X0;
                    }
                    transitionParams.C0 = false;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 4) {
                            break;
                        } else if (iArr2[i22] != transitionParams.B0[i22]) {
                            transitionParams.C0 = true;
                            break;
                        } else {
                            i22++;
                        }
                    }
                    float f23 = transitionParams.f32357n0;
                    float f24 = iVar.f55673c;
                    if (f23 == f24 && transitionParams.f32360o0 == iVar.d && transitionParams.f32368q0 == iVar.f55675f && transitionParams.f32364p0 == iVar.f55674e && !transitionParams.C0) {
                        transitionParams.f32326g0 = false;
                        jVar.f55683n = false;
                    } else {
                        jVar.f55684o = f24;
                        jVar.f55685p = iVar.d;
                        jVar.f55686q = iVar.f55674e;
                        jVar.f55687r = iVar.f55675f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.f22900c;
                            zi ziVar = currentMessagesGroup.f22908m;
                            boolean z16 = ziVar.f28314o;
                            if (z15 != z16) {
                                if (z16) {
                                    f17 = 1.0f;
                                } else {
                                    f17 = f10;
                                }
                                ziVar.f28313n = f17;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.X0) {
                                transitionParams.B0 = new int[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    transitionParams.B0[i23] = photoImage.X0[i23];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.w3(jVar.f55684o, jVar.f55685p, jVar.f55686q, jVar.f55687r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f32391w0 && (((P3 = q1Var.getMessageObject().P3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.f55690u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.Y6 != transitionParams.F0) {
                        jVar.f55688s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.f55689t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        jVar.f55688s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.f55689t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.f55681l = true;
                    transitionParams.f32395x0 = true;
                    transitionParams.f32330h0 = -jVar.f55688s;
                    transitionParams.f32335i0 = -jVar.f55689t;
                    transitionParams.f32344k0 = -jVar.f55690u;
                    transitionParams.f32340j0 = -jVar.v;
                    ck0Var.setClipChildren(false);
                    ck0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    ck0 ck0Var2 = (ck0) view.getParent();
                    zi ziVar2 = currentMessagesGroup.f22908m;
                    boolean z17 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < ck0Var2.getChildCount()) {
                        View childAt = ck0Var2.getChildAt(i24);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                ajVar = currentMessagesGroup;
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                i16 = i24;
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (q1Var3.getTransitionParams().f32391w0 || ziVar2.f28315p) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z17 = false;
                                }
                                i24 = i16 + 1;
                                currentMessagesGroup = ajVar;
                            }
                        }
                        ajVar = currentMessagesGroup;
                        i16 = i24;
                        i24 = i16 + 1;
                        currentMessagesGroup = ajVar;
                    }
                    ziVar2.f28315p = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        jVar.f55679j = false;
                        ziVar2.f28309j = false;
                    } else {
                        int i29 = (-i25) + ziVar2.f28303b;
                        jVar.f55676f = i29;
                        int i30 = (-i26) + ziVar2.d;
                        jVar.f55677g = i30;
                        int i31 = (-i27) + ziVar2.f28302a;
                        jVar.h = i31;
                        int i32 = (-i28) + ziVar2.f28304c;
                        jVar.f55678i = i32;
                        jVar.f55679j = true;
                        ziVar2.f28309j = true;
                        ziVar2.f28306f = i29;
                        ziVar2.h = i30;
                        ziVar2.f28305e = i31;
                        ziVar2.f28307g = i32;
                        if (ziVar2.f28314o) {
                            f16 = 1.0f;
                        } else {
                            f16 = f10;
                        }
                        ziVar2.f28313n = f16;
                        ck0Var2.setClipChildren(false);
                        ck0Var2.invalidate();
                    }
                    ziVar2.f28308i = z17;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            aj ajVar2 = (aj) hashMap.get(valueOf);
            if (ajVar2 != null) {
                zi ziVar3 = ajVar2.f22908m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().e1()));
                if (transitionParams.f32391w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    jVar.f55691w = true;
                    transitionParams.f32395x0 = true;
                    jVar.f55688s = backgroundDrawableLeft2 - ziVar3.f28302a;
                    jVar.f55689t = backgroundDrawableRight2 - ziVar3.f28304c;
                    jVar.f55690u = backgroundDrawableTop2 - ziVar3.f28303b;
                    jVar.v = backgroundDrawableBottom2 - ziVar3.d;
                    jVar.f55681l = false;
                    transitionParams.f32330h0 = (int) ((-i15) - q1Var.getAnimationOffsetX());
                    transitionParams.f32335i0 = (int) ((-jVar.f55689t) - q1Var.getAnimationOffsetX());
                    transitionParams.f32344k0 = (int) ((-jVar.f55690u) - q1Var.getTranslationY());
                    transitionParams.f32340j0 = (int) ((-jVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    ck0Var.setClipChildren(false);
                    ck0Var.invalidate();
                } else {
                    ziVar3.f28308i = true;
                }
            }
            xi xiVar = q1Var.M;
            if (xiVar != null && (xiVar.f27891l & 8) == 0 && q1Var.L.f22904i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!q1Var.C6 && !q1Var.K && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f32403z0 != z11) {
                z12 = true;
                jVar.f55680k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z12 = true;
            }
            boolean a11 = transitionParams.a();
            jVar.f55682m = a11;
            if (a11) {
                transitionParams.h = z12;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i21 == 0 && !jVar.f55683n && !jVar.f55691w && !jVar.f55679j && !jVar.f55680k && !jVar.f55681l && !a11) {
                v(f1Var);
                return false;
            }
        } else if (u0Var2 != null) {
            t0 transitionParams2 = u0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams2.f31819a) {
                a10 = false;
            } else {
                a10 = transitionParams2.d.F0.a();
            }
            jVar.f55682m = a10;
            if (a10) {
                transitionParams2.f31820b = true;
                transitionParams2.f31821c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a10) {
                v(f1Var);
                return false;
            }
        } else if (view2 instanceof g0) {
            ((g0) view2).setAnimating(true);
        } else if (view2 instanceof sa) {
            ((sa) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(f1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f59172r.add(jVar);
        F();
        return true;
    }

    @Override
    public final void s(f1 f1Var, r0 r0Var) {
        if (s2.f26723a) {
            a8.b("animate remove");
        }
        super.s(f1Var, r0Var);
        View view = f1Var.f59122a;
        if (r0Var != null) {
            int i7 = r0Var.f10688b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.f10687a;
            int i10 = top - i7;
            if (i10 != 0) {
                view.setTranslationY(-i10);
            }
            if (view instanceof q1) {
                q1 q1Var = (q1) view;
                if (left != 0) {
                    q1Var.setAnimationOffsetX(-left);
                }
                if (r0Var instanceof i) {
                    i iVar = (i) r0Var;
                    q1Var.w3(iVar.f55673c, iVar.d, iVar.f55674e, iVar.f55675f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
