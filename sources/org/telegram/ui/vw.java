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
public final class vw extends org.telegram.ui.Components.w9 implements di.g7 {
    public static final int B3 = 0;
    public final zw A3;
    public boolean j3;
    public boolean f50804k3;
    public boolean f50805l3;
    public final yw f50806m3;
    public int f50807n3;
    public float f50808o3;
    public final Paint f50809p3;
    public final RectF f50810q3;
    public org.telegram.ui.Components.pj0 f50811r3;
    public LongSparseArray f50812s3;
    public Paint f50813t3;
    public float f50814u3;
    public float f50815v3;
    public float f50816w3;
    public boolean f50817x3;
    public di.y9 f50818y3;
    public int f50819z3;

    public vw(zw zwVar, Context context, yw ywVar) {
        super(context, null);
        this.A3 = zwVar;
        this.f50804k3 = true;
        this.f50809p3 = new Paint();
        this.f50810q3 = new RectF();
        this.f50815v3 = 1.0f;
        this.f50806m3 = ywVar;
        this.f39932h3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(org.telegram.ui.tv r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.B1(org.telegram.ui.tv, float, boolean):void");
    }

    public final void C1(boolean z9, org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.messenger.iz.f23434q1 = !org.telegram.messenger.iz.f23434q1;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.iz.f23434q1);
        edit.apply();
        zw zwVar = this.A3;
        UndoView k42 = zwVar.k4();
        if (org.telegram.messenger.iz.f23434q1) {
            if (t2Var != null) {
                zwVar.f52585f2 = true;
                zwVar.f52568c1 = true;
                int top = (t2Var.getTop() - getPaddingTop()) + t2Var.getMeasuredHeight();
                if (zwVar.K && !zwVar.E0.g()) {
                    zwVar.R = true;
                    top += org.telegram.messenger.g0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.wq.f40047g);
                if (z9) {
                    zwVar.f52578e1 = true;
                } else {
                    D1();
                }
            }
            k42.l(0L, 6, null, null);
            return;
        }
        k42.l(0L, 7, null, null);
        D1();
        if (z9 && t2Var != null) {
            t2Var.b0();
            t2Var.invalidate();
        }
    }

    public final void D1() {
        int i7;
        boolean z9 = false;
        if (org.telegram.messenger.iz.f23434q1) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        yw ywVar = this.f50806m3;
        ywVar.f52133w = i7;
        iv ivVar = ywVar.f52130n;
        if (ivVar != null) {
            if (i7 != 0) {
                z9 = true;
            }
            ivVar.X = z9;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.n4) && !view.isClickable()) {
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
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(zw.B4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < getPaddingTop() + this.A3.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) view).f30486r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return zw.B4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        yw ywVar = this.f50806m3;
        if (ywVar.f52130n != null && zw.B4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ywVar.f52130n.c(canvas, true);
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
            zw zwVar = this.A3;
            if (!zwVar.f52568c1 && !this.f50806m3.f52135y.k()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                    zwVar.f52573d1 = !lVar.x();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f50807n3 = getPaddingTop();
        this.A3.f52686z3 = 0.0f;
        this.f50806m3.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.l lVar;
        int i12;
        float f10;
        yw[] ywVarArr;
        AnimatorSet animatorSet;
        yw ywVar = this.f50806m3;
        int L0 = ywVar.f52127c.L0();
        zw zwVar = this.A3;
        if (L0 != -1 && ywVar.f52128e.D == 0 && ywVar.f52127c.f57030y < 0 && ywVar.f52125a.getScrollState() != 1) {
            v4.d1 K = ywVar.f52125a.K(L0);
            if (K != null) {
                int top = K.f57052a.getTop();
                if (ywVar.f52132s == 0 && zwVar.l4() && ywVar.f52133w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f50805l3 = true;
                ywVar.f52127c.h1(L0, (int) ((top - this.f50807n3) + zwVar.f52686z3 + 0));
                this.f50805l3 = false;
            }
        } else if (L0 == -1 && this.f50804k3) {
            fv fvVar = ywVar.f52127c;
            if (ywVar.f52132s == 0 && zwVar.l4()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            fvVar.h1(i11, (int) zwVar.N);
        }
        this.f50805l3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i12 = org.telegram.messenger.g0.f22561m;
        } else {
            i12 = 0;
        }
        int i13 = currentActionBarHeight + i12;
        if (zwVar.K && !zwVar.O) {
            i13 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!zwVar.O) {
            i13 += org.telegram.messenger.g0.L(48.0f);
        }
        this.f50819z3 = 0;
        float e42 = zwVar.e4(false);
        org.telegram.ui.Components.or orVar = zwVar.K1;
        if (orVar != null) {
            f10 = orVar.getMetadata().f55514c.f55524a;
        } else {
            f10 = 0.0f;
        }
        int L = i13 + ((int) (org.telegram.messenger.g0.L(50.0f) * e42));
        this.f50819z3 += (int) (org.telegram.messenger.g0.L(50.0f) * e42);
        org.telegram.ui.Components.or orVar2 = zwVar.K1;
        if (orVar2 != null) {
            int c10 = (int) orVar2.c(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            L += c10;
            this.f50819z3 += c10;
        }
        int L2 = L - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.f50819z3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = zwVar.w3();
        if (L2 != this.f39930f3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (zwVar.K) {
                ywVar.f52134x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                ywVar.f52134x.setPaddingTop(L2);
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                if (getChildAt(i14) instanceof jg.m) {
                    getChildAt(i14).requestLayout();
                }
            }
        }
        this.f50805l3 = false;
        if (this.f50804k3 && zwVar.getMessagesController().Y1) {
            if (ywVar.f52132s == 0 && zwVar.l4()) {
                this.f50805l3 = true;
                ((v4.b0) getLayoutManager()).h1(1, (int) zwVar.N);
                this.f50805l3 = false;
            }
            this.f50804k3 = false;
        }
        super.onMeasure(i7, i10);
        if (!zwVar.f52617m2 && L2 != 0 && (ywVarArr = zwVar.f52577e0) != null && ywVarArr.length > 1 && !zwVar.f52623n3 && (animatorSet = zwVar.f52596h3) != null) {
            animatorSet.isRunning();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.d1 d1Var;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        if (!this.V1) {
            zw zwVar = this.A3;
            if (!zwVar.f52568c1 && !zwVar.D) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                yw ywVar = this.f50806m3;
                if (action == 1 || action == 3) {
                    v4.y yVar = ywVar.f52128e;
                    if (yVar.D != 0) {
                        xw xwVar = ywVar.f52129f;
                        if (xwVar.f51828e) {
                            xwVar.f51829f = true;
                            if (yVar.i(null, 4) != 0 && (d1Var = ywVar.f52129f.d) != null) {
                                View view = d1Var.f57052a;
                                if (view instanceof org.telegram.ui.Cells.t2) {
                                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                                    long dialogId = t2Var.getDialogId();
                                    if (org.telegram.messenger.m5.D(dialogId)) {
                                        C1(false, t2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) zwVar.getMessagesController().Q.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.t3.Y(zwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                                                if (org.telegram.messenger.iz.m(i7) != 1) {
                                                    i10 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                                                    if (org.telegram.messenger.iz.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                                                        if (org.telegram.messenger.iz.m(i11) != 0) {
                                                            i12 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                                                            if (org.telegram.messenger.iz.m(i12) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                zwVar.D4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            zwVar.P2 = !zwVar.s4(dialog);
                                                            zwVar.D4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!zwVar.getMessagesController().r2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24474s0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.gc.a(zwVar)) {
                                                            org.telegram.ui.Components.gc.z(zwVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                                                        zwVar.Q2 = !org.telegram.messenger.qp.s1(i13).r2(dialogId, 0L, null);
                                                        if (zwVar.Q2 > 0) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                        zwVar.R2 = i14;
                                                        zwVar.D4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    zwVar.O2 = i15;
                                                    zwVar.D4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                zwVar.D4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (ywVar.f52132s == 0 && ((action == 1 || action == 3) && ywVar.f52133w == 2 && zwVar.l4() && ((v4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.t2 c42 = zw.c4(ywVar);
                    if (c42 != null) {
                        if (org.telegram.messenger.iz.f23431p1) {
                            f10 = 76.0f;
                        } else {
                            f10 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - zwVar.f52580e3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (ywVar.f52133w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    zwVar.f52585f2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.wq.h);
                                }
                                if (!zwVar.f52591g3) {
                                    zwVar.f52591g3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    iv ivVar = ywVar.f52130n;
                                    if (ivVar != null) {
                                        ivVar.a(true);
                                    }
                                }
                                c42.i0();
                                ywVar.f52133w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754923, null));
                                }
                            }
                            i16 = 2;
                        } else {
                            zwVar.f52585f2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.wq.h);
                            i16 = 2;
                            ywVar.f52133w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i16];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.camera.q.v(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.wq.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new va(this, 27));
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
        if (this.f50805l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(v4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f50804k3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f50808o3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        zw.B4 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.E1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
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
        return org.telegram.messenger.g0.L(48.0f);
    }
}
