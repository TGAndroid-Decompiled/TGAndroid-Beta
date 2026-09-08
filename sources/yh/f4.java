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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zt;
import org.telegram.ui.cp0;
import org.telegram.ui.wy0;
import w7.x5;
import zh.j5;
import zh.s5;
public final class f4 extends bb {
    public static final int f50304k0 = 0;
    public final String X;
    public final e4 Y;
    public final HorizontalScrollView Z;
    public final k3 f50305a0;
    public final k3 f50306b0;
    public final k3 f50307c0;
    public final k3 f50308d0;
    public final zh.i2 f50309e0;
    public zh.w0 f50310f0;
    public final HashSet f50311g0;
    public boolean f50312h0;
    public d4 f50313i0;
    public boolean f50314j0;

    public f4(final Context context, String str, final e4 e4Var) {
        super(2, context, (f6) null, false);
        this.f50311g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = e4Var;
        this.f24674e.setTitle(y());
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
        this.f50305a0 = k3Var;
        k3Var.setSorting(e4Var.f50294c.f50598p);
        linearLayout.addView(k3Var, x5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var.setOnClickListener(new wy0(26, this, e4Var));
        k3 k3Var2 = new k3(context, this.resourcesProvider);
        this.f50306b0 = k3Var2;
        k3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(k3Var2, x5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f50701b;

            {
                this.f50701b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.R(this.f50701b, e4Var, context);
                        return;
                    case 1:
                        f4.W(this.f50701b, e4Var, context);
                        return;
                    default:
                        f4.S(this.f50701b, e4Var, context);
                        return;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourcesProvider);
        this.f50307c0 = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(k3Var3, x5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f50701b;

            {
                this.f50701b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.R(this.f50701b, e4Var, context);
                        return;
                    case 1:
                        f4.W(this.f50701b, e4Var, context);
                        return;
                    default:
                        f4.S(this.f50701b, e4Var, context);
                        return;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourcesProvider);
        this.f50308d0 = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(k3Var4, x5.t(-2, -2, 16, 0, 0, 0, 0));
        k3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f50701b;

            {
                this.f50701b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.R(this.f50701b, e4Var, context);
                        return;
                    case 1:
                        f4.W(this.f50701b, e4Var, context);
                        return;
                    default:
                        f4.S(this.f50701b, e4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new di.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new sg.x(14, this, e4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new lb0(this, 17));
        s4.j jVar = new s4.j();
        jVar.f45805m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new t0.a(27));
        zh.i2 i2Var = new zh.i2(context);
        this.f50309e0 = i2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        i2Var.h = dp;
        i2Var.f52057n = dp2;
        i2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        i2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.b1(i2Var, 23), 12.0f, 12, null, new ArrayList());
        i2Var.setPivotY(0.0f);
        this.container.addView(i2Var, x5.e(-1, -2, 55));
        this.f50313i0.N(false);
        e4Var.d = new x3(this, 1);
    }

    public static void P(f4 f4Var, e4 e4Var) {
        n70 F = n70.F(f4Var.container, f4Var.resourcesProvider, f4Var.f50305a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(s3.BY_PRICE.f50575a), new w3(e4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(s3.BY_DATE.f50575a), new w3(e4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(s3.BY_NUMBER.f50575a), new w3(e4Var, 5), false);
        F.f28688t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(f4 f4Var, e4 e4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        zf.b bVar;
        h51 G = f4Var.f50313i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f26627r;
                if (!TextUtils.isEmpty(starGift.gift_address) && f4Var.f50312h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f4Var.getContext(), 0, f4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    i2.g.B(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(f4Var.getContext(), 3, null);
                    b2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(f4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = zf.b.f51656b;
                    } else {
                        bVar = zf.b.f51655a;
                    }
                    zf.b bVar2 = bVar;
                    s5.x(f4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new cp0(f4Var, b2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = e4Var.f50293b.f52132l;
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
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20225a;
                            b2Var3.R = string2;
                            b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            i2.g.B(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    f4Var.f50310f0.run(starGift);
                    f4Var.dismiss();
                }
            }
        }
    }

    public static void R(f4 f4Var, e4 e4Var, Context context) {
        t3 t3Var = e4Var.f50294c;
        if (t3Var.f50589f.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(f4Var.container, f4Var.resourcesProvider, f4Var.f50306b0, false, true, false);
        n70Var.f28688t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f28682p = new ji.h(n70Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50589f);
        Collections.sort(arrayList, new y3(e4Var, 2));
        d61 d61Var = new d61(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 0), new v3(e4Var, n70Var, 0), null, f4Var.resourcesProvider);
        d61Var.Y2.f31162r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zt ztVar = new zt(context, f4Var.resourcesProvider);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setInputType(573441);
        ztVar.setRawInputType(573441);
        ztVar.setHintTextColor(j6.v0(j6.A6, f4Var.resourcesProvider));
        ztVar.setCursorColor(j6.v0(j6.G6, f4Var.resourcesProvider));
        ztVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ztVar.setCursorWidth(1.5f);
        ztVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ztVar.setTextColor(j6.v0(j6.E8, f4Var.resourcesProvider));
        ztVar.setBackground(null);
        frameLayout.addView(ztVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ztVar.addTextChangedListener(new pn(strArr, d61Var, false, 11));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!t3Var.f50592j.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 0), false);
        }
        n70Var.q(d61Var);
        n70Var.Z();
    }

    public static void S(f4 f4Var, e4 e4Var, Context context) {
        t3 t3Var = e4Var.f50294c;
        if (t3Var.h.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(f4Var.container, f4Var.resourcesProvider, f4Var.f50308d0, false, true, false);
        n70Var.f28688t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f28682p = new ji.h(n70Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.h);
        Collections.sort(arrayList, new y3(e4Var, 1));
        d61 d61Var = new d61(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 2), new v3(e4Var, n70Var, 2), null, f4Var.resourcesProvider);
        d61Var.Y2.f31162r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zt ztVar = new zt(context, f4Var.resourcesProvider);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setInputType(573441);
        ztVar.setRawInputType(573441);
        ztVar.setHintTextColor(j6.v0(j6.A6, f4Var.resourcesProvider));
        ztVar.setCursorColor(j6.v0(j6.G6, f4Var.resourcesProvider));
        ztVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ztVar.setCursorWidth(1.5f);
        ztVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ztVar.setTextColor(j6.v0(j6.E8, f4Var.resourcesProvider));
        ztVar.setBackground(null);
        frameLayout.addView(ztVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ztVar.addTextChangedListener(new pn(strArr, d61Var, false, 13));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!t3Var.f50594l.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 2), false);
        }
        n70Var.q(d61Var);
        n70Var.Z();
    }

    public static void T(f4 f4Var, ArrayList arrayList) {
        boolean z10;
        e4 e4Var = f4Var.Y;
        if (e4Var != null) {
            j5 j5Var = e4Var.f50293b;
            t3 t3Var = e4Var.f50294c;
            if (j5Var != null && t3Var != null) {
                int currentTime = ConnectionsManager.getInstance(f4Var.currentAccount).getCurrentTime();
                arrayList.add(h51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = j5Var.f52132l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z11 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!f4Var.f50311g0.contains(Long.valueOf(savedStarGift.gift.f20124id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h51 a2 = g1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f26617g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!j5Var.f52129i && j5Var.f52130j) {
                    if (z11) {
                        arrayList.add(h51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        h51 o9 = h51.o((i15 - i13) + 1, 35);
                        o9.f26630u = 1;
                        arrayList.add(o9);
                    }
                }
                if (t3Var.f50588e > 0 || f4Var.f50314j0) {
                    f4Var.f50314j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    h51 h51Var = new h51(42);
                    h51Var.d = -2;
                    h51Var.f26624o = string;
                    arrayList.add(h51Var);
                    HorizontalScrollView horizontalScrollView = f4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(h51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = t3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(g1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (t3Var.f50602t || !t3Var.f50603u) {
                        h51 o10 = h51.o(10, 35);
                        o10.f26630u = 1;
                        arrayList.add(o10);
                        h51 o11 = h51.o(11, 35);
                        o11.f26630u = 1;
                        arrayList.add(o11);
                        h51 o12 = h51.o(12, 35);
                        o12.f26630u = 1;
                        arrayList.add(o12);
                        h51 o13 = h51.o(13, 35);
                        o13.f26630u = 1;
                        arrayList.add(o13);
                        h51 o14 = h51.o(14, 35);
                        o14.f26630u = 1;
                        arrayList.add(o14);
                        h51 o15 = h51.o(15, 35);
                        o15.f26630u = 1;
                        arrayList.add(o15);
                    }
                }
            }
        }
    }

    public static void U(f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        zh.a3 a3Var = new zh.a3(bVar, tL_payments_paymentFormStarGift);
        Context context = f4Var.getContext();
        f6 f6Var = f4Var.resourcesProvider;
        int i10 = f4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new zh.c3(context, f6Var, tL_starGiftUnique, a3Var, i10, j3, i2.g.k(tL_starGiftUnique.num, ',', sb2), true, new d80(f4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void V(f4 f4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, zh.a3 a3Var, of.e eVar) {
        eVar.d();
        s5.x(f4Var.currentAccount, a3Var.f51706a).h(a3Var.f51707b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(f4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void W(f4 f4Var, e4 e4Var, Context context) {
        t3 t3Var = e4Var.f50294c;
        if (t3Var.f50590g.isEmpty()) {
            return;
        }
        n70 n70Var = new n70(f4Var.container, f4Var.resourcesProvider, f4Var.f50307c0, false, true, false);
        n70Var.f28688t = false;
        n70Var.Y = true;
        n70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        n70Var.R = true;
        n70Var.f28682p = new ji.h(n70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50590g);
        Collections.sort(arrayList, new y3(e4Var, 0));
        d61 d61Var = new d61(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 1), new v3(e4Var, n70Var, 1), null, f4Var.resourcesProvider);
        d61Var.Y2.f31162r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        zt ztVar = new zt(context, f4Var.resourcesProvider);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setInputType(573441);
        ztVar.setRawInputType(573441);
        ztVar.setHintTextColor(j6.v0(j6.A6, f4Var.resourcesProvider));
        ztVar.setCursorColor(j6.v0(j6.G6, f4Var.resourcesProvider));
        ztVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ztVar.setCursorWidth(1.5f);
        ztVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ztVar.setTextColor(j6.v0(j6.E8, f4Var.resourcesProvider));
        ztVar.setBackground(null);
        frameLayout.addView(ztVar, x5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        ztVar.addTextChangedListener(new pn(strArr, d61Var, false, 12));
        if (arrayList.size() > 8) {
            n70Var.r(frameLayout, x5.n(-1, 44));
            n70Var.k();
        }
        if (!t3Var.f50593k.isEmpty()) {
            n70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 1), false);
        }
        n70Var.q(d61Var);
        n70Var.Z();
    }

    @Override
    public final void F(float f7) {
        float y3 = this.containerView.getY() + f7;
        zh.i2 i2Var = this.f50309e0;
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

    public final void Z() {
        int R;
        h51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ll0 ll0Var = this.d;
            if (i10 >= ll0Var.getChildCount()) {
                break;
            }
            View childAt = ll0Var.getChildAt(i10);
            if ((childAt instanceof t00) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f50313i0.G(R)) != null) {
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
            e4Var.f50293b.a();
        }
        if (z11) {
            e4Var.f50294c.g(false);
        }
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        d4 d4Var = new d4(this, ll0Var, getContext(), this.currentAccount, new ii.a(this, 19), this.resourcesProvider);
        this.f50313i0 = d4Var;
        return d4Var;
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
