package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.yh;
public abstract class f0 extends FrameLayout {
    public boolean B;
    public final j5 f45272a;
    public eg.t2 f45273b;
    public final org.telegram.ui.Components.z5 f45274c;
    public final org.telegram.ui.Components.z5 d;
    public final e0 f45275e;
    public final FrameLayout f45276f;
    public final a0 h;
    public final zf.e f45277n;
    public final FrameLayout f45278r;
    public float f45279s;
    public final int[] v;
    public final int[] f45280w;
    public final int[] f45281x;
    public final zf.f f45282y;

    public f0(Context context, j5 j5Var) {
        super(context);
        this.f45279s = 0.0f;
        this.v = new int[2];
        this.f45280w = new int[2];
        this.f45281x = new int[2];
        this.f45282y = new Object();
        this.f45272a = j5Var;
        e0 e0Var = new e0(this, context);
        this.f45275e = e0Var;
        pr prVar = pr.h;
        this.f45274c = new org.telegram.ui.Components.z5(e0Var, 0L, 320L, prVar);
        this.d = new org.telegram.ui.Components.z5(e0Var, 0L, 320L, prVar);
        a0 a0Var = new a0(this, context, 1);
        this.h = a0Var;
        a0Var.setListener(new org.telegram.ui.web.e0(this, 5));
        addView(a0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45276f = frameLayout;
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        zf.e eVar = new zf.e(context);
        this.f45277n = eVar;
        eVar.setListener(new xe0(2, this));
        frameLayout.addView(eVar, k7.c6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45278r = frameLayout2;
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yh.p(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, k7.c6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final f0 f45176b;

            {
                this.f45176b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((m9) this.f45176b).C.l0(-1, false, true);
                        return;
                    case 1:
                        f0 f0Var = this.f45176b;
                        f0Var.h.l(true);
                        zf.e eVar2 = f0Var.f45277n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        f0 f0Var2 = this.f45176b;
                        eg.t2 t2Var = f0Var2.f45273b;
                        if (t2Var != null) {
                            t2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.f45273b.D0);
                            eg.t2 t2Var2 = f0Var2.f45273b;
                            t2Var2.D0.orientation = t2Var2.getOrientation();
                            f0Var2.f45273b.k();
                            f0Var2.f45273b.requestLayout();
                            f0Var2.f45273b.f5491w0.requestLayout();
                            f0Var2.f45273b.f5491w0.invalidate();
                            f0Var2.f45273b.f5491w0.post(new org.telegram.ui.web.s0(f0Var2, 11));
                        }
                        ((m9) f0Var2).C.l0(-1, false, true);
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
            public final f0 f45176b;

            {
                this.f45176b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((m9) this.f45176b).C.l0(-1, false, true);
                        return;
                    case 1:
                        f0 f0Var = this.f45176b;
                        f0Var.h.l(true);
                        zf.e eVar2 = f0Var.f45277n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        f0 f0Var2 = this.f45176b;
                        eg.t2 t2Var = f0Var2.f45273b;
                        if (t2Var != null) {
                            t2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.f45273b.D0);
                            eg.t2 t2Var2 = f0Var2.f45273b;
                            t2Var2.D0.orientation = t2Var2.getOrientation();
                            f0Var2.f45273b.k();
                            f0Var2.f45273b.requestLayout();
                            f0Var2.f45273b.f5491w0.requestLayout();
                            f0Var2.f45273b.f5491w0.invalidate();
                            f0Var2.f45273b.f5491w0.post(new org.telegram.ui.web.s0(f0Var2, 11));
                        }
                        ((m9) f0Var2).C.l0(-1, false, true);
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
            public final f0 f45176b;

            {
                this.f45176b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((m9) this.f45176b).C.l0(-1, false, true);
                        return;
                    case 1:
                        f0 f0Var = this.f45176b;
                        f0Var.h.l(true);
                        zf.e eVar2 = f0Var.f45277n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        f0 f0Var2 = this.f45176b;
                        eg.t2 t2Var = f0Var2.f45273b;
                        if (t2Var != null) {
                            t2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.f45273b.D0);
                            eg.t2 t2Var2 = f0Var2.f45273b;
                            t2Var2.D0.orientation = t2Var2.getOrientation();
                            f0Var2.f45273b.k();
                            f0Var2.f45273b.requestLayout();
                            f0Var2.f45273b.f5491w0.requestLayout();
                            f0Var2.f45273b.f5491w0.invalidate();
                            f0Var2.f45273b.f5491w0.post(new org.telegram.ui.web.s0(f0Var2, 11));
                        }
                        ((m9) f0Var2).C.l0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        eg.t2 t2Var = this.f45273b;
        if (t2Var == null) {
            return 1;
        }
        if (t2Var.getOrientation() != 90 && this.f45273b.getOrientation() != 270) {
            return this.f45273b.getContentHeight();
        }
        return this.f45273b.getContentWidth();
    }

    public int getCurrentWidth() {
        eg.t2 t2Var = this.f45273b;
        if (t2Var == null) {
            return 1;
        }
        if (t2Var.getOrientation() != 90 && this.f45273b.getOrientation() != 270) {
            return this.f45273b.getContentWidth();
        }
        return this.f45273b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f45279s;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        a0 a0Var = this.h;
        a0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        a0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f45276f.getPaddingBottom());
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void set(eg.t2 t2Var) {
        if (t2Var == null) {
            return;
        }
        this.f45273b = t2Var;
        setVisibility(0);
        this.B = false;
        a0 a0Var = this.h;
        boolean z4 = true;
        a0Var.G = true;
        getLocationOnScreen(this.v);
        this.f45272a.getLocationOnScreen(this.f45280w);
        t2Var.getLocationOnScreen(this.f45281x);
        MediaController.CropState cropState = t2Var.D0;
        if (cropState == null) {
            cropState = null;
        }
        a0Var.p(t2Var.getOrientation(), this.f45282y, cropState);
        float rotation = a0Var.getRotation();
        zf.e eVar = this.f45277n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.z5 z5Var = this.f45274c;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
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
        e0 e0Var = this.f45275e;
        e0Var.setVisibility(0);
        e0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f45279s - f10) < 0.001f) {
            return;
        }
        this.f45279s = f10;
        this.f45275e.invalidate();
        a0 a0Var = this.h;
        CropAreaView cropAreaView = a0Var.f51165a;
        CropAreaView cropAreaView2 = a0Var.f51165a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
