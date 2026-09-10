package ug;

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
import bi.c9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eg0;
import qg.w1;
import w7.a6;
public final class r extends FrameLayout {
    public final eg0 f42713a;
    public final o f42714b;
    public final TextView f42715c;
    public final m90 d;
    public final f6 e;
    public final j90 f42716f;
    public final Paint[] h;
    public ValueAnimator f42717n;

    public r(Context context, f6 f6Var) {
        super(context);
        this.e = f6Var;
        LinearLayout f7 = em.f(context, 1);
        eg0 eg0Var = new eg0(context, 1, 0, 3);
        this.f42713a = eg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, j6.v0(i10, f6Var), j6.v0(j6.f17998h5, f6Var)));
        eg0Var.setBackgroundBitmap(createBitmap);
        rg.a aVar = eg0Var.f41485b;
        aVar.f41471w = i10;
        aVar.f41472x = j6.Lj;
        aVar.b();
        f7.addView(eg0Var, a6.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f42714b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        w1 w1Var = oVar.f40983a;
        w1Var.f40968q = false;
        w1Var.K = false;
        w1Var.L = true;
        w1Var.H = true;
        w1Var.f40963l = new c9(this, 4);
        w1Var.c();
        eg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f42715c = textView;
        em.j(22.0f, 1, textView);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(1);
        f7.addView(textView, a6.t(-2, -2, 1, 24, -8, 24, 0));
        j90 j90Var = new j90(this);
        this.f42716f = j90Var;
        m90 m90Var = new m90(context, j90Var, f6Var);
        this.d = m90Var;
        m90Var.setTextSize(1, 15.0f);
        m90Var.setGravity(17);
        m90Var.setTextColor(j6.v0(i11, f6Var));
        m90Var.setMovementMethod(LinkMovementMethod.getInstance());
        m90Var.setLinkTextColor(j6.v0(j6.J6, f6Var));
        m90Var.setImportantForAccessibility(2);
        f7.addView(m90Var, a6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, a6.e(-1, 234, 48));
        addView(f7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = j6.Lj;
        f6 f6Var = this.e;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.Mj, f6Var);
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
        j90 j90Var = this.f42716f;
        if (j90Var != null) {
            canvas.save();
            m90 m90Var = this.d;
            canvas.translate(m90Var.getLeft(), m90Var.getTop());
            if (j90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        eg0 eg0Var = this.f42713a;
        float measuredHeight = (eg0Var.getMeasuredHeight() / 2.0f) + eg0Var.getTop();
        o oVar = this.f42714b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = j6.f17872a7;
        f6 f6Var = this.e;
        setBackgroundColor(j6.v0(i11, f6Var));
        this.f42715c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        m90 m90Var = this.d;
        m90Var.setText(formatString);
        m90Var.setTextColor(j6.v0(j6.f18179r5, f6Var));
    }

    public void setPaused(boolean z10) {
        this.f42713a.setPaused(z10);
        this.f42714b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f42717n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        eg0 eg0Var = this.f42713a;
        final float f10 = eg0Var.f41485b.f41458i;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f42717n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(eg0Var.U);
        eg0Var.d();
        eg0Var.i();
        this.f42717n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                eg0 eg0Var2 = rVar.f42713a;
                eg0Var2.f41485b.f41458i = AndroidUtilities.lerp(f10, f7, floatValue);
                rg.a aVar = eg0Var2.f41485b;
                float f12 = aVar.f41456f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f41456f = (f13 * i10) + f12;
                aVar.b();
                rVar.a(eg0Var2.f41485b.f41458i);
            }
        });
        this.f42717n.addListener(new q(this, fArr, f10, f7, z10));
        this.f42717n.setDuration(680L);
        this.f42717n.setInterpolator(wr.h);
        this.f42717n.start();
    }
}
