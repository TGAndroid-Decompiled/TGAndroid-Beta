package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import di.yb;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
public final class f extends FrameLayout {
    public final i9 f58071a;
    public final i10 f58072b;
    public final int f58073c;
    public final i d;

    public f(i iVar, Context context) {
        super(context);
        this.d = iVar;
        i10 i10Var = new i10();
        this.f58072b = i10Var;
        int i7 = iVar.f58118f;
        e6 e6Var = iVar.f58029a;
        if (i7 == 0) {
            this.f58073c = org.telegram.messenger.g0.L(150.0f);
            i9 i9Var = new i9(context);
            this.f58071a = i9Var;
            i9Var.setRoundRadius((int) (org.telegram.messenger.g0.L(65.0f) / 2.0f));
            addView(i9Var, ja.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f10 = m10.i(m10.f24934t0).f();
            t8 t8Var = new t8((e6) null);
            t8Var.r(f10);
            i9Var.getImageReceiver().i0(f10, t8Var, null);
            TextView textView = new TextView(context);
            i5.c.v(textView, 1, 20.0f);
            i20.q(textView, j6.G6, e6Var, null, 2131743805);
            addView(textView, ja.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            i10Var.f35425m = true;
            i10Var.f35415a = true;
            i10Var.d(j6.x0(null, j6.Dk, false), j6.x0(null, j6.Ck, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = i10Var.f35417c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(3.3f));
        } else if (i7 == 1) {
            ki.f fVar = new ki.f(context, 4);
            addView(fVar, ja.e(-1, 190, 55));
            yb ybVar = new yb(context, 1, 1, 3);
            ybVar.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = j6.Dk;
            canvas.drawColor(i0.a.f(0.5f, j6.w0(i10, e6Var), j6.w0(j6.f28922h5, e6Var)));
            ybVar.setBackgroundBitmap(createBitmap);
            vg.f fVar2 = ybVar.f58893b;
            fVar2.f58877z = i10;
            fVar2.A = j6.Ck;
            fVar2.b();
            addView(ybVar, ja.e(160, 160, 1));
            ybVar.m(100L);
            TextView g10 = k5.g(context, 1, 20.0f);
            g10.setTypeface(org.telegram.messenger.g0.o());
            i20.q(g10, j6.G6, e6Var, null, 2131744252);
            g10.setGravity(17);
            addView(g10, ja.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            i20.q(textView2, j6.f29260z6, e6Var, null, 2131744248);
            textView2.setGravity(17);
            addView(textView2, ja.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f58118f == 0) {
            Rect rect = org.telegram.messenger.g0.Q;
            this.f58071a.getHitRect(rect);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
            i10 i10Var = this.f58072b;
            i10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i7 = 0; i7 < 7; i7++) {
                float f11 = (i7 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(org.telegram.messenger.g0.P, f13, ((f11 + f10) - f12) - f13, false, i10Var.f35417c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f58073c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
