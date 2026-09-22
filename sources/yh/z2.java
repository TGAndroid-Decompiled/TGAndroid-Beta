package yh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
import org.telegram.ui.lg;
public final class z2 extends FrameLayout {
    public final org.telegram.ui.Components.w5 E;
    public final o2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.n6 H;
    public final org.telegram.ui.Components.n6 I;
    public final aj0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public xh.i1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public ci.f4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.e6 f47988a;
    public long f47989a0;
    public final y2 f47990b;
    public TLRPC.Document f47991b0;
    public final ImageView f47992c;
    public String f47993c0;
    public final s2[] d;
    public ArrayList f47994d0;
    public final s2 e;
    public Utilities.Callback3 f47995e0;
    public final u2 f47996f;
    public Utilities.Callback2 f47997f0;
    public Runnable f47998g0;
    public final r2 h;
    public boolean f47999h0;
    public boolean f48000i0;
    public boolean f48001j0;
    public Runnable f48002k0;
    public aj0 f48003l0;
    public SpannableStringBuilder m0;
    public final w2[] f48004n;
    public final vh.o f48005r;
    public boolean f48006s;
    public final LinearLayout v;
    public final LinearLayout f48007w;
    public final n2[] f48008x;
    public final n2[] f48009y;

    public z2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.i6.l1(0.08f, -1), org.telegram.ui.ActionBar.i6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f47988a = e6Var;
        y2 y2Var = new y2();
        this.f47990b = y2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        y2Var.f47959g = mutate;
        setBackground(y2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.x5.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f47992c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new m3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        frameLayout.addView(imageView, w7.x5.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new m2(this, 0));
        w7.z5.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new m3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.x5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new m2(this, 1));
        w7.z5.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.x5.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.x5.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.x5.e(-1, -1, 119));
        vh.o oVar = new vh.o(context);
        this.f48005r = oVar;
        oVar.setGravity(17);
        oVar.setTextSize(1, 13.0f);
        oVar.setTextColor(-1);
        frameLayout2.addView(oVar, w7.x5.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        qr qrVar = qr.h;
        layoutTransition.setInterpolator(2, qrVar);
        layoutTransition.setInterpolator(3, qrVar);
        layoutTransition.setInterpolator(0, qrVar);
        layoutTransition.setInterpolator(1, qrVar);
        layoutTransition.setInterpolator(4, qrVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f48007w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, qrVar);
        layoutTransition2.setInterpolator(3, qrVar);
        layoutTransition2.setInterpolator(0, qrVar);
        layoutTransition2.setInterpolator(1, qrVar);
        layoutTransition2.setInterpolator(4, qrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f48008x = new n2[4];
        this.f48009y = new n2[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.v;
            n2[] n2VarArr = this.f48008x;
            n2 n2Var = new n2(context);
            n2VarArr[i11] = n2Var;
            linearLayout3.addView(n2Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f48008x[i11].setOnClickListener(new m2(this, 2));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.v;
            n2[] n2VarArr2 = this.f48009y;
            n2 n2Var2 = new n2(context);
            n2VarArr2[i12] = n2Var2;
            linearLayout4.addView(n2Var2, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f48009y[i12].setOnClickListener(new m2(this, 3));
        }
        this.f48004n = new w2[4];
        this.d = new s2[6];
        int i13 = 0;
        for (int i14 = 6; i13 < i14; i14 = 6) {
            s2[] s2VarArr = this.d;
            if (i13 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new m3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, w7.x5.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            u9 u9Var = new u9(context);
            u9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            u9Var.setAlpha(f10);
            if (z10) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(u9Var, w7.x5.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                u9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                t2 t2Var = new t2(context);
                frameLayout5.f47723b = t2Var;
                t2Var.e = AndroidUtilities.dp(37.0f);
                t2Var.f47751a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(t2Var, w7.x5.e(90, 90, 17));
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
                frameLayout5.f47722a = n6Var;
                n6Var.getDrawable().o(false, true, false);
                n6Var.setTypeface(AndroidUtilities.bold());
                n6Var.setTextColor(-1);
                n6Var.setTextSize(AndroidUtilities.dp(14.0f));
                n6Var.setGravity(17);
                n6Var.setText("0%");
                frameLayout6.addView(n6Var, w7.x5.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            s2VarArr[i13] = frameLayout5;
            i13++;
        }
        this.e = this.d[5];
        u2 u2Var = new u2(context);
        this.f47996f = u2Var;
        u2Var.setVisibility(8);
        u2Var.setAlpha(0.0f);
        addView(u2Var, w7.x5.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        r2 r2Var = new r2(context, this.d);
        this.h = r2Var;
        addView(r2Var, w7.x5.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.E = w5Var;
        w5Var.setTextSize(1, 12.0f);
        w5Var.setTypeface(AndroidUtilities.bold());
        w5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        w5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        w5Var.setGravity(17);
        w5Var.setTextColor(-1);
        if (this.f47994d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        w5Var.setAlpha(f7);
        w5Var.setBackground(new m3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        w7.z5.b(w5Var, 0.02f, 1.2f);
        this.Q.addView(w5Var, w7.x5.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        w5Var.setOnClickListener(new w(6, this, e6Var));
        this.Q.addView(this.v, w7.x5.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f48007w, w7.x5.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        o2 o2Var = new o2();
        this.F = o2Var;
        linearLayout5.setBackground(o2Var);
        o2Var.a(org.telegram.ui.ActionBar.i6.l1(0.08f, -1), org.telegram.ui.ActionBar.i6.l1(0.08f, -1));
        w7.z5.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.x5.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new m2(this, 4));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, false, false);
        this.H = n6Var2;
        n6Var2.setTypeface(AndroidUtilities.bold());
        n6Var2.setGravity(17);
        n6Var2.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.75f, -1));
        n6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        n6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(n6Var2, w7.x5.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, false, false, false);
        this.I = n6Var3;
        n6Var3.getDrawable().o(true, false, false);
        n6Var3.setGravity(17);
        n6Var3.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.75f, -1));
        n6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        n6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(n6Var3, w7.x5.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, w7.x5.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.x5.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.x5.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView f11 = org.telegram.ui.Cells.q3.f(this.R, textView3, w7.x5.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = f11;
        f11.setTextSize(1, 13.0f);
        f11.setTextColor(-1);
        f11.setTypeface(AndroidUtilities.bold());
        f11.setGravity(17);
        f11.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        f11.setBackground(new m3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        TextView f12 = org.telegram.ui.Cells.q3.f(this.R, f11, w7.x5.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        f12.setTextSize(1, 13.0f);
        f12.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.5f, -1));
        f12.setGravity(17);
        f12.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView f13 = org.telegram.ui.Cells.q3.f(this.R, f12, w7.x5.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        f13.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        f13.setTextColor(-505270);
        f13.setTextSize(1, 20.0f);
        f13.setTypeface(AndroidUtilities.bold());
        f13.setGravity(17);
        TextView f14 = org.telegram.ui.Cells.q3.f(this.S, f13, w7.x5.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = f14;
        f14.setTextColor(-17253);
        f14.setTextSize(1, 13.0f);
        f14.setGravity(17);
        this.S.addView(f14, w7.x5.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.x5.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j3, TLRPC.Document document, String str) {
        w2[] w2VarArr;
        float f7;
        this.W = i10;
        this.f47989a0 = j3;
        this.f47991b0 = document;
        this.f47993c0 = str;
        this.f47999h0 = false;
        this.f48001j0 = false;
        int i11 = 0;
        while (true) {
            w2VarArr = this.f48004n;
            if (i11 >= w2VarArr.length) {
                break;
            }
            w2 w2Var = w2VarArr[i11];
            if (w2Var != null) {
                AndroidUtilities.removeFromParent(w2Var);
            }
            i11++;
        }
        r2 r2Var = this.h;
        View[] viewArr = r2Var.f47651a;
        q2 q2Var = r2Var.H;
        if (q2Var != null) {
            q2Var.e = true;
            q2Var.f47608l = false;
            q2Var.f47600a.H = null;
            r2Var.H = null;
        }
        ValueAnimator valueAnimator = r2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            r2Var.G = null;
        }
        r2Var.F = -1;
        r2Var.E = 0.0f;
        r2Var.v.clear();
        r2Var.f47658w.clear();
        r2Var.f47659x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            r2Var.f47660y[i12] = 0.0f;
        }
        r2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            r2Var.addView(viewArr[i13], w7.x5.e(108, 108, 17));
        }
        Matrix.setIdentityM(r2Var.f47653c, 0);
        r2Var.e = 0.0f;
        r2Var.d = 0.0f;
        r2Var.f47654f = true;
        w2 w2Var2 = new w2(getContext());
        w2VarArr[0] = w2Var2;
        addView(w2Var2, w7.x5.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        w2 w2Var3 = new w2(getContext());
        w2VarArr[1] = w2Var3;
        addView(w2Var3, w7.x5.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        w2 w2Var4 = new w2(getContext());
        w2VarArr[2] = w2Var4;
        addView(w2Var4, w7.x5.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        w2 w2Var5 = new w2(getContext());
        w2VarArr[3] = w2Var5;
        addView(w2Var5, w7.x5.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < w2VarArr.length; i14++) {
            w7.z5.a(w2VarArr[i14]);
            w2VarArr[i14].setClickable(true);
            w2VarArr[i14].setOnClickListener(new m2(this, 5));
        }
        d(false);
        this.f47999h0 = false;
        FrameLayout frameLayout = this.Q;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.G;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.R;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.S;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.P;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        if (this.f48006s) {
            f7 = 0.0f;
        } else if (this.f47994d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        u2 u2Var = this.f47996f;
        u2Var.setVisibility(8);
        u2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.n6 n6Var = this.H;
        n6Var.setText(string);
        n6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j3, new lg(this, j3, j3, 2));
    }

    public final void b(n2 n2Var) {
        if (n2Var.d != null) {
            c(n2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(n2Var.f47456f * 100.0f), n2Var.d.name)));
        } else if (n2Var.e != null) {
            c(n2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(n2Var.f47456f * 100.0f), n2Var.e.name)));
        }
    }

    public final void c(n2 n2Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        ci.f4 f4Var = this.T;
        View view = null;
        if (f4Var != null) {
            f4Var.e(true);
            this.T = null;
        }
        if (!this.f47999h0 && !this.f48001j0) {
            if (n2Var.getParent() instanceof View) {
                view = (View) n2Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x10 = n2Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = n2Var.getY() + f10;
            ci.f4 f4Var2 = new ci.f4(getContext(), 3);
            this.T = f4Var2;
            f4Var2.p(true);
            this.T.s(spannableStringBuilder);
            ci.f4 f4Var3 = this.T;
            f4Var3.h = ci.f4.a(f4Var3.getText(), this.T.getTextPaint());
            ci.f4 f4Var4 = this.T;
            f4Var4.K = Layout.Alignment.ALIGN_CENTER;
            f4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, w7.x5.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((n2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.z2.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            w2[] w2VarArr = this.f48004n;
            if (i10 >= w2VarArr.length) {
                return null;
            }
            w2 w2Var = w2VarArr[i10];
            if (w2Var != null) {
                TL_stars.StarGift starGift2 = w2Var.h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        return null;
                    }
                    return starGift2;
                }
            }
            i10++;
        }
    }

    public int getGiftsSelectedCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            w2[] w2VarArr = this.f48004n;
            if (i10 < w2VarArr.length) {
                w2 w2Var = w2VarArr[i10];
                if (w2Var != null) {
                    TL_stars.StarGift starGift = w2Var.h;
                    if (starGift == null) {
                        starGift = null;
                    }
                    if (starGift != null) {
                        i11++;
                    }
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public int getGiftsSuccessChance() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            w2[] w2VarArr = this.f48004n;
            if (i10 < w2VarArr.length) {
                w2 w2Var = w2VarArr[i10];
                if (w2Var != null) {
                    TL_stars.StarGift starGift2 = w2Var.h;
                    if (starGift2 != null) {
                        starGift = starGift2;
                    } else {
                        starGift = null;
                    }
                    if (starGift != null) {
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        i11 += starGift2.craft_chance_permille;
                    }
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> callback2) {
        this.f47997f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f47998g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f47995e0 = callback3;
    }
}
