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
public final class uj extends ym {
    public int Y2;
    public final ArrayList Z2;
    public final ArrayList f41155a3;
    public final ArrayList f41156b3;
    public final ArrayList f41157c3;
    public final ArrayList f41158d3;
    public int f41159e3;
    public int f41160f3;
    public int f41161g3;
    public long f41162h3;
    public float f41163i3;
    public float j3;
    public boolean f41164k3;
    public final float f41165l3;
    public final Paint f41166m3;
    public final Paint f41167n3;
    public final o1.j f41168o3;
    public final o1.k f41169p3;
    public final o1.j f41170q3;
    public final o1.k f41171r3;
    public final o1.j f41172s3;
    public final o1.k f41173t3;
    public boolean f41174u3;
    public final Path f41175v3;
    public boolean f41176w3;
    public int f41177x3;
    public final co y3;

    public uj(co coVar, Context context, ao aoVar) {
        super(coVar, context, aoVar);
        this.y3 = coVar;
        this.Z2 = new ArrayList();
        this.f41155a3 = new ArrayList();
        this.f41156b3 = new ArrayList();
        this.f41157c3 = new ArrayList();
        this.f41158d3 = new ArrayList(10);
        this.f41165l3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f41166m3 = paint;
        Paint paint2 = new Paint(1);
        this.f41167n3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f41168o3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f16819g = 2000.0f;
        kVar.f16825u = org.telegram.ui.Cells.p6.l(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final uj f40463b;

            {
                this.f40463b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f40463b.invalidate();
                        return;
                    case 1:
                        this.f40463b.invalidate();
                        return;
                    default:
                        this.f40463b.invalidate();
                        return;
                }
            }
        });
        this.f41169p3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f41170q3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f16825u = org.telegram.ui.Cells.p6.l(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final uj f40463b;

            {
                this.f40463b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f40463b.invalidate();
                        return;
                    case 1:
                        this.f40463b.invalidate();
                        return;
                    default:
                        this.f40463b.invalidate();
                        return;
                }
            }
        });
        this.f41171r3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f41172s3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f16825u = org.telegram.ui.Cells.p6.l(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final uj f40463b;

            {
                this.f40463b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f40463b.invalidate();
                        return;
                    case 1:
                        this.f40463b.invalidate();
                        return;
                    default:
                        this.f40463b.invalidate();
                        return;
                }
            }
        });
        this.f41173t3 = kVar3;
        this.f41175v3 = new Path();
        this.f41177x3 = 0;
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
        if (this.y3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        co coVar = this.y3;
        coVar.f35442u8 = null;
        canvas.save();
        if (coVar.V9 != null && coVar.R9) {
            boolean z10 = coVar.S9;
        }
        this.G1.setEmpty();
        if (coVar.N9 != 0.0f) {
            int save = canvas.save();
            if (coVar.U9 != 0.0f) {
                f7 = (coVar.f35473x0.getMeasuredHeight() - coVar.N9) * coVar.U9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-coVar.N9) - f7;
            coVar.f35495ya = f10;
            canvas.translate(0.0f, f10);
            v1(canvas, null);
            super.dispatchDraw(canvas);
            w1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            v1(canvas, null);
            super.dispatchDraw(canvas);
            w1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void g1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.g1(view, f7, f10, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.y3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.y3;
        vm vmVar = coVar.f35221c9;
        vmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(vmVar.f21774g0);
            vmVar.f21803z = false;
        }
        if (this.X1 || ((iVar = coVar.X9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (!kVar.s() && !coVar.A9()) {
            x1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.Y2;
        int i15 = i12 - i10;
        co coVar = this.y3;
        if (i14 != i15) {
            if (i14 != 0) {
                coVar.h9(false);
            }
            this.Y2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f41177x3 != measuredHeight) {
            this.f41176w3 = true;
            wj wjVar = coVar.f35486y0;
            if (wjVar != null) {
                wjVar.g();
            }
            coVar.W8.a();
            this.f41176w3 = false;
            this.f41177x3 = measuredHeight;
        }
        coVar.R5 = false;
        vm vmVar = coVar.f35221c9;
        if (vmVar != null && vmVar.y()) {
            coVar.f35221c9.x();
        }
        coVar.p9();
        coVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        aq aqVar;
        co coVar = this.y3;
        le.b bVar = coVar.f35446uc;
        vm vmVar = coVar.f35221c9;
        vmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(vmVar.f21774g0);
            vmVar.f21803z = false;
        }
        if (motionEvent.getAction() == 0) {
            coVar.f35419sa = true;
        }
        if (coVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, coVar.N9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (aqVar = coVar.P9) != null && !aqVar.R) {
                if (aqVar.K != 1.0f) {
                    float f7 = coVar.N9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    coVar.Q9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final uj f40766b;

                        {
                            this.f40766b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    co coVar2 = this.f40766b.y3;
                                    coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    coVar2.f35473x0.invalidate();
                                    return;
                                case 1:
                                    co coVar3 = this.f40766b.y3;
                                    coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    coVar3.f35473x0.invalidate();
                                    return;
                                case 2:
                                    co coVar4 = this.f40766b.y3;
                                    coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    coVar4.f35473x0.invalidate();
                                    return;
                                default:
                                    co coVar5 = this.f40766b.y3;
                                    coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    coVar5.f35473x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29466f;
                    ofFloat.setInterpolator(prVar);
                    ofFloat.start();
                    final aq aqVar2 = coVar.P9;
                    dj djVar = new dj(this, 1);
                    AnimatorSet animatorSet = aqVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        aqVar2.J.cancel();
                    }
                    aqVar2.Y = djVar;
                    aqVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(aqVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    aq aqVar3 = aqVar2;
                                    aqVar3.getClass();
                                    aqVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    aqVar3.T.invalidate();
                                    View view = aqVar3.f34505a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    aq aqVar4 = aqVar2;
                                    aqVar4.getClass();
                                    aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = aqVar4.f34505a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(aqVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    aq aqVar3 = aqVar2;
                                    aqVar3.getClass();
                                    aqVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    aqVar3.T.invalidate();
                                    View view = aqVar3.f34505a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    aq aqVar4 = aqVar2;
                                    aqVar4.getClass();
                                    aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = aqVar4.f34505a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    aqVar2.J.addListener(new s0(aqVar2, 26));
                    aqVar2.J.playTogether(ofFloat2, ofFloat3);
                    aqVar2.J.setDuration(120L);
                    aqVar2.J.setInterpolator(prVar);
                    aqVar2.J.start();
                } else {
                    co.X1(coVar);
                }
            } else {
                aq aqVar3 = coVar.P9;
                if (aqVar3 != null && aqVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    aq aqVar4 = coVar.P9;
                    if (currentTimeMillis - aqVar4.U < 500 && aqVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        coVar.Q9 = animatorSet2;
                        if (coVar.P9 != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(coVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final uj f40766b;

                            {
                                this.f40766b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        co coVar2 = this.f40766b.y3;
                                        coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar2.f35473x0.invalidate();
                                        return;
                                    case 1:
                                        co coVar3 = this.f40766b.y3;
                                        coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar3.f35473x0.invalidate();
                                        return;
                                    case 2:
                                        co coVar4 = this.f40766b.y3;
                                        coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar4.f35473x0.invalidate();
                                        return;
                                    default:
                                        co coVar5 = this.f40766b.y3;
                                        coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar5.f35473x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.pr.f29466f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final uj f40766b;

                            {
                                this.f40766b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        co coVar2 = this.f40766b.y3;
                                        coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar2.f35473x0.invalidate();
                                        return;
                                    case 1:
                                        co coVar3 = this.f40766b.y3;
                                        coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar3.f35473x0.invalidate();
                                        return;
                                    case 2:
                                        co coVar4 = this.f40766b.y3;
                                        coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar4.f35473x0.invalidate();
                                        return;
                                    default:
                                        co coVar5 = this.f40766b.y3;
                                        coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar5.f35473x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(ki.o.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(coVar.N9, 0.0f);
                coVar.Q9 = ofFloat6;
                if (coVar.P9 != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final uj f40766b;

                    {
                        this.f40766b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                co coVar2 = this.f40766b.y3;
                                coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar2.f35473x0.invalidate();
                                return;
                            case 1:
                                co coVar3 = this.f40766b.y3;
                                coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar3.f35473x0.invalidate();
                                return;
                            case 2:
                                co coVar4 = this.f40766b.y3;
                                coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar4.f35473x0.invalidate();
                                return;
                            default:
                                co coVar5 = this.f40766b.y3;
                                coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar5.f35473x0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(ki.o.V);
                ofFloat6.start();
            }
        }
        if (!this.X1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (!kVar.s() && !coVar.A9()) {
                x1(motionEvent);
                if (coVar.f35258f9 || onTouchEvent) {
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
        if (this.y3.Q8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.y3.f35233d9 != null) {
            x1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f41176w3) {
            return;
        }
        ih.a aVar = this.y3.Qb;
        if (aVar.f12300b != 0) {
            int childCount = aVar.f12299a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f12299a.getChildAt(i10).forceLayout();
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
            co coVar = this.y3;
            coVar.o9();
            coVar.r9();
        }
    }

    public final void v1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uj.v1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void w1(Canvas canvas, RectF rectF) {
        float f7;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.Z2;
        int size = arrayList2.size();
        co coVar = this.y3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i10);
                if (!co.d2(coVar, t1Var, rectF)) {
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
        ArrayList arrayList3 = this.f41155a3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i11);
                if (!co.d2(coVar, t1Var2, rectF)) {
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
        ArrayList arrayList4 = this.f41156b3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i12);
                if (co.d2(coVar, t1Var3, rectF)) {
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
                    if (t1Var3.getTransitionParams().f22798v0) {
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
        ArrayList arrayList5 = this.f41157c3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i13);
                if (!co.d2(coVar, t1Var4, rectF)) {
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
                    if (!z10 && t1Var4.getTransitionParams().f22798v0) {
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

    public final void x1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        co coVar = this.y3;
        if (motionEvent != null) {
            coVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !coVar.f35258f9 && !coVar.f35246e9 && coVar.f35233d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.t1) {
                    if (coVar.f35233d9 != null) {
                        co.V1(coVar, 0.0f);
                    }
                    coVar.f35233d9 = (org.telegram.ui.Cells.t1) pressedChildView;
                    MessageObject T1 = co.T1(coVar);
                    boolean F6 = coVar.F6(T1);
                    int i10 = coVar.R3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && coVar.f35228d4 == coVar.getUserConfig().getClientUserId())) && (((arrayList = coVar.f35188a4) == null || !arrayList.contains(T1)) && ((coVar.E8(T1) != 1 || (T1.getDialogId() != coVar.L6 && !T1.needDrawBluredPreview())) && ((coVar.h != null || T1.getId() >= 0) && (((chat2 = coVar.f35237e) == null || !ChatObject.isForum(chat2) || F6) && !coVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f41161g3 = motionEvent.getPointerId(0);
                        coVar.f35246e9 = true;
                        this.f41159e3 = (int) motionEvent.getX();
                        this.f41160f3 = (int) motionEvent.getY();
                        return;
                    }
                    co.V1(coVar, 0.0f);
                    coVar.f35233d9 = null;
                    return;
                }
                return;
            }
        }
        if (coVar.f35233d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f41161g3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f41159e3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f41160f3);
            if (getScrollState() == 0 && coVar.f35246e9 && !coVar.f35258f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                coVar.f35233d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                coVar.f35498z0.R = false;
                coVar.f35246e9 = false;
                coVar.f35258f9 = true;
                this.f41159e3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (coVar.f35258f9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f41164k3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f41164k3 = true;
                    }
                } else {
                    this.f41164k3 = false;
                }
                float f11 = max;
                co.V1(coVar, f11);
                MessageObject T12 = co.T1(coVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    coVar.Mc(false, false);
                }
                org.telegram.ui.Cells.t1 t1Var = coVar.f35233d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
                    y1(t1Var, f11);
                }
                invalidate();
            }
        } else if (coVar.f35233d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f41161g3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.t1 t1Var2 = coVar.f35233d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var2)) {
                    f10 = t1Var2.E2(false);
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = co.T1(coVar);
                    boolean F62 = coVar.F6(T13);
                    rk rkVar = coVar.O0;
                    if ((rkVar != null && rkVar.getVisibility() == 0 && ((!coVar.I0 || !F62) && !T13.wasJustSent)) || ((chat = coVar.f35237e) != null && ((ChatObject.isNotInChat(chat) && !coVar.F9()) || ((ChatObject.isChannel(coVar.f35237e) && !ChatObject.canPost(coVar.f35237e) && !coVar.f35237e.megagroup) || !ChatObject.canSendMessages(coVar.f35237e))))) {
                        if (T13.getGroupId() != 0 && (y82 = coVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        coVar.f35352n5 = T13;
                        Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
                        e7.putBoolean("quote", true);
                        e7.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != coVar.a() && peerDialogId != coVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e7.putLong("reply_to_author", peerDialogId);
                        }
                        e7.putInt("messagesCount", 1);
                        e7.putBoolean("canSelectTopics", true);
                        uy uyVar = new uy(e7);
                        uyVar.C2 = coVar;
                        coVar.presentFragment(uyVar);
                    } else {
                        coVar.Bb(co.T1(coVar));
                    }
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = coVar.f35233d9;
            if (com.google.android.gms.internal.vision.e2.u(t1Var3)) {
                f7 = t1Var3.getSlidingOffsetX();
            } else {
                f7 = 0.0f;
            }
            this.j3 = f7;
            if (f7 == 0.0f) {
                coVar.f35233d9 = null;
            }
            this.f41162h3 = System.currentTimeMillis();
            this.f41163i3 = 0.0f;
            invalidate();
            coVar.f35246e9 = false;
            coVar.f35258f9 = false;
            coVar.f35498z0.R = true;
        }
    }

    public final void y1(org.telegram.ui.Cells.t1 t1Var, float f7) {
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
