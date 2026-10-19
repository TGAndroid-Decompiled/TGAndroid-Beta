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
public final class xx extends org.telegram.ui.Components.ia implements ci.p7 {
    public static final int f43279t3 = 0;
    public boolean f43280b3;
    public boolean f43281c3;
    public boolean f43282d3;
    public final ay f43283e3;
    public int f43284f3;
    public float f43285g3;
    public final Paint f43286h3;
    public final RectF f43287i3;
    public org.telegram.ui.Components.im0 f43288j3;
    public LongSparseArray f43289k3;
    public Paint f43290l3;
    public float f43291m3;
    public float f43292n3;
    public float f43293o3;
    public boolean f43294p3;
    public ci.ia f43295q3;
    public int f43296r3;
    public final cy f43297s3;

    public xx(cy cyVar, Context context, ay ayVar) {
        super(context, null);
        this.f43297s3 = cyVar;
        this.f43281c3 = true;
        this.f43286h3 = new Paint();
        this.f43287i3 = new RectF();
        this.f43292n3 = 1.0f;
        this.f43283e3 = ayVar;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        cy cyVar = this.f43297s3;
        UndoView W3 = cyVar.W3();
        if (SharedConfig.archiveHidden) {
            if (r2Var != null) {
                cyVar.f36115e2 = true;
                cyVar.f36098b1 = true;
                int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
                if (cyVar.K && !cyVar.E0.g()) {
                    cyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                v0(0, top, org.telegram.ui.Components.bs.f25015g);
                if (z10) {
                    cyVar.f36109d1 = true;
                } else {
                    B1();
                }
            }
            W3.l(0L, 6, null, null);
            return;
        }
        W3.l(0L, 7, null, null);
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
        ay ayVar = this.f43283e3;
        ayVar.v = i10;
        iw iwVar = ayVar.f35456n;
        if (iwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            iwVar.X = z10;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.l4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f43297s3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(cy.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f43297s3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).f22887r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return cy.A4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ay ayVar = this.f43283e3;
        if (ayVar.f35456n != null && cy.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ayVar.f35456n.c(canvas, true);
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
            cy cyVar = this.f43297s3;
            if (!cyVar.f36098b1 && !this.f43283e3.f35460x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                    cyVar.f36104c1 = !kVar.t();
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
        this.f43284f3 = getPaddingTop();
        this.f43297s3.y3 = 0.0f;
        this.f43283e3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        ay[] ayVarArr;
        AnimatorSet animatorSet;
        ay ayVar = this.f43283e3;
        int L0 = ayVar.f35454c.L0();
        cy cyVar = this.f43297s3;
        if (L0 != -1 && ayVar.e.f46065y == 0 && ayVar.f35454c.f45907y < 0 && ayVar.f35452a.getScrollState() != 1) {
            s4.b1 K = ayVar.f35452a.K(L0);
            if (K != null) {
                int top = K.f45910a.getTop();
                if (ayVar.f35458s == 0 && cyVar.X3() && ayVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f43282d3 = true;
                ayVar.f35454c.h1(L0, (int) ((top - this.f43284f3) + cyVar.y3 + 0));
                this.f43282d3 = false;
            }
        } else if (L0 == -1 && this.f43281c3) {
            fw fwVar = ayVar.f35454c;
            if (ayVar.f35458s == 0 && cyVar.X3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            fwVar.h1(i12, (int) cyVar.N);
        }
        this.f43282d3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
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
        this.f43296r3 = 0;
        float Q3 = cyVar.Q3(false);
        org.telegram.ui.Components.us usVar = cyVar.J1;
        if (usVar != null) {
            f7 = usVar.getMetadata().f17401c.f17409a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * Q3));
        this.f43296r3 += (int) (AndroidUtilities.dp(50.0f) * Q3);
        org.telegram.ui.Components.us usVar2 = cyVar.J1;
        if (usVar2 != null) {
            int c10 = (int) usVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), Q3));
            dp += c10;
            this.f43296r3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        this.f43296r3 -= AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        int k32 = cyVar.k3();
        if (dp2 != this.W2 || k32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, k32);
            if (cyVar.K) {
                ayVar.f35459w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                ayVar.f35459w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof hg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f43282d3 = false;
        if (this.f43281c3 && cyVar.getMessagesController().dialogsLoaded) {
            if (ayVar.f35458s == 0 && cyVar.X3()) {
                this.f43282d3 = true;
                ((s4.b0) getLayoutManager()).h1(1, (int) cyVar.N);
                this.f43282d3 = false;
            }
            this.f43281c3 = false;
        }
        super.onMeasure(i10, i11);
        if (!cyVar.f36150l2 && dp2 != 0 && (ayVarArr = cyVar.f36113e0) != null && ayVarArr.length > 1 && !cyVar.f36154m3 && (animatorSet = cyVar.f36127g3) != null) {
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
            cy cyVar = this.f43297s3;
            if (!cyVar.f36098b1 && !cyVar.f36215y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                ay ayVar = this.f43283e3;
                if (action == 1 || action == 3) {
                    s4.y yVar = ayVar.e;
                    if (yVar.f46065y != 0) {
                        zx zxVar = ayVar.f35455f;
                        if (zxVar.e) {
                            zxVar.f43811f = true;
                            if (yVar.g(null, 4) != 0 && (b1Var = ayVar.f35455f.d) != null) {
                                View view = b1Var.f45910a;
                                if (view instanceof org.telegram.ui.Cells.r2) {
                                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                    long dialogId = r2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        A1(false, r2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(cyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                cyVar = cyVar;
                                                cyVar.p4(arrayList, 111, true, false, null);
                                            } else {
                                                cyVar = cyVar;
                                                i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                arrayList2.add(Long.valueOf(dialogId));
                                                                cyVar.p4(arrayList2, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            cyVar.O2 = !cyVar.e4(dialog);
                                                            cyVar.p4(arrayList3, 100, true, false, null);
                                                        }
                                                    } else if (!cyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.xc.a(cyVar)) {
                                                            org.telegram.ui.Components.xc.z(cyVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                                                        cyVar.P2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L);
                                                        if (cyVar.P2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        cyVar.Q2 = i15;
                                                        cyVar.p4(arrayList4, 104, true, false, null);
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
                                                    cyVar.p4(arrayList5, 101, true, false, null);
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
                if (ayVar.f35458s == 0 && ((action == 1 || action == 3) && ayVar.v == 2 && cyVar.X3() && ((s4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.r2 O3 = cy.O3(ayVar);
                    if (O3 != null) {
                        if (SharedConfig.useThreeLinesLayout) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                        int measuredHeight = O3.getMeasuredHeight() + (O3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - cyVar.f36111d3;
                        if (measuredHeight >= dp && currentTimeMillis >= 200) {
                            if (ayVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    cyVar.f36115e2 = true;
                                    v0(0, O3.getTop() - paddingTop, org.telegram.ui.Components.bs.h);
                                }
                                if (!cyVar.f36122f3) {
                                    cyVar.f36122f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    iw iwVar = ayVar.f35456n;
                                    if (iwVar != null) {
                                        iwVar.a(true);
                                    }
                                }
                                O3.a0();
                                ayVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        } else {
                            cyVar.f36115e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.bs.h);
                            ayVar.v = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new e3(this, 10));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.lk.x(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.o31(this, 25));
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
        if (this.f43282d3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f43281c3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f43285g3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        cy.A4 = f7;
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

    public final void z1(org.telegram.ui.uw r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.z1(org.telegram.ui.uw, float, boolean):void");
    }
}
