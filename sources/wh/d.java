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
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.t8;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f59308a;
    public final q1 f59309b;
    public final ImageReceiver f59310c;
    public final long d;
    public b f59311e;
    public b f59312f;
    public Paint f59313g;
    public final StaticLayout h;
    public float f59314i;
    public float f59315j;
    public ValueAnimator f59316k;
    public float f59317l;
    public boolean f59318m;
    public ValueAnimator f59319n;
    public float f59320o;
    public boolean f59321p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        t8 t8Var = new t8((e6) null);
        int i7 = m10.f24934t0;
        this.f59317l = 1.0f;
        this.f59318m = true;
        this.f59320o = 0.0f;
        this.f59321p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f59350a);
        this.f59310c = imageReceiver2;
        this.f59308a = hVar;
        q1 q1Var = hVar.E;
        this.f59309b = q1Var;
        this.d = j3;
        t8Var.f39600p = 1.0f;
        if (m5.E(j3)) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            t8Var.r(a22);
            if (q10.B(a22)) {
                str2 = hd.M0(2131745901, null);
                t8Var.g(1);
                t8Var.f39600p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, t8Var, 0L, null, a22, 0);
                imageReceiver.J0(g0.L(g.f59343a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
                Paint a23 = q1Var.a2("paintChatActionText");
                if (str2 == null && a23 != null) {
                    int L = g0.L(48);
                    TextPaint textPaint = new TextPaint(a23);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.f23609q.x - L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : "";
            imageReceiver.i0(a22, t8Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
            str = M0 != null ? M0.title : "";
            t8Var.q(M0);
            imageReceiver.i0(M0, t8Var, null);
        }
        str2 = str;
        imageReceiver.J0(g0.L(g.f59343a / 2.0f));
        imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
        Paint a232 = q1Var.a2("paintChatActionText");
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
        int i7 = g.f59343a;
        float f14 = 21;
        canvas.scale(f12 / g0.L(f14), f12 / g0.L(f14));
        ImageReceiver imageReceiver = this.f59310c;
        imageReceiver.setAlpha(((this.f59317l * 0.25f) + 0.75f) * f13);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f59319n) {
            this.f59320o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f59316k) {
            this.f59317l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f59308a.invalidateSelf();
    }
}
