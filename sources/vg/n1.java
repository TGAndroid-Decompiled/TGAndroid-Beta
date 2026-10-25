package vg;

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
import bi.ca;
import bi.h2;
import bi.nc;
import bi.sc;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h20;
import org.telegram.ui.un;
import zh.p1;
public class n1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static f1 J0;
    public h20 A0;
    public Utilities.Callback B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public ar E0;
    public ar F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public final int X;
    public final j1 Y;
    public final h1 Z;
    public final i1 f50206a0;
    public final g1 f50207b0;
    public final zp f50208c0;
    public final sc f50209d0;
    public final FrameLayout f50210e0;
    public final ArrayList f50211f0;
    public final ArrayList f50212g0;
    public final HashSet f50213h0;
    public final ArrayList f50214i0;
    public final ArrayList f50215j0;
    public final ArrayList f50216k0;
    public final HashMap f50217l0;
    public final ArrayList m0;
    public final LinkedHashMap f50218n0;
    public String f50219o0;
    public wg.h f50220p0;
    public int f50221q0;
    public final ArrayList f50222r0;
    public boolean f50223s0;
    public float f50224t0;
    public kb0 f50225u0;
    public final BirthdayController.BirthdayState f50226v0;
    public final cy0 f50227w0;
    public int f50228x0;
    public ar f50229y0;
    public String f50230z0;

    public n1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, u6 u6Var) {
        super(context, null, true, false, u6Var);
        int i12;
        float f7;
        boolean z10;
        this.f50211f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f50212g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f50213h0 = hashSet;
        this.f50214i0 = new ArrayList();
        this.f50215j0 = new ArrayList();
        this.f50216k0 = new ArrayList();
        this.f50217l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f50218n0 = new LinkedHashMap();
        this.f50221q0 = AndroidUtilities.dp(120.0f);
        this.f50222r0 = new ArrayList();
        this.f50223s0 = false;
        this.f50227w0 = new cy0(this, 17);
        this.f50228x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = y6.f23425h5;
        fixNavigationBarKey(i13);
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f50226v0 = birthdayState;
        wg.h hVar = this.f50220p0;
        if (hVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.f51200x = z10;
        }
        ?? cVar = new zg.c(getContext(), u6Var);
        this.f50207b0 = cVar;
        cVar.setOnCloseClickListener(new a1(this, 11));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.f52861f.c(0.0f, false);
        this.f50225u0 = new kb0(this, 2);
        h1 h1Var = new h1(this, getContext(), u6Var);
        this.Z = h1Var;
        f7.i(i13, h1Var, u6Var);
        h1Var.setOnSearchTextChange(new b1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        h1Var.f52874b.setHintText(LocaleController.getString(i12), false);
        i1 i1Var = new i1(this, getContext());
        this.f50206a0 = i1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, gb1.j(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(h1Var, gb1.j(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(i1Var, gb1.j(1.0f, 55, i16, 0, i16, 0));
        sc scVar = new sc(getContext(), u6Var, (mm0) null);
        this.f50209d0 = scVar;
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        f7.i(i13, scVar, u6Var);
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i17 = y6.f23446i6;
            org.telegram.ui.Cells.y Z = y6.Z(getThemedColor(i17), 6, 6);
            b7 N = f7.N(i17);
            linearLayout.setBackground(Z);
            f7.k(linearLayout, Z, null, N, u6Var);
            zp zpVar = new zp(context, 24, u6Var);
            this.f50208c0 = zpVar;
            zpVar.b(y6.Oh, y6.f23464j7, y6.f23483k7);
            zpVar.setDrawUnchecked(true);
            zpVar.a(false, false);
            zpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(zpVar, gb1.x(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            f7.V(textView, y6.f23462j5, u6Var);
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, gb1.x(-2, -2, 16, 9, 0, 0, 0));
            gb1.c(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final n1 f50166b;

                {
                    this.f50166b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            zp zpVar2 = this.f50166b.f50208c0;
                            zpVar2.a(!zpVar2.f35379a.f26087q, true);
                            return;
                        default:
                            this.f50166b.d0();
                            return;
                    }
                }
            });
            scVar.addView(linearLayout, gb1.x(-2, -2, 17, 0, 0, 0, 8));
        }
        j1 j1Var = new j1(this, getContext(), u6Var);
        this.Y = j1Var;
        if (i11 == 4) {
            scVar.setAlpha(0.0f);
            scVar.setVisibility(8);
        }
        j1Var.setOnClickListener(new View.OnClickListener(this) {
            public final n1 f50166b;

            {
                this.f50166b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zp zpVar2 = this.f50166b.f50208c0;
                        zpVar2.a(!zpVar2.f35379a.f26087q, true);
                        return;
                    default:
                        this.f50166b.d0();
                        return;
                }
            }
        });
        scVar.addView(j1Var, gb1.u(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i18 = this.backgroundPaddingLeft;
            viewGroup4.addView(scVar, gb1.j(-2.0f, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f50210e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i19 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, gb1.j(300.0f, 87, i19, 0, i19, AndroidUtilities.dp(68.0f)));
        wg.h hVar2 = this.f50220p0;
        mm0 mm0Var = this.d;
        hVar2.f51196n = arrayList;
        hVar2.f51195f = mm0Var;
        int i20 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        mm0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(f7));
        this.d.j(new k1(this));
        this.d.setOnItemClickListener(new m4.t0(this, i11, u6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((cm0) new i2.r(this, i11, 19));
        }
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.C = false;
        lVar.f47760m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new l1(this));
        h1Var.setText("");
        h1Var.d.b(false);
        h1Var.b(false, hashSet, new a1(this, 12), null);
        cVar.setText(y());
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle(y());
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
        ca.y(i10, false).V();
    }

    public static void P(n1 n1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = n1Var.f50216k0;
        arrayList.clear();
        n1Var.f50228x0 = -1;
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

    public static void Q(n1 n1Var, int i10, u6 u6Var, int i11, View view, int i12) {
        long j10;
        boolean z10;
        boolean z11;
        float f7;
        a1 a1Var;
        sc scVar = n1Var.f50209d0;
        h1 h1Var = n1Var.Z;
        ArrayList arrayList = n1Var.f50212g0;
        HashSet hashSet = n1Var.f50213h0;
        if (view instanceof v8) {
            if (i10 == 4) {
                h20 h20Var = n1Var.A0;
                if (h20Var != null) {
                    h20Var.run();
                    n1Var.dismiss();
                    return;
                }
                return;
            }
            g5.l(n1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new b1(n1Var, 2), new a1(n1Var, 9), false, false, n1Var.resourcesProvider).f22599a.show();
        } else if (view instanceof zg.l) {
            zg.l lVar = (zg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            wg.g gVar = null;
            boolean z12 = true;
            if (user == null && chat == null && i10 == 3) {
                int i13 = i12 - 1;
                if (i13 >= 0 && i13 < arrayList.size()) {
                    gVar = (wg.g) arrayList.get(i13);
                }
                Utilities.Callback callback = n1Var.B0;
                if (callback != null && gVar != null) {
                    int i14 = gVar.f51185i;
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
                    j10 = user.f22174id;
                } else {
                    j10 = -chat.f22027id;
                }
                long j11 = j10;
                if (i10 == 3) {
                    Utilities.Callback callback2 = n1Var.B0;
                    if (callback2 != null) {
                        callback2.run(Long.valueOf(j11));
                    }
                } else if (i10 == 1) {
                    if (h1Var != null) {
                        AndroidUtilities.hideKeyboard(h1Var.getEditText());
                    }
                    nc ncVar = new nc(n1Var.getContext(), u6Var, user, new a1(n1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        ncVar.makeAttached(n1Var.attachedFragment);
                    }
                    ncVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j11));
                        Utilities.Callback2 callback22 = n1Var.D0;
                        if (callback22 != null) {
                            zp zpVar = n1Var.f50208c0;
                            if (zpVar == null || !zpVar.f35379a.f26087q) {
                                z12 = false;
                            }
                            callback22.run(Boolean.valueOf(z12), hashSet);
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
                    if (hashSet.contains(Long.valueOf(j11))) {
                        hashSet.remove(Long.valueOf(j11));
                    } else {
                        hashSet.add(Long.valueOf(j11));
                        n1Var.f50218n0.put(Long.valueOf(j11), user);
                    }
                    if (hashSet.size() == n1Var.Z() + 1) {
                        hashSet.remove(Long.valueOf(j11));
                        n1Var.f0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        scVar.setVisibility(0);
                        ViewPropertyAnimator animate = scVar.animate();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(ds.h).setDuration(320L);
                        if (!z11) {
                            a1Var = new a1(n1Var, 1);
                        } else {
                            a1Var = null;
                        }
                        duration.withEndAction(a1Var).start();
                        wg.h hVar = n1Var.f50220p0;
                        boolean z13 = !z11;
                        if (hVar.f51201y != z13) {
                            hVar.f51201y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) hVar.f51195f, (Utilities.Callback<View>) new wg.f(z13));
                        }
                    }
                    n1Var.W();
                    h1Var.b(true, hashSet, new a1(n1Var, 2), null);
                    n1Var.i0(true, true);
                    n1Var.X();
                } else if (UserObject.areGiftsDisabled(j11)) {
                    new wc(n1Var.container, u6Var).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j11)))).j();
                } else {
                    p1 p1Var = new p1(n1Var.getContext(), i11, j11, s.c(s.b(1, n1Var.f50222r0)), new b1(n1Var, 1));
                    BirthdayController.BirthdayState birthdayState = n1Var.f50226v0;
                    if (birthdayState == null || !birthdayState.contains(j11)) {
                        z12 = false;
                    }
                    p1Var.V(z12);
                    p1Var.show();
                }
            }
        }
    }

    public static void R(n1 n1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = n1Var.f50210e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            qc R = new wc(frameLayout, n1Var.resourcesProvider).R(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            R.f31887j = 5000;
            R.j();
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
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        org.telegram.messenger.t.q(R.string.UnknownError, new wc(frameLayout, n1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(n1 n1Var, final TLRPC.User user, View view) {
        k80 F = k80.F(n1Var.container, n1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(n1Var) {
            public final n1 f50159b;

            {
                this.f50159b = n1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            r2 r2Var = this.f50159b.f26809n;
                            if (r2Var == null) {
                                r2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f22926a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f22174id);
                                    U.showAsSheet(new un(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f22174id);
                            r2Var.presentFragment(new un(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            r2 r2Var2 = this.f50159b.f26809n;
                            if (r2Var2 == null) {
                                r2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f22926a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f22174id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f22174id);
                            r2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(n1Var) {
            public final n1 f50159b;

            {
                this.f50159b = n1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            r2 r2Var = this.f50159b.f26809n;
                            if (r2Var == null) {
                                r2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f22926a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f22174id);
                                    U.showAsSheet(new un(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f22174id);
                            r2Var.presentFragment(new un(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            r2 r2Var2 = this.f50159b.f26809n;
                            if (r2Var2 == null) {
                                r2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f22926a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f22174id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f22174id);
                            r2Var2.presentFragment(new ProfileActivity(bundle4, null));
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
        ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(updatebirthday, new h2(n1Var, userFull, tL_birthday2, 25), 1024);
        MessagesController.getInstance(n1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(n1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(n1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        n1Var.h0(true, true);
    }

    public static void U(n1 n1Var, String str) {
        if (n1Var.f50228x0 >= 0) {
            ConnectionsManager.getInstance(n1Var.currentAccount).cancelRequest(n1Var.f50228x0, true);
            n1Var.f50228x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f22073q = str;
        n1Var.f50228x0 = ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(tL_contacts_search, new bi.i0(n1Var, 26));
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
        r2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        f1 f1Var = J0;
        if (f1Var != null) {
            return f1Var;
        }
        ?? n1Var = new n1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            n1Var.makeAttached(R);
        }
        R.showDialog(n1Var);
        J0 = n1Var;
        return n1Var;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        g1 g1Var = this.f50207b0;
        g1Var.setTranslationY(max);
        float translationY = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.Z;
        h1Var.setTranslationY(translationY);
        float translationY2 = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.f50206a0;
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
            if (user != null && !user.bot && !UserObject.isService(user.f22174id)) {
                long j10 = user.f22174id;
                if (j10 != 0 && !this.C0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.f22174id);
                    HashSet hashSet = this.f50213h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    wg.g c10 = wg.g.c(user, hashSet.contains(Long.valueOf(user.f22174id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(wg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f50213h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f50223s0) {
                this.f50223s0 = false;
                AndroidUtilities.runOnUIThread(new a1(this, 4), 10L);
            }
        } else if (!this.f50223s0) {
            this.f50223s0 = true;
            AndroidUtilities.runOnUIThread(new a1(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f50219o0)) {
            this.f50219o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f50227w0);
            h0(true, true);
        }
    }

    public final wg.g Y(wg.g gVar) {
        org.telegram.ui.web.c cVar;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = gVar.f51182c;
            if (user == null) {
                return gVar;
            }
            final long j10 = user.f22174id;
            ?? r22 = new View.OnClickListener(this) {
                public final n1 f50152b;

                {
                    this.f50152b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            n1 n1Var = this.f50152b;
                            HashSet hashSet = n1Var.f50213h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = n1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                n1Var.D0 = null;
                            }
                            n1Var.dismiss();
                            return;
                        default:
                            n1 n1Var2 = this.f50152b;
                            HashSet hashSet2 = n1Var2.f50213h0;
                            hashSet2.add(Long.valueOf(j10));
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
                public final n1 f50152b;

                {
                    this.f50152b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            n1 n1Var = this.f50152b;
                            HashSet hashSet = n1Var.f50213h0;
                            hashSet.add(Long.valueOf(j10));
                            Utilities.Callback2 callback2 = n1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                n1Var.D0 = null;
                            }
                            n1Var.dismiss();
                            return;
                        default:
                            n1 n1Var2 = this.f50152b;
                            HashSet hashSet2 = n1Var2.f50213h0;
                            hashSet2.add(Long.valueOf(j10));
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
            gVar.f51191o = r22;
            gVar.f51192p = r32;
            return gVar;
        }
        TLRPC.User user2 = gVar.f51182c;
        if (i10 == 3) {
            cVar = null;
        } else {
            cVar = new org.telegram.ui.web.c(7, this, user2);
        }
        gVar.f51190n = cVar;
        return gVar;
    }

    public final int Z() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f50214i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f50217l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f50215j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f50213h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f50222r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f50218n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f22174id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            zp zpVar = this.f50208c0;
                            callback2.run(Boolean.valueOf((zpVar == null || !zpVar.f35379a.f26087q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j10 = ((TLRPC.User) arrayList2.get(0)).f22174id;
                        if (UserObject.areGiftsDisabled(j10)) {
                            new wc(this.container, this.resourcesProvider).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        p1 p1Var = new p1(getContext(), this.currentAccount, j10, c10, new b1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f50226v0;
                        p1Var.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
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
        J0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f50227w0);
    }

    public final void f0() {
        String string;
        if (this.X == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Z());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new wc(this.container, this.resourcesProvider).R(R.raw.chats_infotip, 36, string).k(true);
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
        HashSet hashSet = this.f50213h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f50225u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f50225u0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        j1Var.b(hashSet.size(), true);
        j1Var.i(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        j1Var.setEnabled(z11);
    }

    public final void h0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: vg.n1.h0(boolean, boolean):void");
    }

    public final void i0(boolean z10, boolean z11) {
        int R;
        int R2;
        h0(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            mm0 mm0Var = this.d;
            if (i11 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i11);
            if ((childAt instanceof zg.l) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f50212g0;
                if (R2 < arrayList.size()) {
                    if (i10 == -1) {
                        i10 = R;
                    }
                    wg.g gVar = (wg.g) arrayList.get(R2);
                    zg.l lVar = (zg.l) childAt;
                    lVar.c(gVar.f51187k, z10);
                    TLRPC.Chat chat = gVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f50220p0.F(chat) > 200) {
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
            this.f50220p0.q(0, i10);
            wg.h hVar = this.f50220p0;
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
            int w02 = y6.w0(y6.Oh, this.resourcesProvider);
            ar arVar = this.F0;
            boolean z11 = true;
            if (arVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                y6.z1(w02, arVar.f26590a);
            }
            ar arVar2 = this.E0;
            if (arVar2 == null) {
                z11 = false;
            }
            if (z11) {
                y6.z1(w02, arVar2.f26590a);
            }
            mm0 mm0Var = this.d;
            if (mm0Var != null) {
                for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
                    mm0Var.getChildAt(i10).invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        wg.h hVar = new wg.h(getContext(), this.resourcesProvider, false);
        this.f50220p0 = hVar;
        hVar.f51198s = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f50230z0;
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
