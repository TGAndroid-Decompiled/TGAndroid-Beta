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
public final class uy extends org.telegram.ui.Components.ka implements bi.e9 {
    public static final int f40506t3 = 0;
    public boolean f40507b3;
    public boolean f40508c3;
    public boolean f40509d3;
    public final xy f40510e3;
    public int f40511f3;
    public float f40512g3;
    public final Paint f40513h3;
    public final RectF f40514i3;
    public org.telegram.ui.Components.mm0 f40515j3;
    public LongSparseArray f40516k3;
    public Paint f40517l3;
    public float f40518m3;
    public float f40519n3;
    public float f40520o3;
    public boolean f40521p3;
    public bi.ac f40522q3;
    public int f40523r3;
    public final yy f40524s3;

    public uy(yy yyVar, Context context, xy xyVar) {
        super(context, null);
        this.f40524s3 = yyVar;
        this.f40508c3 = true;
        this.f40513h3 = new Paint();
        this.f40514i3 = new RectF();
        this.f40519n3 = 1.0f;
        this.f40510e3 = xyVar;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        yy yyVar = this.f40524s3;
        UndoView W3 = yyVar.W3();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                yyVar.f42006e2 = true;
                yyVar.f41989b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (yyVar.K && !yyVar.E0.g()) {
                    yyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.es.f24466g);
                if (z10) {
                    yyVar.f42000d1 = true;
                } else {
                    B1();
                }
            }
            W3.l(0L, 6, null, null);
            return;
        }
        W3.l(0L, 7, null, null);
        B1();
        if (z10 && s2Var != null) {
            s2Var.U();
            s2Var.invalidate();
        }
    }

    public final void B1() {
        int i10;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        xy xyVar = this.f40510e3;
        xyVar.v = i10;
        ex exVar = xyVar.f41683n;
        if (exVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            exVar.X = z10;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f40524s3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(yy.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f40524s3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f21583r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return yy.A4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xy xyVar = this.f40510e3;
        if (xyVar.f41683n != null && yy.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            xyVar.f41683n.c(canvas, true);
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
            yy yyVar = this.f40524s3;
            if (!yyVar.f41989b1 && !this.f40510e3.f41687x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                    yyVar.f41995c1 = !kVar.t();
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
        this.f40511f3 = getPaddingTop();
        this.f40524s3.y3 = 0.0f;
        this.f40510e3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        xy[] xyVarArr;
        AnimatorSet animatorSet;
        xy xyVar = this.f40510e3;
        int L0 = xyVar.f41681c.L0();
        yy yyVar = this.f40524s3;
        if (L0 != -1 && xyVar.e.f44993y == 0 && xyVar.f41681c.f44835y < 0 && xyVar.f41679a.getScrollState() != 1) {
            s4.b1 K = xyVar.f41679a.K(L0);
            if (K != null) {
                int top = K.f44838a.getTop();
                if (xyVar.f41685s == 0 && yyVar.X3() && xyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f40509d3 = true;
                xyVar.f41681c.h1(L0, (int) ((top - this.f40511f3) + yyVar.y3 + 0));
                this.f40509d3 = false;
            }
        } else if (L0 == -1 && this.f40508c3) {
            bx bxVar = xyVar.f41681c;
            if (xyVar.f41685s == 0 && yyVar.X3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            bxVar.h1(i12, (int) yyVar.N);
        }
        this.f40509d3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (yyVar.K && !yyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!yyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f40523r3 = 0;
        float Q3 = yyVar.Q3(false);
        org.telegram.ui.Components.xs xsVar = yyVar.J1;
        if (xsVar != null) {
            f7 = xsVar.getMetadata().f16019c.f16027a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * Q3));
        this.f40523r3 += (int) (AndroidUtilities.dp(50.0f) * Q3);
        org.telegram.ui.Components.xs xsVar2 = yyVar.J1;
        if (xsVar2 != null) {
            int c10 = (int) xsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), Q3));
            dp += c10;
            this.f40523r3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        this.f40523r3 -= AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        int k32 = yyVar.k3();
        if (dp2 != this.W2 || k32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, k32);
            if (yyVar.K) {
                xyVar.f41686w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                xyVar.f41686w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof hg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f40509d3 = false;
        if (this.f40508c3 && yyVar.getMessagesController().dialogsLoaded) {
            if (xyVar.f41685s == 0 && yyVar.X3()) {
                this.f40509d3 = true;
                ((s4.b0) getLayoutManager()).h1(1, (int) yyVar.N);
                this.f40509d3 = false;
            }
            this.f40508c3 = false;
        }
        super.onMeasure(i10, i11);
        if (!yyVar.f42041l2 && dp2 != 0 && (xyVarArr = yyVar.f42004e0) != null && xyVarArr.length > 1 && !yyVar.f42045m3 && (animatorSet = yyVar.f42018g3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.b1 b1Var;
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
            yy yyVar = this.f40524s3;
            if (!yyVar.f41989b1 && !yyVar.f42106y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                xy xyVar = this.f40510e3;
                if (action == 1 || action == 3) {
                    s4.y yVar = xyVar.e;
                    if (yVar.f44993y != 0) {
                        wy wyVar = xyVar.f41682f;
                        if (wyVar.e) {
                            wyVar.f41379f = true;
                            if (yVar.g(null, 4) != 0 && (b1Var = xyVar.f41682f.d) != null) {
                                View view = b1Var.f44838a;
                                if (view instanceof org.telegram.ui.Cells.s2) {
                                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                    long dialogId = s2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        A1(false, s2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) yyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(yyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                yyVar = yyVar;
                                                yyVar.p4(arrayList, 111, true, false, null);
                                            } else {
                                                yyVar = yyVar;
                                                i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                arrayList2.add(Long.valueOf(dialogId));
                                                                yyVar.p4(arrayList2, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            yyVar.O2 = !yyVar.e4(dialog);
                                                            yyVar.p4(arrayList3, 100, true, false, null);
                                                        }
                                                    } else if (!yyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.zc.a(yyVar)) {
                                                            org.telegram.ui.Components.zc.z(yyVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                                                        yyVar.P2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                        if (yyVar.P2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        yyVar.Q2 = i15;
                                                        yyVar.p4(arrayList4, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    arrayList5.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    yyVar.N2 = i16;
                                                    yyVar.p4(arrayList5, 101, true, false, null);
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
                if (xyVar.f41685s == 0 && ((action == 1 || action == 3) && xyVar.v == 2 && yyVar.X3() && ((s4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.s2 O3 = yy.O3(xyVar);
                    if (O3 != null) {
                        if (SharedConfig.useThreeLinesLayout) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                        int measuredHeight = O3.getMeasuredHeight() + (O3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - yyVar.f42002d3;
                        if (measuredHeight >= dp && currentTimeMillis >= 200) {
                            if (xyVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    yyVar.f42006e2 = true;
                                    v0(0, O3.getTop() - paddingTop, org.telegram.ui.Components.es.h);
                                }
                                if (!yyVar.f42013f3) {
                                    yyVar.f42013f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    ex exVar = xyVar.f41683n;
                                    if (exVar != null) {
                                        exVar.a(true);
                                    }
                                }
                                O3.a0();
                                xyVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        } else {
                            yyVar.f42006e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.es.h);
                            xyVar.v = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new e3(this, 10));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.sk.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.v61(this, 23));
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
        if (this.f40509d3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f40508c3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f40512g3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        yy.A4 = f7;
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
    public final boolean v1() {
        return true;
    }

    @Override
    public final int x1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void z1(org.telegram.ui.qx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.z1(org.telegram.ui.qx, float, boolean):void");
    }
}
