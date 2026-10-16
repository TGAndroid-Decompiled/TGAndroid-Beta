package zh;

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
import org.telegram.ui.Components.z9;
public final class h2 extends FrameLayout {
    public final z9 f50609a;
    public final n2 f50610b;
    public final org.telegram.ui.Components.s6 f50611c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f50612f;

    public h2(Context context) {
        super(context);
        z9 z9Var = new z9(context);
        this.f50609a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(z9Var, w7.z5.a(26.0f, 0.0f, 11.33f, 0.0f, 0.0f, 26, 49));
        n2 n2Var = new n2(context);
        this.f50610b = n2Var;
        n2Var.e = AndroidUtilities.dp(18.0f);
        n2Var.f50858a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(n2Var, w7.z5.a(48.0f, 0.0f, 0.66f, 0.0f, 0.0f, 48, 49));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f50611c = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(17);
        s6Var.setTextSize(AndroidUtilities.dp(12.0f));
        s6Var.setTextColor(-1);
        addView(s6Var, w7.z5.a(14.0f, 0.0f, 39.0f, 0.0f, 0.0f, -1, 48));
        c(0.0f, false);
        w7.b6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        z9 z9Var = this.f50609a;
        z9Var.setScaleX(1.0f);
        z9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            z9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            z9Var.setImageDrawable(shapeDrawable);
            return;
        }
        z9Var.setAlpha(1.0f);
        z9Var.setImageDrawable(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.m1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        z9 z9Var = this.f50609a;
        if (stargiftattributepattern == null) {
            z9Var.setAlpha(0.25f);
            z9Var.setScaleX(0.75f);
            z9Var.setScaleY(0.75f);
            z9Var.setTranslationY(0.0f);
            z9Var.setAnimatedEmojiDrawable(null);
            z9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        z9Var.setAlpha(1.0f);
        z9Var.setScaleX(0.95f);
        z9Var.setScaleY(0.95f);
        z9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        z9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f50612f = f7;
        n2 n2Var = this.f50610b;
        n2Var.d = f7;
        if (!z10) {
            n2Var.f50859b.d(f7, true);
        }
        n2Var.invalidate();
        this.f50611c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
