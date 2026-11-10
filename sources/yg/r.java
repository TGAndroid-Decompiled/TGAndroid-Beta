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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import ug.p1;
public final class r extends FrameLayout {
    public final qd f59485a;
    public final o f59486b;
    public final TextView f59487c;
    public final w70 d;
    public final h6 f59488e;
    public final n0 f59489f;
    public final Paint[] h;
    public ValueAnimator f59490n;

    public r(Context context, h6 h6Var) {
        super(context);
        this.f59488e = h6Var;
        LinearLayout f10 = k5.f(context, 1);
        qd qdVar = new qd(context, 1, 0, 5);
        this.f59485a = qdVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i7 = m6.Ak;
        canvas.drawColor(i0.a.f(0.5f, m6.w0(i7, h6Var), m6.w0(m6.f27963h5, h6Var)));
        qdVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = qdVar.f57420b;
        fVar.f57404z = i7;
        fVar.A = m6.zk;
        fVar.b();
        f10.addView(qdVar, ha.r(160, 160, 1));
        o oVar = new o(this, context);
        this.f59486b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        p1 p1Var = oVar.f56805a;
        p1Var.f56789q = false;
        p1Var.K = false;
        p1Var.L = true;
        p1Var.H = true;
        p1Var.f56784l = new fc(this, 5);
        p1Var.c();
        qdVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f59487c = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 22.0f);
        int i10 = m6.G6;
        t6.U(textView, i10, h6Var);
        textView.setGravity(1);
        f10.addView(textView, ha.t(-2, -2, 1, 24, -8, 24, 0));
        n0 n0Var = new n0(this);
        this.f59489f = n0Var;
        w70 w70Var = new w70(context, n0Var, h6Var);
        this.d = w70Var;
        w70Var.setTextSize(1, 15.0f);
        w70Var.setGravity(17);
        t6.U(w70Var, i10, h6Var);
        w70Var.setMovementMethod(LinkMovementMethod.getInstance());
        t6.G(w70Var, m6.J6, h6Var);
        w70Var.setImportantForAccessibility(2);
        f10.addView(w70Var, ha.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, ha.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i7 = m6.zk;
        h6 h6Var = this.f59488e;
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.Ak, h6Var);
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
        n0 n0Var = this.f59489f;
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
        qd qdVar = this.f59485a;
        float measuredHeight = (qdVar.getMeasuredHeight() / 2.0f) + qdVar.getTop();
        o oVar = this.f59486b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i7;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -g0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = m6.f27834a7;
        h6 h6Var = this.f59488e;
        t6.h(i10, this, h6Var);
        this.f59487c.setText(id.a0("BoostingBoostsViaGifts", null, 2131753562, new Object[0]));
        if (t3.V(chat)) {
            i7 = 2131753510;
        } else {
            i7 = 2131753505;
        }
        String a02 = id.a0(null, null, i7, new Object[0]);
        w70 w70Var = this.d;
        w70Var.setText(a02);
        t6.U(w70Var, m6.f28148r5, h6Var);
    }

    public void setPaused(boolean z9) {
        this.f59485a.setPaused(z9);
        this.f59486b.setPaused(z9);
    }

    public void setStars(final boolean z9) {
        final float f10;
        ValueAnimator valueAnimator = this.f59490n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qd qdVar = this.f59485a;
        final float f11 = qdVar.f57420b.f57391l;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f59490n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        g0.r(qdVar.f57426e0);
        qdVar.d();
        qdVar.l();
        this.f59490n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f59485a.f57420b.f57391l = g0.T1(f12, f13, floatValue);
                vg.f fVar = rVar.f59485a.f57420b;
                float f15 = fVar.f57386f;
                float f16 = f14 * 360.0f;
                if (z10) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                fVar.f57386f = (f16 * i7) + f15;
                rVar.f59485a.f57420b.b();
                rVar.a(rVar.f59485a.f57420b.f57391l);
            }
        });
        this.f59490n.addListener(new q(this, fArr, f11, f10, z9));
        this.f59490n.setDuration(680L);
        this.f59490n.setInterpolator(wq.h);
        this.f59490n.start();
    }
}
