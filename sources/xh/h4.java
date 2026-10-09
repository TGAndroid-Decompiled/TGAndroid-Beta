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
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.ap0;
import w7.x5;
import yh.e5;
import yh.m5;
public final class h4 extends eb {
    public static final int f51267k0 = 0;
    public final String X;
    public final g4 Y;
    public final HorizontalScrollView Z;
    public final m3 f51268a0;
    public final m3 f51269b0;
    public final m3 f51270c0;
    public final m3 f51271d0;
    public final yh.f2 f51272e0;
    public yh.v0 f51273f0;
    public final HashSet f51274g0;
    public boolean f51275h0;
    public f4 f51276i0;
    public boolean f51277j0;

    public h4(final Context context, String str, final g4 g4Var) {
        super(2, context, (e6) null, false);
        this.f51274g0 = new HashSet();
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        this.X = str;
        this.Y = g4Var;
        this.f26023e.setTitle(B());
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
        this.f51268a0 = m3Var;
        m3Var.setSorting(g4Var.f51256c.f51565p);
        linearLayout.addView(m3Var, x5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var.setOnClickListener(new a(2, this, g4Var));
        m3 m3Var2 = new m3(context, this.resourcesProvider);
        this.f51269b0 = m3Var2;
        m3Var2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        linearLayout.addView(m3Var2, x5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51187b;

            {
                this.f51187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.S(this.f51187b, g4Var, context);
                        return;
                    case 1:
                        h4.X(this.f51187b, g4Var, context);
                        return;
                    default:
                        h4.T(this.f51187b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var3 = new m3(context, this.resourcesProvider);
        this.f51270c0 = m3Var3;
        m3Var3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        linearLayout.addView(m3Var3, x5.t(-2, -2, 16, 0, 0, 6, 0));
        m3Var3.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51187b;

            {
                this.f51187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.S(this.f51187b, g4Var, context);
                        return;
                    case 1:
                        h4.X(this.f51187b, g4Var, context);
                        return;
                    default:
                        h4.T(this.f51187b, g4Var, context);
                        return;
                }
            }
        });
        m3 m3Var4 = new m3(context, this.resourcesProvider);
        this.f51271d0 = m3Var4;
        m3Var4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        linearLayout.addView(m3Var4, x5.t(-2, -2, 16, 0, 0, 0, 0));
        m3Var4.setOnClickListener(new View.OnClickListener(this) {
            public final h4 f51187b;

            {
                this.f51187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        h4.S(this.f51187b, g4Var, context);
                        return;
                    case 1:
                        h4.X(this.f51187b, g4Var, context);
                        return;
                    default:
                        h4.T(this.f51187b, g4Var, context);
                        return;
                }
            }
        });
        getContext();
        s4.s sVar = new s4.s(3);
        sVar.O = new ci.w1(this, 7);
        this.d.setLayoutManager(sVar);
        this.d.setOnItemClickListener(new qg.x1(19, this, g4Var));
        this.d.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.d.setOnScrollListener(new mh0(this, 19));
        s4.j jVar = new s4.j();
        jVar.f47698m = false;
        jVar.C = false;
        jVar.o(hs.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setItemSelectorColorProvider(new xa.b(3));
        yh.f2 f2Var = new yh.f2(context);
        this.f51272e0 = f2Var;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(9.0f);
        f2Var.h = dp;
        f2Var.f52495n = dp2;
        f2Var.setRoundRadius(AndroidUtilities.dp(22.0f));
        f2Var.setFullRect(true);
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(f2Var, 26), 12.0f, 12, null, new ArrayList());
        f2Var.setPivotY(0.0f);
        this.container.addView(f2Var, x5.e(-1, -2, 55));
        this.f51276i0.N(false);
        g4Var.d = new z3(this, 1);
    }

    public static void Q(h4 h4Var, g4 g4Var) {
        p80 F = p80.F(h4Var.container, h4Var.resourcesProvider, h4Var.f51268a0);
        F.c(R.drawable.menu_sort_value, LocaleController.getString(u3.BY_PRICE.f51542a), new y3(g4Var, 3), false);
        F.c(R.drawable.menu_sort_date, LocaleController.getString(u3.BY_DATE.f51542a), new y3(g4Var, 4), false);
        F.c(R.drawable.menu_sort_number, LocaleController.getString(u3.BY_NUMBER.f51542a), new y3(g4Var, 5), false);
        F.f29790t = false;
        F.Y = true;
        F.a0(0.0f, AndroidUtilities.dp(-8.0f));
        F.Z();
    }

    public static void R(h4 h4Var, g4 g4Var, int i10) {
        TL_stars.SavedStarGift savedStarGift;
        zf.b bVar;
        p61 G = h4Var.f51276i0.G(i10 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z10 = G.f29740r;
                if (!TextUtils.isEmpty(starGift.gift_address) && h4Var.f51275h0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h4Var.getContext(), 0, h4Var.resourcesProvider);
                    String string = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
                    org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(h4Var.getContext(), 3, null);
                    b2Var2.q(400L);
                    long clientUserId = UserConfig.getInstance(h4Var.currentAccount).getClientUserId();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = zf.b.f54444b;
                    } else {
                        bVar = zf.b.f54443a;
                    }
                    zf.b bVar2 = bVar;
                    m5.x(h4Var.currentAccount, bVar2).H(tL_starGiftUnique, clientUserId, null, true, new ap0(h4Var, b2Var2, bVar2, tL_starGiftUnique, clientUserId));
                } else {
                    if (!z10) {
                        ArrayList arrayList = g4Var.f51255b.f52442l;
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
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f20374a;
                            b2Var3.R = string2;
                            b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)));
                            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    h4Var.f51273f0.run(starGift);
                    h4Var.dismiss();
                }
            }
        }
    }

    public static void S(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f51256c;
        if (v3Var.f51556f.isEmpty()) {
            return;
        }
        p80 p80Var = new p80(h4Var.container, h4Var.resourcesProvider, h4Var.f51269b0, false, true, false);
        p80Var.f29790t = false;
        p80Var.Y = true;
        p80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        p80Var.R = true;
        p80Var.f29784p = new ii.h(p80Var, 8);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f51556f);
        Collections.sort(arrayList, new a4(g4Var, 2));
        k71 k71Var = new k71(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 0), new x3(g4Var, p80Var, 0), null, h4Var.resourcesProvider);
        k71Var.W2.f25280r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        ru ruVar = new ru(context, h4Var.resourcesProvider);
        ruVar.setTextSize(1, 16.0f);
        ruVar.setInputType(573441);
        ruVar.setRawInputType(573441);
        ruVar.setHintTextColor(i6.w0(i6.A6, h4Var.resourcesProvider));
        ruVar.setCursorColor(i6.w0(i6.G6, h4Var.resourcesProvider));
        ruVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ruVar.setCursorWidth(1.5f);
        ruVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ruVar.setTextColor(i6.w0(i6.E8, h4Var.resourcesProvider));
        ruVar.setBackground(null);
        frameLayout.addView(ruVar, x5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        ruVar.addTextChangedListener(new ho(strArr, k71Var, false, 11));
        if (arrayList.size() > 8) {
            p80Var.r(frameLayout, x5.n(-1, 44));
            p80Var.k();
        }
        if (!v3Var.f51559j.isEmpty()) {
            p80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 0), false);
        }
        p80Var.q(k71Var);
        p80Var.Z();
    }

    public static void T(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f51256c;
        if (v3Var.h.isEmpty()) {
            return;
        }
        p80 p80Var = new p80(h4Var.container, h4Var.resourcesProvider, h4Var.f51271d0, false, true, false);
        p80Var.f29790t = false;
        p80Var.Y = true;
        p80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        p80Var.R = true;
        p80Var.f29784p = new ii.h(p80Var, 7);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.h);
        Collections.sort(arrayList, new a4(g4Var, 1));
        k71 k71Var = new k71(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 2), new x3(g4Var, p80Var, 2), null, h4Var.resourcesProvider);
        k71Var.W2.f25280r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        ru ruVar = new ru(context, h4Var.resourcesProvider);
        ruVar.setTextSize(1, 16.0f);
        ruVar.setInputType(573441);
        ruVar.setRawInputType(573441);
        ruVar.setHintTextColor(i6.w0(i6.A6, h4Var.resourcesProvider));
        ruVar.setCursorColor(i6.w0(i6.G6, h4Var.resourcesProvider));
        ruVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ruVar.setCursorWidth(1.5f);
        ruVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ruVar.setTextColor(i6.w0(i6.E8, h4Var.resourcesProvider));
        ruVar.setBackground(null);
        frameLayout.addView(ruVar, x5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        ruVar.addTextChangedListener(new ho(strArr, k71Var, false, 13));
        if (arrayList.size() > 8) {
            p80Var.r(frameLayout, x5.n(-1, 44));
            p80Var.k();
        }
        if (!v3Var.f51561l.isEmpty()) {
            p80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 2), false);
        }
        p80Var.q(k71Var);
        p80Var.Z();
    }

    public static void U(h4 h4Var, ArrayList arrayList) {
        boolean z10;
        g4 g4Var = h4Var.Y;
        if (g4Var != null) {
            e5 e5Var = g4Var.f51255b;
            v3 v3Var = g4Var.f51256c;
            if (e5Var != null && v3Var != null) {
                int currentTime = ConnectionsManager.getInstance(h4Var.currentAccount).getCurrentTime();
                arrayList.add(p61.s(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
                ArrayList arrayList2 = e5Var.f52442l;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z11 = true;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    if (!h4Var.f51274g0.contains(Long.valueOf(savedStarGift.gift.f20265id))) {
                        if (savedStarGift.can_craft_at <= currentTime) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        p61 a2 = i1.a(0, savedStarGift.gift, false, true, false, false, true);
                        a2.f29730g = z10;
                        arrayList.add(a2);
                        i11++;
                        z11 = false;
                    }
                }
                if (!e5Var.f52439i && e5Var.f52440j) {
                    if (z11) {
                        arrayList.add(p61.g(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
                    }
                } else {
                    int i13 = i11 % 3;
                    int i14 = 6 - i13;
                    for (int i15 = 0; i15 < i14; i15++) {
                        p61 o9 = p61.o((i15 - i13) + 1, 35);
                        o9.f29743u = 1;
                        arrayList.add(o9);
                    }
                }
                if (v3Var.f51555e > 0 || h4Var.f51277j0) {
                    h4Var.f51277j0 = true;
                    String string = LocaleController.getString(R.string.GiftCraftSelectResale);
                    p61 p61Var = new p61(42);
                    p61Var.d = -2;
                    p61Var.f29737o = string;
                    arrayList.add(p61Var);
                    HorizontalScrollView horizontalScrollView = h4Var.Z;
                    if (horizontalScrollView != null) {
                        arrayList.add(p61.j(-3, horizontalScrollView));
                    }
                    ArrayList arrayList3 = v3Var.d;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        arrayList.add(i1.a(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                    }
                    if (v3Var.f51569t || !v3Var.f51570u) {
                        p61 o10 = p61.o(10, 35);
                        o10.f29743u = 1;
                        arrayList.add(o10);
                        p61 o11 = p61.o(11, 35);
                        o11.f29743u = 1;
                        arrayList.add(o11);
                        p61 o12 = p61.o(12, 35);
                        o12.f29743u = 1;
                        arrayList.add(o12);
                        p61 o13 = p61.o(13, 35);
                        o13.f29743u = 1;
                        arrayList.add(o13);
                        p61 o14 = p61.o(14, 35);
                        o14.f29743u = 1;
                        arrayList.add(o14);
                        p61 o15 = p61.o(15, 35);
                        o15.f29743u = 1;
                        arrayList.add(o15);
                    }
                }
            }
        }
    }

    public static void V(h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        b2Var.dismiss();
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.w2 w2Var = new yh.w2(bVar, tL_payments_paymentFormStarGift);
        Context context = h4Var.getContext();
        e6 e6Var = h4Var.resourcesProvider;
        int i10 = h4Var.currentAccount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        new yh.y2(context, e6Var, tL_starGiftUnique, w2Var, i10, j3, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2), true, new f90(h4Var, tL_starGiftUnique, j3, 1)).b();
    }

    public static void W(h4 h4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, yh.w2 w2Var, of.e eVar) {
        eVar.d();
        m5.x(h4Var.currentAccount, w2Var.f53328a).h(w2Var.f53329b, tL_starGiftUnique, j3, null, true, new org.telegram.tgnet.e(h4Var, eVar, tL_starGiftUnique, 6));
    }

    public static void X(h4 h4Var, g4 g4Var, Context context) {
        v3 v3Var = g4Var.f51256c;
        if (v3Var.f51557g.isEmpty()) {
            return;
        }
        p80 p80Var = new p80(h4Var.container, h4Var.resourcesProvider, h4Var.f51270c0, false, true, false);
        p80Var.f29790t = false;
        p80Var.Y = true;
        p80Var.a0(0.0f, AndroidUtilities.dp(-8.0f));
        p80Var.R = true;
        p80Var.f29784p = new ii.h(p80Var, 6);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(v3Var.f51557g);
        Collections.sort(arrayList, new a4(g4Var, 0));
        k71 k71Var = new k71(context, h4Var.currentAccount, 0, false, new w3(strArr, g4Var, arrayList, 1), new x3(g4Var, p80Var, 1), null, h4Var.resourcesProvider);
        k71Var.W2.f25280r = false;
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(h4Var.getThemedColor(i6.F8), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, x5.a(24.0f, 10.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        ru ruVar = new ru(context, h4Var.resourcesProvider);
        ruVar.setTextSize(1, 16.0f);
        ruVar.setInputType(573441);
        ruVar.setRawInputType(573441);
        ruVar.setHintTextColor(i6.w0(i6.A6, h4Var.resourcesProvider));
        ruVar.setCursorColor(i6.w0(i6.G6, h4Var.resourcesProvider));
        ruVar.setCursorSize(AndroidUtilities.dp(19.0f));
        ruVar.setCursorWidth(1.5f);
        ruVar.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
        ruVar.setTextColor(i6.w0(i6.E8, h4Var.resourcesProvider));
        ruVar.setBackground(null);
        frameLayout.addView(ruVar, x5.a(-2.0f, 43.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        ruVar.addTextChangedListener(new ho(strArr, k71Var, false, 12));
        if (arrayList.size() > 8) {
            p80Var.r(frameLayout, x5.n(-1, 44));
            p80Var.k();
        }
        if (!v3Var.f51560k.isEmpty()) {
            p80Var.c(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new y3(g4Var, 1), false);
        }
        p80Var.q(k71Var);
        p80Var.Z();
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
        yh.f2 f2Var = this.f51272e0;
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
        p61 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            qm0 qm0Var = this.d;
            if (i10 >= qm0Var.getChildCount()) {
                break;
            }
            View childAt = qm0Var.getChildAt(i10);
            if ((childAt instanceof j10) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f51276i0.G(R)) != null) {
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
            g4Var.f51255b.a();
        }
        if (z11) {
            g4Var.f51256c.g(false);
        }
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        f4 f4Var = new f4(this, qm0Var, getContext(), this.currentAccount, new hi.a(this, 19), this.resourcesProvider);
        this.f51276i0 = f4Var;
        return f4Var;
    }
}
