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
import c8.na;
import di.bc;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q10;
public final class f extends FrameLayout {
    public final p9 f58772a;
    public final q10 f58773b;
    public final int f58774c;
    public final i d;

    public f(i iVar, Context context) {
        super(context);
        this.d = iVar;
        q10 q10Var = new q10();
        this.f58773b = q10Var;
        int i7 = iVar.f58822f;
        i6 i6Var = iVar.f58720a;
        if (i7 == 0) {
            this.f58774c = org.telegram.messenger.g0.L(150.0f);
            p9 p9Var = new p9(context);
            this.f58772a = p9Var;
            p9Var.setRoundRadius((int) (org.telegram.messenger.g0.L(65.0f) / 2.0f));
            addView(p9Var, na.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f10 = i10.i(i10.f24637t0).f();
            a9 a9Var = new a9((i6) null);
            a9Var.r(f10);
            p9Var.getImageReceiver().j0(f10, a9Var, null);
            TextView textView = new TextView(context);
            i5.c.x(textView, 1, 20.0f);
            m10.r(textView, n6.G6, i6Var, null, 2131743558);
            addView(textView, na.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            q10Var.f38669m = true;
            q10Var.f38659a = true;
            q10Var.d(n6.x0(null, n6.Dk, false), n6.x0(null, n6.Ck, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = q10Var.f38661c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(3.3f));
        } else if (i7 == 1) {
            ki.e eVar = new ki.e(context, 4);
            addView(eVar, na.e(-1, 190, 55));
            bc bcVar = new bc(context, 1, 1, 3);
            bcVar.setStarParticlesView(eVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = n6.Dk;
            canvas.drawColor(i0.a.f(0.5f, n6.w0(i10, i6Var), n6.w0(n6.f29524h5, i6Var)));
            bcVar.setBackgroundBitmap(createBitmap);
            vg.f fVar = bcVar.f59590b;
            fVar.f59574z = i10;
            fVar.A = n6.Ck;
            fVar.b();
            addView(bcVar, na.e(160, 160, 1));
            bcVar.m(100L);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            m10.r(textView2, n6.G6, i6Var, null, 2131744007);
            textView2.setGravity(17);
            addView(textView2, na.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            m10.r(textView3, n6.f29862z6, i6Var, null, 2131744003);
            textView3.setGravity(17);
            addView(textView3, na.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f58822f == 0) {
            Rect rect = org.telegram.messenger.g0.Q;
            this.f58772a.getHitRect(rect);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
            q10 q10Var = this.f58773b;
            q10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i7 = 0; i7 < 7; i7++) {
                float f11 = (i7 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(org.telegram.messenger.g0.P, f13, ((f11 + f10) - f12) - f13, false, q10Var.f38661c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f58774c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
