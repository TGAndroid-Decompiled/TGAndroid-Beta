package wh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.w8;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f57868a;
    public final q1 f57869b;
    public final ImageReceiver f57870c;
    public final long d;
    public b f57871e;
    public b f57872f;
    public Paint f57873g;
    public final StaticLayout h;
    public float f57874i;
    public float f57875j;
    public ValueAnimator f57876k;
    public float f57877l;
    public boolean f57878m;
    public ValueAnimator f57879n;
    public float f57880o;
    public boolean f57881p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        w8 w8Var = new w8((g6) null);
        int i7 = p10.f24470s0;
        this.f57877l = 1.0f;
        this.f57878m = true;
        this.f57880o = 0.0f;
        this.f57881p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f57910a);
        this.f57870c = imageReceiver2;
        this.f57868a = hVar;
        q1 q1Var = hVar.D;
        this.f57869b = q1Var;
        this.d = j3;
        w8Var.f39982p = 1.0f;
        if (m5.E(j3)) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            w8Var.r(a22);
            if (t10.B(a22)) {
                str2 = id.M0(2131745901, null);
                w8Var.g(1);
                w8Var.f39982p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, w8Var, 0L, null, a22, 0);
                imageReceiver.J0(g0.L(g.f57903a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
                Paint Z1 = q1Var.Z1("paintChatActionText");
                if (str2 == null && Z1 != null) {
                    int L = g0.L(48);
                    TextPaint textPaint = new TextPaint(Z1);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.f22563q.x - L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : "";
            imageReceiver.i0(a22, w8Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            str = M0 != null ? M0.title : "";
            w8Var.q(M0);
            imageReceiver.i0(M0, w8Var, null);
        }
        str2 = str;
        imageReceiver.J0(g0.L(g.f57903a / 2.0f));
        imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
        Paint Z12 = q1Var.Z1("paintChatActionText");
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
            return com.google.android.recaptcha.internal.a.c(f19, 2.0f, (max - max2) / f20, f18);
        } else if (f15 < f12) {
            return f12 + f14;
        } else {
            if (f16 > f13) {
                return f13 - f14;
            }
            return f10;
        }
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10 - f12, f11 - f12);
        int i7 = g.f57903a;
        float f14 = 21;
        canvas.scale(f12 / g0.L(f14), f12 / g0.L(f14));
        ImageReceiver imageReceiver = this.f57870c;
        imageReceiver.setAlpha(((this.f57877l * 0.25f) + 0.75f) * f13);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f57879n) {
            this.f57880o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f57876k) {
            this.f57877l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f57868a.invalidateSelf();
    }
}
