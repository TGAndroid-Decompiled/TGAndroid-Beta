package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.yd0;
public abstract class b0 extends FrameLayout {
    public boolean D;
    public final k4 f50927a;
    public final org.telegram.ui.Components.t5 f50928b;
    public final org.telegram.ui.Components.t5 f50929c;
    public final a0 d;
    public final FrameLayout e;
    public final z f50930f;
    public final eg.f h;
    public final FrameLayout f50931n;
    public float f50932r;
    public final int[] f50933s;
    public final int[] f50934w;
    public final eg.g f50935x;
    public n5 f50936y;

    public b0(Context context, k4 k4Var) {
        super(context);
        this.f50932r = 0.0f;
        this.f50933s = new int[2];
        this.f50934w = new int[2];
        this.f50935x = new Object();
        this.f50927a = k4Var;
        a0 a0Var = new a0(this, context);
        this.d = a0Var;
        gr grVar = gr.h;
        this.f50928b = new org.telegram.ui.Components.t5(a0Var, 0L, 320L, grVar);
        this.f50929c = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        z zVar = new z(this, context, 0);
        this.f50930f = zVar;
        zVar.setListener(new s9.g(this));
        addView(zVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        eg.f fVar = new eg.f(context);
        this.h = fVar;
        fVar.setListener(new yd0(1, this));
        frameLayout.addView(fVar, w7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50931n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        sc.e.t(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131752589, null));
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView, w7.b6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final b0 f52187b;

            {
                this.f52187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((z7) this.f52187b).E.k0(-1, false, true);
                        return;
                    case 1:
                        b0 b0Var = this.f52187b;
                        b0Var.f50930f.l(true);
                        eg.f fVar2 = b0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        b0Var.d.invalidate();
                        return;
                    default:
                        b0 b0Var2 = this.f52187b;
                        n5 n5Var = b0Var2.f50936y;
                        if (n5Var != null) {
                            n5Var.m0 = new ye();
                            b0Var2.f50930f.b(b0Var2.f50936y.m0);
                            n5 n5Var2 = b0Var2.f50936y;
                            n5Var2.m0.f19378z = n5Var2.Q;
                        }
                        ((z7) b0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(cd.L0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView2, w7.b6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final b0 f52187b;

            {
                this.f52187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((z7) this.f52187b).E.k0(-1, false, true);
                        return;
                    case 1:
                        b0 b0Var = this.f52187b;
                        b0Var.f50930f.l(true);
                        eg.f fVar2 = b0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        b0Var.d.invalidate();
                        return;
                    default:
                        b0 b0Var2 = this.f52187b;
                        n5 n5Var = b0Var2.f50936y;
                        if (n5Var != null) {
                            n5Var.m0 = new ye();
                            b0Var2.f50930f.b(b0Var2.f50936y.m0);
                            n5 n5Var2 = b0Var2.f50936y;
                            n5Var2.m0.f19378z = n5Var2.Q;
                        }
                        ((z7) b0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(cd.L0(2131744706, null));
        textView3.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView3, w7.b6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final b0 f52187b;

            {
                this.f52187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((z7) this.f52187b).E.k0(-1, false, true);
                        return;
                    case 1:
                        b0 b0Var = this.f52187b;
                        b0Var.f50930f.l(true);
                        eg.f fVar2 = b0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        b0Var.d.invalidate();
                        return;
                    default:
                        b0 b0Var2 = this.f52187b;
                        n5 n5Var = b0Var2.f50936y;
                        if (n5Var != null) {
                            n5Var.m0 = new ye();
                            b0Var2.f50930f.b(b0Var2.f50936y.m0);
                            n5 n5Var2 = b0Var2.f50936y;
                            n5Var2.m0.f19378z = n5Var2.Q;
                        }
                        ((z7) b0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        n5 n5Var = this.f50936y;
        if (n5Var == null) {
            return 1;
        }
        int i10 = n5Var.Q;
        k4 k4Var = this.f50927a;
        if (i10 != 90 && i10 != 270) {
            return k4Var.getContentHeight();
        }
        return k4Var.getContentWidth();
    }

    public int getCurrentWidth() {
        n5 n5Var = this.f50936y;
        if (n5Var == null) {
            return 1;
        }
        int i10 = n5Var.Q;
        k4 k4Var = this.f50927a;
        if (i10 != 90 && i10 != 270) {
            return k4Var.getContentWidth();
        }
        return k4Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f50932r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f50930f.setBottomPadding(org.telegram.messenger.i0.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f50932r - f7) < 0.001f) {
            return;
        }
        this.f50932r = f7;
        a0 a0Var = this.d;
        a0Var.setAlpha(f7);
        a0Var.invalidate();
        z zVar = this.f50930f;
        CropAreaView cropAreaView = zVar.f6583a;
        CropAreaView cropAreaView2 = zVar.f6583a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f50927a.invalidate();
    }

    public void setEntry(n5 n5Var) {
        eg.g gVar;
        boolean z10;
        if (n5Var == null) {
            return;
        }
        this.f50936y = n5Var;
        this.D = false;
        z zVar = this.f50930f;
        zVar.J = true;
        getLocationOnScreen(this.f50933s);
        int[] iArr = this.f50934w;
        k4 k4Var = this.f50927a;
        k4Var.getLocationOnScreen(iArr);
        ye yeVar = n5Var.m0;
        if (yeVar == null) {
            yeVar = null;
        }
        zVar.p(n5Var.Q, this.f50935x, yeVar);
        float rotation = zVar.getRotation();
        eg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.t5 t5Var = this.f50928b;
        if (yeVar != null) {
            fVar.b(yeVar.d);
            if (yeVar.f19370k != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(yeVar.f19371l);
            t5Var.f(yeVar.f19371l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            t5Var.getClass();
            t5Var.e(false, 0.0f);
        }
        zVar.r(false);
        this.f50929c.e(true, gVar.f6546i);
        a0 a0Var = this.d;
        a0Var.setVisibility(0);
        a0Var.invalidate();
        k4Var.setCropEditorDrawing(this);
    }
}
