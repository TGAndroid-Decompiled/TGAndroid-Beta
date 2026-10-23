package wg;

import ai.ae;
import ai.kc;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.y90;
import sg.w1;
import w7.z5;
public final class r extends FrameLayout {
    public final ae f49440a;
    public final o f49441b;
    public final TextView f49442c;
    public final y90 d;
    public final g6 e;
    public final v90 f49443f;
    public final Paint[] h;
    public ValueAnimator f49444n;

    public r(Context context, g6 g6Var) {
        super(context);
        this.e = g6Var;
        LinearLayout e = sl.e(context, 1);
        ae aeVar = new ae(context, 1, 0, 4);
        this.f49440a = aeVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = k6.Mj;
        canvas.drawColor(i0.a.f(0.5f, k6.w0(i10, g6Var), k6.w0(k6.f21254h5, g6Var)));
        aeVar.setBackgroundBitmap(createBitmap);
        tg.g gVar = aeVar.f47547b;
        gVar.f47531z = i10;
        gVar.A = k6.Lj;
        gVar.b();
        e.addView(aeVar, z5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f49441b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        w1 w1Var = oVar.f46939a;
        w1Var.f46923q = false;
        w1Var.K = false;
        w1Var.L = true;
        w1Var.H = true;
        w1Var.f46918l = new kc(this, 5);
        w1Var.c();
        aeVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f49442c = textView;
        sl.k(22.0f, 1, textView);
        int i11 = k6.G6;
        r6.W(textView, i11, g6Var);
        textView.setGravity(1);
        e.addView(textView, z5.t(-2, -2, 1, 24, -8, 24, 0));
        v90 v90Var = new v90(this);
        this.f49443f = v90Var;
        y90 y90Var = new y90(context, v90Var, g6Var);
        this.d = y90Var;
        y90Var.setTextSize(1, 15.0f);
        y90Var.setGravity(17);
        r6.W(y90Var, i11, g6Var);
        y90Var.setMovementMethod(LinkMovementMethod.getInstance());
        r6.I(y90Var, k6.J6, g6Var);
        y90Var.setImportantForAccessibility(2);
        e.addView(y90Var, z5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, z5.e(-1, 234, 48));
        addView(e);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = k6.Lj;
        g6 g6Var = this.e;
        int w02 = k6.w0(i10, g6Var);
        int w03 = k6.w0(k6.Mj, g6Var);
        int f10 = i0.a.f(f7, w02, -371690);
        int f11 = i0.a.f(f7, w03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 < paintArr.length) {
                paintArr[i11] = new Paint(1);
                paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.a.f(i11 / (paintArr.length - 1), f10, f11), PorterDuff.Mode.SRC_IN));
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v90 v90Var = this.f49443f;
        if (v90Var != null) {
            canvas.save();
            y90 y90Var = this.d;
            canvas.translate(y90Var.getLeft(), y90Var.getTop());
            if (v90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ae aeVar = this.f49440a;
        float measuredHeight = (aeVar.getMeasuredHeight() / 2.0f) + aeVar.getTop();
        o oVar = this.f49441b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = k6.f21125a7;
        g6 g6Var = this.e;
        r6.i(i11, this, g6Var);
        this.f49442c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        y90 y90Var = this.d;
        y90Var.setText(formatString);
        r6.W(y90Var, k6.f21439r5, g6Var);
    }

    public void setPaused(boolean z10) {
        this.f49440a.setPaused(z10);
        this.f49441b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f49444n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ae aeVar = this.f49440a;
        final float f10 = aeVar.f47547b.f47518l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f49444n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(aeVar.f47552e0);
        aeVar.d();
        aeVar.l();
        this.f49444n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f49440a.f47547b.f47518l = AndroidUtilities.lerp(f11, f12, floatValue);
                tg.g gVar = rVar.f49440a.f47547b;
                float f14 = gVar.f47513f;
                float f15 = f13 * 360.0f;
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                gVar.f47513f = (f15 * i10) + f14;
                rVar.f49440a.f47547b.b();
                rVar.a(rVar.f49440a.f47547b.f47518l);
            }
        });
        this.f49444n.addListener(new q(this, fArr, f10, f7, z10));
        this.f49444n.setDuration(680L);
        this.f49444n.setInterpolator(bs.h);
        this.f49444n.start();
    }
}
