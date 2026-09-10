package wh;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b91;
import org.telegram.ui.w71;
import org.telegram.ui.w8;
import w7.a6;
import w7.c6;
import xh.n7;
import xh.v5;
public class h4 extends org.telegram.ui.ActionBar.p2 implements le.d {
    public LinearLayout E;
    public k3 F;
    public k3 G;
    public k3 H;
    public k3 I;
    public y00 J;
    public boolean K;
    public eh.c L;
    public zg.a M;
    public final le.b f44136a;
    public final long f44137b;
    public final String f44138c;
    public final u3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.i2 f44139f;
    public View h;
    public c3 f44140n;
    public FrameLayout f44141r;
    public FrameLayout f44142s;
    public TextView v;
    public l3 f44143w;
    public boolean f44144x;
    public HorizontalScrollView f44145y;

    public h4(long j3, String str, long j10, f6 f6Var) {
        super(null);
        this.f44136a = new le.b(0, this, wr.h, 380L, false);
        this.K = true;
        this.f44137b = j3;
        this.f44138c = str;
        this.resourceProvider = f6Var;
        u3 u3Var = new u3(j10, this.currentAccount, new org.telegram.ui.web.y1(this, 14));
        this.d = u3Var;
        u3Var.g(false);
    }

    public static void U(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.e0(false);
            if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                wc a02 = wc.a0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                pc O = a02.O(document, string, LocaleController.formatString(i10, hc.b.l(tL_starGiftUnique.num, ',', sb2)));
                O.f26089r = false;
                O.j();
            } else {
                pc O2 = wc.a0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j3)));
                O2.f26089r = false;
                O2.j();
            }
            h4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        b3 b3Var = new b3(bundle, tL_starGiftUnique, j3);
        f5 f5Var = h4Var.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).f17472b) {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.h3) && z10) {
                ((org.telegram.ui.ActionBar.h3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
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
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.h.isEmpty()) {
            return;
        }
        w70 w70Var = new w70(h4Var, h4Var.I, false, false);
        w70Var.f28702t = false;
        w70Var.Y = true;
        w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        w70Var.R = true;
        w70Var.f28696p = new hi.i(w70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new s2(h4Var, 0));
        r61 r61Var = new r61(h4Var, new t2(h4Var, strArr, arrayList, 0), new u2(h4Var, w70Var, 0), null);
        r61Var.Y2.f24250r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        fu fuVar = new fu(context, h4Var.resourceProvider);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setInputType(573441);
        fuVar.setRawInputType(573441);
        fuVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
        fuVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
        fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        fuVar.setCursorWidth(1.5f);
        fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        fuVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
        fuVar.setBackground(null);
        frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        fuVar.addTextChangedListener(new og.x(strArr, r61Var, false, 8));
        if (arrayList.size() > 8) {
            w70Var.r(frameLayout, a6.n(-1, 44));
            w70Var.k();
        }
        if (!u3Var.f44376l.isEmpty()) {
            w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 0), false);
        }
        w70Var.q(r61Var);
        w70Var.Z();
    }

    public static void W(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f44371f.isEmpty()) {
            return;
        }
        w70 w70Var = new w70(h4Var, h4Var.G, false, false);
        w70Var.f28702t = false;
        w70Var.Y = true;
        w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        w70Var.R = true;
        w70Var.f28696p = new hi.i(w70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f44371f);
        Collections.sort(arrayList, new s2(h4Var, 2));
        r61 r61Var = new r61(h4Var, new t2(h4Var, strArr, arrayList, 2), new u2(h4Var, w70Var, 2), null);
        r61Var.Y2.f24250r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        fu fuVar = new fu(context, h4Var.resourceProvider);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setInputType(573441);
        fuVar.setRawInputType(573441);
        fuVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
        fuVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
        fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        fuVar.setCursorWidth(1.5f);
        fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        fuVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
        fuVar.setBackground(null);
        frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        fuVar.addTextChangedListener(new og.x(strArr, r61Var, false, 9));
        if (arrayList.size() > 8) {
            w70Var.r(frameLayout, a6.n(-1, 44));
            w70Var.k();
        }
        if (!u3Var.f44374j.isEmpty()) {
            w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 2), false);
        }
        w70Var.q(r61Var);
        w70Var.Z();
    }

    public static void X(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f44372g.isEmpty()) {
            return;
        }
        w70 w70Var = new w70(h4Var, h4Var.H, false, false);
        w70Var.f28702t = false;
        w70Var.Y = true;
        w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        w70Var.R = true;
        w70Var.f28696p = new hi.i(w70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f44372g);
        Collections.sort(arrayList, new s2(h4Var, 1));
        r61 r61Var = new r61(h4Var, new t2(h4Var, strArr, arrayList, 1), new u2(h4Var, w70Var, 1), null);
        r61Var.Y2.f24250r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        fu fuVar = new fu(context, h4Var.resourceProvider);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setInputType(573441);
        fuVar.setRawInputType(573441);
        fuVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
        fuVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
        fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        fuVar.setCursorWidth(1.5f);
        fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        fuVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
        fuVar.setBackground(null);
        frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        fuVar.addTextChangedListener(new og.x(strArr, r61Var, false, 10));
        if (arrayList.size() > 8) {
            w70Var.r(frameLayout, a6.n(-1, 44));
            w70Var.k();
        }
        if (!u3Var.f44375k.isEmpty()) {
            w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new v2(h4Var, 1), false);
        }
        w70Var.q(r61Var);
        w70Var.Z();
    }

    public static void Y(h4 h4Var, v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            xh.x3 x3Var = new xh.x3(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.f44137b, h4Var.resourceProvider, null);
            x3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            x3Var.O0 = new x2(h4Var);
            h4Var.showDialog(x3Var);
        }
    }

    public static org.telegram.ui.ActionBar.l Z(h4 h4Var) {
        return h4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l a0(h4 h4Var) {
        return h4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l b0(h4 h4Var) {
        return h4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l c0(h4 h4Var) {
        return h4Var.actionBar;
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            this.f44142s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            h20.d(this.f44141r, f7);
        }
    }

    @Override
    public final View createView(final Context context) {
        eh.c cVar = new eh.c();
        this.L = cVar;
        int i10 = j6.f17928d6;
        cVar.a(getThemedColor(i10));
        this.M = new zg.a(this.L);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f44139f = i2Var;
        lVar.setBackButtonDrawable(i2Var);
        this.f44139f.f17826k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 11));
        this.actionBar.setTitle(this.f44138c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = j6.G6;
        lVar2.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.A(getThemedColor(j6.f18327z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(j6.f18325z6));
        w8 w8Var = new w8(this, context, 9);
        int v = j6.v(j6.v0(i10, this.resourceProvider), j6.l1(0.04f, j6.v0(i11, this.resourceProvider)));
        w8Var.setBackgroundColor(v);
        this.fragmentView = w8Var;
        n7 n7Var = new n7(context, this.currentAccount, this.resourceProvider);
        n7Var.d = true;
        c6.a(n7Var);
        n7Var.setOnClickListener(new w71(21, this, n7Var));
        this.actionBar.addView(n7Var, a6.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? r61Var = new r61(this, new gi.a(this, 18), new x2(this), new x2(this));
        this.f44140n = r61Var;
        r61Var.Y2.f24250r = false;
        r61Var.setSpanCount(3);
        this.f44140n.j(new al0(this, 13));
        this.f44140n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f44140n.setClipToPadding(false);
        w8Var.addView(this.f44140n, a6.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h4 f44437b;

            {
                this.f44437b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f44437b.d;
                        u3Var.f44375k.clear();
                        u3Var.f44374j.clear();
                        u3Var.f44376l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f44437b.d;
                        u3Var2.f44375k.clear();
                        u3Var2.f44374j.clear();
                        u3Var2.f44376l.clear();
                        u3Var2.h();
                        return;
                }
            }
        };
        f6 f6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout f7 = em.f(context, 1);
        frameLayout.addView(f7, a6.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(w9Var, a6.q(130, 130, 17));
        TextView textView = new TextView(context);
        em.n(j6.G6, f6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, a6.t(-2, -2, 17, 32, 12, 32, 9));
        m90 m90Var = new m90(context, null);
        m90Var.setTextColor(j6.v0(j6.A6, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setGravity(17);
        m90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        m90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(m90Var, a6.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = j6.Oh;
        textView2.setTextColor(j6.v0(i12, f6Var));
        textView2.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i12, f6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(r6.b(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        c6.a(textView2);
        f7.addView(textView2, a6.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f44143w = frameLayout;
        this.f44144x = false;
        frameLayout.setAlpha(0.0f);
        this.f44143w.setScaleX(0.95f);
        this.f44143w.setScaleY(0.95f);
        this.f44143w.setVisibility(8);
        w8Var.addView(this.f44143w, a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f44145y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f44145y.addView(this.E);
        this.f44145y.setBackgroundColor(v);
        this.f44145y.setClipChildren(false);
        w8Var.addView(this.f44145y, a6.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.f17929d7));
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, a6.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final tp tpVar = new tp(context, 24, this.resourceProvider);
        tpVar.b(j6.f18000h7, j6.f18036j7, j6.f18056k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(false, false);
        tpVar.setDrawBackgroundAsArc(10);
        tpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        tpVar.setScaleX(0.8f);
        tpVar.setScaleY(0.8f);
        linearLayout2.addView(tpVar, a6.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        em.n(j6.f18034j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, a6.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = j6.Oh;
        int v9 = j6.v(themedColor, j6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(j6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44142s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f44142s;
        bh.d c10 = this.M.c(frameLayout3, null, false);
        c10.n(dh.c.l(this.resourceProvider));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f44142s.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f44466b;

            {
                this.f44466b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f44466b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f44382r;
                            u3Var.f44382r = z10;
                            tpVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f44466b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            w70 H = w70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f44361a), new v2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f44361a), new v2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f44361a), new v2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final tp tpVar2 = tpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f44382r) {
                                                u3Var3.f44382r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f44382r) {
                                                u3Var4.f44382r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f44382r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f44382r) {
                                                u3Var3.f44382r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f44382r) {
                                                u3Var4.f44382r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f44382r);
                            H.f28702t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f44142s.addView(linearLayout2, a6.c(-1.0f, -2));
        c6.b(this.f44142s, 0.04f, 1.5f);
        w8Var.addView(this.f44142s, a6.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        v5 y3 = v5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.f44142s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f44141r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f44141r;
        bh.d c11 = this.M.c(frameLayout5, null, false);
        c11.n(dh.c.l(this.resourceProvider));
        c11.o(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        w8Var.addView(this.f44141r, a6.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new uq(R.drawable.msg_clearcache, 0), 0, 1, 33);
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
        this.f44141r.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f44437b;

            {
                this.f44437b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f44437b.d;
                        u3Var.f44375k.clear();
                        u3Var.f44374j.clear();
                        u3Var.f44376l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f44437b.d;
                        u3Var2.f44375k.clear();
                        u3Var2.f44374j.clear();
                        u3Var2.f44376l.clear();
                        u3Var2.h();
                        return;
                }
            }
        });
        this.f44141r.addView(this.v, a6.c(-1.0f, -2));
        this.f44141r.setVisibility(8);
        c6.b(this.f44141r, 0.05f, 1.5f);
        k3 k3Var = new k3(context, this.resourceProvider);
        this.F = k3Var;
        k3Var.setSorting(this.d.f44380p);
        this.E.addView(this.F, a6.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f44466b;

            {
                this.f44466b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f44466b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f44382r;
                            u3Var.f44382r = z10;
                            tpVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f44466b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            w70 H = w70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f44361a), new v2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f44361a), new v2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f44361a), new v2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final tp tpVar2 = tpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f44382r) {
                                                u3Var3.f44382r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f44382r) {
                                                u3Var4.f44382r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f44382r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f44382r) {
                                                u3Var3.f44382r = false;
                                                tpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f44382r) {
                                                u3Var4.f44382r = true;
                                                tpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f44382r);
                            H.f28702t = false;
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
        this.E.addView(this.G, a6.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f44340b;

            {
                this.f44340b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f44340b, context);
                        return;
                    case 1:
                        h4.X(this.f44340b, context);
                        return;
                    default:
                        h4.V(this.f44340b, context);
                        return;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourceProvider);
        this.H = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, a6.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f44340b;

            {
                this.f44340b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f44340b, context);
                        return;
                    case 1:
                        h4.X(this.f44340b, context);
                        return;
                    default:
                        h4.V(this.f44340b, context);
                        return;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourceProvider);
        this.I = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, a6.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f44340b;

            {
                this.f44340b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f44340b, context);
                        return;
                    case 1:
                        h4.X(this.f44340b, context);
                        return;
                    default:
                        h4.V(this.f44340b, context);
                        return;
                }
            }
        });
        y00 y00Var = new y00(getParentActivity());
        this.J = y00Var;
        w8Var.addView(y00Var, a6.c(-1.0f, -1));
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
            this.f44145y.setVisibility(0);
            ViewPropertyAnimator animate = this.f44145y.animate();
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
            wr wrVar = wr.h;
            alpha.setInterpolator(wrVar).setDuration(420L).setListener(new a3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(wrVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f44140n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(wrVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f44145y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f44145y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f44145y;
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
        c3 c3Var = this.f44140n;
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
        j61 j61Var;
        u3 u3Var = this.d;
        int i10 = u3Var.e;
        HashSet hashSet = u3Var.f44376l;
        ArrayList arrayList = u3Var.h;
        HashSet hashSet2 = u3Var.f44375k;
        ArrayList arrayList2 = u3Var.f44372g;
        HashSet hashSet3 = u3Var.f44374j;
        ArrayList arrayList3 = u3Var.f44371f;
        if (i10 > 12) {
            d0(true, true);
        }
        c3 c3Var = this.f44140n;
        boolean z11 = false;
        if (c3Var != null && (j61Var = c3Var.Y2) != null) {
            j61Var.N(true);
            if (z10) {
                this.f44140n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(this.f44138c);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = u3Var.e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            lVar2.setSubtitle(formatPluralStringComma);
        }
        k3 k3Var = this.F;
        if (k3Var != null) {
            k3Var.setSorting(u3Var.f44380p);
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
            if (i12 >= this.f44140n.getChildCount()) {
                break;
            } else if (this.f44140n.getChildAt(i12) instanceof a10) {
                u3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((u3Var.f44384t || u3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f44136a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f17928d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f18273w8, false);
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
    public final void B(float f7, int i10) {
    }
}
