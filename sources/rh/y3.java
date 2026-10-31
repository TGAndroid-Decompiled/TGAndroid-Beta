package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.u71;
public class y3 extends FrameLayout {
    public final int[] A0;
    public final int[] B0;
    public final int[] C0;
    public final p80[] D;
    public final LinearLayout.LayoutParams[] E;
    public final ph.m0[] F;
    public final TextPaint G;
    public final u71 H;
    public final ph.k[] I;
    public final ph.k J;
    public final FrameLayout K;
    public final g9 L;
    public final a3 M;
    public boolean N;
    public final TextView O;
    public final ImageView P;
    public final ImageView Q;
    public final ImageView R;
    public boolean S;
    public Boolean T;
    public final View.OnClickListener U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.p6 f47716a;
    public f4.d f47717a0;
    public final FrameLayout f47718b;
    public final TL_stars.starGiftAttributeBackdrop[] f47719b0;
    public final q3 f47720c;
    public com.google.android.gms.common.api.internal.r f47721c0;
    public final g9[] d;
    public com.google.android.gms.common.api.internal.r f47722d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public com.google.android.gms.common.api.internal.r f47723e0;
    public final LinearLayout[] f47724f;
    public boolean f47725f0;
    public boolean f47726g0;
    public final FrameLayout.LayoutParams[] h;
    public float f47727h0;
    public float f47728i0;
    public float f47729j0;
    public ValueAnimator f47730k0;
    public final ph.x1 f47731l0;
    public final Paint[] m0;
    public final ph.d1 f47732n;
    public final RadialGradient[] f47733n0;
    public final Matrix[] f47734o0;
    public RadialGradient f47735p0;
    public final Matrix f47736q0;
    public final p80[] f47737r;
    public final Paint f47738r0;
    public final p80 f47739s;
    public final TL_stars.starGiftAttributePattern[] f47740s0;
    public final org.telegram.ui.Components.d5[] f47741t0;
    public int f47742u0;
    public float f47743v0;
    public final TextView f47744w;
    public float f47745w0;
    public int f47746x;
    public ValueAnimator f47747x0;
    public final FrameLayout f47748y;
    public final RectF f47749y0;
    public s8 f47750z0;

    public y3(Context context, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable, View.OnClickListener onClickListener, v0 v0Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        int i12;
        float f13;
        int i13;
        ph.k[] kVarArr;
        int i14;
        this.d = new g9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f47724f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f47737r = new p80[5];
        this.D = new p80[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new ph.m0[5];
        this.f47717a0 = new f4.d(0, 0);
        this.f47719b0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.f47731l0 = new ph.x1(this, 21);
        this.m0 = new Paint[3];
        this.f47733n0 = new RadialGradient[3];
        this.f47734o0 = new Matrix[3];
        this.f47736q0 = new Matrix();
        int i15 = 1;
        this.f47738r0 = new Paint(1);
        this.f47740s0 = new TL_stars.starGiftAttributePattern[2];
        this.f47741t0 = new org.telegram.ui.Components.d5[2];
        int i16 = 0;
        while (true) {
            Paint[] paintArr = this.m0;
            if (i16 >= paintArr.length) {
                break;
            }
            paintArr[i16] = new Paint(1);
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Components.d5[] d5VarArr = this.f47741t0;
            f7 = 28.0f;
            if (i17 >= d5VarArr.length) {
                break;
            }
            d5VarArr[i17] = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(28.0f), this);
            i17++;
        }
        this.f47745w0 = 1.0f;
        this.f47749y0 = new RectF();
        this.A0 = new int[12];
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.f47716a = p6Var;
        this.U = onClickListener4;
        this.V = onClickListener5;
        this.W = onClickListener6;
        setWillNotDraw(false);
        this.f47718b = new FrameLayout(context);
        int i18 = 0;
        while (true) {
            g9[] g9VarArr = this.d;
            float f14 = 0.0f;
            f10 = f7;
            if (i18 >= g9VarArr.length) {
                break;
            }
            g9VarArr[i18] = new v3(context, 0);
            this.d[i18].setLayerNum(6660);
            if (i18 > 0) {
                this.d[i18].getImageReceiver().f14407s1 = 1;
            }
            this.f47718b.addView(this.d[i18], w7.b6.e(-1, -1, 119));
            g9 g9Var = this.d[i18];
            if (i18 == 0) {
                f14 = 1.0f;
            }
            g9Var.setAlpha(f14);
            i18++;
            f7 = f10;
        }
        p80 p80Var = new p80(context, null);
        this.f47739s = p80Var;
        p80Var.setTextSize(1, 12.0f);
        p80Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.f47744w = textView;
        textView.setOnClickListener(new t3(this, 0));
        w7.e6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        w7.e6.a(textView2);
        u71 u71Var = new u71(this, context, 22);
        this.H = u71Var;
        u71Var.setOrientation(0);
        this.I = new ph.k[3];
        int i19 = 0;
        while (true) {
            ph.k[] kVarArr2 = this.I;
            if (i19 >= kVarArr2.length) {
                break;
            }
            kVarArr2[i19] = new ph.k(context, 2);
            if (i19 != 0) {
                if (i19 != i15) {
                    if (i19 != 2) {
                        i13 = i15;
                    } else {
                        i13 = i15;
                        this.I[i19].b(2131231169, cd.L0(2131750447, null), false);
                        this.I[i19].setOnClickListener(onClickListener4);
                    }
                } else {
                    i13 = i15;
                    this.I[i19].b(2131231103, cd.L0(2131750434, null), false);
                    this.I[i19].setOnClickListener(onClickListener3);
                }
            } else {
                i13 = i15;
                this.I[i19].b(2131231120, cd.L0(2131750442, null), false);
                this.I[i19].setOnClickListener(onClickListener2);
            }
            this.I[i19].setBackground(org.telegram.ui.ActionBar.t6.b0(0, 285212671, 16, 16));
            w7.e6.b(this.I[i19], 0.075f, 1.5f);
            u71 u71Var2 = this.H;
            ph.k kVar = this.I[i19];
            if (i19 != kVarArr.length - 1) {
                i14 = 11;
            } else {
                i14 = 0;
            }
            u71Var2.addView(kVar, w7.b6.q(0, 56, 1.0f, 119, 0, 0, i14, 0));
            i19++;
            i15 = i13;
        }
        ph.k kVar2 = new ph.k(context, 2);
        this.J = kVar2;
        kVar2.b(2131231093, cd.L0(2131743135, null), false);
        kVar2.setBackground(org.telegram.ui.ActionBar.t6.b0(0, 285212671, 16, 16));
        w7.e6.b(kVar2, 0.075f, 1.5f);
        kVar2.setVisibility(8);
        this.H.addView(kVar2, i15, w7.b6.q(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.f47748y = new FrameLayout(context);
        int i20 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f47724f;
            if (i20 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i20] = new LinearLayout(context);
            this.f47724f[i20].setOrientation(1);
            if (i20 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.K = frameLayout;
                this.f47724f[i20].addView(frameLayout, w7.b6.r(-1, 144, 119));
                g9 g9Var2 = new g9(context);
                this.L = g9Var2;
                g9Var2.setRoundRadius(org.telegram.messenger.i0.L(41.0f));
                frameLayout.addView(g9Var2, w7.b6.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f47737r[i20] = new p80(context, null);
                this.f47737r[i20].setTextColor(-1);
                this.f47737r[i20].setTextSize(1, 20.0f);
                this.f47737r[i20].setTypeface(org.telegram.messenger.i0.o());
                this.f47737r[i20].setSingleLine();
                p80 p80Var2 = this.f47737r[i20];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                p80Var2.setEllipsize(truncateAt);
                this.f47737r[i20].setGravity(17);
                frameLayout.addView(this.f47737r[i20], w7.b6.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.D[i20] = new p80(context, null);
                this.D[i20].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, p6Var));
                this.D[i20].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.H(this.D[i20], org.telegram.ui.ActionBar.t6.Uc, p6Var);
                this.D[i20].setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                this.D[i20].setDisablePaddingsOffsetY(true);
                this.D[i20].setSingleLine();
                this.D[i20].setGravity(17);
                this.D[i20].setEllipsize(truncateAt);
                frameLayout.addView(this.D[i20], w7.b6.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i20 == 4) {
                a3 a3Var = new a3(context, p6Var);
                this.M = a3Var;
                this.f47724f[i20].addView(a3Var, w7.b6.o(-1, -2));
                View view = this.f47724f[i20];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = w7.b6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i20] = d;
                addView(view, d);
                i20++;
            } else {
                this.f47737r[i20] = new p80(context, null);
                if (i20 == 3) {
                    this.f47737r[i20].setTextColor(-1);
                } else {
                    this.f47737r[i20].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, p6Var));
                }
                this.f47737r[i20].setTextSize(1, 20.0f);
                this.f47737r[i20].setTypeface(org.telegram.messenger.i0.o());
                this.f47737r[i20].setGravity(17);
                LinearLayout linearLayout = this.f47724f[i20];
                p80 p80Var3 = this.f47737r[i20];
                if (i20 == 3) {
                    i10 = 10;
                } else {
                    i10 = 0;
                }
                linearLayout.addView(p80Var3, w7.b6.t(-1, -2, 17, 24, i10, 24, 0));
                if (i20 == 0) {
                    this.f47724f[i20].addView(this.f47739s, w7.b6.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f47724f[i20].addView(this.f47744w, w7.b6.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i20 == 0) {
                    this.D[i20] = new p80(context, null);
                    if (i20 == 3) {
                        this.D[i20].setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
                    } else {
                        this.D[i20].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, p6Var));
                    }
                    this.D[i20].setTextSize(1, 14.0f);
                    this.D[i20].setGravity(17);
                    org.telegram.ui.ActionBar.a7.H(this.D[i20], org.telegram.ui.ActionBar.t6.Uc, p6Var);
                    this.D[i20].setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    this.D[i20].setDisablePaddingsOffsetY(true);
                    this.f47748y.addView(this.D[i20], w7.b6.e(-2, -2, 17));
                    this.f47748y.addView(this.O, w7.b6.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout2 = this.f47724f[i20];
                    FrameLayout frameLayout2 = this.f47748y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    if (i20 == 3) {
                        i12 = 6;
                    } else {
                        i12 = 0;
                    }
                    LinearLayout.LayoutParams t10 = w7.b6.t(-1, -2, 17, 24, 0, 24, i12);
                    layoutParamsArr2[i20] = t10;
                    linearLayout2.addView(frameLayout2, t10);
                } else {
                    this.D[i20] = new p80(context, null);
                    if (i20 == 3) {
                        this.D[i20].setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
                    } else {
                        this.D[i20].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, p6Var));
                    }
                    this.D[i20].setTextSize(1, 14.0f);
                    this.D[i20].setGravity(17);
                    org.telegram.ui.ActionBar.a7.H(this.D[i20], org.telegram.ui.ActionBar.t6.Uc, p6Var);
                    this.D[i20].setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    this.D[i20].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.f47724f[i20];
                    p80 p80Var4 = this.D[i20];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    if (i20 == 3) {
                        i11 = 6;
                    } else {
                        i11 = 0;
                    }
                    LinearLayout.LayoutParams t11 = w7.b6.t(-1, -2, 17, 24, 0, 24, i11);
                    layoutParamsArr3[i20] = t11;
                    linearLayout3.addView(p80Var4, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i20];
                if (i20 == 3) {
                    f12 = 6.0f;
                } else {
                    if (i20 == 1) {
                        f11 = 7.33f;
                    } else if (this.f47719b0[0] == null) {
                        f11 = 9.0f;
                    } else {
                        f11 = 5.66f;
                    }
                    f12 = f11 - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.i0.L(f12);
                this.F[i20] = new ph.m0(context);
                this.F[i20].setVisibility(8);
                this.F[i20].setPadding(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(2.0f));
                if (i20 == 0) {
                    this.G = this.F[i20].getTextPaint();
                }
                this.f47724f[i20].addView(this.F[i20], w7.b6.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i20 == 0) {
                this.f47724f[i20].addView(this.H, w7.b6.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f47724f[i20];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            if (i20 == 2) {
                f13 = 32.0f;
            } else {
                f13 = 170.0f;
            }
            ViewGroup.LayoutParams d10 = w7.b6.d(-1, -2.0f, 119, 16.0f, f13, 16.0f, 0.0f);
            layoutParamsArr4[i20] = d10;
            addView(view2, d10);
            i20++;
        }
        addView(this.f47718b, w7.b6.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        q3 q3Var = new q3(context);
        this.f47720c = q3Var;
        addView(q3Var, w7.b6.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(f10), 620756991));
        imageView.setImageResource(2131232095);
        w7.e6.a(imageView);
        addView(imageView, w7.b6.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new og.u(2, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.Q = imageView2;
        imageView2.setImageResource(2131231111);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        w7.e6.a(imageView2);
        if (v0Var != null) {
            addView(imageView2, w7.b6.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(v0Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setContentDescription(cd.L0(2131754878, null));
        imageView3.setImageResource(2131231748);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
        w7.e6.a(imageView3);
        addView(imageView3, w7.b6.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        ph.d1 d1Var = new ph.d1(context);
        this.f47732n = d1Var;
        d1Var.b(cd.L0(2131749762, null), true);
        ph.f1 f1Var = d1Var.f45020a;
        if (f1Var.f45039w == null) {
            s8 s8Var = new s8(2, 12);
            f1Var.f45039w = s8Var;
            s8Var.h = 5.0f;
        }
        Path path = f1Var.f45035f;
        float f15 = f1Var.f45038s;
        f1Var.f45040x = true;
        ph.f1.d(path, f15, true);
        d1Var.setScaleX(1.2f);
        d1Var.setScaleY(1.2f);
        addView(d1Var, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f47747x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f47747x0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f47747x0 = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 1));
        this.f47747x0.addListener(new w3(this, 4));
        this.f47747x0.setDuration(320L);
        this.f47747x0.setInterpolator(gr.f26496g);
        this.f47747x0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.f47742u0;
        RadialGradient[] radialGradientArr = this.f47733n0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f47719b0;
        Matrix[] matrixArr = this.f47734o0;
        Paint[] paintArr = this.m0;
        int i11 = 0;
        if (i10 == 0) {
            if (this.f47743v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.f47717a0.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f7, f10);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i11 = i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f47743v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f47743v0) * this.f47717a0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
            }
            return i11;
        }
        if (this.f47743v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.f47717a0.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f7, f10);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i11 = i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f47743v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.f47717a0.a(1) * 255.0f * this.f47743v0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.b.k(i0.b.o(i0.b.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        return i11;
    }

    public final void c(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10;
        canvas.save();
        canvas.translate(f7, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f47719b0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i11 = 0;
        if (stargiftattributebackdrop == null) {
            i10 = 0;
        } else {
            i10 = stargiftattributebackdrop.pattern_color | (-16777216);
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        if (stargiftattributebackdrop2 != null) {
            i11 = stargiftattributebackdrop2.pattern_color | (-16777216);
        }
        int f13 = i0.b.f(this.f47743v0, i10, i11);
        org.telegram.ui.Components.d5[] d5VarArr = this.f47741t0;
        d5VarArr[1].k(Integer.valueOf(f13));
        j0.a(canvas, 0, d5VarArr[1], f11, f12, this.f47717a0.a(1), this.f47745w0);
        canvas.restore();
    }

    public void d(f4.d dVar) {
        View[] viewArr;
        float f7;
        float f10;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        p80[] p80VarArr;
        int f11;
        float max;
        float a2;
        int i12;
        int i13;
        int i14;
        boolean z12;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        int i17;
        int i18;
        this.f47717a0 = dVar;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            viewArr = this.f47724f;
            if (i20 >= viewArr.length) {
                break;
            }
            float a10 = dVar.a(i20);
            viewArr[i20].setAlpha(a10);
            View view = viewArr[i20];
            if (a10 > 0.0f) {
                i18 = 0;
            } else {
                i18 = 4;
            }
            view.setVisibility(i18);
            i20++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f47719b0;
        if (stargiftattributebackdropArr[0] != null) {
            f7 = dVar.a(2);
        } else {
            f7 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f10 = dVar.a(1);
        } else {
            f10 = 0.0f;
        }
        float max2 = Math.max(f7, f10);
        ImageView imageView = this.P;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && dVar.f6824b == 2) || (stargiftattributebackdropArr[1] != null && dVar.f6824b == 1)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (stargiftattributebackdropArr[0] == null && !this.S) {
            z10 = false;
        } else {
            z10 = true;
        }
        float a11 = dVar.a(0);
        int i21 = dVar.f6824b;
        float V1 = org.telegram.messenger.i0.V1(false, z10, a11);
        ImageView imageView2 = this.R;
        imageView2.setAlpha(V1);
        if (z10 && i21 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        if (stargiftattributebackdropArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.T;
        int i22 = -1;
        org.telegram.ui.ActionBar.p6 p6Var = this.f47716a;
        if (bool == null || bool.booleanValue() != z11) {
            this.T = Boolean.valueOf(z11);
            if (z11) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.J5, p6Var, PorterDuff.Mode.SRC_IN);
                int i23 = org.telegram.ui.ActionBar.t6.f21020i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i23, p6Var), 1, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i23);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
            }
        }
        if (!this.f47726g0) {
            float V12 = org.telegram.messenger.i0.V1(false, this.N, dVar.a(0));
            TextView textView = this.O;
            textView.setAlpha(V12);
            if (this.N) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            textView.setScaleX(org.telegram.messenger.i0.T1(0.4f, f13, dVar.a(0)));
            if (this.N) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleY(org.telegram.messenger.i0.T1(0.4f, f14, dVar.a(0)));
            if (this.N && i21 == 0) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            textView.setVisibility(i17);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        int i24 = 0;
        while (true) {
            p80VarArr = this.D;
            if (i24 >= 2) {
                break;
            }
            p80 p80Var = this.f47737r[i24];
            if (stargiftattributebackdropArr[Math.min(1, i24)] == null) {
                i13 = w02;
            } else {
                i13 = i22;
            }
            p80Var.setTextColor(i13);
            p80 p80Var2 = p80VarArr[i24];
            if (i24 != 0 && i24 != 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                if (stargiftattributebackdrop == null) {
                    i15 = w02;
                } else {
                    i15 = stargiftattributebackdrop.text_color | (-16777216);
                }
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                if (stargiftattributebackdrop2 == null) {
                    i16 = w02;
                } else {
                    i16 = stargiftattributebackdrop2.text_color | (-16777216);
                }
                i14 = i0.b.f(this.f47743v0, i15, i16);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i24];
                if (stargiftattributebackdrop3 == null) {
                    i14 = w02;
                } else {
                    i14 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            p80Var2.setTextColor(i14);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i24];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                if (org.telegram.messenger.i0.L(184.0f) == layoutParamsArr[i24].topMargin && viewArr[i24].getPaddingBottom() == org.telegram.messenger.i0.L(18.0f)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    viewArr[i24].setPadding(0, 0, 0, org.telegram.messenger.i0.L(18.0f));
                    layoutParamsArr[i24].topMargin = org.telegram.messenger.i0.L(184.0f);
                }
            } else {
                if (org.telegram.messenger.i0.L(170.0f) == layoutParamsArr[i24].topMargin && viewArr[i24].getPaddingBottom() == org.telegram.messenger.i0.L(3.0f)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    viewArr[i24].setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
                    layoutParamsArr[i24].topMargin = org.telegram.messenger.i0.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i24];
            if (i24 == 1) {
                f12 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f12 = 9.0f;
            } else {
                f12 = 5.66f;
            }
            layoutParams.topMargin = org.telegram.messenger.i0.L(f12 - 4.0f);
            if (z12) {
                viewArr[i24].setLayoutParams(layoutParamsArr[i24]);
                if (i24 == 0) {
                    this.f47748y.setLayoutParams(layoutParamsArr2[i24]);
                } else {
                    p80VarArr[i24].setLayoutParams(layoutParamsArr2[i24]);
                }
            }
            i24++;
            i22 = -1;
        }
        int L = org.telegram.messenger.i0.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop5 == null) {
            f11 = 553648127;
        } else {
            f11 = i0.b.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216));
        }
        this.f47744w.setBackground(org.telegram.ui.ActionBar.t6.d0(L, f11));
        p80 p80Var3 = p80VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        p80Var3.setTextColor(w02);
        g9[] g9VarArr = this.d;
        g9 g9Var = g9VarArr[0];
        f4.d dVar2 = this.f47717a0;
        if (dVar2.b(0) && dVar2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(dVar2.a(0), dVar2.a(2));
        }
        g9Var.setAlpha(Math.max(max, this.f47717a0.a(3)));
        g9VarArr[1].setAlpha((1.0f - this.f47743v0) * dVar.a(1));
        g9VarArr[2].setAlpha(dVar.a(1) * this.f47743v0);
        float T1 = org.telegram.messenger.i0.T1(1.0f, this.f47729j0, dVar.a(2));
        FrameLayout frameLayout = this.f47718b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.i0.T1(1.0f, this.f47729j0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.f47727h0);
        frameLayout.setTranslationY((dVar.a(2) * this.f47728i0) + (dVar.a(1) * org.telegram.messenger.i0.L(16.0f)));
        View view2 = viewArr[2];
        int i25 = dVar.f6823a;
        if (i25 == 2 && i21 == 2) {
            a2 = 0.0f;
        } else {
            if (i25 != 2) {
                i21 = i25;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i21].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a2);
        if (this.f47725f0 && this.f47717a0.b(0)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ph.d1 d1Var = this.f47732n;
        d1Var.setVisibility(i12);
        d1Var.setAlpha(this.f47717a0.a(0));
        if (dVar.a(4) <= 0.0f) {
            i19 = 8;
        }
        a3 a3Var = this.M;
        a3Var.setVisibility(i19);
        a3Var.setAlpha(dVar.a(4));
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float max;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f7;
        float f10;
        float f11;
        int[] iArr;
        int[] iArr2;
        float f12;
        int i10;
        int[] iArr3;
        y3 y3Var;
        Canvas canvas2;
        q3 q3Var;
        float max2;
        ph.k kVar;
        float realHeight = getRealHeight();
        canvas.save();
        float f13 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f14 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.i0.L(80.0f) + org.telegram.messenger.i0.W1(this.f47717a0.a(1), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(24.0f));
        f4.d dVar = this.f47717a0;
        if ((dVar.b(0) && dVar.b(2)) || ((dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        }
        int i11 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.f47719b0;
        if (i11 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.f47735p0 != null && this.f47717a0.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.m0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f47734o0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.f47733n0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.f47735p0 != null && this.f47717a0.a(2) > 0.0f) {
                Paint paint = this.f47738r0;
                paint.setAlpha((int) (this.f47717a0.a(2) * 255.0f));
                Matrix matrix = this.f47736q0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.f47735p0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.f47717a0.a(1) > 0.0f) {
            f7 = width;
            f10 = L;
            k(b(canvas, f7, f10, getWidth(), realHeight));
        } else {
            f7 = width;
            f10 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.C0;
        int[] iArr5 = this.B0;
        int[] iArr6 = this.A0;
        if (stargiftattributebackdrop != null) {
            int i12 = 0;
            while (i12 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i12] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i12] = i0.b.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i12] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i12++;
                f13 = f13;
                f14 = f14;
            }
        }
        float f15 = f13;
        float f16 = f14;
        q3 q3Var2 = this.f47720c;
        if (q3Var2.f47356s == null && q3Var2.f47357w == null && q3Var2.f47358x == null) {
            y3Var = this;
            f12 = f7;
            f11 = f10;
            iArr = iArr5;
            iArr2 = iArr6;
            i10 = 1;
            q3Var = q3Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f17 = f7;
            k3 k3Var = q3Var2.f47356s;
            float f18 = f10;
            float f19 = q3Var2.f47359y;
            int[] iArr7 = this.B0;
            int[] iArr8 = this.A0;
            int[] iArr9 = this.C0;
            f11 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            f12 = f17;
            i10 = 1;
            iArr3 = iArr4;
            y3Var = this;
            canvas2 = canvas;
            q3Var2.a(canvas2, k3Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            q3Var2.a(canvas2, q3Var2.f47357w, q3Var2.D, width2, realHeight, iArr7, iArr8, iArr9);
            q3Var2.a(canvas2, q3Var2.f47358x, q3Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            q3Var = q3Var2;
            y3Var.invalidate();
        }
        if (i11 > 0 && stargiftattributebackdropArr[0] != null) {
            int i13 = iArr3[iArr3.length / 2];
            f4.d dVar2 = y3Var.f47717a0;
            if (dVar2.b(0) && dVar2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(dVar2.a(0), dVar2.a(3));
            }
            int i14 = (max2 > f15 ? 1 : (max2 == f15 ? 0 : -1));
            org.telegram.ui.Components.d5[] d5VarArr = y3Var.f47741t0;
            if (i14 > 0) {
                canvas2.save();
                canvas2.translate(f12, f11);
                d5VarArr[0].k(Integer.valueOf(i13));
                j0.a(canvas, 0, d5VarArr[0], y3Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (y3Var.f47717a0.a(2) > f15) {
                canvas.save();
                d5VarArr[0].k(Integer.valueOf(i13));
                float f20 = realHeight;
                RectF rectF = org.telegram.messenger.i0.P;
                LinearLayout[] linearLayoutArr = y3Var.f47724f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = y3Var.K;
                float x11 = frameLayout.getX() + x10;
                g9 g9Var = y3Var.L;
                rectF.set(g9Var.getX() + x11, g9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), g9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + g9Var.getWidth(), g9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + g9Var.getHeight());
                j0.c(canvas, d5VarArr[0], y3Var.getWidth(), f20 * 0.7f, 1.0f, rectF, y3Var.f47717a0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i15 = 0;
            while (true) {
                ph.k[] kVarArr = y3Var.I;
                if (i15 > kVarArr.length) {
                    break;
                }
                if (i15 < kVarArr.length) {
                    kVar = kVarArr[i15];
                } else {
                    kVar = y3Var.J;
                }
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.t6.H1(kVar.getBackground(), iArr10[Utilities.j(Math.round((((kVar.getWidth() / f16) + kVar.getX()) / y3Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    kVar.invalidate();
                }
                i15++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i16 = iArr11[iArr11.length / 2];
            int i17 = iArr12[iArr12.length / 2];
            TextView textView = y3Var.f47744w;
            if (textView != null && y3Var.f47746x != i16) {
                y3Var.f47746x = i16;
                textView.setTextColor(i16);
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), i17, false);
            }
            if (q3Var.f47356s != null || q3Var.f47357w != null || q3Var.f47358x != null) {
                y3Var.D[0].setTextColor(i16);
            }
            if (y3Var.f47717a0.a(2) > f15) {
                if (y3Var.f47750z0 == null) {
                    y3Var.f47750z0 = new s8(i10, 12);
                }
                FrameLayout frameLayout2 = y3Var.f47718b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f16) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f16;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f16) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f16;
                float f21 = measuredHeight + scaleY;
                RectF rectF2 = y3Var.f47749y0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f21);
                y3Var.f47750z0.g(rectF2);
                y3Var.f47750z0.d();
                y3Var.f47750z0.a(canvas2, org.telegram.ui.ActionBar.t6.r1(y3Var.f47717a0.a(2), -1));
                y3Var.invalidate();
            }
        }
        if (y3Var.f47717a0.a(1) > f15) {
            y3Var.c(canvas2, f12, f11, y3Var.getWidth(), y3Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.f47733n0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.f47735p0 = radialGradient2;
            this.f47738r0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f47734o0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.m0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        sf.b bVar;
        sf.a resellAmount;
        boolean z14;
        int i10;
        int i11;
        this.N = false;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        boolean z15 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i12 = 8;
        u71 u71Var = this.H;
        p80[] p80VarArr = this.D;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f47719b0;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) e6.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) e6.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            p80VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i12 = 0;
            }
            u71Var.setVisibility(i12);
            ph.k[] kVarArr = this.I;
            kVarArr[2].setVisibility(0);
            if (z13) {
                ph.k kVar = kVarArr[1];
                if (z12) {
                    i10 = 2131231102;
                } else {
                    i10 = 2131231103;
                }
                if (z12) {
                    i11 = 2131750431;
                } else {
                    i11 = 2131750434;
                }
                kVar.b(i10, cd.L0(i11, null), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.N = true;
                boolean z16 = starGift.resale_ton_only;
                sf.b bVar2 = sf.b.f48257b;
                if (z16) {
                    bVar = bVar2;
                } else {
                    bVar = sf.b.f48256a;
                }
                if (starGift.getResellAmount(bVar).f48254a == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence V = cd.V(null, null, 2131749690, h8.U0("⭐️ " + ((Object) h8.L0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.O;
                textView.setText(V);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (e4.K1(d20.f15147s0, org.telegram.messenger.o5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new t3(this, 1));
                    w7.e6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                kVarArr[0].setAlpha(1.0f);
                kVarArr[0].b(2131231120, cd.L0(2131750442, null), false);
            } else {
                kVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new dq(2131232241, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) cd.L0(2131750442, null));
                kVarArr[0].b(2131231120, spannableStringBuilder, false);
            }
            ph.k kVar2 = kVarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            kVar2.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.V;
                if (arrayList != null) {
                    kVarArr[2].b(2131231118, cd.L0(2131750441, null), false);
                    kVarArr[2].setOnClickListener(onClickListener);
                } else {
                    kVarArr[2].b(2131231119, cd.L0(2131750455, null), false);
                    kVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                kVarArr[2].b(2131231169, cd.L0(2131750447, null), false);
                kVarArr[2].setOnClickListener(this.U);
            }
            this.f47725f0 = starGift.crafted;
            this.f47732n.f45020a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            p80VarArr[0].setTextSize(1, 14.0f);
            this.f47725f0 = false;
            u71Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        h8.c1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) e6.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.f47717a0);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f47740s0;
            if (stargiftattributepatternArr[i10] != stargiftattributepattern) {
                stargiftattributepatternArr[i10] = stargiftattributepattern;
                this.f47741t0[i10].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.f47717a0.d(0);
        float f7 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f47719b0;
        LinearLayout[] linearLayoutArr = this.f47724f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(f7);
        } else if (this.f47717a0.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(f7);
        } else {
            if (this.f47717a0.d(2)) {
                L = org.telegram.messenger.i0.L(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.f47717a0.d(3)) {
                L = org.telegram.messenger.i0.L(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.f47717a0.d(4)) {
                return 0;
            } else {
                a3 a3Var = this.M;
                if (a3Var.getMeasuredHeight() > 0) {
                    return a3Var.getMeasuredHeight();
                }
                return org.telegram.messenger.i0.L(550.0f);
            }
            return measuredHeight + L;
        }
    }

    public float getRealHeight() {
        float f7;
        float f10;
        int L;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f47719b0;
        float f11 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f7 = 24.0f;
        } else {
            f7 = 10.0f;
        }
        int L2 = org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(f7);
        LinearLayout[] linearLayoutArr = this.f47724f;
        float a2 = (this.f47717a0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int L3 = org.telegram.messenger.i0.L(160.0f) + org.telegram.messenger.i0.L(f10);
        float a10 = (this.f47717a0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.i0.L(64.0f))) + (this.f47717a0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + L3)) + a2;
        if (stargiftattributebackdropArr[0] != null) {
            f11 = 24.0f;
        }
        int L4 = org.telegram.messenger.i0.L(f11);
        float a11 = (this.f47717a0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.i0.L(160.0f) + L4)) + a10;
        a3 a3Var = this.M;
        if (a3Var.getMeasuredHeight() > 0) {
            L = a3Var.getMeasuredHeight();
        } else {
            L = org.telegram.messenger.i0.L(550.0f);
        }
        return (this.f47717a0.a(4) * L) + a11;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i10 = (this.f47743v0 > 0.5f ? 1 : (this.f47743v0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.f47719b0;
        if (i10 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public g9 getUpgradeImageView() {
        int i10 = (this.f47743v0 > 0.5f ? 1 : (this.f47743v0 == 0.5f ? 0 : -1));
        g9[] g9VarArr = this.d;
        if (i10 > 0) {
            return g9VarArr[2];
        }
        return g9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i10 = (this.f47743v0 > 0.5f ? 1 : (this.f47743v0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        if (i10 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f47740s0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i11;
        int i12;
        this.f47737r[i10].setText(charSequence);
        FrameLayout frameLayout = this.f47748y;
        p80[] p80VarArr = this.D;
        p80 p80Var = this.f47739s;
        TextView textView = this.f47744w;
        int i13 = 0;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            p80Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                p80VarArr[i10].setVisibility(8);
            }
        } else if (i10 == 0 && !TextUtils.isEmpty(charSequence3)) {
            p80Var.setText(charSequence3);
            p80Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                p80VarArr[i10].setVisibility(8);
            }
        } else {
            p80VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
            } else {
                p80 p80Var2 = p80VarArr[i10];
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                p80Var2.setVisibility(i11);
            }
            p80Var.setVisibility(8);
            textView.setVisibility(8);
        }
        ph.m0[] m0VarArr = this.F;
        ph.m0 m0Var = m0VarArr[i10];
        if (m0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i13 = 8;
            }
            m0Var.setVisibility(i13);
            m0VarArr[i10].setUser(tLObject);
            m0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        int i10;
        u71 u71Var = this.H;
        u71Var.setVisibility(0);
        ph.k[] kVarArr = this.I;
        kVarArr[0].setAlpha(1.0f);
        kVarArr[0].b(2131231120, cd.L0(2131750442, null), false);
        kVarArr[0].setOnClickListener(onClickListener);
        if (onClickListener2 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ph.k kVar = this.J;
        kVar.setVisibility(i10);
        kVar.setOnClickListener(onClickListener2);
        kVarArr[1].b(2131231103, cd.L0(2131750434, null), false);
        kVarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) kVarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        kVarArr[2].setVisibility(8);
        u71Var.requestLayout();
    }

    public final void l() {
        p80[] p80VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        p80 p80Var;
        int i10;
        int i11;
        int i12;
        int i13;
        p80[] p80VarArr2 = this.f47737r;
        if (p80VarArr2 != null && (p80VarArr = this.D) != null && (stargiftattributebackdropArr = this.f47719b0) != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, this.f47716a);
            for (int i14 = 0; i14 < 2; i14++) {
                p80 p80Var2 = p80VarArr2[i14];
                if (p80Var2 != null && p80VarArr[i14] != null) {
                    if (stargiftattributebackdropArr[Math.min(1, i14)] == null) {
                        i10 = w02;
                    } else {
                        i10 = -1;
                    }
                    p80Var2.setTextColor(i10);
                    p80 p80Var3 = p80VarArr[i14];
                    if (i14 != 0 && i14 != 2) {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                        if (stargiftattributebackdrop == null) {
                            i12 = w02;
                        } else {
                            i12 = stargiftattributebackdrop.text_color | (-16777216);
                        }
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                        if (stargiftattributebackdrop2 == null) {
                            i13 = w02;
                        } else {
                            i13 = (-16777216) | stargiftattributebackdrop2.text_color;
                        }
                        i11 = i0.b.f(this.f47743v0, i12, i13);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i14];
                        if (stargiftattributebackdrop3 == null) {
                            i11 = w02;
                        } else {
                            i11 = (-16777216) | stargiftattributebackdrop3.text_color;
                        }
                    }
                    p80Var3.setTextColor(i11);
                }
            }
            if (p80VarArr.length > 2 && (p80Var = p80VarArr[2]) != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
                if (stargiftattributebackdrop4 != null) {
                    w02 = stargiftattributebackdrop4.text_color | (-16777216);
                }
                p80Var.setTextColor(w02);
            }
        }
    }

    public final void m() {
        this.f47729j0 = org.telegram.messenger.i0.N(33.33f) / org.telegram.messenger.i0.N(160.0f);
        FrameLayout frameLayout = this.f47718b;
        p80[] p80VarArr = this.f47737r;
        this.f47727h0 = ((((Math.min(p80VarArr[2].getPaint().measureText(p80VarArr[2].getText().toString()), p80VarArr[2].getWidth()) + p80VarArr[2].getWidth()) / 2.0f) + (p80VarArr[2].getX() + (-frameLayout.getLeft()))) + org.telegram.messenger.i0.L(24.0f)) - (org.telegram.messenger.i0.L(126.67f) / 2.0f);
        this.f47728i0 = (org.telegram.messenger.i0.L(124.0f) + (-frameLayout.getTop())) - (org.telegram.messenger.i0.L(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.d5[] d5VarArr = this.f47741t0;
        d5VarArr[0].a();
        d5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.d5[] d5VarArr = this.f47741t0;
        d5VarArr[0].b();
        d5VarArr[1].b();
        org.telegram.messenger.i0.r(this.f47731l0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f47717a0.b(2)) {
            m();
            d(this.f47717a0);
        }
    }

    public void setPreviewAttributes(o0 o0Var) {
        f4.d dVar = this.f47717a0;
        if (dVar != null && dVar.f6824b == 1 && isAttachedToWindow()) {
            org.telegram.messenger.i0.r(this.f47731l0);
            ValueAnimator valueAnimator = this.f47730k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f47730k0 = null;
            }
            int i10 = 1 - this.f47742u0;
            this.f47742u0 = i10;
            g9[] g9VarArr = this.d;
            bi0 B = g9VarArr[2 - i10].getImageReceiver().B();
            bi0 B2 = g9VarArr[this.f47742u0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i11 = this.f47742u0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f47272a;
            this.f47719b0[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, o0Var.f47273b, true);
            int i12 = this.f47742u0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f47274c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            h8.b1(g9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.f47742u0 + 1].document, 160);
            a();
            float f7 = this.f47742u0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.f47730k0 = ofFloat;
            ofFloat.addUpdateListener(new u3(this, 0));
            this.f47730k0.addListener(new w3(this, 3));
            this.f47730k0.setDuration(320L);
            this.f47730k0.setInterpolator(gr.h);
            this.f47730k0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.f47721c0 = new com.google.android.gms.common.api.internal.r(e6.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f47722d0 = new com.google.android.gms.common.api.internal.r(e6.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f47723e0 = new com.google.android.gms.common.api.internal.r(e6.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.D[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.f47743v0 = 0.0f;
        this.f47742u0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f47722d0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.f47721c0.c();
        g9[] g9VarArr = this.d;
        h8.b1(g9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f47723e0.c();
        this.f47719b0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.f47721c0.f4480f;
        h8.b1(g9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        ph.x1 x1Var = this.f47731l0;
        org.telegram.messenger.i0.r(x1Var);
        org.telegram.messenger.i0.h3(x1Var, 2500L);
        invalidate();
    }

    public void setResellPrice(sf.a aVar) {
        boolean z10;
        boolean z11;
        boolean k10 = aVar.k();
        this.N = !k10;
        p80[] p80VarArr = this.D;
        TextView textView = this.O;
        boolean z12 = true;
        if (!k10) {
            if (aVar.f48254a == sf.b.f48257b) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            int i10 = z11;
            Object[] objArr = new Object[i10];
            objArr[0] = h8.W0(z12, "⭐️ " + ((Object) h8.L0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f);
            textView.setText(cd.V(null, null, 2131749690, objArr));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f47719b0[0];
            textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), i0.b.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f47726g0 = i10;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).setListener(new w3(this, 0)).start();
            p80VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(grVar).start();
            z10 = i10;
        } else {
            z10 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).setListener(new w3(this, 2)).setListener(new w3(this, 1)).start();
            p80VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(grVar2).start();
        }
        boolean z13 = this.N;
        ph.k[] kVarArr = this.I;
        if (z13) {
            kVarArr[2].b(2131231118, cd.L0(2131750441, null), z10);
        } else {
            kVarArr[2].b(2131231119, cd.L0(2131750455, null), z10);
        }
        kVarArr[2].setOnClickListener(this.V);
    }

    public void setShowOptions(boolean z10) {
        this.S = z10;
        d(this.f47717a0);
    }

    public void setWalletCard(boolean z10) {
        int i10;
        int i11;
        ph.k kVar = this.I[1];
        if (z10) {
            i10 = 2131231095;
        } else {
            i10 = 2131231092;
        }
        if (z10) {
            i11 = 2131743128;
        } else {
            i11 = 2131743136;
        }
        kVar.b(i10, cd.L0(i11, null), false);
    }

    public void setWalletDisplayed(boolean z10) {
        float f7;
        ph.k kVar = this.I[1];
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        kVar.setAlpha(f7);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = h20.p((TLRPC.User) tLObject);
            str = cd.L0(2131747842, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.w3.V(chat)) {
                int i10 = chat.participants_count;
                if (i10 > 1) {
                    lowerCase = cd.H(',', "Subscribers", i10);
                } else {
                    lowerCase = cd.L0(2131751391, null);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 > 1) {
                    lowerCase = cd.H(',', "Members", i11);
                } else {
                    lowerCase = cd.L0(2131754876, null).toLowerCase();
                }
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        this.L.e(tLObject, r8Var);
        this.f47737r[2].setText(str2);
        this.D[2].setText(str);
        m();
        d(this.f47717a0);
    }

    public void k(int i10) {
    }
}
