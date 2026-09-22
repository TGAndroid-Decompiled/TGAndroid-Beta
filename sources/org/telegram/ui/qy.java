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
public final class qy extends org.telegram.ui.Components.ha implements ai.s9 {
    public static final int f37004v3 = 0;
    public boolean f37005d3;
    public boolean f37006e3;
    public boolean f37007f3;
    public final ty f37008g3;
    public int f37009h3;
    public float f37010i3;
    public final Paint j3;
    public final RectF f37011k3;
    public org.telegram.ui.Components.yl0 f37012l3;
    public LongSparseArray f37013m3;
    public Paint f37014n3;
    public float f37015o3;
    public float f37016p3;
    public float f37017q3;
    public boolean f37018r3;
    public ai.rc f37019s3;
    public int f37020t3;
    public final uy f37021u3;

    public qy(uy uyVar, Context context, ty tyVar) {
        super(context, null);
        this.f37021u3 = uyVar;
        this.f37006e3 = true;
        this.j3 = new Paint();
        this.f37011k3 = new RectF();
        this.f37016p3 = 1.0f;
        this.f37008g3 = tyVar;
        this.f24763b3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        SharedConfig.toggleArchiveHidden();
        uy uyVar = this.f37021u3;
        UndoView Y3 = uyVar.Y3();
        if (SharedConfig.archiveHidden) {
            if (s2Var != null) {
                uyVar.f38279e2 = true;
                uyVar.f38262b1 = true;
                int top = (s2Var.getTop() - getPaddingTop()) + s2Var.getMeasuredHeight();
                if (uyVar.K && !uyVar.E0.g()) {
                    uyVar.R = true;
                    top += AndroidUtilities.dp(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.qr.f27654g);
                if (z10) {
                    uyVar.f38273d1 = true;
                } else {
                    B1();
                }
            }
            Y3.l(0L, 6, null, null);
            return;
        }
        Y3.l(0L, 7, null, null);
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
        ty tyVar = this.f37008g3;
        tyVar.v = i10;
        ax axVar = tyVar.f37909n;
        if (axVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            axVar.X = z10;
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof org.telegram.ui.Cells.n4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.f37021u3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(uy.f38254z4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qy.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.f37021u3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.s2) && ((org.telegram.ui.Cells.s2) view).f21021r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return uy.f38254z4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ty tyVar = this.f37008g3;
        if (tyVar.f37909n != null && uy.f38254z4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            tyVar.f37909n.c(canvas, true);
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
            uy uyVar = this.f37021u3;
            if (!uyVar.f38262b1 && !this.f37008g3.f37913x.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    uyVar.f38268c1 = !kVar.s();
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
        this.f37009h3 = getPaddingTop();
        this.f37021u3.f38376x3 = 0.0f;
        this.f37008g3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        float f7;
        ty[] tyVarArr;
        AnimatorSet animatorSet;
        ty tyVar = this.f37008g3;
        int L0 = tyVar.f37907c.L0();
        uy uyVar = this.f37021u3;
        if (L0 != -1 && tyVar.e.f43144y == 0 && tyVar.f37907c.f42992y < 0 && tyVar.f37905a.getScrollState() != 1) {
            s4.c1 L = tyVar.f37905a.L(L0);
            if (L != null) {
                int top = L.f42995a.getTop();
                if (tyVar.f37911s == 0 && uyVar.Z3() && tyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f37007f3 = true;
                tyVar.f37907c.h1(L0, (int) ((top - this.f37009h3) + uyVar.f38376x3 + 0));
                this.f37007f3 = false;
            }
        } else if (L0 == -1 && this.f37006e3) {
            xw xwVar = tyVar.f37907c;
            if (tyVar.f37911s == 0 && uyVar.Z3()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            xwVar.h1(i12, (int) uyVar.N);
        }
        this.f37007f3 = true;
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
        this.f37020t3 = 0;
        float S3 = uyVar.S3(false);
        org.telegram.ui.Components.ks ksVar = uyVar.J1;
        if (ksVar != null) {
            f7 = ksVar.getMetadata().f14200c.f14208a;
        } else {
            f7 = 0.0f;
        }
        int dp = i14 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.f37020t3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.ks ksVar2 = uyVar.J1;
        if (ksVar2 != null) {
            int c10 = (int) ksVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.f37020t3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        this.f37020t3 -= AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        int n32 = uyVar.n3();
        if (dp2 != this.Y2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (uyVar.K) {
                tyVar.f37912w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                tyVar.f37912w.setPaddingTop(dp2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof gg.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f37007f3 = false;
        if (this.f37006e3 && uyVar.getMessagesController().dialogsLoaded) {
            if (tyVar.f37911s == 0 && uyVar.Z3()) {
                this.f37007f3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) uyVar.N);
                this.f37007f3 = false;
            }
            this.f37006e3 = false;
        }
        super.onMeasure(i10, i11);
        if (!uyVar.f38313l2 && dp2 != 0 && (tyVarArr = uyVar.f38277e0) != null && tyVarArr.length > 1 && !uyVar.f38314l3 && (animatorSet = uyVar.f38286f3) != null) {
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
            uy uyVar = this.f37021u3;
            if (uyVar.f38262b1 || uyVar.f38377y) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            ty tyVar = this.f37008g3;
            if (action == 1 || action == 3) {
                s4.y yVar = tyVar.e;
                if (yVar.f43144y != 0) {
                    sy syVar = tyVar.f37908f;
                    if (syVar.e) {
                        syVar.f37592f = true;
                        if (yVar.g(null, 4) != 0 && (c1Var = tyVar.f37908f.d) != null) {
                            View view = c1Var.f42995a;
                            if (view instanceof org.telegram.ui.Cells.s2) {
                                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                                long dialogId = s2Var.getDialogId();
                                if (DialogObject.isFolderDialogId(dialogId)) {
                                    A1(false, s2Var);
                                } else {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
                                    if (dialog != null) {
                                        if (ChatObject.isCommunity(uyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(Long.valueOf(dialogId));
                                            uyVar = uyVar;
                                            uyVar.r4(arrayList, 111, true, false, null);
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
                                                            uyVar.r4(arrayList2, 102, true, false, null);
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        uyVar.N2 = !uyVar.g4(dialog);
                                                        uyVar.r4(arrayList3, 100, true, false, null);
                                                    }
                                                } else if (!uyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                    NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                    if (org.telegram.ui.Components.xc.a(uyVar)) {
                                                        org.telegram.ui.Components.xc.z(uyVar, 3, 0, null).j();
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
                                                    uyVar.r4(arrayList4, 104, true, false, null);
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
                                                uyVar.r4(arrayList5, 101, true, false, null);
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
            if (tyVar.f37911s == 0 && ((action == 1 || action == 3) && tyVar.v == 2 && uyVar.Z3() && ((s4.c0) getLayoutManager()).L0() == 0)) {
                int paddingTop = getPaddingTop();
                org.telegram.ui.Cells.s2 Q3 = uy.Q3(tyVar);
                if (Q3 != null) {
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 76.0f;
                    } else {
                        f7 = 70.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - uyVar.f38270c3;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (tyVar.v != 1) {
                            if (getViewOffset() == 0.0f) {
                                uyVar.f38279e2 = true;
                                w0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.qr.h);
                            }
                            if (!uyVar.f38280e3) {
                                uyVar.f38280e3 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ax axVar = tyVar.f37909n;
                                if (axVar != null) {
                                    axVar.a(true);
                                }
                            }
                            Q3.a0();
                            tyVar.v = 1;
                            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                            }
                        }
                        c10 = 0;
                    } else {
                        uyVar.f38279e2 = true;
                        c10 = 0;
                        w0(0, measuredHeight, org.telegram.ui.Components.qr.h);
                        tyVar.v = 2;
                    }
                    if (getViewOffset() != 0.0f) {
                        float[] fArr = new float[2];
                        fArr[c10] = getViewOffset();
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new b3(this, 9));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.rk.b(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new org.telegram.ui.Components.t81(this, 20));
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
        if (this.f37007f3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f37006e3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f37010i3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        uy.f38254z4 = f7;
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

    public final void z1(org.telegram.ui.mx r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qy.z1(org.telegram.ui.mx, float, boolean):void");
    }
}
