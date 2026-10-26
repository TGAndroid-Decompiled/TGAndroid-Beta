package zh;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.h7;
import bi.rc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a9;
import org.telegram.ui.p11;
public class h4 extends org.telegram.ui.ActionBar.r2 implements oe.d {
    public LinearLayout E;
    public l3 F;
    public l3 G;
    public l3 H;
    public l3 I;
    public z00 J;
    public boolean K;
    public int L;
    public int M;
    public LinearLayout N;
    public hh.c O;
    public ch.b P;
    public final oe.b f53027a;
    public final long f53028b;
    public final String f53029c;
    public final u3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.j2 f53030f;
    public View h;
    public d3 f53031n;
    public FrameLayout f53032r;
    public FrameLayout f53033s;
    public TextView v;
    public m3 f53034w;
    public boolean f53035x;
    public HorizontalScrollView f53036y;

    public h4(long j10, String str, long j11, u6 u6Var) {
        super(null);
        this.f53027a = new oe.b(0, this, ds.h, 380L, false);
        this.K = true;
        this.f53028b = j10;
        this.f53029c = str;
        this.resourceProvider = u6Var;
        u3 u3Var = new u3(j11, this.currentAccount, new l1(this, 1));
        this.d = u3Var;
        u3Var.g(false);
    }

    public static void V(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        if (j10 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
            h4Var.d.d.remove(tL_starGiftUnique);
            h4Var.f0(false);
            if (j10 == UserConfig.getInstance(h4Var.currentAccount).getClientUserId()) {
                wc b02 = wc.b0(h4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                qc O = b02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2)));
                O.f31898s = false;
                O.j();
            } else {
                qc O2 = wc.b0(h4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(h4Var.currentAccount, j10)));
                O2.f31898s = false;
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
        c3 c3Var = new c3(bundle, tL_starGiftUnique, j10);
        j5 j5Var = h4Var.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).f22306b) {
            Dialog dialog = h4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.k3) && z10) {
                ((org.telegram.ui.ActionBar.k3) dialog).skipDismissAnimation();
            }
            h4Var.finishFragment();
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
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

    public static void W(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.h.isEmpty()) {
            return;
        }
        k80 k80Var = new k80(h4Var, h4Var.I, false, false);
        k80Var.f29869t = false;
        k80Var.Y = true;
        k80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        k80Var.R = true;
        k80Var.f29863p = new li.h(k80Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new t2(h4Var, 0));
        r71 r71Var = new r71(h4Var, new u2(h4Var, strArr, arrayList, 0), new v2(h4Var, k80Var, 0), null);
        r71Var.f32152g3.f29507r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        f7.t(imageView, y6.F8, h4Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ju juVar = new ju(context, h4Var.resourceProvider);
        juVar.setTextSize(1, 16.0f);
        juVar.setInputType(573441);
        juVar.setRawInputType(573441);
        f7.E(juVar, y6.A6, h4Var.resourceProvider);
        f7.m(juVar, 30, y6.G6, h4Var.resourceProvider);
        juVar.setCursorSize(AndroidUtilities.dp(19.0f));
        juVar.setCursorWidth(1.5f);
        juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        f7.V(juVar, y6.E8, h4Var.resourceProvider);
        juVar.setBackground(null);
        frameLayout.addView(juVar, gb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        juVar.addTextChangedListener(new bo(strArr, r71Var, false, 8));
        if (arrayList.size() > 8) {
            k80Var.r(frameLayout, gb1.r(-1, 44));
            k80Var.k();
        }
        if (!u3Var.f53273l.isEmpty()) {
            k80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 0), false);
        }
        k80Var.q(r71Var);
        k80Var.Z();
    }

    public static void X(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f53268f.isEmpty()) {
            return;
        }
        k80 k80Var = new k80(h4Var, h4Var.G, false, false);
        k80Var.f29869t = false;
        k80Var.Y = true;
        k80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        k80Var.R = true;
        k80Var.f29863p = new li.h(k80Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f53268f);
        Collections.sort(arrayList, new t2(h4Var, 2));
        r71 r71Var = new r71(h4Var, new u2(h4Var, strArr, arrayList, 2), new v2(h4Var, k80Var, 2), null);
        r71Var.f32152g3.f29507r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        f7.t(imageView, y6.F8, h4Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ju juVar = new ju(context, h4Var.resourceProvider);
        juVar.setTextSize(1, 16.0f);
        juVar.setInputType(573441);
        juVar.setRawInputType(573441);
        f7.E(juVar, y6.A6, h4Var.resourceProvider);
        f7.m(juVar, 30, y6.G6, h4Var.resourceProvider);
        juVar.setCursorSize(AndroidUtilities.dp(19.0f));
        juVar.setCursorWidth(1.5f);
        juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        f7.V(juVar, y6.E8, h4Var.resourceProvider);
        juVar.setBackground(null);
        frameLayout.addView(juVar, gb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        juVar.addTextChangedListener(new bo(strArr, r71Var, false, 9));
        if (arrayList.size() > 8) {
            k80Var.r(frameLayout, gb1.r(-1, 44));
            k80Var.k();
        }
        if (!u3Var.f53271j.isEmpty()) {
            k80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 2), false);
        }
        k80Var.q(r71Var);
        k80Var.Z();
    }

    public static void Y(h4 h4Var, Context context) {
        u3 u3Var = h4Var.d;
        if (!h4Var.K || u3Var.f53269g.isEmpty()) {
            return;
        }
        k80 k80Var = new k80(h4Var, h4Var.H, false, false);
        k80Var.f29869t = false;
        k80Var.Y = true;
        k80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        k80Var.R = true;
        k80Var.f29863p = new li.h(k80Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f53269g);
        Collections.sort(arrayList, new t2(h4Var, 1));
        r71 r71Var = new r71(h4Var, new u2(h4Var, strArr, arrayList, 1), new v2(h4Var, k80Var, 1), null);
        r71Var.f32152g3.f29507r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        f7.t(imageView, y6.F8, h4Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ju juVar = new ju(context, h4Var.resourceProvider);
        juVar.setTextSize(1, 16.0f);
        juVar.setInputType(573441);
        juVar.setRawInputType(573441);
        f7.E(juVar, y6.A6, h4Var.resourceProvider);
        f7.m(juVar, 30, y6.G6, h4Var.resourceProvider);
        juVar.setCursorSize(AndroidUtilities.dp(19.0f));
        juVar.setCursorWidth(1.5f);
        juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        f7.V(juVar, y6.E8, h4Var.resourceProvider);
        juVar.setBackground(null);
        frameLayout.addView(juVar, gb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        juVar.addTextChangedListener(new bo(strArr, r71Var, false, 10));
        if (arrayList.size() > 8) {
            k80Var.r(frameLayout, gb1.r(-1, 44));
            k80Var.k();
        }
        if (!u3Var.f53272k.isEmpty()) {
            k80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w2(h4Var, 1), false);
        }
        k80Var.q(r71Var);
        k80Var.Z();
    }

    public static void Z(h4 h4Var, t61 t61Var) {
        Object obj = t61Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            h7 h7Var = new h7(h4Var.getParentActivity(), h4Var.currentAccount, h4Var.f53028b, h4Var.resourceProvider, null);
            h7Var.J2(tL_starGiftUnique.slug, tL_starGiftUnique, h4Var.d);
            h7Var.R0 = new y2(h4Var);
            h4Var.showDialog(h7Var);
        }
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

    public static org.telegram.ui.ActionBar.k d0(h4 h4Var) {
        return h4Var.actionBar;
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            this.f53033s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            j20.d(this.f53032r, f7);
        }
    }

    @Override
    public final View createView(final Context context) {
        hh.c cVar = new hh.c();
        this.O = cVar;
        int i10 = y6.f23356d6;
        cVar.a(getThemedColor(i10));
        this.P = new ch.b(this.O);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.f53030f = j2Var;
        kVar.setBackButtonDrawable(j2Var);
        this.f53030f.f22738k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new p11(this, 18));
        this.actionBar.setTitle(this.f53029c);
        f7.i(i10, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = y6.G6;
        f7.m(kVar2, 1, i11, getResourceProvider());
        f7.b(this.actionBar, i11, getResourceProvider(), true);
        f7.m(this.actionBar, 3, y6.f23769z8, getResourceProvider());
        f7.m(this.actionBar, 5, i11, getResourceProvider());
        f7.c(this.actionBar, y6.f23767z6, getResourceProvider());
        a9 a9Var = new a9(this, context, 8);
        int v = y6.v(y6.w0(i10, this.resourceProvider), y6.o1(0.04f, y6.w0(i11, this.resourceProvider)));
        a9Var.setBackgroundColor(v);
        this.L = v;
        this.fragmentView = a9Var;
        rc rcVar = new rc(context, this.currentAccount, this.resourceProvider);
        rcVar.d = true;
        gb1.b(rcVar);
        rcVar.setOnClickListener(new org.telegram.ui.web.c(13, this, rcVar));
        this.actionBar.addView(rcVar, gb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? r71Var = new r71(this, new q0(this, 2), new y2(this), new y2(this));
        this.f53031n = r71Var;
        r71Var.f32152g3.f29507r = false;
        r71Var.setSpanCount(3);
        this.f53031n.j(new ml(this, 28));
        this.f53031n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f53031n.setClipToPadding(false);
        a9Var.addView(this.f53031n, gb1.h(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        a9Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h4 f53368b;

            {
                this.f53368b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f53368b.d;
                        u3Var.f53272k.clear();
                        u3Var.f53271j.clear();
                        u3Var.f53273l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f53368b.d;
                        u3Var2.f53272k.clear();
                        u3Var2.f53271j.clear();
                        u3Var2.f53273l.clear();
                        u3Var2.h();
                        return;
                }
            }
        };
        u6 u6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout d = vh.d(context, 1);
        frameLayout.addView(d, gb1.i(-1, -2, 23));
        y9 y9Var = new y9(context);
        y9Var.setImageDrawable(new xj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        d.addView(y9Var, gb1.u(130, 130, 17));
        TextView textView = new TextView(context);
        f7.V(textView, y6.G6, u6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        d.addView(textView, gb1.x(-2, -2, 17, 32, 12, 32, 9));
        z90 z90Var = new z90(context, null);
        f7.V(z90Var, y6.A6, u6Var);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setGravity(17);
        z90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        z90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        d.addView(z90Var, gb1.x(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = y6.Oh;
        f7.V(textView2, i12, u6Var);
        org.telegram.ui.Cells.y Z = y6.Z(y6.o1(0.1f, y6.w0(i12, u6Var)), 6, 6);
        b7 L = f7.L(0.1f, i12);
        textView2.setBackground(Z);
        f7.k(textView2, Z, null, L, u6Var);
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.d3.h(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        gb1.b(textView2);
        d.addView(textView2, gb1.x(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f53034w = frameLayout;
        this.f53035x = false;
        frameLayout.setAlpha(0.0f);
        this.f53034w.setScaleX(0.95f);
        this.f53034w.setScaleY(0.95f);
        this.f53034w.setVisibility(8);
        a9Var.addView(this.f53034w, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f53036y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f53036y.addView(this.E);
        this.f53036y.setBackgroundColor(v);
        this.f53036y.setClipChildren(false);
        a9Var.addView(this.f53036y, gb1.i(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        f7.i(y6.f23357d7, view, getResourceProvider());
        this.h.setAlpha(0.0f);
        a9Var.addView(this.h, gb1.e(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final zp zpVar = new zp(context, 24, this.resourceProvider);
        zpVar.b(y6.f23429h7, y6.f23466j7, y6.f23485k7);
        zpVar.setDrawUnchecked(true);
        zpVar.a(false, false);
        zpVar.setDrawBackgroundAsArc(10);
        zpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        zpVar.setScaleX(0.8f);
        zpVar.setScaleY(0.8f);
        linearLayout2.addView(zpVar, gb1.u(26, 26, 16));
        TextView textView3 = new TextView(context);
        f7.V(textView3, y6.f23464j5, this.resourceProvider);
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, gb1.x(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = y6.Oh;
        int v10 = y6.v(themedColor, y6.o1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(y6.j0(dp, dp, dp, dp, 0, v10, v10));
        this.N = linearLayout2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f53033s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f53033s;
        eh.d c10 = this.P.c(frameLayout3, null, false);
        c10.v(gh.c.l(this.resourceProvider));
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f53033s.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f52898b;

            {
                this.f52898b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f52898b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f53279r;
                            u3Var.f53279r = z10;
                            zpVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f52898b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            k80 H = k80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f53256a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f53256a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f53256a), new w2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final zp zpVar2 = zpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f53279r) {
                                                u3Var3.f53279r = false;
                                                zpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f53279r) {
                                                u3Var4.f53279r = true;
                                                zpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f53279r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f53279r) {
                                                u3Var3.f53279r = false;
                                                zpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f53279r) {
                                                u3Var4.f53279r = true;
                                                zpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f53279r);
                            H.f29869t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f53033s.addView(linearLayout2, gb1.g(-1.0f, -2));
        gb1.c(this.f53033s, 0.04f, 1.5f);
        a9Var.addView(this.f53033s, gb1.h(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        ca y3 = ca.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.f53033s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f53032r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f53032r;
        eh.d c11 = this.P.c(frameLayout5, null, false);
        c11.v(gh.c.l(this.resourceProvider));
        c11.w(AndroidUtilities.dp(8.0f));
        c11.x(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        a9Var.addView(this.f53032r, gb1.h(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new zq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        f7.V(this.v, i13, getResourceProvider());
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v11 = y6.v(getThemedColor(i10), y6.o1(0.1f, getThemedColor(i13)));
        textView4.setBackground(y6.j0(dp2, dp2, dp2, dp2, 0, v11, v11));
        this.v.setGravity(17);
        this.f53032r.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f53368b;

            {
                this.f53368b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u3 u3Var = this.f53368b.d;
                        u3Var.f53272k.clear();
                        u3Var.f53271j.clear();
                        u3Var.f53273l.clear();
                        u3Var.h();
                        return;
                    default:
                        u3 u3Var2 = this.f53368b.d;
                        u3Var2.f53272k.clear();
                        u3Var2.f53271j.clear();
                        u3Var2.f53273l.clear();
                        u3Var2.h();
                        return;
                }
            }
        });
        this.f53032r.addView(this.v, gb1.g(-1.0f, -2));
        this.f53032r.setVisibility(8);
        gb1.c(this.f53032r, 0.05f, 1.5f);
        l3 l3Var = new l3(context, this.resourceProvider);
        this.F = l3Var;
        l3Var.setSorting(this.d.f53277p);
        this.E.addView(this.F, gb1.x(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f52898b;

            {
                this.f52898b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        u3 u3Var = this.f52898b.d;
                        if (u3Var != null) {
                            boolean z10 = !u3Var.f53279r;
                            u3Var.f53279r = z10;
                            zpVar.a(z10, true);
                            u3Var.h();
                            return;
                        }
                        return;
                    default:
                        final h4 h4Var = this.f52898b;
                        u3 u3Var2 = h4Var.d;
                        if (h4Var.K) {
                            k80 H = k80.H(h4Var, h4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f53256a), new w2(h4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f53256a), new w2(h4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f53256a), new w2(h4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final zp zpVar2 = zpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f53279r) {
                                                u3Var3.f53279r = false;
                                                zpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f53279r) {
                                                u3Var4.f53279r = true;
                                                zpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !u3Var2.f53279r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            u3 u3Var3 = h4Var.d;
                                            if (u3Var3.f53279r) {
                                                u3Var3.f53279r = false;
                                                zpVar2.a(false, true);
                                                u3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            u3 u3Var4 = h4Var.d;
                                            if (!u3Var4.f53279r) {
                                                u3Var4.f53279r = true;
                                                zpVar2.a(true, true);
                                                u3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), u3Var2.f53279r);
                            H.f29869t = false;
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
        this.E.addView(this.G, gb1.x(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f53246b;

            {
                this.f53246b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.X(this.f53246b, context);
                        return;
                    case 1:
                        h4.Y(this.f53246b, context);
                        return;
                    default:
                        h4.W(this.f53246b, context);
                        return;
                }
            }
        });
        l3 l3Var3 = new l3(context, this.resourceProvider);
        this.H = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, gb1.x(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f53246b;

            {
                this.f53246b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.X(this.f53246b, context);
                        return;
                    case 1:
                        h4.Y(this.f53246b, context);
                        return;
                    default:
                        h4.W(this.f53246b, context);
                        return;
                }
            }
        });
        l3 l3Var4 = new l3(context, this.resourceProvider);
        this.I = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, gb1.x(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f53246b;

            {
                this.f53246b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h4.X(this.f53246b, context);
                        return;
                    case 1:
                        h4.Y(this.f53246b, context);
                        return;
                    default:
                        h4.W(this.f53246b, context);
                        return;
                }
            }
        });
        z00 z00Var = new z00(getParentActivity());
        this.J = z00Var;
        a9Var.addView(z00Var, gb1.g(-1.0f, -1));
        e0(false, false);
        return a9Var;
    }

    public final void e0(boolean z10, boolean z11) {
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
            this.f53036y.setVisibility(0);
            ViewPropertyAnimator animate = this.f53036y.animate();
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
            ds dsVar = ds.h;
            alpha.setInterpolator(dsVar).setDuration(420L).setListener(new b3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(dsVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f53031n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(dsVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f53036y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f53036y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f53036y;
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
        d3 d3Var = this.f53031n;
        if (!z10) {
            f14 = -AndroidUtilities.dp(39.0f);
        }
        d3Var.setTranslationY(f14);
    }

    public final void f0(boolean z10) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        j71 j71Var;
        u3 u3Var = this.d;
        int i10 = u3Var.e;
        HashSet hashSet = u3Var.f53273l;
        ArrayList arrayList = u3Var.h;
        HashSet hashSet2 = u3Var.f53272k;
        ArrayList arrayList2 = u3Var.f53269g;
        HashSet hashSet3 = u3Var.f53271j;
        ArrayList arrayList3 = u3Var.f53268f;
        if (i10 > 12) {
            e0(true, true);
        }
        d3 d3Var = this.f53031n;
        boolean z11 = false;
        if (d3Var != null && (j71Var = d3Var.f32152g3) != null) {
            j71Var.O(true);
            if (z10) {
                this.f53031n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f53029c);
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
            l3Var.setSorting(u3Var.f53277p);
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
            if (i12 >= this.f53031n.getChildCount()) {
                break;
            } else if (this.f53031n.getChildAt(i12) instanceof c10) {
                u3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((u3Var.f53281t || u3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f53027a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = y6.x0(null, y6.f23356d6, false);
            if (this.actionBar.q()) {
                x02 = y6.x0(null, y6.f23713w8, false);
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
    public final void onThemeColorsChanged() {
        boolean z10;
        boolean z11 = true;
        try {
            super.onThemeColorsChanged();
            hh.c cVar = this.O;
            int i10 = y6.f23356d6;
            cVar.a(getThemedColor(i10));
            int v = y6.v(getThemedColor(i10), y6.o1(0.1f, getThemedColor(y6.Oh)));
            if (v != this.M) {
                this.M = v;
                TextView textView = this.v;
                if (textView != null) {
                    y6.E1(textView.getBackground(), v, true);
                }
                LinearLayout linearLayout = this.N;
                if (linearLayout != null) {
                    y6.E1(linearLayout.getBackground(), v, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int v10 = y6.v(y6.w0(y6.f23356d6, this.resourceProvider), y6.o1(0.04f, y6.w0(y6.G6, this.resourceProvider)));
            int i11 = this.L;
            if (v10 != i11) {
                HorizontalScrollView horizontalScrollView = this.f53036y;
                if (horizontalScrollView != null && (horizontalScrollView.getBackground() instanceof ColorDrawable) && ((ColorDrawable) horizontalScrollView.getBackground()).getColor() == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f53036y.setBackgroundColor(v10);
                }
                View view = this.fragmentView;
                int i12 = this.L;
                if (view == null || !(view.getBackground() instanceof ColorDrawable) || ((ColorDrawable) view.getBackground()).getColor() != i12) {
                    z11 = false;
                }
                if (z11) {
                    this.fragmentView.setBackgroundColor(v10);
                }
                this.L = v10;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
