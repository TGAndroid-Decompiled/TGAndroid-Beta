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
public final class wj extends zm {
    public int Y2;
    public final ArrayList Z2;
    public final ArrayList f38210a3;
    public final ArrayList f38211b3;
    public final ArrayList f38212c3;
    public final ArrayList f38213d3;
    public int f38214e3;
    public int f38215f3;
    public int f38216g3;
    public long f38217h3;
    public float f38218i3;
    public float j3;
    public boolean f38219k3;
    public final float f38220l3;
    public final Paint f38221m3;
    public final Paint f38222n3;
    public final o1.j f38223o3;
    public final o1.k f38224p3;
    public final o1.j f38225q3;
    public final o1.k f38226r3;
    public final o1.j f38227s3;
    public final o1.k f38228t3;
    public boolean f38229u3;
    public final Path f38230v3;
    public boolean f38231w3;
    public int f38232x3;
    public final eo y3;

    public wj(eo eoVar, Context context, bo boVar) {
        super(eoVar, context, boVar);
        this.y3 = eoVar;
        this.Z2 = new ArrayList();
        this.f38210a3 = new ArrayList();
        this.f38211b3 = new ArrayList();
        this.f38212c3 = new ArrayList();
        this.f38213d3 = new ArrayList(10);
        this.f38220l3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f38221m3 = paint;
        Paint paint2 = new Paint(1);
        this.f38222n3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f38223o3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f14128g = 2000.0f;
        kVar.f14134u = org.telegram.ui.Cells.r6.l(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final wj f37288b;

            {
                this.f37288b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f37288b.invalidate();
                        return;
                    case 1:
                        this.f37288b.invalidate();
                        return;
                    default:
                        this.f37288b.invalidate();
                        return;
                }
            }
        });
        this.f38224p3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f38225q3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f14134u = org.telegram.ui.Cells.r6.l(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final wj f37288b;

            {
                this.f37288b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f37288b.invalidate();
                        return;
                    case 1:
                        this.f37288b.invalidate();
                        return;
                    default:
                        this.f37288b.invalidate();
                        return;
                }
            }
        });
        this.f38226r3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f38227s3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f14134u = org.telegram.ui.Cells.r6.l(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final wj f37288b;

            {
                this.f37288b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f37288b.invalidate();
                        return;
                    case 1:
                        this.f37288b.invalidate();
                        return;
                    default:
                        this.f37288b.invalidate();
                        return;
                }
            }
        });
        this.f38228t3 = kVar3;
        this.f38230v3 = new Path();
        this.f38232x3 = 0;
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
        eo eoVar = this.y3;
        eoVar.f32511u8 = null;
        canvas.save();
        if (eoVar.V9 != null && eoVar.R9) {
            boolean z10 = eoVar.S9;
        }
        this.G1.setEmpty();
        if (eoVar.N9 != 0.0f) {
            int save = canvas.save();
            if (eoVar.U9 != 0.0f) {
                f7 = (eoVar.f32542x0.getMeasuredHeight() - eoVar.N9) * eoVar.U9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-eoVar.N9) - f7;
            eoVar.f32564ya = f10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.onDraw(android.graphics.Canvas):void");
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
        th.j jVar;
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.y3;
        wm wmVar = eoVar.f32291c9;
        wmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(wmVar.f19139g0);
            wmVar.f19168z = false;
        }
        if (this.X1 || ((jVar = eoVar.X9) != null && jVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (!lVar.s() && !eoVar.A9()) {
            x1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.Y2;
        int i15 = i12 - i10;
        eo eoVar = this.y3;
        if (i14 != i15) {
            if (i14 != 0) {
                eoVar.h9(false);
            }
            this.Y2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f38232x3 != measuredHeight) {
            this.f38231w3 = true;
            yj yjVar = eoVar.f32555y0;
            if (yjVar != null) {
                yjVar.g();
            }
            eoVar.W8.a();
            this.f38231w3 = false;
            this.f38232x3 = measuredHeight;
        }
        eoVar.R5 = false;
        wm wmVar = eoVar.f32291c9;
        if (wmVar != null && wmVar.y()) {
            eoVar.f32291c9.x();
        }
        eoVar.p9();
        eoVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        bq bqVar;
        eo eoVar = this.y3;
        le.b bVar = eoVar.f32515uc;
        wm wmVar = eoVar.f32291c9;
        wmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(wmVar.f19139g0);
            wmVar.f19168z = false;
        }
        if (motionEvent.getAction() == 0) {
            eoVar.f32488sa = true;
        }
        if (eoVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, eoVar.N9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (bqVar = eoVar.P9) != null && !bqVar.R) {
                if (bqVar.K != 1.0f) {
                    float f7 = eoVar.N9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    eoVar.Q9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final wj f37568b;

                        {
                            this.f37568b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    eo eoVar2 = this.f37568b.y3;
                                    eoVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    eoVar2.f32542x0.invalidate();
                                    return;
                                case 1:
                                    eo eoVar3 = this.f37568b.y3;
                                    eoVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    eoVar3.f32542x0.invalidate();
                                    return;
                                case 2:
                                    eo eoVar4 = this.f37568b.y3;
                                    eoVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    eoVar4.f32542x0.invalidate();
                                    return;
                                default:
                                    eo eoVar5 = this.f37568b.y3;
                                    eoVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    eoVar5.f32542x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
                    ofFloat.setInterpolator(wrVar);
                    ofFloat.start();
                    final bq bqVar2 = eoVar.P9;
                    fj fjVar = new fj(this, 1);
                    AnimatorSet animatorSet = bqVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        bqVar2.J.cancel();
                    }
                    bqVar2.Y = fjVar;
                    bqVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(bqVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    bq bqVar3 = bqVar2;
                                    bqVar3.getClass();
                                    bqVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    bqVar3.T.invalidate();
                                    View view = bqVar3.f31317a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    bq bqVar4 = bqVar2;
                                    bqVar4.getClass();
                                    bqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = bqVar4.f31317a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(bqVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    bq bqVar3 = bqVar2;
                                    bqVar3.getClass();
                                    bqVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    bqVar3.T.invalidate();
                                    View view = bqVar3.f31317a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    bq bqVar4 = bqVar2;
                                    bqVar4.getClass();
                                    bqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = bqVar4.f31317a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    bqVar2.J.addListener(new org.telegram.ui.Cells.v5(bqVar2, 13));
                    bqVar2.J.playTogether(ofFloat2, ofFloat3);
                    bqVar2.J.setDuration(120L);
                    bqVar2.J.setInterpolator(wrVar);
                    bqVar2.J.start();
                } else {
                    eo.X1(eoVar);
                }
            } else {
                bq bqVar3 = eoVar.P9;
                if (bqVar3 != null && bqVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    bq bqVar4 = eoVar.P9;
                    if (currentTimeMillis - bqVar4.U < 500 && bqVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        eoVar.Q9 = animatorSet2;
                        if (eoVar.P9 != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(eoVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final wj f37568b;

                            {
                                this.f37568b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        eo eoVar2 = this.f37568b.y3;
                                        eoVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar2.f32542x0.invalidate();
                                        return;
                                    case 1:
                                        eo eoVar3 = this.f37568b.y3;
                                        eoVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar3.f32542x0.invalidate();
                                        return;
                                    case 2:
                                        eo eoVar4 = this.f37568b.y3;
                                        eoVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar4.f32542x0.invalidate();
                                        return;
                                    default:
                                        eo eoVar5 = this.f37568b.y3;
                                        eoVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar5.f32542x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final wj f37568b;

                            {
                                this.f37568b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        eo eoVar2 = this.f37568b.y3;
                                        eoVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar2.f32542x0.invalidate();
                                        return;
                                    case 1:
                                        eo eoVar3 = this.f37568b.y3;
                                        eoVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar3.f32542x0.invalidate();
                                        return;
                                    case 2:
                                        eo eoVar4 = this.f37568b.y3;
                                        eoVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar4.f32542x0.invalidate();
                                        return;
                                    default:
                                        eo eoVar5 = this.f37568b.y3;
                                        eoVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        eoVar5.f32542x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(ii.n.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(eoVar.N9, 0.0f);
                eoVar.Q9 = ofFloat6;
                if (eoVar.P9 != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final wj f37568b;

                    {
                        this.f37568b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                eo eoVar2 = this.f37568b.y3;
                                eoVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                eoVar2.f32542x0.invalidate();
                                return;
                            case 1:
                                eo eoVar3 = this.f37568b.y3;
                                eoVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                eoVar3.f32542x0.invalidate();
                                return;
                            case 2:
                                eo eoVar4 = this.f37568b.y3;
                                eoVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                eoVar4.f32542x0.invalidate();
                                return;
                            default:
                                eo eoVar5 = this.f37568b.y3;
                                eoVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                eoVar5.f32542x0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(ii.n.V);
                ofFloat6.start();
            }
        }
        if (!this.X1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (!lVar.s() && !eoVar.A9()) {
                x1(motionEvent);
                if (eoVar.f32327f9 || onTouchEvent) {
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
        if (this.y3.f32303d9 != null) {
            x1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f38231w3) {
            return;
        }
        gh.a aVar = this.y3.Qb;
        if (aVar.f9107b != 0) {
            int childCount = aVar.f9106a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f9106a.getChildAt(i10).forceLayout();
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
            eo eoVar = this.y3;
            eoVar.o9();
            eoVar.r9();
        }
    }

    public final void v1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wj.v1(android.graphics.Canvas, android.graphics.RectF):void");
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
        eo eoVar = this.y3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i10);
                if (!eo.d2(eoVar, t1Var, rectF)) {
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
        ArrayList arrayList3 = this.f38210a3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i11);
                if (!eo.d2(eoVar, t1Var2, rectF)) {
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
        ArrayList arrayList4 = this.f38211b3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i12);
                if (eo.d2(eoVar, t1Var3, rectF)) {
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
                    if (t1Var3.getTransitionParams().f20008v0) {
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
        ArrayList arrayList5 = this.f38212c3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i13);
                if (!eo.d2(eoVar, t1Var4, rectF)) {
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
                    if (!z10 && t1Var4.getTransitionParams().f20008v0) {
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
        eo eoVar = this.y3;
        if (motionEvent != null) {
            eoVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !eoVar.f32327f9 && !eoVar.f32315e9 && eoVar.f32303d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.t1) {
                    if (eoVar.f32303d9 != null) {
                        eo.V1(eoVar, 0.0f);
                    }
                    eoVar.f32303d9 = (org.telegram.ui.Cells.t1) pressedChildView;
                    MessageObject T1 = eo.T1(eoVar);
                    boolean F6 = eoVar.F6(T1);
                    int i10 = eoVar.R3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && eoVar.f32298d4 == eoVar.getUserConfig().getClientUserId())) && (((arrayList = eoVar.f32258a4) == null || !arrayList.contains(T1)) && ((eoVar.E8(T1) != 1 || (T1.getDialogId() != eoVar.L6 && !T1.needDrawBluredPreview())) && ((eoVar.h != null || T1.getId() >= 0) && (((chat2 = eoVar.e) == null || !ChatObject.isForum(chat2) || F6) && !eoVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f38216g3 = motionEvent.getPointerId(0);
                        eoVar.f32315e9 = true;
                        this.f38214e3 = (int) motionEvent.getX();
                        this.f38215f3 = (int) motionEvent.getY();
                        return;
                    }
                    eo.V1(eoVar, 0.0f);
                    eoVar.f32303d9 = null;
                    return;
                }
                return;
            }
        }
        if (eoVar.f32303d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f38216g3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f38214e3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f38215f3);
            if (getScrollState() == 0 && eoVar.f32315e9 && !eoVar.f32327f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                eoVar.f32303d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                eoVar.f32567z0.R = false;
                eoVar.f32315e9 = false;
                eoVar.f32327f9 = true;
                this.f38214e3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (eoVar.f32327f9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f38219k3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f38219k3 = true;
                    }
                } else {
                    this.f38219k3 = false;
                }
                float f11 = max;
                eo.V1(eoVar, f11);
                MessageObject T12 = eo.T1(eoVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    eoVar.Mc(false, false);
                }
                org.telegram.ui.Cells.t1 t1Var = eoVar.f32303d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
                    y1(t1Var, f11);
                }
                invalidate();
            }
        } else if (eoVar.f32303d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f38216g3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.t1 t1Var2 = eoVar.f32303d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var2)) {
                    f10 = t1Var2.E2(false);
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = eo.T1(eoVar);
                    boolean F62 = eoVar.F6(T13);
                    tk tkVar = eoVar.O0;
                    if ((tkVar != null && tkVar.getVisibility() == 0 && ((!eoVar.I0 || !F62) && !T13.wasJustSent)) || ((chat = eoVar.e) != null && ((ChatObject.isNotInChat(chat) && !eoVar.F9()) || ((ChatObject.isChannel(eoVar.e) && !ChatObject.canPost(eoVar.e) && !eoVar.e.megagroup) || !ChatObject.canSendMessages(eoVar.e))))) {
                        if (T13.getGroupId() != 0 && (y82 = eoVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        eoVar.f32421n5 = T13;
                        Bundle e = org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true);
                        e.putBoolean("quote", true);
                        e.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != eoVar.a() && peerDialogId != eoVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e.putLong("reply_to_author", peerDialogId);
                        }
                        e.putInt("messagesCount", 1);
                        e.putBoolean("canSelectTopics", true);
                        wy wyVar = new wy(e);
                        wyVar.C2 = eoVar;
                        eoVar.presentFragment(wyVar);
                    } else {
                        eoVar.Bb(eo.T1(eoVar));
                    }
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = eoVar.f32303d9;
            if (com.google.android.gms.internal.vision.e2.u(t1Var3)) {
                f7 = t1Var3.getSlidingOffsetX();
            } else {
                f7 = 0.0f;
            }
            this.j3 = f7;
            if (f7 == 0.0f) {
                eoVar.f32303d9 = null;
            }
            this.f38217h3 = System.currentTimeMillis();
            this.f38218i3 = 0.0f;
            invalidate();
            eoVar.f32315e9 = false;
            eoVar.f32327f9 = false;
            eoVar.f32567z0.R = true;
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
