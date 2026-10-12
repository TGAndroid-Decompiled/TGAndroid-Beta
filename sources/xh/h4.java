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
import org.telegram.messenger.am;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f51;
import org.telegram.ui.y8;
import w7.w5;
import w7.y5;
import yh.d7;
import yh.n5;
public class h4 extends org.telegram.ui.ActionBar.m2 implements me.d {
    public LinearLayout E;
    public l3 F;
    public l3 G;
    public l3 H;
    public l3 I;
    public k10 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final me.b f51505a;
    public final long f51506b;
    public final String f51507c;
    public final u3 d;
    public Utilities.Callback f51508e;
    public org.telegram.ui.ActionBar.f2 f51509f;
    public View h;
    public d3 f51510n;
    public FrameLayout f51511r;
    public FrameLayout f51512s;
    public TextView v;
    public m3 f51513w;
    public boolean f51514x;
    public HorizontalScrollView f51515y;

    public h4(long j3, String str, long j10, c6 c6Var) {
        super(null);
        this.f51505a = new me.b(0, this, js.h, 380L, false);
        this.K = true;
        this.f51506b = j3;
        this.f51507c = str;
        this.resourceProvider = c6Var;
        u3 u3Var = new u3(j10, this.currentAccount, new ii.q1(this, 21));
        this.d = u3Var;
        u3Var.g(false);
    }

    public static void U(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.e0(false);
            if (j3 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                zc a02 = zc.a0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                sc O = a02.O(document, string, LocaleController.formatString(i10, hg.c.k(tL_starGiftUnique.num, ',', sb2)));
                O.f30544r = false;
                O.j();
            } else {
                sc O2 = zc.a0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j3)));
                O2.f30544r = false;
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
        b5 b5Var = h4Var.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).f20084b) {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.e3) && z10) {
                ((org.telegram.ui.ActionBar.e3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(c3Var, false, z10);
            }
        } else {
            h4Var.presentFragment(c3Var, true, z10);
        }
        Utilities.Callback callback = h4Var.f51508e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.h.isEmpty()) {
            return;
        }
        s80 s80Var = new s80(h4Var, h4Var.I, false, false);
        s80Var.f30469t = false;
        s80Var.Y = true;
        s80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        s80Var.R = true;
        s80Var.f30463p = new ii.h(s80Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new t2(h4Var, 0));
        p71 p71Var = new p71(h4Var, new u2(h4Var, strArr, arrayList, 0), new v2(h4Var, s80Var, 0), null);
        p71Var.W2.f26679r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        uu uuVar = new uu(context, h4Var.resourceProvider);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setInputType(573441);
        uuVar.setRawInputType(573441);
        uuVar.setHintTextColor(h6.w0(h6.A6, h4Var.resourceProvider));
        uuVar.setCursorColor(h6.w0(h6.G6, h4Var.resourceProvider));
        uuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        uuVar.setCursorWidth(1.5f);
        uuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        uuVar.setTextColor(h6.w0(h6.E8, h4Var.resourceProvider));
        uuVar.setBackground(null);
        frameLayout.addView(uuVar, w5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        uuVar.addTextChangedListener(new jo(strArr, p71Var, false, 8));
        if (arrayList.size() > 8) {
            s80Var.r(frameLayout, w5.n(-1, 44));
            s80Var.k();
        }
        if (!u3Var.f51781l.isEmpty()) {
            s80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 0), false);
        }
        s80Var.q(p71Var);
        s80Var.Z();
    }

    public static void W(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f51776f.isEmpty()) {
            return;
        }
        s80 s80Var = new s80(h4Var, h4Var.G, false, false);
        s80Var.f30469t = false;
        s80Var.Y = true;
        s80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        s80Var.R = true;
        s80Var.f30463p = new ii.h(s80Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f51776f);
        Collections.sort(arrayList, new t2(h4Var, 2));
        p71 p71Var = new p71(h4Var, new u2(h4Var, strArr, arrayList, 2), new v2(h4Var, s80Var, 2), null);
        p71Var.W2.f26679r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        uu uuVar = new uu(context, h4Var.resourceProvider);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setInputType(573441);
        uuVar.setRawInputType(573441);
        uuVar.setHintTextColor(h6.w0(h6.A6, h4Var.resourceProvider));
        uuVar.setCursorColor(h6.w0(h6.G6, h4Var.resourceProvider));
        uuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        uuVar.setCursorWidth(1.5f);
        uuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        uuVar.setTextColor(h6.w0(h6.E8, h4Var.resourceProvider));
        uuVar.setBackground(null);
        frameLayout.addView(uuVar, w5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        uuVar.addTextChangedListener(new jo(strArr, p71Var, false, 9));
        if (arrayList.size() > 8) {
            s80Var.r(frameLayout, w5.n(-1, 44));
            s80Var.k();
        }
        if (!u3Var.f51779j.isEmpty()) {
            s80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 2), false);
        }
        s80Var.q(p71Var);
        s80Var.Z();
    }

    public static void X(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f51777g.isEmpty()) {
            return;
        }
        s80 s80Var = new s80(h4Var, h4Var.H, false, false);
        s80Var.f30469t = false;
        s80Var.Y = true;
        s80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        s80Var.R = true;
        s80Var.f30463p = new ii.h(s80Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f51777g);
        Collections.sort(arrayList, new t2(h4Var, 1));
        p71 p71Var = new p71(h4Var, new u2(h4Var, strArr, arrayList, 1), new v2(h4Var, s80Var, 1), null);
        p71Var.W2.f26679r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        uu uuVar = new uu(context, h4Var.resourceProvider);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setInputType(573441);
        uuVar.setRawInputType(573441);
        uuVar.setHintTextColor(h6.w0(h6.A6, h4Var.resourceProvider));
        uuVar.setCursorColor(h6.w0(h6.G6, h4Var.resourceProvider));
        uuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        uuVar.setCursorWidth(1.5f);
        uuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        uuVar.setTextColor(h6.w0(h6.E8, h4Var.resourceProvider));
        uuVar.setBackground(null);
        frameLayout.addView(uuVar, w5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        uuVar.addTextChangedListener(new jo(strArr, p71Var, false, 10));
        if (arrayList.size() > 8) {
            s80Var.r(frameLayout, w5.n(-1, 44));
            s80Var.k();
        }
        if (!u3Var.f51780k.isEmpty()) {
            s80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 1), false);
        }
        s80Var.q(p71Var);
        s80Var.Z();
    }

    public static void Y(h4 h4Var, u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.s3 s3Var = new yh.s3(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.f51506b, h4Var.resourceProvider, null);
            s3Var.j2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            s3Var.P0 = new y2(h4Var);
            h4Var.showDialog(s3Var);
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
        fh.c cVar = new fh.c();
        this.L = cVar;
        int i10 = h6.f20560d6;
        cVar.a(getThemedColor(i10));
        this.M = new ah.c(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f51509f = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f51509f.f20389k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new f51(this, 13));
        this.actionBar.setTitle(this.f51507c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = h6.G6;
        kVar2.E(getThemedColor(i11), false);
        this.actionBar.E(getThemedColor(i11), true);
        this.actionBar.D(getThemedColor(h6.f20966z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(h6.f20964z6));
        y8 y8Var = new y8(this, context, 9);
        int v = h6.v(h6.w0(i10, this.resourceProvider), h6.m1(0.04f, h6.w0(i11, this.resourceProvider)));
        y8Var.setBackgroundColor(v);
        this.fragmentView = y8Var;
        d7 d7Var = new d7(context, this.currentAccount, this.resourceProvider);
        d7Var.d = true;
        y5.a(d7Var);
        d7Var.setOnClickListener(new a(1, this, d7Var));
        this.actionBar.addView(d7Var, w5.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 85));
        ?? p71Var = new p71(this, new hi.a(this, 18), new y2(this), new y2(this));
        this.f51510n = p71Var;
        p71Var.W2.f26679r = false;
        p71Var.setSpanCount(3);
        this.f51510n.j(new qh0(this, 18));
        this.f51510n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f51510n.setClipToPadding(false);
        y8Var.addView(this.f51510n, w5.a(-1.0f, 7.33f, 0.0f, 7.33f, -45.0f, -1, 119));
        y8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h4 f51871b;

            {
                this.f51871b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f51871b.d;
                        u3Var.f51780k.clear();
                        u3Var.f51779j.clear();
                        u3Var.f51781l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f51871b.d;
                        u3Var2.f51780k.clear();
                        u3Var2.f51779j.clear();
                        u3Var2.f51781l.clear();
                        u3Var2.h();
                        return;
                }
            }
        };
        c6 c6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout e7 = am.e(context, 1);
        frameLayout.addView(e7, w5.e(-1, -2, 23));
        y9 y9Var = new y9(context);
        y9Var.setImageDrawable(new fk0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        e7.addView(y9Var, w5.q(130, 130, 17));
        TextView textView = new TextView(context);
        am.o(h6.G6, c6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        e7.addView(textView, w5.t(-2, -2, 17, 32, 12, 32, 9));
        ia0 ia0Var = new ia0(context, null);
        ia0Var.setTextColor(h6.w0(h6.A6, c6Var));
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setGravity(17);
        ia0Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        ia0Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        e7.addView(ia0Var, w5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = h6.Oh;
        textView2.setTextColor(h6.w0(i12, c6Var));
        textView2.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i12, c6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.c1.b(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        y5.a(textView2);
        e7.addView(textView2, w5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f51513w = frameLayout;
        this.f51514x = false;
        frameLayout.setAlpha(0.0f);
        this.f51513w.setScaleX(0.95f);
        this.f51513w.setScaleY(0.95f);
        this.f51513w.setVisibility(8);
        y8Var.addView(this.f51513w, w5.a(-1.0f, 0.0f, 0.0f, 0.0f, -45.0f, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f51515y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f51515y.addView(this.E);
        this.f51515y.setBackgroundColor(v);
        this.f51515y.setClipChildren(false);
        y8Var.addView(this.f51515y, w5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(h6.f20561d7));
        this.h.setAlpha(0.0f);
        y8Var.addView(this.h, w5.b(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final fq fqVar = new fq(context, 24, this.resourceProvider);
        fqVar.b(h6.f20633h7, h6.f20670j7, h6.f20689k7);
        fqVar.setDrawUnchecked(true);
        fqVar.a(false, false);
        fqVar.setDrawBackgroundAsArc(10);
        fqVar.setTranslationX(AndroidUtilities.dp(4.0f));
        fqVar.setScaleX(0.8f);
        fqVar.setScaleY(0.8f);
        linearLayout2.addView(fqVar, w5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        am.o(h6.f20668j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, w5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = h6.Oh;
        int v9 = h6.v(themedColor, h6.m1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(h6.j0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f51512s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f51512s;
        ch.d c10 = this.M.c(frameLayout3, null, false);
        c10.o(eh.b.l(this.resourceProvider));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f51512s.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51404b;

            {
                this.f51404b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f51404b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f51787r;
                            u3Var.f51787r = z10;
                            fqVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f51404b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            s80 H = s80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f51762a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f51762a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f51762a), new w2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final fq fqVar2 = fqVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f51787r) {
                                                u3Var3.f51787r = false;
                                                fqVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f51787r) {
                                                u3Var4.f51787r = true;
                                                fqVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f51787r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f51787r) {
                                                u3Var3.f51787r = false;
                                                fqVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f51787r) {
                                                u3Var4.f51787r = true;
                                                fqVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f51787r);
                            H.f30469t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f51512s.addView(linearLayout2, w5.d(-1.0f, -2));
        y5.b(this.f51512s, 0.04f, 1.5f);
        y8Var.addView(this.f51512s, w5.a(52.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density, -2, 81));
        n5 y3 = n5.y(this.currentAccount, true);
        if (y3.f53149e && !y3.s().k()) {
            this.f51512s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f51511r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f51511r;
        ch.d c11 = this.M.c(frameLayout5, null, false);
        c11.o(eh.b.l(this.resourceProvider));
        c11.p(AndroidUtilities.dp(8.0f));
        c11.q(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        y8Var.addView(this.f51511r, w5.a(60.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density, -2, 81));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new gr(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i13));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = h6.v(getThemedColor(i10), h6.m1(0.1f, getThemedColor(i13)));
        textView4.setBackground(h6.j0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        this.f51511r.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51871b;

            {
                this.f51871b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f51871b.d;
                        u3Var.f51780k.clear();
                        u3Var.f51779j.clear();
                        u3Var.f51781l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f51871b.d;
                        u3Var2.f51780k.clear();
                        u3Var2.f51779j.clear();
                        u3Var2.f51781l.clear();
                        u3Var2.h();
                        return;
                }
            }
        });
        this.f51511r.addView(this.v, w5.d(-1.0f, -2));
        this.f51511r.setVisibility(8);
        y5.b(this.f51511r, 0.05f, 1.5f);
        l3 l3Var = new l3(context, this.resourceProvider);
        this.F = l3Var;
        l3Var.setSorting(this.d.f51785p);
        this.E.addView(this.F, w5.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51404b;

            {
                this.f51404b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f51404b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f51787r;
                            u3Var.f51787r = z10;
                            fqVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f51404b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            s80 H = s80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f51762a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f51762a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f51762a), new w2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final fq fqVar2 = fqVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f51787r) {
                                                u3Var3.f51787r = false;
                                                fqVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f51787r) {
                                                u3Var4.f51787r = true;
                                                fqVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f51787r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f51787r) {
                                                u3Var3.f51787r = false;
                                                fqVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f51787r) {
                                                u3Var4.f51787r = true;
                                                fqVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f51787r);
                            H.f30469t = false;
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
        this.E.addView(this.G, w5.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51750b;

            {
                this.f51750b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f51750b, context);
                        return;
                    case 1:
                        h4.X(this.f51750b, context);
                        return;
                    default:
                        h4.V(this.f51750b, context);
                        return;
                }
            }
        });
        l3 l3Var3 = new l3(context, this.resourceProvider);
        this.H = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, w5.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51750b;

            {
                this.f51750b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f51750b, context);
                        return;
                    case 1:
                        h4.X(this.f51750b, context);
                        return;
                    default:
                        h4.V(this.f51750b, context);
                        return;
                }
            }
        });
        l3 l3Var4 = new l3(context, this.resourceProvider);
        this.I = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, w5.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51750b;

            {
                this.f51750b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.W(this.f51750b, context);
                        return;
                    case 1:
                        h4.X(this.f51750b, context);
                        return;
                    default:
                        h4.V(this.f51750b, context);
                        return;
                }
            }
        });
        k10 k10Var = new k10(getParentActivity());
        this.J = k10Var;
        y8Var.addView(k10Var, w5.d(-1.0f, -1));
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
            this.f51515y.setVisibility(0);
            ViewPropertyAnimator animate = this.f51515y.animate();
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
            js jsVar = js.h;
            alpha.setInterpolator(jsVar).setDuration(420L).setListener(new b3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(jsVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f51510n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(jsVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f51515y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f51515y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f51515y;
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
        d3 d3Var = this.f51510n;
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
        h71 h71Var;
        u3 u3Var = this.d;
        int i10 = u3Var.f51775e;
        HashSet hashSet = u3Var.f51781l;
        ArrayList arrayList = u3Var.h;
        HashSet hashSet2 = u3Var.f51780k;
        ArrayList arrayList2 = u3Var.f51777g;
        HashSet hashSet3 = u3Var.f51779j;
        ArrayList arrayList3 = u3Var.f51776f;
        if (i10 > 12) {
            d0(true, true);
        }
        d3 d3Var = this.f51510n;
        boolean z11 = false;
        if (d3Var != null && (h71Var = d3Var.W2) != null) {
            h71Var.N(true);
            if (z10) {
                this.f51510n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f51507c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = u3Var.f51775e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        l3 l3Var = this.F;
        if (l3Var != null) {
            l3Var.setSorting(u3Var.f51785p);
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
            if (i12 >= this.f51510n.getChildCount()) {
                break;
            } else if (this.f51510n.getChildAt(i12) instanceof m10) {
                u3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((u3Var.f51789t || u3Var.f51775e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f51505a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = h6.x0(null, h6.f20560d6, false);
            if (this.actionBar.u()) {
                x02 = h6.x0(null, h6.f20913w8, false);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
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
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            this.f51512s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            s20.d(this.f51511r, f7);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
