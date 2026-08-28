package qh;

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
import g7.e6;
import g7.g6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import kh.i9;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ai1;
import org.telegram.ui.ak;
import org.telegram.ui.kt0;
import org.telegram.ui.li0;
import org.telegram.ui.qn;
import org.telegram.ui.ta1;
public final class x1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int A0;
    public final int[] B;
    public int B0;
    public int[] C;
    public boolean C0;
    public int[] D;
    public mh.a2 D0;
    public float E;
    public int E0;
    public qn F;
    public boolean F0;
    public Runnable G;
    public int G0;
    public Runnable H;
    public boolean H0;
    public boolean I;
    public final Runnable I0;
    public final ArrayList J;
    public k1 J0;
    public q1 K;
    public li0 K0;
    public o3 L;
    public ValueAnimator L0;
    public View M;
    public float M0;
    public View N;
    public d1 N0;
    public FrameLayout O;
    public int O0;
    public ImageView P;
    public int P0;
    public LinearLayout Q;
    public int Q0;
    public ImageView R;
    public boolean R0;
    public ImageView S;
    public FrameLayout T;
    public FrameLayout U;
    public FrameLayout V;
    public LinearLayout W;
    public qg X;
    public ImageView Y;
    public r1 Z;
    public final CharSequence f46791a;
    public LinearLayout f46792a0;
    public final TL_iv.RichMessage f46793b;
    public final ArrayList f46794b0;
    public int f46795c;
    public ImageView f46796c0;
    public int d;
    public ta1 f46797d0;
    public boolean f46798e;
    public LinearLayout f46799e0;
    public final String f46800f;
    public s1 f46801f0;
    public int f46802g0;
    public CharSequence h;
    public final ArrayList f46803h0;
    public LinearLayout f46804i0;
    public LinearLayout f46805j0;
    public LinearLayout f46806k0;
    public t1 f46807l0;
    public t1 m0;
    public CharSequence f46808n;
    public t1 f46809n0;
    public t1 f46810o0;
    public t1 f46811p0;
    public t1 f46812q0;
    public MessageObject f46813r;
    public FrameLayout f46814r0;
    public pg.f f46815s;
    public pi0 f46816s0;
    public x60 f46817t0;
    public wo0 f46818u0;
    public ak v;
    public m.t3 f46819v0;
    public final Rect f46820w;
    public wy f46821w0;
    public kg.d f46822x;
    public boolean f46823x0;
    public RectF f46824y;
    public boolean f46825y0;
    public int f46826z0;

    public x1(Editable editable) {
        super(null);
        this.f46795c = -1;
        this.d = -1;
        this.f46820w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f46794b0 = new ArrayList();
        this.f46802g0 = Integer.MAX_VALUE;
        this.f46803h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f46791a = editable;
    }

    public static void T(x1 x1Var) {
        c3 c3Var = x1Var.L.f46577j3;
        if (c3Var != null && c3Var.y()) {
            x1Var.m0();
            return;
        }
        Activity parentActivity = x1Var.getParentActivity();
        new v(x1Var.currentAccount, parentActivity, new i9(x1Var, 18), x1Var.getResourceProvider()).show();
    }

    public static void U(x1 x1Var) {
        if (!UserConfig.getInstance(x1Var.currentAccount).isPremium()) {
            x1Var.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) x1Var, 43, true));
        }
    }

    public static boolean V(x1 x1Var, View view) {
        int i9;
        qn qnVar = x1Var.F;
        if (qnVar != null && x1Var.f46813r == null && !qnVar.c() && x1Var.L.k3() && !x1Var.L.m3()) {
            if (!x1Var.L.M3()) {
                x1Var.A0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Z2 = x1Var.L.Z2();
            if (!Z2.isEmpty()) {
                li0 li0Var = x1Var.K0;
                if (li0Var != null) {
                    li0Var.h(false);
                    x1Var.K0 = null;
                }
                li0 li0Var2 = new li0(x1Var.getParentActivity(), x1Var.getResourceProvider());
                x1Var.K0 = li0Var2;
                li0Var2.setOnDismissListener(new eh.l(x1Var, 12));
                long a2 = x1Var.F.a();
                MessageObject messageObject = x1Var.F.f41959j5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22401id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(x1Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(x1Var.currentAccount).getPeer(UserConfig.getInstance(x1Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Z2;
                richMessage.photos = x1Var.L.B2();
                tL_message.rich_message.documents = x1Var.L.y2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(x1Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                x1Var.K0.q(org.telegram.messenger.l0.k(messageObject2));
                x1Var.f46818u0.setScaleX(1.0f);
                x1Var.f46818u0.setScaleY(1.0f);
                lg r10 = x1Var.K0.r(x1Var.f46818u0, true, new f1(x1Var, 10));
                if (r10 != null) {
                    r10.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), x1Var.getThemedColor(f6.Oh))));
                    li0 li0Var3 = x1Var.K0;
                    int dp = AndroidUtilities.dp(44.0f);
                    li0Var3.f40160i0 = true;
                    li0Var3.U = dp;
                }
                x60 H = x60.H(x1Var, x1Var.f46818u0);
                boolean isUserSelf = UserObject.isUserSelf(x1Var.F.i());
                if (x1Var.F.D6()) {
                    int i10 = R.drawable.msg_calendar2;
                    if (isUserSelf) {
                        i9 = R.string.SetReminder;
                    } else {
                        i9 = R.string.ScheduleMessage;
                    }
                    H.c(i10, LocaleController.getString(i9), new org.telegram.ui.web.b0(x1Var, a2, 2), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new e1(x1Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new e1(x1Var, 6), false);
                }
                H.Y();
                x1Var.K0.p(H);
                x1Var.K0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void W(x1 x1Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i9, int i10, SendMessageChatArguments sendMessageChatArguments, long j11) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(x1Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, x1Var.F);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(x1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j10, messageObject2, messageObject3, z10, i9, i10, sendMessageChatArguments, 0L, j11, 0L);
        }
    }

    public static void X(final x1 x1Var, Context context, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        x60 x60Var;
        boolean z17;
        float f10;
        float f11;
        boolean z18;
        boolean z19;
        boolean z20;
        float f12;
        float f13;
        boolean z21;
        boolean z22;
        float f14;
        x60 x60Var2 = x1Var.f46817t0;
        if (x60Var2 != null) {
            x60Var2.u();
            x1Var.f46817t0 = null;
        }
        if (!MessagesController.getInstance(x1Var.currentAccount).richEditorAllowed() && !UserConfig.getInstance(x1Var.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a Q2 = x1Var.L.Q2();
        final x60 I = x60.I(x1Var, view);
        I.Q = true;
        x60 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new fh.r3(I, 8), false);
        J.k();
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(x1Var) {
            public final x1 f46459b;

            {
                this.f46459b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f23403a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f23403a.setTextSize(1, SharedConfig.fontSize + 2);
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(x1Var) {
            public final x1 f46459b;

            {
                this.f46459b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f23403a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f23403a.setTextSize(1, SharedConfig.fontSize + 1);
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(x1Var) {
            public final x1 f46459b;

            {
                this.f46459b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f23403a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f23403a.setTextSize(1, SharedConfig.fontSize);
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(x1Var) {
            public final x1 f46459b;

            {
                this.f46459b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f23403a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f23403a.setTextSize(1, SharedConfig.fontSize - 1);
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(x1Var) {
            public final x1 f46459b;

            {
                this.f46459b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f23403a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f23403a.setTextSize(1, SharedConfig.fontSize - 2);
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(x1Var) {
            public final x1 f46459b;

            {
                this.f46459b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f46459b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f23403a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f23403a.setTextSize(1, SharedConfig.fontSize - 3);
        if (Q2 != null && o3.C3(Q2.f46269b)) {
            x60Var = J;
            z17 = true;
        } else {
            x60Var = J;
            z17 = false;
        }
        v1 v1Var = new v1(context, R.drawable.iv_h);
        v1Var.a(z10);
        int i9 = f6.G8;
        v1Var.d = i9;
        I.j(z17, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new fh.k3(I, x60Var, 11));
        I.y().f23403a.setTypeface(AndroidUtilities.bold());
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
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new i1(x1Var, Q2, 3));
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new i1(x1Var, Q2, 4));
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        v1 v1Var2 = new v1(context, R.drawable.iv_pullquote);
        v1Var2.a(z10);
        v1Var2.d = i9;
        I.j(z20, 0, v1Var2, LocaleController.getString(R.string.ArticlePullquote), new i1(x1Var, Q2, 0));
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
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new i1(x1Var, Q2, 1));
        if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        v1 v1Var3 = new v1(context, R.drawable.iv_footer);
        v1Var3.a(z10);
        v1Var3.d = i9;
        I.j(z22, 0, v1Var3, LocaleController.getString(R.string.ArticleFooter), new i1(x1Var, Q2, 2));
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
        x1Var.f46817t0 = I;
    }

    public static void Y(x1 x1Var, boolean z10, boolean z11) {
        float f10;
        int i9;
        if (x1Var.F0 != z10 || !z11) {
            x1Var.F0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            if (z11) {
                x1Var.f46816s0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(gr.h).start();
            } else {
                x1Var.f46816s0.animate().cancel();
                x1Var.f46816s0.setScaleX(f10);
                x1Var.f46816s0.setScaleY(f10);
            }
            pi0 pi0Var = x1Var.f46816s0;
            if (z10) {
                i9 = f6.f23230q7;
            } else {
                i9 = f6.G6;
            }
            pi0Var.setColorFilter(new PorterDuffColorFilter(x1Var.getThemedColor(i9), PorterDuff.Mode.SRC_IN));
            mi0 animatedDrawable = x1Var.f46816s0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.X > 34) {
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

    public static d1 Z(x1 x1Var) {
        d1 focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            x1Var.N0 = focusedEditTextOrNull;
            x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        d1 d1Var = x1Var.N0;
        if (d1Var != null) {
            return d1Var;
        }
        return x1Var.L.P2();
    }

    public static int a0(x1 x1Var, d1 d1Var) {
        if (d1Var == x1Var.N0 && x1Var.L.getFocusedEditTextOrNull() != d1Var) {
            return Math.min(x1Var.O0, d1Var.length());
        }
        return Math.max(0, d1Var.getSelectionEnd());
    }

    public static String f0(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 7) {
                        if (i9 != 9) {
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

    public static String h0(int i9) {
        if (i9 == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i9 == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i9 == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i9 == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i9 == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i9 == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i9 == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i9 == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i9 == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    public static void o0(Context context, final Runnable runnable, final Runnable runnable2, b6 b6Var) {
        final org.telegram.ui.ActionBar.f3 j10 = ll.j(context, b6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j10.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(f6.K(AndroidUtilities.dp(80.0f), f6.v0(f6.Oh, b6Var)));
        linearLayout.addView(imageView, e6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i9 = f6.G6;
        textView.setTextColor(f6.v0(i9, b6Var));
        TextView h = j3.r0.h(linearLayout, textView, e6.t(-1, -2, 49, 25, 16, 25, 0), context);
        h.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        h.setTextColor(f6.v0(i9, b6Var));
        linearLayout.addView(h, e6.t(-1, -2, 49, 25, 11, 25, 0));
        kh.d i10 = ll.i(24, context, b6Var, true);
        i10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(i10, e6.t(-1, 48, 49, 14, 31, 14, 0));
        kh.d i11 = ll.i(24, context, b6Var, false);
        i11.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(i11, e6.t(-1, 48, 49, 14, 2, 14, 6));
        j10.show();
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j10.dismiss();
                        runnable2.run();
                        return;
                    default:
                        j10.dismiss();
                        runnable2.run();
                        return;
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j10.dismiss();
                        runnable.run();
                        return;
                    default:
                        j10.dismiss();
                        runnable.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        float f10;
        if (this.f46818u0 == null) {
            return;
        }
        boolean M3 = this.L.M3();
        this.f46818u0.setEnabled(M3);
        ViewPropertyAnimator animate = this.f46818u0.animate();
        if (M3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(150L).start();
    }

    public final void B0() {
        wo0 wo0Var = this.f46818u0;
        if (wo0Var == null) {
            return;
        }
        wo0Var.setLocked(l0());
    }

    public final t1 b0(int i9, int i10, boolean z10) {
        int i11;
        t1 t1Var = new t1(this.f46792a0.getContext(), i9, getResourceProvider());
        if (z10) {
            t1Var.e();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(f0(i10));
        this.f46794b0.add(t1Var);
        LinearLayout linearLayout = this.f46792a0;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(t1Var, e6.t(38, 38, 16, i11, 0, 0, 0));
        return t1Var;
    }

    public final void c0(Context context, int i9, int i10, boolean z10) {
        int i11;
        t1 t1Var = new t1(context, i9, getResourceProvider());
        if (z10) {
            t1Var.e();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(h0(i10));
        t1Var.setOnClickListener(new gh.z0(this, i10, 25));
        this.f46803h0.add(t1Var);
        LinearLayout linearLayout = this.f46799e0;
        if (linearLayout.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout.addView(t1Var, e6.t(38, 38, 16, i11, 0, 0, 0));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.J;
        arrayList.clear();
        this.K = new q1(this, context);
        setHasOwnBackground(true);
        this.K.setFocusable(true);
        this.K.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.K.setDefaultFocusHighlightEnabled(false);
        }
        this.A0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.B0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        mh.a2 a2Var = new mh.a2(this, 1);
        this.D0 = a2Var;
        this.K.f34792r.add(a2Var);
        o3 o3Var = new o3(context, this.currentAccount, getResourceProvider(), new n5.e0(this, 18));
        this.L = o3Var;
        o3Var.setFileRefParentObject(this.f46813r);
        this.K.addView(this.L, e6.e(-1, -1, 119));
        this.K.addView(this.L.getOverlayView(), e6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f46793b;
        if (richMessage != null) {
            o3 o3Var2 = this.L;
            ArrayList arrayList2 = o3Var2.f46573h3;
            o3Var2.f46571g3 = richMessage;
            o3.W2(arrayList2, richMessage.blocks, o3Var2.f46575i3);
            o3Var2.V3();
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                o3Var2.v4((a) arrayList2.get(i9));
            }
            o3Var2.U2.N(false);
        } else {
            String str = this.f46800f;
            if (str != null) {
                o3 o3Var3 = this.L;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f46808n;
                HashMap hashMap = o3Var3.f46575i3;
                ArrayList arrayList3 = o3Var3.f46573h3;
                if (!TextUtils.isEmpty(charSequence)) {
                    o3.W2(arrayList3, t4.b(charSequence), hashMap);
                }
                arrayList3.addAll(o3Var3.w4(u3.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    o3.W2(arrayList3, t4.b(charSequence2), hashMap);
                }
                o3Var3.V3();
                o3Var3.U2.N(false);
            } else {
                CharSequence charSequence3 = this.f46791a;
                if (charSequence3 != null) {
                    this.L.setInitialText(charSequence3);
                }
            }
        }
        b2 b2Var = this.L.F3;
        if (b2Var != null) {
            b2Var.j();
        }
        View view = new View(context);
        this.M = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = f6.f23001d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i10), f6.l1(0.0f, getThemedColor(i10))}));
        this.K.addView(this.M, e6.e(-1, 68, 55));
        View view2 = new View(context);
        this.N = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{f6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10)}));
        this.K.addView(this.N, e6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setClipChildren(false);
        this.O.setClipToPadding(false);
        this.K.addView(this.O, e6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.P;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.P;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(i10);
        int i11 = f6.f23092i6;
        imageView3.setBackground(new w1(f6.Z(themedColor, f6.v(themedColor2, getThemedColor(i11)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.P;
        int i12 = f6.G6;
        int themedColor3 = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        g6.a(this.P);
        this.P.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.P.setOnClickListener(new f1(this, 1));
        this.O.addView(this.P, e6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(0);
        this.Q.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.O.addView(this.Q, e6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.R = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.R.setScaleType(scaleType);
        this.R.setBackground(f6.f0(getThemedColor(i11), 1, -1));
        this.R.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        g6.a(this.R);
        this.R.setContentDescription(LocaleController.getString(R.string.Undo));
        this.R.setOnClickListener(new f1(this, 2));
        this.Q.addView(this.R, e6.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.S = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.S.setScaleType(scaleType);
        this.S.setBackground(f6.f0(getThemedColor(i11), 1, -1));
        this.S.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        g6.a(this.S);
        this.S.setContentDescription(LocaleController.getString(R.string.Redo));
        this.S.setOnClickListener(new f1(this, 3));
        this.Q.addView(this.S, e6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.U.setClipToPadding(false);
        this.K.addView(this.U, e6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.V.setClipToPadding(false);
        this.U.addView(this.V, e6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.W = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.W.setClipChildren(false);
        this.W.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.W, e6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        this.V.addView(frameLayout4, e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.Y = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.Y.setScaleType(scaleType);
        this.Y.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.Y.setBackground(new w1(f6.Z(getThemedColor(i10), f6.v(getThemedColor(i10), getThemedColor(i11)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.W.addView(this.Y, e6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        g6.a(this.Y);
        this.Y.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.Y.setOnClickListener(new f1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        frameLayout5.addView(frameLayout6, e6.e(-2, 44, 81));
        r1 r1Var = new r1(context, 0);
        this.Z = r1Var;
        r1Var.setClipToOutline(true);
        this.Z.setOutlineProvider(new bg.q1(19));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f46792a0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46792a0.setOrientation(0);
        this.Z.addView(this.f46792a0);
        frameLayout6.addView(this.Z, e6.c(-1.0f, -1));
        qg qgVar = new qg(context, 24);
        this.X = qgVar;
        qgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.X.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.X.setBackground(f6.Z(getThemedColor(i10), getThemedColor(i11), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.X.j(og.f31383e, false);
        this.f46792a0.addView(this.X, e6.q(38, 38, 16));
        g6.a(this.X);
        this.X.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.X.setOnClickListener(new f1(this, 5));
        b0(R.drawable.iv_text, 1, false).setOnClickListener(new pf.v(3, this, context));
        b0(R.drawable.iv_lists, 2, true).setOnClickListener(new f1(this, 6));
        b0(R.drawable.iv_table, 4, true).setOnClickListener(new f1(this, 7));
        b0(R.drawable.iv_math, 7, true).setOnClickListener(new f1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f46796c0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f46796c0.setScaleType(scaleType);
        this.f46796c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.f46796c0.setBackground(f6.Z(getThemedColor(i10), getThemedColor(i11), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f46792a0.addView(this.f46796c0, e6.t(38, 38, 16, 2, 0, 0, 0));
        g6.a(this.f46796c0);
        this.f46796c0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f46796c0.setOnClickListener(new f1(this, 9));
        this.W.addView(frameLayout5, e6.l(1.0f, 0, 44));
        ta1 ta1Var = new ta1(this, context, 18);
        this.f46797d0 = ta1Var;
        ta1Var.setOrientation(0);
        this.f46797d0.setClipToPadding(false);
        this.f46797d0.setClipChildren(false);
        this.f46797d0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.f46797d0, e6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f46814r0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f46814r0.setClipToPadding(false);
        this.f46814r0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.f46814r0, e6.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f46816s0 = imageView9;
        imageView9.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        mi0 animatedDrawable = this.f46816s0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.f46816s0.setScaleType(scaleType);
        this.f46816s0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.f46816s0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.f46814r0.addView(this.f46816s0, e6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.f46797d0.addView(frameLayout8, e6.c(44.0f, -2));
        s1 s1Var = new s1(this, context);
        this.f46801f0 = s1Var;
        s1Var.setHorizontalScrollBarEnabled(false);
        this.f46801f0.setClipToOutline(true);
        this.f46801f0.setOutlineProvider(new bg.q1(20));
        frameLayout8.addView(this.f46801f0, e6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f46799e0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f46799e0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46801f0.addView(this.f46799e0, new FrameLayout.LayoutParams(-2, -1));
        c0(context, R.drawable.formatting_bold, 1, false);
        c0(context, R.drawable.formatting_italic, 2, false);
        c0(context, R.drawable.formatting_underline, 16, false);
        c0(context, R.drawable.formatting_strikethrough, 8, false);
        c0(context, R.drawable.formatting_spoiler, 256, false);
        c0(context, R.drawable.iv_code, 4, false);
        c0(context, R.drawable.formatting_marked, 65536, true);
        c0(context, R.drawable.iv_sub, 16384, true);
        c0(context, R.drawable.iv_super, 32768, true);
        t1 t1Var = new t1(context, R.drawable.iv_quote, getResourceProvider());
        this.f46812q0 = t1Var;
        t1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f46812q0.setOnClickListener(new f1(this, 11));
        LinearLayout linearLayout5 = this.f46799e0;
        linearLayout5.addView(this.f46812q0, e6.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        t1 t1Var2 = new t1(context, R.drawable.iv_button, getResourceProvider());
        this.f46809n0 = t1Var2;
        t1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f46809n0.setOnClickListener(new f1(this, 12));
        LinearLayout linearLayout6 = this.f46799e0;
        linearLayout6.addView(this.f46809n0, e6.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f46805j0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f46805j0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46805j0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.f46797d0.addView(this.f46805j0, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var3 = new t1(context, R.drawable.media_link_24, getResourceProvider());
        this.m0 = t1Var3;
        t1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.m0.setOnClickListener(new f1(this, 13));
        this.f46805j0.addView(this.m0, e6.q(38, 38, 16));
        t1 t1Var4 = new t1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f46810o0 = t1Var4;
        t1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f46810o0.setOnClickListener(new f1(this, 14));
        this.f46805j0.addView(this.f46810o0, e6.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f46806k0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f46806k0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46806k0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.f46797d0.addView(this.f46806k0, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var5 = new t1(context, R.drawable.iv_math, getResourceProvider());
        this.f46811p0 = t1Var5;
        t1Var5.e();
        arrayList.add(this.f46811p0);
        this.f46811p0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f46811p0.setOnClickListener(new f1(this, 15));
        this.f46806k0.addView(this.f46811p0, e6.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f46804i0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f46804i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f46804i0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.f46797d0.addView(this.f46804i0, 0, e6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        t1 t1Var6 = new t1(context, 0, getResourceProvider());
        this.f46807l0 = t1Var6;
        t1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.f46807l0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f46807l0.setOnClickListener(new f1(this, 16));
        this.f46804i0.addView(this.f46807l0, e6.q(38, 38, 16));
        wo0 wo0Var = new wo0((Object) this, context, this.f46813r != null ? R.drawable.input_done : k0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider(), 3);
        this.f46818u0 = wo0Var;
        wo0Var.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(f6.Yd))));
        g6.a(this.f46818u0);
        this.W.addView(this.f46818u0, e6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f46818u0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f46818u0.setOnClickListener(new f1(this, 0));
        this.f46818u0.setOnLongClickListener(new kh.d5(this, 3));
        B0();
        this.K.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        g0();
        w0(0, false);
        y0();
        this.K.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        z0();
        if (this.f46798e) {
            this.L.C2();
            this.f46798e = false;
        }
        q1 q1Var = this.K;
        this.fragmentView = q1Var;
        return q1Var;
    }

    public final void d0(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M0, f10);
        this.L0 = ofFloat;
        ofFloat.addUpdateListener(new g1(this, 0));
        this.L0.setInterpolator(gr.h);
        this.L0.setDuration(250L);
        this.L0.start();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            B0();
            z0();
        }
    }

    public final void e0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        wy wyVar = this.f46821w0;
        if (wyVar != null && (layoutParams = (FrameLayout.LayoutParams) wyVar.getLayoutParams()) != null) {
            int i02 = i0();
            q1 q1Var = this.K;
            if (q1Var == null) {
                max = i0();
            } else {
                max = Math.max(i0(), ((q1Var.getMeasuredHeight() - this.K.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.P0);
            }
            int round = Math.round(((max - i02) * this.M0) + i02);
            if (layoutParams.height != round) {
                layoutParams.height = round;
                this.f46821w0.setLayoutParams(layoutParams);
            }
        }
    }

    public final void g0() {
        FrameLayout.LayoutParams layoutParams;
        wy wyVar = this.f46821w0;
        if (wyVar != null && (layoutParams = (FrameLayout.LayoutParams) wyVar.getLayoutParams()) != null) {
            int i9 = layoutParams.bottomMargin;
            int i10 = this.P0;
            if (i9 != i10) {
                layoutParams.bottomMargin = i10;
                this.f46821w0.setLayoutParams(layoutParams);
            }
        }
        e0();
        int max = Math.max(Math.max(this.f46826z0, this.P0), this.Q0);
        this.L.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        o3 o3Var = this.L;
        int i11 = this.P0;
        int i12 = this.Q0;
        int i13 = this.f46826z0;
        o3Var.K3 = i11;
        o3Var.L3 = i12;
        o3Var.M3 = i13;
        int i14 = -max;
        this.U.setTranslationY(i14);
        this.N.setTranslationY(i14 + this.P0);
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final int i0() {
        int i9;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i9 = this.B0;
        } else {
            i9 = this.A0;
        }
        if (i9 <= 0) {
            return AndroidUtilities.dp(200.0f);
        }
        return i9;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        o3 o3Var = this.L;
        if (o3Var != null && o3Var.f46577j3.y()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(boolean z10) {
        if (this.f46825y0) {
            this.f46825y0 = false;
            wy wyVar = this.f46821w0;
            if (wyVar != null) {
                wyVar.t(false);
                this.f46821w0.A();
            }
        }
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        this.M0 = 0.0f;
        this.N0 = null;
        wy wyVar2 = this.f46821w0;
        if (wyVar2 != null) {
            wyVar2.setTranslationY(0.0f);
            this.f46821w0.setVisibility(8);
        }
        if (this.f46823x0 || this.f46826z0 != 0) {
            this.f46823x0 = false;
            this.f46826z0 = 0;
            g0();
        }
        qg qgVar = this.X;
        if (qgVar != null) {
            qgVar.j(og.f31383e, z10);
        }
    }

    public final boolean k0() {
        qn qnVar;
        if (this.f46813r == null && (qnVar = this.F) != null && qnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            o3 o3Var = this.L;
            if (t4.f(o3Var.f46573h3, o3Var.f46575i3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void m0() {
        f3 h22 = this.L.h2();
        if (h22 != null) {
            TL_iv.RichMessage a2 = h22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
            e0Var.m0(a2);
            e0Var.f27858g0 = new i9(h22, 16);
            e0Var.show();
        }
    }

    public final void n0(int i9, int i10) {
        o3 o3Var = this.L;
        o3Var.Y3 = o3Var.Q2();
        ki kiVar = new ki(getParentActivity(), this, false, false, true, getResourceProvider());
        kiVar.V1 = new n1(this, kiVar);
        kiVar.f30114f0.setIncludeVideosInGallery(true);
        kiVar.f30114f0.e0();
        kiVar.J1(1, true);
        kiVar.h1(i9);
        kiVar.f30145p2 = new m1(this, kiVar);
        kiVar.U = new m1(this, kiVar);
        kiVar.T = new o1(this, kiVar);
        kiVar.r1();
        if (i10 != 0) {
            kiVar.A1(i10);
        }
        kiVar.setFocusable(true);
        kiVar.show();
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        if (i10 == -1 && i9 == 21) {
            if (intent != null && intent.getData() != null) {
                o3 o3Var = this.L;
                Uri data = intent.getData();
                if (data == null) {
                    o3Var.getClass();
                } else if (o3Var.getContext() != null) {
                    Utilities.globalQueue.postRunnable(new ai1(21, o3Var, data));
                }
            }
        } else if (i10 == -1 && (i9 == 1 || i9 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.L.e2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i9, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.f46825y0;
        if (z11) {
            if (z11) {
                this.f46825y0 = false;
                wy wyVar = this.f46821w0;
                if (wyVar != null) {
                    wyVar.t(false);
                    this.f46821w0.A();
                }
                d0(false);
                return false;
            }
        } else if (this.f46823x0) {
            j0(true);
            return false;
        } else if (!this.L.F2()) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f10;
        if (!z10 && !this.R0) {
            p0();
            this.R0 = true;
        }
        if (!AndroidUtilities.isTablet() && this.f46815s != null && this.v != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            pg.f fVar = this.f46815s;
            this.f46822x = fVar.f45872f;
            fVar.f45871e = false;
            fVar.invalidate();
            this.v.setAlpha(0.0f);
            this.v.f26193v1.setVisibility(4);
            u0();
            float f11 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.E = f10;
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.A = true;
            this.K.invalidate();
            ofFloat.addUpdateListener(new g1(this, 1));
            ofFloat.addListener(new su0(18, this, runnable));
            if (!z10) {
                FrameLayout frameLayout = this.O;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.O;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.V, property, 0.0f), ObjectAnimator.ofFloat(this.V, property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.L, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.M, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.N, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.O;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.O;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.V, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.V, property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.L, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.M, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.N, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(gr.h);
            this.K.post(new kt0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        mh.a2 a2Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.R0) {
            p0();
            this.R0 = true;
        }
        k1 k1Var = this.J0;
        if (k1Var != null) {
            this.J0 = null;
            AndroidUtilities.runOnUIThread(k1Var);
        }
        li0 li0Var = this.K0;
        if (li0Var != null) {
            li0Var.i();
            this.K0 = null;
        }
        o3 o3Var = this.L;
        if (o3Var != null) {
            o3Var.G2();
        }
        m.t3 t3Var = this.f46819v0;
        if (t3Var != null) {
            t3Var.c();
        }
        super.onFragmentDestroy();
        wy wyVar = this.f46821w0;
        if (wyVar != null) {
            wyVar.D();
        }
        q1 q1Var = this.K;
        if (q1Var != null && (a2Var = this.D0) != null) {
            q1Var.f34792r.remove(a2Var);
        }
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.P0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.P0;
        this.N.setLayoutParams(layoutParams);
        g0();
    }

    @Override
    public final r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        boolean z10;
        x60 x60Var;
        i0.b f10 = m1Var.f46929a.f(3);
        int i9 = m1Var.f46929a.f(8).d;
        this.Q0 = i9;
        int i10 = i9 - f10.d;
        boolean z11 = this.C0;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C0 = z10;
        if (z10 && i10 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.B0 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.B0).commit();
            } else {
                this.A0 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.A0).commit();
            }
        }
        if (this.C0 && !z11 && this.f46823x0 && !this.f46825y0) {
            j0(false);
        }
        if (!this.C0 && z11 && (x60Var = this.f46817t0) != null) {
            x60Var.u();
            this.f46817t0 = null;
        }
        onInsets(f10.f10848a, f10.f10849b, f10.f10850c, f10.d);
        return r0.m1.f46928b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        o3 o3Var;
        int i9;
        o3 o3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i9 = this.f46795c) >= 0 && (o3Var2 = this.L) != null) {
            int i10 = this.d;
            this.d = -1;
            this.f46795c = -1;
            if (!o3Var2.Y1(i9, i10)) {
                o3Var2.post(new j2(o3Var2, i9, i10, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f46793b != null || this.f46800f != null) && (o3Var = this.L) != null && !o3Var.a3()) {
                o3Var.post(new b(o3Var, 5));
            }
        }
    }

    public final boolean p0() {
        TL_iv.RichMessage j22;
        Runnable runnable;
        if (this.F == null || this.f46813r != null || !this.L.r2()) {
            return false;
        }
        if (this.I) {
            j22 = null;
        } else {
            j22 = this.L.j2();
        }
        if (j22 == null && (runnable = this.H) != null) {
            runnable.run();
        }
        ak akVar = this.F.U;
        if (j22 != null && !this.I) {
            o3 o3Var = this.L;
            if (o3Var.k3() && !t4.f(o3Var.f46573h3, o3Var.f46575i3) && akVar != null) {
                SpannableStringBuilder k10 = t4.k(this.L.f46573h3);
                qn qnVar = akVar.K2;
                if (akVar.A0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, akVar.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.t5.class);
                if (t5VarArr != null) {
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        t5Var.applyFontMetrics(akVar.A0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.k5.g());
                    }
                }
                fi0.a(spannableStringBuilder);
                if (qnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(akVar.M).saveDraft(qnVar.a(), qnVar.B7(qnVar.f41959j5), charSequenceArr[0], MediaDataController.getInstance(akVar.M).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                akVar.setRichDraftPreview(null);
                if (akVar.A0.getText() != null) {
                    akVar.A0.getText().clear();
                }
                akVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.F.a();
        qn qnVar2 = this.F;
        mediaDataController.saveDraft(a2, qnVar2.B7(qnVar2.f41959j5), "", null, null, null, null, 0L, false, false, j22);
        TL_iv.RichMessage richMessage = j22;
        if (akVar == null) {
            return true;
        }
        akVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void q0() {
        if (l0()) {
            Activity parentActivity = getParentActivity();
            o3 o3Var = this.L;
            Objects.requireNonNull(o3Var);
            o0(parentActivity, new b(o3Var, 0), new e1(this, 4), getResourceProvider());
        } else if (k0()) {
            org.telegram.ui.Components.y4.M(getParentActivity(), this.F.a(), new n5.a0(this, 14), getResourceProvider());
        } else {
            r0(0, 0, true);
        }
    }

    public final void r0(final int i9, final int i10, final boolean z10) {
        if (l0()) {
            Activity parentActivity = getParentActivity();
            o3 o3Var = this.L;
            Objects.requireNonNull(o3Var);
            o0(parentActivity, new b(o3Var, 0), new e1(this, 4), getResourceProvider());
        } else if (this.F != null && this.L.k3() && !this.L.m3()) {
            if (!this.L.M3()) {
                A0();
            } else if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
                ak akVar = this.F.U;
                if (akVar != null) {
                    this.I = true;
                    Runnable runnable = this.G;
                    if (runnable != null) {
                        runnable.run();
                    }
                    akVar.R0(t4.k(this.L.f46573h3), z10, i9, i10);
                    finishFragment();
                }
            } else {
                this.I = true;
                final ArrayList Z2 = this.L.Z2();
                if (Z2.isEmpty()) {
                    return;
                }
                final ArrayList B2 = this.L.B2();
                final ArrayList y22 = this.L.y2();
                final ArrayList a2 = s4.a(this.currentAccount, Z2);
                final long a3 = this.F.a();
                qn qnVar = this.F;
                final MessageObject messageObject = qnVar.f41959j5;
                final MessageObject messageObject2 = qnVar.T3;
                final long N8 = qnVar.N8();
                final SendMessageChatArguments C8 = this.F.C8();
                final MessageObject messageObject3 = this.f46813r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        x1.W(x1.this, messageObject3, Z2, B2, y22, a2, a3, messageObject, messageObject2, z10, i9, i10, C8, N8);
                    }
                };
                Runnable runnable2 = this.G;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (i9 != 0 && messageObject3 == null) {
                    this.J0 = r02;
                    finishFragment();
                    return;
                }
                r02.run();
                finishFragment();
            }
        }
    }

    public final void s0(boolean z10) {
        ArrayList arrayList = this.f46803h0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            t1 t1Var = (t1) obj;
            if (((Integer) t1Var.getTag()).intValue() == 1) {
                t1Var.setEnabled(z10);
            }
        }
    }

    public final void t0(boolean z10, boolean z11) {
        t1 t1Var = this.m0;
        if (t1Var != null) {
            t1Var.setEnabled(z10);
        }
        t1 t1Var2 = this.f46809n0;
        if (t1Var2 != null) {
            t1Var2.setEnabled(z11);
        }
        t1 t1Var3 = this.f46810o0;
        if (t1Var3 != null) {
            t1Var3.setEnabled(z10);
        }
        t1 t1Var4 = this.f46811p0;
        if (t1Var4 != null) {
            t1Var4.setEnabled(z10);
        }
    }

    public final void u0() {
        pg.f fVar = this.f46815s;
        int[] iArr = this.B;
        fVar.getLocationInWindow(iArr);
        if (this.f46824y == null) {
            this.f46824y = new RectF();
        }
        RectF rectF = new RectF(this.f46822x.getBounds());
        this.f46824y = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.C == null) {
            this.C = new int[2];
        }
        this.v.getLocationInWindow(this.C);
        if (this.D == null) {
            this.D = new int[2];
        }
        this.D[0] = this.L.getPaddingLeft();
        this.D[1] = this.L.getPaddingTop();
        int[] iArr2 = this.D;
        iArr2[0] = (int) (iArr2[0] - (this.v.A0.getX() - AndroidUtilities.dp(16.0f)));
    }

    public final void v0() {
        throw new UnsupportedOperationException("Method not decompiled: qh.x1.v0():void");
    }

    public final void w0(int i9, boolean z10) {
        int i10;
        float f10;
        float f11;
        float f12;
        float dp;
        int i11;
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
        if (this.G0 == i9) {
            return;
        }
        this.G0 = i9;
        int i12 = 0;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z10) {
            this.W.setVisibility(0);
            ViewPropertyAnimator animate = this.W.animate();
            if (this.G0 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (this.G0 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (this.G0 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (this.G0 == 0) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(dp3).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new e1(this, 1)).start();
            this.f46797d0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f46797d0.animate();
            if (this.G0 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (this.G0 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (this.G0 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (this.G0 == 1) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(30.0f);
            }
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(grVar).withEndAction(new e1(this, 2)).start();
            this.f46814r0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f46814r0.animate();
            if (this.G0 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (this.G0 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (this.G0 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(grVar).withEndAction(new e1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.W;
        if (i9 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.W;
        if (i9 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.W;
        if (i9 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.W;
        if (i9 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.W;
        if (i9 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout5.setTranslationY(dp);
        ta1 ta1Var = this.f46797d0;
        if (i9 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        ta1Var.setVisibility(i11);
        ta1 ta1Var2 = this.f46797d0;
        if (i9 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ta1Var2.setAlpha(f13);
        ta1 ta1Var3 = this.f46797d0;
        if (i9 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        ta1Var3.setScaleX(f14);
        ta1 ta1Var4 = this.f46797d0;
        if (i9 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        ta1Var4.setScaleY(f15);
        ta1 ta1Var5 = this.f46797d0;
        if (i9 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        ta1Var5.setTranslationY(dp2);
        FrameLayout frameLayout = this.f46814r0;
        if (i9 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        FrameLayout frameLayout2 = this.f46814r0;
        if (i9 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f46814r0;
        if (i9 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f46814r0;
        if (i9 == 2) {
            f25 = 1.0f;
        }
        frameLayout4.setScaleY(f25);
    }

    public final void x0() {
        boolean z10;
        boolean z11;
        boolean g10;
        boolean z12;
        boolean h;
        boolean z13;
        int max;
        int max2;
        boolean z14;
        boolean z15;
        boolean z16;
        d1 d1Var;
        int max3;
        boolean z17;
        boolean z18;
        n9 textSelectionHelper = this.L.getTextSelectionHelper();
        ArrayList arrayList = this.f46803h0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.y()) {
            t1 t1Var = this.f46812q0;
            boolean z19 = false;
            if (t1Var != null) {
                o3 o3Var = this.L;
                int[] B4 = o3Var.B4();
                if (B4 != null && o3Var.H3(B4[0], B4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var.setSelected(z18);
            }
            if (this.L.L3()) {
                n9 textSelectionHelper2 = this.L.getTextSelectionHelper();
                int i9 = textSelectionHelper2.f24774u0;
                int i10 = textSelectionHelper2.f24775v0;
                int i11 = textSelectionHelper2.f24778y0;
                int i12 = textSelectionHelper2.f24776w0;
                int i13 = textSelectionHelper2.f24779z0;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    t1 t1Var2 = (t1) obj;
                    t1Var2.setSelected(this.L.K3(((Integer) t1Var2.getTag()).intValue(), i9, i10, i12, i11, i13));
                }
                if (i10 == i11) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    d1Var = this.L.N4(i9, i10);
                } else {
                    d1Var = null;
                }
                int max4 = Math.max(0, Math.min(i12, i13));
                if (d1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i12, i13), d1Var.length()));
                }
                t1 t1Var3 = this.m0;
                if (t1Var3 != null) {
                    if (d1Var != null && max4 < max3 && u5.h(d1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    t1Var3.setSelected(z17);
                }
                t1 t1Var4 = this.f46810o0;
                if (t1Var4 != null) {
                    if (d1Var != null && max4 < max3 && u5.g(d1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    t1Var4.setSelected(z19);
                }
                s0(true);
                t0(z16, this.L.l2());
            } else if (this.L.w3()) {
                n9 textSelectionHelper3 = this.L.getTextSelectionHelper();
                d1 s22 = this.L.s2(textSelectionHelper3.f24774u0);
                int i15 = textSelectionHelper3.f24776w0;
                int i16 = textSelectionHelper3.f24779z0;
                if (s22 == null) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i15, i16), s22.length()));
                }
                if (s22 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0, Math.min(Math.max(i15, i16), s22.length()));
                }
                int size2 = arrayList.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj2 = arrayList.get(i17);
                    i17++;
                    t1 t1Var5 = (t1) obj2;
                    int intValue = ((Integer) t1Var5.getTag()).intValue();
                    if (s22 != null && max < max2 && (intValue & s22.getCurrentStyle(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    t1Var5.setSelected(z15);
                }
                t1 t1Var6 = this.m0;
                if (t1Var6 != null) {
                    if (s22 != null && max < max2 && u5.h(s22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    t1Var6.setSelected(z14);
                }
                t1 t1Var7 = this.f46810o0;
                if (t1Var7 != null) {
                    if (s22 != null && max < max2 && u5.g(s22.getText(), max, max2)) {
                        z19 = true;
                    }
                    t1Var7.setSelected(z19);
                }
                s0(true);
                t0(true, this.L.l2());
            } else {
                int i18 = textSelectionHelper.f24774u0;
                int i19 = textSelectionHelper.f24777x0;
                int i20 = textSelectionHelper.f24776w0;
                int i21 = textSelectionHelper.f24779z0;
                if (i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.L.f46582l4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i22 = 0;
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    t1 t1Var8 = (t1) arrayList.get(i22);
                    int intValue2 = ((Integer) t1Var8.getTag()).intValue();
                    if (z10 && this.L.J3(intValue2, i18, i20, i19, i21)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    t1Var8.setSelected(z13);
                    i22 = i23;
                }
                s0(!this.L.I3());
                t1 t1Var9 = this.m0;
                if (t1Var9 != null) {
                    if (z10) {
                        Editable H4 = this.L.H4(i18, i20, i19, i21);
                        if (H4 == null) {
                            h = false;
                        } else {
                            h = u5.h(H4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (h) {
                            z12 = true;
                            t1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    t1Var9.setSelected(z12);
                }
                t1 t1Var10 = this.f46810o0;
                if (t1Var10 != null) {
                    if (z10) {
                        Editable H42 = this.L.H4(i18, i20, i19, i21);
                        if (H42 == null) {
                            g10 = false;
                        } else {
                            g10 = u5.g(H42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (g10) {
                            z11 = true;
                            t1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    t1Var10.setSelected(z11);
                }
                if (z10 && i18 == i19) {
                    z19 = true;
                }
                t0(z19, this.L.l2());
            }
        }
    }

    public final void y0() {
        boolean z10;
        float f10;
        boolean r22 = this.L.r2();
        b2 b2Var = this.L.F3;
        if (b2Var != null && !b2Var.f46306c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.R;
        float f11 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(r22);
            ImageView imageView2 = this.R;
            if (r22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
        }
        ImageView imageView3 = this.S;
        if (imageView3 != null) {
            imageView3.setEnabled(z10);
            ImageView imageView4 = this.S;
            if (z10) {
                f11 = 1.0f;
            }
            imageView4.setAlpha(f11);
        }
    }

    public final void z0() {
        boolean z10;
        int i9 = 0;
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((t1) obj).setPremiumLocked(z10);
        }
    }

    public x1(String str) {
        super(null);
        this.f46795c = -1;
        this.d = -1;
        this.f46820w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f46794b0 = new ArrayList();
        this.f46802g0 = Integer.MAX_VALUE;
        this.f46803h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f46800f = str;
    }

    public x1(TL_iv.RichMessage richMessage) {
        super(null);
        this.f46795c = -1;
        this.d = -1;
        this.f46820w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f46794b0 = new ArrayList();
        this.f46802g0 = Integer.MAX_VALUE;
        this.f46803h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f46793b = richMessage;
    }
}
