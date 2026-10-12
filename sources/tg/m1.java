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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.k2;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.o20;
import org.telegram.ui.v20;
import org.telegram.ui.xy0;
import w7.w5;
import w7.y5;
import xh.q1;
import yh.a7;
import yh.n5;
public class m1 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static f1 G0;
    public v20 A0;
    public k2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final j1 Y;
    public final h1 Z;
    public final i1 f48594a0;
    public final g1 f48595b0;
    public final fq f48596c0;
    public final o20 f48597d0;
    public final FrameLayout f48598e0;
    public final ArrayList f48599f0;
    public final ArrayList f48600g0;
    public final HashSet f48601h0;
    public final ArrayList f48602i0;
    public final ArrayList f48603j0;
    public final ArrayList f48604k0;
    public final HashMap f48605l0;
    public final ArrayList m0;
    public final LinkedHashMap f48606n0;
    public String f48607o0;
    public ug.h f48608p0;
    public int f48609q0;
    public final ArrayList f48610r0;
    public boolean f48611s0;
    public float f48612t0;
    public xb0 f48613u0;
    public final BirthdayController.BirthdayState f48614v0;
    public final p4.t0 f48615w0;
    public int f48616x0;
    public hr f48617y0;
    public String f48618z0;

    public m1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, c6 c6Var) {
        super(context, null, true, false, c6Var);
        int i12;
        float f7;
        boolean z10;
        this.f48599f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f48600g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f48601h0 = hashSet;
        this.f48602i0 = new ArrayList();
        this.f48603j0 = new ArrayList();
        this.f48604k0 = new ArrayList();
        this.f48605l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f48606n0 = new LinkedHashMap();
        this.f48609q0 = AndroidUtilities.dp(120.0f);
        this.f48610r0 = new ArrayList();
        this.f48611s0 = false;
        this.f48615w0 = new p4.t0(this, 8);
        this.f48616x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = h6.f20631h5;
        fixNavigationBar(h6.w0(i13, c6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f48614v0 = birthdayState;
        ug.h hVar = this.f48608p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f49183x = z10;
        }
        ?? cVar = new xg.c(getContext(), c6Var);
        this.f48595b0 = cVar;
        cVar.setOnCloseClickListener(new a1(this, 11));
        cVar.setText(A());
        cVar.setCloseImageVisible(false);
        cVar.f51365e.c(0.0f, false);
        this.f48613u0 = new xb0(this, 2);
        h1 h1Var = new h1(this, getContext(), c6Var);
        this.Z = h1Var;
        h1Var.setBackgroundColor(getThemedColor(i13));
        h1Var.setOnSearchTextChange(new b1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        h1Var.f51380b.setHintText(LocaleController.getString(i12), false);
        i1 i1Var = new i1(this, getContext());
        this.f48594a0 = i1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(h1Var, w5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(i1Var, w5.f(1.0f, 55, i16, 0, i16, 0));
        o20 o20Var = new o20(getContext(), c6Var, (wm0) null);
        this.f48597d0 = o20Var;
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(h6.w0(i13, c6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(h6.Z(getThemedColor(h6.f20651i6), 6, 6));
            fq fqVar = new fq(context, 24, c6Var);
            this.f48596c0 = fqVar;
            fqVar.b(h6.Oh, h6.f20670j7, h6.f20689k7);
            fqVar.setDrawUnchecked(true);
            fqVar.a(false, false);
            fqVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(fqVar, w5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(h6.f20668j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, w5.t(-2, -2, 16, 9, 0, 0, 0));
            y5.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final m1 f48562b;

                {
                    this.f48562b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            fq fqVar2 = this.f48562b.f48596c0;
                            fqVar2.a(!fqVar2.f26152a.f23875q, true);
                            return;
                        default:
                            this.f48562b.e0();
                            return;
                    }
                }
            });
            o20Var.addView(linearLayout, w5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        j1 j1Var = new j1(this, getContext(), c6Var);
        this.Y = j1Var;
        if (i11 == 4) {
            o20Var.setAlpha(0.0f);
            o20Var.setVisibility(8);
        }
        j1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m1 f48562b;

            {
                this.f48562b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        fq fqVar2 = this.f48562b.f48596c0;
                        fqVar2.a(!fqVar2.f26152a.f23875q, true);
                        return;
                    default:
                        this.f48562b.e0();
                        return;
                }
            }
        });
        o20Var.addView(j1Var, w5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(o20Var, w5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f48598e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, w5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        ug.h hVar2 = this.f48608p0;
        wm0 wm0Var = this.d;
        hVar2.f49179n = arrayList;
        hVar2.f49178f = wm0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        wm0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new k1(this));
        this.d.setOnItemClickListener(new ou(this, i11, c6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((nm0) new i2.s(this, i11, 19));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(js.h);
        jVar.C = false;
        jVar.f47937m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new l1(this));
        h1Var.setText("");
        h1Var.d.b(false);
        h1Var.b(false, hashSet, new a1(this, 12), null);
        cVar.setText(A());
        za zaVar = this.f25287e;
        if (zaVar != null) {
            zaVar.setTitle(A());
        }
        h0(false);
        c0(false);
        d0(false);
        j0(false, true);
        if (i11 == 0 || i11 == 2) {
            r.j(i10, null, new b1(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        n5.y(i10, false).V();
    }

    public static void Q(m1 m1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = m1Var.f48604k0;
        arrayList.clear();
        m1Var.f48616x0 = -1;
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

    public static void R(m1 m1Var, int i10, c6 c6Var, int i11, View view) {
        long j3;
        boolean z10;
        boolean z11;
        float f7;
        a1 a1Var;
        o20 o20Var = m1Var.f48597d0;
        h1 h1Var = m1Var.Z;
        HashSet hashSet = m1Var.f48601h0;
        if (view instanceof r8) {
            if (i10 == 4) {
                v20 v20Var = m1Var.A0;
                if (v20Var != null) {
                    v20Var.run();
                    m1Var.dismiss();
                    return;
                }
                return;
            }
            g5.l(m1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new b1(m1Var, 2), new a1(m1Var, 9), false, false, m1Var.resourcesProvider).f21485a.show();
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
                    j3 = user.f19950id;
                } else {
                    j3 = -chat.f19803id;
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
                    a7 a7Var = new a7(m1Var.getContext(), c6Var, user, new a1(m1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        a7Var.makeAttached(m1Var.attachedFragment);
                    }
                    a7Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = m1Var.D0;
                        if (callback2 != null) {
                            fq fqVar = m1Var.f48596c0;
                            if (fqVar == null || !fqVar.f26152a.f23875q) {
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
                        m1Var.f48606n0.put(Long.valueOf(j10), user);
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
                        o20Var.setVisibility(0);
                        ViewPropertyAnimator animate = o20Var.animate();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(js.h).setDuration(320L);
                        if (!z11) {
                            a1Var = new a1(m1Var, 1);
                        } else {
                            a1Var = null;
                        }
                        duration.withEndAction(a1Var).start();
                        ug.h hVar = m1Var.f48608p0;
                        boolean z13 = !z11;
                        if (hVar.f49184y != z13) {
                            hVar.f49184y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f49178f, (Utilities.Callback<View>) new ug.f(z13));
                        }
                    }
                    m1Var.X();
                    h1Var.b(true, hashSet, new a1(m1Var, 2), null);
                    m1Var.j0(true, true);
                    m1Var.Y();
                } else if (UserObject.areGiftsDisabled(j10)) {
                    new zc(m1Var.container, c6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                } else {
                    q1 q1Var = new q1(m1Var.getContext(), i11, j10, r.c(r.b(1, m1Var.f48610r0)), new b1(m1Var, 1));
                    BirthdayController.BirthdayState birthdayState = m1Var.f48614v0;
                    if (birthdayState == null || !birthdayState.contains(j10)) {
                        z12 = false;
                    }
                    q1Var.W(z12);
                    q1Var.show();
                }
            }
        }
    }

    public static void S(m1 m1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = m1Var.f48598e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            sc Q = new zc(frameLayout, m1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f30536j = 5000;
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
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.v0.q(R.string.UnknownError, new zc(frameLayout, m1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void T(m1 m1Var, final TLRPC.User user, View view) {
        s80 F = s80.F(m1Var.container, m1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(m1Var) {
            public final m1 f48551b;

            {
                this.f48551b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            m2 m2Var = this.f48551b.f25289n;
                            if (m2Var == null) {
                                m2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21088a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f19950id);
                                    U.showAsSheet(new eo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f19950id);
                            m2Var.presentFragment(new eo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            m2 m2Var2 = this.f48551b.f25289n;
                            if (m2Var2 == null) {
                                m2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21088a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f19950id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f19950id);
                            m2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(m1Var) {
            public final m1 f48551b;

            {
                this.f48551b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            m2 m2Var = this.f48551b.f25289n;
                            if (m2Var == null) {
                                m2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21088a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f19950id);
                                    U.showAsSheet(new eo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f19950id);
                            m2Var.presentFragment(new eo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            m2 m2Var2 = this.f48551b.f25289n;
                            if (m2Var2 == null) {
                                m2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21088a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f19950id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f19950id);
                            m2Var2.presentFragment(new ProfileActivity(bundle4, null));
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
        if (m1Var.f48616x0 >= 0) {
            ConnectionsManager.getInstance(m1Var.currentAccount).cancelRequest(m1Var.f48616x0, true);
            m1Var.f48616x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f19849q = str;
        m1Var.f48616x0 = ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(tL_contacts_search, new o8(m1Var, 21));
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
        m2 R = LaunchActivity.R();
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
    public final CharSequence A() {
        String str = this.f48618z0;
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
        g1 g1Var = this.f48595b0;
        g1Var.setTranslationY(max);
        float translationY = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.Z;
        h1Var.setTranslationY(translationY);
        float translationY2 = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.f48594a0;
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
            if (user != null && !user.bot && !UserObject.isService(user.f19950id)) {
                long j3 = user.f19950id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f19950id);
                    HashSet hashSet = this.f48601h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    ug.g c10 = ug.g.c(user, hashSet.contains(Long.valueOf(user.f19950id)));
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
        if (this.f48601h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f48611s0) {
                this.f48611s0 = false;
                AndroidUtilities.runOnUIThread(new a1(this, 4), 10L);
            }
        } else if (!this.f48611s0) {
            this.f48611s0 = true;
            AndroidUtilities.runOnUIThread(new a1(this, 3), 10L);
        }
    }

    public final void Y() {
        if (!TextUtils.isEmpty(this.f48607o0)) {
            this.f48607o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f48615w0);
            i0(true, true);
        }
    }

    public final ug.g Z(ug.g gVar) {
        xy0 xy0Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f49163c;
            if (user == null) {
                return gVar;
            }
            final long j3 = user.f19950id;
            ?? r22 = new View.OnClickListener(this) {
                public final m1 f48542b;

                {
                    this.f48542b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f48542b;
                            HashSet hashSet = m1Var.f48601h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f48542b;
                            HashSet hashSet2 = m1Var2.f48601h0;
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
                public final m1 f48542b;

                {
                    this.f48542b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f48542b;
                            HashSet hashSet = m1Var.f48601h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f48542b;
                            HashSet hashSet2 = m1Var2.f48601h0;
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
            gVar.f49173o = r22;
            gVar.f49174p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f49163c;
        if (i10 == 3) {
            xy0Var = null;
        } else {
            xy0Var = new xy0(25, this, user2);
        }
        gVar.f49172n = xy0Var;
        return gVar;
    }

    public final int a0() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f48602i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f48605l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                i0(true, true);
            }
        }
    }

    public final void d0(boolean z10) {
        ArrayList arrayList = this.f48603j0;
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
        AndroidUtilities.cancelRunOnUIThread(this.f48615w0);
    }

    public final void e0() {
        HashSet hashSet = this.f48601h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f48610r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f48606n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f19950id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            fq fqVar = this.f48596c0;
                            callback2.run(Boolean.valueOf((fqVar == null || !fqVar.f26152a.f23875q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = r.c(r.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f19950id;
                        if (UserObject.areGiftsDisabled(j3)) {
                            new zc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        q1 q1Var = new q1(getContext(), this.currentAccount, j3, c10, new b1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f48614v0;
                        q1Var.W((birthdayState == null || !birthdayState.contains(j3)) ? false : false);
                        q1Var.show();
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
        new zc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
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
        HashSet hashSet = this.f48601h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f48613u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f48613u0, 0, 1, 33);
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
            wm0 wm0Var = this.d;
            if (i11 >= wm0Var.getChildCount()) {
                break;
            }
            View childAt = wm0Var.getChildAt(i11);
            if ((childAt instanceof xg.l) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f48600g0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    ug.g gVar = (ug.g) arrayList.get(R2);
                    xg.l lVar = (xg.l) childAt;
                    lVar.c(gVar.f49169k, z10);
                    TLRPC.Chat chat = gVar.f49164e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f48608p0.F(chat) > 200) {
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
            this.f48608p0.q(0, i10);
            ug.h hVar = this.f48608p0;
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
    public final vm0 x(wm0 wm0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, false);
        this.f48608p0 = hVar;
        hVar.f49181s = true;
        return hVar;
    }
}
