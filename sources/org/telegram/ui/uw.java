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
public final class uw extends org.telegram.ui.Components.t9 implements fi.z6 {
    public static final int C3 = 0;
    public int A3;
    public final yw B3;
    public boolean f52036k3;
    public boolean f52037l3;
    public boolean f52038m3;
    public final xw f52039n3;
    public int f52040o3;
    public float f52041p3;
    public final Paint f52042q3;
    public final RectF f52043r3;
    public org.telegram.ui.Components.uj0 f52044s3;
    public LongSparseArray f52045t3;
    public Paint f52046u3;
    public float f52047v3;
    public float f52048w3;
    public float f52049x3;
    public boolean f52050y3;
    public fi.q9 f52051z3;

    public uw(yw ywVar, Context context, xw xwVar) {
        super(context, null);
        this.B3 = ywVar;
        this.f52037l3 = true;
        this.f52042q3 = new Paint();
        this.f52043r3 = new RectF();
        this.f52048w3 = 1.0f;
        this.f52039n3 = xwVar;
        this.f39615i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(org.telegram.ui.sv r14, float r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.B1(org.telegram.ui.sv, float, boolean):void");
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.messenger.gz.f23974q1 = !org.telegram.messenger.gz.f23974q1;
        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.gz.f23974q1);
        edit.apply();
        yw ywVar = this.B3;
        UndoView k42 = ywVar.k4();
        if (org.telegram.messenger.gz.f23974q1) {
            if (t2Var != null) {
                ywVar.f53680g2 = true;
                ywVar.f53663d1 = true;
                int top = (t2Var.getTop() - getPaddingTop()) + t2Var.getMeasuredHeight();
                if (ywVar.L && !ywVar.F0.g()) {
                    ywVar.S = true;
                    top += org.telegram.messenger.g0.L(81.0f);
                }
                w0(0, top, org.telegram.ui.Components.er.f34421g);
                if (z10) {
                    ywVar.f53674f1 = true;
                } else {
                    D1();
                }
            }
            k42.l(0L, 6, null, null);
            return;
        }
        k42.l(0L, 7, null, null);
        D1();
        if (z10 && t2Var != null) {
            t2Var.d0();
            t2Var.invalidate();
        }
    }

    public final void D1() {
        int i7;
        boolean z10 = false;
        if (org.telegram.messenger.gz.f23974q1) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        xw xwVar = this.f52039n3;
        xwVar.f53339w = i7;
        gv gvVar = xwVar.f53336n;
        if (gvVar != null) {
            if (i7 != 0) {
                z10 = true;
            }
            gvVar.X = z10;
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
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(yw.C4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.dispatchDraw(android.graphics.Canvas):void");
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
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) view).f31623r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return yw.C4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xw xwVar = this.f52039n3;
        if (xwVar.f53336n != null && yw.C4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            xwVar.f53336n.c(canvas, true);
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
            yw ywVar = this.B3;
            if (!ywVar.f53663d1 && !this.f52039n3.f53341y.k()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                    ywVar.f53668e1 = !kVar.x();
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
        this.f52040o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.f52039n3.getClass();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        float f10;
        xw[] xwVarArr;
        AnimatorSet animatorSet;
        xw xwVar = this.f52039n3;
        int L0 = xwVar.f53333c.L0();
        yw ywVar = this.B3;
        if (L0 != -1 && xwVar.f53334e.E == 0 && xwVar.f53333c.f58498y < 0 && xwVar.f53331a.getScrollState() != 1) {
            v4.e1 K = xwVar.f53331a.K(L0);
            if (K != null) {
                int top = K.f58535a.getTop();
                if (xwVar.f53338s == 0 && ywVar.l4() && xwVar.f53339w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f52038m3 = true;
                xwVar.f53333c.h1(L0, (int) ((top - this.f52040o3) + ywVar.A3 + 0));
                this.f52038m3 = false;
            }
        } else if (L0 == -1 && this.f52037l3) {
            dv dvVar = xwVar.f53333c;
            if (xwVar.f53338s == 0 && ywVar.l4()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            dvVar.h1(i11, (int) ywVar.O);
        }
        this.f52038m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i12 = org.telegram.messenger.g0.f23603m;
        } else {
            i12 = 0;
        }
        int i13 = currentActionBarHeight + i12;
        if (ywVar.L && !ywVar.P) {
            i13 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!ywVar.P) {
            i13 += org.telegram.messenger.g0.L(48.0f);
        }
        this.A3 = 0;
        float e42 = ywVar.e4(false);
        org.telegram.ui.Components.vr vrVar = ywVar.L1;
        if (vrVar != null) {
            f10 = vrVar.getMetadata().f57097c.f57107a;
        } else {
            f10 = 0.0f;
        }
        int L = i13 + ((int) (org.telegram.messenger.g0.L(50.0f) * e42));
        this.A3 += (int) (org.telegram.messenger.g0.L(50.0f) * e42);
        org.telegram.ui.Components.vr vrVar2 = ywVar.L1;
        if (vrVar2 != null) {
            int c10 = (int) vrVar2.c(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            L += c10;
            this.A3 += c10;
        }
        int L2 = L - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.A3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = ywVar.w3();
        if (L2 != this.f39613g3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (ywVar.L) {
                xwVar.f53340x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                xwVar.f53340x.setPaddingTop(L2);
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                if (getChildAt(i14) instanceof jg.l) {
                    getChildAt(i14).requestLayout();
                }
            }
        }
        this.f52038m3 = false;
        if (this.f52037l3 && ywVar.getMessagesController().Z1) {
            if (xwVar.f53338s == 0 && ywVar.l4()) {
                this.f52038m3 = true;
                ((v4.b0) getLayoutManager()).h1(1, (int) ywVar.O);
                this.f52038m3 = false;
            }
            this.f52037l3 = false;
        }
        super.onMeasure(i7, i10);
        if (!ywVar.f53712n2 && L2 != 0 && (xwVarArr = ywVar.f53673f0) != null && xwVarArr.length > 1 && !ywVar.f53718o3 && (animatorSet = ywVar.f53691i3) != null) {
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
            yw ywVar = this.B3;
            if (!ywVar.f53663d1 && !ywVar.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                xw xwVar = this.f52039n3;
                if (action == 1 || action == 3) {
                    v4.y yVar = xwVar.f53334e;
                    if (yVar.E != 0) {
                        ww wwVar = xwVar.f53335f;
                        if (wwVar.f53012e) {
                            wwVar.f53013f = true;
                            if (yVar.i(null, 4) != 0 && (e1Var = xwVar.f53335f.d) != null) {
                                View view = e1Var.f58535a;
                                if (view instanceof org.telegram.ui.Cells.t2) {
                                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                                    long dialogId = t2Var.getDialogId();
                                    if (org.telegram.messenger.m5.D(dialogId)) {
                                        C1(false, t2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (!org.telegram.messenger.t3.Y(ywVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                if (org.telegram.messenger.gz.m(i7) != 1) {
                                                    i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                    if (org.telegram.messenger.gz.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                        if (org.telegram.messenger.gz.m(i11) != 0) {
                                                            i12 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                            if (org.telegram.messenger.gz.m(i12) == 4) {
                                                                ArrayList arrayList = new ArrayList();
                                                                arrayList.add(Long.valueOf(dialogId));
                                                                ywVar.D4(arrayList, 102, true, false, null);
                                                            }
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            arrayList2.add(Long.valueOf(dialogId));
                                                            ywVar.Q2 = !ywVar.s4(dialog);
                                                            ywVar.D4(arrayList2, 100, true, false, null);
                                                        }
                                                    } else if (!ywVar.getMessagesController().r2(dialogId, 0L, null)) {
                                                        org.telegram.messenger.at.t(org.telegram.messenger.m10.f24934t0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.cc.a(ywVar)) {
                                                            org.telegram.ui.Components.cc.z(ywVar, 3, 0, null).j();
                                                        }
                                                    } else {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        arrayList3.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                                        ywVar.R2 = !org.telegram.messenger.np.s1(i13).r2(dialogId, 0L, null);
                                                        if (ywVar.R2 > 0) {
                                                            i14 = 0;
                                                        } else {
                                                            i14 = 1;
                                                        }
                                                        ywVar.S2 = i14;
                                                        ywVar.D4(arrayList3, 104, true, false, null);
                                                    }
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(Long.valueOf(dialogId));
                                                    if (dialog.unread_count <= 0 && !dialog.unread_mark) {
                                                        i15 = 0;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                    ywVar.P2 = i15;
                                                    ywVar.D4(arrayList4, 101, true, false, null);
                                                }
                                            } else {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                ywVar.D4(arrayList5, 111, true, false, null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (xwVar.f53338s == 0 && ((action == 1 || action == 3) && xwVar.f53339w == 2 && ywVar.l4() && ((v4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.t2 c42 = yw.c4(xwVar);
                    if (c42 != null) {
                        if (org.telegram.messenger.gz.f23971p1) {
                            f10 = 76.0f;
                        } else {
                            f10 = 70.0f;
                        }
                        int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - ywVar.f53676f3;
                        if (measuredHeight >= L && currentTimeMillis >= 200) {
                            if (xwVar.f53339w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    ywVar.f53680g2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.er.h);
                                }
                                if (!ywVar.f53686h3) {
                                    ywVar.f53686h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    gv gvVar = xwVar.f53336n;
                                    if (gvVar != null) {
                                        gvVar.a(true);
                                    }
                                }
                                c42.j0();
                                xwVar.f53339w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.hd.M0(2131754923, null));
                                }
                            }
                            i16 = 2;
                        } else {
                            ywVar.f53680g2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.er.h);
                            i16 = 2;
                            xwVar.f53339w = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i16];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, org.telegram.messenger.i20.v(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Cells.w9(this, 28));
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
        if (this.f52038m3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAdapter(v4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f52037l3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.f52041p3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        yw.C4 = f10;
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
