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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.dc1;
public class p3 extends FrameLayout {
    public final LinearLayout.LayoutParams[] E;
    public final xh.n0[] F;
    public final TextPaint G;
    public final dc1 H;
    public final xh.m[] I;
    public final FrameLayout J;
    public final y9 K;
    public final t2 L;
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
    public final org.telegram.ui.ActionBar.e6 f53044a;
    public com.google.android.gms.common.api.internal.r f53045a0;
    public final FrameLayout f53046b;
    public com.google.android.gms.common.api.internal.r f53047b0;
    public final i3 f53048c;
    public boolean f53049c0;
    public final y9[] d;
    public boolean f53050d0;
    public final TL_stars.starGiftAttributeModel[] f53051e;
    public float f53052e0;
    public final LinearLayout[] f53053f;
    public float f53054f0;
    public float f53055g0;
    public final FrameLayout.LayoutParams[] h;
    public ValueAnimator f53056h0;
    public final f0 f53057i0;
    public final Paint[] f53058j0;
    public final RadialGradient[] f53059k0;
    public final Matrix[] f53060l0;
    public RadialGradient m0;
    public final xh.k1 f53061n;
    public final Matrix f53062n0;
    public final Paint f53063o0;
    public final TL_stars.starGiftAttributePattern[] f53064p0;
    public final org.telegram.ui.Components.q5[] f53065q0;
    public final fa0[] f53066r;
    public int f53067r0;
    public final fa0 f53068s;
    public float f53069s0;
    public float f53070t0;
    public ValueAnimator f53071u0;
    public final TextView v;
    public final RectF f53072v0;
    public int f53073w;
    public b8 f53074w0;
    public final FrameLayout f53075x;
    public final int[] f53076x0;
    public final fa0[] f53077y;
    public final int[] f53078y0;
    public final int[] f53079z0;

    public p3(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, View.OnClickListener onClickListener, t0 t0Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        float f10;
        int i10;
        float f11;
        this.d = new y9[5];
        this.f53051e = new TL_stars.starGiftAttributeModel[3];
        this.f53053f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.f53066r = new fa0[5];
        this.f53077y = new fa0[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new xh.n0[5];
        int i11 = 0;
        this.U = new f4.d(0, 0);
        this.V = new TL_stars.starGiftAttributeBackdrop[3];
        this.f53057i0 = new f0(this, 6);
        this.f53058j0 = new Paint[3];
        this.f53059k0 = new RadialGradient[3];
        this.f53060l0 = new Matrix[3];
        this.f53062n0 = new Matrix();
        this.f53063o0 = new Paint(1);
        this.f53064p0 = new TL_stars.starGiftAttributePattern[2];
        this.f53065q0 = new org.telegram.ui.Components.q5[2];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = this.f53058j0;
            if (i12 >= paintArr.length) {
                break;
            }
            paintArr[i12] = new Paint(1);
            i12++;
        }
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr = this.f53065q0;
            f7 = 28.0f;
            if (i13 >= q5VarArr.length) {
                break;
            }
            q5VarArr[i13] = new org.telegram.ui.Components.q5(AndroidUtilities.dp(28.0f), this);
            i13++;
        }
        this.f53070t0 = 1.0f;
        this.f53072v0 = new RectF();
        this.f53076x0 = new int[12];
        this.f53078y0 = new int[12];
        this.f53079z0 = new int[12];
        this.f53044a = e6Var;
        this.R = onClickListener4;
        this.S = onClickListener5;
        this.T = onClickListener6;
        setWillNotDraw(false);
        this.f53046b = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            y9[] y9VarArr = this.d;
            float f12 = 0.0f;
            f10 = f7;
            if (i14 >= y9VarArr.length) {
                break;
            }
            y9VarArr[i14] = new ci.t3(context, 1);
            this.d[i14].setLayerNum(6660);
            if (i14 > 0) {
                this.d[i14].getImageReceiver().setCrossfadeDuration(1);
            }
            this.f53046b.addView(this.d[i14], w7.x5.e(-1, -1, 119));
            y9 y9Var = this.d[i14];
            if (i14 == 0) {
                f12 = 1.0f;
            }
            y9Var.setAlpha(f12);
            i14++;
            f7 = f10;
        }
        fa0 fa0Var = new fa0(context, null);
        this.f53068s = fa0Var;
        fa0Var.setTextSize(1, 12.0f);
        fa0Var.setGravity(17);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        fa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new l3(this, 0));
        w7.z5.b(textView, 0.05f, 1.25f);
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
        w7.z5.a(textView2);
        dc1 dc1Var = new dc1(this, context, 19);
        this.H = dc1Var;
        dc1Var.setOrientation(0);
        this.I = new xh.m[3];
        int i15 = 0;
        while (true) {
            xh.m[] mVarArr = this.I;
            if (i15 >= mVarArr.length) {
                break;
            }
            xh.m mVar = new xh.m(context);
            ImageView imageView = new ImageView(context);
            mVar.f51392c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mVar.addView(imageView, w7.x5.a(24.0f, 0.0f, 8.0f, 0.0f, 0.0f, 24, 49));
            TextView textView3 = new TextView(context);
            mVar.f51391b = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            mVar.addView(textView3, w7.x5.a(-2.0f, 4.0f, 35.0f, 4.0f, 0.0f, -1, 49));
            mVarArr[i15] = mVar;
            if (i15 == 0) {
                this.I[i15].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.I[i15].setOnClickListener(onClickListener2);
            } else if (i15 == 1) {
                this.I[i15].b(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.I[i15].setOnClickListener(onClickListener3);
            } else if (i15 == 2) {
                this.I[i15].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.I[i15].setOnClickListener(onClickListener4);
            }
            this.I[i15].setBackground(org.telegram.ui.ActionBar.i6.a0(0, 285212671, 16, 16));
            w7.z5.b(this.I[i15], 0.075f, 1.5f);
            dc1 dc1Var2 = this.H;
            xh.m[] mVarArr2 = this.I;
            dc1Var2.addView(mVarArr2[i15], w7.x5.p(0, 56, 1.0f, 119, 0, 0, i15 != mVarArr2.length - 1 ? 11 : 0, 0));
            i15++;
        }
        this.f53075x = new FrameLayout(context);
        int i16 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f53053f;
            if (i16 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i16] = new LinearLayout(context);
            this.f53053f[i16].setOrientation(1);
            if (i16 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.J = frameLayout;
                this.f53053f[i16].addView(frameLayout, w7.x5.q(-1, 144, 119));
                y9 y9Var2 = new y9(context);
                this.K = y9Var2;
                y9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(y9Var2, w7.x5.a(82.0f, 0.0f, 2.0f, 0.0f, 0.0f, 82, 49));
                i10 = i11;
                this.f53066r[i16] = new fa0(context, null);
                this.f53066r[i16].setTextColor(-1);
                this.f53066r[i16].setTextSize(1, 20.0f);
                this.f53066r[i16].setTypeface(AndroidUtilities.bold());
                this.f53066r[i16].setSingleLine();
                fa0 fa0Var2 = this.f53066r[i16];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                fa0Var2.setEllipsize(truncateAt);
                this.f53066r[i16].setGravity(17);
                frameLayout.addView(this.f53066r[i16], w7.x5.a(-2.0f, 16.0f, 95.33f, 16.0f, 0.0f, -1, 49));
                this.f53077y[i16] = new fa0(context, null);
                this.f53077y[i16].setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
                this.f53077y[i16].setTextSize(1, 14.0f);
                this.f53077y[i16].setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
                this.f53077y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.f53077y[i16].setDisablePaddingsOffsetY(true);
                this.f53077y[i16].setSingleLine();
                this.f53077y[i16].setGravity(17);
                this.f53077y[i16].setEllipsize(truncateAt);
                frameLayout.addView(this.f53077y[i16], w7.x5.a(-2.0f, 16.0f, 122.0f, 16.0f, 0.0f, -1, 49));
            } else {
                i10 = i11;
                if (i16 == 4) {
                    t2 t2Var = new t2(context, e6Var);
                    this.L = t2Var;
                    this.f53053f[i16].addView(t2Var, w7.x5.n(-1, -2));
                    View view = this.f53053f[i16];
                    FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                    ViewGroup.LayoutParams a2 = w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119);
                    layoutParamsArr[i16] = a2;
                    addView(view, a2);
                    i16++;
                    i11 = i10;
                } else {
                    this.f53066r[i16] = new fa0(context, null);
                    this.f53066r[i16].setTextColor(i16 == 3 ? -1 : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
                    this.f53066r[i16].setTextSize(1, 20.0f);
                    this.f53066r[i16].setTypeface(AndroidUtilities.bold());
                    this.f53066r[i16].setGravity(17);
                    this.f53053f[i16].addView(this.f53066r[i16], w7.x5.t(-1, -2, 17, 24, i16 == 3 ? 10 : i10, 24, 0));
                    if (i16 == 0) {
                        this.f53053f[i16].addView(this.f53068s, w7.x5.t(-2, -2, 17, 0, 4, 0, 4));
                        this.f53053f[i16].addView(this.v, w7.x5.s(-2, 17, 0, 6, 0, 19.33f, 2));
                    }
                    if (i16 == 0) {
                        this.f53077y[i16] = new fa0(context, null);
                        this.f53077y[i16].setTextColor(i16 == 3 ? org.telegram.ui.ActionBar.i6.m1(0.75f, -1) : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
                        this.f53077y[i16].setTextSize(1, 14.0f);
                        this.f53077y[i16].setGravity(17);
                        this.f53077y[i16].setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
                        this.f53077y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.f53077y[i16].setDisablePaddingsOffsetY(true);
                        this.f53075x.addView(this.f53077y[i16], w7.x5.e(-2, -2, 17));
                        this.f53075x.addView(this.N, w7.x5.b(-2.0f, 20.33f, 17));
                        LinearLayout linearLayout = this.f53053f[i16];
                        FrameLayout frameLayout2 = this.f53075x;
                        LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                        LinearLayout.LayoutParams t10 = w7.x5.t(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : i10);
                        layoutParamsArr2[i16] = t10;
                        linearLayout.addView(frameLayout2, t10);
                    } else {
                        this.f53077y[i16] = new fa0(context, null);
                        this.f53077y[i16].setTextColor(i16 == 3 ? org.telegram.ui.ActionBar.i6.m1(0.75f, -1) : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
                        this.f53077y[i16].setTextSize(1, 14.0f);
                        this.f53077y[i16].setGravity(17);
                        this.f53077y[i16].setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
                        this.f53077y[i16].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.f53077y[i16].setDisablePaddingsOffsetY(true);
                        LinearLayout linearLayout2 = this.f53053f[i16];
                        fa0 fa0Var3 = this.f53077y[i16];
                        LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                        LinearLayout.LayoutParams t11 = w7.x5.t(-1, -2, 17, 24, 0, 24, i16 == 3 ? 6 : i10);
                        layoutParamsArr3[i16] = t11;
                        linearLayout2.addView(fa0Var3, t11);
                    }
                    LinearLayout.LayoutParams layoutParams = this.E[i16];
                    if (i16 == 3) {
                        f11 = 6.0f;
                    } else {
                        f11 = (i16 == 1 ? 7.33f : this.V[i10] == null ? 9.0f : 5.66f) - 4.0f;
                    }
                    layoutParams.topMargin = AndroidUtilities.dp(f11);
                    this.F[i16] = new xh.n0(context);
                    this.F[i16].setVisibility(8);
                    this.F[i16].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                    if (i16 == 0) {
                        this.G = this.F[i16].getTextPaint();
                    }
                    this.f53053f[i16].addView(this.F[i16], w7.x5.t(-1, -2, 17, 24, 8, 24, 0));
                }
            }
            if (i16 == 0) {
                this.f53053f[i16].addView(this.H, w7.x5.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f53053f[i16];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams a10 = w7.x5.a(-2.0f, 16.0f, i16 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f, -1, 119);
            layoutParamsArr4[i16] = a10;
            addView(view2, a10);
            i16++;
            i11 = i10;
        }
        addView(this.f53046b, w7.x5.a(160.0f, 0.0f, 8.0f, 0.0f, 0.0f, 160, 49));
        i3 i3Var = new i3(context);
        this.f53048c = i3Var;
        addView(i3Var, w7.x5.a(160.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(f10), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        w7.z5.a(imageView2);
        addView(imageView2, w7.x5.a(28.0f, 0.0f, 12.0f, 12.0f, 0.0f, 28, 53));
        imageView2.setOnClickListener(new bi.p(6, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.g0(553648127, 1, -1));
        w7.z5.a(imageView3);
        if (t0Var != null) {
            addView(imageView3, w7.x5.a(42.0f, 0.0f, 5.0f, 47.0f, 0.0f, 42, 53));
            imageView3.setOnClickListener(t0Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.Q = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.g0(553648127, 1, -1));
        w7.z5.a(imageView4);
        addView(imageView4, w7.x5.a(42.0f, 0.0f, 5.0f, 5.0f, 0.0f, 42, 53));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        xh.k1 k1Var = new xh.k1(context);
        this.f53061n = k1Var;
        k1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        xh.m1 m1Var = k1Var.f51368a;
        if (m1Var.v == null) {
            b8 b8Var = new b8(2, 12);
            m1Var.v = b8Var;
            b8Var.h = 5.0f;
        }
        Path path = m1Var.f51414f;
        float f13 = m1Var.f51417s;
        m1Var.f51418w = true;
        xh.m1.d(path, f13, true);
        k1Var.setScaleX(1.2f);
        k1Var.setScaleY(1.2f);
        addView(k1Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 51));
        k1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f53071u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53071u0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f53071u0 = ofFloat;
        ofFloat.addUpdateListener(new m3(this, 1));
        this.f53071u0.addListener(new n3(this, 4));
        this.f53071u0.setDuration(320L);
        this.f53071u0.setInterpolator(is.f27444g);
        this.f53071u0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.f53067r0;
        RadialGradient[] radialGradientArr = this.f53059k0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        Matrix[] matrixArr = this.f53060l0;
        Paint[] paintArr = this.f53058j0;
        int i11 = 0;
        if (i10 == 0) {
            if (this.f53069s0 > 0.0f && stargiftattributebackdropArr[2] != null) {
                paintArr[2].setAlpha((int) (this.U.a(1) * 255.0f));
                matrixArr[2].reset();
                matrixArr[2].postTranslate(f7, f10);
                radialGradientArr[2].setLocalMatrix(matrixArr[2]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[2];
                i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
            }
            if (this.f53069s0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) ((1.0f - this.f53069s0) * this.U.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
            }
            return i11;
        }
        if (this.f53069s0 < 1.0f && stargiftattributebackdropArr[1] != null) {
            paintArr[1].setAlpha((int) (this.U.a(1) * 255.0f));
            matrixArr[1].reset();
            matrixArr[1].postTranslate(f7, f10);
            radialGradientArr[1].setLocalMatrix(matrixArr[1]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[1];
            i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
        }
        if (this.f53069s0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.U.a(1) * 255.0f * this.f53069s0));
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
        int d = i0.a.d(this.f53069s0, i10, i11);
        org.telegram.ui.Components.q5[] q5VarArr = this.f53065q0;
        q5VarArr[1].k(Integer.valueOf(d));
        i0.a(canvas, 0, q5VarArr[1], f11, f12, this.U.a(1), this.f53070t0);
        canvas.restore();
    }

    public void d(f4.d dVar) {
        View[] viewArr;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z10;
        int i11;
        fa0[] fa0VarArr;
        int d;
        float max;
        float a2;
        int i12;
        int i13;
        int i14;
        boolean z11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        int i17;
        int i18;
        this.U = dVar;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            viewArr = this.f53053f;
            f7 = 0.0f;
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
            f10 = dVar.a(2);
        } else {
            f10 = 0.0f;
        }
        if (stargiftattributebackdropArr[1] != null) {
            f11 = dVar.a(1);
        } else {
            f11 = 0.0f;
        }
        float max2 = Math.max(f10, f11);
        ImageView imageView = this.O;
        imageView.setAlpha(max2);
        if ((stargiftattributebackdropArr[0] != null && dVar.f9645b == 2) || (stargiftattributebackdropArr[1] != null && dVar.f9645b == 1)) {
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
        int i21 = dVar.f9645b;
        float lerp = AndroidUtilities.lerp(false, z10, a11);
        ImageView imageView2 = this.Q;
        imageView2.setAlpha(lerp);
        if (stargiftattributebackdropArr[0] != null && i21 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        if (!this.f53050d0) {
            float lerp2 = AndroidUtilities.lerp(false, this.M, dVar.a(0));
            TextView textView = this.N;
            textView.setAlpha(lerp2);
            if (this.M) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            textView.setScaleX(AndroidUtilities.lerp(0.4f, f13, dVar.a(0)));
            if (this.M) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            textView.setScaleY(AndroidUtilities.lerp(0.4f, f14, dVar.a(0)));
            if (this.M && i21 == 0) {
                i17 = 0;
            } else {
                i17 = 4;
            }
            textView.setVisibility(i17);
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, this.f53044a);
        int i22 = 0;
        while (true) {
            fa0VarArr = this.f53077y;
            if (i22 >= 2) {
                break;
            }
            float f15 = f7;
            fa0 fa0Var = this.f53066r[i22];
            if (stargiftattributebackdropArr[Math.min(1, i22)] == null) {
                i13 = w02;
            } else {
                i13 = -1;
            }
            fa0Var.setTextColor(i13);
            fa0 fa0Var2 = fa0VarArr[i22];
            if (i22 != 0 && i22 != 2) {
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
                i14 = i0.a.d(this.f53069s0, i15, i16);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[i22];
                if (stargiftattributebackdrop3 == null) {
                    i14 = w02;
                } else {
                    i14 = stargiftattributebackdrop3.text_color | (-16777216);
                }
            }
            fa0Var2.setTextColor(i14);
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
                f12 = 7.33f;
            } else if (stargiftattributebackdropArr[0] == null) {
                f12 = 9.0f;
            } else {
                f12 = 5.66f;
            }
            layoutParams.topMargin = AndroidUtilities.dp(f12 - 4.0f);
            if (z11) {
                viewArr[i22].setLayoutParams(layoutParamsArr[i22]);
                if (i22 == 0) {
                    this.f53075x.setLayoutParams(layoutParamsArr2[i22]);
                } else {
                    fa0VarArr[i22].setLayoutParams(layoutParamsArr2[i22]);
                }
            }
            i22++;
            f7 = f15;
        }
        float f16 = f7;
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop5 == null) {
            d = 553648127;
        } else {
            d = i0.a.d(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216));
        }
        this.v.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, d));
        fa0 fa0Var3 = fa0VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        fa0Var3.setTextColor(w02);
        y9[] y9VarArr = this.d;
        y9 y9Var = y9VarArr[0];
        f4.d dVar2 = this.U;
        if (dVar2.b(0) && dVar2.b(2)) {
            max = 1.0f;
        } else {
            max = Math.max(dVar2.a(0), dVar2.a(2));
        }
        y9Var.setAlpha(Math.max(max, this.U.a(3)));
        y9VarArr[1].setAlpha((1.0f - this.f53069s0) * dVar.a(1));
        y9VarArr[2].setAlpha(dVar.a(1) * this.f53069s0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.f53055g0, dVar.a(2));
        FrameLayout frameLayout = this.f53046b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.f53055g0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.f53052e0);
        frameLayout.setTranslationY((dVar.a(2) * this.f53054f0) + (dVar.a(1) * AndroidUtilities.dp(16.0f)));
        View view2 = viewArr[2];
        int i23 = dVar.f9644a;
        if (i23 == 2 && i21 == 2) {
            a2 = f16;
        } else {
            if (i23 != 2) {
                i21 = i23;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i21].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view2.setTranslationY(a2);
        if (this.f53049c0 && this.U.b(0)) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        xh.k1 k1Var = this.f53061n;
        k1Var.setVisibility(i12);
        k1Var.setAlpha(this.U.a(0));
        if (dVar.a(4) <= f16) {
            i19 = 8;
        }
        t2 t2Var = this.L;
        t2Var.setVisibility(i19);
        t2Var.setAlpha(dVar.a(4));
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
        p3 p3Var;
        Canvas canvas2;
        i3 i3Var;
        float max2;
        float realHeight = getRealHeight();
        canvas.save();
        float f13 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f14 = 2.0f;
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.U.a(1));
        f4.d dVar = this.U;
        if ((dVar.b(0) && dVar.b(2)) || ((dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0)))) {
            max = 1.0f;
        } else {
            max = Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        }
        int i11 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.V;
        if (i11 > 0 && stargiftattributebackdropArr2[0] != null) {
            if (this.m0 != null && this.U.a(2) >= 1.0f) {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            } else {
                Paint[] paintArr = this.f53058j0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.f53060l0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.f53059k0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            }
            if (this.m0 != null && this.U.a(2) > 0.0f) {
                Paint paint = this.f53063o0;
                paint.setAlpha((int) (this.U.a(2) * 255.0f));
                Matrix matrix = this.f53062n0;
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
        int[] iArr4 = this.f53079z0;
        int[] iArr5 = this.f53078y0;
        int[] iArr6 = this.f53076x0;
        if (stargiftattributebackdrop != null) {
            int i12 = 0;
            while (i12 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i12] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i12] = i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i12] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i12++;
                f13 = f13;
                f14 = f14;
            }
        }
        float f15 = f13;
        float f16 = f14;
        i3 i3Var2 = this.f53048c;
        if (i3Var2.f52722s == null && i3Var2.v == null && i3Var2.f52723w == null) {
            p3Var = this;
            f12 = f7;
            f11 = f10;
            iArr = iArr5;
            iArr2 = iArr6;
            i10 = 1;
            i3Var = i3Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f17 = f7;
            c3 c3Var = i3Var2.f52722s;
            float f18 = f10;
            float f19 = i3Var2.f52724x;
            int[] iArr7 = this.f53078y0;
            int[] iArr8 = this.f53076x0;
            int[] iArr9 = this.f53079z0;
            f11 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            f12 = f17;
            i10 = 1;
            iArr3 = iArr4;
            p3Var = this;
            canvas2 = canvas;
            i3Var2.a(canvas2, c3Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            i3Var2.a(canvas2, i3Var2.v, i3Var2.f52725y, width2, realHeight, iArr7, iArr8, iArr9);
            i3Var2.a(canvas2, i3Var2.f52723w, i3Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            i3Var = i3Var2;
            p3Var.invalidate();
        }
        if (i11 > 0 && stargiftattributebackdropArr[0] != null) {
            int i13 = iArr3[iArr3.length / 2];
            f4.d dVar2 = p3Var.U;
            if (dVar2.b(0) && dVar2.b(3)) {
                max2 = 1.0f;
            } else {
                max2 = Math.max(dVar2.a(0), dVar2.a(3));
            }
            int i14 = (max2 > f15 ? 1 : (max2 == f15 ? 0 : -1));
            org.telegram.ui.Components.q5[] q5VarArr = p3Var.f53065q0;
            if (i14 > 0) {
                canvas2.save();
                canvas2.translate(f12, f11);
                q5VarArr[0].k(Integer.valueOf(i13));
                i0.a(canvas, 0, q5VarArr[0], p3Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (p3Var.U.a(2) > f15) {
                canvas.save();
                q5VarArr[0].k(Integer.valueOf(i13));
                float f20 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = p3Var.f53053f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = p3Var.J;
                float x11 = frameLayout.getX() + x10;
                y9 y9Var = p3Var.K;
                rectF.set(y9Var.getX() + x11, y9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), y9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + y9Var.getWidth(), y9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + y9Var.getHeight());
                i0.c(canvas, q5VarArr[0], p3Var.getWidth(), f20 * 0.7f, 1.0f, rectF, p3Var.U.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            xh.m[] mVarArr = p3Var.I;
            int length = mVarArr.length;
            int i15 = 0;
            while (i15 < length) {
                xh.m mVar = mVarArr[i15];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.i6.C1(mVar.getBackground(), iArr10[Utilities.clamp(Math.round((((mVar.getWidth() / f16) + mVar.getX()) / p3Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    mVar.invalidate();
                }
                i15++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i16 = iArr11[iArr11.length / 2];
            int i17 = iArr12[iArr12.length / 2];
            TextView textView = p3Var.v;
            if (textView != null && p3Var.f53073w != i16) {
                p3Var.f53073w = i16;
                textView.setTextColor(i16);
                org.telegram.ui.ActionBar.i6.C1(textView.getBackground(), i17, false);
            }
            if (i3Var.f52722s != null || i3Var.v != null || i3Var.f52723w != null) {
                p3Var.f53077y[0].setTextColor(i16);
            }
            if (p3Var.U.a(2) > f15) {
                if (p3Var.f53074w0 == null) {
                    p3Var.f53074w0 = new b8(i10, 12);
                }
                FrameLayout frameLayout2 = p3Var.f53046b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f16) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f16;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f16) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f16;
                float f21 = measuredHeight + scaleY;
                RectF rectF2 = p3Var.f53072v0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f21);
                p3Var.f53074w0.g(rectF2);
                p3Var.f53074w0.d();
                p3Var.f53074w0.a(canvas2, org.telegram.ui.ActionBar.i6.m1(p3Var.U.a(2), -1));
                p3Var.invalidate();
            }
        }
        if (p3Var.U.a(1) > f15) {
            p3Var.c(canvas2, f12, f11, p3Var.getWidth(), p3Var.getRealHeight());
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
        RadialGradient[] radialGradientArr = this.f53059k0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.m0 = radialGradient2;
            this.f53063o0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.f53060l0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.f53058j0[i10].setShader(radialGradientArr[i10]);
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
        dc1 dc1Var = this.H;
        fa0[] fa0VarArr = this.f53077y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        if (z15) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) m5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) m5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            fa0VarArr[0].setTextSize(1, 13.0f);
            if (z13) {
                i12 = 0;
            }
            dc1Var.setVisibility(i12);
            xh.m[] mVarArr = this.I;
            if (z13) {
                xh.m mVar = mVarArr[1];
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
                mVar.b(i10, LocaleController.getString(i11), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.M = true;
                boolean z16 = starGift.resale_ton_only;
                zf.b bVar2 = zf.b.f54488b;
                if (z16) {
                    bVar = bVar2;
                } else {
                    bVar = zf.b.f54487a;
                }
                zf.a resellAmount = starGift.getResellAmount(bVar);
                int i13 = R.string.GiftOnSale;
                if (resellAmount.f54485a == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                CharSequence formatSpannable = LocaleController.formatSpannable(i13, p7.T0("⭐️ " + ((Object) p7.K0(resellAmount.o(), 1.0f, ',')), z14), Float.valueOf(0.9f));
                TextView textView = this.N;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (s3.O1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new l3(this, 1));
                    w7.z5.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                mVarArr[0].setAlpha(1.0f);
                mVarArr[0].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                mVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new er(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                mVarArr[0].b(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            xh.m mVar2 = mVarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            mVar2.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.S;
                if (arrayList != null) {
                    mVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    mVarArr[2].setOnClickListener(onClickListener);
                } else {
                    mVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    mVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                mVarArr[2].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                mVarArr[2].setOnClickListener(this.R);
            }
            this.f53049c0 = starGift.crafted;
            this.f53061n.f51368a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            fa0VarArr[0].setTextSize(1, 14.0f);
            this.f53049c0 = false;
            dc1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        p7.b1(this.d[0].getImageReceiver(), starGift, 160);
        this.f53051e[0] = (TL_stars.starGiftAttributeModel) m5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.U);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.f53064p0;
            if (stargiftattributepatternArr[i10] != stargiftattributepattern) {
                stargiftattributepatternArr[i10] = stargiftattributepattern;
                this.f53065q0[i10].i(stargiftattributepattern.document, z10);
            }
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.U.d(0);
        float f7 = 10.0f;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        LinearLayout[] linearLayoutArr = this.f53053f;
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
                t2 t2Var = this.L;
                if (t2Var.getMeasuredHeight() > 0) {
                    return t2Var.getMeasuredHeight();
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
        LinearLayout[] linearLayoutArr = this.f53053f;
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
        t2 t2Var = this.L;
        if (t2Var.getMeasuredHeight() > 0) {
            dp = t2Var.getMeasuredHeight();
        } else {
            dp = AndroidUtilities.dp(550.0f);
        }
        return (this.U.a(4) * dp) + a11;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        int i10 = (this.f53069s0 > 0.5f ? 1 : (this.f53069s0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.V;
        if (i10 > 0) {
            return stargiftattributebackdropArr[2];
        }
        return stargiftattributebackdropArr[1];
    }

    public y9 getUpgradeImageView() {
        int i10 = (this.f53069s0 > 0.5f ? 1 : (this.f53069s0 == 0.5f ? 0 : -1));
        y9[] y9VarArr = this.d;
        if (i10 > 0) {
            return y9VarArr[2];
        }
        return y9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        int i10 = (this.f53069s0 > 0.5f ? 1 : (this.f53069s0 == 0.5f ? 0 : -1));
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f53051e;
        if (i10 > 0) {
            return stargiftattributemodelArr[2];
        }
        return stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.f53064p0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        int i11;
        int i12;
        this.f53066r[i10].setText(charSequence);
        FrameLayout frameLayout = this.f53075x;
        fa0[] fa0VarArr = this.f53077y;
        fa0 fa0Var = this.f53068s;
        TextView textView = this.v;
        int i13 = 0;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            fa0Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                fa0VarArr[i10].setVisibility(8);
            }
        } else if (i10 == 0 && !TextUtils.isEmpty(charSequence3)) {
            fa0Var.setText(charSequence3);
            fa0Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                fa0VarArr[i10].setVisibility(8);
            }
        } else {
            fa0VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                if (TextUtils.isEmpty(charSequence2)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
            } else {
                fa0 fa0Var2 = fa0VarArr[i10];
                if (TextUtils.isEmpty(charSequence2)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                fa0Var2.setVisibility(i11);
            }
            fa0Var.setVisibility(8);
            textView.setVisibility(8);
        }
        xh.n0[] n0VarArr = this.F;
        xh.n0 n0Var = n0VarArr[i10];
        if (n0Var != null) {
            if (TextUtils.isEmpty(spannable)) {
                i13 = 8;
            }
            n0Var.setVisibility(i13);
            n0VarArr[i10].setUser(tLObject);
            n0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.f53055g0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        FrameLayout frameLayout = this.f53046b;
        fa0[] fa0VarArr = this.f53066r;
        this.f53052e0 = ((((Math.min(fa0VarArr[2].getPaint().measureText(fa0VarArr[2].getText().toString()), fa0VarArr[2].getWidth()) + fa0VarArr[2].getWidth()) / 2.0f) + (fa0VarArr[2].getX() + (-frameLayout.getLeft()))) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.f53054f0 = (AndroidUtilities.dp(124.0f) + (-frameLayout.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.q5[] q5VarArr = this.f53065q0;
        q5VarArr[0].a();
        q5VarArr[1].a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q5[] q5VarArr = this.f53065q0;
        q5VarArr[0].b();
        q5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.f53057i0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.U.b(2)) {
            k();
            d(this.U);
        }
    }

    public void setPreviewAttributes(n0 n0Var) {
        f4.d dVar = this.U;
        if (dVar != null && dVar.f9645b == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.f53057i0);
            ValueAnimator valueAnimator = this.f53056h0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f53056h0 = null;
            }
            int i10 = 1 - this.f53067r0;
            this.f53067r0 = i10;
            y9[] y9VarArr = this.d;
            dk0 lottieAnimation = y9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            dk0 lottieAnimation2 = y9VarArr[this.f53067r0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.T(lottieAnimation.t(), false);
            }
            int i11 = this.f53067r0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var.f52958a;
            this.V[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, n0Var.f52959b, true);
            int i12 = this.f53067r0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var.f52960c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f53051e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            p7.a1(y9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.f53067r0 + 1].document, 160);
            a();
            float f7 = this.f53067r0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.f53056h0 = ofFloat;
            ofFloat.addUpdateListener(new m3(this, 0));
            this.f53056h0.addListener(new n3(this, 3));
            this.f53056h0.setDuration(320L);
            this.f53056h0.setInterpolator(is.h);
            this.f53056h0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.W = new com.google.android.gms.common.api.internal.r(m5.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.f53045a0 = new com.google.android.gms.common.api.internal.r(m5.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f53047b0 = new com.google.android.gms.common.api.internal.r(m5.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.f53077y[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.f53069s0 = 0.0f;
        this.f53067r0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.f53045a0.c(), true);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.f53051e;
        stargiftattributemodelArr[1] = (TL_stars.starGiftAttributeModel) this.W.c();
        y9[] y9VarArr = this.d;
        p7.a1(y9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f53047b0.c();
        this.V[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.W.f6679f;
        p7.a1(y9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        f0 f0Var = this.f53057i0;
        AndroidUtilities.cancelRunOnUIThread(f0Var);
        AndroidUtilities.runOnUIThread(f0Var, 2500L);
        invalidate();
    }

    public void setResellPrice(zf.a aVar) {
        boolean z10;
        boolean k10 = aVar.k();
        this.M = !k10;
        fa0[] fa0VarArr = this.f53077y;
        TextView textView = this.N;
        if (!k10) {
            int i10 = R.string.GiftOnSale;
            if (aVar.f54485a == zf.b.f54488b) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, p7.V0(z10, "⭐️ " + ((Object) p7.K0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.V[0];
            textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.f53050d0 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            is isVar = is.h;
            duration.setInterpolator(isVar).setListener(new n3(this, 0)).start();
            fa0VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(isVar).start();
        } else {
            ViewPropertyAnimator duration2 = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            is isVar2 = is.h;
            duration2.setInterpolator(isVar2).setListener(new n3(this, 2)).setListener(new n3(this, 1)).start();
            fa0VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(isVar2).start();
        }
        boolean z11 = this.M;
        xh.m[] mVarArr = this.I;
        if (z11) {
            mVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            mVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        mVarArr[2].setOnClickListener(this.S);
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
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.p(tLObject);
        this.K.e(tLObject, j9Var);
        this.f53066r[2].setText(str2);
        this.f53077y[2].setText(str);
        k();
        d(this.U);
    }

    public void j(int i10) {
    }
}
