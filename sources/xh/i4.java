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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f81;
import org.telegram.ui.ny0;
import org.telegram.ui.w8;
import w7.a6;
import w7.y5;
import yh.k7;
import yh.s5;
public class i4 extends org.telegram.ui.ActionBar.m2 implements le.e {
    public LinearLayout E;
    public m3 F;
    public m3 G;
    public m3 H;
    public m3 I;
    public t00 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final le.c f46180a;
    public final long f46181b;
    public final String f46182c;
    public final v3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.f2 f46183f;
    public View h;
    public e3 f46184n;
    public FrameLayout f46185r;
    public FrameLayout f46186s;
    public TextView v;
    public n3 f46187w;
    public boolean f46188x;
    public HorizontalScrollView f46189y;

    public i4(long j3, String str, long j10, d6 d6Var) {
        super(null);
        this.f46180a = new le.c(0, this, sr.h, 380L, false);
        this.K = true;
        this.f46181b = j3;
        this.f46182c = str;
        this.resourceProvider = d6Var;
        v3 v3Var = new v3(j10, this.currentAccount, new ii.q1(this, 21));
        this.d = v3Var;
        v3Var.g(false);
    }

    public static void U(i4 i4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(i4Var.currentAccount).getClientUserId()) {
            i4Var.d.d.remove(tL_starGiftUnique);
            i4Var.e0(false);
            if (j3 == UserConfig.getInstance(i4Var.currentAccount).getClientUserId()) {
                xc a02 = xc.a0(i4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                qc O = a02.O(document, string, LocaleController.formatString(i10, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2)));
                O.f27643r = false;
                O.j();
            } else {
                qc O2 = xc.a0(i4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i4Var.currentAccount, j3)));
                O2.f27643r = false;
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
        b5 b5Var = i4Var.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).f18605b) {
            Dialog dialog = i4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.e3) && z10) {
                ((org.telegram.ui.ActionBar.e3) dialog).skipDismissAnimation();
            }
            i4Var.finishFragment();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(d3Var, false, z10);
            }
        } else {
            i4Var.presentFragment(d3Var, true, z10);
        }
        Utilities.Callback callback = i4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (!i4Var.K || v3Var.h.isEmpty()) {
            return;
        }
        z70 z70Var = new z70(i4Var, i4Var.I, false, false);
        z70Var.f30840t = false;
        z70Var.Y = true;
        z70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        z70Var.R = true;
        z70Var.f30834p = new ii.h(z70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new u2(i4Var, 0));
        s61 s61Var = new s61(i4Var, new v2(i4Var, strArr, arrayList, 0), new w2(i4Var, z70Var, 0), null);
        s61Var.Y2.f25644r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, i4Var.resourceProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(h6.v0(h6.A6, i4Var.resourceProvider));
        duVar.setCursorColor(h6.v0(h6.G6, i4Var.resourceProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(h6.v0(h6.E8, i4Var.resourceProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, s61Var, false, 8));
        if (arrayList.size() > 8) {
            z70Var.r(frameLayout, y5.n(-1, 44));
            z70Var.k();
        }
        if (!v3Var.f46457l.isEmpty()) {
            z70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 0), false);
        }
        z70Var.q(s61Var);
        z70Var.Z();
    }

    public static void W(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (!i4Var.K || v3Var.f46452f.isEmpty()) {
            return;
        }
        z70 z70Var = new z70(i4Var, i4Var.G, false, false);
        z70Var.f30840t = false;
        z70Var.Y = true;
        z70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        z70Var.R = true;
        z70Var.f30834p = new ii.h(z70Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f46452f);
        Collections.sort(arrayList, new u2(i4Var, 2));
        s61 s61Var = new s61(i4Var, new v2(i4Var, strArr, arrayList, 2), new w2(i4Var, z70Var, 2), null);
        s61Var.Y2.f25644r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, i4Var.resourceProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(h6.v0(h6.A6, i4Var.resourceProvider));
        duVar.setCursorColor(h6.v0(h6.G6, i4Var.resourceProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(h6.v0(h6.E8, i4Var.resourceProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, s61Var, false, 9));
        if (arrayList.size() > 8) {
            z70Var.r(frameLayout, y5.n(-1, 44));
            z70Var.k();
        }
        if (!v3Var.f46455j.isEmpty()) {
            z70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 2), false);
        }
        z70Var.q(s61Var);
        z70Var.Z();
    }

    public static void X(i4 i4Var, Context context) {
        v3 v3Var = i4Var.d;
        if (!i4Var.K || v3Var.f46453g.isEmpty()) {
            return;
        }
        z70 z70Var = new z70(i4Var, i4Var.H, false, false);
        z70Var.f30840t = false;
        z70Var.Y = true;
        z70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        z70Var.R = true;
        z70Var.f30834p = new ii.h(z70Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f46453g);
        Collections.sort(arrayList, new u2(i4Var, 1));
        s61 s61Var = new s61(i4Var, new v2(i4Var, strArr, arrayList, 1), new w2(i4Var, z70Var, 1), null);
        s61Var.Y2.f25644r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, i4Var.resourceProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(h6.v0(h6.A6, i4Var.resourceProvider));
        duVar.setCursorColor(h6.v0(h6.G6, i4Var.resourceProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(h6.v0(h6.E8, i4Var.resourceProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, s61Var, false, 10));
        if (arrayList.size() > 8) {
            z70Var.r(frameLayout, y5.n(-1, 44));
            z70Var.k();
        }
        if (!v3Var.f46456k.isEmpty()) {
            z70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x2(i4Var, 1), false);
        }
        z70Var.q(s61Var);
        z70Var.Z();
    }

    public static void Y(i4 i4Var, w51 w51Var) {
        Object obj = w51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.x3 x3Var = new yh.x3(i4Var.getParentActivity(), i4Var.currentAccount, i4Var.f46181b, i4Var.resourceProvider, null);
            x3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, i4Var.d);
            x3Var.O0 = new z2(i4Var);
            i4Var.showDialog(x3Var);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(i4 i4Var) {
        return i4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(i4 i4Var) {
        return i4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k b0(i4 i4Var) {
        return i4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(i4 i4Var) {
        return i4Var.actionBar;
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            this.f46186s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            a20.d(this.f46185r, f7);
        }
    }

    @Override
    public final View createView(final Context context) {
        fh.c cVar = new fh.c();
        this.L = cVar;
        int i10 = h6.f19059d6;
        cVar.a(getThemedColor(i10));
        this.M = new ah.c(this.L);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f46183f = f2Var;
        kVar.setBackButtonDrawable(f2Var);
        this.f46183f.f18875k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new f81(this, 11));
        this.actionBar.setTitle(this.f46182c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = h6.G6;
        kVar2.B(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(i11), true);
        this.actionBar.A(getThemedColor(h6.f19463z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(h6.f19461z6));
        w8 w8Var = new w8(this, context, 9);
        int v = h6.v(h6.v0(i10, this.resourceProvider), h6.l1(0.04f, h6.v0(i11, this.resourceProvider)));
        w8Var.setBackgroundColor(v);
        this.fragmentView = w8Var;
        k7 k7Var = new k7(context, this.currentAccount, this.resourceProvider);
        k7Var.d = true;
        a6.a(k7Var);
        k7Var.setOnClickListener(new ny0(25, this, k7Var));
        this.actionBar.addView(k7Var, y5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? s61Var = new s61(this, new hi.a(this, 18), new z2(this), new z2(this));
        this.f46184n = s61Var;
        s61Var.Y2.f25644r = false;
        s61Var.setSpanCount(3);
        this.f46184n.j(new vg0(this, 15));
        this.f46184n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f46184n.setClipToPadding(false);
        w8Var.addView(this.f46184n, y5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        w8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final i4 f46072b;

            {
                this.f46072b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v3 v3Var = this.f46072b.d;
                        v3Var.f46456k.clear();
                        v3Var.f46455j.clear();
                        v3Var.f46457l.clear();
                        v3Var.h();
                        return;
                    default:
                        v3 v3Var2 = this.f46072b.d;
                        v3Var2.f46456k.clear();
                        v3Var2.f46455j.clear();
                        v3Var2.f46457l.clear();
                        v3Var2.h();
                        return;
                }
            }
        };
        d6 d6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout f7 = ok.f(context, 1);
        frameLayout.addView(f7, y5.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new jj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(w9Var, y5.q(130, 130, 17));
        TextView textView = new TextView(context);
        ok.n(h6.G6, d6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, y5.t(-2, -2, 17, 32, 12, 32, 9));
        o90 o90Var = new o90(context, null);
        o90Var.setTextColor(h6.v0(h6.A6, d6Var));
        o90Var.setTextSize(1, 14.0f);
        o90Var.setGravity(17);
        o90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        o90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(o90Var, y5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = h6.Oh;
        textView2.setTextColor(h6.v0(i12, d6Var));
        textView2.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i12, d6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.c1.c(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        a6.a(textView2);
        f7.addView(textView2, y5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f46187w = frameLayout;
        this.f46188x = false;
        frameLayout.setAlpha(0.0f);
        this.f46187w.setScaleX(0.95f);
        this.f46187w.setScaleY(0.95f);
        this.f46187w.setVisibility(8);
        w8Var.addView(this.f46187w, y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f46189y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f46189y.addView(this.E);
        this.f46189y.setBackgroundColor(v);
        this.f46189y.setClipChildren(false);
        w8Var.addView(this.f46189y, y5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(h6.f19060d7));
        this.h.setAlpha(0.0f);
        w8Var.addView(this.h, y5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final pp ppVar = new pp(context, 24, this.resourceProvider);
        ppVar.b(h6.f19131h7, h6.f19167j7, h6.f19187k7);
        ppVar.setDrawUnchecked(true);
        ppVar.a(false, false);
        ppVar.setDrawBackgroundAsArc(10);
        ppVar.setTranslationX(AndroidUtilities.dp(4.0f));
        ppVar.setScaleX(0.8f);
        ppVar.setScaleY(0.8f);
        linearLayout2.addView(ppVar, y5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        ok.n(h6.f19165j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, y5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = h6.Oh;
        int v9 = h6.v(themedColor, h6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(h6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46186s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f46186s;
        ch.d c10 = this.M.c(frameLayout3, null, false);
        c10.o(eh.b.l(this.resourceProvider));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f46186s.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46087b;

            {
                this.f46087b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        v3 v3Var = this.f46087b.d;
                        if (v3Var != null) {
                            boolean z10 = !v3Var.f46463r;
                            v3Var.f46463r = z10;
                            ppVar.a(z10, true);
                            v3Var.h();
                            return;
                        }
                        return;
                    default:
                        final i4 i4Var = this.f46087b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            z70 H = z70.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f46424a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f46424a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f46424a), new x2(i4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final pp ppVar2 = ppVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f46463r) {
                                                v3Var3.f46463r = false;
                                                ppVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f46463r) {
                                                v3Var4.f46463r = true;
                                                ppVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !v3Var2.f46463r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f46463r) {
                                                v3Var3.f46463r = false;
                                                ppVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f46463r) {
                                                v3Var4.f46463r = true;
                                                ppVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), v3Var2.f46463r);
                            H.f30840t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f46186s.addView(linearLayout2, y5.c(-1.0f, -2));
        a6.b(this.f46186s, 0.04f, 1.5f);
        w8Var.addView(this.f46186s, y5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        s5 y3 = s5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.f46186s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f46185r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f46185r;
        ch.d c11 = this.M.c(frameLayout5, null, false);
        c11.o(eh.b.l(this.resourceProvider));
        c11.p(AndroidUtilities.dp(8.0f));
        c11.q(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        w8Var.addView(this.f46185r, y5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.v = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new qq(R.drawable.msg_clearcache, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.v.setText(spannableStringBuilder);
        this.v.setTextColor(getThemedColor(i13));
        this.v.setTypeface(AndroidUtilities.bold());
        this.v.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.v;
        int dp2 = AndroidUtilities.dp(22.0f);
        int v10 = h6.v(getThemedColor(i10), h6.l1(0.1f, getThemedColor(i13)));
        textView4.setBackground(h6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        this.f46185r.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46072b;

            {
                this.f46072b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        v3 v3Var = this.f46072b.d;
                        v3Var.f46456k.clear();
                        v3Var.f46455j.clear();
                        v3Var.f46457l.clear();
                        v3Var.h();
                        return;
                    default:
                        v3 v3Var2 = this.f46072b.d;
                        v3Var2.f46456k.clear();
                        v3Var2.f46455j.clear();
                        v3Var2.f46457l.clear();
                        v3Var2.h();
                        return;
                }
            }
        });
        this.f46185r.addView(this.v, y5.c(-1.0f, -2));
        this.f46185r.setVisibility(8);
        a6.b(this.f46185r, 0.05f, 1.5f);
        m3 m3Var = new m3(context, this.resourceProvider);
        this.F = m3Var;
        m3Var.setSorting(this.d.f46461p);
        this.E.addView(this.F, y5.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46087b;

            {
                this.f46087b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        v3 v3Var = this.f46087b.d;
                        if (v3Var != null) {
                            boolean z10 = !v3Var.f46463r;
                            v3Var.f46463r = z10;
                            ppVar.a(z10, true);
                            v3Var.h();
                            return;
                        }
                        return;
                    default:
                        final i4 i4Var = this.f46087b;
                        v3 v3Var2 = i4Var.d;
                        if (i4Var.K) {
                            z70 H = z70.H(i4Var, i4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f46424a), new x2(i4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f46424a), new x2(i4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f46424a), new x2(i4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final pp ppVar2 = ppVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f46463r) {
                                                v3Var3.f46463r = false;
                                                ppVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f46463r) {
                                                v3Var4.f46463r = true;
                                                ppVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !v3Var2.f46463r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            v3 v3Var3 = i4Var.d;
                                            if (v3Var3.f46463r) {
                                                v3Var3.f46463r = false;
                                                ppVar2.a(false, true);
                                                v3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            v3 v3Var4 = i4Var.d;
                                            if (!v3Var4.f46463r) {
                                                v3Var4.f46463r = true;
                                                ppVar2.a(true, true);
                                                v3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), v3Var2.f46463r);
                            H.f30840t = false;
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
        this.E.addView(this.G, y5.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46410b;

            {
                this.f46410b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i4.W(this.f46410b, context);
                        return;
                    case 1:
                        i4.X(this.f46410b, context);
                        return;
                    default:
                        i4.V(this.f46410b, context);
                        return;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourceProvider);
        this.H = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, y5.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46410b;

            {
                this.f46410b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i4.W(this.f46410b, context);
                        return;
                    case 1:
                        i4.X(this.f46410b, context);
                        return;
                    default:
                        i4.V(this.f46410b, context);
                        return;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourceProvider);
        this.I = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, y5.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46410b;

            {
                this.f46410b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        i4.W(this.f46410b, context);
                        return;
                    case 1:
                        i4.X(this.f46410b, context);
                        return;
                    default:
                        i4.V(this.f46410b, context);
                        return;
                }
            }
        });
        t00 t00Var = new t00(getParentActivity());
        this.J = t00Var;
        w8Var.addView(t00Var, y5.c(-1.0f, -1));
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
            this.f46189y.setVisibility(0);
            ViewPropertyAnimator animate = this.f46189y.animate();
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
            sr srVar = sr.h;
            alpha.setInterpolator(srVar).setDuration(420L).setListener(new c3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(srVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f46184n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(srVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f46189y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f46189y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f46189y;
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
        e3 e3Var = this.f46184n;
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
        k61 k61Var;
        v3 v3Var = this.d;
        int i10 = v3Var.e;
        HashSet hashSet = v3Var.f46457l;
        ArrayList arrayList = v3Var.h;
        HashSet hashSet2 = v3Var.f46456k;
        ArrayList arrayList2 = v3Var.f46453g;
        HashSet hashSet3 = v3Var.f46455j;
        ArrayList arrayList3 = v3Var.f46452f;
        if (i10 > 12) {
            d0(true, true);
        }
        e3 e3Var = this.f46184n;
        boolean z11 = false;
        if (e3Var != null && (k61Var = e3Var.Y2) != null) {
            k61Var.N(true);
            if (z10) {
                this.f46184n.u0(0);
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(this.f46182c);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = v3Var.e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            kVar2.setSubtitle(formatPluralStringComma);
        }
        m3 m3Var = this.F;
        if (m3Var != null) {
            m3Var.setSorting(v3Var.f46461p);
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
            if (i12 >= this.f46184n.getChildCount()) {
                break;
            } else if (this.f46184n.getChildAt(i12) instanceof v00) {
                v3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((v3Var.f46465t || v3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f46180a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = h6.w0(null, h6.f19059d6, false);
            if (this.actionBar.s()) {
                w02 = h6.w0(null, h6.f19410w8, false);
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
