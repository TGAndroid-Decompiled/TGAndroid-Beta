package xh;

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
import org.telegram.messenger.ai;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.b7;
import org.telegram.ui.ab;
import w7.x5;
import yh.d7;
import yh.f5;
import yh.n5;
import yh.p7;
import yh.u5;
public final class r1 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static final int f51565v0 = 0;
    public final int X;
    public e71 Y;
    public List Z;
    public final Utilities.Callback f51566a0;
    public TLRPC.DisallowedGiftsSettings f51567b0;
    public final long f51568c0;
    public final boolean f51569d0;
    public final String f51570e0;
    public final d7 f51571f0;
    public final w0 f51572g0;
    public final FrameLayout f51573h0;
    public final LinearLayout f51574i0;
    public final e00 f51575j0;
    public final b1 f51576k0;
    public final x0 f51577l0;
    public final y0 m0;
    public final ArrayList f51578n0;
    public final f5 f51579o0;
    public int f51580p0;
    public int f51581q0;
    public int f51582r0;
    public int f51583s0;
    public boolean f51584t0;
    public boolean f51585u0;

    public r1(LaunchActivity launchActivity, int i10, long j3) {
        this(launchActivity, i10, j3, null, null);
    }

    public static void Q(final r1 r1Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, qg.e2 e2Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        a2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            e2Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r1Var.getContext(), 0, r1Var.resourcesProvider);
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f20368a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.a2 o9 = alertDialog$Builder.o();
            final bv bvVar = o9.f20396n;
            if (bvVar != null) {
                bvVar.setOnLinkPressListener(new ea0() {
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
                        clickableSpan.onClick(bvVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new ad(r1Var.container, r1Var.resourcesProvider).f0(tL_error, false);
        }
    }

    public static void R(r1 r1Var, Context context, int i10, Utilities.Callback callback, long j3, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        r61 G = r1Var.Y.G(i11 - 1);
        if (G != null && G.G(i1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof rg.k) {
                new c1(r1Var, context, i10, (rg.k) obj, r1Var.f51568c0, new o0(r1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                f5 f5Var = r1Var.f51579o0;
                if (f5Var != null && r1Var.f51583s0 == r1Var.f51581q0) {
                    ArrayList arrayList = f5Var.f52606l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f20259id == starGift.f20259id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        d1 d1Var = new d1(r1Var, r1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), r1Var.resourcesProvider);
                        d1Var.l2(savedStarGift, null);
                        d1Var.a2(j3, new ai.l(r1Var, d1Var, j3, callback, 9));
                    }
                } else if (G.f30366q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f21313a = true;
                        obj3.f21316e = true;
                        e1 e1Var = new e1(j3, starGift.title, starGift.f20259id, r1Var.resourcesProvider, r1Var.container.getViewTreeObserver(), new Object());
                        e1Var.f51372e = new b7(8, r1Var, callback);
                        U.showAsSheet(e1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f20259id, new org.telegram.ui.Components.b3(context, r1Var.resourcesProvider, i10, j3, new o0(r1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    d6 d6Var = r1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.e3 i13 = ai.i(1, context, d6Var, false);
                        LinearLayout e7 = ai.e(context, 1);
                        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        e7.setClipChildren(false);
                        e7.setClipToPadding(false);
                        y9 y9Var = new y9(context);
                        p7.b1(y9Var.getImageReceiver(), starGift, 160);
                        e7.addView(y9Var, x5.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.Cells.c1.n(h6.f20894j5, d6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, x5.t(-1, -2, 17, 20, 0, 20, 4), context);
                        h.setTextSize(1, 14.0f);
                        h.setTypeface(AndroidUtilities.bold());
                        h.setGravity(17);
                        h.setTextColor(h6.w0(h6.f21026q7, d6Var));
                        h.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        e7.addView(h, x5.t(-1, -2, 17, 20, 0, 20, 4));
                        t01 t01Var = new t01(context, d6Var);
                        if (starGift.first_sale_date != 0) {
                            t01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            t01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        t01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), p7.Y0(false, org.telegram.messenger.q.h(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            p7.G0(t01Var, i10, starGift, d6Var);
                        }
                        e7.addView(t01Var, x5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        ci.d dVar = new ci.d(context, d6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        e7.addView(dVar, x5.n(-1, 48));
                        i13.customView = e7;
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
                    new ad(r1Var.container, r1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    qg.e2 e2Var = new qg.e2(r1Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(r1Var.getContext(), 3, null);
                        a2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f20259id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.q3(r1Var, a2Var, e2Var, callback, 15));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            rg.l1 l1Var = new rg.l1(U3, i10, null, null, starGift, r1Var.resourcesProvider);
                            y9 y9Var2 = new y9(r1Var.getContext());
                            q5 q5Var = new q5(AndroidUtilities.dp(160.0f), 4, y9Var2, false);
                            y9Var2.setImageDrawable(q5Var);
                            y9Var2.addOnAttachStateChangeListener(new v0(q5Var));
                            q5Var.i(starGift.getDocument(), false);
                            l1Var.B0 = y9Var2;
                            l1Var.show();
                            q5Var.f();
                        }
                    } else {
                        e2Var.run();
                    }
                }
            }
        }
    }

    @Override
    public final CharSequence B() {
        if (this.f51569d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f51570e0), null, false);
    }

    public final void V(ArrayList arrayList, e71 e71Var) {
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
        w0 w0Var = this.f51572g0;
        long j10 = this.f51568c0;
        long j11 = 0;
        boolean z17 = this.f51569d0;
        if (z17 || j10 < 0 || ((disallowedGiftsSettings4 = this.f51567b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(r61.k(w0Var));
            arrayList.add(r61.k(this.f51573h0));
            ArrayList arrayList3 = this.f51578n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = i1.f51366a;
                    r61 J = r61.J(i1.class);
                    J.f30370u = 1;
                    J.G = (rg.k) obj;
                    arrayList.add(J);
                    j11 = j11;
                }
                j3 = j11;
            } else {
                j3 = 0;
                r61 o9 = r61.o(1, 34);
                o9.f30370u = 1;
                arrayList.add(o9);
                r61 o10 = r61.o(2, 34);
                o10.f30370u = 1;
                arrayList.add(o10);
                r61 o11 = r61.o(3, 34);
                o11.f30370u = 1;
                arrayList.add(o11);
            }
            z10 = true;
        }
        int i12 = this.X;
        n5 y3 = n5.y(i12, false);
        if (this.f51584t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f51567b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ei.q1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ab(3)).collect(Collectors.toCollection(new Object()));
        }
        int i14 = (j10 > UserConfig.getInstance(i12).getClientUserId() ? 1 : (j10 == UserConfig.getInstance(i12).getClientUserId() ? 0 : -1));
        f5 f5Var = this.f51579o0;
        if (i14 != 0 && f5Var != null) {
            ArrayList arrayList4 = f5Var.f52606l;
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
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f51567b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && f5Var != null && !f5Var.f52606l.isEmpty()))) {
            if (!z10) {
                arrayList.add(r61.k(w0Var));
            } else {
                arrayList.add(r61.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(r61.k(this.f51574i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f51567b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i16)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f51581q0 = -1;
            this.f51580p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f51580p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f51567b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f51581q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f51582r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i17 = this.f51583s0;
            r0 r0Var = new r0(this, 0);
            int i18 = p1.f51541a;
            r61 J2 = r61.J(p1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f30374z = i17;
            J2.H = r0Var;
            arrayList.add(J2);
            if (this.f51583s0 == this.f51582r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f51585u0) {
                this.f51585u0 = z12;
                ViewPropertyAnimator animate = this.f51577l0.animate();
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
                is isVar = is.h;
                duration.setInterpolator(isVar).start();
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
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(isVar).start();
            }
            if (f5Var != null && this.f51583s0 == this.f51581q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = f5Var.f52606l;
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
                int i22 = this.f51583s0;
                if (i22 == this.f51580p0 || i22 == this.f51581q0 || (i22 == this.f51582r0 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j3 && i22 != this.f51582r0) {
                        if (i22 == this.f51581q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f51567b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        r61 a2 = i1.a(i22, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i20++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f51583s0;
                    if (i23 == this.f51581q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f51567b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(i1.a(i23, starGift, z13, z14, true, false, false));
                    i20++;
                }
            }
            int i24 = this.f51583s0;
            int i25 = this.f51581q0;
            if (i24 == i25 && f5Var != null && !f5Var.f52604j) {
                f5Var.a();
                r61 o12 = r61.o(4, 34);
                o12.f30370u = 1;
                arrayList.add(o12);
                r61 o13 = r61.o(5, 34);
                o13.f30370u = 1;
                arrayList.add(o13);
                r61 o14 = r61.o(6, 34);
                o14.f30370u = 1;
                arrayList.add(o14);
            } else if (i24 != i25 && y3.C) {
                r61 o15 = r61.o(4, 34);
                o15.f30370u = 1;
                arrayList.add(o15);
                r61 o16 = r61.o(5, 34);
                o16.f30370u = 1;
                arrayList.add(o16);
                r61 o17 = r61.o(6, 34);
                o17.f30370u = 1;
                arrayList.add(o17);
            }
            if (i20 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(r61.C(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f51567b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(r61.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void W(boolean z10) {
        this.f51584t0 = z10;
        this.Y.N(false);
    }

    public final void X() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f51578n0;
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
                        ?? obj = new Object();
                        obj.f4198b = "inapp";
                        obj.f4197a = kVar.h();
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
                    ((rg.k) obj2).f47395g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new r5.d(this, 17));
            }
        }
        if (arrayList.isEmpty()) {
            tg.r.j(this.X, null, new r0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            X();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            e71 e71Var2 = this.Y;
            if (e71Var2 != null) {
                e71Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j3 = this.f51568c0;
                if (longValue == j3 && j3 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
                    if (j3 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f51567b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            ad.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        return;
                    }
                    e71 e71Var3 = this.Y;
                    if (e71Var3 != null) {
                        e71Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f51578n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    X();
                    e71 e71Var4 = this.Y;
                    if (e71Var4 != null) {
                        e71Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new ad(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                e71 e71Var5 = this.Y;
                if (e71Var5 != null) {
                    e71Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51579o0 && (e71Var = this.Y) != null) {
            e71Var.N(true);
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f51567b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                ad.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f51568c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(this.d, getContext(), this.X, 0, true, new hi.a(this, 16), this.resourcesProvider);
        this.Y = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }

    public r1(final android.content.Context r28, final int r29, final long r30, java.util.List r32, final org.telegram.messenger.Utilities.Callback r33) {
        throw new UnsupportedOperationException("Method not decompiled: xh.r1.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.Utilities$Callback):void");
    }
}
