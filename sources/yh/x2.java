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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.bh;
public final class x2 extends FrameLayout {
    public final org.telegram.ui.Components.y5 E;
    public final m2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.p6 H;
    public final org.telegram.ui.Components.p6 I;
    public final lj0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public xh.j1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public ci.e4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.d6 f48194a;
    public long f48195a0;
    public final w2 f48196b;
    public TLRPC.Document f48197b0;
    public final ImageView f48198c;
    public String f48199c0;
    public final q2[] d;
    public ArrayList f48200d0;
    public final q2 e;
    public Utilities.Callback3 f48201e0;
    public final t2 f48202f;
    public Utilities.Callback2 f48203f0;
    public Runnable f48204g0;
    public final p2 h;
    public boolean f48205h0;
    public boolean f48206i0;
    public boolean f48207j0;
    public Runnable f48208k0;
    public lj0 f48209l0;
    public SpannableStringBuilder m0;
    public final v2[] f48210n;
    public final vh.n f48211r;
    public boolean f48212s;
    public final LinearLayout v;
    public final LinearLayout f48213w;
    public final l2[] f48214x;
    public final l2[] f48215y;

    public x2(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.h6.l1(0.08f, -1), org.telegram.ui.ActionBar.h6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f48194a = d6Var;
        w2 w2Var = new w2();
        this.f48196b = w2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        w2Var.f48158g = mutate;
        setBackground(w2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.y5.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f48198c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.l1(0.08f, -1)));
        frameLayout.addView(imageView, w7.y5.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new k2(this, 0));
        w7.a6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.y5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new k2(this, 1));
        w7.a6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.y5.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.y5.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.y5.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.y5.e(-1, -1, 119));
        vh.n nVar = new vh.n(context);
        this.f48211r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, w7.y5.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        rr rrVar = rr.h;
        layoutTransition.setInterpolator(2, rrVar);
        layoutTransition.setInterpolator(3, rrVar);
        layoutTransition.setInterpolator(0, rrVar);
        layoutTransition.setInterpolator(1, rrVar);
        layoutTransition.setInterpolator(4, rrVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f48213w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, rrVar);
        layoutTransition2.setInterpolator(3, rrVar);
        layoutTransition2.setInterpolator(0, rrVar);
        layoutTransition2.setInterpolator(1, rrVar);
        layoutTransition2.setInterpolator(4, rrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f48214x = new l2[4];
        this.f48215y = new l2[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.v;
            l2[] l2VarArr = this.f48214x;
            l2 l2Var = new l2(context);
            l2VarArr[i11] = l2Var;
            linearLayout3.addView(l2Var, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f48214x[i11].setOnClickListener(new k2(this, 2));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.v;
            l2[] l2VarArr2 = this.f48215y;
            l2 l2Var2 = new l2(context);
            l2VarArr2[i12] = l2Var2;
            linearLayout4.addView(l2Var2, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f48215y[i12].setOnClickListener(new k2(this, 3));
        }
        this.f48210n = new v2[4];
        this.d = new q2[6];
        int i13 = 0;
        for (int i14 = 6; i13 < i14; i14 = 6) {
            q2[] q2VarArr = this.d;
            if (i13 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.l1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, w7.y5.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
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
            frameLayout6.addView(w9Var, w7.y5.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                w9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                s2 s2Var = new s2(context);
                frameLayout5.f47890b = s2Var;
                s2Var.e = AndroidUtilities.dp(37.0f);
                s2Var.f47982a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(s2Var, w7.y5.e(90, 90, 17));
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
                frameLayout5.f47889a = p6Var;
                p6Var.getDrawable().o(false, true, false);
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextColor(-1);
                p6Var.setTextSize(AndroidUtilities.dp(14.0f));
                p6Var.setGravity(17);
                p6Var.setText("0%");
                frameLayout6.addView(p6Var, w7.y5.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            q2VarArr[i13] = frameLayout5;
            i13++;
        }
        this.e = this.d[5];
        t2 t2Var = new t2(context);
        this.f48202f = t2Var;
        t2Var.setVisibility(8);
        t2Var.setAlpha(0.0f);
        addView(t2Var, w7.y5.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        p2 p2Var = new p2(context, this.d);
        this.h = p2Var;
        addView(p2Var, w7.y5.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        this.E = y5Var;
        y5Var.setTextSize(1, 12.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        y5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        y5Var.setGravity(17);
        y5Var.setTextColor(-1);
        if (this.f48200d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        y5Var.setAlpha(f7);
        y5Var.setBackground(new k3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.l1(0.08f, -1)));
        w7.a6.b(y5Var, 0.02f, 1.2f);
        this.Q.addView(y5Var, w7.y5.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        y5Var.setOnClickListener(new w(6, this, d6Var));
        this.Q.addView(this.v, w7.y5.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f48213w, w7.y5.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        m2 m2Var = new m2();
        this.F = m2Var;
        linearLayout5.setBackground(m2Var);
        m2Var.a(org.telegram.ui.ActionBar.h6.l1(0.08f, -1), org.telegram.ui.ActionBar.h6.l1(0.08f, -1));
        w7.a6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.y5.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new k2(this, 4));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, false, false);
        this.H = p6Var2;
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.75f, -1));
        p6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(p6Var2, w7.y5.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(context, false, false, false);
        this.I = p6Var3;
        p6Var3.getDrawable().o(true, false, false);
        p6Var3.setGravity(17);
        p6Var3.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.75f, -1));
        p6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        p6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(p6Var3, w7.y5.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, w7.y5.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.y5.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.y5.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView h = org.telegram.ui.Cells.c1.h(this.R, textView3, w7.y5.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        h.setBackground(new k3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.l1(0.08f, -1)));
        TextView h10 = org.telegram.ui.Cells.c1.h(this.R, h, w7.y5.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        h10.setTextSize(1, 13.0f);
        h10.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.5f, -1));
        h10.setGravity(17);
        h10.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView h11 = org.telegram.ui.Cells.c1.h(this.R, h10, w7.y5.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        h11.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        h11.setTextColor(-505270);
        h11.setTextSize(1, 20.0f);
        h11.setTypeface(AndroidUtilities.bold());
        h11.setGravity(17);
        TextView h12 = org.telegram.ui.Cells.c1.h(this.S, h11, w7.y5.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = h12;
        h12.setTextColor(-17253);
        h12.setTextSize(1, 13.0f);
        h12.setGravity(17);
        this.S.addView(h12, w7.y5.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.y5.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j3, TLRPC.Document document, String str) {
        v2[] v2VarArr;
        float f7;
        this.W = i10;
        this.f48195a0 = j3;
        this.f48197b0 = document;
        this.f48199c0 = str;
        this.f48205h0 = false;
        this.f48207j0 = false;
        int i11 = 0;
        while (true) {
            v2VarArr = this.f48210n;
            if (i11 >= v2VarArr.length) {
                break;
            }
            v2 v2Var = v2VarArr[i11];
            if (v2Var != null) {
                AndroidUtilities.removeFromParent(v2Var);
            }
            i11++;
        }
        p2 p2Var = this.h;
        View[] viewArr = p2Var.f47848a;
        o2 o2Var = p2Var.H;
        if (o2Var != null) {
            o2Var.e = true;
            o2Var.f47797l = false;
            o2Var.f47789a.H = null;
            p2Var.H = null;
        }
        ValueAnimator valueAnimator = p2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            p2Var.G = null;
        }
        p2Var.F = -1;
        p2Var.E = 0.0f;
        p2Var.v.clear();
        p2Var.f47855w.clear();
        p2Var.f47856x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            p2Var.f47857y[i12] = 0.0f;
        }
        p2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            p2Var.addView(viewArr[i13], w7.y5.e(108, 108, 17));
        }
        Matrix.setIdentityM(p2Var.f47850c, 0);
        p2Var.e = 0.0f;
        p2Var.d = 0.0f;
        p2Var.f47851f = true;
        v2 v2Var2 = new v2(getContext());
        v2VarArr[0] = v2Var2;
        addView(v2Var2, w7.y5.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        v2 v2Var3 = new v2(getContext());
        v2VarArr[1] = v2Var3;
        addView(v2Var3, w7.y5.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        v2 v2Var4 = new v2(getContext());
        v2VarArr[2] = v2Var4;
        addView(v2Var4, w7.y5.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        v2 v2Var5 = new v2(getContext());
        v2VarArr[3] = v2Var5;
        addView(v2Var5, w7.y5.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < v2VarArr.length; i14++) {
            w7.a6.a(v2VarArr[i14]);
            v2VarArr[i14].setClickable(true);
            v2VarArr[i14].setOnClickListener(new k2(this, 5));
        }
        d(false);
        this.f48205h0 = false;
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
        if (this.f48212s) {
            f7 = 0.0f;
        } else if (this.f48200d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        t2 t2Var = this.f48202f;
        t2Var.setVisibility(8);
        t2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.p6 p6Var = this.H;
        p6Var.setText(string);
        p6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j3, new bh(this, j3, j3, 2));
    }

    public final void b(l2 l2Var) {
        if (l2Var.d != null) {
            c(l2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(l2Var.f47631f * 100.0f), l2Var.d.name)));
        } else if (l2Var.e != null) {
            c(l2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(l2Var.f47631f * 100.0f), l2Var.e.name)));
        }
    }

    public final void c(l2 l2Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        ci.e4 e4Var = this.T;
        View view = null;
        if (e4Var != null) {
            e4Var.e(true);
            this.T = null;
        }
        if (!this.f48205h0 && !this.f48207j0) {
            if (l2Var.getParent() instanceof View) {
                view = (View) l2Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x10 = l2Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = l2Var.getY() + f10;
            ci.e4 e4Var2 = new ci.e4(getContext(), 3);
            this.T = e4Var2;
            e4Var2.p(true);
            this.T.s(spannableStringBuilder);
            ci.e4 e4Var3 = this.T;
            e4Var3.h = ci.e4.a(e4Var3.getText(), this.T.getTextPaint());
            ci.e4 e4Var4 = this.T;
            e4Var4.K = Layout.Alignment.ALIGN_CENTER;
            e4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, w7.y5.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((l2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.x2.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            v2[] v2VarArr = this.f48210n;
            if (i10 >= v2VarArr.length) {
                return null;
            }
            v2 v2Var = v2VarArr[i10];
            if (v2Var != null) {
                TL_stars.StarGift starGift2 = v2Var.h;
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
            v2[] v2VarArr = this.f48210n;
            if (i10 < v2VarArr.length) {
                v2 v2Var = v2VarArr[i10];
                if (v2Var != null) {
                    TL_stars.StarGift starGift = v2Var.h;
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
            v2[] v2VarArr = this.f48210n;
            if (i10 < v2VarArr.length) {
                v2 v2Var = v2VarArr[i10];
                if (v2Var != null) {
                    TL_stars.StarGift starGift2 = v2Var.h;
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
        this.f48203f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f48204g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f48201e0 = callback3;
    }
}
