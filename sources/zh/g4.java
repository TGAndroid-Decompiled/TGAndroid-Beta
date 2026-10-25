package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.ca;
import bi.d6;
import bi.g5;
import bi.g6;
import bi.lc;
import bi.t9;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.ro0;
public final class g4 extends bb {
    public static final int f53009k0 = 0;
    public final String X;
    public final f4 Y;
    public final HorizontalScrollView Z;
    public final l3 f53010a0;
    public final l3 f53011b0;
    public final l3 f53012c0;
    public final l3 f53013d0;
    public final g5 f53014e0;
    public bi.p2 f53015f0;
    public final HashSet f53016g0;
    public boolean f53017h0;
    public e4 f53018i0;
    public boolean f53019j0;

    public g4(final Context context, String str, final f4 f4Var) {
        super(2, context, (u6) null, false);
        this.f53016g0 = new HashSet();
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
        l3 l3Var = new l3(context, this.resourcesProvider);
        this.f53010a0 = l3Var;
        l3Var.setSorting(f4Var.f52972c.f53274p);
        linearLayout.addView(l3Var, gb1.x(-2, -2, 16, 0, 0, 6, 0));
        l3Var.setOnClickListener(new org.telegram.ui.web.c(14, this, f4Var));
        l3 l3Var2 = new l3(context, this.resourcesProvider);
        this.f53011b0 = l3Var2;
        l3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(l3Var2, gb1.x(-2, -2, 16, 0, 0, 6, 0));
        l3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f52898b;

            {
                this.f52898b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.R(this.f52898b, f4Var, context);
                        return;
                    case 1:
                        g4.W(this.f52898b, f4Var, context);
                        return;
                    default:
                        g4.S(this.f52898b, f4Var, context);
                        return;
                }
            }
        });
        l3 l3Var3 = new l3(context, this.resourcesProvider);
        this.f53012c0 = l3Var3;
        l3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(l3Var3, gb1.x(-2, -2, 16, 0, 0, 6, 0));
        l3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f52898b;

            {
                this.f52898b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.R(this.f52898b, f4Var, context);
                        return;
                    case 1:
                        g4.W(this.f52898b, f4Var, context);
                        return;
                    default:
                        g4.S(this.f52898b, f4Var, context);
                        return;
                }
            }
        });
        l3 l3Var4 = new l3(context, this.resourcesProvider);
        this.f53013d0 = l3Var4;
        l3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(l3Var4, gb1.x(-2, -2, 16, 0, 0, 0, 0));
        l3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f52898b;

            {
                this.f52898b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.R(this.f52898b, f4Var, context);
                        return;
                    case 1:
                        g4.W(this.f52898b, f4Var, context);
                        return;
                    default:
                        g4.S(this.f52898b, f4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.t tVar = new s4.t(3);
        tVar.O = new ai.l(this, 9);
        this.d.setLayoutManager(tVar);
        this.d.setOnItemClickListener(new o2(this, f4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new ml(this, 29));
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setItemSelectorColorProvider(new vg.d(19));
        g5 g5Var = new g5(context);
        this.f53014e0 = g5Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        g5Var.h = dp;
        g5Var.f4657n = dp2;
        g5Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        g5Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ai.i(g5Var, 6), 12.0f, 12, null, new ArrayList());
        g5Var.setPivotY(0.0f);
        this.container.addView(g5Var, gb1.i(-1, -2, 55));
        this.f53018i0.O(false);
        f4Var.d = new y3(this, 1);
    }

    public static void P(g4 g4Var, f4 f4Var) {
        k80 F = k80.F(g4Var.container, g4Var.resourcesProvider, g4Var.f53010a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(t3.BY_PRICE.f53253a), new x3(f4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(t3.BY_DATE.f53253a), new x3(f4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(t3.BY_NUMBER.f53253a), new x3(f4Var, 5), false);
        F.f29867t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(g4 g4Var, f4 f4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        bg.b bVar;
        t61 G = g4Var.f53018i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f32878r;
                if (!TextUtils.isEmpty(starGift.gift_address) && g4Var.f53017h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g4Var.getContext(), 0, g4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.R = string;
                    e2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(g4Var.getContext(), 3, null);
                    e2Var2.r(400L);
                    long clientUserId = UserConfig.getInstance(g4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = bg.b.f3981b;
                    } else {
                        bVar = bg.b.f3980a;
                    }
                    bg.b bVar2 = bVar;
                    ca.x(g4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new ro0(g4Var, e2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = f4Var.f52971b.f5471l;
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
                            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder2.f22366a;
                            e2Var3.R = string2;
                            e2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    g4Var.f53015f0.run(starGift);
                    g4Var.dismiss();
                }
            }
        }
    }

    public static void R(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f52972c;
        if (u3Var.f53265f.isEmpty()) {
            return;
        }
        k80 k80Var = new k80(g4Var.container, g4Var.resourcesProvider, g4Var.f53011b0, false, true, false);
        k80Var.f29867t = false;
        k80Var.Y = true;
        k80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        k80Var.R = true;
        k80Var.f29861p = new li.h(k80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f53265f);
        Collections.sort(arrayList, new z3(f4Var, 2));
        r71 r71Var = new r71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 0), new w3(f4Var, k80Var, 0), null, g4Var.resourcesProvider);
        r71Var.f32150g3.f29505r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        f7.t(imageView, y6.F8, g4Var.resourcesProvider, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ju juVar = new ju(context, g4Var.resourcesProvider);
        juVar.setTextSize(1, 16.0f);
        juVar.setInputType(573441);
        juVar.setRawInputType(573441);
        f7.E(juVar, y6.A6, g4Var.resourcesProvider);
        f7.m(juVar, 30, y6.G6, g4Var.resourcesProvider);
        juVar.setCursorSize(AndroidUtilities.dp(19.0f));
        juVar.setCursorWidth(1.5f);
        juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        f7.V(juVar, y6.E8, g4Var.resourcesProvider);
        juVar.setBackground(null);
        frameLayout.addView(juVar, gb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        juVar.addTextChangedListener(new bo(strArr, r71Var, false, 11));
        if (arrayList.size() > 8) {
            k80Var.r(frameLayout, gb1.r(-1, 44));
            k80Var.k();
        }
        if (!u3Var.f53268j.isEmpty()) {
            k80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 0), false);
        }
        k80Var.q(r71Var);
        k80Var.Z();
    }

    public static void S(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f52972c;
        if (u3Var.h.isEmpty()) {
            return;
        }
        k80 k80Var = new k80(g4Var.container, g4Var.resourcesProvider, g4Var.f53013d0, false, true, false);
        k80Var.f29867t = false;
        k80Var.Y = true;
        k80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        k80Var.R = true;
        k80Var.f29861p = new li.h(k80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.h);
        Collections.sort(arrayList, new z3(f4Var, 1));
        r71 r71Var = new r71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 2), new w3(f4Var, k80Var, 2), null, g4Var.resourcesProvider);
        r71Var.f32150g3.f29505r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        f7.t(imageView, y6.F8, g4Var.resourcesProvider, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ju juVar = new ju(context, g4Var.resourcesProvider);
        juVar.setTextSize(1, 16.0f);
        juVar.setInputType(573441);
        juVar.setRawInputType(573441);
        f7.E(juVar, y6.A6, g4Var.resourcesProvider);
        f7.m(juVar, 30, y6.G6, g4Var.resourcesProvider);
        juVar.setCursorSize(AndroidUtilities.dp(19.0f));
        juVar.setCursorWidth(1.5f);
        juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        f7.V(juVar, y6.E8, g4Var.resourcesProvider);
        juVar.setBackground(null);
        frameLayout.addView(juVar, gb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        juVar.addTextChangedListener(new bo(strArr, r71Var, false, 13));
        if (arrayList.size() > 8) {
            k80Var.r(frameLayout, gb1.r(-1, 44));
            k80Var.k();
        }
        if (!u3Var.f53270l.isEmpty()) {
            k80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 2), false);
        }
        k80Var.q(r71Var);
        k80Var.Z();
    }

    public static void T(g4 g4Var, ArrayList arrayList) {
        boolean z10;
        f4 f4Var = g4Var.Y;
        if (f4Var != null) {
            t9 t9Var = f4Var.f52971b;
            u3 u3Var = f4Var.f52972c;
            if (t9Var != null && u3Var != null) {
                int currentTime = ConnectionsManager.getInstance(g4Var.currentAccount).getCurrentTime();
                arrayList.add(t61.t(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = t9Var.f5471l;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z11 = true;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!g4Var.f53016g0.contains(Long.valueOf(savedStarGift.gift.f22254id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t61 a2 = f1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f32868g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!t9Var.f5468i && t9Var.f5469j) {
                    if (z11) {
                        arrayList.add(t61.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        t61 q5 = t61.q((i15 - i13) + 1, 35);
                        q5.f32881u = 1;
                        arrayList.add(q5);
                    }
                }
                if (u3Var.e > 0 || g4Var.f53019j0) {
                    g4Var.f53019j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    t61 t61Var = new t61(42);
                    t61Var.d = -2;
                    t61Var.f32875o = string;
                    arrayList.add(t61Var);
                    HorizontalScrollView horizontalScrollView = g4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(t61.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = u3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(f1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (u3Var.f53278t || !u3Var.f53279u) {
                        t61 q9 = t61.q(10, 35);
                        q9.f32881u = 1;
                        arrayList.add(q9);
                        t61 q10 = t61.q(11, 35);
                        q10.f32881u = 1;
                        arrayList.add(q10);
                        t61 q11 = t61.q(12, 35);
                        q11.f32881u = 1;
                        arrayList.add(q11);
                        t61 q12 = t61.q(13, 35);
                        q12.f32881u = 1;
                        arrayList.add(q12);
                        t61 q13 = t61.q(14, 35);
                        q13.f32881u = 1;
                        arrayList.add(q13);
                        t61 q14 = t61.q(15, 35);
                        q14.f32881u = 1;
                        arrayList.add(q14);
                    }
                }
            }
        }
    }

    public static void U(g4 g4Var, org.telegram.ui.ActionBar.e2 e2Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        e2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        d6 d6Var = new d6(bVar, tL_payments_paymentFormStarGift);
        Context context = g4Var.getContext();
        u6 u6Var = g4Var.resourcesProvider;
        int i10 = g4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new g6(context, u6Var, tL_starGiftUnique, d6Var, i10, j10, org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2), true, new lc(g4Var, tL_starGiftUnique, j10, 2)).b();
    }

    public static void V(g4 g4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, d6 d6Var, qf.c cVar) {
        cVar.d();
        ca.x(g4Var.currentAccount, d6Var.f4492a).h(d6Var.f4493b, tL_starGiftUnique, j10, null, true, new bi.t0(g4Var, cVar, tL_starGiftUnique, 8));
    }

    public static void W(g4 g4Var, f4 f4Var, Context context) {
        u3 u3Var = f4Var.f52972c;
        if (u3Var.f53266g.isEmpty()) {
            return;
        }
        k80 k80Var = new k80(g4Var.container, g4Var.resourcesProvider, g4Var.f53012c0, false, true, false);
        k80Var.f29867t = false;
        k80Var.Y = true;
        k80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        k80Var.R = true;
        k80Var.f29861p = new li.h(k80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u3Var.f53266g);
        Collections.sort(arrayList, new z3(f4Var, 0));
        r71 r71Var = new r71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 1), new w3(f4Var, k80Var, 1), null, g4Var.resourcesProvider);
        r71Var.f32150g3.f29505r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        f7.t(imageView, y6.F8, g4Var.resourcesProvider, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ju juVar = new ju(context, g4Var.resourcesProvider);
        juVar.setTextSize(1, 16.0f);
        juVar.setInputType(573441);
        juVar.setRawInputType(573441);
        f7.E(juVar, y6.A6, g4Var.resourcesProvider);
        f7.m(juVar, 30, y6.G6, g4Var.resourcesProvider);
        juVar.setCursorSize(AndroidUtilities.dp(19.0f));
        juVar.setCursorWidth(1.5f);
        juVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        f7.V(juVar, y6.E8, g4Var.resourcesProvider);
        juVar.setBackground(null);
        frameLayout.addView(juVar, gb1.h(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        juVar.addTextChangedListener(new bo(strArr, r71Var, false, 12));
        if (arrayList.size() > 8) {
            k80Var.r(frameLayout, gb1.r(-1, 44));
            k80Var.k();
        }
        if (!u3Var.f53269k.isEmpty()) {
            k80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 1), false);
        }
        k80Var.q(r71Var);
        k80Var.Z();
    }

    @Override
    public final void F(float f7) {
        float y3 = this.containerView.getY() + f7;
        g5 g5Var = this.f53014e0;
        float measuredHeight = y3 - g5Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / g5Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        g5Var.setScaleX(clamp01);
        g5Var.setScaleY(clamp01);
        g5Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        g5Var.setTranslationY(measuredHeight);
    }

    public final void Z() {
        int R;
        t61 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            mm0 mm0Var = this.d;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if ((childAt instanceof c10) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f53018i0.G(R)) != null) {
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
            f4Var.f52971b.b();
        }
        if (z11) {
            f4Var.f52972c.g(false);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        e4 e4Var = new e4(this, mm0Var, getContext(), this.currentAccount, new q0(this, 3), this.resourcesProvider);
        this.f53018i0 = e4Var;
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
