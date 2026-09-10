package wh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.l9;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb;
import org.telegram.ui.nj0;
import w7.a6;
import xh.b7;
import xh.c6;
import xh.n5;
import xh.n7;
import xh.r6;
import xh.v5;
import xh.z7;
public final class p1 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public static final int f44286v0 = 0;
    public final int X;
    public j61 Y;
    public List Z;
    public final Utilities.Callback f44287a0;
    public TLRPC.DisallowedGiftsSettings f44288b0;
    public final long f44289c0;
    public final boolean f44290d0;
    public final String f44291e0;
    public final n7 f44292f0;
    public final u0 f44293g0;
    public final FrameLayout f44294h0;
    public final LinearLayout f44295i0;
    public final uz f44296j0;
    public final z0 f44297k0;
    public final v0 f44298l0;
    public final w0 m0;
    public final ArrayList f44299n0;
    public final n5 f44300o0;
    public int f44301p0;
    public int f44302q0;
    public int f44303r0;
    public int f44304s0;
    public boolean f44305t0;
    public boolean f44306u0;

    public p1(LaunchActivity launchActivity, int i10, long j3) {
        this(launchActivity, i10, j3, null, null);
    }

    public static void P(final p1 p1Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, r6 r6Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            r6Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f17528a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.d2 o9 = alertDialog$Builder.o();
            final ou ouVar = o9.f17627n;
            if (ouVar != null) {
                ouVar.setOnLinkPressListener(new l90() {
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
                        clickableSpan.onClick(ouVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new wc(p1Var.container, p1Var.resourcesProvider).d0(tL_error, false);
        }
    }

    public static void Q(p1 p1Var, Context context, int i10, Utilities.Callback callback, long j3, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        v51 G = p1Var.Y.G(i11 - 1);
        if (G != null && G.G(g1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof qg.k) {
                new a1(p1Var, context, i10, (qg.k) obj, p1Var.f44289c0, new n0(p1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                n5 n5Var = p1Var.f44300o0;
                if (n5Var != null && p1Var.f44304s0 == p1Var.f44302q0) {
                    ArrayList arrayList = n5Var.f45761l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f17425id == starGift.f17425id) {
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
                        b1Var.Z1(j3, new org.telegram.messenger.j2(p1Var, b1Var, j3, callback, 5));
                    }
                } else if (G.f27834q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f18485a = true;
                        obj3.e = true;
                        c1 c1Var = new c1(j3, starGift.title, starGift.f17425id, p1Var.resourcesProvider, p1Var.container.getViewTreeObserver(), new Object());
                        c1Var.e = new nj0(13, p1Var, callback);
                        U.showAsSheet(c1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f17425id, new org.telegram.ui.Components.z2(context, p1Var.resourcesProvider, i10, j3, new n0(p1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    f6 f6Var = p1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.h3 i13 = em.i(1, context, f6Var, false);
                        LinearLayout f7 = em.f(context, 1);
                        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        f7.setClipChildren(false);
                        f7.setClipToPadding(false);
                        w9 w9Var = new w9(context);
                        z7.a1(w9Var.getImageReceiver(), starGift, 160);
                        f7.addView(w9Var, a6.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        em.x(j6.f18034j5, f6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, a6.t(-1, -2, 17, 20, 0, 20, 4), context);
                        g10.setTextSize(1, 14.0f);
                        g10.setTypeface(AndroidUtilities.bold());
                        g10.setGravity(17);
                        g10.setTextColor(j6.v0(j6.f18162q7, f6Var));
                        g10.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        f7.addView(g10, a6.t(-1, -2, 17, 20, 0, 20, 4));
                        b01 b01Var = new b01(context, f6Var);
                        if (starGift.first_sale_date != 0) {
                            b01Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            b01Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        b01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), z7.X0(false, hc.b.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            z7.F0(b01Var, i10, starGift, f6Var);
                        }
                        f7.addView(b01Var, a6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        bi.d dVar = new bi.d(context, f6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        f7.addView(dVar, a6.n(-1, 48));
                        i13.customView = f7;
                        org.telegram.ui.ActionBar.h3[] h3VarArr = {i13};
                        h3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new c6(h3VarArr, 2));
                        h3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            h3VarArr[0].makeAttached(U2);
                        }
                        h3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new wc(p1Var.container, p1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    r6 r6Var = new r6(p1Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(p1Var.getContext(), 3, null);
                        d2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f17425id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new l9(p1Var, d2Var, r6Var, callback, 14));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            qg.m1 m1Var = new qg.m1(U3, i10, null, null, starGift, p1Var.resourcesProvider);
                            w9 w9Var2 = new w9(p1Var.getContext());
                            org.telegram.ui.Components.n5 n5Var2 = new org.telegram.ui.Components.n5(AndroidUtilities.dp(160.0f), 4, w9Var2, false);
                            w9Var2.setImageDrawable(n5Var2);
                            w9Var2.addOnAttachStateChangeListener(new t0(n5Var2));
                            n5Var2.i(starGift.getDocument(), false);
                            m1Var.B0 = w9Var2;
                            m1Var.show();
                            n5Var2.f();
                        }
                    } else {
                        r6Var.run();
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList, j61 j61Var) {
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
        u0 u0Var = this.f44293g0;
        long j10 = this.f44289c0;
        long j11 = 0;
        boolean z17 = this.f44290d0;
        if (z17 || j10 < 0 || ((disallowedGiftsSettings4 = this.f44288b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(v51.k(u0Var));
            arrayList.add(v51.k(this.f44294h0));
            ArrayList arrayList3 = this.f44299n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = g1.f44098a;
                    v51 J = v51.J(g1.class);
                    J.f27838u = 1;
                    J.G = (qg.k) obj;
                    arrayList.add(J);
                    j11 = j11;
                }
                j3 = j11;
            } else {
                j3 = 0;
                v51 o9 = v51.o(1, 34);
                o9.f27838u = 1;
                arrayList.add(o9);
                v51 o10 = v51.o(2, 34);
                o10.f27838u = 1;
                arrayList.add(o10);
                v51 o11 = v51.o(3, 34);
                o11.f27838u = 1;
                arrayList.add(o11);
            }
            z10 = true;
        }
        int i12 = this.X;
        v5 y3 = v5.y(i12, false);
        if (this.f44305t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f44288b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new di.t1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new bb(3)).collect(Collectors.toCollection(new Object()));
        }
        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
        n5 n5Var = this.f44300o0;
        if (j10 != clientUserId && n5Var != null) {
            ArrayList arrayList4 = n5Var.f45761l;
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
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f44288b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && n5Var != null && !n5Var.f45761l.isEmpty()))) {
            if (!z10) {
                arrayList.add(v51.k(u0Var));
            } else {
                arrayList.add(v51.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(v51.k(this.f44295i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f44288b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f44302q0 = -1;
            this.f44301p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f44301p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f44288b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f44302q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f44303r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i16 = this.f44304s0;
            p0 p0Var = new p0(this, 0);
            int i17 = n1.f44265a;
            v51 J2 = v51.J(n1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f27842z = i16;
            J2.H = p0Var;
            arrayList.add(J2);
            if (this.f44304s0 == this.f44303r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f44306u0) {
                this.f44306u0 = z12;
                ViewPropertyAnimator animate = this.f44298l0.animate();
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
                wr wrVar = wr.h;
                duration.setInterpolator(wrVar).start();
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
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(wrVar).start();
            }
            if (n5Var != null && this.f44304s0 == this.f44302q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = n5Var.f45761l;
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
                int i21 = this.f44304s0;
                if (i21 == this.f44301p0 || i21 == this.f44302q0 || (i21 == this.f44303r0 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j3 && i21 != this.f44303r0) {
                        if (i21 == this.f44302q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f44288b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        v51 a2 = g1.a(i21, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i22 = this.f44304s0;
                    if (i22 == this.f44302q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f44288b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(g1.a(i22, starGift, z13, z14, true, false, false));
                    i19++;
                }
            }
            int i23 = this.f44304s0;
            int i24 = this.f44302q0;
            if (i23 == i24 && n5Var != null && !n5Var.f45759j) {
                n5Var.a();
                v51 o12 = v51.o(4, 34);
                o12.f27838u = 1;
                arrayList.add(o12);
                v51 o13 = v51.o(5, 34);
                o13.f27838u = 1;
                arrayList.add(o13);
                v51 o14 = v51.o(6, 34);
                o14.f27838u = 1;
                arrayList.add(o14);
            } else if (i23 != i24 && y3.C) {
                v51 o15 = v51.o(4, 34);
                o15.f27838u = 1;
                arrayList.add(o15);
                v51 o16 = v51.o(5, 34);
                o16.f27838u = 1;
                arrayList.add(o16);
                v51 o17 = v51.o(6, 34);
                o17.f27838u = 1;
                arrayList.add(o17);
            }
            if (i19 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(v51.C(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f44288b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(v51.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void V(boolean z10) {
        this.f44305t0 = z10;
        this.Y.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f44299n0;
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
                    qg.k kVar = new qg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        ?? obj = new Object();
                        obj.f4256b = "inapp";
                        obj.f4255a = kVar.h();
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
                    ((qg.k) obj2).f40763g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new th.e(this, 6));
            }
        }
        if (arrayList.isEmpty()) {
            sg.s.j(this.X, null, new p0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            j61 j61Var2 = this.Y;
            if (j61Var2 != null) {
                j61Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j3 = this.f44289c0;
                if (longValue == j3 && j3 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
                    if (j3 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f44288b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            wc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        return;
                    }
                    j61 j61Var3 = this.Y;
                    if (j61Var3 != null) {
                        j61Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f44299n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    W();
                    j61 j61Var4 = this.Y;
                    if (j61Var4 != null) {
                        j61Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new wc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                j61 j61Var5 = this.Y;
                if (j61Var5 != null) {
                    j61Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f44300o0 && (j61Var = this.Y) != null) {
            j61Var.N(true);
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f44288b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                wc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f44289c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.X, 0, true, new gi.a(this, 16), this.resourcesProvider);
        this.Y = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        if (this.f44290d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f44291e0), null, false);
    }

    public p1(final Context context, final int i10, final long j3, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        int i11;
        this.f44299n0 = new ArrayList();
        this.f44301p0 = -1;
        this.f44302q0 = -1;
        this.f44303r0 = -1;
        new ArrayList();
        this.X = i10;
        this.f44289c0 = j3;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j3;
        this.f44290d0 = z10;
        this.Z = list;
        this.f44287a0 = callback;
        int i12 = j6.f17891b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(j6.w0(null, i12, false));
        fixNavigationBar(j6.w0(null, i12, false));
        this.f44300o0 = v5.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        v5.y(i10, false).V();
        w9 w9Var = new w9(context);
        w9Var.setImportantForAccessibility(2);
        g9 g9Var = new g9((f6) null);
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f44291e0 = UserObject.getForcedFirstName(user);
            g9Var.r(user);
            w9Var.e(user, g9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (j3 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.f44288b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.f44291e0 = chat == null ? "" : chat.title;
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
        }
        this.v = 0.1f;
        n7 n7Var = new n7(context, i10, this.resourcesProvider);
        this.f44292f0 = n7Var;
        w7.c6.a(n7Var);
        n7Var.setOnClickListener(new org.telegram.ui.web.c(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44294h0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f44293g0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(new b7(context, 70, 0), a6.c(-1.0f, -1));
        w9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(w9Var, a6.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        w7.c6.a(w9Var);
        w9Var.setOnClickListener(new m80(this, j3, 4));
        frameLayout2.addView(n7Var, a6.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, a6.e(-1, -2, 55));
        TextView g10 = org.telegram.messenger.a2.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i14 = j6.f18034j5;
        g10.setTextColor(j6.v0(i14, this.resourcesProvider));
        g10.setGravity(17);
        linearLayout.addView(g10, a6.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(bi.x4.a(g10.getText(), g10.getPaint()));
        m90 m90Var = new m90(context, this.resourcesProvider);
        int i15 = j6.gc;
        m90Var.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTextColor(j6.v0(i14, this.resourcesProvider));
        m90Var.setGravity(17);
        m90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(m90Var, a6.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(LocaleController.getString(R.string.Gift2Premium));
        m90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f44291e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new org.telegram.ui.web.d1(9)), true)));
        m90Var.setMaxWidth(bi.x4.a(m90Var.getText(), m90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f44295i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(j6.v0(i14, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, a6.t(-1, -2, 1, 4, 0, 4, 0));
        ?? m90Var2 = new m90(context, this.resourcesProvider);
        this.f44298l0 = m90Var2;
        m90Var2.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        m90Var2.setTextSize(1, 14.0f);
        m90Var2.setTextColor(j6.v0(i14, this.resourcesProvider));
        m90Var2.setGravity(17);
        ?? m90Var3 = new m90(context, this.resourcesProvider);
        this.m0 = m90Var3;
        m90Var3.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
        m90Var3.setTextSize(1, 14.0f);
        m90Var3.setTextColor(j6.v0(i14, this.resourcesProvider));
        m90Var3.setGravity(17);
        m90Var3.setAlpha(0.0f);
        m90Var3.setScaleX(0.85f);
        m90Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) m90Var2, a6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) m90Var3, a6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z10) {
            linearLayout2.addView(frameLayout3, a6.t(-2, -2, 1, 0, 9, 0, 4));
            m90 m90Var4 = new m90(context, this.resourcesProvider);
            m90Var4.setLinkTextColor(j6.v0(i15, this.resourcesProvider));
            m90Var4.setTextSize(1, 14.0f);
            m90Var4.setTextColor(j6.v0(i14, this.resourcesProvider));
            m90Var4.setGravity(17);
            linearLayout2.addView(m90Var4, a6.t(-2, -2, 1, 26, 4, 26, 6));
            m90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            m90Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, a6.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(m90Var2);
            m90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f44291e0)), m90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, a6.t(-1, -2, 1, 0, 9, 0, 6));
            n5 G = v5.y(i10, false).G(j3, true);
            org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(this, G, j3, callback, context, 8);
            gVar.run();
            m90Var2.addOnAttachStateChangeListener(new x0(gVar));
            if (G.f45761l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(m90Var2, NotificationCenter.starUserGiftsLoaded, new nj0(14, G, gVar));
        }
        uz uzVar = new uz(3, false);
        this.f44296j0 = uzVar;
        uzVar.O = new y0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(uzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? jVar = new s4.j();
        this.f44297k0 = jVar;
        jVar.C = false;
        jVar.f41645m = false;
        jVar.n(350L);
        jVar.o(wr.h);
        jVar.D = 40L;
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new jl0() {
            @Override
            public final void d(int i16, View view) {
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
        this.e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
