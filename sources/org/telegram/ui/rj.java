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
    public final ArrayList f37343a3;
    public final ArrayList f37344b3;
    public final ArrayList f37345c3;
    public final ArrayList f37346d3;
    public final ArrayList f37347e3;
    public int f37348f3;
    public int f37349g3;
    public int f37350h3;
    public long f37351i3;
    public float j3;
    public float f37352k3;
    public boolean f37353l3;
    public final float f37354m3;
    public final Paint f37355n3;
    public final Paint f37356o3;
    public final o1.j f37357p3;
    public final o1.k f37358q3;
    public final o1.j f37359r3;
    public final o1.k f37360s3;
    public final o1.j f37361t3;
    public final o1.k f37362u3;
    public boolean f37363v3;
    public final Path f37364w3;
    public boolean f37365x3;
    public int y3;
    public final wn f37366z3;

    public rj(wn wnVar, Context context, un unVar) {
        super(wnVar, context, unVar, 1);
        this.f37366z3 = wnVar;
        this.f37343a3 = new ArrayList();
        this.f37344b3 = new ArrayList();
        this.f37345c3 = new ArrayList();
        this.f37346d3 = new ArrayList();
        this.f37347e3 = new ArrayList(10);
        this.f37354m3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f37355n3 = paint;
        Paint paint2 = new Paint(1);
        this.f37356o3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f37357p3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f15527g = 2000.0f;
        kVar.f15533u = org.telegram.ui.Cells.c1.l(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final rj f36566b;

            {
                this.f36566b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f36566b.invalidate();
                        return;
                    case 1:
                        this.f36566b.invalidate();
                        return;
                    default:
                        this.f36566b.invalidate();
                        return;
                }
            }
        });
        this.f37358q3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f37359r3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f15533u = org.telegram.ui.Cells.c1.l(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final rj f36566b;

            {
                this.f36566b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f36566b.invalidate();
                        return;
                    case 1:
                        this.f36566b.invalidate();
                        return;
                    default:
                        this.f36566b.invalidate();
                        return;
                }
            }
        });
        this.f37360s3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f37361t3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f15533u = org.telegram.ui.Cells.c1.l(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final rj f36566b;

            {
                this.f36566b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f36566b.invalidate();
                        return;
                    case 1:
                        this.f36566b.invalidate();
                        return;
                    default:
                        this.f36566b.invalidate();
                        return;
                }
            }
        });
        this.f37362u3 = kVar3;
        this.f37364w3 = new Path();
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
        if (this.f37366z3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        wn wnVar = this.f37366z3;
        wnVar.f39664u8 = null;
        canvas.save();
        if (wnVar.V9 != null && wnVar.R9) {
            boolean z10 = wnVar.S9;
        }
        this.G1.setEmpty();
        if (wnVar.N9 != 0.0f) {
            int save = canvas.save();
            if (wnVar.U9 != 0.0f) {
                f7 = (wnVar.f39695x0.getMeasuredHeight() - wnVar.N9) * wnVar.U9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-wnVar.N9) - f7;
            wnVar.f39717ya = f10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f37366z3.h == null) {
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
        wn wnVar = this.f37366z3;
        qm qmVar = wnVar.f39444c9;
        qmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(qmVar.f20166g0);
            qmVar.f20195z = false;
        }
        if (this.X1 || ((iVar = wnVar.X9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (!kVar.s() && !wnVar.A9()) {
            y1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.Z2;
        int i15 = i12 - i10;
        wn wnVar = this.f37366z3;
        if (i14 != i15) {
            if (i14 != 0) {
                wnVar.h9(false);
            }
            this.Z2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.y3 != measuredHeight) {
            this.f37365x3 = true;
            tj tjVar = wnVar.f39708y0;
            if (tjVar != null) {
                tjVar.g();
            }
            wnVar.W8.a();
            this.f37365x3 = false;
            this.y3 = measuredHeight;
        }
        wnVar.R5 = false;
        qm qmVar = wnVar.f39444c9;
        if (qmVar != null && qmVar.y()) {
            wnVar.f39444c9.x();
        }
        wnVar.p9();
        wnVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        up upVar;
        wn wnVar = this.f37366z3;
        le.c cVar = wnVar.f39655tc;
        qm qmVar = wnVar.f39444c9;
        qmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(qmVar.f20166g0);
            qmVar.f20195z = false;
        }
        if (motionEvent.getAction() == 0) {
            wnVar.f39641sa = true;
        }
        if (wnVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, wnVar.N9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (upVar = wnVar.P9) != null && !upVar.R) {
                if (upVar.K != 1.0f) {
                    float f7 = wnVar.N9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    wnVar.Q9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final rj f36932b;

                        {
                            this.f36932b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wn wnVar2 = this.f36932b.f37366z3;
                                    wnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar2.f39695x0.invalidate();
                                    return;
                                case 1:
                                    wn wnVar3 = this.f36932b.f37366z3;
                                    wnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar3.f39695x0.invalidate();
                                    return;
                                case 2:
                                    wn wnVar4 = this.f36932b.f37366z3;
                                    wnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar4.f39695x0.invalidate();
                                    return;
                                default:
                                    wn wnVar5 = this.f36932b.f37366z3;
                                    wnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar5.f39695x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28030f;
                    ofFloat.setInterpolator(rrVar);
                    ofFloat.start();
                    final up upVar2 = wnVar.P9;
                    aj ajVar = new aj(this, 1);
                    AnimatorSet animatorSet = upVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        upVar2.J.cancel();
                    }
                    upVar2.Y = ajVar;
                    upVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(upVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    up upVar3 = upVar2;
                                    upVar3.getClass();
                                    upVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    upVar3.T.invalidate();
                                    View view = upVar3.f38521a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    up upVar4 = upVar2;
                                    upVar4.getClass();
                                    upVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = upVar4.f38521a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(upVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    up upVar3 = upVar2;
                                    upVar3.getClass();
                                    upVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    upVar3.T.invalidate();
                                    View view = upVar3.f38521a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    up upVar4 = upVar2;
                                    upVar4.getClass();
                                    upVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = upVar4.f38521a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    upVar2.J.addListener(new t4(upVar2, 23));
                    upVar2.J.playTogether(ofFloat2, ofFloat3);
                    upVar2.J.setDuration(120L);
                    upVar2.J.setInterpolator(rrVar);
                    upVar2.J.start();
                } else {
                    wn.X1(wnVar);
                }
            } else {
                up upVar3 = wnVar.P9;
                if (upVar3 != null && upVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    up upVar4 = wnVar.P9;
                    if (currentTimeMillis - upVar4.U < 500 && upVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        wnVar.Q9 = animatorSet2;
                        if (wnVar.P9 != null) {
                            cVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(wnVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final rj f36932b;

                            {
                                this.f36932b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wn wnVar2 = this.f36932b.f37366z3;
                                        wnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar2.f39695x0.invalidate();
                                        return;
                                    case 1:
                                        wn wnVar3 = this.f36932b.f37366z3;
                                        wnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar3.f39695x0.invalidate();
                                        return;
                                    case 2:
                                        wn wnVar4 = this.f36932b.f37366z3;
                                        wnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar4.f39695x0.invalidate();
                                        return;
                                    default:
                                        wn wnVar5 = this.f36932b.f37366z3;
                                        wnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar5.f39695x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.rr.f28030f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final rj f36932b;

                            {
                                this.f36932b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wn wnVar2 = this.f36932b.f37366z3;
                                        wnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar2.f39695x0.invalidate();
                                        return;
                                    case 1:
                                        wn wnVar3 = this.f36932b.f37366z3;
                                        wnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar3.f39695x0.invalidate();
                                        return;
                                    case 2:
                                        wn wnVar4 = this.f36932b.f37366z3;
                                        wnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar4.f39695x0.invalidate();
                                        return;
                                    default:
                                        wn wnVar5 = this.f36932b.f37366z3;
                                        wnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar5.f39695x0.invalidate();
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
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(wnVar.N9, 0.0f);
                wnVar.Q9 = ofFloat6;
                if (wnVar.P9 != null) {
                    cVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final rj f36932b;

                    {
                        this.f36932b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                wn wnVar2 = this.f36932b.f37366z3;
                                wnVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar2.f39695x0.invalidate();
                                return;
                            case 1:
                                wn wnVar3 = this.f36932b.f37366z3;
                                wnVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar3.f39695x0.invalidate();
                                return;
                            case 2:
                                wn wnVar4 = this.f36932b.f37366z3;
                                wnVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar4.f39695x0.invalidate();
                                return;
                            default:
                                wn wnVar5 = this.f36932b.f37366z3;
                                wnVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar5.f39695x0.invalidate();
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
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (!kVar.s() && !wnVar.A9()) {
                y1(motionEvent);
                if (wnVar.f39480f9 || onTouchEvent) {
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
        if (this.f37366z3.Q8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.f37366z3.f39456d9 != null) {
            y1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f37365x3) {
            return;
        }
        hh.a aVar = this.f37366z3.Pb;
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
            wn wnVar = this.f37366z3;
            wnVar.o9();
            wnVar.r9();
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
        ArrayList arrayList2 = this.f37343a3;
        int size = arrayList2.size();
        wn wnVar = this.f37366z3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) arrayList2.get(i10);
                if (!wn.d2(wnVar, u1Var, rectF)) {
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
        ArrayList arrayList3 = this.f37344b3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) arrayList3.get(i11);
                if (!wn.d2(wnVar, u1Var2, rectF)) {
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
        ArrayList arrayList4 = this.f37345c3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) arrayList4.get(i12);
                if (wn.d2(wnVar, u1Var3, rectF)) {
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
                    if (u1Var3.getTransitionParams().f21166v0) {
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
        ArrayList arrayList5 = this.f37346d3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) arrayList5.get(i13);
                if (!wn.d2(wnVar, u1Var4, rectF)) {
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
                    if (!z10 && u1Var4.getTransitionParams().f21166v0) {
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

    public final void y1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        wn wnVar = this.f37366z3;
        if (motionEvent != null) {
            wnVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !wnVar.f39480f9 && !wnVar.f39468e9 && wnVar.f39456d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.u1) {
                    if (wnVar.f39456d9 != null) {
                        wn.V1(wnVar, 0.0f);
                    }
                    wnVar.f39456d9 = (org.telegram.ui.Cells.u1) pressedChildView;
                    MessageObject T1 = wn.T1(wnVar);
                    boolean F6 = wnVar.F6(T1);
                    int i10 = wnVar.R3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && wnVar.f39451d4 == wnVar.getUserConfig().getClientUserId())) && (((arrayList = wnVar.f39411a4) == null || !arrayList.contains(T1)) && ((wnVar.E8(T1) != 1 || (T1.getDialogId() != wnVar.L6 && !T1.needDrawBluredPreview())) && ((wnVar.h != null || T1.getId() >= 0) && (((chat2 = wnVar.e) == null || !ChatObject.isForum(chat2) || F6) && !wnVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f37350h3 = motionEvent.getPointerId(0);
                        wnVar.f39468e9 = true;
                        this.f37348f3 = (int) motionEvent.getX();
                        this.f37349g3 = (int) motionEvent.getY();
                        return;
                    }
                    wn.V1(wnVar, 0.0f);
                    wnVar.f39456d9 = null;
                    return;
                }
                return;
            }
        }
        if (wnVar.f39456d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f37350h3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f37348f3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f37349g3);
            if (getScrollState() == 0 && wnVar.f39468e9 && !wnVar.f39480f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                wnVar.f39456d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                wnVar.f39720z0.R = false;
                wnVar.f39468e9 = false;
                wnVar.f39480f9 = true;
                this.f37348f3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (wnVar.f39480f9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f37353l3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f37353l3 = true;
                    }
                } else {
                    this.f37353l3 = false;
                }
                float f11 = max;
                wn.V1(wnVar, f11);
                MessageObject T12 = wn.T1(wnVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    wnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.u1 u1Var = wnVar.f39456d9;
                if (com.google.android.gms.internal.vision.e2.u(u1Var)) {
                    z1(u1Var, f11);
                }
                invalidate();
            }
        } else if (wnVar.f39456d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f37350h3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.u1 u1Var2 = wnVar.f39456d9;
                if (com.google.android.gms.internal.vision.e2.u(u1Var2)) {
                    f10 = u1Var2.E2(false);
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = wn.T1(wnVar);
                    boolean F62 = wnVar.F6(T13);
                    ok okVar = wnVar.O0;
                    if ((okVar != null && okVar.getVisibility() == 0 && ((!wnVar.I0 || !F62) && !T13.wasJustSent)) || ((chat = wnVar.e) != null && ((ChatObject.isNotInChat(chat) && !wnVar.F9()) || ((ChatObject.isChannel(wnVar.e) && !ChatObject.canPost(wnVar.e) && !wnVar.e.megagroup) || !ChatObject.canSendMessages(wnVar.e))))) {
                        if (T13.getGroupId() != 0 && (y82 = wnVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        wnVar.f39574n5 = T13;
                        Bundle e = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
                        e.putBoolean("quote", true);
                        e.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != wnVar.a() && peerDialogId != wnVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e.putLong("reply_to_author", peerDialogId);
                        }
                        e.putInt("messagesCount", 1);
                        e.putBoolean("canSelectTopics", true);
                        qy qyVar = new qy(e);
                        qyVar.C2 = wnVar;
                        wnVar.presentFragment(qyVar);
                    } else {
                        wnVar.Bb(wn.T1(wnVar));
                    }
                }
            }
            org.telegram.ui.Cells.u1 u1Var3 = wnVar.f39456d9;
            if (com.google.android.gms.internal.vision.e2.u(u1Var3)) {
                f7 = u1Var3.getSlidingOffsetX();
            } else {
                f7 = 0.0f;
            }
            this.f37352k3 = f7;
            if (f7 == 0.0f) {
                wnVar.f39456d9 = null;
            }
            this.f37351i3 = System.currentTimeMillis();
            this.j3 = 0.0f;
            invalidate();
            wnVar.f39468e9 = false;
            wnVar.f39480f9 = false;
            wnVar.f39720z0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.u1 u1Var, float f7) {
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
}
