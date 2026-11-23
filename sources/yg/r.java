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
import n2.p0;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kr;
import ug.s1;
public final class r extends FrameLayout {
    public final bc f61386a;
    public final o f61387b;
    public final TextView f61388c;
    public final j80 d;
    public final i6 f61389e;
    public final p0 f61390f;
    public final Paint[] h;
    public ValueAnimator f61391n;

    public r(Context context, i6 i6Var) {
        super(context);
        this.f61389e = i6Var;
        LinearLayout g10 = f3.g(context, 1);
        bc bcVar = new bc(context, 1, 0, 5);
        this.f61386a = bcVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i7 = n6.Dk;
        canvas.drawColor(i0.a.f(0.5f, n6.w0(i7, i6Var), n6.w0(n6.f29524h5, i6Var)));
        bcVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = bcVar.f59590b;
        fVar.f59574z = i7;
        fVar.A = n6.Ck;
        fVar.b();
        g10.addView(bcVar, na.r(160, 160, 1));
        o oVar = new o(this, context);
        this.f61387b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        s1 s1Var = oVar.f59038a;
        s1Var.f59025q = false;
        s1Var.K = false;
        s1Var.L = true;
        s1Var.H = true;
        s1Var.f59020l = new ta(this, 5);
        s1Var.c();
        bcVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f61388c = textView;
        m10.p(textView, 1, 22.0f);
        int i10 = n6.G6;
        u6.U(textView, i10, i6Var);
        textView.setGravity(1);
        g10.addView(textView, na.t(-2, -2, 1, 24, -8, 24, 0));
        p0 p0Var = new p0(this);
        this.f61390f = p0Var;
        j80 j80Var = new j80(context, p0Var, i6Var);
        this.d = j80Var;
        j80Var.setTextSize(1, 15.0f);
        j80Var.setGravity(17);
        u6.U(j80Var, i10, i6Var);
        j80Var.setMovementMethod(LinkMovementMethod.getInstance());
        u6.G(j80Var, n6.J6, i6Var);
        j80Var.setImportantForAccessibility(2);
        g10.addView(j80Var, na.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, na.e(-1, 234, 48));
        addView(g10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i7 = n6.Ck;
        i6 i6Var = this.f61389e;
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.Dk, i6Var);
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
        p0 p0Var = this.f61390f;
        if (p0Var != null) {
            canvas.save();
            j80 j80Var = this.d;
            canvas.translate(j80Var.getLeft(), j80Var.getTop());
            if (p0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        bc bcVar = this.f61386a;
        float measuredHeight = (bcVar.getMeasuredHeight() / 2.0f) + bcVar.getTop();
        o oVar = this.f61387b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i7;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = n6.f29394a7;
        i6 i6Var = this.f61389e;
        u6.h(i10, this, i6Var);
        this.f61388c.setText(gd.a0("BoostingBoostsViaGifts", null, 2131753559, new Object[0]));
        if (v3.V(chat)) {
            i7 = 2131753507;
        } else {
            i7 = 2131753502;
        }
        String a02 = gd.a0(null, null, i7, new Object[0]);
        j80 j80Var = this.d;
        j80Var.setText(a02);
        u6.U(j80Var, n6.f29709r5, i6Var);
    }

    public void setPaused(boolean z10) {
        this.f61386a.setPaused(z10);
        this.f61387b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f10;
        ValueAnimator valueAnimator = this.f61391n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        bc bcVar = this.f61386a;
        final float f11 = bcVar.f59590b.f59561l;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f61391n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(bcVar.f59598f0);
        bcVar.d();
        bcVar.l();
        this.f61391n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f61386a.f59590b.f59561l = g0.T1(f12, f13, floatValue);
                vg.f fVar = rVar.f61386a.f59590b;
                float f15 = fVar.f59556f;
                float f16 = f14 * 360.0f;
                if (z11) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                fVar.f59556f = (f16 * i7) + f15;
                rVar.f61386a.f59590b.b();
                rVar.a(rVar.f61386a.f59590b.f59561l);
            }
        });
        this.f61391n.addListener(new q(this, fArr, f11, f10, z10));
        this.f61391n.setDuration(680L);
        this.f61391n.setInterpolator(kr.h);
        this.f61391n.start();
    }
}
