package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.yh;
public abstract class c0 extends FrameLayout {
    public final j5 f45033a;
    public final org.telegram.ui.Components.z5 f45034b;
    public final org.telegram.ui.Components.z5 f45035c;
    public final b0 d;
    public final FrameLayout f45036e;
    public final a0 f45037f;
    public final zf.e h;
    public final FrameLayout f45038n;
    public float f45039r;
    public final int[] f45040s;
    public final int[] v;
    public final zf.f f45041w;
    public s6 f45042x;
    public boolean f45043y;

    public c0(Context context, j5 j5Var) {
        super(context);
        this.f45039r = 0.0f;
        this.f45040s = new int[2];
        this.v = new int[2];
        this.f45041w = new Object();
        this.f45033a = j5Var;
        b0 b0Var = new b0(this, context);
        this.d = b0Var;
        pr prVar = pr.h;
        this.f45034b = new org.telegram.ui.Components.z5(b0Var, 0L, 320L, prVar);
        this.f45035c = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        a0 a0Var = new a0(this, context, 0);
        this.f45037f = a0Var;
        a0Var.setListener(new oh.h4(this, 11));
        addView(a0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45036e = frameLayout;
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        zf.e eVar = new zf.e(context);
        this.h = eVar;
        eVar.setListener(new xe0(1, this));
        frameLayout.addView(eVar, k7.c6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45038n = frameLayout2;
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yh.p(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, k7.c6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final c0 f46366b;

            {
                this.f46366b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((l9) this.f46366b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f46366b;
                        c0Var.f45037f.l(true);
                        zf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f46366b;
                        s6 s6Var = c0Var2.f45042x;
                        if (s6Var != null) {
                            s6Var.m0 = new MediaController.CropState();
                            c0Var2.f45037f.b(c0Var2.f45042x.m0);
                            s6 s6Var2 = c0Var2.f45042x;
                            s6Var2.m0.orientation = s6Var2.Q;
                        }
                        ((l9) c0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, k7.c6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final c0 f46366b;

            {
                this.f46366b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((l9) this.f46366b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f46366b;
                        c0Var.f45037f.l(true);
                        zf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f46366b;
                        s6 s6Var = c0Var2.f45042x;
                        if (s6Var != null) {
                            s6Var.m0 = new MediaController.CropState();
                            c0Var2.f45037f.b(c0Var2.f45042x.m0);
                            s6 s6Var2 = c0Var2.f45042x;
                            s6Var2.m0.orientation = s6Var2.Q;
                        }
                        ((l9) c0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.b.e(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, k7.c6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final c0 f46366b;

            {
                this.f46366b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((l9) this.f46366b).B.l0(-1, false, true);
                        return;
                    case 1:
                        c0 c0Var = this.f46366b;
                        c0Var.f45037f.l(true);
                        zf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        return;
                    default:
                        c0 c0Var2 = this.f46366b;
                        s6 s6Var = c0Var2.f45042x;
                        if (s6Var != null) {
                            s6Var.m0 = new MediaController.CropState();
                            c0Var2.f45037f.b(c0Var2.f45042x.m0);
                            s6 s6Var2 = c0Var2.f45042x;
                            s6Var2.m0.orientation = s6Var2.Q;
                        }
                        ((l9) c0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        s6 s6Var = this.f45042x;
        if (s6Var == null) {
            return 1;
        }
        int i10 = s6Var.Q;
        j5 j5Var = this.f45033a;
        if (i10 != 90 && i10 != 270) {
            return j5Var.getContentHeight();
        }
        return j5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        s6 s6Var = this.f45042x;
        if (s6Var == null) {
            return 1;
        }
        int i10 = s6Var.Q;
        j5 j5Var = this.f45033a;
        if (i10 != 90 && i10 != 270) {
            return j5Var.getContentWidth();
        }
        return j5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f45039r;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f45037f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f45036e.getPaddingBottom());
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f45039r - f10) < 0.001f) {
            return;
        }
        this.f45039r = f10;
        b0 b0Var = this.d;
        b0Var.setAlpha(f10);
        b0Var.invalidate();
        a0 a0Var = this.f45037f;
        CropAreaView cropAreaView = a0Var.f51165a;
        CropAreaView cropAreaView2 = a0Var.f51165a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f45033a.invalidate();
    }

    public void setEntry(s6 s6Var) {
        boolean z4;
        if (s6Var == null) {
            return;
        }
        this.f45042x = s6Var;
        this.f45043y = false;
        a0 a0Var = this.f45037f;
        a0Var.G = true;
        getLocationOnScreen(this.f45040s);
        int[] iArr = this.v;
        j5 j5Var = this.f45033a;
        j5Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = s6Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = s6Var.Q;
        zf.f fVar = this.f45041w;
        a0Var.p(i10, fVar, cropState);
        float rotation = a0Var.getRotation();
        zf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.z5 z5Var = this.f45034b;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            eVar.setRotated(z4);
            eVar.setMirrored(cropState.mirrored);
            z5Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            z5Var.getClass();
            z5Var.d(0.0f, false);
        }
        a0Var.r(false);
        this.f45035c.d(fVar.f51129i, true);
        b0 b0Var = this.d;
        b0Var.setVisibility(0);
        b0Var.invalidate();
        j5Var.setCropEditorDrawing(this);
    }
}
