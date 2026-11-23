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
import c8.na;
import di.bc;
import di.ta;
import n2.o0;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import ug.s1;
public final class r extends FrameLayout {
    public final bc f61267a;
    public final o f61268b;
    public final TextView f61269c;
    public final m80 d;
    public final h6 f61270e;
    public final o0 f61271f;
    public final Paint[] h;
    public ValueAnimator f61272n;

    public r(Context context, h6 h6Var) {
        super(context);
        this.f61270e = h6Var;
        LinearLayout g10 = f3.g(context, 1);
        bc bcVar = new bc(context, 1, 0, 5);
        this.f61267a = bcVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i7 = m6.Dk;
        canvas.drawColor(i0.a.f(0.5f, m6.w0(i7, h6Var), m6.w0(m6.f29420h5, h6Var)));
        bcVar.setBackgroundBitmap(createBitmap);
        vg.g gVar = bcVar.f59470b;
        gVar.f59454z = i7;
        gVar.A = m6.Ck;
        gVar.b();
        g10.addView(bcVar, na.r(160, 160, 1));
        o oVar = new o(this, context);
        this.f61268b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        s1 s1Var = oVar.f58923a;
        s1Var.f58910q = false;
        s1Var.K = false;
        s1Var.L = true;
        s1Var.H = true;
        s1Var.f58905l = new ta(this, 5);
        s1Var.c();
        bcVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f61269c = textView;
        o10.p(textView, 1, 22.0f);
        int i10 = m6.G6;
        t6.U(textView, i10, h6Var);
        textView.setGravity(1);
        g10.addView(textView, na.t(-2, -2, 1, 24, -8, 24, 0));
        o0 o0Var = new o0(this);
        this.f61271f = o0Var;
        m80 m80Var = new m80(context, o0Var, h6Var);
        this.d = m80Var;
        m80Var.setTextSize(1, 15.0f);
        m80Var.setGravity(17);
        t6.U(m80Var, i10, h6Var);
        m80Var.setMovementMethod(LinkMovementMethod.getInstance());
        t6.G(m80Var, m6.J6, h6Var);
        m80Var.setImportantForAccessibility(2);
        g10.addView(m80Var, na.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, na.e(-1, 234, 48));
        addView(g10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i7 = m6.Ck;
        h6 h6Var = this.f61270e;
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.Dk, h6Var);
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
        o0 o0Var = this.f61271f;
        if (o0Var != null) {
            canvas.save();
            m80 m80Var = this.d;
            canvas.translate(m80Var.getLeft(), m80Var.getTop());
            if (o0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        bc bcVar = this.f61267a;
        float measuredHeight = (bcVar.getMeasuredHeight() / 2.0f) + bcVar.getTop();
        o oVar = this.f61268b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i7;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = m6.f29290a7;
        h6 h6Var = this.f61270e;
        t6.h(i10, this, h6Var);
        this.f61269c.setText(hd.a0("BoostingBoostsViaGifts", null, 2131753559, new Object[0]));
        if (v3.V(chat)) {
            i7 = 2131753507;
        } else {
            i7 = 2131753502;
        }
        String a02 = hd.a0(null, null, i7, new Object[0]);
        m80 m80Var = this.d;
        m80Var.setText(a02);
        t6.U(m80Var, m6.f29605r5, h6Var);
    }

    public void setPaused(boolean z10) {
        this.f61267a.setPaused(z10);
        this.f61268b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f10;
        ValueAnimator valueAnimator = this.f61272n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        bc bcVar = this.f61267a;
        final float f11 = bcVar.f59470b.f59441l;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f61272n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(bcVar.f59478f0);
        bcVar.d();
        bcVar.l();
        this.f61272n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f61267a.f59470b.f59441l = g0.T1(f12, f13, floatValue);
                vg.g gVar = rVar.f61267a.f59470b;
                float f15 = gVar.f59436f;
                float f16 = f14 * 360.0f;
                if (z11) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                gVar.f59436f = (f16 * i7) + f15;
                rVar.f61267a.f59470b.b();
                rVar.a(rVar.f61267a.f59470b.f59441l);
            }
        });
        this.f61272n.addListener(new q(this, fArr, f11, f10, z10));
        this.f61272n.setDuration(680L);
        this.f61272n.setInterpolator(nr.h);
        this.f61272n.start();
    }
}
