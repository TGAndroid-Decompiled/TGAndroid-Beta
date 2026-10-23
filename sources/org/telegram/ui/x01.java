package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class x01 extends View {
    public static final String[] f43467s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f43468a;
    public u01 f43469b;
    public u01 f43470c;
    public final PointF d;
    public boolean e;
    public boolean f43471f;
    public float h;
    public long f43472n;
    public boolean f43473r;

    public x01(ProfileActivity profileActivity, u01 u01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f43473r = false;
        this.f43468a = profileActivity;
        this.f43469b = u01Var;
    }

    public final boolean a() {
        u01 u01Var = this.f43469b;
        if (!u01Var.f42122b || this.h < 1.0f) {
            return false;
        }
        if (u01Var.f42123c.getLottieAnimation() != null) {
            this.f43469b.f42123c.getLottieAnimation().N(0, false, false);
            this.f43469b.f42123c.getLottieAnimation().H(true);
        }
        this.f43473r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(u01 u01Var) {
        if (this.f43469b != u01Var && u01Var != null) {
            ArrayList arrayList = u01Var.e;
            if (this.f43473r) {
                this.f43470c = u01Var;
                return;
            }
            if (this.f43471f) {
                for (int i10 = 0; i10 < this.f43469b.e.size(); i10++) {
                    ((w01) this.f43469b.e.get(i10)).setParentView(null);
                }
                this.f43471f = false;
            }
            u01 u01Var2 = this.f43469b;
            ArrayList arrayList2 = u01Var2.f42127j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && u01Var2.f42126i) {
                u01Var2.b(true);
                u01Var2.f42126i = false;
            }
            this.f43469b = u01Var;
            if (!this.f43471f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((w01) arrayList.get(i11)).setParentView(this);
                }
                this.f43471f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43469b.f42127j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43471f) {
            for (int i10 = 0; i10 < this.f43469b.e.size(); i10++) {
                ((w01) this.f43469b.e.get(i10)).setParentView(null);
            }
            this.f43471f = false;
        }
        u01 u01Var = this.f43469b;
        ArrayList arrayList = u01Var.f42127j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && u01Var.f42126i) {
            u01Var.b(true);
            u01Var.f42126i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43469b.f42122b) {
            boolean z10 = true;
            if (!this.f43471f) {
                for (int i10 = 0; i10 < this.f43469b.e.size(); i10++) {
                    ((w01) this.f43469b.e.get(i10)).setParentView(this);
                }
                this.f43471f = true;
                if (!this.e) {
                    this.e = true;
                    post(new my0(this, 5));
                }
            }
            if (!this.f43473r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f43472n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f43472n = currentTimeMillis;
            ProfileActivity profileActivity = this.f43468a;
            ly0 ly0Var = profileActivity.f33882a;
            int i11 = profileActivity.V2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= ly0Var.getChildCount()) {
                        break;
                    }
                    View childAt = ly0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        wh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f22215a;
                        pointF.set(nVar.getX() + childAt.getX() + ly0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + ly0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = qy.f();
            this.f43469b.f42123c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f43469b.f42123c.draw(canvas);
            this.f43469b.f42123c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f43469b.d.size() - 1;
            while (size >= 0) {
                w01 w01Var = (w01) this.f43469b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f43469b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float c10 = com.google.android.gms.internal.play_billing.k3.c(f13, this.f43469b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((c10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.bs.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                w01Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                w01Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f43473r = false;
                b(this.f43470c);
                this.f43470c = null;
                return;
            }
            invalidate();
        }
    }
}
