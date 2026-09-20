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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.cp0;
import org.telegram.ui.vy0;
import w7.y5;
import yh.l5;
import yh.u5;
public final class h4 extends ab {
    public static final int f46187k0 = 0;
    public final String X;
    public final g4 Y;
    public final HorizontalScrollView Z;
    public final m3 f46188a0;
    public final m3 f46189b0;
    public final m3 f46190c0;
    public final m3 f46191d0;
    public final yh.j2 f46192e0;
    public yh.w0 f46193f0;
    public final HashSet f46194g0;
    public boolean f46195h0;
    public f4 f46196i0;
    public boolean f46197j0;

    public h4(final Context context, String str, final g4 g4Var) {
        super(2, context, (f6) null, false);
        this.f46194g0 = new HashSet();
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
        this.f46188a0 = m3Var;
        m3Var.setSorting(g4Var.f46179c.f46482p);
        linearLayout.addView(m3Var, y5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var.setOnClickListener(new vy0(26, this, g4Var));
        m3 m3Var2 = new m3(context, this.resourcesProvider);
        this.f46189b0 = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(m3Var2, y5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f46111b;

            {
                this.f46111b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.R(this.f46111b, g4Var, context);
                        return;
                    case 1:
                        h4.W(this.f46111b, g4Var, context);
                        return;
                    default:
                        h4.S(this.f46111b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourcesProvider);
        this.f46190c0 = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(m3Var3, y5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f46111b;

            {
                this.f46111b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.R(this.f46111b, g4Var, context);
                        return;
                    case 1:
                        h4.W(this.f46111b, g4Var, context);
                        return;
                    default:
                        h4.S(this.f46111b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourcesProvider);
        this.f46191d0 = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(m3Var4, y5.t(-2, -2, 16, 0, 0, 0, 0));
        m3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f46111b;

            {
                this.f46111b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.R(this.f46111b, g4Var, context);
                        return;
                    case 1:
                        h4.W(this.f46111b, g4Var, context);
                        return;
                    default:
                        h4.S(this.f46111b, g4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new s5.e(14, this, g4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new sb0(this, 18));
        s4.j jVar = new s4.j();
        jVar.f43009m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new x2.h(5));
        yh.j2 j2Var = new yh.j2(context);
        this.f46192e0 = j2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        j2Var.h = dp;
        j2Var.f47594n = dp2;
        j2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        j2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.b1(j2Var, 23), 12.0f, 12, null, new ArrayList());
        j2Var.setPivotY(0.0f);
        this.container.addView(j2Var, y5.e(-1, -2, 55));
        this.f46196i0.N(false);
        g4Var.d = new z3(this, 1);
    }

    public static void P(h4 h4Var, g4 g4Var) {
        v70 F = v70.F(h4Var.container, h4Var.resourcesProvider, h4Var.f46188a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f46445a), new y3(g4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f46445a), new y3(g4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f46445a), new y3(g4Var, 5), false);
        F.f28995t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(h4 h4Var, g4 g4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        zf.b bVar;
        w51 G = h4Var.f46196i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f29954r;
                if (!TextUtils.isEmpty(starGift.gift_address) && h4Var.f46195h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h4Var.getContext(), 0, h4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(h4Var.getContext(), 3, null);
                    b2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(h4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = zf.b.f49255b;
                    } else {
                        bVar = zf.b.f49254a;
                    }
                    zf.b bVar2 = bVar;
                    u5.x(h4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new cp0(h4Var, b2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = g4Var.f46178b.f47690l;
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
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f18654a;
                            b2Var3.R = string2;
                            b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    h4Var.f46193f0.run(starGift);
                    h4Var.dismiss();
                }
            }
        }
    }

    public static void R(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f46179c;
        if (v3Var.f46473f.isEmpty()) {
            return;
        }
        v70 v70Var = new v70(h4Var.container, h4Var.resourcesProvider, h4Var.f46189b0, false, true, false);
        v70Var.f28995t = false;
        v70Var.Y = true;
        v70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        v70Var.R = true;
        v70Var.f28989p = new ii.h(v70Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f46473f);
        Collections.sort(arrayList, new a4(g4Var, 2));
        s61 s61Var = new s61(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 0), new x3(g4Var, v70Var, 0), null, h4Var.resourcesProvider);
        s61Var.Y2.f25678r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, h4Var.resourcesProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourcesProvider));
        buVar.setCursorColor(j6.v0(j6.G6, h4Var.resourcesProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, h4Var.resourcesProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, s61Var, false, 11));
        if (arrayList.size() > 8) {
            v70Var.r(frameLayout, y5.n(-1, 44));
            v70Var.k();
        }
        if (!v3Var.f46476j.isEmpty()) {
            v70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 0), false);
        }
        v70Var.q(s61Var);
        v70Var.Z();
    }

    public static void S(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f46179c;
        if (v3Var.h.isEmpty()) {
            return;
        }
        v70 v70Var = new v70(h4Var.container, h4Var.resourcesProvider, h4Var.f46191d0, false, true, false);
        v70Var.f28995t = false;
        v70Var.Y = true;
        v70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        v70Var.R = true;
        v70Var.f28989p = new ii.h(v70Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new a4(g4Var, 1));
        s61 s61Var = new s61(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 2), new x3(g4Var, v70Var, 2), null, h4Var.resourcesProvider);
        s61Var.Y2.f25678r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, h4Var.resourcesProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourcesProvider));
        buVar.setCursorColor(j6.v0(j6.G6, h4Var.resourcesProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, h4Var.resourcesProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, s61Var, false, 13));
        if (arrayList.size() > 8) {
            v70Var.r(frameLayout, y5.n(-1, 44));
            v70Var.k();
        }
        if (!v3Var.f46478l.isEmpty()) {
            v70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 2), false);
        }
        v70Var.q(s61Var);
        v70Var.Z();
    }

    public static void T(h4 h4Var, ArrayList arrayList) {
        boolean z10;
        g4 g4Var = h4Var.Y;
        if (g4Var != null) {
            l5 l5Var = g4Var.f46178b;
            v3 v3Var = g4Var.f46179c;
            if (l5Var != null && v3Var != null) {
                int currentTime = ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime();
                arrayList.add(w51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = l5Var.f47690l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z11 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!h4Var.f46194g0.contains(Long.valueOf(savedStarGift.gift.f18553id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w51 a2 = i1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f29944g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!l5Var.f47687i && l5Var.f47688j) {
                    if (z11) {
                        arrayList.add(w51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        w51 o9 = w51.o((i15 - i13) + 1, 35);
                        o9.f29957u = 1;
                        arrayList.add(o9);
                    }
                }
                if (v3Var.e > 0 || h4Var.f46197j0) {
                    h4Var.f46197j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    w51 w51Var = new w51(42);
                    w51Var.d = -2;
                    w51Var.f29951o = string;
                    arrayList.add(w51Var);
                    HorizontalScrollView horizontalScrollView = h4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(w51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = v3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(i1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (v3Var.f46486t || !v3Var.f46487u) {
                        w51 o10 = w51.o(10, 35);
                        o10.f29957u = 1;
                        arrayList.add(o10);
                        w51 o11 = w51.o(11, 35);
                        o11.f29957u = 1;
                        arrayList.add(o11);
                        w51 o12 = w51.o(12, 35);
                        o12.f29957u = 1;
                        arrayList.add(o12);
                        w51 o13 = w51.o(13, 35);
                        o13.f29957u = 1;
                        arrayList.add(o13);
                        w51 o14 = w51.o(14, 35);
                        o14.f29957u = 1;
                        arrayList.add(o14);
                        w51 o15 = w51.o(15, 35);
                        o15.f29957u = 1;
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
        f6 f6Var = h4Var.resourcesProvider;
        int i10 = h4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.d3(context, f6Var, tL_starGiftUnique, b3Var, i10, j3, hg.k0.j(tL_starGiftUnique.num, ',', sb2), true, new l80(h4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void V(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.b3 b3Var, nf.e eVar) {
        eVar.d();
        u5.x(h4Var.currentAccount, b3Var.f47270a).h(b3Var.f47271b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(h4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void W(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f46179c;
        if (v3Var.f46474g.isEmpty()) {
            return;
        }
        v70 v70Var = new v70(h4Var.container, h4Var.resourcesProvider, h4Var.f46190c0, false, true, false);
        v70Var.f28995t = false;
        v70Var.Y = true;
        v70Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        v70Var.R = true;
        v70Var.f28989p = new ii.h(v70Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f46474g);
        Collections.sort(arrayList, new a4(g4Var, 0));
        s61 s61Var = new s61(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 1), new x3(g4Var, v70Var, 1), null, h4Var.resourcesProvider);
        s61Var.Y2.f25678r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(j6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        bu buVar = new bu(context, h4Var.resourcesProvider);
        buVar.setTextSize(1, 16.0f);
        buVar.setInputType(573441);
        buVar.setRawInputType(573441);
        buVar.setHintTextColor(j6.v0(j6.A6, h4Var.resourcesProvider));
        buVar.setCursorColor(j6.v0(j6.G6, h4Var.resourcesProvider));
        buVar.setCursorSize(AndroidUtilities.dp(19.0f));
        buVar.setCursorWidth(1.5f);
        buVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        buVar.setTextColor(j6.v0(j6.E8, h4Var.resourcesProvider));
        buVar.setBackground(null);
        frameLayout.addView(buVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        buVar.addTextChangedListener(new qn(strArr, s61Var, false, 12));
        if (arrayList.size() > 8) {
            v70Var.r(frameLayout, y5.n(-1, 44));
            v70Var.k();
        }
        if (!v3Var.f46477k.isEmpty()) {
            v70Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 1), false);
        }
        v70Var.q(s61Var);
        v70Var.Z();
    }

    @Override
    public final void F(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.j2 j2Var = this.f46192e0;
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
        int S;
        w51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            vl0 vl0Var = this.d;
            if (i10 >= vl0Var.getChildCount()) {
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if ((childAt instanceof t00) && (S = RecyclerView.S(childAt) - 1) >= 0 && (G = this.f46196i0.G(S)) != null) {
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
            g4Var.f46178b.a();
        }
        if (z11) {
            g4Var.f46179c.g(false);
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        f4 f4Var = new f4(this, vl0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.f46196i0 = f4Var;
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
