package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.bc1;
public class v3 extends FrameLayout {
    public final LinearLayout.LayoutParams[] E;
    public final xh.l0[] F;
    public final TextPaint G;
    public final bc1 H;
    public final u3[] I;
    public final FrameLayout J;
    public final w9 K;
    public final y2 L;
    public boolean M;
    public final TextView N;
    public final ImageView O;
    public final ImageView P;
    public final ImageView Q;
    public final View.OnClickListener R;
    public final View.OnClickListener S;
    public final View.OnClickListener T;
    public f4.d U;
    public final TL_stars.starGiftAttributeBackdrop[] V;
    public com.google.android.gms.common.api.internal.r W;
    public final org.telegram.ui.ActionBar.e6 f48109a;
    public com.google.android.gms.common.api.internal.r f48110a0;
    public final FrameLayout f48111b;
    public com.google.android.gms.common.api.internal.r f48112b0;
    public final n3 f48113c;
    public boolean f48114c0;
    public final w9[] d;
    public boolean f48115d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public float f48116e0;
    public final LinearLayout[] f48117f;
    public float f48118f0;
    public float f48119g0;
    public final FrameLayout.LayoutParams[] h;
    public ValueAnimator f48120h0;
    public final w2 f48121i0;
    public final Paint[] f48122j0;
    public final RadialGradient[] f48123k0;
    public final Matrix[] f48124l0;
    public RadialGradient m0;
    public final xh.k1 f48125n;
    public final Matrix f48126n0;
    public final Paint f48127o0;
    public final TL_stars.starGiftAttributePattern[] f48128p0;
    public final org.telegram.ui.Components.o5[] f48129q0;
    public final l90[] f48130r;
    public int f48131r0;
    public final l90 f48132s;
    public float f48133s0;
    public float f48134t0;
    public ValueAnimator f48135u0;
    public final TextView v;
    public final RectF f48136v0;
    public int f48137w;
    public i8 f48138w0;
    public final FrameLayout f48139x;
    public final int[] f48140x0;
    public final l90[] f48141y;
    public final int[] f48142y0;
    public final int[] f48143z0;

    public v3(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, View.OnClickListener onClickListener, u0 u0Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        this.d = new w9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f48117f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f48130r = new l90[5];
        this.f48141y = new l90[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new xh.l0[5];
        this.U = new f4.d(0, 0);
        this.V = new TL_stars.starGiftAttributeBackdrop[3];
        this.f48121i0 = new w2(this, 1);
        this.f48122j0 = new Paint[3];
        this.f48123k0 = new RadialGradient[3];
        this.f48124l0 = new Matrix[3];
        this.f48126n0 = new Matrix();
        this.f48127o0 = new Paint(1);
        this.f48128p0 = new TL_stars.starGiftAttributePattern[2];
        this.f48129q0 = new org.telegram.ui.Components.o5[2];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f48122j0;
            if (i10 >= paintArr.length) {
                break;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.o5[] o5VarArr = this.f48129q0;
            if (i11 >= o5VarArr.length) {
                break;
            }
            o5VarArr[i11] = new org.telegram.ui.Components.o5(AndroidUtilities.dp(28.0f), this);
            i11++;
        }
        this.f48134t0 = 1.0f;
        this.f48136v0 = new RectF();
        this.f48140x0 = new int[12];
        this.f48142y0 = new int[12];
        this.f48143z0 = new int[12];
        this.f48109a = e6Var;
        this.R = onClickListener4;
        this.S = onClickListener5;
        this.T = onClickListener6;
        setWillNotDraw(false);
        this.f48111b = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            w9[] w9VarArr = this.d;
            float f10 = 0.0f;
            if (i12 >= w9VarArr.length) {
                break;
            }
            w9VarArr[i12] = new ci.v3(context, 1);
            this.d[i12].setLayerNum(6660);
            if (i12 > 0) {
                this.d[i12].getImageReceiver().setCrossfadeDuration(1);
            }
            this.f48111b.addView(this.d[i12], w7.y5.e(-1, -1, 119));
            w9 w9Var = this.d[i12];
            if (i12 == 0) {
                f10 = 1.0f;
            }
            w9Var.setAlpha(f10);
            i12++;
        }
        l90 l90Var = new l90(context, null);
        this.f48132s = l90Var;
        l90Var.setTextSize(1, 12.0f);
        l90Var.setGravity(17);
        l90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, e6Var));
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, e6Var));
        l90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new q3(this, 0));
        w7.a6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.N = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        w7.a6.a(textView2);
        bc1 bc1Var = new bc1(this, context, 19);
        this.H = bc1Var;
        bc1Var.setOrientation(0);
        this.I = new u3[3];
        int i13 = 0;
        while (true) {
            u3[] u3VarArr = this.I;
            if (i13 >= u3VarArr.length) {
                break;
            }
            u3 u3Var = new u3(context);
            ImageView imageView = new ImageView(context);
            u3Var.f48084b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            u3Var.addView(imageView, w7.y5.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            u3Var.f48085c = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            u3Var.addView(textView3, w7.y5.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            u3VarArr[i13] = u3Var;
            if (i13 == 0) {
                this.I[i13].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.I[i13].setOnClickListener(onClickListener2);
            } else if (i13 == 1) {
                this.I[i13].b(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.I[i13].setOnClickListener(onClickListener3);
            } else if (i13 == 2) {
                this.I[i13].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.I[i13].setOnClickListener(onClickListener4);
            }
            this.I[i13].setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
            w7.a6.b(this.I[i13], 0.075f, 1.5f);
            bc1 bc1Var2 = this.H;
            u3[] u3VarArr2 = this.I;
            bc1Var2.addView(u3VarArr2[i13], w7.y5.p(0, 56, 1.0f, 119, 0, 0, i13 != u3VarArr2.length - 1 ? 11 : 0, 0));
            i13++;
        }
        this.f48139x = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f48117f;
            if (i14 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i14] = new LinearLayout(context);
            this.f48117f[i14].setOrientation(1);
            if (i14 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.J = frameLayout;
                this.f48117f[i14].addView(frameLayout, w7.y5.q(-1, 144, 119));
                w9 w9Var2 = new w9(context);
                this.K = w9Var2;
                w9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(w9Var2, w7.y5.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.f48130r[i14] = new l90(context, null);
                this.f48130r[i14].setTextColor(-1);
                this.f48130r[i14].setTextSize(1, 20.0f);
                this.f48130r[i14].setTypeface(AndroidUtilities.bold());
                this.f48130r[i14].setSingleLine();
                l90 l90Var2 = this.f48130r[i14];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                l90Var2.setEllipsize(truncateAt);
                this.f48130r[i14].setGravity(17);
                frameLayout.addView(this.f48130r[i14], w7.y5.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.f48141y[i14] = new l90(context, null);
                this.f48141y[i14].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19169j5, e6Var));
                this.f48141y[i14].setTextSize(1, 14.0f);
                this.f48141y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, e6Var));
                this.f48141y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f48141y[i14].setDisablePaddingsOffsetY(true);
                this.f48141y[i14].setSingleLine();
                this.f48141y[i14].setGravity(17);
                this.f48141y[i14].setEllipsize(truncateAt);
                frameLayout.addView(this.f48141y[i14], w7.y5.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i14 == 4) {
                y2 y2Var = new y2(context, e6Var);
                this.L = y2Var;
                this.f48117f[i14].addView(y2Var, w7.y5.n(-1, -2));
                View view = this.f48117f[i14];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = w7.y5.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i14] = d;
                addView(view, d);
                i14++;
            } else {
                this.f48130r[i14] = new l90(context, null);
                this.f48130r[i14].setTextColor(i14 == 3 ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19169j5, e6Var));
                this.f48130r[i14].setTextSize(1, 20.0f);
                this.f48130r[i14].setTypeface(AndroidUtilities.bold());
                this.f48130r[i14].setGravity(17);
                this.f48117f[i14].addView(this.f48130r[i14], w7.y5.t(-1, -2, 17, 24, i14 == 3 ? 10 : 0, 24, 0));
                if (i14 == 0) {
                    this.f48117f[i14].addView(this.f48132s, w7.y5.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f48117f[i14].addView(this.v, w7.y5.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i14 == 0) {
                    this.f48141y[i14] = new l90(context, null);
                    this.f48141y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.j6.l1(0.75f, -1) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19169j5, e6Var));
                    this.f48141y[i14].setTextSize(1, 14.0f);
                    this.f48141y[i14].setGravity(17);
                    this.f48141y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, e6Var));
                    this.f48141y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f48141y[i14].setDisablePaddingsOffsetY(true);
                    this.f48139x.addView(this.f48141y[i14], w7.y5.e(-2, -2, 17));
                    this.f48139x.addView(this.N, w7.y5.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f48117f[i14];
                    FrameLayout frameLayout2 = this.f48139x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    LinearLayout.LayoutParams t10 = w7.y5.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr2[i14] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.f48141y[i14] = new l90(context, null);
                    this.f48141y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.j6.l1(0.75f, -1) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19169j5, e6Var));
                    this.f48141y[i14].setTextSize(1, 14.0f);
                    this.f48141y[i14].setGravity(17);
                    this.f48141y[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, e6Var));
                    this.f48141y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f48141y[i14].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f48117f[i14];
                    l90 l90Var3 = this.f48141y[i14];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    LinearLayout.LayoutParams t11 = w7.y5.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr3[i14] = t11;
                    linearLayout2.addView(l90Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i14];
                if (i14 == 3) {
                    f7 = 6.0f;
                } else {
                    f7 = (i14 == 1 ? 7.33f : this.V[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f7);
                this.F[i14] = new xh.l0(context);
                this.F[i14].setVisibility(8);
                this.F[i14].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i14 == 0) {
                    this.G = this.F[i14].getTextPaint();
                }
                this.f48117f[i14].addView(this.F[i14], w7.y5.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i14 == 0) {
                this.f48117f[i14].addView(this.H, w7.y5.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f48117f[i14];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = w7.y5.d(-1, -2.0f, 119, 16.0f, i14 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i14] = d10;
            addView(view2, d10);
            i14++;
        }
        addView(this.f48111b, w7.y5.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        n3 n3Var = new n3(context);
        this.f48113c = n3Var;
        addView(n3Var, w7.y5.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(28.0f), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        w7.a6.a(imageView2);
        addView(imageView2, w7.y5.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView2.setOnClickListener(new bi.p(6, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        w7.a6.a(imageView3);
        if (u0Var != null) {
            addView(imageView3, w7.y5.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView3.setOnClickListener(u0Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.Q = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        w7.a6.a(imageView4);
        addView(imageView4, w7.y5.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        xh.k1 k1Var = new xh.k1(context);
        this.f48125n = k1Var;
        k1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        xh.m1 m1Var = k1Var.f46223a;
        if (m1Var.f46263f == null) {
            i8 i8Var = new i8(2, 12);
            m1Var.f46263f = i8Var;
            i8Var.h = 5.0f;
        }
        Path path = m1Var.f46262c;
        float f11 = m1Var.e;
        m1Var.f46264g = true;
        xh.m1.c(path, f11, true);
        k1Var.setScaleX(1.2f);
        k1Var.setScaleY(1.2f);
        addView(k1Var, w7.y5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        k1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f48135u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48135u0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f48135u0 = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.f48135u0.addListener(new s3(this, 4));
        this.f48135u0.setDuration(320L);
        this.f48135u0.setInterpolator(qr.f27716g);
        this.f48135u0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.f48131r0;
        RadialGradient[] radialGradientArr = this.f48123k0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        Matrix[] matrixArr = this.f48124l0;
        Paint[] paintArr = this.f48122j0;
        int i11 = 0;
        if (i10 == 0) {
            if (this.f48133s0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.U.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f7, f10);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f48133s0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f48133s0) * this.U.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
            }
            return i11;
        }
        if (this.f48133s0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.U.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f7, f10);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f48133s0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.U.a(1) * 255.0f * this.f48133s0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[2];
            return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        return i11;
    }

    public final void c(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10;
        canvas.save();
        canvas.translate(f7, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
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
        int d = i0.a.d(this.f48133s0, i10, i11);
        org.telegram.ui.Components.o5[] o5VarArr = this.f48129q0;
        o5VarArr[1].k(Integer.valueOf(d));
        j0.a(canvas, 0, o5VarArr[1], f11, f12, this.U.a(1), this.f48134t0);
        canvas.restore();
    }

    public void d(f4.d dVar) {
        View[] viewArr;
        float f7;
        float f10;
        int i10;
        boolean z10;
        int i11;
        l90[] l90VarArr;
        int d;
        float max;
        float a2;
        int i12;
        int i13;
        int i14;
        boolean z11;
        float f11;
        int i15;
        int i16;
        float f12;
        float f13;
        int i17;
        int i18;
        this.U = dVar;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            viewArr = this.f48117f;
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
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
        ImageView imageView = this.O;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && dVar.f8875b == 2) || (stargiftattributebackdropArr[1] != null && dVar.f8875b == 1)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (stargiftattributebackdropArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a11 = dVar.a(0);
        int i21 = dVar.f8875b;
        float lerp = AndroidUtilities.lerp(false, z10, a11);
        ImageView imageView2 = this.Q;
        imageView2.setAlpha(lerp);
        if (stargiftattributebackdropArr[0] != null && i21 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        if (!this.f48115d0) {
            float lerp2 = AndroidUtilities.lerp(false, this.M, dVar.a(0));
            TextView textView = this.N;
            textView.setAlpha(lerp2);
            if (this.M) {
                f12 = 1.0f;
            } else {
                f12 = 0.4f;
            }
            textView.setScaleX(AndroidUtilities.lerp(0.4f, f12, dVar.a(0)));
            if (this.M) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            textView.setScaleY(AndroidUtilities.lerp(0.4f, f13, dVar.a(0)));
            if (this.M && i21 == 0) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            textView.setVisibility(i17);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19169j5, this.f48109a);
        int i22 = 0;
        while (true) {
            l90VarArr = this.f48141y;
            if (i22 >= 2) {
                break;
            }
            l90 l90Var = this.f48130r[i22];
            if (stargiftattributebackdropArr[Math.min(1, i22)] == null) {
                i13 = v02;
            } else {
                i13 = -1;
            }
            l90Var.setTextColor(i13);
            l90 l90Var2 = l90VarArr[i22];
            if (i22 != 0 && i22 != 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                if (stargiftattributebackdrop == null) {
                    i15 = v02;
                } else {
                    i15 = stargiftattributebackdrop.text_color | (-16777216);
                }
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                if (stargiftattributebackdrop2 == null) {
                    i16 = v02;
                } else {
                    i16 = stargiftattributebackdrop2.text_color | (-16777216);
                }
                i14 = i0.a.d(this.f48133s0, i15, i16);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i22];
                if (stargiftattributebackdrop3 == null) {
                    i14 = v02;
                } else {
                    i14 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            l90Var2.setTextColor(i14);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i22];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                if (AndroidUtilities.dp(184.0f) == layoutParamsArr[i22].topMargin && viewArr[i22].getPaddingBottom() == AndroidUtilities.dp(18.0f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    viewArr[i22].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                    layoutParamsArr[i22].topMargin = AndroidUtilities.dp(184.0f);
                }
            } else {
                if (AndroidUtilities.dp(170.0f) == layoutParamsArr[i22].topMargin && viewArr[i22].getPaddingBottom() == AndroidUtilities.dp(3.0f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    viewArr[i22].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    layoutParamsArr[i22].topMargin = AndroidUtilities.dp(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            LinearLayout.LayoutParams layoutParams = layoutParamsArr2[i22];
            if (i22 == 1) {
                f11 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f11 = 9.0f;
            } else {
                f11 = 5.66f;
            }
            layoutParams.topMargin = AndroidUtilities.dp(f11 - 4.0f);
            if (z11) {
                viewArr[i22].setLayoutParams(layoutParamsArr[i22]);
                if (i22 == 0) {
                    this.f48139x.setLayoutParams(layoutParamsArr2[i22]);
                } else {
                    l90VarArr[i22].setLayoutParams(layoutParamsArr2[i22]);
                }
            }
            i22++;
        }
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop5 == null) {
            d = 553648127;
        } else {
            d = i0.a.d(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216));
        }
        this.v.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, d));
        l90 l90Var3 = l90VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        l90Var3.setTextColor(v02);
        w9[] w9VarArr = this.d;
        w9 w9Var = w9VarArr[0];
        f4.d dVar2 = this.U;
        if (dVar2.b(0) && dVar2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(dVar2.a(0), dVar2.a(2));
        }
        w9Var.setAlpha(Math.max(max, this.U.a(3)));
        w9VarArr[1].setAlpha((1.0f - this.f48133s0) * dVar.a(1));
        w9VarArr[2].setAlpha(dVar.a(1) * this.f48133s0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.f48119g0, dVar.a(2));
        FrameLayout frameLayout = this.f48111b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.f48119g0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.f48116e0);
        frameLayout.setTranslationY((dVar.a(2) * this.f48118f0) + (dVar.a(1) * AndroidUtilities.dp(16.0f)));
        View view2 = viewArr[2];
        int i23 = dVar.f8874a;
        if (i23 == 2 && i21 == 2) {
            a2 = 0.0f;
        } else {
            if (i23 != 2) {
                i21 = i23;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i21].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a2);
        if (this.f48114c0 && this.U.b(0)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        xh.k1 k1Var = this.f48125n;
        k1Var.setVisibility(i12);
        k1Var.setAlpha(this.U.a(0));
        if (dVar.a(4) <= 0.0f) {
            i19 = 8;
        }
        y2 y2Var = this.L;
        y2Var.setVisibility(i19);
        y2Var.setAlpha(dVar.a(4));
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
        int[] iArr3;
        float f12;
        v3 v3Var;
        Canvas canvas2;
        n3 n3Var;
        float max2;
        float realHeight = getRealHeight();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.U.a(1));
        f4.d dVar = this.U;
        if ((dVar.b(0) && dVar.b(2)) || ((dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.V;
        int i10 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        if (i10 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.m0 != null && this.U.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f48122j0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f48124l0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.f48123k0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.m0 != null && this.U.a(2) > 0.0f) {
                Paint paint = this.f48127o0;
                paint.setAlpha((int) (this.U.a(2) * 255.0f));
                Matrix matrix = this.f48126n0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.m0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        } else {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        }
        if (this.U.a(1) > 0.0f) {
            f7 = width;
            f10 = dp;
            j(b(canvas, f7, f10, getWidth(), realHeight));
        } else {
            f7 = width;
            f10 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.f48143z0;
        int[] iArr5 = this.f48142y0;
        int[] iArr6 = this.f48140x0;
        if (stargiftattributebackdrop != null) {
            for (int i11 = 0; i11 < iArr6.length; i11++) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i11] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i11] = i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i11] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
            }
        }
        n3 n3Var2 = this.f48113c;
        if (n3Var2.f47758s == null && n3Var2.v == null && n3Var2.f47759w == null) {
            v3Var = this;
            f12 = f7;
            f11 = f10;
            iArr3 = iArr4;
            iArr = iArr5;
            iArr2 = iArr6;
            n3Var = n3Var2;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f13 = f7;
            h3 h3Var = n3Var2.f47758s;
            float f14 = f10;
            float f15 = n3Var2.f47760x;
            int[] iArr7 = this.f48142y0;
            int[] iArr8 = this.f48140x0;
            int[] iArr9 = this.f48143z0;
            f11 = f14;
            iArr = iArr5;
            iArr2 = iArr6;
            iArr3 = iArr4;
            f12 = f13;
            v3Var = this;
            canvas2 = canvas;
            n3Var2.a(canvas2, h3Var, f15, width2, realHeight, iArr7, iArr8, iArr9);
            n3Var2.a(canvas2, n3Var2.v, n3Var2.f47761y, width2, realHeight, iArr7, iArr8, iArr9);
            n3Var2.a(canvas2, n3Var2.f47759w, n3Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            n3Var = n3Var2;
            v3Var.invalidate();
        }
        if (i10 > 0 && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            f4.d dVar2 = v3Var.U;
            if (dVar2.b(0) && dVar2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(dVar2.a(0), dVar2.a(3));
            }
            org.telegram.ui.Components.o5[] o5VarArr = v3Var.f48129q0;
            if (max2 > 0.0f) {
                canvas2.save();
                canvas2.translate(f12, f11);
                o5VarArr[0].k(Integer.valueOf(i12));
                j0.a(canvas, 0, o5VarArr[0], v3Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (v3Var.U.a(2) > 0.0f) {
                canvas.save();
                o5VarArr[0].k(Integer.valueOf(i12));
                float f16 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = v3Var.f48117f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = v3Var.J;
                float x11 = frameLayout.getX() + x10;
                w9 w9Var = v3Var.K;
                rectF.set(w9Var.getX() + x11, w9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), w9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + w9Var.getWidth(), w9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + w9Var.getHeight());
                j0.c(canvas, o5VarArr[0], v3Var.getWidth(), f16 * 0.7f, 1.0f, rectF, v3Var.U.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            u3[] u3VarArr = v3Var.I;
            int length = u3VarArr.length;
            int i13 = 0;
            while (i13 < length) {
                u3 u3Var = u3VarArr[i13];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.j6.B1(u3Var.getBackground(), iArr10[Utilities.clamp(Math.round((((u3Var.getWidth() / 2.0f) + u3Var.getX()) / v3Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    u3Var.invalidate();
                }
                i13++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i14 = iArr11[iArr11.length / 2];
            int i15 = iArr12[iArr12.length / 2];
            TextView textView = v3Var.v;
            if (textView != null && v3Var.f48137w != i14) {
                v3Var.f48137w = i14;
                textView.setTextColor(i14);
                org.telegram.ui.ActionBar.j6.B1(textView.getBackground(), i15, false);
            }
            if (n3Var.f47758s != null || n3Var.v != null || n3Var.f47759w != null) {
                v3Var.f48141y[0].setTextColor(i14);
            }
            if (v3Var.U.a(2) > 0.0f) {
                if (v3Var.f48138w0 == null) {
                    v3Var.f48138w0 = new i8(1, 12);
                }
                FrameLayout frameLayout2 = v3Var.f48111b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / 2.0f) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / 2.0f;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / 2.0f) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / 2.0f;
                float f17 = measuredHeight + scaleY;
                RectF rectF2 = v3Var.f48136v0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f17);
                v3Var.f48138w0.g(rectF2);
                v3Var.f48138w0.d();
                v3Var.f48138w0.a(canvas2, org.telegram.ui.ActionBar.j6.l1(v3Var.U.a(2), -1));
                v3Var.invalidate();
            }
        }
        if (v3Var.U.a(1) > 0.0f) {
            v3Var.c(canvas2, f12, f11, v3Var.getWidth(), v3Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.f48123k0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.m0 = radialGradient2;
            this.f48127o0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f48124l0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.f48122j0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        zf.b bVar;
        boolean z14;
        int i10;
        int i11;
        this.M = false;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        boolean z15 = starGift instanceof TL_stars.TL_starGiftUnique;
        int i12 = 8;
        bc1 bc1Var = this.H;
        l90[] l90VarArr = this.f48141y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) t5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) t5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            l90VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i12 = 0;
            }
            bc1Var.setVisibility(i12);
            u3[] u3VarArr = this.I;
            if (z13) {
                u3 u3Var = u3VarArr[1];
                if (z12) {
                    i10 = R.drawable.filled_crown_off;
                } else {
                    i10 = R.drawable.filled_crown_on;
                }
                if (z12) {
                    i11 = R.string.Gift2ActionWearOff;
                } else {
                    i11 = R.string.Gift2ActionWear;
                }
                u3Var.b(i10, LocaleController.getString(i11), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.M = true;
                boolean z16 = starGift.resale_ton_only;
                zf.b bVar2 = zf.b.f49209b;
                if (z16) {
                    bVar = bVar2;
                } else {
                    bVar = zf.b.f49208a;
                }
                zf.a resellAmount = starGift.getResellAmount(bVar);
                int i13 = R.string.GiftOnSale;
                if (resellAmount.f49206a == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence formatSpannable = LocaleController.formatSpannable(i13, v7.S0("⭐️ " + ((Object) v7.J0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.N;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (y3.N1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new q3(this, 1));
                    w7.a6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                u3VarArr[0].setAlpha(1.0f);
                u3VarArr[0].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                u3VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new oq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                u3VarArr[0].b(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            u3 u3Var2 = u3VarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            u3Var2.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.S;
                if (arrayList != null) {
                    u3VarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    u3VarArr[2].setOnClickListener(onClickListener);
                } else {
                    u3VarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    u3VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                u3VarArr[2].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                u3VarArr[2].setOnClickListener(this.R);
            }
            this.f48114c0 = starGift.crafted;
            this.f48125n.f46223a.d(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            l90VarArr[0].setTextSize(1, 14.0f);
            this.f48114c0 = false;
            bc1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        v7.a1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) t5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.U);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f48128p0;
            if (stargiftattributepatternArr[i10] != stargiftattributepattern) {
                stargiftattributepatternArr[i10] = stargiftattributepattern;
                this.f48129q0[i10].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.U.d(0);
        float f7 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        LinearLayout[] linearLayoutArr = this.f48117f;
        if (d) {
            if (stargiftattributebackdropArr[0] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        } else if (this.U.d(1)) {
            if (stargiftattributebackdropArr[1] != null) {
                f7 = 24.0f;
            }
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        } else {
            if (this.U.d(2)) {
                dp = AndroidUtilities.dp(64.0f);
                measuredHeight = linearLayoutArr[2].getMeasuredHeight();
            } else if (this.U.d(3)) {
                dp = AndroidUtilities.dp(160.0f);
                measuredHeight = linearLayoutArr[3].getMeasuredHeight();
            } else if (!this.U.d(4)) {
                return 0;
            } else {
                y2 y2Var = this.L;
                if (y2Var.getMeasuredHeight() > 0) {
                    return y2Var.getMeasuredHeight();
                }
                return AndroidUtilities.dp(550.0f);
            }
            return measuredHeight + dp;
        }
    }

    public float getRealHeight() {
        float f7;
        float f10;
        int dp;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        float f11 = 10.0f;
        if (stargiftattributebackdropArr[0] != null) {
            f7 = 24.0f;
        } else {
            f7 = 10.0f;
        }
        int dp2 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f7);
        LinearLayout[] linearLayoutArr = this.f48117f;
        float a2 = (this.U.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp2)) + 0.0f;
        if (stargiftattributebackdropArr[1] != null) {
            f10 = 24.0f;
        } else {
            f10 = 10.0f;
        }
        int dp3 = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(f10);
        float a10 = (this.U.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.U.a(1) * (linearLayoutArr[1].getMeasuredHeight() + dp3)) + a2;
        if (stargiftattributebackdropArr[0] != null) {
            f11 = 24.0f;
        }
        int dp4 = AndroidUtilities.dp(f11);
        float a11 = (this.U.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + dp4)) + a10;
        y2 y2Var = this.L;
        if (y2Var.getMeasuredHeight() > 0) {
            dp = y2Var.getMeasuredHeight();
        } else {
            dp = AndroidUtilities.dp(550.0f);
        }
        return (this.U.a(4) * dp) + a11;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f7 = this.f48133s0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        if (f7 > 0.5f) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public w9 getUpgradeImageView() {
        float f7 = this.f48133s0;
        w9[] w9VarArr = this.d;
        if (f7 > 0.5f) {
            return w9VarArr[2];
        }
        return w9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f7 = this.f48133s0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        if (f7 > 0.5f) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f48128p0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i11;
        int i12;
        this.f48130r[i10].setText(charSequence);
        FrameLayout frameLayout = this.f48139x;
        l90[] l90VarArr = this.f48141y;
        l90 l90Var = this.f48132s;
        TextView textView = this.v;
        int i13 = 0;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            l90Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                l90VarArr[i10].setVisibility(8);
            }
        } else if (i10 == 0 && !TextUtils.isEmpty(charSequence3)) {
            l90Var.setText(charSequence3);
            l90Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                l90VarArr[i10].setVisibility(8);
            }
        } else {
            l90VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
            } else {
                l90 l90Var2 = l90VarArr[i10];
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                l90Var2.setVisibility(i11);
            }
            l90Var.setVisibility(8);
            textView.setVisibility(8);
        }
        xh.l0[] l0VarArr = this.F;
        xh.l0 l0Var = l0VarArr[i10];
        if (l0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i13 = 8;
            }
            l0Var.setVisibility(i13);
            l0VarArr[i10].setUser(tLObject);
            l0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.f48119g0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        FrameLayout frameLayout = this.f48111b;
        l90[] l90VarArr = this.f48130r;
        this.f48116e0 = ((((Math.min(l90VarArr[2].getPaint().measureText(l90VarArr[2].getText().toString()), l90VarArr[2].getWidth()) + l90VarArr[2].getWidth()) / 2.0f) + (l90VarArr[2].getX() + (-frameLayout.getLeft()))) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f48118f0 = (AndroidUtilities.dp(124.0f) + (-frameLayout.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.o5[] o5VarArr = this.f48129q0;
        o5VarArr[0].a();
        o5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5[] o5VarArr = this.f48129q0;
        o5VarArr[0].b();
        o5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.f48121i0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.U.b(2)) {
            k();
            d(this.U);
        }
    }

    public void setPreviewAttributes(o0 o0Var) {
        f4.d dVar = this.U;
        if (dVar != null && dVar.f8875b == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.f48121i0);
            ValueAnimator valueAnimator = this.f48120h0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f48120h0 = null;
            }
            int i10 = 1 - this.f48131r0;
            this.f48131r0 = i10;
            w9[] w9VarArr = this.d;
            ij0 lottieAnimation = w9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            ij0 lottieAnimation2 = w9VarArr[this.f48131r0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.T(lottieAnimation.t(), false);
            }
            int i11 = this.f48131r0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f47797a;
            this.V[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, o0Var.f47798b, true);
            int i12 = this.f48131r0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f47799c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            v7.Z0(w9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.f48131r0 + 1].document, 160);
            a();
            float f7 = this.f48131r0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.f48120h0 = ofFloat;
            ofFloat.addUpdateListener(new r3(this, 0));
            this.f48120h0.addListener(new s3(this, 3));
            this.f48120h0.setDuration(320L);
            this.f48120h0.setInterpolator(qr.h);
            this.f48120h0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.W = new com.google.android.gms.common.api.internal.r(t5.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f48110a0 = new com.google.android.gms.common.api.internal.r(t5.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f48112b0 = new com.google.android.gms.common.api.internal.r(t5.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.f48141y[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.f48133s0 = 0.0f;
        this.f48131r0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f48110a0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.W.c();
        w9[] w9VarArr = this.d;
        v7.Z0(w9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f48112b0.c();
        this.V[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.W.f6167f;
        v7.Z0(w9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        w2 w2Var = this.f48121i0;
        AndroidUtilities.cancelRunOnUIThread(w2Var);
        AndroidUtilities.runOnUIThread(w2Var, 2500L);
        invalidate();
    }

    public void setResellPrice(zf.a aVar) {
        boolean z10;
        boolean k10 = aVar.k();
        this.M = !k10;
        l90[] l90VarArr = this.f48141y;
        TextView textView = this.N;
        if (!k10) {
            int i10 = R.string.GiftOnSale;
            if (aVar.f49206a == zf.b.f49209b) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, v7.U0(z10, "⭐️ " + ((Object) v7.J0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.V[0];
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f48115d0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            qr qrVar = qr.h;
            duration.setInterpolator(qrVar).setListener(new s3(this, 0)).start();
            l90VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(qrVar).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            qr qrVar2 = qr.h;
            duration2.setInterpolator(qrVar2).setListener(new s3(this, 2)).setListener(new s3(this, 1)).start();
            l90VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(qrVar2).start();
        }
        boolean z11 = this.M;
        u3[] u3VarArr = this.I;
        if (z11) {
            u3VarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            u3VarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        u3VarArr[2].setOnClickListener(this.S);
    }

    public void setWearPreview(TLObject tLObject) {
        String lowerCase;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = UserObject.getUserName((TLRPC.User) tLObject);
            str = LocaleController.getString(R.string.Online);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                int i10 = chat.participants_count;
                if (i10 > 1) {
                    lowerCase = LocaleController.formatPluralStringComma("Subscribers", i10);
                } else {
                    lowerCase = LocaleController.getString(R.string.DiscussChannel);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 > 1) {
                    lowerCase = LocaleController.formatPluralStringComma("Members", i11);
                } else {
                    lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
                }
            }
            str = lowerCase;
            str2 = str3;
        } else {
            return;
        }
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        h9Var.p(tLObject);
        this.K.e(tLObject, h9Var);
        this.f48130r[2].setText(str2);
        this.f48141y[2].setText(str);
        k();
        d(this.U);
    }

    public void j(int i10) {
    }
}
