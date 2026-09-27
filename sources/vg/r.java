package vg;

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
import ci.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.sr;
import org.telegram.ui.bg0;
import rg.v1;
import w7.y5;
public final class r extends FrameLayout {
    public final bg0 f44672a;
    public final o f44673b;
    public final TextView f44674c;
    public final p90 d;
    public final e6 e;
    public final m90 f44675f;
    public final Paint[] h;
    public ValueAnimator f44676n;

    public r(Context context, e6 e6Var) {
        super(context);
        this.e = e6Var;
        LinearLayout f7 = qk.f(context, 1);
        bg0 bg0Var = new bg0(context, 1, 0, 3);
        this.f44672a = bg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = i6.Mj;
        canvas.drawColor(i0.a.d(0.5f, i6.v0(i10, e6Var), i6.v0(i6.f19128h5, e6Var)));
        bg0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = bg0Var.f43270b;
        aVar.f43258w = i10;
        aVar.f43259x = i6.Lj;
        aVar.b();
        f7.addView(bg0Var, y5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f44673b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        v1 v1Var = oVar.f42860a;
        v1Var.f42844q = false;
        v1Var.K = false;
        v1Var.L = true;
        v1Var.H = true;
        v1Var.f42839l = new y7(this, 4);
        v1Var.c();
        bg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f44674c = textView;
        qk.k(22.0f, 1, textView);
        int i11 = i6.G6;
        textView.setTextColor(i6.v0(i11, e6Var));
        textView.setGravity(1);
        f7.addView(textView, y5.t(-2, -2, 1, 24, -8, 24, 0));
        m90 m90Var = new m90(this);
        this.f44675f = m90Var;
        p90 p90Var = new p90(context, m90Var, e6Var);
        this.d = p90Var;
        p90Var.setTextSize(1, 15.0f);
        p90Var.setGravity(17);
        p90Var.setTextColor(i6.v0(i11, e6Var));
        p90Var.setMovementMethod(LinkMovementMethod.getInstance());
        p90Var.setLinkTextColor(i6.v0(i6.J6, e6Var));
        p90Var.setImportantForAccessibility(2);
        f7.addView(p90Var, y5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, y5.e(-1, 234, 48));
        addView(f7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = i6.Lj;
        e6 e6Var = this.e;
        int v02 = i6.v0(i10, e6Var);
        int v03 = i6.v0(i6.Mj, e6Var);
        int d = i0.a.d(f7, v02, -371690);
        int d10 = i0.a.d(f7, v03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 < paintArr.length) {
                paintArr[i11] = new Paint(1);
                paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.a.d(i11 / (paintArr.length - 1), d, d10), PorterDuff.Mode.SRC_IN));
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m90 m90Var = this.f44675f;
        if (m90Var != null) {
            canvas.save();
            p90 p90Var = this.d;
            canvas.translate(p90Var.getLeft(), p90Var.getTop());
            if (m90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        bg0 bg0Var = this.f44672a;
        float measuredHeight = (bg0Var.getMeasuredHeight() / 2.0f) + bg0Var.getTop();
        o oVar = this.f44673b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = i6.f19001a7;
        e6 e6Var = this.e;
        setBackgroundColor(i6.v0(i11, e6Var));
        this.f44674c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        p90 p90Var = this.d;
        p90Var.setText(formatString);
        p90Var.setTextColor(i6.v0(i6.f19315r5, e6Var));
    }

    public void setPaused(boolean z10) {
        this.f44672a.setPaused(z10);
        this.f44673b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f44676n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        bg0 bg0Var = this.f44672a;
        final float f10 = bg0Var.f43270b.f43245i;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f44676n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(bg0Var.U);
        bg0Var.d();
        bg0Var.i();
        this.f44676n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                bg0 bg0Var2 = rVar.f44672a;
                bg0Var2.f43270b.f43245i = AndroidUtilities.lerp(f10, f7, floatValue);
                sg.a aVar = bg0Var2.f43270b;
                float f12 = aVar.f43243f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f43243f = (f13 * i10) + f12;
                aVar.b();
                rVar.a(bg0Var2.f43270b.f43245i);
            }
        });
        this.f44676n.addListener(new q(this, fArr, f10, f7, z10));
        this.f44676n.setDuration(680L);
        this.f44676n.setInterpolator(sr.h);
        this.f44676n.start();
    }
}
