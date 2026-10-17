package ug;

import ai.ad;
import ai.fa;
import ai.p2;
import ai.uc;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e20;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;
import yh.p1;
public class l1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static d1 J0;
    public e20 A0;
    public Utilities.Callback B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public zq E0;
    public zq F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public final int X;
    public final h1 Y;
    public final f1 Z;
    public final g1 f47722a0;
    public final e1 f47723b0;
    public final xp f47724c0;
    public final ad f47725d0;
    public final FrameLayout f47726e0;
    public final ArrayList f47727f0;
    public final ArrayList f47728g0;
    public final HashSet f47729h0;
    public final ArrayList f47730i0;
    public final ArrayList f47731j0;
    public final ArrayList f47732k0;
    public final HashMap f47733l0;
    public final ArrayList m0;
    public final LinkedHashMap f47734n0;
    public String f47735o0;
    public vg.h f47736p0;
    public int f47737q0;
    public final ArrayList f47738r0;
    public boolean f47739s0;
    public float f47740t0;
    public mb0 f47741u0;
    public final BirthdayController.BirthdayState f47742v0;
    public final p4.s0 f47743w0;
    public int f47744x0;
    public zq f47745y0;
    public String f47746z0;

    public l1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, d6 d6Var) {
        super(context, null, true, false, d6Var);
        int i12;
        float f7;
        boolean z10;
        this.f47727f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47728g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f47729h0 = hashSet;
        this.f47730i0 = new ArrayList();
        this.f47731j0 = new ArrayList();
        this.f47732k0 = new ArrayList();
        this.f47733l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f47734n0 = new LinkedHashMap();
        this.f47737q0 = AndroidUtilities.dp(120.0f);
        this.f47738r0 = new ArrayList();
        this.f47739s0 = false;
        this.f47743w0 = new p4.s0(this, 9);
        this.f47744x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = h6.f21057h5;
        fixNavigationBar(h6.w0(i13, d6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f47742v0 = birthdayState;
        vg.h hVar = this.f47736p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f48401x = z10;
        }
        ?? cVar = new yg.c(getContext(), d6Var);
        this.f47723b0 = cVar;
        cVar.setOnCloseClickListener(new y0(this, 11));
        cVar.setText(A());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f47741u0 = new mb0(this, 2);
        f1 f1Var = new f1(this, getContext(), d6Var);
        this.Z = f1Var;
        f1Var.setBackgroundColor(getThemedColor(i13));
        f1Var.setOnSearchTextChange(new z0(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        f1Var.f50169b.setHintText(LocaleController.getString(i12), false);
        g1 g1Var = new g1(this, getContext());
        this.f47722a0 = g1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, z5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(f1Var, z5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(g1Var, z5.f(1.0f, 55, i16, 0, i16, 0));
        ad adVar = new ad(getContext(), d6Var, (im0) null);
        this.f47725d0 = adVar;
        adVar.setClickable(true);
        adVar.setOrientation(1);
        adVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        adVar.setBackgroundColor(h6.w0(i13, d6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(h6.Z(getThemedColor(h6.f21075i6), 6, 6));
            xp xpVar = new xp(context, 24, d6Var);
            this.f47724c0 = xpVar;
            xpVar.b(h6.Oh, h6.f21094j7, h6.f21114k7);
            xpVar.setDrawUnchecked(true);
            xpVar.a(false, false);
            xpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(xpVar, z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(h6.f21092j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, z5.t(-2, -2, 16, 9, 0, 0, 0));
            b6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final l1 f47684b;

                {
                    this.f47684b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            xp xpVar2 = this.f47684b.f47724c0;
                            xpVar2.a(!xpVar2.f32428a.f24147q, true);
                            return;
                        default:
                            this.f47684b.e0();
                            return;
                    }
                }
            });
            adVar.addView(linearLayout, z5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        h1 h1Var = new h1(this, getContext(), d6Var);
        this.Y = h1Var;
        if (i11 == 4) {
            adVar.setAlpha(0.0f);
            adVar.setVisibility(8);
        }
        h1Var.setOnClickListener(new View.OnClickListener(this) {
            public final l1 f47684b;

            {
                this.f47684b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        xp xpVar2 = this.f47684b.f47724c0;
                        xpVar2.a(!xpVar2.f32428a.f24147q, true);
                        return;
                    default:
                        this.f47684b.e0();
                        return;
                }
            }
        });
        adVar.addView(h1Var, z5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(adVar, z5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f47726e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, z5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        vg.h hVar2 = this.f47736p0;
        im0 im0Var = this.d;
        hVar2.f48397n = arrayList;
        hVar2.f48396f = im0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        im0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new i1(this));
        this.d.setOnItemClickListener(new m4.s0(this, i11, d6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((zl0) new i2.q(this, i11, 19));
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.f45972m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new j1(this));
        f1Var.setText("");
        f1Var.d.b(false);
        f1Var.b(false, hashSet, new y0(this, 12), null);
        cVar.setText(A());
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle(A());
        }
        h0(false);
        c0(false);
        d0(false);
        j0(false, true);
        if (i11 == 0 || i11 == 2) {
            q.j(i10, null, new z0(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        fa.y(i10, false).V();
    }

    public static void Q(l1 l1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = l1Var.f47732k0;
        arrayList.clear();
        l1Var.f47744x0 = -1;
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
        l1Var.j0(true, true);
    }

    public static void R(l1 l1Var, int i10, d6 d6Var, int i11, View view, int i12) {
        long j10;
        boolean z10;
        boolean z11;
        float f7;
        y0 y0Var;
        ad adVar = l1Var.f47725d0;
        f1 f1Var = l1Var.Z;
        ArrayList arrayList = l1Var.f47728g0;
        HashSet hashSet = l1Var.f47729h0;
        if (view instanceof q8) {
            if (i10 == 4) {
                e20 e20Var = l1Var.A0;
                if (e20Var != null) {
                    e20Var.run();
                    l1Var.dismiss();
                    return;
                }
                return;
            }
            f5.l(l1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new z0(l1Var, 2), new y0(l1Var, 9), false, false, l1Var.resourcesProvider).f20609a.show();
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
                    int i14 = gVar.f48386i;
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
                    j10 = user.f20419id;
                } else {
                    j10 = -chat.f20272id;
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
                    uc ucVar = new uc(l1Var.getContext(), d6Var, user, new y0(l1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        ucVar.makeAttached(l1Var.attachedFragment);
                    }
                    ucVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback22 = l1Var.D0;
                        if (callback22 != null) {
                            xp xpVar = l1Var.f47724c0;
                            if (xpVar == null || !xpVar.f32428a.f24147q) {
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
                        l1Var.f47734n0.put(Long.valueOf(j11), user);
                    }
                    if (hashSet.size() == l1Var.a0() + 1) {
                        hashSet.remove(Long.valueOf(j11));
                        l1Var.g0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        adVar.setVisibility(0);
                        ViewPropertyAnimator animate = adVar.animate();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(bs.h).setDuration(320L);
                        if (!z11) {
                            y0Var = new y0(l1Var, 1);
                        } else {
                            y0Var = null;
                        }
                        duration.withEndAction(y0Var).start();
                        vg.h hVar = l1Var.f47736p0;
                        boolean z13 = !z11;
                        if (hVar.f48402y != z13) {
                            hVar.f48402y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f48396f, (Utilities.Callback<View>) new vg.f(z13));
                        }
                    }
                    l1Var.X();
                    f1Var.b(true, hashSet, new y0(l1Var, 2), null);
                    l1Var.j0(true, true);
                    l1Var.Y();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new xc(l1Var.container, d6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    p1 p1Var = new p1(l1Var.getContext(), i11, j11, q.c(q.b(1, l1Var.f47738r0)), new z0(l1Var, 1));
                    BirthdayController.BirthdayState birthdayState = l1Var.f47742v0;
                    if (birthdayState == null || !birthdayState.contains(j11)) {
                        z12 = false;
                    }
                    p1Var.W(z12);
                    p1Var.show();
                }
            }
        }
    }

    public static void S(l1 l1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = l1Var.f47726e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            qc Q = new xc(frameLayout, l1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f29639j = 5000;
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
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.q.q(R.string.UnknownError, new xc(frameLayout, l1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void T(l1 l1Var, final TLRPC.User user, View view) {
        i80 F = i80.F(l1Var.container, l1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(l1Var) {
            public final l1 f47677b;

            {
                this.f47677b = l1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47677b.f24915n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21552a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20419id);
                                    U.showAsSheet(new sn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20419id);
                            n2Var.presentFragment(new sn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47677b.f24915n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21552a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20419id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20419id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(l1Var) {
            public final l1 f47677b;

            {
                this.f47677b = l1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47677b.f24915n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21552a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20419id);
                                    U.showAsSheet(new sn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20419id);
                            n2Var.presentFragment(new sn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47677b.f24915n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21552a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20419id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20419id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void U(l1 l1Var, TL_account.TL_birthday tL_birthday) {
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
        ConnectionsManager.getInstance(l1Var.currentAccount).sendRequest(updatebirthday, new p2(l1Var, userFull, tL_birthday2, 25), 1024);
        MessagesController.getInstance(l1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(l1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(l1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        l1Var.i0(true, true);
    }

    public static void V(l1 l1Var, String str) {
        if (l1Var.f47744x0 >= 0) {
            ConnectionsManager.getInstance(l1Var.currentAccount).cancelRequest(l1Var.f47744x0, true);
            l1Var.f47744x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f20318q = str;
        l1Var.f47744x0 = ConnectionsManager.getInstance(l1Var.currentAccount).sendRequest(tL_contacts_search, new ai.h(l1Var, 27));
    }

    public static boolean b0(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        f0(0, null);
                        return true;
                    }
                }
            } else {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    f0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static l1 f0(int i10, BirthdayController.BirthdayState birthdayState) {
        n2 R = LaunchActivity.R();
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
    public final CharSequence A() {
        String str = this.f47746z0;
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

    @Override
    public final void D(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        e1 e1Var = this.f47723b0;
        e1Var.setTranslationY(max);
        float translationY = e1Var.getTranslationY() + e1Var.getMeasuredHeight();
        f1 f1Var = this.Z;
        f1Var.setTranslationY(translationY);
        float translationY2 = f1Var.getTranslationY() + f1Var.getMeasuredHeight();
        g1 g1Var = this.f47722a0;
        g1Var.setTranslationY(translationY2);
        int measuredHeight = f1Var.getMeasuredHeight() + e1Var.getMeasuredHeight();
        this.d.setTranslationY((g1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final int W(String str, ArrayList arrayList, ArrayList arrayList2) {
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
            if (user != null && !user.bot && !UserObject.isService(user.f20419id)) {
                long j10 = user.f20419id;
                if (j10 != 0 && !this.C0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f20419id);
                    HashSet hashSet = this.f47729h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    vg.g c10 = vg.g.c(user, hashSet.contains(Long.valueOf(user.f20419id)));
                    Z(c10);
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

    public final void X() {
        int i10;
        if (this.f47729h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f47739s0) {
                this.f47739s0 = false;
                AndroidUtilities.runOnUIThread(new y0(this, 4), 10L);
            }
        } else if (!this.f47739s0) {
            this.f47739s0 = true;
            AndroidUtilities.runOnUIThread(new y0(this, 3), 10L);
        }
    }

    public final void Y() {
        if (!TextUtils.isEmpty(this.f47735o0)) {
            this.f47735o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47743w0);
            i0(true, true);
        }
    }

    public final vg.g Z(vg.g gVar) {
        qg.n nVar;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f48383c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f20419id;
            ?? r22 = new View.OnClickListener(this) {
                public final l1 f47667b;

                {
                    this.f47667b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            l1 l1Var = this.f47667b;
                            HashSet hashSet = l1Var.f47729h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = l1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                l1Var.D0 = null;
                            }
                            l1Var.dismiss();
                            return;
                        default:
                            l1 l1Var2 = this.f47667b;
                            HashSet hashSet2 = l1Var2.f47729h0;
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
                public final l1 f47667b;

                {
                    this.f47667b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            l1 l1Var = this.f47667b;
                            HashSet hashSet = l1Var.f47729h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = l1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                l1Var.D0 = null;
                            }
                            l1Var.dismiss();
                            return;
                        default:
                            l1 l1Var2 = this.f47667b;
                            HashSet hashSet2 = l1Var2.f47729h0;
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
            gVar.f48392o = r22;
            gVar.f48393p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f48383c;
        if (i10 == 3) {
            nVar = null;
        } else {
            nVar = new qg.n(6, this, user2);
        }
        gVar.f48391n = nVar;
        return gVar;
    }

    public final int a0() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f47730i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f47733l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                i0(true, true);
            }
        }
    }

    public final void d0(boolean z10) {
        ArrayList arrayList = this.f47731j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                i0(true, true);
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
        AndroidUtilities.cancelRunOnUIThread(this.f47743w0);
    }

    public final void e0() {
        HashSet hashSet = this.f47729h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f47738r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f47734n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f20419id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            xp xpVar = this.f47724c0;
                            callback2.run(Boolean.valueOf((xpVar == null || !xpVar.f32428a.f24147q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = q.c(q.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f20419id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new xc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        p1 p1Var = new p1(getContext(), this.currentAccount, j10, c10, new z0(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f47742v0;
                        p1Var.W((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                        p1Var.show();
                    }
                }
            }
        }
    }

    public final void g0() {
        String string;
        if (this.X == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", a0());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new xc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void h0(boolean z10) {
        h1 h1Var = this.Y;
        boolean z11 = false;
        h1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f47729h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47741u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47741u0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        h1Var.b(hashSet.size(), true);
        h1Var.g(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        h1Var.setEnabled(z11);
    }

    public final void i0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.l1.i0(boolean, boolean):void");
    }

    public final void j0(boolean z10, boolean z11) {
        int R;
        int R2;
        i0(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            im0 im0Var = this.d;
            if (i11 >= im0Var.getChildCount()) {
                break;
            }
            View childAt = im0Var.getChildAt(i11);
            if ((childAt instanceof yg.k) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f47728g0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    vg.g gVar = (vg.g) arrayList.get(R2);
                    yg.k kVar = (yg.k) childAt;
                    kVar.c(gVar.f48388k, z10);
                    TLRPC.Chat chat = gVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f47736p0.F(chat) > 200) {
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
            this.f47736p0.q(0, i10);
            vg.h hVar = this.f47736p0;
            hVar.q(i12, hVar.h() - i12);
        }
        h0(z10);
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
        i0(false, true);
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
    public final hm0 x(im0 im0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, false);
        this.f47736p0 = hVar;
        hVar.f48399s = true;
        return hVar;
    }
}
