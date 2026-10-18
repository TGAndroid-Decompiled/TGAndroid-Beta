package yh;

import ai.ad;
import ai.ga;
import ai.k7;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a31;
import org.telegram.ui.y8;
import w7.b6;
import w7.z5;
public class h4 extends org.telegram.ui.ActionBar.n2 implements ne.d {
    public LinearLayout E;
    public k3 F;
    public k3 G;
    public k3 H;
    public k3 I;
    public z00 J;
    public boolean K;
    public gh.c L;
    public bh.b M;
    public final ne.b f50332a;
    public final long f50333b;
    public final String f50334c;
    public final t3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.g2 f50335f;
    public View h;
    public c3 f50336n;
    public FrameLayout f50337r;
    public FrameLayout f50338s;
    public TextView v;
    public l3 f50339w;
    public boolean f50340x;
    public HorizontalScrollView f50341y;

    public h4(long j10, String str, long j11, d6 d6Var) {
        super(null);
        this.f50332a = new ne.b(0, this, bs.h, 380L, false);
        this.K = true;
        this.f50333b = j10;
        this.f50334c = str;
        this.resourceProvider = d6Var;
        t3 t3Var = new t3(j11, this.currentAccount, new ig.l0(this, 27));
        this.d = t3Var;
        t3Var.g(false);
    }

    public static void U(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.e0(false);
            if (j10 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                xc a02 = xc.a0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                qc O = a02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2)));
                O.f29653r = false;
                O.j();
            } else {
                qc O2 = xc.a0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j10)));
                O2.f29653r = false;
                O2.j();
            }
            h4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        b3 b3Var = new b3(bundle, tL_starGiftUnique, j10);
        d5 d5Var = h4Var.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).f20552b) {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.f3) && z10) {
                ((org.telegram.ui.ActionBar.f3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(b3Var, false, z10);
            }
        } else {
            h4Var.presentFragment(b3Var, true, z10);
        }
        Utilities.Callback callback = h4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(h4 h4Var, Context context) {
        t3 t3Var = h4Var.d;
        if (!h4Var.K || t3Var.h.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(h4Var, h4Var.I, false, false);
        i80Var.f27142t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27136p = new ki.h(i80Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.h);
        Collections.sort(arrayList, new s2(h4Var, 0));
        a71 a71Var = new a71(h4Var, new t2(h4Var, strArr, arrayList, 0), new u2(h4Var, i80Var, 0), null);
        a71Var.W2.f30207r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        iu iuVar = new iu(context, h4Var.resourceProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, h4Var.resourceProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, h4Var.resourceProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, h4Var.resourceProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 8));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!t3Var.f50566l.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 0), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
    }

    public static void W(h4 h4Var, Context context) {
        t3 t3Var = h4Var.d;
        if (!h4Var.K || t3Var.f50561f.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(h4Var, h4Var.G, false, false);
        i80Var.f27142t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27136p = new ki.h(i80Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50561f);
        Collections.sort(arrayList, new s2(h4Var, 2));
        a71 a71Var = new a71(h4Var, new t2(h4Var, strArr, arrayList, 2), new u2(h4Var, i80Var, 2), null);
        a71Var.W2.f30207r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        iu iuVar = new iu(context, h4Var.resourceProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, h4Var.resourceProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, h4Var.resourceProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, h4Var.resourceProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 9));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!t3Var.f50564j.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 2), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
    }

    public static void X(h4 h4Var, Context context) {
        t3 t3Var = h4Var.d;
        if (!h4Var.K || t3Var.f50562g.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(h4Var, h4Var.H, false, false);
        i80Var.f27142t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27136p = new ki.h(i80Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50562g);
        Collections.sort(arrayList, new s2(h4Var, 1));
        a71 a71Var = new a71(h4Var, new t2(h4Var, strArr, arrayList, 1), new u2(h4Var, i80Var, 1), null);
        a71Var.W2.f30207r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        iu iuVar = new iu(context, h4Var.resourceProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, h4Var.resourceProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, h4Var.resourceProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, h4Var.resourceProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 10));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!t3Var.f50565k.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 1), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
    }

    public static void Y(h4 h4Var, f61 f61Var) {
        Object obj = f61Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            k7 k7Var = new k7(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.f50333b, h4Var.resourceProvider, null);
            k7Var.D2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            k7Var.R0 = new x2(h4Var);
            h4Var.showDialog(k7Var);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(h4 h4Var) {
        return h4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(h4 h4Var) {
        return h4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k b0(h4 h4Var) {
        return h4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(h4 h4Var) {
        return h4Var.actionBar;
    }

    @Override
    public final View createView(final Context context) {
        gh.c cVar = new gh.c();
        this.L = cVar;
        int i10 = h6.f20993d6;
        cVar.a(getThemedColor(i10));
        this.M = new bh.b(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f50335f = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f50335f.f20871k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new a31(this, 15));
        this.actionBar.setTitle(this.f50334c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = h6.G6;
        kVar2.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.B(getThemedColor(h6.f21400z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(h6.f21398z6));
        y8 y8Var = new y8(this, context, 9);
        int v = h6.v(h6.w0(i10, this.resourceProvider), h6.m1(0.04f, h6.w0(i11, this.resourceProvider)));
        y8Var.setBackgroundColor(v);
        this.fragmentView = y8Var;
        ad adVar = new ad(context, this.currentAccount, this.resourceProvider);
        adVar.d = true;
        b6.a(adVar);
        adVar.setOnClickListener(new qg.n(12, this, adVar));
        this.actionBar.addView(adVar, z5.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 85));
        ?? a71Var = new a71(this, new hg.o(this, 29), new x2(this), new x2(this));
        this.f50336n = a71Var;
        a71Var.W2.f30207r = false;
        a71Var.setSpanCount(3);
        this.f50336n.j(new kv(this, 23));
        this.f50336n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f50336n.setClipToPadding(false);
        y8Var.addView(this.f50336n, z5.a(-1.0f, 7.33f, 0.0f, 7.33f, -45.0f, -1, 119));
        y8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h4 f50635b;

            {
                this.f50635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t3 t3Var = this.f50635b.d;
                        t3Var.f50565k.clear();
                        t3Var.f50564j.clear();
                        t3Var.f50566l.clear();
                        t3Var.h();
                        return;
                    default:
                        t3 t3Var2 = this.f50635b.d;
                        t3Var2.f50565k.clear();
                        t3Var2.f50564j.clear();
                        t3Var2.f50566l.clear();
                        t3Var2.h();
                        return;
                }
            }
        };
        d6 d6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout e = kk.e(context, 1);
        frameLayout.addView(e, z5.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new uj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        e.addView(w9Var, z5.q(130, 130, 17));
        TextView textView = new TextView(context);
        kk.o(h6.G6, d6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        e.addView(textView, z5.t(-2, -2, 17, 32, 12, 32, 9));
        x90 x90Var = new x90(context, null);
        x90Var.setTextColor(h6.w0(h6.A6, d6Var));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setGravity(17);
        x90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        x90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        e.addView(x90Var, z5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = h6.Oh;
        textView2.setTextColor(h6.w0(i12, d6Var));
        textView2.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i12, d6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.c1.e(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        b6.a(textView2);
        e.addView(textView2, z5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f50339w = frameLayout;
        this.f50340x = false;
        frameLayout.setAlpha(0.0f);
        this.f50339w.setScaleX(0.95f);
        this.f50339w.setScaleY(0.95f);
        this.f50339w.setVisibility(8);
        y8Var.addView(this.f50339w, z5.a(-1.0f, 0.0f, 0.0f, 0.0f, -45.0f, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f50341y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f50341y.addView(this.E);
        this.f50341y.setBackgroundColor(v);
        this.f50341y.setClipChildren(false);
        y8Var.addView(this.f50341y, z5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(h6.f20994d7));
        this.h.setAlpha(0.0f);
        y8Var.addView(this.h, z5.b(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final xp xpVar = new xp(context, 24, this.resourceProvider);
        xpVar.b(h6.f21066h7, h6.f21101j7, h6.f21121k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(false, false);
        xpVar.setDrawBackgroundAsArc(10);
        xpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        xpVar.setScaleX(0.8f);
        xpVar.setScaleY(0.8f);
        linearLayout2.addView(xpVar, z5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        kk.o(h6.f21099j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, z5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = h6.Oh;
        int v10 = h6.v(themedColor, h6.m1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(h6.j0(dp, dp, dp, dp, 0, v10, v10));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50338s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f50338s;
        dh.d c10 = this.M.c(frameLayout3, null, false);
        c10.o(fh.c.l(this.resourceProvider));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f50338s.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f50664b;

            {
                this.f50664b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        t3 t3Var = this.f50664b.d;
                        if (t3Var != null) {
                            boolean z10 = !t3Var.f50572r;
                            t3Var.f50572r = z10;
                            xpVar.a(z10, true);
                            t3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f50664b;
                        t3 t3Var2 = h4Var.d;
                        if (h4Var.K) {
                            i80 H = i80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(s3.BY_PRICE.f50548a), new v2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(s3.BY_DATE.f50548a), new v2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(s3.BY_NUMBER.f50548a), new v2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final xp xpVar2 = xpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = h4Var.d;
                                            if (t3Var3.f50572r) {
                                                t3Var3.f50572r = false;
                                                xpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = h4Var.d;
                                            if (!t3Var4.f50572r) {
                                                t3Var4.f50572r = true;
                                                xpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !t3Var2.f50572r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = h4Var.d;
                                            if (t3Var3.f50572r) {
                                                t3Var3.f50572r = false;
                                                xpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = h4Var.d;
                                            if (!t3Var4.f50572r) {
                                                t3Var4.f50572r = true;
                                                xpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), t3Var2.f50572r);
                            H.f27142t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f50338s.addView(linearLayout2, z5.d(-1.0f, -2));
        b6.b(this.f50338s, 0.04f, 1.5f);
        y8Var.addView(this.f50338s, z5.a(52.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density, -2, 81));
        ga y3 = ga.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.f50338s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f50337r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f50337r;
        dh.d c11 = this.M.c(frameLayout5, null, false);
        c11.o(fh.c.l(this.resourceProvider));
        c11.p(AndroidUtilities.dp(8.0f));
        c11.q(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        y8Var.addView(this.f50337r, z5.a(60.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density, -2, 81));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new yq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i13));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v11 = h6.v(getThemedColor(i10), h6.m1(0.1f, getThemedColor(i13)));
        textView4.setBackground(h6.j0(dp2, dp2, dp2, dp2, 0, v11, v11));
        this.v.setGravity(17);
        this.f50337r.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f50635b;

            {
                this.f50635b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        t3 t3Var = this.f50635b.d;
                        t3Var.f50565k.clear();
                        t3Var.f50564j.clear();
                        t3Var.f50566l.clear();
                        t3Var.h();
                        return;
                    default:
                        t3 t3Var2 = this.f50635b.d;
                        t3Var2.f50565k.clear();
                        t3Var2.f50564j.clear();
                        t3Var2.f50566l.clear();
                        t3Var2.h();
                        return;
                }
            }
        });
        this.f50337r.addView(this.v, z5.d(-1.0f, -2));
        this.f50337r.setVisibility(8);
        b6.b(this.f50337r, 0.05f, 1.5f);
        k3 k3Var = new k3(context, this.resourceProvider);
        this.F = k3Var;
        k3Var.setSorting(this.d.f50570p);
        this.E.addView(this.F, z5.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f50664b;

            {
                this.f50664b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        t3 t3Var = this.f50664b.d;
                        if (t3Var != null) {
                            boolean z10 = !t3Var.f50572r;
                            t3Var.f50572r = z10;
                            xpVar.a(z10, true);
                            t3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f50664b;
                        t3 t3Var2 = h4Var.d;
                        if (h4Var.K) {
                            i80 H = i80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(s3.BY_PRICE.f50548a), new v2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(s3.BY_DATE.f50548a), new v2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(s3.BY_NUMBER.f50548a), new v2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final xp xpVar2 = xpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = h4Var.d;
                                            if (t3Var3.f50572r) {
                                                t3Var3.f50572r = false;
                                                xpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = h4Var.d;
                                            if (!t3Var4.f50572r) {
                                                t3Var4.f50572r = true;
                                                xpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !t3Var2.f50572r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            t3 t3Var3 = h4Var.d;
                                            if (t3Var3.f50572r) {
                                                t3Var3.f50572r = false;
                                                xpVar2.a(false, true);
                                                t3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            t3 t3Var4 = h4Var.d;
                                            if (!t3Var4.f50572r) {
                                                t3Var4.f50572r = true;
                                                xpVar2.a(true, true);
                                                t3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), t3Var2.f50572r);
                            H.f27142t = false;
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
        this.E.addView(this.G, z5.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f50538b;

            {
                this.f50538b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f50538b, context);
                        return;
                    case 1:
                        h4.X(this.f50538b, context);
                        return;
                    default:
                        h4.V(this.f50538b, context);
                        return;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourceProvider);
        this.H = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, z5.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f50538b;

            {
                this.f50538b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f50538b, context);
                        return;
                    case 1:
                        h4.X(this.f50538b, context);
                        return;
                    default:
                        h4.V(this.f50538b, context);
                        return;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourceProvider);
        this.I = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, z5.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f50538b;

            {
                this.f50538b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f50538b, context);
                        return;
                    case 1:
                        h4.X(this.f50538b, context);
                        return;
                    default:
                        h4.V(this.f50538b, context);
                        return;
                }
            }
        });
        z00 z00Var = new z00(getParentActivity());
        this.J = z00Var;
        y8Var.addView(z00Var, z5.d(-1.0f, -1));
        d0(false, false);
        return y8Var;
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
            this.f50341y.setVisibility(0);
            ViewPropertyAnimator animate = this.f50341y.animate();
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
            bs bsVar = bs.h;
            alpha.setInterpolator(bsVar).setDuration(420L).setListener(new a3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(bsVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f50336n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(bsVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f50341y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f50341y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f50341y;
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
        c3 c3Var = this.f50336n;
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
        s61 s61Var;
        t3 t3Var = this.d;
        int i10 = t3Var.e;
        HashSet hashSet = t3Var.f50566l;
        ArrayList arrayList = t3Var.h;
        HashSet hashSet2 = t3Var.f50565k;
        ArrayList arrayList2 = t3Var.f50562g;
        HashSet hashSet3 = t3Var.f50564j;
        ArrayList arrayList3 = t3Var.f50561f;
        if (i10 > 12) {
            d0(true, true);
        }
        c3 c3Var = this.f50336n;
        boolean z11 = false;
        if (c3Var != null && (s61Var = c3Var.W2) != null) {
            s61Var.N(true);
            if (z10) {
                this.f50336n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f50334c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = t3Var.e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        k3 k3Var = this.F;
        if (k3Var != null) {
            k3Var.setSorting(t3Var.f50570p);
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
            if (i12 >= this.f50336n.getChildCount()) {
                break;
            } else if (this.f50336n.getChildAt(i12) instanceof b10) {
                t3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((t3Var.f50574t || t3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f50332a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = h6.x0(null, h6.f20993d6, false);
            if (this.actionBar.s()) {
                x02 = h6.x0(null, h6.f21347w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
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
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            this.f50338s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            h20.d(this.f50337r, f7);
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
