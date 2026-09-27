package qg;

import ai.w7;
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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.zd;
import w7.y5;
public final class t2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public n0 G;
    public ai.y1 H;
    public final int f41974a;
    public final ai.f0 f41975b;
    public final zd f41976c;
    public final w7 d;
    public final ImageView e;
    public final r2 f41977f;
    public final Rect h;
    public Bitmap f41978n;
    public BitmapShader f41979r;
    public Paint f41980s;
    public Matrix v;
    public final fc0 f41981w;
    public final fc0 f41982x;
    public float f41983y;

    public t2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        ai.d dVar = new ai.d();
        this.h = new Rect();
        this.F = false;
        this.f41974a = i10;
        ai.f0 f0Var = new ai.f0(this, context, 26);
        this.f41975b = f0Var;
        f0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 7));
        zd zdVar = new zd(context, 8);
        this.f41976c = zdVar;
        zdVar.setOrientation(1);
        f0Var.addView(zdVar, y5.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        w7 w7Var = new w7(this, context, 9);
        w7Var.setWillNotDraw(false);
        zdVar.addView(w7Var, y5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        w7Var.addView(frameLayout, y5.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, y5.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        h.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        h.setTextColor(-8421505);
        h.setTextSize(1, 14.0f);
        frameLayout.addView(h, y5.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        w7 w7Var2 = new w7(this, context, 10);
        this.d = w7Var2;
        w7Var.addView(w7Var2, y5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        w7Var2.addView(imageView, y5.e(-1, -1, 119));
        r2 r2Var = new r2(this, context, AndroidUtilities.density);
        this.f41977f = r2Var;
        w7Var2.addView(r2Var, y5.e(-2, -2, 17));
        a80 F = a80.F(f0Var, dVar, f0Var);
        fc0 fc0Var = new fc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), dVar);
        this.f41981w = fc0Var;
        fc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t2 f41936b;

            {
                this.f41936b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t2 t2Var = this.f41936b;
                        n0 n0Var = t2Var.G;
                        boolean z10 = n0Var.f41842f;
                        n0Var.f41842f = !z10;
                        t2Var.f41981w.a(z10, true);
                        t2Var.f41977f.b(i10, t2Var.G, true);
                        return;
                    default:
                        t2 t2Var2 = this.f41936b;
                        n0 n0Var2 = t2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        t2Var2.f41982x.a(z11, true);
                        t2Var2.f41977f.b(i10, t2Var2.G, true);
                        return;
                }
            }
        });
        F.q(fc0Var);
        fc0 fc0Var2 = new fc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), dVar);
        this.f41982x = fc0Var2;
        fc0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t2 f41936b;

            {
                this.f41936b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        t2 t2Var = this.f41936b;
                        n0 n0Var = t2Var.G;
                        boolean z10 = n0Var.f41842f;
                        n0Var.f41842f = !z10;
                        t2Var.f41981w.a(z10, true);
                        t2Var.f41977f.b(i10, t2Var.G, true);
                        return;
                    default:
                        t2 t2Var2 = this.f41936b;
                        n0 n0Var2 = t2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        t2Var2.f41982x.a(z11, true);
                        t2Var2.f41977f.b(i10, t2Var2.G, true);
                        return;
                }
            }
        });
        F.q(fc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new p2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new p2(this, 3), true);
        zdVar.addView(F.A, y5.o(-2, -2, 0.0f, 85));
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
        float f10 = this.f41983y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 13));
        this.E.addListener(new androidx.fragment.app.g(this, z10, p2Var, 12));
        this.E.setInterpolator(sr.h);
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
        this.f41975b.invalidate();
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
        ai.f0 f0Var = this.f41975b;
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
