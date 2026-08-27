package rg;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import lg.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import ud.c;

public final class a extends FrameLayout implements ud.b {

    public final ud.a f47017a;

    public final ud.a f47018b;

    public ImageView f47019c;
    public ImageView d;

    public hp f47020e;

    public c6 f47021f;
    public float h;

    public d f47022n;

    public a(Context context) {
        super(context);
        er erVar = er.h;
        this.f47017a = new ud.a(0, this, erVar, 320L, false);
        this.f47018b = new ud.a(1, this, erVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, jg.a aVar, mg.a aVar2, c6 c6Var) {
        int iV0 = g6.v0(g6.Wk, c6Var);
        a aVar3 = new a(context);
        aVar3.f47021f = c6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.setIconColor(iV0);
        int iDp = AndroidUtilities.dp(22.0f);
        int iL1 = g6.l1(0.15f, iV0);
        int iDp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(g6.W(iDp, iL1, iDp2, iDp2, iDp2, iDp2));
        return aVar3;
    }

    public static a d(Context context, jg.a aVar, mg.a aVar2, c6 c6Var, int i10, int i11) {
        int iV0 = g6.v0(g6.Wk, c6Var);
        a aVar3 = new a(context);
        aVar3.f47021f = c6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i10, i11);
        aVar3.setIconColor(iV0);
        int iDp = AndroidUtilities.dp(22.0f);
        int iL1 = g6.l1(0.15f, iV0);
        int iDp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(g6.W(iDp, iL1, iDp2, iDp2, iDp2, iDp2));
        return aVar3;
    }

    public final void a() {
        float f10 = 1.0f - this.f47017a.f48497e;
        float fLerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f47018b.f48497e);
        ImageView imageView = this.f47019c;
        if (imageView != null) {
            imageView.setAlpha(fLerp);
            this.f47019c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.f47019c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10) * this.h);
            this.f47019c.setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void b() {
        float f10 = this.f47017a.f48497e;
        float fLerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.f47018b.f48497e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(fLerp);
            this.d.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.d.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            int i10 = f10 > 0.0f ? 0 : 8;
            if (this.d.getVisibility() != i10) {
                this.d.setVisibility(i10);
                this.f47020e.f29072c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f47022n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f47018b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f47019c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f47019c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f47019c, z5.e(i11, i11, 17));
            a();
        }
        this.f47019c.setImageResource(i10);
    }

    public final void g() {
        d dVar = this.f47022n;
        if (dVar != null) {
            dVar.u();
            invalidate();
        }
        int i10 = g6.Wk;
        int iV0 = g6.v0(i10, this.f47021f);
        setIconColor(g6.v0(i10, this.f47021f));
        int iDp = AndroidUtilities.dp(22.0f);
        int iL1 = g6.l1(0.15f, iV0);
        int iDp2 = AndroidUtilities.dp(6.0f);
        setBackground(g6.W(iDp, iL1, iDp2, iDp2, iDp2, iDp2));
    }

    @Override
    public final void o(int i10, float f10, float f11, c cVar) {
        if (i10 == 0) {
            a();
            b();
        }
        if (i10 == 1) {
            a();
            b();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f47022n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(d dVar) {
        this.f47022n = dVar;
        dVar.o(AndroidUtilities.dp(6.0f));
        this.f47022n.p(AndroidUtilities.dp(22.0f));
    }

    @Override
    public void setEnabled(boolean z10) {
        e(z10, false);
    }

    public void setIcon(int i10) {
        f(i10, 48);
    }

    public void setIconColor(int i10) {
        ImageView imageView = this.f47019c;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.setColorFilter(new BlendModeColorFilter(i10, BlendMode.SRC_IN));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.f47019c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
