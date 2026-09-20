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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.za0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o20;
import org.telegram.ui.v20;
import org.telegram.ui.vy0;
import org.telegram.ui.zn;
import w7.b6;
import w7.y5;
import xh.r1;
import yh.h7;
import yh.u5;
public class m1 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public static f1 G0;
    public v20 A0;
    public h2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final j1 Y;
    public final h1 Z;
    public final i1 f43451a0;
    public final g1 f43452b0;
    public final np f43453c0;
    public final o20 f43454d0;
    public final FrameLayout f43455e0;
    public final ArrayList f43456f0;
    public final ArrayList f43457g0;
    public final HashSet f43458h0;
    public final ArrayList f43459i0;
    public final ArrayList f43460j0;
    public final ArrayList f43461k0;
    public final HashMap f43462l0;
    public final ArrayList m0;
    public final LinkedHashMap f43463n0;
    public String f43464o0;
    public ug.g f43465p0;
    public int f43466q0;
    public final ArrayList f43467r0;
    public boolean f43468s0;
    public float f43469t0;
    public za0 f43470u0;
    public final BirthdayController.BirthdayState f43471v0;
    public final p8.b f43472w0;
    public int f43473x0;
    public pq f43474y0;
    public String f43475z0;

    public m1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, f6 f6Var) {
        super(context, null, true, false, f6Var);
        int i12;
        float f7;
        boolean z10;
        this.f43456f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43457g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f43458h0 = hashSet;
        this.f43459i0 = new ArrayList();
        this.f43460j0 = new ArrayList();
        this.f43461k0 = new ArrayList();
        this.f43462l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f43463n0 = new LinkedHashMap();
        this.f43466q0 = AndroidUtilities.dp(120.0f);
        this.f43467r0 = new ArrayList();
        this.f43468s0 = false;
        this.f43472w0 = new p8.b(this, 6);
        this.f43473x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = j6.f19165h5;
        fixNavigationBar(j6.v0(i13, f6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f43471v0 = birthdayState;
        ug.g gVar = this.f43465p0;
        if (gVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.f44043x = z10;
        }
        ?? cVar = new xg.c(getContext(), f6Var);
        this.f43452b0 = cVar;
        cVar.setOnCloseClickListener(new a1(this, 11));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f43470u0 = new za0(this, 2);
        h1 h1Var = new h1(this, getContext(), f6Var);
        this.Z = h1Var;
        h1Var.setBackgroundColor(getThemedColor(i13));
        h1Var.setOnSearchTextChange(new b1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        h1Var.f46071b.setHintText(LocaleController.getString(i12), false);
        i1 i1Var = new i1(this, getContext());
        this.f43451a0 = i1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, y5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(h1Var, y5.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(i1Var, y5.f(1.0f, 55, i16, 0, i16, 0));
        o20 o20Var = new o20(getContext(), f6Var, (vl0) null);
        this.f43454d0 = o20Var;
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(j6.v0(i13, f6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(j6.Y(getThemedColor(j6.f19184i6), 6, 6));
            np npVar = new np(context, 24, f6Var);
            this.f43453c0 = npVar;
            npVar.b(j6.Oh, j6.f19203j7, j6.f19223k7);
            npVar.setDrawUnchecked(true);
            npVar.a(false, false);
            npVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(npVar, y5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(j6.f19201j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, y5.t(-2, -2, 16, 9, 0, 0, 0));
            b6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final m1 f43420b;

                {
                    this.f43420b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            np npVar2 = this.f43420b.f43453c0;
                            npVar2.a(!npVar2.f26710a.f22193q, true);
                            return;
                        default:
                            this.f43420b.d0();
                            return;
                    }
                }
            });
            o20Var.addView(linearLayout, y5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        j1 j1Var = new j1(this, getContext(), f6Var);
        this.Y = j1Var;
        if (i11 == 4) {
            o20Var.setAlpha(0.0f);
            o20Var.setVisibility(8);
        }
        j1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m1 f43420b;

            {
                this.f43420b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        np npVar2 = this.f43420b.f43453c0;
                        npVar2.a(!npVar2.f26710a.f22193q, true);
                        return;
                    default:
                        this.f43420b.d0();
                        return;
                }
            }
        });
        o20Var.addView(j1Var, y5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(o20Var, y5.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f43455e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, y5.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        ug.g gVar2 = this.f43465p0;
        vl0 vl0Var = this.d;
        gVar2.f44039n = arrayList;
        gVar2.f44038f = vl0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        vl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new k1(this));
        this.d.setOnItemClickListener(new vt(this, i11, f6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((ml0) new i2.s(this, i11, 18));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(qr.h);
        jVar.C = false;
        jVar.f43009m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new l1(this));
        h1Var.setText("");
        h1Var.d.b(false);
        h1Var.b(false, hashSet, new a1(this, 12), null);
        cVar.setText(y());
        wa waVar = this.e;
        if (waVar != null) {
            waVar.setTitle(y());
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
        u5.y(i10, false).V();
    }

    public static void P(m1 m1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = m1Var.f43461k0;
        arrayList.clear();
        m1Var.f43473x0 = -1;
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

    public static void Q(m1 m1Var, int i10, f6 f6Var, int i11, View view) {
        long j3;
        boolean z10;
        boolean z11;
        float f7;
        a1 a1Var;
        o20 o20Var = m1Var.f43454d0;
        h1 h1Var = m1Var.Z;
        HashSet hashSet = m1Var.f43458h0;
        if (view instanceof s8) {
            if (i10 == 4) {
                v20 v20Var = m1Var.A0;
                if (v20Var != null) {
                    v20Var.run();
                    m1Var.dismiss();
                    return;
                }
                return;
            }
            d5.m(m1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new b1(m1Var, 2), new a1(m1Var, 9), false, false, m1Var.resourcesProvider).f18659a.show();
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                h2 h2Var = m1Var.B0;
                if (h2Var != null) {
                    h2Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f18475id;
                } else {
                    j3 = -chat.f18328id;
                }
                long j10 = j3;
                if (i10 == 3) {
                    h2 h2Var2 = m1Var.B0;
                    if (h2Var2 != null) {
                        h2Var2.run(Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i10 == 1) {
                    if (h1Var != null) {
                        AndroidUtilities.hideKeyboard(h1Var.getEditText());
                    }
                    h7 h7Var = new h7(m1Var.getContext(), f6Var, user, new a1(m1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        h7Var.makeAttached(m1Var.attachedFragment);
                    }
                    h7Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = m1Var.D0;
                        if (callback2 != null) {
                            np npVar = m1Var.f43453c0;
                            callback2.run(Boolean.valueOf((npVar == null || !npVar.f26710a.f22193q) ? false : false), hashSet);
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
                        m1Var.f43463n0.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == m1Var.Z() + 1) {
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(qr.h).setDuration(320L);
                        if (!z11) {
                            a1Var = new a1(m1Var, 1);
                        } else {
                            a1Var = null;
                        }
                        duration.withEndAction(a1Var).start();
                        ug.g gVar = m1Var.f43465p0;
                        boolean z13 = !z11;
                        if (gVar.f44044y != z13) {
                            gVar.f44044y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) gVar.f44038f, (e2.h) new m4.n0(3, z13));
                        }
                    }
                    m1Var.W();
                    h1Var.b(true, hashSet, new a1(m1Var, 2), null);
                    m1Var.i0(true, true);
                    m1Var.X();
                } else if (UserObject.areGiftsDisabled(j10)) {
                    new xc(m1Var.container, f6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                } else {
                    r1 r1Var = new r1(m1Var.getContext(), i11, j10, s.c(s.b(1, m1Var.f43467r0)), new b1(m1Var, 1));
                    BirthdayController.BirthdayState birthdayState = m1Var.f43471v0;
                    r1Var.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                    r1Var.show();
                }
            }
        }
    }

    public static void R(m1 m1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = m1Var.f43455e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            pc Q = new xc(frameLayout, m1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f27252j = 5000;
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
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.l0.o(R.string.UnknownError, new xc(frameLayout, m1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(m1 m1Var, final TLRPC.User user, View view) {
        v70 F = v70.F(m1Var.container, m1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(m1Var) {
            public final m1 f43410b;

            {
                this.f43410b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f43410b.f22638n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f19577a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f18475id);
                                    U.showAsSheet(new zn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f18475id);
                            n2Var.presentFragment(new zn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f43410b.f22638n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f19577a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f18475id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f18475id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(m1Var) {
            public final m1 f43410b;

            {
                this.f43410b = m1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.f43410b.f22638n;
                            if (n2Var == null) {
                                n2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f19577a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f18475id);
                                    U.showAsSheet(new zn(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f18475id);
                            n2Var.presentFragment(new zn(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.f43410b.f22638n;
                            if (n2Var2 == null) {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f19577a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f18475id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f18475id);
                            n2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void T(m1 m1Var, TL_account.TL_birthday tL_birthday) {
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
        m1Var.h0(true, true);
    }

    public static void U(m1 m1Var, String str) {
        if (m1Var.f43473x0 >= 0) {
            ConnectionsManager.getInstance(m1Var.currentAccount).cancelRequest(m1Var.f43473x0, true);
            m1Var.f43473x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f18374q = str;
        m1Var.f43473x0 = ConnectionsManager.getInstance(m1Var.currentAccount).sendRequest(tL_contacts_search, new m8(m1Var, 21));
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
        g1 g1Var = this.f43452b0;
        g1Var.setTranslationY(max);
        float translationY = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.Z;
        h1Var.setTranslationY(translationY);
        float translationY2 = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.f43451a0;
        i1Var.setTranslationY(translationY2);
        int measuredHeight = h1Var.getMeasuredHeight() + g1Var.getMeasuredHeight();
        this.d.setTranslationY((i1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
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
            if (user != null && !user.bot && !UserObject.isService(user.f18475id)) {
                long j3 = user.f18475id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f18475id);
                    HashSet hashSet = this.f43458h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    ug.f c10 = ug.f.c(user, hashSet.contains(Long.valueOf(user.f18475id)));
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
        if (this.f43458h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f43468s0) {
                this.f43468s0 = false;
                AndroidUtilities.runOnUIThread(new a1(this, 4), 10L);
            }
        } else if (!this.f43468s0) {
            this.f43468s0 = true;
            AndroidUtilities.runOnUIThread(new a1(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f43464o0)) {
            this.f43464o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f43472w0);
            h0(true, true);
        }
    }

    public final ug.f Y(ug.f fVar) {
        vy0 vy0Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = fVar.f44025c;
            if (user == null) {
                return fVar;
            }
            final long j3 = user.f18475id;
            ?? r22 = new View.OnClickListener(this) {
                public final m1 f43401b;

                {
                    this.f43401b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f43401b;
                            HashSet hashSet = m1Var.f43458h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f43401b;
                            HashSet hashSet2 = m1Var2.f43458h0;
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
                public final m1 f43401b;

                {
                    this.f43401b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            m1 m1Var = this.f43401b;
                            HashSet hashSet = m1Var.f43458h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = m1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                m1Var.D0 = null;
                            }
                            m1Var.dismiss();
                            return;
                        default:
                            m1 m1Var2 = this.f43401b;
                            HashSet hashSet2 = m1Var2.f43458h0;
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
            fVar.f44034o = r22;
            fVar.f44035p = r32;
            return fVar;
        }
        TLRPC.User user2 = fVar.f44025c;
        if (i10 == 3) {
            vy0Var = null;
        } else {
            vy0Var = new vy0(19, this, user2);
        }
        fVar.f44033n = vy0Var;
        return fVar;
    }

    public final int Z() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f43459i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f43462l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f43460j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f43458h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f43467r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f43463n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f18475id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            np npVar = this.f43453c0;
                            callback2.run(Boolean.valueOf((npVar == null || !npVar.f26710a.f22193q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f18475id;
                        if (UserObject.areGiftsDisabled(j3)) {
                            new xc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        r1 r1Var = new r1(getContext(), this.currentAccount, j3, c10, new b1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f43471v0;
                        r1Var.V((birthdayState == null || !birthdayState.contains(j3)) ? false : false);
                        r1Var.show();
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
        AndroidUtilities.cancelRunOnUIThread(this.f43472w0);
    }

    public final void f0() {
        String string;
        if (this.X == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Z());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new xc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
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
        HashSet hashSet = this.f43458h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f43470u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f43470u0, 0, 1, 33);
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
        int S;
        int S2;
        h0(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            vl0 vl0Var = this.d;
            if (i10 >= vl0Var.getChildCount()) {
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if ((childAt instanceof xg.l) && (S = RecyclerView.S(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f43457g0;
                if (S2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = S;
                    }
                    ug.f fVar = (ug.f) arrayList.get(S2);
                    xg.l lVar = (xg.l) childAt;
                    lVar.c(fVar.f44030k, z10);
                    TLRPC.Chat chat = fVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f43465p0.F(chat) > 200) {
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
            this.f43465p0.q(0, i11);
            ug.g gVar = this.f43465p0;
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
    public final ul0 v(vl0 vl0Var) {
        ug.g gVar = new ug.g(getContext(), this.resourcesProvider, false);
        this.f43465p0 = gVar;
        gVar.f44041s = true;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f43475z0;
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
