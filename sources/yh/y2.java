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
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.kg;
public final class y2 extends FrameLayout {
    public final org.telegram.ui.Components.y5 E;
    public final n2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.p6 H;
    public final org.telegram.ui.Components.p6 I;
    public final nj0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public xh.i1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public ci.e4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.d6 f52256a;
    public long f52257a0;
    public final x2 f52258b;
    public TLRPC.Document f52259b0;
    public final ImageView f52260c;
    public String f52261c0;
    public final s2[] d;
    public ArrayList f52262d0;
    public final s2 f52263e;
    public Utilities.Callback3 f52264e0;
    public final u2 f52265f;
    public Utilities.Callback2 f52266f0;
    public Runnable f52267g0;
    public final r2 h;
    public boolean f52268h0;
    public boolean f52269i0;
    public boolean f52270j0;
    public Runnable f52271k0;
    public nj0 f52272l0;
    public SpannableStringBuilder m0;
    public final w2[] f52273n;
    public final vh.n f52274r;
    public boolean f52275s;
    public final LinearLayout v;
    public final LinearLayout f52276w;
    public final m2[] f52277x;
    public final m2[] f52278y;

    public y2(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.i6.l1(0.08f, -1), org.telegram.ui.ActionBar.i6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f52256a = d6Var;
        x2 x2Var = new x2();
        this.f52258b = x2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        x2Var.f52221g = mutate;
        setBackground(x2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.z5.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f52260c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new l3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        frameLayout.addView(imageView, w7.z5.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new l2(this, 0));
        w7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new l3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.z5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new l2(this, 1));
        w7.b6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.z5.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.z5.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.z5.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.z5.e(-1, -1, 119));
        vh.n nVar = new vh.n(context);
        this.f52274r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, w7.z5.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        tr trVar = tr.h;
        layoutTransition.setInterpolator(2, trVar);
        layoutTransition.setInterpolator(3, trVar);
        layoutTransition.setInterpolator(0, trVar);
        layoutTransition.setInterpolator(1, trVar);
        layoutTransition.setInterpolator(4, trVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f52276w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, trVar);
        layoutTransition2.setInterpolator(3, trVar);
        layoutTransition2.setInterpolator(0, trVar);
        layoutTransition2.setInterpolator(1, trVar);
        layoutTransition2.setInterpolator(4, trVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f52277x = new m2[4];
        this.f52278y = new m2[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.v;
            m2[] m2VarArr = this.f52277x;
            m2 m2Var = new m2(context);
            m2VarArr[i11] = m2Var;
            linearLayout3.addView(m2Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f52277x[i11].setOnClickListener(new l2(this, 2));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.v;
            m2[] m2VarArr2 = this.f52278y;
            m2 m2Var2 = new m2(context);
            m2VarArr2[i12] = m2Var2;
            linearLayout4.addView(m2Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f52278y[i12].setOnClickListener(new l2(this, 3));
        }
        this.f52273n = new w2[4];
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
            frameLayout6.setBackground(new l3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, w7.z5.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            w9 w9Var = new w9(context);
            w9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            w9Var.setAlpha(f10);
            if (z10) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(w9Var, w7.z5.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                w9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                t2 t2Var = new t2(context);
                frameLayout5.f51960b = t2Var;
                t2Var.f52016e = AndroidUtilities.dp(37.0f);
                t2Var.f52013a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(t2Var, w7.z5.e(90, 90, 17));
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
                frameLayout5.f51959a = p6Var;
                p6Var.getDrawable().o(false, true, false);
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextColor(-1);
                p6Var.setTextSize(AndroidUtilities.dp(14.0f));
                p6Var.setGravity(17);
                p6Var.setText("0%");
                frameLayout6.addView(p6Var, w7.z5.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            s2VarArr[i13] = frameLayout5;
            i13++;
        }
        this.f52263e = this.d[5];
        u2 u2Var = new u2(context);
        this.f52265f = u2Var;
        u2Var.setVisibility(8);
        u2Var.setAlpha(0.0f);
        addView(u2Var, w7.z5.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        r2 r2Var = new r2(context, this.d);
        this.h = r2Var;
        addView(r2Var, w7.z5.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        this.E = y5Var;
        y5Var.setTextSize(1, 12.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        y5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        y5Var.setGravity(17);
        y5Var.setTextColor(-1);
        if (this.f52262d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        y5Var.setAlpha(f7);
        y5Var.setBackground(new l3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        w7.b6.b(y5Var, 0.02f, 1.2f);
        this.Q.addView(y5Var, w7.z5.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        y5Var.setOnClickListener(new x(6, this, d6Var));
        this.Q.addView(this.v, w7.z5.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f52276w, w7.z5.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        n2 n2Var = new n2();
        this.F = n2Var;
        linearLayout5.setBackground(n2Var);
        n2Var.a(org.telegram.ui.ActionBar.i6.l1(0.08f, -1), org.telegram.ui.ActionBar.i6.l1(0.08f, -1));
        w7.b6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.z5.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new l2(this, 4));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, false, false);
        this.H = p6Var2;
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        p6Var2.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.75f, -1));
        p6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(p6Var2, w7.z5.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(context, false, false, false);
        this.I = p6Var3;
        p6Var3.getDrawable().o(true, false, false);
        p6Var3.setGravity(17);
        p6Var3.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.75f, -1));
        p6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        p6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(p6Var3, w7.z5.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, w7.z5.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.z5.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.z5.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView i15 = org.telegram.ui.Cells.c1.i(this.R, textView3, w7.z5.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = i15;
        i15.setTextSize(1, 13.0f);
        i15.setTextColor(-1);
        i15.setTypeface(AndroidUtilities.bold());
        i15.setGravity(17);
        i15.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        i15.setBackground(new l3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, -1)));
        TextView i16 = org.telegram.ui.Cells.c1.i(this.R, i15, w7.z5.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        i16.setTextSize(1, 13.0f);
        i16.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.5f, -1));
        i16.setGravity(17);
        i16.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView i17 = org.telegram.ui.Cells.c1.i(this.R, i16, w7.z5.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        i17.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        i17.setTextColor(-505270);
        i17.setTextSize(1, 20.0f);
        i17.setTypeface(AndroidUtilities.bold());
        i17.setGravity(17);
        TextView i18 = org.telegram.ui.Cells.c1.i(this.S, i17, w7.z5.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = i18;
        i18.setTextColor(-17253);
        i18.setTextSize(1, 13.0f);
        i18.setGravity(17);
        this.S.addView(i18, w7.z5.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.z5.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j3, TLRPC.Document document, String str) {
        w2[] w2VarArr;
        float f7;
        this.W = i10;
        this.f52257a0 = j3;
        this.f52259b0 = document;
        this.f52261c0 = str;
        this.f52268h0 = false;
        this.f52270j0 = false;
        int i11 = 0;
        while (true) {
            w2VarArr = this.f52273n;
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
        View[] viewArr = r2Var.f51903a;
        q2 q2Var = r2Var.H;
        if (q2Var != null) {
            q2Var.f51856e = true;
            q2Var.f51862l = false;
            q2Var.f51853a.H = null;
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
        r2Var.f51911w.clear();
        r2Var.f51912x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            r2Var.f51913y[i12] = 0.0f;
        }
        r2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            r2Var.addView(viewArr[i13], w7.z5.e(108, 108, 17));
        }
        Matrix.setIdentityM(r2Var.f51905c, 0);
        r2Var.f51906e = 0.0f;
        r2Var.d = 0.0f;
        r2Var.f51907f = true;
        w2 w2Var2 = new w2(getContext());
        w2VarArr[0] = w2Var2;
        addView(w2Var2, w7.z5.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        w2 w2Var3 = new w2(getContext());
        w2VarArr[1] = w2Var3;
        addView(w2Var3, w7.z5.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        w2 w2Var4 = new w2(getContext());
        w2VarArr[2] = w2Var4;
        addView(w2Var4, w7.z5.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        w2 w2Var5 = new w2(getContext());
        w2VarArr[3] = w2Var5;
        addView(w2Var5, w7.z5.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < w2VarArr.length; i14++) {
            w7.b6.a(w2VarArr[i14]);
            w2VarArr[i14].setClickable(true);
            w2VarArr[i14].setOnClickListener(new l2(this, 5));
        }
        d(false);
        this.f52268h0 = false;
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
        if (this.f52275s) {
            f7 = 0.0f;
        } else if (this.f52262d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        u2 u2Var = this.f52265f;
        u2Var.setVisibility(8);
        u2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.p6 p6Var = this.H;
        p6Var.setText(string);
        p6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j3, new kg(this, j3, j3, 2));
    }

    public final void b(m2 m2Var) {
        if (m2Var.d != null) {
            c(m2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(m2Var.f51632f * 100.0f), m2Var.d.name)));
        } else if (m2Var.f51631e != null) {
            c(m2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(m2Var.f51632f * 100.0f), m2Var.f51631e.name)));
        }
    }

    public final void c(m2 m2Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        ci.e4 e4Var = this.T;
        View view = null;
        if (e4Var != null) {
            e4Var.e(true);
            this.T = null;
        }
        if (!this.f52268h0 && !this.f52270j0) {
            if (m2Var.getParent() instanceof View) {
                view = (View) m2Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x10 = m2Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = m2Var.getY() + f10;
            ci.e4 e4Var2 = new ci.e4(getContext(), 3);
            this.T = e4Var2;
            e4Var2.p(true);
            this.T.s(spannableStringBuilder);
            ci.e4 e4Var3 = this.T;
            e4Var3.h = ci.e4.a(e4Var3.getText(), this.T.getTextPaint());
            ci.e4 e4Var4 = this.T;
            e4Var4.K = Layout.Alignment.ALIGN_CENTER;
            e4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, w7.z5.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((m2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.y2.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            w2[] w2VarArr = this.f52273n;
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
            w2[] w2VarArr = this.f52273n;
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
            w2[] w2VarArr = this.f52273n;
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
        this.f52266f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f52267g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f52264e0 = callback3;
    }
}
