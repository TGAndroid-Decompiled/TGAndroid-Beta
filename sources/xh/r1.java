package xh;

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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb;
import org.telegram.ui.pj0;
import org.telegram.ui.u21;
import w7.y5;
import yh.b6;
import yh.k7;
import yh.l5;
import yh.u5;
import yh.w7;
import yh.y6;
public final class r1 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public static final int f46386v0 = 0;
    public final int X;
    public k61 Y;
    public List Z;
    public final Utilities.Callback f46387a0;
    public TLRPC.DisallowedGiftsSettings f46388b0;
    public final long f46389c0;
    public final boolean f46390d0;
    public final String f46391e0;
    public final k7 f46392f0;
    public final v0 f46393g0;
    public final FrameLayout f46394h0;
    public final LinearLayout f46395i0;
    public final nz f46396j0;
    public final a1 f46397k0;
    public final w0 f46398l0;
    public final x0 m0;
    public final ArrayList f46399n0;
    public final l5 f46400o0;
    public int f46401p0;
    public int f46402q0;
    public int f46403r0;
    public int f46404s0;
    public boolean f46405t0;
    public boolean f46406u0;

    public r1(LaunchActivity launchActivity, int i10, long j3) {
        this(launchActivity, i10, j3, null, null);
    }

    public static void P(final r1 r1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, o0 o0Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            o0Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r1Var.getContext(), 0, r1Var.resourcesProvider);
            alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f18654a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
            final ku kuVar = o9.f18696n;
            if (kuVar != null) {
                kuVar.setOnLinkPressListener(new j90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        r1 r1Var2 = r1.this;
                        r1Var2.getClass();
                        o9.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        r1Var2.dismiss();
                        clickableSpan.onClick(kuVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new xc(r1Var.container, r1Var.resourcesProvider).d0(tL_error, false);
        }
    }

    public static void Q(r1 r1Var, Context context, int i10, Utilities.Callback callback, long j3, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        w51 G = r1Var.Y.G(i11 - 1);
        if (G != null && G.G(i1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof rg.k) {
                new b1(r1Var, context, i10, (rg.k) obj, r1Var.f46389c0, new m0(r1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                l5 l5Var = r1Var.f46400o0;
                if (l5Var != null && r1Var.f46404s0 == r1Var.f46402q0) {
                    ArrayList arrayList = l5Var.f47690l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f18553id == starGift.f18553id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        c1 c1Var = new c1(r1Var, r1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), r1Var.resourcesProvider);
                        c1Var.j2(savedStarGift, null);
                        c1Var.Z1(j3, new org.telegram.messenger.f2(r1Var, c1Var, j3, callback, 5));
                    }
                } else if (G.f29953q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f19577a = true;
                        obj3.e = true;
                        d1 d1Var = new d1(j3, starGift.title, starGift.f18553id, r1Var.resourcesProvider, r1Var.container.getViewTreeObserver(), new Object());
                        d1Var.e = new pj0(13, r1Var, callback);
                        U.showAsSheet(d1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f18553id, new org.telegram.ui.Components.y2(context, r1Var.resourcesProvider, i10, j3, new m0(r1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    f6 f6Var = r1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.f3 j10 = rk.j(1, context, f6Var, false);
                        LinearLayout f7 = rk.f(context, 1);
                        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        f7.setClipChildren(false);
                        f7.setClipToPadding(false);
                        v9 v9Var = new v9(context);
                        w7.a1(v9Var.getImageReceiver(), starGift, 160);
                        f7.addView(v9Var, y5.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.Cells.c1.q(j6.f19201j5, f6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, y5.t(-1, -2, 17, 20, 0, 20, 4), context);
                        h.setTextSize(1, 14.0f);
                        h.setTypeface(AndroidUtilities.bold());
                        h.setGravity(17);
                        h.setTextColor(j6.v0(j6.f19333q7, f6Var));
                        h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        f7.addView(h, y5.t(-1, -2, 17, 20, 0, 20, 4));
                        a01 a01Var = new a01(context, f6Var);
                        if (starGift.first_sale_date != 0) {
                            a01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            a01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        a01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), w7.X0(false, hg.k0.j(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            w7.F0(a01Var, i10, starGift, f6Var);
                        }
                        f7.addView(a01Var, y5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        ci.d dVar = new ci.d(context, f6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        f7.addView(dVar, y5.n(-1, 48));
                        j10.customView = f7;
                        org.telegram.ui.ActionBar.f3[] f3VarArr = {j10};
                        f3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new b6(f3VarArr, 2));
                        f3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            f3VarArr[0].makeAttached(U2);
                        }
                        f3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new xc(r1Var.container, r1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    o0 o0Var = new o0(r1Var, context, i10, starGift, callback, 0);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(r1Var.getContext(), 3, null);
                        b2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f18553id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.p3(r1Var, b2Var, o0Var, callback, 15));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            rg.k1 k1Var = new rg.k1(U3, i10, null, null, starGift, r1Var.resourcesProvider);
                            v9 v9Var2 = new v9(r1Var.getContext());
                            n5 n5Var = new n5(AndroidUtilities.dp(160.0f), 4, v9Var2, false);
                            v9Var2.setImageDrawable(n5Var);
                            v9Var2.addOnAttachStateChangeListener(new u0(n5Var));
                            n5Var.i(starGift.getDocument(), false);
                            k1Var.B0 = v9Var2;
                            k1Var.show();
                            n5Var.f();
                        }
                    } else {
                        o0Var.run();
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList, k61 k61Var) {
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
        v0 v0Var = this.f46393g0;
        long j10 = this.f46389c0;
        long j11 = 0;
        boolean z17 = this.f46390d0;
        if (z17 || j10 < 0 || ((disallowedGiftsSettings4 = this.f46388b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(w51.k(v0Var));
            arrayList.add(w51.k(this.f46394h0));
            ArrayList arrayList3 = this.f46399n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = i1.f46198a;
                    w51 J = w51.J(i1.class);
                    J.f29957u = 1;
                    J.G = (rg.k) obj;
                    arrayList.add(J);
                    j11 = j11;
                }
                j3 = j11;
            } else {
                j3 = 0;
                w51 o9 = w51.o(1, 34);
                o9.f29957u = 1;
                arrayList.add(o9);
                w51 o10 = w51.o(2, 34);
                o10.f29957u = 1;
                arrayList.add(o10);
                w51 o11 = w51.o(3, 34);
                o11.f29957u = 1;
                arrayList.add(o11);
            }
            z10 = true;
        }
        int i12 = this.X;
        u5 y3 = u5.y(i12, false);
        if (this.f46405t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f46388b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ei.q1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new bb(3)).collect(Collectors.toCollection(new Object()));
        }
        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
        l5 l5Var = this.f46400o0;
        if (j10 != clientUserId && l5Var != null) {
            ArrayList arrayList4 = l5Var.f47690l;
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
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f46388b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && l5Var != null && !l5Var.f47690l.isEmpty()))) {
            if (!z10) {
                arrayList.add(w51.k(v0Var));
            } else {
                arrayList.add(w51.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(w51.k(this.f46395i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f46388b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f46402q0 = -1;
            this.f46401p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f46401p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f46388b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f46402q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f46403r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i16 = this.f46404s0;
            q0 q0Var = new q0(this, 0);
            int i17 = p1.f46366a;
            w51 J2 = w51.J(p1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f29961z = i16;
            J2.H = q0Var;
            arrayList.add(J2);
            if (this.f46404s0 == this.f46403r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f46406u0) {
                this.f46406u0 = z12;
                ViewPropertyAnimator animate = this.f46398l0.animate();
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
                qr qrVar = qr.h;
                duration.setInterpolator(qrVar).start();
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
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(qrVar).start();
            }
            if (l5Var != null && this.f46404s0 == this.f46402q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = l5Var.f47690l;
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
                int i21 = this.f46404s0;
                if (i21 == this.f46401p0 || i21 == this.f46402q0 || (i21 == this.f46403r0 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j3 && i21 != this.f46403r0) {
                        if (i21 == this.f46402q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f46388b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        w51 a2 = i1.a(i21, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i22 = this.f46404s0;
                    if (i22 == this.f46402q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f46388b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(i1.a(i22, starGift, z13, z14, true, false, false));
                    i19++;
                }
            }
            int i23 = this.f46404s0;
            int i24 = this.f46402q0;
            if (i23 == i24 && l5Var != null && !l5Var.f47688j) {
                l5Var.a();
                w51 o12 = w51.o(4, 34);
                o12.f29957u = 1;
                arrayList.add(o12);
                w51 o13 = w51.o(5, 34);
                o13.f29957u = 1;
                arrayList.add(o13);
                w51 o14 = w51.o(6, 34);
                o14.f29957u = 1;
                arrayList.add(o14);
            } else if (i23 != i24 && y3.C) {
                w51 o15 = w51.o(4, 34);
                o15.f29957u = 1;
                arrayList.add(o15);
                w51 o16 = w51.o(5, 34);
                o16.f29957u = 1;
                arrayList.add(o16);
                w51 o17 = w51.o(6, 34);
                o17.f29957u = 1;
                arrayList.add(o17);
            }
            if (i19 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(w51.C(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f46388b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(w51.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void V(boolean z10) {
        this.f46405t0 = z10;
        this.Y.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f46399n0;
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
                    rg.k kVar = new rg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        c5.a aVar = new c5.a();
                        aVar.f3843c = "inapp";
                        aVar.f3842b = kVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((rg.k) obj).f42638g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new r5.d(this, 17));
            }
        }
        if (arrayList.isEmpty()) {
            tg.s.j(this.X, null, new q0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k61 k61Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            k61 k61Var2 = this.Y;
            if (k61Var2 != null) {
                k61Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j3 = this.f46389c0;
                if (longValue == j3 && j3 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
                    if (j3 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f46388b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        return;
                    }
                    k61 k61Var3 = this.Y;
                    if (k61Var3 != null) {
                        k61Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f46399n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    W();
                    k61 k61Var4 = this.Y;
                    if (k61Var4 != null) {
                        k61Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new xc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                k61 k61Var5 = this.Y;
                if (k61Var5 != null) {
                    k61Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f46400o0 && (k61Var = this.Y) != null) {
            k61Var.N(true);
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f46388b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f46389c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.X, 0, true, new hi.a(this, 16), this.resourcesProvider);
        this.Y = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        if (this.f46390d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f46391e0), null, false);
    }

    public r1(final Context context, final int i10, final long j3, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        int i11;
        this.f46399n0 = new ArrayList();
        this.f46401p0 = -1;
        this.f46402q0 = -1;
        this.f46403r0 = -1;
        new ArrayList();
        this.X = i10;
        this.f46389c0 = j3;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j3;
        this.f46390d0 = z10;
        this.Z = list;
        this.f46387a0 = callback;
        int i12 = j6.f19057b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(j6.w0(null, i12, false));
        fixNavigationBar(j6.w0(null, i12, false));
        this.f46400o0 = u5.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        u5.y(i10, false).V();
        v9 v9Var = new v9(context);
        v9Var.setImportantForAccessibility(2);
        g9 g9Var = new g9((f6) null);
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f46391e0 = UserObject.getForcedFirstName(user);
            g9Var.r(user);
            v9Var.e(user, g9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (j3 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.f46388b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.f46391e0 = chat == null ? "" : chat.title;
            g9Var.q(chat);
            v9Var.e(chat, g9Var);
        }
        this.v = 0.1f;
        k7 k7Var = new k7(context, i10, this.resourcesProvider);
        this.f46392f0 = k7Var;
        w7.b6.a(k7Var);
        k7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46394h0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f46393g0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(new y6(context, 70, 0), y5.c(-1.0f, -1));
        v9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(v9Var, y5.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        w7.b6.a(v9Var);
        v9Var.setOnClickListener(new ai.a3(this, j3, 5));
        frameLayout2.addView(k7Var, y5.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, y5.e(-1, -2, 55));
        TextView f7 = org.telegram.messenger.l0.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i14 = j6.f19201j5;
        f7.setTextColor(j6.v0(i14, this.resourcesProvider));
        f7.setGravity(17);
        linearLayout.addView(f7, y5.t(-1, -2, 1, 4, 0, 4, 0));
        f7.setMaxWidth(ci.f4.a(f7.getText(), f7.getPaint()));
        k90 k90Var = new k90(context, this.resourcesProvider);
        int i15 = j6.gc;
        k90Var.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        k90Var.setTextSize(1, 14.0f);
        k90Var.setTextColor(j6.v0(i14, this.resourcesProvider));
        k90Var.setGravity(17);
        k90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(k90Var, y5.t(-1, -2, 1, 4, 4, 4, 12));
        f7.setText(LocaleController.getString(R.string.Gift2Premium));
        k90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f46391e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new u21(17)), true)));
        k90Var.setMaxWidth(ci.f4.a(k90Var.getText(), k90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f46395i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(j6.v0(i14, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, y5.t(-1, -2, 1, 4, 0, 4, 0));
        ?? k90Var2 = new k90(context, this.resourcesProvider);
        this.f46398l0 = k90Var2;
        k90Var2.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        k90Var2.setTextSize(1, 14.0f);
        k90Var2.setTextColor(j6.v0(i14, this.resourcesProvider));
        k90Var2.setGravity(17);
        ?? k90Var3 = new k90(context, this.resourcesProvider);
        this.m0 = k90Var3;
        k90Var3.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        k90Var3.setTextSize(1, 14.0f);
        k90Var3.setTextColor(j6.v0(i14, this.resourcesProvider));
        k90Var3.setGravity(17);
        k90Var3.setAlpha(0.0f);
        k90Var3.setScaleX(0.85f);
        k90Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) k90Var2, y5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) k90Var3, y5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z10) {
            linearLayout2.addView(frameLayout3, y5.t(-2, -2, 1, 0, 9, 0, 4));
            k90 k90Var4 = new k90(context, this.resourcesProvider);
            k90Var4.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
            k90Var4.setTextSize(1, 14.0f);
            k90Var4.setTextColor(j6.v0(i14, this.resourcesProvider));
            k90Var4.setGravity(17);
            linearLayout2.addView(k90Var4, y5.t(-2, -2, 1, 26, 4, 26, 6));
            k90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            k90Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, y5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(k90Var2);
            k90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f46391e0)), k90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, y5.t(-1, -2, 1, 0, 9, 0, 6));
            l5 G = u5.y(i10, false).G(j3, true);
            org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(this, G, j3, callback, context, 8);
            fVar.run();
            k90Var2.addOnAttachStateChangeListener(new y0(fVar));
            if (G.f47690l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(k90Var2, NotificationCenter.starUserGiftsLoaded, new pj0(14, G, fVar));
        }
        nz nzVar = new nz(3, false);
        this.f46396j0 = nzVar;
        nzVar.O = new z0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(nzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? jVar = new s4.j();
        this.f46397k0 = jVar;
        jVar.C = false;
        jVar.f43009m = false;
        jVar.n(350L);
        jVar.o(qr.h);
        jVar.D = 40L;
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new jl0() {
            @Override
            public final void d(int i16, View view) {
                r1.Q(r1.this, context, i10, callback, j3, i16);
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
        this.e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
