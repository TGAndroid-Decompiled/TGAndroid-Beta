package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import nh.t4;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.lx0;
import org.telegram.ui.qe1;
import org.telegram.ui.z10;
public final class d3 extends z10 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public FrameLayout M;
    public dg.i N;
    public fn O;
    public v2 P;

    public d3(long j10) {
        this.L = j10;
        this.I = true;
        this.H = AndroidUtilities.dp(60.0f);
    }

    public static void A0(d3 d3Var, TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var) {
        long j10 = d3Var.L;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            jh.y d = jh.b0.g(d3Var.currentAccount).d(j10);
            ArrayList arrayList = d.f13100e;
            int i10 = d.f13097a;
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
                            d.f13099c = Math.max(d.f13099c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f13098b));
            d.a();
            jh.z e10 = jh.b0.g(d3Var.currentAccount).e(j10);
            e10.f13145c = 0;
            e10.d = false;
            e10.f13149i = false;
            e10.f13147f = 0L;
            e10.f13150j = null;
            e10.h = false;
            e10.a();
            d3Var.P.N(true);
        }
        c2Var.dismiss();
    }

    public static boolean B0(d3 d3Var, Context context, View view, int i10) {
        v2 v2Var = d3Var.P;
        if (v2Var != null) {
            Object obj = v2Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(d3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                j70 H = j70.H(d3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new org.telegram.ui.web.y(12, d3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new org.telegram.ui.web.y(13, d3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new yw0(d3Var, connectedbotstarref, user, 22), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new lx0(d3Var, context, user, connectedbotstarref, 17));
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

    public static void G0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.c6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: ph.d3.G0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.c6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.f3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, c6 c6Var) {
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c3;
        String formatPluralString;
        int i11;
        char c6;
        String formatPluralString2;
        int i12;
        org.telegram.ui.ActionBar.f3 f3Var;
        LinearLayout linearLayout2;
        int i13;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        c6 c6Var2;
        PorterDuff.Mode mode;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(g6.K(AndroidUtilities.dp(40.0f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.Oh, c6Var)));
        frameLayout.addView(view, f6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, f6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(g6.b0(AndroidUtilities.dp(50.0f), g6.v0(g6.f23133h5, c6Var)));
            frameLayout.addView(frameLayout2, f6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(g6.b0(AndroidUtilities.dp(9.5f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.uj, c6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            iq iqVar = new iq(R.drawable.mini_reply_user, 0);
            iqVar.setScale(0.937f, 0.937f);
            iqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            iqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, f6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        g10.addView(frameLayout, f6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i14 = g6.G6;
        org.telegram.ui.b.m(i14, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        g10.addView(textView2, f6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i15 = g6.f23009a7;
        linearLayout3.setBackground(g6.b0(dp, g6.v0(i15, c6Var)));
        t9 t9Var = new t9(context);
        t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        e9 e9Var = new e9((c6) null);
        linearLayout3.addView(t9Var, f6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(g6.v0(i14, c6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        e9Var.r(user2);
        t9Var.e(user2, e9Var);
        linearLayout3.addView(textView3, f6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i16 = g6.f23310r5;
        int v02 = g6.v0(i16, c6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, f6.t(-2, -2, 16, 5, 0, 8, 0));
        g10.addView(linearLayout3, f6.t(-2, 28, 1, 4, 0, 4, 0));
        h6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        org.telegram.ui.b.m(i14, c6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.x3.r(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
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
                    c6 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i18 < 12 || i18 % 12 != 0) {
                        c6 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i18, new Object[0]);
                    } else {
                        c6 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i18 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c6] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                org.telegram.ui.b.p(i17, objArr, textView4);
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
                org.telegram.ui.b.p(i19, objArr2, textView4);
            }
        }
        g10.addView(textView4, f6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i12 = i14;
            f3Var = q6;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            org.telegram.ui.b.m(i14, c6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            g10.addView(textView5, f6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(i15, c6Var)));
            t9 t9Var2 = new t9(context);
            t9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            e9 e9Var2 = new e9((c6) null);
            linearLayout4.addView(t9Var2, f6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(g6.v0(i14, c6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                e9Var2.r(user3);
                t9Var2.e(user3, e9Var2);
                textView6.setText(UserObject.getUserName(user3));
                i12 = i14;
                f3Var = q6;
                mode = mode2;
            } else {
                i12 = i14;
                f3Var = q6;
                mode = mode2;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                e9Var2.q(chat);
                t9Var2.e(chat, e9Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout4.addView(textView6, f6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i16, c6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, f6.t(-2, -2, 16, 2, 0, 5, 0));
            g10.addView(linearLayout4, f6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(g6.v0(i12, c6Var));
        int dp2 = AndroidUtilities.dp(8.0f);
        int v03 = g6.v0(i15, c6Var);
        int v = g6.v(g6.v0(i15, c6Var), g6.v0(g6.f23152i6, c6Var));
        textView7.setBackground(g6.i0(dp2, dp2, dp2, dp2, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str2 = connectedbotstarref.url;
        textView7.setText((str2 == null || !str2.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        g10.addView(textView7, f6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        nh.d dVar = new nh.d(context, c6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new iq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        g10.addView(dVar, f6.n(-1, 48));
        y80 y80Var = new y80(context, c6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i13 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i13 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        y80Var.setText(formatPluralString3);
        y80Var.setGravity(17);
        y80Var.setTextSize(i13, 12.0f);
        y80Var.setTextColor(g6.v0(g6.B6, c6Var));
        y80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
        g10.addView(y80Var, f6.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
        f3Var2.customView = g10;
        lx0 lx0Var = new lx0(connectedbotstarref, f3Var2, c6Var, user, 16);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new mh.n(lx0Var, 15));
        }
        dVar.setOnClickListener(new u2(connectedbotstarref, i10, f3Var2, context, j10, c6Var, lx0Var));
        f3Var2.setOnDismissListener(new bg.f0(7));
        if (linearLayout2 != null) {
            jh.b0.g(i10).n();
            jh.b0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            c6Var2 = c6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u2(i10, f3Var2, c6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            c6Var2 = c6Var;
        }
        linearLayout.setOnClickListener(new org.telegram.ui.web.c(3, f3Var2, connectedbotstarref2));
        f3Var2.fixNavigationBar(g6.v0(g6.f23133h5, c6Var2));
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            f3Var2.makeAttached(U);
        }
        f3Var2.show();
        return f3Var2;
    }

    public static void x0(d3 d3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new fi1(4, d3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(d3 d3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(d3Var.getParentActivity(), 3, null);
        c2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(d3Var.currentAccount).getInputPeer(d3Var.L);
        editconnectedstarrefbot.revoked = true;
        d3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new qe1(5, d3Var, c2Var));
    }

    public static void z0(d3 d3Var, Context context, int i10) {
        v2 v2Var = d3Var.P;
        if (v2Var != null) {
            Object obj = v2Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                G0(context, d3Var.currentAccount, (TL_payments.starRefProgram) obj, d3Var.L, d3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                H0(context, d3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, d3Var.L, d3Var.resourceProvider);
            }
        }
    }

    public final void F0(java.util.ArrayList r18, org.telegram.ui.Components.k51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: ph.d3.F0(java.util.ArrayList, org.telegram.ui.Components.k51):void");
    }

    @Override
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        fn fnVar = new fn(context, 27);
        this.O = fnVar;
        fnVar.setBackgroundColor(g6.w0(null, g6.f23151i5, false));
        super.createView(context);
        this.M = new FrameLayout(context);
        dg.i iVar = new dg.i(context, 1, 3);
        this.N = iVar;
        iVar.setImportantForAccessibility(4);
        dg.a aVar = this.N.f5590b;
        aVar.f5568w = g6.fk;
        aVar.f5569x = g6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.f45016e);
        this.M.addView(this.N, f6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.M, null);
        this.f45015c.setOnItemClickListener(new eg.w0(24, this, context));
        this.f45015c.setOnItemLongClickListener(new fi1(5, this, context));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.f45015c.setItemAnimator(lVar);
        this.f45015c.setOnScrollListener(new h00(this, 15));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v2 v2Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.L;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j10) {
                v2 v2Var2 = this.P;
                if (v2Var2 != null) {
                    v2Var2.N(true);
                }
                jh.b0.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (v2Var = this.P) != null) {
            v2Var.N(true);
        }
    }

    @Override
    public final f2.p0 n0() {
        v2 v2Var = new v2(this, this.f45015c, getParentActivity(), this.currentAccount, this.classGuid, new t4(this, 12), getResourceProvider());
        this.P = v2Var;
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
        dg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        dg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override
    public final cg.s2 p0() {
        cg.h hVar = new cg.h(getParentActivity(), 5);
        hVar.b();
        return hVar;
    }
}
