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
public final class qy extends org.telegram.ui.Components.ja implements ai.s9 {
    public static final int C3 = 0;
    public int A3;
    public final uy B3;
    public boolean f39839k3;
    public boolean f39840l3;
    public boolean f39841m3;
    public final ty f39842n3;
    public int f39843o3;
    public float f39844p3;
    public final Paint f39845q3;
    public final RectF f39846r3;
    public org.telegram.ui.Components.zl0 f39847s3;
    public LongSparseArray f39848t3;
    public Paint f39849u3;
    public float f39850v3;
    public float f39851w3;
    public float f39852x3;
    public boolean y3;
    public ai.rc f39853z3;

    public qy(uy uyVar, Context context, ty tyVar) {
        super(context, null);
        this.B3 = uyVar;
        this.f39840l3 = true;
        this.f39845q3 = new Paint();
        this.f39846r3 = new RectF();
        this.f39851w3 = 1.0f;
        this.f39842n3 = tyVar;
        this.f27705i3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(org.telegram.ui.kx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qy.A1(org.telegram.ui.kx, float, boolean):void");
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        uy uyVar = this.B3;
        UndoView h42 = uyVar.h4();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                uyVar.f41395e2 = true;
                uyVar.f41377b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (uyVar.K && !uyVar.E0.g()) {
                    uyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.tr.f31142g);
                if (z10) {
                    uyVar.f41388d1 = true;
                } else {
                    C1();
                }
            }
            h42.l(0L, 6, null, null);
            return;
        }
        h42.l(0L, 7, null, null);
        C1();
        if (z10 && s2Var != null) {
            s2Var.S();
            s2Var.invalidate();
        }
    }

    public final void C1() {
        int i10;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        ty tyVar = this.f39842n3;
        tyVar.v = i10;
        yw ywVar = tyVar.f40989n;
        if (ywVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            ywVar.X = z10;
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
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
        view.setTranslationY(uy.f41369y4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qy.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.B3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f22852r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return uy.f41369y4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ty tyVar = this.f39842n3;
        if (tyVar.f40989n != null && uy.f41369y4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            tyVar.f40989n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.X1) {
            uy uyVar = this.B3;
            if (!uyVar.f41377b1 && !this.f39842n3.f40993x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    uyVar.f41383c1 = !kVar.s();
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
        this.f39843o3 = getPaddingTop();
        this.B3.f41491x3 = 0.0f;
        this.f39842n3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        ty[] tyVarArr;
        AnimatorSet animatorSet;
        ty tyVar = this.f39842n3;
        int L0 = tyVar.f40986c.L0();
        uy uyVar = this.B3;
        if (L0 != -1 && tyVar.f40987e.f46691y == 0 && tyVar.f40986c.f46521y < 0 && tyVar.f40984a.getScrollState() != 1) {
            s4.c1 K = tyVar.f40984a.K(L0);
            if (K != null) {
                int top = K.f46524a.getTop();
                if (tyVar.f40991s == 0 && uyVar.i4() && tyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f39841m3 = true;
                tyVar.f40986c.h1(L0, (int) ((top - this.f39843o3) + uyVar.f41491x3 + 0));
                this.f39841m3 = false;
            }
        } else if (L0 == -1 && this.f39840l3) {
            vw vwVar = tyVar.f40986c;
            if (tyVar.f40991s == 0 && uyVar.i4()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            vwVar.h1(i12, (int) uyVar.N);
        }
        this.f39841m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (uyVar.K && !uyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!uyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.A3 = 0;
        float b42 = uyVar.b4(false);
        org.telegram.ui.Components.ns nsVar = uyVar.J1;
        if (nsVar != null) {
            f7 = nsVar.getMetadata().f15453c.f15463a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * b42));
        this.A3 += (int) (AndroidUtilities.dp(50.0f) * b42);
        org.telegram.ui.Components.ns nsVar2 = uyVar.J1;
        if (nsVar2 != null) {
            int c10 = (int) nsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), b42));
            dp += c10;
            this.A3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(b42, f7) * 5.0f);
        this.A3 -= AndroidUtilities.dp(Math.max(b42, f7) * 5.0f);
        int w32 = uyVar.w3();
        if (dp2 != this.f27702f3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, w32);
            if (uyVar.K) {
                tyVar.f40992w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                tyVar.f40992w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f39841m3 = false;
        if (this.f39840l3 && uyVar.getMessagesController().dialogsLoaded) {
            if (tyVar.f40991s == 0 && uyVar.i4()) {
                this.f39841m3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) uyVar.N);
                this.f39841m3 = false;
            }
            this.f39840l3 = false;
        }
        super.onMeasure(i10, i11);
        if (!uyVar.f41429l2 && dp2 != 0 && (tyVarArr = uyVar.f41393e0) != null && tyVarArr.length > 1 && !uyVar.f41430l3 && (animatorSet = uyVar.f41402f3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c1 c1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        char c10;
        if (!this.X1) {
            uy uyVar = this.B3;
            if (uyVar.f41377b1 || uyVar.f41492y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            ty tyVar = this.f39842n3;
            if (action == 1 || action == 3) {
                s4.y yVar = tyVar.f40987e;
                if (yVar.f46691y != 0) {
                    sy syVar = tyVar.f40988f;
                    if (syVar.f40630e) {
                        syVar.f40631f = true;
                        if (yVar.g(null, 4) != 0 && (c1Var = tyVar.f40988f.d) != null) {
                            View view = c1Var.f46524a;
                            if (view instanceof org.telegram.ui.Cells.s2) {
                                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                long dialogId = s2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    B1(false, s2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(uyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            uyVar = uyVar;
                                            uyVar.A4(arrayList, 111, true, false, null);
                                        } else {
                                            uyVar = uyVar;
                                            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            uyVar.A4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        uyVar.N2 = !uyVar.p4(dialog);
                                                        uyVar.A4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!uyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.yc.a(uyVar)) {
                                                        org.telegram.ui.Components.yc.z(uyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                    uyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (uyVar.O2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    uyVar.P2 = i15;
                                                    uyVar.A4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                uyVar.M2 = i16;
                                                uyVar.A4(arrayList5, 101, true, false, null);
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
            if (tyVar.f40991s == 0 && ((action == 1 || action == 3) && tyVar.v == 2 && uyVar.i4() && ((s4.c0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.s2 Z3 = uy.Z3(tyVar);
                if (Z3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 76.0f;
                    } else {
                        f7 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = Z3.getMeasuredHeight() + (Z3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - uyVar.f41385c3;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (tyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                uyVar.f41395e2 = true;
                                w0(0, Z3.getTop() - paddingTop, org.telegram.ui.Components.tr.h);
                            }
                            if (!uyVar.f41396e3) {
                                uyVar.f41396e3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                yw ywVar = tyVar.f40989n;
                                if (ywVar != null) {
                                    ywVar.a(true);
                                }
                            }
                            Z3.Z();
                            tyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c10 = 0;
                    } else {
                        uyVar.f41395e2 = true;
                        c10 = 0;
                        w0(0, measuredHeight, org.telegram.ui.Components.tr.h);
                        tyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c10] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new c3(this, 9));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ok.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.a91(this, 20));
                        ofFloat.start();
                    }
                }
            }
            return onTouchEvent;
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
        if (this.f39841m3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f39840l3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f39844p3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        uy.f41369y4 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.E1 != -1 && (m10 = getLayoutManager().m(this.E1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.G1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.D1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean w1() {
        return true;
    }

    @Override
    public final int y1() {
        return AndroidUtilities.dp(48.0f);
    }
}
