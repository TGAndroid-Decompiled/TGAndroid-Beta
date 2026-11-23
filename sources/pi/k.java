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
import org.telegram.messenger.s2;
import org.telegram.messenger.yi;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.bn;
import org.telegram.ui.qe;
import v4.b1;
import v4.e1;
public abstract class k extends v4.k {
    public static final nr V = new nr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final bn F;
    public final ek0 G;
    public boolean N;
    public e1 O;
    public io P;
    public boolean Q;
    public final h6 R;
    public qe T;
    public qe U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public k(bn bnVar, ek0 ek0Var, h6 h6Var) {
        this.R = h6Var;
        this.F = bnVar;
        this.G = ek0Var;
        this.f59161o = V;
        this.f59140n = true;
        this.f59139m = false;
    }

    @Override
    public final void B(v4.i iVar) {
        View view;
        v4.i iVar2;
        e1 e1Var = iVar.f59148a;
        View view2 = null;
        if (e1Var == null) {
            view = null;
        } else {
            view = e1Var.f59111a;
        }
        e1 e1Var2 = iVar.f59149b;
        if (e1Var2 != null) {
            view2 = e1Var2.f59111a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.f59148a);
            duration.translationX(iVar.f59151e - iVar.f59150c);
            duration.translationY(iVar.f59152f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new h(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(iVar2.f59149b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new h(this, iVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(e1 e1Var, v4.j jVar) {
        T(e1Var, jVar, false);
    }

    @Override
    public final boolean J(v4.i iVar, e1 e1Var) {
        oz0 oz0Var;
        if (s2.f26694a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.f59111a;
        if (this.K.contains(view) && (oz0Var = (oz0) this.U.run()) != null) {
            oz0Var.a(view);
        }
        if (iVar.f59149b == e1Var) {
            iVar.f59149b = null;
        } else if (iVar.f59148a == e1Var) {
            iVar.f59148a = null;
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
        oz0 oz0Var;
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
        if (!this.K.isEmpty() && (oz0Var = (oz0) this.U.run()) != null) {
            ArrayList arrayList2 = oz0Var.f38382c;
            if (!oz0Var.f38383e) {
                oz0Var.f38383e = true;
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    nz0 nz0Var = (nz0) obj2;
                    Runnable runnable = nz0Var.d;
                    if (runnable != null) {
                        oz0.b(runnable);
                        nz0Var.d = null;
                    }
                }
                arrayList2.clear();
                mz0 mz0Var = oz0Var.f38380a;
                if (mz0Var != null) {
                    mz0Var.h();
                }
                Runnable runnable2 = oz0Var.d;
                if (runnable2 != null) {
                    oz0Var.d = null;
                    oz0.b(runnable2);
                }
            }
        }
    }

    public final void V(bj bjVar) {
        if (bjVar == null) {
            return;
        }
        ArrayList arrayList = bjVar.d;
        aj ajVar = bjVar.f23084m;
        if (arrayList.size() == 0) {
            ajVar.f22889i = true;
            return;
        }
        if (ajVar.f22884b == 0 && ajVar.d == 0 && ajVar.f22883a == 0 && ajVar.f22885c == 0) {
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
                    gj messageObject = r1Var.getMessageObject();
                    if (r1Var.getTransitionParams().f32435w0 && arrayList.contains(messageObject)) {
                        ajVar.f22884b = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                        ajVar.d = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                        ajVar.f22883a = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                        ajVar.f22885c = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                        ajVar.f22895o = r1Var.d2();
                        ajVar.f22891k = r1Var.L2();
                        ajVar.f22892l = r1Var.K2();
                        ajVar.f22896p = true;
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
        } else if (view instanceof ta) {
            int measuredHeight2 = (ek0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ta) view).setAnimating(false);
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
            transitionParams.f31865b = false;
            transitionParams.f31866c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(qe qeVar, qe qeVar2) {
        this.T = qeVar;
        this.U = qeVar2;
    }

    public final boolean Z(View view) {
        e1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f59163q.contains(T) || this.f59170y.contains(T)) {
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
                arrayList = this.f59163q;
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
                    i7 += ((e1) arrayList.get(i11)).f59111a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((e1) arrayList.get(i12)).f59111a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        e1 T = this.G.T(view);
        if (T != null) {
            if (this.f59162p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(e1 e1Var) {
        oz0 oz0Var;
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.f59111a;
        if (this.K.contains(view) && (oz0Var = (oz0) this.U.run()) != null) {
            oz0Var.a(view);
        }
        super.f(e1Var);
        X(view);
    }

    @Override
    public void g() {
        if (s2.f26694a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((bj) obj).f23084m.f22896p = false;
        }
        arrayList.clear();
        U();
        io ioVar = this.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f59164r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.j jVar = (v4.j) arrayList2.get(size2);
            X(jVar.f59157a.f59111a);
            v(jVar.f59157a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f59162p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            e1 e1Var = (e1) arrayList3.get(size3);
            X(e1Var.f59111a);
            d(e1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f59163q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            e1 e1Var2 = (e1) arrayList4.get(size4);
            X(e1Var2.f59111a);
            u(e1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f59165s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((v4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f59167u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                v4.j jVar2 = (v4.j) arrayList7.get(size7);
                X(jVar2.f59157a.f59111a);
                v(jVar2.f59157a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f59166t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                e1 e1Var3 = (e1) arrayList9.get(size9);
                X(e1Var3.f59111a);
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
        E(this.f59171z);
        E(this.f59170y);
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
        View view = e1Var.f59111a;
        if (view instanceof r1) {
            ?? obj = new Object();
            obj.f10679a = l10.f10679a;
            obj.f10680b = l10.f10680b;
            y1 transitionParams = ((r1) view).getTransitionParams();
            obj.f55683c = transitionParams.f32346b;
            obj.d = transitionParams.f32351c;
            obj.f55684e = transitionParams.d;
            obj.f55685f = transitionParams.f32359e;
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
        View view = e1Var.f59111a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof r1) {
            ((r1) view).getTransitionParams().f32378i = true;
        }
        this.f59163q.add(e1Var);
    }

    @Override
    public final boolean q(e1 e1Var, e1 e1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        float translationX;
        if (e1Var == e1Var2) {
            return r(e1Var, r0Var, i7, i10, i11, i12);
        }
        View view = e1Var.f59111a;
        if (view instanceof r1) {
            translationX = ((r1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(e1Var);
        int i13 = (int) ((i11 - i7) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof r1) {
            ((r1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = e1Var2.f59111a;
        R(e1Var2);
        if (view2 instanceof r1) {
            ((r1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.f59165s.add(new v4.i(e1Var, e1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public final boolean r(e1 e1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
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
        bj bjVar;
        int i16;
        boolean z13;
        boolean P3;
        float f17;
        View view2 = e1Var.f59111a;
        if (view2 instanceof r1) {
            r1 r1Var2 = (r1) view2;
            translationX = i7 + ((int) r1Var2.getAnimationOffsetX());
            if (r1Var2.getTransitionParams().f32426t2 != r1Var2.getTopMediaOffset()) {
                i13 = (r1Var2.getTransitionParams().f32426t2 - r1Var2.getTopMediaOffset()) + i10;
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
        R(e1Var);
        int i20 = i11 - i17;
        int i21 = i12 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f22 = f11;
        v0 v0Var2 = v0Var;
        ?? jVar = new v4.j(e1Var, i17, translationY, i11, i12);
        if (r1Var != null) {
            y1 transitionParams = r1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f32428u0;
            Rect rect = transitionParams.E0;
            bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
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
                if (transitionParams.f32435w0 && iVar.f55685f != f10 && iVar.f55684e != f10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                jVar.f55693n = z13;
                if (z13) {
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                    transitionParams.f32370g0 = true;
                    if (r1Var.getMessageObject().h4()) {
                        transitionParams.f32401n0 = f12;
                        transitionParams.f32404o0 = f13;
                        transitionParams.f32408p0 = f14;
                        transitionParams.f32412q0 = f22;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.f32401n0 = photoImage.L0;
                        transitionParams.f32404o0 = photoImage.M0;
                        transitionParams.f32408p0 = photoImage.N0;
                        transitionParams.f32412q0 = photoImage.O0;
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
                    float f23 = transitionParams.f32401n0;
                    float f24 = iVar.f55683c;
                    if (f23 == f24 && transitionParams.f32404o0 == iVar.d && transitionParams.f32412q0 == iVar.f55685f && transitionParams.f32408p0 == iVar.f55684e && !transitionParams.C0) {
                        transitionParams.f32370g0 = false;
                        jVar.f55693n = false;
                    } else {
                        jVar.f55694o = f24;
                        jVar.f55695p = iVar.d;
                        jVar.f55696q = iVar.f55684e;
                        jVar.f55697r = iVar.f55685f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.f23076c;
                            aj ajVar = currentMessagesGroup.f23084m;
                            boolean z16 = ajVar.f22895o;
                            if (z15 != z16) {
                                if (z16) {
                                    f17 = 1.0f;
                                } else {
                                    f17 = f10;
                                }
                                ajVar.f22894n = f17;
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
                        r1Var.w3(jVar.f55694o, jVar.f55695p, jVar.f55696q, jVar.f55697r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f32435w0 && (((P3 = r1Var.getMessageObject().P3()) && rect.left != r1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != r1Var.getBackgroundDrawableRight()) || rect.top != r1Var.getBackgroundDrawableTop() || rect.bottom != r1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = r1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.f55700u = r1Var.getBackgroundDrawableTop() - rect.top;
                    if (r1Var.Y6 != transitionParams.F0) {
                        jVar.f55698s = r1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.f55699t = r1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        jVar.f55698s = r1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.f55699t = r1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.f55691l = true;
                    transitionParams.f32439x0 = true;
                    transitionParams.f32374h0 = -jVar.f55698s;
                    transitionParams.f32379i0 = -jVar.f55699t;
                    transitionParams.f32388k0 = -jVar.f55700u;
                    transitionParams.f32384j0 = -jVar.v;
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
                    aj ajVar2 = currentMessagesGroup.f23084m;
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
                                bjVar = currentMessagesGroup;
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
                                if (r1Var3.getTransitionParams().f32435w0 || ajVar2.f22896p) {
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
                    ajVar2.f22896p = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        jVar.f55689j = false;
                        ajVar2.f22890j = false;
                    } else {
                        int i29 = (-i25) + ajVar2.f22884b;
                        jVar.f55686f = i29;
                        int i30 = (-i26) + ajVar2.d;
                        jVar.f55687g = i30;
                        int i31 = (-i27) + ajVar2.f22883a;
                        jVar.h = i31;
                        int i32 = (-i28) + ajVar2.f22885c;
                        jVar.f55688i = i32;
                        jVar.f55689j = true;
                        ajVar2.f22890j = true;
                        ajVar2.f22887f = i29;
                        ajVar2.h = i30;
                        ajVar2.f22886e = i31;
                        ajVar2.f22888g = i32;
                        if (ajVar2.f22895o) {
                            f16 = 1.0f;
                        } else {
                            f16 = f10;
                        }
                        ajVar2.f22894n = f16;
                        ek0Var2.setClipChildren(false);
                        ek0Var2.invalidate();
                    }
                    ajVar2.f22889i = z17;
                }
            }
            Integer valueOf = Integer.valueOf(r1Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            bj bjVar2 = (bj) hashMap.get(valueOf);
            if (bjVar2 != null) {
                aj ajVar3 = bjVar2.f23084m;
                hashMap.remove(Integer.valueOf(r1Var.getMessageObject().e1()));
                if (transitionParams.f32435w0) {
                    int backgroundDrawableLeft2 = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                    int backgroundDrawableRight2 = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                    int backgroundDrawableTop2 = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                    int backgroundDrawableBottom2 = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                    jVar.f55701w = true;
                    transitionParams.f32439x0 = true;
                    jVar.f55698s = backgroundDrawableLeft2 - ajVar3.f22883a;
                    jVar.f55699t = backgroundDrawableRight2 - ajVar3.f22885c;
                    jVar.f55700u = backgroundDrawableTop2 - ajVar3.f22884b;
                    jVar.v = backgroundDrawableBottom2 - ajVar3.d;
                    jVar.f55691l = false;
                    transitionParams.f32374h0 = (int) ((-i15) - r1Var.getAnimationOffsetX());
                    transitionParams.f32379i0 = (int) ((-jVar.f55699t) - r1Var.getAnimationOffsetX());
                    transitionParams.f32388k0 = (int) ((-jVar.f55700u) - r1Var.getTranslationY());
                    transitionParams.f32384j0 = (int) ((-jVar.v) - r1Var.getTranslationY());
                    transitionParams.D0 = true;
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                } else {
                    ajVar3.f22889i = true;
                }
            }
            yi yiVar = r1Var.M;
            if (yiVar != null && (yiVar.f28065l & 8) == 0 && r1Var.L.f23080i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!r1Var.C6 && !r1Var.K && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f32447z0 != z11) {
                z12 = true;
                jVar.f55690k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z12 = true;
            }
            boolean a11 = transitionParams.a();
            jVar.f55692m = a11;
            if (a11) {
                transitionParams.h = z12;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i21 == 0 && !jVar.f55693n && !jVar.f55701w && !jVar.f55689j && !jVar.f55690k && !jVar.f55691l && !a11) {
                v(e1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams2 = v0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams2.f31864a) {
                a10 = false;
            } else {
                a10 = transitionParams2.d.F0.a();
            }
            jVar.f55692m = a10;
            if (a10) {
                transitionParams2.f31865b = true;
                transitionParams2.f31866c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a10) {
                v(e1Var);
                return false;
            }
        } else if (view2 instanceof g0) {
            ((g0) view2).setAnimating(true);
        } else if (view2 instanceof ta) {
            ((ta) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(e1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f59164r.add(jVar);
        F();
        return true;
    }

    @Override
    public final void s(e1 e1Var, r0 r0Var) {
        if (s2.f26694a) {
            a8.b("animate remove");
        }
        super.s(e1Var, r0Var);
        View view = e1Var.f59111a;
        if (r0Var != null) {
            int i7 = r0Var.f10680b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.f10679a;
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
                    r1Var.w3(iVar.f55683c, iVar.d, iVar.f55684e, iVar.f55685f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
