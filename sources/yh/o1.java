package yh;

import ai.bd;
import ai.ha;
import ai.lc;
import ai.nd;
import ai.ta;
import ai.y9;
import android.content.Context;
import android.text.SpannableStringBuilder;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di1;
import org.telegram.ui.if0;
import w7.b6;
import w7.z5;
public final class o1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int f50888z0 = 0;
    public final int X;
    public b71 Y;
    public List Z;
    public final Utilities.Callback f50889a0;
    public TLRPC.DisallowedGiftsSettings f50890b0;
    public final long f50891c0;
    public final boolean f50892d0;
    public final String f50893e0;
    public final bd f50894f0;
    public final t0 f50895g0;
    public final FrameLayout f50896h0;
    public final LinearLayout f50897i0;
    public final wz f50898j0;
    public final y0 f50899k0;
    public final u0 f50900l0;
    public final v0 m0;
    public final ArrayList f50901n0;
    public final y9 f50902o0;
    public int f50903p0;
    public int f50904q0;
    public int f50905r0;
    public int f50906s0;
    public boolean f50907t0;
    public boolean f50908u0;
    public boolean f50909v0;
    public lc f50910w0;
    public final y90 f50911x0;
    public boolean f50912y0;

    public o1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    public static void P(final o1 o1Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, di1 di1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            di1Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o1Var.getContext(), 0, o1Var.resourcesProvider);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f20678a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.c2 p5 = alertDialog$Builder.p();
            final ru ruVar = p5.f20769n;
            if (ruVar != null) {
                ruVar.setOnLinkPressListener(new x90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        o1 o1Var2 = o1.this;
                        o1Var2.getClass();
                        p5.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        o1Var2.dismiss();
                        clickableSpan.onClick(ruVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new xc(o1Var.container, o1Var.resourcesProvider).f0(tL_error, false);
        }
    }

    public static void Q(o1 o1Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        m61 G = o1Var.Y.G(i11 - 1);
        if (G != null && G.G(f1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof sg.k) {
                new z0(o1Var, context, i10, (sg.k) obj, o1Var.f50891c0, new l0(o1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                y9 y9Var = o1Var.f50902o0;
                if (y9Var != null && o1Var.f50906s0 == o1Var.f50904q0) {
                    ArrayList arrayList = y9Var.f2511l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f20567id == starGift.f20567id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        a1 a1Var = new a1(o1Var, o1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), o1Var.resourcesProvider);
                        a1Var.L2(savedStarGift, null);
                        a1Var.y2(j10, new ai.x2(o1Var, a1Var, j10, callback, 7));
                    }
                } else if (G.f28564q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f21636a = true;
                        obj3.e = true;
                        b1 b1Var = new b1(j10, starGift.title, starGift.f20567id, o1Var.resourcesProvider, o1Var.container.getViewTreeObserver(), new Object());
                        b1Var.e = new org.telegram.ui.Wallet.w(15, o1Var, callback);
                        U.showAsSheet(b1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f20567id, new org.telegram.ui.Components.z2(context, o1Var.resourcesProvider, i10, j10, new l0(o1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    g6 g6Var = o1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context, g6Var, false);
                        LinearLayout e = sl.e(context, 1);
                        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        e.setClipChildren(false);
                        e.setClipToPadding(false);
                        w9 w9Var = new w9(context);
                        nd.b1(w9Var.getImageReceiver(), starGift, 160);
                        e.addView(w9Var, z5.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.messenger.v0.q(textView, k6.f21289j5, g6Var, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView f7 = sl.f(e, textView, z5.t(-1, -2, 17, 20, 0, 20, 4), context);
                        f7.setTextSize(1, 14.0f);
                        f7.setTypeface(AndroidUtilities.bold());
                        f7.setGravity(17);
                        r6.W(f7, k6.f21421q7, g6Var);
                        f7.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        e.addView(f7, z5.t(-1, -2, 17, 20, 0, 20, 4));
                        o01 o01Var = new o01(context, g6Var);
                        if (starGift.first_sale_date != 0) {
                            o01Var.g(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            o01Var.g(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        o01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), nd.Y0(false, i2.o1.m(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            nd.G0(o01Var, i10, starGift, g6Var);
                        }
                        e.addView(o01Var, z5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        ei.d dVar = new ei.d(context, g6Var, true);
                        dVar.i(LocaleController.getString(R.string.OK), false, true);
                        e.addView(dVar, z5.n(-1, 48));
                        j11.customView = e;
                        org.telegram.ui.ActionBar.h3[] h3VarArr = {j11};
                        h3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new ta(h3VarArr, 2));
                        h3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            h3VarArr[0].makeAttached(U2);
                        }
                        h3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new xc(o1Var.container, o1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    di1 di1Var = new di1(o1Var, context, i10, starGift, callback);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(o1Var.getContext(), 3, null);
                        c2Var.r(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f20567id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.k2(o1Var, c2Var, di1Var, callback, 20));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            sg.m1 m1Var = new sg.m1(U3, i10, null, null, starGift, o1Var.resourcesProvider);
                            w9 w9Var2 = new w9(o1Var.getContext());
                            p5 p5Var = new p5(AndroidUtilities.dp(160.0f), 4, w9Var2, false);
                            w9Var2.setImageDrawable(p5Var);
                            w9Var2.addOnAttachStateChangeListener(new s0(p5Var));
                            p5Var.i(starGift.getDocument(), false);
                            m1Var.B0 = w9Var2;
                            m1Var.show();
                            p5Var.f();
                        }
                    } else {
                        di1Var.run();
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList, b71 b71Var) {
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
        t0 t0Var = this.f50895g0;
        long j11 = this.f50891c0;
        long j12 = 0;
        boolean z17 = this.f50892d0;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.f50890b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(m61.k(t0Var));
            arrayList.add(m61.k(this.f50896h0));
            ArrayList arrayList3 = this.f50901n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = f1.f50684a;
                    m61 J = m61.J(f1.class);
                    J.f28568u = 1;
                    J.G = (sg.k) obj;
                    arrayList.add(J);
                    j12 = j12;
                }
                j10 = j12;
            } else {
                j10 = 0;
                m61 o10 = m61.o(1, 34);
                o10.f28568u = 1;
                arrayList.add(o10);
                m61 o11 = m61.o(2, 34);
                o11.f28568u = 1;
                arrayList.add(o11);
                m61 o12 = m61.o(3, 34);
                o12.f28568u = 1;
                arrayList.add(o12);
            }
            z10 = true;
        }
        int i12 = this.X;
        ha y3 = ha.y(i12, false);
        if (this.f50907t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f50890b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new gi.m1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new org.telegram.ui.bb(3)).collect(Collectors.toCollection(new Object()));
        }
        int i14 = (j11 > UserConfig.getInstance(i12).getClientUserId() ? 1 : (j11 == UserConfig.getInstance(i12).getClientUserId() ? 0 : -1));
        y9 y9Var = this.f50902o0;
        if (i14 != 0 && y9Var != null) {
            ArrayList arrayList4 = y9Var.f2511l;
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
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f50890b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && y9Var != null && !y9Var.f2511l.isEmpty()))) {
            if (!z10) {
                arrayList.add(m61.k(t0Var));
            } else {
                arrayList.add(m61.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(m61.k(this.f50897i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f50890b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i16)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f50904q0 = -1;
            this.f50903p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f50903p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f50890b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f50904q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f50905r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            if (this.f50908u0 && !this.f50909v0) {
                this.f50909v0 = true;
                this.f50906s0 = this.f50905r0;
            }
            int i17 = this.f50906s0;
            n0 n0Var = new n0(this, 0);
            int i18 = m1.f50862a;
            m61 J2 = m61.J(m1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f28572z = i17;
            J2.H = n0Var;
            arrayList.add(J2);
            if (this.f50906s0 == this.f50905r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f50912y0) {
                this.f50912y0 = z12;
                ViewPropertyAnimator animate = this.f50900l0.animate();
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
                bs bsVar = bs.h;
                duration.setInterpolator(bsVar).start();
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
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(bsVar).start();
            }
            if (y9Var != null && this.f50906s0 == this.f50904q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = y9Var.f2511l;
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
                int i22 = this.f50906s0;
                if (i22 == this.f50903p0 || i22 == this.f50904q0 || (i22 == this.f50905r0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i22 != this.f50905r0) {
                        if (i22 == this.f50904q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f50890b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        m61 a2 = f1.a(i22, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i20++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f50906s0;
                    if (i23 == this.f50904q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f50890b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(f1.a(i23, starGift, z13, z14, true, false, false));
                    i20++;
                }
            }
            int i24 = this.f50906s0;
            int i25 = this.f50904q0;
            if (i24 == i25 && y9Var != null && !y9Var.f2509j) {
                y9Var.a();
                m61 o13 = m61.o(4, 34);
                o13.f28568u = 1;
                arrayList.add(o13);
                m61 o14 = m61.o(5, 34);
                o14.f28568u = 1;
                arrayList.add(o14);
                m61 o15 = m61.o(6, 34);
                o15.f28568u = 1;
                arrayList.add(o15);
            } else if (i24 != i25 && y3.C) {
                m61 o16 = m61.o(4, 34);
                o16.f28568u = 1;
                arrayList.add(o16);
                m61 o17 = m61.o(5, 34);
                o17.f28568u = 1;
                arrayList.add(o17);
                m61 o18 = m61.o(6, 34);
                o18.f28568u = 1;
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f50890b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(m61.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void V(boolean z10) {
        this.f50907t0 = z10;
        this.Y.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f50901n0;
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
                        obj.f4700b = "inapp";
                        obj.f4699a = kVar.h();
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
                    ((sg.k) obj2).f46737g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new q0(this, 0));
            }
        }
        if (arrayList.isEmpty()) {
            ug.q.j(this.X, null, new n0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            b71 b71Var2 = this.Y;
            if (b71Var2 != null) {
                b71Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.f50891c0;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f50890b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    b71 b71Var3 = this.Y;
                    if (b71Var3 != null) {
                        b71Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f50901n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    W();
                    b71 b71Var4 = this.Y;
                    if (b71Var4 != null) {
                        b71Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new xc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                b71 b71Var5 = this.Y;
                if (b71Var5 != null) {
                    b71Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50902o0 && (b71Var = this.Y) != null) {
            b71Var.N(true);
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
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        int i10 = this.X;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f50890b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f50891c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.X, 0, true, new hg.o(this, 27), this.resourcesProvider);
        this.Y = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        if (this.f50892d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f50893e0), null, false);
    }

    public o1(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        char c10;
        int i11;
        this.f50901n0 = new ArrayList();
        this.f50903p0 = -1;
        this.f50904q0 = -1;
        this.f50905r0 = -1;
        new ArrayList();
        this.X = i10;
        this.f50891c0 = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.f50892d0 = z10;
        this.Z = list;
        this.f50889a0 = callback;
        int i12 = k6.f21144b6;
        setBackgroundColorKey(i12);
        fixNavigationBarKey(i12);
        this.f50902o0 = ha.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        ha.y(i10, false).V();
        w9 w9Var = new w9(context);
        w9Var.setImportantForAccessibility(2);
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        h9 h9Var = new h9((g6) null);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            c10 = 2;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f50893e0 = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            w9Var.e(user, h9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.f50890b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            c10 = 2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f50893e0 = chat == null ? "" : chat.title;
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        this.v = 0.1f;
        bd bdVar = new bd(context, i10, this.resourcesProvider);
        this.f50894f0 = bdVar;
        b6.a(bdVar);
        bdVar.setOnClickListener(new hg.r0(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50896h0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f50895g0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        lc lcVar = new lc(context, 70, 0);
        this.f50910w0 = lcVar;
        frameLayout2.addView(lcVar, z5.c(-1.0f, -1));
        w9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(w9Var, z5.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        b6.a(w9Var);
        w9Var.setOnClickListener(new ci.a2(this, j10, 5));
        frameLayout2.addView(bdVar, z5.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, z5.e(-1, -2, 55));
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i14 = k6.f21289j5;
        r6.W(g10, i14, this.resourcesProvider);
        g10.setGravity(17);
        linearLayout.addView(g10, z5.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(ei.x3.a(g10.getText(), g10.getPaint()));
        y90 y90Var = new y90(context, this.resourcesProvider);
        int i15 = k6.f21242gc;
        r6.I(y90Var, i15, this.resourcesProvider);
        y90Var.setTextSize(1, 14.0f);
        r6.W(y90Var, i14, this.resourcesProvider);
        y90Var.setGravity(17);
        y90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(y90Var, z5.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(LocaleController.getString(R.string.Gift2Premium));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f50893e0));
        CharSequence replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new if0(23)), true);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = replaceTags;
        charSequenceArr[1] = " ";
        charSequenceArr[c10] = replaceArrows;
        y90Var.setText(TextUtils.concat(charSequenceArr));
        y90Var.setMaxWidth(ei.x3.a(y90Var.getText(), y90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f50897i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        r6.W(textView, i14, this.resourcesProvider);
        textView.setGravity(17);
        linearLayout2.addView(textView, z5.t(-1, -2, 1, 4, 0, 4, 0));
        ?? y90Var2 = new y90(context, this.resourcesProvider);
        this.f50900l0 = y90Var2;
        r6.I(y90Var2, i15, this.resourcesProvider);
        y90Var2.setTextSize(1, 14.0f);
        r6.W(y90Var2, i14, this.resourcesProvider);
        y90Var2.setGravity(17);
        ?? y90Var3 = new y90(context, this.resourcesProvider);
        this.m0 = y90Var3;
        r6.I(y90Var3, i15, this.resourcesProvider);
        y90Var3.setTextSize(1, 14.0f);
        r6.W(y90Var3, i14, this.resourcesProvider);
        y90Var3.setGravity(17);
        y90Var3.setAlpha(0.0f);
        y90Var3.setScaleX(0.85f);
        y90Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) y90Var2, z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) y90Var3, z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z10) {
            linearLayout2.addView(frameLayout3, z5.t(-2, -2, 1, 0, 9, 0, 4));
            y90 y90Var4 = new y90(context, this.resourcesProvider);
            r6.I(y90Var4, i15, this.resourcesProvider);
            y90Var4.setTextSize(1, 14.0f);
            r6.W(y90Var4, i14, this.resourcesProvider);
            y90Var4.setGravity(17);
            linearLayout2.addView(y90Var4, z5.t(-2, -2, 1, 26, 4, 26, 6));
            y90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            y90Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
            this.f50911x0 = y90Var4;
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, z5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(y90Var2);
            y90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f50893e0)), y90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, z5.t(-1, -2, 1, 0, 9, 0, 6));
            y9 G = ha.y(i10, false).G(j10, true);
            ai.z zVar = new ai.z(this, G, j10, callback, context);
            zVar.run();
            y90Var2.addOnAttachStateChangeListener(new w0(zVar));
            if (G.f2511l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(y90Var2, NotificationCenter.starUserGiftsLoaded, new org.telegram.ui.Wallet.w(16, G, zVar));
        }
        wz wzVar = new wz(3, false);
        this.f50898j0 = wzVar;
        wzVar.O = new x0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(wzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? kVar = new s4.k();
        this.f50899k0 = kVar;
        kVar.C = false;
        kVar.f46377m = false;
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.D = 40L;
        this.d.setItemAnimator(kVar);
        this.d.setOnItemClickListener(new am0() {
            @Override
            public final void d(int i16, View view) {
                o1.Q(o1.this, context, i10, callback, j10, i16);
            }
        });
        W();
        this.Y.N(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
            V(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(z());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
