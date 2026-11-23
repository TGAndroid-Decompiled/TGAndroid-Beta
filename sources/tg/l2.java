package tg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import hi.t6;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.x01;
public final class l2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public i0 H;
    public t6 I;
    public final int f58012a;
    public final x01 f58013b;
    public final ai.k2 f58014c;
    public final di.d1 d;
    public final ImageView f58015e;
    public final j2 f58016f;
    public final Rect h;
    public Bitmap f58017n;
    public BitmapShader f58018r;
    public Paint f58019s;
    public Matrix f58020w;
    public final va0 f58021x;
    public final va0 f58022y;

    public l2(Context context, final int i7) {
        super(context, 2131755352);
        fi.b bVar = new fi.b();
        this.h = new Rect();
        this.G = false;
        this.f58012a = i7;
        x01 x01Var = new x01(9, context, this);
        this.f58013b = x01Var;
        x01Var.setOnClickListener(new u(this, 1));
        ai.k2 k2Var = new ai.k2(context, 11);
        this.f58014c = k2Var;
        k2Var.setOrientation(1);
        x01Var.addView(k2Var, na.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        di.d1 d1Var = new di.d1(this, context, 12);
        d1Var.setWillNotDraw(false);
        k2Var.addView(d1Var, na.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        d1Var.addView(frameLayout, na.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131744392, null));
        textView.setTextColor(-1);
        i5.c.x(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, na.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(hd.N0(2131744393, null));
        m10.setTextColor(-8421505);
        m10.setTextSize(1, 14.0f);
        frameLayout.addView(m10, na.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        di.d1 d1Var2 = new di.d1(this, context, 13);
        this.d = d1Var2;
        d1Var.addView(d1Var2, na.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f58015e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        d1Var2.addView(imageView, na.e(-1, -1, 119));
        j2 j2Var = new j2(this, context, org.telegram.messenger.g0.f24009p);
        this.f58016f = j2Var;
        d1Var2.addView(j2Var, na.e(-2, -2, 17));
        a70 G = a70.G(x01Var, bVar, x01Var);
        va0 va0Var = new va0(getContext(), 2131624140, hd.N0(2131744403, null), 2131624139, hd.N0(2131744402, null), bVar);
        this.f58021x = va0Var;
        va0Var.setOnClickListener(new View.OnClickListener(this) {
            public final l2 f57934b;

            {
                this.f57934b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        l2 l2Var = this.f57934b;
                        i0 i0Var = l2Var.H;
                        boolean z10 = i0Var.f57924f;
                        i0Var.f57924f = !z10;
                        l2Var.f58021x.a(z10, true);
                        l2Var.f58016f.b(i7, l2Var.H, true);
                        return;
                    default:
                        l2 l2Var2 = this.f57934b;
                        i0 i0Var2 = l2Var2.H;
                        boolean z11 = i0Var2.f57923e;
                        i0Var2.f57923e = !z11;
                        l2Var2.f58022y.a(z11, true);
                        l2Var2.f58016f.b(i7, l2Var2.H, true);
                        return;
                }
            }
        });
        G.q(va0Var);
        va0 va0Var2 = new va0(context, 2131624090, hd.N0(2131748706, null), 2131624087, hd.N0(2131748705, null), bVar);
        this.f58022y = va0Var2;
        va0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final l2 f57934b;

            {
                this.f57934b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        l2 l2Var = this.f57934b;
                        i0 i0Var = l2Var.H;
                        boolean z10 = i0Var.f57924f;
                        i0Var.f57924f = !z10;
                        l2Var.f58021x.a(z10, true);
                        l2Var.f58016f.b(i7, l2Var.H, true);
                        return;
                    default:
                        l2 l2Var2 = this.f57934b;
                        i0 i0Var2 = l2Var2.H;
                        boolean z11 = i0Var2.f57923e;
                        i0Var2.f57923e = !z11;
                        l2Var2.f58022y.a(z11, true);
                        l2Var2.f58016f.b(i7, l2Var2.H, true);
                        return;
                }
            }
        });
        G.q(va0Var2);
        G.k();
        G.c(2131232359, hd.N0(2131754215, null), new h2(this, 2), false);
        G.c(2131232110, hd.N0(2131751349, null), new h2(this, 3), true);
        k2Var.addView(G.A, na.p(-2, -2, 0.0f, 85));
        x01Var.setFitsSystemWindows(true);
        x01Var.setOnApplyWindowInsetsListener(new k2(this));
    }

    public final void b(boolean z10, h2 h2Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.E;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new z1(this, 1));
        this.F.addListener(new androidx.fragment.app.g(this, z10, h2Var, 15));
        this.F.setInterpolator(nr.h);
        ValueAnimator valueAnimator2 = this.F;
        if (z10) {
            j3 = 420;
        } else {
            j3 = 320;
        }
        valueAnimator2.setDuration(j3);
        this.F.start();
    }

    @Override
    public final void dismiss() {
        if (this.G) {
            return;
        }
        t6 t6Var = this.I;
        if (t6Var != null) {
            t6Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new h2(this, 1));
        this.f58013b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.G;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        x01 x01Var = this.f58013b;
        setContentView(x01Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i7;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i7 | (-1945959040);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        x01Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(x01Var, !m6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.messenger.g0.l2(new t6(this, 29), 14.0f);
        b(true, null);
    }
}
