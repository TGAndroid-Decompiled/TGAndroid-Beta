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
import org.telegram.ui.Components.u9;
public final class o2 extends FrameLayout {
    public final u9 f47585a;
    public final u2 f47586b;
    public final org.telegram.ui.Components.n6 f47587c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f47588f;

    public o2(Context context) {
        super(context);
        u9 u9Var = new u9(context);
        this.f47585a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(13.0f));
        addView(u9Var, w7.x5.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        u2 u2Var = new u2(context);
        this.f47586b = u2Var;
        u2Var.e = AndroidUtilities.dp(18.0f);
        u2Var.f47874a.setStrokeWidth(AndroidUtilities.dp(3.0f));
        addView(u2Var, w7.x5.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f47587c = n6Var;
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setGravity(17);
        n6Var.setTextSize(AndroidUtilities.dp(12.0f));
        n6Var.setTextColor(-1);
        addView(n6Var, w7.x5.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(0.0f, false);
        w7.z5.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        u9 u9Var = this.f47585a;
        u9Var.setScaleX(1.0f);
        u9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop != null) {
            u9Var.setAlpha(1.0f);
            OvalShape ovalShape = new OvalShape();
            ovalShape.resize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.setIntrinsicWidth(AndroidUtilities.dp(26.0f));
            shapeDrawable.setIntrinsicHeight(AndroidUtilities.dp(26.0f));
            shapeDrawable.getPaint().setShader(new RadialGradient(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            u9Var.setImageDrawable(shapeDrawable);
            return;
        }
        u9Var.setAlpha(1.0f);
        u9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, -1)));
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        u9 u9Var = this.f47585a;
        if (stargiftattributepattern == null) {
            u9Var.setAlpha(0.25f);
            u9Var.setScaleX(0.75f);
            u9Var.setScaleY(0.75f);
            u9Var.setTranslationY(0.0f);
            u9Var.setAnimatedEmojiDrawable(null);
            u9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        u9Var.setAlpha(1.0f);
        u9Var.setScaleX(0.95f);
        u9Var.setScaleY(0.95f);
        u9Var.setTranslationY(AndroidUtilities.dp(2.0f));
        org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(UserConfig.selectedAccount, 9, stargiftattributepattern.document);
        m10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        u9Var.setAnimatedEmojiDrawable(m10);
    }

    public final void c(float f7, boolean z10) {
        this.f47588f = f7;
        u2 u2Var = this.f47586b;
        u2Var.d = f7;
        if (!z10) {
            u2Var.f47875b.d(f7, true);
        }
        u2Var.invalidate();
        this.f47587c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
