package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t01 extends View {
    public static final String[] f41571s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f41572a;
    public q01 f41573b;
    public q01 f41574c;
    public final PointF d;
    public boolean e;
    public boolean f41575f;
    public float h;
    public long f41576n;
    public boolean f41577r;

    public t01(ProfileActivity profileActivity, q01 q01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f41577r = false;
        this.f41572a = profileActivity;
        this.f41573b = q01Var;
    }

    public final boolean a() {
        q01 q01Var = this.f41573b;
        if (!q01Var.f40345b || this.h < 1.0f) {
            return false;
        }
        if (q01Var.f40346c.getLottieAnimation() != null) {
            this.f41573b.f40346c.getLottieAnimation().N(0, false, false);
            this.f41573b.f40346c.getLottieAnimation().H(true);
        }
        this.f41577r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(q01 q01Var) {
        if (this.f41573b != q01Var && q01Var != null) {
            ArrayList arrayList = q01Var.e;
            if (this.f41577r) {
                this.f41574c = q01Var;
                return;
            }
            if (this.f41575f) {
                for (int i10 = 0; i10 < this.f41573b.e.size(); i10++) {
                    ((s01) this.f41573b.e.get(i10)).setParentView(null);
                }
                this.f41575f = false;
            }
            q01 q01Var2 = this.f41573b;
            ArrayList arrayList2 = q01Var2.f40350j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && q01Var2.f40349i) {
                q01Var2.b(true);
                q01Var2.f40349i = false;
            }
            this.f41573b = q01Var;
            if (!this.f41575f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((s01) arrayList.get(i11)).setParentView(this);
                }
                this.f41575f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41573b.f40350j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41575f) {
            for (int i10 = 0; i10 < this.f41573b.e.size(); i10++) {
                ((s01) this.f41573b.e.get(i10)).setParentView(null);
            }
            this.f41575f = false;
        }
        q01 q01Var = this.f41573b;
        ArrayList arrayList = q01Var.f40350j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && q01Var.f40349i) {
            q01Var.b(true);
            q01Var.f40349i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41573b.f40345b) {
            boolean z10 = true;
            if (!this.f41575f) {
                for (int i10 = 0; i10 < this.f41573b.e.size(); i10++) {
                    ((s01) this.f41573b.e.get(i10)).setParentView(this);
                }
                this.f41575f = true;
                if (!this.e) {
                    this.e = true;
                    post(new qy0(this, 4));
                }
            }
            if (!this.f41577r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f41576n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f41576n = currentTimeMillis;
            ProfileActivity profileActivity = this.f41572a;
            hy0 hy0Var = profileActivity.f33585a;
            int i11 = profileActivity.V2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= hy0Var.getChildCount()) {
                        break;
                    }
                    View childAt = hy0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.b9)) {
                        wh.n nVar = ((org.telegram.ui.Cells.b9) childAt).f22063a;
                        pointF.set(nVar.getX() + childAt.getX() + hy0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + hy0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = oy.f();
            this.f41573b.f40346c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f41573b.f40346c.draw(canvas);
            this.f41573b.f40346c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f41573b.d.size() - 1;
            while (size >= 0) {
                s01 s01Var = (s01) this.f41573b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f41573b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float c10 = com.google.android.gms.internal.play_billing.k3.c(f13, this.f41573b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((c10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.bs.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                s01Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                s01Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f41577r = false;
                b(this.f41574c);
                this.f41574c = null;
                return;
            }
            invalidate();
        }
    }
}
