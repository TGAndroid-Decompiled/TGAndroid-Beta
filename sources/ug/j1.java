package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.xq;
import org.telegram.ui.un0;
public abstract class j1 extends pj0 implements ls, l0 {
    public final ArrayList f56555e3;
    public final v4.b0 f56556f3;
    public boolean f56557g3;
    public boolean f56558h3;
    public final int f56559i3;
    public boolean j3;
    public boolean f56560k3;
    public final tg.y f56561l3;
    public final xq f56562m3;
    public final ArrayList f56563n3;
    public final un0 f56564o3;
    public View f56565p3;
    public boolean f56566q3;
    public int f56567r3;
    public int f56568s3;
    public boolean f56569t3;
    public boolean f56570u3;

    public j1(Context context, int i7) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f56555e3 = arrayList;
        this.f56557g3 = true;
        this.f56558h3 = true;
        s0 s0Var = (s0) this;
        this.f56561l3 = new tg.y(s0Var, 2);
        this.f56562m3 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
        this.f56563n3 = new ArrayList();
        this.f56564o3 = new un0(13);
        this.f56568s3 = -1;
        this.f56559i3 = i7;
        v4.b0 b0Var = new v4.b0();
        this.f56556f3 = b0Var;
        setLayoutManager(b0Var);
        setAdapter(new g1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new ui(s0Var, 26));
        setOnItemClickListener(new ai.k(s0Var, 22));
        org.telegram.messenger.ui.b0(i7).o1();
        arrayList.clear();
        arrayList.addAll(org.telegram.messenger.ui.b0(i7).B0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.f56570u3) {
            return;
        }
        tg.y yVar = this.f56561l3;
        org.telegram.messenger.g0.r(yVar);
        org.telegram.messenger.g0.i3(yVar, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25018l5) {
            ArrayList arrayList = this.f56555e3;
            arrayList.clear();
            arrayList.addAll(org.telegram.messenger.ui.b0(this.f56559i3).B0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f56569t3) {
            ArrayList arrayList = this.f56563n3;
            arrayList.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                i1 i1Var = (i1) getChildAt(i7);
                float measuredHeight = ((i1Var.getMeasuredHeight() + i1Var.getTop()) + (i1Var.getMeasuredHeight() >> 1)) / (i1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                i1Var.f56537a = i10;
                i1Var.f56538b.setTranslationX((1.0f - this.f56562m3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(i1Var);
            }
            Collections.sort(arrayList, this.f56564o3);
            if ((this.f56558h3 || this.f56566q3) && arrayList.size() > 0 && !this.f56555e3.isEmpty()) {
                View view = (View) jg.g.i(1, arrayList);
                this.f56565p3 = view;
                z1(view, !this.f56558h3);
                this.f56558h3 = false;
                this.f56566q3 = false;
            } else if (this.f56565p3 != jg.g.i(1, arrayList)) {
                this.f56565p3 = (View) jg.g.i(1, arrayList);
                if (this.f56560k3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((i1) arrayList.get(i11)).getX(), ((i1) arrayList.get(i11)).getY());
                ((i1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f56559i3).c(this, qs.f25018l5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f56559i3).n(this, qs.f25018l5);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f56557g3 && !this.f56555e3.isEmpty() && getChildCount() > 0) {
            this.f56557g3 = false;
            org.telegram.messenger.g0.h3(new sg.t0(this, 19));
        }
        int i13 = this.f56568s3;
        if (i13 > 0) {
            v4.d1 K = K(i13);
            if (K != null) {
                z1(K.f56952a, false);
            }
            this.f56568s3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) {
            this.f56567r3 = View.MeasureSpec.getSize(i7);
        } else {
            this.f56567r3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i7, i10);
    }

    public void setAutoPlayEnabled(boolean z9) {
        if (this.f56570u3 != z9) {
            this.f56570u3 = z9;
            if (z9) {
                A1();
                this.f56566q3 = true;
                invalidate();
                return;
            }
            org.telegram.messenger.g0.r(this.f56561l3);
            z1(null, true);
        }
    }

    @Override
    public void setOffset(float f10) {
        boolean z9;
        if (Math.abs(f10 / getMeasuredWidth()) < 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f56569t3 != z9) {
            this.f56569t3 = z9;
            invalidate();
        }
    }

    public final void z1(View view, boolean z9) {
        boolean z10;
        if (view != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.j3 = z10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            i1 i1Var = (i1) getChildAt(i7);
            if (i1Var == view) {
                i1Var.a(true, true, z9);
            } else {
                i1Var.a(!this.j3, false, z9);
            }
        }
    }
}
