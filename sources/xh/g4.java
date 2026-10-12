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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.cp0;
import w7.w5;
import yh.f5;
import yh.n5;
public final class g4 extends db {
    public static final int f51488k0 = 0;
    public final String X;
    public final f4 Y;
    public final HorizontalScrollView Z;
    public final l3 f51489a0;
    public final l3 f51490b0;
    public final l3 f51491c0;
    public final l3 f51492d0;
    public final yh.f2 f51493e0;
    public yh.v0 f51494f0;
    public final HashSet f51495g0;
    public boolean f51496h0;
    public e4 f51497i0;
    public boolean f51498j0;

    public g4(final Context context, String str, final f4 f4Var) {
        super(2, context, (c6) null, false);
        this.f51495g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = f4Var;
        this.f25287e.setTitle(A());
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
        l3 l3Var = new l3(context, this.resourcesProvider);
        this.f51489a0 = l3Var;
        l3Var.setSorting(f4Var.f51477c.f51785p);
        linearLayout.addView(l3Var, w5.t(-2, -2, 16, 0, 0, 6, 0));
        l3Var.setOnClickListener(new a(2, this, f4Var));
        l3 l3Var2 = new l3(context, this.resourcesProvider);
        this.f51490b0 = l3Var2;
        l3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(l3Var2, w5.t(-2, -2, 16, 0, 0, 6, 0));
        l3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f51407b;

            {
                this.f51407b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.S(this.f51407b, f4Var, context);
                        return;
                    case 1:
                        g4.X(this.f51407b, f4Var, context);
                        return;
                    default:
                        g4.T(this.f51407b, f4Var, context);
                        return;
                }
            }
        });
        l3 l3Var3 = new l3(context, this.resourcesProvider);
        this.f51491c0 = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(l3Var3, w5.t(-2, -2, 16, 0, 0, 6, 0));
        l3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f51407b;

            {
                this.f51407b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.S(this.f51407b, f4Var, context);
                        return;
                    case 1:
                        g4.X(this.f51407b, f4Var, context);
                        return;
                    default:
                        g4.T(this.f51407b, f4Var, context);
                        return;
                }
            }
        });
        l3 l3Var4 = new l3(context, this.resourcesProvider);
        this.f51492d0 = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(l3Var4, w5.t(-2, -2, 16, 0, 0, 0, 0));
        l3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f51407b;

            {
                this.f51407b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.S(this.f51407b, f4Var, context);
                        return;
                    case 1:
                        g4.X(this.f51407b, f4Var, context);
                        return;
                    default:
                        g4.T(this.f51407b, f4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.w1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new qg.x1(20, this, f4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new qh0(this, 19));
        s4.j jVar = new s4.j();
        jVar.f47937m = false;
        jVar.C = false;
        jVar.o(js.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new w9.w(5));
        yh.f2 f2Var = new yh.f2(context);
        this.f51493e0 = f2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        f2Var.h = dp;
        f2Var.f52719n = dp2;
        f2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        f2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(f2Var, 26), 12.0f, 12, null, new ArrayList());
        f2Var.setPivotY(0.0f);
        this.container.addView(f2Var, w5.e(-1, -2, 55));
        this.f51497i0.N(false);
        f4Var.d = new y3(this, 1);
    }

    public static void Q(g4 g4Var, f4 f4Var) {
        s80 F = s80.F(g4Var.container, g4Var.resourcesProvider, g4Var.f51489a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f51762a), new x3(f4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f51762a), new x3(f4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f51762a), new x3(f4Var, 5), false);
        F.f30469t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void R(g4 g4Var, f4 f4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        zf.b bVar;
        u61 G = g4Var.f51497i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f31077r;
                if (!TextUtils.isEmpty(starGift.gift_address) && g4Var.f51496h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g4Var.getContext(), 0, g4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(g4Var.getContext(), 3, null);
                    a2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(g4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = zf.b.f54676b;
                    } else {
                        bVar = zf.b.f54675a;
                    }
                    zf.b bVar2 = bVar;
                    n5.x(g4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new cp0(g4Var, a2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = f4Var.f51476b.f52755l;
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
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(g4Var.currentAccount).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g4Var.getContext());
                            String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.f20142a;
                            a2Var3.R = string2;
                            a2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    g4Var.f51494f0.run(starGift);
                    g4Var.dismiss();
                }
            }
        }
    }

    public static void S(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f51477c;
        if (u3Var.f51776f.isEmpty()) {
            return;
        }
        s80 s80Var = new s80(g4Var.container, g4Var.resourcesProvider, g4Var.f51490b0, false, true, false);
        s80Var.f30469t = false;
        s80Var.Y = true;
        s80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        s80Var.R = true;
        s80Var.f30463p = new ii.h(s80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f51776f);
        Collections.sort(arrayList, new z3(f4Var, 2));
        p71 p71Var = new p71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 0), new w3(f4Var, s80Var, 0), null, g4Var.resourcesProvider);
        p71Var.W2.f26679r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        uu uuVar = new uu(context, g4Var.resourcesProvider);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setInputType(573441);
        uuVar.setRawInputType(573441);
        uuVar.setHintTextColor(h6.w0(h6.A6, g4Var.resourcesProvider));
        uuVar.setCursorColor(h6.w0(h6.G6, g4Var.resourcesProvider));
        uuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        uuVar.setCursorWidth(1.5f);
        uuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        uuVar.setTextColor(h6.w0(h6.E8, g4Var.resourcesProvider));
        uuVar.setBackground(null);
        frameLayout.addView(uuVar, w5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        uuVar.addTextChangedListener(new jo(strArr, p71Var, false, 11));
        if (arrayList.size() > 8) {
            s80Var.r(frameLayout, w5.n(-1, 44));
            s80Var.k();
        }
        if (!u3Var.f51779j.isEmpty()) {
            s80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 0), false);
        }
        s80Var.q(p71Var);
        s80Var.Z();
    }

    public static void T(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f51477c;
        if (u3Var.h.isEmpty()) {
            return;
        }
        s80 s80Var = new s80(g4Var.container, g4Var.resourcesProvider, g4Var.f51492d0, false, true, false);
        s80Var.f30469t = false;
        s80Var.Y = true;
        s80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        s80Var.R = true;
        s80Var.f30463p = new ii.h(s80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new z3(f4Var, 1));
        p71 p71Var = new p71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 2), new w3(f4Var, s80Var, 2), null, g4Var.resourcesProvider);
        p71Var.W2.f26679r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        uu uuVar = new uu(context, g4Var.resourcesProvider);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setInputType(573441);
        uuVar.setRawInputType(573441);
        uuVar.setHintTextColor(h6.w0(h6.A6, g4Var.resourcesProvider));
        uuVar.setCursorColor(h6.w0(h6.G6, g4Var.resourcesProvider));
        uuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        uuVar.setCursorWidth(1.5f);
        uuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        uuVar.setTextColor(h6.w0(h6.E8, g4Var.resourcesProvider));
        uuVar.setBackground(null);
        frameLayout.addView(uuVar, w5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        uuVar.addTextChangedListener(new jo(strArr, p71Var, false, 13));
        if (arrayList.size() > 8) {
            s80Var.r(frameLayout, w5.n(-1, 44));
            s80Var.k();
        }
        if (!u3Var.f51781l.isEmpty()) {
            s80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 2), false);
        }
        s80Var.q(p71Var);
        s80Var.Z();
    }

    public static void U(g4 g4Var, ArrayList arrayList) {
        boolean z10;
        f4 f4Var = g4Var.Y;
        if (f4Var != null) {
            f5 f5Var = f4Var.f51476b;
            u3 u3Var = f4Var.f51477c;
            if (f5Var != null && u3Var != null) {
                int currentTime = ConnectionsManager.getInstance(g4Var.currentAccount).getCurrentTime();
                arrayList.add(u61.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = f5Var.f52755l;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z11 = true;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!g4Var.f51495g0.contains(Long.valueOf(savedStarGift.gift.f20032id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u61 a2 = h1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f31067g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!f5Var.f52752i && f5Var.f52753j) {
                    if (z11) {
                        arrayList.add(u61.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        u61 o9 = u61.o((i15 - i13) + 1, 35);
                        o9.f31080u = 1;
                        arrayList.add(o9);
                    }
                }
                if (u3Var.f51775e > 0 || g4Var.f51498j0) {
                    g4Var.f51498j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    u61 u61Var = new u61(42);
                    u61Var.d = -2;
                    u61Var.f31074o = string;
                    arrayList.add(u61Var);
                    HorizontalScrollView horizontalScrollView = g4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(u61.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = u3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(h1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (u3Var.f51789t || !u3Var.f51790u) {
                        u61 o10 = u61.o(10, 35);
                        o10.f31080u = 1;
                        arrayList.add(o10);
                        u61 o11 = u61.o(11, 35);
                        o11.f31080u = 1;
                        arrayList.add(o11);
                        u61 o12 = u61.o(12, 35);
                        o12.f31080u = 1;
                        arrayList.add(o12);
                        u61 o13 = u61.o(13, 35);
                        o13.f31080u = 1;
                        arrayList.add(o13);
                        u61 o14 = u61.o(14, 35);
                        o14.f31080u = 1;
                        arrayList.add(o14);
                        u61 o15 = u61.o(15, 35);
                        o15.f31080u = 1;
                        arrayList.add(o15);
                    }
                }
            }
        }
    }

    public static void V(g4 g4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        a2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.w2 w2Var = new yh.w2(bVar, tL_payments_paymentFormStarGift);
        Context context = g4Var.getContext();
        c6 c6Var = g4Var.resourcesProvider;
        int i10 = g4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.y2(context, c6Var, tL_starGiftUnique, w2Var, i10, j3, hg.c.k(tL_starGiftUnique.num, ',', sb2), true, new j90(g4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void W(g4 g4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.w2 w2Var, of.e eVar) {
        eVar.d();
        n5.x(g4Var.currentAccount, w2Var.f53564a).h(w2Var.f53565b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(g4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void X(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f51477c;
        if (u3Var.f51777g.isEmpty()) {
            return;
        }
        s80 s80Var = new s80(g4Var.container, g4Var.resourcesProvider, g4Var.f51491c0, false, true, false);
        s80Var.f30469t = false;
        s80Var.Y = true;
        s80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        s80Var.R = true;
        s80Var.f30463p = new ii.h(s80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f51777g);
        Collections.sort(arrayList, new z3(f4Var, 0));
        p71 p71Var = new p71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 1), new w3(f4Var, s80Var, 1), null, g4Var.resourcesProvider);
        p71Var.W2.f26679r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        uu uuVar = new uu(context, g4Var.resourcesProvider);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setInputType(573441);
        uuVar.setRawInputType(573441);
        uuVar.setHintTextColor(h6.w0(h6.A6, g4Var.resourcesProvider));
        uuVar.setCursorColor(h6.w0(h6.G6, g4Var.resourcesProvider));
        uuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        uuVar.setCursorWidth(1.5f);
        uuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        uuVar.setTextColor(h6.w0(h6.E8, g4Var.resourcesProvider));
        uuVar.setBackground(null);
        frameLayout.addView(uuVar, w5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        uuVar.addTextChangedListener(new jo(strArr, p71Var, false, 12));
        if (arrayList.size() > 8) {
            s80Var.r(frameLayout, w5.n(-1, 44));
            s80Var.k();
        }
        if (!u3Var.f51780k.isEmpty()) {
            s80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 1), false);
        }
        s80Var.q(p71Var);
        s80Var.Z();
    }

    @Override
    public final CharSequence A() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(R.string.GiftCraftSelectTitle);
    }

    @Override
    public final void G(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.f2 f2Var = this.f51493e0;
        float measuredHeight = y3 - f2Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / f2Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        f2Var.setScaleX(clamp01);
        f2Var.setScaleY(clamp01);
        f2Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        f2Var.setTranslationY(measuredHeight);
    }

    public final void a0() {
        int R;
        u61 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            wm0 wm0Var = this.d;
            if (i10 >= wm0Var.getChildCount()) {
                break;
            }
            View childAt = wm0Var.getChildAt(i10);
            if ((childAt instanceof m10) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f51497i0.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        f4 f4Var = this.Y;
        if (z10) {
            f4Var.f51476b.a();
        }
        if (z11) {
            f4Var.f51477c.g(false);
        }
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        e4 e4Var = new e4(this, wm0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.f51497i0 = e4Var;
        return e4Var;
    }
}
