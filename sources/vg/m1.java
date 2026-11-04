package vg;

import ai.j6;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public abstract class m1 extends tj0 implements cs, k0 {
    public final ArrayList f56724f3;
    public final u4.b0 f56725g3;
    public boolean f56726h3;
    public boolean i3;
    public final int f56727j3;
    public boolean f56728k3;
    public boolean f56729l3;
    public final lt f56730m3;
    public final xq f56731n3;
    public final ArrayList f56732o3;
    public final i1 f56733p3;
    public View f56734q3;
    public boolean f56735r3;
    public int f56736s3;
    public int f56737t3;
    public boolean f56738u3;
    public boolean f56739v3;

    public m1(Context context, int i3) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f56724f3 = arrayList;
        this.f56726h3 = true;
        this.i3 = true;
        r0 r0Var = (r0) this;
        this.f56730m3 = new lt(r0Var, 28);
        this.f56731n3 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
        this.f56732o3 = new ArrayList();
        this.f56733p3 = new i1(0);
        this.f56737t3 = -1;
        this.f56727j3 = i3;
        u4.b0 b0Var = new u4.b0();
        this.f56725g3 = b0Var;
        setLayoutManager(b0Var);
        setAdapter(new j1(r0Var));
        setClipChildren(false);
        setOnScrollListener(new ji(r0Var, 29));
        setOnItemClickListener(new j6(r0Var, 23));
        li.b0(i3).o1();
        arrayList.clear();
        arrayList.addAll(li.b0(i3).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.f56739v3) {
            return;
        }
        lt ltVar = this.f56730m3;
        org.telegram.messenger.g0.r(ltVar);
        org.telegram.messenger.g0.i3(ltVar, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23264l5) {
            ArrayList arrayList = this.f56724f3;
            arrayList.clear();
            arrayList.addAll(li.b0(this.f56727j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f56738u3) {
            ArrayList arrayList = this.f56732o3;
            arrayList.clear();
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                l1 l1Var = (l1) getChildAt(i3);
                float measuredHeight = ((l1Var.getMeasuredHeight() + l1Var.getTop()) + (l1Var.getMeasuredHeight() >> 1)) / (l1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                l1Var.f56702a = i10;
                l1Var.f56703b.setTranslationX((1.0f - this.f56731n3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(l1Var);
            }
            Collections.sort(arrayList, this.f56733p3);
            if ((this.i3 || this.f56735r3) && arrayList.size() > 0 && !this.f56724f3.isEmpty()) {
                View view = (View) k2.p1.h(1, arrayList);
                this.f56734q3 = view;
                z1(view, !this.i3);
                this.i3 = false;
                this.f56735r3 = false;
            } else if (this.f56734q3 != k2.p1.h(1, arrayList)) {
                this.f56734q3 = (View) k2.p1.h(1, arrayList);
                if (this.f56729l3) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f56727j3).c(this, hs.f23264l5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f56727j3).n(this, hs.f23264l5);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f56726h3 && !this.f56724f3.isEmpty() && getChildCount() > 0) {
            this.f56726h3 = false;
            org.telegram.messenger.g0.h3(new r4.u(this, 21));
        }
        int i13 = this.f56737t3;
        if (i13 > 0) {
            u4.d1 K = K(i13);
            if (K != null) {
                z1(K.f55540a, false);
            }
            this.f56737t3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i3)) {
            this.f56736s3 = View.MeasureSpec.getSize(i3);
        } else {
            this.f56736s3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i3, i10);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f56739v3 != z10) {
            this.f56739v3 = z10;
            if (z10) {
                A1();
                this.f56735r3 = true;
                invalidate();
                return;
            }
            org.telegram.messenger.g0.r(this.f56730m3);
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
        if (this.f56738u3 != z10) {
            this.f56738u3 = z10;
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
        this.f56728k3 = z11;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            l1 l1Var = (l1) getChildAt(i3);
            if (l1Var == view) {
                l1Var.a(true, true, z10);
            } else {
                l1Var.a(!this.f56728k3, false, z10);
            }
        }
    }
}
