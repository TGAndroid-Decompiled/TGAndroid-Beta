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
import c8.ma;
import di.bc;
import org.telegram.messenger.k10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.s10;
public final class f extends FrameLayout {
    public final q9 f58692a;
    public final s10 f58693b;
    public final int f58694c;
    public final i d;

    public f(i iVar, Context context) {
        super(context);
        this.d = iVar;
        s10 s10Var = new s10();
        this.f58693b = s10Var;
        int i7 = iVar.f58742f;
        h6 h6Var = iVar.f58640a;
        if (i7 == 0) {
            this.f58694c = org.telegram.messenger.g0.L(150.0f);
            q9 q9Var = new q9(context);
            this.f58692a = q9Var;
            q9Var.setRoundRadius((int) (org.telegram.messenger.g0.L(65.0f) / 2.0f));
            addView(q9Var, ma.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f10 = k10.i(k10.f24968t0).f();
            b9 b9Var = new b9((h6) null);
            b9Var.r(f10);
            q9Var.getImageReceiver().i0(f10, b9Var, null);
            TextView textView = new TextView(context);
            i5.c.x(textView, 1, 20.0f);
            o10.r(textView, m6.G6, h6Var, null, 2131743560);
            addView(textView, ma.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            s10Var.f39455m = true;
            s10Var.f39445a = true;
            s10Var.d(m6.x0(null, m6.Dk, false), m6.x0(null, m6.Ck, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = s10Var.f39447c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(3.3f));
        } else if (i7 == 1) {
            ki.e eVar = new ki.e(context, 4);
            addView(eVar, ma.e(-1, 190, 55));
            bc bcVar = new bc(context, 1, 1, 3);
            bcVar.setStarParticlesView(eVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = m6.Dk;
            canvas.drawColor(i0.a.f(0.5f, m6.w0(i10, h6Var), m6.w0(m6.f29454h5, h6Var)));
            bcVar.setBackgroundBitmap(createBitmap);
            vg.f fVar = bcVar.f59505b;
            fVar.f59489z = i10;
            fVar.A = m6.Ck;
            fVar.b();
            addView(bcVar, ma.e(160, 160, 1));
            bcVar.m(100L);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            o10.r(textView2, m6.G6, h6Var, null, 2131744009);
            textView2.setGravity(17);
            addView(textView2, ma.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            o10.r(textView3, m6.f29792z6, h6Var, null, 2131744005);
            textView3.setGravity(17);
            addView(textView3, ma.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f58742f == 0) {
            Rect rect = org.telegram.messenger.g0.Q;
            this.f58692a.getHitRect(rect);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
            s10 s10Var = this.f58693b;
            s10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i7 = 0; i7 < 7; i7++) {
                float f11 = (i7 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(org.telegram.messenger.g0.P, f13, ((f11 + f10) - f12) - f13, false, s10Var.f39447c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f58694c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
