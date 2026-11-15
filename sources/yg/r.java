package yg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import di.qa;
import di.yb;
import n2.o0;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.z70;
import ug.r1;
public final class r extends FrameLayout {
    public final yb f60689a;
    public final o f60690b;
    public final TextView f60691c;
    public final z70 d;
    public final e6 f60692e;
    public final o0 f60693f;
    public final Paint[] h;
    public ValueAnimator f60694n;

    public r(Context context, e6 e6Var) {
        super(context);
        this.f60692e = e6Var;
        LinearLayout f10 = k5.f(context, 1);
        yb ybVar = new yb(context, 1, 0, 5);
        this.f60689a = ybVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i7 = j6.Dk;
        canvas.drawColor(i0.a.f(0.5f, j6.w0(i7, e6Var), j6.w0(j6.f28922h5, e6Var)));
        ybVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = ybVar.f58893b;
        fVar.f58877z = i7;
        fVar.A = j6.Ck;
        fVar.b();
        f10.addView(ybVar, ja.r(160, 160, 1));
        o oVar = new o(this, context);
        this.f60690b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        r1 r1Var = oVar.f58330a;
        r1Var.f58319q = false;
        r1Var.K = false;
        r1Var.L = true;
        r1Var.H = true;
        r1Var.f58314l = new qa(this, 5);
        r1Var.c();
        ybVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f60691c = textView;
        i20.o(textView, 1, 22.0f);
        int i10 = j6.G6;
        q6.U(textView, i10, e6Var);
        textView.setGravity(1);
        f10.addView(textView, ja.t(-2, -2, 1, 24, -8, 24, 0));
        o0 o0Var = new o0(this);
        this.f60693f = o0Var;
        z70 z70Var = new z70(context, o0Var, e6Var);
        this.d = z70Var;
        z70Var.setTextSize(1, 15.0f);
        z70Var.setGravity(17);
        q6.U(z70Var, i10, e6Var);
        z70Var.setMovementMethod(LinkMovementMethod.getInstance());
        q6.G(z70Var, j6.J6, e6Var);
        z70Var.setImportantForAccessibility(2);
        f10.addView(z70Var, ja.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, ja.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i7 = j6.Ck;
        e6 e6Var = this.f60692e;
        int w02 = j6.w0(i7, e6Var);
        int w03 = j6.w0(j6.Dk, e6Var);
        int f11 = i0.a.f(f10, w02, -371690);
        int f12 = i0.a.f(f10, w03, -14281);
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                paintArr[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (paintArr.length - 1), f11, f12), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o0 o0Var = this.f60693f;
        if (o0Var != null) {
            canvas.save();
            z70 z70Var = this.d;
            canvas.translate(z70Var.getLeft(), z70Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        yb ybVar = this.f60689a;
        float measuredHeight = (ybVar.getMeasuredHeight() / 2.0f) + ybVar.getTop();
        o oVar = this.f60690b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i7;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = j6.f28792a7;
        e6 e6Var = this.f60692e;
        q6.h(i10, this, e6Var);
        this.f60691c.setText(hd.a0("BoostingBoostsViaGifts", null, 2131753562, new Object[0]));
        if (t3.V(chat)) {
            i7 = 2131753510;
        } else {
            i7 = 2131753505;
        }
        String a02 = hd.a0(null, null, i7, new Object[0]);
        z70 z70Var = this.d;
        z70Var.setText(a02);
        q6.U(z70Var, j6.f29107r5, e6Var);
    }

    public void setPaused(boolean z10) {
        this.f60689a.setPaused(z10);
        this.f60690b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f10;
        ValueAnimator valueAnimator = this.f60694n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yb ybVar = this.f60689a;
        final float f11 = ybVar.f58893b.f58864l;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f60694n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(ybVar.f58901f0);
        ybVar.d();
        ybVar.l();
        this.f60694n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i7;
                r rVar = r.this;
                float[] fArr2 = fArr;
                float f12 = f11;
                float f13 = f10;
                boolean z11 = z10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                rVar.f60689a.f58893b.f58864l = g0.T1(f12, f13, floatValue);
                vg.f fVar = rVar.f60689a.f58893b;
                float f15 = fVar.f58859f;
                float f16 = f14 * 360.0f;
                if (z11) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                fVar.f58859f = (f16 * i7) + f15;
                rVar.f60689a.f58893b.b();
                rVar.a(rVar.f60689a.f58893b.f58864l);
            }
        });
        this.f60694n.addListener(new q(this, fArr, f11, f10, z10));
        this.f60694n.setDuration(680L);
        this.f60694n.setInterpolator(er.h);
        this.f60694n.start();
    }
}
