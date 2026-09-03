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
public final class sj extends vm {
    public int V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f38234a3;
    public int f38235b3;
    public int c3;
    public int f38236d3;
    public long f38237e3;
    public float f38238f3;
    public float f38239g3;
    public boolean f38240h3;
    public final float f38241i3;
    public final Paint f38242j3;
    public final Paint f38243k3;
    public final kb.a f38244l3;
    public final o1.j f38245m3;
    public final kb.a f38246n3;
    public final o1.j f38247o3;
    public final kb.a f38248p3;
    public final o1.j f38249q3;
    public boolean f38250r3;
    public final Path f38251s3;
    public boolean f38252t3;
    public int f38253u3;
    public final zn f38254v3;

    public sj(zn znVar, Context context, xn xnVar) {
        super(znVar, context, xnVar);
        this.f38254v3 = znVar;
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f38234a3 = new ArrayList(10);
        this.f38241i3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f38242j3 = paint;
        Paint paint2 = new Paint(1);
        this.f38243k3 = paint2;
        kb.a aVar = new kb.a(0.0f);
        this.f38244l3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.f16173g = 2000.0f;
        jVar.f16178u = ai.m(0.0f, 1500.0f, 1.0f);
        jVar.b(new o1.g(this) {
            public final sj f37426b;

            {
                this.f37426b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f37426b.invalidate();
                        return;
                    case 1:
                        this.f37426b.invalidate();
                        return;
                    default:
                        this.f37426b.invalidate();
                        return;
                }
            }
        });
        this.f38245m3 = jVar;
        kb.a aVar2 = new kb.a(0.0f);
        this.f38246n3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.f16178u = ai.m(0.0f, 400.0f, 0.5f);
        jVar2.b(new o1.g(this) {
            public final sj f37426b;

            {
                this.f37426b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f37426b.invalidate();
                        return;
                    case 1:
                        this.f37426b.invalidate();
                        return;
                    default:
                        this.f37426b.invalidate();
                        return;
                }
            }
        });
        this.f38247o3 = jVar2;
        kb.a aVar3 = new kb.a(0.0f);
        this.f38248p3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.f16178u = ai.m(0.0f, 200.0f, 1.0f);
        jVar3.b(new o1.g(this) {
            public final sj f37426b;

            {
                this.f37426b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f37426b.invalidate();
                        return;
                    case 1:
                        this.f37426b.invalidate();
                        return;
                    default:
                        this.f37426b.invalidate();
                        return;
                }
            }
        });
        this.f38249q3 = jVar3;
        this.f38251s3 = new Path();
        this.f38253u3 = 0;
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
        if (this.f38254v3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        zn znVar = this.f38254v3;
        znVar.f40732r8 = null;
        canvas.save();
        if (znVar.S9 != null && znVar.O9) {
            boolean z4 = znVar.P9;
        }
        this.D1.setEmpty();
        if (znVar.K9 != 0.0f) {
            int save = canvas.save();
            if (znVar.R9 != 0.0f) {
                f10 = (znVar.f40759u0.getMeasuredHeight() - znVar.K9) * znVar.R9;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-znVar.K9) - f10;
            znVar.f40782va = f11;
            canvas.translate(0.0f, f11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void g1(View view, float f10, float f11, boolean z4) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.g1(view, f10, f11, z4);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.s1)) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            s1Var2.setPressed(z4);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f38254v3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hh.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.f38254v3;
        sm smVar = znVar.Z8;
        smVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(smVar.f22612g0);
            smVar.f22641z = false;
        }
        if (this.U1 || ((kVar = znVar.U9) != null && kVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (!kVar2.s() && !znVar.A9()) {
            x1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = this.V2;
        int i15 = i12 - i10;
        zn znVar = this.f38254v3;
        if (i14 != i15) {
            if (i14 != 0) {
                znVar.h9(false);
            }
            this.V2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f38253u3 != measuredHeight) {
            this.f38252t3 = true;
            uj ujVar = znVar.f40772v0;
            if (ujVar != null) {
                ujVar.g();
            }
            znVar.T8.a();
            this.f38252t3 = false;
            this.f38253u3 = measuredHeight;
        }
        znVar.O5 = false;
        sm smVar = znVar.Z8;
        if (smVar != null && smVar.y()) {
            znVar.Z8.x();
        }
        znVar.p9();
        znVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        vp vpVar;
        zn znVar = this.f38254v3;
        xd.a aVar = znVar.f40736rc;
        sm smVar = znVar.Z8;
        smVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(smVar.f22612g0);
            smVar.f22641z = false;
        }
        if (motionEvent.getAction() == 0) {
            znVar.f40708pa = true;
        }
        if (znVar.K9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, znVar.K9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (vpVar = znVar.M9) != null && !vpVar.O) {
                if (vpVar.H != 1.0f) {
                    float f10 = znVar.K9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, AndroidUtilities.dp(8.0f) + f10);
                    znVar.N9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final sj f37874b;

                        {
                            this.f37874b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    zn znVar2 = this.f37874b.f38254v3;
                                    znVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar2.f40759u0.invalidate();
                                    return;
                                case 1:
                                    zn znVar3 = this.f37874b.f38254v3;
                                    znVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar3.f40759u0.invalidate();
                                    return;
                                case 2:
                                    zn znVar4 = this.f37874b.f38254v3;
                                    znVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar4.f40759u0.invalidate();
                                    return;
                                default:
                                    zn znVar5 = this.f37874b.f38254v3;
                                    znVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    znVar5.f40759u0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
                    ofFloat.setInterpolator(mrVar);
                    ofFloat.start();
                    final vp vpVar2 = znVar.M9;
                    bj bjVar = new bj(this, 1);
                    AnimatorSet animatorSet = vpVar2.G;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        vpVar2.G.cancel();
                    }
                    vpVar2.V = bjVar;
                    vpVar2.G = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(vpVar2.H, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vp vpVar3 = vpVar2;
                                    vpVar3.getClass();
                                    vpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vpVar3.Q.invalidate();
                                    View view = vpVar3.X;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vp vpVar4 = vpVar2;
                                    vpVar4.getClass();
                                    vpVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = vpVar4.X;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(vpVar2.I, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vp vpVar3 = vpVar2;
                                    vpVar3.getClass();
                                    vpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vpVar3.Q.invalidate();
                                    View view = vpVar3.X;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vp vpVar4 = vpVar2;
                                    vpVar4.getClass();
                                    vpVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = vpVar4.X;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    vpVar2.G.addListener(new u5(vpVar2, 22));
                    vpVar2.G.playTogether(ofFloat2, ofFloat3);
                    vpVar2.G.setDuration(120L);
                    vpVar2.G.setInterpolator(mrVar);
                    vpVar2.G.start();
                } else {
                    zn.X1(znVar);
                }
            } else {
                vp vpVar3 = znVar.M9;
                if (vpVar3 != null && vpVar3.O) {
                    long currentTimeMillis = System.currentTimeMillis();
                    vp vpVar4 = znVar.M9;
                    if (currentTimeMillis - vpVar4.R < 500 && vpVar4.J) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        znVar.N9 = animatorSet2;
                        if (znVar.M9 != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(znVar.K9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final sj f37874b;

                            {
                                this.f37874b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        zn znVar2 = this.f37874b.f38254v3;
                                        znVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.f40759u0.invalidate();
                                        return;
                                    case 1:
                                        zn znVar3 = this.f37874b.f38254v3;
                                        znVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.f40759u0.invalidate();
                                        return;
                                    case 2:
                                        zn znVar4 = this.f37874b.f38254v3;
                                        znVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.f40759u0.invalidate();
                                        return;
                                    default:
                                        zn znVar5 = this.f37874b.f38254v3;
                                        znVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.f40759u0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final sj f37874b;

                            {
                                this.f37874b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        zn znVar2 = this.f37874b.f38254v3;
                                        znVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.f40759u0.invalidate();
                                        return;
                                    case 1:
                                        zn znVar3 = this.f37874b.f38254v3;
                                        znVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.f40759u0.invalidate();
                                        return;
                                    case 2:
                                        zn znVar4 = this.f37874b.f38254v3;
                                        znVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.f40759u0.invalidate();
                                        return;
                                    default:
                                        zn znVar5 = this.f37874b.f38254v3;
                                        znVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.f40759u0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(wh.n.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(znVar.K9, 0.0f);
                znVar.N9 = ofFloat6;
                if (znVar.M9 != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sj f37874b;

                    {
                        this.f37874b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                zn znVar2 = this.f37874b.f38254v3;
                                znVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar2.f40759u0.invalidate();
                                return;
                            case 1:
                                zn znVar3 = this.f37874b.f38254v3;
                                znVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar3.f40759u0.invalidate();
                                return;
                            case 2:
                                zn znVar4 = this.f37874b.f38254v3;
                                znVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar4.f40759u0.invalidate();
                                return;
                            default:
                                zn znVar5 = this.f37874b.f38254v3;
                                znVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar5.f40759u0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(wh.n.V);
                ofFloat6.start();
            }
        }
        if (!this.U1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
                x1(motionEvent);
                if (znVar.f40546c9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.f38254v3.N8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (this.f38254v3.f40519a9 != null) {
            x1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f38252t3) {
            return;
        }
        ug.a aVar = this.f38254v3.Nb;
        if (aVar.f45557b != 0) {
            int childCount = aVar.f45556a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f45556a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(f2.t0 t0Var) {
        if (this.U1) {
            return;
        }
        super.setItemAnimator(t0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            zn znVar = this.f38254v3;
            znVar.o9();
            znVar.r9();
        }
    }

    public final void v1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sj.v1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void w1(Canvas canvas, RectF rectF) {
        float f10;
        boolean z4;
        float f11;
        boolean z10;
        float f12;
        ArrayList arrayList;
        float f13;
        float f14;
        ArrayList arrayList2 = this.W2;
        int size = arrayList2.size();
        zn znVar = this.f38254v3;
        boolean z11 = 1;
        boolean z12 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) arrayList2.get(i10);
                if (!zn.d2(znVar, s1Var, rectF)) {
                    canvas.save();
                    canvas.translate(s1Var.E2(false) + s1Var.getLeft(), s1Var.getY() + s1Var.getPaddingTop());
                    if (s1Var.a()) {
                        f14 = s1Var.getAlpha();
                    } else {
                        f14 = 1.0f;
                    }
                    s1Var.m2(f14, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.X2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) arrayList3.get(i11);
                if (!zn.d2(znVar, s1Var2, rectF)) {
                    float E2 = s1Var2.E2(false) + s1Var2.getLeft();
                    float y10 = s1Var2.getY() + s1Var2.getPaddingTop();
                    if (s1Var2.a()) {
                        f13 = s1Var2.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(E2, y10);
                    s1Var2.setInvalidatesParent(true);
                    s1Var2.W1(canvas, f13);
                    s1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.Y2;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList4.get(i12);
                if (zn.d2(znVar, s1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (s1Var3.getCurrentPosition() != null && (s1Var3.getCurrentPosition().flags & z11) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (s1Var3.a()) {
                        f12 = s1Var3.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float E22 = s1Var3.E2(z12) + s1Var3.getLeft();
                    float y11 = s1Var3.getY() + s1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = s1Var3.E2(z11);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f15 = transitionParams.left + E23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f16 = transitionParams.top + transitionParams.offsetTop;
                            float f17 = transitionParams.right + E23 + transitionParams.offsetRight;
                            float f18 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f16 += s1Var3.getTranslationY();
                                f18 += s1Var3.getTranslationY();
                            }
                            canvas.clipRect(f15 + AndroidUtilities.dp(8.0f), f16 + AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f), f18 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (s1Var3.getTransitionParams().f21837v0) {
                        canvas.translate(E22, y11);
                        s1Var3.setInvalidatesParent(true);
                        s1Var3.I1(f12, canvas, z10);
                        s1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z11 = 1;
                z12 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.Z2;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList5.get(i13);
                if (!zn.d2(znVar, s1Var4, rectF)) {
                    if (s1Var4.getCurrentPosition() != null && (s1Var4.getCurrentPosition().flags & 1) == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (s1Var4.a()) {
                        f11 = s1Var4.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float E24 = s1Var4.E2(false) + s1Var4.getLeft();
                    float y12 = s1Var4.getY() + s1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = s1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f19 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f20 = transitionParams2.top + transitionParams2.offsetTop;
                        float f21 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f22 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f20 += s1Var4.getTranslationY();
                            f22 += s1Var4.getTranslationY();
                        }
                        canvas.clipRect(f19 + AndroidUtilities.dp(f10), f20 + AndroidUtilities.dp(f10), f21 - AndroidUtilities.dp(f10), f22 - AndroidUtilities.dp(f10));
                    }
                    if (!z4 && s1Var4.getTransitionParams().f21837v0) {
                        canvas.translate(E24, y12);
                        s1Var4.setInvalidatesParent(true);
                        s1Var4.d2(canvas, f11, null);
                        s1Var4.N1(canvas, f11);
                        s1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void x1(MotionEvent motionEvent) {
        float f10;
        float f11;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z4;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        zn znVar = this.f38254v3;
        if (motionEvent != null) {
            znVar.A4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !znVar.f40546c9 && !znVar.f40533b9 && znVar.f40519a9 == null) {
            z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
            if (!z4) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.s1) {
                    if (znVar.f40519a9 != null) {
                        zn.V1(znVar, 0.0f);
                    }
                    znVar.f40519a9 = (org.telegram.ui.Cells.s1) pressedChildView;
                    MessageObject T1 = zn.T1(znVar);
                    boolean F6 = znVar.F6(T1);
                    int i10 = znVar.O3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && znVar.f40514a4 == znVar.getUserConfig().getClientUserId())) && (((arrayList = znVar.X3) == null || !arrayList.contains(T1)) && ((znVar.E8(T1) != 1 || (T1.getDialogId() != znVar.I6 && !T1.needDrawBluredPreview())) && ((znVar.h != null || T1.getId() >= 0) && (((chat2 = znVar.e) == null || !ChatObject.isForum(chat2) || F6) && !znVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f38236d3 = motionEvent.getPointerId(0);
                        znVar.f40533b9 = true;
                        this.f38235b3 = (int) motionEvent.getX();
                        this.c3 = (int) motionEvent.getY();
                        return;
                    }
                    zn.V1(znVar, 0.0f);
                    znVar.f40519a9 = null;
                    return;
                }
                return;
            }
        }
        if (znVar.f40519a9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f38236d3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f38235b3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.c3);
            if (getScrollState() == 0 && znVar.f40533b9 && !znVar.f40546c9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                znVar.f40519a9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                znVar.f40786w0.R = false;
                znVar.f40533b9 = false;
                znVar.f40546c9 = true;
                this.f38235b3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (znVar.f40546c9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f38240h3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f38240h3 = true;
                    }
                } else {
                    this.f38240h3 = false;
                }
                float f12 = max;
                zn.V1(znVar, f12);
                MessageObject T12 = zn.T1(znVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    znVar.Mc(false, false);
                }
                org.telegram.ui.Cells.s1 s1Var = znVar.f40519a9;
                if (e2.c.s(s1Var)) {
                    y1(s1Var, f12);
                }
                invalidate();
            }
        } else if (znVar.f40519a9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f38236d3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.s1 s1Var2 = znVar.f40519a9;
                if (e2.c.s(s1Var2)) {
                    f11 = s1Var2.E2(false);
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = zn.T1(znVar);
                    boolean F62 = znVar.F6(T13);
                    qk qkVar = znVar.L0;
                    if ((qkVar != null && qkVar.getVisibility() == 0 && ((!znVar.F0 || !F62) && !T13.wasJustSent)) || ((chat = znVar.e) != null && ((ChatObject.isNotInChat(chat) && !znVar.F9()) || ((ChatObject.isChannel(znVar.e) && !ChatObject.canPost(znVar.e) && !znVar.e.megagroup) || !ChatObject.canSendMessages(znVar.e))))) {
                        if (T13.getGroupId() != 0 && (y82 = znVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        znVar.f40642k5 = T13;
                        Bundle e = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
                        e.putBoolean("quote", true);
                        e.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e.putLong("reply_to_author", peerDialogId);
                        }
                        e.putInt("messagesCount", 1);
                        e.putBoolean("canSelectTopics", true);
                        qy qyVar = new qy(e);
                        qyVar.f37649z2 = znVar;
                        znVar.presentFragment(qyVar);
                    } else {
                        znVar.Bb(zn.T1(znVar));
                    }
                }
            }
            org.telegram.ui.Cells.s1 s1Var3 = znVar.f40519a9;
            if (e2.c.s(s1Var3)) {
                f10 = s1Var3.getSlidingOffsetX();
            } else {
                f10 = 0.0f;
            }
            this.f38239g3 = f10;
            if (f10 == 0.0f) {
                znVar.f40519a9 = null;
            }
            this.f38237e3 = System.currentTimeMillis();
            this.f38238f3 = 0.0f;
            invalidate();
            znVar.f40533b9 = false;
            znVar.f40546c9 = false;
            znVar.f40786w0.R = true;
        }
    }

    public final void y1(org.telegram.ui.Cells.s1 s1Var, float f10) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != s1Var && (childAt instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    s1Var2.setSlidingOffset(f10);
                    s1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
