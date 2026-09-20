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
import org.telegram.ui.Components.v9;
public final class m2 extends FrameLayout {
    public final v9 f47737a;
    public final t2 f47738b;
    public final org.telegram.ui.Components.o6 f47739c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f47740f;

    public m2(Context context) {
        super(context);
        v9 v9Var = new v9(context);
        this.f47737a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(v9Var, w7.y5.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        t2 t2Var = new t2(context);
        this.f47738b = t2Var;
        t2Var.e = AndroidUtilities.dp(18.0f);
        t2Var.f48062a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(t2Var, w7.y5.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f47739c = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var.setTextColor(-1);
        addView(o6Var, w7.y5.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        w7.b6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        v9 v9Var = this.f47737a;
        v9Var.setScaleX(1.0f);
        v9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            v9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            v9Var.setImageDrawable(shapeDrawable);
            return;
        }
        v9Var.setAlpha(1.0f);
        v9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        v9 v9Var = this.f47737a;
        if (stargiftattributepattern == null) {
            v9Var.setAlpha(0.25f);
            v9Var.setScaleX(0.75f);
            v9Var.setScaleY(0.75f);
            v9Var.setTranslationY(0.0f);
            v9Var.setAnimatedEmojiDrawable(null);
            v9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        v9Var.setAlpha(1.0f);
        v9Var.setScaleX(0.95f);
        v9Var.setScaleY(0.95f);
        v9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        v9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f47740f = f7;
        t2 t2Var = this.f47738b;
        t2Var.d = f7;
        if (!z10) {
            t2Var.f48063b.d(f7, true);
        }
        t2Var.invalidate();
        this.f47739c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
