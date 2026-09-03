package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy0;
import org.telegram.ui.n20;
import org.telegram.ui.qi1;
import ph.d4;
import ph.e6;
import ph.s8;
public final class d3 extends n20 implements NotificationCenter.NotificationCenterDelegate {
    public final long M;
    public FrameLayout N;
    public fg.i O;
    public gn P;
    public v2 Q;

    public d3(long j10) {
        this.M = j10;
        this.J = true;
        this.I = AndroidUtilities.dp(60.0f);
    }

    public static void A0(d3 d3Var, TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var) {
        long j10 = d3Var.M;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            lh.y d = lh.b0.g(d3Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.f13351a;
            MessagesController.getInstance(i10).putUsers(connectedstarrefbots.users, false);
            for (int i11 = 0; i11 < connectedstarrefbots.connected_bots.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i11);
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i12)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i12);
                            d.f13353c = Math.max(d.f13353c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f13352b));
            d.a();
            lh.z e = lh.b0.g(d3Var.currentAccount).e(j10);
            e.f13402c = 0;
            e.d = false;
            e.f13405i = false;
            e.f13403f = 0L;
            e.f13406j = null;
            e.h = false;
            e.a();
            d3Var.Q.N(true);
        }
        d2Var.dismiss();
    }

    public static boolean B0(d3 d3Var, Context context, View view, int i10) {
        v2 v2Var = d3Var.Q;
        if (v2Var != null) {
            Object obj = v2Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(d3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                p70 H = p70.H(d3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new e6(16, d3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new e6(17, d3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new m71(d3Var, connectedbotstarref, user, 23), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new dy0(d3Var, context, user, connectedbotstarref, 18));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int C0(d3 d3Var) {
        return d3Var.currentAccount;
    }

    public static int D0(d3 d3Var) {
        return d3Var.currentAccount;
    }

    public static void G0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.f6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: rh.d3.G0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.f6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.g3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, f6 f6Var) {
        int i11;
        int i12;
        float f10;
        float f11;
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c3;
        String formatPluralString;
        int i13;
        char c10;
        String formatPluralString2;
        int i14;
        org.telegram.ui.ActionBar.g3 g3Var;
        LinearLayout linearLayout2;
        String str2;
        int i15;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        f6 f6Var2;
        PorterDuff.Mode mode;
        String str3;
        int i16;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f12 = org.telegram.messenger.y3.f(context, 1);
        f12.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f12.setClipChildren(false);
        f12.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int dp = AndroidUtilities.dp(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = j6.wj;
        } else {
            i11 = j6.Oh;
        }
        view.setBackground(j6.K(dp, j6.v0(i11, f6Var)));
        frameLayout.addView(view, b6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i12 = R.drawable.msg_link_2;
        } else {
            i12 = R.drawable.msg_limit_links;
        }
        imageView.setImageResource(i12);
        if (connectedbotstarref.revoked) {
            f10 = 2.0f;
        } else {
            f10 = 1.8f;
        }
        imageView.setScaleX(f10);
        if (connectedbotstarref.revoked) {
            f11 = 2.0f;
        } else {
            f11 = 1.8f;
        }
        imageView.setScaleY(f11);
        frameLayout.addView(imageView, b6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(j6.b0(AndroidUtilities.dp(50.0f), j6.v0(j6.f19952h5, f6Var)));
            frameLayout.addView(frameLayout2, b6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            int dp2 = AndroidUtilities.dp(9.5f);
            if (connectedbotstarref.revoked) {
                i16 = j6.wj;
            } else {
                i16 = j6.uj;
            }
            textView.setBackground(j6.b0(dp2, j6.v0(i16, f6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            lq lqVar = new lq(R.drawable.mini_reply_user, 0);
            lqVar.setScale(0.937f, 0.937f);
            lqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            lqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, b6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f12.addView(frameLayout, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i17 = j6.G6;
        org.telegram.ui.b.l(i17, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f12.addView(textView2, b6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i18 = j6.f19827a7;
        linearLayout3.setBackground(j6.b0(dp3, j6.v0(i18, f6Var)));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        z8 z8Var = new z8((f6) null);
        linearLayout3.addView(p9Var, b6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(j6.v0(i17, f6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        z8Var.r(user2);
        p9Var.e(user2, z8Var);
        linearLayout3.addView(textView3, b6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i19 = j6.f20131r5;
        int v02 = j6.v0(i19, f6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, b6.t(-2, -2, 16, 5, 0, 8, 0));
        f12.addView(linearLayout3, b6.t(-2, 28, 1, 4, 0, 4, 0));
        d6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        org.telegram.ui.b.l(i17, f6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.y3.q(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j10 < 0) {
                int i20 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String G0 = j.G0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i21 = connectedbotstarref.duration_months;
                if (i21 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout3;
                    c10 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i21 < 12 || i21 % 12 != 0) {
                        c10 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i21, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i21 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c10] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                org.telegram.ui.b.o(i20, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i22 = R.string.ChannelAffiliateProgramLinkTextUser;
                String G02 = j.G0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i23 = connectedbotstarref.duration_months;
                if (i23 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i13 = 3;
                    c3 = 0;
                } else {
                    str = userName2;
                    if (i23 < 12 || i23 % 12 != 0) {
                        c3 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i23, new Object[0]);
                    } else {
                        c3 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i23 / 12, new Object[0]);
                    }
                    i13 = 3;
                }
                Object[] objArr2 = new Object[i13];
                objArr2[c3] = G02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                org.telegram.ui.b.o(i22, objArr2, textView4);
            }
        }
        f12.addView(textView4, b6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            org.telegram.ui.b.l(i17, f6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f12.addView(textView5, b6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(i18, f6Var)));
            p9 p9Var2 = new p9(context);
            p9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            z8 z8Var2 = new z8((f6) null);
            linearLayout4.addView(p9Var2, b6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(j6.v0(i17, f6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                z8Var2.r(user3);
                p9Var2.e(user3, z8Var2);
                textView6.setText(UserObject.getUserName(user3));
                i14 = i17;
                g3Var = o10;
                mode = mode2;
            } else {
                i14 = i17;
                g3Var = o10;
                mode = mode2;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                z8Var2.q(chat);
                p9Var2.e(chat, z8Var2);
                if (chat == null) {
                    str3 = "";
                } else {
                    str3 = chat.title;
                }
                textView6.setText(str3);
            }
            linearLayout4.addView(textView6, b6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i19, f6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, b6.t(-2, -2, 16, 2, 0, 5, 0));
            f12.addView(linearLayout4, b6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i14 = i17;
            g3Var = o10;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(j6.v0(i14, f6Var));
        int dp4 = AndroidUtilities.dp(8.0f);
        int v03 = j6.v0(i18, f6Var);
        int v = j6.v(j6.v0(i18, f6Var), j6.v0(j6.f19971i6, f6Var));
        textView7.setBackground(j6.i0(dp4, dp4, dp4, dp4, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        f12.addView(textView7, b6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ph.d dVar = new ph.d(context, f6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new lq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        f12.addView(dVar, b6.n(-1, 48));
        f90 f90Var = new f90(context, f6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i15 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i15 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        f90Var.setText(formatPluralString3);
        f90Var.setGravity(17);
        f90Var.setTextSize(i15, 12.0f);
        f90Var.setTextColor(j6.v0(j6.B6, f6Var));
        f90Var.setLinkTextColor(j6.v0(j6.f19941gc, f6Var));
        f12.addView(f90Var, b6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
        g3Var2.customView = f12;
        dy0 dy0Var = new dy0(connectedbotstarref, g3Var2, f6Var, user, 17);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new oh.n(dy0Var, 15));
        }
        dVar.setOnClickListener(new u2(connectedbotstarref, i10, g3Var2, context, j10, f6Var, dy0Var));
        g3Var2.setOnDismissListener(new dg.e0(6));
        if (linearLayout2 != null) {
            lh.b0.g(i10).n();
            lh.b0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            f6Var2 = f6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u2(i10, g3Var2, f6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            f6Var2 = f6Var;
        }
        linearLayout.setOnClickListener(new s8(3, g3Var2, connectedbotstarref2));
        g3Var2.fixNavigationBar(j6.v0(j6.f19952h5, f6Var2));
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            g3Var2.makeAttached(U);
        }
        g3Var2.show();
        return g3Var2;
    }

    public static void x0(d3 d3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new org.telegram.ui.web.m(4, d3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(d3 d3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(d3Var.getParentActivity(), 3, null);
        d2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(d3Var.currentAccount).getInputPeer(d3Var.M);
        editconnectedstarrefbot.revoked = true;
        d3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new qi1(5, d3Var, d2Var));
    }

    public static void z0(d3 d3Var, Context context, int i10) {
        v2 v2Var = d3Var.Q;
        if (v2Var != null) {
            Object obj = v2Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                G0(context, d3Var.currentAccount, (TL_payments.starRefProgram) obj, d3Var.M, d3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                H0(context, d3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, d3Var.M, d3Var.resourceProvider);
            }
        }
    }

    public final void F0(java.util.ArrayList r18, org.telegram.ui.Components.w51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: rh.d3.F0(java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    @Override
    public final View createView(Context context) {
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        gn gnVar = new gn(context, 27);
        this.P = gnVar;
        gnVar.setBackgroundColor(j6.w0(null, j6.f19970i5, false));
        super.createView(context);
        this.N = new FrameLayout(context);
        fg.i iVar = new fg.i(context, 1, 3);
        this.O = iVar;
        iVar.setImportantForAccessibility(4);
        fg.a aVar = this.O.f6156b;
        aVar.f6135w = j6.fk;
        aVar.f6136x = j6.gk;
        aVar.b();
        this.O.setStarParticlesView(this.e);
        this.N.addView(this.O, b6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.N, null);
        this.f36318c.setOnItemClickListener(new gg.v0(24, this, context));
        this.f36318c.setOnItemLongClickListener(new org.telegram.ui.web.m(5, this, context));
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.f36318c.setItemAnimator(lVar);
        this.f36318c.setOnScrollListener(new mb0(this, 15));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v2 v2Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.M;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j10) {
                v2 v2Var2 = this.Q;
                if (v2Var2 != null) {
                    v2Var2.N(true);
                }
                lh.b0.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (v2Var = this.Q) != null) {
            v2Var.N(true);
        }
    }

    @Override
    public final f2.o0 n0() {
        v2 v2Var = new v2(this, this.f36318c, getParentActivity(), this.currentAccount, this.classGuid, new d4(this, 12), getResourceProvider());
        this.Q = v2Var;
        return v2Var;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override
    public final void onPause() {
        super.onPause();
        fg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(true);
            this.O.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(false);
            this.O.setDialogVisible(false);
        }
    }

    @Override
    public final eg.q2 p0() {
        eg.h hVar = new eg.h(getParentActivity(), 5);
        hVar.b();
        return hVar;
    }
}
