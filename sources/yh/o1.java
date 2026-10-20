package yh;

import ai.ad;
import ai.ga;
import ai.kc;
import ai.md;
import ai.sa;
import ai.y9;
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
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.df0;
import org.telegram.ui.wh1;
import w7.b6;
import w7.z5;
public final class o1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int f50427z0 = 0;
    public final int X;
    public u61 Y;
    public List Z;
    public final Utilities.Callback f50428a0;
    public TLRPC.DisallowedGiftsSettings f50429b0;
    public final long f50430c0;
    public final boolean f50431d0;
    public final String f50432e0;
    public final ad f50433f0;
    public final t0 f50434g0;
    public final FrameLayout f50435h0;
    public final LinearLayout f50436i0;
    public final wz f50437j0;
    public final y0 f50438k0;
    public final u0 f50439l0;
    public final v0 m0;
    public final ArrayList f50440n0;
    public final y9 f50441o0;
    public int f50442p0;
    public int f50443q0;
    public int f50444r0;
    public int f50445s0;
    public boolean f50446t0;
    public boolean f50447u0;
    public boolean f50448v0;
    public kc f50449w0;
    public final x90 f50450x0;
    public boolean f50451y0;

    public o1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    public static void Q(final o1 o1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, wh1 wh1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            wh1Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o1Var.getContext(), 0, o1Var.resourcesProvider);
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f20605a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.b2 o10 = alertDialog$Builder.o();
            final ru ruVar = o10.f20671n;
            if (ruVar != null) {
                ruVar.setOnLinkPressListener(new w90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        o1 o1Var2 = o1.this;
                        o1Var2.getClass();
                        o10.dismiss();
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

    public static void R(o1 o1Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        h61 G = o1Var.Y.G(i11 - 1);
        if (G != null && G.G(f1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof sg.k) {
                new z0(o1Var, context, i10, (sg.k) obj, o1Var.f50430c0, new l0(o1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                y9 y9Var = o1Var.f50441o0;
                if (y9Var != null && o1Var.f50445s0 == o1Var.f50443q0) {
                    ArrayList arrayList = y9Var.f2504l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f20500id == starGift.f20500id) {
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
                        a1Var.M2(savedStarGift, null);
                        a1Var.z2(j10, new ai.x2(o1Var, a1Var, j10, callback, 7));
                    }
                } else if (G.f26787q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f21556a = true;
                        obj3.e = true;
                        b1 b1Var = new b1(j10, starGift.title, starGift.f20500id, o1Var.resourcesProvider, o1Var.container.getViewTreeObserver(), new Object());
                        b1Var.e = new org.telegram.ui.Wallet.x(15, o1Var, callback);
                        U.showAsSheet(b1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f20500id, new org.telegram.ui.Components.a3(context, o1Var.resourcesProvider, i10, j10, new l0(o1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    d6 d6Var = o1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.f3 i13 = mk.i(1, context, d6Var, false);
                        LinearLayout e = mk.e(context, 1);
                        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        e.setClipChildren(false);
                        e.setClipToPadding(false);
                        w9 w9Var = new w9(context);
                        md.b1(w9Var.getImageReceiver(), starGift, 160);
                        e.addView(w9Var, z5.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.Cells.c1.r(h6.f21096j5, d6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView i14 = com.google.android.gms.internal.play_billing.k3.i(e, textView, z5.t(-1, -2, 17, 20, 0, 20, 4), context);
                        i14.setTextSize(1, 14.0f);
                        i14.setTypeface(AndroidUtilities.bold());
                        i14.setGravity(17);
                        i14.setTextColor(h6.w0(h6.f21228q7, d6Var));
                        i14.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        e.addView(i14, z5.t(-1, -2, 17, 20, 0, 20, 4));
                        l01 l01Var = new l01(context, d6Var);
                        if (starGift.first_sale_date != 0) {
                            l01Var.g(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            l01Var.g(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        l01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), md.Y0(false, org.telegram.messenger.g0.h(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            md.G0(l01Var, i10, starGift, d6Var);
                        }
                        e.addView(l01Var, z5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        ei.d dVar = new ei.d(context, d6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        e.addView(dVar, z5.n(-1, 48));
                        i13.customView = e;
                        org.telegram.ui.ActionBar.f3[] f3VarArr = {i13};
                        f3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new sa(f3VarArr, 2));
                        f3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            f3VarArr[0].makeAttached(U2);
                        }
                        f3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new xc(o1Var.container, o1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    wh1 wh1Var = new wh1(o1Var, context, i10, starGift, callback);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(o1Var.getContext(), 3, null);
                        b2Var.r(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f20500id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.k2(o1Var, b2Var, wh1Var, callback, 20));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
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
                        wh1Var.run();
                    }
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        if (this.f50431d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f50432e0), null, false);
    }

    public final void V(ArrayList arrayList, u61 u61Var) {
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
        t0 t0Var = this.f50434g0;
        long j11 = this.f50430c0;
        long j12 = 0;
        boolean z17 = this.f50431d0;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.f50429b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(h61.k(t0Var));
            arrayList.add(h61.k(this.f50435h0));
            ArrayList arrayList3 = this.f50440n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = f1.f50236a;
                    h61 J = h61.J(f1.class);
                    J.f26791u = 1;
                    J.G = (sg.k) obj;
                    arrayList.add(J);
                    j12 = j12;
                }
                j10 = j12;
            } else {
                j10 = 0;
                h61 o10 = h61.o(1, 34);
                o10.f26791u = 1;
                arrayList.add(o10);
                h61 o11 = h61.o(2, 34);
                o11.f26791u = 1;
                arrayList.add(o11);
                h61 o12 = h61.o(3, 34);
                o12.f26791u = 1;
                arrayList.add(o12);
            }
            z10 = true;
        }
        int i12 = this.X;
        ga y3 = ga.y(i12, false);
        if (this.f50446t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f50429b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new gi.m1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new org.telegram.ui.bb(3)).collect(Collectors.toCollection(new Object()));
        }
        int i14 = (j11 > UserConfig.getInstance(i12).getClientUserId() ? 1 : (j11 == UserConfig.getInstance(i12).getClientUserId() ? 0 : -1));
        y9 y9Var = this.f50441o0;
        if (i14 != 0 && y9Var != null) {
            ArrayList arrayList4 = y9Var.f2504l;
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
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f50429b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && y9Var != null && !y9Var.f2504l.isEmpty()))) {
            if (!z10) {
                arrayList.add(h61.k(t0Var));
            } else {
                arrayList.add(h61.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(h61.k(this.f50436i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f50429b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i16)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f50443q0 = -1;
            this.f50442p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f50442p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f50429b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f50443q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f50444r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            if (this.f50447u0 && !this.f50448v0) {
                this.f50448v0 = true;
                this.f50445s0 = this.f50444r0;
            }
            int i17 = this.f50445s0;
            n0 n0Var = new n0(this, 0);
            int i18 = m1.f50402a;
            h61 J2 = h61.J(m1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f26795z = i17;
            J2.H = n0Var;
            arrayList.add(J2);
            if (this.f50445s0 == this.f50444r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f50451y0) {
                this.f50451y0 = z12;
                ViewPropertyAnimator animate = this.f50439l0.animate();
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
            if (y9Var != null && this.f50445s0 == this.f50443q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = y9Var.f2504l;
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
                int i22 = this.f50445s0;
                if (i22 == this.f50442p0 || i22 == this.f50443q0 || (i22 == this.f50444r0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i22 != this.f50444r0) {
                        if (i22 == this.f50443q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f50429b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        h61 a2 = f1.a(i22, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i20++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f50445s0;
                    if (i23 == this.f50443q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f50429b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(f1.a(i23, starGift, z13, z14, true, false, false));
                    i20++;
                }
            }
            int i24 = this.f50445s0;
            int i25 = this.f50443q0;
            if (i24 == i25 && y9Var != null && !y9Var.f2502j) {
                y9Var.a();
                h61 o13 = h61.o(4, 34);
                o13.f26791u = 1;
                arrayList.add(o13);
                h61 o14 = h61.o(5, 34);
                o14.f26791u = 1;
                arrayList.add(o14);
                h61 o15 = h61.o(6, 34);
                o15.f26791u = 1;
                arrayList.add(o15);
            } else if (i24 != i25 && y3.C) {
                h61 o16 = h61.o(4, 34);
                o16.f26791u = 1;
                arrayList.add(o16);
                h61 o17 = h61.o(5, 34);
                o17.f26791u = 1;
                arrayList.add(o17);
                h61 o18 = h61.o(6, 34);
                o18.f26791u = 1;
                arrayList.add(o18);
            }
            if (i20 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(h61.C(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f50429b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(h61.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void W(boolean z10) {
        this.f50446t0 = z10;
        this.Y.N(false);
    }

    public final void X() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f50440n0;
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
                        obj.f4695b = "inapp";
                        obj.f4694a = kVar.h();
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
                    ((sg.k) obj2).f46285g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new q0(this, 0));
            }
        }
        if (arrayList.isEmpty()) {
            ug.r.j(this.X, null, new n0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            X();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            u61 u61Var2 = this.Y;
            if (u61Var2 != null) {
                u61Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.f50430c0;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f50429b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    u61 u61Var3 = this.Y;
                    if (u61Var3 != null) {
                        u61Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f50440n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    X();
                    u61 u61Var4 = this.Y;
                    if (u61Var4 != null) {
                        u61Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new xc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                u61 u61Var5 = this.Y;
                if (u61Var5 != null) {
                    u61Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50441o0 && (u61Var = this.Y) != null) {
            u61Var.N(true);
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f50429b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f50430c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.X, 0, true, new hg.o(this, 27), this.resourcesProvider);
        this.Y = u61Var;
        u61Var.f30860r = false;
        return u61Var;
    }

    public o1(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        int i11;
        this.f50440n0 = new ArrayList();
        this.f50442p0 = -1;
        this.f50443q0 = -1;
        this.f50444r0 = -1;
        new ArrayList();
        this.X = i10;
        this.f50430c0 = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.f50431d0 = z10;
        this.Z = list;
        this.f50428a0 = callback;
        int i12 = h6.f20951b6;
        setBackgroundColor(h6.x0(null, i12, false));
        fixNavigationBar(h6.x0(null, i12, false));
        this.f50441o0 = ga.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        ga.y(i10, false).V();
        w9 w9Var = new w9(context);
        w9Var.setImportantForAccessibility(2);
        h9 h9Var = new h9((d6) null);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f50432e0 = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            w9Var.e(user, h9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            this.f50429b0 = (j10 == UserConfig.getInstance(i10).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f50432e0 = chat == null ? "" : chat.title;
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        this.v = 0.1f;
        ad adVar = new ad(context, i10, this.resourcesProvider);
        this.f50433f0 = adVar;
        b6.a(adVar);
        adVar.setOnClickListener(new hg.r0(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50435h0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f50434g0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        kc kcVar = new kc(context, 70, 0);
        this.f50449w0 = kcVar;
        frameLayout2.addView(kcVar, z5.c(-1.0f, -1));
        w9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(w9Var, z5.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        b6.a(w9Var);
        w9Var.setOnClickListener(new ci.b2(this, j10, 5));
        frameLayout2.addView(adVar, z5.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, z5.e(-1, -2, 55));
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i14 = h6.f21096j5;
        org.telegram.ui.Cells.c1.q(i14, this.resourcesProvider, f7, 17);
        linearLayout.addView(f7, z5.t(-1, -2, 1, 4, 0, 4, 0));
        f7.setMaxWidth(ei.x3.a(f7.getText(), f7.getPaint()));
        x90 x90Var = new x90(context, this.resourcesProvider);
        int i15 = h6.f21049gc;
        x90Var.setLinkTextColor(h6.w0(i15, this.resourcesProvider));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTextColor(h6.w0(i14, this.resourcesProvider));
        x90Var.setGravity(17);
        x90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(x90Var, z5.t(-1, -2, 1, 4, 4, 4, 12));
        f7.setText(LocaleController.getString(R.string.Gift2Premium));
        x90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f50432e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new df0(23)), true)));
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f50436i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Cells.c1.q(i14, this.resourcesProvider, textView, 17);
        linearLayout2.addView(textView, z5.t(-1, -2, 1, 4, 0, 4, 0));
        ?? x90Var2 = new x90(context, this.resourcesProvider);
        this.f50439l0 = x90Var2;
        x90Var2.setLinkTextColor(h6.w0(i15, this.resourcesProvider));
        x90Var2.setTextSize(1, 14.0f);
        x90Var2.setTextColor(h6.w0(i14, this.resourcesProvider));
        x90Var2.setGravity(17);
        ?? x90Var3 = new x90(context, this.resourcesProvider);
        this.m0 = x90Var3;
        x90Var3.setLinkTextColor(h6.w0(i15, this.resourcesProvider));
        x90Var3.setTextSize(1, 14.0f);
        x90Var3.setTextColor(h6.w0(i14, this.resourcesProvider));
        x90Var3.setGravity(17);
        x90Var3.setAlpha(0.0f);
        x90Var3.setScaleX(0.85f);
        x90Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) x90Var2, z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) x90Var3, z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z10) {
            linearLayout2.addView(frameLayout3, z5.t(-2, -2, 1, 0, 9, 0, 4));
            x90 x90Var4 = new x90(context, this.resourcesProvider);
            x90Var4.setLinkTextColor(h6.w0(i15, this.resourcesProvider));
            x90Var4.setTextSize(1, 14.0f);
            x90Var4.setTextColor(h6.w0(i14, this.resourcesProvider));
            x90Var4.setGravity(17);
            linearLayout2.addView(x90Var4, z5.t(-2, -2, 1, 26, 4, 26, 6));
            x90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            x90Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
            this.f50450x0 = x90Var4;
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, z5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(x90Var2);
            x90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f50432e0)), x90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, z5.t(-1, -2, 1, 0, 9, 0, 6));
            y9 G = ga.y(i10, false).G(j10, true);
            ai.z zVar = new ai.z(this, G, j10, callback, context);
            zVar.run();
            x90Var2.addOnAttachStateChangeListener(new w0(zVar));
            if (G.f2504l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(x90Var2, NotificationCenter.starUserGiftsLoaded, new org.telegram.ui.Wallet.x(16, G, zVar));
        }
        wz wzVar = new wz(3, false);
        this.f50437j0 = wzVar;
        wzVar.O = new x0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(wzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? kVar = new s4.k();
        this.f50438k0 = kVar;
        kVar.C = false;
        kVar.f45951m = false;
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.D = 40L;
        this.d.setItemAnimator(kVar);
        this.d.setOnItemClickListener(new xl0() {
            @Override
            public final void a(int i16, View view) {
                o1.R(o1.this, context, i10, callback, j10, i16);
            }
        });
        X();
        this.Y.N(false);
        O();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
            W(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.e.setTitle(A());
        NotificationCenter.listenEmojiLoading(this.e.getTitleTextView());
    }
}
