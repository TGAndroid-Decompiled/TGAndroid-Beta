package xh;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.j1;
import f2.m1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.z01;
import org.telegram.ui.ug;
import org.telegram.ui.xn;
public abstract class n extends f2.l {
    public static final pr V = new pr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final xn F;
    public final tl0 G;
    public boolean N;
    public m1 O;
    public ho P;
    public boolean Q;
    public final g6 R;
    public ug T;
    public ug U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public n(xn xnVar, tl0 tl0Var, g6 g6Var) {
        this.R = g6Var;
        this.F = xnVar;
        this.G = tl0Var;
        this.f5852o = V;
        this.f5911n = true;
        this.f5910m = false;
    }

    @Override
    public final void B(f2.j jVar) {
        View view;
        f2.j jVar2;
        m1 m1Var = jVar.f5811a;
        View view2 = null;
        if (m1Var == null) {
            view = null;
        } else {
            view = m1Var.f5875a;
        }
        m1 m1Var2 = jVar.f5812b;
        if (m1Var2 != null) {
            view2 = m1Var2.f5875a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.f5811a);
            duration.translationX(jVar.f5814e - jVar.f5813c);
            duration.translationY(jVar.f5815f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new k(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f5812b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new k(this, jVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(m1 m1Var, f2.k kVar) {
        T(m1Var, kVar, false);
    }

    @Override
    public final boolean J(f2.j jVar, m1 m1Var) {
        b11 b11Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(m1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = m1Var.f5875a;
        if (this.K.contains(view) && (b11Var = (b11) this.U.run()) != null) {
            b11Var.a(view);
        }
        if (jVar.f5812b == m1Var) {
            jVar.f5812b = null;
        } else if (jVar.f5811a == m1Var) {
            jVar.f5811a = null;
        } else {
            return false;
        }
        X(view);
        d(m1Var);
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

    public final void T(final f2.m1 r22, f2.k r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.n.T(f2.m1, f2.k, boolean):void");
    }

    public final void U() {
        b11 b11Var;
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
        if (!this.K.isEmpty() && (b11Var = (b11) this.U.run()) != null) {
            ArrayList arrayList2 = b11Var.f25457c;
            if (!b11Var.f25458e) {
                b11Var.f25458e = true;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    a11 a11Var = (a11) obj2;
                    Runnable runnable = a11Var.d;
                    if (runnable != null) {
                        b11.b(runnable);
                        a11Var.d = null;
                    }
                }
                arrayList2.clear();
                z01 z01Var = b11Var.f25455a;
                if (z01Var != null) {
                    z01Var.i();
                }
                Runnable runnable2 = b11Var.d;
                if (runnable2 != null) {
                    b11Var.d = null;
                    b11.b(runnable2);
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
            tl0 tl0Var = this.G;
            int childCount = tl0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = tl0Var.getChildAt(i10);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (t1Var.getTransitionParams().f23702v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.bottom = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.left = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                        groupedMessages.transitionParams.right = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = t1Var.P2();
                        groupedMessages.transitionParams.pinnedTop = t1Var.n3();
                        groupedMessages.transitionParams.pinnedBotton = t1Var.m3();
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
        boolean z4 = view instanceof h0;
        tl0 tl0Var = this.G;
        if (z4) {
            int measuredHeight = (tl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof xa) {
            int measuredHeight2 = (tl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((xa) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof t1) {
            t1 t1Var = (t1) view;
            t1Var.getTransitionParams().j();
            t1Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof v0) {
            u0 transitionParams = ((v0) view).getTransitionParams();
            transitionParams.f24184b = false;
            transitionParams.f24185c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(ug ugVar, ug ugVar2) {
        this.T = ugVar;
        this.U = ugVar2;
    }

    public final boolean Z(View view) {
        m1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f5854q.contains(T) || this.f5861y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(m1 m1Var, c5.e eVar, c5.e eVar2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(m1Var, eVar, eVar2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z4 = false;
            while (true) {
                arrayList = this.f5854q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((m1) arrayList.get(i11)).c() == 0) {
                    z4 = true;
                }
                i11++;
            }
            if (z4) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((m1) arrayList.get(i12)).f5875a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((m1) arrayList.get(i13)).f5875a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        m1 T = this.G.T(view);
        if (T != null) {
            if (this.f5853p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(m1 m1Var) {
        b11 b11Var;
        Animator animator = (Animator) this.J.remove(m1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = m1Var.f5875a;
        if (this.K.contains(view) && (b11Var = (b11) this.U.run()) != null) {
            b11Var.a(view);
        }
        super.f(m1Var);
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
        ho hoVar = this.P;
        if (hoVar != null) {
            hoVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f5855r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.k kVar = (f2.k) arrayList2.get(size2);
            X(kVar.f5839a.f5875a);
            v(kVar.f5839a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5853p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            m1 m1Var = (m1) arrayList3.get(size3);
            X(m1Var.f5875a);
            d(m1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5854q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            m1 m1Var2 = (m1) arrayList4.get(size4);
            X(m1Var2.f5875a);
            u(m1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f5856s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f5858u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                f2.k kVar2 = (f2.k) arrayList7.get(size7);
                X(kVar2.f5839a.f5875a);
                v(kVar2.f5839a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f5857t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                m1 m1Var3 = (m1) arrayList9.get(size9);
                X(m1Var3.f5875a);
                u(m1Var3);
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
        E(this.f5862z);
        E(this.f5861y);
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
    public final c5.e l(j1 j1Var, m1 m1Var, int i10, List list) {
        c5.e l10 = super.l(j1Var, m1Var, i10, list);
        View view = m1Var.f5875a;
        if (view instanceof t1) {
            ?? obj = new Object();
            obj.f2268a = l10.f2268a;
            obj.f2269b = l10.f2269b;
            s1 transitionParams = ((t1) view).getTransitionParams();
            obj.f50633c = transitionParams.f23611a;
            obj.d = transitionParams.f23615b;
            obj.f50634e = transitionParams.f23620c;
            obj.f50635f = transitionParams.d;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: xh.n.m():void");
    }

    @Override
    public final void p(m1 m1Var) {
        R(m1Var);
        View view = m1Var.f5875a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof t1) {
            ((t1) view).getTransitionParams().h = true;
        }
        this.f5854q.add(m1Var);
    }

    @Override
    public final boolean q(m1 m1Var, m1 m1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        float translationX;
        if (m1Var == m1Var2) {
            return r(m1Var, eVar, i10, i11, i12, i13);
        }
        View view = m1Var.f5875a;
        if (view instanceof t1) {
            translationX = ((t1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(m1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof t1) {
            ((t1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = m1Var2.f5875a;
        R(m1Var2);
        if (view2 instanceof t1) {
            ((t1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f5856s.add(new f2.j(m1Var, m1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        t1 t1Var;
        v0 v0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean a2;
        View view;
        int i15;
        boolean z4;
        boolean z10;
        float f15;
        boolean z11;
        int i16;
        float f16;
        MessageObject.GroupedMessages groupedMessages;
        int i17;
        boolean z12;
        boolean isOutOwner;
        float f17;
        View view2 = m1Var.f5875a;
        if (view2 instanceof t1) {
            t1 t1Var2 = (t1) view2;
            translationX = i10 + ((int) t1Var2.getAnimationOffsetX());
            if (t1Var2.getTransitionParams().f23693s2 != t1Var2.getTopMediaOffset()) {
                i14 = (t1Var2.getTransitionParams().f23693s2 - t1Var2.getTopMediaOffset()) + i11;
            } else {
                i14 = i11;
            }
            t1Var = t1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            v0Var = (v0) view2;
            t1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            t1Var = null;
            v0Var = null;
        }
        int i18 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (t1Var != null) {
            float imageX = t1Var.getPhotoImage().getImageX();
            float imageY = t1Var.getPhotoImage().getImageY();
            f12 = t1Var.getPhotoImage().getImageWidth();
            float imageHeight = t1Var.getPhotoImage().getImageHeight();
            f10 = 0.0f;
            for (int i19 = 0; i19 < 4; i19++) {
                iArr[i19] = t1Var.getPhotoImage().getRoundRadius()[i19];
            }
            f13 = imageX;
            f11 = imageHeight;
            f14 = imageY;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        R(m1Var);
        int i20 = i12 - i18;
        int i21 = i13 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f18 = f11;
        v0 v0Var2 = v0Var;
        float f19 = f12;
        ?? kVar = new f2.k(m1Var, i18, translationY, i12, i13);
        if (t1Var != null) {
            s1 transitionParams = t1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f23695t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                t1Var.setAnimationOffsetX(-i20);
            }
            boolean z13 = eVar instanceof l;
            tl0 tl0Var = this.G;
            if (z13) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                view = view2;
                l lVar = (l) eVar;
                i15 = i20;
                if (transitionParams.f23702v0 && lVar.f50635f != f10 && lVar.f50634e != f10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                kVar.f50643n = z12;
                if (z12) {
                    tl0Var.setClipChildren(false);
                    tl0Var.invalidate();
                    transitionParams.f23634f0 = true;
                    if (t1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f13;
                        transitionParams.f23671n0 = f14;
                        transitionParams.f23675o0 = f19;
                        transitionParams.f23679p0 = f18;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f23671n0 = photoImage.getImageY();
                        transitionParams.f23675o0 = photoImage.getImageWidth();
                        transitionParams.f23679p0 = photoImage.getImageHeight();
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
                    float f20 = transitionParams.m0;
                    float f21 = lVar.f50633c;
                    if (f20 == f21 && transitionParams.f23671n0 == lVar.d && transitionParams.f23679p0 == lVar.f50635f && transitionParams.f23675o0 == lVar.f50634e && !transitionParams.B0) {
                        transitionParams.f23634f0 = false;
                        kVar.f50643n = false;
                    } else {
                        kVar.f50644o = f21;
                        kVar.f50645p = lVar.d;
                        kVar.f50646q = lVar.f50634e;
                        kVar.f50647r = lVar.f50635f;
                        if (currentMessagesGroup != null) {
                            boolean z14 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z15 = transitionParams2.drawCaptionLayout;
                            if (z14 != z15) {
                                if (z15) {
                                    f17 = 1.0f;
                                } else {
                                    f17 = 0.0f;
                                }
                                transitionParams2.captionEnterProgress = f17;
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
                        t1Var.U3(kVar.f50644o, kVar.f50645p, kVar.f50646q, kVar.f50647r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f23702v0 && (((isOutOwner = t1Var.getMessageObject().isOutOwner()) && rect.left != t1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != t1Var.getBackgroundDrawableRight()) || rect.top != t1Var.getBackgroundDrawableTop() || rect.bottom != t1Var.getBackgroundDrawableBottom()))) {
                    kVar.v = t1Var.getBackgroundDrawableBottom() - rect.bottom;
                    kVar.f50650u = t1Var.getBackgroundDrawableTop() - rect.top;
                    if (t1Var.D8 != transitionParams.E0) {
                        kVar.f50648s = t1Var.getBackgroundDrawableLeft() - rect.left;
                        kVar.f50649t = t1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        kVar.f50648s = t1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        kVar.f50649t = t1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    kVar.f50641l = true;
                    transitionParams.f23706w0 = true;
                    transitionParams.f23639g0 = -kVar.f50648s;
                    transitionParams.f23643h0 = -kVar.f50649t;
                    transitionParams.f23653j0 = -kVar.f50650u;
                    transitionParams.f23648i0 = -kVar.v;
                    tl0Var.setClipChildren(false);
                    tl0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    tl0 tl0Var2 = (tl0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z16 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < tl0Var2.getChildCount()) {
                        View childAt = tl0Var2.getChildAt(i24);
                        if (childAt instanceof t1) {
                            t1 t1Var3 = (t1) childAt;
                            if (t1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !t1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                                i17 = i24;
                                int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    i27 = backgroundDrawableLeft;
                                }
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    i28 = backgroundDrawableRight;
                                }
                                if (t1Var3.getTransitionParams().f23702v0 || transitionParams3.isNewGroup) {
                                    if (i25 == 0 || backgroundDrawableTop < i25) {
                                        i25 = backgroundDrawableTop;
                                    }
                                    if (i26 == 0 || backgroundDrawableBottom > i26) {
                                        i26 = backgroundDrawableBottom;
                                    }
                                    z16 = false;
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
                        kVar.f50639j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i29 = (-i25) + transitionParams3.top;
                        kVar.f50636f = i29;
                        int i30 = (-i26) + transitionParams3.bottom;
                        kVar.f50637g = i30;
                        int i31 = (-i27) + transitionParams3.left;
                        kVar.h = i31;
                        int i32 = (-i28) + transitionParams3.right;
                        kVar.f50638i = i32;
                        kVar.f50639j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i29;
                        transitionParams3.offsetBottom = i30;
                        transitionParams3.offsetLeft = i31;
                        transitionParams3.offsetRight = i32;
                        if (transitionParams3.drawCaptionLayout) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        transitionParams3.captionEnterProgress = f16;
                        tl0Var2.setClipChildren(false);
                        tl0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z16;
                }
            }
            Integer valueOf = Integer.valueOf(t1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(t1Var.getMessageObject().getId()));
                if (transitionParams.f23702v0) {
                    int backgroundDrawableLeft2 = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                    int backgroundDrawableRight2 = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                    int backgroundDrawableTop2 = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                    int backgroundDrawableBottom2 = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                    kVar.f50651w = true;
                    transitionParams.f23706w0 = true;
                    kVar.f50648s = backgroundDrawableLeft2 - transitionParams4.left;
                    kVar.f50649t = backgroundDrawableRight2 - transitionParams4.right;
                    kVar.f50650u = backgroundDrawableTop2 - transitionParams4.top;
                    kVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    kVar.f50641l = false;
                    transitionParams.f23639g0 = (int) ((-i16) - t1Var.getAnimationOffsetX());
                    transitionParams.f23643h0 = (int) ((-kVar.f50649t) - t1Var.getAnimationOffsetX());
                    transitionParams.f23653j0 = (int) ((-kVar.f50650u) - t1Var.getTranslationY());
                    transitionParams.f23648i0 = (int) ((-kVar.v) - t1Var.getTranslationY());
                    transitionParams.C0 = true;
                    tl0Var.setClipChildren(false);
                    tl0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = t1Var.I;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && t1Var.H.isDocuments) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!t1Var.f23877h8 && !t1Var.G && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (transitionParams.f23714y0 != z10) {
                z11 = true;
                kVar.f50640k = true;
                f15 = 0.0f;
                transitionParams.f23718z0 = 0.0f;
            } else {
                f15 = 0.0f;
                z11 = true;
            }
            boolean f22 = transitionParams.f();
            kVar.f50642m = f22;
            if (f22) {
                transitionParams.f23638g = z11;
                transitionParams.K1 = f15;
            }
            if (i15 == 0 && i21 == 0 && !kVar.f50643n && !kVar.f50651w && !kVar.f50639j && !kVar.f50640k && !kVar.f50641l && !f22) {
                v(m1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams5.f24183a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.f24298z0.a();
            }
            kVar.f50642m = a2;
            if (a2) {
                transitionParams5.f24184b = true;
                transitionParams5.f24185c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a2) {
                v(m1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof xa) {
            ((xa) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(m1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f5855r.add(kVar);
        F();
        return true;
    }

    @Override
    public final void s(m1 m1Var, c5.e eVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(m1Var, eVar);
        View view = m1Var.f5875a;
        if (eVar != null) {
            int i10 = eVar.f2269b;
            int top = view.getTop();
            int left = view.getLeft() - eVar.f2268a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (view instanceof t1) {
                t1 t1Var = (t1) view;
                if (left != 0) {
                    t1Var.setAnimationOffsetX(-left);
                }
                if (eVar instanceof l) {
                    l lVar = (l) eVar;
                    t1Var.U3(lVar.f50633c, lVar.d, lVar.f50634e, lVar.f50635f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
