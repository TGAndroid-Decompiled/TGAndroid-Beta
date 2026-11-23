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
public final class xw extends org.telegram.ui.Components.aa implements fi.w6 {
    public static final int C3 = 0;
    public int A3;
    public final bx B3;
    public boolean f54089k3;
    public boolean f54090l3;
    public boolean f54091m3;
    public final ax f54092n3;
    public int f54093o3;
    public float f54094p3;
    public final Paint f54095q3;
    public final RectF f54096r3;
    public org.telegram.ui.Components.ek0 f54097s3;
    public LongSparseArray f54098t3;
    public Paint f54099u3;
    public float f54100v3;
    public float f54101w3;
    public float f54102x3;
    public boolean f54103y3;
    public fi.n9 f54104z3;

    public xw(bx bxVar, Context context, ax axVar) {
        super(context, null);
        this.B3 = bxVar;
        this.f54090l3 = true;
        this.f54095q3 = new Paint();
        this.f54096r3 = new RectF();
        this.f54101w3 = 1.0f;
        this.f54092n3 = axVar;
        this.f33449i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(org.telegram.ui.uv r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xw.B1(org.telegram.ui.uv, float, boolean):void");
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.u2 u2Var) {
        org.telegram.messenger.bz.f23315q1 = !org.telegram.messenger.bz.f23315q1;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.bz.f23315q1);
        edit.apply();
        bx bxVar = this.B3;
        UndoView l42 = bxVar.l4();
        if (org.telegram.messenger.bz.f23315q1) {
            if (u2Var != null) {
                bxVar.f46556g2 = true;
                bxVar.f46539d1 = true;
                int top = (u2Var.getTop() - getPaddingTop()) + u2Var.getMeasuredHeight();
                if (bxVar.L && !bxVar.F0.g()) {
                    bxVar.S = true;
                    top += org.telegram.messenger.g0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.kr.f36859g);
                if (z10) {
                    bxVar.f46550f1 = true;
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
            u2Var.d0();
            u2Var.invalidate();
        }
    }

    public final void D1() {
        int i7;
        boolean z10 = false;
        if (org.telegram.messenger.bz.f23315q1) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        ax axVar = this.f54092n3;
        axVar.f45830w = i7;
        iv ivVar = axVar.f45827n;
        if (ivVar != null) {
            if (i7 != 0) {
                z10 = true;
            }
            ivVar.X = z10;
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
        view.setTranslationY(bx.F4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xw.dispatchDraw(android.graphics.Canvas):void");
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
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.u2) && ((org.telegram.ui.Cells.u2) view).f32054r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return bx.F4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ax axVar = this.f54092n3;
        if (axVar.f45827n != null && bx.F4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            axVar.f45827n.c(canvas, true);
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
            bx bxVar = this.B3;
            if (!bxVar.f46539d1 && !this.f54092n3.f45832y.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                    bxVar.f46544e1 = !kVar.x();
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
        this.f54093o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.f54092n3.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        float f10;
        ax[] axVarArr;
        AnimatorSet animatorSet;
        ax axVar = this.f54092n3;
        int L0 = axVar.f45824c.L0();
        bx bxVar = this.B3;
        if (L0 != -1 && axVar.f45825e.E == 0 && axVar.f45824c.f59208y < 0 && axVar.f45822a.getScrollState() != 1) {
            v4.f1 K = axVar.f45822a.K(L0);
            if (K == null) {
                K = axVar.f45822a.L(L0, false);
            }
            if (K != null) {
                int top = K.f59245a.getTop();
                if (axVar.f45829s == 0 && bxVar.n4() && axVar.f45830w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f54091m3 = true;
                axVar.f45824c.h1(L0, (int) ((top - this.f54093o3) + bxVar.A3 + 0));
                this.f54091m3 = false;
            }
        } else if (L0 == -1 && this.f54090l3) {
            fv fvVar = axVar.f45824c;
            if (axVar.f45829s == 0 && bxVar.n4()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            fvVar.h1(i11, (int) bxVar.O);
        }
        this.f54091m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i12 = org.telegram.messenger.g0.f24220m;
        } else {
            i12 = 0;
        }
        int i13 = currentActionBarHeight + i12;
        if (bxVar.L && !bxVar.P) {
            i13 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!bxVar.P) {
            i13 += org.telegram.messenger.g0.L(48.0f);
        }
        this.A3 = 0;
        float e42 = bxVar.e4(false);
        org.telegram.ui.Components.bs bsVar = bxVar.L1;
        float f11 = 0.0f;
        if (bsVar != null) {
            f10 = bsVar.getMetadata().f57795c.f57805a;
        } else {
            f10 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(50.0f);
        qw qwVar = bxVar.A0;
        if (qwVar != null) {
            f11 = qwVar.getUnreadOnlyBannerHeight();
        }
        int i14 = (int) ((L + f11) * e42);
        int i15 = i13 + i14;
        this.A3 += i14;
        org.telegram.ui.Components.bs bsVar2 = bxVar.L1;
        if (bsVar2 != null) {
            int d = (int) bsVar2.d(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            i15 += d;
            this.A3 += d;
        }
        int L2 = i15 - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.A3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = bxVar.w3();
        if (L2 != this.f33447g3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (bxVar.L) {
                axVar.f45831x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                axVar.f45831x.setPaddingTop(L2);
            }
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                if (getChildAt(i16) instanceof jg.l) {
                    getChildAt(i16).requestLayout();
                }
            }
        }
        this.f54091m3 = false;
        if (this.f54090l3 && bxVar.getMessagesController().f25701b2) {
            if (axVar.f45829s == 0 && bxVar.n4()) {
                this.f54091m3 = true;
                ((v4.c0) getLayoutManager()).h1(1, (int) bxVar.O);
                this.f54091m3 = false;
            }
            this.f54090l3 = false;
        }
        super.onMeasure(i7, i10);
        if (!bxVar.f46588n2 && L2 != 0 && (axVarArr = bxVar.f46549f0) != null && axVarArr.length > 1 && !bxVar.f46594o3 && (animatorSet = bxVar.f46567i3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.f1 f1Var;
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
            bx bxVar = this.B3;
            if (!bxVar.f46539d1 && !bxVar.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                ax axVar = this.f54092n3;
                if (action == 1 || action == 3) {
                    v4.z zVar = axVar.f45825e;
                    if (zVar.E != 0) {
                        zw zwVar = axVar.f45826f;
                        if (zwVar.f54737e) {
                            zwVar.f54738f = true;
                            if (zVar.i(null, 4) != 0 && (f1Var = axVar.f45826f.d) != null) {
                                View view = f1Var.f59245a;
                                if (view instanceof org.telegram.ui.Cells.u2) {
                                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                                    long dialogId = u2Var.getDialogId();
                                    if (org.telegram.messenger.n5.D(dialogId)) {
                                        C1(false, u2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.v3.Y(bxVar.getMessagesController().O0(Long.valueOf(-dialogId)))) {
                                                i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                if (org.telegram.messenger.bz.m(i7) != 1) {
                                                    i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                    if (org.telegram.messenger.bz.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                        if (org.telegram.messenger.bz.m(i11) != 0) {
                                                            i12 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                            if (org.telegram.messenger.bz.m(i12) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                bxVar.K4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            bxVar.Q2 = !bxVar.v4(dialog);
                                                            bxVar.K4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!bxVar.getMessagesController().u2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.xs.t(org.telegram.messenger.i10.f24637t0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.kc.a(bxVar)) {
                                                            org.telegram.ui.Components.kc.z(bxVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                        bxVar.R2 = !org.telegram.messenger.mp.u1(i13).u2(dialogId, 0L, null);
                                                        if (bxVar.R2 > 0) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                        bxVar.S2 = i14;
                                                        bxVar.K4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    bxVar.P2 = i15;
                                                    bxVar.K4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                bxVar.K4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (axVar.f45829s == 0 && ((action == 1 || action == 3) && axVar.f45830w == 2 && bxVar.n4() && ((v4.c0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.u2 c42 = bx.c4(axVar);
                    if (c42 != null) {
                        if (org.telegram.messenger.bz.f23312p1) {
                            f10 = 76.0f;
                        } else {
                            f10 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - bxVar.f46552f3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (axVar.f45830w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    bxVar.f46556g2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.kr.h);
                                }
                                if (!bxVar.f46562h3) {
                                    bxVar.f46562h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    iv ivVar = axVar.f45827n;
                                    if (ivVar != null) {
                                        ivVar.a(true);
                                    }
                                }
                                c42.j0();
                                axVar.f45830w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.gd.N0(2131754923, null));
                                }
                            }
                            i16 = 2;
                        } else {
                            bxVar.f46556g2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.kr.h);
                            i16 = 2;
                            axVar.f45830w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i16];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.m10.w(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.kr.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Cells.x9(this, 28));
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
        if (this.f54091m3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(v4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.f54090l3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f54094p3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        bx.F4 = f10;
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
