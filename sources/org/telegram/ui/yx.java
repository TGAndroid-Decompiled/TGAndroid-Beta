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
public final class yx extends org.telegram.ui.Components.aa implements ih.c7 {
    public static final int f44960r3 = 0;
    public boolean Z2;
    public boolean a3;
    public boolean f44961b3;
    public final cy f44962c3;
    public int f44963d3;
    public float f44964e3;
    public final Paint f44965f3;
    public final RectF f44966g3;
    public org.telegram.ui.Components.wk0 f44967h3;
    public LongSparseArray f44968i3;
    public Paint f44969j3;
    public float f44970k3;
    public float f44971l3;
    public float f44972m3;
    public boolean f44973n3;
    public ih.u9 f44974o3;
    public int f44975p3;
    public final dy f44976q3;

    public yx(dy dyVar, Context context, cy cyVar) {
        super(context, null);
        this.f44976q3 = dyVar;
        this.a3 = true;
        this.f44965f3 = new Paint();
        this.f44966g3 = new RectF();
        this.f44971l3 = 1.0f;
        this.f44962c3 = cyVar;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i9;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        cy cyVar = this.f44962c3;
        cyVar.v = i9;
        kw kwVar = cyVar.f37355n;
        if (kwVar != null) {
            if (i9 != 0) {
                z10 = true;
            }
            kwVar.X = z10;
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
        int paddingTop = (int) (getPaddingTop() + this.f44976q3.J);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        view.setTranslationY(dy.f37627w4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f44976q3.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).f25037r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return dy.f37627w4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cy cyVar = this.f44962c3;
        if (cyVar.f37355n != null && dy.f37627w4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            cyVar.f37355n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.T1) {
            dy dyVar = this.f44976q3;
            if (!dyVar.X0 && !this.f44962c3.f37359x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                    dyVar.Y0 = !kVar.s();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f44963d3 = getPaddingTop();
        this.f44976q3.f37730t3 = 0.0f;
        this.f44962c3.getClass();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        float f10;
        cy[] cyVarArr;
        AnimatorSet animatorSet;
        cy cyVar = this.f44962c3;
        int L0 = cyVar.f37352c.L0();
        dy dyVar = this.f44976q3;
        if (L0 != -1 && cyVar.f37353e.f5378y == 0 && cyVar.f37352c.f5441y < 0 && cyVar.f37350a.getScrollState() != 1) {
            f2.q1 K = cyVar.f37350a.K(L0);
            if (K != null) {
                int top = K.f5501a.getTop();
                if (cyVar.f37357s == 0 && dyVar.Z3() && cyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f44961b3 = true;
                cyVar.f37352c.h1(L0, (int) ((top - this.f44963d3) + dyVar.f37730t3 + 0));
                this.f44961b3 = false;
            }
        } else if (L0 == -1 && this.a3) {
            hw hwVar = cyVar.f37352c;
            if (cyVar.f37357s == 0 && dyVar.Z3()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            hwVar.h1(i11, (int) dyVar.J);
        }
        this.f44961b3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int i13 = currentActionBarHeight + i12;
        if (dyVar.G && !dyVar.K) {
            i13 += AndroidUtilities.dp(81.0f);
        }
        if (!dyVar.K) {
            i13 += AndroidUtilities.dp(48.0f);
        }
        this.f44975p3 = 0;
        float S3 = dyVar.S3(false);
        org.telegram.ui.Components.bs bsVar = dyVar.F1;
        if (bsVar != null) {
            f10 = bsVar.getMetadata().f47790c.f47800a;
        } else {
            f10 = 0.0f;
        }
        int dp = i13 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f44975p3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.bs bsVar2 = dyVar.F1;
        if (bsVar2 != null) {
            int c10 = (int) bsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.f44975p3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        this.f44975p3 -= AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        int n32 = dyVar.n3();
        if (dp2 != this.U2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (dyVar.G) {
                cyVar.f37358w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                cyVar.f37358w.setPaddingTop(dp2);
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                if (getChildAt(i14) instanceof of.l) {
                    getChildAt(i14).requestLayout();
                }
            }
        }
        this.f44961b3 = false;
        if (this.a3 && dyVar.getMessagesController().dialogsLoaded) {
            if (cyVar.f37357s == 0 && dyVar.Z3()) {
                this.f44961b3 = true;
                ((f2.m0) getLayoutManager()).h1(1, (int) dyVar.J);
                this.f44961b3 = false;
            }
            this.a3 = false;
        }
        super.onMeasure(i9, i10);
        if (!dyVar.f37668h2 && dp2 != 0 && (cyVarArr = dyVar.f37629a0) != null && cyVarArr.length > 1 && !dyVar.f37669h3 && (animatorSet = dyVar.f37636b3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.q1 q1Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        char c10;
        if (!this.T1) {
            dy dyVar = this.f44976q3;
            if (dyVar.X0 || dyVar.f37749y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            cy cyVar = this.f44962c3;
            if (action == 1 || action == 3) {
                f2.h0 h0Var = cyVar.f37353e;
                if (h0Var.f5378y != 0) {
                    ay ayVar = cyVar.f37354f;
                    if (ayVar.f36574e) {
                        ayVar.f36575f = true;
                        if (h0Var.f(null, 4) != 0 && (q1Var = cyVar.f37354f.d) != null) {
                            View view = q1Var.f5501a;
                            if (view instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                long dialogId = r2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    z1(false, r2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(dyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            dyVar = dyVar;
                                            dyVar.r4(arrayList, 111, true, false, null);
                                        } else {
                                            dyVar = dyVar;
                                            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i9) != 1) {
                                                i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 3) {
                                                    i11 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 0) {
                                                        i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            dyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        dyVar.J2 = !dyVar.g4(dialog);
                                                        dyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!dyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.oc.a(dyVar)) {
                                                        org.telegram.ui.Components.oc.z(dyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i13 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                    dyVar.K2 = !MessagesController.getInstance(i13).isDialogMuted(dialogId, 0L);
                                                    if (dyVar.K2 > 0) {
                                                        i14 = 0;
                                                    } else {
                                                        i14 = 1;
                                                    }
                                                    dyVar.L2 = i14;
                                                    dyVar.r4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = 1;
                                                }
                                                dyVar.I2 = i15;
                                                dyVar.r4(arrayList5, 101, true, false, null);
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
            if (cyVar.f37357s == 0 && ((action == 1 || action == 3) && cyVar.v == 2 && dyVar.Z3() && ((f2.m0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.r2 Q3 = dy.Q3(cyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f10 = 76.0f;
                    } else {
                        f10 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f10) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - dyVar.Y2;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (cyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                dyVar.a2 = true;
                                v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                            }
                            if (!dyVar.a3) {
                                dyVar.a3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                kw kwVar = cyVar.f37355n;
                                if (kwVar != null) {
                                    kwVar.a(true);
                                }
                            }
                            Q3.Z();
                            cyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c10 = 0;
                    } else {
                        dyVar.a2 = true;
                        c10 = 0;
                        v0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                        cyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c10] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new f3(this, 10));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ll.c(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.y11(this, 25));
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
        if (this.f44961b3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(f2.r0 r0Var) {
        super.setAdapter(r0Var);
        this.a3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f44964e3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        dy.f37627w4 = f10;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setTranslationY(f10);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.C1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
            this.f34287z1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean u1() {
        return true;
    }

    @Override
    public final int w1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void y1(org.telegram.ui.ww r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.y1(org.telegram.ui.ww, float, boolean):void");
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        dy dyVar = this.f44976q3;
        UndoView Y3 = dyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (r2Var != null) {
                dyVar.a2 = true;
                dyVar.X0 = true;
                int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
                if (dyVar.G && !dyVar.A0.g()) {
                    dyVar.N = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.gr.f28845g);
                if (z10) {
                    dyVar.Z0 = true;
                } else {
                    A1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        A1();
        if (z10 && r2Var != null) {
            r2Var.T();
            r2Var.invalidate();
        }
    }
}
