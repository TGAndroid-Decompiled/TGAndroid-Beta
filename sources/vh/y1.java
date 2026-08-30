package vh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.zi0;
import org.telegram.ui.hb1;
import org.telegram.ui.jk;
import org.telegram.ui.rt0;
import org.telegram.ui.si0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import ph.t8;
public final class y1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public boolean B;
    public int B0;
    public final int[] C;
    public int C0;
    public int[] D;
    public boolean D0;
    public int[] E;
    public rh.t1 E0;
    public float F;
    public int F0;
    public xn G;
    public boolean G0;
    public Runnable H;
    public int H0;
    public Runnable I;
    public boolean I0;
    public boolean J;
    public final Runnable J0;
    public final ArrayList K;
    public k1 K0;
    public r1 L;
    public si0 L0;
    public r3 M;
    public ValueAnimator M0;
    public View N;
    public float N0;
    public View O;
    public d1 O0;
    public FrameLayout P;
    public int P0;
    public ImageView Q;
    public int Q0;
    public LinearLayout R;
    public int R0;
    public ImageView S;
    public boolean S0;
    public ImageView T;
    public FrameLayout U;
    public FrameLayout V;
    public FrameLayout W;
    public LinearLayout X;
    public qg Y;
    public ImageView Z;
    public final CharSequence f46289a;
    public s1 f46290a0;
    public final TL_iv.RichMessage f46291b;
    public LinearLayout f46292b0;
    public int f46293c;
    public final ArrayList f46294c0;
    public int d;
    public ImageView f46295d0;
    public boolean e;
    public hb1 f46296e0;
    public final String f46297f;
    public LinearLayout f46298f0;
    public t1 f46299g0;
    public CharSequence h;
    public int f46300h0;
    public final ArrayList f46301i0;
    public LinearLayout f46302j0;
    public LinearLayout f46303k0;
    public LinearLayout f46304l0;
    public u1 m0;
    public CharSequence f46305n;
    public u1 f46306n0;
    public u1 f46307o0;
    public u1 f46308p0;
    public u1 f46309q0;
    public MessageObject f46310r;
    public u1 f46311r0;
    public ug.f f46312s;
    public FrameLayout f46313s0;
    public jj0 f46314t0;
    public o70 f46315u0;
    public jk v;
    public qp0 f46316v0;
    public final Rect f46317w;
    public m.s3 f46318w0;
    public pg.b f46319x;
    public kz f46320x0;
    public RectF f46321y;
    public boolean f46322y0;
    public boolean f46323z0;

    public y1(Editable editable) {
        super(null);
        this.f46293c = -1;
        this.d = -1;
        this.f46317w = new Rect();
        this.C = new int[2];
        this.F = 1.0f;
        this.K = new ArrayList();
        this.f46294c0 = new ArrayList();
        this.f46300h0 = Integer.MAX_VALUE;
        this.f46301i0 = new ArrayList();
        this.F0 = 0;
        this.H0 = -1;
        this.J0 = new e1(this, 0);
        this.f46289a = editable;
    }

    public static void U(y1 y1Var) {
        f3 f3Var = y1Var.M.f46124k3;
        if (f3Var != null && f3Var.y()) {
            y1Var.n0();
            return;
        }
        Activity parentActivity = y1Var.getParentActivity();
        new v(y1Var.currentAccount, parentActivity, new org.telegram.ui.web.y0(y1Var, 25), y1Var.getResourceProvider()).show();
    }

    public static void V(y1 y1Var) {
        if (!UserConfig.getInstance(y1Var.currentAccount).isPremium()) {
            y1Var.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) y1Var, 43, true));
        }
    }

    public static boolean W(y1 y1Var, View view) {
        int i10;
        xn xnVar = y1Var.G;
        if (xnVar != null && y1Var.f46310r == null && !xnVar.c() && y1Var.M.k3() && !y1Var.M.m3()) {
            if (!y1Var.M.M3()) {
                y1Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Z2 = y1Var.M.Z2();
            if (!Z2.isEmpty()) {
                si0 si0Var = y1Var.L0;
                if (si0Var != null) {
                    si0Var.h(false);
                    y1Var.L0 = null;
                }
                si0 si0Var2 = new si0(y1Var.getParentActivity(), y1Var.getResourceProvider());
                y1Var.L0 = si0Var2;
                si0Var2.setOnDismissListener(new eg.d0(y1Var, 14));
                long a2 = y1Var.G.a();
                MessageObject messageObject = y1Var.G.f40076k5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19205id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(y1Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(y1Var.currentAccount).getPeer(UserConfig.getInstance(y1Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Z2;
                richMessage.photos = y1Var.M.B2();
                tL_message.rich_message.documents = y1Var.M.y2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(y1Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                y1Var.L0.q(org.telegram.messenger.y3.m(messageObject2));
                y1Var.f46316v0.setScaleX(1.0f);
                y1Var.f46316v0.setScaleY(1.0f);
                lg r10 = y1Var.L0.r(y1Var.f46316v0, true, new f1(y1Var, 10));
                if (r10 != null) {
                    r10.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), y1Var.getThemedColor(j6.Oh))));
                    si0 si0Var3 = y1Var.L0;
                    int dp = AndroidUtilities.dp(44.0f);
                    si0Var3.f38363j0 = true;
                    si0Var3.V = dp;
                }
                o70 H = o70.H(y1Var, y1Var.f46316v0);
                boolean isUserSelf = UserObject.isUserSelf(y1Var.G.i());
                if (y1Var.G.D6()) {
                    int i11 = R.drawable.msg_calendar2;
                    if (isUserSelf) {
                        i10 = R.string.SetReminder;
                    } else {
                        i10 = R.string.ScheduleMessage;
                    }
                    H.c(i11, LocaleController.getString(i10), new sh.m0(y1Var, a2, 2), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new e1(y1Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new e1(y1Var, 6), false);
                }
                H.Y();
                y1Var.L0.p(H);
                y1Var.L0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void X(y1 y1Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, MessageObject messageObject2, MessageObject messageObject3, boolean z4, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j11) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(y1Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, y1Var.G);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(y1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j10, messageObject2, messageObject3, z4, i10, i11, sendMessageChatArguments, 0L, j11, 0L);
        }
    }

    public static void Y(final y1 y1Var, Context context, View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        o70 o70Var;
        boolean z16;
        float f10;
        float f11;
        boolean z17;
        boolean z18;
        boolean z19;
        float f12;
        float f13;
        boolean z20;
        boolean z21;
        float f14;
        o70 o70Var2 = y1Var.f46315u0;
        if (o70Var2 != null) {
            o70Var2.u();
            y1Var.f46315u0 = null;
        }
        if (!MessagesController.getInstance(y1Var.currentAccount).richEditorAllowed() && !UserConfig.getInstance(y1Var.currentAccount).isPremium()) {
            z4 = true;
        } else {
            z4 = false;
        }
        final a Q2 = y1Var.M.Q2();
        final o70 I = o70.I(y1Var, view);
        I.Q = true;
        o70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kh.g3(I, 8), false);
        J.k();
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockHeading1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        J.j(z10, R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(y1Var) {
            public final y1 f45954b;

            {
                this.f45954b = y1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f19702a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f19702a.setTextSize(1, SharedConfig.fontSize + 2);
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockHeading2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(y1Var) {
            public final y1 f45954b;

            {
                this.f45954b = y1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f19702a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f19702a.setTextSize(1, SharedConfig.fontSize + 1);
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockHeading3)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(y1Var) {
            public final y1 f45954b;

            {
                this.f45954b = y1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f19702a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f19702a.setTextSize(1, SharedConfig.fontSize);
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockHeading4)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(y1Var) {
            public final y1 f45954b;

            {
                this.f45954b = y1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f19702a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f19702a.setTextSize(1, SharedConfig.fontSize - 1);
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockHeading5)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(y1Var) {
            public final y1 f45954b;

            {
                this.f45954b = y1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f19702a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f19702a.setTextSize(1, SharedConfig.fontSize - 2);
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockHeading6)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(y1Var) {
            public final y1 f45954b;

            {
                this.f45954b = y1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f45954b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f19702a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f19702a.setTextSize(1, SharedConfig.fontSize - 3);
        if (Q2 != null && r3.C3(Q2.f45775b)) {
            o70Var = J;
            z16 = true;
        } else {
            o70Var = J;
            z16 = false;
        }
        w1 w1Var = new w1(context, R.drawable.iv_h);
        w1Var.a(z4);
        int i10 = j6.G8;
        w1Var.d = i10;
        I.j(z16, 0, w1Var, LocaleController.getString(R.string.ArticleHeading), new kh.z2(I, o70Var, 11));
        I.y().f19702a.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.g1 y10 = I.y();
        float f15 = 9.0f;
        if (LocaleController.isRTL) {
            f10 = 18.0f;
        } else {
            f10 = 9.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f11 = 9.0f;
        } else {
            f11 = 18.0f;
        }
        y10.setPadding(dp, 0, AndroidUtilities.dp(f11), 0);
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockParagraph)) {
            z17 = true;
        } else {
            z17 = false;
        }
        I.j(z17, R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new i1(y1Var, Q2, 3));
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockBlockquote)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new i1(y1Var, Q2, 4));
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockPullquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        w1 w1Var2 = new w1(context, R.drawable.iv_pullquote);
        w1Var2.a(z4);
        w1Var2.d = i10;
        I.j(z19, 0, w1Var2, LocaleController.getString(R.string.ArticlePullquote), new i1(y1Var, Q2, 0));
        org.telegram.ui.ActionBar.g1 y11 = I.y();
        if (LocaleController.isRTL) {
            f12 = 18.0f;
        } else {
            f12 = 9.0f;
        }
        int dp2 = AndroidUtilities.dp(f12);
        if (LocaleController.isRTL) {
            f13 = 9.0f;
        } else {
            f13 = 18.0f;
        }
        y11.setPadding(dp2, 0, AndroidUtilities.dp(f13), 0);
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockPreformatted)) {
            z20 = true;
        } else {
            z20 = false;
        }
        I.j(z20, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new i1(y1Var, Q2, 1));
        if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockFooter)) {
            z21 = true;
        } else {
            z21 = false;
        }
        w1 w1Var3 = new w1(context, R.drawable.iv_footer);
        w1Var3.a(z4);
        w1Var3.d = i10;
        I.j(z21, 0, w1Var3, LocaleController.getString(R.string.ArticleFooter), new i1(y1Var, Q2, 2));
        org.telegram.ui.ActionBar.g1 y12 = I.y();
        if (LocaleController.isRTL) {
            f14 = 18.0f;
        } else {
            f14 = 9.0f;
        }
        int dp3 = AndroidUtilities.dp(f14);
        if (!LocaleController.isRTL) {
            f15 = 18.0f;
        }
        y12.setPadding(dp3, 0, AndroidUtilities.dp(f15), 0);
        I.Z();
        y1Var.f46315u0 = I;
    }

    public static void Z(y1 y1Var, boolean z4, boolean z10) {
        float f10;
        int i10;
        if (y1Var.G0 != z4 || !z10) {
            y1Var.G0 = z4;
            if (z4) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            if (z10) {
                y1Var.f46314t0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(nr.h).start();
            } else {
                y1Var.f46314t0.animate().cancel();
                y1Var.f46314t0.setScaleX(f10);
                y1Var.f46314t0.setScaleY(f10);
            }
            jj0 jj0Var = y1Var.f46314t0;
            if (z4) {
                i10 = j6.f20141q7;
            } else {
                i10 = j6.G6;
            }
            jj0Var.setColorFilter(new PorterDuffColorFilter(y1Var.getThemedColor(i10), PorterDuff.Mode.SRC_IN));
            gj0 animatedDrawable = y1Var.f46314t0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z4) {
                    if (animatedDrawable.Y > 34) {
                        animatedDrawable.L(0, false, false);
                    }
                    animatedDrawable.N(33);
                } else {
                    animatedDrawable.N(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public static d1 a0(y1 y1Var) {
        d1 focusedEditTextOrNull = y1Var.M.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            y1Var.O0 = focusedEditTextOrNull;
            y1Var.P0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        d1 d1Var = y1Var.O0;
        if (d1Var != null) {
            return d1Var;
        }
        return y1Var.M.P2();
    }

    public static int b0(y1 y1Var, d1 d1Var) {
        if (d1Var == y1Var.O0 && y1Var.M.getFocusedEditTextOrNull() != d1Var) {
            return Math.min(y1Var.P0, d1Var.length());
        }
        return Math.max(0, d1Var.getSelectionEnd());
    }

    public static String g0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            return null;
                        }
                        return LocaleController.getString(R.string.AccDescrIVDetails);
                    }
                    return LocaleController.getString(R.string.AccDescrIVFormula);
                }
                return LocaleController.getString(R.string.AccDescrIVTable);
            }
            return LocaleController.getString(R.string.AccDescrIVListStyle);
        }
        return LocaleController.getString(R.string.AccDescrIVTextStyle);
    }

    public static String i0(int i10) {
        if (i10 == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i10 == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i10 == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i10 == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i10 == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i10 == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i10 == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i10 == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i10 == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, f6 f6Var) {
        final org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(j6.K(AndroidUtilities.dp(80.0f), j6.v0(j6.Oh, f6Var)));
        linearLayout.addView(imageView, b6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i10 = j6.G6;
        textView.setTextColor(j6.v0(i10, f6Var));
        TextView j10 = yh.j(linearLayout, textView, b6.t(-1, -2, 49, 25, 16, 25, 0), context);
        j10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        j10.setTextSize(1, 14.0f);
        j10.setGravity(17);
        j10.setTextColor(j6.v0(i10, f6Var));
        linearLayout.addView(j10, b6.t(-1, -2, 49, 25, 11, 25, 0));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        p10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(p10, b6.t(-1, 48, 49, 14, 31, 14, 0));
        ph.d p11 = org.telegram.messenger.y3.p(24, context, f6Var, false);
        p11.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(p11, b6.t(-1, 48, 49, 14, 2, 14, 6));
        o10.show();
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        o10.dismiss();
                        runnable2.run();
                        return;
                    default:
                        o10.dismiss();
                        runnable2.run();
                        return;
                }
            }
        });
        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        o10.dismiss();
                        runnable.run();
                        return;
                    default:
                        o10.dismiss();
                        runnable.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        boolean z4;
        int i10 = 0;
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u1) obj).setPremiumLocked(z4);
        }
    }

    public final void B0() {
        float f10;
        if (this.f46316v0 == null) {
            return;
        }
        boolean M3 = this.M.M3();
        this.f46316v0.setEnabled(M3);
        ViewPropertyAnimator animate = this.f46316v0.animate();
        if (M3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(150L).start();
    }

    public final void C0() {
        qp0 qp0Var = this.f46316v0;
        if (qp0Var == null) {
            return;
        }
        qp0Var.setLocked(m0());
    }

    public final u1 c0(int i10, int i11, boolean z4) {
        int i12;
        u1 u1Var = new u1(this.f46292b0.getContext(), i10, getResourceProvider());
        if (z4) {
            u1Var.d();
            this.K.add(u1Var);
        }
        u1Var.setTag(Integer.valueOf(i11));
        u1Var.setContentDescription(g0(i11));
        this.f46294c0.add(u1Var);
        LinearLayout linearLayout = this.f46292b0;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(u1Var, b6.t(38, 38, 16, i12, 0, 0, 0));
        return u1Var;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.K;
        arrayList.clear();
        this.L = new r1(this, context);
        setHasOwnBackground(true);
        this.L.setFocusable(true);
        this.L.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.L.setDefaultFocusHighlightEnabled(false);
        }
        this.B0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.C0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        rh.t1 t1Var = new rh.t1(this, 1);
        this.E0 = t1Var;
        this.L.f28290r.add(t1Var);
        r3 r3Var = new r3(context, this.currentAccount, getResourceProvider(), new org.telegram.ui.Cells.f1(this, 27));
        this.M = r3Var;
        r3Var.setFileRefParentObject(this.f46310r);
        this.L.addView(this.M, b6.e(-1, -1, 119));
        this.L.addView(this.M.getOverlayView(), b6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f46291b;
        if (richMessage != null) {
            r3 r3Var2 = this.M;
            ArrayList arrayList2 = r3Var2.f46120i3;
            r3Var2.f46118h3 = richMessage;
            r3.W2(arrayList2, richMessage.blocks, r3Var2.f46122j3);
            r3Var2.V3();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                r3Var2.v4((a) arrayList2.get(i13));
            }
            r3Var2.V2.N(false);
        } else {
            String str = this.f46297f;
            if (str != null) {
                r3 r3Var3 = this.M;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f46305n;
                HashMap hashMap = r3Var3.f46122j3;
                ArrayList arrayList3 = r3Var3.f46120i3;
                if (!TextUtils.isEmpty(charSequence)) {
                    r3.W2(arrayList3, w4.b(charSequence), hashMap);
                }
                arrayList3.addAll(r3Var3.w4(x3.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    r3.W2(arrayList3, w4.b(charSequence2), hashMap);
                }
                r3Var3.V3();
                r3Var3.V2.N(false);
            } else {
                CharSequence charSequence3 = this.f46289a;
                if (charSequence3 != null) {
                    this.M.setInitialText(charSequence3);
                }
            }
        }
        c2 c2Var = this.M.G3;
        if (c2Var != null) {
            c2Var.j();
        }
        View view = new View(context);
        this.N = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = j6.f19906d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i14), j6.l1(0.0f, getThemedColor(i14))}));
        this.L.addView(this.N, b6.e(-1, 68, 55));
        View view2 = new View(context);
        this.O = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{j6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14)}));
        this.L.addView(this.O, b6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClipChildren(false);
        this.P.setClipToPadding(false);
        this.L.addView(this.P, b6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.Q;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.Q;
        int themedColor = getThemedColor(i14);
        int themedColor2 = getThemedColor(i14);
        int i15 = j6.f19996i6;
        imageView3.setBackground(new x1(j6.Z(themedColor, j6.v(themedColor2, getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.Q;
        int i16 = j6.G6;
        int themedColor3 = getThemedColor(i16);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        d6.a(this.Q);
        this.Q.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.Q.setOnClickListener(new f1(this, 1));
        this.P.addView(this.Q, b6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R = linearLayout;
        linearLayout.setOrientation(0);
        this.R.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.P.addView(this.R, b6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.S = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.S.setScaleType(scaleType);
        this.S.setBackground(j6.f0(getThemedColor(i15), 1, -1));
        this.S.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        d6.a(this.S);
        this.S.setContentDescription(LocaleController.getString(R.string.Undo));
        this.S.setOnClickListener(new f1(this, 2));
        this.R.addView(this.S, b6.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.T = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.T.setScaleType(scaleType);
        this.T.setBackground(j6.f0(getThemedColor(i15), 1, -1));
        this.T.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        d6.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.Redo));
        this.T.setOnClickListener(new f1(this, 3));
        this.R.addView(this.T, b6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.V.setClipToPadding(false);
        this.L.addView(this.V, b6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.W.setClipToPadding(false);
        this.V.addView(this.W, b6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.X = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.X.setClipChildren(false);
        this.X.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.W.addView(this.X, b6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.U = frameLayout4;
        this.W.addView(frameLayout4, b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.Z = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.Z.setScaleType(scaleType);
        this.Z.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.Z.setBackground(new x1(j6.Z(getThemedColor(i14), j6.v(getThemedColor(i14), getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.X.addView(this.Z, b6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        d6.a(this.Z);
        this.Z.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.Z.setOnClickListener(new f1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        frameLayout5.addView(frameLayout6, b6.e(-2, 44, 81));
        s1 s1Var = new s1(context, 0);
        this.f46290a0 = s1Var;
        s1Var.setClipToOutline(true);
        this.f46290a0.setOutlineProvider(new gg.j1(19));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f46292b0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46292b0.setOrientation(0);
        this.f46290a0.addView(this.f46292b0);
        frameLayout6.addView(this.f46290a0, b6.c(-1.0f, -1));
        qg qgVar = new qg(context, 24);
        this.Y = qgVar;
        qgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.Y.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.Y.setBackground(j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.Y.j(og.e, false);
        this.f46292b0.addView(this.Y, b6.q(38, 38, 16));
        d6.a(this.Y);
        this.Y.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.Y.setOnClickListener(new f1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new t8(7, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new f1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new f1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new f1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f46295d0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f46295d0.setScaleType(scaleType);
        this.f46295d0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f46295d0.setBackground(j6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f46292b0.addView(this.f46295d0, b6.t(38, 38, 16, 2, 0, 0, 0));
        d6.a(this.f46295d0);
        this.f46295d0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f46295d0.setOnClickListener(new f1(this, 9));
        this.X.addView(frameLayout5, b6.l(1.0f, 0, 44));
        hb1 hb1Var = new hb1(this, context, 19);
        this.f46296e0 = hb1Var;
        hb1Var.setOrientation(0);
        this.f46296e0.setClipToPadding(false);
        this.f46296e0.setClipChildren(false);
        this.f46296e0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.f46296e0, b6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f46313s0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f46313s0.setClipToPadding(false);
        this.f46313s0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.f46313s0, b6.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f46314t0 = imageView9;
        imageView9.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        gj0 animatedDrawable = this.f46314t0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.f46314t0.setScaleType(scaleType);
        this.f46314t0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f46314t0.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f46313s0.addView(this.f46314t0, b6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f46296e0.addView(frameLayout8, b6.c(44.0f, -2));
        t1 t1Var2 = new t1(this, context);
        this.f46299g0 = t1Var2;
        t1Var2.setHorizontalScrollBarEnabled(false);
        this.f46299g0.setClipToOutline(true);
        this.f46299g0.setOutlineProvider(new gg.j1(20));
        frameLayout8.addView(this.f46299g0, b6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f46298f0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f46298f0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46299g0.addView(this.f46298f0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        u1 u1Var = new u1(context, R.drawable.iv_quote, getResourceProvider());
        this.f46311r0 = u1Var;
        u1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f46311r0.setOnClickListener(new f1(this, 11));
        LinearLayout linearLayout5 = this.f46298f0;
        u1 u1Var2 = this.f46311r0;
        if (linearLayout5.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout5.addView(u1Var2, b6.t(38, 38, 16, i10, 0, 0, 0));
        u1 u1Var3 = new u1(context, R.drawable.iv_button, getResourceProvider());
        this.f46307o0 = u1Var3;
        u1Var3.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f46307o0.setOnClickListener(new f1(this, 12));
        LinearLayout linearLayout6 = this.f46298f0;
        u1 u1Var4 = this.f46307o0;
        if (linearLayout6.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout6.addView(u1Var4, b6.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f46303k0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f46303k0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46303k0.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f46296e0.addView(this.f46303k0, b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        u1 u1Var5 = new u1(context, R.drawable.media_link_24, getResourceProvider());
        this.f46306n0 = u1Var5;
        u1Var5.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.f46306n0.setOnClickListener(new f1(this, 13));
        this.f46303k0.addView(this.f46306n0, b6.q(38, 38, 16));
        u1 u1Var6 = new u1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f46308p0 = u1Var6;
        u1Var6.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f46308p0.setOnClickListener(new f1(this, 14));
        this.f46303k0.addView(this.f46308p0, b6.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f46304l0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f46304l0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46304l0.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f46296e0.addView(this.f46304l0, b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        u1 u1Var7 = new u1(context, R.drawable.iv_math, getResourceProvider());
        this.f46309q0 = u1Var7;
        u1Var7.d();
        arrayList.add(this.f46309q0);
        this.f46309q0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f46309q0.setOnClickListener(new f1(this, 15));
        this.f46304l0.addView(this.f46309q0, b6.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f46302j0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f46302j0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46302j0.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f46296e0.addView(this.f46302j0, 0, b6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        u1 u1Var8 = new u1(context, 0, getResourceProvider());
        this.m0 = u1Var8;
        u1Var8.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.m0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.m0.setOnClickListener(new f1(this, 16));
        this.f46302j0.addView(this.m0, b6.q(38, 38, 16));
        if (this.f46310r != null) {
            i12 = R.drawable.input_done;
        } else if (l0()) {
            i12 = R.drawable.input_schedule;
        } else {
            i12 = R.drawable.send_plane_24;
        }
        qp0 qp0Var = new qp0((Object) this, context, i12, getResourceProvider(), 3);
        this.f46316v0 = qp0Var;
        qp0Var.setBackground(new x1(j6.b0(AndroidUtilities.dp(22.0f), getThemedColor(j6.Yd))));
        d6.a(this.f46316v0);
        this.X.addView(this.f46316v0, b6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f46316v0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f46316v0.setOnClickListener(new f1(this, 0));
        this.f46316v0.setOnLongClickListener(new dg.f0(this, 4));
        C0();
        this.L.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.L.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        A0();
        if (this.e) {
            this.M.C2();
            this.e = false;
        }
        r1 r1Var = this.L;
        this.fragmentView = r1Var;
        return r1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z4) {
        int i12;
        u1 u1Var = new u1(context, i10, getResourceProvider());
        if (z4) {
            u1Var.d();
            this.K.add(u1Var);
        }
        u1Var.setTag(Integer.valueOf(i11));
        u1Var.setContentDescription(i0(i11));
        u1Var.setOnClickListener(new lh.y0(this, i11, 25));
        this.f46301i0.add(u1Var);
        LinearLayout linearLayout = this.f46298f0;
        if (linearLayout.getChildCount() > 0) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        linearLayout.addView(u1Var, b6.t(38, 38, 16, i12, 0, 0, 0));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            C0();
            A0();
        }
    }

    public final void e0(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.M0 = null;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N0, f10);
        this.M0 = ofFloat;
        ofFloat.addUpdateListener(new g1(this, 0));
        this.M0.setInterpolator(nr.h);
        this.M0.setDuration(250L);
        this.M0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        kz kzVar = this.f46320x0;
        if (kzVar != null && (layoutParams = (FrameLayout.LayoutParams) kzVar.getLayoutParams()) != null) {
            int j02 = j0();
            r1 r1Var = this.L;
            if (r1Var == null) {
                max = j0();
            } else {
                max = Math.max(j0(), ((r1Var.getMeasuredHeight() - this.L.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.Q0);
            }
            int round = Math.round(((max - j02) * this.N0) + j02);
            if (layoutParams.height != round) {
                layoutParams.height = round;
                this.f46320x0.setLayoutParams(layoutParams);
            }
        }
    }

    public final void h0() {
        FrameLayout.LayoutParams layoutParams;
        kz kzVar = this.f46320x0;
        if (kzVar != null && (layoutParams = (FrameLayout.LayoutParams) kzVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.Q0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.f46320x0.setLayoutParams(layoutParams);
            }
        }
        f0();
        int max = Math.max(Math.max(this.A0, this.Q0), this.R0);
        this.M.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        r3 r3Var = this.M;
        int i12 = this.Q0;
        int i13 = this.R0;
        int i14 = this.A0;
        r3Var.L3 = i12;
        r3Var.M3 = i13;
        r3Var.N3 = i14;
        int i15 = -max;
        this.V.setTranslationY(i15);
        this.O.setTranslationY(i15 + this.Q0);
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        r3 r3Var = this.M;
        if (r3Var != null && r3Var.f46124k3.y()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final int j0() {
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.C0;
        } else {
            i10 = this.B0;
        }
        if (i10 <= 0) {
            return AndroidUtilities.dp(200.0f);
        }
        return i10;
    }

    public final void k0(boolean z4) {
        if (this.f46323z0) {
            this.f46323z0 = false;
            kz kzVar = this.f46320x0;
            if (kzVar != null) {
                kzVar.t(false);
                this.f46320x0.B();
            }
        }
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.M0 = null;
        }
        this.N0 = 0.0f;
        this.O0 = null;
        kz kzVar2 = this.f46320x0;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.f46320x0.setVisibility(8);
        }
        if (this.f46322y0 || this.A0 != 0) {
            this.f46322y0 = false;
            this.A0 = 0;
            h0();
        }
        qg qgVar = this.Y;
        if (qgVar != null) {
            qgVar.j(og.e, z4);
        }
    }

    public final boolean l0() {
        xn xnVar;
        if (this.f46310r == null && (xnVar = this.G) != null && xnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            r3 r3Var = this.M;
            if (w4.f(r3Var.f46120i3, r3Var.f46122j3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n0() {
        i3 h22 = this.M.h2();
        if (h22 != null) {
            TL_iv.RichMessage a2 = h22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(getParentActivity(), getResourceProvider());
            f0Var.n0(a2);
            f0Var.f24717h0 = new org.telegram.ui.web.y0(h22, 23);
            f0Var.show();
        }
    }

    public final void o0(int i10, int i11) {
        r3 r3Var = this.M;
        r3Var.Z3 = r3Var.Q2();
        li liVar = new li(getParentActivity(), this, false, false, true, getResourceProvider());
        liVar.W1 = new n1(this, liVar);
        liVar.f26702g0.setIncludeVideosInGallery(true);
        liVar.f26702g0.f0();
        liVar.J1(1, true);
        liVar.h1(i10);
        liVar.f26733q2 = new m1(this, liVar);
        liVar.V = new m1(this, liVar);
        liVar.U = new o1(this, liVar);
        liVar.r1();
        if (i11 != 0) {
            liVar.A1(i11);
        }
        liVar.setFocusable(true);
        liVar.show();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1 && i10 == 21) {
            if (intent != null && intent.getData() != null) {
                r3 r3Var = this.M;
                Uri data = intent.getData();
                if (data == null) {
                    r3Var.getClass();
                } else if (r3Var.getContext() != null) {
                    Utilities.globalQueue.postRunnable(new uf.v0(6, r3Var, data));
                }
            }
        } else if (i11 == -1 && (i10 == 1 || i10 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.M.e2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        boolean z10 = this.f46323z0;
        if (z10) {
            if (z10) {
                this.f46323z0 = false;
                kz kzVar = this.f46320x0;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.f46320x0.B();
                }
                e0(false);
                return false;
            }
        } else if (this.f46322y0) {
            k0(true);
            return false;
        } else if (!this.M.F2()) {
            return super.onBackPressed(z4);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        float f10;
        if (!z4 && !this.S0) {
            q0();
            this.S0 = true;
        }
        if (!AndroidUtilities.isTablet() && this.f46312s != null && this.v != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ug.f fVar = this.f46312s;
            this.f46319x = fVar.f45521f;
            fVar.e = false;
            fVar.invalidate();
            this.v.setAlpha(0.0f);
            this.v.f22854w1.setVisibility(4);
            v0();
            float f11 = 1.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.F = f10;
            if (!z4) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.B = true;
            this.L.invalidate();
            ofFloat.addUpdateListener(new g1(this, 1));
            ofFloat.addListener(new ex0(22, this, runnable));
            if (!z4) {
                FrameLayout frameLayout = this.P;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.P;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.W, property, 0.0f), ObjectAnimator.ofFloat(this.W, property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.M, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.N, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.O, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.P;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.P;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.W, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.W, property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.M, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.N, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.O, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(nr.h);
            this.L.post(new rt0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z4, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        rh.t1 t1Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.S0) {
            q0();
            this.S0 = true;
        }
        k1 k1Var = this.K0;
        if (k1Var != null) {
            this.K0 = null;
            AndroidUtilities.runOnUIThread(k1Var);
        }
        si0 si0Var = this.L0;
        if (si0Var != null) {
            si0Var.i();
            this.L0 = null;
        }
        r3 r3Var = this.M;
        if (r3Var != null) {
            r3Var.G2();
        }
        m.s3 s3Var = this.f46318w0;
        if (s3Var != null) {
            s3Var.c();
        }
        super.onFragmentDestroy();
        kz kzVar = this.f46320x0;
        if (kzVar != null) {
            kzVar.D();
        }
        r1 r1Var = this.L;
        if (r1Var != null && (t1Var = this.E0) != null) {
            r1Var.f28290r.remove(t1Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.Q0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.Q0;
        this.O.setLayoutParams(layoutParams);
        h0();
    }

    @Override
    public final r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        boolean z4;
        o70 o70Var;
        i0.b f10 = m1Var.f43130a.f(3);
        int i10 = m1Var.f43130a.f(8).d;
        this.R0 = i10;
        int i11 = i10 - f10.d;
        boolean z10 = this.D0;
        if (i11 > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.D0 = z4;
        if (z4 && i11 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.C0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.C0).commit();
            } else {
                this.B0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.B0).commit();
            }
        }
        if (this.D0 && !z10 && this.f46322y0 && !this.f46323z0) {
            k0(false);
        }
        if (!this.D0 && z10 && (o70Var = this.f46315u0) != null) {
            o70Var.u();
            this.f46315u0 = null;
        }
        onInsets(f10.f7213a, f10.f7214b, f10.f7215c, f10.d);
        return r0.m1.f43129b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        r3 r3Var;
        int i10;
        r3 r3Var2;
        super.onTransitionAnimationStart(z4, z10);
        if (z4 && !z10 && (i10 = this.f46293c) >= 0 && (r3Var2 = this.M) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f46293c = -1;
            if (!r3Var2.Y1(i10, i11)) {
                r3Var2.post(new k2(r3Var2, i10, i11, 0));
            }
        } else if (z4 && !z10) {
            if ((this.f46291b != null || this.f46297f != null) && (r3Var = this.M) != null && !r3Var.a3()) {
                r3Var.post(new b(r3Var, 5));
            }
        }
    }

    public final boolean q0() {
        TL_iv.RichMessage j22;
        Runnable runnable;
        if (this.G == null || this.f46310r != null || !this.M.r2()) {
            return false;
        }
        if (this.J) {
            j22 = null;
        } else {
            j22 = this.M.j2();
        }
        if (j22 == null && (runnable = this.I) != null) {
            runnable.run();
        }
        jk jkVar = this.G.V;
        if (j22 != null && !this.J) {
            r3 r3Var = this.M;
            if (r3Var.k3() && !w4.f(r3Var.f46120i3, r3Var.f46122j3) && jkVar != null) {
                SpannableStringBuilder k10 = w4.k(this.M.f46120i3);
                xn xnVar = jkVar.L2;
                if (jkVar.B0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, jkVar.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.u5.class);
                if (u5VarArr != null) {
                    for (org.telegram.ui.Components.u5 u5Var : u5VarArr) {
                        u5Var.applyFontMetrics(jkVar.B0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.l5.g());
                    }
                }
                zi0.a(spannableStringBuilder);
                if (xnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(jkVar.N).saveDraft(xnVar.a(), xnVar.B7(xnVar.f40076k5), charSequenceArr[0], MediaDataController.getInstance(jkVar.N).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                jkVar.setRichDraftPreview(null);
                if (jkVar.B0.getText() != null) {
                    jkVar.B0.getText().clear();
                }
                jkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.G.a();
        xn xnVar2 = this.G;
        mediaDataController.saveDraft(a2, xnVar2.B7(xnVar2.f40076k5), "", null, null, null, null, 0L, false, false, j22);
        TL_iv.RichMessage richMessage = j22;
        if (jkVar == null) {
            return true;
        }
        jkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            r3 r3Var = this.M;
            Objects.requireNonNull(r3Var);
            p0(parentActivity, new b(r3Var, 0), new e1(this, 4), getResourceProvider());
        } else if (l0()) {
            org.telegram.ui.Components.z4.M(getParentActivity(), this.G.a(), new p1(this), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    public final void s0(final int i10, final int i11, final boolean z4) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            r3 r3Var = this.M;
            Objects.requireNonNull(r3Var);
            p0(parentActivity, new b(r3Var, 0), new e1(this, 4), getResourceProvider());
        } else if (this.G != null && this.M.k3() && !this.M.m3()) {
            if (!this.M.M3()) {
                B0();
            } else if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
                jk jkVar = this.G.V;
                if (jkVar != null) {
                    this.J = true;
                    Runnable runnable = this.H;
                    if (runnable != null) {
                        runnable.run();
                    }
                    jkVar.R0(w4.k(this.M.f46120i3), z4, i10, i11);
                    finishFragment();
                }
            } else {
                this.J = true;
                final ArrayList Z2 = this.M.Z2();
                if (Z2.isEmpty()) {
                    return;
                }
                final ArrayList B2 = this.M.B2();
                final ArrayList y22 = this.M.y2();
                final ArrayList a2 = v4.a(this.currentAccount, Z2);
                final long a10 = this.G.a();
                xn xnVar = this.G;
                final MessageObject messageObject = xnVar.f40076k5;
                final MessageObject messageObject2 = xnVar.U3;
                final long N8 = xnVar.N8();
                final SendMessageChatArguments C8 = this.G.C8();
                final MessageObject messageObject3 = this.f46310r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        y1.X(y1.this, messageObject3, Z2, B2, y22, a2, a10, messageObject, messageObject2, z4, i10, i11, C8, N8);
                    }
                };
                Runnable runnable2 = this.H;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (i10 != 0 && messageObject3 == null) {
                    this.K0 = r02;
                    finishFragment();
                    return;
                }
                r02.run();
                finishFragment();
            }
        }
    }

    public final void t0(boolean z4) {
        ArrayList arrayList = this.f46301i0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u1 u1Var = (u1) obj;
            if (((Integer) u1Var.getTag()).intValue() == 1) {
                u1Var.setEnabled(z4);
            }
        }
    }

    public final void u0(boolean z4, boolean z10) {
        u1 u1Var = this.f46306n0;
        if (u1Var != null) {
            u1Var.setEnabled(z4);
        }
        u1 u1Var2 = this.f46307o0;
        if (u1Var2 != null) {
            u1Var2.setEnabled(z10);
        }
        u1 u1Var3 = this.f46308p0;
        if (u1Var3 != null) {
            u1Var3.setEnabled(z4);
        }
        u1 u1Var4 = this.f46309q0;
        if (u1Var4 != null) {
            u1Var4.setEnabled(z4);
        }
    }

    public final void v0() {
        ug.f fVar = this.f46312s;
        int[] iArr = this.C;
        fVar.getLocationInWindow(iArr);
        if (this.f46321y == null) {
            this.f46321y = new RectF();
        }
        RectF rectF = new RectF(this.f46319x.getBounds());
        this.f46321y = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.D == null) {
            this.D = new int[2];
        }
        this.v.getLocationInWindow(this.D);
        if (this.E == null) {
            this.E = new int[2];
        }
        this.E[0] = this.M.getPaddingLeft();
        this.E[1] = this.M.getPaddingTop();
        int[] iArr2 = this.E;
        iArr2[0] = (int) (iArr2[0] - (this.v.B0.getX() - AndroidUtilities.dp(16.0f)));
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: vh.y1.w0():void");
    }

    public final void x0(int i10, boolean z4) {
        int i11;
        float f10;
        float f11;
        float f12;
        float dp;
        int i12;
        float f13;
        float f14;
        float f15;
        float dp2;
        float f16;
        float f17;
        float f18;
        float f19;
        float dp3;
        float f20;
        float f21;
        float f22;
        float dp4;
        float f23;
        if (this.H0 == i10) {
            return;
        }
        this.H0 = i10;
        int i13 = 0;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z4) {
            this.X.setVisibility(0);
            ViewPropertyAnimator animate = this.X.animate();
            if (this.H0 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (this.H0 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (this.H0 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (this.H0 == 0) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(dp3).setDuration(420L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).withEndAction(new e1(this, 1)).start();
            this.f46296e0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f46296e0.animate();
            if (this.H0 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (this.H0 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (this.H0 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (this.H0 == 1) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(30.0f);
            }
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(nrVar).withEndAction(new e1(this, 2)).start();
            this.f46313s0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f46313s0.animate();
            if (this.H0 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (this.H0 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (this.H0 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(nrVar).withEndAction(new e1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.X;
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.X;
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.X;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.X;
        if (i10 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.X;
        if (i10 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout5.setTranslationY(dp);
        hb1 hb1Var = this.f46296e0;
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        hb1Var.setVisibility(i12);
        hb1 hb1Var2 = this.f46296e0;
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        hb1Var2.setAlpha(f13);
        hb1 hb1Var3 = this.f46296e0;
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        hb1Var3.setScaleX(f14);
        hb1 hb1Var4 = this.f46296e0;
        if (i10 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        hb1Var4.setScaleY(f15);
        hb1 hb1Var5 = this.f46296e0;
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        hb1Var5.setTranslationY(dp2);
        FrameLayout frameLayout = this.f46313s0;
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        FrameLayout frameLayout2 = this.f46313s0;
        if (i10 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f46313s0;
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f46313s0;
        if (i10 == 2) {
            f25 = 1.0f;
        }
        frameLayout4.setScaleY(f25);
    }

    public final void y0() {
        boolean z4;
        boolean z10;
        boolean g10;
        boolean z11;
        boolean h;
        boolean z12;
        int max;
        int max2;
        boolean z13;
        boolean z14;
        boolean z15;
        d1 d1Var;
        int max3;
        boolean z16;
        boolean z17;
        m9 textSelectionHelper = this.M.getTextSelectionHelper();
        ArrayList arrayList = this.f46301i0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.y()) {
            u1 u1Var = this.f46311r0;
            boolean z18 = false;
            if (u1Var != null) {
                r3 r3Var = this.M;
                int[] B4 = r3Var.B4();
                if (B4 != null && r3Var.H3(B4[0], B4[1])) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                u1Var.setSelected(z17);
            }
            if (this.M.L3()) {
                m9 textSelectionHelper2 = this.M.getTextSelectionHelper();
                int i10 = textSelectionHelper2.f21401u0;
                int i11 = textSelectionHelper2.f21402v0;
                int i12 = textSelectionHelper2.f21405y0;
                int i13 = textSelectionHelper2.f21403w0;
                int i14 = textSelectionHelper2.f21406z0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    u1 u1Var2 = (u1) obj;
                    u1Var2.setSelected(this.M.K3(((Integer) u1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
                }
                if (i11 == i12) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    d1Var = this.M.N4(i10, i11);
                } else {
                    d1Var = null;
                }
                int max4 = Math.max(0, Math.min(i13, i14));
                if (d1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i13, i14), d1Var.length()));
                }
                u1 u1Var3 = this.f46306n0;
                if (u1Var3 != null) {
                    if (d1Var != null && max4 < max3 && x5.h(d1Var.getText(), max4, max3)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    u1Var3.setSelected(z16);
                }
                u1 u1Var4 = this.f46308p0;
                if (u1Var4 != null) {
                    if (d1Var != null && max4 < max3 && x5.g(d1Var.getText(), max4, max3)) {
                        z18 = true;
                    }
                    u1Var4.setSelected(z18);
                }
                t0(true);
                u0(z15, this.M.l2());
            } else if (this.M.w3()) {
                m9 textSelectionHelper3 = this.M.getTextSelectionHelper();
                d1 s22 = this.M.s2(textSelectionHelper3.f21401u0);
                int i16 = textSelectionHelper3.f21403w0;
                int i17 = textSelectionHelper3.f21406z0;
                if (s22 == null) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i16, i17), s22.length()));
                }
                if (s22 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0, Math.min(Math.max(i16, i17), s22.length()));
                }
                int size2 = arrayList.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList.get(i18);
                    i18++;
                    u1 u1Var5 = (u1) obj2;
                    int intValue = ((Integer) u1Var5.getTag()).intValue();
                    if (s22 != null && max < max2 && (intValue & s22.getCurrentStyle(max, max2)) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    u1Var5.setSelected(z14);
                }
                u1 u1Var6 = this.f46306n0;
                if (u1Var6 != null) {
                    if (s22 != null && max < max2 && x5.h(s22.getText(), max, max2)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    u1Var6.setSelected(z13);
                }
                u1 u1Var7 = this.f46308p0;
                if (u1Var7 != null) {
                    if (s22 != null && max < max2 && x5.g(s22.getText(), max, max2)) {
                        z18 = true;
                    }
                    u1Var7.setSelected(z18);
                }
                t0(true);
                u0(true, this.M.l2());
            } else {
                int i19 = textSelectionHelper.f21401u0;
                int i20 = textSelectionHelper.f21404x0;
                int i21 = textSelectionHelper.f21403w0;
                int i22 = textSelectionHelper.f21406z0;
                if (i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.M.f46129m4.size()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int size3 = arrayList.size();
                int i23 = 0;
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    u1 u1Var8 = (u1) arrayList.get(i23);
                    int intValue2 = ((Integer) u1Var8.getTag()).intValue();
                    if (z4 && this.M.J3(intValue2, i19, i21, i20, i22)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u1Var8.setSelected(z12);
                    i23 = i24;
                }
                t0(!this.M.I3());
                u1 u1Var9 = this.f46306n0;
                if (u1Var9 != null) {
                    if (z4) {
                        Editable H4 = this.M.H4(i19, i21, i20, i22);
                        if (H4 == null) {
                            h = false;
                        } else {
                            h = x5.h(H4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (h) {
                            z11 = true;
                            u1Var9.setSelected(z11);
                        }
                    }
                    z11 = false;
                    u1Var9.setSelected(z11);
                }
                u1 u1Var10 = this.f46308p0;
                if (u1Var10 != null) {
                    if (z4) {
                        Editable H42 = this.M.H4(i19, i21, i20, i22);
                        if (H42 == null) {
                            g10 = false;
                        } else {
                            g10 = x5.g(H42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (g10) {
                            z10 = true;
                            u1Var10.setSelected(z10);
                        }
                    }
                    z10 = false;
                    u1Var10.setSelected(z10);
                }
                if (z4 && i19 == i20) {
                    z18 = true;
                }
                u0(z18, this.M.l2());
            }
        }
    }

    public final void z0() {
        boolean z4;
        float f10;
        boolean r22 = this.M.r2();
        c2 c2Var = this.M.G3;
        if (c2Var != null && !c2Var.f45834c.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ImageView imageView = this.S;
        float f11 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(r22);
            ImageView imageView2 = this.S;
            if (r22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
        }
        ImageView imageView3 = this.T;
        if (imageView3 != null) {
            imageView3.setEnabled(z4);
            ImageView imageView4 = this.T;
            if (z4) {
                f11 = 1.0f;
            }
            imageView4.setAlpha(f11);
        }
    }

    public y1(String str) {
        super(null);
        this.f46293c = -1;
        this.d = -1;
        this.f46317w = new Rect();
        this.C = new int[2];
        this.F = 1.0f;
        this.K = new ArrayList();
        this.f46294c0 = new ArrayList();
        this.f46300h0 = Integer.MAX_VALUE;
        this.f46301i0 = new ArrayList();
        this.F0 = 0;
        this.H0 = -1;
        this.J0 = new e1(this, 0);
        this.f46297f = str;
    }

    public y1(TL_iv.RichMessage richMessage) {
        super(null);
        this.f46293c = -1;
        this.d = -1;
        this.f46317w = new Rect();
        this.C = new int[2];
        this.F = 1.0f;
        this.K = new ArrayList();
        this.f46294c0 = new ArrayList();
        this.f46300h0 = Integer.MAX_VALUE;
        this.f46301i0 = new ArrayList();
        this.F0 = 0;
        this.H0 = -1;
        this.J0 = new e1(this, 0);
        this.f46291b = richMessage;
    }
}
