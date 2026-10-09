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
import org.telegram.ui.Components.y9;
public final class i2 extends FrameLayout {
    public final y9 f52666a;
    public final o2 f52667b;
    public final org.telegram.ui.Components.r6 f52668c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f52669e;
    public float f52670f;

    public i2(Context context) {
        super(context);
        y9 y9Var = new y9(context);
        this.f52666a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(y9Var, w7.x5.a(26.0f, 0.0f, 11.33f, 0.0f, 0.0f, 26, 49));
        o2 o2Var = new o2(context);
        this.f52667b = o2Var;
        o2Var.f52963e = AndroidUtilities.dp(18.0f);
        o2Var.f52960a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(o2Var, w7.x5.a(48.0f, 0.0f, 0.66f, 0.0f, 0.0f, 48, 49));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
        this.f52668c = r6Var;
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setGravity(17);
        r6Var.setTextSize(AndroidUtilities.dp(12.0f));
        r6Var.setTextColor(-1);
        addView(r6Var, w7.x5.a(14.0f, 0.0f, 39.0f, 0.0f, 0.0f, -1, 48));
        c(0.0f, false);
        w7.z5.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f52669e = null;
        y9 y9Var = this.f52666a;
        y9Var.setScaleX(1.0f);
        y9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            y9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            y9Var.setImageDrawable(shapeDrawable);
            return;
        }
        y9Var.setAlpha(1.0f);
        y9Var.setImageDrawable(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.i6.m1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f52669e = stargiftattributepattern;
        y9 y9Var = this.f52666a;
        if (stargiftattributepattern == null) {
            y9Var.setAlpha(0.25f);
            y9Var.setScaleX(0.75f);
            y9Var.setScaleY(0.75f);
            y9Var.setTranslationY(0.0f);
            y9Var.setAnimatedEmojiDrawable(null);
            y9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        y9Var.setAlpha(1.0f);
        y9Var.setScaleX(0.95f);
        y9Var.setScaleY(0.95f);
        y9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        y9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f52670f = f7;
        o2 o2Var = this.f52667b;
        o2Var.d = f7;
        if (!z10) {
            o2Var.f52961b.d(f7, true);
        }
        o2Var.invalidate();
        this.f52668c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
