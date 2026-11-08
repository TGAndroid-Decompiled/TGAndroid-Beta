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
import bi.fc;
import bi.qd;
import c8.ha;
import n2.n0;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import ug.p1;
public final class r extends FrameLayout {
    public final qd f59477a;
    public final o f59478b;
    public final TextView f59479c;
    public final w70 d;
    public final f6 f59480e;
    public final n0 f59481f;
    public final Paint[] h;
    public ValueAnimator f59482n;

    public r(Context context, f6 f6Var) {
        super(context);
        this.f59480e = f6Var;
        LinearLayout f10 = k5.f(context, 1);
        qd qdVar = new qd(context, 1, 0, 5);
        this.f59477a = qdVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i7 = k6.Ak;
        canvas.drawColor(i0.a.f(0.5f, k6.w0(i7, f6Var), k6.w0(k6.f27925h5, f6Var)));
        qdVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = qdVar.f57411b;
        fVar.f57395z = i7;
        fVar.A = k6.zk;
        fVar.b();
        f10.addView(qdVar, ha.r(160, 160, 1));
        o oVar = new o(this, context);
        this.f59478b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        p1 p1Var = oVar.f56793a;
        p1Var.f56777q = false;
        p1Var.K = false;
        p1Var.L = true;
        p1Var.H = true;
        p1Var.f56772l = new fc(this, 5);
        p1Var.c();
        qdVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f59479c = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 22.0f);
        int i10 = k6.G6;
        r6.V(textView, i10, f6Var);
        textView.setGravity(1);
        f10.addView(textView, ha.t(-2, -2, 1, 24, -8, 24, 0));
        n0 n0Var = new n0(this);
        this.f59481f = n0Var;
        w70 w70Var = new w70(context, n0Var, f6Var);
        this.d = w70Var;
        w70Var.setTextSize(1, 15.0f);
        w70Var.setGravity(17);
        r6.V(w70Var, i10, f6Var);
        w70Var.setMovementMethod(LinkMovementMethod.getInstance());
        r6.H(w70Var, k6.J6, f6Var);
        w70Var.setImportantForAccessibility(2);
        f10.addView(w70Var, ha.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, ha.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i7 = k6.zk;
        f6 f6Var = this.f59480e;
        int w02 = k6.w0(i7, f6Var);
        int w03 = k6.w0(k6.Ak, f6Var);
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
        n0 n0Var = this.f59481f;
        if (n0Var != null) {
            canvas.save();
            w70 w70Var = this.d;
            canvas.translate(w70Var.getLeft(), w70Var.getTop());
            if (n0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        qd qdVar = this.f59477a;
        float measuredHeight = (qdVar.getMeasuredHeight() / 2.0f) + qdVar.getTop();
        o oVar = this.f59478b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i7;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = k6.f27796a7;
        f6 f6Var = this.f59480e;
        r6.i(i10, this, f6Var);
        this.f59479c.setText(id.a0("BoostingBoostsViaGifts", null, 2131753562, new Object[0]));
        if (t3.V(chat)) {
            i7 = 2131753510;
        } else {
            i7 = 2131753505;
        }
        String a02 = id.a0(null, null, i7, new Object[0]);
        w70 w70Var = this.d;
        w70Var.setText(a02);
        r6.V(w70Var, k6.f28110r5, f6Var);
    }

    public void setPaused(boolean z9) {
        this.f59477a.setPaused(z9);
        this.f59478b.setPaused(z9);
    }

    public void setStars(final boolean z9) {
        final float f10;
        ValueAnimator valueAnimator = this.f59482n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qd qdVar = this.f59477a;
        final float f11 = qdVar.f57411b.f57382l;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f59482n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(qdVar.f57417e0);
        qdVar.d();
        qdVar.l();
        this.f59482n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i7;
                r rVar = r.this;
                float[] fArr2 = fArr;
                float f12 = f11;
                float f13 = f10;
                boolean z10 = z9;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                rVar.f59477a.f57411b.f57382l = g0.T1(f12, f13, floatValue);
                vg.f fVar = rVar.f59477a.f57411b;
                float f15 = fVar.f57377f;
                float f16 = f14 * 360.0f;
                if (z10) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                fVar.f57377f = (f16 * i7) + f15;
                rVar.f59477a.f57411b.b();
                rVar.a(rVar.f59477a.f57411b.f57382l);
            }
        });
        this.f59482n.addListener(new q(this, fArr, f11, f10, z9));
        this.f59482n.setDuration(680L);
        this.f59482n.setInterpolator(xq.h);
        this.f59482n.start();
    }
}
