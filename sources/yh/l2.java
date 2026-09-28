package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w9;
public final class l2 extends FrameLayout {
    public final w9 f47640a;
    public final s2 f47641b;
    public final org.telegram.ui.Components.p6 f47642c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f47643f;

    public l2(Context context) {
        super(context);
        w9 w9Var = new w9(context);
        this.f47640a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(w9Var, w7.y5.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        s2 s2Var = new s2(context);
        this.f47641b = s2Var;
        s2Var.e = AndroidUtilities.dp(18.0f);
        s2Var.f48005a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(s2Var, w7.y5.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
        this.f47642c = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setGravity(17);
        p6Var.setTextSize(AndroidUtilities.dp(12.0f));
        p6Var.setTextColor(-1);
        addView(p6Var, w7.y5.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        w7.a6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        w9 w9Var = this.f47640a;
        w9Var.setScaleX(1.0f);
        w9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            w9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            w9Var.setImageDrawable(shapeDrawable);
            return;
        }
        w9Var.setAlpha(1.0f);
        w9Var.setImageDrawable(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.h6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        w9 w9Var = this.f47640a;
        if (stargiftattributepattern == null) {
            w9Var.setAlpha(0.25f);
            w9Var.setScaleX(0.75f);
            w9Var.setScaleY(0.75f);
            w9Var.setTranslationY(0.0f);
            w9Var.setAnimatedEmojiDrawable(null);
            w9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        w9Var.setAlpha(1.0f);
        w9Var.setScaleX(0.95f);
        w9Var.setScaleY(0.95f);
        w9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        w9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f47643f = f7;
        s2 s2Var = this.f47641b;
        s2Var.d = f7;
        if (!z10) {
            s2Var.f48006b.d(f7, true);
        }
        s2Var.invalidate();
        this.f47642c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
