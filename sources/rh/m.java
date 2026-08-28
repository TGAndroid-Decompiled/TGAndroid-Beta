package rh;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import d5.p;
import f2.n1;
import f2.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.qg;
import org.telegram.ui.qn;
public abstract class m extends f2.n {
    public static final gr V = new gr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final qn F;
    public final wk0 G;
    public boolean N;
    public q1 O;
    public yn P;
    public boolean Q;
    public final b6 R;
    public qg T;
    public qg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public m(qn qnVar, wk0 wk0Var, b6 b6Var) {
        this.R = b6Var;
        this.F = qnVar;
        this.G = wk0Var;
        this.f5449o = V;
        this.f5533n = true;
        this.f5532m = false;
    }

    @Override
    public final void B(f2.l lVar) {
        View view;
        f2.l lVar2;
        q1 q1Var = lVar.f5414a;
        View view2 = null;
        if (q1Var == null) {
            view = null;
        } else {
            view = q1Var.f5501a;
        }
        q1 q1Var2 = lVar.f5415b;
        if (q1Var2 != null) {
            view2 = q1Var2.f5501a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(lVar.f5414a);
            duration.translationX(lVar.f5417e - lVar.f5416c);
            duration.translationY(lVar.f5418f - lVar.d);
            lVar2 = lVar;
            duration.alpha(0.0f).setListener(new j(this, lVar2, duration, view, 0)).start();
        } else {
            lVar2 = lVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(lVar2.f5415b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new j(this, lVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(q1 q1Var, f2.m mVar) {
        T(q1Var, mVar, false);
    }

    @Override
    public final boolean J(f2.l lVar, q1 q1Var) {
        d01 d01Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(q1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = q1Var.f5501a;
        if (this.K.contains(view) && (d01Var = (d01) this.U.run()) != null) {
            d01Var.a(view);
        }
        if (lVar.f5415b == q1Var) {
            lVar.f5415b = null;
        } else if (lVar.f5414a == q1Var) {
            lVar.f5414a = null;
        } else {
            return false;
        }
        X(view);
        d(q1Var);
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

    public final void T(final f2.q1 r22, f2.m r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: rh.m.T(f2.q1, f2.m, boolean):void");
    }

    public final void U() {
        d01 d01Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (!this.K.isEmpty() && (d01Var = (d01) this.U.run()) != null) {
            ArrayList arrayList2 = d01Var.f27622c;
            if (!d01Var.f27623e) {
                d01Var.f27623e = true;
                int size2 = arrayList2.size();
                while (i9 < size2) {
                    Object obj2 = arrayList2.get(i9);
                    i9++;
                    c01 c01Var = (c01) obj2;
                    Runnable runnable = c01Var.d;
                    if (runnable != null) {
                        d01.b(runnable);
                        c01Var.d = null;
                    }
                }
                arrayList2.clear();
                b01 b01Var = d01Var.f27620a;
                if (b01Var != null) {
                    b01Var.i();
                }
                Runnable runnable2 = d01Var.d;
                if (runnable2 != null) {
                    d01Var.d = null;
                    d01.b(runnable2);
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
            wk0 wk0Var = this.G;
            int childCount = wk0Var.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                View childAt = wk0Var.getChildAt(i9);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (t1Var.getTransitionParams().f25231v0 && groupedMessages.messages.contains(messageObject)) {
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
                i9++;
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
        wk0 wk0Var = this.G;
        if (z10) {
            int measuredHeight = (wk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof xa) {
            int measuredHeight2 = (wk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
        } else if (view instanceof w0) {
            v0 transitionParams = ((w0) view).getTransitionParams();
            transitionParams.f25779b = false;
            transitionParams.f25780c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(qg qgVar, qg qgVar2) {
        this.T = qgVar;
        this.U = qgVar2;
    }

    public final boolean Z(View view) {
        q1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f5451q.contains(T) || this.f5458y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(q1 q1Var, p pVar, p pVar2) {
        ArrayList arrayList;
        int i9;
        boolean a2 = super.a(q1Var, pVar, pVar2);
        if (a2 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f5451q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((q1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i9 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i9 += ((q1) arrayList.get(i11)).f5501a.getHeight();
                }
            } else {
                i9 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((q1) arrayList.get(i12)).f5501a.setTranslationY(i9);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        q1 T = this.G.T(view);
        if (T != null) {
            if (this.f5450p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(q1 q1Var) {
        d01 d01Var;
        Animator animator = (Animator) this.J.remove(q1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = q1Var.f5501a;
        if (this.K.contains(view) && (d01Var = (d01) this.U.run()) != null) {
            d01Var.a(view);
        }
        super.f(q1Var);
        X(view);
    }

    @Override
    public void g() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        arrayList.clear();
        U();
        yn ynVar = this.P;
        if (ynVar != null) {
            ynVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f5452r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.m mVar = (f2.m) arrayList2.get(size2);
            X(mVar.f5428a.f5501a);
            v(mVar.f5428a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5450p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            q1 q1Var = (q1) arrayList3.get(size3);
            X(q1Var.f5501a);
            d(q1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5451q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            q1 q1Var2 = (q1) arrayList4.get(size4);
            X(q1Var2.f5501a);
            u(q1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f5453s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.l) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f5455u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                f2.m mVar2 = (f2.m) arrayList7.get(size7);
                X(mVar2.f5428a.f5501a);
                v(mVar2.f5428a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f5454t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                q1 q1Var3 = (q1) arrayList9.get(size9);
                X(q1Var3.f5501a);
                u(q1Var3);
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
                I((f2.l) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.f5459z);
        E(this.f5458y);
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
    public final p l(n1 n1Var, q1 q1Var, int i9, List list) {
        p l10 = super.l(n1Var, q1Var, i9, list);
        View view = q1Var.f5501a;
        if (view instanceof t1) {
            ?? obj = new Object();
            obj.f4376a = l10.f4376a;
            obj.f4377b = l10.f4377b;
            s1 transitionParams = ((t1) view).getTransitionParams();
            obj.f47243c = transitionParams.f25140a;
            obj.d = transitionParams.f25143b;
            obj.f47244e = transitionParams.f25148c;
            obj.f47245f = transitionParams.d;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: rh.m.m():void");
    }

    @Override
    public final void p(q1 q1Var) {
        R(q1Var);
        View view = q1Var.f5501a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof t1) {
            ((t1) view).getTransitionParams().h = true;
        }
        this.f5451q.add(q1Var);
    }

    @Override
    public final boolean q(q1 q1Var, q1 q1Var2, p pVar, int i9, int i10, int i11, int i12) {
        float translationX;
        if (q1Var == q1Var2) {
            return r(q1Var, pVar, i9, i10, i11, i12);
        }
        View view = q1Var.f5501a;
        if (view instanceof t1) {
            translationX = ((t1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(q1Var);
        int i13 = (int) ((i11 - i9) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof t1) {
            ((t1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = q1Var2.f5501a;
        R(q1Var2);
        if (view2 instanceof t1) {
            ((t1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.f5453s.add(new f2.l(q1Var, q1Var2, i9, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public final boolean r(q1 q1Var, p pVar, int i9, int i10, int i11, int i12) {
        int translationX;
        int i13;
        t1 t1Var;
        w0 w0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean a2;
        View view;
        int i14;
        boolean z10;
        boolean z11;
        float f15;
        boolean z12;
        int i15;
        float f16;
        MessageObject.GroupedMessages groupedMessages;
        int i16;
        boolean z13;
        boolean isOutOwner;
        float f17;
        View view2 = q1Var.f5501a;
        if (view2 instanceof t1) {
            t1 t1Var2 = (t1) view2;
            translationX = i9 + ((int) t1Var2.getAnimationOffsetX());
            if (t1Var2.getTransitionParams().f25222s2 != t1Var2.getTopMediaOffset()) {
                i13 = (t1Var2.getTransitionParams().f25222s2 - t1Var2.getTopMediaOffset()) + i10;
            } else {
                i13 = i10;
            }
            t1Var = t1Var2;
            w0Var = null;
        } else if (view2 instanceof w0) {
            translationX = i9 + ((int) view2.getTranslationX());
            i13 = i10;
            w0Var = (w0) view2;
            t1Var = null;
        } else {
            translationX = i9 + ((int) view2.getTranslationX());
            i13 = i10;
            t1Var = null;
            w0Var = null;
        }
        int i17 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (t1Var != null) {
            float imageX = t1Var.getPhotoImage().getImageX();
            float imageY = t1Var.getPhotoImage().getImageY();
            f12 = t1Var.getPhotoImage().getImageWidth();
            float imageHeight = t1Var.getPhotoImage().getImageHeight();
            f10 = 0.0f;
            for (int i18 = 0; i18 < 4; i18++) {
                iArr[i18] = t1Var.getPhotoImage().getRoundRadius()[i18];
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
        R(q1Var);
        int i19 = i11 - i17;
        int i20 = i12 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f18 = f11;
        w0 w0Var2 = w0Var;
        float f19 = f12;
        ?? mVar = new f2.m(q1Var, i17, translationY, i11, i12);
        if (t1Var != null) {
            s1 transitionParams = t1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f25224t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                t1Var.setAnimationOffsetX(-i19);
            }
            boolean z14 = pVar instanceof k;
            wk0 wk0Var = this.G;
            if (z14) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                view = view2;
                k kVar = (k) pVar;
                i14 = i19;
                if (transitionParams.f25231v0 && kVar.f47245f != f10 && kVar.f47244e != f10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                mVar.f47253n = z13;
                if (z13) {
                    wk0Var.setClipChildren(false);
                    wk0Var.invalidate();
                    transitionParams.f25163f0 = true;
                    if (t1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f13;
                        transitionParams.f25200n0 = f14;
                        transitionParams.f25204o0 = f19;
                        transitionParams.f25208p0 = f18;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f25200n0 = photoImage.getImageY();
                        transitionParams.f25204o0 = photoImage.getImageWidth();
                        transitionParams.f25208p0 = photoImage.getImageHeight();
                        transitionParams.A0 = photoImage.getRoundRadius();
                    }
                    transitionParams.B0 = false;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= 4) {
                            break;
                        } else if (iArr2[i21] != transitionParams.A0[i21]) {
                            transitionParams.B0 = true;
                            break;
                        } else {
                            i21++;
                        }
                    }
                    float f20 = transitionParams.m0;
                    float f21 = kVar.f47243c;
                    if (f20 == f21 && transitionParams.f25200n0 == kVar.d && transitionParams.f25208p0 == kVar.f47245f && transitionParams.f25204o0 == kVar.f47244e && !transitionParams.B0) {
                        transitionParams.f25163f0 = false;
                        mVar.f47253n = false;
                    } else {
                        mVar.f47254o = f21;
                        mVar.f47255p = kVar.d;
                        mVar.f47256q = kVar.f47244e;
                        mVar.f47257r = kVar.f47245f;
                        if (currentMessagesGroup != null) {
                            boolean z15 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z16 = transitionParams2.drawCaptionLayout;
                            if (z15 != z16) {
                                if (z16) {
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
                                for (int i22 = 0; i22 < 4; i22++) {
                                    transitionParams.A0[i22] = photoImage.getRoundRadius()[i22];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        t1Var.U3(mVar.f47254o, mVar.f47255p, mVar.f47256q, mVar.f47257r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f25231v0 && (((isOutOwner = t1Var.getMessageObject().isOutOwner()) && rect.left != t1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != t1Var.getBackgroundDrawableRight()) || rect.top != t1Var.getBackgroundDrawableTop() || rect.bottom != t1Var.getBackgroundDrawableBottom()))) {
                    mVar.v = t1Var.getBackgroundDrawableBottom() - rect.bottom;
                    mVar.f47260u = t1Var.getBackgroundDrawableTop() - rect.top;
                    if (t1Var.C8 != transitionParams.E0) {
                        mVar.f47258s = t1Var.getBackgroundDrawableLeft() - rect.left;
                        mVar.f47259t = t1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        mVar.f47258s = t1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        mVar.f47259t = t1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    mVar.f47251l = true;
                    transitionParams.f25235w0 = true;
                    transitionParams.f25168g0 = -mVar.f47258s;
                    transitionParams.f25172h0 = -mVar.f47259t;
                    transitionParams.f25182j0 = -mVar.f47260u;
                    transitionParams.f25177i0 = -mVar.v;
                    wk0Var.setClipChildren(false);
                    wk0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    wk0 wk0Var2 = (wk0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z17 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < wk0Var2.getChildCount()) {
                        View childAt = wk0Var2.getChildAt(i23);
                        if (childAt instanceof t1) {
                            t1 t1Var3 = (t1) childAt;
                            if (t1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !t1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                                i16 = i23;
                                int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (t1Var3.getTransitionParams().f25231v0 || transitionParams3.isNewGroup) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z17 = false;
                                }
                                i23 = i16 + 1;
                                currentMessagesGroup = groupedMessages;
                            }
                        }
                        groupedMessages = currentMessagesGroup;
                        i16 = i23;
                        i23 = i16 + 1;
                        currentMessagesGroup = groupedMessages;
                    }
                    transitionParams3.isNewGroup = false;
                    if (i24 == 0 && i25 == 0 && i26 == 0 && i27 == 0) {
                        mVar.f47249j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i28 = (-i24) + transitionParams3.top;
                        mVar.f47246f = i28;
                        int i29 = (-i25) + transitionParams3.bottom;
                        mVar.f47247g = i29;
                        int i30 = (-i26) + transitionParams3.left;
                        mVar.h = i30;
                        int i31 = (-i27) + transitionParams3.right;
                        mVar.f47248i = i31;
                        mVar.f47249j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i28;
                        transitionParams3.offsetBottom = i29;
                        transitionParams3.offsetLeft = i30;
                        transitionParams3.offsetRight = i31;
                        if (transitionParams3.drawCaptionLayout) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        transitionParams3.captionEnterProgress = f16;
                        wk0Var2.setClipChildren(false);
                        wk0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z17;
                }
            }
            Integer valueOf = Integer.valueOf(t1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(t1Var.getMessageObject().getId()));
                if (transitionParams.f25231v0) {
                    int backgroundDrawableLeft2 = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                    int backgroundDrawableRight2 = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                    int backgroundDrawableTop2 = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                    int backgroundDrawableBottom2 = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                    mVar.f47261w = true;
                    transitionParams.f25235w0 = true;
                    mVar.f47258s = backgroundDrawableLeft2 - transitionParams4.left;
                    mVar.f47259t = backgroundDrawableRight2 - transitionParams4.right;
                    mVar.f47260u = backgroundDrawableTop2 - transitionParams4.top;
                    mVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    mVar.f47251l = false;
                    transitionParams.f25168g0 = (int) ((-i15) - t1Var.getAnimationOffsetX());
                    transitionParams.f25172h0 = (int) ((-mVar.f47259t) - t1Var.getAnimationOffsetX());
                    transitionParams.f25182j0 = (int) ((-mVar.f47260u) - t1Var.getTranslationY());
                    transitionParams.f25177i0 = (int) ((-mVar.v) - t1Var.getTranslationY());
                    transitionParams.C0 = true;
                    wk0Var.setClipChildren(false);
                    wk0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = t1Var.H;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && t1Var.G.isDocuments) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!t1Var.f25394g8 && !t1Var.F && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (transitionParams.f25243y0 != z11) {
                z12 = true;
                mVar.f47250k = true;
                f15 = 0.0f;
                transitionParams.f25247z0 = 0.0f;
            } else {
                f15 = 0.0f;
                z12 = true;
            }
            boolean f22 = transitionParams.f();
            mVar.f47252m = f22;
            if (f22) {
                transitionParams.f25167g = z12;
                transitionParams.K1 = f15;
            }
            if (i14 == 0 && i20 == 0 && !mVar.f47253n && !mVar.f47261w && !mVar.f47249j && !mVar.f47250k && !mVar.f47251l && !f22) {
                v(q1Var);
                return false;
            }
        } else if (w0Var2 != null) {
            v0 transitionParams5 = w0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            if (!transitionParams5.f25778a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.f25882y0.a();
            }
            mVar.f47252m = a2;
            if (a2) {
                transitionParams5.f25779b = true;
                transitionParams5.f25780c = 0.0f;
            }
            if (i19 == 0 && i20 == 0 && !a2) {
                v(q1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof xa) {
            ((xa) view2).setAnimating(true);
        } else if (i19 == 0 && i20 == 0) {
            v(q1Var);
            return false;
        } else if (i19 != 0) {
            view2.setTranslationX(-i19);
        }
        this.f5452r.add(mVar);
        F();
        return true;
    }

    @Override
    public final void s(q1 q1Var, p pVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(q1Var, pVar);
        View view = q1Var.f5501a;
        if (pVar != null) {
            int i9 = pVar.f4377b;
            int top = view.getTop();
            int left = view.getLeft() - pVar.f4376a;
            int i10 = top - i9;
            if (i10 != 0) {
                view.setTranslationY(-i10);
            }
            if (view instanceof t1) {
                t1 t1Var = (t1) view;
                if (left != 0) {
                    t1Var.setAnimationOffsetX(-left);
                }
                if (pVar instanceof k) {
                    k kVar = (k) pVar;
                    t1Var.U3(kVar.f47243c, kVar.d, kVar.f47244e, kVar.f47245f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
