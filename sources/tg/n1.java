package tg;

import ai.m8;
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
import org.telegram.messenger.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
import org.telegram.ui.q20;
import org.telegram.ui.x20;
import org.telegram.ui.xy0;
import w7.x5;
import w7.z5;
import xh.q1;
import yh.j7;
import yh.v5;
public class n1 extends za implements NotificationCenter.NotificationCenterDelegate {
    public static g1 G0;
    public x20 A0;
    public h2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final k1 Y;
    public final i1 Z;
    public final j1 f43197a0;
    public final h1 f43198b0;
    public final np f43199c0;
    public final q20 f43200d0;
    public final FrameLayout f43201e0;
    public final ArrayList f43202f0;
    public final ArrayList f43203g0;
    public final HashSet f43204h0;
    public final ArrayList f43205i0;
    public final ArrayList f43206j0;
    public final ArrayList f43207k0;
    public final HashMap f43208l0;
    public final ArrayList m0;
    public final LinkedHashMap f43209n0;
    public String f43210o0;
    public ug.g f43211p0;
    public int f43212q0;
    public final ArrayList f43213r0;
    public boolean f43214s0;
    public float f43215t0;
    public ra0 f43216u0;
    public final BirthdayController.BirthdayState f43217v0;
    public final qg.b0 f43218w0;
    public int f43219x0;
    public pq f43220y0;
    public String f43221z0;

    public n1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, f6 f6Var) {
        super(context, null, true, false, f6Var);
        int i12;
        float f7;
        boolean z10;
        this.f43202f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43203g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f43204h0 = hashSet;
        this.f43205i0 = new ArrayList();
        this.f43206j0 = new ArrayList();
        this.f43207k0 = new ArrayList();
        this.f43208l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f43209n0 = new LinkedHashMap();
        this.f43212q0 = AndroidUtilities.dp(120.0f);
        this.f43213r0 = new ArrayList();
        this.f43214s0 = false;
        this.f43218w0 = new qg.b0(this, 4);
        this.f43219x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = j6.f18933h5;
        fixNavigationBar(j6.v0(i13, f6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f43217v0 = birthdayState;
        ug.g gVar = this.f43211p0;
        if (gVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.f43764x = z10;
        }
        ?? cVar = new xg.c(getContext(), f6Var);
        this.f43198b0 = cVar;
        cVar.setOnCloseClickListener(new b1(this, 11));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f43216u0 = new ra0(this, 2);
        i1 i1Var = new i1(this, getContext(), f6Var);
        this.Z = i1Var;
        i1Var.setBackgroundColor(getThemedColor(i13));
        i1Var.setOnSearchTextChange(new c1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        i1Var.f45796b.setHintText(LocaleController.getString(i12), false);
        j1 j1Var = new j1(this, getContext());
        this.f43197a0 = j1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, x5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(i1Var, x5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(j1Var, x5.f(1.0f, 55, i16, 0, i16, 0));
        q20 q20Var = new q20(getContext(), f6Var, (ml0) null);
        this.f43200d0 = q20Var;
        q20Var.setClickable(true);
        q20Var.setOrientation(1);
        q20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        q20Var.setBackgroundColor(j6.v0(i13, f6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(j6.Y(getThemedColor(j6.f18952i6), 6, 6));
            np npVar = new np(context, 24, f6Var);
            this.f43199c0 = npVar;
            npVar.b(j6.Oh, j6.f18971j7, j6.f18991k7);
            npVar.setDrawUnchecked(true);
            npVar.a(false, false);
            npVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(npVar, x5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(j6.f18969j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, x5.t(-2, -2, 16, 9, 0, 0, 0));
            z5.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final n1 f43163b;

                {
                    this.f43163b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            np npVar2 = this.f43163b.f43199c0;
                            npVar2.a(!npVar2.f26508a.f21982q, true);
                            return;
                        default:
                            this.f43163b.d0();
                            return;
                    }
                }
            });
            q20Var.addView(linearLayout, x5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        k1 k1Var = new k1(this, getContext(), f6Var);
        this.Y = k1Var;
        if (i11 == 4) {
            q20Var.setAlpha(0.0f);
            q20Var.setVisibility(8);
        }
        k1Var.setOnClickListener(new View.OnClickListener(this) {
            public final n1 f43163b;

            {
                this.f43163b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        np npVar2 = this.f43163b.f43199c0;
                        npVar2.a(!npVar2.f26508a.f21982q, true);
                        return;
                    default:
                        this.f43163b.d0();
                        return;
                }
            }
        });
        q20Var.addView(k1Var, x5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(q20Var, x5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f43201e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, x5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        ug.g gVar2 = this.f43211p0;
        ml0 ml0Var = this.d;
        gVar2.f43760n = arrayList;
        gVar2.f43759f = ml0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        ml0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new l1(this));
        this.d.setOnItemClickListener(new vt(this, i11, f6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((dl0) new i2.s(this, i11, 18));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(qr.h);
        jVar.C = false;
        jVar.f42732m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new m1(this));
        i1Var.setText("");
        i1Var.d.b(false);
        i1Var.b(false, hashSet, new b1(this, 12), null);
        cVar.setText(y());
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle(y());
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
        v5.y(i10, false).V();
    }

    public static void P(n1 n1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = n1Var.f43207k0;
        arrayList.clear();
        n1Var.f43219x0 = -1;
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
        q20 q20Var = n1Var.f43200d0;
        i1 i1Var = n1Var.Z;
        HashSet hashSet = n1Var.f43204h0;
        if (view instanceof r8) {
            if (i10 == 4) {
                x20 x20Var = n1Var.A0;
                if (x20Var != null) {
                    x20Var.run();
                    n1Var.dismiss();
                    return;
                }
                return;
            }
            c5.m(n1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new c1(n1Var, 2), new b1(n1Var, 9), false, false, n1Var.resourcesProvider).f18470a.show();
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                h2 h2Var = n1Var.B0;
                if (h2Var != null) {
                    h2Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f18268id;
                } else {
                    j3 = -chat.f18121id;
                }
                long j10 = j3;
                if (i10 == 3) {
                    h2 h2Var2 = n1Var.B0;
                    if (h2Var2 != null) {
                        h2Var2.run(Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i10 == 1) {
                    if (i1Var != null) {
                        AndroidUtilities.hideKeyboard(i1Var.getEditText());
                    }
                    j7 j7Var = new j7(n1Var.getContext(), f6Var, user, new b1(n1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        j7Var.makeAttached(n1Var.attachedFragment);
                    }
                    j7Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = n1Var.D0;
                        if (callback2 != null) {
                            np npVar = n1Var.f43199c0;
                            callback2.run(Boolean.valueOf((npVar == null || !npVar.f26508a.f21982q) ? false : false), hashSet);
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
                        n1Var.f43209n0.put(Long.valueOf(j10), user);
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
                        q20Var.setVisibility(0);
                        ViewPropertyAnimator animate = q20Var.animate();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(qr.h).setDuration(320L);
                        if (!z11) {
                            b1Var = new b1(n1Var, 1);
                        } else {
                            b1Var = null;
                        }
                        duration.withEndAction(b1Var).start();
                        ug.g gVar = n1Var.f43211p0;
                        boolean z13 = !z11;
                        if (gVar.f43765y != z13) {
                            gVar.f43765y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) gVar.f43759f, (e2.h) new m4.o0(3, z13));
                        }
                    }
                    n1Var.W();
                    i1Var.b(true, hashSet, new b1(n1Var, 2), null);
                    n1Var.i0(true, true);
                    n1Var.X();
                } else if (UserObject.areGiftsDisabled(j10)) {
                    new vc(n1Var.container, f6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                } else {
                    q1 q1Var = new q1(n1Var.getContext(), i11, j10, t.c(t.b(1, n1Var.f43213r0)), new c1(n1Var, 1));
                    BirthdayController.BirthdayState birthdayState = n1Var.f43217v0;
                    q1Var.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                    q1Var.show();
                }
            }
        }
    }

    public static void R(n1 n1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = n1Var.f43201e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            oc Q = new vc(frameLayout, n1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f26702j = 5000;
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
                alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                hg.k0.A(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        w1.o(R.string.UnknownError, new vc(frameLayout, n1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(n1 n1Var, final TLRPC.User user, View view) {
        n70 F = n70.F(n1Var.container, n1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(n1Var) {
            public final n1 f43156b;

            {
                this.f43156b = n1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            o2 o2Var = this.f43156b.f30451n;
                            if (o2Var == null) {
                                o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f19397a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f18268id);
                                    U.showAsSheet(new bo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f18268id);
                            o2Var.presentFragment(new bo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            o2 o2Var2 = this.f43156b.f30451n;
                            if (o2Var2 == null) {
                                o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f19397a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f18268id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f18268id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(n1Var) {
            public final n1 f43156b;

            {
                this.f43156b = n1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            o2 o2Var = this.f43156b.f30451n;
                            if (o2Var == null) {
                                o2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f19397a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f18268id);
                                    U.showAsSheet(new bo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f18268id);
                            o2Var.presentFragment(new bo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            o2 o2Var2 = this.f43156b.f30451n;
                            if (o2Var2 == null) {
                                o2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f19397a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f18268id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f18268id);
                            o2Var2.presentFragment(new ProfileActivity(bundle4, null));
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
        ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(updatebirthday, new t5(n1Var, userFull, tL_birthday2, 20), 1024);
        MessagesController.getInstance(n1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(n1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(n1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        n1Var.h0(true, true);
    }

    public static void U(n1 n1Var, String str) {
        if (n1Var.f43219x0 >= 0) {
            ConnectionsManager.getInstance(n1Var.currentAccount).cancelRequest(n1Var.f43219x0, true);
            n1Var.f43219x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f18167q = str;
        n1Var.f43219x0 = ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(tL_contacts_search, new m8(n1Var, 21));
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
        o2 R = LaunchActivity.R();
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
    public final void B(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        h1 h1Var = this.f43198b0;
        h1Var.setTranslationY(max);
        float translationY = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.Z;
        i1Var.setTranslationY(translationY);
        float translationY2 = i1Var.getTranslationY() + i1Var.getMeasuredHeight();
        j1 j1Var = this.f43197a0;
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
            if (user != null && !user.bot && !UserObject.isService(user.f18268id)) {
                long j3 = user.f18268id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f18268id);
                    HashSet hashSet = this.f43204h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    ug.f c10 = ug.f.c(user, hashSet.contains(Long.valueOf(user.f18268id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(ug.f.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f43204h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f43214s0) {
                this.f43214s0 = false;
                AndroidUtilities.runOnUIThread(new b1(this, 4), 10L);
            }
        } else if (!this.f43214s0) {
            this.f43214s0 = true;
            AndroidUtilities.runOnUIThread(new b1(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f43210o0)) {
            this.f43210o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f43218w0);
            h0(true, true);
        }
    }

    public final ug.f Y(ug.f fVar) {
        xy0 xy0Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = fVar.f43746c;
            if (user == null) {
                return fVar;
            }
            final long j3 = user.f18268id;
            ?? r22 = new View.OnClickListener(this) {
                public final n1 f43147b;

                {
                    this.f43147b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            n1 n1Var = this.f43147b;
                            HashSet hashSet = n1Var.f43204h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = n1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                n1Var.D0 = null;
                            }
                            n1Var.dismiss();
                            return;
                        default:
                            n1 n1Var2 = this.f43147b;
                            HashSet hashSet2 = n1Var2.f43204h0;
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
                public final n1 f43147b;

                {
                    this.f43147b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            n1 n1Var = this.f43147b;
                            HashSet hashSet = n1Var.f43204h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = n1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                n1Var.D0 = null;
                            }
                            n1Var.dismiss();
                            return;
                        default:
                            n1 n1Var2 = this.f43147b;
                            HashSet hashSet2 = n1Var2.f43204h0;
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
            fVar.f43755o = r22;
            fVar.f43756p = r32;
            return fVar;
        }
        TLRPC.User user2 = fVar.f43746c;
        if (i10 == 3) {
            xy0Var = null;
        } else {
            xy0Var = new xy0(19, this, user2);
        }
        fVar.f43754n = xy0Var;
        return fVar;
    }

    public final int Z() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f43205i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f43208l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f43206j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f43204h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f43213r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f43209n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f18268id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            np npVar = this.f43199c0;
                            callback2.run(Boolean.valueOf((npVar == null || !npVar.f26508a.f21982q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = t.c(t.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f18268id;
                        if (UserObject.areGiftsDisabled(j3)) {
                            new vc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        q1 q1Var = new q1(getContext(), this.currentAccount, j3, c10, new c1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f43217v0;
                        q1Var.V((birthdayState == null || !birthdayState.contains(j3)) ? false : false);
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
        AndroidUtilities.cancelRunOnUIThread(this.f43218w0);
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
        k1 k1Var = this.Y;
        boolean z11 = false;
        k1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f43204h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f43216u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f43216u0, 0, 1, 33);
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
        throw new UnsupportedOperationException("Method not decompiled: tg.n1.h0(boolean, boolean):void");
    }

    public final void i0(boolean z10, boolean z11) {
        int S;
        int S2;
        h0(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            ml0 ml0Var = this.d;
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if ((childAt instanceof xg.l) && (S = RecyclerView.S(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f43203g0;
                if (S2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = S;
                    }
                    ug.f fVar = (ug.f) arrayList.get(S2);
                    xg.l lVar = (xg.l) childAt;
                    lVar.c(fVar.f43751k, z10);
                    TLRPC.Chat chat = fVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f43211p0.F(chat) > 200) {
                            f7 = 0.3f;
                        }
                        lVar.i(f7, z10);
                    } else {
                        lVar.i(1.0f, z10);
                    }
                    i12 = S;
                }
            }
            i10++;
        }
        if (z10) {
            this.f43211p0.q(0, i11);
            ug.g gVar = this.f43211p0;
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
    public final ll0 v(ml0 ml0Var) {
        ug.g gVar = new ug.g(getContext(), this.resourcesProvider, false);
        this.f43211p0 = gVar;
        gVar.f43762s = true;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f43221z0;
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
