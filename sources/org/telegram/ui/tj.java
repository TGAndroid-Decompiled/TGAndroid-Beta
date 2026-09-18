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
public final class tj extends vm {
    public int Y2;
    public final ArrayList Z2;
    public final ArrayList f37744a3;
    public final ArrayList f37745b3;
    public final ArrayList f37746c3;
    public final ArrayList f37747d3;
    public int f37748e3;
    public int f37749f3;
    public int f37750g3;
    public long f37751h3;
    public float f37752i3;
    public float j3;
    public boolean f37753k3;
    public final float f37754l3;
    public final Paint f37755m3;
    public final Paint f37756n3;
    public final o1.j f37757o3;
    public final o1.k f37758p3;
    public final o1.j f37759q3;
    public final o1.k f37760r3;
    public final o1.j f37761s3;
    public final o1.k f37762t3;
    public boolean f37763u3;
    public final Path f37764v3;
    public boolean f37765w3;
    public int f37766x3;
    public final zn y3;

    public tj(zn znVar, Context context, xn xnVar) {
        super(znVar, context, xnVar);
        this.y3 = znVar;
        this.Z2 = new ArrayList();
        this.f37744a3 = new ArrayList();
        this.f37745b3 = new ArrayList();
        this.f37746c3 = new ArrayList();
        this.f37747d3 = new ArrayList(10);
        this.f37754l3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f37755m3 = paint;
        Paint paint2 = new Paint(1);
        this.f37756n3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f37757o3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f15484g = 2000.0f;
        kVar.f15490u = org.telegram.ui.Cells.c1.j(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final tj f37077b;

            {
                this.f37077b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f37077b.invalidate();
                        return;
                    case 1:
                        this.f37077b.invalidate();
                        return;
                    default:
                        this.f37077b.invalidate();
                        return;
                }
            }
        });
        this.f37758p3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f37759q3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f15490u = org.telegram.ui.Cells.c1.j(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final tj f37077b;

            {
                this.f37077b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f37077b.invalidate();
                        return;
                    case 1:
                        this.f37077b.invalidate();
                        return;
                    default:
                        this.f37077b.invalidate();
                        return;
                }
            }
        });
        this.f37760r3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f37761s3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f15490u = org.telegram.ui.Cells.c1.j(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final tj f37077b;

            {
                this.f37077b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f37077b.invalidate();
                        return;
                    case 1:
                        this.f37077b.invalidate();
                        return;
                    default:
                        this.f37077b.invalidate();
                        return;
                }
            }
        });
        this.f37762t3 = kVar3;
        this.f37764v3 = new Path();
        this.f37766x3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void A1(org.telegram.ui.Cells.u1 u1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != u1Var && (childAt instanceof org.telegram.ui.Cells.u1)) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    u1Var2.setSlidingOffset(f7);
                    u1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override
    public final boolean G0(View view) {
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
        zn znVar = this.y3;
        znVar.f40457u8 = null;
        canvas.save();
        if (znVar.V9 != null && znVar.R9) {
            boolean z10 = znVar.S9;
        }
        this.G1.setEmpty();
        if (znVar.N9 != 0.0f) {
            int save = canvas.save();
            if (znVar.U9 != 0.0f) {
                f7 = (znVar.f40488x0.getMeasuredHeight() - znVar.N9) * znVar.U9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-znVar.N9) - f7;
            znVar.f40510ya = f10;
            canvas.translate(0.0f, f10);
            x1(canvas, null);
            super.dispatchDraw(canvas);
            y1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            x1(canvas, null);
            super.dispatchDraw(canvas);
            y1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void i1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.i1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject messageObject = u1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = u1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.u1)) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            u1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tj.onDraw(android.graphics.Canvas):void");
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
        uh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.y3;
        sm smVar = znVar.f40236c9;
        smVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(smVar.f20130g0);
            smVar.f20159z = false;
        }
        if (this.X1 || ((iVar = znVar.X9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.s() && !znVar.A9()) {
            z1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.Y2;
        int i15 = i12 - i10;
        zn znVar = this.y3;
        if (i14 != i15) {
            if (i14 != 0) {
                znVar.h9(false);
            }
            this.Y2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f37766x3 != measuredHeight) {
            this.f37765w3 = true;
            vj vjVar = znVar.f40501y0;
            if (vjVar != null) {
                vjVar.g();
            }
            znVar.W8.a();
            this.f37765w3 = false;
            this.f37766x3 = measuredHeight;
        }
        znVar.R5 = false;
        sm smVar = znVar.f40236c9;
        if (smVar != null && smVar.y()) {
            znVar.f40236c9.x();
        }
        znVar.p9();
        znVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        xp xpVar;
        zn znVar = this.y3;
        le.b bVar = znVar.f40448tc;
        sm smVar = znVar.f40236c9;
        smVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(smVar.f20130g0);
            smVar.f20159z = false;
        }
        if (motionEvent.getAction() == 0) {
            znVar.f40434sa = true;
        }
        if (znVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, znVar.N9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (xpVar = znVar.P9) != null && !xpVar.R) {
                if (xpVar.K != 1.0f) {
                    float f7 = znVar.N9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    znVar.Q9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final tj f37343b;

                        {
                            this.f37343b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    zn znVar2 = this.f37343b.y3;
                                    znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar2.f40488x0.invalidate();
                                    return;
                                case 1:
                                    zn znVar3 = this.f37343b.y3;
                                    znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar3.f40488x0.invalidate();
                                    return;
                                case 2:
                                    zn znVar4 = this.f37343b.y3;
                                    znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar4.f40488x0.invalidate();
                                    return;
                                default:
                                    zn znVar5 = this.f37343b.y3;
                                    znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar5.f40488x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27715f;
                    ofFloat.setInterpolator(qrVar);
                    ofFloat.start();
                    final xp xpVar2 = znVar.P9;
                    cj cjVar = new cj(this, 1);
                    AnimatorSet animatorSet = xpVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        xpVar2.J.cancel();
                    }
                    xpVar2.Y = cjVar;
                    xpVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xpVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xp xpVar3 = xpVar2;
                                    xpVar3.getClass();
                                    xpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xpVar3.T.invalidate();
                                    View view = xpVar3.f39580a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xp xpVar4 = xpVar2;
                                    xpVar4.getClass();
                                    xpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = xpVar4.f39580a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(xpVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xp xpVar3 = xpVar2;
                                    xpVar3.getClass();
                                    xpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xpVar3.T.invalidate();
                                    View view = xpVar3.f39580a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xp xpVar4 = xpVar2;
                                    xpVar4.getClass();
                                    xpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = xpVar4.f39580a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    xpVar2.J.addListener(new t4(xpVar2, 23));
                    xpVar2.J.playTogether(ofFloat2, ofFloat3);
                    xpVar2.J.setDuration(120L);
                    xpVar2.J.setInterpolator(qrVar);
                    xpVar2.J.start();
                } else {
                    zn.X1(znVar);
                }
            } else {
                xp xpVar3 = znVar.P9;
                if (xpVar3 != null && xpVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    xp xpVar4 = znVar.P9;
                    if (currentTimeMillis - xpVar4.U < 500 && xpVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        znVar.Q9 = animatorSet2;
                        if (znVar.P9 != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(znVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final tj f37343b;

                            {
                                this.f37343b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        zn znVar2 = this.f37343b.y3;
                                        znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.f40488x0.invalidate();
                                        return;
                                    case 1:
                                        zn znVar3 = this.f37343b.y3;
                                        znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.f40488x0.invalidate();
                                        return;
                                    case 2:
                                        zn znVar4 = this.f37343b.y3;
                                        znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.f40488x0.invalidate();
                                        return;
                                    default:
                                        zn znVar5 = this.f37343b.y3;
                                        znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.f40488x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.qr.f27715f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final tj f37343b;

                            {
                                this.f37343b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        zn znVar2 = this.f37343b.y3;
                                        znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.f40488x0.invalidate();
                                        return;
                                    case 1:
                                        zn znVar3 = this.f37343b.y3;
                                        znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.f40488x0.invalidate();
                                        return;
                                    case 2:
                                        zn znVar4 = this.f37343b.y3;
                                        znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.f40488x0.invalidate();
                                        return;
                                    default:
                                        zn znVar5 = this.f37343b.y3;
                                        znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.f40488x0.invalidate();
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
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(znVar.N9, 0.0f);
                znVar.Q9 = ofFloat6;
                if (znVar.P9 != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final tj f37343b;

                    {
                        this.f37343b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                zn znVar2 = this.f37343b.y3;
                                znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar2.f40488x0.invalidate();
                                return;
                            case 1:
                                zn znVar3 = this.f37343b.y3;
                                znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar3.f40488x0.invalidate();
                                return;
                            case 2:
                                zn znVar4 = this.f37343b.y3;
                                znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar4.f40488x0.invalidate();
                                return;
                            default:
                                zn znVar5 = this.f37343b.y3;
                                znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar5.f40488x0.invalidate();
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
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
                z1(motionEvent);
                if (znVar.f40272f9 || onTouchEvent) {
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
        if (this.y3.f40248d9 != null) {
            z1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f37765w3) {
            return;
        }
        hh.a aVar = this.y3.Pb;
        if (aVar.f10498b != 0) {
            int childCount = aVar.f10497a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f10497a.getChildAt(i10).forceLayout();
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
            zn znVar = this.y3;
            znVar.o9();
            znVar.r9();
        }
    }

    public final void x1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tj.x1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void y1(Canvas canvas, RectF rectF) {
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
        zn znVar = this.y3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) arrayList2.get(i10);
                if (!zn.d2(znVar, u1Var, rectF)) {
                    canvas.save();
                    canvas.translate(u1Var.E2(false) + u1Var.getLeft(), u1Var.getY() + u1Var.getPaddingTop());
                    if (u1Var.a()) {
                        f13 = u1Var.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    u1Var.m2(f13, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f37744a3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) arrayList3.get(i11);
                if (!zn.d2(znVar, u1Var2, rectF)) {
                    float E2 = u1Var2.E2(false) + u1Var2.getLeft();
                    float y3 = u1Var2.getY() + u1Var2.getPaddingTop();
                    if (u1Var2.a()) {
                        f12 = u1Var2.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(E2, y3);
                    u1Var2.setInvalidatesParent(true);
                    u1Var2.W1(canvas, f12);
                    u1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f37745b3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) arrayList4.get(i12);
                if (zn.d2(znVar, u1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (u1Var3.getCurrentPosition() != null && (u1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (u1Var3.a()) {
                        f11 = u1Var3.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float E22 = u1Var3.E2(z13) + u1Var3.getLeft();
                    float y10 = u1Var3.getY() + u1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = u1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = u1Var3.E2(z12);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f14 = transitionParams.left + E23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f15 = transitionParams.top + transitionParams.offsetTop;
                            float f16 = transitionParams.right + E23 + transitionParams.offsetRight;
                            float f17 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f15 += u1Var3.getTranslationY();
                                f17 += u1Var3.getTranslationY();
                            }
                            canvas.clipRect(f14 + AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(8.0f), f16 - AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (u1Var3.getTransitionParams().f21130v0) {
                        canvas.translate(E22, y10);
                        u1Var3.setInvalidatesParent(true);
                        u1Var3.I1(f11, canvas, z11);
                        u1Var3.setInvalidatesParent(false);
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
        ArrayList arrayList5 = this.f37746c3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) arrayList5.get(i13);
                if (!zn.d2(znVar, u1Var4, rectF)) {
                    if (u1Var4.getCurrentPosition() != null && (u1Var4.getCurrentPosition().flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (u1Var4.a()) {
                        f10 = u1Var4.getAlpha();
                    } else {
                        f10 = 1.0f;
                    }
                    float E24 = u1Var4.E2(false) + u1Var4.getLeft();
                    float y11 = u1Var4.getY() + u1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = u1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = u1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f18 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f19 = transitionParams2.top + transitionParams2.offsetTop;
                        float f20 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f21 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f19 += u1Var4.getTranslationY();
                            f21 += u1Var4.getTranslationY();
                        }
                        canvas.clipRect(f18 + AndroidUtilities.dp(f7), f19 + AndroidUtilities.dp(f7), f20 - AndroidUtilities.dp(f7), f21 - AndroidUtilities.dp(f7));
                    }
                    if (!z10 && u1Var4.getTransitionParams().f21130v0) {
                        canvas.translate(E24, y11);
                        u1Var4.setInvalidatesParent(true);
                        u1Var4.d2(canvas, f10, null);
                        u1Var4.N1(canvas, f10);
                        u1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void z1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        zn znVar = this.y3;
        if (motionEvent != null) {
            znVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !znVar.f40272f9 && !znVar.f40260e9 && znVar.f40248d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.u1) {
                    if (znVar.f40248d9 != null) {
                        zn.V1(znVar, 0.0f);
                    }
                    znVar.f40248d9 = (org.telegram.ui.Cells.u1) pressedChildView;
                    MessageObject T1 = zn.T1(znVar);
                    boolean F6 = znVar.F6(T1);
                    int i10 = znVar.R3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && znVar.f40243d4 == znVar.getUserConfig().getClientUserId())) && (((arrayList = znVar.f40203a4) == null || !arrayList.contains(T1)) && ((znVar.E8(T1) != 1 || (T1.getDialogId() != znVar.L6 && !T1.needDrawBluredPreview())) && ((znVar.h != null || T1.getId() >= 0) && (((chat2 = znVar.e) == null || !ChatObject.isForum(chat2) || F6) && !znVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f37750g3 = motionEvent.getPointerId(0);
                        znVar.f40260e9 = true;
                        this.f37748e3 = (int) motionEvent.getX();
                        this.f37749f3 = (int) motionEvent.getY();
                        return;
                    }
                    zn.V1(znVar, 0.0f);
                    znVar.f40248d9 = null;
                    return;
                }
                return;
            }
        }
        if (znVar.f40248d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f37750g3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f37748e3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f37749f3);
            if (getScrollState() == 0 && znVar.f40260e9 && !znVar.f40272f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                znVar.f40248d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                znVar.f40513z0.R = false;
                znVar.f40260e9 = false;
                znVar.f40272f9 = true;
                this.f37748e3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (znVar.f40272f9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f37753k3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f37753k3 = true;
                    }
                } else {
                    this.f37753k3 = false;
                }
                float f11 = max;
                zn.V1(znVar, f11);
                MessageObject T12 = zn.T1(znVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    znVar.Mc(false, false);
                }
                org.telegram.ui.Cells.u1 u1Var = znVar.f40248d9;
                if (com.google.android.gms.internal.vision.e2.u(u1Var)) {
                    A1(u1Var, f11);
                }
                invalidate();
            }
        } else if (znVar.f40248d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f37750g3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.u1 u1Var2 = znVar.f40248d9;
                if (com.google.android.gms.internal.vision.e2.u(u1Var2)) {
                    f10 = u1Var2.E2(false);
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = zn.T1(znVar);
                    boolean F62 = znVar.F6(T13);
                    qk qkVar = znVar.O0;
                    if ((qkVar != null && qkVar.getVisibility() == 0 && ((!znVar.I0 || !F62) && !T13.wasJustSent)) || ((chat = znVar.e) != null && ((ChatObject.isNotInChat(chat) && !znVar.F9()) || ((ChatObject.isChannel(znVar.e) && !ChatObject.canPost(znVar.e) && !znVar.e.megagroup) || !ChatObject.canSendMessages(znVar.e))))) {
                        if (T13.getGroupId() != 0 && (y82 = znVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        znVar.f40367n5 = T13;
                        Bundle d = org.telegram.messenger.wh.d(3, "onlySelect", "dialogsType", true);
                        d.putBoolean("quote", true);
                        d.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && i11 > 0) {
                            d.putLong("reply_to_author", peerDialogId);
                        }
                        d.putInt("messagesCount", 1);
                        d.putBoolean("canSelectTopics", true);
                        uy uyVar = new uy(d);
                        uyVar.C2 = znVar;
                        znVar.presentFragment(uyVar);
                    } else {
                        znVar.Bb(zn.T1(znVar));
                    }
                }
            }
            org.telegram.ui.Cells.u1 u1Var3 = znVar.f40248d9;
            if (com.google.android.gms.internal.vision.e2.u(u1Var3)) {
                f7 = u1Var3.getSlidingOffsetX();
            } else {
                f7 = 0.0f;
            }
            this.j3 = f7;
            if (f7 == 0.0f) {
                znVar.f40248d9 = null;
            }
            this.f37751h3 = System.currentTimeMillis();
            this.f37752i3 = 0.0f;
            invalidate();
            znVar.f40260e9 = false;
            znVar.f40272f9 = false;
            znVar.f40513z0.R = true;
        }
    }
}
