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
public final class sy extends org.telegram.ui.Components.ha implements zh.q5 {
    public static final int f36776v3 = 0;
    public boolean f36777d3;
    public boolean f36778e3;
    public boolean f36779f3;
    public final vy f36780g3;
    public int f36781h3;
    public float f36782i3;
    public final Paint j3;
    public final RectF f36783k3;
    public org.telegram.ui.Components.vl0 f36784l3;
    public LongSparseArray f36785m3;
    public Paint f36786n3;
    public float f36787o3;
    public float f36788p3;
    public float f36789q3;
    public boolean f36790r3;
    public zh.c8 f36791s3;
    public int f36792t3;
    public final wy f36793u3;

    public sy(wy wyVar, Context context, vy vyVar) {
        super(context, null);
        this.f36793u3 = wyVar;
        this.f36778e3 = true;
        this.j3 = new Paint();
        this.f36783k3 = new RectF();
        this.f36788p3 = 1.0f;
        this.f36780g3 = vyVar;
        this.f23558b3 = AndroidUtilities.dp(200.0f);
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
        int paddingTop = (int) (getPaddingTop() + this.f36793u3.N);
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
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f36793u3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).f19835r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return wy.A4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vy vyVar = this.f36780g3;
        if (vyVar.f37649n != null && wy.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            vyVar.f37649n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.X1) {
            wy wyVar = this.f36793u3;
            if (!wyVar.f38416b1 && !this.f36780g3.f37653x.k()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                    wyVar.f38422c1 = !lVar.s();
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
        this.f36781h3 = getPaddingTop();
        this.f36793u3.f38531x3 = 0.0f;
        this.f36780g3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        float f7;
        vy[] vyVarArr;
        AnimatorSet animatorSet;
        vy vyVar = this.f36780g3;
        int L0 = vyVar.f37647c.L0();
        wy wyVar = this.f36793u3;
        if (L0 != -1 && vyVar.e.f41759y == 0 && vyVar.f37647c.f41607y < 0 && vyVar.f37645a.getScrollState() != 1) {
            s4.c1 K = vyVar.f37645a.K(L0);
            if (K != null) {
                int top = K.f41610a.getTop();
                if (vyVar.f37651s == 0 && wyVar.Z3() && vyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f36779f3 = true;
                vyVar.f37647c.h1(L0, (int) ((top - this.f36781h3) + wyVar.f38531x3 + 0));
                this.f36779f3 = false;
            }
        } else if (L0 == -1 && this.f36778e3) {
            zw zwVar = vyVar.f37647c;
            if (vyVar.f37651s == 0 && wyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            zwVar.h1(i12, (int) wyVar.N);
        }
        this.f36779f3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        if (lVar.getOccupyStatusBar()) {
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
        this.f36792t3 = 0;
        float S3 = wyVar.S3(false);
        org.telegram.ui.Components.qs qsVar = wyVar.J1;
        if (qsVar != null) {
            f7 = qsVar.getMetadata().f12885c.f12893a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f36792t3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.qs qsVar2 = wyVar.J1;
        if (qsVar2 != null) {
            int c10 = (int) qsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.f36792t3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        this.f36792t3 -= AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        int n32 = wyVar.n3();
        if (dp2 != this.Y2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (wyVar.K) {
                vyVar.f37652w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                vyVar.f37652w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof fg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f36779f3 = false;
        if (this.f36778e3 && wyVar.getMessagesController().dialogsLoaded) {
            if (vyVar.f37651s == 0 && wyVar.Z3()) {
                this.f36779f3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) wyVar.N);
                this.f36779f3 = false;
            }
            this.f36778e3 = false;
        }
        super.onMeasure(i10, i11);
        if (!wyVar.f38467l2 && dp2 != 0 && (vyVarArr = wyVar.f38431e0) != null && vyVarArr.length > 1 && !wyVar.f38468l3 && (animatorSet = wyVar.f38440f3) != null) {
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
            wy wyVar = this.f36793u3;
            if (wyVar.f38416b1 || wyVar.f38532y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            vy vyVar = this.f36780g3;
            if (action == 1 || action == 3) {
                s4.y yVar = vyVar.e;
                if (yVar.f41759y != 0) {
                    uy uyVar = vyVar.f37648f;
                    if (uyVar.e) {
                        uyVar.f37360f = true;
                        if (yVar.f(null, 4) != 0 && (c1Var = vyVar.f37648f.d) != null) {
                            View view = c1Var.f41610a;
                            if (view instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                long dialogId = r2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    y1(false, r2Var);
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
                                            i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                i11 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                        i13 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
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
                                                    if (org.telegram.ui.Components.wc.a(wyVar)) {
                                                        org.telegram.ui.Components.wc.z(wyVar, 3, 0, null).j();
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    i14 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
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
            if (vyVar.f37651s == 0 && ((action == 1 || action == 3) && vyVar.v == 2 && wyVar.Z3() && ((s4.c0) getLayoutManager()).L0() == 0)) {
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
                    long currentTimeMillis = System.currentTimeMillis() - wyVar.f38424c3;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (vyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                wyVar.f38433e2 = true;
                                v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.wr.h);
                            }
                            if (!wyVar.f38434e3) {
                                wyVar.f38434e3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                cx cxVar = vyVar.f37649n;
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
                        wyVar.f38433e2 = true;
                        c10 = 0;
                        v0(0, measuredHeight, org.telegram.ui.Components.wr.h);
                        vyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c10] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new d3(this, 10));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.em.c(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.voip.v2(this, 9));
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
        if (this.f36779f3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f36778e3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f36782i3 = f7;
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
    public final boolean t1() {
        return true;
    }

    @Override
    public final int v1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void x1(org.telegram.ui.ox r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.x1(org.telegram.ui.ox, float, boolean):void");
    }

    public final void y1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        wy wyVar = this.f36793u3;
        UndoView Y3 = wyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (r2Var != null) {
                wyVar.f38433e2 = true;
                wyVar.f38416b1 = true;
                int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
                if (wyVar.K && !wyVar.E0.g()) {
                    wyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.wr.f28820g);
                if (z10) {
                    wyVar.f38427d1 = true;
                } else {
                    z1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
        z1();
        if (z10 && r2Var != null) {
            r2Var.U();
            r2Var.invalidate();
        }
    }

    public final void z1() {
        int i10;
        boolean z10 = false;
        if (SharedConfig.archiveHidden) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        vy vyVar = this.f36780g3;
        vyVar.v = i10;
        cx cxVar = vyVar.f37649n;
        if (cxVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            cxVar.X = z10;
        }
    }
}
