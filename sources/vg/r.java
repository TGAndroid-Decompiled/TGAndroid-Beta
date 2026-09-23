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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.zf0;
import rg.u1;
import w7.x5;
public final class r extends FrameLayout {
    public final zf0 f44295a;
    public final o f44296b;
    public final TextView f44297c;
    public final d90 d;
    public final d6 e;
    public final a90 f44298f;
    public final Paint[] h;
    public ValueAnimator f44299n;

    public r(Context context, d6 d6Var) {
        super(context);
        this.e = d6Var;
        LinearLayout f7 = ul.f(context, 1);
        zf0 zf0Var = new zf0(context, 1, 0, 3);
        this.f44295a = zf0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = h6.Mj;
        canvas.drawColor(i0.a.d(0.5f, h6.v0(i10, d6Var), h6.v0(h6.f18859h5, d6Var)));
        zf0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = zf0Var.f42889b;
        aVar.f42877w = i10;
        aVar.f42878x = h6.Lj;
        aVar.b();
        f7.addView(zf0Var, x5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f44296b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        u1 u1Var = oVar.f42473a;
        u1Var.f42460q = false;
        u1Var.K = false;
        u1Var.L = true;
        u1Var.H = true;
        u1Var.f42455l = new x7(this, 4);
        u1Var.c();
        zf0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f44297c = textView;
        ul.k(22.0f, 1, textView);
        int i11 = h6.G6;
        textView.setTextColor(h6.v0(i11, d6Var));
        textView.setGravity(1);
        f7.addView(textView, x5.t(-2, -2, 1, 24, -8, 24, 0));
        a90 a90Var = new a90(this);
        this.f44298f = a90Var;
        d90 d90Var = new d90(context, a90Var, d6Var);
        this.d = d90Var;
        d90Var.setTextSize(1, 15.0f);
        d90Var.setGravity(17);
        d90Var.setTextColor(h6.v0(i11, d6Var));
        d90Var.setMovementMethod(LinkMovementMethod.getInstance());
        d90Var.setLinkTextColor(h6.v0(h6.J6, d6Var));
        d90Var.setImportantForAccessibility(2);
        f7.addView(d90Var, x5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, x5.e(-1, 234, 48));
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
        a90 a90Var = this.f44298f;
        if (a90Var != null) {
            canvas.save();
            d90 d90Var = this.d;
            canvas.translate(d90Var.getLeft(), d90Var.getTop());
            if (a90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        zf0 zf0Var = this.f44295a;
        float measuredHeight = (zf0Var.getMeasuredHeight() / 2.0f) + zf0Var.getTop();
        o oVar = this.f44296b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = h6.f18733a7;
        d6 d6Var = this.e;
        setBackgroundColor(h6.v0(i11, d6Var));
        this.f44297c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        d90 d90Var = this.d;
        d90Var.setText(formatString);
        d90Var.setTextColor(h6.v0(h6.f19043r5, d6Var));
    }

    public void setPaused(boolean z10) {
        this.f44295a.setPaused(z10);
        this.f44296b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f44299n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        zf0 zf0Var = this.f44295a;
        final float f10 = zf0Var.f42889b.f42864i;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f44299n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(zf0Var.U);
        zf0Var.d();
        zf0Var.i();
        this.f44299n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                zf0 zf0Var2 = rVar.f44295a;
                zf0Var2.f42889b.f42864i = AndroidUtilities.lerp(f10, f7, floatValue);
                sg.a aVar = zf0Var2.f42889b;
                float f12 = aVar.f42862f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f42862f = (f13 * i10) + f12;
                aVar.b();
                rVar.a(zf0Var2.f42889b.f42864i);
            }
        });
        this.f44299n.addListener(new q(this, fArr, f10, f7, z10));
        this.f44299n.setDuration(680L);
        this.f44299n.setInterpolator(rr.h);
        this.f44299n.start();
    }
}
