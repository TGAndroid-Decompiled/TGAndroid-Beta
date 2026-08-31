package sh;

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
import k7.c6;
import k7.e6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.li1;
import org.telegram.ui.m20;
import org.telegram.ui.yx0;
import qh.d4;
import qh.d6;
import qh.r8;
public final class d3 extends m20 implements NotificationCenter.NotificationCenterDelegate {
    public final long M;
    public FrameLayout N;
    public gg.i O;
    public jn P;
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
            mh.x d = mh.a0.g(d3Var.currentAccount).d(j10);
            ArrayList arrayList = d.f15021e;
            int i10 = d.f15018a;
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
                            d.f15020c = Math.max(d.f15020c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f15019b));
            d.a();
            mh.y e6 = mh.a0.g(d3Var.currentAccount).e(j10);
            e6.f15070c = 0;
            e6.d = false;
            e6.f15074i = false;
            e6.f15072f = 0L;
            e6.f15075j = null;
            e6.h = false;
            e6.a();
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
                q70 H = q70.H(d3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new d6(16, d3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new d6(17, d3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new o71(d3Var, connectedbotstarref, user, 24), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new yx0(d3Var, context, user, connectedbotstarref, 18));
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

    public static void G0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.g6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: sh.d3.G0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.g6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.h3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, g6 g6Var) {
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c3;
        String formatPluralString;
        int i11;
        char c10;
        String formatPluralString2;
        int i12;
        org.telegram.ui.ActionBar.h3 h3Var;
        LinearLayout linearLayout2;
        int i13;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        g6 g6Var2;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(k6.K(AndroidUtilities.dp(40.0f), k6.v0(connectedbotstarref.revoked ? k6.wj : k6.Oh, g6Var)));
        frameLayout.addView(view, c6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, c6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(k6.b0(AndroidUtilities.dp(50.0f), k6.v0(k6.f21731h5, g6Var)));
            frameLayout.addView(frameLayout2, c6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(k6.b0(AndroidUtilities.dp(9.5f), k6.v0(connectedbotstarref.revoked ? k6.wj : k6.uj, g6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            oq oqVar = new oq(R.drawable.mini_reply_user, 0);
            oqVar.setScale(0.937f, 0.937f);
            oqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            oqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, c6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f10.addView(frameLayout, c6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i14 = k6.G6;
        org.telegram.ui.b.l(i14, g6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f10.addView(textView2, c6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i15 = k6.f21605a7;
        linearLayout3.setBackground(k6.b0(dp, k6.v0(i15, g6Var)));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        z8 z8Var = new z8((g6) null);
        linearLayout3.addView(p9Var, c6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(k6.v0(i14, g6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        z8Var.r(user2);
        p9Var.e(user2, z8Var);
        linearLayout3.addView(textView3, c6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i16 = k6.f21911r5;
        int v02 = k6.v0(i16, g6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, c6.t(-2, -2, 16, 5, 0, 8, 0));
        f10.addView(linearLayout3, c6.t(-2, 28, 1, 4, 0, 4, 0));
        e6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        org.telegram.ui.b.l(i14, g6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.y3.q(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j10 < 0) {
                int i17 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String G0 = j.G0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i18 = connectedbotstarref.duration_months;
                if (i18 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout3;
                    c10 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i18 < 12 || i18 % 12 != 0) {
                        c10 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i18, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i18 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c10] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                org.telegram.ui.b.o(i17, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i19 = R.string.ChannelAffiliateProgramLinkTextUser;
                String G02 = j.G0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i20 = connectedbotstarref.duration_months;
                if (i20 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i11 = 3;
                    c3 = 0;
                } else {
                    str = userName2;
                    if (i20 < 12 || i20 % 12 != 0) {
                        c3 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i20, new Object[0]);
                    } else {
                        c3 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i20 / 12, new Object[0]);
                    }
                    i11 = 3;
                }
                Object[] objArr2 = new Object[i11];
                objArr2[c3] = G02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                org.telegram.ui.b.o(i19, objArr2, textView4);
            }
        }
        f10.addView(textView4, c6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i12 = i14;
            h3Var = o10;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            org.telegram.ui.b.l(i14, g6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f10.addView(textView5, c6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(k6.b0(AndroidUtilities.dp(28.0f), k6.v0(i15, g6Var)));
            p9 p9Var2 = new p9(context);
            p9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            z8 z8Var2 = new z8((g6) null);
            linearLayout4.addView(p9Var2, c6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(k6.v0(i14, g6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                z8Var2.r(user3);
                p9Var2.e(user3, z8Var2);
                textView6.setText(UserObject.getUserName(user3));
                i12 = i14;
                h3Var = o10;
                mode = mode2;
            } else {
                i12 = i14;
                h3Var = o10;
                mode = mode2;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                z8Var2.q(chat);
                p9Var2.e(chat, z8Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, c6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(k6.v0(i16, g6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, c6.t(-2, -2, 16, 2, 0, 5, 0));
            f10.addView(linearLayout4, c6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(k6.v0(i12, g6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int v03 = k6.v0(i15, g6Var);
        int v = k6.v(k6.v0(i15, g6Var), k6.v0(k6.f21750i6, g6Var));
        textView7.setBackground(k6.i0(dp2, dp2, dp2, dp2, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        f10.addView(textView7, c6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        qh.d dVar = new qh.d(context, g6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new oq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        f10.addView(dVar, c6.n(-1, 48));
        g90 g90Var = new g90(context, g6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i13 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i13 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        g90Var.setText(formatPluralString3);
        g90Var.setGravity(17);
        g90Var.setTextSize(i13, 12.0f);
        g90Var.setTextColor(k6.v0(k6.B6, g6Var));
        g90Var.setLinkTextColor(k6.v0(k6.f21720gc, g6Var));
        f10.addView(g90Var, c6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
        h3Var2.customView = f10;
        yx0 yx0Var = new yx0(connectedbotstarref, h3Var2, g6Var, user, 17);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new org.telegram.ui.Components.voip.o(yx0Var, 15));
        }
        dVar.setOnClickListener(new u2(connectedbotstarref, i10, h3Var2, context, j10, g6Var, yx0Var));
        h3Var2.setOnDismissListener(new eg.c0(6));
        if (linearLayout2 != null) {
            mh.a0.g(i10).n();
            mh.a0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            g6Var2 = g6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u2(i10, h3Var2, g6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            g6Var2 = g6Var;
        }
        linearLayout.setOnClickListener(new r8(3, h3Var2, connectedbotstarref2));
        h3Var2.fixNavigationBar(k6.v0(k6.f21731h5, g6Var2));
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            h3Var2.makeAttached(U);
        }
        h3Var2.show();
        return h3Var2;
    }

    public static void x0(d3 d3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
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
        d3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new li1(5, d3Var, d2Var));
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

    public final void F0(java.util.ArrayList r18, org.telegram.ui.Components.x51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: sh.d3.F0(java.util.ArrayList, org.telegram.ui.Components.x51):void");
    }

    @Override
    public final View createView(Context context) {
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        jn jnVar = new jn(context, 27);
        this.P = jnVar;
        jnVar.setBackgroundColor(k6.w0(null, k6.f21749i5, false));
        super.createView(context);
        this.N = new FrameLayout(context);
        gg.i iVar = new gg.i(context, 1, 3);
        this.O = iVar;
        iVar.setImportantForAccessibility(4);
        gg.a aVar = this.O.f7087b;
        aVar.f7065w = k6.fk;
        aVar.f7066x = k6.gk;
        aVar.b();
        this.O.setStarParticlesView(this.f38942e);
        this.N.addView(this.O, c6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.N, null);
        this.f38941c.setOnItemClickListener(new hg.v0(24, this, context));
        this.f38941c.setOnItemLongClickListener(new org.telegram.ui.web.m(5, this, context));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.f38941c.setItemAnimator(lVar);
        this.f38941c.setOnScrollListener(new nb0(this, 15));
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
                mh.a0.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (v2Var = this.Q) != null) {
            v2Var.N(true);
        }
    }

    @Override
    public final f2.p0 n0() {
        v2 v2Var = new v2(this, this.f38941c, getParentActivity(), this.currentAccount, this.classGuid, new d4(this, 12), getResourceProvider());
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
        gg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(true);
            this.O.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        gg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(false);
            this.O.setDialogVisible(false);
        }
    }

    @Override
    public final fg.p2 p0() {
        fg.h hVar = new fg.h(getParentActivity(), 5);
        hVar.b();
        return hVar;
    }
}
