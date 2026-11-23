package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class yw extends org.telegram.ui.Components.ba implements fi.w6 {
    public static final int C3 = 0;
    public int A3;
    public final cx B3;
    public boolean f54270k3;
    public boolean f54271l3;
    public boolean f54272m3;
    public final bx f54273n3;
    public int f54274o3;
    public float f54275p3;
    public final Paint f54276q3;
    public final RectF f54277r3;
    public org.telegram.ui.Components.ek0 f54278s3;
    public LongSparseArray f54279t3;
    public Paint f54280u3;
    public float f54281v3;
    public float f54282w3;
    public float f54283x3;
    public boolean f54284y3;
    public fi.n9 f54285z3;

    public yw(cx cxVar, Context context, bx bxVar) {
        super(context, null);
        this.B3 = cxVar;
        this.f54271l3 = true;
        this.f54276q3 = new Paint();
        this.f54277r3 = new RectF();
        this.f54282w3 = 1.0f;
        this.f54273n3 = bxVar;
        this.f33793i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(org.telegram.ui.vv r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.B1(org.telegram.ui.vv, float, boolean):void");
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.u2 u2Var) {
        org.telegram.messenger.cz.f23399q1 = !org.telegram.messenger.cz.f23399q1;
        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.cz.f23399q1);
        edit.apply();
        cx cxVar = this.B3;
        UndoView l42 = cxVar.l4();
        if (org.telegram.messenger.cz.f23399q1) {
            if (u2Var != null) {
                cxVar.f46690g2 = true;
                cxVar.f46673d1 = true;
                int top = (u2Var.getTop() - getPaddingTop()) + u2Var.getMeasuredHeight();
                if (cxVar.L && !cxVar.F0.g()) {
                    cxVar.S = true;
                    top += org.telegram.messenger.g0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.nr.f37918g);
                if (z10) {
                    cxVar.f46684f1 = true;
                } else {
                    D1();
                }
            }
            l42.l(0L, 6, null, null);
            return;
        }
        l42.l(0L, 7, null, null);
        D1();
        if (z10 && u2Var != null) {
            u2Var.b0();
            u2Var.invalidate();
        }
    }

    public final void D1() {
        int i7;
        boolean z10 = false;
        if (org.telegram.messenger.cz.f23399q1) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        bx bxVar = this.f54273n3;
        bxVar.f46326w = i7;
        jv jvVar = bxVar.f46323n;
        if (jvVar != null) {
            if (i7 != 0) {
                z10 = true;
            }
            jvVar.X = z10;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.o4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(cx.F4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.B3.O) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.u2) && ((org.telegram.ui.Cells.u2) view).f31970r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return cx.F4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bx bxVar = this.f54273n3;
        if (bxVar.f46323n != null && cx.F4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            bxVar.f46323n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.W1) {
            cx cxVar = this.B3;
            if (!cxVar.f46673d1 && !this.f54273n3.f46328y.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                    cxVar.f46678e1 = !kVar.x();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f54274o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.f54273n3.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        float f10;
        bx[] bxVarArr;
        AnimatorSet animatorSet;
        bx bxVar = this.f54273n3;
        int L0 = bxVar.f46320c.L0();
        cx cxVar = this.B3;
        if (L0 != -1 && bxVar.f46321e.E == 0 && bxVar.f46320c.f59073y < 0 && bxVar.f46318a.getScrollState() != 1) {
            v4.e1 K = bxVar.f46318a.K(L0);
            if (K == null) {
                K = bxVar.f46318a.L(L0, false);
            }
            if (K != null) {
                int top = K.f59111a.getTop();
                if (bxVar.f46325s == 0 && cxVar.n4() && bxVar.f46326w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f54272m3 = true;
                bxVar.f46320c.h1(L0, (int) ((top - this.f54274o3) + cxVar.A3 + 0));
                this.f54272m3 = false;
            }
        } else if (L0 == -1 && this.f54271l3) {
            gv gvVar = bxVar.f46320c;
            if (bxVar.f46325s == 0 && cxVar.n4()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            gvVar.h1(i11, (int) cxVar.O);
        }
        this.f54272m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i12 = org.telegram.messenger.g0.f24004m;
        } else {
            i12 = 0;
        }
        int i13 = currentActionBarHeight + i12;
        if (cxVar.L && !cxVar.P) {
            i13 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!cxVar.P) {
            i13 += org.telegram.messenger.g0.L(48.0f);
        }
        this.A3 = 0;
        float e42 = cxVar.e4(false);
        org.telegram.ui.Components.es esVar = cxVar.L1;
        float f11 = 0.0f;
        if (esVar != null) {
            f10 = esVar.getMetadata().f57681c.f57691a;
        } else {
            f10 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(50.0f);
        rw rwVar = cxVar.A0;
        if (rwVar != null) {
            f11 = rwVar.getUnreadOnlyBannerHeight();
        }
        int i14 = (int) ((L + f11) * e42);
        int i15 = i13 + i14;
        this.A3 += i14;
        org.telegram.ui.Components.es esVar2 = cxVar.L1;
        if (esVar2 != null) {
            int d = (int) esVar2.d(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            i15 += d;
            this.A3 += d;
        }
        int L2 = i15 - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.A3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = cxVar.w3();
        if (L2 != this.f33791g3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (cxVar.L) {
                bxVar.f46327x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                bxVar.f46327x.setPaddingTop(L2);
            }
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                if (getChildAt(i16) instanceof jg.l) {
                    getChildAt(i16).requestLayout();
                }
            }
        }
        this.f54272m3 = false;
        if (this.f54271l3 && cxVar.getMessagesController().f25769b2) {
            if (bxVar.f46325s == 0 && cxVar.n4()) {
                this.f54272m3 = true;
                ((v4.b0) getLayoutManager()).h1(1, (int) cxVar.O);
                this.f54272m3 = false;
            }
            this.f54271l3 = false;
        }
        super.onMeasure(i7, i10);
        if (!cxVar.f46722n2 && L2 != 0 && (bxVarArr = cxVar.f46683f0) != null && bxVarArr.length > 1 && !cxVar.f46728o3 && (animatorSet = cxVar.f46701i3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.e1 e1Var;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        if (!this.W1) {
            cx cxVar = this.B3;
            if (!cxVar.f46673d1 && !cxVar.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                bx bxVar = this.f54273n3;
                if (action == 1 || action == 3) {
                    v4.y yVar = bxVar.f46321e;
                    if (yVar.E != 0) {
                        ax axVar = bxVar.f46322f;
                        if (axVar.f45664e) {
                            axVar.f45665f = true;
                            if (yVar.i(null, 4) != 0 && (e1Var = bxVar.f46322f.d) != null) {
                                View view = e1Var.f59111a;
                                if (view instanceof org.telegram.ui.Cells.u2) {
                                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                                    long dialogId = u2Var.getDialogId();
                                    if (org.telegram.messenger.n5.D(dialogId)) {
                                        C1(false, u2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.v3.Y(cxVar.getMessagesController().O0(Long.valueOf(-dialogId)))) {
                                                i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                                if (org.telegram.messenger.cz.m(i7) != 1) {
                                                    i10 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                                    if (org.telegram.messenger.cz.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                                        if (org.telegram.messenger.cz.m(i11) != 0) {
                                                            i12 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                                            if (org.telegram.messenger.cz.m(i12) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                cxVar.K4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            cxVar.Q2 = !cxVar.v4(dialog);
                                                            cxVar.K4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!cxVar.getMessagesController().u2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.ys.t(org.telegram.messenger.k10.f24932t0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.lc.a(cxVar)) {
                                                            org.telegram.ui.Components.lc.z(cxVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                                        cxVar.R2 = !org.telegram.messenger.np.u1(i13).u2(dialogId, 0L, null);
                                                        if (cxVar.R2 > 0) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                        cxVar.S2 = i14;
                                                        cxVar.K4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    cxVar.P2 = i15;
                                                    cxVar.K4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                cxVar.K4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (bxVar.f46325s == 0 && ((action == 1 || action == 3) && bxVar.f46326w == 2 && cxVar.n4() && ((v4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.u2 c42 = cx.c4(bxVar);
                    if (c42 != null) {
                        if (org.telegram.messenger.cz.f23396p1) {
                            f10 = 76.0f;
                        } else {
                            f10 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - cxVar.f46686f3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (bxVar.f46326w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    cxVar.f46690g2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.nr.h);
                                }
                                if (!cxVar.f46696h3) {
                                    cxVar.f46696h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    jv jvVar = bxVar.f46323n;
                                    if (jvVar != null) {
                                        jvVar.a(true);
                                    }
                                }
                                c42.h0();
                                bxVar.f46326w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.hd.N0(2131754923, null));
                                }
                            }
                            i16 = 2;
                        } else {
                            cxVar.f46690g2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.nr.h);
                            i16 = 2;
                            bxVar.f46326w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i16];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.o10.w(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Cells.y9(this, 28));
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
        if (this.f54272m3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(v4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f54271l3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f54275p3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        cx.F4 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.D1 != -1 && (m10 = getLayoutManager().m(this.D1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.F1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }

    @Override
    public final boolean w1() {
        return true;
    }

    @Override
    public final int z1() {
        return org.telegram.messenger.g0.L(48.0f);
    }
}
