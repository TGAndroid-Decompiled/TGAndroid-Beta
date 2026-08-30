package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y01 extends View {
    public static final String[] f40342s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40343a;
    public v01 f40344b;
    public v01 f40345c;
    public final PointF d;
    public boolean e;
    public boolean f40346f;
    public float h;
    public long f40347n;
    public boolean f40348r;

    public y01(ProfileActivity profileActivity, v01 v01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40348r = false;
        this.f40343a = profileActivity;
        this.f40344b = v01Var;
    }

    public final boolean a() {
        v01 v01Var = this.f40344b;
        if (!v01Var.f39035b || this.h < 1.0f) {
            return false;
        }
        if (v01Var.f39036c.getLottieAnimation() != null) {
            this.f40344b.f39036c.getLottieAnimation().L(0, false, false);
            this.f40344b.f39036c.getLottieAnimation().F(true);
        }
        this.f40348r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(v01 v01Var) {
        if (this.f40344b != v01Var && v01Var != null) {
            ArrayList arrayList = v01Var.e;
            if (this.f40348r) {
                this.f40345c = v01Var;
                return;
            }
            if (this.f40346f) {
                for (int i10 = 0; i10 < this.f40344b.e.size(); i10++) {
                    ((x01) this.f40344b.e.get(i10)).setParentView(null);
                }
                this.f40346f = false;
            }
            v01 v01Var2 = this.f40344b;
            ArrayList arrayList2 = v01Var2.f39040j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && v01Var2.f39039i) {
                v01Var2.b(true);
                v01Var2.f39039i = false;
            }
            this.f40344b = v01Var;
            if (!this.f40346f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((x01) arrayList.get(i11)).setParentView(this);
                }
                this.f40346f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40344b.f39040j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40346f) {
            for (int i10 = 0; i10 < this.f40344b.e.size(); i10++) {
                ((x01) this.f40344b.e.get(i10)).setParentView(null);
            }
            this.f40346f = false;
        }
        v01 v01Var = this.f40344b;
        ArrayList arrayList = v01Var.f39040j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && v01Var.f39039i) {
            v01Var.b(true);
            v01Var.f39039i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40344b.f39035b) {
            if (!this.f40346f) {
                for (int i10 = 0; i10 < this.f40344b.e.size(); i10++) {
                    ((x01) this.f40344b.e.get(i10)).setParentView(this);
                }
                this.f40346f = true;
                if (!this.e) {
                    this.e = true;
                    post(new vy0(this, 4));
                }
            }
            if (!this.f40348r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f40347n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40347n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40343a;
            my0 my0Var = profileActivity.f32028a;
            int i11 = profileActivity.R2;
            PointF pointF = this.d;
            float f10 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= my0Var.getChildCount()) {
                        break;
                    }
                    View childAt = my0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.y8)) {
                        ih.s sVar = ((org.telegram.ui.Cells.y8) childAt).f22622a;
                        pointF.set(sVar.getX() + childAt.getX() + my0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + my0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f11 = bz.f();
            this.f40344b.f39036c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f40344b.f39036c.draw(canvas);
            this.f40344b.f39036c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f40344b.d.size() - 1;
            while (size >= 0) {
                x01 x01Var = (x01) this.f40344b.d.get(size);
                float f12 = size;
                float cascade = AndroidUtilities.cascade(this.h, f12, this.f40344b.d.size(), 1.8f);
                float f13 = dp;
                float f14 = 0.88f * f13;
                float d = e2.c.d(f14, this.f40344b.d.size() - 1, getWidth(), f10);
                float f15 = pointF.x;
                float f16 = pointF.y;
                float f17 = ((d - f15) * cascade) + (f14 * f12) + f15;
                float interpolation = org.telegram.ui.Components.nr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f13 / 2.0f) * interpolation;
                float f19 = f13 * interpolation;
                x01Var.setImageCoords(f17 - f18, (f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                x01Var.draw(canvas);
                size--;
                f10 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f40348r = false;
                b(this.f40345c);
                this.f40345c = null;
                return;
            }
            invalidate();
        }
    }
}
