package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s11 extends View {
    public static final String[] f37365s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f37366a;
    public p11 f37367b;
    public p11 f37368c;
    public final PointF d;
    public boolean e;
    public boolean f37369f;
    public float h;
    public long f37370n;
    public boolean f37371r;

    public s11(ProfileActivity profileActivity, p11 p11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f37371r = false;
        this.f37366a = profileActivity;
        this.f37367b = p11Var;
    }

    public final boolean a() {
        p11 p11Var = this.f37367b;
        if (!p11Var.f36491b || this.h < 1.0f) {
            return false;
        }
        if (p11Var.f36492c.getLottieAnimation() != null) {
            this.f37367b.f36492c.getLottieAnimation().N(0, false, false);
            this.f37367b.f36492c.getLottieAnimation().H(true);
        }
        this.f37371r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(p11 p11Var) {
        if (this.f37367b != p11Var && p11Var != null) {
            ArrayList arrayList = p11Var.e;
            if (this.f37371r) {
                this.f37368c = p11Var;
                return;
            }
            if (this.f37369f) {
                for (int i10 = 0; i10 < this.f37367b.e.size(); i10++) {
                    ((r11) this.f37367b.e.get(i10)).setParentView(null);
                }
                this.f37369f = false;
            }
            p11 p11Var2 = this.f37367b;
            ArrayList arrayList2 = p11Var2.f36496j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && p11Var2.f36495i) {
                p11Var2.b(true);
                p11Var2.f36495i = false;
            }
            this.f37367b = p11Var;
            if (!this.f37369f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((r11) arrayList.get(i11)).setParentView(this);
                }
                this.f37369f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37367b.f36496j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37369f) {
            for (int i10 = 0; i10 < this.f37367b.e.size(); i10++) {
                ((r11) this.f37367b.e.get(i10)).setParentView(null);
            }
            this.f37369f = false;
        }
        p11 p11Var = this.f37367b;
        ArrayList arrayList = p11Var.f36496j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && p11Var.f36495i) {
            p11Var.b(true);
            p11Var.f36495i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37367b.f36491b) {
            if (!this.f37369f) {
                for (int i10 = 0; i10 < this.f37367b.e.size(); i10++) {
                    ((r11) this.f37367b.e.get(i10)).setParentView(this);
                }
                this.f37369f = true;
                if (!this.e) {
                    this.e = true;
                    post(new g01(this, 3));
                }
            }
            if (!this.f37371r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f37370n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f37370n = currentTimeMillis;
            ProfileActivity profileActivity = this.f37366a;
            hz0 hz0Var = profileActivity.f31255a;
            int i11 = profileActivity.U2;
            PointF pointF = this.d;
            float f7 = 2.0f;
            if (i11 >= 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= hz0Var.getChildCount()) {
                        break;
                    }
                    View childAt = hz0Var.getChildAt(i12);
                    if (i11 == RecyclerView.S(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                        vh.o oVar = ((org.telegram.ui.Cells.c9) childAt).f19891a;
                        pointF.set(oVar.getX() + childAt.getX() + hz0Var.getX() + AndroidUtilities.dp(12.0f), (oVar.getMeasuredHeight() / 2.0f) + oVar.getY() + childAt.getY() + hz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = iz.f();
            this.f37367b.f36492c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f37367b.f36492c.draw(canvas);
            this.f37367b.f36492c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f37367b.d.size() - 1;
            while (size >= 0) {
                r11 r11Var = (r11) this.f37367b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f37367b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f37367b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.qr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                r11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                r11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f37371r = false;
                b(this.f37368c);
                this.f37368c = null;
                return;
            }
            invalidate();
        }
    }
}
