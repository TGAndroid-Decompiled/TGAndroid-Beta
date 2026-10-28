package tg;

import a8.ee;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import bi.cb;
import bi.v3;
import fi.f6;
import fi.sb;
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
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import org.telegram.ui.bd;
import org.telegram.ui.bh1;
import org.telegram.ui.ey;
import org.telegram.ui.oo;
import org.telegram.ui.wn;
public class j0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int W0 = 0;
    public final ArrayList A0;
    public ArrayList B0;
    public ArrayList C0;
    public ArrayList D0;
    public z E0;
    public final TextView F0;
    public fi.d G0;
    public Runnable H0;
    public boolean I0;
    public rl0 J0;
    public final r2 K0;
    public b20 L0;
    public androidx.emoji2.text.p M0;
    public boolean N0;
    public TLRPC.Chat O0;
    public final z00 P0;
    public Runnable Q0;
    public int R0;
    public final fi.d S0;
    public int T0;
    public int U0;
    public String V0;
    public int X;
    public boolean Y;
    public int Z;
    public long f48919a0;
    public TL_stories.TL_premium_boostsStatus f48920b0;
    public ChannelBoostsController.CanApplyBoost f48921c0;
    public i0 f48922d0;
    public boolean f48923e0;
    public boolean f48924f0;
    public org.telegram.ui.Cells.s1 f48925g0;
    public final int f48926h0;
    public final ArrayList f48927i0;
    public boolean f48928j0;
    public int f48929k0;
    public int f48930l0;
    public int m0;
    public int f48931n0;
    public int f48932o0;
    public int f48933p0;
    public int f48934q0;
    public int f48935r0;
    public int f48936s0;
    public int f48937t0;
    public ArrayList f48938u0;
    public boolean f48939v0;
    public int f48940w0;
    public h0 f48941x0;
    public final HashSet f48942y0;
    public final ArrayList f48943z0;

    public j0(int i10, int i11, Context context, r2 r2Var, u6 u6Var) {
        super(context, r2Var, false, z1(i10), u6Var);
        this.Z = -1;
        this.f48924f0 = false;
        this.f48927i0 = new ArrayList();
        this.f48930l0 = -1;
        this.m0 = -1;
        this.f48931n0 = -1;
        this.f48932o0 = -1;
        this.f48933p0 = -1;
        this.f48934q0 = -1;
        this.f48935r0 = -1;
        this.f48936s0 = -1;
        this.f48937t0 = -1;
        this.f48940w0 = -1;
        this.f48942y0 = new HashSet();
        this.f48943z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.I0 = false;
        this.R0 = 0;
        this.U0 = -4;
        fixNavigationBar(y6.w0(y6.f23428h5, this.resourcesProvider));
        this.T0 = this.navBarColor;
        this.K0 = r2Var;
        this.currentAccount = i11;
        this.f48926h0 = i10;
        N();
        Q1();
        if (i10 == 2) {
            this.I0 = true;
            Q1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v(this, 0));
        } else if (i10 == 5) {
            this.I0 = true;
            Q1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v(this, 2));
        }
        P1();
        if (i10 == 32 || A1()) {
            z00 z00Var = new z00(getContext());
            this.P0 = z00Var;
            this.container.addView(z00Var, kb1.g(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            b20 b20Var = this.L0;
            if (b20Var != null) {
                ((ViewGroup) b20Var.getParent()).removeView(this.L0);
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
            f7.V(textView, y6.Sh, u6Var);
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int i12 = y6.Oh;
            int w02 = y6.w0(i12, u6Var);
            int i13 = y6.f23357d6;
            int o10 = i0.a.o(y6.w0(i13, u6Var), 120);
            org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, w02, o10, o10);
            b7 N = f7.N(i12);
            b7 h = f7.h(i13, 120);
            textView.setBackground(j02);
            f7.k(textView, j02, N, h, u6Var);
        }
        if (i10 == 32) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            fi.d dVar = new fi.d(context, u6Var, true);
            this.S0 = dVar;
            dVar.k();
            dVar.i(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, kb1.h(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new w(this, 3));
        }
        if (i10 != 19 && i10 != 18) {
            return;
        }
        this.containerView.post(new w(this, 4));
    }

    public static String E1(int i10) {
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

    public static void G1(r2 r2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus != null && canApplyBoost != null && r2Var.getContext() != null) {
            j0 j0Var = new j0(32, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, r2Var.getResourceProvider());
            j0Var.K1(canApplyBoost);
            j0Var.J1(tL_premium_boostsStatus, true);
            j0Var.L1(j10);
            if (z10) {
                r2Var.showDialog(j0Var);
            } else {
                j0Var.show();
            }
        }
    }

    public static void P(j0 j0Var, ArrayList arrayList, TLRPC.User user) {
        j0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(j0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(j0Var.currentAccount).deleteParticipantFromChat(chat.f22028id, user);
        }
    }

    public static void Q(j0 j0Var, ArrayList arrayList) {
        j0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(j0Var, 1), 64);
        }
    }

    public static void R(j0 j0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        nm0 nm0Var = j0Var.d;
        ArrayList arrayList2 = j0Var.A0;
        arrayList2.clear();
        ArrayList arrayList3 = j0Var.f48943z0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        j0Var.I0 = false;
        j0Var.J0.b(j0Var.f48931n0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 < nm0Var.getChildCount()) {
                if (nm0Var.getChildAt(i13) instanceof i0) {
                    i11 = nm0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            } else {
                i11 = 0;
                break;
            }
        }
        j0Var.Q1();
        if (j0Var.f48930l0 >= 0 && i11 != 0) {
            ((s4.c0) nm0Var.getLayoutManager()).h1(j0Var.f48930l0 + 1, i11);
        }
        if (j0Var.M0 == null) {
            j0Var.M0 = y1(j0Var.f48926h0, j0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), j0Var.M0.f2568b);
        h0 h0Var = j0Var.f48941x0;
        if (h0Var != null) {
            h0Var.i(max, false);
            j0Var.f48941x0.setBagePosition(max / j0Var.M0.f2569c);
            h0 h0Var2 = j0Var.f48941x0;
            h0Var2.H = true;
            h0Var2.requestLayout();
        }
    }

    public static void S(j0 j0Var) {
        long j10;
        int i10 = j0Var.f48926h0;
        HashSet hashSet = j0Var.f48942y0;
        if (j0Var.f48928j0) {
            r2 r2Var = j0Var.K0;
            if (r2Var != 0) {
                ?? obj = new Object();
                obj.f22929a = true;
                r2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
            } else {
                return;
            }
        } else if (i10 == 19 || i10 == 32 || j0Var.C1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f48921c0;
            if (canApplyBoost.canApply) {
                j0Var.E0.v.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.f48921c0;
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
            } else if (canApplyBoost.alreadyActive && vg.s.i() && !j0Var.f48921c0.isMaxLvl) {
                vg.j.i(j0Var.f48919a0, j0Var);
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
                        j0Var.f48927i0.add((TLRPC.Chat) it.next());
                    }
                    j0Var.H1(arrayList);
                } else if (i10 == 5) {
                    TLRPC.User user = MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(j0Var.currentAccount).getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((TLRPC.Chat) it2.next());
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j0Var.getContext(), 0, j0Var.resourcesProvider);
                    String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
                    e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = formatPluralString;
                    if (arrayList2.size() == 1) {
                        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
                    } else {
                        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
                    }
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new qy(j0Var, arrayList2, user, 11));
                    e2Var.show();
                    TextView textView = (TextView) e2Var.d(-1);
                    if (textView != null) {
                        f7.V(textView, y6.f23599q7, j0Var.resourcesProvider);
                    }
                }
            }
        } else if (hashSet.isEmpty()) {
            j0Var.dismiss();
        } else {
            j0Var.I1(null);
        }
    }

    public static u6 S0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static void U(j0 j0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
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
            AndroidUtilities.runOnUIThread(new as0(j0Var, arrayList, min, tL_messages_inactiveChats, 24));
        }
    }

    public static void V(j0 j0Var, Context context) {
        int i10;
        r2 r2Var = j0Var.K0;
        int i11 = j0Var.f48926h0;
        if (i11 != 11 && i11 != 34) {
            if (i11 != 19 && i11 != 32 && !j0Var.C1()) {
                if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                    if (!UserConfig.getInstance(j0Var.currentAccount).isPremium() && !MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() && !j0Var.N0) {
                        if (r2Var != null) {
                            if (r2Var.getVisibleDialog() != null) {
                                r2Var.getVisibleDialog().dismiss();
                            }
                            r2Var.presentFragment(new PremiumPreviewFragment(0, E1(i11)));
                            j0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    j0Var.dismiss();
                    return;
                }
                AndroidUtilities.addToClipboard(j0Var.t1());
                j0Var.dismiss();
                return;
            }
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.f48921c0;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(j0Var.currentAccount).isPremium() && vg.s.i()) {
                    vg.j.i(j0Var.f48919a0, j0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, j0Var.resourcesProvider);
                String string = LocaleController.getString(R.string.PremiumNeeded);
                e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                if (j0Var.B1()) {
                    i10 = R.string.PremiumNeededForBoostingGroup;
                } else {
                    i10 = R.string.PremiumNeededForBoosting;
                }
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new x(j0Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(15));
                alertDialog$Builder.p();
                return;
            }
            boolean z10 = canApplyBoost.canApply;
            if (z10 && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && vg.s.i()) {
                    j0Var.f48924f0 = true;
                    j0Var.f48941x0.f26225d0 = false;
                    r2 r2Var2 = j0Var.f26793n;
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.f48921c0;
                    vg.s0 s0Var = new vg.s0(r2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                    s0Var.show();
                    s0Var.setOnHideListener(new cb(j0Var, 12));
                    return;
                }
                j0Var.r1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                y9 y9Var = new y9(j0Var.getContext());
                y9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(y9Var, kb1.g(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(y6.x0(null, y6.f23428h5, false));
                frameLayout.addView(new f6(j0Var.getContext(), paint, j0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), kb1.h(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(j0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                f7.t(imageView, y6.f23521m6, null, PorterDuff.Mode.SRC_ATOP);
                frameLayout.addView(imageView, kb1.i(24, 24, 17));
                y9 y9Var2 = new y9(j0Var.getContext());
                y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(y9Var2, kb1.h(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(j0Var.getContext());
                frameLayout2.addView(frameLayout, kb1.i(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                f7.V(textView, y6.f23465j5, null);
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, kb1.x(-1, -2, 0, 24, 80, 24, 0));
                j9 j9Var = new j9((u6) null);
                TLRPC.Chat chat = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.f48921c0.replaceDialogId));
                j9Var.k(j0Var.currentAccount, chat);
                y9Var.f(chat, j9Var);
                j9 j9Var2 = new j9((u6) null);
                TLRPC.Chat chat2 = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.f48919a0));
                j9Var2.k(j0Var.currentAccount, chat2);
                y9Var2.f(chat2, j9Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.o(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new x(j0Var, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new s0.b(16));
                alertDialog$Builder2.p();
            } else {
                int i12 = canApplyBoost.floodWait;
                if (i12 != 0) {
                    vg.j.g(i12);
                }
            }
        }
    }

    public static void W(j0 j0Var, View view) {
        String str;
        qc J;
        int i10;
        HashSet hashSet = j0Var.f48942y0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f24498r.a(hashSet.contains(currentChannel), true);
            j0Var.O1();
        } else if (view instanceof k4) {
            if (j0Var.Y || ((i10 = j0Var.f48926h0) != 11 && i10 != 34)) {
                k4 k4Var = (k4) view;
                Object object = k4Var.getObject();
                if (k4Var.O) {
                    if (object instanceof TLRPC.User) {
                        long j10 = ((TLRPC.User) object).f22177id;
                        int i11 = -j0Var.U0;
                        j0Var.U0 = i11;
                        AndroidUtilities.shakeViewSpring(k4Var, i11);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getForcedFirstName(MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked()) {
                            J = new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(j0Var, 0));
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
                k4Var.c(hashSet.contains(object), true);
                j0Var.O1();
            }
        }
    }

    public static u6 X0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static u6 f0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static u6 i1(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static androidx.emoji2.text.p y1(int i10, int i11) {
        ?? obj = new Object();
        obj.f2567a = 0;
        obj.d = null;
        obj.e = null;
        obj.f2570f = null;
        obj.f2568b = 0;
        obj.f2569c = 0;
        if (i10 == 0) {
            obj.f2568b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            obj.f2567a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 33) {
            obj.f2568b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            obj.f2567a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 2) {
            obj.f2568b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            obj.f2567a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 12) {
            obj.f2568b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            obj.f2567a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 13) {
            obj.f2568b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            obj.f2567a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 3) {
            obj.f2568b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            obj.f2567a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 4) {
            obj.f2568b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            obj.f2567a = R.drawable.msg_limit_chats;
            obj.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 5) {
            obj.f2568b = MessagesController.getInstance(i11).channelsLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).channelsLimitPremium;
            obj.f2567a = R.drawable.msg_limit_groups;
            obj.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 6) {
            obj.f2568b = 100;
            obj.f2569c = 200;
            obj.f2567a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            obj.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            obj.f2570f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return obj;
        } else if (i10 == 7) {
            obj.f2568b = 3;
            obj.f2569c = 4;
            obj.f2567a = R.drawable.msg_limit_accounts;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 11) {
            obj.f2568b = 0;
            obj.f2569c = 0;
            obj.f2567a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(obj.f2569c));
            obj.e = "";
            obj.f2570f = "";
            return obj;
        } else if (i10 == 14) {
            obj.f2568b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            obj.f2567a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", obj.f2568b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", obj.f2569c);
            obj.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f2569c);
            obj.f2570f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f2568b);
            return obj;
        } else if (i10 == 15) {
            obj.f2568b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            obj.f2567a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 == 16) {
            obj.f2568b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f2567a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f2568b));
            return obj;
        } else if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return obj;
        } else {
            obj.f2568b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f2569c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f2567a = R.drawable.filled_limit_boost;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f2568b), Integer.valueOf(obj.f2569c));
            obj.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f2569c));
            obj.f2570f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f2568b));
            return obj;
        }
    }

    public static boolean z1(int i10) {
        if (i10 != 0 && i10 != 33 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
            return false;
        }
        return true;
    }

    public final boolean A1() {
        int i10 = this.f48926h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 27 && i10 != 28 && i10 != 23 && i10 != 30 && i10 != 35) {
            return false;
        }
        return true;
    }

    public final boolean B1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f48919a0)));
    }

    public final boolean C1() {
        if (A1() && ChatObject.hasAdminRights(w1())) {
            return true;
        }
        return false;
    }

    public final void D1() {
        int i10;
        h0 h0Var = this.f48941x0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f48920b0;
        int i11 = tL_premium_boostsStatus.boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.f26221b++;
        h0Var.f26219a = ee.a((i11 - i10) / i12, 0.0f, 1.0f);
        h0Var.W = true;
        h0Var.f26220a0 = h0Var.f26235n;
        h0Var.i(i11, true);
        h0Var.I.requestLayout();
        h0Var.requestLayout();
    }

    public final boolean F1() {
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
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.f48920b0, this.f48921c0.copy(), Long.valueOf(this.f48919a0));
        fi.d dVar = this.S0;
        if (dVar != null) {
            TLRPC.ChatFull x12 = x1();
            int max = Math.max(x12.boosts_unrestrict - x12.boosts_applied, 0);
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
        TransitionManager.beginDelayedTransition(this.f48922d0, transitionSet);
        i0 i0Var = this.f48922d0;
        vg.b bVar = i0Var.f48914c;
        int indexOfChild = i0Var.indexOfChild(i0Var.f48913b);
        j0 j0Var = i0Var.e;
        if (j0Var.f48923e0) {
            int indexOfChild2 = i0Var.indexOfChild(i0Var.d);
            i0Var.removeView(i0Var.d);
            i0Var.d.removeView(i0Var.f48912a);
            i0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(i0Var.getContext());
            i0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            i0Var.d.setWeightSum(1.0f);
            i0Var.d.addView(i0Var.f48912a, kb1.s(-2, -2, 1.0f, 0));
            i0Var.d.addView(bVar, kb1.x(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, kb1.x(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.f48912a);
            i0Var.removeView(i0Var.f48912a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.f48912a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            i0Var.f48912a.setTextSize(1, 20.0f);
            f7.V(i0Var.f48912a, y6.G6, j0Var.resourcesProvider);
            i0Var.f48912a.setGravity(17);
            i0Var.addView(i0Var.f48912a, indexOfChild3, kb1.x(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.f48913b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.f48913b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.f48913b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.f48913b.getLineSpacingMultiplier() * 1.1f);
        i0Var.f48913b.setGravity(1);
        f7.V(i0Var.f48913b, y6.G6, j0Var.resourcesProvider);
        i0Var.addView(i0Var.f48913b, indexOfChild, kb1.x(-2, -2, 1, 24, -2, 24, 17));
        this.f48922d0.f48912a.setText(v1());
        TextView textView4 = this.f48922d0.f48913b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean B1 = B1();
        int i23 = this.f48926h0;
        if (i23 == 20) {
            if (B1) {
                i22 = R.string.GroupNeedBoostsForColorDescription;
            } else {
                i22 = R.string.ChannelNeedBoostsForColorDescription;
            }
            str = LocaleController.formatString(i22, Integer.valueOf(s1()));
        } else if (i23 == 24) {
            if (B1) {
                i21 = R.string.GroupNeedBoostsForProfileColorDescription;
            } else {
                i21 = R.string.ChannelNeedBoostsForProfileColorDescription;
            }
            str = LocaleController.formatString(i21, Integer.valueOf(s1()));
        } else if (i23 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i23 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i23 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i23 == 25) {
            if (B1) {
                i19 = R.string.GroupNeedBoostsForEmojiStatusDescription;
            } else {
                i19 = R.string.ChannelNeedBoostsForEmojiStatusDescription;
            }
            if (B1) {
                i20 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i20 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i19, Integer.valueOf(i20));
        } else if (i23 == 26) {
            if (B1) {
                i17 = R.string.GroupNeedBoostsForWearCollectiblesDescription;
            } else {
                i17 = R.string.ChannelNeedBoostsForWearCollectiblesDescription;
            }
            if (B1) {
                i18 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i18 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i17, Integer.valueOf(i18));
        } else if (i23 == 27) {
            if (B1) {
                i16 = R.string.GroupNeedBoostsForReplyIconDescription;
            } else {
                i16 = R.string.ChannelNeedBoostsForReplyIconDescription;
            }
            str = LocaleController.formatString(i16, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i23 == 28) {
            if (B1) {
                i14 = R.string.GroupNeedBoostsForProfileIconDescription;
            } else {
                i14 = R.string.ChannelNeedBoostsForProfileIconDescription;
            }
            if (B1) {
                i15 = messagesController.groupProfileBgIconLevelMin;
            } else {
                i15 = messagesController.channelProfileIconLevelMin;
            }
            str = LocaleController.formatString(i14, Integer.valueOf(i15));
        } else if (i23 == 22) {
            if (B1) {
                i12 = R.string.GroupNeedBoostsForWallpaperDescription;
            } else {
                i12 = R.string.ChannelNeedBoostsForWallpaperDescription;
            }
            if (B1) {
                i13 = messagesController.groupWallpaperLevelMin;
            } else {
                i13 = messagesController.channelWallpaperLevelMin;
            }
            str = LocaleController.formatString(i12, Integer.valueOf(i13));
        } else if (i23 == 23) {
            if (B1) {
                i10 = R.string.GroupNeedBoostsForCustomWallpaperDescription;
            } else {
                i10 = R.string.ChannelNeedBoostsForCustomWallpaperDescription;
            }
            if (B1) {
                i11 = messagesController.groupCustomWallpaperLevelMin;
            } else {
                i11 = messagesController.channelCustomWallpaperLevelMin;
            }
            str = LocaleController.formatString(i10, Integer.valueOf(i11));
        } else {
            str = null;
        }
        if (str == null) {
            str = u1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        O1();
        z00 z00Var = this.P0;
        z00Var.c(false);
        try {
            z00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f48922d0.f48914c.a(this.f48921c0.boostCount, true);
        this.d.y0(0);
        if (i23 == 32) {
            this.f48922d0.f48914c.setVisibility(8);
        }
        return true;
    }

    @Override
    public final void G(ww0 ww0Var) {
        int i10;
        Context context = ww0Var.getContext();
        fi.d dVar = new fi.d(context, this.resourcesProvider, true);
        this.G0 = dVar;
        dVar.setFlickeringLoading(true);
        this.G0.i(LocaleController.getString(R.string.BoostBtn), false, true);
        this.G0.setOnClickListener(new u(this, 2));
        z zVar = new z(this, context, this.resourcesProvider);
        this.E0 = zVar;
        kb1.c(zVar, 0.02f, 1.2f);
        if (!this.f26794r && (i10 = this.f48926h0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            b20 b20Var = new b20(this, context, 12);
            this.L0 = b20Var;
            f7.i(y6.f23428h5, b20Var, this.resourcesProvider);
            ww0Var.addView(this.L0, kb1.h(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        z zVar2 = this.E0;
        float f7 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        ww0Var.addView(zVar2, kb1.h(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        nm0 nm0Var = this.d;
        nm0Var.setPadding(0, 0, 0, dp);
        nm0Var.setClipToPadding(false);
        nm0Var.setClipChildren(false);
        nm0Var.setOnItemClickListener(new ai.k(this, 21));
        nm0Var.setOnItemLongClickListener(new x(this, 2));
        this.E0.v.setOnClickListener(new org.telegram.ui.web.c(4, this, context));
        this.E0.h.setOnClickListener(new u(this, 3));
        this.J0 = new rl0(nm0Var, true);
    }

    public final void H1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f48939v0) {
                int i10 = R.string.RevokeLinkAlertChannel;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i10, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                int i11 = R.string.RevokeLinkAlert;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i11, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f48939v0) {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bh1(15, this, arrayList));
        e2Var.show();
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            f7.V(textView, y6.f23599q7, this.resourcesProvider);
        }
    }

    public final void I1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.V0)) {
            str = this.V0;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.O0.f22028id);
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
        HashSet hashSet = this.f48942y0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f22177id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f22177id));
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
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f22177id));
            }
            g5.b0(this.currentAccount, arrayList4, 1, new ig.o(this, 21));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f22177id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.f22177id, null, null, null, true, null, null, null, false, 0, 0, null, false);
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

    public final void J1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.f48920b0 = tL_premium_boostsStatus;
        this.f48923e0 = z10;
        Q1();
    }

    public final void K1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.f48921c0 = canApplyBoost;
        O1();
        P1();
    }

    public final void L1(long j10) {
        this.f48919a0 = j10;
        Q1();
    }

    public final void M1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z10;
        this.O0 = chat;
        this.V0 = str;
        if (TextUtils.isEmpty(str) && !ChatObject.canUserDoAdminAction(chat, 3)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.Y = z10;
        this.B0 = new ArrayList(arrayList);
        this.C0 = arrayList2;
        this.D0 = arrayList3;
        HashSet hashSet = this.f48942y0;
        hashSet.clear();
        if (this.Y) {
            ArrayList arrayList4 = this.B0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f22177id))) {
                    hashSet.add(user);
                }
            }
        }
        Q1();
        O1();
        int i11 = this.f48926h0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.B0.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    z zVar = this.E0;
                    if (zVar != null && zVar.getParent() != null) {
                        ((ViewGroup) this.E0.getParent()).removeView(this.E0);
                    }
                    b20 b20Var = this.L0;
                    if (b20Var != null && b20Var.getParent() != null) {
                        ((ViewGroup) this.L0.getParent()).removeView(this.L0);
                    }
                    nm0 nm0Var = this.d;
                    if (nm0Var != null) {
                        nm0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void N1() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        String str2;
        int i15;
        int i16;
        this.f48938u0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f48920b0;
        if (tL_premium_boostsStatus != null) {
            i10 = tL_premium_boostsStatus.level + 1;
        } else {
            i10 = 1;
        }
        if (this.f48926h0 == 31) {
            i10 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i17 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            if (peerColors != null) {
                i15 = peerColors.maxLevel(B1());
            } else {
                i15 = 0;
            }
            int max = Math.max(10, i15);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                i16 = peerColors2.maxLevel(B1());
            } else {
                i16 = 0;
            }
            int max2 = Math.max(max, i16);
            if (B1()) {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
            }
        }
        ArrayList arrayList = null;
        while (i10 <= i17) {
            boolean B1 = B1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!B1 && i10 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                e0 b10 = e0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
                b10.f48887f = true;
                arrayList2.add(b10);
                if (!B1) {
                    e0 b11 = e0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b11.f48887f = true;
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
                    i12 = peerColors4.colorsAvailable(i10, B1);
                } else {
                    i12 = 0;
                }
                if (!B1 && i11 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!B1 && i11 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_links, i11, "BoostFeatureReplyColor"));
                }
                if (!B1 && i10 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (i12 > 0) {
                    int i18 = R.drawable.menu_feature_color_profile;
                    if (B1) {
                        str2 = "BoostFeatureProfileColorGroup";
                    } else {
                        str2 = "BoostFeatureProfileColor";
                    }
                    arrayList2.add(e0.b(i18, i12, str2));
                }
                if (B1 && i10 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!B1 && i10 >= messagesController2.channelProfileIconLevelMin) || (B1 && i10 >= messagesController2.groupProfileBgIconLevelMin)) {
                    int i19 = R.drawable.menu_feature_cover;
                    if (B1) {
                        i14 = R.string.BoostFeatureProfileIconGroup;
                    } else {
                        i14 = R.string.BoostFeatureProfileIcon;
                    }
                    arrayList2.add(e0.a(i19, i14));
                }
                if (B1 && i10 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!B1 && i10 >= messagesController2.channelEmojiStatusLevelMin) || (B1 && i10 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new e0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!B1 && i10 >= messagesController2.channelWallpaperLevelMin) || (B1 && i10 >= messagesController2.groupWallpaperLevelMin)) {
                    int i20 = R.drawable.menu_feature_wallpaper;
                    if (B1) {
                        str = "BoostFeatureBackgroundGroup";
                    } else {
                        str = "BoostFeatureBackground";
                    }
                    arrayList2.add(e0.b(i20, 8, str));
                }
                if ((!B1 && i10 >= messagesController2.channelCustomWallpaperLevelMin) || (B1 && i10 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    int i21 = R.drawable.menu_feature_custombg;
                    if (B1) {
                        i13 = R.string.BoostFeatureCustomBackgroundGroup;
                    } else {
                        i13 = R.string.BoostFeatureCustomBackground;
                    }
                    arrayList2.add(e0.a(i21, i13));
                }
                if (!B1 && i10 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    e0 e0Var = (e0) arrayList.get(i22);
                    e0 e0Var2 = (e0) arrayList2.get(i22);
                    int i23 = e0Var.e;
                    if (e0Var2 != null && ((e0Var.f48887f && i23 > 2) || (e0Var.f48884a == e0Var2.f48884a && e0Var.f48885b == e0Var2.f48885b && TextUtils.equals(e0Var.f48886c, e0Var2.f48886c) && TextUtils.equals(e0Var.d, e0Var2.d) && i23 == e0Var2.e))) {
                    }
                }
                i10++;
            }
            ArrayList arrayList3 = this.f48938u0;
            arrayList3.add(new d0(i10, arrayList3.isEmpty()));
            this.f48938u0.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void O1() {
        int i10;
        if (this.f48928j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i11 = this.f48926h0;
        if (i11 != 19 && i11 != 32 && !C1()) {
            String str = null;
            HashSet hashSet = this.f48942y0;
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
                zVar.f49018r = false;
                zVar.d(true);
                return;
            }
            z zVar2 = this.E0;
            if (zVar2.I == null) {
                hr hrVar = new hr(zVar2.getContext(), null);
                zVar2.I = hrVar;
                hrVar.setGravity(3);
                hr hrVar2 = zVar2.I;
                int i12 = y6.Oh;
                int i13 = y6.Sh;
                gr grVar = hrVar2.f29060a;
                grVar.v = i12;
                grVar.f28739w = i13;
                grVar.f28722b = 0.8f;
                zVar2.setClipChildren(false);
                zVar2.addView(zVar2.I, kb1.i(-1, 24, 16));
            }
            if (!this.Y) {
                this.E0.b(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.E0.b(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.E0.b(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            hr hrVar3 = this.E0.I;
            hrVar3.f29060a.c(hashSet.size(), true);
            this.E0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.f48921c0;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.E0.b(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            z zVar3 = this.E0;
            zVar3.f49018r = false;
            zVar3.d(true);
            return;
        }
        fi.d dVar = this.S0;
        if (z10) {
            if (vg.s.i()) {
                this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                z zVar4 = this.E0;
                if (B1()) {
                    i10 = R.string.BoostGroup;
                } else {
                    i10 = R.string.BoostChannel;
                }
                zVar4.b(LocaleController.getString(i10), true, true);
            }
            this.G0.i(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.i(LocaleController.getString(R.string.BoostGroup), true, true);
            }
        } else if (canApplyBoost.isMaxLvl) {
            this.G0.i(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.i(LocaleController.getString(R.string.OK), true, true);
            }
            this.E0.b(LocaleController.getString(R.string.OK), true, true);
        } else if (vg.s.i()) {
            if (dVar != null) {
                dVar.i(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.G0.i(LocaleController.getString(R.string.BoostBtn), true, true);
            this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
        } else {
            if (dVar != null) {
                dVar.i(LocaleController.getString(R.string.OK), true, true);
            }
            this.G0.i(LocaleController.getString(R.string.OK), true, true);
            this.E0.b(LocaleController.getString(R.string.OK), true, true);
        }
    }

    public final void P1() {
        int i10;
        int i11;
        String string;
        if (this.f48928j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i12 = this.f48926h0;
        if (i12 != 19 && i12 != 32 && !C1()) {
            if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !this.N0) {
                    this.E0.f49016f.setText(LocaleController.getString(R.string.IncreaseLimit));
                    androidx.emoji2.text.p pVar = this.M0;
                    if (pVar != null) {
                        int i13 = pVar.f2568b;
                        int i14 = i13 + 1;
                        int i15 = pVar.f2569c;
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
                        zVar.f49022y.f33934p = null;
                        zVar.F.setVisibility(8);
                        return;
                    }
                    z zVar2 = this.E0;
                    zVar2.f49022y.f33934p = null;
                    zVar2.F.setVisibility(8);
                    return;
                }
                this.E0.f49016f.setText(LocaleController.getString(R.string.OK));
                z zVar3 = this.E0;
                zVar3.f49022y.f33934p = null;
                zVar3.F.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new zq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.E0.f49016f.setText(spannableStringBuilder);
        } else if (vg.s.i()) {
            o0 o0Var = this.E0.f49016f;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.f48921c0;
            if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            } else {
                if (B1()) {
                    i11 = R.string.BoostGroup;
                } else {
                    i11 = R.string.BoostChannel;
                }
                string = LocaleController.getString(i11);
            }
            o0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.f48921c0;
            if (canApplyBoost2 != null && canApplyBoost2.isMaxLvl) {
                this.E0.f49016f.setText(LocaleController.getString(R.string.OK));
            }
        } else {
            o0 o0Var2 = this.E0.f49016f;
            if (B1()) {
                i10 = R.string.BoostGroup;
            } else {
                i10 = R.string.BoostChannel;
            }
            o0Var2.setText(LocaleController.getString(i10));
        }
    }

    public final void Q1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.m0 = -1;
        this.f48932o0 = -1;
        this.f48933p0 = -1;
        this.f48934q0 = -1;
        this.Z = -1;
        this.f48935r0 = -1;
        this.f48937t0 = -1;
        this.f48929k0 = 1;
        this.f48930l0 = 0;
        int i10 = this.f48926h0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 22 && i10 != 23 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 21 && i10 != 30 && i10 != 35) {
            if (i10 != 31 && i10 != 32) {
                if (!z1(i10)) {
                    if (i10 != 11 && i10 != 34) {
                        int i11 = this.f48929k0;
                        this.m0 = i11;
                        this.f48929k0 = i11 + 2;
                        this.f48931n0 = i11 + 1;
                    } else {
                        this.v = 0.24f;
                    }
                    if (this.I0) {
                        int i12 = this.f48929k0;
                        this.f48929k0 = i12 + 1;
                        this.f48934q0 = i12;
                    } else if (i10 != 11 || this.Y) {
                        if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.D0) == null || arrayList.isEmpty()) && ((arrayList2 = this.C0) == null || arrayList2.size() < this.B0.size())) || (arrayList3 = this.D0) == null || arrayList3.size() != 1 || (arrayList4 = this.C0) == null || arrayList4.size() != 1 || !this.Y)) {
                            int i13 = this.f48929k0;
                            this.f48932o0 = i13;
                            if (i10 != 11 && i10 != 34) {
                                if (i10 == 5) {
                                    this.f48929k0 = this.f48943z0.size() + i13;
                                } else {
                                    this.f48929k0 = this.f48927i0.size() + i13;
                                }
                            } else {
                                this.f48929k0 = this.B0.size() + i13;
                            }
                            this.f48933p0 = this.f48929k0;
                        }
                        if (this.f48933p0 - this.f48932o0 > 1) {
                            int i14 = this.f48929k0;
                            this.f48929k0 = i14 + 1;
                            this.f48935r0 = i14;
                        }
                    }
                }
            } else {
                this.v = 0.24f;
                N1();
                int i15 = this.f48929k0;
                this.f48932o0 = i15;
                int i16 = i15 + 1;
                this.f48929k0 = i16;
                this.f48937t0 = i15;
                int size = (this.f48938u0.size() - 1) + i16;
                this.f48929k0 = size;
                this.f48933p0 = size;
            }
        } else {
            if (i10 != 19 || ChatObject.hasAdminRights(w1())) {
                this.v = 0.24f;
                int i17 = this.f48929k0;
                this.f48929k0 = i17 + 1;
                this.Z = i17;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i18 = this.f48929k0;
                    this.f48929k0 = i18 + 1;
                    this.f48936s0 = i18;
                }
            }
            N1();
            int i19 = this.f48929k0;
            int i20 = i19 + 1;
            this.f48929k0 = i20;
            this.f48937t0 = i19;
            this.f48929k0 = (this.f48938u0.size() - 1) + i20;
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull x12;
        r2 r2Var;
        r2 r2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            r2 r2Var3 = this.f26793n;
            r2 lastFragment = r2Var3.getParentLayout().getLastFragment();
            r2 r2Var4 = null;
            if (lastFragment instanceof bh.u) {
                List fragmentStack = r2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    r2Var = (r2) b10.h(2, fragmentStack);
                } else {
                    r2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    r2Var2 = (r2) b10.h(3, fragmentStack);
                } else {
                    r2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    r2Var4 = (r2) b10.h(4, fragmentStack);
                }
                if (r2Var instanceof oo) {
                    ((ActionBarLayout) r2Var3.getParentLayout()).c0(r2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (r2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) r2Var3.getParentLayout()).c0(r2Var2, false);
                    }
                    lastFragment.finishFragment();
                    vg.j.f(r2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                vg.j.f(r2Var2, chat, false);
            } else if ((lastFragment instanceof wn) && booleanValue) {
                vg.j.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof bd) && booleanValue) {
                List fragmentStack2 = r2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    r2 r2Var5 = (r2) fragmentStack2.get(size);
                    if (!(r2Var5 instanceof wn) && !(r2Var5 instanceof ey)) {
                        arrayList.add(r2Var5);
                    } else {
                        r2Var4 = r2Var5;
                        break;
                    }
                }
                if (r2Var4 != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ActionBarLayout) r2Var3.getParentLayout()).c0((r2) obj, false);
                    }
                    r2Var3.finishFragment();
                    dismiss();
                    vg.j.f(r2Var4, chat, true);
                }
            } else if (booleanValue) {
                sb sbVar = sb.F2;
                if (sbVar != null && sbVar.d) {
                    wn ea2 = wn.ea(-chat.f22028id);
                    LaunchActivity.R().presentFragment(ea2, false, false);
                    sb.w();
                    dismiss();
                    vg.j.f(ea2, chat, true);
                    return;
                }
                List fragmentStack3 = r2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    r2Var4 = (r2) b10.h(2, fragmentStack3);
                }
                r2Var3.finishFragment();
                dismiss();
                if (r2Var4 instanceof wn) {
                    vg.j.f(r2Var4, chat, true);
                }
            } else {
                sb sbVar2 = sb.F2;
                if (sbVar2 != null && sbVar2.d) {
                    wn ea3 = wn.ea(-chat.f22028id);
                    LaunchActivity.R().presentFragment(ea3, false, false);
                    sb.w();
                    dismiss();
                    vg.j.f(ea3, chat, false);
                    return;
                }
                dismiss();
                vg.j.f(LaunchActivity.R(), chat, false);
            }
        } else if (i10 == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.f48921c0 != null) {
                this.f48920b0.boosts += intValue;
                if (this.f48926h0 == 32 && (x12 = x1()) != null) {
                    x12.boosts_applied += intValue;
                }
                D1();
                J1(tL_premium_boostsStatus, this.f48923e0);
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.f48921c0;
                if (this.f48920b0.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canApplyBoost.isMaxLvl = z10;
                canApplyBoost.boostedNow = true;
                canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                if (F1()) {
                    qc R = new wc(this.container, this.resourcesProvider).R(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                    R.f31861j = 4000;
                    R.k(true);
                }
            }
        } else if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override
    public final void onThemeColorsChanged() {
        int w02;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColorKey < 0 && this.navBarColor == this.T0 && (w02 = y6.w0(y6.f23428h5, this.resourcesProvider)) != this.navBarColor) {
                this.navBarColor = w02;
                this.T0 = w02;
                setOverlayNavBarColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q1(final da0 da0Var, boolean z10) {
        if (da0Var.c() && !z10) {
            return;
        }
        da0Var.setLoading(true);
        MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.f48919a0, this.f48921c0.slot, new Utilities.Callback(this) {
            public final j0 f49160b;

            {
                this.f49160b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f48919a0, new v3(this.f49160b, da0Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        da0 da0Var2 = da0Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new s9.g(7, this.f49160b, da0Var2), intValue * 1000);
                                return;
                            }
                            vg.j.g(intValue);
                        }
                        da0Var2.setLoading(false);
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final j0 f49160b;

            {
                this.f49160b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.f48919a0, new v3(this.f49160b, da0Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        da0 da0Var2 = da0Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new s9.g(7, this.f49160b, da0Var2), intValue * 1000);
                                return;
                            }
                            vg.j.g(intValue);
                        }
                        da0Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void r1() {
        if (this.G0.isAttachedToWindow()) {
            q1(this.G0, false);
            return;
        }
        fi.d dVar = this.S0;
        if (dVar != null && dVar.isAttachedToWindow()) {
            q1(dVar, false);
        } else {
            q1(this.E0, false);
        }
    }

    public int s1() {
        return 0;
    }

    public final String t1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f48920b0;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.f48920b0.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f48919a0;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (!TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
        }
        return a1.g.o(j10, "https://t.me/boost/?c=");
    }

    public final String u1(boolean z10) {
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
        if (this.f48926h0 == 32) {
            TLRPC.Chat w12 = w1();
            TLRPC.ChatFull x12 = x1();
            int max = Math.max(x12.boosts_unrestrict - x12.boosts_applied, 0);
            if (w12 == null) {
                str2 = "";
            } else {
                str2 = w12.title;
            }
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", max, str2);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f48919a0));
        if (chat == null) {
            if (B1()) {
                i19 = R.string.AccDescrGroup;
            } else {
                i19 = R.string.AccDescrChannel;
            }
            str = LocaleController.getString(i19);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f48920b0;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (C1() && this.f48920b0.next_level_boosts != 0 && z10) {
            if (B1()) {
                i18 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
            } else {
                i18 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.f48920b0;
            int i20 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i20, Integer.valueOf(i20)));
        } else if (z11 && this.f48921c0.alreadyActive) {
            if (this.f48920b0.level == 1) {
                if (B1()) {
                    i17 = R.string.GroupBoostsJustReachedLevel1;
                } else {
                    i17 = R.string.ChannelBoostsJustReachedLevel1;
                }
                return LocaleController.formatString(i17, new Object[0]);
            }
            if (B1()) {
                i16 = R.string.GroupBoostsJustReachedLevelNext;
            } else {
                i16 = R.string.ChannelBoostsJustReachedLevelNext;
            }
            return LocaleController.formatString(i16, Integer.valueOf(this.f48920b0.level), LocaleController.formatPluralString("BoostStories", this.f48920b0.level, new Object[0]));
        } else if (this.f48921c0.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.f48920b0;
            if (tL_premium_boostsStatus3.level == 0) {
                if (B1()) {
                    i15 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i15 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.f48920b0;
                int i21 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i15, str, LocaleController.formatPluralString("MoreBoosts", i21, Integer.valueOf(i21)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (B1()) {
                    i14 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i14 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i14, Integer.valueOf(this.f48920b0.level), LocaleController.formatPluralString("BoostStories", this.f48920b0.level + 1, new Object[0]));
            } else {
                if (B1()) {
                    i13 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i13 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.f48920b0;
                int i22 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i22, Integer.valueOf(i22)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.f48920b0;
            if (tL_premium_boostsStatus6.level == 0) {
                if (B1()) {
                    i12 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i12 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.f48920b0;
                int i23 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i23, Integer.valueOf(i23)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (B1()) {
                    i11 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i11 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i11, Integer.valueOf(this.f48920b0.level), LocaleController.formatPluralString("BoostStories", this.f48920b0.level + 1, new Object[0]));
            } else {
                if (B1()) {
                    i10 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i10 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.f48920b0;
                int i24 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i24, Integer.valueOf(i24)));
            }
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        return new c0(this);
    }

    public final String v1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f48920b0;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.f48921c0.alreadyActive) {
            if (B1()) {
                i15 = R.string.BoostGroup;
            } else {
                i15 = R.string.BoostChannel;
            }
            return LocaleController.getString(i15);
        }
        boolean z10 = this.f48923e0;
        int i16 = this.f48926h0;
        if (z10) {
            if (i16 == 32) {
                if (B1()) {
                    i14 = R.string.BoostGroup;
                } else {
                    i14 = R.string.BoostChannel;
                }
                return LocaleController.getString(i14);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f48919a0));
            if (this.f48921c0.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            if (B1()) {
                i13 = R.string.BoostGroup;
            } else {
                i13 = R.string.BoostChannel;
            }
            return LocaleController.getString(i13);
        } else if (i16 == 32) {
            if (B1()) {
                i12 = R.string.BoostGroup;
            } else {
                i12 = R.string.BoostChannel;
            }
            return LocaleController.getString(i12);
        } else if (this.f48921c0.alreadyActive) {
            if (B1()) {
                i11 = R.string.YouBoostedGroup;
            } else {
                i11 = R.string.YouBoostedChannel;
            }
            return LocaleController.getString(i11);
        } else {
            if (B1()) {
                i10 = R.string.BoostingEnableStoriesForGroup;
            } else {
                i10 = R.string.BoostingEnableStoriesForChannel;
            }
            return LocaleController.getString(i10);
        }
    }

    public final TLRPC.Chat w1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.f48919a0));
    }

    public final TLRPC.ChatFull x1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.f48919a0);
    }

    @Override
    public final CharSequence y() {
        int i10;
        int i11 = this.f48926h0;
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
                            if (B1()) {
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
}
