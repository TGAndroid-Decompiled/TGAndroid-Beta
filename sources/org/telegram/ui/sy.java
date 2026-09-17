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
public final class sy extends org.telegram.ui.Components.ga implements ai.s9 {
    public static final int f37567v3 = 0;
    public boolean f37568d3;
    public boolean f37569e3;
    public boolean f37570f3;
    public final vy f37571g3;
    public int f37572h3;
    public float f37573i3;
    public final Paint j3;
    public final RectF f37574k3;
    public org.telegram.ui.Components.ml0 f37575l3;
    public LongSparseArray f37576m3;
    public Paint f37577n3;
    public float f37578o3;
    public float f37579p3;
    public float f37580q3;
    public boolean f37581r3;
    public ai.rc f37582s3;
    public int f37583t3;
    public final wy f37584u3;

    public sy(wy wyVar, Context context, vy vyVar) {
        super(context, null);
        this.f37584u3 = wyVar;
        this.f37569e3 = true;
        this.j3 = new Paint();
        this.f37574k3 = new RectF();
        this.f37579p3 = 1.0f;
        this.f37571g3 = vyVar;
        this.f24153b3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        wy wyVar = this.f37584u3;
        UndoView Y3 = wyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (r2Var != null) {
                wyVar.f39217e2 = true;
                wyVar.f39200b1 = true;
                int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
                if (wyVar.K && !wyVar.E0.g()) {
                    wyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.qr.f27381g);
                if (z10) {
                    wyVar.f39211d1 = true;
                } else {
                    B1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        B1();
        if (z10 && r2Var != null) {
            r2Var.U();
            r2Var.invalidate();
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
        vy vyVar = this.f37571g3;
        vyVar.v = i10;
        cx cxVar = vyVar.f38526n;
        if (cxVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            cxVar.X = z10;
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof org.telegram.ui.Cells.l4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f37584u3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(wy.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f37584u3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).f20751r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return wy.A4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vy vyVar = this.f37571g3;
        if (vyVar.f38526n != null && wy.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            vyVar.f38526n.c(canvas, true);
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
            wy wyVar = this.f37584u3;
            if (!wyVar.f39200b1 && !this.f37571g3.f38530x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                    wyVar.f39206c1 = !kVar.s();
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
        this.f37572h3 = getPaddingTop();
        this.f37584u3.f39315x3 = 0.0f;
        this.f37571g3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        vy[] vyVarArr;
        AnimatorSet animatorSet;
        vy vyVar = this.f37571g3;
        int L0 = vyVar.f38524c.L0();
        wy wyVar = this.f37584u3;
        if (L0 != -1 && vyVar.e.f42846y == 0 && vyVar.f38524c.f42694y < 0 && vyVar.f38522a.getScrollState() != 1) {
            s4.c1 L = vyVar.f38522a.L(L0);
            if (L != null) {
                int top = L.f42697a.getTop();
                if (vyVar.f38528s == 0 && wyVar.Z3() && vyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f37570f3 = true;
                vyVar.f38524c.h1(L0, (int) ((top - this.f37572h3) + wyVar.f39315x3 + 0));
                this.f37570f3 = false;
            }
        } else if (L0 == -1 && this.f37569e3) {
            zw zwVar = vyVar.f38524c;
            if (vyVar.f38528s == 0 && wyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            zwVar.h1(i12, (int) wyVar.N);
        }
        this.f37570f3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (wyVar.K && !wyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!wyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f37583t3 = 0;
        float S3 = wyVar.S3(false);
        org.telegram.ui.Components.ks ksVar = wyVar.J1;
        if (ksVar != null) {
            f7 = ksVar.getMetadata().f14000c.f14008a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f37583t3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.ks ksVar2 = wyVar.J1;
        if (ksVar2 != null) {
            int c10 = (int) ksVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.f37583t3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        this.f37583t3 -= AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        int n32 = wyVar.n3();
        if (dp2 != this.Y2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (wyVar.K) {
                vyVar.f38529w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                vyVar.f38529w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f37570f3 = false;
        if (this.f37569e3 && wyVar.getMessagesController().dialogsLoaded) {
            if (vyVar.f38528s == 0 && wyVar.Z3()) {
                this.f37570f3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) wyVar.N);
                this.f37570f3 = false;
            }
            this.f37569e3 = false;
        }
        super.onMeasure(i10, i11);
        if (!wyVar.f39251l2 && dp2 != 0 && (vyVarArr = wyVar.f39215e0) != null && vyVarArr.length > 1 && !wyVar.f39252l3 && (animatorSet = wyVar.f39224f3) != null) {
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
            wy wyVar = this.f37584u3;
            if (wyVar.f39200b1 || wyVar.f39316y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            vy vyVar = this.f37571g3;
            if (action == 1 || action == 3) {
                s4.y yVar = vyVar.e;
                if (yVar.f42846y != 0) {
                    uy uyVar = vyVar.f38525f;
                    if (uyVar.e) {
                        uyVar.f38241f = true;
                        if (yVar.g(null, 4) != 0 && (c1Var = vyVar.f38525f.d) != null) {
                            View view = c1Var.f42697a;
                            if (view instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                long dialogId = r2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    A1(false, r2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) wyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(wyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            wyVar = wyVar;
                                            wyVar.r4(arrayList, 111, true, false, null);
                                        } else {
                                            wyVar = wyVar;
                                            i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            wyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        wyVar.N2 = !wyVar.g4(dialog);
                                                        wyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!wyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.vc.a(wyVar)) {
                                                        org.telegram.ui.Components.vc.z(wyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                                                    wyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                    if (wyVar.O2 > 0) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    wyVar.P2 = i15;
                                                    wyVar.r4(arrayList4, 104, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                wyVar.M2 = i16;
                                                wyVar.r4(arrayList5, 101, true, false, null);
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
            if (vyVar.f38528s == 0 && ((action == 1 || action == 3) && vyVar.v == 2 && wyVar.Z3() && ((s4.c0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.r2 Q3 = wy.Q3(vyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 76.0f;
                    } else {
                        f7 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - wyVar.f39208c3;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (vyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                wyVar.f39217e2 = true;
                                w0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.qr.h);
                            }
                            if (!wyVar.f39218e3) {
                                wyVar.f39218e3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                cx cxVar = vyVar.f38526n;
                                if (cxVar != null) {
                                    cxVar.a(true);
                                }
                            }
                            Q3.a0();
                            vyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c10 = 0;
                    } else {
                        wyVar.f39217e2 = true;
                        c10 = 0;
                        w0(0, measuredHeight, org.telegram.ui.Components.qr.h);
                        vyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c10] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new b3(this, 9));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.wl.c(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.w81(this, 19));
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
        if (this.f37570f3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f37569e3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f37573i3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        wy.A4 = f7;
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
    public final boolean v1() {
        return true;
    }

    @Override
    public final int x1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void z1(org.telegram.ui.ox r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.z1(org.telegram.ui.ox, float, boolean):void");
    }
}
