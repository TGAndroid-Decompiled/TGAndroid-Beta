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
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.bn;
import org.telegram.ui.qe;
import v4.c1;
import v4.f1;
public abstract class k extends v4.l {
    public static final kr V = new kr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final bn F;
    public final ek0 G;
    public boolean N;
    public f1 O;
    public fo P;
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

    public k(bn bnVar, ek0 ek0Var, i6 i6Var) {
        this.R = i6Var;
        this.F = bnVar;
        this.G = ek0Var;
        this.f59296o = V;
        this.f59275n = true;
        this.f59274m = false;
    }

    @Override
    public final void B(v4.j jVar) {
        View view;
        v4.j jVar2;
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
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.f59283a);
            duration.translationX(jVar.f59286e - jVar.f59285c);
            duration.translationY(jVar.f59287f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new h(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f59284b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new h(this, jVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(f1 f1Var, v4.k kVar) {
        T(f1Var, kVar, false);
    }

    @Override
    public final boolean J(v4.j jVar, f1 f1Var) {
        nz0 nz0Var;
        if (s2.f26829a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(f1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f1Var.f59245a;
        if (this.K.contains(view) && (nz0Var = (nz0) this.U.run()) != null) {
            nz0Var.a(view);
        }
        if (jVar.f59284b == f1Var) {
            jVar.f59284b = null;
        } else if (jVar.f59283a == f1Var) {
            jVar.f59283a = null;
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

    public final void T(final v4.f1 r21, v4.k r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: pi.k.T(v4.f1, v4.k, boolean):void");
    }

    public final void U() {
        nz0 nz0Var;
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
        if (!this.K.isEmpty() && (nz0Var = (nz0) this.U.run()) != null) {
            ArrayList arrayList2 = nz0Var.f37963c;
            if (!nz0Var.f37964e) {
                nz0Var.f37964e = true;
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    mz0 mz0Var = (mz0) obj2;
                    Runnable runnable = mz0Var.d;
                    if (runnable != null) {
                        nz0.b(runnable);
                        mz0Var.d = null;
                    }
                }
                arrayList2.clear();
                lz0 lz0Var = nz0Var.f37961a;
                if (lz0Var != null) {
                    lz0Var.h();
                }
                Runnable runnable2 = nz0Var.d;
                if (runnable2 != null) {
                    nz0Var.d = null;
                    nz0.b(runnable2);
                }
            }
        }
    }

    public final void V(aj ajVar) {
        if (ajVar == null) {
            return;
        }
        ArrayList arrayList = ajVar.d;
        zi ziVar = ajVar.f23016m;
        if (arrayList.size() == 0) {
            ziVar.f28398i = true;
            return;
        }
        if (ziVar.f28393b == 0 && ziVar.d == 0 && ziVar.f28392a == 0 && ziVar.f28394c == 0) {
            ek0 ek0Var = this.G;
            int childCount = ek0Var.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof r1) {
                    r1 r1Var = (r1) childAt;
                    fj messageObject = r1Var.getMessageObject();
                    if (r1Var.getTransitionParams().f32536w0 && arrayList.contains(messageObject)) {
                        ziVar.f28393b = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                        ziVar.d = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                        ziVar.f28392a = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                        ziVar.f28394c = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                        ziVar.f28404o = r1Var.d2();
                        ziVar.f28400k = r1Var.L2();
                        ziVar.f28401l = r1Var.K2();
                        ziVar.f28405p = true;
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
        ek0 ek0Var = this.G;
        if (z10) {
            int measuredHeight = (ek0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((g0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof ua) {
            int measuredHeight2 = (ek0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ua) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof r1) {
            r1 r1Var = (r1) view;
            r1Var.getTransitionParams().e();
            r1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof v0) {
            u0 transitionParams = ((v0) view).getTransitionParams();
            transitionParams.f31949b = false;
            transitionParams.f31950c = 1.0f;
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
            if (this.f59298q.contains(T) || this.f59305y.contains(T)) {
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
                arrayList = this.f59298q;
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
                    i7 += ((f1) arrayList.get(i11)).f59245a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((f1) arrayList.get(i12)).f59245a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        f1 T = this.G.T(view);
        if (T != null) {
            if (this.f59297p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(f1 f1Var) {
        nz0 nz0Var;
        Animator animator = (Animator) this.J.remove(f1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f1Var.f59245a;
        if (this.K.contains(view) && (nz0Var = (nz0) this.U.run()) != null) {
            nz0Var.a(view);
        }
        super.f(f1Var);
        X(view);
    }

    @Override
    public void g() {
        if (s2.f26829a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((aj) obj).f23016m.f28405p = false;
        }
        arrayList.clear();
        U();
        fo foVar = this.P;
        if (foVar != null) {
            foVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f59299r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.k kVar = (v4.k) arrayList2.get(size2);
            X(kVar.f59292a.f59245a);
            v(kVar.f59292a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f59297p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            f1 f1Var = (f1) arrayList3.get(size3);
            X(f1Var.f59245a);
            d(f1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f59298q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            f1 f1Var2 = (f1) arrayList4.get(size4);
            X(f1Var2.f59245a);
            u(f1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f59300s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((v4.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f59302u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                v4.k kVar2 = (v4.k) arrayList7.get(size7);
                X(kVar2.f59292a.f59245a);
                v(kVar2.f59292a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f59301t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                f1 f1Var3 = (f1) arrayList9.get(size9);
                X(f1Var3.f59245a);
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
                I((v4.j) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
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
        View view = f1Var.f59245a;
        if (view instanceof r1) {
            ?? obj = new Object();
            obj.f10677a = l10.f10677a;
            obj.f10678b = l10.f10678b;
            y1 transitionParams = ((r1) view).getTransitionParams();
            obj.f55796c = transitionParams.f32447b;
            obj.d = transitionParams.f32452c;
            obj.f55797e = transitionParams.d;
            obj.f55798f = transitionParams.f32460e;
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
        View view = f1Var.f59245a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof r1) {
            ((r1) view).getTransitionParams().f32479i = true;
        }
        this.f59298q.add(f1Var);
    }

    @Override
    public final boolean q(f1 f1Var, f1 f1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        float translationX;
        if (f1Var == f1Var2) {
            return r(f1Var, r0Var, i7, i10, i11, i12);
        }
        View view = f1Var.f59245a;
        if (view instanceof r1) {
            translationX = ((r1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(f1Var);
        int i13 = (int) ((i11 - i7) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof r1) {
            ((r1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f1Var2.f59245a;
        R(f1Var2);
        if (view2 instanceof r1) {
            ((r1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.f59300s.add(new v4.j(f1Var, f1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public final boolean r(f1 f1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
        int translationX;
        int i13;
        r1 r1Var;
        v0 v0Var;
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
        View view2 = f1Var.f59245a;
        if (view2 instanceof r1) {
            r1 r1Var2 = (r1) view2;
            translationX = i7 + ((int) r1Var2.getAnimationOffsetX());
            if (r1Var2.getTransitionParams().f32527t2 != r1Var2.getTopMediaOffset()) {
                i13 = (r1Var2.getTransitionParams().f32527t2 - r1Var2.getTopMediaOffset()) + i10;
            } else {
                i13 = i10;
            }
            r1Var = r1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            v0Var = (v0) view2;
            r1Var = null;
        } else {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            r1Var = null;
            v0Var = null;
        }
        int i17 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (r1Var != null) {
            float f18 = r1Var.getPhotoImage().L0;
            float f19 = r1Var.getPhotoImage().M0;
            float f20 = r1Var.getPhotoImage().N0;
            float f21 = r1Var.getPhotoImage().O0;
            f10 = 0.0f;
            int i18 = 0;
            for (int i19 = 4; i18 < i19; i19 = 4) {
                iArr[i18] = r1Var.getPhotoImage().X0[i18];
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
        v0 v0Var2 = v0Var;
        ?? kVar = new v4.k(f1Var, i17, translationY, i11, i12);
        if (r1Var != null) {
            y1 transitionParams = r1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f32529u0;
            Rect rect = transitionParams.E0;
            aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                r1Var.setAnimationOffsetX(-i20);
            }
            boolean z14 = r0Var instanceof i;
            ek0 ek0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = r1Var.getPhotoImage();
                view = view2;
                i iVar = (i) r0Var;
                i14 = i20;
                if (transitionParams.f32536w0 && iVar.f55798f != f10 && iVar.f55797e != f10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.f55806n = z13;
                if (z13) {
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                    transitionParams.f32471g0 = true;
                    if (r1Var.getMessageObject().h4()) {
                        transitionParams.f32502n0 = f12;
                        transitionParams.f32505o0 = f13;
                        transitionParams.f32509p0 = f14;
                        transitionParams.f32513q0 = f22;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.f32502n0 = photoImage.L0;
                        transitionParams.f32505o0 = photoImage.M0;
                        transitionParams.f32509p0 = photoImage.N0;
                        transitionParams.f32513q0 = photoImage.O0;
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
                    float f23 = transitionParams.f32502n0;
                    float f24 = iVar.f55796c;
                    if (f23 == f24 && transitionParams.f32505o0 == iVar.d && transitionParams.f32513q0 == iVar.f55798f && transitionParams.f32509p0 == iVar.f55797e && !transitionParams.C0) {
                        transitionParams.f32471g0 = false;
                        kVar.f55806n = false;
                    } else {
                        kVar.f55807o = f24;
                        kVar.f55808p = iVar.d;
                        kVar.f55809q = iVar.f55797e;
                        kVar.f55810r = iVar.f55798f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.f23008c;
                            zi ziVar = currentMessagesGroup.f23016m;
                            boolean z16 = ziVar.f28404o;
                            if (z15 != z16) {
                                if (z16) {
                                    f17 = 1.0f;
                                } else {
                                    f17 = f10;
                                }
                                ziVar.f28403n = f17;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.X0) {
                                transitionParams.B0 = new int[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    transitionParams.B0[i23] = photoImage.X0[i23];
                                }
                            }
                            photoImage.M0(iArr2);
                        }
                        r1Var.w3(kVar.f55807o, kVar.f55808p, kVar.f55809q, kVar.f55810r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f32536w0 && (((P3 = r1Var.getMessageObject().P3()) && rect.left != r1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != r1Var.getBackgroundDrawableRight()) || rect.top != r1Var.getBackgroundDrawableTop() || rect.bottom != r1Var.getBackgroundDrawableBottom()))) {
                    kVar.v = r1Var.getBackgroundDrawableBottom() - rect.bottom;
                    kVar.f55813u = r1Var.getBackgroundDrawableTop() - rect.top;
                    if (r1Var.Y6 != transitionParams.F0) {
                        kVar.f55811s = r1Var.getBackgroundDrawableLeft() - rect.left;
                        kVar.f55812t = r1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        kVar.f55811s = r1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        kVar.f55812t = r1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    kVar.f55804l = true;
                    transitionParams.f32540x0 = true;
                    transitionParams.f32475h0 = -kVar.f55811s;
                    transitionParams.f32480i0 = -kVar.f55812t;
                    transitionParams.f32489k0 = -kVar.f55813u;
                    transitionParams.f32485j0 = -kVar.v;
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    ek0 ek0Var2 = (ek0) view.getParent();
                    zi ziVar2 = currentMessagesGroup.f23016m;
                    boolean z17 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < ek0Var2.getChildCount()) {
                        View childAt = ek0Var2.getChildAt(i24);
                        if (childAt instanceof r1) {
                            r1 r1Var3 = (r1) childAt;
                            if (r1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !r1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = r1Var3.getBackgroundDrawableLeft() + r1Var3.getLeft();
                                ajVar = currentMessagesGroup;
                                int backgroundDrawableRight = r1Var3.getBackgroundDrawableRight() + r1Var3.getLeft();
                                i16 = i24;
                                int backgroundDrawableTop = r1Var3.getBackgroundDrawableTop() + r1Var3.getPaddingTop() + r1Var3.getTop();
                                int backgroundDrawableBottom = r1Var3.getBackgroundDrawableBottom() + r1Var3.getPaddingTop() + r1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (r1Var3.getTransitionParams().f32536w0 || ziVar2.f28405p) {
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
                    ziVar2.f28405p = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        kVar.f55802j = false;
                        ziVar2.f28399j = false;
                    } else {
                        int i29 = (-i25) + ziVar2.f28393b;
                        kVar.f55799f = i29;
                        int i30 = (-i26) + ziVar2.d;
                        kVar.f55800g = i30;
                        int i31 = (-i27) + ziVar2.f28392a;
                        kVar.h = i31;
                        int i32 = (-i28) + ziVar2.f28394c;
                        kVar.f55801i = i32;
                        kVar.f55802j = true;
                        ziVar2.f28399j = true;
                        ziVar2.f28396f = i29;
                        ziVar2.h = i30;
                        ziVar2.f28395e = i31;
                        ziVar2.f28397g = i32;
                        if (ziVar2.f28404o) {
                            f16 = 1.0f;
                        } else {
                            f16 = f10;
                        }
                        ziVar2.f28403n = f16;
                        ek0Var2.setClipChildren(false);
                        ek0Var2.invalidate();
                    }
                    ziVar2.f28398i = z17;
                }
            }
            Integer valueOf = Integer.valueOf(r1Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            aj ajVar2 = (aj) hashMap.get(valueOf);
            if (ajVar2 != null) {
                zi ziVar3 = ajVar2.f23016m;
                hashMap.remove(Integer.valueOf(r1Var.getMessageObject().e1()));
                if (transitionParams.f32536w0) {
                    int backgroundDrawableLeft2 = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                    int backgroundDrawableRight2 = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                    int backgroundDrawableTop2 = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                    int backgroundDrawableBottom2 = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                    kVar.f55814w = true;
                    transitionParams.f32540x0 = true;
                    kVar.f55811s = backgroundDrawableLeft2 - ziVar3.f28392a;
                    kVar.f55812t = backgroundDrawableRight2 - ziVar3.f28394c;
                    kVar.f55813u = backgroundDrawableTop2 - ziVar3.f28393b;
                    kVar.v = backgroundDrawableBottom2 - ziVar3.d;
                    kVar.f55804l = false;
                    transitionParams.f32475h0 = (int) ((-i15) - r1Var.getAnimationOffsetX());
                    transitionParams.f32480i0 = (int) ((-kVar.f55812t) - r1Var.getAnimationOffsetX());
                    transitionParams.f32489k0 = (int) ((-kVar.f55813u) - r1Var.getTranslationY());
                    transitionParams.f32485j0 = (int) ((-kVar.v) - r1Var.getTranslationY());
                    transitionParams.D0 = true;
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                } else {
                    ziVar3.f28398i = true;
                }
            }
            xi xiVar = r1Var.M;
            if (xiVar != null && (xiVar.f28005l & 8) == 0 && r1Var.L.f23012i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!r1Var.C6 && !r1Var.K && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f32548z0 != z11) {
                z12 = true;
                kVar.f55803k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z12 = true;
            }
            boolean a11 = transitionParams.a();
            kVar.f55805m = a11;
            if (a11) {
                transitionParams.h = z12;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i21 == 0 && !kVar.f55806n && !kVar.f55814w && !kVar.f55802j && !kVar.f55803k && !kVar.f55804l && !a11) {
                v(f1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams2 = v0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams2.f31948a) {
                a10 = false;
            } else {
                a10 = transitionParams2.d.F0.a();
            }
            kVar.f55805m = a10;
            if (a10) {
                transitionParams2.f31949b = true;
                transitionParams2.f31950c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a10) {
                v(f1Var);
                return false;
            }
        } else if (view2 instanceof g0) {
            ((g0) view2).setAnimating(true);
        } else if (view2 instanceof ua) {
            ((ua) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(f1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f59299r.add(kVar);
        F();
        return true;
    }

    @Override
    public final void s(f1 f1Var, r0 r0Var) {
        if (s2.f26829a) {
            a8.b("animate remove");
        }
        super.s(f1Var, r0Var);
        View view = f1Var.f59245a;
        if (r0Var != null) {
            int i7 = r0Var.f10678b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.f10677a;
            int i10 = top - i7;
            if (i10 != 0) {
                view.setTranslationY(-i10);
            }
            if (view instanceof r1) {
                r1 r1Var = (r1) view;
                if (left != 0) {
                    r1Var.setAnimationOffsetX(-left);
                }
                if (r0Var instanceof i) {
                    i iVar = (i) r0Var;
                    r1Var.w3(iVar.f55796c, iVar.d, iVar.f55797e, iVar.f55798f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
