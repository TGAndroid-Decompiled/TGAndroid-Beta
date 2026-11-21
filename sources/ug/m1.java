package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import bi.l8;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.qw0;
public abstract class m1 extends ek0 implements fs, n0 {
    public final ArrayList f58818f3;
    public final v4.c0 f58819g3;
    public boolean f58820h3;
    public boolean f58821i3;
    public final int j3;
    public boolean f58822k3;
    public boolean f58823l3;
    public final s4.s0 f58824m3;
    public final nr f58825n3;
    public final ArrayList f58826o3;
    public final qw0 f58827p3;
    public View f58828q3;
    public boolean f58829r3;
    public int f58830s3;
    public int f58831t3;
    public boolean f58832u3;
    public boolean f58833v3;

    public m1(Context context, int i7) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f58818f3 = arrayList;
        this.f58820h3 = true;
        this.f58821i3 = true;
        u0 u0Var = (u0) this;
        this.f58824m3 = new s4.s0(u0Var, 5);
        this.f58825n3 = new nr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f58826o3 = new ArrayList();
        this.f58827p3 = new qw0(12);
        this.f58831t3 = -1;
        this.j3 = i7;
        v4.c0 c0Var = new v4.c0();
        this.f58819g3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new j1(u0Var));
        setClipChildren(false);
        setOnScrollListener(new i1(u0Var, 0));
        setOnItemClickListener(new l8(u0Var, 23));
        ri.d0(i7).r1();
        arrayList.clear();
        arrayList.addAll(ri.d0(i7).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.f58833v3) {
            return;
        }
        s4.s0 s0Var = this.f58824m3;
        org.telegram.messenger.g0.r(s0Var);
        org.telegram.messenger.g0.h3(s0Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25192o5) {
            ArrayList arrayList = this.f58818f3;
            arrayList.clear();
            arrayList.addAll(ri.d0(this.j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f58832u3) {
            ArrayList arrayList = this.f58826o3;
            arrayList.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                l1 l1Var = (l1) getChildAt(i7);
                float measuredHeight = ((l1Var.getMeasuredHeight() + l1Var.getTop()) + (l1Var.getMeasuredHeight() >> 1)) / (l1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                l1Var.f58794a = i10;
                l1Var.f58795b.setTranslationX((1.0f - this.f58825n3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(l1Var);
            }
            Collections.sort(arrayList, this.f58827p3);
            if ((this.f58821i3 || this.f58829r3) && arrayList.size() > 0 && !this.f58818f3.isEmpty()) {
                View view = (View) i5.c.h(1, arrayList);
                this.f58828q3 = view;
                z1(view, !this.f58821i3);
                this.f58821i3 = false;
                this.f58829r3 = false;
            } else if (this.f58828q3 != i5.c.h(1, arrayList)) {
                this.f58828q3 = (View) i5.c.h(1, arrayList);
                if (this.f58823l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((l1) arrayList.get(i11)).getX(), ((l1) arrayList.get(i11)).getY());
                ((l1) arrayList.get(i11)).draw(canvas);
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
        ks.f(this.j3).c(this, ks.f25192o5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.j3).n(this, ks.f25192o5);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f58820h3 && !this.f58818f3.isEmpty() && getChildCount() > 0) {
            this.f58820h3 = false;
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 27));
        }
        int i13 = this.f58831t3;
        if (i13 > 0) {
            v4.f1 K = K(i13);
            if (K != null) {
                z1(K.f59161a, false);
            }
            this.f58831t3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) {
            this.f58830s3 = View.MeasureSpec.getSize(i7);
        } else {
            this.f58830s3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i7, i10);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f58833v3 != z10) {
            this.f58833v3 = z10;
            if (z10) {
                A1();
                this.f58829r3 = true;
                invalidate();
                return;
            }
            org.telegram.messenger.g0.r(this.f58824m3);
            z1(null, true);
        }
    }

    @Override
    public void setOffset(float f10) {
        boolean z10;
        if (Math.abs(f10 / getMeasuredWidth()) < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f58832u3 != z10) {
            this.f58832u3 = z10;
            invalidate();
        }
    }

    public final void z1(View view, boolean z10) {
        boolean z11;
        if (view != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f58822k3 = z11;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            l1 l1Var = (l1) getChildAt(i7);
            if (l1Var == view) {
                l1Var.a(true, true, z10);
            } else {
                l1Var.a(!this.f58822k3, false, z10);
            }
        }
    }
}
