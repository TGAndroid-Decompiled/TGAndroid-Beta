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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.py0;
import org.telegram.ui.wo0;
import w7.y5;
import yh.k5;
import yh.s5;
public final class i4 extends bb {
    public static final int f46239k0 = 0;
    public final String X;
    public final h4 Y;
    public final HorizontalScrollView Z;
    public final n3 f46240a0;
    public final n3 f46241b0;
    public final n3 f46242c0;
    public final n3 f46243d0;
    public final yh.i2 f46244e0;
    public yh.w0 f46245f0;
    public final HashSet f46246g0;
    public boolean f46247h0;
    public g4 f46248i0;
    public boolean f46249j0;

    public i4(final Context context, String str, final h4 h4Var) {
        super(2, context, (e6) null, false);
        this.f46246g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = h4Var;
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
        n3 n3Var = new n3(context, this.resourcesProvider);
        this.f46240a0 = n3Var;
        n3Var.setSorting(h4Var.f46234c.f46537p);
        linearLayout.addView(n3Var, y5.t(-2, -2, 16, 0, 0, 6, 0));
        n3Var.setOnClickListener(new py0(26, this, h4Var));
        n3 n3Var2 = new n3(context, this.resourcesProvider);
        this.f46241b0 = n3Var2;
        n3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(n3Var2, y5.t(-2, -2, 16, 0, 0, 6, 0));
        n3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46170b;

            {
                this.f46170b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        i4.R(this.f46170b, h4Var, context);
                        return;
                    case 1:
                        i4.W(this.f46170b, h4Var, context);
                        return;
                    default:
                        i4.S(this.f46170b, h4Var, context);
                        return;
                }
            }
        });
        n3 n3Var3 = new n3(context, this.resourcesProvider);
        this.f46242c0 = n3Var3;
        n3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(n3Var3, y5.t(-2, -2, 16, 0, 0, 6, 0));
        n3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46170b;

            {
                this.f46170b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        i4.R(this.f46170b, h4Var, context);
                        return;
                    case 1:
                        i4.W(this.f46170b, h4Var, context);
                        return;
                    default:
                        i4.S(this.f46170b, h4Var, context);
                        return;
                }
            }
        });
        n3 n3Var4 = new n3(context, this.resourcesProvider);
        this.f46243d0 = n3Var4;
        n3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(n3Var4, y5.t(-2, -2, 16, 0, 0, 0, 0));
        n3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f46170b;

            {
                this.f46170b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        i4.R(this.f46170b, h4Var, context);
                        return;
                    case 1:
                        i4.W(this.f46170b, h4Var, context);
                        return;
                    default:
                        i4.S(this.f46170b, h4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.x1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new s5.e(15, this, h4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new hg0(this, 17));
        s4.j jVar = new s4.j();
        jVar.f43040m = false;
        jVar.C = false;
        jVar.o(sr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new u2.x0(18));
        yh.i2 i2Var = new yh.i2(context);
        this.f46244e0 = i2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        i2Var.h = dp;
        i2Var.f47568n = dp2;
        i2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        i2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(i2Var, 26), 12.0f, 12, null, new ArrayList());
        i2Var.setPivotY(0.0f);
        this.container.addView(i2Var, y5.e(-1, -2, 55));
        this.f46248i0.N(false);
        h4Var.d = new a4(this, 1);
    }

    public static void P(i4 i4Var, h4 h4Var) {
        a80 F = a80.F(i4Var.container, i4Var.resourcesProvider, i4Var.f46240a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(v3.BY_PRICE.f46513a), new z3(h4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(v3.BY_DATE.f46513a), new z3(h4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(v3.BY_NUMBER.f46513a), new z3(h4Var, 5), false);
        F.f22607t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void Q(i4 i4Var, h4 h4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        zf.b bVar;
        x51 G = i4Var.f46248i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f30308r;
                if (!TextUtils.isEmpty(starGift.gift_address) && i4Var.f46247h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i4Var.getContext(), 0, i4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(i4Var.getContext(), 3, null);
                    c2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(i4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = zf.b.f49271b;
                    } else {
                        bVar = zf.b.f49270a;
                    }
                    zf.b bVar2 = bVar;
                    s5.x(i4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new wo0(i4Var, c2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = h4Var.f46233b.f47666l;
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
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(i4Var.currentAccount).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(i4Var.getContext());
                            String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.f18655a;
                            c2Var3.R = string2;
                            c2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    i4Var.f46245f0.run(starGift);
                    i4Var.dismiss();
                }
            }
        }
    }

    public static void R(i4 i4Var, h4 h4Var, Context context) {
        w3 w3Var = h4Var.f46234c;
        if (w3Var.f46528f.isEmpty()) {
            return;
        }
        a80 a80Var = new a80(i4Var.container, i4Var.resourcesProvider, i4Var.f46241b0, false, true, false);
        a80Var.f22607t = false;
        a80Var.Y = true;
        a80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        a80Var.R = true;
        a80Var.f22601p = new ii.h(a80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w3Var.f46528f);
        Collections.sort(arrayList, new b4(h4Var, 2));
        t61 t61Var = new t61(context, i4Var.currentAccount, 0, false, new x3(strArr, h4Var, arrayList, 0), new y3(h4Var, a80Var, 0), null, i4Var.resourcesProvider);
        t61Var.Y2.f25959r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, i4Var.resourcesProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourcesProvider));
        duVar.setCursorColor(i6.v0(i6.G6, i4Var.resourcesProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(i6.v0(i6.E8, i4Var.resourcesProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, t61Var, false, 11));
        if (arrayList.size() > 8) {
            a80Var.r(frameLayout, y5.n(-1, 44));
            a80Var.k();
        }
        if (!w3Var.f46531j.isEmpty()) {
            a80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new z3(h4Var, 0), false);
        }
        a80Var.q(t61Var);
        a80Var.Z();
    }

    public static void S(i4 i4Var, h4 h4Var, Context context) {
        w3 w3Var = h4Var.f46234c;
        if (w3Var.h.isEmpty()) {
            return;
        }
        a80 a80Var = new a80(i4Var.container, i4Var.resourcesProvider, i4Var.f46243d0, false, true, false);
        a80Var.f22607t = false;
        a80Var.Y = true;
        a80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        a80Var.R = true;
        a80Var.f22601p = new ii.h(a80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w3Var.h);
        Collections.sort(arrayList, new b4(h4Var, 1));
        t61 t61Var = new t61(context, i4Var.currentAccount, 0, false, new x3(strArr, h4Var, arrayList, 2), new y3(h4Var, a80Var, 2), null, i4Var.resourcesProvider);
        t61Var.Y2.f25959r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, i4Var.resourcesProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourcesProvider));
        duVar.setCursorColor(i6.v0(i6.G6, i4Var.resourcesProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(i6.v0(i6.E8, i4Var.resourcesProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, t61Var, false, 13));
        if (arrayList.size() > 8) {
            a80Var.r(frameLayout, y5.n(-1, 44));
            a80Var.k();
        }
        if (!w3Var.f46533l.isEmpty()) {
            a80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new z3(h4Var, 2), false);
        }
        a80Var.q(t61Var);
        a80Var.Z();
    }

    public static void T(i4 i4Var, ArrayList arrayList) {
        boolean z10;
        h4 h4Var = i4Var.Y;
        if (h4Var != null) {
            k5 k5Var = h4Var.f46233b;
            w3 w3Var = h4Var.f46234c;
            if (k5Var != null && w3Var != null) {
                int currentTime = ConnectionsManager.getInstance(i4Var.currentAccount).getCurrentTime();
                arrayList.add(x51.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = k5Var.f47666l;
                int size = arrayList2.size();
                int i10 = 0;
                boolean z11 = true;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!i4Var.f46246g0.contains(Long.valueOf(savedStarGift.gift.f18554id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x51 a2 = i1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f30298g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!k5Var.f47663i && k5Var.f47664j) {
                    if (z11) {
                        arrayList.add(x51.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        x51 o9 = x51.o((i15 - i13) + 1, 35);
                        o9.f30311u = 1;
                        arrayList.add(o9);
                    }
                }
                if (w3Var.e > 0 || i4Var.f46249j0) {
                    i4Var.f46249j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    x51 x51Var = new x51(42);
                    x51Var.d = -2;
                    x51Var.f30305o = string;
                    arrayList.add(x51Var);
                    HorizontalScrollView horizontalScrollView = i4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(x51.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = w3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(i1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (w3Var.f46541t || !w3Var.f46542u) {
                        x51 o10 = x51.o(10, 35);
                        o10.f30311u = 1;
                        arrayList.add(o10);
                        x51 o11 = x51.o(11, 35);
                        o11.f30311u = 1;
                        arrayList.add(o11);
                        x51 o12 = x51.o(12, 35);
                        o12.f30311u = 1;
                        arrayList.add(o12);
                        x51 o13 = x51.o(13, 35);
                        o13.f30311u = 1;
                        arrayList.add(o13);
                        x51 o14 = x51.o(14, 35);
                        o14.f30311u = 1;
                        arrayList.add(o14);
                        x51 o15 = x51.o(15, 35);
                        o15.f30311u = 1;
                        arrayList.add(o15);
                    }
                }
            }
        }
    }

    public static void U(i4 i4Var, org.telegram.ui.ActionBar.c2 c2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        c2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.a3 a3Var = new yh.a3(bVar, tL_payments_paymentFormStarGift);
        Context context = i4Var.getContext();
        e6 e6Var = i4Var.resourcesProvider;
        int i10 = i4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.c3(context, e6Var, tL_starGiftUnique, a3Var, i10, j3, hg.k0.j(tL_starGiftUnique.num, ',', sb2), true, new q80(i4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void V(i4 i4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.a3 a3Var, nf.e eVar) {
        eVar.d();
        s5.x(i4Var.currentAccount, a3Var.f47248a).h(a3Var.f47249b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(i4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void W(i4 i4Var, h4 h4Var, Context context) {
        w3 w3Var = h4Var.f46234c;
        if (w3Var.f46529g.isEmpty()) {
            return;
        }
        a80 a80Var = new a80(i4Var.container, i4Var.resourcesProvider, i4Var.f46242c0, false, true, false);
        a80Var.f22607t = false;
        a80Var.Y = true;
        a80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        a80Var.R = true;
        a80Var.f22601p = new ii.h(a80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(w3Var.f46529g);
        Collections.sort(arrayList, new b4(h4Var, 0));
        t61 t61Var = new t61(context, i4Var.currentAccount, 0, false, new x3(strArr, h4Var, arrayList, 1), new y3(h4Var, a80Var, 1), null, i4Var.resourcesProvider);
        t61Var.Y2.f25959r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(i4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, y5.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        du duVar = new du(context, i4Var.resourcesProvider);
        duVar.setTextSize(1, 16.0f);
        duVar.setInputType(573441);
        duVar.setRawInputType(573441);
        duVar.setHintTextColor(i6.v0(i6.A6, i4Var.resourcesProvider));
        duVar.setCursorColor(i6.v0(i6.G6, i4Var.resourcesProvider));
        duVar.setCursorSize(AndroidUtilities.dp(19.0f));
        duVar.setCursorWidth(1.5f);
        duVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        duVar.setTextColor(i6.v0(i6.E8, i4Var.resourcesProvider));
        duVar.setBackground(null);
        frameLayout.addView(duVar, y5.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        duVar.addTextChangedListener(new sn(strArr, t61Var, false, 12));
        if (arrayList.size() > 8) {
            a80Var.r(frameLayout, y5.n(-1, 44));
            a80Var.k();
        }
        if (!w3Var.f46532k.isEmpty()) {
            a80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new z3(h4Var, 1), false);
        }
        a80Var.q(t61Var);
        a80Var.Z();
    }

    @Override
    public final void F(float f7) {
        float y3 = this.containerView.getY() + f7;
        yh.i2 i2Var = this.f46244e0;
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
        int S;
        x51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            yl0 yl0Var = this.d;
            if (i10 >= yl0Var.getChildCount()) {
                break;
            }
            View childAt = yl0Var.getChildAt(i10);
            if ((childAt instanceof v00) && (S = RecyclerView.S(childAt) - 1) >= 0 && (G = this.f46248i0.G(S)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        h4 h4Var = this.Y;
        if (z10) {
            h4Var.f46233b.a();
        }
        if (z11) {
            h4Var.f46234c.g(false);
        }
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        g4 g4Var = new g4(this, yl0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.f46248i0 = g4Var;
        return g4Var;
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
