package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class rj extends ai.f7 {
    public int Z2;
    public final ArrayList f36859a3;
    public final ArrayList f36860b3;
    public final ArrayList f36861c3;
    public final ArrayList f36862d3;
    public final ArrayList f36863e3;
    public int f36864f3;
    public int f36865g3;
    public int f36866h3;
    public long f36867i3;
    public float j3;
    public float f36868k3;
    public boolean f36869l3;
    public final float f36870m3;
    public final Paint f36871n3;
    public final Paint f36872o3;
    public final o1.j f36873p3;
    public final o1.k f36874q3;
    public final o1.j f36875r3;
    public final o1.k f36876s3;
    public final o1.j f36877t3;
    public final o1.k f36878u3;
    public boolean f36879v3;
    public final Path f36880w3;
    public boolean f36881x3;
    public int y3;
    public final xn f36882z3;

    public rj(xn xnVar, Context context, vn vnVar) {
        super(xnVar, context, vnVar, 1);
        this.f36882z3 = xnVar;
        this.f36859a3 = new ArrayList();
        this.f36860b3 = new ArrayList();
        this.f36861c3 = new ArrayList();
        this.f36862d3 = new ArrayList();
        this.f36863e3 = new ArrayList(10);
        this.f36870m3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f36871n3 = paint;
        Paint paint2 = new Paint(1);
        this.f36872o3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f36873p3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f15320g = 2000.0f;
        kVar.f15326u = org.telegram.ui.Cells.q3.l(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final rj f36132b;

            {
                this.f36132b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f36132b.invalidate();
                        return;
                    case 1:
                        this.f36132b.invalidate();
                        return;
                    default:
                        this.f36132b.invalidate();
                        return;
                }
            }
        });
        this.f36874q3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f36875r3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f15326u = org.telegram.ui.Cells.q3.l(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final rj f36132b;

            {
                this.f36132b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f36132b.invalidate();
                        return;
                    case 1:
                        this.f36132b.invalidate();
                        return;
                    default:
                        this.f36132b.invalidate();
                        return;
                }
            }
        });
        this.f36876s3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f36877t3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f15326u = org.telegram.ui.Cells.q3.l(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final rj f36132b;

            {
                this.f36132b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f36132b.invalidate();
                        return;
                    case 1:
                        this.f36132b.invalidate();
                        return;
                    default:
                        this.f36132b.invalidate();
                        return;
                }
            }
        });
        this.f36878u3 = kVar3;
        this.f36880w3 = new Path();
        this.y3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final boolean F0(View view) {
        if (view.getVisibility() != 4 && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.f36882z3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        xn xnVar = this.f36882z3;
        xnVar.f39565u8 = null;
        canvas.save();
        if (xnVar.V9 != null && xnVar.R9) {
            boolean z10 = xnVar.S9;
        }
        this.G1.setEmpty();
        if (xnVar.N9 != 0.0f) {
            int save = canvas.save();
            if (xnVar.U9 != 0.0f) {
                f7 = (xnVar.f39596x0.getMeasuredHeight() - xnVar.N9) * xnVar.U9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-xnVar.N9) - f7;
            xnVar.f39618ya = f10;
            canvas.translate(0.0f, f10);
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void h1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.t1)) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            t1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f36882z3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        uh.j jVar;
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f36882z3;
        rm rmVar = xnVar.f39345c9;
        rmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(rmVar.f19988g0);
            rmVar.f20017z = false;
        }
        if (this.X1 || ((jVar = xnVar.X9) != null && jVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        if (!kVar.s() && !xnVar.A9()) {
            y1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.Z2;
        int i15 = i12 - i10;
        xn xnVar = this.f36882z3;
        if (i14 != i15) {
            if (i14 != 0) {
                xnVar.h9(false);
            }
            this.Z2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.y3 != measuredHeight) {
            this.f36881x3 = true;
            tj tjVar = xnVar.f39609y0;
            if (tjVar != null) {
                tjVar.g();
            }
            xnVar.W8.a();
            this.f36881x3 = false;
            this.y3 = measuredHeight;
        }
        xnVar.R5 = false;
        rm rmVar = xnVar.f39345c9;
        if (rmVar != null && rmVar.y()) {
            xnVar.f39345c9.x();
        }
        xnVar.p9();
        xnVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        vp vpVar;
        xn xnVar = this.f36882z3;
        le.c cVar = xnVar.f39556tc;
        rm rmVar = xnVar.f39345c9;
        rmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(rmVar.f19988g0);
            rmVar.f20017z = false;
        }
        if (motionEvent.getAction() == 0) {
            xnVar.f39542sa = true;
        }
        if (xnVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, xnVar.N9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (vpVar = xnVar.P9) != null && !vpVar.R) {
                if (vpVar.K != 1.0f) {
                    float f7 = xnVar.N9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    xnVar.Q9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final rj f36461b;

                        {
                            this.f36461b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xn xnVar2 = this.f36461b.f36882z3;
                                    xnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar2.f39596x0.invalidate();
                                    return;
                                case 1:
                                    xn xnVar3 = this.f36461b.f36882z3;
                                    xnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar3.f39596x0.invalidate();
                                    return;
                                case 2:
                                    xn xnVar4 = this.f36461b.f36882z3;
                                    xnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar4.f39596x0.invalidate();
                                    return;
                                default:
                                    xn xnVar5 = this.f36461b.f36882z3;
                                    xnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar5.f39596x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27701f;
                    ofFloat.setInterpolator(rrVar);
                    ofFloat.start();
                    final vp vpVar2 = xnVar.P9;
                    aj ajVar = new aj(this, 1);
                    AnimatorSet animatorSet = vpVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        vpVar2.J.cancel();
                    }
                    vpVar2.Y = ajVar;
                    vpVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(vpVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vp vpVar3 = vpVar2;
                                    vpVar3.getClass();
                                    vpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vpVar3.T.invalidate();
                                    View view = vpVar3.f38443a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vp vpVar4 = vpVar2;
                                    vpVar4.getClass();
                                    vpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = vpVar4.f38443a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(vpVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vp vpVar3 = vpVar2;
                                    vpVar3.getClass();
                                    vpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vpVar3.T.invalidate();
                                    View view = vpVar3.f38443a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vp vpVar4 = vpVar2;
                                    vpVar4.getClass();
                                    vpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = vpVar4.f38443a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    vpVar2.J.addListener(new u4(vpVar2, 23));
                    vpVar2.J.playTogether(ofFloat2, ofFloat3);
                    vpVar2.J.setDuration(120L);
                    vpVar2.J.setInterpolator(rrVar);
                    vpVar2.J.start();
                } else {
                    xn.X1(xnVar);
                }
            } else {
                vp vpVar3 = xnVar.P9;
                if (vpVar3 != null && vpVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    vp vpVar4 = xnVar.P9;
                    if (currentTimeMillis - vpVar4.U < 500 && vpVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        xnVar.Q9 = animatorSet2;
                        if (xnVar.P9 != null) {
                            cVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(xnVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final rj f36461b;

                            {
                                this.f36461b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        xn xnVar2 = this.f36461b.f36882z3;
                                        xnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar2.f39596x0.invalidate();
                                        return;
                                    case 1:
                                        xn xnVar3 = this.f36461b.f36882z3;
                                        xnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar3.f39596x0.invalidate();
                                        return;
                                    case 2:
                                        xn xnVar4 = this.f36461b.f36882z3;
                                        xnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar4.f39596x0.invalidate();
                                        return;
                                    default:
                                        xn xnVar5 = this.f36461b.f36882z3;
                                        xnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar5.f39596x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final rj f36461b;

                            {
                                this.f36461b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        xn xnVar2 = this.f36461b.f36882z3;
                                        xnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar2.f39596x0.invalidate();
                                        return;
                                    case 1:
                                        xn xnVar3 = this.f36461b.f36882z3;
                                        xnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar3.f39596x0.invalidate();
                                        return;
                                    case 2:
                                        xn xnVar4 = this.f36461b.f36882z3;
                                        xnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar4.f39596x0.invalidate();
                                        return;
                                    default:
                                        xn xnVar5 = this.f36461b.f36882z3;
                                        xnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar5.f39596x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(ji.n.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(xnVar.N9, 0.0f);
                xnVar.Q9 = ofFloat6;
                if (xnVar.P9 != null) {
                    cVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final rj f36461b;

                    {
                        this.f36461b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                xn xnVar2 = this.f36461b.f36882z3;
                                xnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar2.f39596x0.invalidate();
                                return;
                            case 1:
                                xn xnVar3 = this.f36461b.f36882z3;
                                xnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar3.f39596x0.invalidate();
                                return;
                            case 2:
                                xn xnVar4 = this.f36461b.f36882z3;
                                xnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar4.f39596x0.invalidate();
                                return;
                            default:
                                xn xnVar5 = this.f36461b.f36882z3;
                                xnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar5.f39596x0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(ji.n.V);
                ofFloat6.start();
            }
        }
        if (!this.X1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
            if (!kVar.s() && !xnVar.A9()) {
                y1(motionEvent);
                if (xnVar.f39381f9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.f36882z3.Q8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.f36882z3.f39357d9 != null) {
            y1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f36881x3) {
            return;
        }
        hh.a aVar = this.f36882z3.Pb;
        if (aVar.f10481b != 0) {
            int childCount = aVar.f10480a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f10480a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(s4.m0 m0Var) {
        if (this.X1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            xn xnVar = this.f36882z3;
            xnVar.o9();
            xnVar.r9();
        }
    }

    public final void w1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj.w1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void x1(Canvas canvas, RectF rectF) {
        float f7;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.f36859a3;
        int size = arrayList2.size();
        xn xnVar = this.f36882z3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i10);
                if (!xn.d2(xnVar, t1Var, rectF)) {
                    canvas.save();
                    canvas.translate(t1Var.E2(false) + t1Var.getLeft(), t1Var.getY() + t1Var.getPaddingTop());
                    if (t1Var.a()) {
                        f13 = t1Var.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    t1Var.m2(f13, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f36860b3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i11);
                if (!xn.d2(xnVar, t1Var2, rectF)) {
                    float E2 = t1Var2.E2(false) + t1Var2.getLeft();
                    float y3 = t1Var2.getY() + t1Var2.getPaddingTop();
                    if (t1Var2.a()) {
                        f12 = t1Var2.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(E2, y3);
                    t1Var2.setInvalidatesParent(true);
                    t1Var2.W1(canvas, f12);
                    t1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f36861c3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i12);
                if (xn.d2(xnVar, t1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (t1Var3.getCurrentPosition() != null && (t1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (t1Var3.a()) {
                        f11 = t1Var3.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float E22 = t1Var3.E2(z13) + t1Var3.getLeft();
                    float y10 = t1Var3.getY() + t1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = t1Var3.E2(z12);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f14 = transitionParams.left + E23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f15 = transitionParams.top + transitionParams.offsetTop;
                            float f16 = transitionParams.right + E23 + transitionParams.offsetRight;
                            float f17 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f15 += t1Var3.getTranslationY();
                                f17 += t1Var3.getTranslationY();
                            }
                            canvas.clipRect(f14 + AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(8.0f), f16 - AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (t1Var3.getTransitionParams().f20882v0) {
                        canvas.translate(E22, y10);
                        t1Var3.setInvalidatesParent(true);
                        t1Var3.I1(f11, canvas, z11);
                        t1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z12 = 1;
                z13 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.f36862d3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i13);
                if (!xn.d2(xnVar, t1Var4, rectF)) {
                    if (t1Var4.getCurrentPosition() != null && (t1Var4.getCurrentPosition().flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (t1Var4.a()) {
                        f10 = t1Var4.getAlpha();
                    } else {
                        f10 = 1.0f;
                    }
                    float E24 = t1Var4.E2(false) + t1Var4.getLeft();
                    float y11 = t1Var4.getY() + t1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = t1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f18 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f19 = transitionParams2.top + transitionParams2.offsetTop;
                        float f20 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f21 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f19 += t1Var4.getTranslationY();
                            f21 += t1Var4.getTranslationY();
                        }
                        canvas.clipRect(f18 + AndroidUtilities.dp(f7), f19 + AndroidUtilities.dp(f7), f20 - AndroidUtilities.dp(f7), f21 - AndroidUtilities.dp(f7));
                    }
                    if (!z10 && t1Var4.getTransitionParams().f20882v0) {
                        canvas.translate(E24, y11);
                        t1Var4.setInvalidatesParent(true);
                        t1Var4.d2(canvas, f10, null);
                        t1Var4.N1(canvas, f10);
                        t1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void y1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        xn xnVar = this.f36882z3;
        if (motionEvent != null) {
            xnVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !xnVar.f39381f9 && !xnVar.f39369e9 && xnVar.f39357d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.t1) {
                    if (xnVar.f39357d9 != null) {
                        xn.V1(xnVar, 0.0f);
                    }
                    xnVar.f39357d9 = (org.telegram.ui.Cells.t1) pressedChildView;
                    MessageObject T1 = xn.T1(xnVar);
                    boolean F6 = xnVar.F6(T1);
                    int i10 = xnVar.R3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && xnVar.f39352d4 == xnVar.getUserConfig().getClientUserId())) && (((arrayList = xnVar.f39312a4) == null || !arrayList.contains(T1)) && ((xnVar.E8(T1) != 1 || (T1.getDialogId() != xnVar.L6 && !T1.needDrawBluredPreview())) && ((xnVar.h != null || T1.getId() >= 0) && (((chat2 = xnVar.e) == null || !ChatObject.isForum(chat2) || F6) && !xnVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f36866h3 = motionEvent.getPointerId(0);
                        xnVar.f39369e9 = true;
                        this.f36864f3 = (int) motionEvent.getX();
                        this.f36865g3 = (int) motionEvent.getY();
                        return;
                    }
                    xn.V1(xnVar, 0.0f);
                    xnVar.f39357d9 = null;
                    return;
                }
                return;
            }
        }
        if (xnVar.f39357d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f36866h3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f36864f3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f36865g3);
            if (getScrollState() == 0 && xnVar.f39369e9 && !xnVar.f39381f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                xnVar.f39357d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                xnVar.f39621z0.R = false;
                xnVar.f39369e9 = false;
                xnVar.f39381f9 = true;
                this.f36864f3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (xnVar.f39381f9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f36869l3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f36869l3 = true;
                    }
                } else {
                    this.f36869l3 = false;
                }
                float f11 = max;
                xn.V1(xnVar, f11);
                MessageObject T12 = xn.T1(xnVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    xnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.t1 t1Var = xnVar.f39357d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
                    z1(t1Var, f11);
                }
                invalidate();
            }
        } else if (xnVar.f39357d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f36866h3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.t1 t1Var2 = xnVar.f39357d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var2)) {
                    f10 = t1Var2.E2(false);
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = xn.T1(xnVar);
                    boolean F62 = xnVar.F6(T13);
                    ok okVar = xnVar.O0;
                    if ((okVar != null && okVar.getVisibility() == 0 && ((!xnVar.I0 || !F62) && !T13.wasJustSent)) || ((chat = xnVar.e) != null && ((ChatObject.isNotInChat(chat) && !xnVar.F9()) || ((ChatObject.isChannel(xnVar.e) && !ChatObject.canPost(xnVar.e) && !xnVar.e.megagroup) || !ChatObject.canSendMessages(xnVar.e))))) {
                        if (T13.getGroupId() != 0 && (y82 = xnVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        xnVar.f39475n5 = T13;
                        Bundle e = org.telegram.messenger.z0.e(3, "onlySelect", "dialogsType", true);
                        e.putBoolean("quote", true);
                        e.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != xnVar.a() && peerDialogId != xnVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e.putLong("reply_to_author", peerDialogId);
                        }
                        e.putInt("messagesCount", 1);
                        e.putBoolean("canSelectTopics", true);
                        ry ryVar = new ry(e);
                        ryVar.C2 = xnVar;
                        xnVar.presentFragment(ryVar);
                    } else {
                        xnVar.Bb(xn.T1(xnVar));
                    }
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = xnVar.f39357d9;
            if (com.google.android.gms.internal.vision.e2.u(t1Var3)) {
                f7 = t1Var3.getSlidingOffsetX();
            } else {
                f7 = 0.0f;
            }
            this.f36868k3 = f7;
            if (f7 == 0.0f) {
                xnVar.f39357d9 = null;
            }
            this.f36867i3 = System.currentTimeMillis();
            this.j3 = 0.0f;
            invalidate();
            xnVar.f39369e9 = false;
            xnVar.f39381f9 = false;
            xnVar.f39621z0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.t1 t1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != t1Var && (childAt instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    t1Var2.setSlidingOffset(f7);
                    t1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
