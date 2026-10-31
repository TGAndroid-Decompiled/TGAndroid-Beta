package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.l40;
public final class d1 extends View {
    public final int f48865a;
    public final RectF f48866b;
    public final org.telegram.ui.Components.e6 f48867c;
    public final b1 d;
    public final ArrayList e;
    public final int[] f48868f;
    public final ArrayList h;
    public float f48869n;
    public ValueAnimator f48870r;
    public boolean f48871s;

    public d1(Context context, int i10) {
        super(context);
        this.f48866b = new RectF();
        gr grVar = gr.f26495f;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.f48867c = e6Var;
        this.e = new ArrayList();
        this.f48868f = new int[]{2131624217, 2131624218, 2131624219, 2131624220, 2131624221};
        this.h = new ArrayList();
        this.f48871s = true;
        this.f48865a = i10;
        e6Var.setCallback(this);
        e6Var.r(false, true);
        e6Var.w(org.telegram.messenger.i0.L(40.0f));
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.s(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(3.5f), 0);
        e6Var.M = org.telegram.messenger.i0.f16026q.x;
        e6Var.u(-1);
        e6Var.f25695b = 17;
        this.d = new b1(this, 0);
    }

    public final void a(float f7, b1 b1Var) {
        ValueAnimator valueAnimator = this.f48870r;
        if (valueAnimator != null) {
            this.f48870r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f48869n, f7);
        this.f48870r = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 16));
        this.f48870r.addListener(new l40(this, f7, b1Var, 3));
        this.f48870r.setInterpolator(gr.h);
        this.f48870r.setDuration(320L);
        this.f48870r.start();
    }

    public final void b() {
        this.f48871s = true;
        org.telegram.messenger.i0.r(this.d);
        this.f48867c.t("", true, true);
        invalidate();
        a(0.0f, new b1(this, 1));
    }

    public final void c(e1 e1Var) {
        this.f48866b.set(e1Var.getX() - getX(), e1Var.getY() - getY(), (e1Var.getX() - getX()) + e1Var.getWidth(), (e1Var.getY() - getY()) + e1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        RectF rectF;
        int i10;
        d1 d1Var = this;
        Canvas canvas2 = canvas;
        float f11 = 1.0f;
        float T1 = org.telegram.messenger.i0.T1(1.0f, 1.8f, d1Var.f48869n);
        float f12 = 90.0f;
        int L = (int) (org.telegram.messenger.i0.L(90.0f) * T1);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = d1Var.e;
            int size = arrayList.size();
            f7 = 255.0f;
            f10 = 2.0f;
            rectF = d1Var.f48866b;
            if (i11 >= size) {
                break;
            }
            bi0 bi0Var = (bi0) arrayList.get(i11);
            if (bi0Var.f24752a0 >= bi0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f13 = L / 2.0f;
                bi0Var.setBounds((int) (((org.telegram.messenger.i0.L(15.0f) * T1) + rectF.left) - f13), (int) (rectF.centerY() - f13), (int) sc.e.d(org.telegram.messenger.i0.L(15.0f), T1, rectF.left, f13), (int) (rectF.centerY() + f13));
                bi0Var.setAlpha((int) (d1Var.f48869n * 255.0f));
                bi0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - org.telegram.messenger.i0.L(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = d1Var.h;
            if (i12 < arrayList2.size()) {
                c1 c1Var = (c1) arrayList2.get(i12);
                float f14 = c1Var.f48824c;
                float f15 = c1Var.f48823b;
                ImageReceiver imageReceiver = c1Var.f48825f;
                float e = c1Var.f48827i.e(z10, f11);
                float d = c1Var.f48828j.d(c1Var.h);
                float f16 = f12;
                float L2 = org.telegram.messenger.i0.L(23.0f) + c1Var.f48826g.f29774c;
                float L3 = org.telegram.messenger.i0.L(18.0f);
                float f17 = f7;
                float f18 = f10;
                float f19 = f11;
                float T12 = org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.T1(f11, 0.0f, d), Utilities.l(Math.min(org.telegram.messenger.i0.z1(e, f11, 0.85f), org.telegram.messenger.i0.z1(e, 0.0f, 0.12f))));
                Paint paint = c1Var.e;
                int i13 = (int) (T12 * f17);
                paint.setAlpha(i13);
                bi0 bi0Var2 = c1Var.d;
                if (bi0Var2 != null) {
                    bi0Var2.setAlpha(i13);
                }
                imageReceiver.setAlpha(T12);
                canvas2.save();
                double d10 = e;
                float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f20 = (f15 * f18) - f19;
                canvas2.translate(org.telegram.messenger.i0.L(4.0f) * f20, 0.0f);
                float f21 = 1.5f * ((f14 * f18) - f19);
                canvas2.rotate(f21);
                int i14 = i12;
                canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-org.telegram.messenger.i0.L(200.0f)));
                canvas2.translate(org.telegram.messenger.i0.L(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.l((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
                float T13 = org.telegram.messenger.i0.T1(0.4f, f19, T12);
                canvas2.scale(T13, T13);
                canvas2.translate((-L2) / f18, (-L3) / f18);
                float f22 = L3 / f18;
                canvas2.drawRoundRect(0.0f, 0.0f, L2, L3, f22, f22, paint);
                imageReceiver.h(canvas2, null);
                Canvas canvas3 = canvas2;
                c1Var.f48826g.c(org.telegram.messenger.i0.L(18.0f), f22, T12, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (bi0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(org.telegram.messenger.i0.L(4.0f) * f20, 0.0f);
                    canvas2.rotate(f21);
                    canvas2.translate(0.0f, (-org.telegram.messenger.i0.L(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * org.telegram.messenger.i0.L(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int L4 = org.telegram.messenger.i0.L(f16);
                    int i15 = (-L4) / 2;
                    int i16 = L4 / 2;
                    bi0Var2.setBounds(i15, org.telegram.messenger.i0.L(8.0f) + i15, i16, org.telegram.messenger.i0.L(8.0f) + i16);
                    bi0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (e < 1.0f && d < 1.0f) {
                    i10 = i14;
                } else {
                    ((c1) arrayList2.get(i14)).f48825f.R();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                d1Var = this;
                f12 = f16;
                f7 = f17;
                f10 = f18;
                f11 = 1.0f;
                z10 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f48867c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
