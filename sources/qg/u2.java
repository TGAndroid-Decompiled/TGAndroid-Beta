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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.yd;
import w7.x5;
public final class u2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public n0 G;
    public ai.y1 H;
    public final int f46616a;
    public final ai.f0 f46617b;
    public final yd f46618c;
    public final x7 d;
    public final ImageView f46619e;
    public final s2 f46620f;
    public final Rect h;
    public Bitmap f46621n;
    public BitmapShader f46622r;
    public Paint f46623s;
    public Matrix v;
    public final vc0 f46624w;
    public final vc0 f46625x;
    public float f46626y;

    public u2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        ai.d dVar = new ai.d();
        this.h = new Rect();
        this.F = false;
        this.f46616a = i10;
        ai.f0 f0Var = new ai.f0(this, context, 28);
        this.f46617b = f0Var;
        f0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 7));
        yd ydVar = new yd(context, 8);
        this.f46618c = ydVar;
        ydVar.setOrientation(1);
        f0Var.addView(ydVar, x5.a(-2.0f, 8.0f, 8.0f, 8.0f, 8.0f, -2, 17));
        x7 x7Var = new x7(this, context, 10);
        x7Var.setWillNotDraw(false);
        ydVar.addView(x7Var, x5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
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
        this.f46619e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        x7Var2.addView(imageView, x5.e(-1, -1, 119));
        s2 s2Var = new s2(this, context, AndroidUtilities.density);
        this.f46620f = s2Var;
        x7Var2.addView(s2Var, x5.e(-2, -2, 17));
        q80 F = q80.F(f0Var, dVar, f0Var);
        vc0 vc0Var = new vc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), dVar);
        this.f46624w = vc0Var;
        vc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final u2 f46582b;

            {
                this.f46582b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u2 u2Var = this.f46582b;
                        n0 n0Var = u2Var.G;
                        boolean z10 = n0Var.f46468f;
                        n0Var.f46468f = !z10;
                        u2Var.f46624w.a(z10, true);
                        u2Var.f46620f.b(i10, u2Var.G, true);
                        return;
                    default:
                        u2 u2Var2 = this.f46582b;
                        n0 n0Var2 = u2Var2.G;
                        boolean z11 = n0Var2.f46467e;
                        n0Var2.f46467e = !z11;
                        u2Var2.f46625x.a(z11, true);
                        u2Var2.f46620f.b(i10, u2Var2.G, true);
                        return;
                }
            }
        });
        F.q(vc0Var);
        vc0 vc0Var2 = new vc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), dVar);
        this.f46625x = vc0Var2;
        vc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final u2 f46582b;

            {
                this.f46582b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u2 u2Var = this.f46582b;
                        n0 n0Var = u2Var.G;
                        boolean z10 = n0Var.f46468f;
                        n0Var.f46468f = !z10;
                        u2Var.f46624w.a(z10, true);
                        u2Var.f46620f.b(i10, u2Var.G, true);
                        return;
                    default:
                        u2 u2Var2 = this.f46582b;
                        n0 n0Var2 = u2Var2.G;
                        boolean z11 = n0Var2.f46467e;
                        n0Var2.f46467e = !z11;
                        u2Var2.f46625x.a(z11, true);
                        u2Var2.f46620f.b(i10, u2Var2.G, true);
                        return;
                }
            }
        });
        F.q(vc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new q2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new q2(this, 3), true);
        ydVar.addView(F.A, x5.o(-2, -2, 0.0f, 85));
        f0Var.setFitsSystemWindows(true);
        f0Var.setOnApplyWindowInsetsListener(new t2(this));
    }

    public final void b(boolean z10, q2 q2Var) {
        float f7;
        long j3;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f46626y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 13));
        this.E.addListener(new androidx.fragment.app.g(this, z10, q2Var, 12));
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
        b(false, new q2(this, 1));
        this.f46617b.invalidate();
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
        ai.f0 f0Var = this.f46617b;
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
        AndroidUtilities.setLightNavigationBar(f0Var, !i6.I.q());
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
