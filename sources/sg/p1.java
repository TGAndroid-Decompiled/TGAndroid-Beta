package sg;

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
import bi.c2;
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
import org.telegram.messenger.a2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.p20;
import org.telegram.ui.w20;
import org.telegram.ui.w71;
import w7.a6;
import w7.c6;
import xh.k7;
import xh.v5;
public class p1 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public static i1 G0;
    public w20 A0;
    public j2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final m1 Y;
    public final k1 Z;
    public final l1 f41967a0;
    public final j1 f41968b0;
    public final tp f41969c0;
    public final p20 f41970d0;
    public final FrameLayout f41971e0;
    public final ArrayList f41972f0;
    public final ArrayList f41973g0;
    public final HashSet f41974h0;
    public final ArrayList f41975i0;
    public final ArrayList f41976j0;
    public final ArrayList f41977k0;
    public final HashMap f41978l0;
    public final ArrayList m0;
    public final LinkedHashMap f41979n0;
    public String f41980o0;
    public tg.g f41981p0;
    public int f41982q0;
    public final ArrayList f41983r0;
    public boolean f41984s0;
    public float f41985t0;
    public bb0 f41986u0;
    public final BirthdayController.BirthdayState f41987v0;
    public final a1 f41988w0;
    public int f41989x0;
    public vq f41990y0;
    public String f41991z0;

    public p1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, f6 f6Var) {
        super(context, null, true, false, f6Var);
        int i12;
        float f7;
        boolean z10;
        this.f41972f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f41973g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f41974h0 = hashSet;
        this.f41975i0 = new ArrayList();
        this.f41976j0 = new ArrayList();
        this.f41977k0 = new ArrayList();
        this.f41978l0 = new HashMap();
        this.m0 = new ArrayList();
        this.f41979n0 = new LinkedHashMap();
        this.f41982q0 = AndroidUtilities.dp(120.0f);
        this.f41983r0 = new ArrayList();
        this.f41984s0 = false;
        this.f41988w0 = new a1(this, 1);
        this.f41989x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i13 = j6.f17998h5;
        fixNavigationBar(j6.v0(i13, f6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.f41987v0 = birthdayState;
        tg.g gVar = this.f41981p0;
        if (gVar != null) {
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.f42176x = z10;
        }
        ?? cVar = new wg.c(getContext(), f6Var);
        this.f41968b0 = cVar;
        cVar.setOnCloseClickListener(new d1(this, 11));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f41986u0 = new bb0(this, 2);
        k1 k1Var = new k1(this, getContext(), f6Var);
        this.Z = k1Var;
        k1Var.setBackgroundColor(getThemedColor(i13));
        k1Var.setOnSearchTextChange(new e1(this, 3));
        if (hashSet.isEmpty() && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            i12 = R.string.GiftPremiumUsersSearchHint;
        } else {
            i12 = R.string.Search;
        }
        k1Var.f43999b.setHintText(LocaleController.getString(i12), false);
        l1 l1Var = new l1(this, getContext());
        this.f41967a0 = l1Var;
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, a6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup2.addView(k1Var, a6.f(-2.0f, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup3.addView(l1Var, a6.f(1.0f, 55, i16, 0, i16, 0));
        p20 p20Var = new p20(getContext(), f6Var, (vl0) null);
        this.f41970d0 = p20Var;
        p20Var.setClickable(true);
        p20Var.setOrientation(1);
        p20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        p20Var.setBackgroundColor(j6.v0(i13, f6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(j6.Y(getThemedColor(j6.f18017i6), 6, 6));
            tp tpVar = new tp(context, 24, f6Var);
            this.f41969c0 = tpVar;
            tpVar.b(j6.Oh, j6.f18036j7, j6.f18056k7);
            tpVar.setDrawUnchecked(true);
            tpVar.a(false, false);
            tpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(tpVar, a6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(j6.f18034j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, a6.t(-2, -2, 16, 9, 0, 0, 0));
            c6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final p1 f41932b;

                {
                    this.f41932b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            tp tpVar2 = this.f41932b.f41969c0;
                            tpVar2.a(!tpVar2.f27462a.f21057q, true);
                            return;
                        default:
                            this.f41932b.d0();
                            return;
                    }
                }
            });
            p20Var.addView(linearLayout, a6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        m1 m1Var = new m1(this, getContext(), f6Var);
        this.Y = m1Var;
        if (i11 == 4) {
            p20Var.setAlpha(0.0f);
            p20Var.setVisibility(8);
        }
        m1Var.setOnClickListener(new View.OnClickListener(this) {
            public final p1 f41932b;

            {
                this.f41932b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        tp tpVar2 = this.f41932b.f41969c0;
                        tpVar2.a(!tpVar2.f27462a.f21057q, true);
                        return;
                    default:
                        this.f41932b.d0();
                        return;
                }
            }
        });
        p20Var.addView(m1Var, a6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(p20Var, a6.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f41971e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, a6.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        tg.g gVar2 = this.f41981p0;
        vl0 vl0Var = this.d;
        gVar2.f42172n = arrayList;
        gVar2.f42171f = vl0Var;
        int i19 = this.backgroundPaddingLeft;
        if (i11 != 1) {
            f7 = 60.0f;
        } else {
            f7 = 0.0f;
        }
        vl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(f7));
        this.d.j(new n1(this));
        this.d.setOnItemClickListener(new zt(this, i11, f6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((ml0) new i2.s(this, i11, 18));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new o1(this));
        k1Var.setText("");
        k1Var.d.b(false);
        k1Var.b(false, hashSet, new d1(this, 12), null);
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
            s.j(i10, null, new e1(this, 0));
        }
        if (i11 != 0 && i11 != 2) {
            return;
        }
        v5.y(i10, false).V();
    }

    public static void P(p1 p1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = p1Var.f41977k0;
        arrayList.clear();
        p1Var.f41989x0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(p1Var.currentAccount);
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
        p1Var.i0(true, true);
    }

    public static void Q(p1 p1Var, int i10, f6 f6Var, int i11, View view) {
        long j3;
        boolean z10;
        boolean z11;
        float f7;
        d1 d1Var;
        p20 p20Var = p1Var.f41970d0;
        k1 k1Var = p1Var.Z;
        HashSet hashSet = p1Var.f41974h0;
        if (view instanceof s8) {
            if (i10 == 4) {
                w20 w20Var = p1Var.A0;
                if (w20Var != null) {
                    w20Var.run();
                    p1Var.dismiss();
                    return;
                }
                return;
            }
            d5.m(p1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new e1(p1Var, 2), new d1(p1Var, 9), false, false, p1Var.resourcesProvider).f17571a.show();
        } else if (view instanceof wg.k) {
            wg.k kVar = (wg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                j2 j2Var = p1Var.B0;
                if (j2Var != null) {
                    j2Var.run(-99L);
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f17342id;
                } else {
                    j3 = -chat.f17195id;
                }
                long j10 = j3;
                if (i10 == 3) {
                    j2 j2Var2 = p1Var.B0;
                    if (j2Var2 != null) {
                        j2Var2.run(Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                boolean z12 = true;
                if (i10 == 1) {
                    if (k1Var != null) {
                        AndroidUtilities.hideKeyboard(k1Var.getEditText());
                    }
                    k7 k7Var = new k7(p1Var.getContext(), f6Var, user, new d1(p1Var, 11));
                    if (!AndroidUtilities.isTablet()) {
                        k7Var.makeAttached(p1Var.attachedFragment);
                    }
                    k7Var.show();
                } else if (i10 != 0 && i10 != 2) {
                    if (i10 == 4 && hashSet.isEmpty()) {
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = p1Var.D0;
                        if (callback2 != null) {
                            tp tpVar = p1Var.f41969c0;
                            callback2.run(Boolean.valueOf((tpVar == null || !tpVar.f27462a.f21057q) ? false : false), hashSet);
                            p1Var.D0 = null;
                        }
                        p1Var.dismiss();
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
                        p1Var.f41979n0.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == p1Var.Z() + 1) {
                        hashSet.remove(Long.valueOf(j10));
                        p1Var.f0();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        p20Var.setVisibility(0);
                        ViewPropertyAnimator animate = p20Var.animate();
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
                        ViewPropertyAnimator duration = alpha.translationY(f10).setInterpolator(wr.h).setDuration(320L);
                        if (!z11) {
                            d1Var = new d1(p1Var, 1);
                        } else {
                            d1Var = null;
                        }
                        duration.withEndAction(d1Var).start();
                        tg.g gVar = p1Var.f41981p0;
                        boolean z13 = !z11;
                        if (gVar.f42177y != z13) {
                            gVar.f42177y = z13;
                            AndroidUtilities.forEachViews((RecyclerView) gVar.f42171f, (e2.h) new m4.o0(3, z13));
                        }
                    }
                    p1Var.W();
                    k1Var.b(true, hashSet, new d1(p1Var, 2), null);
                    p1Var.i0(true, true);
                    p1Var.X();
                } else if (UserObject.areGiftsDisabled(j10)) {
                    new wc(p1Var.container, f6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                } else {
                    wh.p1 p1Var2 = new wh.p1(p1Var.getContext(), i11, j10, s.c(s.b(1, p1Var.f41983r0)), new e1(p1Var, 1));
                    BirthdayController.BirthdayState birthdayState = p1Var.f41987v0;
                    p1Var2.V((birthdayState == null || !birthdayState.contains(j10)) ? false : false);
                    p1Var2.show();
                }
            }
        }
    }

    public static void R(p1 p1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = p1Var.f41971e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            pc Q = new wc(frameLayout, p1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.f26081j = 5000;
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
            MessagesStorage.getInstance(p1Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (p1Var.getContext() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                hc.b.A(R.string.OK, alertDialog$Builder, null);
                return;
            }
            return;
        }
        a2.o(R.string.UnknownError, new wc(frameLayout, p1Var.resourcesProvider), R.raw.error, 36);
    }

    public static void S(p1 p1Var, final TLRPC.User user, View view) {
        w70 F = w70.F(p1Var.container, p1Var.resourcesProvider, (View) view.getParent());
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(p1Var) {
            public final p1 f41929b;

            {
                this.f41929b = p1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            p2 p2Var = this.f41929b.f21452n;
                            if (p2Var == null) {
                                p2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f18485a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f17342id);
                                    U.showAsSheet(new eo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f17342id);
                            p2Var.presentFragment(new eo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            p2 p2Var2 = this.f41929b.f21452n;
                            if (p2Var2 == null) {
                                p2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f18485a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f17342id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f17342id);
                            p2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(p1Var) {
            public final p1 f41929b;

            {
                this.f41929b = p1Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            p2 p2Var = this.f41929b.f21452n;
                            if (p2Var == null) {
                                p2 U = LaunchActivity.U();
                                ?? obj = new Object();
                                obj.f18485a = true;
                                if (U != 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("user_id", user2.f17342id);
                                    U.showAsSheet(new eo(bundle), obj);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", user2.f17342id);
                            p2Var.presentFragment(new eo(bundle2));
                            return;
                        }
                        return;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            p2 p2Var2 = this.f41929b.f21452n;
                            if (p2Var2 == null) {
                                p2 U2 = LaunchActivity.U();
                                if (U2 != 0) {
                                    ?? obj2 = new Object();
                                    obj2.f18485a = true;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("user_id", user3.f17342id);
                                    U2.showAsSheet(new ProfileActivity(bundle3, null), obj2);
                                    return;
                                }
                                return;
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("user_id", user3.f17342id);
                            p2Var2.presentFragment(new ProfileActivity(bundle4, null));
                            return;
                        }
                        return;
                }
            }
        }, false);
        F.Z();
    }

    public static void T(p1 p1Var, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(p1Var.currentAccount).getUserFull(UserConfig.getInstance(p1Var.currentAccount).getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(p1Var.currentAccount).sendRequest(updatebirthday, new bi.wa(p1Var, userFull, tL_birthday2, 19), 1024);
        MessagesController.getInstance(p1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(p1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(p1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        p1Var.h0(true, true);
    }

    public static void U(p1 p1Var, String str) {
        if (p1Var.f41989x0 >= 0) {
            ConnectionsManager.getInstance(p1Var.currentAccount).cancelRequest(p1Var.f41989x0, true);
            p1Var.f41989x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.f17241q = str;
        p1Var.f41989x0 = ConnectionsManager.getInstance(p1Var.currentAccount).sendRequest(tL_contacts_search, new c2(p1Var, 18));
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

    public static p1 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        p2 R = LaunchActivity.R();
        if (R == 0) {
            return null;
        }
        i1 i1Var = G0;
        if (i1Var != null) {
            return i1Var;
        }
        ?? p1Var = new p1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            p1Var.makeAttached(R);
        }
        R.showDialog(p1Var);
        G0 = p1Var;
        return p1Var;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        j1 j1Var = this.f41968b0;
        j1Var.setTranslationY(max);
        float translationY = j1Var.getTranslationY() + j1Var.getMeasuredHeight();
        k1 k1Var = this.Z;
        k1Var.setTranslationY(translationY);
        float translationY2 = k1Var.getTranslationY() + k1Var.getMeasuredHeight();
        l1 l1Var = this.f41967a0;
        l1Var.setTranslationY(translationY2);
        int measuredHeight = k1Var.getMeasuredHeight() + j1Var.getMeasuredHeight();
        this.d.setTranslationY((l1Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
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
            if (user != null && !user.bot && !UserObject.isService(user.f17342id)) {
                long j3 = user.f17342id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.f17342id);
                    HashSet hashSet = this.f41974h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    tg.f c10 = tg.f.c(user, hashSet.contains(Long.valueOf(user.f17342id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(tg.f.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (this.f41974h0.isEmpty() && (i10 = this.X) != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (this.f41984s0) {
                this.f41984s0 = false;
                AndroidUtilities.runOnUIThread(new d1(this, 4), 10L);
            }
        } else if (!this.f41984s0) {
            this.f41984s0 = true;
            AndroidUtilities.runOnUIThread(new d1(this, 3), 10L);
        }
    }

    public final void X() {
        if (!TextUtils.isEmpty(this.f41980o0)) {
            this.f41980o0 = null;
            this.Z.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f41988w0);
            h0(true, true);
        }
    }

    public final tg.f Y(tg.f fVar) {
        w71 w71Var;
        int i10 = this.X;
        if (i10 == 4) {
            TLRPC.User user = fVar.f42158c;
            if (user == null) {
                return fVar;
            }
            final long j3 = user.f17342id;
            ?? r22 = new View.OnClickListener(this) {
                public final p1 f41924b;

                {
                    this.f41924b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            p1 p1Var = this.f41924b;
                            HashSet hashSet = p1Var.f41974h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = p1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                p1Var.D0 = null;
                            }
                            p1Var.dismiss();
                            return;
                        default:
                            p1 p1Var2 = this.f41924b;
                            HashSet hashSet2 = p1Var2.f41974h0;
                            hashSet2.add(Long.valueOf(j3));
                            Utilities.Callback2 callback22 = p1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                p1Var2.D0 = null;
                            }
                            p1Var2.dismiss();
                            return;
                    }
                }
            };
            ?? r32 = new View.OnClickListener(this) {
                public final p1 f41924b;

                {
                    this.f41924b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            p1 p1Var = this.f41924b;
                            HashSet hashSet = p1Var.f41974h0;
                            hashSet.add(Long.valueOf(j3));
                            Utilities.Callback2 callback2 = p1Var.D0;
                            if (callback2 != null) {
                                callback2.run(Boolean.FALSE, hashSet);
                                p1Var.D0 = null;
                            }
                            p1Var.dismiss();
                            return;
                        default:
                            p1 p1Var2 = this.f41924b;
                            HashSet hashSet2 = p1Var2.f41974h0;
                            hashSet2.add(Long.valueOf(j3));
                            Utilities.Callback2 callback22 = p1Var2.D0;
                            if (callback22 != null) {
                                callback22.run(Boolean.TRUE, hashSet2);
                                p1Var2.D0 = null;
                            }
                            p1Var2.dismiss();
                            return;
                    }
                }
            };
            fVar.f42167o = r22;
            fVar.f42168p = r32;
            return fVar;
        }
        TLRPC.User user2 = fVar.f42158c;
        if (i10 == 3) {
            w71Var = null;
        } else {
            w71Var = new w71(15, this, user2);
        }
        fVar.f42166n = w71Var;
        return fVar;
    }

    public final int Z() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f41975i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.f41978l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f41976j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.f41974h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.f41983r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f41979n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.f17342id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                boolean z10 = true;
                if (i10 != 1) {
                    if (i10 == 4) {
                        Utilities.Callback2 callback2 = this.D0;
                        if (callback2 != null) {
                            tp tpVar = this.f41969c0;
                            callback2.run(Boolean.valueOf((tpVar == null || !tpVar.f27462a.f21057q) ? false : false), hashSet);
                            this.D0 = null;
                        }
                        dismiss();
                        return;
                    }
                    List c10 = s.c(s.b(arrayList2.size(), arrayList));
                    if (arrayList2.size() == 1) {
                        long j3 = ((TLRPC.User) arrayList2.get(0)).f17342id;
                        if (UserObject.areGiftsDisabled(j3)) {
                            new wc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                            return;
                        }
                        wh.p1 p1Var = new wh.p1(getContext(), this.currentAccount, j3, c10, new e1(this, 1));
                        BirthdayController.BirthdayState birthdayState = this.f41987v0;
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
            AndroidUtilities.runOnUIThread(new d1(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new d1(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new d1(this, 10));
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
        AndroidUtilities.cancelRunOnUIThread(this.f41988w0);
    }

    public final void f0() {
        String string;
        if (this.X == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", Z());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        new wc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, string).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        m1 m1Var = this.Y;
        boolean z11 = false;
        m1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.f41974h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f41986u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.f41986u0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        m1Var.b(hashSet.size(), true);
        m1Var.g(spannableStringBuilder, z10, false);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        m1Var.setEnabled(z11);
    }

    public final void h0(boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: sg.p1.h0(boolean, boolean):void");
    }

    public final void i0(boolean z10, boolean z11) {
        int R;
        int R2;
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
            if ((childAt instanceof wg.k) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.f41973g0;
                if (R2 < arrayList.size()) {
                    if (i11 == -1) {
                        i11 = R;
                    }
                    tg.f fVar = (tg.f) arrayList.get(R2);
                    wg.k kVar = (wg.k) childAt;
                    kVar.c(fVar.f42163k, z10);
                    TLRPC.Chat chat = fVar.e;
                    float f7 = 1.0f;
                    if (chat != null) {
                        if (this.f41981p0.F(chat) > 200) {
                            f7 = 0.3f;
                        }
                        kVar.i(f7, z10);
                    } else {
                        kVar.i(1.0f, z10);
                    }
                    i12 = R;
                }
            }
            i10++;
        }
        if (z10) {
            this.f41981p0.q(0, i11);
            tg.g gVar = this.f41981p0;
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
        tg.g gVar = new tg.g(getContext(), this.resourcesProvider, false);
        this.f41981p0 = gVar;
        gVar.f42174s = true;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        String str = this.f41991z0;
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
