package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.py0;
import org.telegram.ui.vo0;
import w7.x5;
import yh.l5;
import yh.t5;
public final class h4 extends bb {
    public static final int f45839k0 = 0;
    public final String X;
    public final g4 Y;
    public final HorizontalScrollView Z;
    public final m3 f45840a0;
    public final m3 f45841b0;
    public final m3 f45842c0;
    public final m3 f45843d0;
    public final yh.j2 f45844e0;
    public yh.w0 f45845f0;
    public final HashSet f45846g0;
    public boolean f45847h0;
    public f4 f45848i0;
    public boolean f45849j0;

    public h4(final Context context, String str, final g4 g4Var) {
        super(2, context, (d6) null, false);
        this.f45846g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = g4Var;
        this.e.setTitle(y());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.Z = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        m3 m3Var = new m3(context, this.resourcesProvider);
        this.f45840a0 = m3Var;
        m3Var.setSorting(g4Var.f45831c.f46134p);
        linearLayout.addView(m3Var, x5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var.setOnClickListener(new py0(26, this, g4Var));
        m3 m3Var2 = new m3(context, this.resourcesProvider);
        this.f45841b0 = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(m3Var2, x5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f45763b;

            {
                this.f45763b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.R(this.f45763b, g4Var, context);
                        return;
                    case 1:
                        h4.W(this.f45763b, g4Var, context);
                        return;
                    default:
                        h4.S(this.f45763b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourcesProvider);
        this.f45842c0 = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(m3Var3, x5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f45763b;

            {
                this.f45763b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.R(this.f45763b, g4Var, context);
                        return;
                    case 1:
                        h4.W(this.f45763b, g4Var, context);
                        return;
                    default:
                        h4.S(this.f45763b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourcesProvider);
        this.f45843d0 = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(m3Var4, x5.t(-2, -2, 16, 0, 0, 0, 0));
        m3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f45763b;

            {
                this.f45763b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.R(this.f45763b, g4Var, context);
                        return;
                    case 1:
                        h4.W(this.f45763b, g4Var, context);
                        return;
                    default:
                        h4.S(this.f45763b, g4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new tg.d(14, this, g4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new kg0(this, 16));
        s4.j jVar = new s4.j();
        jVar.f42662m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new v3.d(11));
        yh.j2 j2Var = new yh.j2(context);
        this.f45844e0 = j2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        j2Var.h = dp;
        j2Var.f47241n = dp2;
        j2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        j2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(j2Var, 26), 12.0f, 12, null, new ArrayList());
        j2Var.setPivotY(0.0f);
        this.container.addView(j2Var, x5.e(-1, -2, 55));
        this.f45848i0.N(false);
        g4Var.d = new z3(this, 1);
    }

    public static void P(h4 h4Var, g4 g4Var) {
        o70 F = o70.F(h4Var.container, h4Var.resourcesProvider, h4Var.f45840a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f46097a), new y3(g4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f46097a), new y3(g4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f46097a), new y3(g4Var, 5), false);
        F.f26670t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(h4 h4Var, g4 g4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        zf.b bVar;
        h51 G = h4Var.f45848i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f24513r;
                if (!TextUtils.isEmpty(starGift.gift_address) && h4Var.f45847h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h4Var.getContext(), 0, h4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    hg.c.A(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(h4Var.getContext(), 3, null);
                    b2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(h4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = zf.b.f48899b;
                    } else {
                        bVar = zf.b.f48898a;
                    }
                    zf.b bVar2 = bVar;
                    t5.x(h4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new vo0(h4Var, b2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = g4Var.f45830b.f47337l;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj2 = arrayList.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj2;
                                if (savedStarGift.gift == starGift) {
                                    break;
                                }
                            } else {
                                savedStarGift = null;
                                break;
                            }
                        }
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h4Var.getContext());
                            String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f18409a;
                            b2Var3.R = string2;
                            b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            hg.c.A(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    h4Var.f45845f0.run(starGift);
                    h4Var.dismiss();
                }
            }
        }
    }

    public static void R(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f45831c;
        if (v3Var.f46125f.isEmpty()) {
            return;
        }
        o70 o70Var = new o70(h4Var.container, h4Var.resourcesProvider, h4Var.f45841b0, false, true, false);
        o70Var.f26670t = false;
        o70Var.Y = true;
        o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        o70Var.R = true;
        o70Var.f26664p = new ii.h(o70Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f46125f);
        Collections.sort(arrayList, new a4(g4Var, 2));
        d61 d61Var = new d61(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 0), new x3(g4Var, o70Var, 0), null, h4Var.resourcesProvider);
        d61Var.Y2.f28662r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        cu cuVar = new cu(context, h4Var.resourcesProvider);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setInputType(573441);
        cuVar.setRawInputType(573441);
        cuVar.setHintTextColor(h6.v0(h6.A6, h4Var.resourcesProvider));
        cuVar.setCursorColor(h6.v0(h6.G6, h4Var.resourcesProvider));
        cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        cuVar.setCursorWidth(1.5f);
        cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        cuVar.setTextColor(h6.v0(h6.E8, h4Var.resourcesProvider));
        cuVar.setBackground(null);
        frameLayout.addView(cuVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        cuVar.addTextChangedListener(new rn(strArr, d61Var, false, 11));
        if (arrayList.size() > 8) {
            o70Var.r(frameLayout, x5.n(-1, 44));
            o70Var.k();
        }
        if (!v3Var.f46128j.isEmpty()) {
            o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 0), false);
        }
        o70Var.q(d61Var);
        o70Var.Z();
    }

    public static void S(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f45831c;
        if (v3Var.h.isEmpty()) {
            return;
        }
        o70 o70Var = new o70(h4Var.container, h4Var.resourcesProvider, h4Var.f45843d0, false, true, false);
        o70Var.f26670t = false;
        o70Var.Y = true;
        o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        o70Var.R = true;
        o70Var.f26664p = new ii.h(o70Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new a4(g4Var, 1));
        d61 d61Var = new d61(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 2), new x3(g4Var, o70Var, 2), null, h4Var.resourcesProvider);
        d61Var.Y2.f28662r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        cu cuVar = new cu(context, h4Var.resourcesProvider);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setInputType(573441);
        cuVar.setRawInputType(573441);
        cuVar.setHintTextColor(h6.v0(h6.A6, h4Var.resourcesProvider));
        cuVar.setCursorColor(h6.v0(h6.G6, h4Var.resourcesProvider));
        cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        cuVar.setCursorWidth(1.5f);
        cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        cuVar.setTextColor(h6.v0(h6.E8, h4Var.resourcesProvider));
        cuVar.setBackground(null);
        frameLayout.addView(cuVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        cuVar.addTextChangedListener(new rn(strArr, d61Var, false, 13));
        if (arrayList.size() > 8) {
            o70Var.r(frameLayout, x5.n(-1, 44));
            o70Var.k();
        }
        if (!v3Var.f46130l.isEmpty()) {
            o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 2), false);
        }
        o70Var.q(d61Var);
        o70Var.Z();
    }

    public static void T(h4 h4Var, ArrayList arrayList) {
        boolean z10;
        g4 g4Var = h4Var.Y;
        if (g4Var != null) {
            l5 l5Var = g4Var.f45830b;
            v3 v3Var = g4Var.f45831c;
            if (l5Var != null && v3Var != null) {
                int currentTime = ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime();
                arrayList.add(h51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = l5Var.f47337l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z11 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!h4Var.f45846g0.contains(Long.valueOf(savedStarGift.gift.f18308id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h51 a2 = i1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f24503g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!l5Var.f47334i && l5Var.f47335j) {
                    if (z11) {
                        arrayList.add(h51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        h51 o9 = h51.o((i15 - i13) + 1, 35);
                        o9.f24516u = 1;
                        arrayList.add(o9);
                    }
                }
                if (v3Var.e > 0 || h4Var.f45849j0) {
                    h4Var.f45849j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    h51 h51Var = new h51(42);
                    h51Var.d = -2;
                    h51Var.f24510o = string;
                    arrayList.add(h51Var);
                    HorizontalScrollView horizontalScrollView = h4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(h51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = v3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(i1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (v3Var.f46138t || !v3Var.f46139u) {
                        h51 o10 = h51.o(10, 35);
                        o10.f24516u = 1;
                        arrayList.add(o10);
                        h51 o11 = h51.o(11, 35);
                        o11.f24516u = 1;
                        arrayList.add(o11);
                        h51 o12 = h51.o(12, 35);
                        o12.f24516u = 1;
                        arrayList.add(o12);
                        h51 o13 = h51.o(13, 35);
                        o13.f24516u = 1;
                        arrayList.add(o13);
                        h51 o14 = h51.o(14, 35);
                        o14.f24516u = 1;
                        arrayList.add(o14);
                        h51 o15 = h51.o(15, 35);
                        o15.f24516u = 1;
                        arrayList.add(o15);
                    }
                }
            }
        }
    }

    public static void U(h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.b3 b3Var = new yh.b3(bVar, tL_payments_paymentFormStarGift);
        Context context = h4Var.getContext();
        d6 d6Var = h4Var.resourcesProvider;
        int i10 = h4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.d3(context, d6Var, tL_starGiftUnique, b3Var, i10, j3, hg.c.k(tL_starGiftUnique.num, ',', sb2), true, new e80(h4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void V(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.b3 b3Var, nf.e eVar) {
        eVar.d();
        t5.x(h4Var.currentAccount, b3Var.f46918a).h(b3Var.f46919b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(h4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void W(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f45831c;
        if (v3Var.f46126g.isEmpty()) {
            return;
        }
        o70 o70Var = new o70(h4Var.container, h4Var.resourcesProvider, h4Var.f45842c0, false, true, false);
        o70Var.f26670t = false;
        o70Var.Y = true;
        o70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        o70Var.R = true;
        o70Var.f26664p = new ii.h(o70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f46126g);
        Collections.sort(arrayList, new a4(g4Var, 0));
        d61 d61Var = new d61(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 1), new x3(g4Var, o70Var, 1), null, h4Var.resourcesProvider);
        d61Var.Y2.f28662r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        cu cuVar = new cu(context, h4Var.resourcesProvider);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setInputType(573441);
        cuVar.setRawInputType(573441);
        cuVar.setHintTextColor(h6.v0(h6.A6, h4Var.resourcesProvider));
        cuVar.setCursorColor(h6.v0(h6.G6, h4Var.resourcesProvider));
        cuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        cuVar.setCursorWidth(1.5f);
        cuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        cuVar.setTextColor(h6.v0(h6.E8, h4Var.resourcesProvider));
        cuVar.setBackground(null);
        frameLayout.addView(cuVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        cuVar.addTextChangedListener(new rn(strArr, d61Var, false, 12));
        if (arrayList.size() > 8) {
            o70Var.r(frameLayout, x5.n(-1, 44));
            o70Var.k();
        }
        if (!v3Var.f46129k.isEmpty()) {
            o70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 1), false);
        }
        o70Var.q(d61Var);
        o70Var.Z();
    }

    @Override
    public final void F(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.j2 j2Var = this.f45844e0;
        float measuredHeight = y3 - j2Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / j2Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        j2Var.setScaleX(clamp01);
        j2Var.setScaleY(clamp01);
        j2Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        j2Var.setTranslationY(measuredHeight);
    }

    public final void Z() {
        int R;
        h51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ml0 ml0Var = this.d;
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if ((childAt instanceof u00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f45848i0.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        g4 g4Var = this.Y;
        if (z10) {
            g4Var.f45830b.a();
        }
        if (z11) {
            g4Var.f45831c.g(false);
        }
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        f4 f4Var = new f4(this, ml0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.f45848i0 = f4Var;
        return f4Var;
    }

    @Override
    public final CharSequence y() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(R.string.GiftCraftSelectTitle);
    }
}
