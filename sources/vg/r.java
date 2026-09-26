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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.sr;
import org.telegram.ui.yf0;
import rg.v1;
import w7.y5;
public final class r extends FrameLayout {
    public final yf0 f44625a;
    public final o f44626b;
    public final TextView f44627c;
    public final o90 d;
    public final d6 e;
    public final l90 f44628f;
    public final Paint[] h;
    public ValueAnimator f44629n;

    public r(Context context, d6 d6Var) {
        super(context);
        this.e = d6Var;
        LinearLayout f7 = ok.f(context, 1);
        yf0 yf0Var = new yf0(context, 1, 0, 3);
        this.f44625a = yf0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = h6.Mj;
        canvas.drawColor(i0.a.d(0.5f, h6.v0(i10, d6Var), h6.v0(h6.f19129h5, d6Var)));
        yf0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = yf0Var.f43224b;
        aVar.f43212w = i10;
        aVar.f43213x = h6.Lj;
        aVar.b();
        f7.addView(yf0Var, y5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f44626b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        v1 v1Var = oVar.f42814a;
        v1Var.f42798q = false;
        v1Var.K = false;
        v1Var.L = true;
        v1Var.H = true;
        v1Var.f42793l = new x7(this, 4);
        v1Var.c();
        yf0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f44627c = textView;
        ok.k(22.0f, 1, textView);
        int i11 = h6.G6;
        textView.setTextColor(h6.v0(i11, d6Var));
        textView.setGravity(1);
        f7.addView(textView, y5.t(-2, -2, 1, 24, -8, 24, 0));
        l90 l90Var = new l90(this);
        this.f44628f = l90Var;
        o90 o90Var = new o90(context, l90Var, d6Var);
        this.d = o90Var;
        o90Var.setTextSize(1, 15.0f);
        o90Var.setGravity(17);
        o90Var.setTextColor(h6.v0(i11, d6Var));
        o90Var.setMovementMethod(LinkMovementMethod.getInstance());
        o90Var.setLinkTextColor(h6.v0(h6.J6, d6Var));
        o90Var.setImportantForAccessibility(2);
        f7.addView(o90Var, y5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, y5.e(-1, 234, 48));
        addView(f7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = h6.Lj;
        d6 d6Var = this.e;
        int v02 = h6.v0(i10, d6Var);
        int v03 = h6.v0(h6.Mj, d6Var);
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
        l90 l90Var = this.f44628f;
        if (l90Var != null) {
            canvas.save();
            o90 o90Var = this.d;
            canvas.translate(o90Var.getLeft(), o90Var.getTop());
            if (l90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        yf0 yf0Var = this.f44625a;
        float measuredHeight = (yf0Var.getMeasuredHeight() / 2.0f) + yf0Var.getTop();
        o oVar = this.f44626b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = h6.f19003a7;
        d6 d6Var = this.e;
        setBackgroundColor(h6.v0(i11, d6Var));
        this.f44627c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        o90 o90Var = this.d;
        o90Var.setText(formatString);
        o90Var.setTextColor(h6.v0(h6.f19315r5, d6Var));
    }

    public void setPaused(boolean z10) {
        this.f44625a.setPaused(z10);
        this.f44626b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f44629n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yf0 yf0Var = this.f44625a;
        final float f10 = yf0Var.f43224b.f43199i;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f44629n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(yf0Var.U);
        yf0Var.d();
        yf0Var.i();
        this.f44629n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                yf0 yf0Var2 = rVar.f44625a;
                yf0Var2.f43224b.f43199i = AndroidUtilities.lerp(f10, f7, floatValue);
                sg.a aVar = yf0Var2.f43224b;
                float f12 = aVar.f43197f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f43197f = (f13 * i10) + f12;
                aVar.b();
                rVar.a(yf0Var2.f43224b.f43199i);
            }
        });
        this.f44629n.addListener(new q(this, fArr, f10, f7, z10));
        this.f44629n.setDuration(680L);
        this.f44629n.setInterpolator(sr.h);
        this.f44629n.start();
    }
}
