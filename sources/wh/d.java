package wh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.b9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f59918a;
    public final r1 f59919b;
    public final ImageReceiver f59920c;
    public final long d;
    public b f59921e;
    public b f59922f;
    public Paint f59923g;
    public final StaticLayout h;
    public float f59924i;
    public float f59925j;
    public ValueAnimator f59926k;
    public float f59927l;
    public boolean f59928m;
    public ValueAnimator f59929n;
    public float f59930o;
    public boolean f59931p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        b9 b9Var = new b9((h6) null);
        int i7 = k10.f24968t0;
        this.f59927l = 1.0f;
        this.f59928m = true;
        this.f59930o = 0.0f;
        this.f59931p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f59960a);
        this.f59920c = imageReceiver2;
        this.f59918a = hVar;
        r1 r1Var = hVar.E;
        this.f59919b = r1Var;
        this.d = j3;
        b9Var.f33802p = 1.0f;
        if (n5.E(j3)) {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(j3));
            b9Var.r(c22);
            if (p10.C(c22)) {
                str2 = hd.N0(2131745705, null);
                b9Var.g(1);
                b9Var.f33802p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, b9Var, 0L, null, c22, 0);
                imageReceiver.J0(g0.L(g.f59953a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
                Paint a22 = r1Var.a2("paintChatActionText");
                if (str2 == null && a22 != null) {
                    int L = g0.L(48);
                    TextPaint textPaint = new TextPaint(a22);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.f24046q.x - L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = c22 != null ? i5.m(0, c22.first_name, c22.last_name) : "";
            imageReceiver.i0(c22, b9Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
            str = O0 != null ? O0.title : "";
            b9Var.q(O0);
            imageReceiver.i0(O0, b9Var, null);
        }
        str2 = str;
        imageReceiver.J0(g0.L(g.f59953a / 2.0f));
        imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
        Paint a222 = r1Var.a2("paintChatActionText");
        if (str2 == null) {
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        float f14 = f11 / 2.0f;
        float f15 = f10 - f14;
        float f16 = f10 + f14;
        float f17 = f13 - f12;
        if (f11 > f17) {
            float f18 = (f12 + f13) / 2.0f;
            float f19 = f11 - f17;
            float max = Math.max(0.0f, f12 - f15);
            float max2 = Math.max(0.0f, f16 - f13);
            float f20 = max + max2;
            if (f20 < 0.1f) {
                return f18;
            }
            return e2.c(f19, 2.0f, (max - max2) / f20, f18);
        } else if (f15 < f12) {
            return f12 + f14;
        } else {
            if (f16 > f13) {
                return f13 - f14;
            }
            return f10;
        }
    }

    public final void a(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.save();
        canvas.translate(f10 - f12, f11 - f12);
        int i7 = g.f59953a;
        float f14 = 21;
        canvas.scale(f12 / g0.L(f14), f12 / g0.L(f14));
        ImageReceiver imageReceiver = this.f59920c;
        imageReceiver.setAlpha(((this.f59927l * 0.25f) + 0.75f) * f13);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f59929n) {
            this.f59930o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f59926k) {
            this.f59927l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f59918a.invalidateSelf();
    }
}
