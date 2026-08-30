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
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;
import org.telegram.ui.ug;
import org.telegram.ui.xn;
public abstract class n extends f2.l {
    public static final nr V = new nr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final xn F;
    public final sl0 G;
    public boolean N;
    public l1 O;
    public fo P;
    public boolean Q;
    public final f6 R;
    public ug T;
    public ug U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public n(xn xnVar, sl0 sl0Var, f6 f6Var) {
        this.R = f6Var;
        this.F = xnVar;
        this.G = sl0Var;
        this.f5773o = V;
        this.f5819n = true;
        this.f5818m = false;
    }

    @Override
    public final void B(f2.j jVar) {
        View view;
        f2.j jVar2;
        l1 l1Var = jVar.f5753a;
        View view2 = null;
        if (l1Var == null) {
            view = null;
        } else {
            view = l1Var.f5785a;
        }
        l1 l1Var2 = jVar.f5754b;
        if (l1Var2 != null) {
            view2 = l1Var2.f5785a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.f5753a);
            duration.translationX(jVar.e - jVar.f5755c);
            duration.translationY(jVar.f5756f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new k(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f5754b);
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
        View view = l1Var.f5785a;
        if (this.K.contains(view) && (a11Var = (a11) this.U.run()) != null) {
            a11Var.a(view);
        }
        if (jVar.f5754b == l1Var) {
            jVar.f5754b = null;
        } else if (jVar.f5753a == l1Var) {
            jVar.f5753a = null;
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
            ArrayList arrayList2 = a11Var.f23264c;
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
                y01 y01Var = a11Var.f23262a;
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
            sl0 sl0Var = this.G;
            int childCount = sl0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = sl0Var.getChildAt(i10);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (t1Var.getTransitionParams().f21906v0 && groupedMessages.messages.contains(messageObject)) {
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
        sl0 sl0Var = this.G;
        if (z4) {
            int measuredHeight = (sl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof xa) {
            int measuredHeight2 = (sl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            transitionParams.f22379b = false;
            transitionParams.f22380c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void Y(ug ugVar, ug ugVar2) {
        this.T = ugVar;
        this.U = ugVar2;
    }

    public final boolean Z(View view) {
        l1 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.f5775q.contains(T) || this.f5782y.contains(T)) {
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
                arrayList = this.f5775q;
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
                    i10 += ((l1) arrayList.get(i12)).f5785a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((l1) arrayList.get(i13)).f5785a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        l1 T = this.G.T(view);
        if (T != null) {
            if (this.f5774p.contains(T) || this.A.contains(T)) {
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
        View view = l1Var.f5785a;
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
        fo foVar = this.P;
        if (foVar != null) {
            foVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f5776r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.k kVar = (f2.k) arrayList2.get(size2);
            X(kVar.f5766a.f5785a);
            v(kVar.f5766a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5774p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            l1 l1Var = (l1) arrayList3.get(size3);
            X(l1Var.f5785a);
            d(l1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5775q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            l1 l1Var2 = (l1) arrayList4.get(size4);
            X(l1Var2.f5785a);
            u(l1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f5777s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.f5779u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                f2.k kVar2 = (f2.k) arrayList7.get(size7);
                X(kVar2.f5766a.f5785a);
                v(kVar2.f5766a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.f5778t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                l1 l1Var3 = (l1) arrayList9.get(size9);
                X(l1Var3.f5785a);
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
        E(this.f5783z);
        E(this.f5782y);
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
        View view = l1Var.f5785a;
        if (view instanceof t1) {
            ?? obj = new Object();
            obj.f2085a = l10.f2085a;
            obj.f2086b = l10.f2086b;
            s1 transitionParams = ((t1) view).getTransitionParams();
            obj.f46613c = transitionParams.f21816a;
            obj.d = transitionParams.f21820b;
            obj.e = transitionParams.f21825c;
            obj.f46614f = transitionParams.d;
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
        View view = l1Var.f5785a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof t1) {
            ((t1) view).getTransitionParams().h = true;
        }
        this.f5775q.add(l1Var);
    }

    @Override
    public final boolean q(l1 l1Var, l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        float translationX;
        if (l1Var == l1Var2) {
            return r(l1Var, eVar, i10, i11, i12, i13);
        }
        View view = l1Var.f5785a;
        if (view instanceof t1) {
            translationX = ((t1) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(l1Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof t1) {
            ((t1) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = l1Var2.f5785a;
        R(l1Var2);
        if (view2 instanceof t1) {
            ((t1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f5777s.add(new f2.j(l1Var, l1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
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
        View view2 = l1Var.f5785a;
        if (view2 instanceof t1) {
            t1 t1Var2 = (t1) view2;
            translationX = i10 + ((int) t1Var2.getAnimationOffsetX());
            if (t1Var2.getTransitionParams().f21897s2 != t1Var2.getTopMediaOffset()) {
                i14 = (t1Var2.getTransitionParams().f21897s2 - t1Var2.getTopMediaOffset()) + i11;
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
        if (t1Var != null) {
            s1 transitionParams = t1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f21899t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (i20 != 0) {
                t1Var.setAnimationOffsetX(-i20);
            }
            boolean z13 = eVar instanceof l;
            sl0 sl0Var = this.G;
            if (z13) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                view = view2;
                l lVar = (l) eVar;
                i15 = i20;
                if (transitionParams.f21906v0 && lVar.f46614f != f10 && lVar.e != f10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                kVar.f46622n = z12;
                if (z12) {
                    sl0Var.setClipChildren(false);
                    sl0Var.invalidate();
                    transitionParams.f21838f0 = true;
                    if (t1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f13;
                        transitionParams.f21875n0 = f14;
                        transitionParams.f21879o0 = f19;
                        transitionParams.f21883p0 = f18;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f21875n0 = photoImage.getImageY();
                        transitionParams.f21879o0 = photoImage.getImageWidth();
                        transitionParams.f21883p0 = photoImage.getImageHeight();
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
                    float f21 = lVar.f46613c;
                    if (f20 == f21 && transitionParams.f21875n0 == lVar.d && transitionParams.f21883p0 == lVar.f46614f && transitionParams.f21879o0 == lVar.e && !transitionParams.B0) {
                        transitionParams.f21838f0 = false;
                        kVar.f46622n = false;
                    } else {
                        kVar.f46623o = f21;
                        kVar.f46624p = lVar.d;
                        kVar.f46625q = lVar.e;
                        kVar.f46626r = lVar.f46614f;
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
                        t1Var.U3(kVar.f46623o, kVar.f46624p, kVar.f46625q, kVar.f46626r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f21906v0 && (((isOutOwner = t1Var.getMessageObject().isOutOwner()) && rect.left != t1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != t1Var.getBackgroundDrawableRight()) || rect.top != t1Var.getBackgroundDrawableTop() || rect.bottom != t1Var.getBackgroundDrawableBottom()))) {
                    kVar.v = t1Var.getBackgroundDrawableBottom() - rect.bottom;
                    kVar.f46629u = t1Var.getBackgroundDrawableTop() - rect.top;
                    if (t1Var.D8 != transitionParams.E0) {
                        kVar.f46627s = t1Var.getBackgroundDrawableLeft() - rect.left;
                        kVar.f46628t = t1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        kVar.f46627s = t1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        kVar.f46628t = t1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    kVar.f46620l = true;
                    transitionParams.f21910w0 = true;
                    transitionParams.f21843g0 = -kVar.f46627s;
                    transitionParams.f21847h0 = -kVar.f46628t;
                    transitionParams.f21857j0 = -kVar.f46629u;
                    transitionParams.f21852i0 = -kVar.v;
                    sl0Var.setClipChildren(false);
                    sl0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i20;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    sl0 sl0Var2 = (sl0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z16 = true;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i24 < sl0Var2.getChildCount()) {
                        View childAt = sl0Var2.getChildAt(i24);
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
                                if (t1Var3.getTransitionParams().f21906v0 || transitionParams3.isNewGroup) {
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
                        kVar.f46618j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i29 = (-i25) + transitionParams3.top;
                        kVar.f46615f = i29;
                        int i30 = (-i26) + transitionParams3.bottom;
                        kVar.f46616g = i30;
                        int i31 = (-i27) + transitionParams3.left;
                        kVar.h = i31;
                        int i32 = (-i28) + transitionParams3.right;
                        kVar.f46617i = i32;
                        kVar.f46618j = true;
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
                        sl0Var2.setClipChildren(false);
                        sl0Var2.invalidate();
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
                if (transitionParams.f21906v0) {
                    int backgroundDrawableLeft2 = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                    int backgroundDrawableRight2 = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                    int backgroundDrawableTop2 = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                    int backgroundDrawableBottom2 = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                    kVar.f46630w = true;
                    transitionParams.f21910w0 = true;
                    kVar.f46627s = backgroundDrawableLeft2 - transitionParams4.left;
                    kVar.f46628t = backgroundDrawableRight2 - transitionParams4.right;
                    kVar.f46629u = backgroundDrawableTop2 - transitionParams4.top;
                    kVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    kVar.f46620l = false;
                    transitionParams.f21843g0 = (int) ((-i16) - t1Var.getAnimationOffsetX());
                    transitionParams.f21847h0 = (int) ((-kVar.f46628t) - t1Var.getAnimationOffsetX());
                    transitionParams.f21857j0 = (int) ((-kVar.f46629u) - t1Var.getTranslationY());
                    transitionParams.f21852i0 = (int) ((-kVar.v) - t1Var.getTranslationY());
                    transitionParams.C0 = true;
                    sl0Var.setClipChildren(false);
                    sl0Var.invalidate();
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
            if (!t1Var.f22077h8 && !t1Var.G && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (transitionParams.f21918y0 != z10) {
                z11 = true;
                kVar.f46619k = true;
                f15 = 0.0f;
                transitionParams.f21922z0 = 0.0f;
            } else {
                f15 = 0.0f;
                z11 = true;
            }
            boolean f22 = transitionParams.f();
            kVar.f46621m = f22;
            if (f22) {
                transitionParams.f21842g = z11;
                transitionParams.K1 = f15;
            }
            if (i15 == 0 && i21 == 0 && !kVar.f46622n && !kVar.f46630w && !kVar.f46618j && !kVar.f46619k && !kVar.f46620l && !f22) {
                v(l1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i20 != 0) {
                view2.setTranslationX(-i20);
            }
            if (!transitionParams5.f22378a) {
                a2 = false;
            } else {
                a2 = transitionParams5.d.f22486z0.a();
            }
            kVar.f46621m = a2;
            if (a2) {
                transitionParams5.f22379b = true;
                transitionParams5.f22380c = 0.0f;
            }
            if (i20 == 0 && i21 == 0 && !a2) {
                v(l1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof xa) {
            ((xa) view2).setAnimating(true);
        } else if (i20 == 0 && i21 == 0) {
            v(l1Var);
            return false;
        } else if (i20 != 0) {
            view2.setTranslationX(-i20);
        }
        this.f5776r.add(kVar);
        F();
        return true;
    }

    @Override
    public final void s(l1 l1Var, c5.e eVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(l1Var, eVar);
        View view = l1Var.f5785a;
        if (eVar != null) {
            int i10 = eVar.f2086b;
            int top = view.getTop();
            int left = view.getLeft() - eVar.f2085a;
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
                    t1Var.U3(lVar.f46613c, lVar.d, lVar.e, lVar.f46614f);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
