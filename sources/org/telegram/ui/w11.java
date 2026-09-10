package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w11 extends View {
    public static final String[] f37670s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f37671a;
    public t11 f37672b;
    public t11 f37673c;
    public final PointF d;
    public boolean e;
    public boolean f37674f;
    public float h;
    public long f37675n;
    public boolean f37676r;

    public w11(ProfileActivity profileActivity, t11 t11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f37676r = false;
        this.f37671a = profileActivity;
        this.f37672b = t11Var;
    }

    public final boolean a() {
        t11 t11Var = this.f37672b;
        if (!t11Var.f36814b || this.h < 1.0f) {
            return false;
        }
        if (t11Var.f36815c.getLottieAnimation() != null) {
            this.f37672b.f36815c.getLottieAnimation().N(0, false, false);
            this.f37672b.f36815c.getLottieAnimation().H(true);
        }
        this.f37676r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(t11 t11Var) {
        if (this.f37672b != t11Var && t11Var != null) {
            ArrayList arrayList = t11Var.e;
            if (this.f37676r) {
                this.f37673c = t11Var;
                return;
            }
            if (this.f37674f) {
                for (int i10 = 0; i10 < this.f37672b.e.size(); i10++) {
                    ((v11) this.f37672b.e.get(i10)).setParentView(null);
                }
                this.f37674f = false;
            }
            t11 t11Var2 = this.f37672b;
            ArrayList arrayList2 = t11Var2.f36819j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && t11Var2.f36818i) {
                t11Var2.b(true);
                t11Var2.f36818i = false;
            }
            this.f37672b = t11Var;
            if (!this.f37674f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((v11) arrayList.get(i11)).setParentView(this);
                }
                this.f37674f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37672b.f36819j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37674f) {
            for (int i10 = 0; i10 < this.f37672b.e.size(); i10++) {
                ((v11) this.f37672b.e.get(i10)).setParentView(null);
            }
            this.f37674f = false;
        }
        t11 t11Var = this.f37672b;
        ArrayList arrayList = t11Var.f36819j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && t11Var.f36818i) {
            t11Var.b(true);
            t11Var.f36818i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37672b.f36814b) {
            if (!this.f37674f) {
                for (int i10 = 0; i10 < this.f37672b.e.size(); i10++) {
                    ((v11) this.f37672b.e.get(i10)).setParentView(this);
                }
                this.f37674f = true;
                if (!this.e) {
                    this.e = true;
                    post(new k01(this, 3));
                }
            }
            if (!this.f37676r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f37675n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f37675n = currentTimeMillis;
            ProfileActivity profileActivity = this.f37671a;
            jz0 jz0Var = profileActivity.f30350a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= jz0Var.getChildCount()) {
                        break;
                    }
                    View childAt = jz0Var.getChildAt(i12);
                    if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.d9)) {
                        uh.o oVar = ((org.telegram.ui.Cells.d9) childAt).f19011a;
                        pointF.set(oVar.getX() + childAt.getX() + jz0Var.getX() + AndroidUtilities.dp(12.0f), (oVar.getMeasuredHeight() / 2.0f) + oVar.getY() + childAt.getY() + jz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = iz.f();
            this.f37672b.f36815c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f37672b.f36815c.draw(canvas);
            this.f37672b.f36815c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f37672b.d.size() - 1;
            while (size >= 0) {
                v11 v11Var = (v11) this.f37672b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f37672b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f37672b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.wr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                v11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                v11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f37676r = false;
                b(this.f37673c);
                this.f37673c = null;
                return;
            }
            invalidate();
        }
    }
}
