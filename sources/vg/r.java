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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.gg0;
import rg.v1;
import w7.y5;
public final class r extends FrameLayout {
    public final gg0 f44642a;
    public final o f44643b;
    public final TextView f44644c;
    public final k90 d;
    public final f6 e;
    public final h90 f44645f;
    public final Paint[] h;
    public ValueAnimator f44646n;

    public r(Context context, f6 f6Var) {
        super(context);
        this.e = f6Var;
        LinearLayout f7 = rk.f(context, 1);
        gg0 gg0Var = new gg0(context, 1, 0, 3);
        this.f44642a = gg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, j6.v0(i10, f6Var), j6.v0(j6.f19165h5, f6Var)));
        gg0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = gg0Var.f43239b;
        aVar.f43227w = i10;
        aVar.f43228x = j6.Lj;
        aVar.b();
        f7.addView(gg0Var, y5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f44643b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        v1 v1Var = oVar.f42829a;
        v1Var.f42813q = false;
        v1Var.K = false;
        v1Var.L = true;
        v1Var.H = true;
        v1Var.f42808l = new a8(this, 4);
        v1Var.c();
        gg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f44644c = textView;
        rk.k(22.0f, 1, textView);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(1);
        f7.addView(textView, y5.t(-2, -2, 1, 24, -8, 24, 0));
        h90 h90Var = new h90(this);
        this.f44645f = h90Var;
        k90 k90Var = new k90(context, h90Var, f6Var);
        this.d = k90Var;
        k90Var.setTextSize(1, 15.0f);
        k90Var.setGravity(17);
        k90Var.setTextColor(j6.v0(i11, f6Var));
        k90Var.setMovementMethod(LinkMovementMethod.getInstance());
        k90Var.setLinkTextColor(j6.v0(j6.J6, f6Var));
        k90Var.setImportantForAccessibility(2);
        f7.addView(k90Var, y5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, y5.e(-1, 234, 48));
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
        h90 h90Var = this.f44645f;
        if (h90Var != null) {
            canvas.save();
            k90 k90Var = this.d;
            canvas.translate(k90Var.getLeft(), k90Var.getTop());
            if (h90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        gg0 gg0Var = this.f44642a;
        float measuredHeight = (gg0Var.getMeasuredHeight() / 2.0f) + gg0Var.getTop();
        o oVar = this.f44643b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = j6.f19038a7;
        f6 f6Var = this.e;
        setBackgroundColor(j6.v0(i11, f6Var));
        this.f44644c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        k90 k90Var = this.d;
        k90Var.setText(formatString);
        k90Var.setTextColor(j6.v0(j6.f19350r5, f6Var));
    }

    public void setPaused(boolean z10) {
        this.f44642a.setPaused(z10);
        this.f44643b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f44646n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gg0 gg0Var = this.f44642a;
        final float f10 = gg0Var.f43239b.f43214i;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f44646n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(gg0Var.U);
        gg0Var.d();
        gg0Var.i();
        this.f44646n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                gg0 gg0Var2 = rVar.f44642a;
                gg0Var2.f43239b.f43214i = AndroidUtilities.lerp(f10, f7, floatValue);
                sg.a aVar = gg0Var2.f43239b;
                float f12 = aVar.f43212f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f43212f = (f13 * i10) + f12;
                aVar.b();
                rVar.a(gg0Var2.f43239b.f43214i);
            }
        });
        this.f44646n.addListener(new q(this, fArr, f10, f7, z10));
        this.f44646n.setDuration(680L);
        this.f44646n.setInterpolator(qr.h);
        this.f44646n.start();
    }
}
