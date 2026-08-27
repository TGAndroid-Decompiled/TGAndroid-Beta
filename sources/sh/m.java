package sh;

import ag.t2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import d5.p;
import f2.l1;
import f2.o1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import jh.g3;
import lh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.aa1;
import org.telegram.ui.ck;
import org.telegram.ui.oh1;
import org.telegram.ui.rn;
import org.telegram.ui.sg;
import r0.j0;

public abstract class m extends f2.l {
    public static final er V = new er(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final rn F;
    public final zk0 G;
    public boolean N;
    public o1 O;
    public wn P;
    public boolean Q;
    public final c6 R;
    public sg T;
    public sg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public m(rn rnVar, zk0 zk0Var, c6 c6Var) {
        this.R = c6Var;
        this.F = rnVar;
        this.G = zk0Var;
        this.f5737o = V;
        this.f5820n = true;
        this.f5819m = false;
    }

    @Override
    public final void B(f2.j jVar) {
        f2.j jVar2;
        o1 o1Var = jVar.f5702a;
        View view = o1Var == null ? null : o1Var.f5789a;
        o1 o1Var2 = jVar.f5703b;
        View view2 = o1Var2 != null ? o1Var2.f5789a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.f5702a);
            duration.translationX(jVar.f5705e - jVar.f5704c);
            duration.translationY(jVar.f5706f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new j(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            arrayList.add(jVar2.f5703b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new j(this, jVar2, viewPropertyAnimatorAnimate, view2, 1)).start();
        }
    }

    @Override
    public final void C(o1 o1Var, f2.k kVar) {
        T(o1Var, kVar, false);
    }

    @Override
    public final boolean J(f2.j jVar, o1 o1Var) {
        f01 f01Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(o1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = o1Var.f5789a;
        if (this.K.contains(view) && (f01Var = (f01) this.U.run()) != null) {
            f01Var.a(view);
        }
        if (jVar.f5703b == o1Var) {
            jVar.f5703b = null;
        } else {
            if (jVar.f5702a != o1Var) {
                return false;
            }
            jVar.f5702a = null;
        }
        X(view);
        d(o1Var);
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
            if (arrayList.isEmpty()) {
                U();
                return;
            }
            ((Runnable) arrayList.remove(0)).run();
        }
    }

    public final void T(o1 o1Var, f2.k kVar, boolean z10) {
        int i10;
        float f10;
        boolean z11;
        final l lVar;
        final s1 s1Var;
        r1 r1Var;
        final int i11;
        final r1 r1Var2;
        char c10;
        int[] iArr;
        Interpolator interpolator;
        final o1 o1Var2 = o1Var;
        int i12 = kVar.f5718c;
        int i13 = kVar.f5719e;
        View view = o1Var2.f5789a;
        int i14 = i13 - i12;
        AnimatorSet animatorSet = new AnimatorSet();
        int i15 = 0;
        final int i16 = 1;
        if (i14 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.f5747z.add(o1Var2);
        final l lVar2 = (l) kVar;
        rn rnVar = this.F;
        if (rnVar == null || !(view instanceof h0)) {
            if (rnVar != null && (view instanceof ua)) {
                ua uaVar = (ua) view;
                float translationY = uaVar.getTranslationY();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new g(this, uaVar, translationY, i16));
                animatorSet.playTogether(valueAnimatorOfFloat);
            } else if (view instanceof s1) {
                final s1 s1Var2 = (s1) view;
                final r1 transitionParams = s1Var2.getTransitionParams();
                animatorSet.playTogether(ObjectAnimator.ofFloat(s1Var2, s1Var2.f25580we, 0.0f));
                if (lVar2.f47974n) {
                    s1Var2.T3(lVar2.f47975o, lVar2.f47976p, lVar2.f47977q, lVar2.f47978r);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    final float f11 = s1Var2.getCurrentMessagesGroup() == null ? transitionParams.f25179u0 : s1Var2.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                    final float fO2 = s1Var2.getCurrentMessagesGroup() == null ? s1Var2.O2() : s1Var2.getCurrentMessagesGroup().hasCaption;
                    final boolean z12 = f11 != fO2;
                    if (transitionParams.B0) {
                        c10 = 0;
                        iArr = new int[4];
                        for (int i17 = 0; i17 < 4; i17++) {
                            iArr[i17] = s1Var2.getPhotoImage().getRoundRadius()[i17];
                        }
                    } else {
                        c10 = 0;
                        iArr = null;
                    }
                    final int[] iArr2 = iArr;
                    i10 = 2;
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            l lVar3 = lVar2;
                            float f12 = 1.0f - fFloatValue;
                            float f13 = lVar3.f47975o * f12;
                            r1 r1Var3 = transitionParams;
                            float f14 = (r1Var3.m0 * fFloatValue) + f13;
                            float f15 = (r1Var3.f25151n0 * fFloatValue) + (lVar3.f47976p * f12);
                            float f16 = (r1Var3.f25155o0 * fFloatValue) + (lVar3.f47977q * f12);
                            float f17 = (r1Var3.f25159p0 * fFloatValue) + (lVar3.f47978r * f12);
                            boolean z13 = z12;
                            s1 s1Var3 = s1Var2;
                            if (z13) {
                                float f18 = (fO2 * fFloatValue) + (f11 * f12);
                                r1Var3.f25179u0 = f18;
                                if (s1Var3.getCurrentMessagesGroup() != null) {
                                    s1Var3.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f18;
                                }
                            }
                            if (r1Var3.B0) {
                                ImageReceiver photoImage = s1Var3.getPhotoImage();
                                int[] iArr3 = iArr2;
                                float f19 = iArr3[0] * f12;
                                int[] iArr4 = r1Var3.A0;
                                photoImage.setRoundRadius((int) ((iArr4[0] * fFloatValue) + f19), (int) ((iArr4[1] * fFloatValue) + (iArr3[1] * f12)), (int) ((iArr4[2] * fFloatValue) + (iArr3[2] * f12)), (int) ((iArr4[3] * fFloatValue) + (iArr3[3] * f12)));
                            }
                            s1Var3.T3(f14, f15, f16, f17);
                            o1Var2.f5789a.invalidate();
                        }
                    });
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[c10] = valueAnimatorOfFloat2;
                    animatorSet.playTogether(animatorArr);
                } else {
                    i10 = 2;
                }
                if (lVar2.v == 0 && lVar2.f47980t == 0 && lVar2.f47981u == 0 && lVar2.f47979s == 0) {
                    f10 = 0.0f;
                    transitionParams.f25138k0 = 0.0f;
                    transitionParams.f25143l0 = 0.0f;
                    z11 = false;
                } else {
                    f10 = 0.0f;
                    zk0 zk0Var = this.G;
                    zk0Var.setClipChildren(false);
                    zk0Var.invalidate();
                    float[] fArr = new float[i10];
                    
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr);
                    if (lVar2.f47972l) {
                        transitionParams.f25138k0 = -lVar2.f47979s;
                        transitionParams.f25143l0 = -lVar2.f47980t;
                    } else {
                        transitionParams.f25138k0 = (-lVar2.f47979s) - s1Var2.getAnimationOffsetX();
                        transitionParams.f25143l0 = (-lVar2.f47980t) - s1Var2.getAnimationOffsetX();
                    }
                    valueAnimatorOfFloat3.addUpdateListener(new g3(lVar2, transitionParams, s1Var2, 3));
                    z11 = false;
                    animatorSet.playTogether(valueAnimatorOfFloat3);
                }
                MessageObject.GroupedMessages currentMessagesGroup = s1Var2.getCurrentMessagesGroup();
                if (currentMessagesGroup == null) {
                    lVar2.f47970j = z11;
                }
                if (lVar2.f47970j) {
                    float[] fArr2 = new float[i10];
                    
                    fArr2[0] = 1.0f;
                    fArr2[1] = 0.0f;
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(fArr2);
                    final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                    final zk0 zk0Var2 = (zk0) view.getParent();
                    final float f12 = currentMessagesGroup.transitionParams.captionEnterProgress;
                    if (currentMessagesGroup.hasCaption) {
                        f10 = 1.0f;
                    }
                    final boolean z13 = f12 != f10;
                    r1Var = transitionParams;
                    final float f13 = f10;
                    lVar = lVar2;
                    s1Var = s1Var2;
                    valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            l lVar3 = lVar;
                            float f14 = lVar3.f47967f * fFloatValue;
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = transitionParams2;
                            transitionParams3.offsetTop = f14;
                            transitionParams3.offsetBottom = lVar3.f47968g * fFloatValue;
                            transitionParams3.offsetLeft = lVar3.h * fFloatValue;
                            transitionParams3.offsetRight = lVar3.f47969i * fFloatValue;
                            if (z13) {
                                transitionParams3.captionEnterProgress = com.google.android.recaptcha.internal.a.z(1.0f, fFloatValue, f13, f12 * fFloatValue);
                            }
                            zk0 zk0Var3 = zk0Var2;
                            if (zk0Var3 != null) {
                                zk0Var3.invalidate();
                            }
                        }
                    });
                    valueAnimatorOfFloat4.addListener(new h(transitionParams2));
                    i11 = 0;
                    animatorSet.playTogether(valueAnimatorOfFloat4);
                } else {
                    lVar = lVar2;
                    s1Var = s1Var2;
                    r1Var = transitionParams;
                    i11 = 0;
                }
                if (lVar.f47971k) {
                    float[] fArr3 = new float[i10];
                    
                    fArr3[0] = 0.0f;
                    fArr3[1] = 1.0f;
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(fArr3);
                    r1Var2 = r1Var;
                    valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i11) {
                                case 0:
                                    r1Var2.f25198z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    s1Var.invalidate();
                                    break;
                                default:
                                    r1Var2.K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    s1Var.invalidate();
                                    break;
                            }
                        }
                    });
                    Animator[] animatorArr2 = new Animator[1];
                    animatorArr2[i11] = valueAnimatorOfFloat5;
                    animatorSet.playTogether(animatorArr2);
                } else {
                    r1Var2 = r1Var;
                }
                if (lVar.f47973m) {
                    float[] fArr4 = new float[i10];
                    
                    fArr4[0] = 0.0f;
                    fArr4[1] = 1.0f;
                    ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(fArr4);
                    r1Var2.f25118g = true;
                    valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i16) {
                                case 0:
                                    r1Var2.f25198z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    s1Var.invalidate();
                                    break;
                                default:
                                    r1Var2.K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    s1Var.invalidate();
                                    break;
                            }
                        }
                    });
                    animatorSet.playTogether(valueAnimatorOfFloat6);
                }
            } else {
                o1Var2 = o1Var2;
                if (view instanceof v0) {
                    v0 v0Var = (v0) view;
                    u0 transitionParams3 = v0Var.getTransitionParams();
                    if (lVar2.f47973m) {
                        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        transitionParams3.f25690b = true;
                        valueAnimatorOfFloat7.addUpdateListener(new t2(28, transitionParams3, v0Var));
                        animatorSet.playTogether(valueAnimatorOfFloat7);
                    }
                }
            }
            if (z10) {
                animatorSet.setInterpolator(er.f28123g);
            } else {
                interpolator = this.f5737o;
                if (interpolator != null) {
                    animatorSet.setInterpolator(interpolator);
                }
            }
            animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
            animatorSet.addListener(new i(this, o1Var2, i14, view));
            animatorSet.start();
            this.J.put(o1Var2, animatorSet);
        }
        h0 h0Var = (h0) view;
        float translationY2 = h0Var.getTranslationY();
        ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat8.addUpdateListener(new g(this, h0Var, translationY2, i15));
        animatorSet.playTogether(valueAnimatorOfFloat8);
        o1Var2 = o1Var2;
        if (z10) {
            animatorSet.setInterpolator(er.f28123g);
        } else {
            interpolator = this.f5737o;
            if (interpolator != null) {
                animatorSet.setInterpolator(interpolator);
            }
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new i(this, o1Var2, i14, view));
        animatorSet.start();
        this.J.put(o1Var2, animatorSet);
    }

    public final void U() {
        f01 f01Var;
        HashMap map = this.J;
        ArrayList arrayList = new ArrayList(map.values());
        map.clear();
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
        if (this.K.isEmpty() || (f01Var = (f01) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = f01Var.f28223c;
        if (f01Var.f28224e) {
            return;
        }
        f01Var.f28224e = true;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            e01 e01Var = (e01) obj2;
            Runnable runnable = e01Var.d;
            if (runnable != null) {
                f01.b(runnable);
                e01Var.d = null;
            }
        }
        arrayList2.clear();
        d01 d01Var = f01Var.f28221a;
        if (d01Var != null) {
            d01Var.i();
        }
        Runnable runnable2 = f01Var.d;
        if (runnable2 != null) {
            f01Var.d = null;
            f01.b(runnable2);
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
            zk0 zk0Var = this.G;
            int childCount = zk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zk0Var.getChildAt(i10);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (s1Var.getTransitionParams().f25182v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.bottom = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.left = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                        groupedMessages.transitionParams.right = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = s1Var.O2();
                        groupedMessages.transitionParams.pinnedTop = s1Var.m3();
                        groupedMessages.transitionParams.pinnedBotton = s1Var.l3();
                        groupedMessages.transitionParams.isNewGroup = true;
                        break;
                    }
                }
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
        zk0 zk0Var = this.G;
        if (z10) {
            int measuredHeight = (zk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ua) {
            int measuredHeight2 = (zk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ua) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof s1) {
            s1 s1Var = (s1) view;
            s1Var.getTransitionParams().j();
            s1Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof v0)) {
                view.setTranslationX(0.0f);
                return;
            }
            u0 transitionParams = ((v0) view).getTransitionParams();
            transitionParams.f25690b = false;
            transitionParams.f25691c = 1.0f;
        }
    }

    public final void Y(sg sgVar, sg sgVar2) {
        this.T = sgVar;
        this.U = sgVar2;
    }

    public final boolean Z(View view) {
        o1 o1VarT;
        if (this.N || (o1VarT = this.G.T(view)) == null) {
            return false;
        }
        return this.f5739q.contains(o1VarT) || this.f5746y.contains(o1VarT);
    }

    @Override
    public final boolean a(o1 o1Var, p pVar, p pVar2) {
        ArrayList arrayList;
        int height;
        boolean zA = super.a(o1Var, pVar, pVar2);
        if (zA && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.f5739q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((o1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                height = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    height += ((o1) arrayList.get(i11)).f5789a.getHeight();
                }
            } else {
                height = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((o1) arrayList.get(i12)).f5789a.setTranslationY(height);
            }
        }
        return zA;
    }

    public final boolean a0(View view) {
        o1 o1VarT = this.G.T(view);
        if (o1VarT != null) {
            return this.f5738p.contains(o1VarT) || this.A.contains(o1VarT);
        }
        return false;
    }

    @Override
    public final void f(o1 o1Var) {
        f01 f01Var;
        Animator animator = (Animator) this.J.remove(o1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = o1Var.f5789a;
        if (this.K.contains(view) && (f01Var = (f01) this.U.run()) != null) {
            f01Var.a(view);
        }
        super.f(o1Var);
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
        wn wnVar = this.P;
        if (wnVar != null) {
            wnVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.f5740r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.k kVar = (f2.k) arrayList2.get(size2);
            X(kVar.f5716a.f5789a);
            v(kVar.f5716a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5738p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            o1 o1Var = (o1) arrayList3.get(size3);
            X(o1Var.f5789a);
            d(o1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5739q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            o1 o1Var2 = (o1) arrayList4.get(size4);
            X(o1Var2.f5789a);
            u(o1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f5741s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.f5743u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    f2.k kVar2 = (f2.k) arrayList7.get(size7);
                    X(kVar2.f5716a.f5789a);
                    v(kVar2.f5716a);
                    arrayList7.remove(size7);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
            ArrayList arrayList8 = this.f5742t;
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
                for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                    o1 o1Var3 = (o1) arrayList9.get(size9);
                    X(o1Var3.f5789a);
                    u(o1Var3);
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
            E(this.f5747z);
            E(this.f5746y);
            E(this.B);
            e();
        }
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
    public final p l(l1 l1Var, o1 o1Var, int i10, List list) {
        p pVarL = super.l(l1Var, o1Var, i10, list);
        View view = o1Var.f5789a;
        if (!(view instanceof s1)) {
            return pVarL;
        }
        k kVar = new k();
        kVar.f4821a = pVarL.f4821a;
        kVar.f4822b = pVarL.f4822b;
        r1 transitionParams = ((s1) view).getTransitionParams();
        kVar.f47964c = transitionParams.f25091a;
        kVar.d = transitionParams.f25094b;
        kVar.f47965e = transitionParams.f25099c;
        kVar.f47966f = transitionParams.d;
        return kVar;
    }

    @Override
    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int size;
        boolean z15;
        int i10;
        HashMap map;
        ArrayList arrayList2;
        int size2;
        int i11;
        o1 o1Var;
        View view;
        AnimatorSet animatorSet;
        float f10;
        long jMax;
        int i12;
        boolean z16;
        MessageObject.GroupedMessages currentMessagesGroup;
        HashMap map2;
        Long l10;
        wn wnVar;
        s1 s1Var;
        o0.m mVar;
        hc.k kVar;
        o1 o1Var2;
        boolean z17;
        View view2;
        sg sgVar;
        String str;
        MessageObject.GroupedMessages currentMessagesGroup2;
        boolean z18;
        boolean z19;
        MessageObject messageObject;
        sg sgVar2;
        int i13;
        boolean z20;
        rn rnVar;
        ck ckVar;
        Runnable runnable;
        ye yeVar;
        ArrayList arrayList3 = this.f5738p;
        boolean zIsEmpty = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f5740r;
        boolean zIsEmpty2 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.f5741s;
        boolean zIsEmpty3 = arrayList5.isEmpty();
        ArrayList arrayList6 = this.f5739q;
        boolean zIsEmpty4 = arrayList6.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        boolean z21 = this.N;
        zk0 zk0Var = this.G;
        if (z21) {
            z10 = false;
            for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                if (this.Q) {
                    if (((o1) arrayList6.get(i14)).c() == (zk0Var.getAdapter() == null ? 0 : zk0Var.getAdapter().h()) - 1) {
                        z10 = true;
                    }
                } else if (((o1) arrayList6.get(i14)).c() == 0) {
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        W();
        ArrayList arrayList7 = this.f5746y;
        float f11 = 1.0f;
        if (z10) {
            boolean zIsEmpty5 = arrayList3.isEmpty();
            boolean zIsEmpty6 = arrayList4.isEmpty();
            boolean zIsEmpty7 = arrayList5.isEmpty();
            boolean zIsEmpty8 = arrayList6.isEmpty();
            if (!zIsEmpty5 || !zIsEmpty6 || !zIsEmpty8 || !zIsEmpty7) {
                int height = 0;
                for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                    View view3 = ((o1) arrayList6.get(i15)).f5789a;
                    if (view3 instanceof s1) {
                        s1 s1Var2 = (s1) view3;
                        if (s1Var2.getCurrentPosition() == null || (s1Var2.getCurrentPosition().flags & 1) != 0) {
                            height += ((o1) arrayList6.get(i15)).f5789a.getHeight();
                        }
                    } else {
                        height += ((o1) arrayList6.get(i15)).f5789a.getHeight();
                    }
                }
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    D((o1) obj);
                }
                arrayList3.clear();
                if (!zIsEmpty6) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList4);
                    arrayList4.clear();
                    int size4 = arrayList8.size();
                    int i17 = 0;
                    while (i17 < size4) {
                        Object obj2 = arrayList8.get(i17);
                        i17++;
                        f2.k kVar2 = (f2.k) obj2;
                        T(kVar2.f5716a, kVar2, false);
                    }
                    arrayList8.clear();
                }
                if (!zIsEmpty8) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList6);
                    arrayList6.clear();
                    int size5 = arrayList9.size();
                    int i18 = 0;
                    while (i18 < size5) {
                        int i19 = i18 + 1;
                        o1 o1Var3 = (o1) arrayList9.get(i18);
                        View view4 = o1Var3.f5789a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view4.animate();
                        arrayList7.add(o1Var3);
                        view4.setTranslationY(height);
                        View view5 = o1Var3.f5789a;
                        view5.setScaleX(f11);
                        view5.setScaleY(f11);
                        s1 s1Var3 = view5 instanceof s1 ? (s1) view5 : null;
                        if (s1Var3 == null || !s1Var3.getTransitionParams().f25190x0) {
                            view5.setAlpha(f11);
                        }
                        rn rnVar2 = this.F;
                        if (rnVar2 != null) {
                            ArrayList arrayList10 = rnVar2.f42178q4;
                            if (s1Var3 == null || !arrayList10.contains(s1Var3.getMessageObject())) {
                                i13 = size5;
                            } else {
                                arrayList10.remove(s1Var3.getMessageObject());
                                ck ckVar2 = rnVar2.U;
                                if (ckVar2.f26077b0 == null || !((yeVar = ckVar2.H0) == null || yeVar.m0)) {
                                    i13 = size5;
                                } else {
                                    i13 = size5;
                                    z20 = System.currentTimeMillis() - ckVar2.I0 > 300;
                                    ckVar2.I0 = -1L;
                                    if (!z20) {
                                        if (s1Var3.getMessageObject().isVoice()) {
                                            if (SharedConfig.getDevicePerformanceClass() == 0 && Math.abs(view4.getTranslationY()) < zk0Var.getMeasuredHeight()) {
                                                rnVar = rnVar2;
                                                ValueAnimator valueAnimator = new aa1(s1Var3, rnVar2, this.G, rnVar2.I9, this.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                            }
                                            ckVar = rnVar.U;
                                            runnable = ckVar.f26077b0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                ckVar.f26084c0 = true;
                                                ckVar.f26077b0.run();
                                                ckVar.f26077b0 = null;
                                            }
                                        } else if (Math.abs(view4.getTranslationY()) < view4.getMeasuredHeight() * 3.0f) {
                                            new oh1(s1Var3, rnVar2.U, this.G, rnVar2.I9, this.R).f41107f.start();
                                        }
                                        rnVar = rnVar2;
                                        ckVar = rnVar.U;
                                        runnable = ckVar.f26077b0;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            ckVar.f26084c0 = true;
                                            ckVar.f26077b0.run();
                                            ckVar.f26077b0 = null;
                                        }
                                    }
                                }
                                ckVar2.I0 = -1L;
                                if (!z20) {
                                    if (s1Var3.getMessageObject().isVoice()) {
                                        if (SharedConfig.getDevicePerformanceClass() == 0) {
                                        }
                                        ckVar = rnVar.U;
                                        runnable = ckVar.f26077b0;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            ckVar.f26084c0 = true;
                                            ckVar.f26077b0.run();
                                            ckVar.f26077b0 = null;
                                        }
                                    } else if (Math.abs(view4.getTranslationY()) < view4.getMeasuredHeight() * 3.0f) {
                                        new oh1(s1Var3, rnVar2.U, this.G, rnVar2.I9, this.R).f41107f.start();
                                    }
                                    rnVar = rnVar2;
                                    ckVar = rnVar.U;
                                    runnable = ckVar.f26077b0;
                                    if (runnable != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable);
                                        ckVar.f26084c0 = true;
                                        ckVar.f26077b0.run();
                                        ckVar.f26077b0 = null;
                                    }
                                }
                            }
                        } else {
                            i13 = size5;
                        }
                        viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(250L).setInterpolator(this.f5737o).setListener(new ls((f2.l) this, o1Var3, (Object) view4, (Object) viewPropertyAnimatorAnimate, 5)).start();
                        height = height;
                        i18 = i19;
                        size5 = i13;
                        f11 = 1.0f;
                    }
                    arrayList9.clear();
                }
            }
        } else {
            boolean zIsEmpty9 = arrayList3.isEmpty();
            boolean zIsEmpty10 = arrayList4.isEmpty();
            boolean zIsEmpty11 = arrayList5.isEmpty();
            boolean zIsEmpty12 = arrayList6.isEmpty();
            if (!zIsEmpty9 || !zIsEmpty10 || !zIsEmpty12 || !zIsEmpty11) {
                boolean z22 = (this.U == null || (sgVar2 = this.T) == null || !((Boolean) sgVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList11 = this.K;
                ArrayList arrayList12 = this.A;
                char c10 = 1;
                ArrayList arrayList13 = this.S;
                if (z22) {
                    LongSparseArray longSparseArray = null;
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        o1 o1Var4 = (o1) arrayList3.get(i20);
                        if (arrayList13.contains(o1Var4)) {
                            z18 = zIsEmpty10;
                            View view6 = o1Var4.f5789a;
                            z19 = zIsEmpty11;
                            if ((view6 instanceof s1) && ((s1) view6).getCurrentMessagesGroup() != null && (messageObject = ((s1) o1Var4.f5789a).getMessageObject()) != null && messageObject.getGroupId() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                ArrayList arrayList14 = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                                if (arrayList14 == null) {
                                    long groupId = messageObject.getGroupId();
                                    ArrayList arrayList15 = new ArrayList();
                                    longSparseArray.put(groupId, arrayList15);
                                    arrayList14 = arrayList15;
                                }
                                arrayList13.remove(o1Var4);
                                arrayList3.remove(i20);
                                i20--;
                                arrayList14.add(o1Var4);
                            }
                            i20++;
                            z22 = z22;
                            zIsEmpty10 = z18;
                            zIsEmpty11 = z19;
                            arrayList7 = arrayList7;
                        } else {
                            z18 = zIsEmpty10;
                            z19 = zIsEmpty11;
                        }
                        i20++;
                        z22 = z22;
                        zIsEmpty10 = z18;
                        zIsEmpty11 = z19;
                        arrayList7 = arrayList7;
                    }
                    z11 = zIsEmpty10;
                    z12 = zIsEmpty11;
                    arrayList = arrayList7;
                    z13 = z22;
                    if (longSparseArray != null) {
                        z14 = false;
                        for (int i21 = 0; i21 < longSparseArray.size(); i21++) {
                            ArrayList arrayList16 = (ArrayList) longSparseArray.valueAt(i21);
                            if (arrayList16.size() > 0) {
                                View view7 = ((o1) arrayList16.get(0)).f5789a;
                                if (!(view7 instanceof s1) || (currentMessagesGroup2 = ((s1) view7).getCurrentMessagesGroup()) == null || currentMessagesGroup2.messages.size() <= arrayList16.size()) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("animate remove group impl with thanos");
                                    }
                                    arrayList12.addAll(arrayList16);
                                    f01 f01Var = (f01) this.U.run();
                                    for (int i22 = 0; i22 < arrayList16.size(); i22++) {
                                    }
                                    ArrayList arrayList17 = new ArrayList();
                                    for (int i23 = 0; i23 < arrayList16.size(); i23++) {
                                        arrayList17.add(((o1) arrayList16.get(i23)).f5789a);
                                    }
                                    qf.a aVar = new qf.a(this, arrayList17, arrayList16, 12);
                                    d01 d01Var = f01Var.f28221a;
                                    if (d01Var != null) {
                                        d01Var.f(arrayList17, aVar);
                                        Choreographer.getInstance().postFrameCallback(f01Var.f28222b);
                                    } else {
                                        f01Var.f28223c.add(new e01(arrayList17, aVar));
                                    }
                                    arrayList11.add((View) arrayList17.get(0));
                                    zk0Var.B0();
                                    z14 = true;
                                } else {
                                    arrayList3.addAll(arrayList16);
                                }
                            }
                        }
                    }
                    size = arrayList3.size();
                    z15 = z14;
                    i10 = 0;
                    while (true) {
                        map = this.J;
                        if (i10 < size) {
                            break;
                        }
                        Object obj3 = arrayList3.get(i10);
                        int i24 = i10 + 1;
                        o1Var2 = (o1) obj3;
                        if (arrayList13.remove(o1Var2) || !z13) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (!BuildVars.LOGS_ENABLED) {
                            if (z17) {
                                str = " with thanos";
                            } else {
                                str = "";
                            }
                            FileLog.d("animate remove impl ".concat(str));
                        }
                        view2 = o1Var2.f5789a;
                        arrayList12.add(o1Var2);
                        if (z17 || (sgVar = this.U) == null) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 0.0f);
                            objectAnimatorOfFloat.setDuration(this.d);
                            objectAnimatorOfFloat.addListener(new f(this, view2, o1Var2));
                            map.put(o1Var2, objectAnimatorOfFloat);
                            objectAnimatorOfFloat.start();
                        } else {
                            f01 f01Var2 = (f01) sgVar.run();
                            qf.a aVar2 = new qf.a(this, view2, o1Var2, 13);
                            d01 d01Var2 = f01Var2.f28221a;
                            if (d01Var2 != null) {
                                d01Var2.e(view2, 1.0f, aVar2);
                                Choreographer.getInstance().postFrameCallback(f01Var2.f28222b);
                            } else {
                                f01Var2.f28223c.add(new e01(view2, aVar2));
                            }
                            arrayList11.add(view2);
                        }
                        zk0Var.B0();
                        if (z17) {
                            z15 = true;
                        }
                        arrayList12 = arrayList12;
                        arrayList13 = arrayList13;
                        size = size;
                        arrayList3 = arrayList3;
                        i10 = i24;
                        z13 = z13;
                    }
                    arrayList3.clear();
                    if (!z11) {
                        ArrayList arrayList18 = new ArrayList();
                        arrayList18.addAll(arrayList4);
                        this.f5743u.add(arrayList18);
                        arrayList4.clear();
                        kVar = new hc.k(this, arrayList18, z15, 2);
                        if (this.C || zIsEmpty9) {
                            kVar.run();
                        } else {
                            View view8 = ((f2.k) arrayList18.get(0)).f5716a.f5789a;
                            WeakHashMap weakHashMap = j0.f46605a;
                            view8.postOnAnimationDelayed(kVar, 0L);
                        }
                    }
                    if (!z12) {
                        ArrayList arrayList19 = new ArrayList();
                        arrayList19.addAll(arrayList5);
                        this.v.add(arrayList19);
                        arrayList5.clear();
                        mVar = new o0.m(this, arrayList19, false, 6);
                        if (this.C || zIsEmpty9) {
                            mVar.run();
                        } else {
                            View view9 = ((f2.j) arrayList19.get(0)).f5702a.f5789a;
                            WeakHashMap weakHashMap2 = j0.f46605a;
                            view9.postOnAnimationDelayed(mVar, 0L);
                        }
                    }
                    if (!zIsEmpty12) {
                        arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList6);
                        arrayList6.clear();
                        Collections.sort(arrayList2, new lp0(25));
                        size2 = arrayList2.size();
                        i11 = 0;
                        while (i11 < size2) {
                            int i25 = i11 + 1;
                            o1Var = (o1) arrayList2.get(i11);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("animate add impl");
                            }
                            view = o1Var.f5789a;
                            ArrayList arrayList20 = arrayList;
                            arrayList20.add(o1Var);
                            if (o1Var == this.O) {
                                view.setAlpha(1.0f);
                            }
                            animatorSet = new AnimatorSet();
                            if (view instanceof s1) {
                                s1Var = (s1) view;
                                if (s1Var.getAnimationOffsetX() != 0.0f) {
                                    b1 b1Var = s1Var.f25580we;
                                    float[] fArr = new float[2];
                                    fArr[0] = s1Var.getAnimationOffsetX();
                                    fArr[c10] = 0.0f;
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(s1Var, b1Var, fArr));
                                }
                                s1Var.setPivotX(((s1Var.getBackgroundDrawableRight() - s1Var.getBackgroundDrawableLeft()) / 2.0f) + s1Var.getBackgroundDrawableLeft());
                                f10 = 0.0f;
                                view.animate().translationY(0.0f).setDuration(this.f5842c).start();
                            } else {
                                f10 = 0.0f;
                                view.animate().translationX(0.0f).translationY(0.0f).setDuration(this.f5842c).start();
                            }
                            jMax = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view.getBottom() / zk0Var.getMeasuredHeight()))) * 100.0f);
                            if (view instanceof s1) {
                                if (o1Var == this.O) {
                                    wnVar = this.P;
                                    if (wnVar != null) {
                                        wnVar.h.setAlpha(0.0f);
                                    }
                                    zk0Var.setClipChildren(false);
                                    final s1 s1Var4 = (s1) view;
                                    View view10 = (View) this.P.getParent();
                                    float x8 = view10.getX() + this.P.getX() + this.P.h.getX();
                                    float y10 = view10.getY() + this.P.getY() + this.P.h.getY();
                                    float x10 = s1Var4.getX() + zk0Var.getX() + s1Var4.getPhotoImage().getImageX();
                                    float y11 = s1Var4.getY() + zk0Var.getY() + s1Var4.getPhotoImage().getImageY();
                                    final float width = this.P.h.getWidth();
                                    final float height2 = this.P.h.getHeight();
                                    final float imageWidth = s1Var4.getPhotoImage().getImageWidth();
                                    final float imageHeight = s1Var4.getPhotoImage().getImageHeight();
                                    final float f12 = x8 - x10;
                                    final float f13 = y10 - y11;
                                    final float imageX = s1Var4.getPhotoImage().getImageX();
                                    final float imageY = s1Var4.getPhotoImage().getImageY();
                                    s1Var4.getTransitionParams().f25114f0 = true;
                                    s1Var4.getTransitionParams().J1 = true;
                                    s1Var4.getPhotoImage().setImageCoords(imageX + f12, imageX + f13, width, height2);
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                        @Override
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            s1 s1Var5 = s1Var4;
                                            s1Var5.getTransitionParams().K1 = fFloatValue;
                                            if (s1Var5.getTransitionParams().K1 > 1.0f) {
                                                s1Var5.getTransitionParams().K1 = 1.0f;
                                            }
                                            float f14 = 1.0f - fFloatValue;
                                            s1Var5.getPhotoImage().setImageCoords((f12 * f14) + imageX, (f13 * f14) + imageY, (imageWidth * fFloatValue) + (width * f14), (imageHeight * fFloatValue) + (height2 * f14));
                                            s1Var5.invalidate();
                                        }
                                    });
                                    i12 = size2;
                                    valueAnimatorOfFloat.addListener(new e(this, s1Var4, imageX, imageY, imageWidth, imageHeight));
                                    animatorSet.play(valueAnimatorOfFloat);
                                    jMax = jMax;
                                    z16 = false;
                                } else {
                                    i12 = size2;
                                    currentMessagesGroup = ((s1) view).getCurrentMessagesGroup();
                                    if (currentMessagesGroup != null) {
                                        Long lValueOf = Long.valueOf(currentMessagesGroup.groupId);
                                        map2 = this.M;
                                        l10 = (Long) map2.get(lValueOf);
                                        if (l10 == null) {
                                            map2.put(Long.valueOf(currentMessagesGroup.groupId), Long.valueOf(jMax));
                                            jMax = jMax;
                                        } else {
                                            jMax = l10.longValue();
                                        }
                                    } else {
                                        jMax = jMax;
                                    }
                                    if (currentMessagesGroup != null && currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                                        animatorSet.setStartDelay(140L);
                                    }
                                }
                                view.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                                if (z16) {
                                    view.setScaleX(0.9f);
                                    view.setScaleY(0.9f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), 1.0f));
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 1.0f));
                                } else {
                                    view.setScaleX(1.0f);
                                    view.setScaleY(1.0f);
                                }
                                if (o1Var == this.O) {
                                    animatorSet.setDuration(350L);
                                    animatorSet.setInterpolator(new OvershootInterpolator());
                                } else {
                                    animatorSet.setStartDelay(jMax);
                                    animatorSet.setDuration(250L);
                                }
                                animatorSet.addListener(new f(this, o1Var, view));
                                map.put(o1Var, animatorSet);
                                animatorSet.start();
                                i11 = i25;
                                arrayList = arrayList20;
                                size2 = i12;
                                c10 = 1;
                            } else {
                                i12 = size2;
                            }
                            z16 = true;
                            view.setAlpha(0.0f);
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                            if (z16) {
                                view.setScaleX(0.9f);
                                view.setScaleY(0.9f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), 1.0f));
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 1.0f));
                            } else {
                                view.setScaleX(1.0f);
                                view.setScaleY(1.0f);
                            }
                            if (o1Var == this.O) {
                                animatorSet.setDuration(350L);
                                animatorSet.setInterpolator(new OvershootInterpolator());
                            } else {
                                animatorSet.setStartDelay(jMax);
                                animatorSet.setDuration(250L);
                            }
                            animatorSet.addListener(new f(this, o1Var, view));
                            map.put(o1Var, animatorSet);
                            animatorSet.start();
                            i11 = i25;
                            arrayList = arrayList20;
                            size2 = i12;
                            c10 = 1;
                        }
                        arrayList2.clear();
                    }
                } else {
                    z11 = zIsEmpty10;
                    z12 = zIsEmpty11;
                    arrayList = arrayList7;
                    z13 = z22;
                }
                z14 = false;
                size = arrayList3.size();
                z15 = z14;
                i10 = 0;
                while (true) {
                    map = this.J;
                    if (i10 < size) {
                        break;
                        break;
                    }
                    Object obj4 = arrayList3.get(i10);
                    int i26 = i10 + 1;
                    o1Var2 = (o1) obj4;
                    if (arrayList13.remove(o1Var2)) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (!BuildVars.LOGS_ENABLED) {
                        if (z17) {
                            str = " with thanos";
                        } else {
                            str = "";
                        }
                        FileLog.d("animate remove impl ".concat(str));
                    }
                    view2 = o1Var2.f5789a;
                    arrayList12.add(o1Var2);
                    if (z17) {
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 0.0f);
                        objectAnimatorOfFloat2.setDuration(this.d);
                        objectAnimatorOfFloat2.addListener(new f(this, view2, o1Var2));
                        map.put(o1Var2, objectAnimatorOfFloat2);
                        objectAnimatorOfFloat2.start();
                    } else {
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 0.0f);
                        objectAnimatorOfFloat3.setDuration(this.d);
                        objectAnimatorOfFloat3.addListener(new f(this, view2, o1Var2));
                        map.put(o1Var2, objectAnimatorOfFloat3);
                        objectAnimatorOfFloat3.start();
                    }
                    zk0Var.B0();
                    if (z17) {
                        z15 = true;
                    }
                    arrayList12 = arrayList12;
                    arrayList13 = arrayList13;
                    size = size;
                    arrayList3 = arrayList3;
                    i10 = i26;
                    z13 = z13;
                }
                arrayList3.clear();
                if (!z11) {
                    ArrayList arrayList110 = new ArrayList();
                    arrayList110.addAll(arrayList4);
                    this.f5743u.add(arrayList110);
                    arrayList4.clear();
                    kVar = new hc.k(this, arrayList110, z15, 2);
                    if (this.C) {
                        kVar.run();
                    } else {
                        kVar.run();
                    }
                }
                if (!z12) {
                    ArrayList arrayList111 = new ArrayList();
                    arrayList111.addAll(arrayList5);
                    this.v.add(arrayList111);
                    arrayList5.clear();
                    mVar = new o0.m(this, arrayList111, false, 6);
                    if (this.C) {
                        mVar.run();
                    } else {
                        mVar.run();
                    }
                }
                if (!zIsEmpty12) {
                    arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList6);
                    arrayList6.clear();
                    Collections.sort(arrayList2, new lp0(25));
                    size2 = arrayList2.size();
                    i11 = 0;
                    while (i11 < size2) {
                        int i27 = i11 + 1;
                        o1Var = (o1) arrayList2.get(i11);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("animate add impl");
                        }
                        view = o1Var.f5789a;
                        ArrayList arrayList21 = arrayList;
                        arrayList21.add(o1Var);
                        if (o1Var == this.O) {
                            view.setAlpha(1.0f);
                        }
                        animatorSet = new AnimatorSet();
                        if (view instanceof s1) {
                            s1Var = (s1) view;
                            if (s1Var.getAnimationOffsetX() != 0.0f) {
                                b1 b1Var2 = s1Var.f25580we;
                                float[] fArr2 = new float[2];
                                fArr2[0] = s1Var.getAnimationOffsetX();
                                fArr2[c10] = 0.0f;
                                animatorSet.playTogether(ObjectAnimator.ofFloat(s1Var, b1Var2, fArr2));
                            }
                            s1Var.setPivotX(((s1Var.getBackgroundDrawableRight() - s1Var.getBackgroundDrawableLeft()) / 2.0f) + s1Var.getBackgroundDrawableLeft());
                            f10 = 0.0f;
                            view.animate().translationY(0.0f).setDuration(this.f5842c).start();
                        } else {
                            f10 = 0.0f;
                            view.animate().translationX(0.0f).translationY(0.0f).setDuration(this.f5842c).start();
                        }
                        jMax = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view.getBottom() / zk0Var.getMeasuredHeight()))) * 100.0f);
                        if (view instanceof s1) {
                            if (o1Var == this.O) {
                                wnVar = this.P;
                                if (wnVar != null) {
                                    wnVar.h.setAlpha(0.0f);
                                }
                                zk0Var.setClipChildren(false);
                                final s1 s1Var5 = (s1) view;
                                View view11 = (View) this.P.getParent();
                                float x11 = view11.getX() + this.P.getX() + this.P.h.getX();
                                float y12 = view11.getY() + this.P.getY() + this.P.h.getY();
                                float x12 = s1Var5.getX() + zk0Var.getX() + s1Var5.getPhotoImage().getImageX();
                                float y13 = s1Var5.getY() + zk0Var.getY() + s1Var5.getPhotoImage().getImageY();
                                final float width2 = this.P.h.getWidth();
                                final float height3 = this.P.h.getHeight();
                                final float imageWidth2 = s1Var5.getPhotoImage().getImageWidth();
                                final float imageHeight2 = s1Var5.getPhotoImage().getImageHeight();
                                final float f14 = x11 - x12;
                                final float f15 = y12 - y13;
                                final float imageX2 = s1Var5.getPhotoImage().getImageX();
                                final float imageY2 = s1Var5.getPhotoImage().getImageY();
                                s1Var5.getTransitionParams().f25114f0 = true;
                                s1Var5.getTransitionParams().J1 = true;
                                s1Var5.getPhotoImage().setImageCoords(imageX2 + f14, imageX2 + f15, width2, height3);
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        s1 s1Var6 = s1Var5;
                                        s1Var6.getTransitionParams().K1 = fFloatValue;
                                        if (s1Var6.getTransitionParams().K1 > 1.0f) {
                                            s1Var6.getTransitionParams().K1 = 1.0f;
                                        }
                                        float f16 = 1.0f - fFloatValue;
                                        s1Var6.getPhotoImage().setImageCoords((f14 * f16) + imageX2, (f15 * f16) + imageY2, (imageWidth2 * fFloatValue) + (width2 * f16), (imageHeight2 * fFloatValue) + (height3 * f16));
                                        s1Var6.invalidate();
                                    }
                                });
                                i12 = size2;
                                valueAnimatorOfFloat2.addListener(new e(this, s1Var5, imageX2, imageY2, imageWidth2, imageHeight2));
                                animatorSet.play(valueAnimatorOfFloat2);
                                jMax = jMax;
                                z16 = false;
                            } else {
                                i12 = size2;
                                currentMessagesGroup = ((s1) view).getCurrentMessagesGroup();
                                if (currentMessagesGroup != null) {
                                    Long lValueOf2 = Long.valueOf(currentMessagesGroup.groupId);
                                    map2 = this.M;
                                    l10 = (Long) map2.get(lValueOf2);
                                    if (l10 == null) {
                                        map2.put(Long.valueOf(currentMessagesGroup.groupId), Long.valueOf(jMax));
                                        jMax = jMax;
                                    } else {
                                        jMax = l10.longValue();
                                    }
                                } else {
                                    jMax = jMax;
                                }
                                if (currentMessagesGroup != null) {
                                    animatorSet.setStartDelay(140L);
                                }
                            }
                            view.setAlpha(0.0f);
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                            if (z16) {
                                view.setScaleX(0.9f);
                                view.setScaleY(0.9f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), 1.0f));
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 1.0f));
                            } else {
                                view.setScaleX(1.0f);
                                view.setScaleY(1.0f);
                            }
                            if (o1Var == this.O) {
                                animatorSet.setDuration(350L);
                                animatorSet.setInterpolator(new OvershootInterpolator());
                            } else {
                                animatorSet.setStartDelay(jMax);
                                animatorSet.setDuration(250L);
                            }
                            animatorSet.addListener(new f(this, o1Var, view));
                            map.put(o1Var, animatorSet);
                            animatorSet.start();
                            i11 = i27;
                            arrayList = arrayList21;
                            size2 = i12;
                            c10 = 1;
                        } else {
                            i12 = size2;
                        }
                        z16 = true;
                        view.setAlpha(0.0f);
                        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                        if (z16) {
                            view.setScaleX(0.9f);
                            view.setScaleY(0.9f);
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), 1.0f));
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 1.0f));
                        } else {
                            view.setScaleX(1.0f);
                            view.setScaleY(1.0f);
                        }
                        if (o1Var == this.O) {
                            animatorSet.setDuration(350L);
                            animatorSet.setInterpolator(new OvershootInterpolator());
                        } else {
                            animatorSet.setStartDelay(jMax);
                            animatorSet.setDuration(250L);
                        }
                        animatorSet.addListener(new f(this, o1Var, view));
                        map.put(o1Var, animatorSet);
                        animatorSet.start();
                        i11 = i27;
                        arrayList = arrayList21;
                        size2 = i12;
                        c10 = 1;
                    }
                    arrayList2.clear();
                }
            }
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new m2(this, 21));
        valueAnimatorOfFloat3.setDuration(this.d + 250);
        valueAnimatorOfFloat3.start();
    }

    @Override
    public final void p(o1 o1Var) {
        R(o1Var);
        View view = o1Var.f5789a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof s1) {
            ((s1) view).getTransitionParams().h = true;
        }
        this.f5739q.add(o1Var);
    }

    @Override
    public final boolean q(o1 o1Var, o1 o1Var2, p pVar, int i10, int i11, int i12, int i13) {
        if (o1Var == o1Var2) {
            return r(o1Var, pVar, i10, i11, i12, i13);
        }
        View view = o1Var.f5789a;
        float animationOffsetX = view instanceof s1 ? ((s1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(o1Var);
        int i14 = (int) ((i12 - i10) - animationOffsetX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof s1) {
            ((s1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = o1Var2.f5789a;
        R(o1Var2);
        if (view2 instanceof s1) {
            ((s1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.f5741s.add(new f2.j(o1Var, o1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public final boolean r(o1 o1Var, p pVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int topMediaOffset;
        s1 s1Var;
        v0 v0Var;
        float f10;
        float f11;
        float imageWidth;
        float f12;
        float f13;
        View view;
        int i14;
        float f14;
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int i15;
        boolean zIsOutOwner;
        View view2 = o1Var.f5789a;
        if (view2 instanceof s1) {
            s1 s1Var2 = (s1) view2;
            translationX = i10 + ((int) s1Var2.getAnimationOffsetX());
            topMediaOffset = s1Var2.getTransitionParams().f25173s2 != s1Var2.getTopMediaOffset() ? (s1Var2.getTransitionParams().f25173s2 - s1Var2.getTopMediaOffset()) + i11 : i11;
            s1Var = s1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i10 + ((int) view2.getTranslationX());
            topMediaOffset = i11;
            v0Var = (v0) view2;
            s1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            topMediaOffset = i11;
            s1Var = null;
            v0Var = null;
        }
        int i16 = translationX;
        int translationY = topMediaOffset + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (s1Var != null) {
            float imageX = s1Var.getPhotoImage().getImageX();
            float imageY = s1Var.getPhotoImage().getImageY();
            imageWidth = s1Var.getPhotoImage().getImageWidth();
            float imageHeight = s1Var.getPhotoImage().getImageHeight();
            f10 = 0.0f;
            for (int i17 = 0; i17 < 4; i17++) {
                iArr[i17] = s1Var.getPhotoImage().getRoundRadius()[i17];
            }
            f12 = imageX;
            f11 = imageHeight;
            f13 = imageY;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            imageWidth = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        R(o1Var);
        int i18 = i12 - i16;
        int i19 = i13 - translationY;
        if (i19 != 0) {
            view2.setTranslationY(-i19);
        }
        float f15 = f11;
        v0 v0Var2 = v0Var;
        float f16 = imageWidth;
        l lVar = new l(o1Var, i16, translationY, i12, i13);
        if (s1Var != null) {
            r1 transitionParams = s1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.f25175t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (i18 != 0) {
                s1Var.setAnimationOffsetX(-i18);
            }
            boolean z11 = pVar instanceof k;
            zk0 zk0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = s1Var.getPhotoImage();
                view = view2;
                k kVar = (k) pVar;
                i14 = i18;
                boolean z12 = (!transitionParams.f25182v0 || kVar.f47966f == f10 || kVar.f47965e == f10) ? false : true;
                lVar.f47974n = z12;
                if (z12) {
                    zk0Var.setClipChildren(false);
                    zk0Var.invalidate();
                    transitionParams.f25114f0 = true;
                    if (s1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f12;
                        transitionParams.f25151n0 = f13;
                        transitionParams.f25155o0 = f16;
                        transitionParams.f25159p0 = f15;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.f25151n0 = photoImage.getImageY();
                        transitionParams.f25155o0 = photoImage.getImageWidth();
                        transitionParams.f25159p0 = photoImage.getImageHeight();
                        transitionParams.A0 = photoImage.getRoundRadius();
                    }
                    transitionParams.B0 = false;
                    for (int i20 = 0; i20 < 4; i20++) {
                        if (iArr2[i20] != transitionParams.A0[i20]) {
                            transitionParams.B0 = true;
                            break;
                        }
                    }
                    float f17 = transitionParams.m0;
                    float f18 = kVar.f47964c;
                    if (f17 == f18 && transitionParams.f25151n0 == kVar.d && transitionParams.f25159p0 == kVar.f47966f && transitionParams.f25155o0 == kVar.f47965e && !transitionParams.B0) {
                        transitionParams.f25114f0 = false;
                        lVar.f47974n = false;
                    } else {
                        lVar.f47975o = f18;
                        lVar.f47976p = kVar.d;
                        lVar.f47977q = kVar.f47965e;
                        lVar.f47978r = kVar.f47966f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z14 = transitionParams2.drawCaptionLayout;
                            if (z13 != z14) {
                                transitionParams2.captionEnterProgress = z14 ? 1.0f : 0.0f;
                            }
                        }
                        if (transitionParams.B0) {
                            if (transitionParams.A0 == photoImage.getRoundRadius()) {
                                transitionParams.A0 = new int[4];
                                for (int i21 = 0; i21 < 4; i21++) {
                                    transitionParams.A0[i21] = photoImage.getRoundRadius()[i21];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        s1Var.T3(lVar.f47975o, lVar.f47976p, lVar.f47977q, lVar.f47978r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.f25182v0 && (((zIsOutOwner = s1Var.getMessageObject().isOutOwner()) && rect.left != s1Var.getBackgroundDrawableLeft()) || ((!zIsOutOwner && rect.right != s1Var.getBackgroundDrawableRight()) || rect.top != s1Var.getBackgroundDrawableTop() || rect.bottom != s1Var.getBackgroundDrawableBottom()))) {
                    lVar.v = s1Var.getBackgroundDrawableBottom() - rect.bottom;
                    lVar.f47981u = s1Var.getBackgroundDrawableTop() - rect.top;
                    if (s1Var.C8 != transitionParams.E0) {
                        lVar.f47979s = s1Var.getBackgroundDrawableLeft() - rect.left;
                        lVar.f47980t = s1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (zIsOutOwner) {
                        lVar.f47979s = s1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        lVar.f47980t = s1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    lVar.f47972l = true;
                    transitionParams.f25186w0 = true;
                    transitionParams.f25119g0 = -lVar.f47979s;
                    transitionParams.f25123h0 = -lVar.f47980t;
                    transitionParams.f25133j0 = -lVar.f47981u;
                    transitionParams.f25128i0 = -lVar.v;
                    zk0Var.setClipChildren(false);
                    zk0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i18;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    zk0 zk0Var2 = (zk0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z15 = true;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    while (i22 < zk0Var2.getChildCount()) {
                        View childAt = zk0Var2.getChildAt(i22);
                        if (childAt instanceof s1) {
                            s1 s1Var3 = (s1) childAt;
                            if (s1Var3.getCurrentMessagesGroup() != currentMessagesGroup || s1Var3.getMessageObject().deleted) {
                                groupedMessages = currentMessagesGroup;
                                i15 = i22;
                            } else {
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                i15 = i22;
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if (i25 == 0 || backgroundDrawableLeft < i25) {
                                    i25 = backgroundDrawableLeft;
                                }
                                if (i26 == 0 || backgroundDrawableRight > i26) {
                                    i26 = backgroundDrawableRight;
                                }
                                if (s1Var3.getTransitionParams().f25182v0 || transitionParams3.isNewGroup) {
                                    if (i23 == 0 || backgroundDrawableTop < i23) {
                                        i23 = backgroundDrawableTop;
                                    }
                                    if (i24 == 0 || backgroundDrawableBottom > i24) {
                                        i24 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                            }
                        } else {
                            groupedMessages = currentMessagesGroup;
                            i15 = i22;
                        }
                        i22 = i15 + 1;
                        currentMessagesGroup = groupedMessages;
                    }
                    transitionParams3.isNewGroup = false;
                    if (i23 == 0 && i24 == 0 && i25 == 0 && i26 == 0) {
                        lVar.f47970j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i27 = (-i23) + transitionParams3.top;
                        lVar.f47967f = i27;
                        int i28 = (-i24) + transitionParams3.bottom;
                        lVar.f47968g = i28;
                        int i29 = (-i25) + transitionParams3.left;
                        lVar.h = i29;
                        int i30 = (-i26) + transitionParams3.right;
                        lVar.f47969i = i30;
                        lVar.f47970j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i27;
                        transitionParams3.offsetBottom = i28;
                        transitionParams3.offsetLeft = i29;
                        transitionParams3.offsetRight = i30;
                        transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                        zk0Var2.setClipChildren(false);
                        zk0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z15;
                }
            }
            Integer numValueOf = Integer.valueOf(s1Var.getMessageObject().getId());
            HashMap map = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) map.get(numValueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                map.remove(Integer.valueOf(s1Var.getMessageObject().getId()));
                if (transitionParams.f25182v0) {
                    int backgroundDrawableLeft2 = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                    int backgroundDrawableRight2 = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                    int backgroundDrawableTop2 = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                    int backgroundDrawableBottom2 = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                    lVar.f47982w = true;
                    transitionParams.f25186w0 = true;
                    int i31 = backgroundDrawableLeft2 - transitionParams4.left;
                    lVar.f47979s = i31;
                    lVar.f47980t = backgroundDrawableRight2 - transitionParams4.right;
                    lVar.f47981u = backgroundDrawableTop2 - transitionParams4.top;
                    lVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    lVar.f47972l = false;
                    transitionParams.f25119g0 = (int) ((-i31) - s1Var.getAnimationOffsetX());
                    transitionParams.f25123h0 = (int) ((-lVar.f47980t) - s1Var.getAnimationOffsetX());
                    transitionParams.f25133j0 = (int) ((-lVar.f47981u) - s1Var.getTranslationY());
                    transitionParams.f25128i0 = (int) ((-lVar.v) - s1Var.getTranslationY());
                    transitionParams.C0 = true;
                    zk0Var.setClipChildren(false);
                    zk0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = s1Var.H;
            if (transitionParams.f25194y0 != (s1Var.f25347g8 || s1Var.F || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && s1Var.G.isDocuments))) {
                z10 = true;
                lVar.f47971k = true;
                f14 = 0.0f;
                transitionParams.f25198z0 = 0.0f;
            } else {
                f14 = 0.0f;
                z10 = true;
            }
            boolean zF = transitionParams.f();
            lVar.f47973m = zF;
            if (zF) {
                transitionParams.f25118g = z10;
                transitionParams.K1 = f14;
            }
            if (i14 == 0 && i19 == 0 && !lVar.f47974n && !lVar.f47982w && !lVar.f47970j && !lVar.f47971k && !lVar.f47972l && !zF) {
                v(o1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i18 != 0) {
                view2.setTranslationX(-i18);
            }
            boolean zA = !transitionParams5.f25689a ? false : transitionParams5.d.f25785y0.a();
            lVar.f47973m = zA;
            if (zA) {
                transitionParams5.f25690b = true;
                transitionParams5.f25691c = 0.0f;
            }
            if (i18 == 0 && i19 == 0 && !zA) {
                v(o1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof ua) {
            ((ua) view2).setAnimating(true);
        } else {
            if (i18 == 0 && i19 == 0) {
                v(o1Var);
                return false;
            }
            if (i18 != 0) {
                view2.setTranslationX(-i18);
            }
        }
        this.f5740r.add(lVar);
        F();
        return true;
    }

    @Override
    public final void s(o1 o1Var, p pVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(o1Var, pVar);
        View view = o1Var.f5789a;
        if (pVar != null) {
            int i10 = pVar.f4822b;
            int top = view.getTop();
            int left = view.getLeft() - pVar.f4821a;
            int i11 = top - i10;
            if (i11 != 0) {
                view.setTranslationY(-i11);
            }
            if (!(view instanceof s1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            s1 s1Var = (s1) view;
            if (left != 0) {
                s1Var.setAnimationOffsetX(-left);
            }
            if (pVar instanceof k) {
                k kVar = (k) pVar;
                s1Var.T3(kVar.f47964c, kVar.d, kVar.f47965e, kVar.f47966f);
            }
        }
    }
}
