package ug;

import ai.bd;
import ai.ga;
import ai.j2;
import ai.vc;
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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c20;
import org.telegram.ui.qn;
import w7.b6;
import w7.z5;
import yh.o1;
public class m1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static e1 J0;
    public c20 A0;
    public Utilities.Callback B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public zq E0;
    public zq F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public final int X;
    public final i1 Y;
    public final g1 Z;
    public final h1 f47710a0;
    public final f1 f47711b0;
    public final xp f47712c0;
    public final bd f47713d0;
    public final FrameLayout f47714e0;
    public final ArrayList f47715f0;
    public final ArrayList f47716g0;
    public final HashSet f47717h0;
    public final ArrayList f47718i0;
    public final ArrayList f47719j0;
    public final ArrayList f47720k0;
    public final HashMap f47721l0;
    public final ArrayList m0;
    public final LinkedHashMap f47722n0;
    public String f47723o0;
    public vg.h f47724p0;
    public int f47725q0;
    public final ArrayList f47726r0;
    public boolean f47727s0;
    public float f47728t0;
    public mb0 f47729u0;
    public final BirthdayController.BirthdayState f47730v0;
    public final p8.b f47731w0;
    public int f47732x0;
    public zq f47733y0;
    public String f47734z0;

    public m1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, d6 d6Var) {
        super(context, null, true, false, d6Var);
        int i12;
        float f7;
        boolean z10;
        this.f47715f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47716g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f47717h0 = hashSet;
        this.f47718i0 = new ArrayList();
        this.f47719j0 = new ArrayList();
        this.f47720k0 = new ArrayList();
        this.f47721l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f47722n0 = new LinkedHashMap();
        this.f47725q0 = AndroidUtilities.dp(120.0f);
        this.f47726r0 = new ArrayList();
        this.f47727s0 = false;
        this.f47731w0 = new p8.b(this, 8);
        this.f47732x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = h6.f21061h5;
        fixNavigationBar(h6.w0(i13, d6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f47730v0 = birthdayState;
        vg.h hVar = this.f47724p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f48386x = z10;
        }
        ?? cVar = new yg.c(getContext(), d6Var);
        this.f47711b0 = cVar;
        cVar.setOnCloseClickListener(new z0(this, 11));
        cVar.setText(A());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f47729u0 = new mb0(this, 2);
        g1 g1Var = new g1(this, getContext(), d6Var);
        this.Z = g1Var;
        g1Var.setBackgroundColor(getThemedColor(i13));
        g1Var.setOnSearchTextChange(new a1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        g1Var.f50154b.setHintText(LocaleController.getString(i12), false);
        h1 h1Var = new h1(this, getContext());
        this.f47710a0 = h1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, z5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(g1Var, z5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(h1Var, z5.f(1.0f, 55, i16, 0, i16, 0));
        bd bdVar = new bd(getContext(), d6Var, (jm0) null);
        this.f47713d0 = bdVar;
        bdVar.setClickable(true);
        bdVar.setOrientation(1);
        bdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        bdVar.setBackgroundColor(h6.w0(i13, d6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(h6.Z(getThemedColor(h6.f21079i6), 6, 6));
            xp xpVar = new xp(context, 24, d6Var);
            this.f47712c0 = xpVar;
            xpVar.b(h6.Oh, h6.f21098j7, h6.f21118k7);
            xpVar.setDrawUnchecked(true);
            xpVar.a(false, false);
            xpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(xpVar, z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(h6.f21096j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, z5.t(-2, -2, 16, 9, 0, 0, 0));
            b6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final m1 f47672b;

                {
                    this.f47672b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            xp xpVar2 = this.f47672b.f47712c0;
                            xpVar2.a(!xpVar2.f32458a.f24151q, true);
                            return;
                        default:
                            this.f47672b.e0();
                            return;
                    }
                }
            });
            bdVar.addView(linearLayout, z5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        i1 i1Var = new i1(this, getContext(), d6Var);
        this.Y = i1Var;
        if (i11 == 4) {
            bdVar.setAlpha(0.0f);
            bdVar.setVisibility(8);
        }
        i1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m1 f47672b;

            {
                this.f47672b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        xp xpVar2 = this.f47672b.f47712c0;
                        xpVar2.a(!xpVar2.f32458a.f24151q, true);
                        return;
                    default:
                        this.f47672b.e0();
                        return;
                }
            }
        });
        bdVar.addView(i1Var, z5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(bdVar, z5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f47714e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, z5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        vg.h hVar2 = this.f47724p0;
        jm0 jm0Var = this.d;
        hVar2.f48382n = arrayList;
        hVar2.f48381f = jm0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        jm0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new j1(this));
        this.d.setOnItemClickListener(new m4.s0(this, i11, d6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((am0) new i2.s(this, i11, 19));
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.f45951m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new k1(this));
        g1Var.setText("");
        g1Var.d.b(false);
        g1Var.b(false, hashSet, new z0(this, 12), null);
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
            r.j(i10, null, new a1(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        ga.y(i10, false).V();
    }

    public static void Q(m1 m1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = m1Var.f47720k0;
        arrayList.clear();
        m1Var.f47732x0 = -1;
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

    public static void R(m1 m1Var, int i10, d6 d6Var, int i11, View view, int i12) {
        long j10;
        boolean z10;
        boolean z11;
        float f7;
        z0 z0Var;
        bd bdVar = m1Var.f47713d0;
        g1 g1Var = m1Var.Z;
        ArrayList arrayList = m1Var.f47716g0;
        HashSet hashSet = m1Var.f47717h0;
        if (view instanceof q8) {
            if (i10 == 4) {
                c20 c20Var = m1Var.A0;
                if (c20Var != null) {
                    c20Var.run();
                    m1Var.dismiss();
                    return;
                }
                return;
            }
            f5.l(m1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new a1(m1Var, 2), new z0(m1Var, 9), false, false, m1Var.resourcesProvider).f20613a.show();
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
                Utilities.Callback callback = m1Var.B0;
                if (callback != null && gVar != null) {
                    int i14 = gVar.f48371i;
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
                    j10 = user.f20423id;
                } else {
                    j10 = -chat.f20276id;
                }
                long j11 = j10;
                if (i10 == 3) {
                    Utilities.Callback callback2 = m1Var.B0;
                    if (callback2 != null) {
                        callback2.run(Long.valueOf(j11));
                    }
                } else if (i10 == 1) {
                    if (g1Var != null) {
                        AndroidUtilities.hideKeyboard(g1Var.getEditText());
                    }
                    vc vcVar = new vc(m1Var.getContext(), d6Var, user, new z0(m1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        vcVar.makeAttached(m1Var.attachedFragment);
                    }
                    vcVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback22 = m1Var.D0;
                        if (callback22 != null) {
                            xp xpVar = m1Var.f47712c0;
                            if (xpVar == null || !xpVar.f32458a.f24151q) {
                                z12 = false;
                            }
                            callback22.run(Boolean.valueOf(z12), hashSet);
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
                    if (hashSet.contains(Long.valueOf(j11))) {
                        hashSet.remove(Long.valueOf(j11));
                    } else {
                        hashSet.add(Long.valueOf(j11));
                        m1Var.f47722n0.put(Long.valueOf(j11), user);
                    }
                    if (hashSet.size() == m1Var.a0() + 1) {
                        hashSet.remove(Long.valueOf(j11));
                        m1Var.g0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        bdVar.setVisibility(0);
                        ViewPropertyAnimator animate = bdVar.animate();
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
                            z0Var = new z0(m1Var, 1);
                        } else {
                            z0Var = null;
                        }
                        duration.withEndAction(z0Var).start();
                        vg.h hVar = m1Var.f47724p0;
                        boolean z13 = !z11;
                        if (hVar.f48387y != z13) {
                            hVar.f48387y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f48381f, (Utilities.Callback<View>) new vg.f(z13));
                        }
                    }
                    m1Var.X();
                    g1Var.b(true, hashSet, new z0(m1Var, 2), null);
                    m1Var.j0(true, true);
                    m1Var.Y();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new xc(m1Var.container, d6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    o1 o1Var = new o1(m1Var.getContext(), i11, j11, r.c(r.b(1, m1Var.f47726r0)), new a1(m1Var, 1));
                    BirthdayController.BirthdayState birthdayState = m1Var.f47730v0;
                    if (birthdayState == null || !birthdayState.contains(j11)) {
                        z12 = false;
                    }
                    o1Var.W(z12);
                    o1Var.show();
                }
            }
        }
    }

    public static void S(m1 m1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = m1Var.f47714e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            qc Q = new xc(frameLayout, m1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f29530j = 5000;
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
                alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.q(R.string.UnknownError, new xc(frameLayout, m1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void T(m1 m1Var, final TLRPC.User user, View view) {
        i80 F = i80.F(m1Var.container, m1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(m1Var) {
            public final m1 f47665b;

            {
                this.f47665b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47665b.f24882n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21556a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20423id);
                                    U.showAsSheet(new qn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20423id);
                            n2Var.presentFragment(new qn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47665b.f24882n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21556a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20423id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20423id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(m1Var) {
            public final m1 f47665b;

            {
                this.f47665b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47665b.f24882n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21556a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20423id);
                                    U.showAsSheet(new qn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20423id);
                            n2Var.presentFragment(new qn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47665b.f24882n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21556a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20423id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20423id);
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
        ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(updatebirthday, new j2(m1Var, userFull, tL_birthday2, 25), 1024);
        MessagesController.getInstance(m1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(m1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(m1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        m1Var.i0(true, true);
    }

    public static void V(m1 m1Var, String str) {
        if (m1Var.f47732x0 >= 0) {
            ConnectionsManager.getInstance(m1Var.currentAccount).cancelRequest(m1Var.f47732x0, true);
            m1Var.f47732x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f20322q = str;
        m1Var.f47732x0 = ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(tL_contacts_search, new ai.h(m1Var, 27));
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
        e1 e1Var = J0;
        if (e1Var != null) {
            return e1Var;
        }
        ?? m1Var = new m1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            m1Var.makeAttached(R);
        }
        R.showDialog(m1Var);
        J0 = m1Var;
        return m1Var;
    }

    @Override
    public final CharSequence A() {
        String str = this.f47734z0;
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
        f1 f1Var = this.f47711b0;
        f1Var.setTranslationY(max);
        float translationY = f1Var.getTranslationY() + f1Var.getMeasuredHeight();
        g1 g1Var = this.Z;
        g1Var.setTranslationY(translationY);
        float translationY2 = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.f47710a0;
        h1Var.setTranslationY(translationY2);
        int measuredHeight = g1Var.getMeasuredHeight() + f1Var.getMeasuredHeight();
        this.d.setTranslationY((h1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
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
            if (user != null && !user.bot && !UserObject.isService(user.f20423id)) {
                long j10 = user.f20423id;
                if (j10 != 0 && !this.C0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f20423id);
                    HashSet hashSet = this.f47717h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    vg.g c10 = vg.g.c(user, hashSet.contains(Long.valueOf(user.f20423id)));
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
        if (this.f47717h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f47727s0) {
                this.f47727s0 = false;
                AndroidUtilities.runOnUIThread(new z0(this, 4), 10L);
            }
        } else if (!this.f47727s0) {
            this.f47727s0 = true;
            AndroidUtilities.runOnUIThread(new z0(this, 3), 10L);
        }
    }

    public final void Y() {
        if (!TextUtils.isEmpty(this.f47723o0)) {
            this.f47723o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47731w0);
            i0(true, true);
        }
    }

    public final vg.g Z(vg.g gVar) {
        qg.n nVar;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f48368c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f20423id;
            ?? r22 = new View.OnClickListener(this) {
                public final m1 f47655b;

                {
                    this.f47655b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f47655b;
                            HashSet hashSet = m1Var.f47717h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f47655b;
                            HashSet hashSet2 = m1Var2.f47717h0;
                            hashSet2.add(Long.valueOf(j10));
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
                public final m1 f47655b;

                {
                    this.f47655b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f47655b;
                            HashSet hashSet = m1Var.f47717h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f47655b;
                            HashSet hashSet2 = m1Var2.f47717h0;
                            hashSet2.add(Long.valueOf(j10));
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
            gVar.f48377o = r22;
            gVar.f48378p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f48368c;
        if (i10 == 3) {
            nVar = null;
        } else {
            nVar = new qg.n(6, this, user2);
        }
        gVar.f48376n = nVar;
        return gVar;
    }

    public final int a0() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f47718i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f47721l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                i0(true, true);
            }
        }
    }

    public final void d0(boolean z10) {
        ArrayList arrayList = this.f47719j0;
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
            AndroidUtilities.runOnUIThread(new z0(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new z0(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new z0(this, 10));
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
        AndroidUtilities.cancelRunOnUIThread(this.f47731w0);
    }

    public final void e0() {
        HashSet hashSet = this.f47717h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f47726r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f47722n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f20423id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            xp xpVar = this.f47712c0;
                            callback2.run(Boolean.valueOf((xpVar == null || !xpVar.f32458a.f24151q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = r.c(r.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f20423id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new xc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        o1 o1Var = new o1(getContext(), this.currentAccount, j10, c10, new a1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f47730v0;
                        o1Var.W((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                        o1Var.show();
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
        i1 i1Var = this.Y;
        boolean z11 = false;
        i1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f47717h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47729u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47729u0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        i1Var.b(hashSet.size(), true);
        i1Var.g(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        i1Var.setEnabled(z11);
    }

    public final void i0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.m1.i0(boolean, boolean):void");
    }

    public final void j0(boolean z10, boolean z11) {
        int R;
        int R2;
        i0(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            jm0 jm0Var = this.d;
            if (i11 >= jm0Var.getChildCount()) {
                break;
            }
            View childAt = jm0Var.getChildAt(i11);
            if ((childAt instanceof yg.k) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f47716g0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    vg.g gVar = (vg.g) arrayList.get(R2);
                    yg.k kVar = (yg.k) childAt;
                    kVar.c(gVar.f48373k, z10);
                    TLRPC.Chat chat = gVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f47724p0.F(chat) > 200) {
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
            this.f47724p0.q(0, i10);
            vg.h hVar = this.f47724p0;
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
    public final im0 x(jm0 jm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, false);
        this.f47724p0 = hVar;
        hVar.f48384s = true;
        return hVar;
    }
}
