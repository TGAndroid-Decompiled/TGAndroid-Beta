package xh;

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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.mg;
public final class x2 extends FrameLayout {
    public final org.telegram.ui.Components.x5 E;
    public final n2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.o6 H;
    public final org.telegram.ui.Components.o6 I;
    public final kj0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public wh.h1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public bi.x4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.f6 f46244a;
    public long f46245a0;
    public final w2 f46246b;
    public TLRPC.Document f46247b0;
    public final ImageView f46248c;
    public String f46249c0;
    public final r2[] d;
    public ArrayList f46250d0;
    public final r2 e;
    public Utilities.Callback3 f46251e0;
    public final t2 f46252f;
    public Utilities.Callback2 f46253f0;
    public Runnable f46254g0;
    public final q2 h;
    public boolean f46255h0;
    public boolean f46256i0;
    public boolean f46257j0;
    public Runnable f46258k0;
    public kj0 f46259l0;
    public SpannableStringBuilder m0;
    public final v2[] f46260n;
    public final uh.o f46261r;
    public boolean f46262s;
    public final LinearLayout v;
    public final LinearLayout f46263w;
    public final m2[] f46264x;
    public final m2[] f46265y;

    public x2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.j6.l1(0.08f, -1), org.telegram.ui.ActionBar.j6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f46244a = f6Var;
        w2 w2Var = new w2();
        this.f46246b = w2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        w2Var.f46214g = mutate;
        setBackground(w2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.a6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f46248c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        frameLayout.addView(imageView, w7.a6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new l2(this, 0));
        w7.c6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.a6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new l2(this, 1));
        w7.c6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.a6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.a6.e(-1, -1, 119));
        uh.o oVar = new uh.o(context);
        this.f46261r = oVar;
        oVar.setGravity(17);
        oVar.setTextSize(1, 13.0f);
        oVar.setTextColor(-1);
        frameLayout2.addView(oVar, w7.a6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        wr wrVar = wr.h;
        layoutTransition.setInterpolator(2, wrVar);
        layoutTransition.setInterpolator(3, wrVar);
        layoutTransition.setInterpolator(0, wrVar);
        layoutTransition.setInterpolator(1, wrVar);
        layoutTransition.setInterpolator(4, wrVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46263w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, wrVar);
        layoutTransition2.setInterpolator(3, wrVar);
        layoutTransition2.setInterpolator(0, wrVar);
        layoutTransition2.setInterpolator(1, wrVar);
        layoutTransition2.setInterpolator(4, wrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f46264x = new m2[4];
        this.f46265y = new m2[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.v;
            m2[] m2VarArr = this.f46264x;
            m2 m2Var = new m2(context);
            m2VarArr[i11] = m2Var;
            linearLayout3.addView(m2Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f46264x[i11].setOnClickListener(new l2(this, 2));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.v;
            m2[] m2VarArr2 = this.f46265y;
            m2 m2Var2 = new m2(context);
            m2VarArr2[i12] = m2Var2;
            linearLayout4.addView(m2Var2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f46265y[i12].setOnClickListener(new l2(this, 3));
        }
        this.f46260n = new v2[4];
        this.d = new r2[6];
        int i13 = 0;
        for (int i14 = 6; i13 < i14; i14 = 6) {
            r2[] r2VarArr = this.d;
            if (i13 == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new k3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, w7.a6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
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
            frameLayout6.addView(w9Var, w7.a6.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                w9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                s2 s2Var = new s2(context);
                frameLayout5.f45953b = s2Var;
                s2Var.e = AndroidUtilities.dp(37.0f);
                s2Var.f46028a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(s2Var, w7.a6.e(90, 90, 17));
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                frameLayout5.f45952a = o6Var;
                o6Var.getDrawable().o(false, true, false);
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(-1);
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                o6Var.setGravity(17);
                o6Var.setText("0%");
                frameLayout6.addView(o6Var, w7.a6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            r2VarArr[i13] = frameLayout5;
            i13++;
        }
        this.e = this.d[5];
        t2 t2Var = new t2(context);
        this.f46252f = t2Var;
        t2Var.setVisibility(8);
        t2Var.setAlpha(0.0f);
        addView(t2Var, w7.a6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        q2 q2Var = new q2(context, this.d);
        this.h = q2Var;
        addView(q2Var, w7.a6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.E = x5Var;
        x5Var.setTextSize(1, 12.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        x5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        x5Var.setGravity(17);
        x5Var.setTextColor(-1);
        if (this.f46250d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        x5Var.setAlpha(f7);
        x5Var.setBackground(new k3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        w7.c6.b(x5Var, 0.02f, 1.2f);
        this.Q.addView(x5Var, w7.a6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        x5Var.setOnClickListener(new s1(2, this, f6Var));
        this.Q.addView(this.v, w7.a6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f46263w, w7.a6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        n2 n2Var = new n2();
        this.F = n2Var;
        linearLayout5.setBackground(n2Var);
        n2Var.a(org.telegram.ui.ActionBar.j6.l1(0.08f, -1), org.telegram.ui.ActionBar.j6.l1(0.08f, -1));
        w7.c6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.a6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new l2(this, 4));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.H = o6Var2;
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        o6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(o6Var2, w7.a6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.I = o6Var3;
        o6Var3.getDrawable().o(true, false, false);
        o6Var3.setGravity(17);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        o6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        o6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(o6Var3, w7.a6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setAutoRepeat(true);
        imageView3.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView((View) imageView3, w7.a6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, w7.a6.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.a6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView f11 = org.telegram.ui.Cells.r6.f(this.R, textView3, w7.a6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = f11;
        f11.setTextSize(1, 13.0f);
        f11.setTextColor(-1);
        f11.setTypeface(AndroidUtilities.bold());
        f11.setGravity(17);
        f11.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        f11.setBackground(new k3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, -1)));
        TextView f12 = org.telegram.ui.Cells.r6.f(this.R, f11, w7.a6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        f12.setTextSize(1, 13.0f);
        f12.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, -1));
        f12.setGravity(17);
        f12.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView f13 = org.telegram.ui.Cells.r6.f(this.R, f12, w7.a6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        f13.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        f13.setTextColor(-505270);
        f13.setTextSize(1, 20.0f);
        f13.setTypeface(AndroidUtilities.bold());
        f13.setGravity(17);
        TextView f14 = org.telegram.ui.Cells.r6.f(this.S, f13, w7.a6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = f14;
        f14.setTextColor(-17253);
        f14.setTextSize(1, 13.0f);
        f14.setGravity(17);
        this.S.addView(f14, w7.a6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.a6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j3, TLRPC.Document document, String str) {
        v2[] v2VarArr;
        float f7;
        this.W = i10;
        this.f46245a0 = j3;
        this.f46247b0 = document;
        this.f46249c0 = str;
        this.f46255h0 = false;
        this.f46257j0 = false;
        int i11 = 0;
        while (true) {
            v2VarArr = this.f46260n;
            if (i11 >= v2VarArr.length) {
                break;
            }
            v2 v2Var = v2VarArr[i11];
            if (v2Var != null) {
                AndroidUtilities.removeFromParent(v2Var);
            }
            i11++;
        }
        q2 q2Var = this.h;
        View[] viewArr = q2Var.f45912a;
        p2 p2Var = q2Var.H;
        if (p2Var != null) {
            p2Var.e = true;
            p2Var.f45865l = false;
            p2Var.f45857a.H = null;
            q2Var.H = null;
        }
        ValueAnimator valueAnimator = q2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            q2Var.G = null;
        }
        q2Var.F = -1;
        q2Var.E = 0.0f;
        q2Var.v.clear();
        q2Var.f45919w.clear();
        q2Var.f45920x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            q2Var.f45921y[i12] = 0.0f;
        }
        q2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            q2Var.addView(viewArr[i13], w7.a6.e(108, 108, 17));
        }
        Matrix.setIdentityM(q2Var.f45914c, 0);
        q2Var.e = 0.0f;
        q2Var.d = 0.0f;
        q2Var.f45915f = true;
        v2 v2Var2 = new v2(getContext());
        v2VarArr[0] = v2Var2;
        addView(v2Var2, w7.a6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        v2 v2Var3 = new v2(getContext());
        v2VarArr[1] = v2Var3;
        addView(v2Var3, w7.a6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        v2 v2Var4 = new v2(getContext());
        v2VarArr[2] = v2Var4;
        addView(v2Var4, w7.a6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        v2 v2Var5 = new v2(getContext());
        v2VarArr[3] = v2Var5;
        addView(v2Var5, w7.a6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < v2VarArr.length; i14++) {
            w7.c6.a(v2VarArr[i14]);
            v2VarArr[i14].setClickable(true);
            v2VarArr[i14].setOnClickListener(new l2(this, 5));
        }
        d(false);
        this.f46255h0 = false;
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
        if (this.f46262s) {
            f7 = 0.0f;
        } else if (this.f46250d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        t2 t2Var = this.f46252f;
        t2Var.setVisibility(8);
        t2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.o6 o6Var = this.H;
        o6Var.setText(string);
        o6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j3, new mg(this, j3, j3, 2));
    }

    public final void b(m2 m2Var) {
        if (m2Var.d != null) {
            c(m2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(m2Var.f45699f * 100.0f), m2Var.d.name)));
        } else if (m2Var.e != null) {
            c(m2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(m2Var.f45699f * 100.0f), m2Var.e.name)));
        }
    }

    public final void c(m2 m2Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        bi.x4 x4Var = this.T;
        View view = null;
        if (x4Var != null) {
            x4Var.e(true);
            this.T = null;
        }
        if (!this.f46255h0 && !this.f46257j0) {
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
            bi.x4 x4Var2 = new bi.x4(getContext(), 3);
            this.T = x4Var2;
            x4Var2.p(true);
            this.T.s(spannableStringBuilder);
            bi.x4 x4Var3 = this.T;
            x4Var3.h = bi.x4.a(x4Var3.getText(), this.T.getTextPaint());
            bi.x4 x4Var4 = this.T;
            x4Var4.K = Layout.Alignment.ALIGN_CENTER;
            x4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, w7.a6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((m2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x2.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            v2[] v2VarArr = this.f46260n;
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
            v2[] v2VarArr = this.f46260n;
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
            v2[] v2VarArr = this.f46260n;
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
        this.f46253f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f46254g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f46251e0 = callback3;
    }
}
