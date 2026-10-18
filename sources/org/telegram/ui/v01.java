package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v01 extends View {
    public static final String[] f42102s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f42103a;
    public s01 f42104b;
    public s01 f42105c;
    public final PointF d;
    public boolean e;
    public boolean f42106f;
    public float h;
    public long f42107n;
    public boolean f42108r;

    public v01(ProfileActivity profileActivity, s01 s01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f42108r = false;
        this.f42103a = profileActivity;
        this.f42104b = s01Var;
    }

    public final boolean a() {
        s01 s01Var = this.f42104b;
        if (!s01Var.f40873b || this.h < 1.0f) {
            return false;
        }
        if (s01Var.f40874c.getLottieAnimation() != null) {
            this.f42104b.f40874c.getLottieAnimation().N(0, false, false);
            this.f42104b.f40874c.getLottieAnimation().H(true);
        }
        this.f42108r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(s01 s01Var) {
        if (this.f42104b != s01Var && s01Var != null) {
            ArrayList arrayList = s01Var.e;
            if (this.f42108r) {
                this.f42105c = s01Var;
                return;
            }
            if (this.f42106f) {
                for (int i10 = 0; i10 < this.f42104b.e.size(); i10++) {
                    ((u01) this.f42104b.e.get(i10)).setParentView(null);
                }
                this.f42106f = false;
            }
            s01 s01Var2 = this.f42104b;
            ArrayList arrayList2 = s01Var2.f40878j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && s01Var2.f40877i) {
                s01Var2.b(true);
                s01Var2.f40877i = false;
            }
            this.f42104b = s01Var;
            if (!this.f42106f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((u01) arrayList.get(i11)).setParentView(this);
                }
                this.f42106f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42104b.f40878j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f42106f) {
            for (int i10 = 0; i10 < this.f42104b.e.size(); i10++) {
                ((u01) this.f42104b.e.get(i10)).setParentView(null);
            }
            this.f42106f = false;
        }
        s01 s01Var = this.f42104b;
        ArrayList arrayList = s01Var.f40878j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && s01Var.f40877i) {
            s01Var.b(true);
            s01Var.f40877i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42104b.f40873b) {
            boolean z10 = true;
            if (!this.f42106f) {
                for (int i10 = 0; i10 < this.f42104b.e.size(); i10++) {
                    ((u01) this.f42104b.e.get(i10)).setParentView(this);
                }
                this.f42106f = true;
                if (!this.e) {
                    this.e = true;
                    post(new sy0(this, 4));
                }
            }
            if (!this.f42108r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f42107n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f42107n = currentTimeMillis;
            ProfileActivity profileActivity = this.f42103a;
            jy0 jy0Var = profileActivity.f33575a;
            int i11 = profileActivity.V2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= jy0Var.getChildCount()) {
                        break;
                    }
                    View childAt = jy0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.b9)) {
                        wh.n nVar = ((org.telegram.ui.Cells.b9) childAt).f22062a;
                        pointF.set(nVar.getX() + childAt.getX() + jy0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + jy0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = qy.f();
            this.f42104b.f40874c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f42104b.f40874c.draw(canvas);
            this.f42104b.f40874c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f42104b.d.size() - 1;
            while (size >= 0) {
                u01 u01Var = (u01) this.f42104b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f42104b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float c10 = com.google.android.gms.internal.play_billing.k3.c(f13, this.f42104b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((c10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.bs.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                u01Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                u01Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f42108r = false;
                b(this.f42105c);
                this.f42105c = null;
                return;
            }
            invalidate();
        }
    }
}
