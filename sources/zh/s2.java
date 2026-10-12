package zh;

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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.z9;
import org.telegram.ui.ih;
public final class s2 extends FrameLayout {
    public final org.telegram.ui.Components.a6 E;
    public final i2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.s6 H;
    public final org.telegram.ui.Components.s6 I;
    public final bk0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public yh.h1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public di.d4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.c6 f51133a;
    public long f51134a0;
    public final r2 f51135b;
    public TLRPC.Document f51136b0;
    public final ImageView f51137c;
    public String f51138c0;
    public final m2[] d;
    public ArrayList f51139d0;
    public final m2 e;
    public Utilities.Callback3 f51140e0;
    public final o2 f51141f;
    public Utilities.Callback2 f51142f0;
    public Runnable f51143g0;
    public final l2 h;
    public boolean f51144h0;
    public boolean f51145i0;
    public boolean f51146j0;
    public Runnable f51147k0;
    public bk0 f51148l0;
    public SpannableStringBuilder m0;
    public final q2[] f51149n;
    public final wh.n f51150r;
    public boolean f51151s;
    public final LinearLayout v;
    public final LinearLayout f51152w;
    public final h2[] f51153x;
    public final h2[] f51154y;

    public s2(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        int i11 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.g6.m1(0.08f, -1), org.telegram.ui.ActionBar.g6.m1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f51133a = c6Var;
        r2 r2Var = new r2();
        this.f51135b = r2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        r2Var.f51065g = mutate;
        setBackground(r2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.a6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f51137c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new f3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        frameLayout.addView(imageView, w7.a6.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 51));
        imageView.setOnClickListener(new g2(this, 0));
        w7.c6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new f3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.a6.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 53));
        boolean z11 = true;
        imageView2.setOnClickListener(new g2(this, 1));
        w7.c6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.a6.a(-2.0f, 0.0f, 20.0f, 0.0f, 0.0f, -1, 49));
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
        wh.n nVar = new wh.n(context);
        this.f51150r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, w7.a6.a(-2.0f, 32.0f, 244.0f, 32.0f, 84.0f, -1, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        es esVar = es.h;
        layoutTransition.setInterpolator(2, esVar);
        layoutTransition.setInterpolator(3, esVar);
        layoutTransition.setInterpolator(0, esVar);
        layoutTransition.setInterpolator(1, esVar);
        layoutTransition.setInterpolator(4, esVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f51152w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, esVar);
        layoutTransition2.setInterpolator(3, esVar);
        layoutTransition2.setInterpolator(0, esVar);
        layoutTransition2.setInterpolator(1, esVar);
        layoutTransition2.setInterpolator(4, esVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f51153x = new h2[4];
        this.f51154y = new h2[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            h2[] h2VarArr = this.f51153x;
            h2 h2Var = new h2(context);
            h2VarArr[i12] = h2Var;
            linearLayout3.addView(h2Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f51153x[i12].setOnClickListener(new g2(this, 2));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            h2[] h2VarArr2 = this.f51154y;
            h2 h2Var2 = new h2(context);
            h2VarArr2[i13] = h2Var2;
            linearLayout4.addView(h2Var2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f51154y[i13].setOnClickListener(new g2(this, 3));
        }
        this.f51149n = new q2[4];
        this.d = new m2[6];
        int i14 = 0;
        while (i14 < i11) {
            m2[] m2VarArr = this.d;
            if (i14 == 5) {
                z10 = z11;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new f3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, w7.a6.a(-1.0f, 2.0f, 2.0f, 2.0f, 2.0f, -1, 119));
            z9 z9Var = new z9(context);
            z9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            z9Var.setAlpha(f10);
            if (z10) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(z9Var, w7.a6.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                z9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                n2 n2Var = new n2(context);
                frameLayout5.f50817b = n2Var;
                n2Var.e = AndroidUtilities.dp(37.0f);
                n2Var.f50857a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(n2Var, w7.a6.e(90, 90, 17));
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
                frameLayout5.f50816a = s6Var;
                s6Var.getDrawable().r(false, true);
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextColor(-1);
                s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                s6Var.setGravity(17);
                s6Var.setText("0%");
                frameLayout6.addView(s6Var, w7.a6.a(16.0f, 12.0f, 80.0f, 12.0f, 0.0f, -1, 55));
            }
            m2VarArr[i14] = frameLayout5;
            i14++;
            i11 = 6;
            z11 = true;
        }
        this.e = this.d[5];
        o2 o2Var = new o2(context);
        this.f51141f = o2Var;
        o2Var.setVisibility(8);
        o2Var.setAlpha(0.0f);
        addView(o2Var, w7.a6.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        l2 l2Var = new l2(context, this.d);
        this.h = l2Var;
        addView(l2Var, w7.a6.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        this.E = a6Var;
        a6Var.setTextSize(1, 12.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        a6Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        a6Var.setGravity(17);
        a6Var.setTextColor(-1);
        if (this.f51139d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        a6Var.setAlpha(f7);
        a6Var.setBackground(new f3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        w7.c6.b(a6Var, 0.02f, 1.2f);
        this.Q.addView(a6Var, w7.a6.a(27.0f, 32.0f, 412.0f, 32.0f, 84.0f, -2, 49));
        a6Var.setOnClickListener(new yh.a(12, this, c6Var));
        this.Q.addView(this.v, w7.a6.a(54.0f, 32.0f, 340.0f, 32.0f, 84.0f, -2, 49));
        this.Q.addView(this.f51152w, w7.a6.a(54.0f, 32.0f, 394.0f, 32.0f, 84.0f, -2, 49));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        i2 i2Var = new i2();
        this.F = i2Var;
        linearLayout5.setBackground(i2Var);
        i2Var.a(org.telegram.ui.ActionBar.g6.m1(0.08f, -1), org.telegram.ui.ActionBar.g6.m1(0.08f, -1));
        w7.c6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.a6.a(-2.0f, 20.0f, 0.0f, 20.0f, 18.0f, -1, 87));
        linearLayout5.setOnClickListener(new g2(this, 4));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.H = s6Var2;
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.75f, -1));
        s6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(s6Var2, w7.a6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.I = s6Var3;
        s6Var3.getDrawable().r(true, false);
        s6Var3.setGravity(17);
        s6Var3.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.75f, -1));
        s6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        s6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(s6Var3, w7.a6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
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
        this.R.addView(linearLayout6, w7.a6.a(-2.0f, 0.0f, 350.0f, 0.0f, 0.0f, -1, 49));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView h = org.telegram.ui.Cells.d0.h(this.R, textView3, w7.a6.a(-2.0f, 0.0f, 383.0f, 0.0f, 0.0f, -1, 49), context);
        this.L = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        h.setBackground(new f3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, -1)));
        TextView h10 = org.telegram.ui.Cells.d0.h(this.R, h, w7.a6.a(27.0f, 0.0f, 0.0f, 0.0f, 74.0f, -2, 81), context);
        h10.setTextSize(1, 13.0f);
        h10.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.5f, -1));
        h10.setGravity(17);
        h10.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView h11 = org.telegram.ui.Cells.d0.h(this.R, h10, w7.a6.a(-2.0f, 42.0f, 0.0f, 42.0f, 24.0f, -1, 81), context);
        h11.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        h11.setTextColor(-505270);
        h11.setTextSize(1, 20.0f);
        h11.setTypeface(AndroidUtilities.bold());
        h11.setGravity(17);
        TextView h12 = org.telegram.ui.Cells.d0.h(this.S, h11, w7.a6.a(-2.0f, 32.0f, 352.0f, 32.0f, 0.0f, -1, 55), context);
        this.M = h12;
        h12.setTextColor(-17253);
        h12.setTextSize(1, 13.0f);
        h12.setGravity(17);
        this.S.addView(h12, w7.a6.a(-2.0f, 32.0f, 383.0f, 32.0f, 0.0f, -1, 55));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.a6.a(-2.0f, 0.0f, 250.0f, 0.0f, 0.0f, -2, 49));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        q2[] q2VarArr;
        float f7;
        this.W = i10;
        this.f51134a0 = j10;
        this.f51136b0 = document;
        this.f51138c0 = str;
        this.f51144h0 = false;
        this.f51146j0 = false;
        int i11 = 0;
        while (true) {
            q2VarArr = this.f51149n;
            if (i11 >= q2VarArr.length) {
                break;
            }
            q2 q2Var = q2VarArr[i11];
            if (q2Var != null) {
                AndroidUtilities.removeFromParent(q2Var);
            }
            i11++;
        }
        l2 l2Var = this.h;
        View[] viewArr = l2Var.f50782a;
        k2 k2Var = l2Var.H;
        if (k2Var != null) {
            k2Var.e = true;
            k2Var.f50755l = false;
            k2Var.f50747a.H = null;
            l2Var.H = null;
        }
        ValueAnimator valueAnimator = l2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            l2Var.G = null;
        }
        l2Var.F = -1;
        l2Var.E = 0.0f;
        l2Var.v.clear();
        l2Var.f50789w.clear();
        l2Var.f50790x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            l2Var.f50791y[i12] = 0.0f;
        }
        l2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            l2Var.addView(viewArr[i13], w7.a6.e(108, 108, 17));
        }
        Matrix.setIdentityM(l2Var.f50784c, 0);
        l2Var.e = 0.0f;
        l2Var.d = 0.0f;
        l2Var.f50785f = true;
        q2 q2Var2 = new q2(getContext());
        q2VarArr[0] = q2Var2;
        addView(q2Var2, w7.a6.a(76.0f, -117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        q2 q2Var3 = new q2(getContext());
        q2VarArr[1] = q2Var3;
        addView(q2Var3, w7.a6.a(76.0f, -117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        q2 q2Var4 = new q2(getContext());
        q2VarArr[2] = q2Var4;
        addView(q2Var4, w7.a6.a(76.0f, 117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        q2 q2Var5 = new q2(getContext());
        q2VarArr[3] = q2Var5;
        addView(q2Var5, w7.a6.a(76.0f, 117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        for (int i14 = 0; i14 < q2VarArr.length; i14++) {
            w7.c6.a(q2VarArr[i14]);
            q2VarArr[i14].setClickable(true);
            q2VarArr[i14].setOnClickListener(new g2(this, 5));
        }
        d(false);
        this.f51144h0 = false;
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
        if (this.f51151s) {
            f7 = 0.0f;
        } else if (this.f51139d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        o2 o2Var = this.f51141f;
        o2Var.setVisibility(8);
        o2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.s6 s6Var = this.H;
        s6Var.setText(string);
        s6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new ih(this, j10, j10, 2));
    }

    public final void b(h2 h2Var) {
        if (h2Var.d != null) {
            c(h2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(h2Var.f50611f * 100.0f), h2Var.d.name)));
        } else if (h2Var.e != null) {
            c(h2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(h2Var.f50611f * 100.0f), h2Var.e.name)));
        }
    }

    public final void c(h2 h2Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        di.d4 d4Var = this.T;
        View view = null;
        if (d4Var != null) {
            d4Var.e(true);
            this.T = null;
        }
        if (!this.f51144h0 && !this.f51146j0) {
            if (h2Var.getParent() instanceof View) {
                view = (View) h2Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x10 = h2Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = h2Var.getY() + f10;
            di.d4 d4Var2 = new di.d4(getContext(), 3);
            this.T = d4Var2;
            d4Var2.p(true);
            this.T.s(spannableStringBuilder);
            di.d4 d4Var3 = this.T;
            d4Var3.h = di.d4.a(d4Var3.getText(), this.T.getTextPaint());
            di.d4 d4Var4 = this.T;
            d4Var4.K = Layout.Alignment.ALIGN_CENTER;
            d4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((h2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: zh.s2.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            q2[] q2VarArr = this.f51149n;
            if (i10 >= q2VarArr.length) {
                return null;
            }
            q2 q2Var = q2VarArr[i10];
            if (q2Var != null) {
                TL_stars.StarGift starGift2 = q2Var.h;
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
            q2[] q2VarArr = this.f51149n;
            if (i10 < q2VarArr.length) {
                q2 q2Var = q2VarArr[i10];
                if (q2Var != null) {
                    TL_stars.StarGift starGift = q2Var.h;
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
            q2[] q2VarArr = this.f51149n;
            if (i10 < q2VarArr.length) {
                q2 q2Var = q2VarArr[i10];
                if (q2Var != null) {
                    TL_stars.StarGift starGift2 = q2Var.h;
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
        this.f51142f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f51143g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f51140e0 = callback3;
    }
}
