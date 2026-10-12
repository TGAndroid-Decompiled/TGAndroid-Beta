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
import org.telegram.messenger.am;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.js;
import org.telegram.ui.fg0;
import rg.v1;
import w7.w5;
public final class r extends FrameLayout {
    public final fg0 f49851a;
    public final o f49852b;
    public final TextView f49853c;
    public final ia0 d;
    public final c6 f49854e;
    public final fa0 f49855f;
    public final Paint[] h;
    public ValueAnimator f49856n;

    public r(Context context, c6 c6Var) {
        super(context);
        this.f49854e = c6Var;
        LinearLayout e7 = am.e(context, 1);
        fg0 fg0Var = new fg0(context, 1, 0, 3);
        this.f49851a = fg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = h6.Mj;
        canvas.drawColor(i0.a.d(0.5f, h6.w0(i10, c6Var), h6.w0(h6.f20631h5, c6Var)));
        fg0Var.setBackgroundBitmap(createBitmap);
        sg.g gVar = fg0Var.f48317b;
        gVar.f48301z = i10;
        gVar.A = h6.Lj;
        gVar.b();
        e7.addView(fg0Var, w5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f49852b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        v1 v1Var = oVar.f47725a;
        v1Var.f47712q = false;
        v1Var.K = false;
        v1Var.L = true;
        v1Var.H = true;
        v1Var.f47707l = new x7(this, 4);
        v1Var.c();
        fg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f49853c = textView;
        am.k(22.0f, 1, textView);
        int i11 = h6.G6;
        textView.setTextColor(h6.w0(i11, c6Var));
        textView.setGravity(1);
        e7.addView(textView, w5.t(-2, -2, 1, 24, -8, 24, 0));
        fa0 fa0Var = new fa0(this);
        this.f49855f = fa0Var;
        ia0 ia0Var = new ia0(context, fa0Var, c6Var);
        this.d = ia0Var;
        ia0Var.setTextSize(1, 15.0f);
        ia0Var.setGravity(17);
        ia0Var.setTextColor(h6.w0(i11, c6Var));
        ia0Var.setMovementMethod(LinkMovementMethod.getInstance());
        ia0Var.setLinkTextColor(h6.w0(h6.J6, c6Var));
        ia0Var.setImportantForAccessibility(2);
        e7.addView(ia0Var, w5.a(-2.0f, 24.0f, 8.0f, 24.0f, 18.0f, -1, 17));
        setClipChildren(false);
        addView(oVar, w5.e(-1, 234, 48));
        addView(e7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = h6.Lj;
        c6 c6Var = this.f49854e;
        int w02 = h6.w0(i10, c6Var);
        int w03 = h6.w0(h6.Mj, c6Var);
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
        fa0 fa0Var = this.f49855f;
        if (fa0Var != null) {
            canvas.save();
            ia0 ia0Var = this.d;
            canvas.translate(ia0Var.getLeft(), ia0Var.getTop());
            if (fa0Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        fg0 fg0Var = this.f49851a;
        float measuredHeight = (fg0Var.getMeasuredHeight() / 2.0f) + fg0Var.getTop();
        o oVar = this.f49852b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = h6.f20504a7;
        c6 c6Var = this.f49854e;
        setBackgroundColor(h6.w0(i11, c6Var));
        this.f49853c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        ia0 ia0Var = this.d;
        ia0Var.setText(formatString);
        ia0Var.setTextColor(h6.w0(h6.f20818r5, c6Var));
    }

    public void setPaused(boolean z10) {
        this.f49851a.setPaused(z10);
        this.f49852b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f49856n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fg0 fg0Var = this.f49851a;
        final float f10 = fg0Var.f48317b.f48288l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f49856n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(fg0Var.f48318b0);
        fg0Var.d();
        fg0Var.l();
        this.f49856n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f49851a.f48317b.f48288l = AndroidUtilities.lerp(f11, f12, floatValue);
                sg.g gVar = rVar.f49851a.f48317b;
                float f14 = gVar.f48283f;
                float f15 = f13 * 360.0f;
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                gVar.f48283f = (f15 * i10) + f14;
                rVar.f49851a.f48317b.b();
                rVar.a(rVar.f49851a.f48317b.f48288l);
            }
        });
        this.f49856n.addListener(new q(this, fArr, f10, f7, z10));
        this.f49856n.setDuration(680L);
        this.f49856n.setInterpolator(js.h);
        this.f49856n.start();
    }
}
