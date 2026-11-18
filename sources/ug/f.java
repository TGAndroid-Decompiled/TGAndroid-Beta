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
import org.telegram.messenger.j10;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.q9;
public final class f extends FrameLayout {
    public final q9 f58648a;
    public final p10 f58649b;
    public final int f58650c;
    public final i d;

    public f(i iVar, Context context) {
        super(context);
        this.d = iVar;
        p10 p10Var = new p10();
        this.f58649b = p10Var;
        int i7 = iVar.f58674f;
        i6 i6Var = iVar.f58594a;
        if (i7 == 0) {
            this.f58650c = org.telegram.messenger.g0.L(150.0f);
            q9 q9Var = new q9(context);
            this.f58648a = q9Var;
            q9Var.setRoundRadius((int) (org.telegram.messenger.g0.L(65.0f) / 2.0f));
            addView(q9Var, ma.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f10 = j10.i(j10.f24773t0).f();
            b9 b9Var = new b9((i6) null);
            b9Var.r(f10);
            q9Var.getImageReceiver().i0(f10, b9Var, null);
            TextView textView = new TextView(context);
            i5.c.x(textView, 1, 20.0f);
            n10.r(textView, n6.G6, i6Var, null, 2131743568);
            addView(textView, ma.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            p10Var.f38244m = true;
            p10Var.f38234a = true;
            p10Var.d(n6.x0(null, n6.Dk, false), n6.x0(null, n6.Ck, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = p10Var.f38236c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(3.3f));
        } else if (i7 == 1) {
            ki.f fVar = new ki.f(context, 4);
            addView(fVar, ma.e(-1, 190, 55));
            bc bcVar = new bc(context, 1, 1, 3);
            bcVar.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = n6.Dk;
            canvas.drawColor(i0.a.f(0.5f, n6.w0(i10, i6Var), n6.w0(n6.f29469h5, i6Var)));
            bcVar.setBackgroundBitmap(createBitmap);
            vg.f fVar2 = bcVar.f59462b;
            fVar2.f59446z = i10;
            fVar2.A = n6.Ck;
            fVar2.b();
            addView(bcVar, ma.e(160, 160, 1));
            bcVar.m(100L);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            n10.r(textView2, n6.G6, i6Var, null, 2131744017);
            textView2.setGravity(17);
            addView(textView2, ma.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            n10.r(textView3, n6.f29807z6, i6Var, null, 2131744013);
            textView3.setGravity(17);
            addView(textView3, ma.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f58674f == 0) {
            Rect rect = org.telegram.messenger.g0.Q;
            this.f58648a.getHitRect(rect);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
            p10 p10Var = this.f58649b;
            p10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i7 = 0; i7 < 7; i7++) {
                float f11 = (i7 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(org.telegram.messenger.g0.P, f13, ((f11 + f10) - f12) - f13, false, p10Var.f38236c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f58650c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
