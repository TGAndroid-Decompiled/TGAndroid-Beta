package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zw0 extends View {
    public static final String[] f54035s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f54036a;
    public ww0 f54037b;
    public ww0 f54038c;
    public final PointF d;
    public boolean f54039e;
    public boolean f54040f;
    public float h;
    public long f54041n;
    public boolean f54042r;

    public zw0(ProfileActivity profileActivity, ww0 ww0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f54042r = false;
        this.f54036a = profileActivity;
        this.f54037b = ww0Var;
    }

    public final boolean a() {
        ww0 ww0Var = this.f54037b;
        if (!ww0Var.f53015b || this.h < 1.0f) {
            return false;
        }
        if (ww0Var.f53016c.B() != null) {
            this.f54037b.f53016c.B().N(0, false, false);
            this.f54037b.f53016c.B().H(true);
        }
        this.f54042r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(ww0 ww0Var) {
        if (this.f54037b != ww0Var && ww0Var != null) {
            ArrayList arrayList = ww0Var.f53017e;
            if (this.f54042r) {
                this.f54038c = ww0Var;
                return;
            }
            if (this.f54040f) {
                for (int i7 = 0; i7 < this.f54037b.f53017e.size(); i7++) {
                    ((yw0) this.f54037b.f53017e.get(i7)).H0(null);
                }
                this.f54040f = false;
            }
            ww0 ww0Var2 = this.f54037b;
            ArrayList arrayList2 = ww0Var2.f53021j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && ww0Var2.f53020i) {
                ww0Var2.b(true);
                ww0Var2.f53020i = false;
            }
            this.f54037b = ww0Var;
            if (!this.f54040f) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((yw0) arrayList.get(i10)).H0(this);
                }
                this.f54040f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54037b.f53021j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f54040f) {
            for (int i7 = 0; i7 < this.f54037b.f53017e.size(); i7++) {
                ((yw0) this.f54037b.f53017e.get(i7)).H0(null);
            }
            this.f54040f = false;
        }
        ww0 ww0Var = this.f54037b;
        ArrayList arrayList = ww0Var.f53021j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && ww0Var.f53020i) {
            ww0Var.b(true);
            ww0Var.f53020i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f54037b.f53015b) {
            boolean z10 = true;
            if (!this.f54040f) {
                for (int i7 = 0; i7 < this.f54037b.f53017e.size(); i7++) {
                    ((yw0) this.f54037b.f53017e.get(i7)).H0(this);
                }
                this.f54040f = true;
                if (!this.f54039e) {
                    this.f54039e = true;
                    post(new pu0(this, 5));
                }
            }
            if (!this.f54042r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.f54041n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f54041n = currentTimeMillis;
            ProfileActivity profileActivity = this.f54036a;
            ou0 ou0Var = profileActivity.f43062a;
            int i10 = profileActivity.V2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= ou0Var.getChildCount()) {
                        break;
                    }
                    View childAt = ou0Var.getChildAt(i11);
                    if (i10 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.w8)) {
                        xh.l lVar = ((org.telegram.ui.Cells.w8) childAt).f31898a;
                        pointF.set(lVar.getX() + childAt.getX() + ou0Var.getX() + org.telegram.messenger.g0.L(12.0f), (lVar.getMeasuredHeight() / 2.0f) + lVar.getY() + childAt.getY() + ou0Var.getY());
                        break;
                    }
                    i11++;
                }
            }
            float f11 = jx.f();
            this.f54037b.f53016c.y0((getWidth() - org.telegram.messenger.g0.L(f11)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.g0.L(f11) * 0.5f)), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            ww0 ww0Var = null;
            this.f54037b.f53016c.h(canvas, null);
            this.f54037b.f53016c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = org.telegram.messenger.g0.L(110.0f);
            int size = this.f54037b.d.size() - 1;
            while (size >= 0) {
                yw0 yw0Var = (yw0) this.f54037b.d.get(size);
                float f12 = size;
                float s5 = org.telegram.messenger.g0.s(this.h, f12, this.f54037b.d.size(), 1.8f);
                float f13 = L;
                boolean z11 = z10;
                float f14 = f13 * 0.88f;
                float w10 = com.google.android.gms.internal.vision.e2.w(f14, this.f54037b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = f10;
                float f17 = pointF.y;
                float f18 = ((w10 - f15) * s5) + (f14 * f12) + f15;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = org.telegram.ui.Components.er.h.getInterpolation(Utilities.i(s5 / 0.4f, 1.0f, 0.0f));
                float f19 = (f13 / f16) * interpolation;
                float f20 = f13 * interpolation;
                yw0Var.y0(f18 - f19, (f17 - ((f17 + f13) * ((float) Math.pow(d, 2.0d)))) - f19, f20, f20);
                yw0Var.h(canvas, null);
                size--;
                ww0Var = null;
                pointF = pointF2;
                z10 = z11;
                f10 = f16;
            }
            ww0 ww0Var2 = ww0Var;
            if (this.h >= 1.0f) {
                this.f54042r = false;
                b(this.f54038c);
                this.f54038c = ww0Var2;
                return;
            }
            invalidate();
        }
    }
}
