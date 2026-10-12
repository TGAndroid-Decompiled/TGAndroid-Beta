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
public final class ry extends org.telegram.ui.Components.ka implements ai.t9 {
    public static final int f41749t3 = 0;
    public boolean f41750b3;
    public boolean f41751c3;
    public boolean f41752d3;
    public final uy f41753e3;
    public int f41754f3;
    public float f41755g3;
    public final Paint f41756h3;
    public final RectF f41757i3;
    public org.telegram.ui.Components.wm0 j3;
    public LongSparseArray f41758k3;
    public Paint f41759l3;
    public float f41760m3;
    public float f41761n3;
    public float f41762o3;
    public boolean f41763p3;
    public ai.sc f41764q3;
    public int f41765r3;
    public final vy f41766s3;

    public ry(vy vyVar, Context context, uy uyVar) {
        super(context, null);
        this.f41766s3 = vyVar;
        this.f41751c3 = true;
        this.f41756h3 = new Paint();
        this.f41757i3 = new RectF();
        this.f41761n3 = 1.0f;
        this.f41753e3 = uyVar;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        vy vyVar = this.f41766s3;
        UndoView V3 = vyVar.V3();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                vyVar.f42905e2 = true;
                vyVar.f42887b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (vyVar.K && !vyVar.E0.g()) {
                    vyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.js.f27628g);
                if (z10) {
                    vyVar.f42898d1 = true;
                } else {
                    B1();
                }
            }
            V3.l(0L, 6, null, null);
            return;
        }
        V3.l(0L, 7, null, null);
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
        uy uyVar = this.f41753e3;
        uyVar.v = i10;
        bx bxVar = uyVar.f42616n;
        if (bxVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            bxVar.X = z10;
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
        int paddingTop = (int) (getPaddingTop() + this.f41766s3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(vy.f42879z4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ry.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f41766s3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f22611r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return vy.f42879z4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        uy uyVar = this.f41753e3;
        if (uyVar.f42616n != null && vy.f42879z4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            uyVar.f42616n.c(canvas, true);
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
            vy vyVar = this.f41766s3;
            if (!vyVar.f42887b1 && !this.f41753e3.f42620x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                    vyVar.f42893c1 = !kVar.u();
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
        this.f41754f3 = getPaddingTop();
        this.f41766s3.f43002x3 = 0.0f;
        this.f41753e3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        uy[] uyVarArr;
        AnimatorSet animatorSet;
        uy uyVar = this.f41753e3;
        int L0 = uyVar.f42613c.L0();
        vy vyVar = this.f41766s3;
        if (L0 != -1 && uyVar.f42614e.f48057y == 0 && uyVar.f42613c.f47886y < 0 && uyVar.f42611a.getScrollState() != 1) {
            s4.d1 K = uyVar.f42611a.K(L0);
            if (K != null) {
                int top = K.f47889a.getTop();
                if (uyVar.f42618s == 0 && vyVar.W3() && uyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f41752d3 = true;
                uyVar.f42613c.h1(L0, (int) ((top - this.f41754f3) + vyVar.f43002x3 + 0));
                this.f41752d3 = false;
            }
        } else if (L0 == -1 && this.f41751c3) {
            yw ywVar = uyVar.f42613c;
            if (uyVar.f42618s == 0 && vyVar.W3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            ywVar.h1(i12, (int) vyVar.N);
        }
        this.f41752d3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (vyVar.K && !vyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!vyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f41765r3 = 0;
        float P3 = vyVar.P3(false);
        org.telegram.ui.Components.ct ctVar = vyVar.J1;
        if (ctVar != null) {
            f7 = ctVar.getMetadata().f16105c.f16115a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * P3));
        this.f41765r3 += (int) (AndroidUtilities.dp(50.0f) * P3);
        org.telegram.ui.Components.ct ctVar2 = vyVar.J1;
        if (ctVar2 != null) {
            int c10 = (int) ctVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), P3));
            dp += c10;
            this.f41765r3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        this.f41765r3 -= AndroidUtilities.dp(Math.max(P3, f7) * 5.0f);
        int k32 = vyVar.k3();
        if (dp2 != this.W2 || k32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, k32);
            if (vyVar.K) {
                uyVar.f42619w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                uyVar.f42619w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f41752d3 = false;
        if (this.f41751c3 && vyVar.getMessagesController().dialogsLoaded) {
            if (uyVar.f42618s == 0 && vyVar.W3()) {
                this.f41752d3 = true;
                ((s4.d0) getLayoutManager()).h1(1, (int) vyVar.N);
                this.f41752d3 = false;
            }
            this.f41751c3 = false;
        }
        super.onMeasure(i10, i11);
        if (!vyVar.f42939l2 && dp2 != 0 && (uyVarArr = vyVar.f42903e0) != null && uyVarArr.length > 1 && !vyVar.f42940l3 && (animatorSet = vyVar.f42912f3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.d1 d1Var;
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
            vy vyVar = this.f41766s3;
            if (!vyVar.f42887b1 && !vyVar.f43003y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                uy uyVar = this.f41753e3;
                if (action == 1 || action == 3) {
                    s4.z zVar = uyVar.f42614e;
                    if (zVar.f48057y != 0) {
                        ty tyVar = uyVar.f42615f;
                        if (tyVar.f42312e) {
                            tyVar.f42313f = true;
                            if (zVar.g(null, 4) != 0 && (d1Var = uyVar.f42615f.d) != null) {
                                View view = d1Var.f47889a;
                                if (view instanceof org.telegram.ui.Cells.s2) {
                                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                    long dialogId = s2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        A1(false, s2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) vyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(vyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                vyVar = vyVar;
                                                vyVar.o4(arrayList, 111, true, false, null);
                                            } else {
                                                vyVar = vyVar;
                                                i10 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                arrayList2.add(Long.valueOf(dialogId));
                                                                vyVar.o4(arrayList2, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            vyVar.N2 = !vyVar.d4(dialog);
                                                            vyVar.o4(arrayList3, 100, true, false, null);
                                                        }
                                                    } else if (!vyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.zc.a(vyVar)) {
                                                            org.telegram.ui.Components.zc.z(vyVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                                                        vyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                        if (vyVar.O2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        vyVar.P2 = i15;
                                                        vyVar.o4(arrayList4, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    arrayList5.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    vyVar.M2 = i16;
                                                    vyVar.o4(arrayList5, 101, true, false, null);
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
                if (uyVar.f42618s == 0 && ((action == 1 || action == 3) && uyVar.v == 2 && vyVar.W3() && ((s4.d0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.s2 N3 = vy.N3(uyVar);
                    if (N3 != null) {
                        if (SharedConfig.useThreeLinesLayout) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                        int measuredHeight = N3.getMeasuredHeight() + (N3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - vyVar.f42895c3;
                        if (measuredHeight >= dp && currentTimeMillis >= 200) {
                            if (uyVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    vyVar.f42905e2 = true;
                                    v0(0, N3.getTop() - paddingTop, org.telegram.ui.Components.js.h);
                                }
                                if (!vyVar.f42906e3) {
                                    vyVar.f42906e3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    bx bxVar = uyVar.f42616n;
                                    if (bxVar != null) {
                                        bxVar.a(true);
                                    }
                                }
                                N3.a0();
                                uyVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        } else {
                            vyVar.f42905e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.js.h);
                            uyVar.v = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new c3(this, 10));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.am.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.js.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.o91(this, 20));
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
        if (this.f41752d3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.f41751c3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f41755g3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        vy.f42879z4 = f7;
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

    public final void z1(org.telegram.ui.nx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ry.z1(org.telegram.ui.nx, float, boolean):void");
    }
}
