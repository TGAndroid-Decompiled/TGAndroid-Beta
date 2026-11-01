package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.ze;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.yd0;
public abstract class g0 extends FrameLayout {
    public final eg.g D;
    public boolean E;
    public final k4 f51189a;
    public jg.e2 f51190b;
    public final org.telegram.ui.Components.t5 f51191c;
    public final org.telegram.ui.Components.t5 d;
    public final f0 e;
    public final FrameLayout f51192f;
    public final z h;
    public final eg.f f51193n;
    public final FrameLayout f51194r;
    public float f51195s;
    public final int[] f51196w;
    public final int[] f51197x;
    public final int[] f51198y;

    public g0(Context context, k4 k4Var) {
        super(context);
        this.f51195s = 0.0f;
        this.f51196w = new int[2];
        this.f51197x = new int[2];
        this.f51198y = new int[2];
        this.D = new Object();
        this.f51189a = k4Var;
        f0 f0Var = new f0(this, context);
        this.e = f0Var;
        gr grVar = gr.h;
        this.f51191c = new org.telegram.ui.Components.t5(f0Var, 0L, 320L, grVar);
        this.d = new org.telegram.ui.Components.t5(f0Var, 0L, 320L, grVar);
        z zVar = new z(this, context, 1);
        this.h = zVar;
        zVar.setListener(new e0(this));
        addView(zVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51192f = frameLayout;
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        eg.f fVar = new eg.f(context);
        this.f51193n = fVar;
        fVar.setListener(new yd0(2, this));
        frameLayout.addView(fVar, w7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f51194r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        sc.e.t(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(dd.L0(2131752589, null));
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView, w7.b6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f51031b;

            {
                this.f51031b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((a8) this.f51031b).F.k0(-1, false, true);
                        return;
                    case 1:
                        g0 g0Var = this.f51031b;
                        g0Var.h.l(true);
                        eg.f fVar2 = g0Var.f51193n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        g0 g0Var2 = this.f51031b;
                        jg.e2 e2Var = g0Var2.f51190b;
                        if (e2Var != null) {
                            e2Var.G0 = new ze();
                            g0Var2.h.b(g0Var2.f51190b.G0);
                            jg.e2 e2Var2 = g0Var2.f51190b;
                            e2Var2.G0.f19706z = e2Var2.getOrientation();
                            g0Var2.f51190b.k();
                            g0Var2.f51190b.requestLayout();
                            g0Var2.f51190b.f9960z0.requestLayout();
                            g0Var2.f51190b.f9960z0.invalidate();
                            g0Var2.f51190b.f9960z0.post(new d0(g0Var2, 0));
                        }
                        ((a8) g0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(dd.L0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView2, w7.b6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f51031b;

            {
                this.f51031b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((a8) this.f51031b).F.k0(-1, false, true);
                        return;
                    case 1:
                        g0 g0Var = this.f51031b;
                        g0Var.h.l(true);
                        eg.f fVar2 = g0Var.f51193n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        g0 g0Var2 = this.f51031b;
                        jg.e2 e2Var = g0Var2.f51190b;
                        if (e2Var != null) {
                            e2Var.G0 = new ze();
                            g0Var2.h.b(g0Var2.f51190b.G0);
                            jg.e2 e2Var2 = g0Var2.f51190b;
                            e2Var2.G0.f19706z = e2Var2.getOrientation();
                            g0Var2.f51190b.k();
                            g0Var2.f51190b.requestLayout();
                            g0Var2.f51190b.f9960z0.requestLayout();
                            g0Var2.f51190b.f9960z0.invalidate();
                            g0Var2.f51190b.f9960z0.post(new d0(g0Var2, 0));
                        }
                        ((a8) g0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(dd.L0(2131744706, null));
        textView3.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView3, w7.b6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f51031b;

            {
                this.f51031b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((a8) this.f51031b).F.k0(-1, false, true);
                        return;
                    case 1:
                        g0 g0Var = this.f51031b;
                        g0Var.h.l(true);
                        eg.f fVar2 = g0Var.f51193n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        g0 g0Var2 = this.f51031b;
                        jg.e2 e2Var = g0Var2.f51190b;
                        if (e2Var != null) {
                            e2Var.G0 = new ze();
                            g0Var2.h.b(g0Var2.f51190b.G0);
                            jg.e2 e2Var2 = g0Var2.f51190b;
                            e2Var2.G0.f19706z = e2Var2.getOrientation();
                            g0Var2.f51190b.k();
                            g0Var2.f51190b.requestLayout();
                            g0Var2.f51190b.f9960z0.requestLayout();
                            g0Var2.f51190b.f9960z0.invalidate();
                            g0Var2.f51190b.f9960z0.post(new d0(g0Var2, 0));
                        }
                        ((a8) g0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        jg.e2 e2Var = this.f51190b;
        if (e2Var == null) {
            return 1;
        }
        if (e2Var.getOrientation() != 90 && this.f51190b.getOrientation() != 270) {
            return this.f51190b.getContentHeight();
        }
        return this.f51190b.getContentWidth();
    }

    public int getCurrentWidth() {
        jg.e2 e2Var = this.f51190b;
        if (e2Var == null) {
            return 1;
        }
        if (e2Var.getOrientation() != 90 && this.f51190b.getOrientation() != 270) {
            return this.f51190b.getContentWidth();
        }
        return this.f51190b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f51195s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        z zVar = this.h;
        zVar.setTopPadding(org.telegram.messenger.i0.L(52.0f));
        zVar.setBottomPadding(org.telegram.messenger.i0.L(116.0f) + this.f51192f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(jg.e2 e2Var) {
        if (e2Var == null) {
            return;
        }
        this.f51190b = e2Var;
        setVisibility(0);
        this.E = false;
        z zVar = this.h;
        boolean z10 = true;
        zVar.J = true;
        getLocationOnScreen(this.f51196w);
        this.f51189a.getLocationOnScreen(this.f51197x);
        e2Var.getLocationOnScreen(this.f51198y);
        ze zeVar = e2Var.G0;
        if (zeVar == null) {
            zeVar = null;
        }
        zVar.p(e2Var.getOrientation(), this.D, zeVar);
        float rotation = zVar.getRotation();
        eg.f fVar = this.f51193n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.t5 t5Var = this.f51191c;
        if (zeVar != null) {
            fVar.b(zeVar.d);
            if (zeVar.f19698k == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(zeVar.f19699l);
            t5Var.f(zeVar.f19699l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            t5Var.getClass();
            t5Var.e(false, 0.0f);
        }
        zVar.r(false);
        f0 f0Var = this.e;
        f0Var.setVisibility(0);
        f0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f51195s - f7) < 0.001f) {
            return;
        }
        this.f51195s = f7;
        this.e.invalidate();
        z zVar = this.h;
        CropAreaView cropAreaView = zVar.f6583a;
        CropAreaView cropAreaView2 = zVar.f6583a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
