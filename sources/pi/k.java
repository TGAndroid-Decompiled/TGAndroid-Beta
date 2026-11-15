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
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.r2;
import org.telegram.messenger.yi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.an;
import org.telegram.ui.ne;
import v4.b1;
import v4.e1;
public abstract class k extends v4.k {
    public static final er V = new er(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final an F;
    public final uj0 G;
    public boolean N;
    public e1 O;
    public xn P;
    public boolean Q;
    public final e6 R;
    public ne T;
    public ne U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public k(an anVar, uj0 uj0Var, e6 e6Var) {
        this.R = e6Var;
        this.F = anVar;
        this.G = uj0Var;
        this.f58586o = V;
        this.f58565n = true;
        this.f58564m = false;
    }

    @Override
    public final void B(v4.i iVar) {
        View view;
        v4.i iVar2;
        e1 e1Var = iVar.f58573a;
        View view2 = null;
        if (e1Var == null) {
            view = null;
        } else {
            view = e1Var.f58535a;
        }
        e1 e1Var2 = iVar.f58574b;
        if (e1Var2 != null) {
            view2 = e1Var2.f58535a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.f58573a);
            duration.translationX(iVar.f58576e - iVar.f58575c);
            duration.translationY(iVar.f58577f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new h(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f58574b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new h(this, iVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(e1 e1Var, v4.j jVar) {
        T(e1Var, jVar, false);
    }

    @Override
    public final boolean J(v4.i iVar, e1 e1Var) {
        fz0 fz0Var;
        if (r2.f26198a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.f58535a;
        if (this.K.contains(view) && (fz0Var = (fz0) this.U.run()) != null) {
            fz0Var.a(view);
        }
        if (iVar.f58574b == e1Var) {
            iVar.f58574b = null;
        } else if (iVar.f58573a == e1Var) {
            iVar.f58573a = null;
        } else {
            return false;
        }
        X(view);
        d(e1Var);
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

    public final void T(final v4.e1 r21, v4.j r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: pi.k.T(v4.e1, v4.j, boolean):void");
    }

    public final void U() {
        fz0 fz0Var;
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
        if (!this.K.isEmpty() && (fz0Var = (fz0) this.U.run()) != null) {
            ArrayList arrayList2 = fz0Var.f34757c;
            if (!fz0Var.f34758e) {
                fz0Var.f34758e = true;
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    ez0 ez0Var = (ez0) obj2;
                    Runnable runnable = ez0Var.d;
                    if (runnable != null) {
                        fz0.b(runnable);
                        ez0Var.d = null;
                    }
                }
                arrayList2.clear();
                dz0 dz0Var = fz0Var.f34755a;
                if (dz0Var != null) {
                    dz0Var.h();
                }
                Runnable runnable2 = fz0Var.d;
                if (runnable2 != null) {
                    fz0Var.d = null;
                    fz0.b(runnable2);
                }
            }
        }
    }

    public final void V(bj bjVar) {
        if (bjVar == null) {
            return;
        }
        ArrayList arrayList = bjVar.d;
        aj ajVar = bjVar.f22717m;
        if (arrayList.size() == 0) {
            ajVar.f22522i = true;
            return;
        }
        if (ajVar.f22517b == 0 && ajVar.d == 0 && ajVar.f22516a == 0 && ajVar.f22518c == 0) {
            uj0 uj0Var = this.G;
            int childCount = uj0Var.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = uj0Var.getChildAt(i7);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    gj messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().f32008w0 && arrayList.contains(messageObject)) {
                        ajVar.f22517b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        ajVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        ajVar.f22516a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        ajVar.f22518c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        ajVar.f22528o = q1Var.d2();
                        ajVar.f22524k = q1Var.J2();
                        ajVar.f22525l = q1Var.I2();
                        ajVar.f22529p = true;
                        break;
                    }
                }
                i7++;
            }
        }
        this.I.add(bjVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof f0;
        uj0 uj0Var = this.G;
        if (z10) {
            int measuredHeight = (uj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((f0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof ra) {
            int measuredHeight2 = (uj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ra) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof q1) {
            q1 q1Var = (q1) view;
            q1Var.getTransitionParams().e();
            q1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof t0) {
            s0 transitionParams = ((t0) view).getTransitionParams();
            transitionParams.f31384b = false;
            transitionParams.f31385c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(ne neVar, ne neVar2) {
        this.T = neVar;
        this.U = neVar2;
    }

    public final boolean Z(View view) {
        e1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f58588q.contains(T) || this.f58595y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(e1 e1Var, r0 r0Var, r0 r0Var2) {
        ArrayList arrayList;
        int i7;
        boolean a10 = super.a(e1Var, r0Var, r0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f58588q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((e1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i7 += ((e1) arrayList.get(i11)).f58535a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((e1) arrayList.get(i12)).f58535a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        e1 T = this.G.T(view);
        if (T != null) {
            if (this.f58587p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(e1 e1Var) {
        fz0 fz0Var;
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.f58535a;
        if (this.K.contains(view) && (fz0Var = (fz0) this.U.run()) != null) {
            fz0Var.a(view);
        }
        super.f(e1Var);
        X(view);
    }

    @Override
    public void g() {
        if (r2.f26198a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((bj) obj).f22717m.f22529p = false;
        }
        arrayList.clear();
        U();
        xn xnVar = this.P;
        if (xnVar != null) {
            xnVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f58589r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.j jVar = (v4.j) arrayList2.get(size2);
            X(jVar.f58582a.f58535a);
            v(jVar.f58582a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f58587p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            e1 e1Var = (e1) arrayList3.get(size3);
            X(e1Var.f58535a);
            d(e1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f58588q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            e1 e1Var2 = (e1) arrayList4.get(size4);
            X(e1Var2.f58535a);
            u(e1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f58590s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((v4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f58592u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                v4.j jVar2 = (v4.j) arrayList7.get(size7);
                X(jVar2.f58582a.f58535a);
                v(jVar2.f58582a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f58591t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                e1 e1Var3 = (e1) arrayList9.get(size9);
                X(e1Var3.f58535a);
                u(e1Var3);
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
        E(this.f58596z);
        E(this.f58595y);
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
    public final r0 l(b1 b1Var, e1 e1Var, int i7, List list) {
        r0 l10 = super.l(b1Var, e1Var, i7, list);
        View view = e1Var.f58535a;
        if (view instanceof q1) {
            ?? obj = new Object();
            obj.f10369a = l10.f10369a;
            obj.f10370b = l10.f10370b;
            x1 transitionParams = ((q1) view).getTransitionParams();
            obj.f55097c = transitionParams.f31919b;
            obj.d = transitionParams.f31924c;
            obj.f55098e = transitionParams.d;
            obj.f55099f = transitionParams.f31932e;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: pi.k.m():void");
    }

    @Override
    public final void p(e1 e1Var) {
        R(e1Var);
        View view = e1Var.f58535a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().f31951i = true;
        }
        this.f58588q.add(e1Var);
    }

    @Override
    public final boolean q(e1 e1Var, e1 e1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        float translationX;
        if (e1Var == e1Var2) {
            return r(e1Var, r0Var, i7, i10, i11, i12);
        }
        View view = e1Var.f58535a;
        if (view instanceof q1) {
            translationX = ((q1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(e1Var);
        int i13 = (int) ((i11 - i7) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = e1Var2.f58535a;
        R(e1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.f58590s.add(new v4.i(e1Var, e1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public final boolean r(e1 e1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
        int translationX;
        int i13;
        q1 q1Var;
        t0 t0Var;
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
        bj bjVar;
        int i16;
        boolean z13;
        boolean P3;
        float f17;
        View view2 = e1Var.f58535a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i7 + ((int) q1Var2.getAnimationOffsetX());
            if (q1Var2.getTransitionParams().f31999t2 != q1Var2.getTopMediaOffset()) {
                i13 = (q1Var2.getTransitionParams().f31999t2 - q1Var2.getTopMediaOffset()) + i10;
            } else {
                i13 = i10;
            }
            q1Var = q1Var2;
            t0Var = null;
        } else if (view2 instanceof t0) {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            t0Var = (t0) view2;
            q1Var = null;
        } else {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            q1Var = null;
            t0Var = null;
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
        R(e1Var);
        int i20 = i11 - i17;
        int i21 = i12 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f22 = f11;
        t0 t0Var2 = t0Var;
        ?? jVar = new v4.j(e1Var, i17, translationY, i11, i12);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f32001u0;
            Rect rect = transitionParams.E0;
            bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                q1Var.setAnimationOffsetX(-i20);
            }
            boolean z14 = r0Var instanceof i;
            uj0 uj0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                i iVar = (i) r0Var;
                i14 = i20;
                if (transitionParams.f32008w0 && iVar.f55099f != f10 && iVar.f55098e != f10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                jVar.f55107n = z13;
                if (z13) {
                    uj0Var.setClipChildren(false);
                    uj0Var.invalidate();
                    transitionParams.f31943g0 = true;
                    if (q1Var.getMessageObject().h4()) {
                        transitionParams.f31974n0 = f12;
                        transitionParams.f31977o0 = f13;
                        transitionParams.f31981p0 = f14;
                        transitionParams.f31985q0 = f22;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.f31974n0 = photoImage.L0;
                        transitionParams.f31977o0 = photoImage.M0;
                        transitionParams.f31981p0 = photoImage.N0;
                        transitionParams.f31985q0 = photoImage.O0;
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
                    float f23 = transitionParams.f31974n0;
                    float f24 = iVar.f55097c;
                    if (f23 == f24 && transitionParams.f31977o0 == iVar.d && transitionParams.f31985q0 == iVar.f55099f && transitionParams.f31981p0 == iVar.f55098e && !transitionParams.C0) {
                        transitionParams.f31943g0 = false;
                        jVar.f55107n = false;
                    } else {
                        jVar.f55108o = f24;
                        jVar.f55109p = iVar.d;
                        jVar.f55110q = iVar.f55098e;
                        jVar.f55111r = iVar.f55099f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.f22709c;
                            aj ajVar = currentMessagesGroup.f22717m;
                            boolean z16 = ajVar.f22528o;
                            if (z15 != z16) {
                                if (z16) {
                                    f17 = 1.0f;
                                } else {
                                    f17 = f10;
                                }
                                ajVar.f22527n = f17;
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
                        q1Var.v3(jVar.f55108o, jVar.f55109p, jVar.f55110q, jVar.f55111r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f32008w0 && (((P3 = q1Var.getMessageObject().P3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.f55114u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.Y6 != transitionParams.F0) {
                        jVar.f55112s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.f55113t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        jVar.f55112s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.f55113t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.f55105l = true;
                    transitionParams.f32012x0 = true;
                    transitionParams.f31947h0 = -jVar.f55112s;
                    transitionParams.f31952i0 = -jVar.f55113t;
                    transitionParams.f31961k0 = -jVar.f55114u;
                    transitionParams.f31957j0 = -jVar.v;
                    uj0Var.setClipChildren(false);
                    uj0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    uj0 uj0Var2 = (uj0) view.getParent();
                    aj ajVar2 = currentMessagesGroup.f22717m;
                    boolean z17 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < uj0Var2.getChildCount()) {
                        View childAt = uj0Var2.getChildAt(i24);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                bjVar = currentMessagesGroup;
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
                                if (q1Var3.getTransitionParams().f32008w0 || ajVar2.f22529p) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z17 = false;
                                }
                                i24 = i16 + 1;
                                currentMessagesGroup = bjVar;
                            }
                        }
                        bjVar = currentMessagesGroup;
                        i16 = i24;
                        i24 = i16 + 1;
                        currentMessagesGroup = bjVar;
                    }
                    ajVar2.f22529p = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        jVar.f55103j = false;
                        ajVar2.f22523j = false;
                    } else {
                        int i29 = (-i25) + ajVar2.f22517b;
                        jVar.f55100f = i29;
                        int i30 = (-i26) + ajVar2.d;
                        jVar.f55101g = i30;
                        int i31 = (-i27) + ajVar2.f22516a;
                        jVar.h = i31;
                        int i32 = (-i28) + ajVar2.f22518c;
                        jVar.f55102i = i32;
                        jVar.f55103j = true;
                        ajVar2.f22523j = true;
                        ajVar2.f22520f = i29;
                        ajVar2.h = i30;
                        ajVar2.f22519e = i31;
                        ajVar2.f22521g = i32;
                        if (ajVar2.f22528o) {
                            f16 = 1.0f;
                        } else {
                            f16 = f10;
                        }
                        ajVar2.f22527n = f16;
                        uj0Var2.setClipChildren(false);
                        uj0Var2.invalidate();
                    }
                    ajVar2.f22522i = z17;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            bj bjVar2 = (bj) hashMap.get(valueOf);
            if (bjVar2 != null) {
                aj ajVar3 = bjVar2.f22717m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().e1()));
                if (transitionParams.f32008w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    jVar.f55115w = true;
                    transitionParams.f32012x0 = true;
                    jVar.f55112s = backgroundDrawableLeft2 - ajVar3.f22516a;
                    jVar.f55113t = backgroundDrawableRight2 - ajVar3.f22518c;
                    jVar.f55114u = backgroundDrawableTop2 - ajVar3.f22517b;
                    jVar.v = backgroundDrawableBottom2 - ajVar3.d;
                    jVar.f55105l = false;
                    transitionParams.f31947h0 = (int) ((-i15) - q1Var.getAnimationOffsetX());
                    transitionParams.f31952i0 = (int) ((-jVar.f55113t) - q1Var.getAnimationOffsetX());
                    transitionParams.f31961k0 = (int) ((-jVar.f55114u) - q1Var.getTranslationY());
                    transitionParams.f31957j0 = (int) ((-jVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    uj0Var.setClipChildren(false);
                    uj0Var.invalidate();
                } else {
                    ajVar3.f22522i = true;
                }
            }
            yi yiVar = q1Var.M;
            if (yiVar != null && (yiVar.f27753l & 8) == 0 && q1Var.L.f22713i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!q1Var.C6 && !q1Var.K && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f32020z0 != z11) {
                z12 = true;
                jVar.f55104k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z12 = true;
            }
            boolean a11 = transitionParams.a();
            jVar.f55106m = a11;
            if (a11) {
                transitionParams.h = z12;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i21 == 0 && !jVar.f55107n && !jVar.f55115w && !jVar.f55103j && !jVar.f55104k && !jVar.f55105l && !a11) {
                v(e1Var);
                return false;
            }
        } else if (t0Var2 != null) {
            s0 transitionParams2 = t0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams2.f31383a) {
                a10 = false;
            } else {
                a10 = transitionParams2.d.F0.a();
            }
            jVar.f55106m = a10;
            if (a10) {
                transitionParams2.f31384b = true;
                transitionParams2.f31385c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a10) {
                v(e1Var);
                return false;
            }
        } else if (view2 instanceof f0) {
            ((f0) view2).setAnimating(true);
        } else if (view2 instanceof ra) {
            ((ra) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(e1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f58589r.add(jVar);
        F();
        return true;
    }

    @Override
    public final void s(e1 e1Var, r0 r0Var) {
        if (r2.f26198a) {
            a8.b("animate remove");
        }
        super.s(e1Var, r0Var);
        View view = e1Var.f58535a;
        if (r0Var != null) {
            int i7 = r0Var.f10370b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.f10369a;
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
                    q1Var.v3(iVar.f55097c, iVar.d, iVar.f55098e, iVar.f55099f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
