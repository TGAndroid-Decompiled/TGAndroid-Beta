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
public final class zx extends org.telegram.ui.Components.ia implements ci.o7 {
    public static final int f44222w3 = 0;
    public boolean f44223e3;
    public boolean f44224f3;
    public boolean f44225g3;
    public final dy f44226h3;
    public int f44227i3;
    public float f44228j3;
    public final Paint f44229k3;
    public final RectF f44230l3;
    public org.telegram.ui.Components.mm0 f44231m3;
    public LongSparseArray f44232n3;
    public Paint f44233o3;
    public float f44234p3;
    public float f44235q3;
    public float f44236r3;
    public boolean f44237s3;
    public ci.ha f44238t3;
    public int f44239u3;
    public final ey f44240v3;

    public zx(ey eyVar, Context context, dy dyVar) {
        super(context, null);
        this.f44240v3 = eyVar;
        this.f44224f3 = true;
        this.f44229k3 = new Paint();
        this.f44230l3 = new RectF();
        this.f44235q3 = 1.0f;
        this.f44226h3 = dyVar;
        this.f27259c3 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final int C1() {
        return AndroidUtilities.dp(48.0f);
    }

    public final void E1(org.telegram.ui.ww r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.E1(org.telegram.ui.ww, float, boolean):void");
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.l4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.q2 q2Var) {
        SharedConfig.toggleArchiveHidden();
        ey eyVar = this.f44240v3;
        UndoView W3 = eyVar.W3();
        if (SharedConfig.archiveHidden) {
            if (q2Var != null) {
                eyVar.f37061e2 = true;
                eyVar.f37044b1 = true;
                int top = (q2Var.getTop() - getPaddingTop()) + q2Var.getMeasuredHeight();
                if (eyVar.K && !eyVar.E0.g()) {
                    eyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.bs.f25134g);
                if (z10) {
                    eyVar.f37055d1 = true;
                } else {
                    G1();
                }
            }
            W3.l(0L, 6, null, null);
            return;
        }
        W3.l(0L, 7, null, null);
        G1();
        if (z10 && q2Var != null) {
            q2Var.T();
            q2Var.invalidate();
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
        dy dyVar = this.f44226h3;
        dyVar.v = i10;
        kw kwVar = dyVar.f36754n;
        if (kwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            kwVar.X = z10;
        }
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f44240v3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(ey.C4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f44240v3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.q2) && ((org.telegram.ui.Cells.q2) view).f23001r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return ey.C4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        dy dyVar = this.f44226h3;
        if (dyVar.f36754n != null && ey.C4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            dyVar.f36754n.c(canvas, true);
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
            ey eyVar = this.f44240v3;
            if (!eyVar.f37044b1 && !this.f44226h3.f36758x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                    eyVar.f37050c1 = !kVar.s();
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
        this.f44227i3 = getPaddingTop();
        this.f44240v3.y3 = 0.0f;
        this.f44226h3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        dy[] dyVarArr;
        AnimatorSet animatorSet;
        dy dyVar = this.f44226h3;
        int L0 = dyVar.f36752c.L0();
        ey eyVar = this.f44240v3;
        if (L0 != -1 && dyVar.e.f46498y == 0 && dyVar.f36752c.f46340y < 0 && dyVar.f36750a.getScrollState() != 1) {
            s4.b1 K = dyVar.f36750a.K(L0);
            if (K != null) {
                int top = K.f46343a.getTop();
                if (dyVar.f36756s == 0 && eyVar.X3() && dyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f44225g3 = true;
                dyVar.f36752c.h1(L0, (int) ((top - this.f44227i3) + eyVar.y3 + 0));
                this.f44225g3 = false;
            }
        } else if (L0 == -1 && this.f44224f3) {
            hw hwVar = dyVar.f36752c;
            if (dyVar.f36756s == 0 && eyVar.X3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            hwVar.h1(i12, (int) eyVar.N);
        }
        this.f44225g3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (eyVar.K && !eyVar.O) {
            i14 += AndroidUtilities.dp(81.0f);
        }
        if (!eyVar.O) {
            i14 += AndroidUtilities.dp(48.0f);
        }
        this.f44239u3 = 0;
        float Q3 = eyVar.Q3(false);
        org.telegram.ui.Components.us usVar = eyVar.J1;
        if (usVar != null) {
            f7 = usVar.getMetadata().f17462c.f17470a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * Q3));
        this.f44239u3 += (int) (AndroidUtilities.dp(50.0f) * Q3);
        org.telegram.ui.Components.us usVar2 = eyVar.J1;
        if (usVar2 != null) {
            int c10 = (int) usVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), Q3));
            dp += c10;
            this.f44239u3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        this.f44239u3 -= AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        int j32 = eyVar.j3();
        if (dp2 != this.Z2 || j32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, j32);
            if (eyVar.K) {
                dyVar.f36757w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                dyVar.f36757w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof hg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f44225g3 = false;
        if (this.f44224f3 && eyVar.getMessagesController().dialogsLoaded) {
            if (dyVar.f36756s == 0 && eyVar.X3()) {
                this.f44225g3 = true;
                ((s4.b0) getLayoutManager()).h1(1, (int) eyVar.N);
                this.f44225g3 = false;
            }
            this.f44224f3 = false;
        }
        super.onMeasure(i10, i11);
        if (!eyVar.f37096l2 && dp2 != 0 && (dyVarArr = eyVar.f37059e0) != null && dyVarArr.length > 1 && !eyVar.f37100m3 && (animatorSet = eyVar.f37073g3) != null) {
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
            ey eyVar = this.f44240v3;
            if (!eyVar.f37044b1 && !eyVar.f37162y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                dy dyVar = this.f44226h3;
                if (action == 1 || action == 3) {
                    s4.y yVar = dyVar.e;
                    if (yVar.f46498y != 0) {
                        cy cyVar = dyVar.f36753f;
                        if (cyVar.e) {
                            cyVar.f36448f = true;
                            if (yVar.g(null, 4) != 0 && (b1Var = dyVar.f36753f.d) != null) {
                                View view = b1Var.f46343a;
                                if (view instanceof org.telegram.ui.Cells.q2) {
                                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                                    long dialogId = q2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        F1(false, q2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(eyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                eyVar = eyVar;
                                                eyVar.p4(arrayList, 111, true, false, null);
                                            } else {
                                                eyVar = eyVar;
                                                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                arrayList2.add(Long.valueOf(dialogId));
                                                                eyVar.p4(arrayList2, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            eyVar.O2 = !eyVar.e4(dialog);
                                                            eyVar.p4(arrayList3, 100, true, false, null);
                                                        }
                                                    } else if (!eyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.xc.a(eyVar)) {
                                                            org.telegram.ui.Components.xc.z(eyVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                        eyVar.P2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                        if (eyVar.P2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        eyVar.Q2 = i15;
                                                        eyVar.p4(arrayList4, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    arrayList5.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    eyVar.N2 = i16;
                                                    eyVar.p4(arrayList5, 101, true, false, null);
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
                if (dyVar.f36756s == 0 && ((action == 1 || action == 3) && dyVar.v == 2 && eyVar.X3() && ((s4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.q2 O3 = ey.O3(dyVar);
                    if (O3 != null) {
                        if (SharedConfig.useThreeLinesLayout) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                        int measuredHeight = O3.getMeasuredHeight() + (O3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - eyVar.f37057d3;
                        if (measuredHeight >= dp && currentTimeMillis >= 200) {
                            if (dyVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    eyVar.f37061e2 = true;
                                    v0(0, O3.getTop() - paddingTop, org.telegram.ui.Components.bs.h);
                                }
                                if (!eyVar.f37068f3) {
                                    eyVar.f37068f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    kw kwVar = dyVar.f36754n;
                                    if (kwVar != null) {
                                        kwVar.a(true);
                                    }
                                }
                                O3.Z();
                                dyVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        } else {
                            eyVar.f37061e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.bs.h);
                            dyVar.v = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new d3(this, 10));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.sl.x(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.p31(this, 26));
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
        if (this.f44225g3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f44224f3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f44228j3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        ey.C4 = f7;
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
