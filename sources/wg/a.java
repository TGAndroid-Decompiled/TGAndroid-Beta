package wg;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import xd.c;
public final class a extends FrameLayout implements xd.b {
    public final xd.a f49605a;
    public final xd.a f49606b;
    public ImageView f49607c;
    public ImageView d;
    public tp f49608e;
    public g6 f49609f;
    public float h;
    public qg.b f49610n;

    public a(Context context) {
        super(context);
        pr prVar = pr.h;
        this.f49605a = new xd.a(0, this, prVar, 320L, false);
        this.f49606b = new xd.a(1, this, prVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, og.a aVar, g6 g6Var, rg.a aVar2) {
        int v02 = k6.v0(k6.Wk, g6Var);
        a aVar3 = new a(context);
        aVar3.f49609f = g6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = k6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(k6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    public static a d(Context context, og.a aVar, rg.a aVar2, g6 g6Var, int i10, int i11) {
        int v02 = k6.v0(k6.Wk, g6Var);
        a aVar3 = new a(context);
        aVar3.f49609f = g6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i10, i11);
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = k6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(k6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    @Override
    public final void L(int i10, float f10, float f11, c cVar) {
        if (i10 == 0) {
            a();
            b();
        }
        if (i10 == 1) {
            a();
            b();
        }
    }

    public final void a() {
        int i10;
        float f10 = 1.0f - this.f49605a.f50504e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f49606b.f50504e);
        ImageView imageView = this.f49607c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f49607c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.f49607c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10) * this.h);
            ImageView imageView2 = this.f49607c;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
        }
    }

    public final void b() {
        int i10;
        float f10 = this.f49605a.f50504e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f49606b.f50504e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.d.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.d.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.d.getVisibility() != i10) {
                this.d.setVisibility(i10);
                this.f49608e.f31429c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f49610n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.f49606b.a(z4, z10);
    }

    public final void f(int i10, int i11) {
        if (this.f49607c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f49607c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f49607c, c6.e(i11, i11, 17));
            a();
        }
        this.f49607c.setImageResource(i10);
    }

    public final void g() {
        qg.b bVar = this.f49610n;
        if (bVar != null) {
            bVar.u();
            invalidate();
        }
        int i10 = k6.Wk;
        int v02 = k6.v0(i10, this.f49609f);
        setIconColor(k6.v0(i10, this.f49609f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = k6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(k6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f49610n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(qg.b bVar) {
        this.f49610n = bVar;
        bVar.o(AndroidUtilities.dp(6.0f));
        this.f49610n.p(AndroidUtilities.dp(22.0f));
    }

    @Override
    public void setEnabled(boolean z4) {
        e(z4, false);
    }

    public void setIcon(int i10) {
        f(i10, 48);
    }

    public void setIconColor(int i10) {
        BlendMode blendMode;
        ImageView imageView = this.f49607c;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i10, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.f49607c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
