package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class sw0 extends View {
    public static final String[] f49630s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f49631a;
    public pw0 f49632b;
    public pw0 f49633c;
    public final PointF d;
    public boolean f49634e;
    public boolean f49635f;
    public float h;
    public long f49636n;
    public boolean f49637r;

    public sw0(ProfileActivity profileActivity, pw0 pw0Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f49637r = false;
        this.f49631a = profileActivity;
        this.f49632b = pw0Var;
    }

    public final boolean a() {
        pw0 pw0Var = this.f49632b;
        if (!pw0Var.f48693b || this.h < 1.0f) {
            return false;
        }
        if (pw0Var.f48694c.B() != null) {
            this.f49632b.f48694c.B().N(0, false, false);
            this.f49632b.f48694c.B().H(true);
        }
        this.f49637r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(pw0 pw0Var) {
        if (this.f49632b != pw0Var && pw0Var != null) {
            ArrayList arrayList = pw0Var.f48695e;
            if (this.f49637r) {
                this.f49633c = pw0Var;
                return;
            }
            if (this.f49635f) {
                for (int i3 = 0; i3 < this.f49632b.f48695e.size(); i3++) {
                    ((rw0) this.f49632b.f48695e.get(i3)).H0(null);
                }
                this.f49635f = false;
            }
            pw0 pw0Var2 = this.f49632b;
            ArrayList arrayList2 = pw0Var2.f48699j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && pw0Var2.f48698i) {
                pw0Var2.b(true);
                pw0Var2.f48698i = false;
            }
            this.f49632b = pw0Var;
            if (!this.f49635f) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((rw0) arrayList.get(i10)).H0(this);
                }
                this.f49635f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49632b.f48699j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f49635f) {
            for (int i3 = 0; i3 < this.f49632b.f48695e.size(); i3++) {
                ((rw0) this.f49632b.f48695e.get(i3)).H0(null);
            }
            this.f49635f = false;
        }
        pw0 pw0Var = this.f49632b;
        ArrayList arrayList = pw0Var.f48699j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && pw0Var.f48698i) {
            pw0Var.b(true);
            pw0Var.f48698i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49632b.f48693b) {
            boolean z10 = true;
            if (!this.f49635f) {
                for (int i3 = 0; i3 < this.f49632b.f48695e.size(); i3++) {
                    ((rw0) this.f49632b.f48695e.get(i3)).H0(this);
                }
                this.f49635f = true;
                if (!this.f49634e) {
                    this.f49634e = true;
                    post(new pu0(this, 4));
                }
            }
            if (!this.f49637r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.i(this.h + (((float) Utilities.k(currentTimeMillis - this.f49636n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f49636n = currentTimeMillis;
            ProfileActivity profileActivity = this.f49631a;
            hu0 hu0Var = profileActivity.f41719a;
            int i10 = profileActivity.U2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= hu0Var.getChildCount()) {
                        break;
                    }
                    View childAt = hu0Var.getChildAt(i11);
                    if (i10 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.w8)) {
                        yh.l lVar = ((org.telegram.ui.Cells.w8) childAt).f30822a;
                        pointF.set(lVar.getX() + childAt.getX() + hu0Var.getX() + org.telegram.messenger.g0.L(12.0f), (lVar.getMeasuredHeight() / 2.0f) + lVar.getY() + childAt.getY() + hu0Var.getY());
                        break;
                    }
                    i11++;
                }
            }
            float f11 = fx.f();
            this.f49632b.f48694c.y0((getWidth() - org.telegram.messenger.g0.L(f11)) / 2.0f, Math.max(0.0f, pointF.y - (org.telegram.messenger.g0.L(f11) * 0.5f)), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            pw0 pw0Var = null;
            this.f49632b.f48694c.h(canvas, null);
            this.f49632b.f48694c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int L = org.telegram.messenger.g0.L(110.0f);
            int size = this.f49632b.d.size() - 1;
            while (size >= 0) {
                rw0 rw0Var = (rw0) this.f49632b.d.get(size);
                float f12 = size;
                float s6 = org.telegram.messenger.g0.s(this.h, f12, this.f49632b.d.size(), 1.8f);
                float f13 = L;
                boolean z11 = z10;
                float f14 = f13 * 0.88f;
                float c2 = com.google.android.recaptcha.internal.a.c(f14, this.f49632b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = f10;
                float f17 = pointF.y;
                float f18 = ((c2 - f15) * s6) + (f14 * f12) + f15;
                double d = this.h;
                PointF pointF2 = pointF;
                float interpolation = org.telegram.ui.Components.xq.h.getInterpolation(Utilities.i(s6 / 0.4f, 1.0f, 0.0f));
                float f19 = (f13 / f16) * interpolation;
                float f20 = f13 * interpolation;
                rw0Var.y0(f18 - f19, (f17 - ((f17 + f13) * ((float) Math.pow(d, 2.0d)))) - f19, f20, f20);
                rw0Var.h(canvas, null);
                size--;
                pw0Var = null;
                pointF = pointF2;
                z10 = z11;
                f10 = f16;
            }
            pw0 pw0Var2 = pw0Var;
            if (this.h >= 1.0f) {
                this.f49637r = false;
                b(this.f49633c);
                this.f49633c = pw0Var2;
                return;
            }
            invalidate();
        }
    }
}
