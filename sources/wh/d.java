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
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.b9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f59872a;
    public final q1 f59873b;
    public final ImageReceiver f59874c;
    public final long d;
    public b f59875e;
    public b f59876f;
    public Paint f59877g;
    public final StaticLayout h;
    public float f59878i;
    public float f59879j;
    public ValueAnimator f59880k;
    public float f59881l;
    public boolean f59882m;
    public ValueAnimator f59883n;
    public float f59884o;
    public boolean f59885p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        b9 b9Var = new b9((i6) null);
        int i7 = j10.f24773t0;
        this.f59881l = 1.0f;
        this.f59882m = true;
        this.f59884o = 0.0f;
        this.f59885p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f59914a);
        this.f59874c = imageReceiver2;
        this.f59872a = hVar;
        q1 q1Var = hVar.E;
        this.f59873b = q1Var;
        this.d = j3;
        b9Var.f33601p = 1.0f;
        if (n5.E(j3)) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            b9Var.r(c22);
            if (o10.C(c22)) {
                str2 = gd.M0(2131745706, null);
                b9Var.g(1);
                b9Var.f33601p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, b9Var, 0L, null, c22, 0);
                imageReceiver.J0(g0.L(g.f59907a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
                Paint a22 = q1Var.a2("paintChatActionText");
                if (str2 == null && a22 != null) {
                    int L = g0.L(48);
                    TextPaint textPaint = new TextPaint(a22);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.f24121q.x - L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = c22 != null ? i5.m(0, c22.first_name, c22.last_name) : "";
            imageReceiver.i0(c22, b9Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            str = O0 != null ? O0.title : "";
            b9Var.q(O0);
            imageReceiver.i0(O0, b9Var, null);
        }
        str2 = str;
        imageReceiver.J0(g0.L(g.f59907a / 2.0f));
        imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
        Paint a222 = q1Var.a2("paintChatActionText");
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
        int i7 = g.f59907a;
        float f14 = 21;
        canvas.scale(f12 / g0.L(f14), f12 / g0.L(f14));
        ImageReceiver imageReceiver = this.f59874c;
        imageReceiver.setAlpha(((this.f59881l * 0.25f) + 0.75f) * f13);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f59883n) {
            this.f59884o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f59880k) {
            this.f59881l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f59872a.invalidateSelf();
    }
}
