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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.y9;
import org.telegram.ui.eh;
public final class t2 extends FrameLayout {
    public final org.telegram.ui.Components.a6 E;
    public final j2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.r6 H;
    public final org.telegram.ui.Components.r6 I;
    public final fk0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public xh.j1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public ci.d4 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.e6 f53218a;
    public long f53219a0;
    public final s2 f53220b;
    public TLRPC.Document f53221b0;
    public final ImageView f53222c;
    public String f53223c0;
    public final n2[] d;
    public ArrayList f53224d0;
    public final n2 f53225e;
    public Utilities.Callback3 f53226e0;
    public final p2 f53227f;
    public Utilities.Callback2 f53228f0;
    public Runnable f53229g0;
    public final m2 h;
    public boolean f53230h0;
    public boolean f53231i0;
    public boolean f53232j0;
    public Runnable f53233k0;
    public fk0 f53234l0;
    public SpannableStringBuilder m0;
    public final r2[] f53235n;
    public final vh.n f53236r;
    public boolean f53237s;
    public final LinearLayout v;
    public final LinearLayout f53238w;
    public final i2[] f53239x;
    public final i2[] f53240y;

    public t2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f7;
        boolean z10;
        float f10;
        int i10;
        int i11 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.i6.m1(0.08f, -1), org.telegram.ui.ActionBar.i6.m1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f53218a = e6Var;
        s2 s2Var = new s2();
        this.f53220b = s2Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        s2Var.f53156g = mutate;
        setBackground(s2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.x5.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f53222c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new g3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        frameLayout.addView(imageView, w7.x5.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 51));
        imageView.setOnClickListener(new h2(this, 0));
        w7.z5.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new g3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        frameLayout.addView(imageView2, w7.x5.a(32.0f, 14.0f, 14.0f, 14.0f, 14.0f, 32, 53));
        boolean z11 = true;
        imageView2.setOnClickListener(new h2(this, 1));
        w7.z5.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 20.0f, 0.0f, 0.0f, -1, 49));
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
        vh.n nVar = new vh.n(context);
        this.f53236r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, w7.x5.a(-2.0f, 32.0f, 244.0f, 32.0f, 84.0f, -1, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        hs hsVar = hs.h;
        layoutTransition.setInterpolator(2, hsVar);
        layoutTransition.setInterpolator(3, hsVar);
        layoutTransition.setInterpolator(0, hsVar);
        layoutTransition.setInterpolator(1, hsVar);
        layoutTransition.setInterpolator(4, hsVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f53238w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, hsVar);
        layoutTransition2.setInterpolator(3, hsVar);
        layoutTransition2.setInterpolator(0, hsVar);
        layoutTransition2.setInterpolator(1, hsVar);
        layoutTransition2.setInterpolator(4, hsVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f53239x = new i2[4];
        this.f53240y = new i2[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            i2[] i2VarArr = this.f53239x;
            i2 i2Var = new i2(context);
            i2VarArr[i12] = i2Var;
            linearLayout3.addView(i2Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f53239x[i12].setOnClickListener(new h2(this, 2));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            i2[] i2VarArr2 = this.f53240y;
            i2 i2Var2 = new i2(context);
            i2VarArr2[i13] = i2Var2;
            linearLayout4.addView(i2Var2, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f53240y[i13].setOnClickListener(new h2(this, 3));
        }
        this.f53235n = new r2[4];
        this.d = new n2[6];
        int i14 = 0;
        while (i14 < i11) {
            n2[] n2VarArr = this.d;
            if (i14 == 5) {
                z10 = z11;
            } else {
                z10 = false;
            }
            ?? frameLayout5 = new FrameLayout(context);
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(new g3(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
            frameLayout5.addView(frameLayout6, w7.x5.a(-1.0f, 2.0f, 2.0f, 2.0f, 2.0f, -1, 119));
            y9 y9Var = new y9(context);
            y9Var.setImageResource(R.drawable.large_forge);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            y9Var.setAlpha(f10);
            if (z10) {
                i10 = 42;
            } else {
                i10 = 64;
            }
            frameLayout6.addView(y9Var, w7.x5.e(i10, z10 ? 42 : 64, 17));
            if (z10) {
                y9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                o2 o2Var = new o2(context);
                frameLayout5.f52924b = o2Var;
                o2Var.f52963e = AndroidUtilities.dp(37.0f);
                o2Var.f52960a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout6.addView(o2Var, w7.x5.e(90, 90, 17));
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
                frameLayout5.f52923a = r6Var;
                r6Var.getDrawable().r(false, true);
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextColor(-1);
                r6Var.setTextSize(AndroidUtilities.dp(14.0f));
                r6Var.setGravity(17);
                r6Var.setText("0%");
                frameLayout6.addView(r6Var, w7.x5.a(16.0f, 12.0f, 80.0f, 12.0f, 0.0f, -1, 55));
            }
            n2VarArr[i14] = frameLayout5;
            i14++;
            i11 = 6;
            z11 = true;
        }
        this.f53225e = this.d[5];
        p2 p2Var = new p2(context);
        this.f53227f = p2Var;
        p2Var.setVisibility(8);
        p2Var.setAlpha(0.0f);
        addView(p2Var, w7.x5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        m2 m2Var = new m2(context, this.d);
        this.h = m2Var;
        addView(m2Var, w7.x5.a(300.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        this.E = a6Var;
        a6Var.setTextSize(1, 12.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        a6Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        a6Var.setGravity(17);
        a6Var.setTextColor(-1);
        if (this.f53224d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        a6Var.setAlpha(f7);
        a6Var.setBackground(new g3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        w7.z5.b(a6Var, 0.02f, 1.2f);
        this.Q.addView(a6Var, w7.x5.a(27.0f, 32.0f, 412.0f, 32.0f, 84.0f, -2, 49));
        a6Var.setOnClickListener(new xh.a(12, this, e6Var));
        this.Q.addView(this.v, w7.x5.a(54.0f, 32.0f, 340.0f, 32.0f, 84.0f, -2, 49));
        this.Q.addView(this.f53238w, w7.x5.a(54.0f, 32.0f, 394.0f, 32.0f, 84.0f, -2, 49));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        j2 j2Var = new j2();
        this.F = j2Var;
        linearLayout5.setBackground(j2Var);
        j2Var.a(org.telegram.ui.ActionBar.i6.m1(0.08f, -1), org.telegram.ui.ActionBar.i6.m1(0.08f, -1));
        w7.z5.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.x5.a(-2.0f, 20.0f, 0.0f, 20.0f, 18.0f, -1, 87));
        linearLayout5.setOnClickListener(new h2(this, 4));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, false, false);
        this.H = r6Var2;
        r6Var2.setTypeface(AndroidUtilities.bold());
        r6Var2.setGravity(17);
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.75f, -1));
        r6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(r6Var2, w7.x5.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(context, false, false, false);
        this.I = r6Var3;
        r6Var3.getDrawable().r(true, false);
        r6Var3.setGravity(17);
        r6Var3.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.75f, -1));
        r6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        r6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(r6Var3, w7.x5.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
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
        this.R.addView(linearLayout6, w7.x5.a(-2.0f, 0.0f, 350.0f, 0.0f, 0.0f, -1, 49));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView g10 = org.telegram.ui.Cells.c1.g(this.R, textView3, w7.x5.a(-2.0f, 0.0f, 383.0f, 0.0f, 0.0f, -1, 49), context);
        this.L = g10;
        g10.setTextSize(1, 13.0f);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setGravity(17);
        g10.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        g10.setBackground(new g3(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, -1)));
        TextView g11 = org.telegram.ui.Cells.c1.g(this.R, g10, w7.x5.a(27.0f, 0.0f, 0.0f, 0.0f, 74.0f, -2, 81), context);
        g11.setTextSize(1, 13.0f);
        g11.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.5f, -1));
        g11.setGravity(17);
        g11.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView g12 = org.telegram.ui.Cells.c1.g(this.R, g11, w7.x5.a(-2.0f, 42.0f, 0.0f, 42.0f, 24.0f, -1, 81), context);
        g12.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        g12.setTextColor(-505270);
        g12.setTextSize(1, 20.0f);
        g12.setTypeface(AndroidUtilities.bold());
        g12.setGravity(17);
        TextView g13 = org.telegram.ui.Cells.c1.g(this.S, g12, w7.x5.a(-2.0f, 32.0f, 352.0f, 32.0f, 0.0f, -1, 55), context);
        this.M = g13;
        g13.setTextColor(-17253);
        g13.setTextSize(1, 13.0f);
        g13.setGravity(17);
        this.S.addView(g13, w7.x5.a(-2.0f, 32.0f, 383.0f, 32.0f, 0.0f, -1, 55));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.x5.a(-2.0f, 0.0f, 250.0f, 0.0f, 0.0f, -2, 49));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j3, TLRPC.Document document, String str) {
        r2[] r2VarArr;
        float f7;
        this.W = i10;
        this.f53219a0 = j3;
        this.f53221b0 = document;
        this.f53223c0 = str;
        this.f53230h0 = false;
        this.f53232j0 = false;
        int i11 = 0;
        while (true) {
            r2VarArr = this.f53235n;
            if (i11 >= r2VarArr.length) {
                break;
            }
            r2 r2Var = r2VarArr[i11];
            if (r2Var != null) {
                AndroidUtilities.removeFromParent(r2Var);
            }
            i11++;
        }
        m2 m2Var = this.h;
        View[] viewArr = m2Var.f52864a;
        l2 l2Var = m2Var.H;
        if (l2Var != null) {
            l2Var.f52817e = true;
            l2Var.f52823l = false;
            l2Var.f52814a.H = null;
            m2Var.H = null;
        }
        ValueAnimator valueAnimator = m2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            m2Var.G = null;
        }
        m2Var.F = -1;
        m2Var.E = 0.0f;
        m2Var.v.clear();
        m2Var.f52872w.clear();
        m2Var.f52873x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            m2Var.f52874y[i12] = 0.0f;
        }
        m2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            m2Var.addView(viewArr[i13], w7.x5.e(108, 108, 17));
        }
        Matrix.setIdentityM(m2Var.f52866c, 0);
        m2Var.f52867e = 0.0f;
        m2Var.d = 0.0f;
        m2Var.f52868f = true;
        r2 r2Var2 = new r2(getContext());
        r2VarArr[0] = r2Var2;
        addView(r2Var2, w7.x5.a(76.0f, -117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        r2 r2Var3 = new r2(getContext());
        r2VarArr[1] = r2Var3;
        addView(r2Var3, w7.x5.a(76.0f, -117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        r2 r2Var4 = new r2(getContext());
        r2VarArr[2] = r2Var4;
        addView(r2Var4, w7.x5.a(76.0f, 117.0f, 74.0f, 0.0f, 0.0f, 76, 49));
        r2 r2Var5 = new r2(getContext());
        r2VarArr[3] = r2Var5;
        addView(r2Var5, w7.x5.a(76.0f, 117.0f, 149.0f, 0.0f, 0.0f, 76, 49));
        for (int i14 = 0; i14 < r2VarArr.length; i14++) {
            w7.z5.a(r2VarArr[i14]);
            r2VarArr[i14].setClickable(true);
            r2VarArr[i14].setOnClickListener(new h2(this, 5));
        }
        d(false);
        this.f53230h0 = false;
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
        if (this.f53237s) {
            f7 = 0.0f;
        } else if (this.f53224d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        p2 p2Var = this.f53227f;
        p2Var.setVisibility(8);
        p2Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.r6 r6Var = this.H;
        r6Var.setText(string);
        r6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j3, new eh(this, j3, j3, 2));
    }

    public final void b(i2 i2Var) {
        if (i2Var.d != null) {
            c(i2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(i2Var.f52670f * 100.0f), i2Var.d.name)));
        } else if (i2Var.f52669e != null) {
            c(i2Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(i2Var.f52670f * 100.0f), i2Var.f52669e.name)));
        }
    }

    public final void c(i2 i2Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        ci.d4 d4Var = this.T;
        View view = null;
        if (d4Var != null) {
            d4Var.e(true);
            this.T = null;
        }
        if (!this.f53230h0 && !this.f53232j0) {
            if (i2Var.getParent() instanceof View) {
                view = (View) i2Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x10 = i2Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = i2Var.getY() + f10;
            ci.d4 d4Var2 = new ci.d4(getContext(), 3);
            this.T = d4Var2;
            d4Var2.p(true);
            this.T.s(spannableStringBuilder);
            ci.d4 d4Var3 = this.T;
            d4Var3.h = ci.d4.a(d4Var3.getText(), this.T.getTextPaint());
            ci.d4 d4Var4 = this.T;
            d4Var4.K = Layout.Alignment.ALIGN_CENTER;
            d4Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            addView(this.T, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
            this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
            this.T.m(0.0f, ((i2Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.t2.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            r2[] r2VarArr = this.f53235n;
            if (i10 >= r2VarArr.length) {
                return null;
            }
            r2 r2Var = r2VarArr[i10];
            if (r2Var != null) {
                TL_stars.StarGift starGift2 = r2Var.h;
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
            r2[] r2VarArr = this.f53235n;
            if (i10 < r2VarArr.length) {
                r2 r2Var = r2VarArr[i10];
                if (r2Var != null) {
                    TL_stars.StarGift starGift = r2Var.h;
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
            r2[] r2VarArr = this.f53235n;
            if (i10 < r2VarArr.length) {
                r2 r2Var = r2VarArr[i10];
                if (r2Var != null) {
                    TL_stars.StarGift starGift2 = r2Var.h;
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
        this.f53228f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.f53229g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.f53226e0 = callback3;
    }
}
