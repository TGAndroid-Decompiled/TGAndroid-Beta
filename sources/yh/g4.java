package yh;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o81;
import org.telegram.ui.w8;
import org.telegram.ui.wy0;
import w7.x5;
import w7.z5;
import zh.j7;
import zh.s5;
public class g4 extends org.telegram.ui.ActionBar.n2 implements le.d {
    public LinearLayout E;
    public k3 F;
    public k3 G;
    public k3 H;
    public k3 I;
    public r00 J;
    public boolean K;
    public gh.c L;
    public bh.b M;
    public final le.b f50292a;
    public final long f50293b;
    public final String f50294c;
    public final t3 d;
    public Utilities.Callback f50295e;
    public org.telegram.ui.ActionBar.g2 f50296f;
    public View h;
    public c3 f50297n;
    public FrameLayout f50298r;
    public FrameLayout f50299s;
    public TextView v;
    public l3 f50300w;
    public boolean f50301x;
    public HorizontalScrollView f50302y;

    public g4(long j3, String str, long j10, f6 f6Var) {
        super(null);
        this.f50292a = new le.b(0, this, pr.h, 380L, false);
        this.K = true;
        this.f50293b = j3;
        this.f50294c = str;
        this.resourceProvider = f6Var;
        t3 t3Var = new t3(j10, this.currentAccount, new org.telegram.ui.web.b1(this, 18));
        this.d = t3Var;
        t3Var.g(false);
    }

    public static void U(g4 g4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(g4Var.currentAccount).getClientUserId()) {
            g4Var.d.d.remove(tL_starGiftUnique);
            g4Var.e0(false);
            if (j3 == UserConfig.getInstance(g4Var.currentAccount).getClientUserId()) {
                yc a02 = yc.a0(g4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                qc O = a02.O(document, string, LocaleController.formatString(i10, i2.g.k(tL_starGiftUnique.num, ',', sb2)));
                O.f29687r = false;
                O.j();
            } else {
                qc O2 = yc.a0(g4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(g4Var.currentAccount, j3)));
                O2.f29687r = false;
                O2.j();
            }
            g4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        b3 b3Var = new b3(bundle, tL_starGiftUnique, j3);
        d5 d5Var = g4Var.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).f20140b) {
            Dialog dialog = g4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.f3) && z10) {
                ((org.telegram.ui.ActionBar.f3) dialog).skipDismissAnimation();
            }
            g4Var.finishFragment();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(b3Var, false, z10);
            }
        } else {
            g4Var.presentFragment(b3Var, true, z10);
        }
        Utilities.Callback callback = g4Var.f50295e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(g4 g4Var, Context context) {
        t3 t3Var = g4Var.d;
        if (!g4Var.K || t3Var.h.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(g4Var, g4Var.I, false, false);
        n70Var.f28661t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f28655p = new ji.h(n70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.h);
        Collections.sort(arrayList, new s2(g4Var, 0));
        d61 d61Var = new d61(g4Var, new t2(g4Var, strArr, arrayList, 0), new u2(g4Var, n70Var, 0), null);
        d61Var.Y2.f31135r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zt ztVar = new zt(context, g4Var.resourceProvider);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setInputType(573441);
        ztVar.setRawInputType(573441);
        ztVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourceProvider));
        ztVar.setCursorColor(j6.v0(j6.G6, g4Var.resourceProvider));
        ztVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ztVar.setCursorWidth(1.5f);
        ztVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ztVar.setTextColor(j6.v0(j6.E8, g4Var.resourceProvider));
        ztVar.setBackground(null);
        frameLayout.addView(ztVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ztVar.addTextChangedListener(new pn(strArr, d61Var, false, 8));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!t3Var.f50565l.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(g4Var, 0), false);
        }
        n70Var.q(d61Var);
        n70Var.Z();
    }

    public static void W(g4 g4Var, Context context) {
        t3 t3Var = g4Var.d;
        if (!g4Var.K || t3Var.f50560f.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(g4Var, g4Var.G, false, false);
        n70Var.f28661t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f28655p = new ji.h(n70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50560f);
        Collections.sort(arrayList, new s2(g4Var, 2));
        d61 d61Var = new d61(g4Var, new t2(g4Var, strArr, arrayList, 2), new u2(g4Var, n70Var, 2), null);
        d61Var.Y2.f31135r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zt ztVar = new zt(context, g4Var.resourceProvider);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setInputType(573441);
        ztVar.setRawInputType(573441);
        ztVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourceProvider));
        ztVar.setCursorColor(j6.v0(j6.G6, g4Var.resourceProvider));
        ztVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ztVar.setCursorWidth(1.5f);
        ztVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ztVar.setTextColor(j6.v0(j6.E8, g4Var.resourceProvider));
        ztVar.setBackground(null);
        frameLayout.addView(ztVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ztVar.addTextChangedListener(new pn(strArr, d61Var, false, 9));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!t3Var.f50563j.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(g4Var, 2), false);
        }
        n70Var.q(d61Var);
        n70Var.Z();
    }

    public static void X(g4 g4Var, Context context) {
        t3 t3Var = g4Var.d;
        if (!g4Var.K || t3Var.f50561g.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(g4Var, g4Var.H, false, false);
        n70Var.f28661t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f28655p = new ji.h(n70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50561g);
        Collections.sort(arrayList, new s2(g4Var, 1));
        d61 d61Var = new d61(g4Var, new t2(g4Var, strArr, arrayList, 1), new u2(g4Var, n70Var, 1), null);
        d61Var.Y2.f31135r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zt ztVar = new zt(context, g4Var.resourceProvider);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setInputType(573441);
        ztVar.setRawInputType(573441);
        ztVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourceProvider));
        ztVar.setCursorColor(j6.v0(j6.G6, g4Var.resourceProvider));
        ztVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ztVar.setCursorWidth(1.5f);
        ztVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ztVar.setTextColor(j6.v0(j6.E8, g4Var.resourceProvider));
        ztVar.setBackground(null);
        frameLayout.addView(ztVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ztVar.addTextChangedListener(new pn(strArr, d61Var, false, 10));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!t3Var.f50564k.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(g4Var, 1), false);
        }
        n70Var.q(d61Var);
        n70Var.Z();
    }

    public static void Y(g4 g4Var, h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            zh.w3 w3Var = new zh.w3(g4Var.getParentActivity(), g4Var.currentAccount, g4Var.f50293b, g4Var.resourceProvider, null);
            w3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, g4Var.d);
            w3Var.O0 = new x2(g4Var);
            g4Var.showDialog(w3Var);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(g4 g4Var) {
        return g4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(g4 g4Var) {
        return g4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k b0(g4 g4Var) {
        return g4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(g4 g4Var) {
        return g4Var.actionBar;
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            this.f50299s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            y10.d(this.f50298r, f7);
        }
    }

    @Override
    public final View createView(final Context context) {
        gh.c cVar = new gh.c();
        this.L = cVar;
        int i10 = j6.f20663d6;
        cVar.a(getThemedColor(i10));
        this.M = new bh.b(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f50296f = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f50296f.f20462k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 12));
        this.actionBar.setTitle(this.f50294c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        kVar2.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.B(getThemedColor(j6.f21063z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(j6.f21061z6));
        w8 w8Var = new w8(this, context, 9);
        int v = j6.v(j6.v0(i10, this.resourceProvider), j6.l1(0.04f, j6.v0(i11, this.resourceProvider)));
        w8Var.setBackgroundColor(v);
        this.fragmentView = w8Var;
        j7 j7Var = new j7(context, this.currentAccount, this.resourceProvider);
        j7Var.d = true;
        z5.a(j7Var);
        j7Var.setOnClickListener(new wy0(25, this, j7Var));
        this.actionBar.addView(j7Var, x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? d61Var = new d61(this, new ii.a(this, 18), new x2(this), new x2(this));
        this.f50297n = d61Var;
        d61Var.Y2.f31135r = false;
        d61Var.setSpanCount(3);
        this.f50297n.j(new lb0(this, 16));
        this.f50297n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f50297n.setClipToPadding(false);
        w8Var.addView(this.f50297n, x5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final g4 f50655b;

            {
                this.f50655b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t3 t3Var = this.f50655b.d;
                        t3Var.f50564k.clear();
                        t3Var.f50563j.clear();
                        t3Var.f50565l.clear();
                        t3Var.h();
                        return;
                    default:
                        t3 t3Var2 = this.f50655b.d;
                        t3Var2.f50564k.clear();
                        t3Var2.f50563j.clear();
                        t3Var2.f50565l.clear();
                        t3Var2.h();
                        return;
                }
            }
        };
        f6 f6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout f7 = wl.f(context, 1);
        frameLayout.addView(f7, x5.e(-1, -2, 23));
        x9 x9Var = new x9(context);
        x9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(x9Var, x5.q(130, 130, 17));
        TextView textView = new TextView(context);
        wl.n(j6.G6, f6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, x5.t(-2, -2, 17, 32, 12, 32, 9));
        d90 d90Var = new d90(context, null);
        d90Var.setTextColor(j6.v0(j6.A6, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(17);
        d90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        d90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(d90Var, x5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = j6.Oh;
        textView2.setTextColor(j6.v0(i12, f6Var));
        textView2.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i12, f6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(p6.b(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        z5.a(textView2);
        f7.addView(textView2, x5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f50300w = frameLayout;
        this.f50301x = false;
        frameLayout.setAlpha(0.0f);
        this.f50300w.setScaleX(0.95f);
        this.f50300w.setScaleY(0.95f);
        this.f50300w.setVisibility(8);
        w8Var.addView(this.f50300w, x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f50302y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f50302y.addView(this.E);
        this.f50302y.setBackgroundColor(v);
        this.f50302y.setClipChildren(false);
        w8Var.addView(this.f50302y, x5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.f20664d7));
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, x5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final mp mpVar = new mp(context, 24, this.resourceProvider);
        mpVar.b(j6.f20736h7, j6.f20772j7, j6.f20792k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        mpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        mpVar.setScaleX(0.8f);
        mpVar.setScaleY(0.8f);
        linearLayout2.addView(mpVar, x5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        wl.n(j6.f20770j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, x5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = j6.Oh;
        int v9 = j6.v(themedColor, j6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(j6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50299s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f50299s;
        dh.d c10 = this.M.c(frameLayout3, null, false);
        c10.n(fh.b.l(this.resourceProvider));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f50299s.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50669b;

            {
                this.f50669b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        t3 t3Var = this.f50669b.d;
                        if (t3Var != null) {
                            boolean z10 = !t3Var.f50571r;
                            t3Var.f50571r = z10;
                            mpVar.a(z10, true);
                            t3Var.h();
                            return;
                        }
                        return;
                    default:
                        final g4 g4Var = this.f50669b;
                        t3 t3Var2 = g4Var.d;
                        if (g4Var.K) {
                            n70 H = n70.H(g4Var, g4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(s3.BY_PRICE.f50546a), new v2(g4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(s3.BY_DATE.f50546a), new v2(g4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(s3.BY_NUMBER.f50546a), new v2(g4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final mp mpVar2 = mpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.f50571r) {
                                                t3Var3.f50571r = false;
                                                mpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.f50571r) {
                                                t3Var4.f50571r = true;
                                                mpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !t3Var2.f50571r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.f50571r) {
                                                t3Var3.f50571r = false;
                                                mpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.f50571r) {
                                                t3Var4.f50571r = true;
                                                mpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), t3Var2.f50571r);
                            H.f28661t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f50299s.addView(linearLayout2, x5.c(-1.0f, -2));
        z5.b(this.f50299s, 0.04f, 1.5f);
        w8Var.addView(this.f50299s, x5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        s5 y3 = s5.y(this.currentAccount, true);
        if (y3.f52569e && !y3.s().k()) {
            this.f50299s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f50298r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f50298r;
        dh.d c11 = this.M.c(frameLayout5, null, false);
        c11.n(fh.b.l(this.resourceProvider));
        c11.o(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        w8Var.addView(this.f50298r, x5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new nq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i13));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = j6.v(getThemedColor(i10), j6.l1(0.1f, getThemedColor(i13)));
        textView4.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        this.f50298r.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50655b;

            {
                this.f50655b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        t3 t3Var = this.f50655b.d;
                        t3Var.f50564k.clear();
                        t3Var.f50563j.clear();
                        t3Var.f50565l.clear();
                        t3Var.h();
                        return;
                    default:
                        t3 t3Var2 = this.f50655b.d;
                        t3Var2.f50564k.clear();
                        t3Var2.f50563j.clear();
                        t3Var2.f50565l.clear();
                        t3Var2.h();
                        return;
                }
            }
        });
        this.f50298r.addView(this.v, x5.c(-1.0f, -2));
        this.f50298r.setVisibility(8);
        z5.b(this.f50298r, 0.05f, 1.5f);
        k3 k3Var = new k3(context, this.resourceProvider);
        this.F = k3Var;
        k3Var.setSorting(this.d.f50569p);
        this.E.addView(this.F, x5.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50669b;

            {
                this.f50669b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        t3 t3Var = this.f50669b.d;
                        if (t3Var != null) {
                            boolean z10 = !t3Var.f50571r;
                            t3Var.f50571r = z10;
                            mpVar.a(z10, true);
                            t3Var.h();
                            return;
                        }
                        return;
                    default:
                        final g4 g4Var = this.f50669b;
                        t3 t3Var2 = g4Var.d;
                        if (g4Var.K) {
                            n70 H = n70.H(g4Var, g4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(s3.BY_PRICE.f50546a), new v2(g4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(s3.BY_DATE.f50546a), new v2(g4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(s3.BY_NUMBER.f50546a), new v2(g4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final mp mpVar2 = mpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.f50571r) {
                                                t3Var3.f50571r = false;
                                                mpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.f50571r) {
                                                t3Var4.f50571r = true;
                                                mpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !t3Var2.f50571r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = g4Var.d;
                                            if (t3Var3.f50571r) {
                                                t3Var3.f50571r = false;
                                                mpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = g4Var.d;
                                            if (!t3Var4.f50571r) {
                                                t3Var4.f50571r = true;
                                                mpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), t3Var2.f50571r);
                            H.f28661t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        k3 k3Var2 = new k3(context, this.resourceProvider);
        this.G = k3Var2;
        k3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.E.addView(this.G, x5.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50534b;

            {
                this.f50534b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        g4.W(this.f50534b, context);
                        return;
                    case 1:
                        g4.X(this.f50534b, context);
                        return;
                    default:
                        g4.V(this.f50534b, context);
                        return;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourceProvider);
        this.H = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, x5.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50534b;

            {
                this.f50534b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        g4.W(this.f50534b, context);
                        return;
                    case 1:
                        g4.X(this.f50534b, context);
                        return;
                    default:
                        g4.V(this.f50534b, context);
                        return;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourceProvider);
        this.I = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, x5.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50534b;

            {
                this.f50534b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        g4.W(this.f50534b, context);
                        return;
                    case 1:
                        g4.X(this.f50534b, context);
                        return;
                    default:
                        g4.V(this.f50534b, context);
                        return;
                }
            }
        });
        r00 r00Var = new r00(getParentActivity());
        this.J = r00Var;
        w8Var.addView(r00Var, x5.c(-1.0f, -1));
        d0(false, false);
        return w8Var;
    }

    public final void d0(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.K == z10) {
            return;
        }
        this.K = z10;
        float f13 = 1.0f;
        int i10 = 0;
        float f14 = 0.0f;
        if (z11) {
            this.f50302y.setVisibility(0);
            ViewPropertyAnimator animate = this.f50302y.animate();
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(45.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(f11);
            if (!z10) {
                f13 = 0.0f;
            }
            ViewPropertyAnimator alpha = translationY.alpha(f13);
            pr prVar = pr.h;
            alpha.setInterpolator(prVar).setDuration(420L).setListener(new a3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(prVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f50297n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(prVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f50302y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f50302y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f50302y;
        if (!z10) {
            f13 = 0.0f;
        }
        horizontalScrollView3.setAlpha(f13);
        View view = this.h;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(45.0f);
        }
        view.setTranslationY(f10);
        c3 c3Var = this.f50297n;
        if (!z10) {
            f14 = -AndroidUtilities.dp(39.0f);
        }
        c3Var.setTranslationY(f14);
    }

    public final void e0(boolean z10) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        v51 v51Var;
        t3 t3Var = this.d;
        int i10 = t3Var.f50559e;
        HashSet hashSet = t3Var.f50565l;
        ArrayList arrayList = t3Var.h;
        HashSet hashSet2 = t3Var.f50564k;
        ArrayList arrayList2 = t3Var.f50561g;
        HashSet hashSet3 = t3Var.f50563j;
        ArrayList arrayList3 = t3Var.f50560f;
        if (i10 > 12) {
            d0(true, true);
        }
        c3 c3Var = this.f50297n;
        boolean z11 = false;
        if (c3Var != null && (v51Var = c3Var.Y2) != null) {
            v51Var.N(true);
            if (z10) {
                this.f50297n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f50294c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = t3Var.f50559e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        k3 k3Var = this.F;
        if (k3Var != null) {
            k3Var.setSorting(t3Var.f50569p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            k3 k3Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                string3 = LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size);
            } else {
                string3 = LocaleController.getString(R.string.Gift2ResaleFilterModel);
            }
            k3Var2.setValue(string3);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            k3 k3Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                string2 = LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2);
            } else {
                string2 = LocaleController.getString(R.string.Gift2ResaleFilterBackdrop);
            }
            k3Var3.setValue(string2);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            k3 k3Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                string = LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3);
            } else {
                string = LocaleController.getString(R.string.Gift2ResaleFilterSymbol);
            }
            k3Var4.setValue(string);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f50297n.getChildCount()) {
                break;
            } else if (this.f50297n.getChildAt(i12) instanceof t00) {
                t3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((t3Var.f50573t || t3Var.f50559e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f50292a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f20663d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f21010w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
