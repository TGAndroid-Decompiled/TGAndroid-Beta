package qg;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import kg.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
import td.c;
public final class a extends FrameLayout implements td.b {
    public final td.a f46258a;
    public final td.a f46259b;
    public ImageView f46260c;
    public ImageView d;
    public jp f46261e;
    public b6 f46262f;
    public float h;
    public d f46263n;

    public a(Context context) {
        super(context);
        gr grVar = gr.h;
        this.f46258a = new td.a(0, this, grVar, 320L, false);
        this.f46259b = new td.a(1, this, grVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, ig.a aVar, lg.a aVar2, b6 b6Var) {
        int v02 = f6.v0(f6.Wk, b6Var);
        a aVar3 = new a(context);
        aVar3.f46262f = b6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = f6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(f6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    public static a d(Context context, ig.a aVar, lg.a aVar2, b6 b6Var, int i9, int i10) {
        int v02 = f6.v0(f6.Wk, b6Var);
        a aVar3 = new a(context);
        aVar3.f46262f = b6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i9, i10);
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = f6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(f6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    @Override
    public final void J0(int i9, float f10, float f11, c cVar) {
        if (i9 == 0) {
            a();
            b();
        }
        if (i9 == 1) {
            a();
            b();
        }
    }

    public final void a() {
        int i9;
        float f10 = 1.0f - this.f46258a.f47775e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f46259b.f47775e);
        ImageView imageView = this.f46260c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f46260c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.f46260c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10) * this.h);
            ImageView imageView2 = this.f46260c;
            if (f10 > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView2.setVisibility(i9);
        }
    }

    public final void b() {
        int i9;
        float f10 = this.f46258a.f47775e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f46259b.f47775e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.d.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.d.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            if (f10 > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            if (this.d.getVisibility() != i9) {
                this.d.setVisibility(i9);
                this.f46261e.f29812c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f46263n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f46259b.a(z10, z11);
    }

    public final void f(int i9, int i10) {
        if (this.f46260c == null) {
            if (i9 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f46260c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f46260c, e6.e(i10, i10, 17));
            a();
        }
        this.f46260c.setImageResource(i9);
    }

    public final void g() {
        d dVar = this.f46263n;
        if (dVar != null) {
            dVar.u();
            invalidate();
        }
        int i9 = f6.Wk;
        int v02 = f6.v0(i9, this.f46262f);
        setIconColor(f6.v0(i9, this.f46262f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = f6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(f6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f46263n.setBounds(0, 0, i9, i10);
    }

    public void setBlurredBackgroundDrawable(d dVar) {
        this.f46263n = dVar;
        dVar.o(AndroidUtilities.dp(6.0f));
        this.f46263n.p(AndroidUtilities.dp(22.0f));
    }

    @Override
    public void setEnabled(boolean z10) {
        e(z10, false);
    }

    public void setIcon(int i9) {
        f(i9, 48);
    }

    public void setIconColor(int i9) {
        BlendMode blendMode;
        ImageView imageView = this.f46260c;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i9, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i9) {
        ImageView imageView = this.f46260c;
        if (imageView != null) {
            imageView.setPadding(0, i9, 0, 0);
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
