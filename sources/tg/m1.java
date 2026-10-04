package tg;

import ai.n8;
import ai.s5;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.i2;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o20;
import org.telegram.ui.py0;
import org.telegram.ui.v20;
import org.telegram.ui.yn;
import w7.b6;
import w7.z5;
import xh.q1;
import yh.i7;
import yh.t5;
public class m1 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public static f1 G0;
    public v20 A0;
    public i2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final j1 Y;
    public final h1 Z;
    public final i1 f47049a0;
    public final g1 f47050b0;
    public final qp f47051c0;
    public final o20 f47052d0;
    public final FrameLayout f47053e0;
    public final ArrayList f47054f0;
    public final ArrayList f47055g0;
    public final HashSet f47056h0;
    public final ArrayList f47057i0;
    public final ArrayList f47058j0;
    public final ArrayList f47059k0;
    public final HashMap f47060l0;
    public final ArrayList m0;
    public final LinkedHashMap f47061n0;
    public String f47062o0;
    public ug.h f47063p0;
    public int f47064q0;
    public final ArrayList f47065r0;
    public boolean f47066s0;
    public float f47067t0;
    public fb0 f47068u0;
    public final BirthdayController.BirthdayState f47069v0;
    public final pg.c1 f47070w0;
    public int f47071x0;
    public sq f47072y0;
    public String f47073z0;

    public m1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, d6 d6Var) {
        super(context, null, true, false, d6Var);
        int i12;
        float f7;
        boolean z10;
        this.f47054f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47055g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f47056h0 = hashSet;
        this.f47057i0 = new ArrayList();
        this.f47058j0 = new ArrayList();
        this.f47059k0 = new ArrayList();
        this.f47060l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f47061n0 = new LinkedHashMap();
        this.f47064q0 = AndroidUtilities.dp(120.0f);
        this.f47065r0 = new ArrayList();
        this.f47066s0 = false;
        this.f47070w0 = new pg.c1(this, 5);
        this.f47071x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = i6.f20894h5;
        fixNavigationBar(i6.v0(i13, d6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f47069v0 = birthdayState;
        ug.h hVar = this.f47063p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f47682x = z10;
        }
        ?? cVar = new xg.c(getContext(), d6Var);
        this.f47050b0 = cVar;
        cVar.setOnCloseClickListener(new a1(this, 11));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.f49845e.c(0.0f, false);
        this.f47068u0 = new fb0(this, 2);
        h1 h1Var = new h1(this, getContext(), d6Var);
        this.Z = h1Var;
        h1Var.setBackgroundColor(getThemedColor(i13));
        h1Var.setOnSearchTextChange(new b1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        h1Var.f49860b.setHintText(LocaleController.getString(i12), false);
        i1 i1Var = new i1(this, getContext());
        this.f47049a0 = i1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, z5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(h1Var, z5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(i1Var, z5.f(1.0f, 55, i16, 0, i16, 0));
        o20 o20Var = new o20(getContext(), d6Var, (zl0) null);
        this.f47052d0 = o20Var;
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(i6.v0(i13, d6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(i6.Y(getThemedColor(i6.f20913i6), 6, 6));
            qp qpVar = new qp(context, 24, d6Var);
            this.f47051c0 = qpVar;
            qpVar.b(i6.Oh, i6.f20932j7, i6.f20952k7);
            qpVar.setDrawUnchecked(true);
            qpVar.a(false, false);
            qpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(qpVar, z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(i6.f20930j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, z5.t(-2, -2, 16, 9, 0, 0, 0));
            b6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final m1 f47015b;

                {
                    this.f47015b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qp qpVar2 = this.f47015b.f47051c0;
                            qpVar2.a(!qpVar2.f30147a.f24098q, true);
                            return;
                        default:
                            this.f47015b.d0();
                            return;
                    }
                }
            });
            o20Var.addView(linearLayout, z5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        j1 j1Var = new j1(this, getContext(), d6Var);
        this.Y = j1Var;
        if (i11 == 4) {
            o20Var.setAlpha(0.0f);
            o20Var.setVisibility(8);
        }
        j1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m1 f47015b;

            {
                this.f47015b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        qp qpVar2 = this.f47015b.f47051c0;
                        qpVar2.a(!qpVar2.f30147a.f24098q, true);
                        return;
                    default:
                        this.f47015b.d0();
                        return;
                }
            }
        });
        o20Var.addView(j1Var, z5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(o20Var, z5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f47053e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, z5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        ug.h hVar2 = this.f47063p0;
        zl0 zl0Var = this.d;
        hVar2.f47678n = arrayList;
        hVar2.f47677f = zl0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        zl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new k1(this));
        this.d.setOnItemClickListener(new yt(this, i11, d6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((pl0) new i2.s(this, i11, 19));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(tr.h);
        jVar.C = false;
        jVar.f46570m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new l1(this));
        h1Var.setText("");
        h1Var.d.b(false);
        h1Var.b(false, hashSet, new a1(this, 12), null);
        cVar.setText(y());
        ya yaVar = this.f25307e;
        if (yaVar != null) {
            yaVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            s.j(i10, null, new b1(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        t5.y(i10, false).V();
    }

    public static void N(m1 m1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = m1Var.f47059k0;
        arrayList.clear();
        m1Var.f47071x0 = -1;
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
        m1Var.i0(true, true);
    }

    public static void O(m1 m1Var, int i10, d6 d6Var, int i11, View view) {
        long j3;
        boolean z10;
        boolean z11;
        float f7;
        a1 a1Var;
        o20 o20Var = m1Var.f47052d0;
        h1 h1Var = m1Var.Z;
        HashSet hashSet = m1Var.f47056h0;
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
            e5.m(m1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new b1(m1Var, 2), new a1(m1Var, 9), false, false, m1Var.resourcesProvider).f20378a.show();
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                i2 i2Var = m1Var.B0;
                if (i2Var != null) {
                    i2Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f20189id;
                } else {
                    j3 = -chat.f20042id;
                }
                long j10 = j3;
                if (i10 == 3) {
                    i2 i2Var2 = m1Var.B0;
                    if (i2Var2 != null) {
                        i2Var2.run(Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i10 == 1) {
                    if (h1Var != null) {
                        AndroidUtilities.hideKeyboard(h1Var.getEditText());
                    }
                    i7 i7Var = new i7(m1Var.getContext(), d6Var, user, new a1(m1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        i7Var.makeAttached(m1Var.attachedFragment);
                    }
                    i7Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = m1Var.D0;
                        if (callback2 != null) {
                            qp qpVar = m1Var.f47051c0;
                            callback2.run(Boolean.valueOf((qpVar == null || !qpVar.f30147a.f24098q) ? false : false), hashSet);
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
                        m1Var.f47061n0.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == m1Var.Y() + 1) {
                        hashSet.remove(Long.valueOf(j10));
                        m1Var.f0();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(tr.h).setDuration(320L);
                        if (!z11) {
                            a1Var = new a1(m1Var, 1);
                        } else {
                            a1Var = null;
                        }
                        duration.withEndAction(a1Var).start();
                        ug.h hVar = m1Var.f47063p0;
                        boolean z13 = !z11;
                        if (hVar.f47683y != z13) {
                            hVar.f47683y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f47677f, (Utilities.Callback<View>) new ug.f(z13));
                        }
                    }
                    m1Var.U();
                    h1Var.b(true, hashSet, new a1(m1Var, 2), null);
                    m1Var.i0(true, true);
                    m1Var.W();
                } else if (UserObject.areGiftsDisabled(j10)) {
                    new yc(m1Var.container, d6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                } else {
                    q1 q1Var = new q1(m1Var.getContext(), i11, j10, s.c(s.b(1, m1Var.f47065r0)), new b1(m1Var, 1));
                    BirthdayController.BirthdayState birthdayState = m1Var.f47069v0;
                    q1Var.T((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                    q1Var.show();
                }
            }
        }
    }

    public static void P(m1 m1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = m1Var.f47053e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            rc Q = new yc(frameLayout, m1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f30345j = 5000;
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
                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.q.p(R.string.UnknownError, new yc(frameLayout, m1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void Q(m1 m1Var, final TLRPC.User user, View view) {
        b80 F = b80.F(m1Var.container, m1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(m1Var) {
            public final m1 f47004b;

            {
                this.f47004b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47004b.f25309n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21354a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20189id);
                                    U.showAsSheet(new yn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20189id);
                            n2Var.presentFragment(new yn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47004b.f25309n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21354a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20189id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20189id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(m1Var) {
            public final m1 f47004b;

            {
                this.f47004b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47004b.f25309n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21354a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20189id);
                                    U.showAsSheet(new yn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20189id);
                            n2Var.presentFragment(new yn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47004b.f25309n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21354a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20189id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20189id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void R(m1 m1Var, TL_account.TL_birthday tL_birthday) {
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
        ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(updatebirthday, new s5(m1Var, userFull, tL_birthday2, 20), 1024);
        MessagesController.getInstance(m1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(m1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(m1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        m1Var.h0(true, true);
    }

    public static void S(m1 m1Var, String str) {
        if (m1Var.f47071x0 >= 0) {
            ConnectionsManager.getInstance(m1Var.currentAccount).cancelRequest(m1Var.f47071x0, true);
            m1Var.f47071x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f20088q = str;
        m1Var.f47071x0 = ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(tL_contacts_search, new n8(m1Var, 21));
    }

    public static boolean Z(Intent intent) {
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

    public static m1 e0(int i10, BirthdayController.BirthdayState birthdayState) {
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
    public final void B(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        g1 g1Var = this.f47050b0;
        g1Var.setTranslationY(max);
        float translationY = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.Z;
        h1Var.setTranslationY(translationY);
        float translationY2 = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.f47049a0;
        i1Var.setTranslationY(translationY2);
        int measuredHeight = h1Var.getMeasuredHeight() + g1Var.getMeasuredHeight();
        this.d.setTranslationY((i1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final int T(String str, ArrayList arrayList, ArrayList arrayList2) {
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
            if (user != null && !user.bot && !UserObject.isService(user.f20189id)) {
                long j3 = user.f20189id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f20189id);
                    HashSet hashSet = this.f47056h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    ug.g c10 = ug.g.c(user, hashSet.contains(Long.valueOf(user.f20189id)));
                    X(c10);
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

    public final void U() {
        int i10;
        if (this.f47056h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f47066s0) {
                this.f47066s0 = false;
                AndroidUtilities.runOnUIThread(new a1(this, 4), 10L);
            }
        } else if (!this.f47066s0) {
            this.f47066s0 = true;
            AndroidUtilities.runOnUIThread(new a1(this, 3), 10L);
        }
    }

    public final void W() {
        if (!TextUtils.isEmpty(this.f47062o0)) {
            this.f47062o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47070w0);
            h0(true, true);
        }
    }

    public final ug.g X(ug.g gVar) {
        py0 py0Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f47662c;
            if (user == null) {
                return gVar;
            }
            final long j3 = user.f20189id;
            ?? r22 = new View.OnClickListener(this) {
                public final m1 f46995b;

                {
                    this.f46995b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f46995b;
                            HashSet hashSet = m1Var.f47056h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f46995b;
                            HashSet hashSet2 = m1Var2.f47056h0;
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
                public final m1 f46995b;

                {
                    this.f46995b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f46995b;
                            HashSet hashSet = m1Var.f47056h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f46995b;
                            HashSet hashSet2 = m1Var2.f47056h0;
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
            gVar.f47672o = r22;
            gVar.f47673p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f47662c;
        if (i10 == 3) {
            py0Var = null;
        } else {
            py0Var = new py0(19, this, user2);
        }
        gVar.f47671n = py0Var;
        return gVar;
    }

    public final int Y() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f47057i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f47060l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f47058j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f47056h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f47065r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f47061n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f20189id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            qp qpVar = this.f47051c0;
                            callback2.run(Boolean.valueOf((qpVar == null || !qpVar.f30147a.f24098q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f20189id;
                        if (UserObject.areGiftsDisabled(j3)) {
                            new yc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        q1 q1Var = new q1(getContext(), this.currentAccount, j3, c10, new b1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f47069v0;
                        q1Var.T((birthdayState == null || !birthdayState.contains(j3)) ? false : false);
                        q1Var.show();
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
        AndroidUtilities.cancelRunOnUIThread(this.f47070w0);
    }

    public final void f0() {
        String string;
        if (this.X == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Y());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new yc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        j1 j1Var = this.Y;
        boolean z11 = false;
        j1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f47056h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47068u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47068u0, 0, 1, 33);
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

    public final void h0(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: tg.m1.h0(boolean, boolean):void");
    }

    public final void i0(boolean z10, boolean z11) {
        int R;
        int R2;
        h0(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            zl0 zl0Var = this.d;
            if (i10 >= zl0Var.getChildCount()) {
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt instanceof xg.l) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f47055g0;
                if (R2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = R;
                    }
                    ug.g gVar = (ug.g) arrayList.get(R2);
                    xg.l lVar = (xg.l) childAt;
                    lVar.c(gVar.f47668k, z10);
                    TLRPC.Chat chat = gVar.f47663e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f47063p0.F(chat) > 200) {
                            f7 = 0.3f;
                        }
                        lVar.i(f7, z10);
                    } else {
                        lVar.i(1.0f, z10);
                    }
                    i12 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f47063p0.q(0, i11);
            ug.h hVar = this.f47063p0;
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
    public final yl0 v(zl0 zl0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, false);
        this.f47063p0 = hVar;
        hVar.f47680s = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f47073z0;
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
