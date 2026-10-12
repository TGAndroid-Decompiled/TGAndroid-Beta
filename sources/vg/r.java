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
import org.telegram.ui.eg0;
import rg.v1;
import w7.w5;
public final class r extends FrameLayout {
    public final eg0 f49843a;
    public final o f49844b;
    public final TextView f49845c;
    public final ia0 d;
    public final c6 f49846e;
    public final fa0 f49847f;
    public final Paint[] h;
    public ValueAnimator f49848n;

    public r(Context context, c6 c6Var) {
        super(context);
        this.f49846e = c6Var;
        LinearLayout e7 = am.e(context, 1);
        eg0 eg0Var = new eg0(context, 1, 0, 3);
        this.f49843a = eg0Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = h6.Mj;
        canvas.drawColor(i0.a.d(0.5f, h6.w0(i10, c6Var), h6.w0(h6.f20630h5, c6Var)));
        eg0Var.setBackgroundBitmap(createBitmap);
        sg.g gVar = eg0Var.f48309b;
        gVar.f48293z = i10;
        gVar.A = h6.Lj;
        gVar.b();
        e7.addView(eg0Var, w5.q(160, 160, 1));
        o oVar = new o(this, context);
        this.f49844b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        v1 v1Var = oVar.f47717a;
        v1Var.f47704q = false;
        v1Var.K = false;
        v1Var.L = true;
        v1Var.H = true;
        v1Var.f47699l = new x7(this, 4);
        v1Var.c();
        eg0Var.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f49845c = textView;
        am.k(22.0f, 1, textView);
        int i11 = h6.G6;
        textView.setTextColor(h6.w0(i11, c6Var));
        textView.setGravity(1);
        e7.addView(textView, w5.t(-2, -2, 1, 24, -8, 24, 0));
        fa0 fa0Var = new fa0(this);
        this.f49847f = fa0Var;
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
        c6 c6Var = this.f49846e;
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
        fa0 fa0Var = this.f49847f;
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
        eg0 eg0Var = this.f49843a;
        float measuredHeight = (eg0Var.getMeasuredHeight() / 2.0f) + eg0Var.getTop();
        o oVar = this.f49844b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = h6.f20503a7;
        c6 c6Var = this.f49846e;
        setBackgroundColor(h6.w0(i11, c6Var));
        this.f49845c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        ia0 ia0Var = this.d;
        ia0Var.setText(formatString);
        ia0Var.setTextColor(h6.w0(h6.f20817r5, c6Var));
    }

    public void setPaused(boolean z10) {
        this.f49843a.setPaused(z10);
        this.f49844b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f49848n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        eg0 eg0Var = this.f49843a;
        final float f10 = eg0Var.f48309b.f48280l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f49848n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(eg0Var.f48310b0);
        eg0Var.d();
        eg0Var.l();
        this.f49848n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f49843a.f48309b.f48280l = AndroidUtilities.lerp(f11, f12, floatValue);
                sg.g gVar = rVar.f49843a.f48309b;
                float f14 = gVar.f48275f;
                float f15 = f13 * 360.0f;
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                gVar.f48275f = (f15 * i10) + f14;
                rVar.f49843a.f48309b.b();
                rVar.a(rVar.f49843a.f48309b.f48280l);
            }
        });
        this.f49848n.addListener(new q(this, fArr, f10, f7, z10));
        this.f49848n.setDuration(680L);
        this.f49848n.setInterpolator(js.h);
        this.f49848n.start();
    }
}
