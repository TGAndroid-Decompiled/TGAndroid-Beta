package yh;

import ai.ga;
import ai.k5;
import ai.k6;
import ai.tc;
import ai.y9;
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
import org.telegram.ui.lo0;
import w7.z5;
public final class f4 extends bb {
    public static final int f50233k0 = 0;
    public final String X;
    public final e4 Y;
    public final HorizontalScrollView Z;
    public final j3 f50234a0;
    public final j3 f50235b0;
    public final j3 f50236c0;
    public final j3 f50237d0;
    public final k5 f50238e0;
    public ai.p2 f50239f0;
    public final HashSet f50240g0;
    public boolean f50241h0;
    public d4 f50242i0;
    public boolean f50243j0;

    public f4(final Context context, String str, final e4 e4Var) {
        super(2, context, (d6) null, false);
        this.f50240g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = e4Var;
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
        j3 j3Var = new j3(context, this.resourcesProvider);
        this.f50234a0 = j3Var;
        j3Var.setSorting(e4Var.f50227c.f50510p);
        linearLayout.addView(j3Var, z5.t(-2, -2, 16, 0, 0, 6, 0));
        j3Var.setOnClickListener(new org.telegram.ui.web.c(14, this, e4Var));
        j3 j3Var2 = new j3(context, this.resourcesProvider);
        this.f50235b0 = j3Var2;
        j3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(j3Var2, z5.t(-2, -2, 16, 0, 0, 6, 0));
        j3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f50622b;

            {
                this.f50622b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.S(this.f50622b, e4Var, context);
                        return;
                    case 1:
                        f4.X(this.f50622b, e4Var, context);
                        return;
                    default:
                        f4.T(this.f50622b, e4Var, context);
                        return;
                }
            }
        });
        j3 j3Var3 = new j3(context, this.resourcesProvider);
        this.f50236c0 = j3Var3;
        j3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(j3Var3, z5.t(-2, -2, 16, 0, 0, 6, 0));
        j3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f50622b;

            {
                this.f50622b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.S(this.f50622b, e4Var, context);
                        return;
                    case 1:
                        f4.X(this.f50622b, e4Var, context);
                        return;
                    default:
                        f4.T(this.f50622b, e4Var, context);
                        return;
                }
            }
        });
        j3 j3Var4 = new j3(context, this.resourcesProvider);
        this.f50237d0 = j3Var4;
        j3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(j3Var4, z5.t(-2, -2, 16, 0, 0, 0, 0));
        j3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f50622b;

            {
                this.f50622b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        f4.S(this.f50622b, e4Var, context);
                        return;
                    case 1:
                        f4.X(this.f50622b, e4Var, context);
                        return;
                    default:
                        f4.T(this.f50622b, e4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ai.q1(this, 8);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new org.telegram.ui.web.n(25, this, e4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new kv(this, 24));
        s4.k kVar = new s4.k();
        kVar.f45944m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.d.setItemSelectorColorProvider(new ya.b(3));
        k5 k5Var = new k5(context);
        this.f50238e0 = k5Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        k5Var.h = dp;
        k5Var.f1638n = dp2;
        k5Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        k5Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ai.r0(k5Var, 2), 12.0f, 12, null, new ArrayList());
        k5Var.setPivotY(0.0f);
        this.container.addView(k5Var, z5.e(-1, -2, 55));
        this.f50242i0.N(false);
        e4Var.d = new x3(this, 1);
    }

    public static void Q(f4 f4Var, e4 e4Var) {
        i80 F = i80.F(f4Var.container, f4Var.resourcesProvider, f4Var.f50234a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(r3.BY_PRICE.f50488a), new w3(e4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(r3.BY_DATE.f50488a), new w3(e4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(r3.BY_NUMBER.f50488a), new w3(e4Var, 5), false);
        F.f27135t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void R(f4 f4Var, e4 e4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        ag.c cVar;
        f61 G = f4Var.f50242i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f26146r;
                if (!TextUtils.isEmpty(starGift.gift_address) && f4Var.f50241h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f4Var.getContext(), 0, f4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(f4Var.getContext(), 3, null);
                    b2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(f4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        cVar = ag.c.f636b;
                    } else {
                        cVar = ag.c.f635a;
                    }
                    ag.c cVar2 = cVar;
                    ga.x(f4Var.currentAccount, cVar2).H(tL_starGiftUnique, clientUserId, null, true, new lo0(f4Var, b2Var2, cVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = e4Var.f50226b.f2499l;
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
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20601a;
                            b2Var3.R = string2;
                            b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    f4Var.f50239f0.run(starGift);
                    f4Var.dismiss();
                }
            }
        }
    }

    public static void S(f4 f4Var, e4 e4Var, Context context) {
        s3 s3Var = e4Var.f50227c;
        if (s3Var.f50501f.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(f4Var.container, f4Var.resourcesProvider, f4Var.f50235b0, false, true, false);
        i80Var.f27135t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27129p = new ki.h(i80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(s3Var.f50501f);
        Collections.sort(arrayList, new y3(e4Var, 2));
        a71 a71Var = new a71(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 0), new v3(e4Var, i80Var, 0), null, f4Var.resourcesProvider);
        a71Var.W2.f30201r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        iu iuVar = new iu(context, f4Var.resourcesProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, f4Var.resourcesProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, f4Var.resourcesProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, f4Var.resourcesProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 11));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!s3Var.f50504j.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 0), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
    }

    public static void T(f4 f4Var, e4 e4Var, Context context) {
        s3 s3Var = e4Var.f50227c;
        if (s3Var.h.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(f4Var.container, f4Var.resourcesProvider, f4Var.f50237d0, false, true, false);
        i80Var.f27135t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27129p = new ki.h(i80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(s3Var.h);
        Collections.sort(arrayList, new y3(e4Var, 1));
        a71 a71Var = new a71(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 2), new v3(e4Var, i80Var, 2), null, f4Var.resourcesProvider);
        a71Var.W2.f30201r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        iu iuVar = new iu(context, f4Var.resourcesProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, f4Var.resourcesProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, f4Var.resourcesProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, f4Var.resourcesProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 13));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!s3Var.f50506l.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 2), false);
        }
        i80Var.q(a71Var);
        i80Var.Z();
    }

    public static void U(f4 f4Var, ArrayList arrayList) {
        boolean z10;
        e4 e4Var = f4Var.Y;
        if (e4Var != null) {
            y9 y9Var = e4Var.f50226b;
            s3 s3Var = e4Var.f50227c;
            if (y9Var != null && s3Var != null) {
                int currentTime = ConnectionsManager.getInstance(f4Var.currentAccount).getCurrentTime();
                arrayList.add(f61.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = y9Var.f2499l;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z11 = true;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!f4Var.f50240g0.contains(Long.valueOf(savedStarGift.gift.f20496id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f61 a2 = f1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f26136g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!y9Var.f2496i && y9Var.f2497j) {
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
                if (s3Var.e > 0 || f4Var.f50243j0) {
                    f4Var.f50243j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    f61 f61Var = new f61(42);
                    f61Var.d = -2;
                    f61Var.f26143o = string;
                    arrayList.add(f61Var);
                    HorizontalScrollView horizontalScrollView = f4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(f61.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = s3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(f1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (s3Var.f50514t || !s3Var.f50515u) {
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

    public static void V(f4 f4Var, org.telegram.ui.ActionBar.b2 b2Var, ag.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ai.h6 h6Var = new ai.h6(cVar, tL_payments_paymentFormStarGift);
        Context context = f4Var.getContext();
        d6 d6Var = f4Var.resourcesProvider;
        int i10 = f4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new k6(context, d6Var, tL_starGiftUnique, h6Var, i10, j10, org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), true, new tc(f4Var, tL_starGiftUnique, j10, 2)).b();
    }

    public static void W(f4 f4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, ai.h6 h6Var, pf.c cVar) {
        cVar.d();
        ga.x(f4Var.currentAccount, h6Var.f1410a).h(h6Var.f1411b, tL_starGiftUnique, j10, null, true, new ai.s0(f4Var, cVar, tL_starGiftUnique, 8));
    }

    public static void X(f4 f4Var, e4 e4Var, Context context) {
        s3 s3Var = e4Var.f50227c;
        if (s3Var.f50502g.isEmpty()) {
            return;
        }
        i80 i80Var = new i80(f4Var.container, f4Var.resourcesProvider, f4Var.f50236c0, false, true, false);
        i80Var.f27135t = false;
        i80Var.Y = true;
        i80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        i80Var.R = true;
        i80Var.f27129p = new ki.h(i80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(s3Var.f50502g);
        Collections.sort(arrayList, new y3(e4Var, 0));
        a71 a71Var = new a71(context, f4Var.currentAccount, 0, false, new u3(strArr, e4Var, arrayList, 1), new v3(e4Var, i80Var, 1), null, f4Var.resourcesProvider);
        a71Var.W2.f30201r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(f4Var.getThemedColor(h6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, z5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        iu iuVar = new iu(context, f4Var.resourcesProvider);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setInputType(573441);
        iuVar.setRawInputType(573441);
        iuVar.setHintTextColor(h6.w0(h6.A6, f4Var.resourcesProvider));
        iuVar.setCursorColor(h6.w0(h6.G6, f4Var.resourcesProvider));
        iuVar.setCursorSize(AndroidUtilities.dp(19.0f));
        iuVar.setCursorWidth(1.5f);
        iuVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        iuVar.setTextColor(h6.w0(h6.E8, f4Var.resourcesProvider));
        iuVar.setBackground(null);
        frameLayout.addView(iuVar, z5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        iuVar.addTextChangedListener(new ao(strArr, a71Var, false, 12));
        if (arrayList.size() > 8) {
            i80Var.r(frameLayout, z5.n(-1, 44));
            i80Var.k();
        }
        if (!s3Var.f50505k.isEmpty()) {
            i80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new w3(e4Var, 1), false);
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
        k5 k5Var = this.f50238e0;
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
            if ((childAt instanceof b10) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f50242i0.G(R)) != null) {
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
            e4Var.f50226b.a();
        }
        if (z11) {
            e4Var.f50227c.g(false);
        }
    }

    @Override
    public final hm0 x(im0 im0Var) {
        d4 d4Var = new d4(this, im0Var, getContext(), this.currentAccount, new t3(this, 0), this.resourcesProvider);
        this.f50242i0 = d4Var;
        return d4Var;
    }
}
