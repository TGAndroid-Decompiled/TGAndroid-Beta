package zf;

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
import bg.g2;
import g7.e6;
import g7.g6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh.g7;
import kh.h6;
import kh.i9;
import kh.wb;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.ei1;
import org.telegram.ui.ho;
import org.telegram.ui.qn;
import org.telegram.ui.xc;
import org.telegram.ui.yi0;
public class j0 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final int R0 = 0;
    public y A0;
    public final TextView B0;
    public kh.d C0;
    public Runnable D0;
    public boolean E0;
    public dk0 F0;
    public final o2 G0;
    public yi0 H0;
    public androidx.emoji2.text.o I0;
    public boolean J0;
    public TLRPC.Chat K0;
    public final c00 L0;
    public Runnable M0;
    public int N0;
    public final kh.d O0;
    public int P0;
    public String Q0;
    public int T;
    public boolean U;
    public int V;
    public long W;
    public TL_stories.TL_premium_boostsStatus X;
    public ChannelBoostsController.CanApplyBoost Y;
    public i0 Z;
    public boolean f50532a0;
    public boolean f50533b0;
    public org.telegram.ui.Cells.t1 f50534c0;
    public final int f50535d0;
    public final ArrayList f50536e0;
    public boolean f50537f0;
    public int f50538g0;
    public int f50539h0;
    public int f50540i0;
    public int f50541j0;
    public int f50542k0;
    public int f50543l0;
    public int m0;
    public int f50544n0;
    public int f50545o0;
    public int f50546p0;
    public ArrayList f50547q0;
    public boolean f50548r0;
    public int f50549s0;
    public h0 f50550t0;
    public final HashSet f50551u0;
    public final ArrayList f50552v0;
    public final ArrayList f50553w0;
    public ArrayList f50554x0;
    public ArrayList f50555y0;
    public ArrayList f50556z0;

    public j0(int i9, int i10, Context context, o2 o2Var, b6 b6Var) {
        super(context, o2Var, false, v1(i9), false, 1, b6Var);
        this.V = -1;
        this.f50533b0 = false;
        this.f50536e0 = new ArrayList();
        this.f50539h0 = -1;
        this.f50540i0 = -1;
        this.f50541j0 = -1;
        this.f50542k0 = -1;
        this.f50543l0 = -1;
        this.m0 = -1;
        this.f50544n0 = -1;
        this.f50545o0 = -1;
        this.f50546p0 = -1;
        this.f50549s0 = -1;
        this.f50551u0 = new HashSet();
        this.f50552v0 = new ArrayList();
        this.f50553w0 = new ArrayList();
        this.f50554x0 = new ArrayList();
        this.f50555y0 = new ArrayList();
        this.f50556z0 = new ArrayList();
        this.E0 = false;
        this.N0 = 0;
        this.P0 = -4;
        fixNavigationBar(f6.v0(f6.f23072h5, this.resourcesProvider));
        this.G0 = o2Var;
        this.currentAccount = i10;
        this.f50535d0 = i9;
        M();
        M1();
        if (i9 == 2) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v(this, 0));
        } else if (i9 == 5) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v(this, 2));
        }
        L1();
        if (i9 == 32 || w1()) {
            c00 c00Var = new c00(getContext());
            this.L0 = c00Var;
            this.container.addView(c00Var, e6.c(-1.0f, -1));
        }
        if (i9 == 18 || i9 == 20 || i9 == 24 || i9 == 25 || i9 == 26 || i9 == 29 || i9 == 22 || i9 == 23 || i9 == 21 || i9 == 27 || i9 == 28 || i9 == 30 || i9 == 35 || i9 == 31) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            yi0 yi0Var = this.H0;
            if (yi0Var != null) {
                ((ViewGroup) yi0Var.getParent()).removeView(this.H0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.B0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.A0.getTextView().getText());
            textView.setTextColor(f6.v0(f6.Sh, b6Var));
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = f6.v0(f6.Oh, b6Var);
            int k10 = i0.a.k(f6.v0(f6.f23001d6, b6Var), 120);
            textView.setBackground(f6.i0(dp, dp, dp, dp, v02, k10, k10));
        }
        if (i9 == 32) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            kh.d dVar = new kh.d(context, b6Var, true);
            this.O0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, e6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new w(this, 3));
        }
        if (i9 != 19 && i9 != 18) {
            return;
        }
        this.containerView.post(new w(this, 4));
    }

    public static String A1(int i9) {
        switch (i9) {
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

    public static void C1(o2 o2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus != null && canApplyBoost != null && o2Var.getContext() != null) {
            j0 j0Var = new j0(32, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, o2Var.getResourceProvider());
            j0Var.G1(canApplyBoost);
            j0Var.F1(tL_premium_boostsStatus, true);
            j0Var.H1(j10);
            if (z10) {
                o2Var.showDialog(j0Var);
            } else {
                j0Var.show();
            }
        }
    }

    public static void O(j0 j0Var, ArrayList arrayList, TLRPC.User user) {
        j0Var.dismiss();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i9);
            MessagesController.getInstance(j0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(j0Var.currentAccount).deleteParticipantFromChat(chat.f22380id, user);
        }
    }

    public static void P(j0 j0Var, ArrayList arrayList) {
        j0Var.dismiss();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i9));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(j0Var, 1), 64);
        }
    }

    public static void Q(j0 j0Var, ArrayList arrayList, int i9, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i10;
        wk0 wk0Var = j0Var.d;
        ArrayList arrayList2 = j0Var.f50553w0;
        arrayList2.clear();
        ArrayList arrayList3 = j0Var.f50552v0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i11 = 0; i11 < i9; i11++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i11));
        }
        j0Var.E0 = false;
        j0Var.F0.b(j0Var.f50541j0 + 4);
        int i12 = 0;
        while (true) {
            if (i12 < wk0Var.getChildCount()) {
                if (wk0Var.getChildAt(i12) instanceof i0) {
                    i10 = wk0Var.getChildAt(i12).getTop();
                    break;
                }
                i12++;
            } else {
                i10 = 0;
                break;
            }
        }
        j0Var.M1();
        if (j0Var.f50539h0 >= 0 && i10 != 0) {
            ((f2.m0) wk0Var.getLayoutManager()).h1(j0Var.f50539h0 + 1, i10);
        }
        if (j0Var.I0 == null) {
            j0Var.I0 = u1(j0Var.f50535d0, j0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), j0Var.I0.f870b);
        h0 h0Var = j0Var.f50550t0;
        if (h0Var != null) {
            h0Var.g(max, false);
            j0Var.f50550t0.setBagePosition(max / j0Var.I0.f871c);
            h0 h0Var2 = j0Var.f50550t0;
            h0Var2.D = true;
            h0Var2.requestLayout();
        }
    }

    public static void R(j0 j0Var) {
        long j10;
        int i9 = j0Var.f50535d0;
        HashSet hashSet = j0Var.f50551u0;
        if (j0Var.f50537f0) {
            o2 o2Var = j0Var.G0;
            if (o2Var != 0) {
                ?? obj = new Object();
                obj.f23653a = true;
                o2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
            } else {
                return;
            }
        } else if (i9 == 19 || i9 == 32 || j0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.Y;
            if (canApplyBoost.canApply) {
                j0Var.A0.f50651r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.Y;
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
            } else if (canApplyBoost.alreadyActive && bg.u0.i() && !j0Var.Y.isMaxLvl) {
                bg.u.i(j0Var.W, j0Var);
                return;
            } else {
                j0Var.dismiss();
                return;
            }
        }
        if (i9 != 11 && i9 != 34) {
            if (!hashSet.isEmpty()) {
                if (i9 == 2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        j0Var.f50536e0.add((TLRPC.Chat) it.next());
                    }
                    j0Var.D1(arrayList);
                } else if (i9 == 5) {
                    TLRPC.User user = MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(j0Var.currentAccount).getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((TLRPC.Chat) it2.next());
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j0Var.getContext(), 0, j0Var.resourcesProvider);
                    String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
                    c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = formatPluralString;
                    if (arrayList2.size() == 1) {
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
                    } else {
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
                    }
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new hq0(j0Var, arrayList2, user));
                    c2Var.show();
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(f6.v0(f6.f23230q7, j0Var.resourcesProvider));
                    }
                }
            }
        } else if (hashSet.isEmpty()) {
            j0Var.dismiss();
        } else {
            j0Var.E1(null);
        }
    }

    public static b6 R0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static void T(j0 j0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i9 = 0; i9 < min; i9++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i9);
                int currentTime = (ConnectionsManager.getInstance(j0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i9).intValue()) / 86400;
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
            AndroidUtilities.runOnUIThread(new y01(j0Var, arrayList, min, tL_messages_inactiveChats, 16));
        }
    }

    public static void U(j0 j0Var, Context context) {
        int i9;
        o2 o2Var = j0Var.G0;
        int i10 = j0Var.f50535d0;
        if (i10 != 11 && i10 != 34) {
            if (i10 != 19 && i10 != 32 && !j0Var.y1()) {
                if (i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
                    if (!UserConfig.getInstance(j0Var.currentAccount).isPremium() && !MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() && !j0Var.J0) {
                        if (o2Var != null) {
                            if (o2Var.getVisibleDialog() != null) {
                                o2Var.getVisibleDialog().dismiss();
                            }
                            o2Var.presentFragment(new PremiumPreviewFragment(0, A1(i10)));
                            j0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    j0Var.dismiss();
                    return;
                }
                AndroidUtilities.addToClipboard(j0Var.p1());
                j0Var.dismiss();
                return;
            }
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.Y;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(j0Var.currentAccount).isPremium() && bg.u0.i()) {
                    bg.u.i(j0Var.W, j0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, j0Var.resourcesProvider);
                String string = LocaleController.getString(R.string.PremiumNeeded);
                c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                if (j0Var.x1()) {
                    i9 = R.string.PremiumNeededForBoostingGroup;
                } else {
                    i9 = R.string.PremiumNeededForBoosting;
                }
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(i9));
                alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new bg.e(j0Var, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v0.l(18));
                alertDialog$Builder.o();
                return;
            }
            boolean z10 = canApplyBoost.canApply;
            if (z10 && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && bg.u0.i()) {
                    j0Var.f50533b0 = true;
                    j0Var.f50550t0.W = false;
                    o2 o2Var2 = j0Var.f32410n;
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.Y;
                    g2 g2Var = new g2(o2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                    g2Var.show();
                    g2Var.setOnHideListener(new eh.l(j0Var, 13));
                    return;
                }
                j0Var.n1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                o9 o9Var = new o9(j0Var.getContext());
                o9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(o9Var, e6.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(f6.w0(null, f6.f23072h5, false));
                frameLayout.addView(new h6(j0Var.getContext(), paint, j0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), e6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(j0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(f6.w0(null, f6.f23162m6, false));
                frameLayout.addView(imageView, e6.e(24, 24, 17));
                o9 o9Var2 = new o9(j0Var.getContext());
                o9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(o9Var2, e6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(j0Var.getContext());
                frameLayout2.addView(frameLayout, e6.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(f6.w0(null, f6.f23108j5, false));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, e6.t(-1, -2, 0, 24, 80, 24, 0));
                z8 z8Var = new z8((b6) null);
                TLRPC.Chat chat = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.Y.replaceDialogId));
                z8Var.k(j0Var.currentAccount, chat);
                o9Var.e(chat, z8Var);
                z8 z8Var2 = new z8((b6) null);
                TLRPC.Chat chat2 = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.W));
                z8Var2.k(j0Var.currentAccount, chat2);
                o9Var2.e(chat2, z8Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.n(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new bg.e(j0Var, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new v0.l(19));
                alertDialog$Builder2.o();
            } else {
                int i11 = canApplyBoost.floodWait;
                if (i11 != 0) {
                    bg.u.g(i11);
                }
            }
        }
    }

    public static b6 U0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static void V(j0 j0Var, View view) {
        String str;
        gc J;
        int i9;
        HashSet hashSet = j0Var.f50551u0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f24729r.a(hashSet.contains(currentChannel), true);
            j0Var.K1();
        } else if (view instanceof g4) {
            if (j0Var.U || ((i9 = j0Var.f50535d0) != 11 && i9 != 34)) {
                g4 g4Var = (g4) view;
                Object object = g4Var.getObject();
                if (g4Var.K) {
                    if (object instanceof TLRPC.User) {
                        long j10 = ((TLRPC.User) object).f22527id;
                        int i10 = -j0Var.P0;
                        j0Var.P0 = i10;
                        AndroidUtilities.shakeViewSpring(g4Var, i10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getForcedFirstName(MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked()) {
                            J = new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(j0Var, 0));
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
                j0Var.K1();
            }
        }
    }

    public static b6 e0(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static b6 i1(j0 j0Var) {
        return j0Var.resourcesProvider;
    }

    public static androidx.emoji2.text.o u1(int i9, int i10) {
        ?? obj = new Object();
        obj.f869a = 0;
        obj.d = null;
        obj.f872e = null;
        obj.f873f = null;
        obj.f870b = 0;
        obj.f871c = 0;
        if (i9 == 0) {
            obj.f870b = MessagesController.getInstance(i10).dialogFiltersPinnedLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).dialogFiltersPinnedLimitPremium;
            obj.f869a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 33) {
            obj.f870b = MessagesController.getInstance(i10).savedDialogsPinnedLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).savedDialogsPinnedLimitPremium;
            obj.f869a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 2) {
            obj.f870b = MessagesController.getInstance(i10).publicLinksLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).publicLinksLimitPremium;
            obj.f869a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 12) {
            obj.f870b = MessagesController.getInstance(i10).chatlistInvitesLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).chatlistInvitesLimitPremium;
            obj.f869a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 13) {
            obj.f870b = MessagesController.getInstance(i10).chatlistJoinedLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).chatlistJoinedLimitPremium;
            obj.f869a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 3) {
            obj.f870b = MessagesController.getInstance(i10).dialogFiltersLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).dialogFiltersLimitPremium;
            obj.f869a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 4) {
            obj.f870b = MessagesController.getInstance(i10).dialogFiltersChatsLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).dialogFiltersChatsLimitPremium;
            obj.f869a = R.drawable.msg_limit_chats;
            obj.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 5) {
            obj.f870b = MessagesController.getInstance(i10).channelsLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).channelsLimitPremium;
            obj.f869a = R.drawable.msg_limit_groups;
            obj.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 6) {
            obj.f870b = 100;
            obj.f871c = 200;
            obj.f869a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            obj.f872e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            obj.f873f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return obj;
        } else if (i9 == 7) {
            obj.f870b = 3;
            obj.f871c = 4;
            obj.f869a = R.drawable.msg_limit_accounts;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 11) {
            obj.f870b = 0;
            obj.f871c = 0;
            obj.f869a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(obj.f871c));
            obj.f872e = "";
            obj.f873f = "";
            return obj;
        } else if (i9 == 14) {
            obj.f870b = MessagesController.getInstance(i10).storyExpiringLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).storyExpiringLimitPremium;
            obj.f869a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", obj.f870b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", obj.f871c);
            obj.f872e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f871c);
            obj.f873f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f870b);
            return obj;
        } else if (i9 == 15) {
            obj.f870b = MessagesController.getInstance(i10).storiesSentWeeklyLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).storiesSentWeeklyLimitPremium;
            obj.f869a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 == 16) {
            obj.f870b = MessagesController.getInstance(i10).storiesSentMonthlyLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).storiesSentMonthlyLimitPremium;
            obj.f869a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f870b));
            return obj;
        } else if (i9 != 18 && i9 != 32 && i9 != 20 && i9 != 24 && i9 != 27 && i9 != 28 && i9 != 25 && i9 != 30 && i9 != 35 && i9 != 29 && i9 != 22 && i9 != 23 && i9 != 19 && i9 != 21 && i9 != 26) {
            return obj;
        } else {
            obj.f870b = MessagesController.getInstance(i10).storiesSentMonthlyLimitDefault;
            obj.f871c = MessagesController.getInstance(i10).storiesSentMonthlyLimitPremium;
            obj.f869a = R.drawable.filled_limit_boost;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f870b), Integer.valueOf(obj.f871c));
            obj.f872e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f871c));
            obj.f873f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f870b));
            return obj;
        }
    }

    public static boolean v1(int i9) {
        if (i9 != 0 && i9 != 33 && i9 != 3 && i9 != 4 && i9 != 6 && i9 != 7 && i9 != 12 && i9 != 13 && i9 != 14 && i9 != 15 && i9 != 16) {
            return false;
        }
        return true;
    }

    public final boolean B1() {
        String str;
        int i9;
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
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.X, this.Y.copy(), Long.valueOf(this.W));
        kh.d dVar = this.O0;
        if (dVar != null) {
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
            if (max == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z, transitionSet);
        i0 i0Var = this.Z;
        bg.c cVar = i0Var.f50526c;
        int indexOfChild = i0Var.indexOfChild(i0Var.f50525b);
        j0 j0Var = i0Var.f50527e;
        if (j0Var.f50532a0) {
            int indexOfChild2 = i0Var.indexOfChild(i0Var.d);
            i0Var.removeView(i0Var.d);
            i0Var.d.removeView(i0Var.f50524a);
            i0Var.d.removeView(cVar);
            LinearLayout linearLayout = new LinearLayout(i0Var.getContext());
            i0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            i0Var.d.setWeightSum(1.0f);
            i0Var.d.addView(i0Var.f50524a, e6.o(-2, -2, 1.0f, 0));
            i0Var.d.addView(cVar, e6.t(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, e6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.f50524a);
            i0Var.removeView(i0Var.f50524a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.f50524a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            i0Var.f50524a.setTextSize(1, 20.0f);
            i0Var.f50524a.setTextColor(f6.v0(f6.G6, j0Var.resourcesProvider));
            i0Var.f50524a.setGravity(17);
            i0Var.addView(i0Var.f50524a, indexOfChild3, e6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.f50525b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.f50525b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.f50525b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.f50525b.getLineSpacingMultiplier() * 1.1f);
        i0Var.f50525b.setGravity(1);
        i0Var.f50525b.setTextColor(f6.v0(f6.G6, j0Var.resourcesProvider));
        i0Var.addView(i0Var.f50525b, indexOfChild, e6.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z.f50524a.setText(r1());
        TextView textView4 = this.Z.f50525b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i22 = this.f50535d0;
        if (i22 == 20) {
            if (x12) {
                i21 = R.string.GroupNeedBoostsForColorDescription;
            } else {
                i21 = R.string.ChannelNeedBoostsForColorDescription;
            }
            str = LocaleController.formatString(i21, Integer.valueOf(o1()));
        } else if (i22 == 24) {
            if (x12) {
                i20 = R.string.GroupNeedBoostsForProfileColorDescription;
            } else {
                i20 = R.string.ChannelNeedBoostsForProfileColorDescription;
            }
            str = LocaleController.formatString(i20, Integer.valueOf(o1()));
        } else if (i22 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i22 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i22 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i22 == 25) {
            if (x12) {
                i18 = R.string.GroupNeedBoostsForEmojiStatusDescription;
            } else {
                i18 = R.string.ChannelNeedBoostsForEmojiStatusDescription;
            }
            if (x12) {
                i19 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i19 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i18, Integer.valueOf(i19));
        } else if (i22 == 26) {
            if (x12) {
                i16 = R.string.GroupNeedBoostsForWearCollectiblesDescription;
            } else {
                i16 = R.string.ChannelNeedBoostsForWearCollectiblesDescription;
            }
            if (x12) {
                i17 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i17 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i16, Integer.valueOf(i17));
        } else if (i22 == 27) {
            if (x12) {
                i15 = R.string.GroupNeedBoostsForReplyIconDescription;
            } else {
                i15 = R.string.ChannelNeedBoostsForReplyIconDescription;
            }
            str = LocaleController.formatString(i15, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i22 == 28) {
            if (x12) {
                i13 = R.string.GroupNeedBoostsForProfileIconDescription;
            } else {
                i13 = R.string.ChannelNeedBoostsForProfileIconDescription;
            }
            if (x12) {
                i14 = messagesController.groupProfileBgIconLevelMin;
            } else {
                i14 = messagesController.channelProfileIconLevelMin;
            }
            str = LocaleController.formatString(i13, Integer.valueOf(i14));
        } else if (i22 == 22) {
            if (x12) {
                i11 = R.string.GroupNeedBoostsForWallpaperDescription;
            } else {
                i11 = R.string.ChannelNeedBoostsForWallpaperDescription;
            }
            if (x12) {
                i12 = messagesController.groupWallpaperLevelMin;
            } else {
                i12 = messagesController.channelWallpaperLevelMin;
            }
            str = LocaleController.formatString(i11, Integer.valueOf(i12));
        } else if (i22 == 23) {
            if (x12) {
                i9 = R.string.GroupNeedBoostsForCustomWallpaperDescription;
            } else {
                i9 = R.string.ChannelNeedBoostsForCustomWallpaperDescription;
            }
            if (x12) {
                i10 = messagesController.groupCustomWallpaperLevelMin;
            } else {
                i10 = messagesController.channelCustomWallpaperLevelMin;
            }
            str = LocaleController.formatString(i9, Integer.valueOf(i10));
        } else {
            str = null;
        }
        if (str == null) {
            str = q1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        K1();
        c00 c00Var = this.L0;
        c00Var.c(false);
        try {
            c00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z.f50526c.a(this.Y.boostCount, true);
        this.d.x0(0);
        if (i22 == 32) {
            this.Z.f50526c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f50548r0) {
                int i9 = R.string.RevokeLinkAlertChannel;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i9, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                int i10 = R.string.RevokeLinkAlert;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f50548r0) {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ei1(14, this, arrayList));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(f6.v0(f6.f23230q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.Q0)) {
            str = this.Q0;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.K0.f22380id);
            if (chatFull == null) {
                dismiss();
                return;
            } else if (this.K0.username != null) {
                str = "@" + this.K0.username;
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
        HashSet hashSet = this.f50551u0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f22527id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f22527id));
            }
            if (sendPaidMessagesStars >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i9 = 0;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f22527id));
            }
            y4.c0(this.currentAccount, arrayList4, 1, new i9(this, 25));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f22527id))).longValue();
            }
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.f22527id, null, null, null, true, null, null, null, false, 0, 0, null, false);
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

    @Override
    public final void F(xu0 xu0Var) {
        int i9;
        Context context = xu0Var.getContext();
        kh.d dVar = new kh.d(context, this.resourcesProvider, true);
        this.C0 = dVar;
        dVar.setFlickeringLoading(true);
        this.C0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.C0.setOnClickListener(new u(this, 2));
        y yVar = new y(this, context, this.resourcesProvider);
        this.A0 = yVar;
        g6.b(yVar, 0.02f, 1.2f);
        if (!this.f32411r && (i9 = this.f50535d0) != 18 && i9 != 20 && i9 != 24 && i9 != 25 && i9 != 26 && i9 != 29 && i9 != 22 && i9 != 23 && i9 != 21 && i9 != 27 && i9 != 28 && i9 != 30 && i9 != 35) {
            yi0 yi0Var = new yi0(this, context, 13);
            this.H0 = yi0Var;
            yi0Var.setBackgroundColor(f6.v0(f6.f23072h5, this.resourcesProvider));
            xu0Var.addView(this.H0, e6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        y yVar2 = this.A0;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        xu0Var.addView(yVar2, e6.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        wk0 wk0Var = this.d;
        wk0Var.setPadding(0, 0, 0, dp);
        wk0Var.setClipToPadding(false);
        wk0Var.setClipChildren(false);
        wk0Var.setOnItemClickListener(new eh.j(this, 23));
        wk0Var.setOnItemLongClickListener(new bg.e(this, 3));
        this.A0.f50651r.setOnClickListener(new pf.v(7, this, context));
        this.A0.f50648e.setOnClickListener(new u(this, 3));
        this.F0 = new dk0(wk0Var, true);
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X = tL_premium_boostsStatus;
        this.f50532a0 = z10;
        M1();
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.Y = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j10) {
        this.W = j10;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z10;
        this.K0 = chat;
        this.Q0 = str;
        if (TextUtils.isEmpty(str) && !ChatObject.canUserDoAdminAction(chat, 3)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.U = z10;
        this.f50554x0 = new ArrayList(arrayList);
        this.f50555y0 = arrayList2;
        this.f50556z0 = arrayList3;
        HashSet hashSet = this.f50551u0;
        hashSet.clear();
        if (this.U) {
            ArrayList arrayList4 = this.f50554x0;
            int size = arrayList4.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList4.get(i9);
                i9++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f22527id))) {
                    hashSet.add(user);
                }
            }
        }
        M1();
        K1();
        int i10 = this.f50535d0;
        if ((i10 == 11 || i10 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f50554x0.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    y yVar = this.A0;
                    if (yVar != null && yVar.getParent() != null) {
                        ((ViewGroup) this.A0.getParent()).removeView(this.A0);
                    }
                    yi0 yi0Var = this.H0;
                    if (yi0Var != null && yi0Var.getParent() != null) {
                        ((ViewGroup) this.H0.getParent()).removeView(this.H0);
                    }
                    wk0 wk0Var = this.d;
                    if (wk0Var != null) {
                        wk0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void J1() {
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        int i15;
        this.f50547q0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null) {
            i9 = tL_premium_boostsStatus.level + 1;
        } else {
            i9 = 1;
        }
        if (this.f50535d0 == 31) {
            i9 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i16 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            if (peerColors != null) {
                i14 = peerColors.maxLevel(x1());
            } else {
                i14 = 0;
            }
            int max = Math.max(10, i14);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                i15 = peerColors2.maxLevel(x1());
            } else {
                i15 = 0;
            }
            int max2 = Math.max(max, i15);
            if (x1()) {
                i16 = Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                i16 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
            }
        }
        ArrayList arrayList = null;
        while (i9 <= i16) {
            boolean x12 = x1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!x12 && i9 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                e0 b10 = e0.b(R.drawable.menu_feature_stories, i9, "BoostFeatureStoriesPerDay");
                b10.f50496f = true;
                arrayList2.add(b10);
                if (!x12) {
                    e0 b11 = e0.b(R.drawable.menu_feature_reactions, i9, "BoostFeatureCustomReaction");
                    b11.f50496f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                if (peerColors3 != null) {
                    i10 = peerColors3.colorsAvailable(i9, false);
                } else {
                    i10 = 0;
                }
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                if (peerColors4 != null) {
                    i11 = peerColors4.colorsAvailable(i9, x12);
                } else {
                    i11 = 0;
                }
                if (!x12 && i10 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!x12 && i10 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_links, i10, "BoostFeatureReplyColor"));
                }
                if (!x12 && i9 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (i11 > 0) {
                    int i17 = R.drawable.menu_feature_color_profile;
                    if (x12) {
                        str2 = "BoostFeatureProfileColorGroup";
                    } else {
                        str2 = "BoostFeatureProfileColor";
                    }
                    arrayList2.add(e0.b(i17, i11, str2));
                }
                if (x12 && i9 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!x12 && i9 >= messagesController2.channelProfileIconLevelMin) || (x12 && i9 >= messagesController2.groupProfileBgIconLevelMin)) {
                    int i18 = R.drawable.menu_feature_cover;
                    if (x12) {
                        i13 = R.string.BoostFeatureProfileIconGroup;
                    } else {
                        i13 = R.string.BoostFeatureProfileIcon;
                    }
                    arrayList2.add(e0.a(i18, i13));
                }
                if (x12 && i9 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!x12 && i9 >= messagesController2.channelEmojiStatusLevelMin) || (x12 && i9 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new e0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!x12 && i9 >= messagesController2.channelWallpaperLevelMin) || (x12 && i9 >= messagesController2.groupWallpaperLevelMin)) {
                    int i19 = R.drawable.menu_feature_wallpaper;
                    if (x12) {
                        str = "BoostFeatureBackgroundGroup";
                    } else {
                        str = "BoostFeatureBackground";
                    }
                    arrayList2.add(e0.b(i19, 8, str));
                }
                if ((!x12 && i9 >= messagesController2.channelCustomWallpaperLevelMin) || (x12 && i9 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    int i20 = R.drawable.menu_feature_custombg;
                    if (x12) {
                        i12 = R.string.BoostFeatureCustomBackgroundGroup;
                    } else {
                        i12 = R.string.BoostFeatureCustomBackground;
                    }
                    arrayList2.add(e0.a(i20, i12));
                }
                if (!x12 && i9 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    e0 e0Var = (e0) arrayList.get(i21);
                    e0 e0Var2 = (e0) arrayList2.get(i21);
                    int i22 = e0Var.f50495e;
                    if (e0Var2 != null && ((e0Var.f50496f && i22 > 2) || (e0Var.f50492a == e0Var2.f50492a && e0Var.f50493b == e0Var2.f50493b && TextUtils.equals(e0Var.f50494c, e0Var2.f50494c) && TextUtils.equals(e0Var.d, e0Var2.d) && i22 == e0Var2.f50495e))) {
                    }
                }
                i9++;
            }
            ArrayList arrayList3 = this.f50547q0;
            arrayList3.add(new d0(i9, arrayList3.isEmpty()));
            this.f50547q0.addAll(arrayList2);
            arrayList = arrayList2;
            i9++;
        }
    }

    public final void K1() {
        int i9;
        if (this.f50537f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.f50535d0;
        if (i10 != 19 && i10 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.f50551u0;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() > 0) {
                    if (i10 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i10 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.A0.c(str, true, true);
                    return;
                }
                y yVar = this.A0;
                yVar.h = false;
                yVar.d(true);
                return;
            }
            y yVar2 = this.A0;
            if (yVar2.C == null) {
                mq mqVar = new mq(yVar2.getContext(), null);
                yVar2.C = mqVar;
                mqVar.setGravity(3);
                mq mqVar2 = yVar2.C;
                int i11 = f6.Oh;
                int i12 = f6.Sh;
                lq lqVar = mqVar2.f30905a;
                lqVar.v = i11;
                lqVar.f30533w = i12;
                lqVar.f30515b = 0.8f;
                yVar2.setClipChildren(false);
                yVar2.addView(yVar2.C, e6.e(-1, 24, 16));
            }
            if (!this.U) {
                this.A0.c(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.A0.c(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.A0.c(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            mq mqVar3 = this.A0.C;
            mqVar3.f30905a.c(hashSet.size(), true);
            this.A0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.A0.c(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            y yVar3 = this.A0;
            yVar3.h = false;
            yVar3.d(true);
            return;
        }
        kh.d dVar = this.O0;
        if (z10) {
            if (bg.u0.i()) {
                this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                y yVar4 = this.A0;
                if (x1()) {
                    i9 = R.string.BoostGroup;
                } else {
                    i9 = R.string.BoostChannel;
                }
                yVar4.c(LocaleController.getString(i9), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
        } else if (canApplyBoost.isMaxLvl) {
            this.C0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.A0.c(LocaleController.getString(R.string.OK), true, true);
        } else if (bg.u0.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
        } else {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.OK), true, true);
            this.A0.c(LocaleController.getString(R.string.OK), true, true);
        }
    }

    public final void L1() {
        int i9;
        int i10;
        String string;
        if (this.f50537f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i11 = this.f50535d0;
        if (i11 != 19 && i11 != 32 && !y1()) {
            if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !this.J0) {
                    this.A0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
                    androidx.emoji2.text.o oVar = this.I0;
                    if (oVar != null) {
                        int i12 = oVar.f870b;
                        int i13 = i12 + 1;
                        int i14 = oVar.f871c;
                        if (i13 == i14) {
                            this.A0.setIcon(R.raw.addone_icon);
                            return;
                        }
                        if (i12 != 0 && i14 != 0) {
                            float f10 = i14 / i12;
                            if (f10 >= 1.6f && f10 <= 2.5f) {
                                this.A0.setIcon(R.raw.double_icon);
                                return;
                            }
                        }
                        y yVar = this.A0;
                        yVar.f50653w.f33550p = null;
                        yVar.f50655y.setVisibility(8);
                        return;
                    }
                    y yVar2 = this.A0;
                    yVar2.f50653w.f33550p = null;
                    yVar2.f50655y.setVisibility(8);
                    return;
                }
                this.A0.d.setText(LocaleController.getString(R.string.OK));
                y yVar3 = this.A0;
                yVar3.f50653w.f33550p = null;
                yVar3.f50655y.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new eq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.A0.d.setText(spannableStringBuilder);
        } else if (bg.u0.i()) {
            o0 o0Var = this.A0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
            if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            } else {
                if (x1()) {
                    i10 = R.string.BoostGroup;
                } else {
                    i10 = R.string.BoostChannel;
                }
                string = LocaleController.getString(i10);
            }
            o0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.Y;
            if (canApplyBoost2 != null && canApplyBoost2.isMaxLvl) {
                this.A0.d.setText(LocaleController.getString(R.string.OK));
            }
        } else {
            o0 o0Var2 = this.A0.d;
            if (x1()) {
                i9 = R.string.BoostGroup;
            } else {
                i9 = R.string.BoostChannel;
            }
            o0Var2.setText(LocaleController.getString(i9));
        }
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f50540i0 = -1;
        this.f50542k0 = -1;
        this.f50543l0 = -1;
        this.m0 = -1;
        this.V = -1;
        this.f50544n0 = -1;
        this.f50546p0 = -1;
        this.f50538g0 = 1;
        this.f50539h0 = 0;
        int i9 = this.f50535d0;
        if (i9 != 19 && i9 != 18 && i9 != 20 && i9 != 24 && i9 != 27 && i9 != 28 && i9 != 22 && i9 != 23 && i9 != 25 && i9 != 26 && i9 != 29 && i9 != 21 && i9 != 30 && i9 != 35) {
            if (i9 != 31 && i9 != 32) {
                if (!v1(i9)) {
                    if (i9 != 11 && i9 != 34) {
                        int i10 = this.f50538g0;
                        this.f50540i0 = i10;
                        this.f50538g0 = i10 + 2;
                        this.f50541j0 = i10 + 1;
                    } else {
                        this.v = 0.24f;
                    }
                    if (this.E0) {
                        int i11 = this.f50538g0;
                        this.f50538g0 = i11 + 1;
                        this.m0 = i11;
                    } else if (i9 != 11 || this.U) {
                        if (i9 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.f50556z0) == null || arrayList.isEmpty()) && ((arrayList2 = this.f50555y0) == null || arrayList2.size() < this.f50554x0.size())) || (arrayList3 = this.f50556z0) == null || arrayList3.size() != 1 || (arrayList4 = this.f50555y0) == null || arrayList4.size() != 1 || !this.U)) {
                            int i12 = this.f50538g0;
                            this.f50542k0 = i12;
                            if (i9 != 11 && i9 != 34) {
                                if (i9 == 5) {
                                    this.f50538g0 = this.f50552v0.size() + i12;
                                } else {
                                    this.f50538g0 = this.f50536e0.size() + i12;
                                }
                            } else {
                                this.f50538g0 = this.f50554x0.size() + i12;
                            }
                            this.f50543l0 = this.f50538g0;
                        }
                        if (this.f50543l0 - this.f50542k0 > 1) {
                            int i13 = this.f50538g0;
                            this.f50538g0 = i13 + 1;
                            this.f50544n0 = i13;
                        }
                    }
                }
            } else {
                this.v = 0.24f;
                J1();
                int i14 = this.f50538g0;
                this.f50542k0 = i14;
                int i15 = i14 + 1;
                this.f50538g0 = i15;
                this.f50546p0 = i14;
                int size = (this.f50547q0.size() - 1) + i15;
                this.f50538g0 = size;
                this.f50543l0 = size;
            }
        } else {
            if (i9 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i16 = this.f50538g0;
                this.f50538g0 = i16 + 1;
                this.V = i16;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i17 = this.f50538g0;
                    this.f50538g0 = i17 + 1;
                    this.f50545o0 = i17;
                }
            }
            J1();
            int i18 = this.f50538g0;
            int i19 = i18 + 1;
            this.f50538g0 = i19;
            this.f50546p0 = i18;
            this.f50538g0 = (this.f50547q0.size() - 1) + i19;
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull t12;
        o2 o2Var;
        o2 o2Var2;
        if (i9 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            o2 o2Var3 = this.f32410n;
            o2 lastFragment = o2Var3.getParentLayout().getLastFragment();
            o2 o2Var4 = null;
            if (lastFragment instanceof hg.s) {
                List fragmentStack = o2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    o2Var = (o2) j3.r0.k(2, fragmentStack);
                } else {
                    o2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    o2Var2 = (o2) j3.r0.k(3, fragmentStack);
                } else {
                    o2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    o2Var4 = (o2) j3.r0.k(4, fragmentStack);
                }
                if (o2Var instanceof ho) {
                    ((ActionBarLayout) o2Var3.getParentLayout()).a0(o2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (o2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) o2Var3.getParentLayout()).a0(o2Var2, false);
                    }
                    lastFragment.finishFragment();
                    bg.u.f(o2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                bg.u.f(o2Var2, chat, false);
            } else if ((lastFragment instanceof qn) && booleanValue) {
                bg.u.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof xc) && booleanValue) {
                List fragmentStack2 = o2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    o2 o2Var5 = (o2) fragmentStack2.get(size);
                    if (!(o2Var5 instanceof qn) && !(o2Var5 instanceof dy)) {
                        arrayList.add(o2Var5);
                    } else {
                        o2Var4 = o2Var5;
                        break;
                    }
                }
                if (o2Var4 != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((ActionBarLayout) o2Var3.getParentLayout()).a0((o2) obj, false);
                    }
                    o2Var3.finishFragment();
                    dismiss();
                    bg.u.f(o2Var4, chat, true);
                }
            } else if (booleanValue) {
                wb wbVar = wb.B2;
                if (wbVar != null && wbVar.d) {
                    qn R9 = qn.R9(-chat.f22380id);
                    LaunchActivity.R().presentFragment(R9, false, false);
                    wb.x();
                    dismiss();
                    bg.u.f(R9, chat, true);
                    return;
                }
                List fragmentStack3 = o2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    o2Var4 = (o2) j3.r0.k(2, fragmentStack3);
                }
                o2Var3.finishFragment();
                dismiss();
                if (o2Var4 instanceof qn) {
                    bg.u.f(o2Var4, chat, true);
                }
            } else {
                wb wbVar2 = wb.B2;
                if (wbVar2 != null && wbVar2.d) {
                    qn R92 = qn.R9(-chat.f22380id);
                    LaunchActivity.R().presentFragment(R92, false, false);
                    wb.x();
                    dismiss();
                    bg.u.f(R92, chat, false);
                    return;
                }
                dismiss();
                bg.u.f(LaunchActivity.R(), chat, false);
            }
        } else if (i9 == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.Y != null) {
                this.X.boosts += intValue;
                if (this.f50535d0 == 32 && (t12 = t1()) != null) {
                    t12.boosts_applied += intValue;
                }
                z1();
                F1(tL_premium_boostsStatus, this.f50532a0);
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
                if (this.X.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canApplyBoost.isMaxLvl = z10;
                canApplyBoost.boostedNow = true;
                canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                if (B1()) {
                    gc Q = new oc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                    Q.f28737j = 4000;
                    Q.k(true);
                }
            }
        } else if (i9 == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    public final void m1(final o80 o80Var, boolean z10) {
        if (o80Var.b() && !z10) {
            return;
        }
        o80Var.setLoading(true);
        MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.W, this.Y.slot, new Utilities.Callback(this) {
            public final j0 f50770b;

            {
                this.f50770b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new g7(this.f50770b, o80Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        o80 o80Var2 = o80Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new xf.o0(10, this.f50770b, o80Var2), intValue * 1000);
                                return;
                            }
                            bg.u.g(intValue);
                        }
                        o80Var2.setLoading(false);
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final j0 f50770b;

            {
                this.f50770b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new g7(this.f50770b, o80Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        o80 o80Var2 = o80Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new xf.o0(10, this.f50770b, o80Var2), intValue * 1000);
                                return;
                            }
                            bg.u.g(intValue);
                        }
                        o80Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void n1() {
        if (this.C0.isAttachedToWindow()) {
            m1(this.C0, false);
            return;
        }
        kh.d dVar = this.O0;
        if (dVar != null && dVar.isAttachedToWindow()) {
            m1(dVar, false);
        } else {
            m1(this.A0, false);
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X.boost_url;
        }
        int i9 = this.currentAccount;
        long j10 = -this.W;
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(j10));
        if (!TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
        }
        return aa.d.m(j10, "https://t.me/boost/?c=");
    }

    public final String q1(boolean z10) {
        String str;
        boolean z11;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str2;
        if (this.f50535d0 == 32) {
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
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
        if (chat == null) {
            if (x1()) {
                i18 = R.string.AccDescrGroup;
            } else {
                i18 = R.string.AccDescrChannel;
            }
            str = LocaleController.getString(i18);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y1() && this.X.next_level_boosts != 0 && z10) {
            if (x1()) {
                i17 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
            } else {
                i17 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X;
            int i19 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i17, str, LocaleController.formatPluralString("MoreBoosts", i19, Integer.valueOf(i19)));
        } else if (z11 && this.Y.alreadyActive) {
            if (this.X.level == 1) {
                if (x1()) {
                    i16 = R.string.GroupBoostsJustReachedLevel1;
                } else {
                    i16 = R.string.ChannelBoostsJustReachedLevel1;
                }
                return LocaleController.formatString(i16, new Object[0]);
            }
            if (x1()) {
                i15 = R.string.GroupBoostsJustReachedLevelNext;
            } else {
                i15 = R.string.ChannelBoostsJustReachedLevelNext;
            }
            return LocaleController.formatString(i15, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level, new Object[0]));
        } else if (this.Y.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X;
            if (tL_premium_boostsStatus3.level == 0) {
                if (x1()) {
                    i14 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i14 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X;
                int i20 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i14, str, LocaleController.formatPluralString("MoreBoosts", i20, Integer.valueOf(i20)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (x1()) {
                    i13 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i13 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i13, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i12 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i12 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X;
                int i21 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i21, Integer.valueOf(i21)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X;
            if (tL_premium_boostsStatus6.level == 0) {
                if (x1()) {
                    i11 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i11 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X;
                int i22 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i11, str, LocaleController.formatPluralString("MoreBoosts", i22, Integer.valueOf(i22)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (x1()) {
                    i10 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i10 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i10, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i9 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i9 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X;
                int i23 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return LocaleController.formatString(i9, str, LocaleController.formatPluralString("MoreBoosts", i23, Integer.valueOf(i23)));
            }
        }
    }

    public final String r1() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Y.alreadyActive) {
            if (x1()) {
                i14 = R.string.BoostGroup;
            } else {
                i14 = R.string.BoostChannel;
            }
            return LocaleController.getString(i14);
        }
        boolean z10 = this.f50532a0;
        int i15 = this.f50535d0;
        if (z10) {
            if (i15 == 32) {
                if (x1()) {
                    i13 = R.string.BoostGroup;
                } else {
                    i13 = R.string.BoostChannel;
                }
                return LocaleController.getString(i13);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
            if (this.Y.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            if (x1()) {
                i12 = R.string.BoostGroup;
            } else {
                i12 = R.string.BoostChannel;
            }
            return LocaleController.getString(i12);
        } else if (i15 == 32) {
            if (x1()) {
                i11 = R.string.BoostGroup;
            } else {
                i11 = R.string.BoostChannel;
            }
            return LocaleController.getString(i11);
        } else if (this.Y.alreadyActive) {
            if (x1()) {
                i10 = R.string.YouBoostedGroup;
            } else {
                i10 = R.string.YouBoostedChannel;
            }
            return LocaleController.getString(i10);
        } else {
            if (x1()) {
                i9 = R.string.BoostingEnableStoriesForGroup;
            } else {
                i9 = R.string.BoostingEnableStoriesForChannel;
            }
            return LocaleController.getString(i9);
        }
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.W);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        return new c0(this);
    }

    public final boolean w1() {
        int i9 = this.f50535d0;
        if (i9 != 19 && i9 != 18 && i9 != 20 && i9 != 24 && i9 != 25 && i9 != 26 && i9 != 29 && i9 != 22 && i9 != 27 && i9 != 28 && i9 != 23 && i9 != 30 && i9 != 35) {
            return false;
        }
        return true;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W)));
    }

    @Override
    public final CharSequence y() {
        int i9;
        int i10 = this.f50535d0;
        if (i10 != 11) {
            if (i10 != 34) {
                if (i10 != 35) {
                    switch (i10) {
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
                                i9 = R.string.BoostGroup;
                            } else {
                                i9 = R.string.BoostChannel;
                            }
                            return LocaleController.getString(i9);
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
        int i9;
        h0 h0Var = this.f50550t0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.f26449b++;
        h0Var.f26447a = g7.n.a((i10 - i9) / i11, 0.0f, 1.0f);
        h0Var.S = true;
        h0Var.T = h0Var.f26459n;
        h0Var.g(i10, true);
        h0Var.E.requestLayout();
        h0Var.requestLayout();
    }
}
