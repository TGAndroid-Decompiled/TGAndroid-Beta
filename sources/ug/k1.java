package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import bi.b6;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.qv0;
public abstract class k1 extends uj0 implements is, m0 {
    public final ArrayList f58178f3;
    public final v4.b0 f58179g3;
    public boolean f58180h3;
    public boolean f58181i3;
    public final int j3;
    public boolean f58182k3;
    public boolean f58183l3;
    public final s4.s0 f58184m3;
    public final er f58185n3;
    public final ArrayList f58186o3;
    public final qv0 f58187p3;
    public View f58188q3;
    public boolean f58189r3;
    public int f58190s3;
    public int f58191t3;
    public boolean f58192u3;
    public boolean f58193v3;

    public k1(Context context, int i7) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f58178f3 = arrayList;
        this.f58180h3 = true;
        this.f58181i3 = true;
        t0 t0Var = (t0) this;
        this.f58184m3 = new s4.s0(t0Var, 5);
        this.f58185n3 = new er(0.0f, 0.5f, 0.5f, 1.0f);
        this.f58186o3 = new ArrayList();
        this.f58187p3 = new qv0(13);
        this.f58191t3 = -1;
        this.j3 = i7;
        v4.b0 b0Var = new v4.b0();
        this.f58179g3 = b0Var;
        setLayoutManager(b0Var);
        setAdapter(new h1(t0Var));
        setClipChildren(false);
        setOnScrollListener(new ri(t0Var, 29));
        setOnItemClickListener(new b6(t0Var, 23));
        si.b0(i7).o1();
        arrayList.clear();
        arrayList.addAll(si.b0(i7).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.f58193v3) {
            return;
        }
        s4.s0 s0Var = this.f58184m3;
        org.telegram.messenger.g0.r(s0Var);
        org.telegram.messenger.g0.i3(s0Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25532l5) {
            ArrayList arrayList = this.f58178f3;
            arrayList.clear();
            arrayList.addAll(si.b0(this.j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f58192u3) {
            ArrayList arrayList = this.f58186o3;
            arrayList.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                j1 j1Var = (j1) getChildAt(i7);
                float measuredHeight = ((j1Var.getMeasuredHeight() + j1Var.getTop()) + (j1Var.getMeasuredHeight() >> 1)) / (j1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                j1Var.f58155a = i10;
                j1Var.f58156b.setTranslationX((1.0f - this.f58185n3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(j1Var);
            }
            Collections.sort(arrayList, this.f58187p3);
            if ((this.f58181i3 || this.f58189r3) && arrayList.size() > 0 && !this.f58178f3.isEmpty()) {
                View view = (View) i5.c.h(1, arrayList);
                this.f58188q3 = view;
                z1(view, !this.f58181i3);
                this.f58181i3 = false;
                this.f58189r3 = false;
            } else if (this.f58188q3 != i5.c.h(1, arrayList)) {
                this.f58188q3 = (View) i5.c.h(1, arrayList);
                if (this.f58183l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((j1) arrayList.get(i11)).getX(), ((j1) arrayList.get(i11)).getY());
                ((j1) arrayList.get(i11)).draw(canvas);
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
        ns.f(this.j3).c(this, ns.f25532l5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.j3).n(this, ns.f25532l5);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f58180h3 && !this.f58178f3.isEmpty() && getChildCount() > 0) {
            this.f58180h3 = false;
            org.telegram.messenger.g0.h3(new q2.d(this, 24));
        }
        int i13 = this.f58191t3;
        if (i13 > 0) {
            v4.e1 K = K(i13);
            if (K != null) {
                z1(K.f58535a, false);
            }
            this.f58191t3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) {
            this.f58190s3 = View.MeasureSpec.getSize(i7);
        } else {
            this.f58190s3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i7, i10);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f58193v3 != z10) {
            this.f58193v3 = z10;
            if (z10) {
                A1();
                this.f58189r3 = true;
                invalidate();
                return;
            }
            org.telegram.messenger.g0.r(this.f58184m3);
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
        if (this.f58192u3 != z10) {
            this.f58192u3 = z10;
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
        this.f58182k3 = z11;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            j1 j1Var = (j1) getChildAt(i7);
            if (j1Var == view) {
                j1Var.a(true, true, z10);
            } else {
                j1Var.a(!this.f58182k3, false, z10);
            }
        }
    }
}
