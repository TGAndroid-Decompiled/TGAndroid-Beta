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
public final class rj extends di.p5 {
    public final o1.j A3;
    public final ac.a B3;
    public final o1.j C3;
    public boolean D3;
    public final Path E3;
    public boolean F3;
    public int G3;
    public final wn H3;
    public int f43056h3;
    public final ArrayList f43057i3;
    public final ArrayList f43058j3;
    public final ArrayList f43059k3;
    public final ArrayList f43060l3;
    public final ArrayList f43061m3;
    public int f43062n3;
    public int f43063o3;
    public int f43064p3;
    public long f43065q3;
    public float f43066r3;
    public float f43067s3;
    public boolean f43068t3;
    public final float f43069u3;
    public final Paint f43070v3;
    public final Paint f43071w3;
    public final ac.a f43072x3;
    public final o1.j y3;
    public final ac.a f43073z3;

    public rj(wn wnVar, Context context, un unVar) {
        super(wnVar, context, unVar, 1);
        this.H3 = wnVar;
        this.f43057i3 = new ArrayList();
        this.f43058j3 = new ArrayList();
        this.f43059k3 = new ArrayList();
        this.f43060l3 = new ArrayList();
        this.f43061m3 = new ArrayList(10);
        this.f43069u3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f43070v3 = paint;
        Paint paint2 = new Paint(1);
        this.f43071w3 = paint2;
        ac.a aVar = new ac.a(0.0f);
        this.f43072x3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.f18963g = 2000.0f;
        jVar.f18968u = d3.l(0.0f, 1500.0f, 1.0f);
        jVar.b(new o1.g(this) {
            public final rj f42723b;

            {
                this.f42723b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f42723b.invalidate();
                        return;
                    case 1:
                        this.f42723b.invalidate();
                        return;
                    default:
                        this.f42723b.invalidate();
                        return;
                }
            }
        });
        this.y3 = jVar;
        ac.a aVar2 = new ac.a(0.0f);
        this.f43073z3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.f18968u = d3.l(0.0f, 400.0f, 0.5f);
        jVar2.b(new o1.g(this) {
            public final rj f42723b;

            {
                this.f42723b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f42723b.invalidate();
                        return;
                    case 1:
                        this.f42723b.invalidate();
                        return;
                    default:
                        this.f42723b.invalidate();
                        return;
                }
            }
        });
        this.A3 = jVar2;
        ac.a aVar3 = new ac.a(0.0f);
        this.B3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.f18968u = d3.l(0.0f, 200.0f, 1.0f);
        jVar3.b(new o1.g(this) {
            public final rj f42723b;

            {
                this.f42723b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f42723b.invalidate();
                        return;
                    case 1:
                        this.f42723b.invalidate();
                        return;
                    default:
                        this.f42723b.invalidate();
                        return;
                }
            }
        });
        this.C3 = jVar3;
        this.E3 = new Path();
        this.G3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void C1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj.C1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void D1(Canvas canvas, RectF rectF) {
        float f7;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.f43057i3;
        int size = arrayList2.size();
        wn wnVar = this.H3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) arrayList2.get(i10);
                if (!wn.h2(wnVar, s1Var, rectF)) {
                    canvas.save();
                    canvas.translate(s1Var.E2(false) + s1Var.getLeft(), s1Var.getY() + s1Var.getPaddingTop());
                    if (s1Var.a()) {
                        f13 = s1Var.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    s1Var.m2(f13, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f43058j3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) arrayList3.get(i11);
                if (!wn.h2(wnVar, s1Var2, rectF)) {
                    float E2 = s1Var2.E2(false) + s1Var2.getLeft();
                    float y3 = s1Var2.getY() + s1Var2.getPaddingTop();
                    if (s1Var2.a()) {
                        f12 = s1Var2.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(E2, y3);
                    s1Var2.setInvalidatesParent(true);
                    s1Var2.W1(canvas, f12);
                    s1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f43059k3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList4.get(i12);
                if (wn.h2(wnVar, s1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (s1Var3.getCurrentPosition() != null && (s1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
                    }
                    if (s1Var3.a()) {
                        f11 = s1Var3.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float E22 = s1Var3.E2(z13) + s1Var3.getLeft();
                    float y10 = s1Var3.getY() + s1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = s1Var3.E2(z12);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f14 = transitionParams.left + E23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f15 = transitionParams.top + transitionParams.offsetTop;
                            float f16 = transitionParams.right + E23 + transitionParams.offsetRight;
                            float f17 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f15 += s1Var3.getTranslationY();
                                f17 += s1Var3.getTranslationY();
                            }
                            canvas.clipRect(f14 + AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(8.0f), f16 - AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (s1Var3.getTransitionParams().f24939v0) {
                        canvas.translate(E22, y10);
                        s1Var3.setInvalidatesParent(true);
                        s1Var3.I1(f11, canvas, z11);
                        s1Var3.setInvalidatesParent(false);
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
        ArrayList arrayList5 = this.f43060l3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList5.get(i13);
                if (!wn.h2(wnVar, s1Var4, rectF)) {
                    if (s1Var4.getCurrentPosition() != null && (s1Var4.getCurrentPosition().flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (s1Var4.a()) {
                        f10 = s1Var4.getAlpha();
                    } else {
                        f10 = 1.0f;
                    }
                    float E24 = s1Var4.E2(false) + s1Var4.getLeft();
                    float y11 = s1Var4.getY() + s1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = s1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f18 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f19 = transitionParams2.top + transitionParams2.offsetTop;
                        float f20 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f21 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f19 += s1Var4.getTranslationY();
                            f21 += s1Var4.getTranslationY();
                        }
                        canvas.clipRect(f18 + AndroidUtilities.dp(f7), f19 + AndroidUtilities.dp(f7), f20 - AndroidUtilities.dp(f7), f21 - AndroidUtilities.dp(f7));
                    }
                    if (!z10 && s1Var4.getTransitionParams().f24939v0) {
                        canvas.translate(E24, y11);
                        s1Var4.setInvalidatesParent(true);
                        s1Var4.d2(canvas, f10, null);
                        s1Var4.N1(canvas, f10);
                        s1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void E1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages K8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        wn wnVar = this.H3;
        if (motionEvent != null) {
            wnVar.P4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !wnVar.f45321v9 && !wnVar.f45308u9 && wnVar.f45295t9 == null) {
            z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.s1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) pressedChildView;
                        float x9 = motionEvent.getX() - pressedChildView.getX();
                        float y3 = motionEvent.getY() - pressedChildView.getY();
                        if (v0Var.L()) {
                            org.telegram.ui.Wallet.m3 m3Var = v0Var.I0;
                            float f11 = (x9 - v0Var.K0) - (v0Var.f25529j0 / 2.0f);
                            float paddingTop = (y3 - v0Var.L0) - v0Var.getPaddingTop();
                            org.telegram.ui.Wallet.l3 l3Var = m3Var.f36913m;
                            if (l3Var != null && l3Var.f49929n && m3Var.f36931w.contains((int) f11, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (wnVar.f45295t9 != null) {
                    wn.Z1(wnVar, 0.0f);
                }
                wnVar.f45295t9 = pressedChildView;
                MessageObject X1 = wn.X1(wnVar);
                boolean M6 = wnVar.M6(X1);
                int i10 = wnVar.f45091d4;
                if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && wnVar.f45241p4 == wnVar.getUserConfig().getClientUserId())) && (((arrayList = wnVar.f45201m4) == null || !arrayList.contains(X1)) && ((wnVar.Q8(X1) != 1 || (X1.getDialogId() != wnVar.f45065b7 && !X1.needDrawBluredPreview())) && ((wnVar.h != null || X1.getId() >= 0) && (((chat2 = wnVar.e) == null || !ChatObject.isForum(chat2) || M6) && !wnVar.o9() && (!X1.isEphemeral() || !X1.isOut())))))) {
                    this.f43064p3 = motionEvent.getPointerId(0);
                    wnVar.f45308u9 = true;
                    this.f43062n3 = (int) motionEvent.getX();
                    this.f43063o3 = (int) motionEvent.getY();
                    return;
                }
                wn.Z1(wnVar, 0.0f);
                wnVar.f45295t9 = null;
                return;
            }
        }
        if (wnVar.f45295t9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f43064p3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f43062n3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f43063o3);
            if (getScrollState() == 0 && wnVar.f45308u9 && !wnVar.f45321v9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                wnVar.f45295t9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                wnVar.f45364z0.R = false;
                wnVar.f45308u9 = false;
                wnVar.f45321v9 = true;
                this.f43062n3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (wnVar.f45321v9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f43068t3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f43068t3 = true;
                    }
                } else {
                    this.f43068t3 = false;
                }
                float f12 = max;
                wn.Z1(wnVar, f12);
                MessageObject X12 = wn.X1(wnVar);
                if (X12 != null && (X12.isRoundVideo() || X12.isVideo())) {
                    wnVar.dd(false, false);
                }
                View view = wnVar.f45295t9;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    F1((org.telegram.ui.Cells.s1) view, f12);
                }
                invalidate();
            }
        } else if (wnVar.f45295t9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f43064p3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = wnVar.f45295t9;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                    f10 = ((org.telegram.ui.Cells.s1) view2).E2(false);
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    f10 = ((org.telegram.ui.Cells.v0) view2).getWalletSlidingOffset();
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject X13 = wn.X1(wnVar);
                    boolean M62 = wnVar.M6(X13);
                    nk nkVar = wnVar.f45046a1;
                    if ((nkVar != null && nkVar.getVisibility() == 0 && ((!wnVar.U0 || !M62) && !X13.wasJustSent)) || ((chat = wnVar.e) != null && ((ChatObject.isNotInChat(chat) && !wnVar.R9()) || ((ChatObject.isChannel(wnVar.e) && !ChatObject.canPost(wnVar.e) && !wnVar.e.megagroup) || !ChatObject.canSendMessages(wnVar.e))))) {
                        if (X13.getGroupId() != 0 && (K8 = wnVar.K8(X13.getGroupId())) != null && (messageObject = K8.captionMessage) != null) {
                            X13 = messageObject;
                        }
                        wnVar.D5 = X13;
                        Bundle c10 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
                        c10.putBoolean("quote", true);
                        c10.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(X13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != wnVar.a() && peerDialogId != wnVar.getUserConfig().getClientUserId() && i11 > 0) {
                            c10.putLong("reply_to_author", peerDialogId);
                        }
                        c10.putInt("messagesCount", 1);
                        c10.putBoolean("canSelectTopics", true);
                        ey eyVar = new ey(c10);
                        eyVar.C2 = wnVar;
                        wnVar.presentFragment(eyVar);
                    } else {
                        wnVar.Rb(wn.X1(wnVar));
                    }
                }
            }
            View view3 = wnVar.f45295t9;
            if (view3 instanceof org.telegram.ui.Cells.s1) {
                f7 = ((org.telegram.ui.Cells.s1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                f7 = ((org.telegram.ui.Cells.v0) view3).getWalletSlidingOffset();
            } else {
                f7 = 0.0f;
            }
            this.f43067s3 = f7;
            if (f7 == 0.0f) {
                wnVar.f45295t9 = null;
            }
            this.f43065q3 = System.currentTimeMillis();
            this.f43066r3 = 0.0f;
            invalidate();
            wnVar.f45308u9 = false;
            wnVar.f45321v9 = false;
            wnVar.f45364z0.R = true;
        }
    }

    @Override
    public final boolean F0(View view) {
        if (view.getVisibility() != 4 && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void F1(org.telegram.ui.Cells.s1 s1Var, float f7) {
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
                    s1Var2.setSlidingOffset(f7);
                    s1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.H3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        wn wnVar = this.H3;
        wnVar.K8 = null;
        canvas.save();
        if (wnVar.f45195la != null && wnVar.f45147ha) {
            boolean z10 = wnVar.ia;
        }
        this.E1.setEmpty();
        if (wnVar.f45097da != 0.0f) {
            int save = canvas.save();
            if (wnVar.f45184ka != 0.0f) {
                f7 = (wnVar.f45339x0.getMeasuredHeight() - wnVar.f45097da) * wnVar.f45184ka;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-wnVar.f45097da) - f7;
            wnVar.Pa = f10;
            canvas.translate(0.0f, f10);
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
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
    public final void k1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.k1(view, f7, f10, z10);
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
                            s1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.H3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.H3;
        pm pmVar = wnVar.f45282s9;
        pmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(pmVar.f24098f0);
            pmVar.f24124z = false;
        }
        if (this.V1 || ((iVar = wnVar.f45221na) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (!kVar.q() && !wnVar.M9()) {
            E1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rj rjVar;
        hm hmVar;
        View view;
        MessageObject messageObject;
        int i14;
        wn wnVar = this.H3;
        if (wnVar.f45235ob && wnVar.f45222nb && getMeasuredHeight() > 0 && getPaddingTop() > 0 && wnVar.A0 != null) {
            wnVar.f45235ob = false;
            wnVar.f45364z0.G = false;
            MessageObject messageObject2 = (MessageObject) wnVar.E6[0].get(wnVar.pb);
            if (messageObject2 != null) {
                i14 = wnVar.K6.indexOf(messageObject2);
            } else {
                i14 = -1;
            }
            if (i14 >= 0) {
                wnVar.f45364z0.i1(wnVar.A0.J + i14, Math.max(AndroidUtilities.dp(50.0f) + wnVar.X8(messageObject2), AndroidUtilities.dp(102.0f)), false);
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (wnVar.pb != 0 && (rjVar = wnVar.f45339x0) != null && (hmVar = wnVar.A0) != null && !hmVar.N && !rjVar.V1) {
            int childCount = rjVar.getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 < childCount) {
                    view = wnVar.f45339x0.getChildAt(i15);
                    if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null && messageObject.getId() == wnVar.pb && messageObject.getDialogId() == wnVar.f45168j6) {
                        break;
                    }
                    i15++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view == null) {
                if (wnVar.f45257qb != Integer.MIN_VALUE) {
                    wnVar.pb = 0;
                    wnVar.f45257qb = Integer.MIN_VALUE;
                }
            } else {
                int i16 = wnVar.f45257qb;
                if (i16 == Integer.MIN_VALUE) {
                    if (wnVar.f45339x0.getPaddingTop() > 0 && !wnVar.f45235ob) {
                        wnVar.f45257qb = view.getTop();
                    }
                } else {
                    int top = view.getTop() - i16;
                    if (top != 0) {
                        wnVar.f45339x0.scrollBy(0, top);
                    }
                }
            }
        }
        int i17 = this.f43056h3;
        int i18 = i12 - i10;
        if (i17 != i18) {
            if (i17 != 0) {
                wnVar.u9(false);
            }
            this.f43056h3 = i18;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.G3 != measuredHeight) {
            this.F3 = true;
            tj tjVar = wnVar.f45352y0;
            if (tjVar != null) {
                tjVar.g();
            }
            wnVar.f45206m9.a();
            this.F3 = false;
            this.G3 = measuredHeight;
        }
        wnVar.f45143h6 = false;
        pm pmVar = wnVar.f45282s9;
        if (pmVar != null && pmVar.x()) {
            wnVar.f45282s9.w();
        }
        wnVar.B9();
        wnVar.P9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        tp tpVar;
        wn wnVar = this.H3;
        oe.b bVar = wnVar.Vc;
        pm pmVar = wnVar.f45282s9;
        pmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(pmVar.f24098f0);
            pmVar.f24124z = false;
        }
        if (motionEvent.getAction() == 0) {
            wnVar.Ia = true;
        }
        if (wnVar.f45097da != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, wnVar.f45097da / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (tpVar = wnVar.f45123fa) != null && !tpVar.R) {
                if (tpVar.K != 1.0f) {
                    float f7 = wnVar.f45097da;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    wnVar.f45135ga = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final rj f42449b;

                        {
                            this.f42449b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wn wnVar2 = this.f42449b.H3;
                                    wnVar2.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar2.f45339x0.invalidate();
                                    return;
                                case 1:
                                    wn wnVar3 = this.f42449b.H3;
                                    wnVar3.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar3.f45339x0.invalidate();
                                    return;
                                case 2:
                                    wn wnVar4 = this.f42449b.H3;
                                    wnVar4.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar4.f45339x0.invalidate();
                                    return;
                                default:
                                    wn wnVar5 = this.f42449b.H3;
                                    wnVar5.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    wnVar5.f45339x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
                    ofFloat.setInterpolator(dsVar);
                    ofFloat.start();
                    final tp tpVar2 = wnVar.f45123fa;
                    xi xiVar = new xi(this, 2);
                    AnimatorSet animatorSet = tpVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        tpVar2.J.cancel();
                    }
                    tpVar2.Y = xiVar;
                    tpVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(tpVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    tp tpVar3 = tpVar2;
                                    tpVar3.getClass();
                                    tpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tpVar3.T.invalidate();
                                    View view = tpVar3.f43689a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tp tpVar4 = tpVar2;
                                    tpVar4.getClass();
                                    tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = tpVar4.f43689a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(tpVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    tp tpVar3 = tpVar2;
                                    tpVar3.getClass();
                                    tpVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tpVar3.T.invalidate();
                                    View view = tpVar3.f43689a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tp tpVar4 = tpVar2;
                                    tpVar4.getClass();
                                    tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = tpVar4.f43689a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    tpVar2.J.addListener(new sp(tpVar2, 0));
                    tpVar2.J.playTogether(ofFloat2, ofFloat3);
                    tpVar2.J.setDuration(120L);
                    tpVar2.J.setInterpolator(dsVar);
                    tpVar2.J.start();
                } else {
                    wn.a2(wnVar);
                }
            } else {
                tp tpVar3 = wnVar.f45123fa;
                if (tpVar3 != null && tpVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    tp tpVar4 = wnVar.f45123fa;
                    if (currentTimeMillis - tpVar4.U < 500 && tpVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        wnVar.f45135ga = animatorSet2;
                        if (wnVar.f45123fa != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(wnVar.f45097da, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final rj f42449b;

                            {
                                this.f42449b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wn wnVar2 = this.f42449b.H3;
                                        wnVar2.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar2.f45339x0.invalidate();
                                        return;
                                    case 1:
                                        wn wnVar3 = this.f42449b.H3;
                                        wnVar3.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar3.f45339x0.invalidate();
                                        return;
                                    case 2:
                                        wn wnVar4 = this.f42449b.H3;
                                        wnVar4.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar4.f45339x0.invalidate();
                                        return;
                                    default:
                                        wn wnVar5 = this.f42449b.H3;
                                        wnVar5.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar5.f45339x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final rj f42449b;

                            {
                                this.f42449b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        wn wnVar2 = this.f42449b.H3;
                                        wnVar2.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar2.f45339x0.invalidate();
                                        return;
                                    case 1:
                                        wn wnVar3 = this.f42449b.H3;
                                        wnVar3.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar3.f45339x0.invalidate();
                                        return;
                                    case 2:
                                        wn wnVar4 = this.f42449b.H3;
                                        wnVar4.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar4.f45339x0.invalidate();
                                        return;
                                    default:
                                        wn wnVar5 = this.f42449b.H3;
                                        wnVar5.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        wnVar5.f45339x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(mi.m.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(wnVar.f45097da, 0.0f);
                wnVar.f45135ga = ofFloat6;
                if (wnVar.f45123fa != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final rj f42449b;

                    {
                        this.f42449b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                wn wnVar2 = this.f42449b.H3;
                                wnVar2.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar2.f45339x0.invalidate();
                                return;
                            case 1:
                                wn wnVar3 = this.f42449b.H3;
                                wnVar3.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar3.f45339x0.invalidate();
                                return;
                            case 2:
                                wn wnVar4 = this.f42449b.H3;
                                wnVar4.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar4.f45339x0.invalidate();
                                return;
                            default:
                                wn wnVar5 = this.f42449b.H3;
                                wnVar5.f45097da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wnVar5.f45339x0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(mi.m.V);
                ofFloat6.start();
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if (!kVar.q() && !wnVar.M9()) {
                E1(motionEvent);
                if (wnVar.f45321v9 || onTouchEvent) {
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
        if (this.H3.f45134g9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.bn0 C4;
        org.telegram.ui.Components.ub1 ub1Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.H3.f45295t9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.s1) && (C4 = ((org.telegram.ui.Cells.s1) view).C4()) != null && (ub1Var = C4.f26870n) != null && C4.f26871r && ub1Var.f33353w && !ub1Var.D) {
                if (ub1Var.f33354x) {
                    if (!ub1Var.f33355y && (ub1Var.K & 3) != 1) {
                        return;
                    }
                } else {
                    return;
                }
            }
            E1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.F3) {
            return;
        }
        jh.a aVar = this.H3.f45258qc;
        if (aVar.f15917b != 0) {
            int childCount = aVar.f15916a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f15916a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(s4.m0 m0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            wn wnVar = this.H3;
            wnVar.A9();
            wnVar.C9();
        }
    }
}
