package yh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
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
import org.telegram.messenger.BirthdayController;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ab;
import org.telegram.ui.oj0;
import org.telegram.ui.q31;
import w7.x5;
import zh.j5;
import zh.j7;
import zh.o6;
import zh.s5;
import zh.v7;
import zh.x6;
import zh.z5;
public final class p1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int f50511v0 = 0;
    public final int X;
    public v51 Y;
    public List Z;
    public final Utilities.Callback f50512a0;
    public TLRPC.DisallowedGiftsSettings f50513b0;
    public final long f50514c0;
    public final boolean f50515d0;
    public final String f50516e0;
    public final j7 f50517f0;
    public final u0 f50518g0;
    public final FrameLayout f50519h0;
    public final LinearLayout f50520i0;
    public final nz f50521j0;
    public final z0 f50522k0;
    public final v0 f50523l0;
    public final w0 m0;
    public final ArrayList f50524n0;
    public final j5 f50525o0;
    public int f50526p0;
    public int f50527q0;
    public int f50528r0;
    public int f50529s0;
    public boolean f50530t0;
    public boolean f50531u0;

    public p1(LaunchActivity launchActivity, int i10, long j3) {
        this(launchActivity, i10, j3, null, null);
    }

    public static void P(final p1 p1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, o6 o6Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            o6Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f20225a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
            final iu iuVar = o9.f20270n;
            if (iuVar != null) {
                iuVar.setOnLinkPressListener(new c90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        p1 p1Var2 = p1.this;
                        p1Var2.getClass();
                        o9.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        p1Var2.dismiss();
                        clickableSpan.onClick(iuVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new yc(p1Var.container, p1Var.resourcesProvider).d0(tL_error, false);
        }
    }

    public static void Q(p1 p1Var, Context context, int i10, Utilities.Callback callback, long j3, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        h51 G = p1Var.Y.G(i11 - 1);
        if (G != null && G.G(g1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof sg.k) {
                new a1(p1Var, context, i10, (sg.k) obj, p1Var.f50514c0, new m0(p1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                j5 j5Var = p1Var.f50525o0;
                if (j5Var != null && p1Var.f50529s0 == p1Var.f50527q0) {
                    ArrayList arrayList = j5Var.f52132l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f20124id == starGift.f20124id) {
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
                        b1Var.j2(savedStarGift, null);
                        b1Var.Z1(j3, new org.telegram.messenger.f2(p1Var, b1Var, j3, callback, 5));
                    }
                } else if (G.f26626q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f21169a = true;
                        obj3.f21172e = true;
                        c1 c1Var = new c1(j3, starGift.title, starGift.f20124id, p1Var.resourcesProvider, p1Var.container.getViewTreeObserver(), new Object());
                        c1Var.f50324e = new oj0(13, p1Var, callback);
                        U.showAsSheet(c1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f20124id, new org.telegram.ui.Components.z2(context, p1Var.resourcesProvider, i10, j3, new m0(p1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    f6 f6Var = p1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.f3 i13 = wl.i(1, context, f6Var, false);
                        LinearLayout f7 = wl.f(context, 1);
                        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        f7.setClipChildren(false);
                        f7.setClipToPadding(false);
                        x9 x9Var = new x9(context);
                        v7.a1(x9Var.getImageReceiver(), starGift, 160);
                        f7.addView(x9Var, x5.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        wl.x(j6.f20797j5, f6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, x5.t(-1, -2, 17, 20, 0, 20, 4), context);
                        h.setTextSize(1, 14.0f);
                        h.setTypeface(AndroidUtilities.bold());
                        h.setGravity(17);
                        h.setTextColor(j6.v0(j6.f20925q7, f6Var));
                        h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        f7.addView(h, x5.t(-1, -2, 17, 20, 0, 20, 4));
                        oz0 oz0Var = new oz0(context, f6Var);
                        if (starGift.first_sale_date != 0) {
                            oz0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            oz0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        oz0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), v7.X0(false, i2.g.k(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            v7.F0(oz0Var, i10, starGift, f6Var);
                        }
                        f7.addView(oz0Var, x5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        di.d dVar = new di.d(context, f6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        f7.addView(dVar, x5.n(-1, 48));
                        i13.customView = f7;
                        org.telegram.ui.ActionBar.f3[] f3VarArr = {i13};
                        f3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new z5(f3VarArr, 2));
                        f3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            f3VarArr[0].makeAttached(U2);
                        }
                        f3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new yc(p1Var.container, p1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    o6 o6Var = new o6(p1Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(p1Var.getContext(), 3, null);
                        b2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f20124id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new bi.c3(p1Var, b2Var, o6Var, callback, 15));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            sg.o1 o1Var = new sg.o1(U3, i10, null, null, starGift, p1Var.resourcesProvider);
                            x9 x9Var2 = new x9(p1Var.getContext());
                            o5 o5Var = new o5(AndroidUtilities.dp(160.0f), 4, x9Var2, false);
                            x9Var2.setImageDrawable(o5Var);
                            x9Var2.addOnAttachStateChangeListener(new t0(o5Var));
                            o5Var.i(starGift.getDocument(), false);
                            o1Var.B0 = x9Var2;
                            o1Var.show();
                            o5Var.f();
                        }
                    } else {
                        o6Var.run();
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList, v51 v51Var) {
        long j3;
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
        u0 u0Var = this.f50518g0;
        long j10 = this.f50514c0;
        long j11 = 0;
        boolean z17 = this.f50515d0;
        if (z17 || j10 < 0 || ((disallowedGiftsSettings4 = this.f50513b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(h51.k(u0Var));
            arrayList.add(h51.k(this.f50519h0));
            ArrayList arrayList3 = this.f50524n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = g1.f50318a;
                    h51 J = h51.J(g1.class);
                    J.f26630u = 1;
                    J.G = (sg.k) obj;
                    arrayList.add(J);
                    j11 = j11;
                }
                j3 = j11;
            } else {
                j3 = 0;
                h51 o9 = h51.o(1, 34);
                o9.f26630u = 1;
                arrayList.add(o9);
                h51 o10 = h51.o(2, 34);
                o10.f26630u = 1;
                arrayList.add(o10);
                h51 o11 = h51.o(3, 34);
                o11.f26630u = 1;
                arrayList.add(o11);
            }
            z10 = true;
        }
        int i12 = this.X;
        s5 y3 = s5.y(i12, false);
        if (this.f50530t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f50513b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new fi.q1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ab(3)).collect(Collectors.toCollection(new Object()));
        }
        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
        j5 j5Var = this.f50525o0;
        if (j10 != clientUserId && j5Var != null) {
            ArrayList arrayList4 = j5Var.f52132l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f50513b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && j5Var != null && !j5Var.f52132l.isEmpty()))) {
            if (!z10) {
                arrayList.add(h51.k(u0Var));
            } else {
                arrayList.add(h51.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(h51.k(this.f50520i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f50513b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f50527q0 = -1;
            this.f50526p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f50526p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f50513b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f50527q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f50528r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i16 = this.f50529s0;
            p0 p0Var = new p0(this, 0);
            int i17 = n1.f50487a;
            h51 J2 = h51.J(n1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f26634z = i16;
            J2.H = p0Var;
            arrayList.add(J2);
            if (this.f50529s0 == this.f50528r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f50531u0) {
                this.f50531u0 = z12;
                ViewPropertyAnimator animate = this.f50523l0.animate();
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
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
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
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(prVar).start();
            }
            if (j5Var != null && this.f50529s0 == this.f50527q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = j5Var.f52132l;
                int size3 = arrayList6.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList6.get(i18);
                    i18++;
                    TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift2);
                    }
                }
            }
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList2.get(i20);
                int i21 = this.f50529s0;
                if (i21 == this.f50526p0 || i21 == this.f50527q0 || (i21 == this.f50528r0 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j3 && i21 != this.f50528r0) {
                        if (i21 == this.f50527q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f50513b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        h51 a2 = g1.a(i21, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i22 = this.f50529s0;
                    if (i22 == this.f50527q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f50513b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(g1.a(i22, starGift, z13, z14, true, false, false));
                    i19++;
                }
            }
            int i23 = this.f50529s0;
            int i24 = this.f50527q0;
            if (i23 == i24 && j5Var != null && !j5Var.f52130j) {
                j5Var.a();
                h51 o12 = h51.o(4, 34);
                o12.f26630u = 1;
                arrayList.add(o12);
                h51 o13 = h51.o(5, 34);
                o13.f26630u = 1;
                arrayList.add(o13);
                h51 o14 = h51.o(6, 34);
                o14.f26630u = 1;
                arrayList.add(o14);
            } else if (i23 != i24 && y3.C) {
                h51 o15 = h51.o(4, 34);
                o15.f26630u = 1;
                arrayList.add(o15);
                h51 o16 = h51.o(5, 34);
                o16.f26630u = 1;
                arrayList.add(o16);
                h51 o17 = h51.o(6, 34);
                o17.f26630u = 1;
                arrayList.add(o17);
            }
            if (i19 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(h51.C(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f50513b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(h51.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void V(boolean z10) {
        this.f50530t0 = z10;
        this.Y.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f50524n0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.Z) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j3 = 0;
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
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        ?? obj = new Object();
                        obj.f4369b = "inapp";
                        obj.f4368a = kVar.h();
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
                    ((sg.k) obj2).f46157g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new rg.p2(this, 17));
            }
        }
        if (arrayList.isEmpty()) {
            ug.t.j(this.X, null, new p0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            v51 v51Var2 = this.Y;
            if (v51Var2 != null) {
                v51Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j3 = this.f50514c0;
                if (longValue == j3 && j3 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
                    if (j3 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f50513b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            yc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        return;
                    }
                    v51 v51Var3 = this.Y;
                    if (v51Var3 != null) {
                        v51Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f50524n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    W();
                    v51 v51Var4 = this.Y;
                    if (v51Var4 != null) {
                        v51Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new yc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                v51 v51Var5 = this.Y;
                if (v51Var5 != null) {
                    v51Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50525o0 && (v51Var = this.Y) != null) {
            v51Var.N(true);
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f50513b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                yc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f50514c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.X, 0, true, new ii.a(this, 16), this.resourcesProvider);
        this.Y = v51Var;
        v51Var.f31162r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        if (this.f50515d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f50516e0), null, false);
    }

    public p1(final Context context, final int i10, final long j3, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        int i11;
        this.f50524n0 = new ArrayList();
        this.f50526p0 = -1;
        this.f50527q0 = -1;
        this.f50528r0 = -1;
        new ArrayList();
        this.X = i10;
        this.f50514c0 = j3;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j3;
        this.f50515d0 = z10;
        this.Z = list;
        this.f50512a0 = callback;
        int i12 = j6.f20653b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(j6.w0(null, i12, false));
        fixNavigationBar(j6.w0(null, i12, false));
        this.f50525o0 = s5.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        s5.y(i10, false).V();
        x9 x9Var = new x9(context);
        x9Var.setImportantForAccessibility(2);
        i9 i9Var = new i9((f6) null);
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f50516e0 = UserObject.getForcedFirstName(user);
            i9Var.r(user);
            x9Var.e(user, i9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (j3 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.f50513b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.f50516e0 = chat == null ? "" : chat.title;
            i9Var.q(chat);
            x9Var.e(chat, i9Var);
        }
        this.v = 0.1f;
        j7 j7Var = new j7(context, i10, this.resourcesProvider);
        this.f50517f0 = j7Var;
        w7.z5.a(j7Var);
        j7Var.setOnClickListener(new ji.m4(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50519h0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f50518g0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(new x6(context, 70, 0), x5.c(-1.0f, -1));
        x9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(x9Var, x5.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        w7.z5.a(x9Var);
        x9Var.setOnClickListener(new bi.o2(this, j3, 5));
        frameLayout2.addView(j7Var, x5.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, x5.e(-1, -2, 55));
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i14 = j6.f20797j5;
        g10.setTextColor(j6.v0(i14, this.resourcesProvider));
        g10.setGravity(17);
        linearLayout.addView(g10, x5.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(di.f4.a(g10.getText(), g10.getPaint()));
        d90 d90Var = new d90(context, this.resourcesProvider);
        int i15 = j6.gc;
        d90Var.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTextColor(j6.v0(i14, this.resourcesProvider));
        d90Var.setGravity(17);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(d90Var, x5.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(LocaleController.getString(R.string.Gift2Premium));
        d90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f50516e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new q31(17)), true)));
        d90Var.setMaxWidth(di.f4.a(d90Var.getText(), d90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f50520i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(j6.v0(i14, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, x5.t(-1, -2, 1, 4, 0, 4, 0));
        ?? d90Var2 = new d90(context, this.resourcesProvider);
        this.f50523l0 = d90Var2;
        d90Var2.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        d90Var2.setTextSize(1, 14.0f);
        d90Var2.setTextColor(j6.v0(i14, this.resourcesProvider));
        d90Var2.setGravity(17);
        ?? d90Var3 = new d90(context, this.resourcesProvider);
        this.m0 = d90Var3;
        d90Var3.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        d90Var3.setTextSize(1, 14.0f);
        d90Var3.setTextColor(j6.v0(i14, this.resourcesProvider));
        d90Var3.setGravity(17);
        d90Var3.setAlpha(0.0f);
        d90Var3.setScaleX(0.85f);
        d90Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) d90Var2, x5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) d90Var3, x5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z10) {
            linearLayout2.addView(frameLayout3, x5.t(-2, -2, 1, 0, 9, 0, 4));
            d90 d90Var4 = new d90(context, this.resourcesProvider);
            d90Var4.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
            d90Var4.setTextSize(1, 14.0f);
            d90Var4.setTextColor(j6.v0(i14, this.resourcesProvider));
            d90Var4.setGravity(17);
            linearLayout2.addView(d90Var4, x5.t(-2, -2, 1, 26, 4, 26, 6));
            d90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            d90Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, x5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(d90Var2);
            d90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f50516e0)), d90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, x5.t(-1, -2, 1, 0, 9, 0, 6));
            j5 G = s5.y(i10, false).G(j3, true);
            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(this, G, j3, callback, context, 8);
            fVar.run();
            d90Var2.addOnAttachStateChangeListener(new x0(fVar));
            if (G.f52132l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(d90Var2, NotificationCenter.starUserGiftsLoaded, new oj0(14, G, fVar));
        }
        nz nzVar = new nz(3, false);
        this.f50521j0 = nzVar;
        nzVar.O = new y0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(nzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? jVar = new s4.j();
        this.f50522k0 = jVar;
        jVar.C = false;
        jVar.f45805m = false;
        jVar.n(350L);
        jVar.o(pr.h);
        jVar.D = 40L;
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new zk0() {
            @Override
            public final void a(int i16, View view) {
                p1.Q(p1.this, context, i10, callback, j3, i16);
            }
        });
        W();
        this.Y.N(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j3)) {
            V(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f24674e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.f24674e.getTitleTextView());
    }
}
