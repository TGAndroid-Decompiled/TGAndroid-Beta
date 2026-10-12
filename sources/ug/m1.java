package ug;

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
import bi.e5;
import bi.z7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.j2;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.bz0;
import org.telegram.ui.fo;
import org.telegram.ui.s20;
import org.telegram.ui.z20;
import w7.a6;
import yh.p1;
import zh.a7;
import zh.n5;
public class m1 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static f1 G0;
    public z20 A0;
    public j2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final j1 Y;
    public final h1 Z;
    public final i1 f46340a0;
    public final g1 f46341b0;
    public final aq f46342c0;
    public final s20 f46343d0;
    public final FrameLayout f46344e0;
    public final ArrayList f46345f0;
    public final ArrayList f46346g0;
    public final HashSet f46347h0;
    public final ArrayList f46348i0;
    public final ArrayList f46349j0;
    public final ArrayList f46350k0;
    public final HashMap f46351l0;
    public final ArrayList m0;
    public final LinkedHashMap f46352n0;
    public String f46353o0;
    public vg.h f46354p0;
    public int f46355q0;
    public final ArrayList f46356r0;
    public boolean f46357s0;
    public float f46358t0;
    public sb0 f46359u0;
    public final BirthdayController.BirthdayState f46360v0;
    public final m5 f46361w0;
    public int f46362x0;
    public cr f46363y0;
    public String f46364z0;

    public m1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, c6 c6Var) {
        super(context, null, true, false, c6Var);
        int i12;
        float f7;
        boolean z10;
        this.f46345f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f46346g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f46347h0 = hashSet;
        this.f46348i0 = new ArrayList();
        this.f46349j0 = new ArrayList();
        this.f46350k0 = new ArrayList();
        this.f46351l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f46352n0 = new LinkedHashMap();
        this.f46355q0 = AndroidUtilities.dp(120.0f);
        this.f46356r0 = new ArrayList();
        this.f46357s0 = false;
        this.f46361w0 = new m5(this, 9);
        this.f46362x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = g6.f19972h5;
        fixNavigationBar(g6.w0(i13, c6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f46360v0 = birthdayState;
        vg.h hVar = this.f46354p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f46994x = z10;
        }
        ?? cVar = new yg.c(getContext(), c6Var);
        this.f46341b0 = cVar;
        cVar.setOnCloseClickListener(new a1(this, 11));
        cVar.setText(A());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f46359u0 = new sb0(this, 2);
        h1 h1Var = new h1(this, getContext(), c6Var);
        this.Z = h1Var;
        h1Var.setBackgroundColor(getThemedColor(i13));
        h1Var.setOnSearchTextChange(new b1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        h1Var.f48768b.setHintText(LocaleController.getString(i12), false);
        i1 i1Var = new i1(this, getContext());
        this.f46340a0 = i1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, a6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(h1Var, a6.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(i1Var, a6.f(1.0f, 55, i16, 0, i16, 0));
        s20 s20Var = new s20(getContext(), c6Var, (mm0) null);
        this.f46343d0 = s20Var;
        s20Var.setClickable(true);
        s20Var.setOrientation(1);
        s20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        s20Var.setBackgroundColor(g6.w0(i13, c6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(g6.Z(getThemedColor(g6.f19990i6), 6, 6));
            aq aqVar = new aq(context, 24, c6Var);
            this.f46342c0 = aqVar;
            aqVar.b(g6.Oh, g6.f20009j7, g6.f20029k7);
            aqVar.setDrawUnchecked(true);
            aqVar.a(false, false);
            aqVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(aqVar, a6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(g6.f20007j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, a6.t(-2, -2, 16, 9, 0, 0, 0));
            w7.c6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final m1 f46307b;

                {
                    this.f46307b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            aq aqVar2 = this.f46307b.f46342c0;
                            aqVar2.a(!aqVar2.f23604a.f23092q, true);
                            return;
                        default:
                            this.f46307b.e0();
                            return;
                    }
                }
            });
            s20Var.addView(linearLayout, a6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        j1 j1Var = new j1(this, getContext(), c6Var);
        this.Y = j1Var;
        if (i11 == 4) {
            s20Var.setAlpha(0.0f);
            s20Var.setVisibility(8);
        }
        j1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m1 f46307b;

            {
                this.f46307b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        aq aqVar2 = this.f46307b.f46342c0;
                        aqVar2.a(!aqVar2.f23604a.f23092q, true);
                        return;
                    default:
                        this.f46307b.e0();
                        return;
                }
            }
        });
        s20Var.addView(j1Var, a6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(s20Var, a6.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f46344e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, a6.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        vg.h hVar2 = this.f46354p0;
        mm0 mm0Var = this.d;
        hVar2.f46990n = arrayList;
        hVar2.f46989f = mm0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        mm0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new k1(this));
        this.d.setOnItemClickListener(new m4.t0(this, i11, c6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((dm0) new i2.r(this, i11, 19));
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(es.h);
        kVar.C = false;
        kVar.f44872m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new l1(this));
        h1Var.setText("");
        h1Var.d.b(false);
        h1Var.b(false, hashSet, new a1(this, 12), null);
        cVar.setText(A());
        za zaVar = this.e;
        if (zaVar != null) {
            zaVar.setTitle(A());
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
        n5.y(i10, false).V();
    }

    public static void Q(m1 m1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = m1Var.f46350k0;
        arrayList.clear();
        m1Var.f46362x0 = -1;
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
        long j10;
        boolean z10;
        boolean z11;
        float f7;
        a1 a1Var;
        s20 s20Var = m1Var.f46343d0;
        h1 h1Var = m1Var.Z;
        HashSet hashSet = m1Var.f46347h0;
        if (view instanceof r8) {
            if (i10 == 4) {
                z20 z20Var = m1Var.A0;
                if (z20Var != null) {
                    z20Var.run();
                    m1Var.dismiss();
                    return;
                }
                return;
            }
            g5.l(m1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new b1(m1Var, 2), new a1(m1Var, 9), false, false, m1Var.resourcesProvider).f20838a.show();
        } else if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                j2 j2Var = m1Var.B0;
                if (j2Var != null) {
                    j2Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f19363id;
                } else {
                    j10 = -chat.f19216id;
                }
                long j11 = j10;
                if (i10 == 3) {
                    j2 j2Var2 = m1Var.B0;
                    if (j2Var2 != null) {
                        j2Var2.run(Long.valueOf(j11));
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
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback2 = m1Var.D0;
                        if (callback2 != null) {
                            aq aqVar = m1Var.f46342c0;
                            if (aqVar == null || !aqVar.f23604a.f23092q) {
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
                    if (hashSet.contains(Long.valueOf(j11))) {
                        hashSet.remove(Long.valueOf(j11));
                    } else {
                        hashSet.add(Long.valueOf(j11));
                        m1Var.f46352n0.put(Long.valueOf(j11), user);
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
                        s20Var.setVisibility(0);
                        ViewPropertyAnimator animate = s20Var.animate();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(es.h).setDuration(320L);
                        if (!z11) {
                            a1Var = new a1(m1Var, 1);
                        } else {
                            a1Var = null;
                        }
                        duration.withEndAction(a1Var).start();
                        vg.h hVar = m1Var.f46354p0;
                        boolean z13 = !z11;
                        if (hVar.f46995y != z13) {
                            hVar.f46995y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f46989f, (Utilities.Callback<View>) new vg.f(z13));
                        }
                    }
                    m1Var.X();
                    h1Var.b(true, hashSet, new a1(m1Var, 2), null);
                    m1Var.j0(true, true);
                    m1Var.Y();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new zc(m1Var.container, c6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    p1 p1Var = new p1(m1Var.getContext(), i11, j11, s.c(s.b(1, m1Var.f46356r0)), new b1(m1Var, 1));
                    BirthdayController.BirthdayState birthdayState = m1Var.f46360v0;
                    if (birthdayState == null || !birthdayState.contains(j11)) {
                        z12 = false;
                    }
                    p1Var.W(z12);
                    p1Var.show();
                }
            }
        }
    }

    public static void S(m1 m1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = m1Var.f46344e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            sc Q = new zc(frameLayout, m1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f29102j = 5000;
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
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.q.r(R.string.UnknownError, new zc(frameLayout, m1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void T(m1 m1Var, final TLRPC.User user, View view) {
        m80 F = m80.F(m1Var.container, m1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(m1Var) {
            public final m1 f46300b;

            {
                this.f46300b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            m2 m2Var = this.f46300b.f24345n;
                            if (m2Var == null) {
                                m2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f20469a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f19363id);
                                    U.showAsSheet(new fo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f19363id);
                            m2Var.presentFragment(new fo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            m2 m2Var2 = this.f46300b.f24345n;
                            if (m2Var2 == null) {
                                m2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f20469a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f19363id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f19363id);
                            m2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(m1Var) {
            public final m1 f46300b;

            {
                this.f46300b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            m2 m2Var = this.f46300b.f24345n;
                            if (m2Var == null) {
                                m2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f20469a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f19363id);
                                    U.showAsSheet(new fo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f19363id);
                            m2Var.presentFragment(new fo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            m2 m2Var2 = this.f46300b.f24345n;
                            if (m2Var2 == null) {
                                m2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f20469a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f19363id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f19363id);
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
        ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(updatebirthday, new e5(m1Var, userFull, tL_birthday2, 20), 1024);
        MessagesController.getInstance(m1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(m1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(m1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        m1Var.i0(true, true);
    }

    public static void V(m1 m1Var, String str) {
        if (m1Var.f46362x0 >= 0) {
            ConnectionsManager.getInstance(m1Var.currentAccount).cancelRequest(m1Var.f46362x0, true);
            m1Var.f46362x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f19262q = str;
        m1Var.f46362x0 = ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(tL_contacts_search, new z7(m1Var, 21));
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
        String str = this.f46364z0;
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
        g1 g1Var = this.f46341b0;
        g1Var.setTranslationY(max);
        float translationY = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.Z;
        h1Var.setTranslationY(translationY);
        float translationY2 = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.f46340a0;
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
            if (user != null && !user.bot && !UserObject.isService(user.f19363id)) {
                long j10 = user.f19363id;
                if (j10 != 0 && !this.C0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f19363id);
                    HashSet hashSet = this.f46347h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    vg.g c10 = vg.g.c(user, hashSet.contains(Long.valueOf(user.f19363id)));
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
        if (this.f46347h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f46357s0) {
                this.f46357s0 = false;
                AndroidUtilities.runOnUIThread(new a1(this, 4), 10L);
            }
        } else if (!this.f46357s0) {
            this.f46357s0 = true;
            AndroidUtilities.runOnUIThread(new a1(this, 3), 10L);
        }
    }

    public final void Y() {
        if (!TextUtils.isEmpty(this.f46353o0)) {
            this.f46353o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f46361w0);
            i0(true, true);
        }
    }

    public final vg.g Z(vg.g gVar) {
        bz0 bz0Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f46976c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f19363id;
            ?? r22 = new View.OnClickListener(this) {
                public final m1 f46291b;

                {
                    this.f46291b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f46291b;
                            HashSet hashSet = m1Var.f46347h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f46291b;
                            HashSet hashSet2 = m1Var2.f46347h0;
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
                public final m1 f46291b;

                {
                    this.f46291b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f46291b;
                            HashSet hashSet = m1Var.f46347h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f46291b;
                            HashSet hashSet2 = m1Var2.f46347h0;
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
            gVar.f46985o = r22;
            gVar.f46986p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f46976c;
        if (i10 == 3) {
            bz0Var = null;
        } else {
            bz0Var = new bz0(25, this, user2);
        }
        gVar.f46984n = bz0Var;
        return gVar;
    }

    public final int a0() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f46348i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f46351l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                i0(true, true);
            }
        }
    }

    public final void d0(boolean z10) {
        ArrayList arrayList = this.f46349j0;
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
        AndroidUtilities.cancelRunOnUIThread(this.f46361w0);
    }

    public final void e0() {
        HashSet hashSet = this.f46347h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f46356r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f46352n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f19363id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            aq aqVar = this.f46342c0;
                            callback2.run(Boolean.valueOf((aqVar == null || !aqVar.f23604a.f23092q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f19363id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new zc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        p1 p1Var = new p1(getContext(), this.currentAccount, j10, c10, new b1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f46360v0;
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
        HashSet hashSet = this.f46347h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f46359u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f46359u0, 0, 1, 33);
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
            mm0 mm0Var = this.d;
            if (i11 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i11);
            if ((childAt instanceof yg.l) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f46346g0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    vg.g gVar = (vg.g) arrayList.get(R2);
                    yg.l lVar = (yg.l) childAt;
                    lVar.c(gVar.f46981k, z10);
                    TLRPC.Chat chat = gVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f46354p0.F(chat) > 200) {
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
            this.f46354p0.q(0, i10);
            vg.h hVar = this.f46354p0;
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
    public final lm0 x(mm0 mm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, false);
        this.f46354p0 = hVar;
        hVar.f46992s = true;
        return hVar;
    }
}
