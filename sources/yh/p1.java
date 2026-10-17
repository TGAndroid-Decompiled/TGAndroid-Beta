package yh;

import ai.fa;
import ai.jc;
import ai.ld;
import ai.ra;
import ai.x9;
import ai.zc;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.a6;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.db;
import org.telegram.ui.ff0;
import org.telegram.ui.yh1;
import w7.b6;
import w7.z5;
public final class p1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int f50456z0 = 0;
    public final int X;
    public s61 Y;
    public List Z;
    public final Utilities.Callback f50457a0;
    public TLRPC.DisallowedGiftsSettings f50458b0;
    public final long f50459c0;
    public final boolean f50460d0;
    public final String f50461e0;
    public final zc f50462f0;
    public final u0 f50463g0;
    public final FrameLayout f50464h0;
    public final LinearLayout f50465i0;
    public final wz f50466j0;
    public final z0 f50467k0;
    public final v0 f50468l0;
    public final w0 m0;
    public final ArrayList f50469n0;
    public final x9 f50470o0;
    public int f50471p0;
    public int f50472q0;
    public int f50473r0;
    public int f50474s0;
    public boolean f50475t0;
    public boolean f50476u0;
    public boolean f50477v0;
    public jc f50478w0;
    public final x90 f50479x0;
    public boolean f50480y0;

    public p1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    public static void Q(final p1 p1Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, yh1 yh1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            yh1Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f20601a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.b2 o10 = alertDialog$Builder.o();
            final ru ruVar = o10.f20667n;
            if (ruVar != null) {
                ruVar.setOnLinkPressListener(new w90() {
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
                        clickableSpan.onClick(ruVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new xc(p1Var.container, p1Var.resourcesProvider).f0(tL_error, false);
        }
    }

    public static void R(p1 p1Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        f61 G = p1Var.Y.G(i11 - 1);
        if (G != null && G.G(g1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof sg.k) {
                new a1(p1Var, context, i10, (sg.k) obj, p1Var.f50459c0, new m0(p1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                x9 x9Var = p1Var.f50470o0;
                if (x9Var != null && p1Var.f50474s0 == p1Var.f50472q0) {
                    ArrayList arrayList = x9Var.f2448l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f20496id == starGift.f20496id) {
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
                        b1Var.C2(savedStarGift, null);
                        b1Var.q2(j10, new ai.v2(p1Var, b1Var, j10, callback, 7));
                    }
                } else if (G.f26145q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f21552a = true;
                        obj3.e = true;
                        c1 c1Var = new c1(j10, starGift.title, starGift.f20496id, p1Var.resourcesProvider, p1Var.container.getViewTreeObserver(), new Object());
                        c1Var.e = new org.telegram.ui.Wallet.x(15, p1Var, callback);
                        U.showAsSheet(c1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f20496id, new org.telegram.ui.Components.a3(context, p1Var.resourcesProvider, i10, j10, new m0(p1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    d6 d6Var = p1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.f3 i13 = wh.i(1, context, d6Var, false);
                        LinearLayout e = wh.e(context, 1);
                        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        e.setClipChildren(false);
                        e.setClipToPadding(false);
                        w9 w9Var = new w9(context);
                        ld.b1(w9Var.getImageReceiver(), starGift, 160);
                        e.addView(w9Var, z5.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.Cells.t0.r(h6.f21092j5, d6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView i14 = a6.i(e, textView, z5.t(-1, -2, 17, 20, 0, 20, 4), context);
                        i14.setTextSize(1, 14.0f);
                        i14.setTypeface(AndroidUtilities.bold());
                        i14.setGravity(17);
                        i14.setTextColor(h6.w0(h6.f21224q7, d6Var));
                        i14.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        e.addView(i14, z5.t(-1, -2, 17, 20, 0, 20, 4));
                        j01 j01Var = new j01(context, d6Var);
                        if (starGift.first_sale_date != 0) {
                            j01Var.g(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            j01Var.g(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        j01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), ld.Y0(false, org.telegram.messenger.q.h(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            ld.G0(j01Var, i10, starGift, d6Var);
                        }
                        e.addView(j01Var, z5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        ei.d dVar = new ei.d(context, d6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        e.addView(dVar, z5.n(-1, 48));
                        i13.customView = e;
                        org.telegram.ui.ActionBar.f3[] f3VarArr = {i13};
                        f3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new ra(f3VarArr, 2));
                        f3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            f3VarArr[0].makeAttached(U2);
                        }
                        f3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new xc(p1Var.container, p1Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    yh1 yh1Var = new yh1(p1Var, context, i10, starGift, callback);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(p1Var.getContext(), 3, null);
                        b2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f20496id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new ai.x2(p1Var, b2Var, yh1Var, callback, 20));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            sg.l1 l1Var = new sg.l1(U3, i10, null, null, starGift, p1Var.resourcesProvider);
                            w9 w9Var2 = new w9(p1Var.getContext());
                            p5 p5Var = new p5(AndroidUtilities.dp(160.0f), 4, w9Var2, false);
                            w9Var2.setImageDrawable(p5Var);
                            w9Var2.addOnAttachStateChangeListener(new t0(p5Var));
                            p5Var.i(starGift.getDocument(), false);
                            l1Var.B0 = w9Var2;
                            l1Var.show();
                            p5Var.f();
                        }
                    } else {
                        yh1Var.run();
                    }
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        if (this.f50460d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f50461e0), null, false);
    }

    public final void V(ArrayList arrayList, s61 s61Var) {
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
        u0 u0Var = this.f50463g0;
        long j11 = this.f50459c0;
        long j12 = 0;
        boolean z17 = this.f50460d0;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.f50458b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(f61.k(u0Var));
            arrayList.add(f61.k(this.f50464h0));
            ArrayList arrayList3 = this.f50469n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = g1.f50265a;
                    f61 J = f61.J(g1.class);
                    J.f26149u = 1;
                    J.G = (sg.k) obj;
                    arrayList.add(J);
                    j12 = j12;
                }
                j10 = j12;
            } else {
                j10 = 0;
                f61 o10 = f61.o(1, 34);
                o10.f26149u = 1;
                arrayList.add(o10);
                f61 o11 = f61.o(2, 34);
                o11.f26149u = 1;
                arrayList.add(o11);
                f61 o12 = f61.o(3, 34);
                o12.f26149u = 1;
                arrayList.add(o12);
            }
            z10 = true;
        }
        int i12 = this.X;
        fa y3 = fa.y(i12, false);
        if (this.f50475t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f50458b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new gi.m1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new db(3)).collect(Collectors.toCollection(new Object()));
        }
        int i14 = (j11 > UserConfig.getInstance(i12).getClientUserId() ? 1 : (j11 == UserConfig.getInstance(i12).getClientUserId() ? 0 : -1));
        x9 x9Var = this.f50470o0;
        if (i14 != 0 && x9Var != null) {
            ArrayList arrayList4 = x9Var.f2448l;
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
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f50458b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && x9Var != null && !x9Var.f2448l.isEmpty()))) {
            if (!z10) {
                arrayList.add(f61.k(u0Var));
            } else {
                arrayList.add(f61.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(f61.k(this.f50465i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f50458b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i16)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f50472q0 = -1;
            this.f50471p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f50471p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f50458b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f50472q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f50473r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            if (this.f50476u0 && !this.f50477v0) {
                this.f50477v0 = true;
                this.f50474s0 = this.f50473r0;
            }
            int i17 = this.f50474s0;
            o0 o0Var = new o0(this, 0);
            int i18 = n1.f50431a;
            f61 J2 = f61.J(n1.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f26153z = i17;
            J2.H = o0Var;
            arrayList.add(J2);
            if (this.f50474s0 == this.f50473r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f50480y0) {
                this.f50480y0 = z12;
                ViewPropertyAnimator animate = this.f50468l0.animate();
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
            if (x9Var != null && this.f50474s0 == this.f50472q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = x9Var.f2448l;
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
                int i22 = this.f50474s0;
                if (i22 == this.f50471p0 || i22 == this.f50472q0 || (i22 == this.f50473r0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i22 != this.f50473r0) {
                        if (i22 == this.f50472q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f50458b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        f61 a2 = g1.a(i22, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i20++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f50474s0;
                    if (i23 == this.f50472q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f50458b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(g1.a(i23, starGift, z13, z14, true, false, false));
                    i20++;
                }
            }
            int i24 = this.f50474s0;
            int i25 = this.f50472q0;
            if (i24 == i25 && x9Var != null && !x9Var.f2446j) {
                x9Var.a();
                f61 o13 = f61.o(4, 34);
                o13.f26149u = 1;
                arrayList.add(o13);
                f61 o14 = f61.o(5, 34);
                o14.f26149u = 1;
                arrayList.add(o14);
                f61 o15 = f61.o(6, 34);
                o15.f26149u = 1;
                arrayList.add(o15);
            } else if (i24 != i25 && y3.C) {
                f61 o16 = f61.o(4, 34);
                o16.f26149u = 1;
                arrayList.add(o16);
                f61 o17 = f61.o(5, 34);
                o17.f26149u = 1;
                arrayList.add(o17);
                f61 o18 = f61.o(6, 34);
                o18.f26149u = 1;
                arrayList.add(o18);
            }
            if (i20 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(f61.C(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f50458b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(f61.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void W(boolean z10) {
        this.f50475t0 = z10;
        this.Y.N(false);
    }

    public final void X() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f50469n0;
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
                        obj.f4698b = "inapp";
                        obj.f4697a = kVar.h();
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
                    ((sg.k) obj2).f46308g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new r0(this, 0));
            }
        }
        if (arrayList.isEmpty()) {
            ug.q.j(this.X, null, new o0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            X();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            s61 s61Var2 = this.Y;
            if (s61Var2 != null) {
                s61Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.f50459c0;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f50458b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    s61 s61Var3 = this.Y;
                    if (s61Var3 != null) {
                        s61Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f50469n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    X();
                    s61 s61Var4 = this.Y;
                    if (s61Var4 != null) {
                        s61Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new xc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                s61 s61Var5 = this.Y;
                if (s61Var5 != null) {
                    s61Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50470o0 && (s61Var = this.Y) != null) {
            s61Var.N(true);
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f50458b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f50459c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.X, 0, true, new hg.o(this, 27), this.resourcesProvider);
        this.Y = s61Var;
        s61Var.f30200r = false;
        return s61Var;
    }

    public p1(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        int i11;
        this.f50469n0 = new ArrayList();
        this.f50471p0 = -1;
        this.f50472q0 = -1;
        this.f50473r0 = -1;
        new ArrayList();
        this.X = i10;
        this.f50459c0 = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.f50460d0 = z10;
        this.Z = list;
        this.f50457a0 = callback;
        int i12 = h6.f20947b6;
        setBackgroundColor(h6.x0(null, i12, false));
        fixNavigationBar(h6.x0(null, i12, false));
        this.f50470o0 = fa.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        fa.y(i10, false).V();
        w9 w9Var = new w9(context);
        w9Var.setImportantForAccessibility(2);
        h9 h9Var = new h9((d6) null);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f50461e0 = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            w9Var.e(user, h9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            this.f50458b0 = (j10 == UserConfig.getInstance(i10).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f50461e0 = chat == null ? "" : chat.title;
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        this.v = 0.1f;
        zc zcVar = new zc(context, i10, this.resourcesProvider);
        this.f50462f0 = zcVar;
        b6.a(zcVar);
        zcVar.setOnClickListener(new hg.r0(this, 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50464h0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f50463g0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        jc jcVar = new jc(context, 70, 0);
        this.f50478w0 = jcVar;
        frameLayout2.addView(jcVar, z5.d(-1.0f, -1));
        w9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(w9Var, z5.a(84.0f, 0.0f, 15.0f, 0.0f, 17.0f, 84, 17));
        b6.a(w9Var);
        w9Var.setOnClickListener(new ci.b2(this, j10, 5));
        frameLayout2.addView(zcVar, z5.a(-2.0f, 0.0f, -3.0f, -10.0f, 0.0f, -2, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, z5.e(-1, -2, 55));
        TextView f7 = org.telegram.messenger.q.f(context, 1, 20.0f);
        f7.setTypeface(AndroidUtilities.bold());
        int i14 = h6.f21092j5;
        org.telegram.ui.Cells.t0.q(i14, this.resourcesProvider, f7, 17);
        linearLayout.addView(f7, z5.t(-1, -2, 1, 4, 0, 4, 0));
        f7.setMaxWidth(ei.x3.a(f7.getText(), f7.getPaint()));
        x90 x90Var = new x90(context, this.resourcesProvider);
        int i15 = h6.f21045gc;
        x90Var.setLinkTextColor(h6.w0(i15, this.resourcesProvider));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTextColor(h6.w0(i14, this.resourcesProvider));
        x90Var.setGravity(17);
        x90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(x90Var, z5.t(-1, -2, 1, 4, 4, 4, 12));
        f7.setText(LocaleController.getString(R.string.Gift2Premium));
        x90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f50461e0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new ff0(22)), true)));
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f50465i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Cells.t0.q(i14, this.resourcesProvider, textView, 17);
        linearLayout2.addView(textView, z5.t(-1, -2, 1, 4, 0, 4, 0));
        ?? x90Var2 = new x90(context, this.resourcesProvider);
        this.f50468l0 = x90Var2;
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
        frameLayout3.addView((View) x90Var2, z5.a(-2.0f, 26.0f, 0.0f, 26.0f, 0.0f, -1, 49));
        frameLayout3.addView((View) x90Var3, z5.a(-2.0f, 26.0f, 0.0f, 26.0f, 0.0f, -1, 49));
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
            this.f50479x0 = x90Var4;
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, z5.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(x90Var2);
            x90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f50461e0)), x90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, z5.t(-1, -2, 1, 0, 9, 0, 6));
            x9 G = fa.y(i10, false).G(j10, true);
            ai.z zVar = new ai.z(this, G, j10, callback, context);
            zVar.run();
            x90Var2.addOnAttachStateChangeListener(new x0(zVar));
            if (G.f2448l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(x90Var2, NotificationCenter.starUserGiftsLoaded, new org.telegram.ui.Wallet.x(16, G, zVar));
        }
        wz wzVar = new wz(3, false);
        this.f50466j0 = wzVar;
        wzVar.O = new y0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(wzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? kVar = new s4.k();
        this.f50467k0 = kVar;
        kVar.C = false;
        kVar.f45972m = false;
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.D = 40L;
        this.d.setItemAnimator(kVar);
        this.d.setOnItemClickListener(new wl0() {
            @Override
            public final void a(int i16, View view) {
                p1.R(p1.this, context, i10, callback, j10, i16);
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
