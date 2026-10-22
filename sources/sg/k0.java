package sg;

import ai.a4;
import ai.wa;
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
import ei.g6;
import ei.vb;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.cy;
import org.telegram.ui.io;
import org.telegram.ui.qn;
import org.telegram.ui.v10;
import w7.b6;
import w7.z5;
public class k0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int V0 = 0;
    public final ArrayList A0;
    public ArrayList B0;
    public ArrayList C0;
    public ArrayList D0;
    public a0 E0;
    public final TextView F0;
    public ei.d G0;
    public Runnable H0;
    public boolean I0;
    public ol0 J0;
    public final n2 K0;
    public v10 L0;
    public androidx.emoji2.text.p M0;
    public boolean N0;
    public TLRPC.Chat O0;
    public final z00 P0;
    public Runnable Q0;
    public int R0;
    public final ei.d S0;
    public int T0;
    public String U0;
    public int X;
    public boolean Y;
    public int Z;
    public long f46289a0;
    public TL_stories.TL_premium_boostsStatus f46290b0;
    public ChannelBoostsController.CanApplyBoost f46291c0;
    public j0 f46292d0;
    public boolean f46293e0;
    public boolean f46294f0;
    public org.telegram.ui.Cells.u1 f46295g0;
    public final int f46296h0;
    public final ArrayList f46297i0;
    public boolean f46298j0;
    public int f46299k0;
    public int f46300l0;
    public int m0;
    public int f46301n0;
    public int f46302o0;
    public int f46303p0;
    public int f46304q0;
    public int f46305r0;
    public int f46306s0;
    public int f46307t0;
    public ArrayList f46308u0;
    public boolean f46309v0;
    public int f46310w0;
    public i0 f46311x0;
    public final HashSet f46312y0;
    public final ArrayList f46313z0;

    public k0(int i10, int i11, Context context, n2 n2Var, d6 d6Var) {
        super(context, n2Var, false, w1(i10), d6Var);
        this.Z = -1;
        this.f46294f0 = false;
        this.f46297i0 = new ArrayList();
        this.f46300l0 = -1;
        this.m0 = -1;
        this.f46301n0 = -1;
        this.f46302o0 = -1;
        this.f46303p0 = -1;
        this.f46304q0 = -1;
        this.f46305r0 = -1;
        this.f46306s0 = -1;
        this.f46307t0 = -1;
        this.f46310w0 = -1;
        this.f46312y0 = new HashSet();
        this.f46313z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.I0 = false;
        this.R0 = 0;
        this.T0 = -4;
        fixNavigationBar(h6.w0(h6.f21064h5, this.resourcesProvider));
        this.K0 = n2Var;
        this.currentAccount = i11;
        this.f46296h0 = i10;
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
            z00 z00Var = new z00(getContext());
            this.P0 = z00Var;
            this.container.addView(z00Var, z5.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            v10 v10Var = this.L0;
            if (v10Var != null) {
                ((ViewGroup) v10Var.getParent()).removeView(this.L0);
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
            textView.setTextColor(h6.w0(h6.Sh, d6Var));
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int w02 = h6.w0(h6.Oh, d6Var);
            int o10 = i0.a.o(h6.w0(h6.f20993d6, d6Var), 120);
            textView.setBackground(h6.j0(dp, dp, dp, dp, w02, o10, o10));
        }
        if (i10 == 32) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            ei.d dVar = new ei.d(context, d6Var, true);
            this.S0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, z5.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
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

    public static void D1(n2 n2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus != null && canApplyBoost != null && n2Var.getContext() != null) {
            k0 k0Var = new k0(32, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, n2Var.getResourceProvider());
            k0Var.H1(canApplyBoost);
            k0Var.G1(tL_premium_boostsStatus, true);
            k0Var.I1(j10);
            if (z10) {
                n2Var.showDialog(k0Var);
            } else {
                k0Var.show();
            }
        }
    }

    public static void Q(k0 k0Var, ArrayList arrayList, TLRPC.User user) {
        k0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(k0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(k0Var.currentAccount).deleteParticipantFromChat(chat.f20279id, user);
        }
    }

    public static void R(k0 k0Var, ArrayList arrayList) {
        k0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(k0Var, 1), 64);
        }
    }

    public static void S(k0 k0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        jm0 jm0Var = k0Var.d;
        ArrayList arrayList2 = k0Var.A0;
        arrayList2.clear();
        ArrayList arrayList3 = k0Var.f46313z0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        k0Var.I0 = false;
        k0Var.J0.b(k0Var.f46301n0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 < jm0Var.getChildCount()) {
                if (jm0Var.getChildAt(i13) instanceof j0) {
                    i11 = jm0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            } else {
                i11 = 0;
                break;
            }
        }
        k0Var.N1();
        if (k0Var.f46300l0 >= 0 && i11 != 0) {
            ((s4.b0) jm0Var.getLayoutManager()).h1(k0Var.f46300l0 + 1, i11);
        }
        if (k0Var.M0 == null) {
            k0Var.M0 = v1(k0Var.f46296h0, k0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), k0Var.M0.f3115b);
        i0 i0Var = k0Var.f46311x0;
        if (i0Var != null) {
            i0Var.g(max, false);
            k0Var.f46311x0.setBagePosition(max / k0Var.M0.f3116c);
            i0 i0Var2 = k0Var.f46311x0;
            i0Var2.H = true;
            i0Var2.requestLayout();
        }
    }

    public static d6 S0(k0 k0Var) {
        return k0Var.resourcesProvider;
    }

    public static void T(k0 k0Var) {
        long j10;
        int i10 = k0Var.f46296h0;
        HashSet hashSet = k0Var.f46312y0;
        if (k0Var.f46298j0) {
            n2 n2Var = k0Var.K0;
            if (n2Var != 0) {
                ?? obj = new Object();
                obj.f21559a = true;
                n2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
            } else {
                return;
            }
        } else if (i10 == 19 || i10 == 32 || k0Var.z1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f46291c0;
            if (canApplyBoost.canApply) {
                k0Var.E0.f46391r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = k0Var.f46291c0;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    w wVar = new w(k0Var, 1);
                    if (canApplyBoost2.needSelector) {
                        j10 = 300;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(wVar, j10);
                    return;
                }
                return;
            } else if (canApplyBoost.alreadyActive && ug.r.i() && !k0Var.f46291c0.isMaxLvl) {
                ug.i.i(k0Var.f46289a0, k0Var);
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
                        k0Var.f46297i0.add((TLRPC.Chat) it.next());
                    }
                    k0Var.E1(arrayList);
                } else if (i10 == 5) {
                    TLRPC.User user = MessagesController.getInstance(k0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(k0Var.currentAccount).getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((TLRPC.Chat) it2.next());
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k0Var.getContext(), 0, k0Var.resourcesProvider);
                    String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
                    b2 b2Var = alertDialog$Builder.f20608a;
                    b2Var.R = formatPluralString;
                    if (arrayList2.size() == 1) {
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
                    } else {
                        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
                    }
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ry(k0Var, arrayList2, user, 11));
                    b2Var.show();
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(h6.w0(h6.f21231q7, k0Var.resourcesProvider));
                    }
                }
            }
        } else if (hashSet.isEmpty()) {
            k0Var.dismiss();
        } else {
            k0Var.F1(null);
        }
    }

    public static void V(k0 k0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
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
            AndroidUtilities.runOnUIThread(new cz0(k0Var, arrayList, min, tL_messages_inactiveChats, 21, false));
        }
    }

    public static d6 V0(k0 k0Var) {
        return k0Var.resourcesProvider;
    }

    public static void W(k0 k0Var, Context context) {
        int i10;
        n2 n2Var = k0Var.K0;
        int i11 = k0Var.f46296h0;
        if (i11 != 11 && i11 != 34) {
            if (i11 != 19 && i11 != 32 && !k0Var.z1()) {
                if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                    if (!UserConfig.getInstance(k0Var.currentAccount).isPremium() && !MessagesController.getInstance(k0Var.currentAccount).premiumFeaturesBlocked() && !k0Var.N0) {
                        if (n2Var != null) {
                            if (n2Var.getVisibleDialog() != null) {
                                n2Var.getVisibleDialog().dismiss();
                            }
                            n2Var.presentFragment(new PremiumPreviewFragment(0, B1(i11)));
                            k0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    k0Var.dismiss();
                    return;
                }
                AndroidUtilities.addToClipboard(k0Var.q1());
                k0Var.dismiss();
                return;
            }
            ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.f46291c0;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(k0Var.currentAccount).isPremium() && ug.r.i()) {
                    ug.i.i(k0Var.f46289a0, k0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, k0Var.resourcesProvider);
                String string = LocaleController.getString(R.string.PremiumNeeded);
                b2 b2Var = alertDialog$Builder.f20608a;
                b2Var.R = string;
                if (k0Var.y1()) {
                    i10 = R.string.PremiumNeededForBoostingGroup;
                } else {
                    i10 = R.string.PremiumNeededForBoosting;
                }
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new x(k0Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qg.f0(29));
                alertDialog$Builder.o();
                return;
            }
            boolean z10 = canApplyBoost.canApply;
            if (z10 && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && ug.r.i()) {
                    k0Var.f46294f0 = true;
                    k0Var.f46311x0.f24289d0 = false;
                    n2 n2Var2 = k0Var.f24885n;
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = k0Var.f46291c0;
                    ug.r0 r0Var = new ug.r0(n2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                    r0Var.show();
                    r0Var.setOnHideListener(new ai.bb(k0Var, 12));
                    return;
                }
                k0Var.o1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                w9 w9Var = new w9(k0Var.getContext());
                w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(w9Var, z5.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(h6.x0(null, h6.f21064h5, false));
                frameLayout.addView(new g6(k0Var.getContext(), paint, k0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), z5.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(k0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(h6.x0(null, h6.f21156m6, false));
                frameLayout.addView(imageView, z5.e(24, 24, 17));
                w9 w9Var2 = new w9(k0Var.getContext());
                w9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(w9Var2, z5.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(k0Var.getContext());
                frameLayout2.addView(frameLayout, z5.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(h6.x0(null, h6.f21099j5, false));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, z5.t(-1, -2, 0, 24, 80, 24, 0));
                h9 h9Var = new h9((d6) null);
                TLRPC.Chat chat = MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(-k0Var.f46291c0.replaceDialogId));
                h9Var.k(k0Var.currentAccount, chat);
                w9Var.e(chat, h9Var);
                h9 h9Var2 = new h9((d6) null);
                TLRPC.Chat chat2 = MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(-k0Var.f46289a0));
                h9Var2.k(k0Var.currentAccount, chat2);
                w9Var2.e(chat2, h9Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.n(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new x(k0Var, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new y(0));
                alertDialog$Builder2.o();
            } else {
                int i12 = canApplyBoost.floodWait;
                if (i12 != 0) {
                    ug.i.g(i12);
                }
            }
        }
    }

    public static void X(k0 k0Var, View view) {
        String str;
        qc J;
        int i10;
        HashSet hashSet = k0Var.f46312y0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f22626r.a(hashSet.contains(currentChannel), true);
            k0Var.L1();
        } else if (view instanceof f4) {
            if (k0Var.Y || ((i10 = k0Var.f46296h0) != 11 && i10 != 34)) {
                f4 f4Var = (f4) view;
                Object object = f4Var.getObject();
                if (f4Var.O) {
                    if (object instanceof TLRPC.User) {
                        long j10 = ((TLRPC.User) object).f20426id;
                        int i11 = -k0Var.T0;
                        k0Var.T0 = i11;
                        AndroidUtilities.shakeViewSpring(f4Var, i11);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getForcedFirstName(MessagesController.getInstance(k0Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(k0Var.currentAccount).premiumFeaturesBlocked()) {
                            J = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(k0Var, 0));
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
                k0Var.L1();
            }
        }
    }

    public static d6 g0(k0 k0Var) {
        return k0Var.resourcesProvider;
    }

    public static d6 j1(k0 k0Var) {
        return k0Var.resourcesProvider;
    }

    public static androidx.emoji2.text.p v1(int i10, int i11) {
        ?? obj = new Object();
        obj.f3114a = 0;
        obj.d = null;
        obj.e = null;
        obj.f3117f = null;
        obj.f3115b = 0;
        obj.f3116c = 0;
        if (i10 == 0) {
            obj.f3115b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            obj.f3114a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 33) {
            obj.f3115b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            obj.f3114a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 2) {
            obj.f3115b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            obj.f3114a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 12) {
            obj.f3115b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            obj.f3114a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 13) {
            obj.f3115b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            obj.f3114a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 3) {
            obj.f3115b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            obj.f3114a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 4) {
            obj.f3115b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            obj.f3114a = R.drawable.msg_limit_chats;
            obj.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 5) {
            obj.f3115b = MessagesController.getInstance(i11).channelsLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).channelsLimitPremium;
            obj.f3114a = R.drawable.msg_limit_groups;
            obj.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 6) {
            obj.f3115b = 100;
            obj.f3116c = 200;
            obj.f3114a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            obj.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            obj.f3117f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return obj;
        } else if (i10 == 7) {
            obj.f3115b = 3;
            obj.f3116c = 4;
            obj.f3114a = R.drawable.msg_limit_accounts;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 11) {
            obj.f3115b = 0;
            obj.f3116c = 0;
            obj.f3114a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(obj.f3116c));
            obj.e = "";
            obj.f3117f = "";
            return obj;
        } else if (i10 == 14) {
            obj.f3115b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            obj.f3114a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", obj.f3115b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", obj.f3116c);
            obj.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f3116c);
            obj.f3117f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f3115b);
            return obj;
        } else if (i10 == 15) {
            obj.f3115b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            obj.f3114a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 == 16) {
            obj.f3115b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f3114a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f3115b));
            return obj;
        } else if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return obj;
        } else {
            obj.f3115b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f3116c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f3114a = R.drawable.filled_limit_boost;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f3115b), Integer.valueOf(obj.f3116c));
            obj.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f3116c));
            obj.f3117f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f3115b));
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
        int i11 = this.f46296h0;
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
        i0 i0Var = this.f46311x0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46290b0;
        int i11 = tL_premium_boostsStatus.boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        i0Var.f24285b++;
        i0Var.f24283a = w7.r.a((i11 - i10) / i12, 0.0f, 1.0f);
        i0Var.W = true;
        i0Var.f24284a0 = i0Var.f24298n;
        i0Var.g(i11, true);
        i0Var.I.requestLayout();
        i0Var.requestLayout();
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
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.f46290b0, this.f46291c0.copy(), Long.valueOf(this.f46289a0));
        ei.d dVar = this.S0;
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
        TransitionManager.beginDelayedTransition(this.f46292d0, transitionSet);
        j0 j0Var = this.f46292d0;
        ug.b bVar = j0Var.f46281c;
        int indexOfChild = j0Var.indexOfChild(j0Var.f46280b);
        k0 k0Var = j0Var.e;
        if (k0Var.f46293e0) {
            int indexOfChild2 = j0Var.indexOfChild(j0Var.d);
            j0Var.removeView(j0Var.d);
            j0Var.d.removeView(j0Var.f46279a);
            j0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(j0Var.getContext());
            j0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            j0Var.d.setWeightSum(1.0f);
            j0Var.d.addView(j0Var.f46279a, z5.o(-2, -2, 1.0f, 0));
            j0Var.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
            j0Var.addView(j0Var.d, indexOfChild2, z5.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = j0Var.indexOfChild(j0Var.f46279a);
            j0Var.removeView(j0Var.f46279a);
            TextView textView = new TextView(j0Var.getContext());
            j0Var.f46279a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            j0Var.f46279a.setTextSize(1, 20.0f);
            j0Var.f46279a.setTextColor(h6.w0(h6.G6, k0Var.resourcesProvider));
            j0Var.f46279a.setGravity(17);
            j0Var.addView(j0Var.f46279a, indexOfChild3, z5.t(-2, -2, 1, 0, 22, 0, 0));
        }
        j0Var.removeView(j0Var.f46280b);
        TextView textView2 = new TextView(j0Var.getContext());
        j0Var.f46280b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = j0Var.f46280b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), j0Var.f46280b.getLineSpacingMultiplier() * 1.1f);
        j0Var.f46280b.setGravity(1);
        j0Var.f46280b.setTextColor(h6.w0(h6.G6, k0Var.resourcesProvider));
        j0Var.addView(j0Var.f46280b, indexOfChild, z5.t(-2, -2, 1, 24, -2, 24, 17));
        this.f46292d0.f46279a.setText(s1());
        TextView textView4 = this.f46292d0.f46280b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean y12 = y1();
        int i23 = this.f46296h0;
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
        z00 z00Var = this.P0;
        z00Var.c(false);
        try {
            z00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f46292d0.f46281c.a(this.f46291c0.boostCount, true);
        this.d.x0(0);
        if (i23 == 32) {
            this.f46292d0.f46281c.setVisibility(8);
        }
        return true;
    }

    public final void E1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        b2 b2Var = alertDialog$Builder.f20608a;
        b2Var.R = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f46309v0) {
                int i10 = R.string.RevokeLinkAlertChannel;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i10, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                int i11 = R.string.RevokeLinkAlert;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i11, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f46309v0) {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.web.m(9, this, arrayList));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(h6.w0(h6.f21231q7, this.resourcesProvider));
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
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.O0.f20279id);
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
        HashSet hashSet = this.f46312y0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f20426id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f20426id));
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
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f20426id));
            }
            f5.b0(this.currentAccount, arrayList4, 1, new ig.l0(this, 17));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f20426id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.f20426id, null, null, null, true, null, null, null, false, 0, 0, null, false);
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

    @Override
    public final void G(lw0 lw0Var) {
        int i10;
        Context context = lw0Var.getContext();
        ei.d dVar = new ei.d(context, this.resourcesProvider, true);
        this.G0 = dVar;
        dVar.setFlickeringLoading(true);
        this.G0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.G0.setOnClickListener(new u(this, 2));
        a0 a0Var = new a0(this, context, this.resourcesProvider);
        this.E0 = a0Var;
        b6.b(a0Var, 0.02f, 1.2f);
        if (!this.f24886r && (i10 = this.f46296h0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            v10 v10Var = new v10(this, context, 12);
            this.L0 = v10Var;
            v10Var.setBackgroundColor(h6.w0(h6.f21064h5, this.resourcesProvider));
            lw0Var.addView(this.L0, z5.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        a0 a0Var2 = this.E0;
        float f7 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        lw0Var.addView(a0Var2, z5.d(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        jm0 jm0Var = this.d;
        jm0Var.setPadding(0, 0, 0, dp);
        jm0Var.setClipToPadding(false);
        jm0Var.setClipChildren(false);
        jm0Var.setOnItemClickListener(new wa(this, 20));
        jm0Var.setOnItemLongClickListener(new x(this, 2));
        this.E0.f46391r.setOnClickListener(new qg.n(3, this, context));
        this.E0.e.setOnClickListener(new u(this, 3));
        this.J0 = new ol0(jm0Var, true);
    }

    public final void G1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.f46290b0 = tL_premium_boostsStatus;
        this.f46293e0 = z10;
        N1();
    }

    public final void H1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.f46291c0 = canApplyBoost;
        L1();
        M1();
    }

    public final void I1(long j10) {
        this.f46289a0 = j10;
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
        HashSet hashSet = this.f46312y0;
        hashSet.clear();
        if (this.Y) {
            ArrayList arrayList4 = this.B0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f20426id))) {
                    hashSet.add(user);
                }
            }
        }
        N1();
        L1();
        int i11 = this.f46296h0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.B0.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    a0 a0Var = this.E0;
                    if (a0Var != null && a0Var.getParent() != null) {
                        ((ViewGroup) this.E0.getParent()).removeView(this.E0);
                    }
                    v10 v10Var = this.L0;
                    if (v10Var != null && v10Var.getParent() != null) {
                        ((ViewGroup) this.L0.getParent()).removeView(this.L0);
                    }
                    jm0 jm0Var = this.d;
                    if (jm0Var != null) {
                        jm0Var.setPadding(0, 0, 0, 0);
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
        this.f46308u0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46290b0;
        if (tL_premium_boostsStatus != null) {
            i10 = tL_premium_boostsStatus.level + 1;
        } else {
            i10 = 1;
        }
        if (this.f46296h0 == 31) {
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
                    arrayList2.add(f0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                f0 b10 = f0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
                b10.f46256f = true;
                arrayList2.add(b10);
                if (!y12) {
                    f0 b11 = f0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b11.f46256f = true;
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
                    arrayList2.add(f0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!y12 && i11 > 0) {
                    arrayList2.add(f0.b(R.drawable.menu_feature_links, i11, "BoostFeatureReplyColor"));
                }
                if (!y12 && i10 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (i12 > 0) {
                    int i18 = R.drawable.menu_feature_color_profile;
                    if (y12) {
                        str2 = "BoostFeatureProfileColorGroup";
                    } else {
                        str2 = "BoostFeatureProfileColor";
                    }
                    arrayList2.add(f0.b(i18, i12, str2));
                }
                if (y12 && i10 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!y12 && i10 >= messagesController2.channelProfileIconLevelMin) || (y12 && i10 >= messagesController2.groupProfileBgIconLevelMin)) {
                    int i19 = R.drawable.menu_feature_cover;
                    if (y12) {
                        i14 = R.string.BoostFeatureProfileIconGroup;
                    } else {
                        i14 = R.string.BoostFeatureProfileIcon;
                    }
                    arrayList2.add(f0.a(i19, i14));
                }
                if (y12 && i10 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!y12 && i10 >= messagesController2.channelEmojiStatusLevelMin) || (y12 && i10 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new f0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!y12 && i10 >= messagesController2.channelWallpaperLevelMin) || (y12 && i10 >= messagesController2.groupWallpaperLevelMin)) {
                    int i20 = R.drawable.menu_feature_wallpaper;
                    if (y12) {
                        str = "BoostFeatureBackgroundGroup";
                    } else {
                        str = "BoostFeatureBackground";
                    }
                    arrayList2.add(f0.b(i20, 8, str));
                }
                if ((!y12 && i10 >= messagesController2.channelCustomWallpaperLevelMin) || (y12 && i10 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    int i21 = R.drawable.menu_feature_custombg;
                    if (y12) {
                        i13 = R.string.BoostFeatureCustomBackgroundGroup;
                    } else {
                        i13 = R.string.BoostFeatureCustomBackground;
                    }
                    arrayList2.add(f0.a(i21, i13));
                }
                if (!y12 && i10 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    f0 f0Var = (f0) arrayList.get(i22);
                    f0 f0Var2 = (f0) arrayList2.get(i22);
                    int i23 = f0Var.e;
                    if (f0Var2 != null && ((f0Var.f46256f && i23 > 2) || (f0Var.f46253a == f0Var2.f46253a && f0Var.f46254b == f0Var2.f46254b && TextUtils.equals(f0Var.f46255c, f0Var2.f46255c) && TextUtils.equals(f0Var.d, f0Var2.d) && i23 == f0Var2.e))) {
                    }
                }
                i10++;
            }
            ArrayList arrayList3 = this.f46308u0;
            arrayList3.add(new e0(i10, arrayList3.isEmpty()));
            this.f46308u0.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void L1() {
        int i10;
        if (this.f46298j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i11 = this.f46296h0;
        if (i11 != 19 && i11 != 32 && !z1()) {
            String str = null;
            HashSet hashSet = this.f46312y0;
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
                gr grVar = new gr(a0Var2.getContext(), null);
                a0Var2.G = grVar;
                grVar.setGravity(3);
                gr grVar2 = a0Var2.G;
                int i12 = h6.Oh;
                int i13 = h6.Sh;
                fr frVar = grVar2.f26654a;
                frVar.v = i12;
                frVar.f26361w = i13;
                frVar.f26344b = 0.8f;
                a0Var2.setClipChildren(false);
                a0Var2.addView(a0Var2.G, z5.e(-1, 24, 16));
            }
            if (!this.Y) {
                this.E0.b(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.E0.b(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.E0.b(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            gr grVar3 = this.E0.G;
            grVar3.f26654a.c(hashSet.size(), true);
            this.E0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.f46291c0;
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
        ei.d dVar = this.S0;
        if (z10) {
            if (ug.r.i()) {
                this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                a0 a0Var4 = this.E0;
                if (y1()) {
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
        } else if (ug.r.i()) {
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
        if (this.f46298j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i12 = this.f46296h0;
        if (i12 != 19 && i12 != 32 && !z1()) {
            if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !this.N0) {
                    this.E0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
                    androidx.emoji2.text.p pVar = this.M0;
                    if (pVar != null) {
                        int i13 = pVar.f3115b;
                        int i14 = i13 + 1;
                        int i15 = pVar.f3116c;
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
                        a0Var.f46393w.f31440p = null;
                        a0Var.f46395y.setVisibility(8);
                        return;
                    }
                    a0 a0Var2 = this.E0;
                    a0Var2.f46393w.f31440p = null;
                    a0Var2.f46395y.setVisibility(8);
                    return;
                }
                this.E0.d.setText(LocaleController.getString(R.string.OK));
                a0 a0Var3 = this.E0;
                a0Var3.f46393w.f31440p = null;
                a0Var3.f46395y.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new yq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.E0.d.setText(spannableStringBuilder);
        } else if (ug.r.i()) {
            p0 p0Var = this.E0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.f46291c0;
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
            p0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.f46291c0;
            if (canApplyBoost2 != null && canApplyBoost2.isMaxLvl) {
                this.E0.d.setText(LocaleController.getString(R.string.OK));
            }
        } else {
            p0 p0Var2 = this.E0.d;
            if (y1()) {
                i10 = R.string.BoostGroup;
            } else {
                i10 = R.string.BoostChannel;
            }
            p0Var2.setText(LocaleController.getString(i10));
        }
    }

    public final void N1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.m0 = -1;
        this.f46302o0 = -1;
        this.f46303p0 = -1;
        this.f46304q0 = -1;
        this.Z = -1;
        this.f46305r0 = -1;
        this.f46307t0 = -1;
        this.f46299k0 = 1;
        this.f46300l0 = 0;
        int i10 = this.f46296h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 22 && i10 != 23 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 21 && i10 != 30 && i10 != 35) {
            if (i10 != 31 && i10 != 32) {
                if (!w1(i10)) {
                    if (i10 != 11 && i10 != 34) {
                        int i11 = this.f46299k0;
                        this.m0 = i11;
                        this.f46299k0 = i11 + 2;
                        this.f46301n0 = i11 + 1;
                    } else {
                        this.v = 0.24f;
                    }
                    if (this.I0) {
                        int i12 = this.f46299k0;
                        this.f46299k0 = i12 + 1;
                        this.f46304q0 = i12;
                    } else if (i10 != 11 || this.Y) {
                        if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.D0) == null || arrayList.isEmpty()) && ((arrayList2 = this.C0) == null || arrayList2.size() < this.B0.size())) || (arrayList3 = this.D0) == null || arrayList3.size() != 1 || (arrayList4 = this.C0) == null || arrayList4.size() != 1 || !this.Y)) {
                            int i13 = this.f46299k0;
                            this.f46302o0 = i13;
                            if (i10 != 11 && i10 != 34) {
                                if (i10 == 5) {
                                    this.f46299k0 = this.f46313z0.size() + i13;
                                } else {
                                    this.f46299k0 = this.f46297i0.size() + i13;
                                }
                            } else {
                                this.f46299k0 = this.B0.size() + i13;
                            }
                            this.f46303p0 = this.f46299k0;
                        }
                        if (this.f46303p0 - this.f46302o0 > 1) {
                            int i14 = this.f46299k0;
                            this.f46299k0 = i14 + 1;
                            this.f46305r0 = i14;
                        }
                    }
                }
            } else {
                this.v = 0.24f;
                K1();
                int i15 = this.f46299k0;
                this.f46302o0 = i15;
                int i16 = i15 + 1;
                this.f46299k0 = i16;
                this.f46307t0 = i15;
                int size = (this.f46308u0.size() - 1) + i16;
                this.f46299k0 = size;
                this.f46303p0 = size;
            }
        } else {
            if (i10 != 19 || ChatObject.hasAdminRights(t1())) {
                this.v = 0.24f;
                int i17 = this.f46299k0;
                this.f46299k0 = i17 + 1;
                this.Z = i17;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i18 = this.f46299k0;
                    this.f46299k0 = i18 + 1;
                    this.f46306s0 = i18;
                }
            }
            K1();
            int i19 = this.f46299k0;
            int i20 = i19 + 1;
            this.f46299k0 = i20;
            this.f46307t0 = i19;
            this.f46299k0 = (this.f46308u0.size() - 1) + i20;
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull u12;
        n2 n2Var;
        n2 n2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            n2 n2Var3 = this.f24885n;
            n2 lastFragment = n2Var3.getParentLayout().getLastFragment();
            n2 n2Var4 = null;
            if (lastFragment instanceof ah.a0) {
                List fragmentStack = n2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    n2Var = (n2) r4.c.f(2, fragmentStack);
                } else {
                    n2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    n2Var2 = (n2) r4.c.f(3, fragmentStack);
                } else {
                    n2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    n2Var4 = (n2) r4.c.f(4, fragmentStack);
                }
                if (n2Var instanceof io) {
                    ((ActionBarLayout) n2Var3.getParentLayout()).a0(n2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (n2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) n2Var3.getParentLayout()).a0(n2Var2, false);
                    }
                    lastFragment.finishFragment();
                    ug.i.f(n2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                ug.i.f(n2Var2, chat, false);
            } else if ((lastFragment instanceof qn) && booleanValue) {
                ug.i.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof bd) && booleanValue) {
                List fragmentStack2 = n2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    n2 n2Var5 = (n2) fragmentStack2.get(size);
                    if (!(n2Var5 instanceof qn) && !(n2Var5 instanceof cy)) {
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
                    ug.i.f(n2Var4, chat, true);
                }
            } else if (booleanValue) {
                vb vbVar = vb.F2;
                if (vbVar != null && vbVar.d) {
                    qn W9 = qn.W9(-chat.f20279id);
                    LaunchActivity.R().presentFragment(W9, false, false);
                    vb.w();
                    dismiss();
                    ug.i.f(W9, chat, true);
                    return;
                }
                List fragmentStack3 = n2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    n2Var4 = (n2) r4.c.f(2, fragmentStack3);
                }
                n2Var3.finishFragment();
                dismiss();
                if (n2Var4 instanceof qn) {
                    ug.i.f(n2Var4, chat, true);
                }
            } else {
                vb vbVar2 = vb.F2;
                if (vbVar2 != null && vbVar2.d) {
                    qn W92 = qn.W9(-chat.f20279id);
                    LaunchActivity.R().presentFragment(W92, false, false);
                    vb.w();
                    dismiss();
                    ug.i.f(W92, chat, false);
                    return;
                }
                dismiss();
                ug.i.f(LaunchActivity.R(), chat, false);
            }
        } else if (i10 == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.f46291c0 != null) {
                this.f46290b0.boosts += intValue;
                if (this.f46296h0 == 32 && (u12 = u1()) != null) {
                    u12.boosts_applied += intValue;
                }
                A1();
                G1(tL_premium_boostsStatus, this.f46293e0);
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.f46291c0;
                if (this.f46290b0.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canApplyBoost.isMaxLvl = z10;
                canApplyBoost.boostedNow = true;
                canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                if (C1()) {
                    qc Q = new xc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                    Q.f29534j = 4000;
                    Q.k(true);
                }
            }
        } else if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    public final void n1(final aa0 aa0Var, boolean z10) {
        if (aa0Var.c() && !z10) {
            return;
        }
        aa0Var.setLoading(true);
        MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.f46289a0, this.f46291c0.slot, new Utilities.Callback(this) {
            public final k0 f46523b;

            {
                this.f46523b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f46289a0, new a4(this.f46523b, aa0Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        aa0 aa0Var2 = aa0Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new p2.b(20, this.f46523b, aa0Var2), intValue * 1000);
                                return;
                            }
                            ug.i.g(intValue);
                        }
                        aa0Var2.setLoading(false);
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final k0 f46523b;

            {
                this.f46523b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f46289a0, new a4(this.f46523b, aa0Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        aa0 aa0Var2 = aa0Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new p2.b(20, this.f46523b, aa0Var2), intValue * 1000);
                                return;
                            }
                            ug.i.g(intValue);
                        }
                        aa0Var2.setLoading(false);
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
        ei.d dVar = this.S0;
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46290b0;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.f46290b0.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f46289a0;
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
        if (this.f46296h0 == 32) {
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
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46289a0));
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46290b0;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z1() && this.f46290b0.next_level_boosts != 0 && z10) {
            if (y1()) {
                i18 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
            } else {
                i18 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.f46290b0;
            int i20 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i20, Integer.valueOf(i20)));
        } else if (z11 && this.f46291c0.alreadyActive) {
            if (this.f46290b0.level == 1) {
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
            return LocaleController.formatString(i16, Integer.valueOf(this.f46290b0.level), LocaleController.formatPluralString("BoostStories", this.f46290b0.level, new Object[0]));
        } else if (this.f46291c0.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.f46290b0;
            if (tL_premium_boostsStatus3.level == 0) {
                if (y1()) {
                    i15 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i15 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.f46290b0;
                int i21 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i15, str, LocaleController.formatPluralString("MoreBoosts", i21, Integer.valueOf(i21)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (y1()) {
                    i14 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i14 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i14, Integer.valueOf(this.f46290b0.level), LocaleController.formatPluralString("BoostStories", this.f46290b0.level + 1, new Object[0]));
            } else {
                if (y1()) {
                    i13 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i13 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.f46290b0;
                int i22 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i22, Integer.valueOf(i22)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.f46290b0;
            if (tL_premium_boostsStatus6.level == 0) {
                if (y1()) {
                    i12 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i12 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.f46290b0;
                int i23 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i23, Integer.valueOf(i23)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (y1()) {
                    i11 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i11 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i11, Integer.valueOf(this.f46290b0.level), LocaleController.formatPluralString("BoostStories", this.f46290b0.level + 1, new Object[0]));
            } else {
                if (y1()) {
                    i10 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i10 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.f46290b0;
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f46290b0;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.f46291c0.alreadyActive) {
            if (y1()) {
                i15 = R.string.BoostGroup;
            } else {
                i15 = R.string.BoostChannel;
            }
            return LocaleController.getString(i15);
        }
        boolean z10 = this.f46293e0;
        int i16 = this.f46296h0;
        if (z10) {
            if (i16 == 32) {
                if (y1()) {
                    i14 = R.string.BoostGroup;
                } else {
                    i14 = R.string.BoostChannel;
                }
                return LocaleController.getString(i14);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46289a0));
            if (this.f46291c0.alreadyActive) {
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
        } else if (this.f46291c0.alreadyActive) {
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
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46289a0));
    }

    public final TLRPC.ChatFull u1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.f46289a0);
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        return new d0(this);
    }

    public final boolean x1() {
        int i10 = this.f46296h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 27 && i10 != 28 && i10 != 23 && i10 != 30 && i10 != 35) {
            return false;
        }
        return true;
    }

    public final boolean y1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f46289a0)));
    }

    public final boolean z1() {
        if (x1() && ChatObject.hasAdminRights(t1())) {
            return true;
        }
        return false;
    }
}
