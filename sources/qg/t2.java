package qg;

import ai.x7;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.xd;
import w7.x5;
public final class t2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public n0 G;
    public ai.y1 H;
    public final int f46675a;
    public final ai.f0 f46676b;
    public final xd f46677c;
    public final x7 d;
    public final ImageView f46678e;
    public final r2 f46679f;
    public final Rect h;
    public Bitmap f46680n;
    public BitmapShader f46681r;
    public Paint f46682s;
    public Matrix v;
    public final uc0 f46683w;
    public final uc0 f46684x;
    public float f46685y;

    public t2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        ai.d dVar = new ai.d();
        this.h = new Rect();
        this.F = false;
        this.f46675a = i10;
        ai.f0 f0Var = new ai.f0(this, context, 28);
        this.f46676b = f0Var;
        f0Var.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 7));
        xd xdVar = new xd(context, 8);
        this.f46677c = xdVar;
        xdVar.setOrientation(1);
        f0Var.addView(xdVar, x5.a(-2.0f, 8.0f, 8.0f, 8.0f, 8.0f, -2, 17));
        x7 x7Var = new x7(this, context, 10);
        x7Var.setWillNotDraw(false);
        xdVar.addView(x7Var, x5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        x7Var.addView(frameLayout, x5.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, x5.a(-2.0f, 18.0f, 8.33f, 18.0f, 0.0f, -1, 55), context);
        g10.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        g10.setTextColor(-8421505);
        g10.setTextSize(1, 14.0f);
        frameLayout.addView(g10, x5.a(-2.0f, 18.0f, 31.0f, 18.0f, 0.0f, -1, 55));
        x7 x7Var2 = new x7(this, context, 11);
        this.d = x7Var2;
        x7Var.addView(x7Var2, x5.a(-1.0f, 0.0f, 56.0f, 0.0f, 0.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.f46678e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        x7Var2.addView(imageView, x5.e(-1, -1, 119));
        r2 r2Var = new r2(this, context, AndroidUtilities.density);
        this.f46679f = r2Var;
        x7Var2.addView(r2Var, x5.e(-2, -2, 17));
        p80 F = p80.F(f0Var, dVar, f0Var);
        uc0 uc0Var = new uc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), dVar);
        this.f46683w = uc0Var;
        uc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t2 f46635b;

            {
                this.f46635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t2 t2Var = this.f46635b;
                        n0 n0Var = t2Var.G;
                        boolean z10 = n0Var.f46538f;
                        n0Var.f46538f = !z10;
                        t2Var.f46683w.a(z10, true);
                        t2Var.f46679f.b(i10, t2Var.G, true);
                        return;
                    default:
                        t2 t2Var2 = this.f46635b;
                        n0 n0Var2 = t2Var2.G;
                        boolean z11 = n0Var2.f46537e;
                        n0Var2.f46537e = !z11;
                        t2Var2.f46684x.a(z11, true);
                        t2Var2.f46679f.b(i10, t2Var2.G, true);
                        return;
                }
            }
        });
        F.q(uc0Var);
        uc0 uc0Var2 = new uc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), dVar);
        this.f46684x = uc0Var2;
        uc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t2 f46635b;

            {
                this.f46635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t2 t2Var = this.f46635b;
                        n0 n0Var = t2Var.G;
                        boolean z10 = n0Var.f46538f;
                        n0Var.f46538f = !z10;
                        t2Var.f46683w.a(z10, true);
                        t2Var.f46679f.b(i10, t2Var.G, true);
                        return;
                    default:
                        t2 t2Var2 = this.f46635b;
                        n0 n0Var2 = t2Var2.G;
                        boolean z11 = n0Var2.f46537e;
                        n0Var2.f46537e = !z11;
                        t2Var2.f46684x.a(z11, true);
                        t2Var2.f46679f.b(i10, t2Var2.G, true);
                        return;
                }
            }
        });
        F.q(uc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new p2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new p2(this, 3), true);
        xdVar.addView(F.A, x5.o(-2, -2, 0.0f, 85));
        f0Var.setFitsSystemWindows(true);
        f0Var.setOnApplyWindowInsetsListener(new s2(this));
    }

    public final void b(boolean z10, p2 p2Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f46685y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 13));
        this.E.addListener(new androidx.fragment.app.g(this, z10, p2Var, 12));
        this.E.setInterpolator(is.h);
        ValueAnimator valueAnimator2 = this.E;
        if (z10) {
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
        ai.y1 y1Var = this.H;
        if (y1Var != null) {
            y1Var.run(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new p2(this, 1));
        this.f46676b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.F;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ai.f0 f0Var = this.f46676b;
        setContentView(f0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i10;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-1945959040);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        f0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(f0Var, !h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(this, 9), 14.0f);
        b(true, null);
    }
}
