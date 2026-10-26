package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.dd;
import bi.ec;
import bi.rc;
import bi.sa;
import bi.t9;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cb;
import org.telegram.ui.fi1;
import org.telegram.ui.u90;
public final class p1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int f53188z0 = 0;
    public final int X;
    public j71 Y;
    public List Z;
    public final Utilities.Callback f53189a0;
    public TLRPC.DisallowedGiftsSettings f53190b0;
    public final long f53191c0;
    public final boolean f53192d0;
    public final String f53193e0;
    public final rc f53194f0;
    public final t0 f53195g0;
    public final FrameLayout f53196h0;
    public final LinearLayout f53197i0;
    public final vz f53198j0;
    public final y0 f53199k0;
    public final u0 f53200l0;
    public final v0 m0;
    public final ArrayList f53201n0;
    public final t9 f53202o0;
    public int f53203p0;
    public int f53204q0;
    public int f53205r0;
    public int f53206s0;
    public boolean f53207t0;
    public boolean f53208u0;
    public boolean f53209v0;
    public ec f53210w0;
    public final z90 f53211x0;
    public boolean f53212y0;

    public p1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    public static void P(final p1 p1Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, fi1 fi1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        e2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            fi1Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f22368a.T = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.e2 p10 = alertDialog$Builder.p();
            final su suVar = p10.f22582n;
            if (suVar != null) {
                suVar.setOnLinkPressListener(new y90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        p1 p1Var2 = p1.this;
                        p1Var2.getClass();
                        p10.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        p1Var2.dismiss();
                        clickableSpan.onClick(suVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new wc(p1Var.container, p1Var.resourcesProvider).g0(tL_error, false);
        }
    }

    public static void Q(p1 p1Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        t61 G = p1Var.Y.G(i11 - 1);
        if (G != null && G.H(f1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof tg.k) {
                new z0(p1Var, context, i10, (tg.k) obj, p1Var.f53191c0, new l0(p1Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                t9 t9Var = p1Var.f53202o0;
                if (t9Var != null && p1Var.f53206s0 == p1Var.f53204q0) {
                    ArrayList arrayList = t9Var.f5471l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f22256id == starGift.f22256id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        a1 a1Var = new a1(p1Var, p1Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), p1Var.resourcesProvider);
                        a1Var.L2(savedStarGift, null);
                        a1Var.y2(j10, new bi.t2(p1Var, a1Var, j10, callback, 7));
                    }
                } else if (G.f32880q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f22928a = true;
                        obj3.e = true;
                        b1 b1Var = new b1(j10, starGift.title, starGift.f22256id, p1Var.resourcesProvider, p1Var.container.getViewTreeObserver(), new Object());
                        b1Var.e = new org.telegram.ui.Wallet.s(17, p1Var, callback);
                        U.showAsSheet(b1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f22256id, new ai.c1(context, p1Var.resourcesProvider, i10, j10, new l0(p1Var, callback, 1)));
                } else if (starGift.sold_out) {
                    u6 u6Var = p1Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.k3 i13 = vh.i(1, context, u6Var, false);
                        LinearLayout d = vh.d(context, 1);
                        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        d.setClipChildren(false);
                        d.setClipToPadding(false);
                        y9 y9Var = new y9(context);
                        dd.Z0(y9Var.getImageReceiver(), starGift, 160);
                        d.addView(y9Var, gb1.x(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.messenger.t.r(textView, y6.f23464j5, u6Var, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView e = vh.e(d, textView, gb1.x(-1, -2, 17, 20, 0, 20, 4), context);
                        e.setTextSize(1, 14.0f);
                        e.setTypeface(AndroidUtilities.bold());
                        e.setGravity(17);
                        f7.V(e, y6.f23598q7, u6Var);
                        e.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        d.addView(e, gb1.x(-1, -2, 17, 20, 0, 20, 4));
                        w01 w01Var = new w01(context, u6Var);
                        if (starGift.first_sale_date != 0) {
                            w01Var.g(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            w01Var.g(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        w01Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), dd.W0(false, org.telegram.messenger.t.i(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            dd.D0(w01Var, i10, starGift, u6Var);
                        }
                        d.addView(w01Var, gb1.o(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        fi.d dVar = new fi.d(context, u6Var, true);
                        dVar.i(LocaleController.getString(R.string.OK), false, true);
                        d.addView(dVar, gb1.r(-1, 48));
                        i13.customView = d;
                        org.telegram.ui.ActionBar.k3[] k3VarArr = {i13};
                        k3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new sa(k3VarArr, 2));
                        k3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            k3VarArr[0].makeAttached(U2);
                        }
                        k3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new wc(p1Var.container, p1Var.resourcesProvider).S(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    fi1 fi1Var = new fi1(p1Var, context, i10, starGift, callback);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(p1Var.getContext(), 3, null);
                        e2Var.r(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f22256id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new bi.i2(p1Var, e2Var, fi1Var, callback, 20));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            tg.m1 m1Var = new tg.m1(U3, i10, null, null, starGift, p1Var.resourcesProvider);
                            y9 y9Var2 = new y9(p1Var.getContext());
                            r5 r5Var = new r5(AndroidUtilities.dp(160.0f), 4, y9Var2, false);
                            y9Var2.setImageDrawable(r5Var);
                            y9Var2.addOnAttachStateChangeListener(new s0(r5Var));
                            r5Var.i(starGift.getDocument(), false);
                            m1Var.B0 = y9Var2;
                            m1Var.show();
                            r5Var.f();
                        }
                    } else {
                        fi1Var.run();
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList, j71 j71Var) {
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
        t0 t0Var = this.f53195g0;
        long j11 = this.f53191c0;
        long j12 = 0;
        boolean z17 = this.f53192d0;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.f53190b0) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(t61.k(t0Var));
            arrayList.add(t61.k(this.f53196h0));
            ArrayList arrayList3 = this.f53201n0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = f1.f52969a;
                    t61 K = t61.K(f1.class);
                    K.f32884u = 1;
                    K.G = (tg.k) obj;
                    arrayList.add(K);
                    j12 = j12;
                }
                j10 = j12;
            } else {
                j10 = 0;
                t61 q5 = t61.q(1, 34);
                q5.f32884u = 1;
                arrayList.add(q5);
                t61 q9 = t61.q(2, 34);
                q9.f32884u = 1;
                arrayList.add(q9);
                t61 q10 = t61.q(3, 34);
                q10.f32884u = 1;
                arrayList.add(q10);
            }
            z10 = true;
        }
        int i12 = this.X;
        ca y3 = ca.y(i12, false);
        if (this.f53207t0) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.f53190b0 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new hi.t1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new cb(3)).collect(Collectors.toCollection(new Object()));
        }
        int i14 = (j11 > UserConfig.getInstance(i12).getClientUserId() ? 1 : (j11 == UserConfig.getInstance(i12).getClientUserId() ? 0 : -1));
        t9 t9Var = this.f53202o0;
        if (i14 != 0 && t9Var != null) {
            ArrayList arrayList4 = t9Var.f5471l;
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
        if (!MessagesController.getInstance(i12).stargiftsBlocked && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.f53190b0) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && t9Var != null && !t9Var.f5471l.isEmpty()))) {
            if (!z10) {
                arrayList.add(t61.k(t0Var));
            } else {
                arrayList.add(t61.D(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(t61.k(this.f53197i0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.f53190b0;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i16)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f53204q0 = -1;
            this.f53203p0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f53203p0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.f53190b0;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f53204q0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f53205r0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            if (this.f53208u0 && !this.f53209v0) {
                this.f53209v0 = true;
                this.f53206s0 = this.f53205r0;
            }
            int i17 = this.f53206s0;
            n0 n0Var = new n0(this, 0);
            int i18 = n1.f53161a;
            t61 K2 = t61.K(n1.class);
            K2.d = 1;
            K2.G = arrayList5;
            K2.f32888z = i17;
            K2.H = n0Var;
            arrayList.add(K2);
            if (this.f53206s0 == this.f53205r0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f53212y0) {
                this.f53212y0 = z12;
                ViewPropertyAnimator animate = this.f53200l0.animate();
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
                ds dsVar = ds.h;
                duration.setInterpolator(dsVar).start();
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
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(dsVar).start();
            }
            if (t9Var != null && this.f53206s0 == this.f53204q0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = t9Var.f5471l;
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
                int i22 = this.f53206s0;
                if (i22 == this.f53203p0 || i22 == this.f53204q0 || (i22 == this.f53205r0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i22 != this.f53205r0) {
                        if (i22 == this.f53204q0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.f53190b0) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        t61 a2 = f1.a(i22, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i20++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f53206s0;
                    if (i23 == this.f53204q0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.f53190b0) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(f1.a(i23, starGift, z13, z14, true, false, false));
                    i20++;
                }
            }
            int i24 = this.f53206s0;
            int i25 = this.f53204q0;
            if (i24 == i25 && t9Var != null && !t9Var.f5469j) {
                t9Var.b();
                t61 q11 = t61.q(4, 34);
                q11.f32884u = 1;
                arrayList.add(q11);
                t61 q12 = t61.q(5, 34);
                q12.f32884u = 1;
                arrayList.add(q12);
                t61 q13 = t61.q(6, 34);
                q13.f32884u = 1;
                arrayList.add(q13);
            } else if (i24 != i25 && y3.C) {
                t61 q14 = t61.q(4, 34);
                q14.f32884u = 1;
                arrayList.add(q14);
                t61 q15 = t61.q(5, 34);
                q15.f32884u = 1;
                arrayList.add(q15);
                t61 q16 = t61.q(6, 34);
                q16.f32884u = 1;
                arrayList.add(q16);
            }
            if (i20 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(t61.D(AndroidUtilities.dp(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.f53190b0;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(t61.D(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void V(boolean z10) {
        this.f53207t0 = z10;
        this.Y.O(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f53201n0;
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
                    tg.k kVar = new tg.k(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(kVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    } else if (kVar.h() != null && BillingController.getInstance().isReady()) {
                        ?? obj = new Object();
                        obj.f7929b = "inapp";
                        obj.f7928a = kVar.h();
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
                    ((tg.k) obj2).f48915g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new x2.e(this, 7));
            }
        }
        if (arrayList.isEmpty()) {
            vg.s.j(this.X, null, new n0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            j71 j71Var2 = this.Y;
            if (j71Var2 != null) {
                j71Var2.O(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.f53191c0;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.X;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.f53190b0 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            wc.b0(U).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    j71 j71Var3 = this.Y;
                    if (j71Var3 != null) {
                        j71Var3.O(true);
                    }
                }
                ArrayList arrayList = this.f53201n0;
                if (arrayList == null || arrayList.isEmpty()) {
                    W();
                    j71 j71Var4 = this.Y;
                    if (j71Var4 != null) {
                        j71Var4.O(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new wc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                j71 j71Var5 = this.Y;
                if (j71Var5 != null) {
                    j71Var5.O(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f53202o0 && (j71Var = this.Y) != null) {
            j71Var.O(true);
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
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.f53190b0;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                wc.b0(U).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f53191c0)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.X, 0, true, new q0(this, 0), this.resourcesProvider);
        this.Y = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        if (this.f53192d0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f53193e0), null, false);
    }

    public p1(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, null);
        char c10;
        int i11;
        this.f53201n0 = new ArrayList();
        this.f53203p0 = -1;
        this.f53204q0 = -1;
        this.f53205r0 = -1;
        new ArrayList();
        this.X = i10;
        this.f53191c0 = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.f53192d0 = z10;
        this.Z = list;
        this.f53189a0 = callback;
        int i12 = y6.f23317b6;
        setBackgroundColorKey(i12);
        fixNavigationBarKey(i12);
        this.f53202o0 = ca.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        ca.y(i10, false).V();
        y9 y9Var = new y9(context);
        y9Var.setImportantForAccessibility(2);
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        j9 j9Var = new j9((u6) null);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            c10 = 2;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f53193e0 = UserObject.getForcedFirstName(user);
            j9Var.r(user);
            y9Var.f(user, j9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.f53190b0 = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            c10 = 2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f53193e0 = chat == null ? "" : chat.title;
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
        }
        this.v = 0.1f;
        rc rcVar = new rc(context, i10, this.resourcesProvider);
        this.f53194f0 = rcVar;
        gb1.b(rcVar);
        rcVar.setOnClickListener(new ig.d0(this, 29));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53196h0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f53195g0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        ec ecVar = new ec(context, 70, 0);
        this.f53210w0 = ecVar;
        frameLayout2.addView(ecVar, gb1.g(-1.0f, -1));
        y9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(y9Var, gb1.h(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        gb1.b(y9Var);
        y9Var.setOnClickListener(new di.a2(this, j10, 5));
        frameLayout2.addView(rcVar, gb1.h(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, gb1.i(-1, -2, 55));
        TextView g7 = org.telegram.messenger.t.g(context, 1, 20.0f);
        g7.setTypeface(AndroidUtilities.bold());
        int i14 = y6.f23464j5;
        f7.V(g7, i14, this.resourcesProvider);
        g7.setGravity(17);
        linearLayout.addView(g7, gb1.x(-1, -2, 1, 4, 0, 4, 0));
        g7.setMaxWidth(fi.v3.a(g7.getText(), g7.getPaint()));
        z90 z90Var = new z90(context, this.resourcesProvider);
        int i15 = y6.gc;
        f7.H(z90Var, i15, this.resourcesProvider);
        z90Var.setTextSize(1, 14.0f);
        f7.V(z90Var, i14, this.resourcesProvider);
        z90Var.setGravity(17);
        z90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(z90Var, gb1.x(-1, -2, 1, 4, 4, 4, 12));
        g7.setText(LocaleController.getString(R.string.Gift2Premium));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f53193e0));
        CharSequence replaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new u90(26)), true);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = replaceTags;
        charSequenceArr[1] = " ";
        charSequenceArr[c10] = replaceArrows;
        z90Var.setText(TextUtils.concat(charSequenceArr));
        z90Var.setMaxWidth(fi.v3.a(z90Var.getText(), z90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f53197i0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.V(textView, i14, this.resourcesProvider);
        textView.setGravity(17);
        linearLayout2.addView(textView, gb1.x(-1, -2, 1, 4, 0, 4, 0));
        ?? z90Var2 = new z90(context, this.resourcesProvider);
        this.f53200l0 = z90Var2;
        f7.H(z90Var2, i15, this.resourcesProvider);
        z90Var2.setTextSize(1, 14.0f);
        f7.V(z90Var2, i14, this.resourcesProvider);
        z90Var2.setGravity(17);
        ?? z90Var3 = new z90(context, this.resourcesProvider);
        this.m0 = z90Var3;
        f7.H(z90Var3, i15, this.resourcesProvider);
        z90Var3.setTextSize(1, 14.0f);
        f7.V(z90Var3, i14, this.resourcesProvider);
        z90Var3.setGravity(17);
        z90Var3.setAlpha(0.0f);
        z90Var3.setScaleX(0.85f);
        z90Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) z90Var2, gb1.h(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) z90Var3, gb1.h(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z10) {
            linearLayout2.addView(frameLayout3, gb1.x(-2, -2, 1, 0, 9, 0, 4));
            z90 z90Var4 = new z90(context, this.resourcesProvider);
            f7.H(z90Var4, i15, this.resourcesProvider);
            z90Var4.setTextSize(1, 14.0f);
            f7.V(z90Var4, i14, this.resourcesProvider);
            z90Var4.setGravity(17);
            linearLayout2.addView(z90Var4, gb1.x(-2, -2, 1, 26, 4, 26, 6));
            z90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            z90Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
            this.f53211x0 = z90Var4;
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, gb1.x(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(z90Var2);
            z90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f53193e0)), z90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, gb1.x(-1, -2, 1, 0, 9, 0, 6));
            t9 G = ca.y(i10, false).G(j10, true);
            bi.a0 a0Var = new bi.a0(this, G, j10, callback, context);
            a0Var.run();
            z90Var2.addOnAttachStateChangeListener(new w0(a0Var));
            if (G.f5471l.size() < 3) {
                G.b();
            }
            NotificationCenter.getInstance(i10).listen(z90Var2, NotificationCenter.starUserGiftsLoaded, new org.telegram.ui.Wallet.s(18, G, a0Var));
        }
        vz vzVar = new vz(3, false);
        this.f53198j0 = vzVar;
        vzVar.O = new x0(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(vzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? lVar = new s4.l();
        this.f53199k0 = lVar;
        lVar.C = false;
        lVar.f47763m = false;
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.D = 40L;
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new zl0() {
            @Override
            public final void c(int i16, View view) {
                p1.Q(p1.this, context, i10, callback, j10, i16);
            }
        });
        W();
        this.Y.O(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
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
