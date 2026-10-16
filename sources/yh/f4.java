package yh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.fp0;
import w7.z5;
import zh.f5;
import zh.n5;
public final class f4 extends db {
    public static final int f48861k0 = 0;
    public final String X;
    public final e4 Y;
    public final HorizontalScrollView Z;
    public final k3 f48862a0;
    public final k3 f48863b0;
    public final k3 f48864c0;
    public final k3 f48865d0;
    public final zh.e2 f48866e0;
    public zh.v0 f48867f0;
    public final HashSet f48868g0;
    public boolean f48869h0;
    public d4 f48870i0;
    public boolean f48871j0;

    public f4(final Context context, String str, final e4 e4Var) {
        super(2, context, (c6) null, false);
        this.f48868g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = e4Var;
        this.e.setTitle(B());
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
        k3 k3Var = new k3(context, this.resourcesProvider);
        this.f48862a0 = k3Var;
        k3Var.setSorting(e4Var.f48850c.f49140p);
        linearLayout.addView(k3Var, z5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var.setOnClickListener(new a(2, this, e4Var));
        k3 k3Var2 = new k3(context, this.resourcesProvider);
        this.f48863b0 = k3Var2;
        k3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(k3Var2, z5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f49238b;

            {
                this.f49238b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.S(this.f49238b, e4Var, context);
                        return;
                    case 1:
                        f4.X(this.f49238b, e4Var, context);
                        return;
                    default:
                        f4.T(this.f49238b, e4Var, context);
                        return;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourcesProvider);
        this.f48864c0 = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(k3Var3, z5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f49238b;

            {
                this.f49238b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.S(this.f49238b, e4Var, context);
                        return;
                    case 1:
                        f4.X(this.f49238b, e4Var, context);
                        return;
                    default:
                        f4.T(this.f49238b, e4Var, context);
                        return;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourcesProvider);
        this.f48865d0 = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(k3Var4, z5.t(-2, -2, 16, 0, 0, 0, 0));
        k3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f49238b;

            {
                this.f49238b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.S(this.f49238b, e4Var, context);
                        return;
                    case 1:
                        f4.X(this.f49238b, e4Var, context);
                        return;
                    default:
                        f4.T(this.f49238b, e4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new di.w1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new org.telegram.ui.web.o0(23, this, e4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new kc0(this, 20));
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.d.setItemSelectorColorProvider(new t0.a(29));
        zh.e2 e2Var = new zh.e2(context);
        this.f48866e0 = e2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        e2Var.h = dp;
        e2Var.f50417n = dp2;
        e2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        e2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ji.p1(e2Var, 26), 12.0f, 12, null, new ArrayList());
        e2Var.setPivotY(0.0f);
        this.container.addView(e2Var, z5.e(-1, -2, 55));
        this.f48870i0.N(false);
        e4Var.d = new x3(this, 1);
    }

    public static void Q(f4 f4Var, e4 e4Var) {
        l80 F = l80.F(f4Var.container, f4Var.resourcesProvider, f4Var.f48862a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(s3.BY_PRICE.f49118a), new w3(e4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(s3.BY_DATE.f49118a), new w3(e4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(s3.BY_NUMBER.f49118a), new w3(e4Var, 5), false);
        F.f26669t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void R(f4 f4Var, e4 e4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        ag.b bVar;
        m61 G = f4Var.f48870i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f26952r;
                if (!TextUtils.isEmpty(starGift.gift_address) && f4Var.f48869h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f4Var.getContext(), 0, f4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(f4Var.getContext(), 3, null);
                    a2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(f4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = ag.b.f634b;
                    } else {
                        bVar = ag.b.f633a;
                    }
                    ag.b bVar2 = bVar;
                    n5.x(f4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new fp0(f4Var, a2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = e4Var.f48849b.f50510l;
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
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(f4Var.currentAccount).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f4Var.getContext());
                            String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder2.f19248a;
                            a2Var3.R = string2;
                            a2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    f4Var.f48867f0.run(starGift);
                    f4Var.dismiss();
                }
            }
        }
    }

    public static void S(f4 f4Var, e4 e4Var, Context context) {
        t3 t3Var = e4Var.f48850c;
        if (t3Var.f49131f.isEmpty()) {
            return;
        }
        l80 l80Var = new l80(f4Var.container, f4Var.resourcesProvider, f4Var.f48863b0, false, true, false);
        l80Var.f26669t = false;
        l80Var.Y = true;
        l80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        l80Var.R = true;
        l80Var.f26663p = new ji.h(l80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f49131f);
        Collections.sort(arrayList, new y3(e4Var, 2));
        i71 i71Var = new i71(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 0), new v3(e4Var, l80Var, 0), null, f4Var.resourcesProvider);
        i71Var.W2.f23145r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        nu nuVar = new nu(context, f4Var.resourcesProvider);
        nuVar.setTextSize(1, 16.0f);
        nuVar.setInputType(573441);
        nuVar.setRawInputType(573441);
        nuVar.setHintTextColor(g6.w0(g6.A6, f4Var.resourcesProvider));
        nuVar.setCursorColor(g6.w0(g6.G6, f4Var.resourcesProvider));
        nuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        nuVar.setCursorWidth(1.5f);
        nuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        nuVar.setTextColor(g6.w0(g6.E8, f4Var.resourcesProvider));
        nuVar.setBackground(null);
        frameLayout.addView(nuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        nuVar.addTextChangedListener(new eo(strArr, i71Var, false, 11));
        if (arrayList.size() > 8) {
            l80Var.r(frameLayout, z5.n(-1, 44));
            l80Var.k();
        }
        if (!t3Var.f49134j.isEmpty()) {
            l80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 0), false);
        }
        l80Var.q(i71Var);
        l80Var.Z();
    }

    public static void T(f4 f4Var, e4 e4Var, Context context) {
        t3 t3Var = e4Var.f48850c;
        if (t3Var.h.isEmpty()) {
            return;
        }
        l80 l80Var = new l80(f4Var.container, f4Var.resourcesProvider, f4Var.f48865d0, false, true, false);
        l80Var.f26669t = false;
        l80Var.Y = true;
        l80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        l80Var.R = true;
        l80Var.f26663p = new ji.h(l80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.h);
        Collections.sort(arrayList, new y3(e4Var, 1));
        i71 i71Var = new i71(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 2), new v3(e4Var, l80Var, 2), null, f4Var.resourcesProvider);
        i71Var.W2.f23145r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        nu nuVar = new nu(context, f4Var.resourcesProvider);
        nuVar.setTextSize(1, 16.0f);
        nuVar.setInputType(573441);
        nuVar.setRawInputType(573441);
        nuVar.setHintTextColor(g6.w0(g6.A6, f4Var.resourcesProvider));
        nuVar.setCursorColor(g6.w0(g6.G6, f4Var.resourcesProvider));
        nuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        nuVar.setCursorWidth(1.5f);
        nuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        nuVar.setTextColor(g6.w0(g6.E8, f4Var.resourcesProvider));
        nuVar.setBackground(null);
        frameLayout.addView(nuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        nuVar.addTextChangedListener(new eo(strArr, i71Var, false, 13));
        if (arrayList.size() > 8) {
            l80Var.r(frameLayout, z5.n(-1, 44));
            l80Var.k();
        }
        if (!t3Var.f49136l.isEmpty()) {
            l80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 2), false);
        }
        l80Var.q(i71Var);
        l80Var.Z();
    }

    public static void U(f4 f4Var, ArrayList arrayList) {
        boolean z10;
        e4 e4Var = f4Var.Y;
        if (e4Var != null) {
            f5 f5Var = e4Var.f48849b;
            t3 t3Var = e4Var.f48850c;
            if (f5Var != null && t3Var != null) {
                int currentTime = ConnectionsManager.getInstance(f4Var.currentAccount).getCurrentTime();
                arrayList.add(m61.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = f5Var.f50510l;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z11 = true;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!f4Var.f48868g0.contains(Long.valueOf(savedStarGift.gift.f19141id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m61 a2 = g1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f26942g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!f5Var.f50507i && f5Var.f50508j) {
                    if (z11) {
                        arrayList.add(m61.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        m61 o10 = m61.o((i15 - i13) + 1, 35);
                        o10.f26955u = 1;
                        arrayList.add(o10);
                    }
                }
                if (t3Var.e > 0 || f4Var.f48871j0) {
                    f4Var.f48871j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    m61 m61Var = new m61(42);
                    m61Var.d = -2;
                    m61Var.f26949o = string;
                    arrayList.add(m61Var);
                    HorizontalScrollView horizontalScrollView = f4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(m61.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = t3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(g1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (t3Var.f49144t || !t3Var.f49145u) {
                        m61 o11 = m61.o(10, 35);
                        o11.f26955u = 1;
                        arrayList.add(o11);
                        m61 o12 = m61.o(11, 35);
                        o12.f26955u = 1;
                        arrayList.add(o12);
                        m61 o13 = m61.o(12, 35);
                        o13.f26955u = 1;
                        arrayList.add(o13);
                        m61 o14 = m61.o(13, 35);
                        o14.f26955u = 1;
                        arrayList.add(o14);
                        m61 o15 = m61.o(14, 35);
                        o15.f26955u = 1;
                        arrayList.add(o15);
                        m61 o16 = m61.o(15, 35);
                        o16.f26955u = 1;
                        arrayList.add(o16);
                    }
                }
            }
        }
    }

    public static void V(f4 f4Var, org.telegram.ui.ActionBar.a2 a2Var, ag.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        a2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zh.v2 v2Var = new zh.v2(bVar, tL_payments_paymentFormStarGift);
        Context context = f4Var.getContext();
        c6 c6Var = f4Var.resourcesProvider;
        int i10 = f4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new zh.x2(context, c6Var, tL_starGiftUnique, v2Var, i10, j10, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), true, new c90(f4Var, tL_starGiftUnique, j10, 1)).b();
    }

    public static void W(f4 f4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, zh.v2 v2Var, pf.c cVar) {
        cVar.d();
        n5.x(f4Var.currentAccount, v2Var.f51234a).h(v2Var.f51235b, tL_starGiftUnique, j10, null, true, new org.telegram.tgnet.e(f4Var, cVar, tL_starGiftUnique, 6));
    }

    public static void X(f4 f4Var, e4 e4Var, Context context) {
        t3 t3Var = e4Var.f48850c;
        if (t3Var.f49132g.isEmpty()) {
            return;
        }
        l80 l80Var = new l80(f4Var.container, f4Var.resourcesProvider, f4Var.f48864c0, false, true, false);
        l80Var.f26669t = false;
        l80Var.Y = true;
        l80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        l80Var.R = true;
        l80Var.f26663p = new ji.h(l80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f49132g);
        Collections.sort(arrayList, new y3(e4Var, 0));
        i71 i71Var = new i71(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 1), new v3(e4Var, l80Var, 1), null, f4Var.resourcesProvider);
        i71Var.W2.f23145r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(g6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        nu nuVar = new nu(context, f4Var.resourcesProvider);
        nuVar.setTextSize(1, 16.0f);
        nuVar.setInputType(573441);
        nuVar.setRawInputType(573441);
        nuVar.setHintTextColor(g6.w0(g6.A6, f4Var.resourcesProvider));
        nuVar.setCursorColor(g6.w0(g6.G6, f4Var.resourcesProvider));
        nuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        nuVar.setCursorWidth(1.5f);
        nuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        nuVar.setTextColor(g6.w0(g6.E8, f4Var.resourcesProvider));
        nuVar.setBackground(null);
        frameLayout.addView(nuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        nuVar.addTextChangedListener(new eo(strArr, i71Var, false, 12));
        if (arrayList.size() > 8) {
            l80Var.r(frameLayout, z5.n(-1, 44));
            l80Var.k();
        }
        if (!t3Var.f49135k.isEmpty()) {
            l80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 1), false);
        }
        l80Var.q(i71Var);
        l80Var.Z();
    }

    @Override
    public final CharSequence B() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(R.string.GiftCraftSelectTitle);
    }

    @Override
    public final void G(float f7) {
        float y3 = this.containerView.getY() + f7;
        zh.e2 e2Var = this.f48866e0;
        float measuredHeight = y3 - e2Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / e2Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        e2Var.setScaleX(clamp01);
        e2Var.setScaleY(clamp01);
        e2Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        e2Var.setTranslationY(measuredHeight);
    }

    public final void a0() {
        int R;
        m61 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            mm0 mm0Var = this.d;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if ((childAt instanceof f10) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f48870i0.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        e4 e4Var = this.Y;
        if (z10) {
            e4Var.f48849b.a();
        }
        if (z11) {
            e4Var.f48850c.g(false);
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        d4 d4Var = new d4(this, mm0Var, getContext(), this.currentAccount, new ii.a(this, 19), this.resourcesProvider);
        this.f48870i0 = d4Var;
        return d4Var;
    }
}
