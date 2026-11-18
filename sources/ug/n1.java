package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import bi.h8;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.qw0;
public abstract class n1 extends ck0 implements fs, o0 {
    public final ArrayList f58785f3;
    public final v4.c0 f58786g3;
    public boolean f58787h3;
    public boolean f58788i3;
    public final int j3;
    public boolean f58789k3;
    public boolean f58790l3;
    public final s4.s0 f58791m3;
    public final lr f58792n3;
    public final ArrayList f58793o3;
    public final qw0 f58794p3;
    public View f58795q3;
    public boolean f58796r3;
    public int f58797s3;
    public int f58798t3;
    public boolean f58799u3;
    public boolean f58800v3;

    public n1(Context context, int i7) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f58785f3 = arrayList;
        this.f58787h3 = true;
        this.f58788i3 = true;
        v0 v0Var = (v0) this;
        this.f58791m3 = new s4.s0(v0Var, 5);
        this.f58792n3 = new lr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f58793o3 = new ArrayList();
        this.f58794p3 = new qw0(12);
        this.f58798t3 = -1;
        this.j3 = i7;
        v4.c0 c0Var = new v4.c0();
        this.f58786g3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new k1(v0Var));
        setClipChildren(false);
        setOnScrollListener(new j1(v0Var, 0));
        setOnItemClickListener(new h8(v0Var, 23));
        ri.d0(i7).r1();
        arrayList.clear();
        arrayList.addAll(ri.d0(i7).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.f58800v3) {
            return;
        }
        s4.s0 s0Var = this.f58791m3;
        org.telegram.messenger.g0.r(s0Var);
        org.telegram.messenger.g0.h3(s0Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25164o5) {
            ArrayList arrayList = this.f58785f3;
            arrayList.clear();
            arrayList.addAll(ri.d0(this.j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f58799u3) {
            ArrayList arrayList = this.f58793o3;
            arrayList.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                m1 m1Var = (m1) getChildAt(i7);
                float measuredHeight = ((m1Var.getMeasuredHeight() + m1Var.getTop()) + (m1Var.getMeasuredHeight() >> 1)) / (m1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                m1Var.f58766a = i10;
                m1Var.f58767b.setTranslationX((1.0f - this.f58792n3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(m1Var);
            }
            Collections.sort(arrayList, this.f58794p3);
            if ((this.f58788i3 || this.f58796r3) && arrayList.size() > 0 && !this.f58785f3.isEmpty()) {
                View view = (View) i5.c.h(1, arrayList);
                this.f58795q3 = view;
                z1(view, !this.f58788i3);
                this.f58788i3 = false;
                this.f58796r3 = false;
            } else if (this.f58795q3 != i5.c.h(1, arrayList)) {
                this.f58795q3 = (View) i5.c.h(1, arrayList);
                if (this.f58790l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((m1) arrayList.get(i11)).getX(), ((m1) arrayList.get(i11)).getY());
                ((m1) arrayList.get(i11)).draw(canvas);
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
        ks.f(this.j3).c(this, ks.f25164o5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.j3).n(this, ks.f25164o5);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f58787h3 && !this.f58785f3.isEmpty() && getChildCount() > 0) {
            this.f58787h3 = false;
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 27));
        }
        int i13 = this.f58798t3;
        if (i13 > 0) {
            v4.f1 K = K(i13);
            if (K != null) {
                z1(K.f59123a, false);
            }
            this.f58798t3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) {
            this.f58797s3 = View.MeasureSpec.getSize(i7);
        } else {
            this.f58797s3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i7, i10);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f58800v3 != z10) {
            this.f58800v3 = z10;
            if (z10) {
                A1();
                this.f58796r3 = true;
                invalidate();
                return;
            }
            org.telegram.messenger.g0.r(this.f58791m3);
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
        if (this.f58799u3 != z10) {
            this.f58799u3 = z10;
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
        this.f58789k3 = z11;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m1 m1Var = (m1) getChildAt(i7);
            if (m1Var == view) {
                m1Var.a(true, true, z10);
            } else {
                m1Var.a(!this.f58789k3, false, z10);
            }
        }
    }
}
