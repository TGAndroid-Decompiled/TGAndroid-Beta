package vg;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
import xd.c;
public final class a extends FrameLayout implements xd.b {
    public final xd.a f45843a;
    public final xd.a f45844b;
    public ImageView f45845c;
    public ImageView d;
    public qp e;
    public f6 f45846f;
    public float h;
    public pg.b f45847n;

    public a(Context context) {
        super(context);
        mr mrVar = mr.h;
        this.f45843a = new xd.a(0, this, mrVar, 320L, false);
        this.f45844b = new xd.a(1, this, mrVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, ng.a aVar, f6 f6Var, qg.a aVar2) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar3 = new a(context);
        aVar3.f45846f = f6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    public static a d(Context context, ng.a aVar, qg.a aVar2, f6 f6Var, int i10, int i11) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar3 = new a(context);
        aVar3.f45846f = f6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i10, i11);
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
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
        float f10 = 1.0f - this.f45843a.e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f45844b.e);
        ImageView imageView = this.f45845c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f45845c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.f45845c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10) * this.h);
            ImageView imageView2 = this.f45845c;
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
        float f10 = this.f45843a.e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f45844b.e);
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
                this.e.f28227c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f45847n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.f45844b.a(z4, z10);
    }

    public final void f(int i10, int i11) {
        if (this.f45845c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f45845c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f45845c, b6.e(i11, i11, 17));
            a();
        }
        this.f45845c.setImageResource(i10);
    }

    public final void g() {
        pg.b bVar = this.f45847n;
        if (bVar != null) {
            bVar.u();
            invalidate();
        }
        int i10 = j6.Wk;
        int v02 = j6.v0(i10, this.f45846f);
        setIconColor(j6.v0(i10, this.f45846f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f45847n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(pg.b bVar) {
        this.f45847n = bVar;
        bVar.o(AndroidUtilities.dp(6.0f));
        this.f45847n.p(AndroidUtilities.dp(22.0f));
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
        ImageView imageView = this.f45845c;
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
        ImageView imageView = this.f45845c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
