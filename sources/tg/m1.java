package tg;

import ai.o8;
import ai.t5;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.k2;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.m20;
import org.telegram.ui.t20;
import org.telegram.ui.vy0;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
import xh.r1;
import yh.a7;
public class m1 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public static f1 G0;
    public t20 A0;
    public k2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final j1 Y;
    public final h1 Z;
    public final i1 f48353a0;
    public final g1 f48354b0;
    public final dq f48355c0;
    public final m20 f48356d0;
    public final FrameLayout f48357e0;
    public final ArrayList f48358f0;
    public final ArrayList f48359g0;
    public final HashSet f48360h0;
    public final ArrayList f48361i0;
    public final ArrayList f48362j0;
    public final ArrayList f48363k0;
    public final HashMap f48364l0;
    public final ArrayList m0;
    public final LinkedHashMap f48365n0;
    public String f48366o0;
    public ug.h f48367p0;
    public int f48368q0;
    public final ArrayList f48369r0;
    public boolean f48370s0;
    public float f48371t0;
    public tb0 f48372u0;
    public final BirthdayController.BirthdayState f48373v0;
    public final m5 f48374w0;
    public int f48375x0;
    public fr f48376y0;
    public String f48377z0;

    public m1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, e6 e6Var) {
        super(context, null, true, false, e6Var);
        int i12;
        float f7;
        boolean z10;
        this.f48358f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f48359g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f48360h0 = hashSet;
        this.f48361i0 = new ArrayList();
        this.f48362j0 = new ArrayList();
        this.f48363k0 = new ArrayList();
        this.f48364l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f48365n0 = new LinkedHashMap();
        this.f48368q0 = AndroidUtilities.dp(120.0f);
        this.f48369r0 = new ArrayList();
        this.f48370s0 = false;
        this.f48374w0 = new m5(this, 8);
        this.f48375x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = i6.f20868h5;
        fixNavigationBar(i6.w0(i13, e6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f48373v0 = birthdayState;
        ug.h hVar = this.f48367p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f48945x = z10;
        }
        ?? cVar = new xg.c(getContext(), e6Var);
        this.f48354b0 = cVar;
        cVar.setOnCloseClickListener(new a1(this, 11));
        cVar.setText(B());
        cVar.setCloseImageVisible(false);
        cVar.f51127e.c(0.0f, false);
        this.f48372u0 = new tb0(this, 2);
        h1 h1Var = new h1(this, getContext(), e6Var);
        this.Z = h1Var;
        h1Var.setBackgroundColor(getThemedColor(i13));
        h1Var.setOnSearchTextChange(new b1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        h1Var.f51142b.setHintText(LocaleController.getString(i12), false);
        i1 i1Var = new i1(this, getContext());
        this.f48353a0 = i1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, x5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(h1Var, x5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(i1Var, x5.f(1.0f, 55, i16, 0, i16, 0));
        m20 m20Var = new m20(getContext(), e6Var, (qm0) null);
        this.f48356d0 = m20Var;
        m20Var.setClickable(true);
        m20Var.setOrientation(1);
        m20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m20Var.setBackgroundColor(i6.w0(i13, e6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(i6.Z(getThemedColor(i6.f20888i6), 6, 6));
            dq dqVar = new dq(context, 24, e6Var);
            this.f48355c0 = dqVar;
            dqVar.b(i6.Oh, i6.f20907j7, i6.f20926k7);
            dqVar.setDrawUnchecked(true);
            dqVar.a(false, false);
            dqVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(dqVar, x5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(i6.f20905j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, x5.t(-2, -2, 16, 9, 0, 0, 0));
            z5.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final m1 f48321b;

                {
                    this.f48321b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            dq dqVar2 = this.f48321b.f48355c0;
                            dqVar2.a(!dqVar2.f25790a.f24097q, true);
                            return;
                        default:
                            this.f48321b.e0();
                            return;
                    }
                }
            });
            m20Var.addView(linearLayout, x5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        j1 j1Var = new j1(this, getContext(), e6Var);
        this.Y = j1Var;
        if (i11 == 4) {
            m20Var.setAlpha(0.0f);
            m20Var.setVisibility(8);
        }
        j1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m1 f48321b;

            {
                this.f48321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        dq dqVar2 = this.f48321b.f48355c0;
                        dqVar2.a(!dqVar2.f25790a.f24097q, true);
                        return;
                    default:
                        this.f48321b.e0();
                        return;
                }
            }
        });
        m20Var.addView(j1Var, x5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(m20Var, x5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f48357e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, x5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        ug.h hVar2 = this.f48367p0;
        qm0 qm0Var = this.d;
        hVar2.f48941n = arrayList;
        hVar2.f48940f = qm0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        qm0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new k1(this));
        this.d.setOnItemClickListener(new lu(this, i11, e6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((hm0) new i2.s(this, i11, 19));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(hs.h);
        jVar.C = false;
        jVar.f47696m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new l1(this));
        h1Var.setText("");
        h1Var.d.b(false);
        h1Var.b(false, hashSet, new a1(this, 12), null);
        cVar.setText(B());
        ab abVar = this.f26023e;
        if (abVar != null) {
            abVar.setTitle(B());
        }
        h0(false);
        c0(false);
        d0(false);
        j0(false, true);
        if (i11 == 0 || i11 == 2) {
            s.j(i10, null, new b1(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        yh.m5.y(i10, false).V();
    }

    public static void Q(m1 m1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = m1Var.f48363k0;
        arrayList.clear();
        m1Var.f48375x0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(m1Var.currentAccount);
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
        m1Var.j0(true, true);
    }

    public static void R(m1 m1Var, int i10, e6 e6Var, int i11, View view) {
        long j3;
        boolean z10;
        boolean z11;
        float f7;
        a1 a1Var;
        m20 m20Var = m1Var.f48356d0;
        h1 h1Var = m1Var.Z;
        HashSet hashSet = m1Var.f48360h0;
        if (view instanceof r8) {
            if (i10 == 4) {
                t20 t20Var = m1Var.A0;
                if (t20Var != null) {
                    t20Var.run();
                    m1Var.dismiss();
                    return;
                }
                return;
            }
            g5.l(m1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new b1(m1Var, 2), new a1(m1Var, 9), false, false, m1Var.resourcesProvider).f20380a.show();
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                k2 k2Var = m1Var.B0;
                if (k2Var != null) {
                    k2Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f20185id;
                } else {
                    j3 = -chat.f20038id;
                }
                long j10 = j3;
                if (i10 == 3) {
                    k2 k2Var2 = m1Var.B0;
                    if (k2Var2 != null) {
                        k2Var2.run(Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i10 == 1) {
                    if (h1Var != null) {
                        AndroidUtilities.hideKeyboard(h1Var.getEditText());
                    }
                    a7 a7Var = new a7(m1Var.getContext(), e6Var, user, new a1(m1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        a7Var.makeAttached(m1Var.attachedFragment);
                    }
                    a7Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = m1Var.D0;
                        if (callback2 != null) {
                            dq dqVar = m1Var.f48355c0;
                            if (dqVar == null || !dqVar.f25790a.f24097q) {
                                z12 = false;
                            }
                            callback2.run(Boolean.valueOf(z12), hashSet);
                            m1Var.D0 = null;
                        }
                        m1Var.dismiss();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                        m1Var.f48365n0.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == m1Var.a0() + 1) {
                        hashSet.remove(Long.valueOf(j10));
                        m1Var.g0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        m20Var.setVisibility(0);
                        ViewPropertyAnimator animate = m20Var.animate();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(hs.h).setDuration(320L);
                        if (!z11) {
                            a1Var = new a1(m1Var, 1);
                        } else {
                            a1Var = null;
                        }
                        duration.withEndAction(a1Var).start();
                        ug.h hVar = m1Var.f48367p0;
                        boolean z13 = !z11;
                        if (hVar.f48946y != z13) {
                            hVar.f48946y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f48940f, (Utilities.Callback<View>) new ug.f(z13));
                        }
                    }
                    m1Var.X();
                    h1Var.b(true, hashSet, new a1(m1Var, 2), null);
                    m1Var.j0(true, true);
                    m1Var.Y();
                } else if (UserObject.areGiftsDisabled(j10)) {
                    new ad(m1Var.container, e6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                } else {
                    r1 r1Var = new r1(m1Var.getContext(), i11, j10, s.c(s.b(1, m1Var.f48369r0)), new b1(m1Var, 1));
                    BirthdayController.BirthdayState birthdayState = m1Var.f48373v0;
                    if (birthdayState == null || !birthdayState.contains(j10)) {
                        z12 = false;
                    }
                    r1Var.W(z12);
                    r1Var.show();
                }
            }
        }
    }

    public static void S(m1 m1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = m1Var.f48357e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            tc Q = new ad(frameLayout, m1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f31130j = 5000;
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
            MessagesStorage.getInstance(m1Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (m1Var.getContext() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m1Var.getContext(), 0, m1Var.resourcesProvider);
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.q.q(R.string.UnknownError, new ad(frameLayout, m1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void T(m1 m1Var, final TLRPC.User user, View view) {
        p80 F = p80.F(m1Var.container, m1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(m1Var) {
            public final m1 f48310b;

            {
                this.f48310b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f48310b.f26025n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21357a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20185id);
                                    U.showAsSheet(new zn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20185id);
                            n2Var.presentFragment(new zn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f48310b.f26025n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21357a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20185id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20185id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(m1Var) {
            public final m1 f48310b;

            {
                this.f48310b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f48310b.f26025n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21357a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20185id);
                                    U.showAsSheet(new zn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20185id);
                            n2Var.presentFragment(new zn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f48310b.f26025n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21357a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20185id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20185id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void U(m1 m1Var, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(m1Var.currentAccount).getUserFull(UserConfig.getInstance(m1Var.currentAccount).getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(updatebirthday, new t5(m1Var, userFull, tL_birthday2, 20), 1024);
        MessagesController.getInstance(m1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(m1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(m1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        m1Var.i0(true, true);
    }

    public static void V(m1 m1Var, String str) {
        if (m1Var.f48375x0 >= 0) {
            ConnectionsManager.getInstance(m1Var.currentAccount).cancelRequest(m1Var.f48375x0, true);
            m1Var.f48375x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f20084q = str;
        m1Var.f48375x0 = ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(tL_contacts_search, new o8(m1Var, 21));
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

    public static m1 f0(int i10, BirthdayController.BirthdayState birthdayState) {
        n2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        f1 f1Var = G0;
        if (f1Var != null) {
            return f1Var;
        }
        ?? m1Var = new m1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            m1Var.makeAttached(R);
        }
        R.showDialog(m1Var);
        G0 = m1Var;
        return m1Var;
    }

    @Override
    public final CharSequence B() {
        String str = this.f48377z0;
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
    public final void E(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        g1 g1Var = this.f48354b0;
        g1Var.setTranslationY(max);
        float translationY = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.Z;
        h1Var.setTranslationY(translationY);
        float translationY2 = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.f48353a0;
        i1Var.setTranslationY(translationY2);
        int measuredHeight = h1Var.getMeasuredHeight() + g1Var.getMeasuredHeight();
        this.d.setTranslationY((i1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
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
            if (user != null && !user.bot && !UserObject.isService(user.f20185id)) {
                long j3 = user.f20185id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f20185id);
                    HashSet hashSet = this.f48360h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    ug.g c10 = ug.g.c(user, hashSet.contains(Long.valueOf(user.f20185id)));
                    Z(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(ug.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void X() {
        int i10;
        if (this.f48360h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f48370s0) {
                this.f48370s0 = false;
                AndroidUtilities.runOnUIThread(new a1(this, 4), 10L);
            }
        } else if (!this.f48370s0) {
            this.f48370s0 = true;
            AndroidUtilities.runOnUIThread(new a1(this, 3), 10L);
        }
    }

    public final void Y() {
        if (!TextUtils.isEmpty(this.f48366o0)) {
            this.f48366o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f48374w0);
            i0(true, true);
        }
    }

    public final ug.g Z(ug.g gVar) {
        vy0 vy0Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f48925c;
            if (user == null) {
                return gVar;
            }
            final long j3 = user.f20185id;
            ?? r22 = new View.OnClickListener(this) {
                public final m1 f48301b;

                {
                    this.f48301b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f48301b;
                            HashSet hashSet = m1Var.f48360h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f48301b;
                            HashSet hashSet2 = m1Var2.f48360h0;
                            hashSet2.add(Long.valueOf(j3));
                            Utilities.Callback2 callback22 = m1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                m1Var2.D0 = null;
                            }
                            m1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final m1 f48301b;

                {
                    this.f48301b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f48301b;
                            HashSet hashSet = m1Var.f48360h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f48301b;
                            HashSet hashSet2 = m1Var2.f48360h0;
                            hashSet2.add(Long.valueOf(j3));
                            Utilities.Callback2 callback22 = m1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                m1Var2.D0 = null;
                            }
                            m1Var2.dismiss();
                            return;
                    }
                }
            };
            gVar.f48935o = r22;
            gVar.f48936p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f48925c;
        if (i10 == 3) {
            vy0Var = null;
        } else {
            vy0Var = new vy0(25, this, user2);
        }
        gVar.f48934n = vy0Var;
        return gVar;
    }

    public final int a0() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f48361i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f48364l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                i0(true, true);
            }
        }
    }

    public final void d0(boolean z10) {
        ArrayList arrayList = this.f48362j0;
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
            AndroidUtilities.runOnUIThread(new a1(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new a1(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new a1(this, 10));
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
        G0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f48374w0);
    }

    public final void e0() {
        HashSet hashSet = this.f48360h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f48369r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f48365n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f20185id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            dq dqVar = this.f48355c0;
                            callback2.run(Boolean.valueOf((dqVar == null || !dqVar.f25790a.f24097q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f20185id;
                        if (UserObject.areGiftsDisabled(j3)) {
                            new ad(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        r1 r1Var = new r1(getContext(), this.currentAccount, j3, c10, new b1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f48373v0;
                        r1Var.W((birthdayState == null || !birthdayState.contains(j3)) ? false : false);
                        r1Var.show();
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
        new ad(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void h0(boolean z10) {
        j1 j1Var = this.Y;
        boolean z11 = false;
        j1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f48360h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f48372u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f48372u0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        j1Var.b(hashSet.size(), true);
        j1Var.g(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        j1Var.setEnabled(z11);
    }

    public final void i0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: tg.m1.i0(boolean, boolean):void");
    }

    public final void j0(boolean z10, boolean z11) {
        int R;
        int R2;
        i0(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            qm0 qm0Var = this.d;
            if (i11 >= qm0Var.getChildCount()) {
                break;
            }
            View childAt = qm0Var.getChildAt(i11);
            if ((childAt instanceof xg.l) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f48359g0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    ug.g gVar = (ug.g) arrayList.get(R2);
                    xg.l lVar = (xg.l) childAt;
                    lVar.c(gVar.f48931k, z10);
                    TLRPC.Chat chat = gVar.f48926e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f48367p0.F(chat) > 200) {
                            f7 = 0.3f;
                        }
                        lVar.i(f7, z10);
                    } else {
                        lVar.i(1.0f, z10);
                    }
                    i12 = R;
                }
            }
            i11++;
        }
        if (z10) {
            this.f48367p0.q(0, i10);
            ug.h hVar = this.f48367p0;
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
    public final pm0 x(qm0 qm0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, false);
        this.f48367p0 = hVar;
        hVar.f48943s = true;
        return hVar;
    }
}
