package yh;

import ai.fa;
import ai.k5;
import ai.k6;
import ai.sc;
import ai.x9;
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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.kv;
import org.telegram.ui.ko0;
import w7.z5;
public final class g4 extends bb {
    public static final int f50268k0 = 0;
    public final String X;
    public final f4 Y;
    public final HorizontalScrollView Z;
    public final k3 f50269a0;
    public final k3 f50270b0;
    public final k3 f50271c0;
    public final k3 f50272d0;
    public final k5 f50273e0;
    public ai.q2 f50274f0;
    public final HashSet f50275g0;
    public boolean f50276h0;
    public e4 f50277i0;
    public boolean f50278j0;

    public g4(final Context context, String str, final f4 f4Var) {
        super(2, context, (d6) null, false);
        this.f50275g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = f4Var;
        this.e.setTitle(A());
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
        this.f50269a0 = k3Var;
        k3Var.setSorting(f4Var.f50262c.f50545p);
        linearLayout.addView(k3Var, z5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var.setOnClickListener(new qg.n(13, this, f4Var));
        k3 k3Var2 = new k3(context, this.resourcesProvider);
        this.f50270b0 = k3Var2;
        k3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(k3Var2, z5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50197b;

            {
                this.f50197b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.S(this.f50197b, f4Var, context);
                        return;
                    case 1:
                        g4.X(this.f50197b, f4Var, context);
                        return;
                    default:
                        g4.T(this.f50197b, f4Var, context);
                        return;
                }
            }
        });
        k3 k3Var3 = new k3(context, this.resourcesProvider);
        this.f50271c0 = k3Var3;
        k3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(k3Var3, z5.t(-2, -2, 16, 0, 0, 6, 0));
        k3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50197b;

            {
                this.f50197b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.S(this.f50197b, f4Var, context);
                        return;
                    case 1:
                        g4.X(this.f50197b, f4Var, context);
                        return;
                    default:
                        g4.T(this.f50197b, f4Var, context);
                        return;
                }
            }
        });
        k3 k3Var4 = new k3(context, this.resourcesProvider);
        this.f50272d0 = k3Var4;
        k3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(k3Var4, z5.t(-2, -2, 16, 0, 0, 0, 0));
        k3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final g4 f50197b;

            {
                this.f50197b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        g4.S(this.f50197b, f4Var, context);
                        return;
                    case 1:
                        g4.X(this.f50197b, f4Var, context);
                        return;
                    default:
                        g4.T(this.f50197b, f4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ai.q1(this, 8);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new org.telegram.ui.web.c0(24, this, f4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new kv(this, 24));
        s4.k kVar = new s4.k();
        kVar.f45972m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.d.setItemSelectorColorProvider(new g(2));
        k5 k5Var = new k5(context);
        this.f50273e0 = k5Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        k5Var.h = dp;
        k5Var.f1646n = dp2;
        k5Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        k5Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ai.r0(k5Var, 2), 12.0f, 12, null, new ArrayList());
        k5Var.setPivotY(0.0f);
        this.container.addView(k5Var, z5.e(-1, -2, 55));
        this.f50277i0.N(false);
        f4Var.d = new y3(this, 1);
    }

    public static void Q(g4 g4Var, f4 f4Var) {
        i80 F = i80.F(g4Var.container, g4Var.resourcesProvider, g4Var.f50269a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(s3.BY_PRICE.f50523a), new x3(f4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(s3.BY_DATE.f50523a), new x3(f4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(s3.BY_NUMBER.f50523a), new x3(f4Var, 5), false);
        F.f27135t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void R(g4 g4Var, f4 f4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        ag.c cVar;
        f61 G = g4Var.f50277i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f26146r;
                if (!TextUtils.isEmpty(starGift.gift_address) && g4Var.f50276h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g4Var.getContext(), 0, g4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(g4Var.getContext(), 3, null);
                    b2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(g4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        cVar = ag.c.f636b;
                    } else {
                        cVar = ag.c.f635a;
                    }
                    ag.c cVar2 = cVar;
                    fa.x(g4Var.currentAccount, cVar2).H(tL_starGiftUnique, clientUserId, null, true, new ko0(g4Var, b2Var2, cVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = f4Var.f50261b.f2448l;
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
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20601a;
                            b2Var3.R = string2;
                            b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    g4Var.f50274f0.run(starGift);
                    g4Var.dismiss();
                }
            }
        }
    }

    public static void S(g4 g4Var, f4 f4Var, Context context) {
        t3 t3Var = f4Var.f50262c;
        if (t3Var.f50536f.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(g4Var.container, g4Var.resourcesProvider, g4Var.f50270b0, false, true, false);
        i80Var.f27135t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27129p = new ki.h(i80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50536f);
        Collections.sort(arrayList, new z3(f4Var, 2));
        a71 a71Var = new a71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 0), new w3(f4Var, i80Var, 0), null, g4Var.resourcesProvider);
        a71Var.W2.f30200r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        iu iuVar = new iu(context, g4Var.resourcesProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, g4Var.resourcesProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, g4Var.resourcesProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, g4Var.resourcesProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 11));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!t3Var.f50539j.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 0), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
    }

    public static void T(g4 g4Var, f4 f4Var, Context context) {
        t3 t3Var = f4Var.f50262c;
        if (t3Var.h.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(g4Var.container, g4Var.resourcesProvider, g4Var.f50272d0, false, true, false);
        i80Var.f27135t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27129p = new ki.h(i80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.h);
        Collections.sort(arrayList, new z3(f4Var, 1));
        a71 a71Var = new a71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 2), new w3(f4Var, i80Var, 2), null, g4Var.resourcesProvider);
        a71Var.W2.f30200r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        iu iuVar = new iu(context, g4Var.resourcesProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, g4Var.resourcesProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, g4Var.resourcesProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, g4Var.resourcesProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 13));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!t3Var.f50541l.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 2), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
    }

    public static void U(g4 g4Var, ArrayList arrayList) {
        boolean z10;
        f4 f4Var = g4Var.Y;
        if (f4Var != null) {
            x9 x9Var = f4Var.f50261b;
            t3 t3Var = f4Var.f50262c;
            if (x9Var != null && t3Var != null) {
                int currentTime = ConnectionsManager.getInstance(g4Var.currentAccount).getCurrentTime();
                arrayList.add(f61.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = x9Var.f2448l;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z11 = true;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!g4Var.f50275g0.contains(Long.valueOf(savedStarGift.gift.f20496id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f61 a2 = g1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f26136g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!x9Var.f2445i && x9Var.f2446j) {
                    if (z11) {
                        arrayList.add(f61.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        f61 o10 = f61.o((i15 - i13) + 1, 35);
                        o10.f26149u = 1;
                        arrayList.add(o10);
                    }
                }
                if (t3Var.e > 0 || g4Var.f50278j0) {
                    g4Var.f50278j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    f61 f61Var = new f61(42);
                    f61Var.d = -2;
                    f61Var.f26143o = string;
                    arrayList.add(f61Var);
                    HorizontalScrollView horizontalScrollView = g4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(f61.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = t3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(g1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (t3Var.f50549t || !t3Var.f50550u) {
                        f61 o11 = f61.o(10, 35);
                        o11.f26149u = 1;
                        arrayList.add(o11);
                        f61 o12 = f61.o(11, 35);
                        o12.f26149u = 1;
                        arrayList.add(o12);
                        f61 o13 = f61.o(12, 35);
                        o13.f26149u = 1;
                        arrayList.add(o13);
                        f61 o14 = f61.o(13, 35);
                        o14.f26149u = 1;
                        arrayList.add(o14);
                        f61 o15 = f61.o(14, 35);
                        o15.f26149u = 1;
                        arrayList.add(o15);
                        f61 o16 = f61.o(15, 35);
                        o16.f26149u = 1;
                        arrayList.add(o16);
                    }
                }
            }
        }
    }

    public static void V(g4 g4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ai.h6 h6Var = new ai.h6(cVar, tL_payments_paymentFormStarGift);
        Context context = g4Var.getContext();
        d6 d6Var = g4Var.resourcesProvider;
        int i10 = g4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new k6(context, d6Var, tL_starGiftUnique, h6Var, i10, j10, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2), true, new sc(g4Var, tL_starGiftUnique, j10, 2)).b();
    }

    public static void W(g4 g4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ai.h6 h6Var, pf.c cVar) {
        cVar.d();
        fa.x(g4Var.currentAccount, h6Var.f1425a).h(h6Var.f1426b, tL_starGiftUnique, j10, null, true, new ai.s0(g4Var, cVar, tL_starGiftUnique, 8));
    }

    public static void X(g4 g4Var, f4 f4Var, Context context) {
        t3 t3Var = f4Var.f50262c;
        if (t3Var.f50537g.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(g4Var.container, g4Var.resourcesProvider, g4Var.f50271c0, false, true, false);
        i80Var.f27135t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27129p = new ki.h(i80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(t3Var.f50537g);
        Collections.sort(arrayList, new z3(f4Var, 0));
        a71 a71Var = new a71(context, g4Var.currentAccount, 0, false, new v3(strArr, f4Var, arrayList, 1), new w3(f4Var, i80Var, 1), null, g4Var.resourcesProvider);
        a71Var.W2.f30200r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(g4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        iu iuVar = new iu(context, g4Var.resourcesProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, g4Var.resourcesProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, g4Var.resourcesProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, g4Var.resourcesProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 12));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!t3Var.f50540k.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new x3(f4Var, 1), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
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
        k5 k5Var = this.f50273e0;
        float measuredHeight = y3 - k5Var.getMeasuredHeight();
        float clamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / k5Var.getMeasuredHeight());
        float height = this.container.getHeight() / 2.0f;
        if (measuredHeight > height) {
            clamp01 = Math.min(clamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
        }
        k5Var.setScaleX(clamp01);
        k5Var.setScaleY(clamp01);
        k5Var.setAlpha(AndroidUtilities.ilerp(clamp01, 0.5f, 1.0f));
        k5Var.setTranslationY(measuredHeight);
    }

    public final void a0() {
        int R;
        f61 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            im0 im0Var = this.d;
            if (i10 >= im0Var.getChildCount()) {
                break;
            }
            View childAt = im0Var.getChildAt(i10);
            if ((childAt instanceof b10) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f50277i0.G(R)) != null) {
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
            f4Var.f50261b.a();
        }
        if (z11) {
            f4Var.f50262c.g(false);
        }
    }

    @Override
    public final hm0 x(im0 im0Var) {
        e4 e4Var = new e4(this, im0Var, getContext(), this.currentAccount, new u3(this, 0), this.resourcesProvider);
        this.f50277i0 = e4Var;
        return e4Var;
    }
}
