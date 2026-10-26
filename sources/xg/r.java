package xg;

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
import bi.dc;
import bi.qd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z90;
import tg.w1;
public final class r extends FrameLayout {
    public final qd f51802a;
    public final o f51803b;
    public final TextView f51804c;
    public final z90 d;
    public final u6 e;
    public final w90 f51805f;
    public final Paint[] h;
    public ValueAnimator f51806n;

    public r(Context context, u6 u6Var) {
        super(context);
        this.e = u6Var;
        LinearLayout d = vh.d(context, 1);
        qd qdVar = new qd(context, 1, 0, 4);
        this.f51802a = qdVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = y6.Mj;
        canvas.drawColor(i0.a.f(0.5f, y6.w0(i10, u6Var), y6.w0(y6.f23427h5, u6Var)));
        qdVar.setBackgroundBitmap(createBitmap);
        ug.g gVar = qdVar.f49816b;
        gVar.f49800z = i10;
        gVar.A = y6.Lj;
        gVar.b();
        d.addView(qdVar, gb1.u(160, 160, 1));
        o oVar = new o(this, context);
        this.f51803b = oVar;
        this.h = new Paint[20];
        a(0.0f);
        w1 w1Var = oVar.f49119a;
        w1Var.f49103q = false;
        w1Var.K = false;
        w1Var.L = true;
        w1Var.H = true;
        w1Var.f49098l = new dc(this, 5);
        w1Var.c();
        qdVar.setStarParticlesView(oVar);
        TextView textView = new TextView(context);
        this.f51804c = textView;
        vh.j(22.0f, 1, textView);
        int i11 = y6.G6;
        f7.V(textView, i11, u6Var);
        textView.setGravity(1);
        d.addView(textView, gb1.x(-2, -2, 1, 24, -8, 24, 0));
        w90 w90Var = new w90(this);
        this.f51805f = w90Var;
        z90 z90Var = new z90(context, w90Var, u6Var);
        this.d = z90Var;
        z90Var.setTextSize(1, 15.0f);
        z90Var.setGravity(17);
        f7.V(z90Var, i11, u6Var);
        z90Var.setMovementMethod(LinkMovementMethod.getInstance());
        f7.H(z90Var, y6.J6, u6Var);
        z90Var.setImportantForAccessibility(2);
        d.addView(z90Var, gb1.h(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(oVar, gb1.i(-1, 234, 48));
        addView(d);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = y6.Lj;
        u6 u6Var = this.e;
        int w02 = y6.w0(i10, u6Var);
        int w03 = y6.w0(y6.Mj, u6Var);
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
        w90 w90Var = this.f51805f;
        if (w90Var != null) {
            canvas.save();
            z90 z90Var = this.d;
            canvas.translate(z90Var.getLeft(), z90Var.getTop());
            if (w90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qd qdVar = this.f51802a;
        float measuredHeight = (qdVar.getMeasuredHeight() / 2.0f) + qdVar.getTop();
        o oVar = this.f51803b;
        oVar.setTranslationY(measuredHeight - (oVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        int i10;
        setOutlineProvider(new ViewOutlineProvider());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i11 = y6.f23299a7;
        u6 u6Var = this.e;
        f7.i(i11, this, u6Var);
        this.f51804c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingGetMoreBoost2;
        } else {
            i10 = R.string.BoostingGetMoreBoostGroup;
        }
        String formatString = LocaleController.formatString(i10, new Object[0]);
        z90 z90Var = this.d;
        z90Var.setText(formatString);
        f7.V(z90Var, y6.f23614r5, u6Var);
    }

    public void setPaused(boolean z10) {
        this.f51802a.setPaused(z10);
        this.f51803b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        final float f7;
        ValueAnimator valueAnimator = this.f51806n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qd qdVar = this.f51802a;
        final float f10 = qdVar.f49816b.f49787l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f51806n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(qdVar.f49821e0);
        qdVar.d();
        qdVar.l();
        this.f51806n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                rVar.f51802a.f49816b.f49787l = AndroidUtilities.lerp(f11, f12, floatValue);
                ug.g gVar = rVar.f51802a.f49816b;
                float f14 = gVar.f49782f;
                float f15 = f13 * 360.0f;
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                gVar.f49782f = (f15 * i10) + f14;
                rVar.f51802a.f49816b.b();
                rVar.a(rVar.f51802a.f49816b.f49787l);
            }
        });
        this.f51806n.addListener(new q(this, fArr, f10, f7, z10));
        this.f51806n.setDuration(680L);
        this.f51806n.setInterpolator(ds.h);
        this.f51806n.start();
    }
}
