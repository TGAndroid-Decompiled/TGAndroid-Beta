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
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h81;
import org.telegram.ui.py0;
import org.telegram.ui.z8;
import w7.a6;
import w7.y5;
import yh.j7;
import yh.s5;
public class j4 extends org.telegram.ui.ActionBar.o2 implements le.e {
    public LinearLayout E;
    public n3 F;
    public n3 G;
    public n3 H;
    public n3 I;
    public t00 J;
    public boolean K;
    public fh.c L;
    public ah.c M;
    public final le.c f46285a;
    public final long f46286b;
    public final String f46287c;
    public final w3 d;
    public Utilities.Callback e;
    public org.telegram.ui.ActionBar.h2 f46288f;
    public View h;
    public f3 f46289n;
    public FrameLayout f46290r;
    public FrameLayout f46291s;
    public TextView v;
    public o3 f46292w;
    public boolean f46293x;
    public HorizontalScrollView f46294y;

    public j4(long j3, String str, long j10, e6 e6Var) {
        super(null);
        this.f46285a = new le.c(0, this, sr.h, 380L, false);
        this.K = true;
        this.f46286b = j3;
        this.f46287c = str;
        this.resourceProvider = e6Var;
        w3 w3Var = new w3(j10, this.currentAccount, new ii.q1(this, 21));
        this.d = w3Var;
        w3Var.g(false);
    }

    public static void U(j4 j4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == UserConfig.getInstance(j4Var.currentAccount).getClientUserId()) {
            j4Var.d.d.remove(tL_starGiftUnique);
            j4Var.e0(false);
            if (j3 == UserConfig.getInstance(j4Var.currentAccount).getClientUserId()) {
                xc a02 = xc.a0(j4Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i10 = R.string.BoughtResoldGiftText;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                qc O = a02.O(document, string, LocaleController.formatString(i10, hg.k0.j(tL_starGiftUnique.num, ',', sb2)));
                O.f27699r = false;
                O.j();
            } else {
                qc O2 = xc.a0(j4Var).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(j4Var.currentAccount, j3)));
                O2.f27699r = false;
                O2.j();
            }
            j4Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        e3 e3Var = new e3(bundle, tL_starGiftUnique, j3);
        d5 d5Var = j4Var.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).f18599b) {
            Dialog dialog = j4Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.g3) && z10) {
                ((org.telegram.ui.ActionBar.g3) dialog).skipDismissAnimation();
            }
            j4Var.finishFragment();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(e3Var, false, z10);
            }
        } else {
            j4Var.presentFragment(e3Var, true, z10);
        }
        Utilities.Callback callback = j4Var.e;
        if (callback != null) {
            callback.run(Boolean.valueOf(z10));
        }
    }

    public static void V(j4 j4Var, Context context) {
        w3 w3Var = j4Var.d;
        if (!j4Var.K || w3Var.h.isEmpty()) {
            return;
        }
        a80 a80Var = new a80(j4Var, j4Var.I, false, false);
        a80Var.f22607t = false;
        a80Var.Y = true;
        a80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        a80Var.R = true;
        a80Var.f22601p = new ii.h(a80Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w3Var.h);
        Collections.sort(arrayList, new v2(j4Var, 0));
        t61 t61Var = new t61(j4Var, new w2(j4Var, strArr, arrayList, 0), new x2(j4Var, a80Var, 0), null);
        t61Var.Y2.f25959r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(j4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, j4Var.resourceProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(i6.v0(i6.A6, j4Var.resourceProvider));
        duVar.setCursorColor(i6.v0(i6.G6, j4Var.resourceProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(i6.v0(i6.E8, j4Var.resourceProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, t61Var, false, 8));
        if (arrayList.size() > 8) {
            a80Var.r(frameLayout, y5.n(-1, 44));
            a80Var.k();
        }
        if (!w3Var.f46533l.isEmpty()) {
            a80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y2(j4Var, 0), false);
        }
        a80Var.q(t61Var);
        a80Var.Z();
    }

    public static void W(j4 j4Var, Context context) {
        w3 w3Var = j4Var.d;
        if (!j4Var.K || w3Var.f46528f.isEmpty()) {
            return;
        }
        a80 a80Var = new a80(j4Var, j4Var.G, false, false);
        a80Var.f22607t = false;
        a80Var.Y = true;
        a80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        a80Var.R = true;
        a80Var.f22601p = new ii.h(a80Var, 5);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w3Var.f46528f);
        Collections.sort(arrayList, new v2(j4Var, 2));
        t61 t61Var = new t61(j4Var, new w2(j4Var, strArr, arrayList, 2), new x2(j4Var, a80Var, 2), null);
        t61Var.Y2.f25959r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(j4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, j4Var.resourceProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(i6.v0(i6.A6, j4Var.resourceProvider));
        duVar.setCursorColor(i6.v0(i6.G6, j4Var.resourceProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(i6.v0(i6.E8, j4Var.resourceProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, t61Var, false, 9));
        if (arrayList.size() > 8) {
            a80Var.r(frameLayout, y5.n(-1, 44));
            a80Var.k();
        }
        if (!w3Var.f46531j.isEmpty()) {
            a80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y2(j4Var, 2), false);
        }
        a80Var.q(t61Var);
        a80Var.Z();
    }

    public static void X(j4 j4Var, Context context) {
        w3 w3Var = j4Var.d;
        if (!j4Var.K || w3Var.f46529g.isEmpty()) {
            return;
        }
        a80 a80Var = new a80(j4Var, j4Var.H, false, false);
        a80Var.f22607t = false;
        a80Var.Y = true;
        a80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        a80Var.R = true;
        a80Var.f22601p = new ii.h(a80Var, 4);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w3Var.f46529g);
        Collections.sort(arrayList, new v2(j4Var, 1));
        t61 t61Var = new t61(j4Var, new w2(j4Var, strArr, arrayList, 1), new x2(j4Var, a80Var, 1), null);
        t61Var.Y2.f25959r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(j4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, j4Var.resourceProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(i6.v0(i6.A6, j4Var.resourceProvider));
        duVar.setCursorColor(i6.v0(i6.G6, j4Var.resourceProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(i6.v0(i6.E8, j4Var.resourceProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, t61Var, false, 10));
        if (arrayList.size() > 8) {
            a80Var.r(frameLayout, y5.n(-1, 44));
            a80Var.k();
        }
        if (!w3Var.f46532k.isEmpty()) {
            a80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y2(j4Var, 1), false);
        }
        a80Var.q(t61Var);
        a80Var.Z();
    }

    public static void Y(j4 j4Var, x51 x51Var) {
        Object obj = x51Var.G;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            yh.x3 x3Var = new yh.x3(j4Var.getParentActivity(), j4Var.currentAccount, j4Var.f46286b, j4Var.resourceProvider, null);
            x3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, j4Var.d);
            x3Var.O0 = new a3(j4Var);
            j4Var.showDialog(x3Var);
        }
    }

    public static org.telegram.ui.ActionBar.l Z(j4 j4Var) {
        return j4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l a0(j4 j4Var) {
        return j4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l b0(j4 j4Var) {
        return j4Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l c0(j4 j4Var) {
        return j4Var.actionBar;
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            this.f46291s.setTranslationY((-AndroidUtilities.dp(52.0f)) * f7);
            b20.d(this.f46290r, f7);
        }
    }

    @Override
    public final View createView(final Context context) {
        fh.c cVar = new fh.c();
        this.L = cVar;
        int i10 = i6.f19057d6;
        cVar.a(getThemedColor(i10));
        this.M = new ah.c(this.L);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f46288f = h2Var;
        lVar.setBackButtonDrawable(h2Var);
        this.f46288f.f18941k = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new h81(this, 11));
        this.actionBar.setTitle(this.f46287c);
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = i6.G6;
        lVar2.E(getThemedColor(i11), false);
        this.actionBar.E(getThemedColor(i11), true);
        this.actionBar.B(getThemedColor(i6.f19463z8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setSubtitleColor(getThemedColor(i6.f19461z6));
        z8 z8Var = new z8(this, context, 8);
        int v = i6.v(i6.v0(i10, this.resourceProvider), i6.l1(0.04f, i6.v0(i11, this.resourceProvider)));
        z8Var.setBackgroundColor(v);
        this.fragmentView = z8Var;
        j7 j7Var = new j7(context, this.currentAccount, this.resourceProvider);
        j7Var.d = true;
        a6.a(j7Var);
        j7Var.setOnClickListener(new py0(25, this, j7Var));
        this.actionBar.addView(j7Var, y5.d(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        ?? t61Var = new t61(this, new hi.a(this, 18), new a3(this), new a3(this));
        this.f46289n = t61Var;
        t61Var.Y2.f25959r = false;
        t61Var.setSpanCount(3);
        this.f46289n.j(new hg0(this, 16));
        this.f46289n.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.f46289n.setClipToPadding(false);
        z8Var.addView(this.f46289n, y5.d(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        z8Var.addView(this.actionBar);
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final j4 f46149b;

            {
                this.f46149b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w3 w3Var = this.f46149b.d;
                        w3Var.f46532k.clear();
                        w3Var.f46531j.clear();
                        w3Var.f46533l.clear();
                        w3Var.h();
                        return;
                    default:
                        w3 w3Var2 = this.f46149b.d;
                        w3Var2.f46532k.clear();
                        w3Var2.f46531j.clear();
                        w3Var2.f46533l.clear();
                        w3Var2.h();
                        return;
                }
            }
        };
        e6 e6Var = this.resourceProvider;
        ?? frameLayout = new FrameLayout(context);
        LinearLayout f7 = qk.f(context, 1);
        frameLayout.addView(f7, y5.e(-1, -2, 23));
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        f7.addView(w9Var, y5.q(130, 130, 17));
        TextView textView = new TextView(context);
        qk.n(i6.G6, e6Var, textView, 1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        f7.addView(textView, y5.t(-2, -2, 17, 32, 12, 32, 9));
        p90 p90Var = new p90(context, null);
        p90Var.setTextColor(i6.v0(i6.A6, e6Var));
        p90Var.setTextSize(1, 14.0f);
        p90Var.setGravity(17);
        p90Var.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        p90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
        f7.addView(p90Var, y5.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i12 = i6.Oh;
        textView2.setTextColor(i6.v0(i12, e6Var));
        textView2.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i12, e6Var)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.ui.Cells.c1.c(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        a6.a(textView2);
        f7.addView(textView2, y5.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
        this.f46292w = frameLayout;
        this.f46293x = false;
        frameLayout.setAlpha(0.0f);
        this.f46292w.setScaleX(0.95f);
        this.f46292w.setScaleY(0.95f);
        this.f46292w.setVisibility(8);
        z8Var.addView(this.f46292w, y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.E.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f46294y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f46294y.addView(this.E);
        this.f46294y.setBackgroundColor(v);
        this.f46294y.setClipChildren(false);
        z8Var.addView(this.f46294y, y5.e(-1, 47, 55));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(i6.f19058d7));
        this.h.setAlpha(0.0f);
        z8Var.addView(this.h, y5.a(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final pp ppVar = new pp(context, 24, this.resourceProvider);
        ppVar.b(i6.f19130h7, i6.f19166j7, i6.f19186k7);
        ppVar.setDrawUnchecked(true);
        ppVar.a(false, false);
        ppVar.setDrawBackgroundAsArc(10);
        ppVar.setTranslationX(AndroidUtilities.dp(4.0f));
        ppVar.setScaleX(0.8f);
        ppVar.setScaleY(0.8f);
        linearLayout2.addView(ppVar, y5.q(26, 26, 16));
        TextView textView3 = new TextView(context);
        qk.n(i6.f19164j5, this.resourceProvider, textView3, 1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, y5.t(-2, -2, 16, 9, 0, 0, 0));
        int dp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i10);
        int i13 = i6.Oh;
        int v9 = i6.v(themedColor, i6.l1(0.1f, getThemedColor(i13)));
        linearLayout2.setBackground(i6.i0(dp, dp, dp, dp, 0, v9, v9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f46291s = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout3 = this.f46291s;
        ch.d c10 = this.M.c(frameLayout3, null, false);
        c10.u(eh.b.l(this.resourceProvider));
        c10.v(AndroidUtilities.dp(8.0f));
        c10.w(AndroidUtilities.dp(18.0f));
        frameLayout3.setBackground(c10);
        this.f46291s.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f46167b;

            {
                this.f46167b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        w3 w3Var = this.f46167b.d;
                        if (w3Var != null) {
                            boolean z10 = !w3Var.f46539r;
                            w3Var.f46539r = z10;
                            ppVar.a(z10, true);
                            w3Var.h();
                            return;
                        }
                        return;
                    default:
                        final j4 j4Var = this.f46167b;
                        w3 w3Var2 = j4Var.d;
                        if (j4Var.K) {
                            a80 H = a80.H(j4Var, j4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(v3.BY_PRICE.f46513a), new y2(j4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(v3.BY_DATE.f46513a), new y2(j4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(v3.BY_NUMBER.f46513a), new y2(j4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final pp ppVar2 = ppVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w3 w3Var3 = j4Var.d;
                                            if (w3Var3.f46539r) {
                                                w3Var3.f46539r = false;
                                                ppVar2.a(false, true);
                                                w3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w3 w3Var4 = j4Var.d;
                                            if (!w3Var4.f46539r) {
                                                w3Var4.f46539r = true;
                                                ppVar2.a(true, true);
                                                w3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !w3Var2.f46539r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w3 w3Var3 = j4Var.d;
                                            if (w3Var3.f46539r) {
                                                w3Var3.f46539r = false;
                                                ppVar2.a(false, true);
                                                w3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w3 w3Var4 = j4Var.d;
                                            if (!w3Var4.f46539r) {
                                                w3Var4.f46539r = true;
                                                ppVar2.a(true, true);
                                                w3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), w3Var2.f46539r);
                            H.f22607t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        this.f46291s.addView(linearLayout2, y5.c(-1.0f, -2));
        a6.b(this.f46291s, 0.04f, 1.5f);
        z8Var.addView(this.f46291s, y5.d(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        s5 y3 = s5.y(this.currentAccount, true);
        if (y3.e && !y3.s().k()) {
            this.f46291s.setVisibility(8);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f46290r = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout5 = this.f46290r;
        ch.d c11 = this.M.c(frameLayout5, null, false);
        c11.u(eh.b.l(this.resourceProvider));
        c11.v(AndroidUtilities.dp(8.0f));
        c11.w(AndroidUtilities.dp(22.0f));
        frameLayout5.setBackground(c11);
        z8Var.addView(this.f46290r, y5.d(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
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
        int v10 = i6.v(getThemedColor(i10), i6.l1(0.1f, getThemedColor(i13)));
        textView4.setBackground(i6.i0(dp2, dp2, dp2, dp2, 0, v10, v10));
        this.v.setGravity(17);
        this.f46290r.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f46149b;

            {
                this.f46149b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        w3 w3Var = this.f46149b.d;
                        w3Var.f46532k.clear();
                        w3Var.f46531j.clear();
                        w3Var.f46533l.clear();
                        w3Var.h();
                        return;
                    default:
                        w3 w3Var2 = this.f46149b.d;
                        w3Var2.f46532k.clear();
                        w3Var2.f46531j.clear();
                        w3Var2.f46533l.clear();
                        w3Var2.h();
                        return;
                }
            }
        });
        this.f46290r.addView(this.v, y5.c(-1.0f, -2));
        this.f46290r.setVisibility(8);
        a6.b(this.f46290r, 0.05f, 1.5f);
        n3 n3Var = new n3(context, this.resourceProvider);
        this.F = n3Var;
        n3Var.setSorting(this.d.f46537p);
        this.E.addView(this.F, y5.t(-2, -2, 16, 0, 0, 6, 0));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f46167b;

            {
                this.f46167b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        w3 w3Var = this.f46167b.d;
                        if (w3Var != null) {
                            boolean z10 = !w3Var.f46539r;
                            w3Var.f46539r = z10;
                            ppVar.a(z10, true);
                            w3Var.h();
                            return;
                        }
                        return;
                    default:
                        final j4 j4Var = this.f46167b;
                        w3 w3Var2 = j4Var.d;
                        if (j4Var.K) {
                            a80 H = a80.H(j4Var, j4Var.F);
                            H.c(R.drawable.menu_sort_value, LocaleController.getString(v3.BY_PRICE.f46513a), new y2(j4Var, 3), false);
                            H.c(R.drawable.menu_sort_date, LocaleController.getString(v3.BY_DATE.f46513a), new y2(j4Var, 4), false);
                            H.c(R.drawable.menu_sort_number, LocaleController.getString(v3.BY_NUMBER.f46513a), new y2(j4Var, 5), false);
                            H.k();
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final pp ppVar2 = ppVar;
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w3 w3Var3 = j4Var.d;
                                            if (w3Var3.f46539r) {
                                                w3Var3.f46539r = false;
                                                ppVar2.a(false, true);
                                                w3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w3 w3Var4 = j4Var.d;
                                            if (!w3Var4.f46539r) {
                                                w3Var4.f46539r = true;
                                                ppVar2.a(true, true);
                                                w3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, string, !w3Var2.f46539r);
                            H.i(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            w3 w3Var3 = j4Var.d;
                                            if (w3Var3.f46539r) {
                                                w3Var3.f46539r = false;
                                                ppVar2.a(false, true);
                                                w3Var3.h();
                                                return;
                                            }
                                            return;
                                        default:
                                            w3 w3Var4 = j4Var.d;
                                            if (!w3Var4.f46539r) {
                                                w3Var4.f46539r = true;
                                                ppVar2.a(true, true);
                                                w3Var4.h();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), w3Var2.f46539r);
                            H.f22607t = false;
                            H.Y = true;
                            H.a0(0.0f, AndroidUtilities.dp(-8.0f));
                            H.Z();
                            return;
                        }
                        return;
                }
            }
        });
        n3 n3Var2 = new n3(context, this.resourceProvider);
        this.G = n3Var2;
        n3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.E.addView(this.G, y5.t(-2, -2, 16, 0, 0, 6, 0));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f46487b;

            {
                this.f46487b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        j4.W(this.f46487b, context);
                        return;
                    case 1:
                        j4.X(this.f46487b, context);
                        return;
                    default:
                        j4.V(this.f46487b, context);
                        return;
                }
            }
        });
        n3 n3Var3 = new n3(context, this.resourceProvider);
        this.H = n3Var3;
        n3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.E.addView(this.H, y5.t(-2, -2, 16, 0, 0, 6, 0));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f46487b;

            {
                this.f46487b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        j4.W(this.f46487b, context);
                        return;
                    case 1:
                        j4.X(this.f46487b, context);
                        return;
                    default:
                        j4.V(this.f46487b, context);
                        return;
                }
            }
        });
        n3 n3Var4 = new n3(context, this.resourceProvider);
        this.I = n3Var4;
        n3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.E.addView(this.I, y5.t(-2, -2, 16, 0, 0, 0, 0));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final j4 f46487b;

            {
                this.f46487b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        j4.W(this.f46487b, context);
                        return;
                    case 1:
                        j4.X(this.f46487b, context);
                        return;
                    default:
                        j4.V(this.f46487b, context);
                        return;
                }
            }
        });
        t00 t00Var = new t00(getParentActivity());
        this.J = t00Var;
        z8Var.addView(t00Var, y5.c(-1.0f, -1));
        d0(false, false);
        return z8Var;
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
            this.f46294y.setVisibility(0);
            ViewPropertyAnimator animate = this.f46294y.animate();
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
            alpha.setInterpolator(srVar).setDuration(420L).setListener(new d3(this, z10, 0)).start();
            ViewPropertyAnimator animate2 = this.h.animate();
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = -AndroidUtilities.dp(45.0f);
            }
            animate2.translationY(f12).setInterpolator(srVar).setDuration(420L).start();
            ViewPropertyAnimator animate3 = this.f46289n.animate();
            if (!z10) {
                f14 = -AndroidUtilities.dp(39.0f);
            }
            animate3.translationY(f14).setInterpolator(srVar).setDuration(420L).start();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f46294y;
        if (!z10) {
            i10 = 8;
        }
        horizontalScrollView.setVisibility(i10);
        HorizontalScrollView horizontalScrollView2 = this.f46294y;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(45.0f);
        }
        horizontalScrollView2.setTranslationY(f7);
        HorizontalScrollView horizontalScrollView3 = this.f46294y;
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
        f3 f3Var = this.f46289n;
        if (!z10) {
            f14 = -AndroidUtilities.dp(39.0f);
        }
        f3Var.setTranslationY(f14);
    }

    public final void e0(boolean z10) {
        String string;
        String string2;
        String string3;
        String formatPluralStringComma;
        l61 l61Var;
        w3 w3Var = this.d;
        int i10 = w3Var.e;
        HashSet hashSet = w3Var.f46533l;
        ArrayList arrayList = w3Var.h;
        HashSet hashSet2 = w3Var.f46532k;
        ArrayList arrayList2 = w3Var.f46529g;
        HashSet hashSet3 = w3Var.f46531j;
        ArrayList arrayList3 = w3Var.f46528f;
        if (i10 > 12) {
            d0(true, true);
        }
        f3 f3Var = this.f46289n;
        boolean z11 = false;
        if (f3Var != null && (l61Var = f3Var.Y2) != null) {
            l61Var.N(true);
            if (z10) {
                this.f46289n.v0(0);
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(this.f46287c);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = w3Var.e;
            if (i11 <= 0) {
                formatPluralStringComma = LocaleController.getString(R.string.Gift2ResaleNoCount);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ListingsCount", i11);
            }
            lVar2.setSubtitle(formatPluralStringComma);
        }
        n3 n3Var = this.F;
        if (n3Var != null) {
            n3Var.setSorting(w3Var.f46537p);
        }
        if (this.G != null) {
            int size = arrayList3.size() - hashSet3.size();
            n3 n3Var2 = this.G;
            if (size > 0 && size != arrayList3.size()) {
                string3 = LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size);
            } else {
                string3 = LocaleController.getString(R.string.Gift2ResaleFilterModel);
            }
            n3Var2.setValue(string3);
        }
        if (this.H != null) {
            int size2 = arrayList2.size() - hashSet2.size();
            n3 n3Var3 = this.H;
            if (size2 > 0 && size2 != arrayList2.size()) {
                string2 = LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2);
            } else {
                string2 = LocaleController.getString(R.string.Gift2ResaleFilterBackdrop);
            }
            n3Var3.setValue(string2);
        }
        if (this.I != null) {
            int size3 = arrayList.size() - hashSet.size();
            n3 n3Var4 = this.I;
            if (size3 > 0 && size3 != arrayList.size()) {
                string = LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3);
            } else {
                string = LocaleController.getString(R.string.Gift2ResaleFilterSymbol);
            }
            n3Var4.setValue(string);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f46289n.getChildCount()) {
                break;
            } else if (this.f46289n.getChildAt(i12) instanceof v00) {
                w3Var.g(false);
                break;
            } else {
                i12++;
            }
        }
        if ((w3Var.f46541t || w3Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
            z11 = true;
        }
        this.f46285a.a(z11, true);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = i6.w0(null, i6.f19057d6, false);
            if (this.actionBar.t()) {
                w02 = i6.w0(null, i6.f19410w8, false);
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
