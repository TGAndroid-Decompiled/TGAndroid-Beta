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
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.z80;
import org.telegram.ui.gg0;
import rg.u1;
import w7.x5;
public final class r extends FrameLayout {
    public final gg0 f44373a;
    public final o f44374b;
    public final TextView f44375c;
    public final c90 d;
    public final f6 e;
    public final z80 f44376f;
    public final Paint[] h;
    public ValueAnimator f44377n;

    public r(Context context, f6 f6Var) {
        super(context);
        this.e = f6Var;
        LinearLayout f7 = wl.f(context, 1);
        gg0 gg0Var = new gg0(context, 1, 0, 3);
        this.f44373a = gg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, j6.v0(i10, f6Var), j6.v0(j6.f18934h5, f6Var)));
        gg0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = gg0Var.f42964b;
        aVar.f42952w = i10;
        aVar.f42953x = j6.Lj;
        aVar.b();
        f7.addView(gg0Var, x5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f44374b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        u1 u1Var = oVar.f42549a;
        u1Var.f42536q = false;
        u1Var.K = false;
        u1Var.L = true;
        u1Var.H = true;
        u1Var.f42531l = new a8(this, 4);
        u1Var.c();
        gg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f44375c = textView;
        wl.j(22.0f, 1, textView);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(1);
        f7.addView(textView, x5.t(-2, -2, 1, 24, -8, 24, 0));
        z80 z80Var = new z80(this);
        this.f44376f = z80Var;
        c90 c90Var = new c90(context, z80Var, f6Var);
        this.d = c90Var;
        c90Var.setTextSize(1, 15.0f);
        c90Var.setGravity(17);
        c90Var.setTextColor(j6.v0(i11, f6Var));
        c90Var.setMovementMethod(LinkMovementMethod.getInstance());
        c90Var.setLinkTextColor(j6.v0(j6.J6, f6Var));
        c90Var.setImportantForAccessibility(2);
        f7.addView(c90Var, x5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, x5.e(-1, 234, 48));
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
        z80 z80Var = this.f44376f;
        if (z80Var != null) {
            canvas.save();
            c90 c90Var = this.d;
            canvas.translate(c90Var.getLeft(), c90Var.getTop());
            if (z80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        gg0 gg0Var = this.f44373a;
        float measuredHeight = (gg0Var.getMeasuredHeight() / 2.0f) + gg0Var.getTop();
        o oVar = this.f44374b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = j6.f18807a7;
        f6 f6Var = this.e;
        setBackgroundColor(j6.v0(i11, f6Var));
        this.f44375c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        c90 c90Var = this.d;
        c90Var.setText(formatString);
        c90Var.setTextColor(j6.v0(j6.f19118r5, f6Var));
    }

    public void setPaused(boolean z10) {
        this.f44373a.setPaused(z10);
        this.f44374b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f44377n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gg0 gg0Var = this.f44373a;
        final float f10 = gg0Var.f42964b.f42939i;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f44377n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(gg0Var.U);
        gg0Var.d();
        gg0Var.i();
        this.f44377n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                gg0 gg0Var2 = rVar.f44373a;
                gg0Var2.f42964b.f42939i = AndroidUtilities.lerp(f10, f7, floatValue);
                sg.a aVar = gg0Var2.f42964b;
                float f12 = aVar.f42937f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f42937f = (f13 * i10) + f12;
                aVar.b();
                rVar.a(gg0Var2.f42964b.f42939i);
            }
        });
        this.f44377n.addListener(new q(this, fArr, f10, f7, z10));
        this.f44377n.setDuration(680L);
        this.f44377n.setInterpolator(qr.h);
        this.f44377n.start();
    }
}
