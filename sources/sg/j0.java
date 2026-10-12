package sg;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.q4;
import bi.t4;
import di.kc;
import di.p6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bz0;
import org.telegram.ui.fo;
import org.telegram.ui.hd;
import org.telegram.ui.x50;
import org.telegram.ui.yy;
import org.telegram.ui.zo;
import w7.a6;
public class j0 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static final int V0 = 0;
    public final ArrayList A0;
    public ArrayList B0;
    public ArrayList C0;
    public ArrayList D0;
    public z E0;
    public final TextView F0;
    public di.d G0;
    public Runnable H0;
    public boolean I0;
    public rl0 J0;
    public final m2 K0;
    public x50 L0;
    public androidx.emoji2.text.p M0;
    public boolean N0;
    public TLRPC.Chat O0;
    public final d10 P0;
    public Runnable Q0;
    public int R0;
    public final di.d S0;
    public int T0;
    public String U0;
    public int X;
    public boolean Y;
    public int Z;
    public long f45203a0;
    public TL_stories.TL_premium_boostsStatus f45204b0;
    public ChannelBoostsController.CanApplyBoost f45205c0;
    public i0 f45206d0;
    public boolean f45207e0;
    public boolean f45208f0;
    public org.telegram.ui.Cells.u1 f45209g0;
    public final int f45210h0;
    public final ArrayList f45211i0;
    public boolean f45212j0;
    public int f45213k0;
    public int f45214l0;
    public int m0;
    public int f45215n0;
    public int f45216o0;
    public int f45217p0;
    public int f45218q0;
    public int f45219r0;
    public int f45220s0;
    public int f45221t0;
    public ArrayList f45222u0;
    public boolean f45223v0;
    public int f45224w0;
    public h0 f45225x0;
    public final HashSet f45226y0;
    public final ArrayList f45227z0;

    public j0(int i10, int i11, Context context, m2 m2Var, c6 c6Var) {
        super(context, m2Var, false, w1(i10), c6Var);
        this.Z = -1;
        this.f45208f0 = false;
        this.f45211i0 = new ArrayList();
        this.f45214l0 = -1;
        this.m0 = -1;
        this.f45215n0 = -1;
        this.f45216o0 = -1;
        this.f45217p0 = -1;
        this.f45218q0 = -1;
        this.f45219r0 = -1;
        this.f45220s0 = -1;
        this.f45221t0 = -1;
        this.f45224w0 = -1;
        this.f45226y0 = new HashSet();
        this.f45227z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.I0 = false;
        this.R0 = 0;
        this.T0 = -4;
        fixNavigationBar(g6.w0(g6.f19972h5, this.resourcesProvider));
        this.K0 = m2Var;
        this.currentAccount = i11;
        this.f45210h0 = i10;
        O();
        N1();
        if (i10 == 2) {
            this.I0 = true;
            N1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v(this, 0));
        } else if (i10 == 5) {
            this.I0 = true;
            N1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v(this, 2));
        }
        M1();
        if (i10 == 32 || x1()) {
            d10 d10Var = new d10(getContext());
            this.P0 = d10Var;
            this.container.addView(d10Var, a6.d(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            x50 x50Var = this.L0;
            if (x50Var != null) {
                ((ViewGroup) x50Var.getParent()).removeView(this.L0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.F0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.E0.getTextView().getText());
            textView.setTextColor(g6.w0(g6.Sh, c6Var));
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int w02 = g6.w0(g6.Oh, c6Var);
            int k10 = i0.a.k(g6.w0(g6.f19901d6, c6Var), 120);
            textView.setBackground(g6.j0(dp, dp, dp, dp, w02, k10, k10));
        }
        if (i10 == 32) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            di.d dVar = new di.d(context, c6Var, true);
            this.S0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, a6.a(48.0f, 16.0f, 2.0f, 16.0f, 12.0f, -1, 80));
            this.containerView.post(new w(this, 3));
        }
        if (i10 != 19 && i10 != 18) {
            return;
        }
        this.containerView.post(new w(this, 4));
    }

    public static String B1(int i10) {
        switch (i10) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void D1(m2 m2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus != null && canApplyBoost != null && m2Var.getContext() != null) {
            j0 j0Var = new j0(32, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, m2Var.getResourceProvider());
            j0Var.H1(canApplyBoost);
            j0Var.G1(tL_premium_boostsStatus, true);
            j0Var.I1(j10);
            if (z10) {
                m2Var.showDialog(j0Var);
            } else {
                j0Var.show();
            }
        }
    }

    public static void Q(j0 j0Var, ArrayList arrayList, TLRPC.User user) {
        j0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(j0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(j0Var.currentAccount).deleteParticipantFromChat(chat.f19216id, user);
        }
    }

    public static void R(j0 j0Var, ArrayList arrayList) {
        j0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(j0Var, 1), 64);
        }
    }

    public static void S(j0 j0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        mm0 mm0Var = j0Var.d;
        ArrayList arrayList2 = j0Var.A0;
        arrayList2.clear();
        ArrayList arrayList3 = j0Var.f45227z0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        j0Var.I0 = false;
        j0Var.J0.b(j0Var.f45215n0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 < mm0Var.getChildCount()) {
                if (mm0Var.getChildAt(i13) instanceof i0) {
                    i11 = mm0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            } else {
                i11 = 0;
                break;
            }
        }
        j0Var.N1();
        if (j0Var.f45214l0 >= 0 && i11 != 0) {
            ((s4.b0) mm0Var.getLayoutManager()).h1(j0Var.f45214l0 + 1, i11);
        }
        if (j0Var.M0 == null) {
            j0Var.M0 = v1(j0Var.f45210h0, j0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), j0Var.M0.f1503b);
        h0 h0Var = j0Var.f45225x0;
        if (h0Var != null) {
            h0Var.g(max, false);
            j0Var.f45225x0.setBagePosition(max / j0Var.M0.f1504c);
            h0 h0Var2 = j0Var.f45225x0;
            h0Var2.H = true;
            h0Var2.requestLayout();
        }
    }

    public static c6 S0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static void T(j0 j0Var) {
        long j10;
        int i10 = j0Var.f45210h0;
        HashSet hashSet = j0Var.f45226y0;
        if (j0Var.f45212j0) {
            m2 m2Var = j0Var.K0;
            if (m2Var != 0) {
                ?? obj = new Object();
                obj.f20469a = true;
                m2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
            } else {
                return;
            }
        } else if (i10 == 19 || i10 == 32 || j0Var.z1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f45205c0;
            if (canApplyBoost.canApply) {
                j0Var.E0.f45314r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.f45205c0;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    w wVar = new w(j0Var, 1);
                    if (canApplyBoost2.needSelector) {
                        j10 = 300;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(wVar, j10);
                    return;
                }
                return;
            } else if (canApplyBoost.alreadyActive && ug.s.i() && !j0Var.f45205c0.isMaxLvl) {
                ug.j.i(j0Var.f45203a0, j0Var);
                return;
            } else {
                j0Var.dismiss();
                return;
            }
        }
        if (i10 != 11 && i10 != 34) {
            if (!hashSet.isEmpty()) {
                if (i10 == 2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        j0Var.f45211i0.add((TLRPC.Chat) it.next());
                    }
                    j0Var.E1(arrayList);
                } else if (i10 == 5) {
                    TLRPC.User user = MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(j0Var.currentAccount).getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((TLRPC.Chat) it2.next());
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j0Var.getContext(), 0, j0Var.resourcesProvider);
                    String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.R = formatPluralString;
                    if (arrayList2.size() == 1) {
                        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
                    } else {
                        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
                    }
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new nz(j0Var, arrayList2, user, 10));
                    a2Var.show();
                    TextView textView = (TextView) a2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(g6.w0(g6.f20139q7, j0Var.resourcesProvider));
                    }
                }
            }
        } else if (hashSet.isEmpty()) {
            j0Var.dismiss();
        } else {
            j0Var.F1(null);
        }
    }

    public static void V(j0 j0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                int currentTime = (ConnectionsManager.getInstance(j0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                if (currentTime < 30) {
                    formatPluralString = LocaleController.formatPluralString("Days", currentTime, new Object[0]);
                } else if (currentTime < 365) {
                    formatPluralString = LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                }
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new m21(j0Var, arrayList, min, tL_messages_inactiveChats, 20));
        }
    }

    public static c6 V0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static void W(j0 j0Var, Context context) {
        int i10;
        m2 m2Var = j0Var.K0;
        int i11 = j0Var.f45210h0;
        if (i11 != 11 && i11 != 34) {
            if (i11 != 19 && i11 != 32 && !j0Var.z1()) {
                if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                    if (!UserConfig.getInstance(j0Var.currentAccount).isPremium() && !MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() && !j0Var.N0) {
                        if (m2Var != null) {
                            if (m2Var.getVisibleDialog() != null) {
                                m2Var.getVisibleDialog().dismiss();
                            }
                            m2Var.presentFragment(new PremiumPreviewFragment(0, B1(i11)));
                            j0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    j0Var.dismiss();
                    return;
                }
                AndroidUtilities.addToClipboard(j0Var.q1());
                j0Var.dismiss();
                return;
            }
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f45205c0;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(j0Var.currentAccount).isPremium() && ug.s.i()) {
                    ug.j.i(j0Var.f45203a0, j0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, j0Var.resourcesProvider);
                String string = LocaleController.getString(R.string.PremiumNeeded);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                if (j0Var.y1()) {
                    i10 = R.string.PremiumNeededForBoostingGroup;
                } else {
                    i10 = R.string.PremiumNeededForBoosting;
                }
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new x(j0Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r0.h(27));
                alertDialog$Builder.o();
                return;
            }
            boolean z10 = canApplyBoost.canApply;
            if (z10 && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && ug.s.i()) {
                    j0Var.f45208f0 = true;
                    j0Var.f45225x0.f23227d0 = false;
                    m2 m2Var2 = j0Var.f24345n;
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.f45205c0;
                    ug.s0 s0Var = new ug.s0(m2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                    s0Var.show();
                    s0Var.setOnHideListener(new t4(j0Var, 9));
                    return;
                }
                j0Var.o1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                z9 z9Var = new z9(j0Var.getContext());
                z9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(z9Var, a6.d(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(g6.x0(null, g6.f19972h5, false));
                frameLayout.addView(new p6(j0Var.getContext(), paint, j0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), a6.a(28.0f, 34.0f, 34.0f, 0.0f, 0.0f, 28, 0));
                ImageView imageView = new ImageView(j0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(g6.x0(null, g6.f20064m6, false));
                frameLayout.addView(imageView, a6.e(24, 24, 17));
                z9 z9Var2 = new z9(j0Var.getContext());
                z9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(z9Var2, a6.a(60.0f, 96.0f, 0.0f, 0.0f, 0.0f, 60, 0));
                FrameLayout frameLayout2 = new FrameLayout(j0Var.getContext());
                frameLayout2.addView(frameLayout, a6.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(g6.x0(null, g6.f20007j5, false));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, a6.t(-1, -2, 0, 24, 80, 24, 0));
                k9 k9Var = new k9((c6) null);
                TLRPC.Chat chat = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.f45205c0.replaceDialogId));
                k9Var.k(j0Var.currentAccount, chat);
                z9Var.e(chat, k9Var);
                k9 k9Var2 = new k9((c6) null);
                TLRPC.Chat chat2 = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.f45203a0));
                k9Var2.k(j0Var.currentAccount, chat2);
                z9Var2.e(chat2, k9Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.n(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new x(j0Var, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new r0.h(28));
                alertDialog$Builder2.o();
            } else {
                int i12 = canApplyBoost.floodWait;
                if (i12 != 0) {
                    ug.j.g(i12);
                }
            }
        }
    }

    public static void X(j0 j0Var, View view) {
        String str;
        sc J;
        int i10;
        HashSet hashSet = j0Var.f45226y0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f21539r.a(hashSet.contains(currentChannel), true);
            j0Var.L1();
        } else if (view instanceof g4) {
            if (j0Var.Y || ((i10 = j0Var.f45210h0) != 11 && i10 != 34)) {
                g4 g4Var = (g4) view;
                Object object = g4Var.getObject();
                if (g4Var.O) {
                    if (object instanceof TLRPC.User) {
                        long j10 = ((TLRPC.User) object).f19363id;
                        int i11 = -j0Var.T0;
                        j0Var.T0 = i11;
                        AndroidUtilities.shakeViewSpring(g4Var, i11);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getForcedFirstName(MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked()) {
                            J = new zc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = new zc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(j0Var, 0));
                        }
                        J.j();
                        return;
                    }
                    return;
                }
                if (hashSet.contains(object)) {
                    hashSet.remove(object);
                } else {
                    hashSet.add(object);
                }
                g4Var.c(hashSet.contains(object), true);
                j0Var.L1();
            }
        }
    }

    public static c6 g0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static c6 j1(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static androidx.emoji2.text.p v1(int i10, int i11) {
        ?? obj = new Object();
        obj.f1502a = 0;
        obj.d = null;
        obj.e = null;
        obj.f1505f = null;
        obj.f1503b = 0;
        obj.f1504c = 0;
        if (i10 == 0) {
            obj.f1503b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            obj.f1502a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 33) {
            obj.f1503b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            obj.f1502a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 2) {
            obj.f1503b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            obj.f1502a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 12) {
            obj.f1503b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            obj.f1502a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 13) {
            obj.f1503b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            obj.f1502a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 3) {
            obj.f1503b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            obj.f1502a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 4) {
            obj.f1503b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            obj.f1502a = R.drawable.msg_limit_chats;
            obj.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 5) {
            obj.f1503b = MessagesController.getInstance(i11).channelsLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).channelsLimitPremium;
            obj.f1502a = R.drawable.msg_limit_groups;
            obj.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 6) {
            obj.f1503b = 100;
            obj.f1504c = 200;
            obj.f1502a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            obj.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            obj.f1505f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return obj;
        } else if (i10 == 7) {
            obj.f1503b = 3;
            obj.f1504c = 4;
            obj.f1502a = R.drawable.msg_limit_accounts;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 11) {
            obj.f1503b = 0;
            obj.f1504c = 0;
            obj.f1502a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(obj.f1504c));
            obj.e = "";
            obj.f1505f = "";
            return obj;
        } else if (i10 == 14) {
            obj.f1503b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            obj.f1502a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", obj.f1503b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", obj.f1504c);
            obj.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f1504c);
            obj.f1505f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f1503b);
            return obj;
        } else if (i10 == 15) {
            obj.f1503b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            obj.f1502a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 == 16) {
            obj.f1503b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f1502a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1503b));
            return obj;
        } else if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return obj;
        } else {
            obj.f1503b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f1504c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f1502a = R.drawable.filled_limit_boost;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f1503b), Integer.valueOf(obj.f1504c));
            obj.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1504c));
            obj.f1505f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1503b));
            return obj;
        }
    }

    public static boolean w1(int i10) {
        if (i10 != 0 && i10 != 33 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
            return false;
        }
        return true;
    }

    @Override
    public final CharSequence A() {
        int i10;
        int i11 = this.f45210h0;
        if (i11 != 11) {
            if (i11 != 34) {
                if (i11 != 35) {
                    switch (i11) {
                        case 18:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
                        case 19:
                        case 30:
                            if (y1()) {
                                i10 = R.string.BoostGroup;
                            } else {
                                i10 = R.string.BoostChannel;
                            }
                            return LocaleController.getString(i10);
                        case 31:
                            return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
                        case 32:
                            return LocaleController.getString(R.string.BoostGroup);
                        default:
                            return LocaleController.getString(R.string.LimitReached);
                    }
                }
                return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
            }
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        return LocaleController.getString(R.string.ChannelInviteViaLink2);
    }

    public final void A1() {
        int i10;
        h0 h0Var = this.f45225x0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f45204b0;
        int i11 = tL_premium_boostsStatus.boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.f23223b++;
        h0Var.f23221a = w7.s.a((i11 - i10) / i12, 0.0f, 1.0f);
        h0Var.W = true;
        h0Var.f23222a0 = h0Var.f23236n;
        h0Var.g(i11, true);
        h0Var.I.requestLayout();
        h0Var.requestLayout();
    }

    public final boolean C1() {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.f45204b0, this.f45205c0.copy(), Long.valueOf(this.f45203a0));
        di.d dVar = this.S0;
        if (dVar != null) {
            TLRPC.ChatFull u12 = u1();
            int max = Math.max(u12.boosts_unrestrict - u12.boosts_applied, 0);
            if (max == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.b(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.m0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.f45206d0, transitionSet);
        i0 i0Var = this.f45206d0;
        ug.b bVar = i0Var.f45198c;
        int indexOfChild = i0Var.indexOfChild(i0Var.f45197b);
        j0 j0Var = i0Var.e;
        if (j0Var.f45207e0) {
            int indexOfChild2 = i0Var.indexOfChild(i0Var.d);
            i0Var.removeView(i0Var.d);
            i0Var.d.removeView(i0Var.f45196a);
            i0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(i0Var.getContext());
            i0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            i0Var.d.setWeightSum(1.0f);
            i0Var.d.addView(i0Var.f45196a, a6.o(-2, -2, 1.0f, 0));
            i0Var.d.addView(bVar, a6.t(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, a6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.f45196a);
            i0Var.removeView(i0Var.f45196a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.f45196a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            i0Var.f45196a.setTextSize(1, 20.0f);
            i0Var.f45196a.setTextColor(g6.w0(g6.G6, j0Var.resourcesProvider));
            i0Var.f45196a.setGravity(17);
            i0Var.addView(i0Var.f45196a, indexOfChild3, a6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.f45197b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.f45197b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.f45197b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.f45197b.getLineSpacingMultiplier() * 1.1f);
        i0Var.f45197b.setGravity(1);
        i0Var.f45197b.setTextColor(g6.w0(g6.G6, j0Var.resourcesProvider));
        i0Var.addView(i0Var.f45197b, indexOfChild, a6.t(-2, -2, 1, 24, -2, 24, 17));
        this.f45206d0.f45196a.setText(s1());
        TextView textView4 = this.f45206d0.f45197b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean y12 = y1();
        int i23 = this.f45210h0;
        if (i23 == 20) {
            if (y12) {
                i22 = R.string.GroupNeedBoostsForColorDescription;
            } else {
                i22 = R.string.ChannelNeedBoostsForColorDescription;
            }
            str = LocaleController.formatString(i22, Integer.valueOf(p1()));
        } else if (i23 == 24) {
            if (y12) {
                i21 = R.string.GroupNeedBoostsForProfileColorDescription;
            } else {
                i21 = R.string.ChannelNeedBoostsForProfileColorDescription;
            }
            str = LocaleController.formatString(i21, Integer.valueOf(p1()));
        } else if (i23 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i23 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i23 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i23 == 25) {
            if (y12) {
                i19 = R.string.GroupNeedBoostsForEmojiStatusDescription;
            } else {
                i19 = R.string.ChannelNeedBoostsForEmojiStatusDescription;
            }
            if (y12) {
                i20 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i20 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i19, Integer.valueOf(i20));
        } else if (i23 == 26) {
            if (y12) {
                i17 = R.string.GroupNeedBoostsForWearCollectiblesDescription;
            } else {
                i17 = R.string.ChannelNeedBoostsForWearCollectiblesDescription;
            }
            if (y12) {
                i18 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i18 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i17, Integer.valueOf(i18));
        } else if (i23 == 27) {
            if (y12) {
                i16 = R.string.GroupNeedBoostsForReplyIconDescription;
            } else {
                i16 = R.string.ChannelNeedBoostsForReplyIconDescription;
            }
            str = LocaleController.formatString(i16, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i23 == 28) {
            if (y12) {
                i14 = R.string.GroupNeedBoostsForProfileIconDescription;
            } else {
                i14 = R.string.ChannelNeedBoostsForProfileIconDescription;
            }
            if (y12) {
                i15 = messagesController.groupProfileBgIconLevelMin;
            } else {
                i15 = messagesController.channelProfileIconLevelMin;
            }
            str = LocaleController.formatString(i14, Integer.valueOf(i15));
        } else if (i23 == 22) {
            if (y12) {
                i12 = R.string.GroupNeedBoostsForWallpaperDescription;
            } else {
                i12 = R.string.ChannelNeedBoostsForWallpaperDescription;
            }
            if (y12) {
                i13 = messagesController.groupWallpaperLevelMin;
            } else {
                i13 = messagesController.channelWallpaperLevelMin;
            }
            str = LocaleController.formatString(i12, Integer.valueOf(i13));
        } else if (i23 == 23) {
            if (y12) {
                i10 = R.string.GroupNeedBoostsForCustomWallpaperDescription;
            } else {
                i10 = R.string.ChannelNeedBoostsForCustomWallpaperDescription;
            }
            if (y12) {
                i11 = messagesController.groupCustomWallpaperLevelMin;
            } else {
                i11 = messagesController.channelCustomWallpaperLevelMin;
            }
            str = LocaleController.formatString(i10, Integer.valueOf(i11));
        } else {
            str = null;
        }
        if (str == null) {
            str = r1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        L1();
        d10 d10Var = this.P0;
        d10Var.c(false);
        try {
            d10Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f45206d0.f45198c.a(this.f45205c0.boostCount, true);
        this.d.x0(0);
        if (i23 == 32) {
            this.f45206d0.f45198c.setVisibility(8);
        }
        return true;
    }

    public final void E1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f45223v0) {
                int i10 = R.string.RevokeLinkAlertChannel;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i10, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                int i11 = R.string.RevokeLinkAlert;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i11, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f45223v0) {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.web.c0(8, this, arrayList));
        a2Var.show();
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.w0(g6.f20139q7, this.resourcesProvider));
        }
    }

    public final void F1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.U0)) {
            str = this.U0;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.O0.f19216id);
            if (chatFull == null) {
                dismiss();
                return;
            } else if (this.O0.username != null) {
                str = "@" + this.O0.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported != null) {
                    str = tL_chatInviteExported.link;
                } else {
                    dismiss();
                    return;
                }
            }
        }
        String str2 = str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = this.f45226y0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f19363id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f19363id));
            }
            if (sendPaidMessagesStars >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i10 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f19363id));
            }
            g5.b0(this.currentAccount, arrayList4, 1, new ji.p1(this, 11));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f19363id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.f19363id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            AndroidUtilities.runOnUIThread(new w(this, 2));
        }
        dismiss();
    }

    public final void G1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.f45204b0 = tL_premium_boostsStatus;
        this.f45207e0 = z10;
        N1();
    }

    @Override
    public final void H(ow0 ow0Var) {
        int i10;
        Context context = ow0Var.getContext();
        di.d dVar = new di.d(context, this.resourcesProvider, true);
        this.G0 = dVar;
        dVar.setFlickeringLoading(true);
        this.G0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.G0.setOnClickListener(new u(this, 2));
        z zVar = new z(this, context, this.resourcesProvider);
        this.E0 = zVar;
        w7.c6.b(zVar, 0.02f, 1.2f);
        if (!this.f24346r && (i10 = this.f45210h0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            x50 x50Var = new x50(this, context, 11);
            this.L0 = x50Var;
            x50Var.setBackgroundColor(g6.w0(g6.f19972h5, this.resourcesProvider));
            ow0Var.addView(this.L0, a6.a(72.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        }
        z zVar2 = this.E0;
        float f7 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        ow0Var.addView(zVar2, a6.a(48.0f, f7, 0.0f, f7, 12.0f, -1, 80));
        int dp = AndroidUtilities.dp(72.0f);
        mm0 mm0Var = this.d;
        mm0Var.setPadding(0, 0, 0, dp);
        mm0Var.setClipToPadding(false);
        mm0Var.setClipChildren(false);
        mm0Var.setOnItemClickListener(new bi.d(this, 16));
        mm0Var.setOnItemLongClickListener(new x(this, 2));
        this.E0.f45314r.setOnClickListener(new bz0(22, this, context));
        this.E0.e.setOnClickListener(new u(this, 3));
        this.J0 = new rl0(mm0Var, true);
    }

    public final void H1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.f45205c0 = canApplyBoost;
        L1();
        M1();
    }

    public final void I1(long j10) {
        this.f45203a0 = j10;
        N1();
    }

    public final void J1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z10;
        this.O0 = chat;
        this.U0 = str;
        if (TextUtils.isEmpty(str) && !ChatObject.canUserDoAdminAction(chat, 3)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.Y = z10;
        this.B0 = new ArrayList(arrayList);
        this.C0 = arrayList2;
        this.D0 = arrayList3;
        HashSet hashSet = this.f45226y0;
        hashSet.clear();
        if (this.Y) {
            ArrayList arrayList4 = this.B0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f19363id))) {
                    hashSet.add(user);
                }
            }
        }
        N1();
        L1();
        int i11 = this.f45210h0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.B0.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    z zVar = this.E0;
                    if (zVar != null && zVar.getParent() != null) {
                        ((ViewGroup) this.E0.getParent()).removeView(this.E0);
                    }
                    x50 x50Var = this.L0;
                    if (x50Var != null && x50Var.getParent() != null) {
                        ((ViewGroup) this.L0.getParent()).removeView(this.L0);
                    }
                    mm0 mm0Var = this.d;
                    if (mm0Var != null) {
                        mm0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void K1() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        String str2;
        int i15;
        int i16;
        this.f45222u0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f45204b0;
        if (tL_premium_boostsStatus != null) {
            i10 = tL_premium_boostsStatus.level + 1;
        } else {
            i10 = 1;
        }
        if (this.f45210h0 == 31) {
            i10 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i17 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            if (peerColors != null) {
                i15 = peerColors.maxLevel(y1());
            } else {
                i15 = 0;
            }
            int max = Math.max(10, i15);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                i16 = peerColors2.maxLevel(y1());
            } else {
                i16 = 0;
            }
            int max2 = Math.max(max, i16);
            if (y1()) {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
            }
        }
        ArrayList arrayList = null;
        while (i10 <= i17) {
            boolean y12 = y1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!y12 && i10 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                e0 b10 = e0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
                b10.f45172f = true;
                arrayList2.add(b10);
                if (!y12) {
                    e0 b11 = e0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b11.f45172f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                if (peerColors3 != null) {
                    i11 = peerColors3.colorsAvailable(i10, false);
                } else {
                    i11 = 0;
                }
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                if (peerColors4 != null) {
                    i12 = peerColors4.colorsAvailable(i10, y12);
                } else {
                    i12 = 0;
                }
                if (!y12 && i11 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!y12 && i11 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_links, i11, "BoostFeatureReplyColor"));
                }
                if (!y12 && i10 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (i12 > 0) {
                    int i18 = R.drawable.menu_feature_color_profile;
                    if (y12) {
                        str2 = "BoostFeatureProfileColorGroup";
                    } else {
                        str2 = "BoostFeatureProfileColor";
                    }
                    arrayList2.add(e0.b(i18, i12, str2));
                }
                if (y12 && i10 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!y12 && i10 >= messagesController2.channelProfileIconLevelMin) || (y12 && i10 >= messagesController2.groupProfileBgIconLevelMin)) {
                    int i19 = R.drawable.menu_feature_cover;
                    if (y12) {
                        i14 = R.string.BoostFeatureProfileIconGroup;
                    } else {
                        i14 = R.string.BoostFeatureProfileIcon;
                    }
                    arrayList2.add(e0.a(i19, i14));
                }
                if (y12 && i10 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!y12 && i10 >= messagesController2.channelEmojiStatusLevelMin) || (y12 && i10 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new e0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!y12 && i10 >= messagesController2.channelWallpaperLevelMin) || (y12 && i10 >= messagesController2.groupWallpaperLevelMin)) {
                    int i20 = R.drawable.menu_feature_wallpaper;
                    if (y12) {
                        str = "BoostFeatureBackgroundGroup";
                    } else {
                        str = "BoostFeatureBackground";
                    }
                    arrayList2.add(e0.b(i20, 8, str));
                }
                if ((!y12 && i10 >= messagesController2.channelCustomWallpaperLevelMin) || (y12 && i10 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    int i21 = R.drawable.menu_feature_custombg;
                    if (y12) {
                        i13 = R.string.BoostFeatureCustomBackgroundGroup;
                    } else {
                        i13 = R.string.BoostFeatureCustomBackground;
                    }
                    arrayList2.add(e0.a(i21, i13));
                }
                if (!y12 && i10 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    e0 e0Var = (e0) arrayList.get(i22);
                    e0 e0Var2 = (e0) arrayList2.get(i22);
                    int i23 = e0Var.e;
                    if (e0Var2 != null && ((e0Var.f45172f && i23 > 2) || (e0Var.f45169a == e0Var2.f45169a && e0Var.f45170b == e0Var2.f45170b && TextUtils.equals(e0Var.f45171c, e0Var2.f45171c) && TextUtils.equals(e0Var.d, e0Var2.d) && i23 == e0Var2.e))) {
                    }
                }
                i10++;
            }
            ArrayList arrayList3 = this.f45222u0;
            arrayList3.add(new d0(i10, arrayList3.isEmpty()));
            this.f45222u0.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void L1() {
        int i10;
        if (this.f45212j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i11 = this.f45210h0;
        if (i11 != 19 && i11 != 32 && !z1()) {
            String str = null;
            HashSet hashSet = this.f45226y0;
            if (i11 != 11 && i11 != 34) {
                if (hashSet.size() > 0) {
                    if (i11 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i11 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.E0.b(str, true, true);
                    return;
                }
                z zVar = this.E0;
                zVar.h = false;
                zVar.d(true);
                return;
            }
            z zVar2 = this.E0;
            if (zVar2.G == null) {
                jr jrVar = new jr(zVar2.getContext(), null);
                zVar2.G = jrVar;
                jrVar.setGravity(3);
                jr jrVar2 = zVar2.G;
                int i12 = g6.Oh;
                int i13 = g6.Sh;
                ir irVar = jrVar2.f26455a;
                irVar.v = i12;
                irVar.f26072w = i13;
                irVar.f26055b = 0.8f;
                zVar2.setClipChildren(false);
                zVar2.addView(zVar2.G, a6.e(-1, 24, 16));
            }
            if (!this.Y) {
                this.E0.b(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.E0.b(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.E0.b(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            jr jrVar3 = this.E0.G;
            jrVar3.f26455a.c(hashSet.size(), true);
            this.E0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.f45205c0;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.E0.b(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            z zVar3 = this.E0;
            zVar3.h = false;
            zVar3.d(true);
            return;
        }
        di.d dVar = this.S0;
        if (z10) {
            if (ug.s.i()) {
                this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                z zVar4 = this.E0;
                if (y1()) {
                    i10 = R.string.BoostGroup;
                } else {
                    i10 = R.string.BoostChannel;
                }
                zVar4.b(LocaleController.getString(i10), true, true);
            }
            this.G0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
        } else if (canApplyBoost.isMaxLvl) {
            this.G0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.E0.b(LocaleController.getString(R.string.OK), true, true);
        } else if (ug.s.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.G0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
        } else {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.G0.g(LocaleController.getString(R.string.OK), true, true);
            this.E0.b(LocaleController.getString(R.string.OK), true, true);
        }
    }

    public final void M1() {
        int i10;
        int i11;
        String string;
        if (this.f45212j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i12 = this.f45210h0;
        if (i12 != 19 && i12 != 32 && !z1()) {
            if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !this.N0) {
                    this.E0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
                    androidx.emoji2.text.p pVar = this.M0;
                    if (pVar != null) {
                        int i13 = pVar.f1503b;
                        int i14 = i13 + 1;
                        int i15 = pVar.f1504c;
                        if (i14 == i15) {
                            this.E0.setIcon(R.raw.addone_icon);
                            return;
                        }
                        if (i13 != 0 && i15 != 0) {
                            float f7 = i15 / i13;
                            if (f7 >= 1.6f && f7 <= 2.5f) {
                                this.E0.setIcon(R.raw.double_icon);
                                return;
                            }
                        }
                        z zVar = this.E0;
                        zVar.f45316w.f30205p = null;
                        zVar.f45318y.setVisibility(8);
                        return;
                    }
                    z zVar2 = this.E0;
                    zVar2.f45316w.f30205p = null;
                    zVar2.f45318y.setVisibility(8);
                    return;
                }
                this.E0.d.setText(LocaleController.getString(R.string.OK));
                z zVar3 = this.E0;
                zVar3.f45316w.f30205p = null;
                zVar3.f45318y.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new br(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.E0.d.setText(spannableStringBuilder);
        } else if (ug.s.i()) {
            o0 o0Var = this.E0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.f45205c0;
            if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            } else {
                if (y1()) {
                    i11 = R.string.BoostGroup;
                } else {
                    i11 = R.string.BoostChannel;
                }
                string = LocaleController.getString(i11);
            }
            o0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.f45205c0;
            if (canApplyBoost2 != null && canApplyBoost2.isMaxLvl) {
                this.E0.d.setText(LocaleController.getString(R.string.OK));
            }
        } else {
            o0 o0Var2 = this.E0.d;
            if (y1()) {
                i10 = R.string.BoostGroup;
            } else {
                i10 = R.string.BoostChannel;
            }
            o0Var2.setText(LocaleController.getString(i10));
        }
    }

    public final void N1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.m0 = -1;
        this.f45216o0 = -1;
        this.f45217p0 = -1;
        this.f45218q0 = -1;
        this.Z = -1;
        this.f45219r0 = -1;
        this.f45221t0 = -1;
        this.f45213k0 = 1;
        this.f45214l0 = 0;
        int i10 = this.f45210h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 22 && i10 != 23 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 21 && i10 != 30 && i10 != 35) {
            if (i10 != 31 && i10 != 32) {
                if (!w1(i10)) {
                    if (i10 != 11 && i10 != 34) {
                        int i11 = this.f45213k0;
                        this.m0 = i11;
                        this.f45213k0 = i11 + 2;
                        this.f45215n0 = i11 + 1;
                    } else {
                        this.v = 0.24f;
                    }
                    if (this.I0) {
                        int i12 = this.f45213k0;
                        this.f45213k0 = i12 + 1;
                        this.f45218q0 = i12;
                    } else if (i10 != 11 || this.Y) {
                        if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.D0) == null || arrayList.isEmpty()) && ((arrayList2 = this.C0) == null || arrayList2.size() < this.B0.size())) || (arrayList3 = this.D0) == null || arrayList3.size() != 1 || (arrayList4 = this.C0) == null || arrayList4.size() != 1 || !this.Y)) {
                            int i13 = this.f45213k0;
                            this.f45216o0 = i13;
                            if (i10 != 11 && i10 != 34) {
                                if (i10 == 5) {
                                    this.f45213k0 = this.f45227z0.size() + i13;
                                } else {
                                    this.f45213k0 = this.f45211i0.size() + i13;
                                }
                            } else {
                                this.f45213k0 = this.B0.size() + i13;
                            }
                            this.f45217p0 = this.f45213k0;
                        }
                        if (this.f45217p0 - this.f45216o0 > 1) {
                            int i14 = this.f45213k0;
                            this.f45213k0 = i14 + 1;
                            this.f45219r0 = i14;
                        }
                    }
                }
            } else {
                this.v = 0.24f;
                K1();
                int i15 = this.f45213k0;
                this.f45216o0 = i15;
                int i16 = i15 + 1;
                this.f45213k0 = i16;
                this.f45221t0 = i15;
                int size = (this.f45222u0.size() - 1) + i16;
                this.f45213k0 = size;
                this.f45217p0 = size;
            }
        } else {
            if (i10 != 19 || ChatObject.hasAdminRights(t1())) {
                this.v = 0.24f;
                int i17 = this.f45213k0;
                this.f45213k0 = i17 + 1;
                this.Z = i17;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i18 = this.f45213k0;
                    this.f45213k0 = i18 + 1;
                    this.f45220s0 = i18;
                }
            }
            K1();
            int i19 = this.f45213k0;
            int i20 = i19 + 1;
            this.f45213k0 = i20;
            this.f45221t0 = i19;
            this.f45213k0 = (this.f45222u0.size() - 1) + i20;
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull u12;
        m2 m2Var;
        m2 m2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            m2 m2Var3 = this.f24345n;
            m2 lastFragment = m2Var3.getParentLayout().getLastFragment();
            m2 m2Var4 = null;
            if (lastFragment instanceof ah.a0) {
                List fragmentStack = m2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    m2Var = (m2) t8.b.g(2, fragmentStack);
                } else {
                    m2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    m2Var2 = (m2) t8.b.g(3, fragmentStack);
                } else {
                    m2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    m2Var4 = (m2) t8.b.g(4, fragmentStack);
                }
                if (m2Var instanceof zo) {
                    ((ActionBarLayout) m2Var3.getParentLayout()).a0(m2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (m2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) m2Var3.getParentLayout()).a0(m2Var2, false);
                    }
                    lastFragment.finishFragment();
                    ug.j.f(m2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                ug.j.f(m2Var2, chat, false);
            } else if ((lastFragment instanceof fo) && booleanValue) {
                ug.j.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof hd) && booleanValue) {
                List fragmentStack2 = m2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    m2 m2Var5 = (m2) fragmentStack2.get(size);
                    if (!(m2Var5 instanceof fo) && !(m2Var5 instanceof yy)) {
                        arrayList.add(m2Var5);
                    } else {
                        m2Var4 = m2Var5;
                        break;
                    }
                }
                if (m2Var4 != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ActionBarLayout) m2Var3.getParentLayout()).a0((m2) obj, false);
                    }
                    m2Var3.finishFragment();
                    dismiss();
                    ug.j.f(m2Var4, chat, true);
                }
            } else if (booleanValue) {
                kc kcVar = kc.F2;
                if (kcVar != null && kcVar.d) {
                    fo W9 = fo.W9(-chat.f19216id);
                    LaunchActivity.R().presentFragment(W9, false, false);
                    kc.w();
                    dismiss();
                    ug.j.f(W9, chat, true);
                    return;
                }
                List fragmentStack3 = m2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    m2Var4 = (m2) t8.b.g(2, fragmentStack3);
                }
                m2Var3.finishFragment();
                dismiss();
                if (m2Var4 instanceof fo) {
                    ug.j.f(m2Var4, chat, true);
                }
            } else {
                kc kcVar2 = kc.F2;
                if (kcVar2 != null && kcVar2.d) {
                    fo W92 = fo.W9(-chat.f19216id);
                    LaunchActivity.R().presentFragment(W92, false, false);
                    kc.w();
                    dismiss();
                    ug.j.f(W92, chat, false);
                    return;
                }
                dismiss();
                ug.j.f(LaunchActivity.R(), chat, false);
            }
        } else if (i10 == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.f45205c0 != null) {
                this.f45204b0.boosts += intValue;
                if (this.f45210h0 == 32 && (u12 = u1()) != null) {
                    u12.boosts_applied += intValue;
                }
                A1();
                G1(tL_premium_boostsStatus, this.f45207e0);
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.f45205c0;
                if (this.f45204b0.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canApplyBoost.isMaxLvl = z10;
                canApplyBoost.boostedNow = true;
                canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                if (C1()) {
                    sc Q = new zc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                    Q.f29102j = 4000;
                    Q.k(true);
                }
            }
        } else if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    public final void n1(final ga0 ga0Var, boolean z10) {
        if (ga0Var.c() && !z10) {
            return;
        }
        ga0Var.setLoading(true);
        MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.f45203a0, this.f45205c0.slot, new Utilities.Callback(this) {
            public final j0 f45433b;

            {
                this.f45433b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f45203a0, new q4(this.f45433b, ga0Var, (TL_stories.TL_premium_myBoosts) obj, 10));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        ga0 ga0Var2 = ga0Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new s9.b(2, this.f45433b, ga0Var2), intValue * 1000);
                                return;
                            }
                            ug.j.g(intValue);
                        }
                        ga0Var2.setLoading(false);
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final j0 f45433b;

            {
                this.f45433b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f45203a0, new q4(this.f45433b, ga0Var, (TL_stories.TL_premium_myBoosts) obj, 10));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        ga0 ga0Var2 = ga0Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new s9.b(2, this.f45433b, ga0Var2), intValue * 1000);
                                return;
                            }
                            ug.j.g(intValue);
                        }
                        ga0Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void o1() {
        if (this.G0.isAttachedToWindow()) {
            n1(this.G0, false);
            return;
        }
        di.d dVar = this.S0;
        if (dVar != null && dVar.isAttachedToWindow()) {
            n1(dVar, false);
        } else {
            n1(this.E0, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    public int p1() {
        return 0;
    }

    public final String q1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f45204b0;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.f45204b0.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f45203a0;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (!TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
        }
        return a1.g.o(j10, "https://t.me/boost/?c=");
    }

    public final String r1(boolean z10) {
        String str;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        if (this.f45210h0 == 32) {
            TLRPC.Chat t12 = t1();
            TLRPC.ChatFull u12 = u1();
            int max = Math.max(u12.boosts_unrestrict - u12.boosts_applied, 0);
            if (t12 == null) {
                str2 = "";
            } else {
                str2 = t12.title;
            }
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", max, str2);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f45203a0));
        if (chat == null) {
            if (y1()) {
                i19 = R.string.AccDescrGroup;
            } else {
                i19 = R.string.AccDescrChannel;
            }
            str = LocaleController.getString(i19);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f45204b0;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z1() && this.f45204b0.next_level_boosts != 0 && z10) {
            if (y1()) {
                i18 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
            } else {
                i18 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.f45204b0;
            int i20 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i20, Integer.valueOf(i20)));
        } else if (z11 && this.f45205c0.alreadyActive) {
            if (this.f45204b0.level == 1) {
                if (y1()) {
                    i17 = R.string.GroupBoostsJustReachedLevel1;
                } else {
                    i17 = R.string.ChannelBoostsJustReachedLevel1;
                }
                return LocaleController.formatString(i17, new Object[0]);
            }
            if (y1()) {
                i16 = R.string.GroupBoostsJustReachedLevelNext;
            } else {
                i16 = R.string.ChannelBoostsJustReachedLevelNext;
            }
            return LocaleController.formatString(i16, Integer.valueOf(this.f45204b0.level), LocaleController.formatPluralString("BoostStories", this.f45204b0.level, new Object[0]));
        } else if (this.f45205c0.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.f45204b0;
            if (tL_premium_boostsStatus3.level == 0) {
                if (y1()) {
                    i15 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i15 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.f45204b0;
                int i21 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i15, str, LocaleController.formatPluralString("MoreBoosts", i21, Integer.valueOf(i21)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (y1()) {
                    i14 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i14 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i14, Integer.valueOf(this.f45204b0.level), LocaleController.formatPluralString("BoostStories", this.f45204b0.level + 1, new Object[0]));
            } else {
                if (y1()) {
                    i13 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i13 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.f45204b0;
                int i22 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i22, Integer.valueOf(i22)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.f45204b0;
            if (tL_premium_boostsStatus6.level == 0) {
                if (y1()) {
                    i12 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i12 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.f45204b0;
                int i23 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i23, Integer.valueOf(i23)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (y1()) {
                    i11 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i11 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i11, Integer.valueOf(this.f45204b0.level), LocaleController.formatPluralString("BoostStories", this.f45204b0.level + 1, new Object[0]));
            } else {
                if (y1()) {
                    i10 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i10 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.f45204b0;
                int i24 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i24, Integer.valueOf(i24)));
            }
        }
    }

    public final String s1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f45204b0;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.f45205c0.alreadyActive) {
            if (y1()) {
                i15 = R.string.BoostGroup;
            } else {
                i15 = R.string.BoostChannel;
            }
            return LocaleController.getString(i15);
        }
        boolean z10 = this.f45207e0;
        int i16 = this.f45210h0;
        if (z10) {
            if (i16 == 32) {
                if (y1()) {
                    i14 = R.string.BoostGroup;
                } else {
                    i14 = R.string.BoostChannel;
                }
                return LocaleController.getString(i14);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f45203a0));
            if (this.f45205c0.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            if (y1()) {
                i13 = R.string.BoostGroup;
            } else {
                i13 = R.string.BoostChannel;
            }
            return LocaleController.getString(i13);
        } else if (i16 == 32) {
            if (y1()) {
                i12 = R.string.BoostGroup;
            } else {
                i12 = R.string.BoostChannel;
            }
            return LocaleController.getString(i12);
        } else if (this.f45205c0.alreadyActive) {
            if (y1()) {
                i11 = R.string.YouBoostedGroup;
            } else {
                i11 = R.string.YouBoostedChannel;
            }
            return LocaleController.getString(i11);
        } else {
            if (y1()) {
                i10 = R.string.BoostingEnableStoriesForGroup;
            } else {
                i10 = R.string.BoostingEnableStoriesForChannel;
            }
            return LocaleController.getString(i10);
        }
    }

    public final TLRPC.Chat t1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f45203a0));
    }

    public final TLRPC.ChatFull u1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.f45203a0);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        return new c0(this);
    }

    public final boolean x1() {
        int i10 = this.f45210h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 27 && i10 != 28 && i10 != 23 && i10 != 30 && i10 != 35) {
            return false;
        }
        return true;
    }

    public final boolean y1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f45203a0)));
    }

    public final boolean z1() {
        if (x1() && ChatObject.hasAdminRights(t1())) {
            return true;
        }
        return false;
    }
}
