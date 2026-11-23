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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.i5;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.a9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f60001a;
    public final r1 f60002b;
    public final ImageReceiver f60003c;
    public final long d;
    public b f60004e;
    public b f60005f;
    public Paint f60006g;
    public final StaticLayout h;
    public float f60007i;
    public float f60008j;
    public ValueAnimator f60009k;
    public float f60010l;
    public boolean f60011m;
    public ValueAnimator f60012n;
    public float f60013o;
    public boolean f60014p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        a9 a9Var = new a9((i6) null);
        int i7 = i10.f24637t0;
        this.f60010l = 1.0f;
        this.f60011m = true;
        this.f60013o = 0.0f;
        this.f60014p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f60043a);
        this.f60003c = imageReceiver2;
        this.f60001a = hVar;
        r1 r1Var = hVar.E;
        this.f60002b = r1Var;
        this.d = j3;
        a9Var.f33433p = 1.0f;
        if (n5.E(j3)) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            a9Var.r(c22);
            if (n10.C(c22)) {
                str2 = gd.N0(2131745705, null);
                a9Var.g(1);
                a9Var.f33433p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.s0(null, null, null, null, a9Var, 0L, null, c22, 0);
                imageReceiver.K0(g0.L(g.f60036a / 2.0f));
                imageReceiver.z0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
                Paint a22 = r1Var.a2("paintChatActionText");
                if (str2 == null && a22 != null) {
                    int L = g0.L(48);
                    TextPaint textPaint = new TextPaint(a22);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.f24226q.x - L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = c22 != null ? i5.m(0, c22.first_name, c22.last_name) : "";
            imageReceiver.j0(c22, a9Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            str = O0 != null ? O0.title : "";
            a9Var.q(O0);
            imageReceiver.j0(O0, a9Var, null);
        }
        str2 = str;
        imageReceiver.K0(g0.L(g.f60036a / 2.0f));
        imageReceiver.z0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
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
        int i7 = g.f60036a;
        float f14 = 21;
        canvas.scale(f12 / g0.L(f14), f12 / g0.L(f14));
        ImageReceiver imageReceiver = this.f60003c;
        imageReceiver.setAlpha(((this.f60010l * 0.25f) + 0.75f) * f13);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f60012n) {
            this.f60013o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f60009k) {
            this.f60010l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f60001a.invalidateSelf();
    }
}
