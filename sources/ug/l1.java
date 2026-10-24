package ug;

import ai.cd;
import ai.ha;
import ai.j2;
import ai.wc;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.f20;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;
import yh.o1;
public class l1 extends za implements NotificationCenter.NotificationCenterDelegate {
    public static d1 J0;
    public f20 A0;
    public Utilities.Callback B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public wq E0;
    public wq F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public final int X;
    public final h1 Y;
    public final f1 Z;
    public final g1 f48146a0;
    public final e1 f48147b0;
    public final vp f48148c0;
    public final cd f48149d0;
    public final FrameLayout f48150e0;
    public final ArrayList f48151f0;
    public final ArrayList f48152g0;
    public final HashSet f48153h0;
    public final ArrayList f48154i0;
    public final ArrayList f48155j0;
    public final ArrayList f48156k0;
    public final HashMap f48157l0;
    public final ArrayList m0;
    public final LinkedHashMap f48158n0;
    public String f48159o0;
    public vg.h f48160p0;
    public int f48161q0;
    public final ArrayList f48162r0;
    public boolean f48163s0;
    public float f48164t0;
    public lb0 f48165u0;
    public final BirthdayController.BirthdayState f48166v0;
    public final m4 f48167w0;
    public int f48168x0;
    public wq f48169y0;
    public String f48170z0;

    public l1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, g6 g6Var) {
        super(context, null, true, false, g6Var);
        int i12;
        float f7;
        boolean z10;
        this.f48151f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f48152g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f48153h0 = hashSet;
        this.f48154i0 = new ArrayList();
        this.f48155j0 = new ArrayList();
        this.f48156k0 = new ArrayList();
        this.f48157l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f48158n0 = new LinkedHashMap();
        this.f48161q0 = AndroidUtilities.dp(120.0f);
        this.f48162r0 = new ArrayList();
        this.f48163s0 = false;
        this.f48167w0 = new m4(this, 12);
        this.f48168x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = k6.f21255h5;
        fixNavigationBarKey(i13);
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f48166v0 = birthdayState;
        vg.h hVar = this.f48160p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f48827x = z10;
        }
        ?? cVar = new yg.c(getContext(), g6Var);
        this.f48147b0 = cVar;
        cVar.setOnCloseClickListener(new y0(this, 11));
        cVar.setText(z());
        cVar.setCloseImageVisible(false);
        cVar.f50585f.c(0.0f, false);
        this.f48165u0 = new lb0(this, 2);
        f1 f1Var = new f1(this, getContext(), g6Var);
        this.Z = f1Var;
        r6.i(i13, f1Var, g6Var);
        f1Var.setOnSearchTextChange(new z0(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        f1Var.f50596b.setHintText(LocaleController.getString(i12), false);
        g1 g1Var = new g1(this, getContext());
        this.f48146a0 = g1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, z5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(f1Var, z5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(g1Var, z5.f(1.0f, 55, i16, 0, i16, 0));
        cd cdVar = new cd(getContext(), g6Var, (lm0) null);
        this.f48149d0 = cdVar;
        cdVar.setClickable(true);
        cdVar.setOrientation(1);
        cdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        r6.i(i13, cdVar, g6Var);
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i17 = k6.f21273i6;
            org.telegram.ui.Cells.y Z = k6.Z(getThemedColor(i17), 6, 6);
            n6 O = r6.O(i17);
            linearLayout.setBackground(Z);
            r6.k(linearLayout, Z, null, O, g6Var);
            vp vpVar = new vp(context, 24, g6Var);
            this.f48148c0 = vpVar;
            vpVar.b(k6.Oh, k6.f21292j7, k6.f21312k7);
            vpVar.setDrawUnchecked(true);
            vpVar.a(false, false);
            vpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(vpVar, z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            r6.W(textView, k6.f21290j5, g6Var);
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, z5.t(-2, -2, 16, 9, 0, 0, 0));
            b6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final l1 f48108b;

                {
                    this.f48108b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            vp vpVar2 = this.f48108b.f48148c0;
                            vpVar2.a(!vpVar2.f32005a.f24297q, true);
                            return;
                        default:
                            this.f48108b.d0();
                            return;
                    }
                }
            });
            cdVar.addView(linearLayout, z5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        h1 h1Var = new h1(this, getContext(), g6Var);
        this.Y = h1Var;
        if (i11 == 4) {
            cdVar.setAlpha(0.0f);
            cdVar.setVisibility(8);
        }
        h1Var.setOnClickListener(new View.OnClickListener(this) {
            public final l1 f48108b;

            {
                this.f48108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        vp vpVar2 = this.f48108b.f48148c0;
                        vpVar2.a(!vpVar2.f32005a.f24297q, true);
                        return;
                    default:
                        this.f48108b.d0();
                        return;
                }
            }
        });
        cdVar.addView(h1Var, z5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i18 = this.backgroundPaddingLeft;
            viewGroup4.addView(cdVar, z5.f(-2.0f, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f48150e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i19 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, z5.f(300.0f, 87, i19, 0, i19, AndroidUtilities.dp(68.0f)));
        vg.h hVar2 = this.f48160p0;
        lm0 lm0Var = this.d;
        hVar2.f48823n = arrayList;
        hVar2.f48822f = lm0Var;
        int i20 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        lm0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(f7));
        this.d.j(new i1(this));
        this.d.setOnItemClickListener(new m4.s0(this, i11, g6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((cm0) new i2.r(this, i11, 19));
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(zr.h);
        kVar.C = false;
        kVar.f46376m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new j1(this));
        f1Var.setText("");
        f1Var.d.b(false);
        f1Var.b(false, hashSet, new y0(this, 12), null);
        cVar.setText(z());
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle(z());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            q.j(i10, null, new z0(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        ha.y(i10, false).V();
    }

    public static void P(l1 l1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = l1Var.f48156k0;
        arrayList.clear();
        l1Var.f48168x0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(l1Var.currentAccount);
            int i10 = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.Peer peer = arrayList2.get(i11);
                i11++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    arrayList.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size2 = arrayList3.size();
            while (i10 < size2) {
                TLRPC.Peer peer2 = arrayList3.get(i10);
                i10++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    arrayList.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        l1Var.i0(true, true);
    }

    public static void Q(l1 l1Var, int i10, g6 g6Var, int i11, View view, int i12) {
        long j10;
        boolean z10;
        boolean z11;
        float f7;
        y0 y0Var;
        cd cdVar = l1Var.f48149d0;
        f1 f1Var = l1Var.Z;
        ArrayList arrayList = l1Var.f48152g0;
        HashSet hashSet = l1Var.f48153h0;
        if (view instanceof r8) {
            if (i10 == 4) {
                f20 f20Var = l1Var.A0;
                if (f20Var != null) {
                    f20Var.run();
                    l1Var.dismiss();
                    return;
                }
                return;
            }
            d5.l(l1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new z0(l1Var, 2), new y0(l1Var, 9), false, false, l1Var.resourcesProvider).f20729a.show();
        } else if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            vg.g gVar = null;
            boolean z12 = true;
            if (user == null && chat == null && i10 == 3) {
                int i13 = i12 - 1;
                if (i13 >= 0 && i13 < arrayList.size()) {
                    gVar = (vg.g) arrayList.get(i13);
                }
                Utilities.Callback callback = l1Var.B0;
                if (callback != null && gVar != null) {
                    int i14 = gVar.f48812i;
                    if (i14 == 4) {
                        callback.run(-98L);
                    } else if (i14 == 5) {
                        callback.run(-97L);
                    } else {
                        callback.run(-99L);
                    }
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f20491id;
                } else {
                    j10 = -chat.f20344id;
                }
                long j11 = j10;
                if (i10 == 3) {
                    Utilities.Callback callback2 = l1Var.B0;
                    if (callback2 != null) {
                        callback2.run(Long.valueOf(j11));
                    }
                } else if (i10 == 1) {
                    if (f1Var != null) {
                        AndroidUtilities.hideKeyboard(f1Var.getEditText());
                    }
                    wc wcVar = new wc(l1Var.getContext(), g6Var, user, new y0(l1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        wcVar.makeAttached(l1Var.attachedFragment);
                    }
                    wcVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback22 = l1Var.D0;
                        if (callback22 != null) {
                            vp vpVar = l1Var.f48148c0;
                            if (vpVar == null || !vpVar.f32005a.f24297q) {
                                z12 = false;
                            }
                            callback22.run(Boolean.valueOf(z12), hashSet);
                            l1Var.D0 = null;
                        }
                        l1Var.dismiss();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j11))) {
                        hashSet.remove(Long.valueOf(j11));
                    } else {
                        hashSet.add(Long.valueOf(j11));
                        l1Var.f48158n0.put(Long.valueOf(j11), user);
                    }
                    if (hashSet.size() == l1Var.Z() + 1) {
                        hashSet.remove(Long.valueOf(j11));
                        l1Var.f0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        cdVar.setVisibility(0);
                        ViewPropertyAnimator animate = cdVar.animate();
                        float f10 = 0.0f;
                        if (z11) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f7);
                        if (!z11) {
                            f10 = AndroidUtilities.dp(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(zr.h).setDuration(320L);
                        if (!z11) {
                            y0Var = new y0(l1Var, 1);
                        } else {
                            y0Var = null;
                        }
                        duration.withEndAction(y0Var).start();
                        vg.h hVar = l1Var.f48160p0;
                        boolean z13 = !z11;
                        if (hVar.f48828y != z13) {
                            hVar.f48828y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f48822f, (Utilities.Callback<View>) new vg.f(z13));
                        }
                    }
                    l1Var.W();
                    f1Var.b(true, hashSet, new y0(l1Var, 2), null);
                    l1Var.i0(true, true);
                    l1Var.X();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new vc(l1Var.container, g6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    o1 o1Var = new o1(l1Var.getContext(), i11, j11, q.c(q.b(1, l1Var.f48162r0)), new z0(l1Var, 1));
                    BirthdayController.BirthdayState birthdayState = l1Var.f48166v0;
                    if (birthdayState == null || !birthdayState.contains(j11)) {
                        z12 = false;
                    }
                    o1Var.V(z12);
                    o1Var.show();
                }
            }
        }
    }

    public static void R(l1 l1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = l1Var.f48150e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            oc Q = new vc(frameLayout, l1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f29203j = 5000;
            Q.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(l1Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (l1Var.getContext() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l1Var.getContext(), 0, l1Var.resourcesProvider);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.v0.p(R.string.UnknownError, new vc(frameLayout, l1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(l1 l1Var, final TLRPC.User user, View view) {
        h80 F = h80.F(l1Var.container, l1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(l1Var) {
            public final l1 f48101b;

            {
                this.f48101b = l1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            o2 o2Var = this.f48101b.f33212n;
                            if (o2Var == null) {
                                o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21637a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20491id);
                                    U.showAsSheet(new sn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20491id);
                            o2Var.presentFragment(new sn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            o2 o2Var2 = this.f48101b.f33212n;
                            if (o2Var2 == null) {
                                o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21637a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20491id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20491id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(l1Var) {
            public final l1 f48101b;

            {
                this.f48101b = l1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            o2 o2Var = this.f48101b.f33212n;
                            if (o2Var == null) {
                                o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21637a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20491id);
                                    U.showAsSheet(new sn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20491id);
                            o2Var.presentFragment(new sn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            o2 o2Var2 = this.f48101b.f33212n;
                            if (o2Var2 == null) {
                                o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21637a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20491id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20491id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void T(l1 l1Var, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(l1Var.currentAccount).getUserFull(UserConfig.getInstance(l1Var.currentAccount).getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(l1Var.currentAccount).sendRequest(updatebirthday, new j2(l1Var, userFull, tL_birthday2, 25), 1024);
        MessagesController.getInstance(l1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(l1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(l1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        l1Var.h0(true, true);
    }

    public static void U(l1 l1Var, String str) {
        if (l1Var.f48168x0 >= 0) {
            ConnectionsManager.getInstance(l1Var.currentAccount).cancelRequest(l1Var.f48168x0, true);
            l1Var.f48168x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f20390q = str;
        l1Var.f48168x0 = ConnectionsManager.getInstance(l1Var.currentAccount).sendRequest(tL_contacts_search, new ai.h(l1Var, 27));
    }

    public static boolean a0(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        e0(0, null);
                        return true;
                    }
                }
            } else {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static l1 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        o2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        d1 d1Var = J0;
        if (d1Var != null) {
            return d1Var;
        }
        ?? l1Var = new l1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            l1Var.makeAttached(R);
        }
        R.showDialog(l1Var);
        J0 = l1Var;
        return l1Var;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        e1 e1Var = this.f48147b0;
        e1Var.setTranslationY(max);
        float translationY = e1Var.getTranslationY() + e1Var.getMeasuredHeight();
        f1 f1Var = this.Z;
        f1Var.setTranslationY(translationY);
        float translationY2 = f1Var.getTranslationY() + f1Var.getMeasuredHeight();
        g1 g1Var = this.f48146a0;
        g1Var.setTranslationY(translationY2);
        int measuredHeight = f1Var.getMeasuredHeight() + e1Var.getMeasuredHeight();
        this.d.setTranslationY((g1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final int V(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.f20491id)) {
                long j10 = user.f20491id;
                if (j10 != 0 && !this.C0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f20491id);
                    HashSet hashSet = this.f48153h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    vg.g c10 = vg.g.c(user, hashSet.contains(Long.valueOf(user.f20491id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(vg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f48153h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f48163s0) {
                this.f48163s0 = false;
                AndroidUtilities.runOnUIThread(new y0(this, 4), 10L);
            }
        } else if (!this.f48163s0) {
            this.f48163s0 = true;
            AndroidUtilities.runOnUIThread(new y0(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f48159o0)) {
            this.f48159o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f48167w0);
            h0(true, true);
        }
    }

    public final vg.g Y(vg.g gVar) {
        org.telegram.ui.web.c cVar;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f48809c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f20491id;
            ?? r22 = new View.OnClickListener(this) {
                public final l1 f48092b;

                {
                    this.f48092b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            l1 l1Var = this.f48092b;
                            HashSet hashSet = l1Var.f48153h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = l1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                l1Var.D0 = null;
                            }
                            l1Var.dismiss();
                            return;
                        default:
                            l1 l1Var2 = this.f48092b;
                            HashSet hashSet2 = l1Var2.f48153h0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = l1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                l1Var2.D0 = null;
                            }
                            l1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final l1 f48092b;

                {
                    this.f48092b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            l1 l1Var = this.f48092b;
                            HashSet hashSet = l1Var.f48153h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = l1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                l1Var.D0 = null;
                            }
                            l1Var.dismiss();
                            return;
                        default:
                            l1 l1Var2 = this.f48092b;
                            HashSet hashSet2 = l1Var2.f48153h0;
                            hashSet2.add(Long.valueOf(j10));
                            Utilities.Callback2 callback22 = l1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                l1Var2.D0 = null;
                            }
                            l1Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f48818o = r22;
            gVar.f48819p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f48809c;
        if (i10 == 3) {
            cVar = null;
        } else {
            cVar = new org.telegram.ui.web.c(7, this, user2);
        }
        gVar.f48817n = cVar;
        return gVar;
    }

    public final int Z() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f48154i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f48157l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f48155j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f48153h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f48162r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f48158n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f20491id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            vp vpVar = this.f48148c0;
                            callback2.run(Boolean.valueOf((vpVar == null || !vpVar.f32005a.f24297q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = q.c(q.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f20491id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new vc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        o1 o1Var = new o1(getContext(), this.currentAccount, j10, c10, new z0(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f48166v0;
                        o1Var.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                        o1Var.show();
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.giftsToUserSent) {
            dismiss();
        } else if (i10 == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new y0(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new y0(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new y0(this, 10));
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Z.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        J0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f48167w0);
    }

    public final void f0() {
        String string;
        if (this.X == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Z());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new vc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        h1 h1Var = this.Y;
        boolean z11 = false;
        h1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f48153h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f48165u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f48165u0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        h1Var.b(hashSet.size(), true);
        h1Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        h1Var.setEnabled(z11);
    }

    public final void h0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.l1.h0(boolean, boolean):void");
    }

    public final void i0(boolean z10, boolean z11) {
        int R;
        int R2;
        h0(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            lm0 lm0Var = this.d;
            if (i11 >= lm0Var.getChildCount()) {
                break;
            }
            View childAt = lm0Var.getChildAt(i11);
            if ((childAt instanceof yg.k) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f48152g0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    vg.g gVar = (vg.g) arrayList.get(R2);
                    yg.k kVar = (yg.k) childAt;
                    kVar.c(gVar.f48814k, z10);
                    TLRPC.Chat chat = gVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f48160p0.F(chat) > 200) {
                            f7 = 0.3f;
                        }
                        kVar.i(f7, z10);
                    } else {
                        kVar.i(1.0f, z10);
                    }
                    i12 = R;
                }
            }
            i11++;
        }
        if (z10) {
            this.f48160p0.q(0, i10);
            vg.h hVar = this.f48160p0;
            hVar.q(i12, hVar.h() - i12);
        }
        g0(z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h0(false, true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            int w02 = k6.w0(k6.Oh, this.resourcesProvider);
            wq wqVar = this.F0;
            boolean z11 = true;
            if (wqVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                k6.z1(w02, wqVar.f32322a);
            }
            wq wqVar2 = this.E0;
            if (wqVar2 == null) {
                z11 = false;
            }
            if (z11) {
                k6.z1(w02, wqVar2.f32322a);
            }
            lm0 lm0Var = this.d;
            if (lm0Var != null) {
                for (int i10 = 0; i10 < lm0Var.getChildCount(); i10++) {
                    lm0Var.getChildAt(i10).invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, false);
        this.f48160p0 = hVar;
        hVar.f48825s = true;
        return hVar;
    }

    @Override
    public final CharSequence z() {
        String str = this.f48170z0;
        if (str != null) {
            return str;
        }
        int i10 = this.X;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        return LocaleController.getString(R.string.GiftTelegramPremiumTitle);
                    }
                    return LocaleController.getString(R.string.VoipConferenceAddPeople);
                }
            } else {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }
}
