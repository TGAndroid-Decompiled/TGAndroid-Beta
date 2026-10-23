package wg;

import ai.jc;
import ai.zd;
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
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.x90;
import sg.w1;
import w7.z5;
public final class r extends FrameLayout {
    public final zd f48998a;
    public final o f48999b;
    public final TextView f49000c;
    public final x90 d;
    public final d6 e;
    public final u90 f49001f;
    public final Paint[] h;
    public ValueAnimator f49002n;

    public r(Context context, d6 d6Var) {
        super(context);
        this.e = d6Var;
        LinearLayout e = nk.e(context, 1);
        zd zdVar = new zd(context, 1, 0, 4);
        this.f48998a = zdVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = h6.Mj;
        canvas.drawColor(i0.a.f(0.5f, h6.w0(i10, d6Var), h6.w0(h6.f21065h5, d6Var)));
        zdVar.setBackgroundBitmap(createBitmap);
        tg.g gVar = zdVar.f47112b;
        gVar.f47096z = i10;
        gVar.A = h6.Lj;
        gVar.b();
        e.addView(zdVar, z5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f48999b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        w1 w1Var = oVar.f46508a;
        w1Var.f46492q = false;
        w1Var.K = false;
        w1Var.L = true;
        w1Var.H = true;
        w1Var.f46487l = new jc(this, 5);
        w1Var.c();
        zdVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f49000c = textView;
        nk.k(22.0f, 1, textView);
        int i11 = h6.G6;
        c1.q(i11, d6Var, textView, 1);
        e.addView(textView, z5.t(-2, -2, 1, 24, -8, 24, 0));
        u90 u90Var = new u90(this);
        this.f49001f = u90Var;
        x90 x90Var = new x90(context, u90Var, d6Var);
        this.d = x90Var;
        x90Var.setTextSize(1, 15.0f);
        x90Var.setGravity(17);
        x90Var.setTextColor(h6.w0(i11, d6Var));
        x90Var.setMovementMethod(LinkMovementMethod.getInstance());
        x90Var.setLinkTextColor(h6.w0(h6.J6, d6Var));
        x90Var.setImportantForAccessibility(2);
        e.addView(x90Var, z5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, z5.e(-1, 234, 48));
        addView(e);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = h6.Lj;
        d6 d6Var = this.e;
        int w02 = h6.w0(i10, d6Var);
        int w03 = h6.w0(h6.Mj, d6Var);
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
        u90 u90Var = this.f49001f;
        if (u90Var != null) {
            canvas.save();
            x90 x90Var = this.d;
            canvas.translate(x90Var.getLeft(), x90Var.getTop());
            if (u90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        zd zdVar = this.f48998a;
        float measuredHeight = (zdVar.getMeasuredHeight() / 2.0f) + zdVar.getTop();
        o oVar = this.f48999b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = h6.f20936a7;
        d6 d6Var = this.e;
        setBackgroundColor(h6.w0(i11, d6Var));
        this.f49000c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        x90 x90Var = this.d;
        x90Var.setText(formatString);
        x90Var.setTextColor(h6.w0(h6.f21250r5, d6Var));
    }

    public void setPaused(boolean z10) {
        this.f48998a.setPaused(z10);
        this.f48999b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f49002n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        zd zdVar = this.f48998a;
        final float f10 = zdVar.f47112b.f47083l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f49002n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(zdVar.f47117e0);
        zdVar.d();
        zdVar.l();
        this.f49002n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f48998a.f47112b.f47083l = AndroidUtilities.lerp(f11, f12, floatValue);
                tg.g gVar = rVar.f48998a.f47112b;
                float f14 = gVar.f47078f;
                float f15 = f13 * 360.0f;
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                gVar.f47078f = (f15 * i10) + f14;
                rVar.f48998a.f47112b.b();
                rVar.a(rVar.f48998a.f47112b.f47083l);
            }
        });
        this.f49002n.addListener(new q(this, fArr, f10, f7, z10));
        this.f49002n.setDuration(680L);
        this.f49002n.setInterpolator(bs.h);
        this.f49002n.start();
    }
}
