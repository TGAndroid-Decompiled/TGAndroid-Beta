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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.fg0;
import rg.u1;
import w7.y5;
public final class r extends FrameLayout {
    public final fg0 f44598a;
    public final o f44599b;
    public final TextView f44600c;
    public final l90 d;
    public final e6 e;
    public final i90 f44601f;
    public final Paint[] h;
    public ValueAnimator f44602n;

    public r(Context context, e6 e6Var) {
        super(context);
        this.e = e6Var;
        LinearLayout e = wh.e(context, 1);
        fg0 fg0Var = new fg0(context, 1, 0, 3);
        this.f44598a = fg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, j6.v0(i10, e6Var), j6.v0(j6.f19133h5, e6Var)));
        fg0Var.setBackgroundBitmap(createBitmap);
        sg.a aVar = fg0Var.f43195b;
        aVar.f43183w = i10;
        aVar.f43184x = j6.Lj;
        aVar.b();
        e.addView(fg0Var, y5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f44599b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        u1 u1Var = oVar.f42776a;
        u1Var.f42763q = false;
        u1Var.K = false;
        u1Var.L = true;
        u1Var.H = true;
        u1Var.f42758l = new a8(this, 4);
        u1Var.c();
        fg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f44600c = textView;
        wh.j(22.0f, 1, textView);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, e6Var));
        textView.setGravity(1);
        e.addView(textView, y5.t(-2, -2, 1, 24, -8, 24, 0));
        i90 i90Var = new i90(this);
        this.f44601f = i90Var;
        l90 l90Var = new l90(context, i90Var, e6Var);
        this.d = l90Var;
        l90Var.setTextSize(1, 15.0f);
        l90Var.setGravity(17);
        l90Var.setTextColor(j6.v0(i11, e6Var));
        l90Var.setMovementMethod(LinkMovementMethod.getInstance());
        l90Var.setLinkTextColor(j6.v0(j6.J6, e6Var));
        l90Var.setImportantForAccessibility(2);
        e.addView(l90Var, y5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, y5.e(-1, 234, 48));
        addView(e);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = j6.Lj;
        e6 e6Var = this.e;
        int v02 = j6.v0(i10, e6Var);
        int v03 = j6.v0(j6.Mj, e6Var);
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
        i90 i90Var = this.f44601f;
        if (i90Var != null) {
            canvas.save();
            l90 l90Var = this.d;
            canvas.translate(l90Var.getLeft(), l90Var.getTop());
            if (i90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        fg0 fg0Var = this.f44598a;
        float measuredHeight = (fg0Var.getMeasuredHeight() / 2.0f) + fg0Var.getTop();
        o oVar = this.f44599b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = j6.f19006a7;
        e6 e6Var = this.e;
        setBackgroundColor(j6.v0(i11, e6Var));
        this.f44600c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        l90 l90Var = this.d;
        l90Var.setText(formatString);
        l90Var.setTextColor(j6.v0(j6.f19318r5, e6Var));
    }

    public void setPaused(boolean z10) {
        this.f44598a.setPaused(z10);
        this.f44599b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f44602n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fg0 fg0Var = this.f44598a;
        final float f10 = fg0Var.f43195b.f43170i;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f44602n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(fg0Var.U);
        fg0Var.d();
        fg0Var.i();
        this.f44602n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                r rVar = r.this;
                fg0 fg0Var2 = rVar.f44598a;
                fg0Var2.f43195b.f43170i = AndroidUtilities.lerp(f10, f7, floatValue);
                sg.a aVar = fg0Var2.f43195b;
                float f12 = aVar.f43168f;
                float f13 = f11 * 360.0f;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                aVar.f43168f = (f13 * i10) + f12;
                aVar.b();
                rVar.a(fg0Var2.f43195b.f43170i);
            }
        });
        this.f44602n.addListener(new q(this, fArr, f10, f7, z10));
        this.f44602n.setDuration(680L);
        this.f44602n.setInterpolator(qr.h);
        this.f44602n.start();
    }
}
