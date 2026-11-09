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
import c8.ha;
import fi.v3;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xq;
public final class i2 extends Dialog {
    public float D;
    public ValueAnimator E;
    public boolean F;
    public h0 G;
    public ai.i H;
    public final int f55768a;
    public final w41 f55769b;
    public final bi.t f55770c;
    public final bi.s1 d;
    public final ImageView f55771e;
    public final g2 f55772f;
    public final Rect h;
    public Bitmap f55773n;
    public BitmapShader f55774r;
    public Paint f55775s;
    public Matrix f55776w;
    public final ia0 f55777x;
    public final ia0 f55778y;

    public i2(Context context, final int i7) {
        super(context, 2131755352);
        di.b bVar = new di.b();
        this.h = new Rect();
        this.F = false;
        this.f55768a = i7;
        w41 w41Var = new w41(9, context, this);
        this.f55769b = w41Var;
        w41Var.setOnClickListener(new ii.g(this, 24));
        bi.t tVar = new bi.t(context, 12);
        this.f55770c = tVar;
        tVar.setOrientation(1);
        w41Var.addView(tVar, ha.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        bi.s1 s1Var = new bi.s1(this, context, 12);
        s1Var.setWillNotDraw(false);
        tVar.addView(s1Var, ha.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        s1Var.addView(frameLayout, ha.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131744633, null));
        textView.setTextColor(-1);
        com.google.android.recaptcha.internal.a.q(textView, 1, 18.0f);
        TextView i10 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        i10.setText(id.M0(2131744634, null));
        i10.setTextColor(-8421505);
        i10.setTextSize(1, 14.0f);
        frameLayout.addView(i10, ha.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        bi.s1 s1Var2 = new bi.s1(this, context, 13);
        this.d = s1Var2;
        s1Var.addView(s1Var2, ha.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f55771e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        s1Var2.addView(imageView, ha.e(-1, -1, 119));
        g2 g2Var = new g2(this, context, org.telegram.messenger.g0.f22562p);
        this.f55772f = g2Var;
        s1Var2.addView(g2Var, ha.e(-2, -2, 17));
        l60 F = l60.F(w41Var, bVar, w41Var);
        ia0 ia0Var = new ia0(getContext(), 2131624139, id.M0(2131744644, null), 2131624138, id.M0(2131744643, null), bVar);
        this.f55777x = ia0Var;
        ia0Var.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f55674b;

            {
                this.f55674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        i2 i2Var = this.f55674b;
                        h0 h0Var = i2Var.G;
                        boolean z9 = h0Var.f55724f;
                        h0Var.f55724f = !z9;
                        i2Var.f55777x.a(z9, true);
                        i2Var.f55772f.b(i7, i2Var.G, true);
                        return;
                    default:
                        i2 i2Var2 = this.f55674b;
                        h0 h0Var2 = i2Var2.G;
                        boolean z10 = h0Var2.f55723e;
                        h0Var2.f55723e = !z10;
                        i2Var2.f55778y.a(z10, true);
                        i2Var2.f55772f.b(i7, i2Var2.G, true);
                        return;
                }
            }
        });
        F.q(ia0Var);
        ia0 ia0Var2 = new ia0(context, 2131624089, id.M0(2131748899, null), 2131624086, id.M0(2131748898, null), bVar);
        this.f55778y = ia0Var2;
        ia0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f55674b;

            {
                this.f55674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        i2 i2Var = this.f55674b;
                        h0 h0Var = i2Var.G;
                        boolean z9 = h0Var.f55724f;
                        h0Var.f55724f = !z9;
                        i2Var.f55777x.a(z9, true);
                        i2Var.f55772f.b(i7, i2Var.G, true);
                        return;
                    default:
                        i2 i2Var2 = this.f55674b;
                        h0 h0Var2 = i2Var2.G;
                        boolean z10 = h0Var2.f55723e;
                        h0Var2.f55723e = !z10;
                        i2Var2.f55778y.a(z10, true);
                        i2Var2.f55772f.b(i7, i2Var2.G, true);
                        return;
                }
            }
        });
        F.q(ia0Var2);
        F.k();
        F.c(2131232357, id.M0(2131754218, null), new e2(this, 2), false);
        F.c(2131232108, id.M0(2131751361, null), new e2(this, 3), true);
        tVar.addView(F.A, ha.p(-2, -2, 0.0f, 85));
        w41Var.setFitsSystemWindows(true);
        w41Var.setOnApplyWindowInsetsListener(new h2(this));
    }

    public final void b(boolean z9, e2 e2Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.D;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 29));
        this.E.addListener(new ai.g0(this, z9, e2Var, 15));
        this.E.setInterpolator(xq.h);
        ValueAnimator valueAnimator2 = this.E;
        if (z9) {
            j3 = 420;
        } else {
            j3 = 320;
        }
        valueAnimator2.setDuration(j3);
        this.E.start();
    }

    @Override
    public final void dismiss() {
        if (this.F) {
            return;
        }
        ai.i iVar = this.H;
        if (iVar != null) {
            iVar.a(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new e2(this, 1));
        this.f55769b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.F;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        w41 w41Var = this.f55769b;
        setContentView(w41Var, layoutParams);
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
        w41Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(w41Var, !l6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.messenger.g0.l2(new ii.c(this, 23), 14.0f);
        b(true, null);
    }
}
