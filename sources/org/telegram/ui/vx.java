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
public final class vx extends org.telegram.ui.Components.r9 implements th.l5 {
    public static final int B3 = 0;
    public final zx A3;
    public boolean f42617j3;
    public boolean f42618k3;
    public boolean f42619l3;
    public final yx f42620m3;
    public int f42621n3;
    public float f42622o3;
    public final Paint f42623p3;
    public final RectF f42624q3;
    public org.telegram.ui.Components.uk0 f42625r3;
    public LongSparseArray f42626s3;
    public Paint f42627t3;
    public float f42628u3;
    public float f42629v3;
    public float f42630w3;
    public boolean f42631x3;
    public th.w7 y3;
    public int f42632z3;

    public vx(zx zxVar, Context context, yx yxVar) {
        super(context, null);
        this.A3 = zxVar;
        this.f42618k3 = true;
        this.f42623p3 = new Paint();
        this.f42624q3 = new RectF();
        this.f42629v3 = 1.0f;
        this.f42620m3 = yxVar;
        this.f29965h3 = org.telegram.messenger.i0.L(200.0f);
    }

    public final void B1(org.telegram.ui.uw r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.B1(org.telegram.ui.uw, float, boolean):void");
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.v2 v2Var) {
        org.telegram.messenger.uz.f18545q1 = !org.telegram.messenger.uz.f18545q1;
        SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.uz.f18545q1);
        edit.apply();
        zx zxVar = this.A3;
        UndoView k42 = zxVar.k4();
        if (org.telegram.messenger.uz.f18545q1) {
            if (v2Var != null) {
                zxVar.f44139e2 = true;
                zxVar.f44122b1 = true;
                int top = (v2Var.getTop() - getPaddingTop()) + v2Var.getMeasuredHeight();
                if (zxVar.K && !zxVar.E0.g()) {
                    zxVar.R = true;
                    top += org.telegram.messenger.i0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.gr.f26524g);
                if (z10) {
                    zxVar.f44133d1 = true;
                } else {
                    D1();
                }
            }
            k42.l(0L, 6, null, null);
            return;
        }
        k42.l(0L, 7, null, null);
        D1();
        if (z10 && v2Var != null) {
            v2Var.b0();
            v2Var.invalidate();
        }
    }

    public final void D1() {
        int i10;
        boolean z10 = false;
        if (org.telegram.messenger.uz.f18545q1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        yx yxVar = this.f42620m3;
        yxVar.f43740w = i10;
        jw jwVar = yxVar.f43737n;
        if (jwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            jwVar.X = z10;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.p4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.A3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(zx.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.A3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.v2) && ((org.telegram.ui.Cells.v2) view).f23257r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return zx.A4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        yx yxVar = this.f42620m3;
        if (yxVar.f43737n != null && zx.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            yxVar.f43737n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.V1) {
            zx zxVar = this.A3;
            if (!zxVar.f44122b1 && !this.f42620m3.f43742y.k()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                    zxVar.f44128c1 = !lVar.u();
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
        this.f42621n3 = getPaddingTop();
        this.A3.y3 = 0.0f;
        this.f42620m3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        float f7;
        yx[] yxVarArr;
        AnimatorSet animatorSet;
        yx yxVar = this.f42620m3;
        int L0 = yxVar.f43735c.L0();
        zx zxVar = this.A3;
        if (L0 != -1 && yxVar.e.D == 0 && yxVar.f43735c.f47888y < 0 && yxVar.f43733a.getScrollState() != 1) {
            s4.c1 K = yxVar.f43733a.K(L0);
            if (K != null) {
                int top = K.f47909a.getTop();
                if (yxVar.f43739s == 0 && zxVar.l4() && yxVar.f43740w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f42619l3 = true;
                yxVar.f43735c.h1(L0, (int) ((top - this.f42621n3) + zxVar.y3 + 0));
                this.f42619l3 = false;
            }
        } else if (L0 == -1 && this.f42618k3) {
            gw gwVar = yxVar.f43735c;
            if (yxVar.f43739s == 0 && zxVar.l4()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            gwVar.h1(i12, (int) zxVar.N);
        }
        this.f42619l3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i13 = org.telegram.messenger.i0.f16166m;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (zxVar.K && !zxVar.O) {
            i14 += org.telegram.messenger.i0.L(81.0f);
        }
        if (!zxVar.O) {
            i14 += org.telegram.messenger.i0.L(48.0f);
        }
        this.f42632z3 = 0;
        float e42 = zxVar.e4(false);
        org.telegram.ui.Components.zr zrVar = zxVar.J1;
        if (zrVar != null) {
            f7 = zrVar.getMetadata().f7041c.f7049a;
        } else {
            f7 = 0.0f;
        }
        int L = i14 + ((int) (org.telegram.messenger.i0.L(50.0f) * e42));
        this.f42632z3 += (int) (org.telegram.messenger.i0.L(50.0f) * e42);
        org.telegram.ui.Components.zr zrVar2 = zxVar.J1;
        if (zrVar2 != null) {
            int c10 = (int) zrVar2.c(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(7.0f), e42));
            L += c10;
            this.f42632z3 += c10;
        }
        int L2 = L - org.telegram.messenger.i0.L(Math.max(e42, f7) * 5.0f);
        this.f42632z3 -= org.telegram.messenger.i0.L(Math.max(e42, f7) * 5.0f);
        int w32 = zxVar.w3();
        if (L2 != this.f29963f3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (zxVar.K) {
                yxVar.f43741x.setPaddingTop(L2 - org.telegram.messenger.i0.L(81.0f));
            } else {
                yxVar.f43741x.setPaddingTop(L2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof zf.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f42619l3 = false;
        if (this.f42618k3 && zxVar.getMessagesController().Y1) {
            if (yxVar.f43739s == 0 && zxVar.l4()) {
                this.f42619l3 = true;
                ((s4.a0) getLayoutManager()).h1(1, (int) zxVar.N);
                this.f42619l3 = false;
            }
            this.f42618k3 = false;
        }
        super.onMeasure(i10, i11);
        if (!zxVar.f44174l2 && L2 != 0 && (yxVarArr = zxVar.f44137e0) != null && yxVarArr.length > 1 && !zxVar.f44178m3 && (animatorSet = zxVar.f44151g3) != null) {
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
        int i17;
        if (!this.V1) {
            zx zxVar = this.A3;
            if (!zxVar.f44122b1 && !zxVar.D) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                yx yxVar = this.f42620m3;
                if (action == 1 || action == 3) {
                    s4.x xVar = yxVar.e;
                    if (xVar.D != 0) {
                        xx xxVar = yxVar.f43736f;
                        if (xxVar.e) {
                            xxVar.f43468f = true;
                            if (xVar.i(null, 4) != 0 && (c1Var = yxVar.f43736f.d) != null) {
                                View view = c1Var.f47909a;
                                if (view instanceof org.telegram.ui.Cells.v2) {
                                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                                    long dialogId = v2Var.getDialogId();
                                    if (org.telegram.messenger.o5.D(dialogId)) {
                                        C1(false, v2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) zxVar.getMessagesController().Q.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.w3.Y(zxVar.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                                                i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                if (org.telegram.messenger.uz.m(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                    if (org.telegram.messenger.uz.m(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                        if (org.telegram.messenger.uz.m(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                            if (org.telegram.messenger.uz.m(i13) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                zxVar.D4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            zxVar.O2 = !zxVar.s4(dialog);
                                                            zxVar.D4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!zxVar.getMessagesController().q2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.pt.t(org.telegram.messenger.e20.f15506s0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.cc.a(zxVar)) {
                                                            org.telegram.ui.Components.cc.z(zxVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                                                        zxVar.P2 = !org.telegram.messenger.wp.r1(i14).q2(dialogId, 0L, null);
                                                        if (zxVar.P2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        zxVar.Q2 = i15;
                                                        zxVar.D4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    zxVar.N2 = i16;
                                                    zxVar.D4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                zxVar.D4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (yxVar.f43739s == 0 && ((action == 1 || action == 3) && yxVar.f43740w == 2 && zxVar.l4() && ((s4.a0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.v2 c42 = zx.c4(yxVar);
                    if (c42 != null) {
                        if (org.telegram.messenger.uz.f18542p1) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.i0.L(f7) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - zxVar.f44135d3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (yxVar.f43740w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    zxVar.f44139e2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                                }
                                if (!zxVar.f44146f3) {
                                    zxVar.f44146f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    jw jwVar = yxVar.f43737n;
                                    if (jwVar != null) {
                                        jwVar.a(true);
                                    }
                                }
                                c42.h0();
                                yxVar.f43740w = 1;
                                if (org.telegram.messenger.i0.C1()) {
                                    org.telegram.messenger.i0.i2(org.telegram.messenger.dd.L0(2131754923, null));
                                }
                            }
                            i17 = 2;
                        } else {
                            zxVar.f44139e2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                            i17 = 2;
                            yxVar.f43740w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i17];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.a30.v(getViewOffset(), org.telegram.messenger.i0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.voip.i2(this, 8));
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
        if (this.f42619l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f42618k3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f42622o3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        zx.A4 = f7;
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
    public final boolean w1() {
        return true;
    }

    @Override
    public final int z1() {
        return org.telegram.messenger.i0.L(48.0f);
    }
}
