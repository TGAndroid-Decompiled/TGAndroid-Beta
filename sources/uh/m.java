package uh;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.k1;
import f2.n1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.pg;
import org.telegram.ui.tn;
public abstract class m extends f2.l {
    public static final jr V = new jr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final tn F;
    public final jl0 G;
    public boolean N;
    public n1 O;
    public co P;
    public boolean Q;
    public final c6 R;
    public pg T;
    public pg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public m(tn tnVar, jl0 jl0Var, c6 c6Var) {
        this.R = c6Var;
        this.F = tnVar;
        this.G = jl0Var;
        this.f6404o = V;
        this.f6464n = true;
        this.f6463m = false;
    }

    @Override
    public final void B(f2.j jVar) {
        View view;
        f2.j jVar2;
        n1 n1Var = jVar.f6357a;
        View view2 = null;
        if (n1Var == null) {
            view = null;
        } else {
            view = n1Var.f6432a;
        }
        n1 n1Var2 = jVar.f6358b;
        if (n1Var2 != null) {
            view2 = n1Var2.f6432a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.f6357a);
            duration.translationX(jVar.f6360e - jVar.f6359c);
            duration.translationY(jVar.f6361f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new j(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f6358b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new j(this, jVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(n1 n1Var, f2.k kVar) {
        T(n1Var, kVar, false);
    }

    @Override
    public final boolean J(f2.j jVar, n1 n1Var) {
        p01 p01Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(n1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = n1Var.f6432a;
        if (this.K.contains(view) && (p01Var = (p01) this.U.run()) != null) {
            p01Var.a(view);
        }
        if (jVar.f6358b == n1Var) {
            jVar.f6358b = null;
        } else if (jVar.f6357a == n1Var) {
            jVar.f6357a = null;
        } else {
            return false;
        }
        X(view);
        d(n1Var);
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

    public final void T(final f2.n1 r22, f2.k r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: uh.m.T(f2.n1, f2.k, boolean):void");
    }

    public final void U() {
        p01 p01Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (!this.K.isEmpty() && (p01Var = (p01) this.U.run()) != null) {
            ArrayList arrayList2 = p01Var.f31535c;
            if (!p01Var.f31536e) {
                p01Var.f31536e = true;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    o01 o01Var = (o01) obj2;
                    Runnable runnable = o01Var.d;
                    if (runnable != null) {
                        p01.b(runnable);
                        o01Var.d = null;
                    }
                }
                arrayList2.clear();
                n01 n01Var = p01Var.f31533a;
                if (n01Var != null) {
                    n01Var.i();
                }
                Runnable runnable2 = p01Var.d;
                if (runnable2 != null) {
                    p01Var.d = null;
                    p01.b(runnable2);
                }
            }
        }
    }

    public final void V(MessageObject.GroupedMessages groupedMessages) {
        if (groupedMessages == null) {
            return;
        }
        if (groupedMessages.messages.size() == 0) {
            groupedMessages.transitionParams.drawBackgroundForDeletedItems = true;
            return;
        }
        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
        if (transitionParams.top == 0 && transitionParams.bottom == 0 && transitionParams.left == 0 && transitionParams.right == 0) {
            jl0 jl0Var = this.G;
            int childCount = jl0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = jl0Var.getChildAt(i10);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (s1Var.getTransitionParams().f25187v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.bottom = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.left = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                        groupedMessages.transitionParams.right = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = s1Var.P2();
                        groupedMessages.transitionParams.pinnedTop = s1Var.n3();
                        groupedMessages.transitionParams.pinnedBotton = s1Var.m3();
                        groupedMessages.transitionParams.isNewGroup = true;
                        break;
                    }
                }
                i10++;
            }
        }
        this.I.add(groupedMessages);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof h0;
        jl0 jl0Var = this.G;
        if (z10) {
            int measuredHeight = (jl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof ua) {
            int measuredHeight2 = (jl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ua) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof s1) {
            s1 s1Var = (s1) view;
            s1Var.getTransitionParams().j();
            s1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof v0) {
            u0 transitionParams = ((v0) view).getTransitionParams();
            transitionParams.f25714b = false;
            transitionParams.f25715c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(pg pgVar, pg pgVar2) {
        this.T = pgVar;
        this.U = pgVar2;
    }

    public final boolean Z(View view) {
        n1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f6406q.contains(T) || this.f6413y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(n1 n1Var, a5.e eVar, a5.e eVar2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(n1Var, eVar, eVar2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f6406q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((n1) arrayList.get(i11)).c() == 0) {
                    z10 = true;
                }
                i11++;
            }
            if (z10) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((n1) arrayList.get(i12)).f6432a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((n1) arrayList.get(i13)).f6432a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        n1 T = this.G.T(view);
        if (T != null) {
            if (this.f6405p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(n1 n1Var) {
        p01 p01Var;
        Animator animator = (Animator) this.J.remove(n1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = n1Var.f6432a;
        if (this.K.contains(view) && (p01Var = (p01) this.U.run()) != null) {
            p01Var.a(view);
        }
        super.f(n1Var);
        X(view);
    }

    @Override
    public void g() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        arrayList.clear();
        U();
        co coVar = this.P;
        if (coVar != null) {
            coVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f6407r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.k kVar = (f2.k) arrayList2.get(size2);
            X(kVar.f6379a.f6432a);
            v(kVar.f6379a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f6405p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            n1 n1Var = (n1) arrayList3.get(size3);
            X(n1Var.f6432a);
            d(n1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f6406q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            n1 n1Var2 = (n1) arrayList4.get(size4);
            X(n1Var2.f6432a);
            u(n1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f6408s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f6410u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                f2.k kVar2 = (f2.k) arrayList7.get(size7);
                X(kVar2.f6379a.f6432a);
                v(kVar2.f6379a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f6409t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                n1 n1Var3 = (n1) arrayList9.get(size9);
                X(n1Var3.f6432a);
                u(n1Var3);
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
                I((f2.j) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f6414z);
        E(this.f6413y);
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
    public final a5.e l(k1 k1Var, n1 n1Var, int i10, List list) {
        a5.e l10 = super.l(k1Var, n1Var, i10, list);
        View view = n1Var.f6432a;
        if (view instanceof s1) {
            ?? obj = new Object();
            obj.f165a = l10.f165a;
            obj.f166b = l10.f166b;
            r1 transitionParams = ((s1) view).getTransitionParams();
            obj.f49280c = transitionParams.f25096a;
            obj.d = transitionParams.f25100b;
            obj.f49281e = transitionParams.f25105c;
            obj.f49282f = transitionParams.d;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: uh.m.m():void");
    }

    @Override
    public final void p(n1 n1Var) {
        R(n1Var);
        View view = n1Var.f6432a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof s1) {
            ((s1) view).getTransitionParams().h = true;
        }
        this.f6406q.add(n1Var);
    }

    @Override
    public final boolean q(n1 n1Var, n1 n1Var2, a5.e eVar, int i10, int i11, int i12, int i13) {
        float translationX;
        if (n1Var == n1Var2) {
            return r(n1Var, eVar, i10, i11, i12, i13);
        }
        View view = n1Var.f6432a;
        if (view instanceof s1) {
            translationX = ((s1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(n1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof s1) {
            ((s1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = n1Var2.f6432a;
        R(n1Var2);
        if (view2 instanceof s1) {
            ((s1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f6408s.add(new f2.j(n1Var, n1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        s1 s1Var;
        v0 v0Var;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean a2;
        View view;
        int i15;
        boolean z10;
        boolean z11;
        float f14;
        boolean z12;
        int i16;
        float f15;
        MessageObject.GroupedMessages groupedMessages;
        int i17;
        boolean z13;
        boolean isOutOwner;
        float f16;
        View view2 = n1Var.f6432a;
        if (view2 instanceof s1) {
            s1 s1Var2 = (s1) view2;
            translationX = i10 + ((int) s1Var2.getAnimationOffsetX());
            if (s1Var2.getTransitionParams().f25178s2 != s1Var2.getTopMediaOffset()) {
                i14 = (s1Var2.getTransitionParams().f25178s2 - s1Var2.getTopMediaOffset()) + i11;
            } else {
                i14 = i11;
            }
            s1Var = s1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            v0Var = (v0) view2;
            s1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            s1Var = null;
            v0Var = null;
        }
        int i18 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (s1Var != null) {
            float imageX = s1Var.getPhotoImage().getImageX();
            float imageY = s1Var.getPhotoImage().getImageY();
            f11 = s1Var.getPhotoImage().getImageWidth();
            float imageHeight = s1Var.getPhotoImage().getImageHeight();
            f9 = 0.0f;
            for (int i19 = 0; i19 < 4; i19++) {
                iArr[i19] = s1Var.getPhotoImage().getRoundRadius()[i19];
            }
            f12 = imageX;
            f10 = imageHeight;
            f13 = imageY;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        R(n1Var);
        int i20 = i12 - i18;
        int i21 = i13 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f17 = f10;
        v0 v0Var2 = v0Var;
        float f18 = f11;
        ?? kVar = new f2.k(n1Var, i18, translationY, i12, i13);
        if (s1Var != null) {
            r1 transitionParams = s1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f25180t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                s1Var.setAnimationOffsetX(-i20);
            }
            boolean z14 = eVar instanceof k;
            jl0 jl0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = s1Var.getPhotoImage();
                view = view2;
                k kVar2 = (k) eVar;
                i15 = i20;
                if (transitionParams.f25187v0 && kVar2.f49282f != f9 && kVar2.f49281e != f9) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kVar.f49290n = z13;
                if (z13) {
                    jl0Var.setClipChildren(false);
                    jl0Var.invalidate();
                    transitionParams.f25119f0 = true;
                    if (s1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f12;
                        transitionParams.f25156n0 = f13;
                        transitionParams.f25160o0 = f18;
                        transitionParams.f25164p0 = f17;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f25156n0 = photoImage.getImageY();
                        transitionParams.f25160o0 = photoImage.getImageWidth();
                        transitionParams.f25164p0 = photoImage.getImageHeight();
                        transitionParams.A0 = photoImage.getRoundRadius();
                    }
                    transitionParams.B0 = false;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 4) {
                            break;
                        } else if (iArr2[i22] != transitionParams.A0[i22]) {
                            transitionParams.B0 = true;
                            break;
                        } else {
                            i22++;
                        }
                    }
                    float f19 = transitionParams.m0;
                    float f20 = kVar2.f49280c;
                    if (f19 == f20 && transitionParams.f25156n0 == kVar2.d && transitionParams.f25164p0 == kVar2.f49282f && transitionParams.f25160o0 == kVar2.f49281e && !transitionParams.B0) {
                        transitionParams.f25119f0 = false;
                        kVar.f49290n = false;
                    } else {
                        kVar.f49291o = f20;
                        kVar.f49292p = kVar2.d;
                        kVar.f49293q = kVar2.f49281e;
                        kVar.f49294r = kVar2.f49282f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z16 = transitionParams2.drawCaptionLayout;
                            if (z15 != z16) {
                                if (z16) {
                                    f16 = 1.0f;
                                } else {
                                    f16 = 0.0f;
                                }
                                transitionParams2.captionEnterProgress = f16;
                            }
                        }
                        if (transitionParams.B0) {
                            if (transitionParams.A0 == photoImage.getRoundRadius()) {
                                transitionParams.A0 = new int[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    transitionParams.A0[i23] = photoImage.getRoundRadius()[i23];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        s1Var.U3(kVar.f49291o, kVar.f49292p, kVar.f49293q, kVar.f49294r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f25187v0 && (((isOutOwner = s1Var.getMessageObject().isOutOwner()) && rect.left != s1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != s1Var.getBackgroundDrawableRight()) || rect.top != s1Var.getBackgroundDrawableTop() || rect.bottom != s1Var.getBackgroundDrawableBottom()))) {
                    kVar.v = s1Var.getBackgroundDrawableBottom() - rect.bottom;
                    kVar.f49297u = s1Var.getBackgroundDrawableTop() - rect.top;
                    if (s1Var.C8 != transitionParams.E0) {
                        kVar.f49295s = s1Var.getBackgroundDrawableLeft() - rect.left;
                        kVar.f49296t = s1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        kVar.f49295s = s1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        kVar.f49296t = s1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    kVar.f49288l = true;
                    transitionParams.f25191w0 = true;
                    transitionParams.f25124g0 = -kVar.f49295s;
                    transitionParams.f25128h0 = -kVar.f49296t;
                    transitionParams.f25138j0 = -kVar.f49297u;
                    transitionParams.f25133i0 = -kVar.v;
                    jl0Var.setClipChildren(false);
                    jl0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    jl0 jl0Var2 = (jl0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z17 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < jl0Var2.getChildCount()) {
                        View childAt = jl0Var2.getChildAt(i24);
                        if (childAt instanceof s1) {
                            s1 s1Var3 = (s1) childAt;
                            if (s1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !s1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                i17 = i24;
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (s1Var3.getTransitionParams().f25187v0 || transitionParams3.isNewGroup) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z17 = false;
                                }
                                i24 = i17 + 1;
                                currentMessagesGroup = groupedMessages;
                            }
                        }
                        groupedMessages = currentMessagesGroup;
                        i17 = i24;
                        i24 = i17 + 1;
                        currentMessagesGroup = groupedMessages;
                    }
                    transitionParams3.isNewGroup = false;
                    if (i25 == 0 && i26 == 0 && i27 == 0 && i28 == 0) {
                        kVar.f49286j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i29 = (-i25) + transitionParams3.top;
                        kVar.f49283f = i29;
                        int i30 = (-i26) + transitionParams3.bottom;
                        kVar.f49284g = i30;
                        int i31 = (-i27) + transitionParams3.left;
                        kVar.h = i31;
                        int i32 = (-i28) + transitionParams3.right;
                        kVar.f49285i = i32;
                        kVar.f49286j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i29;
                        transitionParams3.offsetBottom = i30;
                        transitionParams3.offsetLeft = i31;
                        transitionParams3.offsetRight = i32;
                        if (transitionParams3.drawCaptionLayout) {
                            f15 = 1.0f;
                        } else {
                            f15 = 0.0f;
                        }
                        transitionParams3.captionEnterProgress = f15;
                        jl0Var2.setClipChildren(false);
                        jl0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z17;
                }
            }
            Integer valueOf = Integer.valueOf(s1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(s1Var.getMessageObject().getId()));
                if (transitionParams.f25187v0) {
                    int backgroundDrawableLeft2 = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                    int backgroundDrawableRight2 = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                    int backgroundDrawableTop2 = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                    int backgroundDrawableBottom2 = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                    kVar.f49298w = true;
                    transitionParams.f25191w0 = true;
                    kVar.f49295s = backgroundDrawableLeft2 - transitionParams4.left;
                    kVar.f49296t = backgroundDrawableRight2 - transitionParams4.right;
                    kVar.f49297u = backgroundDrawableTop2 - transitionParams4.top;
                    kVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    kVar.f49288l = false;
                    transitionParams.f25124g0 = (int) ((-i16) - s1Var.getAnimationOffsetX());
                    transitionParams.f25128h0 = (int) ((-kVar.f49296t) - s1Var.getAnimationOffsetX());
                    transitionParams.f25138j0 = (int) ((-kVar.f49297u) - s1Var.getTranslationY());
                    transitionParams.f25133i0 = (int) ((-kVar.v) - s1Var.getTranslationY());
                    transitionParams.C0 = true;
                    jl0Var.setClipChildren(false);
                    jl0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = s1Var.H;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && s1Var.G.isDocuments) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!s1Var.f25359g8 && !s1Var.F && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f25199y0 != z11) {
                z12 = true;
                kVar.f49287k = true;
                f14 = 0.0f;
                transitionParams.f25203z0 = 0.0f;
            } else {
                f14 = 0.0f;
                z12 = true;
            }
            boolean f21 = transitionParams.f();
            kVar.f49289m = f21;
            if (f21) {
                transitionParams.f25123g = z12;
                transitionParams.K1 = f14;
            }
            if (i15 == 0 && i21 == 0 && !kVar.f49290n && !kVar.f49298w && !kVar.f49286j && !kVar.f49287k && !kVar.f49288l && !f21) {
                v(n1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams5.f25713a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.f25815y0.a();
            }
            kVar.f49289m = a2;
            if (a2) {
                transitionParams5.f25714b = true;
                transitionParams5.f25715c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a2) {
                v(n1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof ua) {
            ((ua) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(n1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f6407r.add(kVar);
        F();
        return true;
    }

    @Override
    public final void s(n1 n1Var, a5.e eVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(n1Var, eVar);
        View view = n1Var.f6432a;
        if (eVar != null) {
            int i10 = eVar.f166b;
            int top = view.getTop();
            int left = view.getLeft() - eVar.f165a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (view instanceof s1) {
                s1 s1Var = (s1) view;
                if (left != 0) {
                    s1Var.setAnimationOffsetX(-left);
                }
                if (eVar instanceof k) {
                    k kVar = (k) eVar;
                    s1Var.U3(kVar.f49280c, kVar.d, kVar.f49281e, kVar.f49282f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
