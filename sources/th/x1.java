package th;

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
import i7.f6;
import i7.h6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.dk;
import org.telegram.ui.it0;
import org.telegram.ui.ki0;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.ua1;
public final class x1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int A0;
    public final int[] B;
    public int B0;
    public int[] C;
    public boolean C0;
    public int[] D;
    public ph.s1 D0;
    public float E;
    public int E0;
    public tn F;
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
    public ki0 K0;
    public p3 L;
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
    public tg X;
    public ImageView Y;
    public r1 Z;
    public final CharSequence f48845a;
    public LinearLayout f48846a0;
    public final TL_iv.RichMessage f48847b;
    public final ArrayList f48848b0;
    public int f48849c;
    public ImageView f48850c0;
    public int d;
    public ua1 f48851d0;
    public boolean f48852e;
    public LinearLayout f48853e0;
    public final String f48854f;
    public s1 f48855f0;
    public int f48856g0;
    public CharSequence h;
    public final ArrayList f48857h0;
    public LinearLayout f48858i0;
    public LinearLayout f48859j0;
    public LinearLayout f48860k0;
    public t1 f48861l0;
    public t1 m0;
    public CharSequence f48862n;
    public t1 f48863n0;
    public t1 f48864o0;
    public t1 f48865p0;
    public t1 f48866q0;
    public MessageObject f48867r;
    public FrameLayout f48868r0;
    public sg.f f48869s;
    public aj0 f48870s0;
    public j70 f48871t0;
    public hp0 f48872u0;
    public dk v;
    public m.s3 f48873v0;
    public final Rect f48874w;
    public fz f48875w0;
    public ng.d f48876x;
    public boolean f48877x0;
    public RectF f48878y;
    public boolean f48879y0;
    public int f48880z0;

    public x1(Editable editable) {
        super(null);
        this.f48849c = -1;
        this.d = -1;
        this.f48874w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f48848b0 = new ArrayList();
        this.f48856g0 = Integer.MAX_VALUE;
        this.f48857h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f48845a = editable;
    }

    public static void U(x1 x1Var) {
        d3 d3Var = x1Var.L.f48650j3;
        if (d3Var != null && d3Var.y()) {
            x1Var.n0();
            return;
        }
        Activity parentActivity = x1Var.getParentActivity();
        new v(x1Var.currentAccount, parentActivity, new nh.b0(x1Var, 25), x1Var.getResourceProvider()).show();
    }

    public static void V(x1 x1Var) {
        if (!UserConfig.getInstance(x1Var.currentAccount).isPremium()) {
            x1Var.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) x1Var, 43, true));
        }
    }

    public static boolean W(x1 x1Var, View view) {
        int i10;
        tn tnVar = x1Var.F;
        if (tnVar != null && x1Var.f48867r == null && !tnVar.c() && x1Var.L.k3() && !x1Var.L.m3()) {
            if (!x1Var.L.M3()) {
                x1Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Z2 = x1Var.L.Z2();
            if (!Z2.isEmpty()) {
                ki0 ki0Var = x1Var.K0;
                if (ki0Var != null) {
                    ki0Var.h(false);
                    x1Var.K0 = null;
                }
                ki0 ki0Var2 = new ki0(x1Var.getParentActivity(), x1Var.getResourceProvider());
                x1Var.K0 = ki0Var2;
                ki0Var2.setOnDismissListener(new cg.d0(x1Var, 14));
                long a2 = x1Var.F.a();
                MessageObject messageObject = x1Var.F.f42856j5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22413id = 0;
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
                x1Var.K0.q(org.telegram.messenger.x3.n(messageObject2));
                x1Var.f48872u0.setScaleX(1.0f);
                x1Var.f48872u0.setScaleY(1.0f);
                og r6 = x1Var.K0.r(x1Var.f48872u0, true, new f1(x1Var, 10));
                if (r6 != null) {
                    r6.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), x1Var.getThemedColor(g6.Oh))));
                    ki0 ki0Var3 = x1Var.K0;
                    int dp = AndroidUtilities.dp(44.0f);
                    ki0Var3.f39885i0 = true;
                    ki0Var3.U = dp;
                }
                j70 H = j70.H(x1Var, x1Var.f48872u0);
                boolean isUserSelf = UserObject.isUserSelf(x1Var.F.i());
                if (x1Var.F.D6()) {
                    int i11 = R.drawable.msg_calendar2;
                    if (isUserSelf) {
                        i10 = R.string.SetReminder;
                    } else {
                        i10 = R.string.ScheduleMessage;
                    }
                    H.c(i11, LocaleController.getString(i10), new qh.m0(x1Var, a2, 2), false);
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

    public static void X(x1 x1Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j11) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(x1Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, x1Var.F);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(x1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j10, messageObject2, messageObject3, z10, i10, i11, sendMessageChatArguments, 0L, j11, 0L);
        }
    }

    public static void Y(final x1 x1Var, Context context, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        j70 j70Var;
        boolean z17;
        float f9;
        float f10;
        boolean z18;
        boolean z19;
        boolean z20;
        float f11;
        float f12;
        boolean z21;
        boolean z22;
        float f13;
        j70 j70Var2 = x1Var.f48871t0;
        if (j70Var2 != null) {
            j70Var2.u();
            x1Var.f48871t0 = null;
        }
        if (!MessagesController.getInstance(x1Var.currentAccount).richEditorAllowed() && !UserConfig.getInstance(x1Var.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a Q2 = x1Var.L.Q2();
        final j70 I = j70.I(x1Var, view);
        I.Q = true;
        j70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ih.g3(I, 8), false);
        J.k();
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(x1Var) {
            public final x1 f48518b;

            {
                this.f48518b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f22963a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f22963a.setTextSize(1, SharedConfig.fontSize + 2);
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(x1Var) {
            public final x1 f48518b;

            {
                this.f48518b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f22963a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f22963a.setTextSize(1, SharedConfig.fontSize + 1);
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(x1Var) {
            public final x1 f48518b;

            {
                this.f48518b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f22963a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f22963a.setTextSize(1, SharedConfig.fontSize);
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(x1Var) {
            public final x1 f48518b;

            {
                this.f48518b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f22963a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f22963a.setTextSize(1, SharedConfig.fontSize - 1);
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(x1Var) {
            public final x1 f48518b;

            {
                this.f48518b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f22963a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f22963a.setTextSize(1, SharedConfig.fontSize - 2);
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(x1Var) {
            public final x1 f48518b;

            {
                this.f48518b = x1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f48518b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f22963a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        J.y().f22963a.setTextSize(1, SharedConfig.fontSize - 3);
        if (Q2 != null && p3.C3(Q2.f48328b)) {
            j70Var = J;
            z17 = true;
        } else {
            j70Var = J;
            z17 = false;
        }
        v1 v1Var = new v1(context, R.drawable.iv_h);
        v1Var.a(z10);
        int i10 = g6.G8;
        v1Var.d = i10;
        I.j(z17, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new ih.z2(I, j70Var, 11));
        I.y().f22963a.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.g1 y8 = I.y();
        float f14 = 9.0f;
        if (LocaleController.isRTL) {
            f9 = 18.0f;
        } else {
            f9 = 9.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        if (LocaleController.isRTL) {
            f10 = 9.0f;
        } else {
            f10 = 18.0f;
        }
        y8.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new i1(x1Var, Q2, 3));
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new i1(x1Var, Q2, 4));
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        v1 v1Var2 = new v1(context, R.drawable.iv_pullquote);
        v1Var2.a(z10);
        v1Var2.d = i10;
        I.j(z20, 0, v1Var2, LocaleController.getString(R.string.ArticlePullquote), new i1(x1Var, Q2, 0));
        org.telegram.ui.ActionBar.g1 y10 = I.y();
        if (LocaleController.isRTL) {
            f11 = 18.0f;
        } else {
            f11 = 9.0f;
        }
        int dp2 = AndroidUtilities.dp(f11);
        if (LocaleController.isRTL) {
            f12 = 9.0f;
        } else {
            f12 = 18.0f;
        }
        y10.setPadding(dp2, 0, AndroidUtilities.dp(f12), 0);
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new i1(x1Var, Q2, 1));
        if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        v1 v1Var3 = new v1(context, R.drawable.iv_footer);
        v1Var3.a(z10);
        v1Var3.d = i10;
        I.j(z22, 0, v1Var3, LocaleController.getString(R.string.ArticleFooter), new i1(x1Var, Q2, 2));
        org.telegram.ui.ActionBar.g1 y11 = I.y();
        if (LocaleController.isRTL) {
            f13 = 18.0f;
        } else {
            f13 = 9.0f;
        }
        int dp3 = AndroidUtilities.dp(f13);
        if (!LocaleController.isRTL) {
            f14 = 18.0f;
        }
        y11.setPadding(dp3, 0, AndroidUtilities.dp(f14), 0);
        I.Z();
        x1Var.f48871t0 = I;
    }

    public static void Z(x1 x1Var, boolean z10, boolean z11) {
        float f9;
        int i10;
        if (x1Var.F0 != z10 || !z11) {
            x1Var.F0 = z10;
            if (z10) {
                f9 = 1.15f;
            } else {
                f9 = 1.0f;
            }
            if (z11) {
                x1Var.f48870s0.animate().scaleX(f9).scaleY(f9).setDuration(180L).setInterpolator(jr.h).start();
            } else {
                x1Var.f48870s0.animate().cancel();
                x1Var.f48870s0.setScaleX(f9);
                x1Var.f48870s0.setScaleY(f9);
            }
            aj0 aj0Var = x1Var.f48870s0;
            if (z10) {
                i10 = g6.f23295q7;
            } else {
                i10 = g6.G6;
            }
            aj0Var.setColorFilter(new PorterDuffColorFilter(x1Var.getThemedColor(i10), PorterDuff.Mode.SRC_IN));
            xi0 animatedDrawable = x1Var.f48870s0.getAnimatedDrawable();
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

    public static d1 a0(x1 x1Var) {
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

    public static int b0(x1 x1Var, d1 d1Var) {
        if (d1Var == x1Var.N0 && x1Var.L.getFocusedEditTextOrNull() != d1Var) {
            return Math.min(x1Var.O0, d1Var.length());
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

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, c6 c6Var) {
        final org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        q6.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(g6.K(AndroidUtilities.dp(80.0f), g6.v0(g6.Oh, c6Var)));
        linearLayout.addView(imageView, f6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i10 = g6.G6;
        textView.setTextColor(g6.v0(i10, c6Var));
        TextView i11 = th.i(linearLayout, textView, f6.t(-1, -2, 49, 25, 16, 25, 0), context);
        i11.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        i11.setTextSize(1, 14.0f);
        i11.setGravity(17);
        i11.setTextColor(g6.v0(i10, c6Var));
        linearLayout.addView(i11, f6.t(-1, -2, 49, 25, 11, 25, 0));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        o10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(o10, f6.t(-1, 48, 49, 14, 31, 14, 0));
        nh.d o11 = org.telegram.messenger.x3.o(24, context, c6Var, false);
        o11.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(o11, f6.t(-1, 48, 49, 14, 2, 14, 6));
        q6.show();
        o10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        q6.dismiss();
                        runnable2.run();
                        return;
                    default:
                        q6.dismiss();
                        runnable2.run();
                        return;
                }
            }
        });
        o11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        q6.dismiss();
                        runnable.run();
                        return;
                    default:
                        q6.dismiss();
                        runnable.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        boolean z10;
        int i10 = 0;
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t1) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        float f9;
        if (this.f48872u0 == null) {
            return;
        }
        boolean M3 = this.L.M3();
        this.f48872u0.setEnabled(M3);
        ViewPropertyAnimator animate = this.f48872u0.animate();
        if (M3) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        animate.alpha(f9).setDuration(150L).start();
    }

    public final void C0() {
        hp0 hp0Var = this.f48872u0;
        if (hp0Var == null) {
            return;
        }
        hp0Var.setLocked(m0());
    }

    public final t1 c0(int i10, int i11, boolean z10) {
        int i12;
        t1 t1Var = new t1(this.f48846a0.getContext(), i10, getResourceProvider());
        if (z10) {
            t1Var.d();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i11));
        t1Var.setContentDescription(g0(i11));
        this.f48848b0.add(t1Var);
        LinearLayout linearLayout = this.f48846a0;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(t1Var, f6.t(38, 38, 16, i12, 0, 0, 0));
        return t1Var;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
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
        ph.s1 s1Var = new ph.s1(this, 1);
        this.D0 = s1Var;
        this.K.f29257r.add(s1Var);
        p3 p3Var = new p3(context, this.currentAccount, getResourceProvider(), new o1.a(this, 24));
        this.L = p3Var;
        p3Var.setFileRefParentObject(this.f48867r);
        this.K.addView(this.L, f6.e(-1, -1, 119));
        this.K.addView(this.L.getOverlayView(), f6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f48847b;
        if (richMessage != null) {
            p3 p3Var2 = this.L;
            ArrayList arrayList2 = p3Var2.f48646h3;
            p3Var2.f48644g3 = richMessage;
            p3.W2(arrayList2, richMessage.blocks, p3Var2.f48648i3);
            p3Var2.V3();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                p3Var2.v4((a) arrayList2.get(i13));
            }
            p3Var2.U2.N(false);
        } else {
            String str = this.f48854f;
            if (str != null) {
                p3 p3Var3 = this.L;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f48862n;
                HashMap hashMap = p3Var3.f48648i3;
                ArrayList arrayList3 = p3Var3.f48646h3;
                if (!TextUtils.isEmpty(charSequence)) {
                    p3.W2(arrayList3, u4.b(charSequence), hashMap);
                }
                arrayList3.addAll(p3Var3.w4(v3.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    p3.W2(arrayList3, u4.b(charSequence2), hashMap);
                }
                p3Var3.V3();
                p3Var3.U2.N(false);
            } else {
                CharSequence charSequence3 = this.f48845a;
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
        int i14 = g6.f23062d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i14), g6.l1(0.0f, getThemedColor(i14))}));
        this.K.addView(this.M, f6.e(-1, 68, 55));
        View view2 = new View(context);
        this.N = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{g6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14)}));
        this.K.addView(this.N, f6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setClipChildren(false);
        this.O.setClipToPadding(false);
        this.K.addView(this.O, f6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.P;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.P;
        int themedColor = getThemedColor(i14);
        int themedColor2 = getThemedColor(i14);
        int i15 = g6.f23152i6;
        imageView3.setBackground(new w1(g6.Z(themedColor, g6.v(themedColor2, getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.P;
        int i16 = g6.G6;
        int themedColor3 = getThemedColor(i16);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        h6.a(this.P);
        this.P.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.P.setOnClickListener(new f1(this, 1));
        this.O.addView(this.P, f6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(0);
        this.Q.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.O.addView(this.Q, f6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.R = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.R.setScaleType(scaleType);
        this.R.setBackground(g6.f0(getThemedColor(i15), 1, -1));
        this.R.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        h6.a(this.R);
        this.R.setContentDescription(LocaleController.getString(R.string.Undo));
        this.R.setOnClickListener(new f1(this, 2));
        this.Q.addView(this.R, f6.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.S = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.S.setScaleType(scaleType);
        this.S.setBackground(g6.f0(getThemedColor(i15), 1, -1));
        this.S.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        h6.a(this.S);
        this.S.setContentDescription(LocaleController.getString(R.string.Redo));
        this.S.setOnClickListener(new f1(this, 3));
        this.Q.addView(this.S, f6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.U.setClipToPadding(false);
        this.K.addView(this.U, f6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.V.setClipToPadding(false);
        this.U.addView(this.V, f6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.W = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.W.setClipChildren(false);
        this.W.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.W, f6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        this.V.addView(frameLayout4, f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.Y = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.k0(context));
        this.Y.setScaleType(scaleType);
        this.Y.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.Y.setBackground(new w1(g6.Z(getThemedColor(i14), g6.v(getThemedColor(i14), getThemedColor(i15)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.W.addView(this.Y, f6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        h6.a(this.Y);
        this.Y.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.Y.setOnClickListener(new f1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        frameLayout5.addView(frameLayout6, f6.e(-2, 44, 81));
        r1 r1Var = new r1(context, 0);
        this.Z = r1Var;
        r1Var.setClipToOutline(true);
        this.Z.setOutlineProvider(new eg.k1(19));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f48846a0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f48846a0.setOrientation(0);
        this.Z.addView(this.f48846a0);
        frameLayout6.addView(this.Z, f6.c(-1.0f, -1));
        tg tgVar = new tg(context, 24);
        this.X = tgVar;
        tgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.X.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.X.setBackground(g6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.X.j(rg.f32296e, false);
        this.f48846a0.addView(this.X, f6.q(38, 38, 16));
        h6.a(this.X);
        this.X.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.X.setOnClickListener(new f1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new org.telegram.ui.web.c(7, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new f1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new f1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new f1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f48850c0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f48850c0.setScaleType(scaleType);
        this.f48850c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f48850c0.setBackground(g6.Z(getThemedColor(i14), getThemedColor(i15), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f48846a0.addView(this.f48850c0, f6.t(38, 38, 16, 2, 0, 0, 0));
        h6.a(this.f48850c0);
        this.f48850c0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f48850c0.setOnClickListener(new f1(this, 9));
        this.W.addView(frameLayout5, f6.l(1.0f, 0, 44));
        ua1 ua1Var = new ua1(this, context, 19);
        this.f48851d0 = ua1Var;
        ua1Var.setOrientation(0);
        this.f48851d0.setClipToPadding(false);
        this.f48851d0.setClipChildren(false);
        this.f48851d0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.f48851d0, f6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f48868r0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f48868r0.setClipToPadding(false);
        this.f48868r0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.f48868r0, f6.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f48870s0 = imageView9;
        imageView9.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        xi0 animatedDrawable = this.f48870s0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.f48870s0.setScaleType(scaleType);
        this.f48870s0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), mode));
        this.f48870s0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f48868r0.addView(this.f48870s0, f6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f48851d0.addView(frameLayout8, f6.c(44.0f, -2));
        s1 s1Var2 = new s1(this, context);
        this.f48855f0 = s1Var2;
        s1Var2.setHorizontalScrollBarEnabled(false);
        this.f48855f0.setClipToOutline(true);
        this.f48855f0.setOutlineProvider(new eg.k1(20));
        frameLayout8.addView(this.f48855f0, f6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f48853e0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f48853e0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f48855f0.addView(this.f48853e0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        t1 t1Var = new t1(context, R.drawable.iv_quote, getResourceProvider());
        this.f48866q0 = t1Var;
        t1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f48866q0.setOnClickListener(new f1(this, 11));
        LinearLayout linearLayout5 = this.f48853e0;
        t1 t1Var2 = this.f48866q0;
        if (linearLayout5.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout5.addView(t1Var2, f6.t(38, 38, 16, i10, 0, 0, 0));
        t1 t1Var3 = new t1(context, R.drawable.iv_button, getResourceProvider());
        this.f48863n0 = t1Var3;
        t1Var3.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f48863n0.setOnClickListener(new f1(this, 12));
        LinearLayout linearLayout6 = this.f48853e0;
        t1 t1Var4 = this.f48863n0;
        if (linearLayout6.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout6.addView(t1Var4, f6.t(38, 38, 16, i11, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f48859j0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f48859j0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f48859j0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f48851d0.addView(this.f48859j0, f6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var5 = new t1(context, R.drawable.media_link_24, getResourceProvider());
        this.m0 = t1Var5;
        t1Var5.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.m0.setOnClickListener(new f1(this, 13));
        this.f48859j0.addView(this.m0, f6.q(38, 38, 16));
        t1 t1Var6 = new t1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f48864o0 = t1Var6;
        t1Var6.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f48864o0.setOnClickListener(new f1(this, 14));
        this.f48859j0.addView(this.f48864o0, f6.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f48860k0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f48860k0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f48860k0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f48851d0.addView(this.f48860k0, f6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var7 = new t1(context, R.drawable.iv_math, getResourceProvider());
        this.f48865p0 = t1Var7;
        t1Var7.d();
        arrayList.add(this.f48865p0);
        this.f48865p0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f48865p0.setOnClickListener(new f1(this, 15));
        this.f48860k0.addView(this.f48865p0, f6.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f48858i0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f48858i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f48858i0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i14))));
        this.f48851d0.addView(this.f48858i0, 0, f6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        t1 t1Var8 = new t1(context, 0, getResourceProvider());
        this.f48861l0 = t1Var8;
        t1Var8.setImageDrawable(new org.telegram.ui.Components.k0(context));
        this.f48861l0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f48861l0.setOnClickListener(new f1(this, 16));
        this.f48858i0.addView(this.f48861l0, f6.q(38, 38, 16));
        if (this.f48867r != null) {
            i12 = R.drawable.input_done;
        } else if (l0()) {
            i12 = R.drawable.input_schedule;
        } else {
            i12 = R.drawable.send_plane_24;
        }
        hp0 hp0Var = new hp0((Object) this, context, i12, getResourceProvider(), 3);
        this.f48872u0 = hp0Var;
        hp0Var.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(g6.Yd))));
        h6.a(this.f48872u0);
        this.W.addView(this.f48872u0, f6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f48872u0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f48872u0.setOnClickListener(new f1(this, 0));
        this.f48872u0.setOnLongClickListener(new bg.g0(this, 4));
        C0();
        this.K.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.K.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        A0();
        if (this.f48852e) {
            this.L.C2();
            this.f48852e = false;
        }
        q1 q1Var = this.K;
        this.fragmentView = q1Var;
        return q1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z10) {
        int i12;
        t1 t1Var = new t1(context, i10, getResourceProvider());
        if (z10) {
            t1Var.d();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i11));
        t1Var.setContentDescription(i0(i11));
        t1Var.setOnClickListener(new jh.y0(this, i11, 25));
        this.f48857h0.add(t1Var);
        LinearLayout linearLayout = this.f48853e0;
        if (linearLayout.getChildCount() > 0) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        linearLayout.addView(t1Var, f6.t(38, 38, 16, i12, 0, 0, 0));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            C0();
            A0();
        }
    }

    public final void e0(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M0, f9);
        this.L0 = ofFloat;
        ofFloat.addUpdateListener(new g1(this, 0));
        this.L0.setInterpolator(jr.h);
        this.L0.setDuration(250L);
        this.L0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        fz fzVar = this.f48875w0;
        if (fzVar != null && (layoutParams = (FrameLayout.LayoutParams) fzVar.getLayoutParams()) != null) {
            int j02 = j0();
            q1 q1Var = this.K;
            if (q1Var == null) {
                max = j0();
            } else {
                max = Math.max(j0(), ((q1Var.getMeasuredHeight() - this.K.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.P0);
            }
            int round = Math.round(((max - j02) * this.M0) + j02);
            if (layoutParams.height != round) {
                layoutParams.height = round;
                this.f48875w0.setLayoutParams(layoutParams);
            }
        }
    }

    public final void h0() {
        FrameLayout.LayoutParams layoutParams;
        fz fzVar = this.f48875w0;
        if (fzVar != null && (layoutParams = (FrameLayout.LayoutParams) fzVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.P0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.f48875w0.setLayoutParams(layoutParams);
            }
        }
        f0();
        int max = Math.max(Math.max(this.f48880z0, this.P0), this.Q0);
        this.L.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        p3 p3Var = this.L;
        int i12 = this.P0;
        int i13 = this.Q0;
        int i14 = this.f48880z0;
        p3Var.K3 = i12;
        p3Var.L3 = i13;
        p3Var.M3 = i14;
        int i15 = -max;
        this.U.setTranslationY(i15);
        this.N.setTranslationY(i15 + this.P0);
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
        p3 p3Var = this.L;
        if (p3Var != null && p3Var.f48650j3.y()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final int j0() {
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i10 = this.B0;
        } else {
            i10 = this.A0;
        }
        if (i10 <= 0) {
            return AndroidUtilities.dp(200.0f);
        }
        return i10;
    }

    public final void k0(boolean z10) {
        if (this.f48879y0) {
            this.f48879y0 = false;
            fz fzVar = this.f48875w0;
            if (fzVar != null) {
                fzVar.t(false);
                this.f48875w0.B();
            }
        }
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        this.M0 = 0.0f;
        this.N0 = null;
        fz fzVar2 = this.f48875w0;
        if (fzVar2 != null) {
            fzVar2.setTranslationY(0.0f);
            this.f48875w0.setVisibility(8);
        }
        if (this.f48877x0 || this.f48880z0 != 0) {
            this.f48877x0 = false;
            this.f48880z0 = 0;
            h0();
        }
        tg tgVar = this.X;
        if (tgVar != null) {
            tgVar.j(rg.f32296e, z10);
        }
    }

    public final boolean l0() {
        tn tnVar;
        if (this.f48867r == null && (tnVar = this.F) != null && tnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            p3 p3Var = this.L;
            if (u4.f(p3Var.f48646h3, p3Var.f48648i3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n0() {
        g3 h22 = this.L.h2();
        if (h22 != null) {
            TL_iv.RichMessage a2 = h22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(getParentActivity(), getResourceProvider());
            g0Var.n0(a2);
            g0Var.f28672g0 = new nh.b0(h22, 23);
            g0Var.show();
        }
    }

    public final void o0(int i10, int i11) {
        p3 p3Var = this.L;
        p3Var.Y3 = p3Var.Q2();
        ni niVar = new ni(getParentActivity(), this, false, false, true, getResourceProvider());
        niVar.V1 = new n1(this, niVar);
        niVar.f31005f0.setIncludeVideosInGallery(true);
        niVar.f31005f0.f0();
        niVar.J1(1, true);
        niVar.h1(i10);
        niVar.f31036p2 = new m1(this, niVar);
        niVar.U = new m1(this, niVar);
        niVar.T = new o1(this, niVar);
        niVar.r1();
        if (i11 != 0) {
            niVar.A1(i11);
        }
        niVar.setFocusable(true);
        niVar.show();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1 && i10 == 21) {
            if (intent != null && intent.getData() != null) {
                p3 p3Var = this.L;
                Uri data = intent.getData();
                if (data == null) {
                    p3Var.getClass();
                } else if (p3Var.getContext() != null) {
                    Utilities.globalQueue.postRunnable(new sf.o1(5, p3Var, data));
                }
            }
        } else if (i11 == -1 && (i10 == 1 || i10 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.L.e2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.f48879y0;
        if (z11) {
            if (z11) {
                this.f48879y0 = false;
                fz fzVar = this.f48875w0;
                if (fzVar != null) {
                    fzVar.t(false);
                    this.f48875w0.B();
                }
                e0(false);
                return false;
            }
        } else if (this.f48877x0) {
            k0(true);
            return false;
        } else if (!this.L.F2()) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f9;
        if (!z10 && !this.R0) {
            q0();
            this.R0 = true;
        }
        if (!AndroidUtilities.isTablet() && this.f48869s != null && this.v != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            sg.f fVar = this.f48869s;
            this.f48876x = fVar.f48052f;
            fVar.f48051e = false;
            fVar.invalidate();
            this.v.setAlpha(0.0f);
            this.v.f26204v1.setVisibility(4);
            v0();
            float f10 = 1.0f;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            this.E = f9;
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
            this.A = true;
            this.K.invalidate();
            ofFloat.addUpdateListener(new g1(this, 1));
            ofFloat.addListener(new ok0(22, this, runnable));
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
            animatorSet.setInterpolator(jr.h);
            this.K.post(new it0(animatorSet, 4));
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
        ph.s1 s1Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.R0) {
            q0();
            this.R0 = true;
        }
        k1 k1Var = this.J0;
        if (k1Var != null) {
            this.J0 = null;
            AndroidUtilities.runOnUIThread(k1Var);
        }
        ki0 ki0Var = this.K0;
        if (ki0Var != null) {
            ki0Var.i();
            this.K0 = null;
        }
        p3 p3Var = this.L;
        if (p3Var != null) {
            p3Var.G2();
        }
        m.s3 s3Var = this.f48873v0;
        if (s3Var != null) {
            s3Var.c();
        }
        super.onFragmentDestroy();
        fz fzVar = this.f48875w0;
        if (fzVar != null) {
            fzVar.D();
        }
        q1 q1Var = this.K;
        if (q1Var != null && (s1Var = this.D0) != null) {
            q1Var.f29257r.remove(s1Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.P0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.P0;
        this.N.setLayoutParams(layoutParams);
        h0();
    }

    @Override
    public final r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        boolean z10;
        j70 j70Var;
        i0.b f9 = m1Var.f46843a.f(3);
        int i10 = m1Var.f46843a.f(8).d;
        this.Q0 = i10;
        int i11 = i10 - f9.d;
        boolean z11 = this.C0;
        if (i11 > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C0 = z10;
        if (z10 && i11 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.B0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.B0).commit();
            } else {
                this.A0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.A0).commit();
            }
        }
        if (this.C0 && !z11 && this.f48877x0 && !this.f48879y0) {
            k0(false);
        }
        if (!this.C0 && z11 && (j70Var = this.f48871t0) != null) {
            j70Var.u();
            this.f48871t0 = null;
        }
        onInsets(f9.f8186a, f9.f8187b, f9.f8188c, f9.d);
        return r0.m1.f46842b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        p3 p3Var;
        int i10;
        p3 p3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.f48849c) >= 0 && (p3Var2 = this.L) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f48849c = -1;
            if (!p3Var2.Y1(i10, i11)) {
                p3Var2.post(new j2(p3Var2, i10, i11, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f48847b != null || this.f48854f != null) && (p3Var = this.L) != null && !p3Var.a3()) {
                p3Var.post(new b(p3Var, 5));
            }
        }
    }

    public final boolean q0() {
        TL_iv.RichMessage j22;
        Runnable runnable;
        if (this.F == null || this.f48867r != null || !this.L.r2()) {
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
        dk dkVar = this.F.U;
        if (j22 != null && !this.I) {
            p3 p3Var = this.L;
            if (p3Var.k3() && !u4.f(p3Var.f48646h3, p3Var.f48648i3) && dkVar != null) {
                SpannableStringBuilder k9 = u4.k(this.L.f48646h3);
                tn tnVar = dkVar.K2;
                if (dkVar.A0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k9);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, dkVar.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                if (y5VarArr != null) {
                    for (y5 y5Var : y5VarArr) {
                        y5Var.applyFontMetrics(dkVar.A0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.p5.g());
                    }
                }
                qi0.a(spannableStringBuilder);
                if (tnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(dkVar.M).saveDraft(tnVar.a(), tnVar.B7(tnVar.f42856j5), charSequenceArr[0], MediaDataController.getInstance(dkVar.M).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                dkVar.setRichDraftPreview(null);
                if (dkVar.A0.getText() != null) {
                    dkVar.A0.getText().clear();
                }
                dkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.F.a();
        tn tnVar2 = this.F;
        mediaDataController.saveDraft(a2, tnVar2.B7(tnVar2.f42856j5), "", null, null, null, null, 0L, false, false, j22);
        TL_iv.RichMessage richMessage = j22;
        if (dkVar == null) {
            return true;
        }
        dkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            p3 p3Var = this.L;
            Objects.requireNonNull(p3Var);
            p0(parentActivity, new b(p3Var, 0), new e1(this, 4), getResourceProvider());
        } else if (l0()) {
            org.telegram.ui.Components.c5.M(getParentActivity(), this.F.a(), new org.telegram.ui.Components.n(this, 19), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    public final void s0(final int i10, final int i11, final boolean z10) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            p3 p3Var = this.L;
            Objects.requireNonNull(p3Var);
            p0(parentActivity, new b(p3Var, 0), new e1(this, 4), getResourceProvider());
        } else if (this.F != null && this.L.k3() && !this.L.m3()) {
            if (!this.L.M3()) {
                B0();
            } else if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
                dk dkVar = this.F.U;
                if (dkVar != null) {
                    this.I = true;
                    Runnable runnable = this.G;
                    if (runnable != null) {
                        runnable.run();
                    }
                    dkVar.R0(u4.k(this.L.f48646h3), z10, i10, i11);
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
                final ArrayList a2 = t4.a(this.currentAccount, Z2);
                final long a10 = this.F.a();
                tn tnVar = this.F;
                final MessageObject messageObject = tnVar.f42856j5;
                final MessageObject messageObject2 = tnVar.T3;
                final long N8 = tnVar.N8();
                final SendMessageChatArguments C8 = this.F.C8();
                final MessageObject messageObject3 = this.f48867r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        x1.X(x1.this, messageObject3, Z2, B2, y22, a2, a10, messageObject, messageObject2, z10, i10, i11, C8, N8);
                    }
                };
                Runnable runnable2 = this.G;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (i10 != 0 && messageObject3 == null) {
                    this.J0 = r02;
                    finishFragment();
                    return;
                }
                r02.run();
                finishFragment();
            }
        }
    }

    public final void t0(boolean z10) {
        ArrayList arrayList = this.f48857h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t1 t1Var = (t1) obj;
            if (((Integer) t1Var.getTag()).intValue() == 1) {
                t1Var.setEnabled(z10);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        t1 t1Var = this.m0;
        if (t1Var != null) {
            t1Var.setEnabled(z10);
        }
        t1 t1Var2 = this.f48863n0;
        if (t1Var2 != null) {
            t1Var2.setEnabled(z11);
        }
        t1 t1Var3 = this.f48864o0;
        if (t1Var3 != null) {
            t1Var3.setEnabled(z10);
        }
        t1 t1Var4 = this.f48865p0;
        if (t1Var4 != null) {
            t1Var4.setEnabled(z10);
        }
    }

    public final void v0() {
        sg.f fVar = this.f48869s;
        int[] iArr = this.B;
        fVar.getLocationInWindow(iArr);
        if (this.f48878y == null) {
            this.f48878y = new RectF();
        }
        RectF rectF = new RectF(this.f48876x.getBounds());
        this.f48878y = rectF;
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

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: th.x1.w0():void");
    }

    public final void x0(int i10, boolean z10) {
        int i11;
        float f9;
        float f10;
        float f11;
        float dp;
        int i12;
        float f12;
        float f13;
        float f14;
        float dp2;
        float f15;
        float f16;
        float f17;
        float f18;
        float dp3;
        float f19;
        float f20;
        float f21;
        float dp4;
        float f22;
        if (this.G0 == i10) {
            return;
        }
        this.G0 = i10;
        int i13 = 0;
        float f23 = 0.0f;
        float f24 = 0.8f;
        if (z10) {
            this.W.setVisibility(0);
            ViewPropertyAnimator animate = this.W.animate();
            if (this.G0 == 0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f16);
            if (this.G0 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f17);
            if (this.G0 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
            if (this.G0 == 0) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(dp3).setDuration(420L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).withEndAction(new e1(this, 1)).start();
            this.f48851d0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f48851d0.animate();
            if (this.G0 == 1) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f19);
            if (this.G0 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f20);
            if (this.G0 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f21);
            if (this.G0 == 1) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(30.0f);
            }
            scaleY2.translationY(dp4).setDuration(420L).setInterpolator(jrVar).withEndAction(new e1(this, 2)).start();
            this.f48868r0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f48868r0.animate();
            if (this.G0 == 2) {
                f23 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f23);
            if (this.G0 == 2) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f22);
            if (this.G0 == 2) {
                f24 = 1.0f;
            }
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(jrVar).withEndAction(new e1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.W;
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.W;
        if (i10 == 0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        linearLayout2.setAlpha(f9);
        LinearLayout linearLayout3 = this.W;
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        linearLayout3.setScaleX(f10);
        LinearLayout linearLayout4 = this.W;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout4.setScaleY(f11);
        LinearLayout linearLayout5 = this.W;
        if (i10 == 0) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(30.0f);
        }
        linearLayout5.setTranslationY(dp);
        ua1 ua1Var = this.f48851d0;
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ua1Var.setVisibility(i12);
        ua1 ua1Var2 = this.f48851d0;
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        ua1Var2.setAlpha(f12);
        ua1 ua1Var3 = this.f48851d0;
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        ua1Var3.setScaleX(f13);
        ua1 ua1Var4 = this.f48851d0;
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        ua1Var4.setScaleY(f14);
        ua1 ua1Var5 = this.f48851d0;
        if (i10 == 1) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(30.0f);
        }
        ua1Var5.setTranslationY(dp2);
        FrameLayout frameLayout = this.f48868r0;
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        FrameLayout frameLayout2 = this.f48868r0;
        if (i10 == 2) {
            f23 = 1.0f;
        }
        frameLayout2.setAlpha(f23);
        FrameLayout frameLayout3 = this.f48868r0;
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        frameLayout3.setScaleX(f15);
        FrameLayout frameLayout4 = this.f48868r0;
        if (i10 == 2) {
            f24 = 1.0f;
        }
        frameLayout4.setScaleY(f24);
    }

    public final void y0() {
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
        k9 textSelectionHelper = this.L.getTextSelectionHelper();
        ArrayList arrayList = this.f48857h0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.y()) {
            t1 t1Var = this.f48866q0;
            boolean z19 = false;
            if (t1Var != null) {
                p3 p3Var = this.L;
                int[] B4 = p3Var.B4();
                if (B4 != null && p3Var.H3(B4[0], B4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var.setSelected(z18);
            }
            if (this.L.L3()) {
                k9 textSelectionHelper2 = this.L.getTextSelectionHelper();
                int i10 = textSelectionHelper2.f24607u0;
                int i11 = textSelectionHelper2.f24608v0;
                int i12 = textSelectionHelper2.f24611y0;
                int i13 = textSelectionHelper2.f24609w0;
                int i14 = textSelectionHelper2.f24612z0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    t1 t1Var2 = (t1) obj;
                    t1Var2.setSelected(this.L.K3(((Integer) t1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
                }
                if (i11 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    d1Var = this.L.N4(i10, i11);
                } else {
                    d1Var = null;
                }
                int max4 = Math.max(0, Math.min(i13, i14));
                if (d1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i13, i14), d1Var.length()));
                }
                t1 t1Var3 = this.m0;
                if (t1Var3 != null) {
                    if (d1Var != null && max4 < max3 && v5.h(d1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    t1Var3.setSelected(z17);
                }
                t1 t1Var4 = this.f48864o0;
                if (t1Var4 != null) {
                    if (d1Var != null && max4 < max3 && v5.g(d1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    t1Var4.setSelected(z19);
                }
                t0(true);
                u0(z16, this.L.l2());
            } else if (this.L.w3()) {
                k9 textSelectionHelper3 = this.L.getTextSelectionHelper();
                d1 s22 = this.L.s2(textSelectionHelper3.f24607u0);
                int i16 = textSelectionHelper3.f24609w0;
                int i17 = textSelectionHelper3.f24612z0;
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
                    if (s22 != null && max < max2 && v5.h(s22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    t1Var6.setSelected(z14);
                }
                t1 t1Var7 = this.f48864o0;
                if (t1Var7 != null) {
                    if (s22 != null && max < max2 && v5.g(s22.getText(), max, max2)) {
                        z19 = true;
                    }
                    t1Var7.setSelected(z19);
                }
                t0(true);
                u0(true, this.L.l2());
            } else {
                int i19 = textSelectionHelper.f24607u0;
                int i20 = textSelectionHelper.f24610x0;
                int i21 = textSelectionHelper.f24609w0;
                int i22 = textSelectionHelper.f24612z0;
                if (i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.L.f48655l4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i23 = 0;
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    t1 t1Var8 = (t1) arrayList.get(i23);
                    int intValue2 = ((Integer) t1Var8.getTag()).intValue();
                    if (z10 && this.L.J3(intValue2, i19, i21, i20, i22)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    t1Var8.setSelected(z13);
                    i23 = i24;
                }
                t0(!this.L.I3());
                t1 t1Var9 = this.m0;
                if (t1Var9 != null) {
                    if (z10) {
                        Editable H4 = this.L.H4(i19, i21, i20, i22);
                        if (H4 == null) {
                            h = false;
                        } else {
                            h = v5.h(H4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (h) {
                            z12 = true;
                            t1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    t1Var9.setSelected(z12);
                }
                t1 t1Var10 = this.f48864o0;
                if (t1Var10 != null) {
                    if (z10) {
                        Editable H42 = this.L.H4(i19, i21, i20, i22);
                        if (H42 == null) {
                            g10 = false;
                        } else {
                            g10 = v5.g(H42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (g10) {
                            z11 = true;
                            t1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    t1Var10.setSelected(z11);
                }
                if (z10 && i19 == i20) {
                    z19 = true;
                }
                u0(z19, this.L.l2());
            }
        }
    }

    public final void z0() {
        boolean z10;
        float f9;
        boolean r22 = this.L.r2();
        b2 b2Var = this.L.F3;
        if (b2Var != null && !b2Var.f48364c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.R;
        float f10 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(r22);
            ImageView imageView2 = this.R;
            if (r22) {
                f9 = 1.0f;
            } else {
                f9 = 0.35f;
            }
            imageView2.setAlpha(f9);
        }
        ImageView imageView3 = this.S;
        if (imageView3 != null) {
            imageView3.setEnabled(z10);
            ImageView imageView4 = this.S;
            if (z10) {
                f10 = 1.0f;
            }
            imageView4.setAlpha(f10);
        }
    }

    public x1(String str) {
        super(null);
        this.f48849c = -1;
        this.d = -1;
        this.f48874w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f48848b0 = new ArrayList();
        this.f48856g0 = Integer.MAX_VALUE;
        this.f48857h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f48854f = str;
    }

    public x1(TL_iv.RichMessage richMessage) {
        super(null);
        this.f48849c = -1;
        this.d = -1;
        this.f48874w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f48848b0 = new ArrayList();
        this.f48856g0 = Integer.MAX_VALUE;
        this.f48857h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f48847b = richMessage;
    }
}
