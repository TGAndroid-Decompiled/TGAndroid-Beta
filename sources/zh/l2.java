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
import org.telegram.ui.Components.x9;
public final class l2 extends FrameLayout {
    public final x9 f52184a;
    public final s2 f52185b;
    public final org.telegram.ui.Components.q6 f52186c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern f52187e;
    public float f52188f;

    public l2(Context context) {
        super(context);
        x9 x9Var = new x9(context);
        this.f52184a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(x9Var, w7.x5.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        s2 s2Var = new s2(context);
        this.f52185b = s2Var;
        s2Var.f52561e = AndroidUtilities.dp(18.0f);
        s2Var.f52558a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(s2Var, w7.x5.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.f52186c = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(12.0f));
        q6Var.setTextColor(-1);
        addView(q6Var, w7.x5.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        w7.z5.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.f52187e = null;
        x9 x9Var = this.f52184a;
        x9Var.setScaleX(1.0f);
        x9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            x9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            x9Var.setImageDrawable(shapeDrawable);
            return;
        }
        x9Var.setAlpha(1.0f);
        x9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.f52187e = stargiftattributepattern;
        x9 x9Var = this.f52184a;
        if (stargiftattributepattern == null) {
            x9Var.setAlpha(0.25f);
            x9Var.setScaleX(0.75f);
            x9Var.setScaleY(0.75f);
            x9Var.setTranslationY(0.0f);
            x9Var.setAnimatedEmojiDrawable(null);
            x9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        x9Var.setAlpha(1.0f);
        x9Var.setScaleX(0.95f);
        x9Var.setScaleY(0.95f);
        x9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        x9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f52188f = f7;
        s2 s2Var = this.f52185b;
        s2Var.d = f7;
        if (!z10) {
            s2Var.f52559b.d(f7, true);
        }
        s2Var.invalidate();
        this.f52186c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
