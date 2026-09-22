package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r11 extends View {
    public static final String[] f36991s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f36992a;
    public o11 f36993b;
    public o11 f36994c;
    public final PointF d;
    public boolean e;
    public boolean f36995f;
    public float h;
    public long f36996n;
    public boolean f36997r;

    public r11(ProfileActivity profileActivity, o11 o11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f36997r = false;
        this.f36992a = profileActivity;
        this.f36993b = o11Var;
    }

    public final boolean a() {
        o11 o11Var = this.f36993b;
        if (!o11Var.f36091b || this.h < 1.0f) {
            return false;
        }
        if (o11Var.f36092c.getLottieAnimation() != null) {
            this.f36993b.f36092c.getLottieAnimation().N(0, false, false);
            this.f36993b.f36092c.getLottieAnimation().H(true);
        }
        this.f36997r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(o11 o11Var) {
        if (this.f36993b != o11Var && o11Var != null) {
            ArrayList arrayList = o11Var.e;
            if (this.f36997r) {
                this.f36994c = o11Var;
                return;
            }
            if (this.f36995f) {
                for (int i10 = 0; i10 < this.f36993b.e.size(); i10++) {
                    ((q11) this.f36993b.e.get(i10)).setParentView(null);
                }
                this.f36995f = false;
            }
            o11 o11Var2 = this.f36993b;
            ArrayList arrayList2 = o11Var2.f36096j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && o11Var2.f36095i) {
                o11Var2.b(true);
                o11Var2.f36095i = false;
            }
            this.f36993b = o11Var;
            if (!this.f36995f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((q11) arrayList.get(i11)).setParentView(this);
                }
                this.f36995f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36993b.f36096j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36995f) {
            for (int i10 = 0; i10 < this.f36993b.e.size(); i10++) {
                ((q11) this.f36993b.e.get(i10)).setParentView(null);
            }
            this.f36995f = false;
        }
        o11 o11Var = this.f36993b;
        ArrayList arrayList = o11Var.f36096j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && o11Var.f36095i) {
            o11Var.b(true);
            o11Var.f36095i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36993b.f36091b) {
            if (!this.f36995f) {
                for (int i10 = 0; i10 < this.f36993b.e.size(); i10++) {
                    ((q11) this.f36993b.e.get(i10)).setParentView(this);
                }
                this.f36995f = true;
                if (!this.e) {
                    this.e = true;
                    post(new f01(this, 3));
                }
            }
            if (!this.f36997r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f36996n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f36996n = currentTimeMillis;
            ProfileActivity profileActivity = this.f36992a;
            gz0 gz0Var = profileActivity.f31235a;
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
                        vh.o oVar = ((org.telegram.ui.Cells.c9) childAt).f19866a;
                        pointF.set(oVar.getX() + childAt.getX() + gz0Var.getX() + AndroidUtilities.dp(12.0f), (oVar.getMeasuredHeight() / 2.0f) + oVar.getY() + childAt.getY() + gz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = gz.f();
            this.f36993b.f36092c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f36993b.f36092c.draw(canvas);
            this.f36993b.f36092c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f36993b.d.size() - 1;
            while (size >= 0) {
                q11 q11Var = (q11) this.f36993b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f36993b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f36993b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.qr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                q11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                q11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f36997r = false;
                b(this.f36994c);
                this.f36994c = null;
                return;
            }
            invalidate();
        }
    }
}
