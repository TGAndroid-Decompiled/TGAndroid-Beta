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
public final class sw extends org.telegram.ui.Components.x9 implements di.f7 {
    public static final int B3 = 0;
    public final ww A3;
    public boolean j3;
    public boolean f49831k3;
    public boolean f49832l3;
    public final vw f49833m3;
    public int f49834n3;
    public float f49835o3;
    public final Paint f49836p3;
    public final RectF f49837q3;
    public org.telegram.ui.Components.pj0 f49838r3;
    public LongSparseArray f49839s3;
    public Paint f49840t3;
    public float f49841u3;
    public float f49842v3;
    public float f49843w3;
    public boolean f49844x3;
    public di.x9 f49845y3;
    public int f49846z3;

    public sw(ww wwVar, Context context, vw vwVar) {
        super(context, null);
        this.A3 = wwVar;
        this.f49831k3 = true;
        this.f49836p3 = new Paint();
        this.f49837q3 = new RectF();
        this.f49842v3 = 1.0f;
        this.f49833m3 = vwVar;
        this.f40271h3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(org.telegram.ui.qv r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.B1(org.telegram.ui.qv, float, boolean):void");
    }

    public final void C1(boolean z9, org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.messenger.iz.f23430q1 = !org.telegram.messenger.iz.f23430q1;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.iz.f23430q1);
        edit.apply();
        ww wwVar = this.A3;
        UndoView k42 = wwVar.k4();
        if (org.telegram.messenger.iz.f23430q1) {
            if (t2Var != null) {
                wwVar.f51558e2 = true;
                wwVar.f51541b1 = true;
                int top = (t2Var.getTop() - getPaddingTop()) + t2Var.getMeasuredHeight();
                if (wwVar.K && !wwVar.E0.g()) {
                    wwVar.R = true;
                    top += org.telegram.messenger.g0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.xq.f40367g);
                if (z9) {
                    wwVar.f51552d1 = true;
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
        if (org.telegram.messenger.iz.f23430q1) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        vw vwVar = this.f49833m3;
        vwVar.f50790w = i7;
        fv fvVar = vwVar.f50787n;
        if (fvVar != null) {
            if (i7 != 0) {
                z9 = true;
            }
            fvVar.X = z9;
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
        view.setTranslationY(ww.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.dispatchDraw(android.graphics.Canvas):void");
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
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) view).f30471r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return ww.A4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vw vwVar = this.f49833m3;
        if (vwVar.f50787n != null && ww.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            vwVar.f50787n.c(canvas, true);
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
            ww wwVar = this.A3;
            if (!wwVar.f51541b1 && !this.f49833m3.f50792y.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                    wwVar.f51547c1 = !kVar.v();
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
        this.f49834n3 = getPaddingTop();
        this.A3.f51660y3 = 0.0f;
        this.f49833m3.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        float f10;
        vw[] vwVarArr;
        AnimatorSet animatorSet;
        vw vwVar = this.f49833m3;
        int L0 = vwVar.f50784c.L0();
        ww wwVar = this.A3;
        if (L0 != -1 && vwVar.f50785e.D == 0 && vwVar.f50784c.f57022y < 0 && vwVar.f50782a.getScrollState() != 1) {
            v4.d1 K = vwVar.f50782a.K(L0);
            if (K != null) {
                int top = K.f57044a.getTop();
                if (vwVar.f50789s == 0 && wwVar.l4() && vwVar.f50790w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f49832l3 = true;
                vwVar.f50784c.h1(L0, (int) ((top - this.f49834n3) + wwVar.f51660y3 + 0));
                this.f49832l3 = false;
            }
        } else if (L0 == -1 && this.f49831k3) {
            cv cvVar = vwVar.f50784c;
            if (vwVar.f50789s == 0 && wwVar.l4()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            cvVar.h1(i11, (int) wwVar.N);
        }
        this.f49832l3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i12 = org.telegram.messenger.g0.f22557m;
        } else {
            i12 = 0;
        }
        int i13 = currentActionBarHeight + i12;
        if (wwVar.K && !wwVar.O) {
            i13 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!wwVar.O) {
            i13 += org.telegram.messenger.g0.L(48.0f);
        }
        this.f49846z3 = 0;
        float e42 = wwVar.e4(false);
        org.telegram.ui.Components.pr prVar = wwVar.J1;
        if (prVar != null) {
            f10 = prVar.getMetadata().f55503c.f55513a;
        } else {
            f10 = 0.0f;
        }
        int L = i13 + ((int) (org.telegram.messenger.g0.L(50.0f) * e42));
        this.f49846z3 += (int) (org.telegram.messenger.g0.L(50.0f) * e42);
        org.telegram.ui.Components.pr prVar2 = wwVar.J1;
        if (prVar2 != null) {
            int c10 = (int) prVar2.c(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            L += c10;
            this.f49846z3 += c10;
        }
        int L2 = L - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.f49846z3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = wwVar.w3();
        if (L2 != this.f40269f3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (wwVar.K) {
                vwVar.f50791x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                vwVar.f50791x.setPaddingTop(L2);
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                if (getChildAt(i14) instanceof jg.m) {
                    getChildAt(i14).requestLayout();
                }
            }
        }
        this.f49832l3 = false;
        if (this.f49831k3 && wwVar.getMessagesController().Y1) {
            if (vwVar.f50789s == 0 && wwVar.l4()) {
                this.f49832l3 = true;
                ((v4.b0) getLayoutManager()).h1(1, (int) wwVar.N);
                this.f49832l3 = false;
            }
            this.f49831k3 = false;
        }
        super.onMeasure(i7, i10);
        if (!wwVar.f51592l2 && L2 != 0 && (vwVarArr = wwVar.f51556e0) != null && vwVarArr.length > 1 && !wwVar.f51597m3 && (animatorSet = wwVar.f51570g3) != null) {
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
            ww wwVar = this.A3;
            if (!wwVar.f51541b1 && !wwVar.D) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                vw vwVar = this.f49833m3;
                if (action == 1 || action == 3) {
                    v4.y yVar = vwVar.f50785e;
                    if (yVar.D != 0) {
                        uw uwVar = vwVar.f50786f;
                        if (uwVar.f50431e) {
                            uwVar.f50432f = true;
                            if (yVar.i(null, 4) != 0 && (d1Var = vwVar.f50786f.d) != null) {
                                View view = d1Var.f57044a;
                                if (view instanceof org.telegram.ui.Cells.t2) {
                                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                                    long dialogId = t2Var.getDialogId();
                                    if (org.telegram.messenger.m5.D(dialogId)) {
                                        C1(false, t2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.t3.Y(wwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                if (org.telegram.messenger.iz.m(i7) != 1) {
                                                    i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                    if (org.telegram.messenger.iz.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                        if (org.telegram.messenger.iz.m(i11) != 0) {
                                                            i12 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                            if (org.telegram.messenger.iz.m(i12) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                wwVar.D4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            wwVar.O2 = !wwVar.s4(dialog);
                                                            wwVar.D4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!wwVar.getMessagesController().r2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24470s0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.hc.a(wwVar)) {
                                                            org.telegram.ui.Components.hc.z(wwVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                                        wwVar.P2 = !org.telegram.messenger.qp.s1(i13).r2(dialogId, 0L, null);
                                                        if (wwVar.P2 > 0) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                        wwVar.Q2 = i14;
                                                        wwVar.D4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    wwVar.N2 = i15;
                                                    wwVar.D4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                wwVar.D4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (vwVar.f50789s == 0 && ((action == 1 || action == 3) && vwVar.f50790w == 2 && wwVar.l4() && ((v4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.t2 c42 = ww.c4(vwVar);
                    if (c42 != null) {
                        if (org.telegram.messenger.iz.f23427p1) {
                            f10 = 76.0f;
                        } else {
                            f10 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - wwVar.f51553d3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (vwVar.f50790w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    wwVar.f51558e2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.xq.h);
                                }
                                if (!wwVar.f51565f3) {
                                    wwVar.f51565f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    fv fvVar = vwVar.f50787n;
                                    if (fvVar != null) {
                                        fvVar.a(true);
                                    }
                                }
                                c42.i0();
                                vwVar.f50790w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754923, null));
                                }
                            }
                            i16 = 2;
                        } else {
                            wwVar.f51558e2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.xq.h);
                            i16 = 2;
                            vwVar.f50790w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i16];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.camera.q.v(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
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
        if (this.f49832l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(v4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f49831k3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f49835o3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        ww.A4 = f10;
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
