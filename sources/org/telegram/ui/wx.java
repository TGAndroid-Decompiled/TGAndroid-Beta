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
public final class wx extends org.telegram.ui.Components.r9 implements th.l5 {
    public static final int B3 = 0;
    public final ay A3;
    public boolean f43379j3;
    public boolean f43380k3;
    public boolean f43381l3;
    public final zx f43382m3;
    public int f43383n3;
    public float f43384o3;
    public final Paint f43385p3;
    public final RectF f43386q3;
    public org.telegram.ui.Components.tk0 f43387r3;
    public LongSparseArray f43388s3;
    public Paint f43389t3;
    public float f43390u3;
    public float f43391v3;
    public float f43392w3;
    public boolean f43393x3;
    public th.w7 y3;
    public int f43394z3;

    public wx(ay ayVar, Context context, zx zxVar) {
        super(context, null);
        this.A3 = ayVar;
        this.f43380k3 = true;
        this.f43385p3 = new Paint();
        this.f43386q3 = new RectF();
        this.f43391v3 = 1.0f;
        this.f43382m3 = zxVar;
        this.f29887h3 = org.telegram.messenger.i0.L(200.0f);
    }

    public final void B1(org.telegram.ui.vw r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.B1(org.telegram.ui.vw, float, boolean):void");
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.v2 v2Var) {
        org.telegram.messenger.tz.f18176q1 = !org.telegram.messenger.tz.f18176q1;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.tz.f18176q1);
        edit.apply();
        ay ayVar = this.A3;
        UndoView j42 = ayVar.j4();
        if (org.telegram.messenger.tz.f18176q1) {
            if (v2Var != null) {
                ayVar.f35796e2 = true;
                ayVar.f35779b1 = true;
                int top = (v2Var.getTop() - getPaddingTop()) + v2Var.getMeasuredHeight();
                if (ayVar.K && !ayVar.E0.g()) {
                    ayVar.R = true;
                    top += org.telegram.messenger.i0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.gr.f26496g);
                if (z10) {
                    ayVar.f35790d1 = true;
                } else {
                    D1();
                }
            }
            j42.l(0L, 6, null, null);
            return;
        }
        j42.l(0L, 7, null, null);
        D1();
        if (z10 && v2Var != null) {
            v2Var.b0();
            v2Var.invalidate();
        }
    }

    public final void D1() {
        int i10;
        boolean z10 = false;
        if (org.telegram.messenger.tz.f18176q1) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        zx zxVar = this.f43382m3;
        zxVar.f44246w = i10;
        kw kwVar = zxVar.f44243n;
        if (kwVar != null) {
            if (i10 != 0) {
                z10 = true;
            }
            kwVar.X = z10;
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
        view.setTranslationY(ay.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.dispatchDraw(android.graphics.Canvas):void");
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
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.v2) && ((org.telegram.ui.Cells.v2) view).f23256r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return ay.A4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zx zxVar = this.f43382m3;
        if (zxVar.f44243n != null && ay.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            zxVar.f44243n.c(canvas, true);
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
            ay ayVar = this.A3;
            if (!ayVar.f35779b1 && !this.f43382m3.f44248y.k()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                    ayVar.f35785c1 = !lVar.u();
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
        this.f43383n3 = getPaddingTop();
        this.A3.y3 = 0.0f;
        this.f43382m3.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        float f7;
        zx[] zxVarArr;
        AnimatorSet animatorSet;
        zx zxVar = this.f43382m3;
        int L0 = zxVar.f44241c.L0();
        ay ayVar = this.A3;
        if (L0 != -1 && zxVar.e.D == 0 && zxVar.f44241c.f47877y < 0 && zxVar.f44239a.getScrollState() != 1) {
            s4.c1 K = zxVar.f44239a.K(L0);
            if (K != null) {
                int top = K.f47898a.getTop();
                if (zxVar.f44245s == 0 && ayVar.k4() && zxVar.f44246w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f43381l3 = true;
                zxVar.f44241c.h1(L0, (int) ((top - this.f43383n3) + ayVar.y3 + 0));
                this.f43381l3 = false;
            }
        } else if (L0 == -1 && this.f43380k3) {
            hw hwVar = zxVar.f44241c;
            if (zxVar.f44245s == 0 && ayVar.k4()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            hwVar.h1(i12, (int) ayVar.N);
        }
        this.f43381l3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i13 = org.telegram.messenger.i0.f16020m;
        } else {
            i13 = 0;
        }
        int i14 = currentActionBarHeight + i13;
        if (ayVar.K && !ayVar.O) {
            i14 += org.telegram.messenger.i0.L(81.0f);
        }
        if (!ayVar.O) {
            i14 += org.telegram.messenger.i0.L(48.0f);
        }
        this.f43394z3 = 0;
        float d42 = ayVar.d4(false);
        org.telegram.ui.Components.zr zrVar = ayVar.J1;
        if (zrVar != null) {
            f7 = zrVar.getMetadata().f7040c.f7048a;
        } else {
            f7 = 0.0f;
        }
        int L = i14 + ((int) (org.telegram.messenger.i0.L(50.0f) * d42));
        this.f43394z3 += (int) (org.telegram.messenger.i0.L(50.0f) * d42);
        org.telegram.ui.Components.zr zrVar2 = ayVar.J1;
        if (zrVar2 != null) {
            int c10 = (int) zrVar2.c(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(7.0f), d42));
            L += c10;
            this.f43394z3 += c10;
        }
        int L2 = L - org.telegram.messenger.i0.L(Math.max(d42, f7) * 5.0f);
        this.f43394z3 -= org.telegram.messenger.i0.L(Math.max(d42, f7) * 5.0f);
        int v32 = ayVar.v3();
        if (L2 != this.f29885f3 || v32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, v32);
            if (ayVar.K) {
                zxVar.f44247x.setPaddingTop(L2 - org.telegram.messenger.i0.L(81.0f));
            } else {
                zxVar.f44247x.setPaddingTop(L2);
            }
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                if (getChildAt(i15) instanceof zf.l) {
                    getChildAt(i15).requestLayout();
                }
            }
        }
        this.f43381l3 = false;
        if (this.f43380k3 && ayVar.getMessagesController().Y1) {
            if (zxVar.f44245s == 0 && ayVar.k4()) {
                this.f43381l3 = true;
                ((s4.a0) getLayoutManager()).h1(1, (int) ayVar.N);
                this.f43381l3 = false;
            }
            this.f43380k3 = false;
        }
        super.onMeasure(i10, i11);
        if (!ayVar.f35831l2 && L2 != 0 && (zxVarArr = ayVar.f35794e0) != null && zxVarArr.length > 1 && !ayVar.f35835m3 && (animatorSet = ayVar.f35808g3) != null) {
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
            ay ayVar = this.A3;
            if (!ayVar.f35779b1 && !ayVar.D) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                zx zxVar = this.f43382m3;
                if (action == 1 || action == 3) {
                    s4.x xVar = zxVar.e;
                    if (xVar.D != 0) {
                        yx yxVar = zxVar.f44242f;
                        if (yxVar.e) {
                            yxVar.f43902f = true;
                            if (xVar.i(null, 4) != 0 && (c1Var = zxVar.f44242f.d) != null) {
                                View view = c1Var.f47898a;
                                if (view instanceof org.telegram.ui.Cells.v2) {
                                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                                    long dialogId = v2Var.getDialogId();
                                    if (org.telegram.messenger.o5.D(dialogId)) {
                                        C1(false, v2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.w3.Y(ayVar.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                                                i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                if (org.telegram.messenger.tz.m(i10) != 1) {
                                                    i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                    if (org.telegram.messenger.tz.m(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                        if (org.telegram.messenger.tz.m(i12) != 0) {
                                                            i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                            if (org.telegram.messenger.tz.m(i13) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                ayVar.C4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            ayVar.O2 = !ayVar.r4(dialog);
                                                            ayVar.C4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!ayVar.getMessagesController().q2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.f15147s0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.cc.a(ayVar)) {
                                                            org.telegram.ui.Components.cc.z(ayVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                        ayVar.P2 = !org.telegram.messenger.vp.r1(i14).q2(dialogId, 0L, null);
                                                        if (ayVar.P2 > 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        ayVar.Q2 = i15;
                                                        ayVar.C4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i16 = 0;
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    ayVar.N2 = i16;
                                                    ayVar.C4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                ayVar.C4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (zxVar.f44245s == 0 && ((action == 1 || action == 3) && zxVar.f44246w == 2 && ayVar.k4() && ((s4.a0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.v2 b42 = ay.b4(zxVar);
                    if (b42 != null) {
                        if (org.telegram.messenger.tz.f18173p1) {
                            f7 = 76.0f;
                        } else {
                            f7 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.i0.L(f7) * 0.85f);
                        int measuredHeight = b42.getMeasuredHeight() + (b42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - ayVar.f35792d3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (zxVar.f44246w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    ayVar.f35796e2 = true;
                                    w0(0, b42.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                                }
                                if (!ayVar.f35803f3) {
                                    ayVar.f35803f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    kw kwVar = zxVar.f44243n;
                                    if (kwVar != null) {
                                        kwVar.a(true);
                                    }
                                }
                                b42.h0();
                                zxVar.f44246w = 1;
                                if (org.telegram.messenger.i0.C1()) {
                                    org.telegram.messenger.i0.i2(org.telegram.messenger.cd.L0(2131754923, null));
                                }
                            }
                            i17 = 2;
                        } else {
                            ayVar.f35796e2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                            i17 = 2;
                            zxVar.f44246w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i17];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.z20.v(getViewOffset(), org.telegram.messenger.i0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.voip.h2(this, 8));
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
        if (this.f43381l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f43380k3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.f43384o3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        ay.A4 = f7;
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
