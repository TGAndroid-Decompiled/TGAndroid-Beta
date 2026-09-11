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
import bi.c5;
import bi.v7;
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
import org.telegram.messenger.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.i2;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.o20;
import org.telegram.ui.v20;
import org.telegram.ui.wy0;
import w7.x5;
import w7.z5;
import yh.p1;
import zh.g7;
import zh.s5;
public class n1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static g1 G0;
    public v20 A0;
    public i2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final k1 Y;
    public final i1 Z;
    public final j1 f47157a0;
    public final h1 f47158b0;
    public final mp f47159c0;
    public final o20 f47160d0;
    public final FrameLayout f47161e0;
    public final ArrayList f47162f0;
    public final ArrayList f47163g0;
    public final HashSet f47164h0;
    public final ArrayList f47165i0;
    public final ArrayList f47166j0;
    public final ArrayList f47167k0;
    public final HashMap f47168l0;
    public final ArrayList m0;
    public final LinkedHashMap f47169n0;
    public String f47170o0;
    public vg.g f47171p0;
    public int f47172q0;
    public final ArrayList f47173r0;
    public boolean f47174s0;
    public float f47175t0;
    public sa0 f47176u0;
    public final BirthdayController.BirthdayState f47177v0;
    public final rg.b0 f47178w0;
    public int f47179x0;
    public oq f47180y0;
    public String f47181z0;

    public n1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, f6 f6Var) {
        super(context, null, true, false, f6Var);
        int i12;
        float f7;
        boolean z10;
        this.f47162f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47163g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f47164h0 = hashSet;
        this.f47165i0 = new ArrayList();
        this.f47166j0 = new ArrayList();
        this.f47167k0 = new ArrayList();
        this.f47168l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f47169n0 = new LinkedHashMap();
        this.f47172q0 = AndroidUtilities.dp(120.0f);
        this.f47173r0 = new ArrayList();
        this.f47174s0 = false;
        this.f47178w0 = new rg.b0(this, 5);
        this.f47179x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = j6.f20734h5;
        fixNavigationBar(j6.v0(i13, f6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f47177v0 = birthdayState;
        vg.g gVar = this.f47171p0;
        if (gVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.f47829x = z10;
        }
        ?? cVar = new yg.c(getContext(), f6Var);
        this.f47158b0 = cVar;
        cVar.setOnCloseClickListener(new b1(this, 11));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.f50165e.c(0.0f, false);
        this.f47176u0 = new sa0(this, 2);
        i1 i1Var = new i1(this, getContext(), f6Var);
        this.Z = i1Var;
        i1Var.setBackgroundColor(getThemedColor(i13));
        i1Var.setOnSearchTextChange(new c1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        i1Var.f50180b.setHintText(LocaleController.getString(i12), false);
        j1 j1Var = new j1(this, getContext());
        this.f47157a0 = j1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, x5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(i1Var, x5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(j1Var, x5.f(1.0f, 55, i16, 0, i16, 0));
        o20 o20Var = new o20(getContext(), f6Var, (ll0) null);
        this.f47160d0 = o20Var;
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(j6.v0(i13, f6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(j6.Y(getThemedColor(j6.f20753i6), 6, 6));
            mp mpVar = new mp(context, 24, f6Var);
            this.f47159c0 = mpVar;
            mpVar.b(j6.Oh, j6.f20772j7, j6.f20792k7);
            mpVar.setDrawUnchecked(true);
            mpVar.a(false, false);
            mpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(mpVar, x5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(j6.f20770j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, x5.t(-2, -2, 16, 9, 0, 0, 0));
            z5.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final n1 f47125b;

                {
                    this.f47125b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            mp mpVar2 = this.f47125b.f47159c0;
                            mpVar2.a(!mpVar2.f28477a.f23907q, true);
                            return;
                        default:
                            this.f47125b.d0();
                            return;
                    }
                }
            });
            o20Var.addView(linearLayout, x5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        k1 k1Var = new k1(this, getContext(), f6Var);
        this.Y = k1Var;
        if (i11 == 4) {
            o20Var.setAlpha(0.0f);
            o20Var.setVisibility(8);
        }
        k1Var.setOnClickListener(new View.OnClickListener(this) {
            public final n1 f47125b;

            {
                this.f47125b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        mp mpVar2 = this.f47125b.f47159c0;
                        mpVar2.a(!mpVar2.f28477a.f23907q, true);
                        return;
                    default:
                        this.f47125b.d0();
                        return;
                }
            }
        });
        o20Var.addView(k1Var, x5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(o20Var, x5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f47161e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, x5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        vg.g gVar2 = this.f47171p0;
        ll0 ll0Var = this.d;
        gVar2.f47825n = arrayList;
        gVar2.f47824f = ll0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        ll0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new l1(this));
        this.d.setOnItemClickListener(new tt(this, i11, f6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((cl0) new i2.t(this, i11, 18));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(pr.h);
        jVar.C = false;
        jVar.f45777m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new m1(this));
        i1Var.setText("");
        i1Var.d.b(false);
        i1Var.b(false, hashSet, new b1(this, 12), null);
        cVar.setText(y());
        xa xaVar = this.f24647e;
        if (xaVar != null) {
            xaVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            t.j(i10, null, new c1(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        s5.y(i10, false).V();
    }

    public static void P(n1 n1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = n1Var.f47167k0;
        arrayList.clear();
        n1Var.f47179x0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(n1Var.currentAccount);
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
        n1Var.i0(true, true);
    }

    public static void Q(n1 n1Var, int i10, f6 f6Var, int i11, View view) {
        long j3;
        boolean z10;
        boolean z11;
        float f7;
        b1 b1Var;
        o20 o20Var = n1Var.f47160d0;
        i1 i1Var = n1Var.Z;
        HashSet hashSet = n1Var.f47164h0;
        if (view instanceof r8) {
            if (i10 == 4) {
                v20 v20Var = n1Var.A0;
                if (v20Var != null) {
                    v20Var.run();
                    n1Var.dismiss();
                    return;
                }
                return;
            }
            e5.m(n1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new c1(n1Var, 2), new b1(n1Var, 9), false, false, n1Var.resourcesProvider).f20204a.show();
        } else if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                i2 i2Var = n1Var.B0;
                if (i2Var != null) {
                    i2Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f20016id;
                } else {
                    j3 = -chat.f19869id;
                }
                long j10 = j3;
                if (i10 == 3) {
                    i2 i2Var2 = n1Var.B0;
                    if (i2Var2 != null) {
                        i2Var2.run(Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i10 == 1) {
                    if (i1Var != null) {
                        AndroidUtilities.hideKeyboard(i1Var.getEditText());
                    }
                    g7 g7Var = new g7(n1Var.getContext(), f6Var, user, new b1(n1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        g7Var.makeAttached(n1Var.attachedFragment);
                    }
                    g7Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = n1Var.D0;
                        if (callback2 != null) {
                            mp mpVar = n1Var.f47159c0;
                            callback2.run(Boolean.valueOf((mpVar == null || !mpVar.f28477a.f23907q) ? false : false), hashSet);
                            n1Var.D0 = null;
                        }
                        n1Var.dismiss();
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
                        n1Var.f47169n0.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == n1Var.Z() + 1) {
                        hashSet.remove(Long.valueOf(j10));
                        n1Var.f0();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(pr.h).setDuration(320L);
                        if (!z11) {
                            b1Var = new b1(n1Var, 1);
                        } else {
                            b1Var = null;
                        }
                        duration.withEndAction(b1Var).start();
                        vg.g gVar = n1Var.f47171p0;
                        boolean z13 = !z11;
                        if (gVar.f47830y != z13) {
                            gVar.f47830y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) gVar.f47824f, (e2.h) new m4.n0(3, z13));
                        }
                    }
                    n1Var.W();
                    i1Var.b(true, hashSet, new b1(n1Var, 2), null);
                    n1Var.i0(true, true);
                    n1Var.X();
                } else if (UserObject.areGiftsDisabled(j10)) {
                    new yc(n1Var.container, f6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                } else {
                    p1 p1Var = new p1(n1Var.getContext(), i11, j10, t.c(t.b(1, n1Var.f47173r0)), new c1(n1Var, 1));
                    BirthdayController.BirthdayState birthdayState = n1Var.f47177v0;
                    p1Var.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                    p1Var.show();
                }
            }
        }
    }

    public static void R(n1 n1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = n1Var.f47161e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            qc Q = new yc(frameLayout, n1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f29679j = 5000;
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
            MessagesStorage.getInstance(n1Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (n1Var.getContext() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n1Var.getContext(), 0, n1Var.resourcesProvider);
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                i2.g.B(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        w1.o(R.string.UnknownError, new yc(frameLayout, n1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(n1 n1Var, final TLRPC.User user, View view) {
        n70 F = n70.F(n1Var.container, n1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(n1Var) {
            public final n1 f47114b;

            {
                this.f47114b = n1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47114b.f24649n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21142a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20016id);
                                    U.showAsSheet(new co(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20016id);
                            n2Var.presentFragment(new co(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47114b.f24649n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21142a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20016id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20016id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(n1Var) {
            public final n1 f47114b;

            {
                this.f47114b = n1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f47114b.f24649n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f21142a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f20016id);
                                    U.showAsSheet(new co(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f20016id);
                            n2Var.presentFragment(new co(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f47114b.f24649n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f21142a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f20016id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f20016id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void T(n1 n1Var, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(n1Var.currentAccount).getUserFull(UserConfig.getInstance(n1Var.currentAccount).getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(updatebirthday, new c5(n1Var, userFull, tL_birthday2, 20), 1024);
        MessagesController.getInstance(n1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(n1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(n1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        n1Var.h0(true, true);
    }

    public static void U(n1 n1Var, String str) {
        if (n1Var.f47179x0 >= 0) {
            ConnectionsManager.getInstance(n1Var.currentAccount).cancelRequest(n1Var.f47179x0, true);
            n1Var.f47179x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f19915q = str;
        n1Var.f47179x0 = ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(tL_contacts_search, new v7(n1Var, 23));
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

    public static n1 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        n2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        g1 g1Var = G0;
        if (g1Var != null) {
            return g1Var;
        }
        ?? n1Var = new n1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            n1Var.makeAttached(R);
        }
        R.showDialog(n1Var);
        G0 = n1Var;
        return n1Var;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        h1 h1Var = this.f47158b0;
        h1Var.setTranslationY(max);
        float translationY = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.Z;
        i1Var.setTranslationY(translationY);
        float translationY2 = i1Var.getTranslationY() + i1Var.getMeasuredHeight();
        j1 j1Var = this.f47157a0;
        j1Var.setTranslationY(translationY2);
        int measuredHeight = i1Var.getMeasuredHeight() + h1Var.getMeasuredHeight();
        this.d.setTranslationY((j1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
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
            if (user != null && !user.bot && !UserObject.isService(user.f20016id)) {
                long j3 = user.f20016id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f20016id);
                    HashSet hashSet = this.f47164h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    vg.f c10 = vg.f.c(user, hashSet.contains(Long.valueOf(user.f20016id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(vg.f.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f47164h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f47174s0) {
                this.f47174s0 = false;
                AndroidUtilities.runOnUIThread(new b1(this, 4), 10L);
            }
        } else if (!this.f47174s0) {
            this.f47174s0 = true;
            AndroidUtilities.runOnUIThread(new b1(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f47170o0)) {
            this.f47170o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47178w0);
            h0(true, true);
        }
    }

    public final vg.f Y(vg.f fVar) {
        wy0 wy0Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = fVar.f47809c;
            if (user == null) {
                return fVar;
            }
            final long j3 = user.f20016id;
            ?? r22 = new View.OnClickListener(this) {
                public final n1 f47105b;

                {
                    this.f47105b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            n1 n1Var = this.f47105b;
                            HashSet hashSet = n1Var.f47164h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = n1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                n1Var.D0 = null;
                            }
                            n1Var.dismiss();
                            return;
                        default:
                            n1 n1Var2 = this.f47105b;
                            HashSet hashSet2 = n1Var2.f47164h0;
                            hashSet2.add(Long.valueOf(j3));
                            Utilities.Callback2 callback22 = n1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                n1Var2.D0 = null;
                            }
                            n1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final n1 f47105b;

                {
                    this.f47105b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            n1 n1Var = this.f47105b;
                            HashSet hashSet = n1Var.f47164h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = n1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                n1Var.D0 = null;
                            }
                            n1Var.dismiss();
                            return;
                        default:
                            n1 n1Var2 = this.f47105b;
                            HashSet hashSet2 = n1Var2.f47164h0;
                            hashSet2.add(Long.valueOf(j3));
                            Utilities.Callback2 callback22 = n1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                n1Var2.D0 = null;
                            }
                            n1Var2.dismiss();
                            return;
                    }
                }
            };
            fVar.f47819o = r22;
            fVar.f47820p = r32;
            return fVar;
        }
        TLRPC.User user2 = fVar.f47809c;
        if (i10 == 3) {
            wy0Var = null;
        } else {
            wy0Var = new wy0(19, this, user2);
        }
        fVar.f47818n = wy0Var;
        return fVar;
    }

    public final int Z() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f47165i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f47168l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f47166j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f47164h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f47173r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f47169n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f20016id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            mp mpVar = this.f47159c0;
                            callback2.run(Boolean.valueOf((mpVar == null || !mpVar.f28477a.f23907q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = t.c(t.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f20016id;
                        if (UserObject.areGiftsDisabled(j3)) {
                            new yc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        p1 p1Var = new p1(getContext(), this.currentAccount, j3, c10, new c1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f47177v0;
                        p1Var.V((birthdayState == null || !birthdayState.contains(j3)) ? false : false);
                        p1Var.show();
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
            AndroidUtilities.runOnUIThread(new b1(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new b1(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new b1(this, 10));
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
        AndroidUtilities.cancelRunOnUIThread(this.f47178w0);
    }

    public final void f0() {
        String string;
        if (this.X == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Z());
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
        k1 k1Var = this.Y;
        boolean z11 = false;
        k1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f47164h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47176u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f47176u0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        k1Var.b(hashSet.size(), true);
        k1Var.g(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        k1Var.setEnabled(z11);
    }

    public final void h0(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: ug.n1.h0(boolean, boolean):void");
    }

    public final void i0(boolean z10, boolean z11) {
        int R;
        int R2;
        h0(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            ll0 ll0Var = this.d;
            if (i10 >= ll0Var.getChildCount()) {
                break;
            }
            View childAt = ll0Var.getChildAt(i10);
            if ((childAt instanceof yg.l) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f47163g0;
                if (R2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = R;
                    }
                    vg.f fVar = (vg.f) arrayList.get(R2);
                    yg.l lVar = (yg.l) childAt;
                    lVar.c(fVar.f47815k, z10);
                    TLRPC.Chat chat = fVar.f47810e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f47171p0.F(chat) > 200) {
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
            this.f47171p0.q(0, i11);
            vg.g gVar = this.f47171p0;
            gVar.q(i12, gVar.h() - i12);
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
    public final kl0 v(ll0 ll0Var) {
        vg.g gVar = new vg.g(getContext(), this.resourcesProvider, false);
        this.f47171p0 = gVar;
        gVar.f47827s = true;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f47181z0;
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
