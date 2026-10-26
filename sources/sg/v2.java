package sg;

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
import fi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.d3;
public final class v2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public o0 G;
    public ai.i H;
    public final int f48536a;
    public final p5 f48537b;
    public final bi.r f48538c;
    public final bi.t1 d;
    public final ImageView e;
    public final t2 f48539f;
    public final Rect h;
    public Bitmap f48540n;
    public BitmapShader f48541r;
    public Paint f48542s;
    public Matrix v;
    public final mc0 f48543w;
    public final mc0 f48544x;
    public float f48545y;

    public v2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        di.b bVar = new di.b();
        this.h = new Rect();
        this.F = false;
        this.f48536a = i10;
        p5 p5Var = new p5(this, context, 4);
        this.f48537b = p5Var;
        p5Var.setOnClickListener(new ig.d0(this, 19));
        bi.r rVar = new bi.r(context, 10);
        this.f48538c = rVar;
        rVar.setOrientation(1);
        p5Var.addView(rVar, gb1.h(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        bi.t1 t1Var = new bi.t1(this, context, 12);
        t1Var.setWillNotDraw(false);
        rVar.addView(t1Var, gb1.t(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        t1Var.addView(frameLayout, gb1.i(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView k10 = d3.k(frameLayout, textView, gb1.h(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        k10.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        k10.setTextColor(-8421505);
        k10.setTextSize(1, 14.0f);
        frameLayout.addView(k10, gb1.h(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        bi.t1 t1Var2 = new bi.t1(this, context, 13);
        this.d = t1Var2;
        t1Var.addView(t1Var2, gb1.h(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        t1Var2.addView(imageView, gb1.i(-1, -1, 119));
        t2 t2Var = new t2(this, context, AndroidUtilities.density);
        this.f48539f = t2Var;
        t1Var2.addView(t2Var, gb1.i(-2, -2, 17));
        k80 F = k80.F(p5Var, bVar, p5Var);
        mc0 mc0Var = new mc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.f48543w = mc0Var;
        mc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f48501b;

            {
                this.f48501b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v2 v2Var = this.f48501b;
                        o0 o0Var = v2Var.G;
                        boolean z10 = o0Var.f48397f;
                        o0Var.f48397f = !z10;
                        v2Var.f48543w.a(z10, true);
                        v2Var.f48539f.b(i10, v2Var.G, true);
                        return;
                    default:
                        v2 v2Var2 = this.f48501b;
                        o0 o0Var2 = v2Var2.G;
                        boolean z11 = o0Var2.e;
                        o0Var2.e = !z11;
                        v2Var2.f48544x.a(z11, true);
                        v2Var2.f48539f.b(i10, v2Var2.G, true);
                        return;
                }
            }
        });
        F.q(mc0Var);
        mc0 mc0Var2 = new mc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.f48544x = mc0Var2;
        mc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final v2 f48501b;

            {
                this.f48501b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v2 v2Var = this.f48501b;
                        o0 o0Var = v2Var.G;
                        boolean z10 = o0Var.f48397f;
                        o0Var.f48397f = !z10;
                        v2Var.f48543w.a(z10, true);
                        v2Var.f48539f.b(i10, v2Var.G, true);
                        return;
                    default:
                        v2 v2Var2 = this.f48501b;
                        o0 o0Var2 = v2Var2.G;
                        boolean z11 = o0Var2.e;
                        o0Var2.e = !z11;
                        v2Var2.f48544x.a(z11, true);
                        v2Var2.f48539f.b(i10, v2Var2.G, true);
                        return;
                }
            }
        });
        F.q(mc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new r2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new r2(this, 3), true);
        rVar.addView(F.A, gb1.s(-2, -2, 0.0f, 85));
        p5Var.setFitsSystemWindows(true);
        p5Var.setOnApplyWindowInsetsListener(new u2(this));
    }

    public final void b(boolean z10, r2 r2Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f48545y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new e4(this, 24));
        this.E.addListener(new ai.l0(this, z10, r2Var, 15));
        this.E.setInterpolator(ds.h);
        ValueAnimator valueAnimator2 = this.E;
        if (z10) {
            j10 = 420;
        } else {
            j10 = 320;
        }
        valueAnimator2.setDuration(j10);
        this.E.start();
    }

    @Override
    public final void dismiss() {
        if (this.F) {
            return;
        }
        ai.i iVar = this.H;
        if (iVar != null) {
            iVar.run(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new r2(this, 1));
        this.f48537b.invalidate();
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
        p5 p5Var = this.f48537b;
        setContentView(p5Var, layoutParams);
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
        p5Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(p5Var, !y6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        AndroidUtilities.makeGlobalBlurBitmap(new ig.o(this, 19), 14.0f);
        b(true, null);
    }
}
