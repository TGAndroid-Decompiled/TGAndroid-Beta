package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w11 extends View {
    public static final String[] f41126s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f41127a;
    public t11 f41128b;
    public t11 f41129c;
    public final PointF d;
    public boolean e;
    public boolean f41130f;
    public float h;
    public long f41131n;
    public boolean f41132r;

    public w11(ProfileActivity profileActivity, t11 t11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f41132r = false;
        this.f41127a = profileActivity;
        this.f41128b = t11Var;
    }

    public final boolean a() {
        t11 t11Var = this.f41128b;
        if (!t11Var.f40268b || this.h < 1.0f) {
            return false;
        }
        if (t11Var.f40269c.getLottieAnimation() != null) {
            this.f41128b.f40269c.getLottieAnimation().N(0, false, false);
            this.f41128b.f40269c.getLottieAnimation().H(true);
        }
        this.f41132r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(t11 t11Var) {
        if (this.f41128b != t11Var && t11Var != null) {
            ArrayList arrayList = t11Var.e;
            if (this.f41132r) {
                this.f41129c = t11Var;
                return;
            }
            if (this.f41130f) {
                for (int i10 = 0; i10 < this.f41128b.e.size(); i10++) {
                    ((v11) this.f41128b.e.get(i10)).setParentView(null);
                }
                this.f41130f = false;
            }
            t11 t11Var2 = this.f41128b;
            ArrayList arrayList2 = t11Var2.f40273j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && t11Var2.f40272i) {
                t11Var2.b(true);
                t11Var2.f40272i = false;
            }
            this.f41128b = t11Var;
            if (!this.f41130f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((v11) arrayList.get(i11)).setParentView(this);
                }
                this.f41130f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41128b.f40273j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41130f) {
            for (int i10 = 0; i10 < this.f41128b.e.size(); i10++) {
                ((v11) this.f41128b.e.get(i10)).setParentView(null);
            }
            this.f41130f = false;
        }
        t11 t11Var = this.f41128b;
        ArrayList arrayList = t11Var.f40273j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && t11Var.f40272i) {
            t11Var.b(true);
            t11Var.f40272i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41128b.f40268b) {
            boolean z10 = true;
            if (!this.f41130f) {
                for (int i10 = 0; i10 < this.f41128b.e.size(); i10++) {
                    ((v11) this.f41128b.e.get(i10)).setParentView(this);
                }
                this.f41130f = true;
                if (!this.e) {
                    this.e = true;
                    post(new uz0(this, 4));
                }
            }
            if (!this.f41132r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f41131n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f41131n = currentTimeMillis;
            ProfileActivity profileActivity = this.f41127a;
            lz0 lz0Var = profileActivity.f32528a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= lz0Var.getChildCount()) {
                        break;
                    }
                    View childAt = lz0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        wh.n nVar = ((org.telegram.ui.Cells.c9) childAt).f21034a;
                        pointF.set(nVar.getX() + childAt.getX() + lz0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + lz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = kz.f();
            this.f41128b.f40269c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f41128b.f40269c.draw(canvas);
            this.f41128b.f40269c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f41128b.d.size() - 1;
            while (size >= 0) {
                v11 v11Var = (v11) this.f41128b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f41128b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                boolean z11 = z10;
                float c10 = com.google.android.gms.internal.play_billing.k3.c(f13, this.f41128b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = f7;
                float f16 = pointF.y;
                float f17 = ((c10 - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.es.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f18 = (f12 / f15) * interpolation;
                float f19 = f12 * interpolation;
                v11Var.setImageCoords(f17 - f18, (f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f18, f19, f19);
                v11Var.draw(canvas);
                size--;
                z10 = z11;
                f7 = f15;
            }
            if (this.h >= 1.0f) {
                this.f41132r = false;
                b(this.f41129c);
                this.f41129c = null;
                return;
            }
            invalidate();
        }
    }
}
