package yh;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.z6;
import org.telegram.ui.fb;
import w7.z5;
import zh.d7;
import zh.f5;
import zh.n5;
import zh.p7;
import zh.u5;
public final class p1 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static final int f49055v0 = 0;
    public final int X;
    public a71 Y;
    public List Z;
    public final Utilities.Callback f49056a0;
    public TLRPC.DisallowedGiftsSettings f49057b0;
    public final long f49058c0;
    public final boolean f49059d0;
    public final String f49060e0;
    public final d7 f49061f0;
    public final u0 f49062g0;
    public final FrameLayout f49063h0;
    public final LinearLayout f49064i0;
    public final zz f49065j0;
    public final z0 f49066k0;
    public final v0 f49067l0;
    public final w0 m0;
    public final ArrayList f49068n0;
    public final f5 f49069o0;
    public int f49070p0;
    public int f49071q0;
    public int f49072r0;
    public int f49073s0;
    public boolean f49074t0;
    public boolean f49075u0;

    public p1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    public static void Q(final p1 p1Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, rg.g2 g2Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        a2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            g2Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f19248a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.a2 o10 = alertDialog$Builder.o();
            final wu wuVar = o10.f19275n;
            if (wuVar != null) {
                wuVar.setOnLinkPressListener(new ca0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        p1 p1Var2 = p1.this;
                        p1Var2.getClass();
                        o10.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        p1Var2.dismiss();
                        clickableSpan.onClick(wuVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new zc(p1Var.container, p1Var.resourcesProvider).f0(tL_error, false);
        }
    }

    public static void R(p1 p1Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        m61 G = p1Var.Y.G(i11 - 1);
        if (G != null && G.G(g1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof sg.k) {
                new a1(p1Var, context, i10, (sg.k) obj, p1Var.f49058c0, new n0(p1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                f5 f5Var = p1Var.f49069o0;
                if (f5Var != null && p1Var.f49073s0 == p1Var.f49071q0) {
                    ArrayList arrayList = f5Var.f50510l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f19141id == starGift.f19141id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        b1 b1Var = new b1(p1Var, p1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), p1Var.resourcesProvider);
                        b1Var.l2(savedStarGift, null);
                        b1Var.a2(j10, new bi.i(p1Var, b1Var, j10, callback, 6));
                    }
                } else if (G.f26951q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f20169a = true;
                        obj3.e = true;
                        c1 c1Var = new c1(j10, starGift.title, starGift.f19141id, p1Var.resourcesProvider, p1Var.container.getViewTreeObserver(), new Object());
                        c1Var.e = new z6(8, p1Var, callback);
                        U.showAsSheet(c1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f19141id, new org.telegram.ui.Components.b3(context, p1Var.resourcesProvider, i10, j10, new n0(p1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    c6 c6Var = p1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.e3 i13 = sk.i(1, context, c6Var, false);
                        LinearLayout e = sk.e(context, 1);
                        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        e.setClipChildren(false);
                        e.setClipToPadding(false);
                        z9 z9Var = new z9(context);
                        p7.b1(z9Var.getImageReceiver(), starGift, 160);
                        e.addView(z9Var, z5.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.Cells.c1.n(g6.f19707j5, c6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView i14 = com.google.android.gms.internal.play_billing.k3.i(e, textView, z5.t(-1, -2, 17, 20, 0, 20, 4), context);
                        i14.setTextSize(1, 14.0f);
                        i14.setTypeface(AndroidUtilities.bold());
                        i14.setGravity(17);
                        i14.setTextColor(g6.w0(g6.f19839q7, c6Var));
                        i14.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        e.addView(i14, z5.t(-1, -2, 17, 20, 0, 20, 4));
                        o01 o01Var = new o01(context, c6Var);
                        if (starGift.first_sale_date != 0) {
                            o01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            o01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        o01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), p7.Y0(false, org.telegram.messenger.g0.h(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            p7.G0(o01Var, i10, starGift, c6Var);
                        }
                        e.addView(o01Var, z5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        di.d dVar = new di.d(context, c6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        e.addView(dVar, z5.n(-1, 48));
                        i13.customView = e;
                        org.telegram.ui.ActionBar.e3[] e3VarArr = {i13};
                        e3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new u5(e3VarArr, 2));
                        e3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            e3VarArr[0].makeAttached(U2);
                        }
                        e3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new zc(p1Var.container, p1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    rg.g2 g2Var = new rg.g2(p1Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(p1Var.getContext(), 3, null);
                        a2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f19141id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new bi.f3(p1Var, a2Var, g2Var, callback, 15));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            sg.m1 m1Var = new sg.m1(U3, i10, null, null, starGift, p1Var.resourcesProvider);
                            z9 z9Var2 = new z9(p1Var.getContext());
                            q5 q5Var = new q5(AndroidUtilities.dp(160.0f), 4, z9Var2, false);
                            z9Var2.setImageDrawable(q5Var);
                            z9Var2.addOnAttachStateChangeListener(new t0(q5Var));
                            q5Var.i(starGift.getDocument(), false);
                            m1Var.B0 = z9Var2;
                            m1Var.show();
                            q5Var.f();
                        }
                    } else {
                        g2Var.run();
                    }
                }
            }
        }
    }

    @Override
    public final CharSequence B() {
        if (this.f49059d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f49060e0), null, false);
    }

    public final void V(ArrayList arrayList, a71 a71Var) {
        long j10;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        float f7;
        TL_stars.StarGift starGift;
        boolean z13;
        boolean z14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z15;
        boolean z16;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f10;
        float f11;
        float f12;
        float f13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        u0 u0Var = this.f49062g0;
        long j11 = this.f49058c0;
        long j12 = 0;
        boolean z17 = this.f49059d0;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.f49057b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(m61.k(u0Var));
            arrayList.add(m61.k(this.f49063h0));
            ArrayList arrayList3 = this.f49068n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = g1.f48874a;
                    m61 J = m61.J(g1.class);
                    J.f26955u = 1;
                    J.G = (sg.k) obj;
                    arrayList.add(J);
                    j12 = j12;
                }
                j10 = j12;
            } else {
                j10 = 0;
                m61 o10 = m61.o(1, 34);
                o10.f26955u = 1;
                arrayList.add(o10);
                m61 o11 = m61.o(2, 34);
                o11.f26955u = 1;
                arrayList.add(o11);
                m61 o12 = m61.o(3, 34);
                o12.f26955u = 1;
                arrayList.add(o12);
            }
            z10 = true;
        }
        int i12 = this.X;
        n5 y3 = n5.y(i12, false);
        if (this.f49074t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f49057b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new fi.p1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new fb(3)).collect(Collectors.toCollection(new Object()));
        }
        int i14 = (j11 > UserConfig.getInstance(i12).getClientUserId() ? 1 : (j11 == UserConfig.getInstance(i12).getClientUserId() ? 0 : -1));
        f5 f5Var = this.f49069o0;
        if (i14 != 0 && f5Var != null) {
            ArrayList arrayList4 = f5Var.f50510l;
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList4.get(i15);
                i15++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f49057b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && f5Var != null && !f5Var.f50510l.isEmpty()))) {
            if (!z10) {
                arrayList.add(m61.k(u0Var));
            } else {
                arrayList.add(m61.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(m61.k(this.f49064i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f49057b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i16)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f49071q0 = -1;
            this.f49070p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f49070p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f49057b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f49071q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f49072r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i17 = this.f49073s0;
            p0 p0Var = new p0(this, 0);
            int i18 = n1.f49034a;
            m61 J2 = m61.J(n1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f26959z = i17;
            J2.H = p0Var;
            arrayList.add(J2);
            if (this.f49073s0 == this.f49072r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f49075u0) {
                this.f49075u0 = z12;
                ViewPropertyAnimator animate = this.f49067l0.animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (!z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (!z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(380L);
                es esVar = es.h;
                duration.setInterpolator(esVar).start();
                ViewPropertyAnimator animate2 = this.m0.animate();
                if (z12) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!z12) {
                    f15 = 0.85f;
                }
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(esVar).start();
            }
            if (f5Var != null && this.f49073s0 == this.f49071q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = f5Var.f50510l;
                int size3 = arrayList6.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj3 = arrayList6.get(i19);
                    i19++;
                    TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift2);
                    }
                }
            }
            int i20 = 0;
            for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList2.get(i21);
                int i22 = this.f49073s0;
                if (i22 == this.f49070p0 || i22 == this.f49071q0 || (i22 == this.f49072r0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i22 != this.f49072r0) {
                        if (i22 == this.f49071q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f49057b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        m61 a2 = g1.a(i22, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i20++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f49073s0;
                    if (i23 == this.f49071q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f49057b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(g1.a(i23, starGift, z13, z14, true, false, false));
                    i20++;
                }
            }
            int i24 = this.f49073s0;
            int i25 = this.f49071q0;
            if (i24 == i25 && f5Var != null && !f5Var.f50508j) {
                f5Var.a();
                m61 o13 = m61.o(4, 34);
                o13.f26955u = 1;
                arrayList.add(o13);
                m61 o14 = m61.o(5, 34);
                o14.f26955u = 1;
                arrayList.add(o14);
                m61 o15 = m61.o(6, 34);
                o15.f26955u = 1;
                arrayList.add(o15);
            } else if (i24 != i25 && y3.C) {
                m61 o16 = m61.o(4, 34);
                o16.f26955u = 1;
                arrayList.add(o16);
                m61 o17 = m61.o(5, 34);
                o17.f26955u = 1;
                arrayList.add(o17);
                m61 o18 = m61.o(6, 34);
                o18.f26955u = 1;
                arrayList.add(o18);
            }
            if (i20 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(m61.C(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f49057b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(m61.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void W(boolean z10) {
        this.f49074t0 = z10;
        this.Y.N(false);
    }

    public final void X() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f49068n0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.Z) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.Z.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.Z.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.Z.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                            if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                                break;
                            }
                        } else {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                    }
                    sg.k kVar = new sg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        ?? obj = new Object();
                        obj.f4327b = "inapp";
                        obj.f4326a = kVar.h();
                        arrayList2.add(obj.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((sg.k) obj2).f45234g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new rg.b0(this, 21));
            }
        }
        if (arrayList.isEmpty()) {
            ug.s.j(this.X, null, new p0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            X();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            a71 a71Var2 = this.Y;
            if (a71Var2 != null) {
                a71Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.f49058c0;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f49057b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            zc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    a71 a71Var3 = this.Y;
                    if (a71Var3 != null) {
                        a71Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f49068n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    X();
                    a71 a71Var4 = this.Y;
                    if (a71Var4 != null) {
                        a71Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new zc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                a71 a71Var5 = this.Y;
                if (a71Var5 != null) {
                    a71Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f49069o0 && (a71Var = this.Y) != null) {
            a71Var.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i10 = this.X;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void show() {
        int i10 = this.X;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f49057b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                zc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f49058c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.X, 0, true, new ii.a(this, 16), this.resourcesProvider);
        this.Y = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }

    public p1(final android.content.Context r28, final int r29, final long r30, java.util.List r32, final org.telegram.messenger.Utilities.Callback r33) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p1.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.Utilities$Callback):void");
    }
}
