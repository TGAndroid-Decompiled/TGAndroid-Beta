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
public final class wj extends ai.g7 {
    public int X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f43794a3;
    public final ArrayList f43795b3;
    public final ArrayList f43796c3;
    public int f43797d3;
    public int f43798e3;
    public int f43799f3;
    public long f43800g3;
    public float f43801h3;
    public float f43802i3;
    public boolean j3;
    public final float f43803k3;
    public final Paint f43804l3;
    public final Paint f43805m3;
    public final o1.j f43806n3;
    public final o1.k f43807o3;
    public final o1.j f43808p3;
    public final o1.k f43809q3;
    public final o1.j f43810r3;
    public final o1.k f43811s3;
    public boolean f43812t3;
    public final Path f43813u3;
    public boolean f43814v3;
    public int f43815w3;
    public final zn f43816x3;

    public wj(zn znVar, Context context, xn xnVar) {
        super(znVar, context, xnVar, 1);
        this.f43816x3 = znVar;
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f43794a3 = new ArrayList();
        this.f43795b3 = new ArrayList();
        this.f43796c3 = new ArrayList(10);
        this.f43803k3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f43804l3 = paint;
        Paint paint2 = new Paint(1);
        this.f43805m3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f43806n3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f16982g = 2000.0f;
        kVar.f16988u = org.telegram.ui.Cells.c1.j(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final wj f43070b;

            {
                this.f43070b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f43070b.invalidate();
                        return;
                    case 1:
                        this.f43070b.invalidate();
                        return;
                    default:
                        this.f43070b.invalidate();
                        return;
                }
            }
        });
        this.f43807o3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f43808p3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f16988u = org.telegram.ui.Cells.c1.j(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final wj f43070b;

            {
                this.f43070b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f43070b.invalidate();
                        return;
                    case 1:
                        this.f43070b.invalidate();
                        return;
                    default:
                        this.f43070b.invalidate();
                        return;
                }
            }
        });
        this.f43809q3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f43810r3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f16988u = org.telegram.ui.Cells.c1.j(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final wj f43070b;

            {
                this.f43070b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f43070b.invalidate();
                        return;
                    case 1:
                        this.f43070b.invalidate();
                        return;
                    default:
                        this.f43070b.invalidate();
                        return;
                }
            }
        });
        this.f43811s3 = kVar3;
        this.f43813u3 = new Path();
        this.f43815w3 = 0;
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
    public final boolean F0(View view) {
        if (view.getVisibility() != 4 && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.f43816x3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        zn znVar = this.f43816x3;
        znVar.f44957u8 = null;
        canvas.save();
        if (znVar.V9 != null && znVar.R9) {
            boolean z10 = znVar.S9;
        }
        this.E1.setEmpty();
        if (znVar.N9 != 0.0f) {
            int save = canvas.save();
            if (znVar.U9 != 0.0f) {
                f7 = (znVar.f44989x0.getMeasuredHeight() - znVar.N9) * znVar.U9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-znVar.N9) - f7;
            znVar.f45023za = f10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void h1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f7, f10, z10);
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
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f43816x3.h == null) {
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
        zn znVar = this.f43816x3;
        tm tmVar = znVar.f44736c9;
        tmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(tmVar.f21854f0);
            tmVar.f21880z = false;
        }
        if (this.V1 || ((iVar = znVar.X9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
        if (!kVar.t() && !znVar.F9()) {
            z1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.X2;
        int i15 = i12 - i10;
        zn znVar = this.f43816x3;
        if (i14 != i15) {
            if (i14 != 0) {
                znVar.m9(false);
            }
            this.X2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f43815w3 != measuredHeight) {
            this.f43814v3 = true;
            yj yjVar = znVar.f45002y0;
            if (yjVar != null) {
                yjVar.g();
            }
            znVar.W8.a();
            this.f43814v3 = false;
            this.f43815w3 = measuredHeight;
        }
        znVar.R5 = false;
        tm tmVar = znVar.f44736c9;
        if (tmVar != null && tmVar.x()) {
            znVar.f44736c9.w();
        }
        znVar.u9();
        znVar.I9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        xp xpVar;
        zn znVar = this.f43816x3;
        me.b bVar = znVar.f44961uc;
        tm tmVar = znVar.f44736c9;
        tmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(tmVar.f21854f0);
            tmVar.f21880z = false;
        }
        if (motionEvent.getAction() == 0) {
            znVar.f44934sa = true;
        }
        if (znVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, znVar.N9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (xpVar = znVar.P9) != null && !xpVar.R) {
                if (xpVar.K != 1.0f) {
                    float f7 = znVar.N9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    znVar.Q9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final wj f42626b;

                        {
                            this.f42626b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    zn znVar2 = this.f42626b.f43816x3;
                                    znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar2.f44989x0.invalidate();
                                    return;
                                case 1:
                                    zn znVar3 = this.f42626b.f43816x3;
                                    znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar3.f44989x0.invalidate();
                                    return;
                                case 2:
                                    zn znVar4 = this.f42626b.f43816x3;
                                    znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar4.f44989x0.invalidate();
                                    return;
                                default:
                                    zn znVar5 = this.f42626b.f43816x3;
                                    znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar5.f44989x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27451f;
                    ofFloat.setInterpolator(isVar);
                    ofFloat.start();
                    final xp xpVar2 = znVar.P9;
                    cj cjVar = new cj(this, 2);
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
                                    View view = xpVar3.f44130a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xp xpVar4 = xpVar2;
                                    xpVar4.getClass();
                                    xpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = xpVar4.f44130a0;
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
                                    View view = xpVar3.f44130a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xp xpVar4 = xpVar2;
                                    xpVar4.getClass();
                                    xpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = xpVar4.f44130a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    xpVar2.J.addListener(new s4(xpVar2, 23));
                    xpVar2.J.playTogether(ofFloat2, ofFloat3);
                    xpVar2.J.setDuration(120L);
                    xpVar2.J.setInterpolator(isVar);
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
                            public final wj f42626b;

                            {
                                this.f42626b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        zn znVar2 = this.f42626b.f43816x3;
                                        znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.f44989x0.invalidate();
                                        return;
                                    case 1:
                                        zn znVar3 = this.f42626b.f43816x3;
                                        znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.f44989x0.invalidate();
                                        return;
                                    case 2:
                                        zn znVar4 = this.f42626b.f43816x3;
                                        znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.f44989x0.invalidate();
                                        return;
                                    default:
                                        zn znVar5 = this.f42626b.f43816x3;
                                        znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.f44989x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.is.f27451f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final wj f42626b;

                            {
                                this.f42626b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        zn znVar2 = this.f42626b.f43816x3;
                                        znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.f44989x0.invalidate();
                                        return;
                                    case 1:
                                        zn znVar3 = this.f42626b.f43816x3;
                                        znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.f44989x0.invalidate();
                                        return;
                                    case 2:
                                        zn znVar4 = this.f42626b.f43816x3;
                                        znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.f44989x0.invalidate();
                                        return;
                                    default:
                                        zn znVar5 = this.f42626b.f43816x3;
                                        znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.f44989x0.invalidate();
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
                    public final wj f42626b;

                    {
                        this.f42626b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                zn znVar2 = this.f42626b.f43816x3;
                                znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar2.f44989x0.invalidate();
                                return;
                            case 1:
                                zn znVar3 = this.f42626b.f43816x3;
                                znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar3.f44989x0.invalidate();
                                return;
                            case 2:
                                zn znVar4 = this.f42626b.f43816x3;
                                znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar4.f44989x0.invalidate();
                                return;
                            default:
                                zn znVar5 = this.f42626b.f43816x3;
                                znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar5.f44989x0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(ji.n.V);
                ofFloat6.start();
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
            if (!kVar.t() && !znVar.F9()) {
                z1(motionEvent);
                if (znVar.f44773f9 || onTouchEvent) {
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
        if (this.f43816x3.Q8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.f43816x3.f44748d9 != null) {
            z1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f43814v3) {
            return;
        }
        hh.a aVar = this.f43816x3.Qb;
        if (aVar.f11471b != 0) {
            int childCount = aVar.f11470a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f11470a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(s4.n0 n0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(n0Var);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            zn znVar = this.f43816x3;
            znVar.t9();
            znVar.w9();
        }
    }

    public final void x1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.x1(android.graphics.Canvas, android.graphics.RectF):void");
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
        ArrayList arrayList2 = this.Y2;
        int size = arrayList2.size();
        zn znVar = this.f43816x3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) arrayList2.get(i10);
                if (!zn.e2(znVar, u1Var, rectF)) {
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
        ArrayList arrayList3 = this.Z2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) arrayList3.get(i11);
                if (!zn.e2(znVar, u1Var2, rectF)) {
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
        ArrayList arrayList4 = this.f43794a3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) arrayList4.get(i12);
                if (zn.e2(znVar, u1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (u1Var3.getCurrentPosition() != null && (u1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
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
                    if (u1Var3.getTransitionParams().f23007v0) {
                        canvas.translate(E22, y10);
                        u1Var3.setInvalidatesParent(true);
                        u1Var3.I1(f11, canvas, z11);
                        u1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z12 = true;
                z13 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.f43795b3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) arrayList5.get(i13);
                if (!zn.e2(znVar, u1Var4, rectF)) {
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
                    if (!z10 && u1Var4.getTransitionParams().f23007v0) {
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
        MessageObject.GroupedMessages D8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        zn znVar = this.f43816x3;
        if (motionEvent != null) {
            znVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !znVar.f44773f9 && !znVar.f44761e9 && znVar.f44748d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.m2) znVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.u1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) pressedChildView;
                        float x10 = motionEvent.getX() - pressedChildView.getX();
                        float y3 = motionEvent.getY() - pressedChildView.getY();
                        if (w0Var.M()) {
                            org.telegram.ui.Wallet.f3 f3Var = w0Var.I0;
                            float f11 = (x10 - w0Var.K0) - (w0Var.f23599j0 / 2.0f);
                            float paddingTop = (y3 - w0Var.L0) - w0Var.getPaddingTop();
                            org.telegram.ui.Wallet.e3 e3Var = f3Var.f34918m;
                            if (e3Var != null && e3Var.h && f3Var.f34933w.contains((int) f11, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (znVar.f44748d9 != null) {
                    zn.W1(znVar, 0.0f);
                }
                znVar.f44748d9 = pressedChildView;
                MessageObject T1 = zn.T1(znVar);
                boolean I6 = znVar.I6(T1);
                int i10 = znVar.R3;
                if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && znVar.f44743d4 == znVar.getUserConfig().getClientUserId())) && (((arrayList = znVar.f44703a4) == null || !arrayList.contains(T1)) && ((znVar.J8(T1) != 1 || (T1.getDialogId() != znVar.L6 && !T1.needDrawBluredPreview())) && ((znVar.h != null || T1.getId() >= 0) && (((chat2 = znVar.f44752e) == null || !ChatObject.isForum(chat2) || I6) && !znVar.g9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                    this.f43799f3 = motionEvent.getPointerId(0);
                    znVar.f44761e9 = true;
                    this.f43797d3 = (int) motionEvent.getX();
                    this.f43798e3 = (int) motionEvent.getY();
                    return;
                }
                zn.W1(znVar, 0.0f);
                znVar.f44748d9 = null;
                return;
            }
        }
        if (znVar.f44748d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f43799f3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f43797d3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f43798e3);
            if (getScrollState() == 0 && znVar.f44761e9 && !znVar.f44773f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                znVar.f44748d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                znVar.f45013z0.R = false;
                znVar.f44761e9 = false;
                znVar.f44773f9 = true;
                this.f43797d3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (znVar.f44773f9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.j3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.j3 = true;
                    }
                } else {
                    this.j3 = false;
                }
                float f12 = max;
                zn.W1(znVar, f12);
                MessageObject T12 = zn.T1(znVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    znVar.Qc(false, false);
                }
                View view = znVar.f44748d9;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    A1((org.telegram.ui.Cells.u1) view, f12);
                }
                invalidate();
            }
        } else if (znVar.f44748d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f43799f3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = znVar.f44748d9;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    f10 = ((org.telegram.ui.Cells.u1) view2).E2(false);
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    f10 = ((org.telegram.ui.Cells.w0) view2).getWalletSlidingOffset();
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = zn.T1(znVar);
                    boolean I62 = znVar.I6(T13);
                    sk skVar = znVar.O0;
                    if ((skVar != null && skVar.getVisibility() == 0 && ((!znVar.I0 || !I62) && !T13.wasJustSent)) || ((chat = znVar.f44752e) != null && ((ChatObject.isNotInChat(chat) && !znVar.K9()) || ((ChatObject.isChannel(znVar.f44752e) && !ChatObject.canPost(znVar.f44752e) && !znVar.f44752e.megagroup) || !ChatObject.canSendMessages(znVar.f44752e))))) {
                        if (T13.getGroupId() != 0 && (D8 = znVar.D8(T13.getGroupId())) != null && (messageObject = D8.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        znVar.f44867n5 = T13;
                        Bundle d = org.telegram.messenger.ai.d(3, "onlySelect", "dialogsType", true);
                        d.putBoolean("quote", true);
                        d.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && i11 > 0) {
                            d.putLong("reply_to_author", peerDialogId);
                        }
                        d.putInt("messagesCount", 1);
                        d.putBoolean("canSelectTopics", true);
                        sy syVar = new sy(d);
                        syVar.C2 = znVar;
                        znVar.presentFragment(syVar);
                    } else {
                        znVar.Fb(zn.T1(znVar));
                    }
                }
            }
            View view3 = znVar.f44748d9;
            if (view3 instanceof org.telegram.ui.Cells.u1) {
                f7 = ((org.telegram.ui.Cells.u1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.w0) {
                f7 = ((org.telegram.ui.Cells.w0) view3).getWalletSlidingOffset();
            } else {
                f7 = 0.0f;
            }
            this.f43802i3 = f7;
            if (f7 == 0.0f) {
                znVar.f44748d9 = null;
            }
            this.f43800g3 = System.currentTimeMillis();
            this.f43801h3 = 0.0f;
            invalidate();
            znVar.f44761e9 = false;
            znVar.f44773f9 = false;
            znVar.f45013z0.R = true;
        }
    }
}
