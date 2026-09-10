package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.wr;
public final class e1 extends View {
    public final int f48361a;
    public final RectF f48362b;
    public final org.telegram.ui.Components.n6 f48363c;
    public final c1 d;
    public final ArrayList e;
    public final int[] f48364f;
    public final ArrayList h;
    public float f48365n;
    public ValueAnimator f48366r;
    public boolean f48367s;

    public e1(Context context, int i10) {
        super(context);
        this.f48362b = new RectF();
        wr wrVar = wr.f28819f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.f48363c = n6Var;
        this.e = new ArrayList();
        this.f48364f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f48367s = true;
        this.f48361a = i10;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.f25425b = 17;
        this.d = new c1(this, 0);
    }

    public final void a(float f7, c1 c1Var) {
        ValueAnimator valueAnimator = this.f48366r;
        if (valueAnimator != null) {
            this.f48366r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f48365n, f7);
        this.f48366r = ofFloat;
        ofFloat.addUpdateListener(new qg.o(this, 21));
        this.f48366r.addListener(new bi.j3(this, f7, c1Var, 4));
        this.f48366r.setInterpolator(wr.h);
        this.f48366r.setDuration(320L);
        this.f48366r.start();
    }

    public final void b() {
        this.f48367s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f48363c.q("", true, true);
        invalidate();
        a(0.0f, new c1(this, 1));
    }

    public final void c(f1 f1Var) {
        this.f48362b.set(f1Var.getX() - getX(), f1Var.getY() - getY(), (f1Var.getX() - getX()) + f1Var.getWidth(), (f1Var.getY() - getY()) + f1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        e1 e1Var = this;
        Canvas canvas2 = canvas;
        float f7 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, e1Var.f48365n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = e1Var.e;
            int size = arrayList.size();
            rectF = e1Var.f48362b;
            if (i11 >= size) {
                break;
            }
            hj0 hj0Var = (hj0) arrayList.get(i11);
            if (hj0Var.f23648b0 >= hj0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f10 = dp / 2.0f;
                hj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f10), (int) (rectF.centerY() - f10), (int) org.telegram.ui.Cells.r6.a(AndroidUtilities.dp(15.0f), lerp, rectF.left, f10), (int) (rectF.centerY() + f10));
                hj0Var.setAlpha((int) (e1Var.f48365n * 255.0f));
                hj0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = e1Var.h;
            if (i12 < arrayList2.size()) {
                d1 d1Var = (d1) arrayList2.get(i12);
                float f11 = d1Var.f48340c;
                float f12 = d1Var.f48339b;
                ImageReceiver imageReceiver = d1Var.f48341f;
                float d = d1Var.f48343i.d(f7, z10);
                float e = d1Var.f48344j.e(d1Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + d1Var.f48342g.f27247c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f7, 0.0f, e), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f7, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = d1Var.e;
                int i13 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i13);
                hj0 hj0Var2 = d1Var.d;
                if (hj0Var2 != null) {
                    hj0Var2.setAlpha(i13);
                }
                imageReceiver.setAlpha(lerp2);
                canvas2.save();
                double d10 = d;
                float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f13 = (f12 * 2.0f) - 1.0f;
                canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                float f14 = 1.5f * ((f11 * 2.0f) - 1.0f);
                canvas2.rotate(f14);
                int i14 = i12;
                canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
                canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
                float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
                canvas2.scale(lerp3, lerp3);
                canvas2.translate((-dp2) / 2.0f, (-dp3) / 2.0f);
                float f15 = dp3 / 2.0f;
                canvas2.drawRoundRect(0.0f, 0.0f, dp2, dp3, f15, f15, paint);
                imageReceiver.draw(canvas2);
                Canvas canvas3 = canvas2;
                d1Var.f48342g.c(AndroidUtilities.dp(18.0f), f15, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (hj0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                    canvas2.rotate(f14);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(90.0f);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    hj0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    hj0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e < 1.0f) {
                    i10 = i14;
                } else {
                    ((d1) arrayList2.get(i14)).f48341f.onDetachedFromWindow();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                e1Var = this;
                f7 = 1.0f;
                z10 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f48363c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
