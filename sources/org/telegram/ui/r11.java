package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r11 extends View {
    public static final String[] f41466s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f41467a;
    public o11 f41468b;
    public o11 f41469c;
    public final PointF d;
    public boolean f41470e;
    public boolean f41471f;
    public float h;
    public long f41472n;
    public boolean f41473r;

    public r11(ProfileActivity profileActivity, o11 o11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f41473r = false;
        this.f41467a = profileActivity;
        this.f41468b = o11Var;
    }

    public final boolean a() {
        o11 o11Var = this.f41468b;
        if (!o11Var.f40533b || this.h < 1.0f) {
            return false;
        }
        if (o11Var.f40534c.getLottieAnimation() != null) {
            this.f41468b.f40534c.getLottieAnimation().N(0, false, false);
            this.f41468b.f40534c.getLottieAnimation().H(true);
        }
        this.f41473r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(o11 o11Var) {
        if (this.f41468b != o11Var && o11Var != null) {
            ArrayList arrayList = o11Var.f40535e;
            if (this.f41473r) {
                this.f41469c = o11Var;
                return;
            }
            if (this.f41471f) {
                for (int i10 = 0; i10 < this.f41468b.f40535e.size(); i10++) {
                    ((q11) this.f41468b.f40535e.get(i10)).setParentView(null);
                }
                this.f41471f = false;
            }
            o11 o11Var2 = this.f41468b;
            ArrayList arrayList2 = o11Var2.f40539j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && o11Var2.f40538i) {
                o11Var2.b(true);
                o11Var2.f40538i = false;
            }
            this.f41468b = o11Var;
            if (!this.f41471f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((q11) arrayList.get(i11)).setParentView(this);
                }
                this.f41471f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41468b.f40539j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41471f) {
            for (int i10 = 0; i10 < this.f41468b.f40535e.size(); i10++) {
                ((q11) this.f41468b.f40535e.get(i10)).setParentView(null);
            }
            this.f41471f = false;
        }
        o11 o11Var = this.f41468b;
        ArrayList arrayList = o11Var.f40539j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && o11Var.f40538i) {
            o11Var.b(true);
            o11Var.f40538i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41468b.f40533b) {
            boolean z10 = true;
            if (!this.f41471f) {
                for (int i10 = 0; i10 < this.f41468b.f40535e.size(); i10++) {
                    ((q11) this.f41468b.f40535e.get(i10)).setParentView(this);
                }
                this.f41471f = true;
                if (!this.f41470e) {
                    this.f41470e = true;
                    post(new pz0(this, 4));
                }
            }
            if (!this.f41473r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f41472n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f41472n = currentTimeMillis;
            ProfileActivity profileActivity = this.f41467a;
            gz0 gz0Var = profileActivity.f34048a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= gz0Var.getChildCount()) {
                        break;
                    }
                    View childAt = gz0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f21693a;
                        pointF.set(nVar.getX() + childAt.getX() + gz0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + gz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = hz.f();
            this.f41468b.f40534c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f41468b.f40534c.draw(canvas);
            this.f41468b.f40534c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f41468b.d.size() - 1;
            while (size >= 0) {
                q11 q11Var = (q11) this.f41468b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f41468b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float u10 = com.google.android.gms.internal.vision.e2.u(f13, this.f41468b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((u10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.js.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                q11Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                q11Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f41473r = false;
                b(this.f41469c);
                this.f41469c = null;
                return;
            }
            invalidate();
        }
    }
}
