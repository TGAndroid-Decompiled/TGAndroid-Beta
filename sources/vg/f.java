package vg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import ci.ic;
import org.telegram.messenger.h10;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
public final class f extends FrameLayout {
    public final k9 f56604a;
    public final b10 f56605b;
    public final int f56606c;
    public final i d;

    public f(i iVar, Context context) {
        super(context);
        this.d = iVar;
        b10 b10Var = new b10();
        this.f56605b = b10Var;
        int i3 = iVar.f56650f;
        e6 e6Var = iVar.f56567a;
        if (i3 == 0) {
            this.f56606c = org.telegram.messenger.g0.L(150.0f);
            k9 k9Var = new k9(context);
            this.f56604a = k9Var;
            k9Var.setRoundRadius((int) (org.telegram.messenger.g0.L(65.0f) / 2.0f));
            addView(k9Var, mf.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f10 = h10.i(h10.f22829t0).f();
            u8 u8Var = new u8((e6) null);
            u8Var.r(f10);
            k9Var.getImageReceiver().i0(f10, u8Var, null);
            TextView textView = new TextView(context);
            k2.p1.t(textView, 1, 20.0f);
            org.telegram.messenger.camera.q.o(textView, k6.G6, e6Var, null, 2131743815);
            addView(textView, mf.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            b10Var.f32046m = true;
            b10Var.f32036a = true;
            b10Var.d(k6.x0(null, k6.Ak, false), k6.x0(null, k6.zk, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = b10Var.f32038c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(3.3f));
        } else if (i3 == 1) {
            ii.f fVar = new ii.f(context, 4);
            addView(fVar, mf.e(-1, 190, 55));
            ic icVar = new ic(context, 1, 1, 3);
            icVar.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = k6.Ak;
            canvas.drawColor(i0.a.f(0.5f, k6.w0(i10, e6Var), k6.w0(k6.f27954h5, e6Var)));
            icVar.setBackgroundBitmap(createBitmap);
            wg.f fVar2 = icVar.f57666b;
            fVar2.f57650z = i10;
            fVar2.A = k6.zk;
            fVar2.b();
            addView(icVar, mf.e(160, 160, 1));
            icVar.m(100L);
            TextView g7 = k5.g(context, 1, 20.0f);
            g7.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.messenger.camera.q.o(g7, k6.G6, e6Var, null, 2131744262);
            g7.setGravity(17);
            addView(g7, mf.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            org.telegram.messenger.camera.q.o(textView2, k6.f28290z6, e6Var, null, 2131744258);
            textView2.setGravity(17);
            addView(textView2, mf.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f56650f == 0) {
            Rect rect = org.telegram.messenger.g0.Q;
            this.f56604a.getHitRect(rect);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
            b10 b10Var = this.f56605b;
            b10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i3 = 0; i3 < 7; i3++) {
                float f11 = (i3 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(org.telegram.messenger.g0.P, f13, ((f11 + f10) - f12) - f13, false, b10Var.f32038c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = this.f56606c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i3, i10);
    }
}
