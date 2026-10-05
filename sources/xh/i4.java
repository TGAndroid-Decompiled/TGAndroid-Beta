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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p81;
import org.telegram.ui.py0;
import org.telegram.ui.y8;
import w7.b6;
import w7.z5;
import yh.m7;
import yh.u5;
public class i4 extends org.telegram.ui.ActionBar.n2 implements le.d {
    public LinearLayout E;
    public m3 F;
    public m3 G;
    public m3 H;
    public m3 I;
    public u00 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final le.b f50024a;
    public final long f50025b;
    public final String f50026c;
    public final v3 d;
    public Utilities.Callback f50027e;
    public org.telegram.ui.ActionBar.g2 f50028f;
    public View h;
    public e3 f50029n;
    public FrameLayout f50030r;
    public FrameLayout f50031s;
    public TextView v;
    public n3 f50032w;
    public boolean f50033x;
    public HorizontalScrollView f50034y;

    public i4(long j3, String str, long j10, d6 d6Var) {
        super(null);
        this.f50024a = new le.b(0, this, tr.h, 380L, false);
        this.K = true;
        this.f50025b = j3;
        this.f50026c = str;
        this.resourceProvider = d6Var;
        v3 v3Var = new v3(j10, this.currentAccount, new ii.q1(this, 21));
        this.d = v3Var;
        v3Var.g(false);
    }

    public static void S(i4 i4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(i4Var.currentAccount).getClientUserId()) {
            i4Var.d.d.remove(tL_starGiftUnique);
            i4Var.e0(false);
            if (j3 == UserConfig.getInstance(i4Var.currentAccount).getClientUserId()) {
                yc a02 = yc.a0(i4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                rc O = a02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2)));
                O.f30435r = false;
                O.j();
            } else {
                rc O2 = yc.a0(i4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i4Var.currentAccount, j3)));
                O2.f30435r = false;
                O2.j();
            }
            i4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        d3 d3Var = new d3(bundle, tL_starGiftUnique, j3);
        c5 c5Var = i4Var.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).f20319b) {
            Dialog dialog = i4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.f3) && z10) {
                ((org.telegram.ui.ActionBar.f3) dialog).skipDismissAnimation();
            }
            i4Var.finishFragment();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(d3Var, false, z10);
            }
        } else {
            i4Var.presentFragment(d3Var, true, z10);
        }
        Utilities.Callback callback = i4Var.f50027e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void T(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (!i4Var.K || v3Var.h.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(i4Var, i4Var.I, false, false);
        b80Var.f24886t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.f24880p = new ii.h(b80Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new u2(i4Var, 0));
        e71 e71Var = new e71(i4Var, new v2(i4Var, strArr, arrayList, 0), new w2(i4Var, b80Var, 0), null);
        e71Var.f26034f3.f32531r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, i4Var.resourceProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourceProvider));
        euVar.setCursorColor(i6.v0(i6.G6, i4Var.resourceProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, i4Var.resourceProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, e71Var, false, 8));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.f50297l.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 0), false);
        }
        b80Var.q(e71Var);
        b80Var.Z();
    }

    public static void U(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (!i4Var.K || v3Var.f50292f.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(i4Var, i4Var.G, false, false);
        b80Var.f24886t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.f24880p = new ii.h(b80Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f50292f);
        Collections.sort(arrayList, new u2(i4Var, 2));
        e71 e71Var = new e71(i4Var, new v2(i4Var, strArr, arrayList, 2), new w2(i4Var, b80Var, 2), null);
        e71Var.f26034f3.f32531r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, i4Var.resourceProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourceProvider));
        euVar.setCursorColor(i6.v0(i6.G6, i4Var.resourceProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, i4Var.resourceProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, e71Var, false, 9));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.f50295j.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 2), false);
        }
        b80Var.q(e71Var);
        b80Var.Z();
    }

    public static void W(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (!i4Var.K || v3Var.f50293g.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(i4Var, i4Var.H, false, false);
        b80Var.f24886t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.f24880p = new ii.h(b80Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f50293g);
        Collections.sort(arrayList, new u2(i4Var, 1));
        e71 e71Var = new e71(i4Var, new v2(i4Var, strArr, arrayList, 1), new w2(i4Var, b80Var, 1), null);
        e71Var.f26034f3.f32531r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, i4Var.resourceProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourceProvider));
        euVar.setCursorColor(i6.v0(i6.G6, i4Var.resourceProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, i4Var.resourceProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, e71Var, false, 10));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.f50296k.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 1), false);
        }
        b80Var.q(e71Var);
        b80Var.Z();
    }

    public static void X(i4 i4Var, h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.y3 y3Var = new yh.y3(i4Var.getParentActivity(), i4Var.currentAccount, i4Var.f50025b, i4Var.resourceProvider, null);
            y3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, i4Var.d);
            y3Var.O0 = new z2(i4Var);
            i4Var.showDialog(y3Var);
        }
    }

    public static org.telegram.ui.ActionBar.k Y(i4 i4Var) {
        return i4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k Z(i4 i4Var) {
        return i4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k b0(i4 i4Var) {
        return i4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(i4 i4Var) {
        return i4Var.actionBar;
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            this.f50031s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            c20.d(this.f50030r, f7);
        }
    }

    @Override
    public final View createView(final Context context) {
        fh.c cVar = new fh.c();
        this.L = cVar;
        int i10 = i6.f20827d6;
        cVar.a(getThemedColor(i10));
        this.M = new ah.c(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f50028f = g2Var;
        kVar.setBackButtonDrawable(g2Var);
        this.f50028f.f20658k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 10));
        this.actionBar.setTitle(this.f50026c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = i6.G6;
        kVar2.A(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(i11), true);
        this.actionBar.z(getThemedColor(i6.f21235z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(i6.f21233z6));
        y8 y8Var = new y8(this, context, 8);
        int v = i6.v(i6.v0(i10, this.resourceProvider), i6.l1(0.04f, i6.v0(i11, this.resourceProvider)));
        y8Var.setBackgroundColor(v);
        this.fragmentView = y8Var;
        m7 m7Var = new m7(context, this.currentAccount, this.resourceProvider);
        m7Var.d = true;
        b6.a(m7Var);
        m7Var.setOnClickListener(new py0(25, this, m7Var));
        this.actionBar.addView(m7Var, z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? e71Var = new e71(this, new hi.a(this, 18), new z2(this), new z2(this));
        this.f50029n = e71Var;
        e71Var.f26034f3.f32531r = false;
        e71Var.setSpanCount(3);
        this.f50029n.j(new xb0(this, 17));
        this.f50029n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f50029n.setClipToPadding(false);
        y8Var.addView(this.f50029n, z5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        y8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final i4 f49891b;

            {
                this.f49891b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v3 v3Var = this.f49891b.d;
                        v3Var.f50296k.clear();
                        v3Var.f50295j.clear();
                        v3Var.f50297l.clear();
                        v3Var.h();
                        return;
                    default:
                        v3 v3Var2 = this.f49891b.d;
                        v3Var2.f50296k.clear();
                        v3Var2.f50295j.clear();
                        v3Var2.f50297l.clear();
                        v3Var2.h();
                        return;
                }
            }
        };
        d6 d6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout e7 = bi.e(context, 1);
        frameLayout.addView(e7, z5.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        e7.addView(w9Var, z5.q(130, 130, 17));
        TextView textView = new TextView(context);
        bi.m(i6.G6, d6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        e7.addView(textView, z5.t(-2, -2, 17, 32, 12, 32, 9));
        q90 q90Var = new q90(context, null);
        q90Var.setTextColor(i6.v0(i6.A6, d6Var));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setGravity(17);
        q90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        q90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        e7.addView(q90Var, z5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = i6.Oh;
        textView2.setTextColor(i6.v0(i12, d6Var));
        textView2.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i12, d6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.c1.d(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        b6.a(textView2);
        e7.addView(textView2, z5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f50032w = frameLayout;
        this.f50033x = false;
        frameLayout.setAlpha(0.0f);
        this.f50032w.setScaleX(0.95f);
        this.f50032w.setScaleY(0.95f);
        this.f50032w.setVisibility(8);
        y8Var.addView(this.f50032w, z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f50034y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f50034y.addView(this.E);
        this.f50034y.setBackgroundColor(v);
        this.f50034y.setClipChildren(false);
        y8Var.addView(this.f50034y, z5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(i6.f20828d7));
        this.h.setAlpha(0.0f);
        y8Var.addView(this.h, z5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final qp qpVar = new qp(context, 24, this.resourceProvider);
        qpVar.b(i6.f20901h7, i6.f20937j7, i6.f20957k7);
        qpVar.setDrawUnchecked(true);
        qpVar.a(false, false);
        qpVar.setDrawBackgroundAsArc(10);
        qpVar.setTranslationX(AndroidUtilities.dp(4.0f));
        qpVar.setScaleX(0.8f);
        qpVar.setScaleY(0.8f);
        linearLayout2.addView(qpVar, z5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        bi.m(i6.f20935j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, z5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = i6.Oh;
        int v9 = i6.v(themedColor, i6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(i6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50031s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f50031s;
        ch.d c10 = this.M.c(frameLayout3, null, false);
        c10.w(eh.b.l(this.resourceProvider));
        c10.x(AndroidUtilities.dp(8.0f));
        c10.y(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f50031s.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f49907b;

            {
                this.f49907b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        v3 v3Var = this.f49907b.d;
                        if (v3Var != null) {
                            boolean z10 = !v3Var.f50303r;
                            v3Var.f50303r = z10;
                            qpVar.a(z10, true);
                            v3Var.h();
                            return;
                        }
                        return;
                    default:
                        final i4 i4Var = this.f49907b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            b80 H = b80.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f50263a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f50263a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f50263a), new x2(i4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final qp qpVar2 = qpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f50303r) {
                                                v3Var3.f50303r = false;
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f50303r) {
                                                v3Var4.f50303r = true;
                                                qpVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !v3Var2.f50303r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f50303r) {
                                                v3Var3.f50303r = false;
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f50303r) {
                                                v3Var4.f50303r = true;
                                                qpVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), v3Var2.f50303r);
                            H.f24886t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f50031s.addView(linearLayout2, z5.c(-1.0f, -2));
        b6.b(this.f50031s, 0.04f, 1.5f);
        y8Var.addView(this.f50031s, z5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        u5 y3 = u5.y(this.currentAccount, true);
        if (y3.f52088e && !y3.s().k()) {
            this.f50031s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f50030r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f50030r;
        ch.d c11 = this.M.c(frameLayout5, null, false);
        c11.w(eh.b.l(this.resourceProvider));
        c11.x(AndroidUtilities.dp(8.0f));
        c11.y(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        y8Var.addView(this.f50030r, z5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new rq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i13));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = i6.v(getThemedColor(i10), i6.l1(0.1f, getThemedColor(i13)));
        textView4.setBackground(i6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        this.f50030r.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f49891b;

            {
                this.f49891b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        v3 v3Var = this.f49891b.d;
                        v3Var.f50296k.clear();
                        v3Var.f50295j.clear();
                        v3Var.f50297l.clear();
                        v3Var.h();
                        return;
                    default:
                        v3 v3Var2 = this.f49891b.d;
                        v3Var2.f50296k.clear();
                        v3Var2.f50295j.clear();
                        v3Var2.f50297l.clear();
                        v3Var2.h();
                        return;
                }
            }
        });
        this.f50030r.addView(this.v, z5.c(-1.0f, -2));
        this.f50030r.setVisibility(8);
        b6.b(this.f50030r, 0.05f, 1.5f);
        m3 m3Var = new m3(context, this.resourceProvider);
        this.F = m3Var;
        m3Var.setSorting(this.d.f50301p);
        this.E.addView(this.F, z5.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f49907b;

            {
                this.f49907b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        v3 v3Var = this.f49907b.d;
                        if (v3Var != null) {
                            boolean z10 = !v3Var.f50303r;
                            v3Var.f50303r = z10;
                            qpVar.a(z10, true);
                            v3Var.h();
                            return;
                        }
                        return;
                    default:
                        final i4 i4Var = this.f49907b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            b80 H = b80.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f50263a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f50263a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f50263a), new x2(i4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final qp qpVar2 = qpVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f50303r) {
                                                v3Var3.f50303r = false;
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f50303r) {
                                                v3Var4.f50303r = true;
                                                qpVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !v3Var2.f50303r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f50303r) {
                                                v3Var3.f50303r = false;
                                                qpVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f50303r) {
                                                v3Var4.f50303r = true;
                                                qpVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), v3Var2.f50303r);
                            H.f24886t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        m3 m3Var2 = new m3(context, this.resourceProvider);
        this.G = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.E.addView(this.G, z5.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f50248b;

            {
                this.f50248b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i4.U(this.f50248b, context);
                        return;
                    case 1:
                        i4.W(this.f50248b, context);
                        return;
                    default:
                        i4.T(this.f50248b, context);
                        return;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourceProvider);
        this.H = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, z5.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f50248b;

            {
                this.f50248b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i4.U(this.f50248b, context);
                        return;
                    case 1:
                        i4.W(this.f50248b, context);
                        return;
                    default:
                        i4.T(this.f50248b, context);
                        return;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourceProvider);
        this.I = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, z5.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f50248b;

            {
                this.f50248b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i4.U(this.f50248b, context);
                        return;
                    case 1:
                        i4.W(this.f50248b, context);
                        return;
                    default:
                        i4.T(this.f50248b, context);
                        return;
                }
            }
        });
        u00 u00Var = new u00(getParentActivity());
        this.J = u00Var;
        y8Var.addView(u00Var, z5.c(-1.0f, -1));
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
            this.f50034y.setVisibility(0);
            ViewPropertyAnimator animate = this.f50034y.animate();
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
            tr trVar = tr.h;
            alpha.setInterpolator(trVar).setDuration(420L).setListener(new c3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(trVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f50029n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(trVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f50034y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f50034y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f50034y;
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
        e3 e3Var = this.f50029n;
        if (!z10) {
            f14 = -AndroidUtilities.dp(39.0f);
        }
        e3Var.setTranslationY(f14);
    }

    public final void e0(boolean z10) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        w61 w61Var;
        v3 v3Var = this.d;
        int i10 = v3Var.f50291e;
        HashSet hashSet = v3Var.f50297l;
        ArrayList arrayList = v3Var.h;
        HashSet hashSet2 = v3Var.f50296k;
        ArrayList arrayList2 = v3Var.f50293g;
        HashSet hashSet3 = v3Var.f50295j;
        ArrayList arrayList3 = v3Var.f50292f;
        if (i10 > 12) {
            d0(true, true);
        }
        e3 e3Var = this.f50029n;
        boolean z11 = false;
        if (e3Var != null && (w61Var = e3Var.f26034f3) != null) {
            w61Var.N(true);
            if (z10) {
                this.f50029n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f50026c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = v3Var.f50291e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        m3 m3Var = this.F;
        if (m3Var != null) {
            m3Var.setSorting(v3Var.f50301p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            m3 m3Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                string3 = LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size);
            } else {
                string3 = LocaleController.getString(R.string.Gift2ResaleFilterModel);
            }
            m3Var2.setValue(string3);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            m3 m3Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                string2 = LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2);
            } else {
                string2 = LocaleController.getString(R.string.Gift2ResaleFilterBackdrop);
            }
            m3Var3.setValue(string2);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            m3 m3Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                string = LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3);
            } else {
                string = LocaleController.getString(R.string.Gift2ResaleFilterSymbol);
            }
            m3Var4.setValue(string);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f50029n.getChildCount()) {
                break;
            } else if (this.f50029n.getChildAt(i12) instanceof w00) {
                v3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((v3Var.f50305t || v3Var.f50291e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f50024a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = i6.w0(null, i6.f20827d6, false);
            if (this.actionBar.s()) {
                w02 = i6.w0(null, i6.f21182w8, false);
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
    public final void V(float f7, int i10) {
    }
}
