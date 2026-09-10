package wh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.bp0;
import org.telegram.ui.w71;
import w7.a6;
import xh.n5;
import xh.v5;
public final class g4 extends ab {
    public static final int f44101k0 = 0;
    public final String X;
    public final f4 Y;
    public final HorizontalScrollView Z;
    public final k3 f44102a0;
    public final k3 f44103b0;
    public final k3 f44104c0;
    public final k3 f44105d0;
    public final xh.j2 f44106e0;
    public xh.w0 f44107f0;
    public final HashSet f44108g0;
    public boolean f44109h0;
    public e4 f44110i0;
    public boolean f44111j0;

    public g4(final Context context, String str, final f4 f4Var) {
        super(2, context, (f6) null, false);
        this.f44108g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = f4Var;
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
        k3 k3Var = new k3(context, this.resourcesProvider);
        this.f44102a0 = k3Var;
        k3Var.setSorting(f4Var.f44094c.f44380p);
        linearLayout.addView(k3Var, a6.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var.setOnClickListener(new w71(22, this, f4Var));
        k3 k3Var2 = new k3(context, this.resourcesProvider);
        this.f44103b0 = k3Var2;
        k3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(k3Var2, a6.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f44027b;

            {
                this.f44027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.R(this.f44027b, f4Var, context);
                        return;
                    case 1:
                        g4.W(this.f44027b, f4Var, context);
                        return;
                    default:
                        g4.S(this.f44027b, f4Var, context);
                        return;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourcesProvider);
        this.f44104c0 = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(k3Var3, a6.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f44027b;

            {
                this.f44027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.R(this.f44027b, f4Var, context);
                        return;
                    case 1:
                        g4.W(this.f44027b, f4Var, context);
                        return;
                    default:
                        g4.S(this.f44027b, f4Var, context);
                        return;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourcesProvider);
        this.f44105d0 = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(k3Var4, a6.t(-2, -2, 16, 0, 0, 0, 0));
        k3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f44027b;

            {
                this.f44027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.R(this.f44027b, f4Var, context);
                        return;
                    case 1:
                        g4.W(this.f44027b, f4Var, context);
                        return;
                    default:
                        g4.S(this.f44027b, f4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new bi.i2(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new sg.f0(8, this, f4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new al0(this, 14));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new u2.c(17));
        xh.j2 j2Var = new xh.j2(context);
        this.f44106e0 = j2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        j2Var.h = dp;
        j2Var.f45572n = dp2;
        j2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        j2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.y1(j2Var, 19), 12.0f, 12, null, new ArrayList());
        j2Var.setPivotY(0.0f);
        this.container.addView(j2Var, a6.e(-1, -2, 55));
        this.f44110i0.N(false);
        f4Var.d = new y3(this, 1);
    }

    public static void P(g4 g4Var, f4 f4Var) {
        w70 F = w70.F(g4Var.container, g4Var.resourcesProvider, g4Var.f44102a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f44361a), new x3(f4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f44361a), new x3(f4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f44361a), new x3(f4Var, 5), false);
        F.f28702t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(g4 g4Var, f4 f4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        yf.b bVar;
        v51 G = g4Var.f44110i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f27835r;
                if (!TextUtils.isEmpty(starGift.gift_address) && g4Var.f44109h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g4Var.getContext(), 0, g4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    d2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    hc.b.A(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(g4Var.getContext(), 3, null);
                    d2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(g4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = yf.b.f46929b;
                    } else {
                        bVar = yf.b.f46928a;
                    }
                    yf.b bVar2 = bVar;
                    v5.x(g4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new bp0(g4Var, d2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = f4Var.f44093b.f45761l;
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
                            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.f17528a;
                            d2Var3.R = string2;
                            d2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            hc.b.A(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    g4Var.f44107f0.run(starGift);
                    g4Var.dismiss();
                }
            }
        }
    }

    public static void R(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f44094c;
        if (u3Var.f44371f.isEmpty()) {
            return;
        }
        w70 w70Var = new w70(g4Var.container, g4Var.resourcesProvider, g4Var.f44103b0, false, true, false);
        w70Var.f28702t = false;
        w70Var.Y = true;
        w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        w70Var.R = true;
        w70Var.f28696p = new hi.i(w70Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f44371f);
        Collections.sort(arrayList, new z3(f4Var, 2));
        r61 r61Var = new r61(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 0), new w3(f4Var, w70Var, 0), null, g4Var.resourcesProvider);
        r61Var.Y2.f24250r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        fu fuVar = new fu(context, g4Var.resourcesProvider);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setInputType(573441);
        fuVar.setRawInputType(573441);
        fuVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourcesProvider));
        fuVar.setCursorColor(j6.v0(j6.G6, g4Var.resourcesProvider));
        fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        fuVar.setCursorWidth(1.5f);
        fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        fuVar.setTextColor(j6.v0(j6.E8, g4Var.resourcesProvider));
        fuVar.setBackground(null);
        frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        fuVar.addTextChangedListener(new og.x(strArr, r61Var, false, 11));
        if (arrayList.size() > 8) {
            w70Var.r(frameLayout, a6.n(-1, 44));
            w70Var.k();
        }
        if (!u3Var.f44374j.isEmpty()) {
            w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 0), false);
        }
        w70Var.q(r61Var);
        w70Var.Z();
    }

    public static void S(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f44094c;
        if (u3Var.h.isEmpty()) {
            return;
        }
        w70 w70Var = new w70(g4Var.container, g4Var.resourcesProvider, g4Var.f44105d0, false, true, false);
        w70Var.f28702t = false;
        w70Var.Y = true;
        w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        w70Var.R = true;
        w70Var.f28696p = new hi.i(w70Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new z3(f4Var, 1));
        r61 r61Var = new r61(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 2), new w3(f4Var, w70Var, 2), null, g4Var.resourcesProvider);
        r61Var.Y2.f24250r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        fu fuVar = new fu(context, g4Var.resourcesProvider);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setInputType(573441);
        fuVar.setRawInputType(573441);
        fuVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourcesProvider));
        fuVar.setCursorColor(j6.v0(j6.G6, g4Var.resourcesProvider));
        fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        fuVar.setCursorWidth(1.5f);
        fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        fuVar.setTextColor(j6.v0(j6.E8, g4Var.resourcesProvider));
        fuVar.setBackground(null);
        frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        fuVar.addTextChangedListener(new og.x(strArr, r61Var, false, 13));
        if (arrayList.size() > 8) {
            w70Var.r(frameLayout, a6.n(-1, 44));
            w70Var.k();
        }
        if (!u3Var.f44376l.isEmpty()) {
            w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 2), false);
        }
        w70Var.q(r61Var);
        w70Var.Z();
    }

    public static void T(g4 g4Var, ArrayList arrayList) {
        boolean z10;
        f4 f4Var = g4Var.Y;
        if (f4Var != null) {
            n5 n5Var = f4Var.f44093b;
            u3 u3Var = f4Var.f44094c;
            if (n5Var != null && u3Var != null) {
                int currentTime = ConnectionsManager.getInstance(g4Var.currentAccount).getCurrentTime();
                arrayList.add(v51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = n5Var.f45761l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z11 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!g4Var.f44108g0.contains(Long.valueOf(savedStarGift.gift.f17425id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v51 a2 = g1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f27825g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!n5Var.f45758i && n5Var.f45759j) {
                    if (z11) {
                        arrayList.add(v51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        v51 o9 = v51.o((i15 - i13) + 1, 35);
                        o9.f27838u = 1;
                        arrayList.add(o9);
                    }
                }
                if (u3Var.e > 0 || g4Var.f44111j0) {
                    g4Var.f44111j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    v51 v51Var = new v51(42);
                    v51Var.d = -2;
                    v51Var.f27832o = string;
                    arrayList.add(v51Var);
                    HorizontalScrollView horizontalScrollView = g4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(v51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = u3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(g1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (u3Var.f44384t || !u3Var.f44385u) {
                        v51 o10 = v51.o(10, 35);
                        o10.f27838u = 1;
                        arrayList.add(o10);
                        v51 o11 = v51.o(11, 35);
                        o11.f27838u = 1;
                        arrayList.add(o11);
                        v51 o12 = v51.o(12, 35);
                        o12.f27838u = 1;
                        arrayList.add(o12);
                        v51 o13 = v51.o(13, 35);
                        o13.f27838u = 1;
                        arrayList.add(o13);
                        v51 o14 = v51.o(14, 35);
                        o14.f27838u = 1;
                        arrayList.add(o14);
                        v51 o15 = v51.o(15, 35);
                        o15.f27838u = 1;
                        arrayList.add(o15);
                    }
                }
            }
        }
    }

    public static void U(g4 g4Var, org.telegram.ui.ActionBar.d2 d2Var, yf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        d2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        xh.a3 a3Var = new xh.a3(bVar, tL_payments_paymentFormStarGift);
        Context context = g4Var.getContext();
        f6 f6Var = g4Var.resourcesProvider;
        int i10 = g4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new xh.c3(context, f6Var, tL_starGiftUnique, a3Var, i10, j3, hc.b.l(tL_starGiftUnique.num, ',', sb2), true, new n80(g4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void V(g4 g4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, xh.a3 a3Var, nf.e eVar) {
        eVar.d();
        v5.x(g4Var.currentAccount, a3Var.f45239a).h(a3Var.f45240b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.g(g4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void W(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f44094c;
        if (u3Var.f44372g.isEmpty()) {
            return;
        }
        w70 w70Var = new w70(g4Var.container, g4Var.resourcesProvider, g4Var.f44104c0, false, true, false);
        w70Var.f28702t = false;
        w70Var.Y = true;
        w70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        w70Var.R = true;
        w70Var.f28696p = new hi.i(w70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f44372g);
        Collections.sort(arrayList, new z3(f4Var, 0));
        r61 r61Var = new r61(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 1), new w3(f4Var, w70Var, 1), null, g4Var.resourcesProvider);
        r61Var.Y2.f24250r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, a6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        fu fuVar = new fu(context, g4Var.resourcesProvider);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setInputType(573441);
        fuVar.setRawInputType(573441);
        fuVar.setHintTextColor(j6.v0(j6.A6, g4Var.resourcesProvider));
        fuVar.setCursorColor(j6.v0(j6.G6, g4Var.resourcesProvider));
        fuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        fuVar.setCursorWidth(1.5f);
        fuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        fuVar.setTextColor(j6.v0(j6.E8, g4Var.resourcesProvider));
        fuVar.setBackground(null);
        frameLayout.addView(fuVar, a6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        fuVar.addTextChangedListener(new og.x(strArr, r61Var, false, 12));
        if (arrayList.size() > 8) {
            w70Var.r(frameLayout, a6.n(-1, 44));
            w70Var.k();
        }
        if (!u3Var.f44375k.isEmpty()) {
            w70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 1), false);
        }
        w70Var.q(r61Var);
        w70Var.Z();
    }

    @Override
    public final void E(float f7) {
        float y3 = this.containerView.getY() + f7;
        xh.j2 j2Var = this.f44106e0;
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
        v51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            vl0 vl0Var = this.d;
            if (i10 >= vl0Var.getChildCount()) {
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if ((childAt instanceof a10) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f44110i0.G(R)) != null) {
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
            f4Var.f44093b.a();
        }
        if (z11) {
            f4Var.f44094c.g(false);
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        e4 e4Var = new e4(this, vl0Var, getContext(), this.currentAccount, new gi.a(this, 19), this.resourcesProvider);
        this.f44110i0 = e4Var;
        return e4Var;
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
