package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class wx extends org.telegram.ui.Components.ka implements di.o7 {
    public static final int C3 = 0;
    public int A3;
    public final cy B3;
    public boolean f45569k3;
    public boolean f45570l3;
    public boolean f45571m3;
    public final ay f45572n3;
    public int f45573o3;
    public float f45574p3;
    public final Paint f45575q3;
    public final RectF f45576r3;
    public org.telegram.ui.Components.mm0 f45577s3;
    public LongSparseArray f45578t3;
    public Paint f45579u3;
    public float f45580v3;
    public float f45581w3;
    public float f45582x3;
    public boolean y3;
    public di.ga f45583z3;

    public wx(cy cyVar, Context context, ay ayVar) {
        super(context, null);
        this.B3 = cyVar;
        this.f45570l3 = true;
        this.f45575q3 = new Paint();
        this.f45576r3 = new RectF();
        this.f45581w3 = 1.0f;
        this.f45572n3 = ayVar;
        this.f29889i3 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final int C1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void E1(org.telegram.ui.rw r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.E1(org.telegram.ui.rw, float, boolean):void");
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.q4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        SharedConfig.toggleArchiveHidden();
        cy cyVar = this.B3;
        UndoView g42 = cyVar.g4();
        if (SharedConfig.archiveHidden) {
            if (p2Var != null) {
                cyVar.f38588e2 = true;
                cyVar.f38571b1 = true;
                int top = (p2Var.getTop() - getPaddingTop()) + p2Var.getMeasuredHeight();
                if (cyVar.K && !cyVar.E0.g()) {
                    cyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.ds.f27587g);
                if (z10) {
                    cyVar.f38582d1 = true;
                } else {
                    G1();
                }
            }
            g42.l(0L, 6, null, null);
            return;
        }
        g42.l(0L, 7, null, null);
        G1();
        if (z10 && p2Var != null) {
            p2Var.T();
            p2Var.invalidate();
        }
    }

    public final void G1() {
        int i10;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ay ayVar = this.f45572n3;
        ayVar.v = i10;
        fw fwVar = ayVar.f37917n;
        if (fwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            fwVar.X = z10;
        }
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(cy.B4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.B3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) view).f24712r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return cy.B4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ay ayVar = this.f45572n3;
        if (ayVar.f37917n != null && cy.B4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ayVar.f37917n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.V1) {
            cy cyVar = this.B3;
            if (!cyVar.f38571b1 && !this.f45572n3.f37921x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                    cyVar.f38577c1 = !kVar.q();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f45573o3 = getPaddingTop();
        this.B3.y3 = 0.0f;
        this.f45572n3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        ay[] ayVarArr;
        AnimatorSet animatorSet;
        ay ayVar = this.f45572n3;
        int L0 = ayVar.f37915c.L0();
        cy cyVar = this.B3;
        if (L0 != -1 && ayVar.e.f47870y == 0 && ayVar.f37915c.f47717y < 0 && ayVar.f37913a.getScrollState() != 1) {
            s4.e1 K = ayVar.f37913a.K(L0);
            if (K != null) {
                int top = K.f47738a.getTop();
                if (ayVar.f37919s == 0 && cyVar.h4() && ayVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f45571m3 = true;
                ayVar.f37915c.h1(L0, (int) ((top - this.f45573o3) + cyVar.y3 + 0));
                this.f45571m3 = false;
            }
        } else if (L0 == -1 && this.f45570l3) {
            cw cwVar = ayVar.f37915c;
            if (ayVar.f37919s == 0 && cyVar.h4()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            cwVar.h1(i12, (int) cyVar.N);
        }
        this.f45571m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (cyVar.K && !cyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!cyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.A3 = 0;
        float a42 = cyVar.a4(false);
        org.telegram.ui.Components.ws wsVar = cyVar.J1;
        if (wsVar != null) {
            f7 = wsVar.getMetadata().f19343c.f19351a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * a42));
        this.A3 += (int) (AndroidUtilities.dp(50.0f) * a42);
        org.telegram.ui.Components.ws wsVar2 = cyVar.J1;
        if (wsVar2 != null) {
            int c10 = (int) wsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), a42));
            dp += c10;
            this.A3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(a42, f7) * 5.0f);
        this.A3 -= AndroidUtilities.dp(Math.max(a42, f7) * 5.0f);
        int t32 = cyVar.t3();
        if (dp2 != this.f29887g3 || t32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, t32);
            if (cyVar.K) {
                ayVar.f37920w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                ayVar.f37920w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof ig.m) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f45571m3 = false;
        if (this.f45570l3 && cyVar.getMessagesController().dialogsLoaded) {
            if (ayVar.f37919s == 0 && cyVar.h4()) {
                this.f45571m3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) cyVar.N);
                this.f45571m3 = false;
            }
            this.f45570l3 = false;
        }
        super.onMeasure(i10, i11);
        if (!cyVar.f38623l2 && dp2 != 0 && (ayVarArr = cyVar.f38586e0) != null && ayVarArr.length > 1 && !cyVar.f38627m3 && (animatorSet = cyVar.f38600g3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.e1 e1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        char c10;
        if (!this.V1) {
            cy cyVar = this.B3;
            if (!cyVar.f38571b1 && !cyVar.f38689y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                ay ayVar = this.f45572n3;
                if (action == 1 || action == 3) {
                    s4.z zVar = ayVar.e;
                    if (zVar.f47870y != 0) {
                        zx zxVar = ayVar.f37916f;
                        if (zxVar.e) {
                            zxVar.f46381f = true;
                            if (zVar.i(null, 4) != 0 && (e1Var = ayVar.f37916f.d) != null) {
                                View view = e1Var.f47738a;
                                if (view instanceof org.telegram.ui.Cells.p2) {
                                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                                    long dialogId = p2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        F1(false, p2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(cyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                cyVar = cyVar;
                                                cyVar.z4(arrayList, 111, true, false, null);
                                            } else {
                                                cyVar = cyVar;
                                                i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                arrayList2.add(Long.valueOf(dialogId));
                                                                cyVar.z4(arrayList2, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            cyVar.O2 = !cyVar.o4(dialog);
                                                            cyVar.z4(arrayList3, 100, true, false, null);
                                                        }
                                                    } else if (!cyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.wc.a(cyVar)) {
                                                            org.telegram.ui.Components.wc.z(cyVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                        cyVar.P2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                        if (cyVar.P2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        cyVar.Q2 = i15;
                                                        cyVar.z4(arrayList4, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    arrayList5.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    cyVar.N2 = i16;
                                                    cyVar.z4(arrayList5, 101, true, false, null);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (ayVar.f37919s == 0 && ((action == 1 || action == 3) && ayVar.v == 2 && cyVar.h4() && ((s4.c0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.p2 Y3 = cy.Y3(ayVar);
                    if (Y3 != null) {
                        if (SharedConfig.useThreeLinesLayout) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                        int measuredHeight = Y3.getMeasuredHeight() + (Y3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - cyVar.f38584d3;
                        if (measuredHeight >= dp && currentTimeMillis >= 200) {
                            if (ayVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    cyVar.f38588e2 = true;
                                    w0(0, Y3.getTop() - paddingTop, org.telegram.ui.Components.ds.h);
                                }
                                if (!cyVar.f38595f3) {
                                    cyVar.f38595f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    fw fwVar = ayVar.f37917n;
                                    if (fwVar != null) {
                                        fwVar.a(true);
                                    }
                                }
                                Y3.Z();
                                ayVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        } else {
                            cyVar.f38588e2 = true;
                            c10 = 0;
                            w0(0, measuredHeight, org.telegram.ui.Components.ds.h);
                            ayVar.v = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new b3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.vh.w(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.h31(this, 27));
                            ofFloat.start();
                        }
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void requestLayout() {
        if (this.f45571m3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f45570l3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f45574p3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        cy.B4 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean z1() {
        return true;
    }
}
