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
public final class sj extends ai.f7 {
    public final o1.j A3;
    public final o1.k B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final yn G3;
    public int f40496g3;
    public final ArrayList f40497h3;
    public final ArrayList f40498i3;
    public final ArrayList j3;
    public final ArrayList f40499k3;
    public final ArrayList f40500l3;
    public int f40501m3;
    public int f40502n3;
    public int f40503o3;
    public long f40504p3;
    public float f40505q3;
    public float f40506r3;
    public boolean f40507s3;
    public final float f40508t3;
    public final Paint f40509u3;
    public final Paint f40510v3;
    public final o1.j f40511w3;
    public final o1.k f40512x3;
    public final o1.j y3;
    public final o1.k f40513z3;

    public sj(yn ynVar, Context context, wn wnVar) {
        super(ynVar, context, wnVar, 1);
        this.G3 = ynVar;
        this.f40497h3 = new ArrayList();
        this.f40498i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f40499k3 = new ArrayList();
        this.f40500l3 = new ArrayList(10);
        this.f40508t3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f40509u3 = paint;
        Paint paint2 = new Paint(1);
        this.f40510v3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f40511w3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f16977g = 2000.0f;
        kVar.f16983u = org.telegram.ui.Cells.c1.l(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final sj f39743b;

            {
                this.f39743b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f39743b.invalidate();
                        return;
                    case 1:
                        this.f39743b.invalidate();
                        return;
                    default:
                        this.f39743b.invalidate();
                        return;
                }
            }
        });
        this.f40512x3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.y3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f16983u = org.telegram.ui.Cells.c1.l(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final sj f39743b;

            {
                this.f39743b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f39743b.invalidate();
                        return;
                    case 1:
                        this.f39743b.invalidate();
                        return;
                    default:
                        this.f39743b.invalidate();
                        return;
                }
            }
        });
        this.f40513z3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.A3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f16983u = org.telegram.ui.Cells.c1.l(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final sj f39743b;

            {
                this.f39743b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f39743b.invalidate();
                        return;
                    case 1:
                        this.f39743b.invalidate();
                        return;
                    default:
                        this.f39743b.invalidate();
                        return;
                }
            }
        });
        this.B3 = kVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void A1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages z82;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        yn ynVar = this.G3;
        if (motionEvent != null) {
            ynVar.B4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !ynVar.f43310d9 && !ynVar.f43298c9 && ynVar.f43284b9 == null) {
            z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.u1) {
                    if (ynVar.f43284b9 != null) {
                        yn.V1(ynVar, 0.0f);
                    }
                    ynVar.f43284b9 = (org.telegram.ui.Cells.u1) pressedChildView;
                    MessageObject T1 = yn.T1(ynVar);
                    boolean F6 = ynVar.F6(T1);
                    int i10 = ynVar.P3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && ynVar.f43279b4 == ynVar.getUserConfig().getClientUserId())) && (((arrayList = ynVar.Y3) == null || !arrayList.contains(T1)) && ((ynVar.F8(T1) != 1 || (T1.getDialogId() != ynVar.J6 && !T1.needDrawBluredPreview())) && ((ynVar.h != null || T1.getId() >= 0) && (((chat2 = ynVar.f43314e) == null || !ChatObject.isForum(chat2) || F6) && !ynVar.c9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f40503o3 = motionEvent.getPointerId(0);
                        ynVar.f43298c9 = true;
                        this.f40501m3 = (int) motionEvent.getX();
                        this.f40502n3 = (int) motionEvent.getY();
                        return;
                    }
                    yn.V1(ynVar, 0.0f);
                    ynVar.f43284b9 = null;
                    return;
                }
                return;
            }
        }
        if (ynVar.f43284b9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f40503o3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f40501m3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f40502n3);
            if (getScrollState() == 0 && ynVar.f43298c9 && !ynVar.f43310d9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                ynVar.f43284b9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                ynVar.f43551x0.R = false;
                ynVar.f43298c9 = false;
                ynVar.f43310d9 = true;
                this.f40501m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (ynVar.f43310d9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f40507s3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f40507s3 = true;
                    }
                } else {
                    this.f40507s3 = false;
                }
                float f11 = max;
                yn.V1(ynVar, f11);
                MessageObject T12 = yn.T1(ynVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    ynVar.Lc(false, false);
                }
                org.telegram.ui.Cells.u1 u1Var = ynVar.f43284b9;
                if (com.google.android.gms.internal.vision.e2.u(u1Var)) {
                    B1(u1Var, f11);
                }
                invalidate();
            }
        } else if (ynVar.f43284b9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f40503o3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.u1 u1Var2 = ynVar.f43284b9;
                if (com.google.android.gms.internal.vision.e2.u(u1Var2)) {
                    f10 = u1Var2.E2(false);
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = yn.T1(ynVar);
                    boolean F62 = ynVar.F6(T13);
                    ok okVar = ynVar.M0;
                    if ((okVar != null && okVar.getVisibility() == 0 && ((!ynVar.G0 || !F62) && !T13.wasJustSent)) || ((chat = ynVar.f43314e) != null && ((ChatObject.isNotInChat(chat) && !ynVar.E9()) || ((ChatObject.isChannel(ynVar.f43314e) && !ChatObject.canPost(ynVar.f43314e) && !ynVar.f43314e.megagroup) || !ChatObject.canSendMessages(ynVar.f43314e))))) {
                        if (T13.getGroupId() != 0 && (z82 = ynVar.z8(T13.getGroupId())) != null && (messageObject = z82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        ynVar.f43404l5 = T13;
                        Bundle e7 = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
                        e7.putBoolean("quote", true);
                        e7.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != ynVar.a() && peerDialogId != ynVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e7.putLong("reply_to_author", peerDialogId);
                        }
                        e7.putInt("messagesCount", 1);
                        e7.putBoolean("canSelectTopics", true);
                        uy uyVar = new uy(e7);
                        uyVar.C2 = ynVar;
                        ynVar.presentFragment(uyVar);
                    } else {
                        ynVar.Ab(yn.T1(ynVar));
                    }
                }
            }
            org.telegram.ui.Cells.u1 u1Var3 = ynVar.f43284b9;
            if (com.google.android.gms.internal.vision.e2.u(u1Var3)) {
                f7 = u1Var3.getSlidingOffsetX();
            } else {
                f7 = 0.0f;
            }
            this.f40506r3 = f7;
            if (f7 == 0.0f) {
                ynVar.f43284b9 = null;
            }
            this.f40504p3 = System.currentTimeMillis();
            this.f40505q3 = 0.0f;
            invalidate();
            ynVar.f43298c9 = false;
            ynVar.f43310d9 = false;
            ynVar.f43551x0.R = true;
        }
    }

    public final void B1(org.telegram.ui.Cells.u1 u1Var, float f7) {
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
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        yn ynVar = this.G3;
        ynVar.f43495s8 = null;
        canvas.save();
        if (ynVar.T9 != null && ynVar.P9) {
            boolean z10 = ynVar.Q9;
        }
        this.G1.setEmpty();
        if (ynVar.L9 != 0.0f) {
            int save = canvas.save();
            if (ynVar.S9 != 0.0f) {
                f7 = (ynVar.f43525v0.getMeasuredHeight() - ynVar.L9) * ynVar.S9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-ynVar.L9) - f7;
            ynVar.f43548wa = f10;
            canvas.translate(0.0f, f10);
            y1(canvas, null);
            super.dispatchDraw(canvas);
            z1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            y1(canvas, null);
            super.dispatchDraw(canvas);
            z1(canvas, null);
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
    public final void k1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.k1(view, f7, f10, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h == null) {
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
        yn ynVar = this.G3;
        rm rmVar = ynVar.f43270a9;
        rmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(rmVar.f21954g0);
            rmVar.f21983z = false;
        }
        if (this.X1 || ((iVar = ynVar.V9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (!kVar.s() && !ynVar.z9()) {
            A1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.f40496g3;
        int i15 = i12 - i10;
        yn ynVar = this.G3;
        if (i14 != i15) {
            if (i14 != 0) {
                ynVar.i9(false);
            }
            this.f40496g3 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            uj ujVar = ynVar.f43538w0;
            if (ujVar != null) {
                ujVar.g();
            }
            ynVar.U8.a();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        ynVar.P5 = false;
        rm rmVar = ynVar.f43270a9;
        if (rmVar != null && rmVar.y()) {
            ynVar.f43270a9.x();
        }
        ynVar.p9();
        ynVar.C9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        wp wpVar;
        yn ynVar = this.G3;
        le.b bVar = ynVar.f43485rc;
        rm rmVar = ynVar.f43270a9;
        rmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(rmVar.f21954g0);
            rmVar.f21983z = false;
        }
        if (motionEvent.getAction() == 0) {
            ynVar.f43469qa = true;
        }
        if (ynVar.L9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, ynVar.L9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (wpVar = ynVar.N9) != null && !wpVar.R) {
                if (wpVar.K != 1.0f) {
                    float f7 = ynVar.L9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    ynVar.O9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final sj f40139b;

                        {
                            this.f40139b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    yn ynVar2 = this.f40139b.G3;
                                    ynVar2.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ynVar2.f43525v0.invalidate();
                                    return;
                                case 1:
                                    yn ynVar3 = this.f40139b.G3;
                                    ynVar3.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ynVar3.f43525v0.invalidate();
                                    return;
                                case 2:
                                    yn ynVar4 = this.f40139b.G3;
                                    ynVar4.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ynVar4.f43525v0.invalidate();
                                    return;
                                default:
                                    yn ynVar5 = this.f40139b.G3;
                                    ynVar5.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ynVar5.f43525v0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f31140f;
                    ofFloat.setInterpolator(trVar);
                    ofFloat.start();
                    final wp wpVar2 = ynVar.N9;
                    bj bjVar = new bj(this, 1);
                    AnimatorSet animatorSet = wpVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        wpVar2.J.cancel();
                    }
                    wpVar2.Y = bjVar;
                    wpVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(wpVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wp wpVar3 = wpVar2;
                                    wpVar3.getClass();
                                    wpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wpVar3.T.invalidate();
                                    View view = wpVar3.f42550a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wp wpVar4 = wpVar2;
                                    wpVar4.getClass();
                                    wpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = wpVar4.f42550a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(wpVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wp wpVar3 = wpVar2;
                                    wpVar3.getClass();
                                    wpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wpVar3.T.invalidate();
                                    View view = wpVar3.f42550a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wp wpVar4 = wpVar2;
                                    wpVar4.getClass();
                                    wpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = wpVar4.f42550a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    wpVar2.J.addListener(new u4(wpVar2, 23));
                    wpVar2.J.playTogether(ofFloat2, ofFloat3);
                    wpVar2.J.setDuration(120L);
                    wpVar2.J.setInterpolator(trVar);
                    wpVar2.J.start();
                } else {
                    yn.X1(ynVar);
                }
            } else {
                wp wpVar3 = ynVar.N9;
                if (wpVar3 != null && wpVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    wp wpVar4 = ynVar.N9;
                    if (currentTimeMillis - wpVar4.U < 500 && wpVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ynVar.O9 = animatorSet2;
                        if (ynVar.N9 != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(ynVar.L9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final sj f40139b;

                            {
                                this.f40139b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        yn ynVar2 = this.f40139b.G3;
                                        ynVar2.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar2.f43525v0.invalidate();
                                        return;
                                    case 1:
                                        yn ynVar3 = this.f40139b.G3;
                                        ynVar3.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar3.f43525v0.invalidate();
                                        return;
                                    case 2:
                                        yn ynVar4 = this.f40139b.G3;
                                        ynVar4.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar4.f43525v0.invalidate();
                                        return;
                                    default:
                                        yn ynVar5 = this.f40139b.G3;
                                        ynVar5.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar5.f43525v0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.tr.f31140f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final sj f40139b;

                            {
                                this.f40139b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        yn ynVar2 = this.f40139b.G3;
                                        ynVar2.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar2.f43525v0.invalidate();
                                        return;
                                    case 1:
                                        yn ynVar3 = this.f40139b.G3;
                                        ynVar3.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar3.f43525v0.invalidate();
                                        return;
                                    case 2:
                                        yn ynVar4 = this.f40139b.G3;
                                        ynVar4.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar4.f43525v0.invalidate();
                                        return;
                                    default:
                                        yn ynVar5 = this.f40139b.G3;
                                        ynVar5.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ynVar5.f43525v0.invalidate();
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
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(ynVar.L9, 0.0f);
                ynVar.O9 = ofFloat6;
                if (ynVar.N9 != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sj f40139b;

                    {
                        this.f40139b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                yn ynVar2 = this.f40139b.G3;
                                ynVar2.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ynVar2.f43525v0.invalidate();
                                return;
                            case 1:
                                yn ynVar3 = this.f40139b.G3;
                                ynVar3.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ynVar3.f43525v0.invalidate();
                                return;
                            case 2:
                                yn ynVar4 = this.f40139b.G3;
                                ynVar4.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ynVar4.f43525v0.invalidate();
                                return;
                            default:
                                yn ynVar5 = this.f40139b.G3;
                                ynVar5.L9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ynVar5.f43525v0.invalidate();
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
            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            if (!kVar.s() && !ynVar.z9()) {
                A1(motionEvent);
                if (ynVar.f43310d9 || onTouchEvent) {
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
        if (this.G3.O8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.G3.f43284b9 != null) {
            A1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        hh.a aVar = this.G3.Nb;
        if (aVar.f11422b != 0) {
            int childCount = aVar.f11421a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f11421a.getChildAt(i10).forceLayout();
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
            yn ynVar = this.G3;
            ynVar.o9();
            ynVar.q9();
        }
    }

    public final void y1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sj.y1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void z1(Canvas canvas, RectF rectF) {
        float f7;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.f40497h3;
        int size = arrayList2.size();
        yn ynVar = this.G3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) arrayList2.get(i10);
                if (!yn.d2(ynVar, u1Var, rectF)) {
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
        ArrayList arrayList3 = this.f40498i3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) arrayList3.get(i11);
                if (!yn.d2(ynVar, u1Var2, rectF)) {
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
        ArrayList arrayList4 = this.j3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) arrayList4.get(i12);
                if (yn.d2(ynVar, u1Var3, rectF)) {
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
                    if (u1Var3.getTransitionParams().f23021v0) {
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
        ArrayList arrayList5 = this.f40499k3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) arrayList5.get(i13);
                if (!yn.d2(ynVar, u1Var4, rectF)) {
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
                    if (!z10 && u1Var4.getTransitionParams().f23021v0) {
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
}
