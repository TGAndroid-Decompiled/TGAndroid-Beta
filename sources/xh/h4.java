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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.py0;
import org.telegram.ui.uo0;
import w7.z5;
import yh.k5;
import yh.t5;
public final class h4 extends cb {
    public static final int f49972k0 = 0;
    public final String X;
    public final g4 Y;
    public final HorizontalScrollView Z;
    public final m3 f49973a0;
    public final m3 f49974b0;
    public final m3 f49975c0;
    public final m3 f49976d0;
    public final yh.i2 f49977e0;
    public yh.w0 f49978f0;
    public final HashSet f49979g0;
    public boolean f49980h0;
    public f4 f49981i0;
    public boolean f49982j0;

    public h4(final Context context, String str, final g4 g4Var) {
        super(2, context, (d6) null, false);
        this.f49979g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = g4Var;
        this.f25301e.setTitle(y());
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
        this.f49973a0 = m3Var;
        m3Var.setSorting(g4Var.f49964c.f50285p);
        linearLayout.addView(m3Var, z5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var.setOnClickListener(new py0(26, this, g4Var));
        m3 m3Var2 = new m3(context, this.resourcesProvider);
        this.f49974b0 = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(m3Var2, z5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f49894b;

            {
                this.f49894b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.P(this.f49894b, g4Var, context);
                        return;
                    case 1:
                        h4.U(this.f49894b, g4Var, context);
                        return;
                    default:
                        h4.Q(this.f49894b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourcesProvider);
        this.f49975c0 = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(m3Var3, z5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f49894b;

            {
                this.f49894b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.P(this.f49894b, g4Var, context);
                        return;
                    case 1:
                        h4.U(this.f49894b, g4Var, context);
                        return;
                    default:
                        h4.Q(this.f49894b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourcesProvider);
        this.f49976d0 = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(m3Var4, z5.t(-2, -2, 16, 0, 0, 0, 0));
        m3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f49894b;

            {
                this.f49894b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.P(this.f49894b, g4Var, context);
                        return;
                    case 1:
                        h4.U(this.f49894b, g4Var, context);
                        return;
                    default:
                        h4.Q(this.f49894b, g4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new rg.x(16, this, g4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new xb0(this, 18));
        s4.j jVar = new s4.j();
        jVar.f46562m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new u2.l0(19));
        yh.i2 i2Var = new yh.i2(context);
        this.f49977e0 = i2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        i2Var.h = dp;
        i2Var.f51419n = dp2;
        i2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        i2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(i2Var, 26), 12.0f, 12, null, new ArrayList());
        i2Var.setPivotY(0.0f);
        this.container.addView(i2Var, z5.e(-1, -2, 55));
        this.f49981i0.N(false);
        g4Var.d = new z3(this, 1);
    }

    public static void N(h4 h4Var, g4 g4Var) {
        b80 F = b80.F(h4Var.container, h4Var.resourcesProvider, h4Var.f49973a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f50247a), new y3(g4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f50247a), new y3(g4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f50247a), new y3(g4Var, 5), false);
        F.f24845t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void O(h4 h4Var, g4 g4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        zf.b bVar;
        g61 G = h4Var.f49981i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f26674r;
                if (!TextUtils.isEmpty(starGift.gift_address) && h4Var.f49980h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h4Var.getContext(), 0, h4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(h4Var.getContext(), 3, null);
                    b2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(h4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = zf.b.f53297b;
                    } else {
                        bVar = zf.b.f53296a;
                    }
                    zf.b bVar2 = bVar;
                    t5.x(h4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new uo0(h4Var, b2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = g4Var.f49963b.f51527l;
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
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20367a;
                            b2Var3.R = string2;
                            b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    h4Var.f49978f0.run(starGift);
                    h4Var.dismiss();
                }
            }
        }
    }

    public static void P(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f49964c;
        if (v3Var.f50276f.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(h4Var.container, h4Var.resourcesProvider, h4Var.f49974b0, false, true, false);
        b80Var.f24845t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.f24839p = new ii.h(b80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f50276f);
        Collections.sort(arrayList, new a4(g4Var, 2));
        c71 c71Var = new c71(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 0), new x3(g4Var, b80Var, 0), null, h4Var.resourcesProvider);
        c71Var.f25244f3.f31306r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, h4Var.resourcesProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourcesProvider));
        euVar.setCursorColor(i6.v0(i6.G6, h4Var.resourcesProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, h4Var.resourcesProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, c71Var, false, 11));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.f50279j.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 0), false);
        }
        b80Var.q(c71Var);
        b80Var.Z();
    }

    public static void Q(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f49964c;
        if (v3Var.h.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(h4Var.container, h4Var.resourcesProvider, h4Var.f49976d0, false, true, false);
        b80Var.f24845t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.f24839p = new ii.h(b80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new a4(g4Var, 1));
        c71 c71Var = new c71(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 2), new x3(g4Var, b80Var, 2), null, h4Var.resourcesProvider);
        c71Var.f25244f3.f31306r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, h4Var.resourcesProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourcesProvider));
        euVar.setCursorColor(i6.v0(i6.G6, h4Var.resourcesProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, h4Var.resourcesProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, c71Var, false, 13));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.f50281l.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 2), false);
        }
        b80Var.q(c71Var);
        b80Var.Z();
    }

    public static void R(h4 h4Var, ArrayList arrayList) {
        boolean z10;
        g4 g4Var = h4Var.Y;
        if (g4Var != null) {
            k5 k5Var = g4Var.f49963b;
            v3 v3Var = g4Var.f49964c;
            if (k5Var != null && v3Var != null) {
                int currentTime = ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime();
                arrayList.add(g61.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = k5Var.f51527l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z11 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!h4Var.f49979g0.contains(Long.valueOf(savedStarGift.gift.f20264id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g61 a2 = h1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f26664g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!k5Var.f51524i && k5Var.f51525j) {
                    if (z11) {
                        arrayList.add(g61.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        g61 p5 = g61.p((i15 - i13) + 1, 35);
                        p5.f26677u = 1;
                        arrayList.add(p5);
                    }
                }
                if (v3Var.f50275e > 0 || h4Var.f49982j0) {
                    h4Var.f49982j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    g61 g61Var = new g61(42);
                    g61Var.d = -2;
                    g61Var.f26671o = string;
                    arrayList.add(g61Var);
                    HorizontalScrollView horizontalScrollView = h4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(g61.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = v3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(h1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (v3Var.f50289t || !v3Var.f50290u) {
                        g61 p10 = g61.p(10, 35);
                        p10.f26677u = 1;
                        arrayList.add(p10);
                        g61 p11 = g61.p(11, 35);
                        p11.f26677u = 1;
                        arrayList.add(p11);
                        g61 p12 = g61.p(12, 35);
                        p12.f26677u = 1;
                        arrayList.add(p12);
                        g61 p13 = g61.p(13, 35);
                        p13.f26677u = 1;
                        arrayList.add(p13);
                        g61 p14 = g61.p(14, 35);
                        p14.f26677u = 1;
                        arrayList.add(p14);
                        g61 p15 = g61.p(15, 35);
                        p15.f26677u = 1;
                        arrayList.add(p15);
                    }
                }
            }
        }
    }

    public static void S(h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.a3 a3Var = new yh.a3(bVar, tL_payments_paymentFormStarGift);
        Context context = h4Var.getContext();
        d6 d6Var = h4Var.resourcesProvider;
        int i10 = h4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.c3(context, d6Var, tL_starGiftUnique, a3Var, i10, j3, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2), true, new r80(h4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void T(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.a3 a3Var, nf.e eVar) {
        eVar.d();
        t5.x(h4Var.currentAccount, a3Var.f51084a).h(a3Var.f51085b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(h4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void U(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f49964c;
        if (v3Var.f50277g.isEmpty()) {
            return;
        }
        b80 b80Var = new b80(h4Var.container, h4Var.resourcesProvider, h4Var.f49975c0, false, true, false);
        b80Var.f24845t = false;
        b80Var.Y = true;
        b80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        b80Var.R = true;
        b80Var.f24839p = new ii.h(b80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f50277g);
        Collections.sort(arrayList, new a4(g4Var, 0));
        c71 c71Var = new c71(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 1), new x3(g4Var, b80Var, 1), null, h4Var.resourcesProvider);
        c71Var.f25244f3.f31306r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        eu euVar = new eu(context, h4Var.resourcesProvider);
        euVar.setTextSize(1, 16.0f);
        euVar.setInputType(573441);
        euVar.setRawInputType(573441);
        euVar.setHintTextColor(i6.v0(i6.A6, h4Var.resourcesProvider));
        euVar.setCursorColor(i6.v0(i6.G6, h4Var.resourcesProvider));
        euVar.setCursorSize(AndroidUtilities.dp(19.0f));
        euVar.setCursorWidth(1.5f);
        euVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        euVar.setTextColor(i6.v0(i6.E8, h4Var.resourcesProvider));
        euVar.setBackground(null);
        frameLayout.addView(euVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        euVar.addTextChangedListener(new tn(strArr, c71Var, false, 12));
        if (arrayList.size() > 8) {
            b80Var.r(frameLayout, z5.n(-1, 44));
            b80Var.k();
        }
        if (!v3Var.f50280k.isEmpty()) {
            b80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 1), false);
        }
        b80Var.q(c71Var);
        b80Var.Z();
    }

    @Override
    public final void D(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.i2 i2Var = this.f49977e0;
        float measuredHeight = y3 - i2Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / i2Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        i2Var.setScaleX(clamp01);
        i2Var.setScaleY(clamp01);
        i2Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        i2Var.setTranslationY(measuredHeight);
    }

    public final void Y() {
        int R;
        g61 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            zl0 zl0Var = this.d;
            if (i10 >= zl0Var.getChildCount()) {
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt instanceof w00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f49981i0.G(R)) != null) {
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
            g4Var.f49963b.a();
        }
        if (z11) {
            g4Var.f49964c.g(false);
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        f4 f4Var = new f4(this, zl0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.f49981i0 = f4Var;
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
