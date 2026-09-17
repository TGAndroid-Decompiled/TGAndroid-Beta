package xh;

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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x81;
import org.telegram.ui.xy0;
import org.telegram.ui.y8;
import w7.x5;
import w7.z5;
import yh.m7;
import yh.v5;
public class h4 extends org.telegram.ui.ActionBar.o2 implements le.d {
    public LinearLayout E;
    public l3 F;
    public l3 G;
    public l3 H;
    public l3 I;
    public r00 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final le.b f45917a;
    public final long f45918b;
    public final String f45919c;
    public final u3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.h2 f45920f;
    public View h;
    public d3 f45921n;
    public FrameLayout f45922r;
    public FrameLayout f45923s;
    public TextView v;
    public m3 f45924w;
    public boolean f45925x;
    public HorizontalScrollView f45926y;

    public h4(long j3, String str, long j10, f6 f6Var) {
        super(null);
        this.f45917a = new le.b(0, this, qr.h, 380L, false);
        this.K = true;
        this.f45918b = j3;
        this.f45919c = str;
        this.resourceProvider = f6Var;
        u3 u3Var = new u3(j10, this.currentAccount, new org.telegram.ui.web.b1(this, 18));
        this.d = u3Var;
        u3Var.g(false);
    }

    public static void U(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.e0(false);
            if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                vc a02 = vc.a0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                oc O = a02.O(document, string, LocaleController.formatString(i10, hg.k0.k(tL_starGiftUnique.num, ',', sb2)));
                O.f26710r = false;
                O.j();
            } else {
                oc O2 = vc.a0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j3)));
                O2.f26710r = false;
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
        c3 c3Var = new c3(bundle, tL_starGiftUnique, j3);
        e5 e5Var = h4Var.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).f18390b) {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.g3) && z10) {
                ((org.telegram.ui.ActionBar.g3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(c3Var, false, z10);
            }
        } else {
            h4Var.presentFragment(c3Var, true, z10);
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
        n70 n70Var = new n70(h4Var, h4Var.I, false, false);
        n70Var.f26385t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f26379p = new ii.h(n70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new t2(h4Var, 0));
        f61 f61Var = new f61(h4Var, new u2(h4Var, strArr, arrayList, 0), new v2(h4Var, n70Var, 0), null);
        f61Var.Y2.f29851r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, h4Var.resourceProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
        buVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, f61Var, false, 8));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!u3Var.f46174l.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 0), false);
        }
        n70Var.q(f61Var);
        n70Var.Z();
    }

    public static void W(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f46169f.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(h4Var, h4Var.G, false, false);
        n70Var.f26385t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f26379p = new ii.h(n70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f46169f);
        Collections.sort(arrayList, new t2(h4Var, 2));
        f61 f61Var = new f61(h4Var, new u2(h4Var, strArr, arrayList, 2), new v2(h4Var, n70Var, 2), null);
        f61Var.Y2.f29851r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, h4Var.resourceProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
        buVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, f61Var, false, 9));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!u3Var.f46172j.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 2), false);
        }
        n70Var.q(f61Var);
        n70Var.Z();
    }

    public static void X(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f46170g.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(h4Var, h4Var.H, false, false);
        n70Var.f26385t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f26379p = new ii.h(n70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f46170g);
        Collections.sort(arrayList, new t2(h4Var, 1));
        f61 f61Var = new f61(h4Var, new u2(h4Var, strArr, arrayList, 1), new v2(h4Var, n70Var, 1), null);
        f61Var.Y2.f29851r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, h4Var.resourceProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourceProvider));
        buVar.setCursorColor(j6.v0(j6.G6, h4Var.resourceProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, h4Var.resourceProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, f61Var, false, 10));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!u3Var.f46173k.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 1), false);
        }
        n70Var.q(f61Var);
        n70Var.Z();
    }

    public static void Y(h4 h4Var, j51 j51Var) {
        Object obj = j51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.a4 a4Var = new yh.a4(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.f45918b, h4Var.resourceProvider, null);
            a4Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            a4Var.O0 = new y2(h4Var);
            h4Var.showDialog(a4Var);
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
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            this.f45923s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            y10.d(this.f45922r, f7);
        }
    }

    @Override
    public final View createView(final Context context) {
        fh.c cVar = new fh.c();
        this.L = cVar;
        int i10 = j6.f18862d6;
        cVar.a(getThemedColor(i10));
        this.M = new ah.c(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f45920f = h2Var;
        kVar.setBackButtonDrawable(h2Var);
        this.f45920f.f18712k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new x81(this, 11));
        this.actionBar.setTitle(this.f45919c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        kVar2.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.A(getThemedColor(j6.f19265z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(j6.f19263z6));
        y8 y8Var = new y8(this, context, 9);
        int v = j6.v(j6.v0(i10, this.resourceProvider), j6.l1(0.04f, j6.v0(i11, this.resourceProvider)));
        y8Var.setBackgroundColor(v);
        this.fragmentView = y8Var;
        m7 m7Var = new m7(context, this.currentAccount, this.resourceProvider);
        m7Var.d = true;
        z5.a(m7Var);
        m7Var.setOnClickListener(new xy0(25, this, m7Var));
        this.actionBar.addView(m7Var, x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? f61Var = new f61(this, new hi.a(this, 18), new y2(this), new y2(this));
        this.f45921n = f61Var;
        f61Var.Y2.f29851r = false;
        f61Var.setSpanCount(3);
        this.f45921n.j(new kb0(this, 17));
        this.f45921n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f45921n.setClipToPadding(false);
        y8Var.addView(this.f45921n, x5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        y8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h4 f46263b;

            {
                this.f46263b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f46263b.d;
                        u3Var.f46173k.clear();
                        u3Var.f46172j.clear();
                        u3Var.f46174l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f46263b.d;
                        u3Var2.f46173k.clear();
                        u3Var2.f46172j.clear();
                        u3Var2.f46174l.clear();
                        u3Var2.h();
                        return;
                }
            }
        };
        f6 f6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout f7 = wl.f(context, 1);
        frameLayout.addView(f7, x5.e(-1, -2, 23));
        u9 u9Var = new u9(context);
        u9Var.setImageDrawable(new yi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(u9Var, x5.q(130, 130, 17));
        TextView textView = new TextView(context);
        wl.n(j6.G6, f6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, x5.t(-2, -2, 17, 32, 12, 32, 9));
        c90 c90Var = new c90(context, null);
        c90Var.setTextColor(j6.v0(j6.A6, f6Var));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setGravity(17);
        c90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        c90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(c90Var, x5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = j6.Oh;
        textView2.setTextColor(j6.v0(i12, f6Var));
        textView2.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i12, f6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(p6.b(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        z5.a(textView2);
        f7.addView(textView2, x5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f45924w = frameLayout;
        this.f45925x = false;
        frameLayout.setAlpha(0.0f);
        this.f45924w.setScaleX(0.95f);
        this.f45924w.setScaleY(0.95f);
        this.f45924w.setVisibility(8);
        y8Var.addView(this.f45924w, x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f45926y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f45926y.addView(this.E);
        this.f45926y.setBackgroundColor(v);
        this.f45926y.setClipChildren(false);
        y8Var.addView(this.f45926y, x5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.f18863d7));
        this.h.setAlpha(0.0f);
        y8Var.addView(this.h, x5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final np npVar = new np(context, 24, this.resourceProvider);
        npVar.b(j6.f18935h7, j6.f18971j7, j6.f18991k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        npVar.setTranslationX(AndroidUtilities.dp(4.0f));
        npVar.setScaleX(0.8f);
        npVar.setScaleY(0.8f);
        linearLayout2.addView(npVar, x5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        wl.n(j6.f18969j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, x5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = j6.Oh;
        int v9 = j6.v(themedColor, j6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(j6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45923s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f45923s;
        ch.d c10 = this.M.c(frameLayout3, null, false);
        c10.o(eh.b.l(this.resourceProvider));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f45923s.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f45820b;

            {
                this.f45820b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f45820b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f46180r;
                            u3Var.f46180r = z10;
                            npVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f45820b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            n70 H = n70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f46154a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f46154a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f46154a), new w2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final np npVar2 = npVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f46180r) {
                                                u3Var3.f46180r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f46180r) {
                                                u3Var4.f46180r = true;
                                                npVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f46180r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f46180r) {
                                                u3Var3.f46180r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f46180r) {
                                                u3Var4.f46180r = true;
                                                npVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f46180r);
                            H.f26385t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f45923s.addView(linearLayout2, x5.c(-1.0f, -2));
        z5.b(this.f45923s, 0.04f, 1.5f);
        y8Var.addView(this.f45923s, x5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        v5 y3 = v5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.f45923s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f45922r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f45922r;
        ch.d c11 = this.M.c(frameLayout5, null, false);
        c11.o(eh.b.l(this.resourceProvider));
        c11.p(AndroidUtilities.dp(8.0f));
        c11.q(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        y8Var.addView(this.f45922r, x5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new oq(R.drawable.msg_clearcache, 0), 0, 1, 33);
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
        this.f45922r.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f46263b;

            {
                this.f46263b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f46263b.d;
                        u3Var.f46173k.clear();
                        u3Var.f46172j.clear();
                        u3Var.f46174l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f46263b.d;
                        u3Var2.f46173k.clear();
                        u3Var2.f46172j.clear();
                        u3Var2.f46174l.clear();
                        u3Var2.h();
                        return;
                }
            }
        });
        this.f45922r.addView(this.v, x5.c(-1.0f, -2));
        this.f45922r.setVisibility(8);
        z5.b(this.f45922r, 0.05f, 1.5f);
        l3 l3Var = new l3(context, this.resourceProvider);
        this.F = l3Var;
        l3Var.setSorting(this.d.f46178p);
        this.E.addView(this.F, x5.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f45820b;

            {
                this.f45820b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f45820b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f46180r;
                            u3Var.f46180r = z10;
                            npVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f45820b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            n70 H = n70.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f46154a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f46154a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f46154a), new w2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final np npVar2 = npVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f46180r) {
                                                u3Var3.f46180r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f46180r) {
                                                u3Var4.f46180r = true;
                                                npVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f46180r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f46180r) {
                                                u3Var3.f46180r = false;
                                                npVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f46180r) {
                                                u3Var4.f46180r = true;
                                                npVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f46180r);
                            H.f26385t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        l3 l3Var2 = new l3(context, this.resourceProvider);
        this.G = l3Var2;
        l3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.E.addView(this.G, x5.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f46143b;

            {
                this.f46143b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f46143b, context);
                        return;
                    case 1:
                        h4.X(this.f46143b, context);
                        return;
                    default:
                        h4.V(this.f46143b, context);
                        return;
                }
            }
        });
        l3 l3Var3 = new l3(context, this.resourceProvider);
        this.H = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, x5.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f46143b;

            {
                this.f46143b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f46143b, context);
                        return;
                    case 1:
                        h4.X(this.f46143b, context);
                        return;
                    default:
                        h4.V(this.f46143b, context);
                        return;
                }
            }
        });
        l3 l3Var4 = new l3(context, this.resourceProvider);
        this.I = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, x5.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f46143b;

            {
                this.f46143b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f46143b, context);
                        return;
                    case 1:
                        h4.X(this.f46143b, context);
                        return;
                    default:
                        h4.V(this.f46143b, context);
                        return;
                }
            }
        });
        r00 r00Var = new r00(getParentActivity());
        this.J = r00Var;
        y8Var.addView(r00Var, x5.c(-1.0f, -1));
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
            this.f45926y.setVisibility(0);
            ViewPropertyAnimator animate = this.f45926y.animate();
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
            qr qrVar = qr.h;
            alpha.setInterpolator(qrVar).setDuration(420L).setListener(new b3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(qrVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f45921n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(qrVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f45926y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f45926y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f45926y;
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
        d3 d3Var = this.f45921n;
        if (!z10) {
            f14 = -AndroidUtilities.dp(39.0f);
        }
        d3Var.setTranslationY(f14);
    }

    public final void e0(boolean z10) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        x51 x51Var;
        u3 u3Var = this.d;
        int i10 = u3Var.e;
        HashSet hashSet = u3Var.f46174l;
        ArrayList arrayList = u3Var.h;
        HashSet hashSet2 = u3Var.f46173k;
        ArrayList arrayList2 = u3Var.f46170g;
        HashSet hashSet3 = u3Var.f46172j;
        ArrayList arrayList3 = u3Var.f46169f;
        if (i10 > 12) {
            d0(true, true);
        }
        d3 d3Var = this.f45921n;
        boolean z11 = false;
        if (d3Var != null && (x51Var = d3Var.Y2) != null) {
            x51Var.N(true);
            if (z10) {
                this.f45921n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f45919c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = u3Var.e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        l3 l3Var = this.F;
        if (l3Var != null) {
            l3Var.setSorting(u3Var.f46178p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            l3 l3Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                string3 = LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size);
            } else {
                string3 = LocaleController.getString(R.string.Gift2ResaleFilterModel);
            }
            l3Var2.setValue(string3);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            l3 l3Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                string2 = LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2);
            } else {
                string2 = LocaleController.getString(R.string.Gift2ResaleFilterBackdrop);
            }
            l3Var3.setValue(string2);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            l3 l3Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                string = LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3);
            } else {
                string = LocaleController.getString(R.string.Gift2ResaleFilterSymbol);
            }
            l3Var4.setValue(string);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f45921n.getChildCount()) {
                break;
            } else if (this.f45921n.getChildAt(i12) instanceof t00) {
                u3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((u3Var.f46182t || u3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f45917a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = j6.w0(null, j6.f18862d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f19212w8, false);
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
    public final void C(float f7, int i10) {
    }
}
