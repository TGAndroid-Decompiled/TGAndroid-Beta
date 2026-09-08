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
import bi.r4;
import di.pc;
import di.r6;
import di.s7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.co;
import org.telegram.ui.t50;
import org.telegram.ui.uy;
import org.telegram.ui.wy0;
import org.telegram.ui.xo;
import w7.x5;
import w7.z5;
public class k0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int V0 = 0;
    public final ArrayList A0;
    public ArrayList B0;
    public ArrayList C0;
    public ArrayList D0;
    public a0 E0;
    public final TextView F0;
    public di.d G0;
    public Runnable H0;
    public boolean I0;
    public qk0 J0;
    public final n2 K0;
    public t50 L0;
    public androidx.emoji2.text.p M0;
    public boolean N0;
    public TLRPC.Chat O0;
    public final r00 P0;
    public Runnable Q0;
    public int R0;
    public final di.d S0;
    public int T0;
    public String U0;
    public int X;
    public boolean Y;
    public int Z;
    public long f46158a0;
    public TL_stories.TL_premium_boostsStatus f46159b0;
    public ChannelBoostsController.CanApplyBoost f46160c0;
    public j0 f46161d0;
    public boolean f46162e0;
    public boolean f46163f0;
    public org.telegram.ui.Cells.t1 f46164g0;
    public final int f46165h0;
    public final ArrayList f46166i0;
    public boolean f46167j0;
    public int f46168k0;
    public int f46169l0;
    public int m0;
    public int f46170n0;
    public int f46171o0;
    public int f46172p0;
    public int f46173q0;
    public int f46174r0;
    public int f46175s0;
    public int f46176t0;
    public ArrayList f46177u0;
    public boolean f46178v0;
    public int f46179w0;
    public i0 f46180x0;
    public final HashSet f46181y0;
    public final ArrayList f46182z0;

    public k0(int i10, int i11, Context context, n2 n2Var, f6 f6Var) {
        super(context, n2Var, false, v1(i10), f6Var);
        this.Z = -1;
        this.f46163f0 = false;
        this.f46166i0 = new ArrayList();
        this.f46169l0 = -1;
        this.m0 = -1;
        this.f46170n0 = -1;
        this.f46171o0 = -1;
        this.f46172p0 = -1;
        this.f46173q0 = -1;
        this.f46174r0 = -1;
        this.f46175s0 = -1;
        this.f46176t0 = -1;
        this.f46179w0 = -1;
        this.f46181y0 = new HashSet();
        this.f46182z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.I0 = false;
        this.R0 = 0;
        this.T0 = -4;
        fixNavigationBar(j6.v0(j6.f20761h5, this.resourcesProvider));
        this.K0 = n2Var;
        this.currentAccount = i11;
        this.f46165h0 = i10;
        N();
        M1();
        if (i10 == 2) {
            this.I0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v(this, 0));
        } else if (i10 == 5) {
            this.I0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v(this, 2));
        }
        L1();
        if (i10 == 32 || w1()) {
            r00 r00Var = new r00(getContext());
            this.P0 = r00Var;
            this.container.addView(r00Var, x5.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            t50 t50Var = this.L0;
            if (t50Var != null) {
                ((ViewGroup) t50Var.getParent()).removeView(this.L0);
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
            textView.setTextColor(j6.v0(j6.Sh, f6Var));
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = j6.v0(j6.Oh, f6Var);
            int k10 = i0.a.k(j6.v0(j6.f20690d6, f6Var), 120);
            textView.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        }
        if (i10 == 32) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            di.d dVar = new di.d(context, f6Var, true);
            this.S0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, x5.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new w(this, 3));
        }
        if (i10 != 19 && i10 != 18) {
            return;
        }
        this.containerView.post(new w(this, 4));
    }

    public static String A1(int i10) {
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

    public static void C1(n2 n2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j3, boolean z10) {
        if (tL_premium_boostsStatus != null && canApplyBoost != null && n2Var.getContext() != null) {
            k0 k0Var = new k0(32, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, n2Var.getResourceProvider());
            k0Var.G1(canApplyBoost);
            k0Var.F1(tL_premium_boostsStatus, true);
            k0Var.H1(j3);
            if (z10) {
                n2Var.showDialog(k0Var);
            } else {
                k0Var.show();
            }
        }
    }

    public static void P(k0 k0Var, ArrayList arrayList, TLRPC.User user) {
        k0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(k0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(k0Var.currentAccount).deleteParticipantFromChat(chat.f19896id, user);
        }
    }

    public static void Q(k0 k0Var, ArrayList arrayList) {
        k0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(k0Var, 1), 64);
        }
    }

    public static void R(k0 k0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        ll0 ll0Var = k0Var.d;
        ArrayList arrayList2 = k0Var.A0;
        arrayList2.clear();
        ArrayList arrayList3 = k0Var.f46182z0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        k0Var.I0 = false;
        k0Var.J0.b(k0Var.f46170n0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 < ll0Var.getChildCount()) {
                if (ll0Var.getChildAt(i13) instanceof j0) {
                    i11 = ll0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            } else {
                i11 = 0;
                break;
            }
        }
        k0Var.M1();
        if (k0Var.f46169l0 >= 0 && i11 != 0) {
            ((s4.c0) ll0Var.getLayoutManager()).h1(k0Var.f46169l0 + 1, i11);
        }
        if (k0Var.M0 == null) {
            k0Var.M0 = u1(k0Var.f46165h0, k0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), k0Var.M0.f1375b);
        i0 i0Var = k0Var.f46180x0;
        if (i0Var != null) {
            i0Var.g(max, false);
            k0Var.f46180x0.setBagePosition(max / k0Var.M0.f1376c);
            i0 i0Var2 = k0Var.f46180x0;
            i0Var2.H = true;
            i0Var2.requestLayout();
        }
    }

    public static f6 R0(k0 k0Var) {
        return k0Var.resourcesProvider;
    }

    public static void S(k0 k0Var) {
        long j3;
        int i10 = k0Var.f46165h0;
        HashSet hashSet = k0Var.f46181y0;
        if (k0Var.f46167j0) {
            n2 n2Var = k0Var.K0;
            if (n2Var != 0) {
                ?? obj = new Object();
                obj.f21169a = true;
                n2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
            } else {
                return;
            }
        } else if (i10 == 19 || i10 == 32 || k0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f46160c0;
            if (canApplyBoost.canApply) {
                k0Var.E0.f46269r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = k0Var.f46160c0;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    w wVar = new w(k0Var, 1);
                    if (canApplyBoost2.needSelector) {
                        j3 = 300;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(wVar, j3);
                    return;
                }
                return;
            } else if (canApplyBoost.alreadyActive && ug.t.i() && !k0Var.f46160c0.isMaxLvl) {
                ug.j.i(k0Var.f46158a0, k0Var);
                return;
            } else {
                k0Var.dismiss();
                return;
            }
        }
        if (i10 != 11 && i10 != 34) {
            if (!hashSet.isEmpty()) {
                if (i10 == 2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        k0Var.f46166i0.add((TLRPC.Chat) it.next());
                    }
                    k0Var.D1(arrayList);
                } else if (i10 == 5) {
                    TLRPC.User user = MessagesController.getInstance(k0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(k0Var.currentAccount).getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((TLRPC.Chat) it2.next());
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k0Var.getContext(), 0, k0Var.resourcesProvider);
                    String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                    b2Var.R = formatPluralString;
                    if (arrayList2.size() == 1) {
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
                    } else {
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
                    }
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new s50(k0Var, arrayList2, user, 9));
                    b2Var.show();
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(j6.v0(j6.f20925q7, k0Var.resourcesProvider));
                    }
                }
            }
        } else if (hashSet.isEmpty()) {
            k0Var.dismiss();
        } else {
            k0Var.E1(null);
        }
    }

    public static void U(k0 k0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                int currentTime = (ConnectionsManager.getInstance(k0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
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
            AndroidUtilities.runOnUIThread(new r11(k0Var, arrayList, min, tL_messages_inactiveChats, 17));
        }
    }

    public static f6 U0(k0 k0Var) {
        return k0Var.resourcesProvider;
    }

    public static void V(k0 k0Var, Context context) {
        int i10;
        n2 n2Var = k0Var.K0;
        int i11 = k0Var.f46165h0;
        if (i11 != 11 && i11 != 34) {
            if (i11 != 19 && i11 != 32 && !k0Var.y1()) {
                if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                    if (!UserConfig.getInstance(k0Var.currentAccount).isPremium() && !MessagesController.getInstance(k0Var.currentAccount).premiumFeaturesBlocked() && !k0Var.N0) {
                        if (n2Var != null) {
                            if (n2Var.getVisibleDialog() != null) {
                                n2Var.getVisibleDialog().dismiss();
                            }
                            n2Var.presentFragment(new PremiumPreviewFragment(0, A1(i11)));
                            k0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    k0Var.dismiss();
                    return;
                }
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                return;
            }
            ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f46160c0;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(k0Var.currentAccount).isPremium() && ug.t.i()) {
                    ug.j.i(k0Var.f46158a0, k0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, k0Var.resourcesProvider);
                String string = LocaleController.getString(R.string.PremiumNeeded);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                b2Var.R = string;
                if (k0Var.x1()) {
                    i10 = R.string.PremiumNeededForBoostingGroup;
                } else {
                    i10 = R.string.PremiumNeededForBoosting;
                }
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new y(k0Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r9.i(27));
                alertDialog$Builder.o();
                return;
            }
            boolean z10 = canApplyBoost.canApply;
            if (z10 && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && ug.t.i()) {
                    k0Var.f46163f0 = true;
                    k0Var.f46180x0.f24078d0 = false;
                    n2 n2Var2 = k0Var.f24676n;
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = k0Var.f46160c0;
                    ug.t0 t0Var = new ug.t0(n2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                    t0Var.show();
                    t0Var.setOnHideListener(new r4(k0Var, 9));
                    return;
                }
                k0Var.n1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                x9 x9Var = new x9(k0Var.getContext());
                x9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(x9Var, x5.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(j6.w0(null, j6.f20761h5, false));
                frameLayout.addView(new r6(k0Var.getContext(), paint, k0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), x5.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(k0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(j6.w0(null, j6.f20854m6, false));
                frameLayout.addView(imageView, x5.e(24, 24, 17));
                x9 x9Var2 = new x9(k0Var.getContext());
                x9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(x9Var2, x5.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(k0Var.getContext());
                frameLayout2.addView(frameLayout, x5.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(j6.w0(null, j6.f20797j5, false));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, x5.t(-1, -2, 0, 24, 80, 24, 0));
                i9 i9Var = new i9((f6) null);
                TLRPC.Chat chat = MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(-k0Var.f46160c0.replaceDialogId));
                i9Var.k(k0Var.currentAccount, chat);
                x9Var.e(chat, i9Var);
                i9 i9Var2 = new i9((f6) null);
                TLRPC.Chat chat2 = MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(-k0Var.f46158a0));
                i9Var2.k(k0Var.currentAccount, chat2);
                x9Var2.e(chat2, i9Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.n(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new y(k0Var, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new r9.i(28));
                alertDialog$Builder2.o();
            } else {
                int i12 = canApplyBoost.floodWait;
                if (i12 != 0) {
                    ug.j.g(i12);
                }
            }
        }
    }

    public static void W(k0 k0Var, View view) {
        String str;
        qc J;
        int i10;
        HashSet hashSet = k0Var.f46181y0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f22341r.a(hashSet.contains(currentChannel), true);
            k0Var.K1();
        } else if (view instanceof f4) {
            if (k0Var.Y || ((i10 = k0Var.f46165h0) != 11 && i10 != 34)) {
                f4 f4Var = (f4) view;
                Object object = f4Var.getObject();
                if (f4Var.O) {
                    if (object instanceof TLRPC.User) {
                        long j3 = ((TLRPC.User) object).f20043id;
                        int i11 = -k0Var.T0;
                        k0Var.T0 = i11;
                        AndroidUtilities.shakeViewSpring(f4Var, i11);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j3 >= 0) {
                            str = UserObject.getForcedFirstName(MessagesController.getInstance(k0Var.currentAccount).getUser(Long.valueOf(j3)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(k0Var.currentAccount).premiumFeaturesBlocked()) {
                            J = new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(k0Var, 0));
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
                f4Var.c(hashSet.contains(object), true);
                k0Var.K1();
            }
        }
    }

    public static f6 i1(k0 k0Var) {
        return k0Var.resourcesProvider;
    }

    public static androidx.emoji2.text.p u1(int i10, int i11) {
        ?? obj = new Object();
        obj.f1374a = 0;
        obj.d = null;
        obj.f1377e = null;
        obj.f1378f = null;
        obj.f1375b = 0;
        obj.f1376c = 0;
        if (i10 == 0) {
            obj.f1375b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            obj.f1374a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 33) {
            obj.f1375b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            obj.f1374a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 2) {
            obj.f1375b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            obj.f1374a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 12) {
            obj.f1375b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            obj.f1374a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 13) {
            obj.f1375b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            obj.f1374a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 3) {
            obj.f1375b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            obj.f1374a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 4) {
            obj.f1375b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            obj.f1374a = R.drawable.msg_limit_chats;
            obj.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 5) {
            obj.f1375b = MessagesController.getInstance(i11).channelsLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).channelsLimitPremium;
            obj.f1374a = R.drawable.msg_limit_groups;
            obj.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 6) {
            obj.f1375b = 100;
            obj.f1376c = 200;
            obj.f1374a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            obj.f1377e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            obj.f1378f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return obj;
        } else if (i10 == 7) {
            obj.f1375b = 3;
            obj.f1376c = 4;
            obj.f1374a = R.drawable.msg_limit_accounts;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 11) {
            obj.f1375b = 0;
            obj.f1376c = 0;
            obj.f1374a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(obj.f1376c));
            obj.f1377e = "";
            obj.f1378f = "";
            return obj;
        } else if (i10 == 14) {
            obj.f1375b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            obj.f1374a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", obj.f1375b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", obj.f1376c);
            obj.f1377e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f1376c);
            obj.f1378f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f1375b);
            return obj;
        } else if (i10 == 15) {
            obj.f1375b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            obj.f1374a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 == 16) {
            obj.f1375b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f1374a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1375b));
            return obj;
        } else if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return obj;
        } else {
            obj.f1375b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f1376c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f1374a = R.drawable.filled_limit_boost;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f1375b), Integer.valueOf(obj.f1376c));
            obj.f1377e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1376c));
            obj.f1378f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1375b));
            return obj;
        }
    }

    public static boolean v1(int i10) {
        if (i10 != 0 && i10 != 33 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
            return false;
        }
        return true;
    }

    public final boolean B1() {
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
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.f46159b0, this.f46160c0.copy(), Long.valueOf(this.f46158a0));
        di.d dVar = this.S0;
        if (dVar != null) {
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
            if (max == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.b(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.f46161d0, transitionSet);
        j0 j0Var = this.f46161d0;
        ug.b bVar = j0Var.f46150c;
        int indexOfChild = j0Var.indexOfChild(j0Var.f46149b);
        k0 k0Var = j0Var.f46151e;
        if (k0Var.f46162e0) {
            int indexOfChild2 = j0Var.indexOfChild(j0Var.d);
            j0Var.removeView(j0Var.d);
            j0Var.d.removeView(j0Var.f46148a);
            j0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(j0Var.getContext());
            j0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            j0Var.d.setWeightSum(1.0f);
            j0Var.d.addView(j0Var.f46148a, x5.o(-2, -2, 1.0f, 0));
            j0Var.d.addView(bVar, x5.t(-2, -2, 48, 0, 2, 0, 0));
            j0Var.addView(j0Var.d, indexOfChild2, x5.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = j0Var.indexOfChild(j0Var.f46148a);
            j0Var.removeView(j0Var.f46148a);
            TextView textView = new TextView(j0Var.getContext());
            j0Var.f46148a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            j0Var.f46148a.setTextSize(1, 20.0f);
            j0Var.f46148a.setTextColor(j6.v0(j6.G6, k0Var.resourcesProvider));
            j0Var.f46148a.setGravity(17);
            j0Var.addView(j0Var.f46148a, indexOfChild3, x5.t(-2, -2, 1, 0, 22, 0, 0));
        }
        j0Var.removeView(j0Var.f46149b);
        TextView textView2 = new TextView(j0Var.getContext());
        j0Var.f46149b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = j0Var.f46149b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), j0Var.f46149b.getLineSpacingMultiplier() * 1.1f);
        j0Var.f46149b.setGravity(1);
        j0Var.f46149b.setTextColor(j6.v0(j6.G6, k0Var.resourcesProvider));
        j0Var.addView(j0Var.f46149b, indexOfChild, x5.t(-2, -2, 1, 24, -2, 24, 17));
        this.f46161d0.f46148a.setText(r1());
        TextView textView4 = this.f46161d0.f46149b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i23 = this.f46165h0;
        if (i23 == 20) {
            if (x12) {
                i22 = R.string.GroupNeedBoostsForColorDescription;
            } else {
                i22 = R.string.ChannelNeedBoostsForColorDescription;
            }
            str = LocaleController.formatString(i22, Integer.valueOf(o1()));
        } else if (i23 == 24) {
            if (x12) {
                i21 = R.string.GroupNeedBoostsForProfileColorDescription;
            } else {
                i21 = R.string.ChannelNeedBoostsForProfileColorDescription;
            }
            str = LocaleController.formatString(i21, Integer.valueOf(o1()));
        } else if (i23 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i23 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i23 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i23 == 25) {
            if (x12) {
                i19 = R.string.GroupNeedBoostsForEmojiStatusDescription;
            } else {
                i19 = R.string.ChannelNeedBoostsForEmojiStatusDescription;
            }
            if (x12) {
                i20 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i20 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i19, Integer.valueOf(i20));
        } else if (i23 == 26) {
            if (x12) {
                i17 = R.string.GroupNeedBoostsForWearCollectiblesDescription;
            } else {
                i17 = R.string.ChannelNeedBoostsForWearCollectiblesDescription;
            }
            if (x12) {
                i18 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i18 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i17, Integer.valueOf(i18));
        } else if (i23 == 27) {
            if (x12) {
                i16 = R.string.GroupNeedBoostsForReplyIconDescription;
            } else {
                i16 = R.string.ChannelNeedBoostsForReplyIconDescription;
            }
            str = LocaleController.formatString(i16, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i23 == 28) {
            if (x12) {
                i14 = R.string.GroupNeedBoostsForProfileIconDescription;
            } else {
                i14 = R.string.ChannelNeedBoostsForProfileIconDescription;
            }
            if (x12) {
                i15 = messagesController.groupProfileBgIconLevelMin;
            } else {
                i15 = messagesController.channelProfileIconLevelMin;
            }
            str = LocaleController.formatString(i14, Integer.valueOf(i15));
        } else if (i23 == 22) {
            if (x12) {
                i12 = R.string.GroupNeedBoostsForWallpaperDescription;
            } else {
                i12 = R.string.ChannelNeedBoostsForWallpaperDescription;
            }
            if (x12) {
                i13 = messagesController.groupWallpaperLevelMin;
            } else {
                i13 = messagesController.channelWallpaperLevelMin;
            }
            str = LocaleController.formatString(i12, Integer.valueOf(i13));
        } else if (i23 == 23) {
            if (x12) {
                i10 = R.string.GroupNeedBoostsForCustomWallpaperDescription;
            } else {
                i10 = R.string.ChannelNeedBoostsForCustomWallpaperDescription;
            }
            if (x12) {
                i11 = messagesController.groupCustomWallpaperLevelMin;
            } else {
                i11 = messagesController.channelCustomWallpaperLevelMin;
            }
            str = LocaleController.formatString(i10, Integer.valueOf(i11));
        } else {
            str = null;
        }
        if (str == null) {
            str = q1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        K1();
        r00 r00Var = this.P0;
        r00Var.c(false);
        try {
            r00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f46161d0.f46150c.a(this.f46160c0.boostCount, true);
        this.d.x0(0);
        if (i23 == 32) {
            this.f46161d0.f46150c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f46178v0) {
                int i10 = R.string.RevokeLinkAlertChannel;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i10, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                int i11 = R.string.RevokeLinkAlert;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i11, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f46178v0) {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new x(0, this, arrayList));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(j6.v0(j6.f20925q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.U0)) {
            str = this.U0;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.O0.f19896id);
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
        HashSet hashSet = this.f46181y0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f20043id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f20043id));
            }
            if (sendPaidMessagesStars >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i10 = 0;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f20043id));
            }
            e5.c0(this.currentAccount, arrayList4, 1, new org.telegram.ui.web.b1(this, 8));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f20043id))).longValue();
            }
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.f20043id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z10 = true;
            }
            hashMap2 = hashMap;
            it2 = it3;
        }
        if (!z10) {
            AndroidUtilities.runOnUIThread(new w(this, 2));
        }
        dismiss();
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.f46159b0 = tL_premium_boostsStatus;
        this.f46162e0 = z10;
        M1();
    }

    @Override
    public final void G(ov0 ov0Var) {
        int i10;
        Context context = ov0Var.getContext();
        di.d dVar = new di.d(context, this.resourcesProvider, true);
        this.G0 = dVar;
        dVar.setFlickeringLoading(true);
        this.G0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.G0.setOnClickListener(new u(this, 2));
        a0 a0Var = new a0(this, context, this.resourcesProvider);
        this.E0 = a0Var;
        z5.b(a0Var, 0.02f, 1.2f);
        if (!this.f24677r && (i10 = this.f46165h0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            t50 t50Var = new t50(this, context, 11);
            this.L0 = t50Var;
            t50Var.setBackgroundColor(j6.v0(j6.f20761h5, this.resourcesProvider));
            ov0Var.addView(this.L0, x5.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        a0 a0Var2 = this.E0;
        float f7 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        ov0Var.addView(a0Var2, x5.d(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        ll0 ll0Var = this.d;
        ll0Var.setPadding(0, 0, 0, dp);
        ll0Var.setClipToPadding(false);
        ll0Var.setClipChildren(false);
        ll0Var.setOnItemClickListener(new bi.d(this, 16));
        ll0Var.setOnItemLongClickListener(new y(this, 2));
        this.E0.f46269r.setOnClickListener(new wy0(16, this, context));
        this.E0.f46266e.setOnClickListener(new u(this, 3));
        this.J0 = new qk0(ll0Var, true);
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.f46160c0 = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j3) {
        this.f46158a0 = j3;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
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
        HashSet hashSet = this.f46181y0;
        hashSet.clear();
        if (this.Y) {
            ArrayList arrayList4 = this.B0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f20043id))) {
                    hashSet.add(user);
                }
            }
        }
        M1();
        K1();
        int i11 = this.f46165h0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.B0.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    a0 a0Var = this.E0;
                    if (a0Var != null && a0Var.getParent() != null) {
                        ((ViewGroup) this.E0.getParent()).removeView(this.E0);
                    }
                    t50 t50Var = this.L0;
                    if (t50Var != null && t50Var.getParent() != null) {
                        ((ViewGroup) this.L0.getParent()).removeView(this.L0);
                    }
                    ll0 ll0Var = this.d;
                    if (ll0Var != null) {
                        ll0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void J1() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        String str2;
        int i15;
        int i16;
        this.f46177u0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46159b0;
        if (tL_premium_boostsStatus != null) {
            i10 = tL_premium_boostsStatus.level + 1;
        } else {
            i10 = 1;
        }
        if (this.f46165h0 == 31) {
            i10 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i17 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            if (peerColors != null) {
                i15 = peerColors.maxLevel(x1());
            } else {
                i15 = 0;
            }
            int max = Math.max(10, i15);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                i16 = peerColors2.maxLevel(x1());
            } else {
                i16 = 0;
            }
            int max2 = Math.max(max, i16);
            if (x1()) {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
            }
        }
        ArrayList arrayList = null;
        while (i10 <= i17) {
            boolean x12 = x1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!x12 && i10 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                f0 b10 = f0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
                b10.f46123f = true;
                arrayList2.add(b10);
                if (!x12) {
                    f0 b11 = f0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b11.f46123f = true;
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
                    i12 = peerColors4.colorsAvailable(i10, x12);
                } else {
                    i12 = 0;
                }
                if (!x12 && i11 > 0) {
                    arrayList2.add(f0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!x12 && i11 > 0) {
                    arrayList2.add(f0.b(R.drawable.menu_feature_links, i11, "BoostFeatureReplyColor"));
                }
                if (!x12 && i10 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (i12 > 0) {
                    int i18 = R.drawable.menu_feature_color_profile;
                    if (x12) {
                        str2 = "BoostFeatureProfileColorGroup";
                    } else {
                        str2 = "BoostFeatureProfileColor";
                    }
                    arrayList2.add(f0.b(i18, i12, str2));
                }
                if (x12 && i10 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!x12 && i10 >= messagesController2.channelProfileIconLevelMin) || (x12 && i10 >= messagesController2.groupProfileBgIconLevelMin)) {
                    int i19 = R.drawable.menu_feature_cover;
                    if (x12) {
                        i14 = R.string.BoostFeatureProfileIconGroup;
                    } else {
                        i14 = R.string.BoostFeatureProfileIcon;
                    }
                    arrayList2.add(f0.a(i19, i14));
                }
                if (x12 && i10 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!x12 && i10 >= messagesController2.channelEmojiStatusLevelMin) || (x12 && i10 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new f0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!x12 && i10 >= messagesController2.channelWallpaperLevelMin) || (x12 && i10 >= messagesController2.groupWallpaperLevelMin)) {
                    int i20 = R.drawable.menu_feature_wallpaper;
                    if (x12) {
                        str = "BoostFeatureBackgroundGroup";
                    } else {
                        str = "BoostFeatureBackground";
                    }
                    arrayList2.add(f0.b(i20, 8, str));
                }
                if ((!x12 && i10 >= messagesController2.channelCustomWallpaperLevelMin) || (x12 && i10 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    int i21 = R.drawable.menu_feature_custombg;
                    if (x12) {
                        i13 = R.string.BoostFeatureCustomBackgroundGroup;
                    } else {
                        i13 = R.string.BoostFeatureCustomBackground;
                    }
                    arrayList2.add(f0.a(i21, i13));
                }
                if (!x12 && i10 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    f0 f0Var = (f0) arrayList.get(i22);
                    f0 f0Var2 = (f0) arrayList2.get(i22);
                    int i23 = f0Var.f46122e;
                    if (f0Var2 != null && ((f0Var.f46123f && i23 > 2) || (f0Var.f46119a == f0Var2.f46119a && f0Var.f46120b == f0Var2.f46120b && TextUtils.equals(f0Var.f46121c, f0Var2.f46121c) && TextUtils.equals(f0Var.d, f0Var2.d) && i23 == f0Var2.f46122e))) {
                    }
                }
                i10++;
            }
            ArrayList arrayList3 = this.f46177u0;
            arrayList3.add(new e0(i10, arrayList3.isEmpty()));
            this.f46177u0.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void K1() {
        int i10;
        if (this.f46167j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i11 = this.f46165h0;
        if (i11 != 19 && i11 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.f46181y0;
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
                a0 a0Var = this.E0;
                a0Var.h = false;
                a0Var.d(true);
                return;
            }
            a0 a0Var2 = this.E0;
            if (a0Var2.G == null) {
                vq vqVar = new vq(a0Var2.getContext(), null);
                a0Var2.G = vqVar;
                vqVar.setGravity(3);
                vq vqVar2 = a0Var2.G;
                int i12 = j6.Oh;
                int i13 = j6.Sh;
                uq uqVar = vqVar2.f31989a;
                uqVar.v = i12;
                uqVar.f30981w = i13;
                uqVar.f30963b = 0.8f;
                a0Var2.setClipChildren(false);
                a0Var2.addView(a0Var2.G, x5.e(-1, 24, 16));
            }
            if (!this.Y) {
                this.E0.b(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.E0.b(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.E0.b(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            vq vqVar3 = this.E0.G;
            vqVar3.f31989a.c(hashSet.size(), true);
            this.E0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.f46160c0;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.E0.b(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            a0 a0Var3 = this.E0;
            a0Var3.h = false;
            a0Var3.d(true);
            return;
        }
        di.d dVar = this.S0;
        if (z10) {
            if (ug.t.i()) {
                this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                a0 a0Var4 = this.E0;
                if (x1()) {
                    i10 = R.string.BoostGroup;
                } else {
                    i10 = R.string.BoostChannel;
                }
                a0Var4.b(LocaleController.getString(i10), true, true);
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
        } else if (ug.t.i()) {
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

    public final void L1() {
        int i10;
        int i11;
        String string;
        if (this.f46167j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i12 = this.f46165h0;
        if (i12 != 19 && i12 != 32 && !y1()) {
            if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !this.N0) {
                    this.E0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
                    androidx.emoji2.text.p pVar = this.M0;
                    if (pVar != null) {
                        int i13 = pVar.f1375b;
                        int i14 = i13 + 1;
                        int i15 = pVar.f1376c;
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
                        a0 a0Var = this.E0;
                        a0Var.f46271w.f31539p = null;
                        a0Var.f46273y.setVisibility(8);
                        return;
                    }
                    a0 a0Var2 = this.E0;
                    a0Var2.f46271w.f31539p = null;
                    a0Var2.f46273y.setVisibility(8);
                    return;
                }
                this.E0.d.setText(LocaleController.getString(R.string.OK));
                a0 a0Var3 = this.E0;
                a0Var3.f46271w.f31539p = null;
                a0Var3.f46273y.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new nq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.E0.d.setText(spannableStringBuilder);
        } else if (ug.t.i()) {
            q0 q0Var = this.E0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.f46160c0;
            if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            } else {
                if (x1()) {
                    i11 = R.string.BoostGroup;
                } else {
                    i11 = R.string.BoostChannel;
                }
                string = LocaleController.getString(i11);
            }
            q0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.f46160c0;
            if (canApplyBoost2 != null && canApplyBoost2.isMaxLvl) {
                this.E0.d.setText(LocaleController.getString(R.string.OK));
            }
        } else {
            q0 q0Var2 = this.E0.d;
            if (x1()) {
                i10 = R.string.BoostGroup;
            } else {
                i10 = R.string.BoostChannel;
            }
            q0Var2.setText(LocaleController.getString(i10));
        }
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.m0 = -1;
        this.f46171o0 = -1;
        this.f46172p0 = -1;
        this.f46173q0 = -1;
        this.Z = -1;
        this.f46174r0 = -1;
        this.f46176t0 = -1;
        this.f46168k0 = 1;
        this.f46169l0 = 0;
        int i10 = this.f46165h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 22 && i10 != 23 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 21 && i10 != 30 && i10 != 35) {
            if (i10 != 31 && i10 != 32) {
                if (!v1(i10)) {
                    if (i10 != 11 && i10 != 34) {
                        int i11 = this.f46168k0;
                        this.m0 = i11;
                        this.f46168k0 = i11 + 2;
                        this.f46170n0 = i11 + 1;
                    } else {
                        this.v = 0.24f;
                    }
                    if (this.I0) {
                        int i12 = this.f46168k0;
                        this.f46168k0 = i12 + 1;
                        this.f46173q0 = i12;
                    } else if (i10 != 11 || this.Y) {
                        if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.D0) == null || arrayList.isEmpty()) && ((arrayList2 = this.C0) == null || arrayList2.size() < this.B0.size())) || (arrayList3 = this.D0) == null || arrayList3.size() != 1 || (arrayList4 = this.C0) == null || arrayList4.size() != 1 || !this.Y)) {
                            int i13 = this.f46168k0;
                            this.f46171o0 = i13;
                            if (i10 != 11 && i10 != 34) {
                                if (i10 == 5) {
                                    this.f46168k0 = this.f46182z0.size() + i13;
                                } else {
                                    this.f46168k0 = this.f46166i0.size() + i13;
                                }
                            } else {
                                this.f46168k0 = this.B0.size() + i13;
                            }
                            this.f46172p0 = this.f46168k0;
                        }
                        if (this.f46172p0 - this.f46171o0 > 1) {
                            int i14 = this.f46168k0;
                            this.f46168k0 = i14 + 1;
                            this.f46174r0 = i14;
                        }
                    }
                }
            } else {
                this.v = 0.24f;
                J1();
                int i15 = this.f46168k0;
                this.f46171o0 = i15;
                int i16 = i15 + 1;
                this.f46168k0 = i16;
                this.f46176t0 = i15;
                int size = (this.f46177u0.size() - 1) + i16;
                this.f46168k0 = size;
                this.f46172p0 = size;
            }
        } else {
            if (i10 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i17 = this.f46168k0;
                this.f46168k0 = i17 + 1;
                this.Z = i17;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i18 = this.f46168k0;
                    this.f46168k0 = i18 + 1;
                    this.f46175s0 = i18;
                }
            }
            J1();
            int i19 = this.f46168k0;
            int i20 = i19 + 1;
            this.f46168k0 = i20;
            this.f46176t0 = i19;
            this.f46168k0 = (this.f46177u0.size() - 1) + i20;
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull t12;
        n2 n2Var;
        n2 n2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            n2 n2Var3 = this.f24676n;
            n2 lastFragment = n2Var3.getParentLayout().getLastFragment();
            n2 n2Var4 = null;
            if (lastFragment instanceof ah.b0) {
                List fragmentStack = n2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    n2Var = (n2) p6.g(2, fragmentStack);
                } else {
                    n2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    n2Var2 = (n2) p6.g(3, fragmentStack);
                } else {
                    n2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    n2Var4 = (n2) p6.g(4, fragmentStack);
                }
                if (n2Var instanceof xo) {
                    ((ActionBarLayout) n2Var3.getParentLayout()).a0(n2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (n2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) n2Var3.getParentLayout()).a0(n2Var2, false);
                    }
                    lastFragment.finishFragment();
                    ug.j.f(n2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                ug.j.f(n2Var2, chat, false);
            } else if ((lastFragment instanceof co) && booleanValue) {
                ug.j.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof bd) && booleanValue) {
                List fragmentStack2 = n2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    n2 n2Var5 = (n2) fragmentStack2.get(size);
                    if (!(n2Var5 instanceof co) && !(n2Var5 instanceof uy)) {
                        arrayList.add(n2Var5);
                    } else {
                        n2Var4 = n2Var5;
                        break;
                    }
                }
                if (n2Var4 != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ActionBarLayout) n2Var3.getParentLayout()).a0((n2) obj, false);
                    }
                    n2Var3.finishFragment();
                    dismiss();
                    ug.j.f(n2Var4, chat, true);
                }
            } else if (booleanValue) {
                pc pcVar = pc.F2;
                if (pcVar != null && pcVar.d) {
                    co R9 = co.R9(-chat.f19896id);
                    LaunchActivity.R().presentFragment(R9, false, false);
                    pc.x();
                    dismiss();
                    ug.j.f(R9, chat, true);
                    return;
                }
                List fragmentStack3 = n2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    n2Var4 = (n2) p6.g(2, fragmentStack3);
                }
                n2Var3.finishFragment();
                dismiss();
                if (n2Var4 instanceof co) {
                    ug.j.f(n2Var4, chat, true);
                }
            } else {
                pc pcVar2 = pc.F2;
                if (pcVar2 != null && pcVar2.d) {
                    co R92 = co.R9(-chat.f19896id);
                    LaunchActivity.R().presentFragment(R92, false, false);
                    pc.x();
                    dismiss();
                    ug.j.f(R92, chat, false);
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
            if (tL_premium_boostsStatus != null && this.f46160c0 != null) {
                this.f46159b0.boosts += intValue;
                if (this.f46165h0 == 32 && (t12 = t1()) != null) {
                    t12.boosts_applied += intValue;
                }
                z1();
                F1(tL_premium_boostsStatus, this.f46162e0);
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.f46160c0;
                if (this.f46159b0.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canApplyBoost.isMaxLvl = z10;
                canApplyBoost.boostedNow = true;
                canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                if (B1()) {
                    qc Q = new yc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                    Q.f29706j = 4000;
                    Q.k(true);
                }
            }
        } else if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    public final void m1(final g90 g90Var, boolean z10) {
        if (g90Var.c() && !z10) {
            return;
        }
        g90Var.setLoading(true);
        MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.f46158a0, this.f46160c0.slot, new Utilities.Callback(this) {
            public final k0 f46396b;

            {
                this.f46396b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f46158a0, new s7(this.f46396b, g90Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        g90 g90Var2 = g90Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(19, this.f46396b, g90Var2), intValue * 1000);
                                return;
                            }
                            ug.j.g(intValue);
                        }
                        g90Var2.setLoading(false);
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final k0 f46396b;

            {
                this.f46396b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f46158a0, new s7(this.f46396b, g90Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        g90 g90Var2 = g90Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(19, this.f46396b, g90Var2), intValue * 1000);
                                return;
                            }
                            ug.j.g(intValue);
                        }
                        g90Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void n1() {
        if (this.G0.isAttachedToWindow()) {
            m1(this.G0, false);
            return;
        }
        di.d dVar = this.S0;
        if (dVar != null && dVar.isAttachedToWindow()) {
            m1(dVar, false);
        } else {
            m1(this.E0, false);
        }
    }

    public int o1() {
        return 0;
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

    public final String p1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46159b0;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.f46159b0.boost_url;
        }
        int i10 = this.currentAccount;
        long j3 = -this.f46158a0;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        if (!TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
        }
        return a4.a.o(j3, "https://t.me/boost/?c=");
    }

    public final String q1(boolean z10) {
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
        if (this.f46165h0 == 32) {
            TLRPC.Chat s12 = s1();
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
            if (s12 == null) {
                str2 = "";
            } else {
                str2 = s12.title;
            }
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", max, str2);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46158a0));
        if (chat == null) {
            if (x1()) {
                i19 = R.string.AccDescrGroup;
            } else {
                i19 = R.string.AccDescrChannel;
            }
            str = LocaleController.getString(i19);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46159b0;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y1() && this.f46159b0.next_level_boosts != 0 && z10) {
            if (x1()) {
                i18 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
            } else {
                i18 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.f46159b0;
            int i20 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i20, Integer.valueOf(i20)));
        } else if (z11 && this.f46160c0.alreadyActive) {
            if (this.f46159b0.level == 1) {
                if (x1()) {
                    i17 = R.string.GroupBoostsJustReachedLevel1;
                } else {
                    i17 = R.string.ChannelBoostsJustReachedLevel1;
                }
                return LocaleController.formatString(i17, new Object[0]);
            }
            if (x1()) {
                i16 = R.string.GroupBoostsJustReachedLevelNext;
            } else {
                i16 = R.string.ChannelBoostsJustReachedLevelNext;
            }
            return LocaleController.formatString(i16, Integer.valueOf(this.f46159b0.level), LocaleController.formatPluralString("BoostStories", this.f46159b0.level, new Object[0]));
        } else if (this.f46160c0.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.f46159b0;
            if (tL_premium_boostsStatus3.level == 0) {
                if (x1()) {
                    i15 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i15 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.f46159b0;
                int i21 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i15, str, LocaleController.formatPluralString("MoreBoosts", i21, Integer.valueOf(i21)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (x1()) {
                    i14 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i14 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i14, Integer.valueOf(this.f46159b0.level), LocaleController.formatPluralString("BoostStories", this.f46159b0.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i13 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i13 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.f46159b0;
                int i22 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i22, Integer.valueOf(i22)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.f46159b0;
            if (tL_premium_boostsStatus6.level == 0) {
                if (x1()) {
                    i12 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i12 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.f46159b0;
                int i23 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i23, Integer.valueOf(i23)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (x1()) {
                    i11 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i11 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i11, Integer.valueOf(this.f46159b0.level), LocaleController.formatPluralString("BoostStories", this.f46159b0.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i10 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i10 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.f46159b0;
                int i24 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i24, Integer.valueOf(i24)));
            }
        }
    }

    public final String r1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46159b0;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.f46160c0.alreadyActive) {
            if (x1()) {
                i15 = R.string.BoostGroup;
            } else {
                i15 = R.string.BoostChannel;
            }
            return LocaleController.getString(i15);
        }
        boolean z10 = this.f46162e0;
        int i16 = this.f46165h0;
        if (z10) {
            if (i16 == 32) {
                if (x1()) {
                    i14 = R.string.BoostGroup;
                } else {
                    i14 = R.string.BoostChannel;
                }
                return LocaleController.getString(i14);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46158a0));
            if (this.f46160c0.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            if (x1()) {
                i13 = R.string.BoostGroup;
            } else {
                i13 = R.string.BoostChannel;
            }
            return LocaleController.getString(i13);
        } else if (i16 == 32) {
            if (x1()) {
                i12 = R.string.BoostGroup;
            } else {
                i12 = R.string.BoostChannel;
            }
            return LocaleController.getString(i12);
        } else if (this.f46160c0.alreadyActive) {
            if (x1()) {
                i11 = R.string.YouBoostedGroup;
            } else {
                i11 = R.string.YouBoostedChannel;
            }
            return LocaleController.getString(i11);
        } else {
            if (x1()) {
                i10 = R.string.BoostingEnableStoriesForGroup;
            } else {
                i10 = R.string.BoostingEnableStoriesForChannel;
            }
            return LocaleController.getString(i10);
        }
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46158a0));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.f46158a0);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        return new d0(this);
    }

    public final boolean w1() {
        int i10 = this.f46165h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 27 && i10 != 28 && i10 != 23 && i10 != 30 && i10 != 35) {
            return false;
        }
        return true;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46158a0)));
    }

    @Override
    public final CharSequence y() {
        int i10;
        int i11 = this.f46165h0;
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
                            if (x1()) {
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

    public final boolean y1() {
        if (w1() && ChatObject.hasAdminRights(s1())) {
            return true;
        }
        return false;
    }

    public final void z1() {
        int i10;
        i0 i0Var = this.f46180x0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46159b0;
        int i11 = tL_premium_boostsStatus.boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        i0Var.f24074b++;
        i0Var.f24072a = w7.p.a((i11 - i10) / i12, 0.0f, 1.0f);
        i0Var.W = true;
        i0Var.f24073a0 = i0Var.f24088n;
        i0Var.g(i11, true);
        i0Var.I.requestLayout();
        i0Var.requestLayout();
    }
}
