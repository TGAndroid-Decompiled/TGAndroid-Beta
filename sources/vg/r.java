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
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.is;
import org.telegram.ui.dg0;
import rg.v1;
import w7.x5;
public final class r extends FrameLayout {
    public final dg0 f49702a;
    public final o f49703b;
    public final TextView f49704c;
    public final fa0 d;
    public final d6 f49705e;
    public final ca0 f49706f;
    public final Paint[] h;
    public ValueAnimator f49707n;

    public r(Context context, d6 d6Var) {
        super(context);
        this.f49705e = d6Var;
        LinearLayout e7 = ai.e(context, 1);
        dg0 dg0Var = new dg0(context, 1, 0, 3);
        this.f49702a = dg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = h6.Mj;
        canvas.drawColor(i0.a.d(0.5f, h6.w0(i10, d6Var), h6.w0(h6.f20857h5, d6Var)));
        dg0Var.setBackgroundBitmap(createBitmap);
        sg.g gVar = dg0Var.f48168b;
        gVar.f48152z = i10;
        gVar.A = h6.Lj;
        gVar.b();
        e7.addView(dg0Var, x5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f49703b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        v1 v1Var = oVar.f47593a;
        v1Var.f47580q = false;
        v1Var.K = false;
        v1Var.L = true;
        v1Var.H = true;
        v1Var.f47575l = new x7(this, 4);
        v1Var.c();
        dg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f49704c = textView;
        ai.k(22.0f, 1, textView);
        int i11 = h6.G6;
        textView.setTextColor(h6.w0(i11, d6Var));
        textView.setGravity(1);
        e7.addView(textView, x5.t(-2, -2, 1, 24, -8, 24, 0));
        ca0 ca0Var = new ca0(this);
        this.f49706f = ca0Var;
        fa0 fa0Var = new fa0(context, ca0Var, d6Var);
        this.d = fa0Var;
        fa0Var.setTextSize(1, 15.0f);
        fa0Var.setGravity(17);
        fa0Var.setTextColor(h6.w0(i11, d6Var));
        fa0Var.setMovementMethod(LinkMovementMethod.getInstance());
        fa0Var.setLinkTextColor(h6.w0(h6.J6, d6Var));
        fa0Var.setImportantForAccessibility(2);
        e7.addView(fa0Var, x5.a(-2.0f, 24.0f, 8.0f, 24.0f, 18.0f, -1, 17));
        setClipChildren(false);
        addView(oVar, x5.e(-1, 234, 48));
        addView(e7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = h6.Lj;
        d6 d6Var = this.f49705e;
        int w02 = h6.w0(i10, d6Var);
        int w03 = h6.w0(h6.Mj, d6Var);
        int d = i0.a.d(f7, w02, -371690);
        int d10 = i0.a.d(f7, w03, -14281);
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
        ca0 ca0Var = this.f49706f;
        if (ca0Var != null) {
            canvas.save();
            fa0 fa0Var = this.d;
            canvas.translate(fa0Var.getLeft(), fa0Var.getTop());
            if (ca0Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        dg0 dg0Var = this.f49702a;
        float measuredHeight = (dg0Var.getMeasuredHeight() / 2.0f) + dg0Var.getTop();
        o oVar = this.f49703b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = h6.f20730a7;
        d6 d6Var = this.f49705e;
        setBackgroundColor(h6.w0(i11, d6Var));
        this.f49704c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        fa0 fa0Var = this.d;
        fa0Var.setText(formatString);
        fa0Var.setTextColor(h6.w0(h6.f21044r5, d6Var));
    }

    public void setPaused(boolean z10) {
        this.f49702a.setPaused(z10);
        this.f49703b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f49707n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dg0 dg0Var = this.f49702a;
        final float f10 = dg0Var.f48168b.f48139l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f49707n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(dg0Var.f48169b0);
        dg0Var.d();
        dg0Var.l();
        this.f49707n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                r rVar = r.this;
                float[] fArr2 = fArr;
                float f11 = f10;
                float f12 = f7;
                boolean z11 = z10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f13 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                rVar.f49702a.f48168b.f48139l = AndroidUtilities.lerp(f11, f12, floatValue);
                sg.g gVar = rVar.f49702a.f48168b;
                float f14 = gVar.f48134f;
                float f15 = f13 * 360.0f;
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                gVar.f48134f = (f15 * i10) + f14;
                rVar.f49702a.f48168b.b();
                rVar.a(rVar.f49702a.f48168b.f48139l);
            }
        });
        this.f49707n.addListener(new q(this, fArr, f10, f7, z10));
        this.f49707n.setDuration(680L);
        this.f49707n.setInterpolator(is.h);
        this.f49707n.start();
    }
}
