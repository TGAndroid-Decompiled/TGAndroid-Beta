package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s11 extends View {
    public static final String[] f37360s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f37361a;
    public p11 f37362b;
    public p11 f37363c;
    public final PointF d;
    public boolean e;
    public boolean f37364f;
    public float h;
    public long f37365n;
    public boolean f37366r;

    public s11(ProfileActivity profileActivity, p11 p11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f37366r = false;
        this.f37361a = profileActivity;
        this.f37362b = p11Var;
    }

    public final boolean a() {
        p11 p11Var = this.f37362b;
        if (!p11Var.f36486b || this.h < 1.0f) {
            return false;
        }
        if (p11Var.f36487c.getLottieAnimation() != null) {
            this.f37362b.f36487c.getLottieAnimation().N(0, false, false);
            this.f37362b.f36487c.getLottieAnimation().H(true);
        }
        this.f37366r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(p11 p11Var) {
        if (this.f37362b != p11Var && p11Var != null) {
            ArrayList arrayList = p11Var.e;
            if (this.f37366r) {
                this.f37363c = p11Var;
                return;
            }
            if (this.f37364f) {
                for (int i10 = 0; i10 < this.f37362b.e.size(); i10++) {
                    ((r11) this.f37362b.e.get(i10)).setParentView(null);
                }
                this.f37364f = false;
            }
            p11 p11Var2 = this.f37362b;
            ArrayList arrayList2 = p11Var2.f36491j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && p11Var2.f36490i) {
                p11Var2.b(true);
                p11Var2.f36490i = false;
            }
            this.f37362b = p11Var;
            if (!this.f37364f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((r11) arrayList.get(i11)).setParentView(this);
                }
                this.f37364f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37362b.f36491j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37364f) {
            for (int i10 = 0; i10 < this.f37362b.e.size(); i10++) {
                ((r11) this.f37362b.e.get(i10)).setParentView(null);
            }
            this.f37364f = false;
        }
        p11 p11Var = this.f37362b;
        ArrayList arrayList = p11Var.f36491j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && p11Var.f36490i) {
            p11Var.b(true);
            p11Var.f36490i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37362b.f36486b) {
            if (!this.f37364f) {
                for (int i10 = 0; i10 < this.f37362b.e.size(); i10++) {
                    ((r11) this.f37362b.e.get(i10)).setParentView(this);
                }
                this.f37364f = true;
                if (!this.e) {
                    this.e = true;
                    post(new g01(this, 3));
                }
            }
            if (!this.f37366r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f37365n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f37365n = currentTimeMillis;
            ProfileActivity profileActivity = this.f37361a;
            hz0 hz0Var = profileActivity.f31251a;
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
                        vh.o oVar = ((org.telegram.ui.Cells.c9) childAt).f19890a;
                        pointF.set(oVar.getX() + childAt.getX() + hz0Var.getX() + AndroidUtilities.dp(12.0f), (oVar.getMeasuredHeight() / 2.0f) + oVar.getY() + childAt.getY() + hz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = iz.f();
            this.f37362b.f36487c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f37362b.f36487c.draw(canvas);
            this.f37362b.f36487c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f37362b.d.size() - 1;
            while (size >= 0) {
                r11 r11Var = (r11) this.f37362b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f37362b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f37362b.d.size() - 1, getWidth(), f7);
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
                this.f37366r = false;
                b(this.f37363c);
                this.f37363c = null;
                return;
            }
            invalidate();
        }
    }
}
