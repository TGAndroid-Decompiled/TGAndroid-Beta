package wh;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import f2.i1;
import f2.l1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;
import org.telegram.ui.wg;
import org.telegram.ui.zn;
public abstract class n extends f2.l {
    public static final mr V = new mr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final zn F;
    public final rl0 G;
    public boolean N;
    public l1 O;
    public eo P;
    public boolean Q;
    public final f6 R;
    public wg T;
    public wg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public n(zn znVar, rl0 rl0Var, f6 f6Var) {
        this.R = f6Var;
        this.F = znVar;
        this.G = rl0Var;
        this.f5762o = V;
        this.f5808n = true;
        this.f5807m = false;
    }

    @Override
    public final void B(f2.j jVar) {
        View view;
        f2.j jVar2;
        l1 l1Var = jVar.f5742a;
        View view2 = null;
        if (l1Var == null) {
            view = null;
        } else {
            view = l1Var.f5774a;
        }
        l1 l1Var2 = jVar.f5743b;
        if (l1Var2 != null) {
            view2 = l1Var2.f5774a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.f5742a);
            duration.translationX(jVar.e - jVar.f5744c);
            duration.translationY(jVar.f5745f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new k(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f5743b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new k(this, jVar2, animate, view3, 1)).start();
        }
    }

    @Override
    public final void C(l1 l1Var, f2.k kVar) {
        T(l1Var, kVar, false);
    }

    @Override
    public final boolean J(f2.j jVar, l1 l1Var) {
        a11 a11Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(l1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = l1Var.f5774a;
        if (this.K.contains(view) && (a11Var = (a11) this.U.run()) != null) {
            a11Var.a(view);
        }
        if (jVar.f5743b == l1Var) {
            jVar.f5743b = null;
        } else if (jVar.f5742a == l1Var) {
            jVar.f5742a = null;
        } else {
            return false;
        }
        X(view);
        d(l1Var);
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

    public final void T(final f2.l1 r22, f2.k r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.T(f2.l1, f2.k, boolean):void");
    }

    public final void U() {
        a11 a11Var;
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
        if (!this.K.isEmpty() && (a11Var = (a11) this.U.run()) != null) {
            ArrayList arrayList2 = a11Var.f23284c;
            if (!a11Var.e) {
                a11Var.e = true;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    z01 z01Var = (z01) obj2;
                    Runnable runnable = z01Var.d;
                    if (runnable != null) {
                        a11.b(runnable);
                        z01Var.d = null;
                    }
                }
                arrayList2.clear();
                y01 y01Var = a11Var.f23282a;
                if (y01Var != null) {
                    y01Var.i();
                }
                Runnable runnable2 = a11Var.d;
                if (runnable2 != null) {
                    a11Var.d = null;
                    a11.b(runnable2);
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
            rl0 rl0Var = this.G;
            int childCount = rl0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = rl0Var.getChildAt(i10);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (s1Var.getTransitionParams().f21837v0 && groupedMessages.messages.contains(messageObject)) {
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
        boolean z4 = view instanceof h0;
        rl0 rl0Var = this.G;
        if (z4) {
            int measuredHeight = (rl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof wa) {
            int measuredHeight2 = (rl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((wa) view).setAnimating(false);
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
            transitionParams.f22360b = false;
            transitionParams.f22361c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(wg wgVar, wg wgVar2) {
        this.T = wgVar;
        this.U = wgVar2;
    }

    public final boolean Z(View view) {
        l1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f5764q.contains(T) || this.f5771y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(l1 l1Var, c5.e eVar, c5.e eVar2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(l1Var, eVar, eVar2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z4 = false;
            while (true) {
                arrayList = this.f5764q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((l1) arrayList.get(i11)).c() == 0) {
                    z4 = true;
                }
                i11++;
            }
            if (z4) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((l1) arrayList.get(i12)).f5774a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((l1) arrayList.get(i13)).f5774a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        l1 T = this.G.T(view);
        if (T != null) {
            if (this.f5763p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(l1 l1Var) {
        a11 a11Var;
        Animator animator = (Animator) this.J.remove(l1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = l1Var.f5774a;
        if (this.K.contains(view) && (a11Var = (a11) this.U.run()) != null) {
            a11Var.a(view);
        }
        super.f(l1Var);
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
        eo eoVar = this.P;
        if (eoVar != null) {
            eoVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f5765r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.k kVar = (f2.k) arrayList2.get(size2);
            X(kVar.f5755a.f5774a);
            v(kVar.f5755a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5763p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            l1 l1Var = (l1) arrayList3.get(size3);
            X(l1Var.f5774a);
            d(l1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5764q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            l1 l1Var2 = (l1) arrayList4.get(size4);
            X(l1Var2.f5774a);
            u(l1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f5766s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f5768u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                f2.k kVar2 = (f2.k) arrayList7.get(size7);
                X(kVar2.f5755a.f5774a);
                v(kVar2.f5755a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f5767t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                l1 l1Var3 = (l1) arrayList9.get(size9);
                X(l1Var3.f5774a);
                u(l1Var3);
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
        E(this.f5772z);
        E(this.f5771y);
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
    public final c5.e l(i1 i1Var, l1 l1Var, int i10, List list) {
        c5.e l10 = super.l(i1Var, l1Var, i10, list);
        View view = l1Var.f5774a;
        if (view instanceof s1) {
            ?? obj = new Object();
            obj.f2108a = l10.f2108a;
            obj.f2109b = l10.f2109b;
            r1 transitionParams = ((s1) view).getTransitionParams();
            obj.f46682c = transitionParams.f21747a;
            obj.d = transitionParams.f21751b;
            obj.e = transitionParams.f21756c;
            obj.f46683f = transitionParams.d;
            return obj;
        }
        return l10;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.m():void");
    }

    @Override
    public final void p(l1 l1Var) {
        R(l1Var);
        View view = l1Var.f5774a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof s1) {
            ((s1) view).getTransitionParams().h = true;
        }
        this.f5764q.add(l1Var);
    }

    @Override
    public final boolean q(l1 l1Var, l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        float translationX;
        if (l1Var == l1Var2) {
            return r(l1Var, eVar, i10, i11, i12, i13);
        }
        View view = l1Var.f5774a;
        if (view instanceof s1) {
            translationX = ((s1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(l1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof s1) {
            ((s1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = l1Var2.f5774a;
        R(l1Var2);
        if (view2 instanceof s1) {
            ((s1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f5766s.add(new f2.j(l1Var, l1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        s1 s1Var;
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
        View view2 = l1Var.f5774a;
        if (view2 instanceof s1) {
            s1 s1Var2 = (s1) view2;
            translationX = i10 + ((int) s1Var2.getAnimationOffsetX());
            if (s1Var2.getTransitionParams().f21828s2 != s1Var2.getTopMediaOffset()) {
                i14 = (s1Var2.getTransitionParams().f21828s2 - s1Var2.getTopMediaOffset()) + i11;
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
            f12 = s1Var.getPhotoImage().getImageWidth();
            float imageHeight = s1Var.getPhotoImage().getImageHeight();
            f10 = 0.0f;
            for (int i19 = 0; i19 < 4; i19++) {
                iArr[i19] = s1Var.getPhotoImage().getRoundRadius()[i19];
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
        R(l1Var);
        int i20 = i12 - i18;
        int i21 = i13 - translationY;
        if (i21 != 0) {
            view2.setTranslationY(-i21);
        }
        float f18 = f11;
        v0 v0Var2 = v0Var;
        float f19 = f12;
        ?? kVar = new f2.k(l1Var, i18, translationY, i12, i13);
        if (s1Var != null) {
            r1 transitionParams = s1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f21830t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                s1Var.setAnimationOffsetX(-i20);
            }
            boolean z13 = eVar instanceof l;
            rl0 rl0Var = this.G;
            if (z13) {
                ImageReceiver photoImage = s1Var.getPhotoImage();
                view = view2;
                l lVar = (l) eVar;
                i15 = i20;
                if (transitionParams.f21837v0 && lVar.f46683f != f10 && lVar.e != f10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                kVar.f46691n = z12;
                if (z12) {
                    rl0Var.setClipChildren(false);
                    rl0Var.invalidate();
                    transitionParams.f21769f0 = true;
                    if (s1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f13;
                        transitionParams.f21806n0 = f14;
                        transitionParams.f21810o0 = f19;
                        transitionParams.f21814p0 = f18;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f21806n0 = photoImage.getImageY();
                        transitionParams.f21810o0 = photoImage.getImageWidth();
                        transitionParams.f21814p0 = photoImage.getImageHeight();
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
                    float f21 = lVar.f46682c;
                    if (f20 == f21 && transitionParams.f21806n0 == lVar.d && transitionParams.f21814p0 == lVar.f46683f && transitionParams.f21810o0 == lVar.e && !transitionParams.B0) {
                        transitionParams.f21769f0 = false;
                        kVar.f46691n = false;
                    } else {
                        kVar.f46692o = f21;
                        kVar.f46693p = lVar.d;
                        kVar.f46694q = lVar.e;
                        kVar.f46695r = lVar.f46683f;
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
                        s1Var.U3(kVar.f46692o, kVar.f46693p, kVar.f46694q, kVar.f46695r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f21837v0 && (((isOutOwner = s1Var.getMessageObject().isOutOwner()) && rect.left != s1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != s1Var.getBackgroundDrawableRight()) || rect.top != s1Var.getBackgroundDrawableTop() || rect.bottom != s1Var.getBackgroundDrawableBottom()))) {
                    kVar.v = s1Var.getBackgroundDrawableBottom() - rect.bottom;
                    kVar.f46698u = s1Var.getBackgroundDrawableTop() - rect.top;
                    if (s1Var.D8 != transitionParams.E0) {
                        kVar.f46696s = s1Var.getBackgroundDrawableLeft() - rect.left;
                        kVar.f46697t = s1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        kVar.f46696s = s1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        kVar.f46697t = s1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    kVar.f46689l = true;
                    transitionParams.f21841w0 = true;
                    transitionParams.f21774g0 = -kVar.f46696s;
                    transitionParams.f21778h0 = -kVar.f46697t;
                    transitionParams.f21788j0 = -kVar.f46698u;
                    transitionParams.f21783i0 = -kVar.v;
                    rl0Var.setClipChildren(false);
                    rl0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    rl0 rl0Var2 = (rl0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z16 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < rl0Var2.getChildCount()) {
                        View childAt = rl0Var2.getChildAt(i24);
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
                                if (s1Var3.getTransitionParams().f21837v0 || transitionParams3.isNewGroup) {
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
                        kVar.f46687j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i29 = (-i25) + transitionParams3.top;
                        kVar.f46684f = i29;
                        int i30 = (-i26) + transitionParams3.bottom;
                        kVar.f46685g = i30;
                        int i31 = (-i27) + transitionParams3.left;
                        kVar.h = i31;
                        int i32 = (-i28) + transitionParams3.right;
                        kVar.f46686i = i32;
                        kVar.f46687j = true;
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
                        rl0Var2.setClipChildren(false);
                        rl0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z16;
                }
            }
            Integer valueOf = Integer.valueOf(s1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(s1Var.getMessageObject().getId()));
                if (transitionParams.f21837v0) {
                    int backgroundDrawableLeft2 = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                    int backgroundDrawableRight2 = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                    int backgroundDrawableTop2 = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                    int backgroundDrawableBottom2 = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                    kVar.f46699w = true;
                    transitionParams.f21841w0 = true;
                    kVar.f46696s = backgroundDrawableLeft2 - transitionParams4.left;
                    kVar.f46697t = backgroundDrawableRight2 - transitionParams4.right;
                    kVar.f46698u = backgroundDrawableTop2 - transitionParams4.top;
                    kVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    kVar.f46689l = false;
                    transitionParams.f21774g0 = (int) ((-i16) - s1Var.getAnimationOffsetX());
                    transitionParams.f21778h0 = (int) ((-kVar.f46697t) - s1Var.getAnimationOffsetX());
                    transitionParams.f21788j0 = (int) ((-kVar.f46698u) - s1Var.getTranslationY());
                    transitionParams.f21783i0 = (int) ((-kVar.v) - s1Var.getTranslationY());
                    transitionParams.C0 = true;
                    rl0Var.setClipChildren(false);
                    rl0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = s1Var.I;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && s1Var.H.isDocuments) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!s1Var.f22014h8 && !s1Var.G && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (transitionParams.f21849y0 != z10) {
                z11 = true;
                kVar.f46688k = true;
                f15 = 0.0f;
                transitionParams.f21853z0 = 0.0f;
            } else {
                f15 = 0.0f;
                z11 = true;
            }
            boolean f22 = transitionParams.f();
            kVar.f46690m = f22;
            if (f22) {
                transitionParams.f21773g = z11;
                transitionParams.K1 = f15;
            }
            if (i15 == 0 && i21 == 0 && !kVar.f46691n && !kVar.f46699w && !kVar.f46687j && !kVar.f46688k && !kVar.f46689l && !f22) {
                v(l1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams5.f22359a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.f22454z0.a();
            }
            kVar.f46690m = a2;
            if (a2) {
                transitionParams5.f22360b = true;
                transitionParams5.f22361c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a2) {
                v(l1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof wa) {
            ((wa) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(l1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f5765r.add(kVar);
        F();
        return true;
    }

    @Override
    public final void s(l1 l1Var, c5.e eVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(l1Var, eVar);
        View view = l1Var.f5774a;
        if (eVar != null) {
            int i10 = eVar.f2109b;
            int top = view.getTop();
            int left = view.getLeft() - eVar.f2108a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (view instanceof s1) {
                s1 s1Var = (s1) view;
                if (left != 0) {
                    s1Var.setAnimationOffsetX(-left);
                }
                if (eVar instanceof l) {
                    l lVar = (l) eVar;
                    s1Var.U3(lVar.f46682c, lVar.d, lVar.e, lVar.f46683f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
