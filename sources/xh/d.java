package xh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.u8;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f58807a;
    public final q1 f58808b;
    public final ImageReceiver f58809c;
    public final long d;
    public b f58810e;
    public b f58811f;
    public Paint f58812g;
    public final StaticLayout h;
    public float f58813i;
    public float f58814j;
    public ValueAnimator f58815k;
    public float f58816l;
    public boolean f58817m;
    public ValueAnimator f58818n;
    public float f58819o;
    public boolean f58820p;

    public d(h hVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f10;
        CharSequence ellipsize;
        u8 u8Var = new u8((e6) null);
        int i3 = h10.f22829t0;
        this.f58816l = 1.0f;
        this.f58817m = true;
        this.f58819o = 0.0f;
        this.f58820p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f58849a);
        this.f58809c = imageReceiver2;
        this.f58807a = hVar;
        q1 q1Var = hVar.E;
        this.f58808b = q1Var;
        this.d = j10;
        u8Var.f38691p = 1.0f;
        if (m5.E(j10)) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            u8Var.r(a22);
            if (l10.B(a22)) {
                str2 = bd.M0(2131745911, null);
                u8Var.g(1);
                u8Var.f38691p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, u8Var, 0L, null, a22, 0);
                imageReceiver.J0(g0.L(g.f58842a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, g0.L(f10), g0.L(f10));
                Paint Z1 = q1Var.Z1("paintChatActionText");
                if (str2 == null && Z1 != null) {
                    int L = g0.L(48);
                    TextPaint textPaint = new TextPaint(Z1);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.f22608q.x - L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : "";
            imageReceiver.i0(a22, u8Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            str = M0 != null ? M0.title : "";
            u8Var.q(M0);
            imageReceiver.i0(M0, u8Var, null);
        }
        str2 = str;
        imageReceiver.J0(g0.L(g.f58842a / 2.0f));
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
            return a1.g.A(f19, 2.0f, (max - max2) / f20, f18);
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
        int i3 = g.f58842a;
        float f14 = 21;
        canvas.scale(f12 / g0.L(f14), f12 / g0.L(f14));
        ImageReceiver imageReceiver = this.f58809c;
        imageReceiver.setAlpha(((this.f58816l * 0.25f) + 0.75f) * f13);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f58818n) {
            this.f58819o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f58815k) {
            this.f58816l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f58807a.invalidateSelf();
    }
}
