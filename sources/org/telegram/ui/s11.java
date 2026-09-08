package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s11 extends View {
    public static final String[] f40303s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity f40304a;
    public p11 f40305b;
    public p11 f40306c;
    public final PointF d;
    public boolean f40307e;
    public boolean f40308f;
    public float h;
    public long f40309n;
    public boolean f40310r;

    public s11(ProfileActivity profileActivity, p11 p11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.f40310r = false;
        this.f40304a = profileActivity;
        this.f40305b = p11Var;
    }

    public final boolean a() {
        p11 p11Var = this.f40305b;
        if (!p11Var.f39411b || this.h < 1.0f) {
            return false;
        }
        if (p11Var.f39412c.getLottieAnimation() != null) {
            this.f40305b.f39412c.getLottieAnimation().L(0, false, false);
            this.f40305b.f39412c.getLottieAnimation().F(true);
        }
        this.f40310r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(p11 p11Var) {
        if (this.f40305b != p11Var && p11Var != null) {
            ArrayList arrayList = p11Var.f39413e;
            if (this.f40310r) {
                this.f40306c = p11Var;
                return;
            }
            if (this.f40308f) {
                for (int i10 = 0; i10 < this.f40305b.f39413e.size(); i10++) {
                    ((r11) this.f40305b.f39413e.get(i10)).setParentView(null);
                }
                this.f40308f = false;
            }
            p11 p11Var2 = this.f40305b;
            ArrayList arrayList2 = p11Var2.f39417j;
            arrayList2.remove(this);
            if (arrayList2.isEmpty() && p11Var2.f39416i) {
                p11Var2.b(true);
                p11Var2.f39416i = false;
            }
            this.f40305b = p11Var;
            if (!this.f40308f) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((r11) arrayList.get(i11)).setParentView(this);
                }
                this.f40308f = true;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40305b.f39417j.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40308f) {
            for (int i10 = 0; i10 < this.f40305b.f39413e.size(); i10++) {
                ((r11) this.f40305b.f39413e.get(i10)).setParentView(null);
            }
            this.f40308f = false;
        }
        p11 p11Var = this.f40305b;
        ArrayList arrayList = p11Var.f39417j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && p11Var.f39416i) {
            p11Var.b(true);
            p11Var.f39416i = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40305b.f39411b) {
            if (!this.f40308f) {
                for (int i10 = 0; i10 < this.f40305b.f39413e.size(); i10++) {
                    ((r11) this.f40305b.f39413e.get(i10)).setParentView(this);
                }
                this.f40308f = true;
                if (!this.f40307e) {
                    this.f40307e = true;
                    post(new f01(this, 3));
                }
            }
            if (!this.f40310r) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.h = Utilities.clamp(this.h + (((float) Utilities.clamp(currentTimeMillis - this.f40309n, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
            this.f40309n = currentTimeMillis;
            ProfileActivity profileActivity = this.f40304a;
            gz0 gz0Var = profileActivity.f33883a;
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
                        wh.p pVar = ((org.telegram.ui.Cells.c9) childAt).f21731a;
                        pointF.set(pVar.getX() + childAt.getX() + gz0Var.getX() + AndroidUtilities.dp(12.0f), (pVar.getMeasuredHeight() / 2.0f) + pVar.getY() + childAt.getY() + gz0Var.getY());
                        break;
                    }
                    i12++;
                }
            }
            float f10 = gz.f();
            this.f40305b.f39412c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            this.f40305b.f39412c.draw(canvas);
            this.f40305b.f39412c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
            canvas.restore();
            int dp = AndroidUtilities.dp(110.0f);
            int size = this.f40305b.d.size() - 1;
            while (size >= 0) {
                r11 r11Var = (r11) this.f40305b.d.get(size);
                float f11 = size;
                float cascade = AndroidUtilities.cascade(this.h, f11, this.f40305b.d.size(), 1.8f);
                float f12 = dp;
                float f13 = 0.88f * f12;
                float v = com.google.android.gms.internal.vision.e2.v(f13, this.f40305b.d.size() - 1, getWidth(), f7);
                float f14 = pointF.x;
                float f15 = pointF.y;
                float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                float interpolation = org.telegram.ui.Components.pr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                float f17 = (f12 / 2.0f) * interpolation;
                float f18 = f12 * interpolation;
                r11Var.setImageCoords(f16 - f17, (f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)))) - f17, f18, f18);
                r11Var.draw(canvas);
                size--;
                f7 = 2.0f;
            }
            if (this.h >= 1.0f) {
                this.f40310r = false;
                b(this.f40306c);
                this.f40306c = null;
                return;
            }
            invalidate();
        }
    }
}
