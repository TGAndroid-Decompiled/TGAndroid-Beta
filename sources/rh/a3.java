package rh;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.x9;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.dg;
public final class a3 extends FrameLayout {
    public final q2[] D;
    public final org.telegram.ui.Components.n5 E;
    public final r2 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.f6 H;
    public final org.telegram.ui.Components.f6 I;
    public final ei0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public ph.c1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public vh.p2 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.p6 f46607a;
    public long f46608a0;
    public final z2 f46609b;
    public TLRPC.Document f46610b0;
    public final ImageView f46611c;
    public String f46612c0;
    public final ph.k[] d;
    public ArrayList f46613d0;
    public final ph.k e;
    public l20 f46614e0;
    public final w2 f46615f;
    public j20 f46616f0;
    public Runnable f46617g0;
    public final u2 h;
    public boolean f46618h0;
    public boolean f46619i0;
    public boolean f46620j0;
    public Runnable f46621k0;
    public ei0 f46622l0;
    public SpannableStringBuilder m0;
    public final y2[] f46623n;
    public final nh.p f46624r;
    public boolean f46625s;
    public final LinearLayout f46626w;
    public final LinearLayout f46627x;
    public final q2[] f46628y;

    public a3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        float f7;
        int i10;
        float f10;
        int i11;
        int i12 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.t6.r1(0.08f, -1), org.telegram.ui.ActionBar.t6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.f46607a = p6Var;
        z2 z2Var = new z2();
        this.f46609b = z2Var;
        Drawable f11 = i0.a.f(context, 2131231111);
        f11.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        z2Var.f47795g = f11;
        setBackground(z2Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, w7.b6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.f46611c = imageView;
        imageView.setImageResource(2131232501);
        imageView.setBackground(new o3(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        frameLayout.addView(imageView, w7.b6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new p2(this, 0));
        w7.e6.a(imageView);
        ImageView e = z20.e(context, 2131232095);
        e.setBackground(new o3(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        frameLayout.addView(e, w7.b6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        int i13 = 1;
        e.setOnClickListener(new p2(this, 1));
        w7.e6.a(e);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131749767, null));
        addView(textView, w7.b6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, w7.b6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.b6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, w7.b6.e(-1, -1, 119));
        nh.p pVar = new nh.p(context);
        this.f46624r = pVar;
        pVar.setGravity(17);
        pVar.setTextSize(1, 13.0f);
        pVar.setTextColor(-1);
        frameLayout2.addView(pVar, w7.b6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46626w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 320L);
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        gr grVar = gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(3, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(1, grVar);
        layoutTransition.setInterpolator(4, grVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46627x = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, grVar);
        layoutTransition2.setInterpolator(3, grVar);
        layoutTransition2.setInterpolator(0, grVar);
        layoutTransition2.setInterpolator(1, grVar);
        layoutTransition2.setInterpolator(4, grVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.f46628y = new q2[4];
        this.D = new q2[4];
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout3 = this.f46626w;
            q2[] q2VarArr = this.f46628y;
            q2 q2Var = new q2(context);
            q2VarArr[i14] = q2Var;
            linearLayout3.addView(q2Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.f46628y[i14].setOnClickListener(new p2(this, 2));
        }
        for (int i15 = 0; i15 < 4; i15++) {
            LinearLayout linearLayout4 = this.f46626w;
            q2[] q2VarArr2 = this.D;
            q2 q2Var2 = new q2(context);
            q2VarArr2[i15] = q2Var2;
            linearLayout4.addView(q2Var2, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.D[i15].setOnClickListener(new p2(this, 3));
        }
        this.f46623n = new y2[4];
        this.d = new ph.k[6];
        int i16 = 0;
        while (i16 < i12) {
            ph.k[] kVarArr = this.d;
            if (i16 == 5) {
                i10 = i13;
            } else {
                i10 = 0;
            }
            ph.k kVar = new ph.k(context, i13);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new o3(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
            kVar.addView(frameLayout5, w7.b6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            g9 g9Var = new g9(context);
            g9Var.setImageResource(2131231606);
            if (i10 != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.45f;
            }
            g9Var.setAlpha(f10);
            if (i10 != 0) {
                i11 = 42;
            } else {
                i11 = 64;
            }
            frameLayout5.addView(g9Var, w7.b6.e(i11, i10 != 0 ? 42 : 64, 17));
            if (i10 != 0) {
                g9Var.setTranslationX(org.telegram.messenger.i0.L(-4.0f));
                v2 v2Var = new v2(context);
                kVar.f45143c = v2Var;
                v2Var.e = org.telegram.messenger.i0.L(37.0f);
                v2Var.f47569a.setStrokeWidth(org.telegram.messenger.i0.N(4.66f));
                frameLayout5.addView(v2Var, w7.b6.e(90, 90, 17));
                org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
                kVar.f45142b = f6Var;
                f6Var.getDrawable().r(false, true);
                f6Var.setTypeface(org.telegram.messenger.i0.o());
                f6Var.setTextColor(-1);
                f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
                f6Var.setGravity(17);
                f6Var.setText("0%");
                frameLayout5.addView(f6Var, w7.b6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            kVarArr[i16] = kVar;
            i16++;
            i12 = 6;
            i13 = 1;
        }
        this.e = this.d[5];
        w2 w2Var = new w2(context);
        this.f46615f = w2Var;
        w2Var.setVisibility(8);
        w2Var.setAlpha(0.0f);
        addView(w2Var, w7.b6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        u2 u2Var = new u2(context, this.d);
        this.h = u2Var;
        addView(u2Var, w7.b6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.E = n5Var;
        n5Var.setTextSize(1, 12.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setText(org.telegram.messenger.i0.H2(cd.L0(2131749763, null), false, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
        n5Var.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        n5Var.setGravity(17);
        n5Var.setTextColor(-1);
        if (this.f46613d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        n5Var.setAlpha(f7);
        n5Var.setBackground(new o3(org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        w7.e6.b(n5Var, 0.02f, 1.2f);
        this.Q.addView(n5Var, w7.b6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        n5Var.setOnClickListener(new u1(2, this, p6Var));
        this.Q.addView(this.f46626w, w7.b6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.f46627x, w7.b6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        r2 r2Var = new r2();
        this.F = r2Var;
        linearLayout5.setBackground(r2Var);
        r2Var.a(org.telegram.ui.ActionBar.t6.r1(0.08f, -1), org.telegram.ui.ActionBar.t6.r1(0.08f, -1));
        w7.e6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, w7.b6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new p2(this, 4));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.H = f6Var2;
        f6Var2.setTypeface(org.telegram.messenger.i0.o());
        f6Var2.setGravity(17);
        f6Var2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
        f6Var2.setText(cd.L0(2131749806, null));
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        linearLayout5.addView(f6Var2, w7.b6.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.I = f6Var3;
        f6Var3.getDrawable().r(true, false);
        f6Var3.setGravity(17);
        f6Var3.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
        f6Var3.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749775, "0%")));
        f6Var3.setTextSize(org.telegram.messenger.i0.L(12.0f));
        linearLayout5.addView(f6Var3, w7.b6.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ?? imageView2 = new ImageView(context);
        this.J = imageView2;
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624034, 30, 30, null);
        linearLayout6.addView((View) imageView2, w7.b6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setGravity(17);
        textView2.setText(cd.L0(2131749783, null));
        linearLayout6.addView(textView2, w7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, w7.b6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setGravity(17);
        TextView l4 = org.telegram.ui.Cells.f1.l(this.R, textView3, w7.b6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = l4;
        l4.setTextSize(1, 13.0f);
        l4.setTextColor(-1);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setGravity(17);
        l4.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        l4.setBackground(new o3(org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, -1)));
        TextView l10 = org.telegram.ui.Cells.f1.l(this.R, l4, w7.b6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        l10.setTextSize(1, 13.0f);
        l10.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.5f, -1));
        org.telegram.messenger.m5.l(l10, 17, null, 2131749784);
        TextView l11 = org.telegram.ui.Cells.f1.l(this.R, l10, w7.b6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        l11.setText(cd.L0(2131749797, null));
        l11.setTextColor(-505270);
        l11.setTextSize(1, 20.0f);
        l11.setTypeface(org.telegram.messenger.i0.o());
        l11.setGravity(17);
        TextView l12 = org.telegram.ui.Cells.f1.l(this.S, l11, w7.b6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = l12;
        l12.setTextColor(-17253);
        l12.setTextSize(1, 13.0f);
        l12.setGravity(17);
        this.S.addView(l12, w7.b6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, w7.b6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        y2[] y2VarArr;
        float f7;
        this.W = i10;
        this.f46608a0 = j10;
        this.f46610b0 = document;
        this.f46612c0 = str;
        this.f46618h0 = false;
        this.f46620j0 = false;
        int i11 = 0;
        while (true) {
            y2VarArr = this.f46623n;
            if (i11 >= y2VarArr.length) {
                break;
            }
            y2 y2Var = y2VarArr[i11];
            if (y2Var != null) {
                org.telegram.messenger.i0.E2(y2Var);
            }
            i11++;
        }
        u2 u2Var = this.h;
        View[] viewArr = u2Var.f47527a;
        t2 t2Var = u2Var.H;
        if (t2Var != null) {
            t2Var.e = true;
            t2Var.f47499l = false;
            t2Var.f47491a.H = null;
            u2Var.H = null;
        }
        ValueAnimator valueAnimator = u2Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            u2Var.G = null;
        }
        u2Var.F = -1;
        u2Var.E = 0.0f;
        u2Var.f47534w.clear();
        u2Var.f47535x.clear();
        u2Var.f47536y.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            u2Var.D[i12] = 0.0f;
        }
        u2Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            u2Var.addView(viewArr[i13], w7.b6.e(108, 108, 17));
        }
        Matrix.setIdentityM(u2Var.f47529c, 0);
        u2Var.e = 0.0f;
        u2Var.d = 0.0f;
        u2Var.f47530f = true;
        y2 y2Var2 = new y2(getContext());
        y2VarArr[0] = y2Var2;
        addView(y2Var2, w7.b6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        y2 y2Var3 = new y2(getContext());
        y2VarArr[1] = y2Var3;
        addView(y2Var3, w7.b6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        y2 y2Var4 = new y2(getContext());
        y2VarArr[2] = y2Var4;
        addView(y2Var4, w7.b6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        y2 y2Var5 = new y2(getContext());
        y2VarArr[3] = y2Var5;
        addView(y2Var5, w7.b6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < y2VarArr.length; i14++) {
            w7.e6.a(y2VarArr[i14]);
            y2VarArr[i14].setClickable(true);
            y2VarArr[i14].setOnClickListener(new p2(this, 5));
        }
        d(false);
        this.f46618h0 = false;
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
        if (this.f46625s) {
            f7 = 0.0f;
        } else if (this.f46613d0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        this.E.setAlpha(f7);
        w2 w2Var = this.f46615f;
        w2Var.setVisibility(8);
        w2Var.setAlpha(0.0f);
        String L0 = cd.L0(2131749806, null);
        org.telegram.ui.Components.f6 f6Var = this.H;
        f6Var.setText(L0);
        f6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        x9.c(i10).j(j10, new dg(this, j10, j10, 2));
    }

    public final void b(q2 q2Var) {
        if (q2Var.d != null) {
            c(q2Var, org.telegram.messenger.i0.W2(cd.G(Math.round(q2Var.f47349f * 100.0f), "GiftCraftBackdropChance", q2Var.d.name)));
        } else if (q2Var.e != null) {
            c(q2Var, org.telegram.messenger.i0.W2(cd.G(Math.round(q2Var.f47349f * 100.0f), "GiftCraftSymbolChance", q2Var.e.name)));
        }
    }

    public final void c(q2 q2Var, SpannableStringBuilder spannableStringBuilder) {
        float f7;
        float f10;
        vh.p2 p2Var = this.T;
        View view = null;
        if (p2Var != null) {
            p2Var.e(true);
            this.T = null;
        }
        if (!this.f46618h0 && !this.f46620j0) {
            if (q2Var.getParent() instanceof View) {
                view = (View) q2Var.getParent();
            }
            if (view != null) {
                f7 = view.getX();
            } else {
                f7 = 0.0f;
            }
            float x10 = q2Var.getX() + f7;
            if (view != null) {
                f10 = view.getY();
            } else {
                f10 = 0.0f;
            }
            float y3 = q2Var.getY() + f10;
            vh.p2 p2Var2 = new vh.p2(getContext(), 3);
            this.T = p2Var2;
            p2Var2.p(true);
            this.T.s(spannableStringBuilder);
            vh.p2 p2Var3 = this.T;
            p2Var3.h = vh.p2.a(p2Var3.getText(), this.T.getTextPaint());
            vh.p2 p2Var4 = this.T;
            p2Var4.K = Layout.Alignment.ALIGN_CENTER;
            p2Var4.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
            addView(this.T, w7.b6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            this.T.setTranslationY(y3 - org.telegram.messenger.i0.L(100.0f));
            this.T.m(0.0f, ((q2Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.i0.L(2.0f));
            this.T.u();
        }
    }

    public final void d(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: rh.a3.d(boolean):void");
    }

    public TL_stars.StarGift getFirstGift() {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            y2[] y2VarArr = this.f46623n;
            if (i10 >= y2VarArr.length) {
                return null;
            }
            y2 y2Var = y2VarArr[i10];
            if (y2Var != null) {
                TL_stars.StarGift starGift2 = y2Var.h;
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
            y2[] y2VarArr = this.f46623n;
            if (i10 < y2VarArr.length) {
                y2 y2Var = y2VarArr[i10];
                if (y2Var != null) {
                    TL_stars.StarGift starGift = y2Var.h;
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
            y2[] y2VarArr = this.f46623n;
            if (i10 < y2VarArr.length) {
                y2 y2Var = y2VarArr[i10];
                if (y2Var != null) {
                    TL_stars.StarGift starGift2 = y2Var.h;
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

    public void setOnAddGift(j20 j20Var) {
        this.f46616f0 = j20Var;
    }

    public void setOnClose(Runnable runnable) {
        this.f46617g0 = runnable;
    }

    public void setOnCraft(l20 l20Var) {
        this.f46614e0 = l20Var;
    }
}
