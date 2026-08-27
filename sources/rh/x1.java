package rh;

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
import h7.b6;
import h7.z5;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import lh.n6;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.ck;
import org.telegram.ui.lt0;
import org.telegram.ui.ni0;
import org.telegram.ui.ra1;
import org.telegram.ui.rn;
import org.telegram.ui.zh1;

public final class x1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int A0;
    public final int[] B;
    public int B0;
    public int[] C;
    public boolean C0;
    public int[] D;
    public nh.a2 D0;
    public float E;
    public int E0;
    public rn F;
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
    public ni0 K0;
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
    public mg X;
    public ImageView Y;
    public r1 Z;

    public final CharSequence f47547a;

    public LinearLayout f47548a0;

    public final TL_iv.RichMessage f47549b;

    public final ArrayList f47550b0;

    public int f47551c;

    public ImageView f47552c0;
    public int d;

    public ra1 f47553d0;

    public boolean f47554e;

    public LinearLayout f47555e0;

    public final String f47556f;

    public s1 f47557f0;

    public int f47558g0;
    public CharSequence h;

    public final ArrayList f47559h0;

    public LinearLayout f47560i0;

    public LinearLayout f47561j0;

    public LinearLayout f47562k0;

    public t1 f47563l0;
    public t1 m0;

    public CharSequence f47564n;

    public t1 f47565n0;

    public t1 f47566o0;

    public t1 f47567p0;

    public t1 f47568q0;

    public MessageObject f47569r;

    public FrameLayout f47570r0;

    public qg.g f47571s;

    public ri0 f47572s0;

    public b70 f47573t0;

    public wo0 f47574u0;
    public ck v;

    public m.t3 f47575v0;

    public final Rect f47576w;

    public yy f47577w0;

    public lg.d f47578x;

    public boolean f47579x0;

    public RectF f47580y;

    public boolean f47581y0;

    public int f47582z0;

    public x1(Editable editable) {
        super(null);
        this.f47551c = -1;
        this.d = -1;
        this.f47576w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f47550b0 = new ArrayList();
        this.f47558g0 = Integer.MAX_VALUE;
        this.f47559h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f47547a = editable;
    }

    public static void U(x1 x1Var) {
        d3 d3Var = x1Var.L.f47352j3;
        if (d3Var != null && d3Var.y()) {
            x1Var.n0();
            return;
        }
        Activity parentActivity = x1Var.getParentActivity();
        new v(x1Var.currentAccount, parentActivity, new n6(x1Var, 20), x1Var.getResourceProvider()).show();
    }

    public static void V(x1 x1Var) {
        if (UserConfig.getInstance(x1Var.currentAccount).isPremium()) {
            return;
        }
        x1Var.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) x1Var, 43, true));
    }

    public static boolean W(x1 x1Var, View view) {
        rn rnVar = x1Var.F;
        if (rnVar != null && x1Var.f47569r == null && !rnVar.c() && x1Var.L.k3() && !x1Var.L.m3()) {
            if (!x1Var.L.M3()) {
                x1Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> arrayListZ2 = x1Var.L.Z2();
            if (!arrayListZ2.isEmpty()) {
                ni0 ni0Var = x1Var.K0;
                if (ni0Var != null) {
                    ni0Var.h(false);
                    x1Var.K0 = null;
                }
                ni0 ni0Var2 = new ni0(x1Var.getParentActivity(), x1Var.getResourceProvider());
                x1Var.K0 = ni0Var2;
                ni0Var2.setOnDismissListener(new ag.j0(x1Var, 14));
                long jA = x1Var.F.a();
                MessageObject messageObject = x1Var.F.f42095j5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22401id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(x1Var.currentAccount).getPeer(jA);
                tL_message.from_id = MessagesController.getInstance(x1Var.currentAccount).getPeer(UserConfig.getInstance(x1Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = arrayListZ2;
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
                x1Var.K0.q(org.telegram.messenger.y1.m(messageObject2));
                x1Var.f47574u0.setScaleX(1.0f);
                x1Var.f47574u0.setScaleY(1.0f);
                hg hgVarR = x1Var.K0.r(x1Var.f47574u0, true, new f1(x1Var, 10));
                if (hgVarR != null) {
                    hgVarR.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), x1Var.getThemedColor(g6.Oh))));
                    ni0 ni0Var3 = x1Var.K0;
                    int iDp = AndroidUtilities.dp(44.0f);
                    ni0Var3.f40853i0 = true;
                    ni0Var3.U = iDp;
                }
                b70 b70VarH = b70.H(x1Var, x1Var.f47574u0);
                boolean zIsUserSelf = UserObject.isUserSelf(x1Var.F.i());
                if (x1Var.F.D6()) {
                    b70VarH.c(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.web.c0(x1Var, jA, 2), false);
                    if (!zIsUserSelf && jA > 0) {
                        b70VarH.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new e1(x1Var, 5), false);
                    }
                }
                if (!zIsUserSelf) {
                    b70VarH.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new e1(x1Var, 6), false);
                }
                b70VarH.Y();
                x1Var.K0.p(b70VarH);
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
        b70 b70Var = x1Var.f47573t0;
        if (b70Var != null) {
            b70Var.u();
            x1Var.f47573t0 = null;
        }
        boolean z10 = (MessagesController.getInstance(x1Var.currentAccount).richEditorAllowed() || UserConfig.getInstance(x1Var.currentAccount).isPremium()) ? false : true;
        final a aVarQ2 = x1Var.L.Q2();
        final b70 b70VarI = b70.I(x1Var, view);
        b70VarI.Q = true;
        b70 b70VarJ = b70VarI.J();
        b70VarJ.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new gh.m3(b70VarI, 8), false);
        b70VarJ.k();
        final int i10 = 0;
        b70VarJ.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(x1Var) {

            public final x1 f47218b;

            {
                this.f47218b = x1Var;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading1());
                        b70VarI.u();
                        break;
                    case 1:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading2());
                        b70VarI.u();
                        break;
                    case 2:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading3());
                        b70VarI.u();
                        break;
                    case 3:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading4());
                        b70VarI.u();
                        break;
                    case 4:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading5());
                        b70VarI.u();
                        break;
                    default:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading6());
                        b70VarI.u();
                        break;
                }
            }
        });
        b70VarJ.y().f22911a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        b70VarJ.y().f22911a.setTextSize(1, SharedConfig.fontSize + 2);
        final int i11 = 1;
        b70VarJ.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(x1Var) {

            public final x1 f47218b;

            {
                this.f47218b = x1Var;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading1());
                        b70VarI.u();
                        break;
                    case 1:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading2());
                        b70VarI.u();
                        break;
                    case 2:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading3());
                        b70VarI.u();
                        break;
                    case 3:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading4());
                        b70VarI.u();
                        break;
                    case 4:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading5());
                        b70VarI.u();
                        break;
                    default:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading6());
                        b70VarI.u();
                        break;
                }
            }
        });
        b70VarJ.y().f22911a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        b70VarJ.y().f22911a.setTextSize(1, SharedConfig.fontSize + 1);
        final int i12 = 2;
        b70VarJ.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(x1Var) {

            public final x1 f47218b;

            {
                this.f47218b = x1Var;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading1());
                        b70VarI.u();
                        break;
                    case 1:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading2());
                        b70VarI.u();
                        break;
                    case 2:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading3());
                        b70VarI.u();
                        break;
                    case 3:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading4());
                        b70VarI.u();
                        break;
                    case 4:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading5());
                        b70VarI.u();
                        break;
                    default:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading6());
                        b70VarI.u();
                        break;
                }
            }
        });
        b70VarJ.y().f22911a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        b70VarJ.y().f22911a.setTextSize(1, SharedConfig.fontSize);
        final int i13 = 3;
        b70VarJ.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(x1Var) {

            public final x1 f47218b;

            {
                this.f47218b = x1Var;
            }

            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading1());
                        b70VarI.u();
                        break;
                    case 1:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading2());
                        b70VarI.u();
                        break;
                    case 2:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading3());
                        b70VarI.u();
                        break;
                    case 3:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading4());
                        b70VarI.u();
                        break;
                    case 4:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading5());
                        b70VarI.u();
                        break;
                    default:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading6());
                        b70VarI.u();
                        break;
                }
            }
        });
        b70VarJ.y().f22911a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        b70VarJ.y().f22911a.setTextSize(1, SharedConfig.fontSize - 1);
        final int i14 = 4;
        b70VarJ.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(x1Var) {

            public final x1 f47218b;

            {
                this.f47218b = x1Var;
            }

            @Override
            public final void run() {
                switch (i14) {
                    case 0:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading1());
                        b70VarI.u();
                        break;
                    case 1:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading2());
                        b70VarI.u();
                        break;
                    case 2:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading3());
                        b70VarI.u();
                        break;
                    case 3:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading4());
                        b70VarI.u();
                        break;
                    case 4:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading5());
                        b70VarI.u();
                        break;
                    default:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading6());
                        b70VarI.u();
                        break;
                }
            }
        });
        b70VarJ.y().f22911a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        b70VarJ.y().f22911a.setTextSize(1, SharedConfig.fontSize - 2);
        final int i15 = 5;
        b70VarJ.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(x1Var) {

            public final x1 f47218b;

            {
                this.f47218b = x1Var;
            }

            @Override
            public final void run() {
                switch (i15) {
                    case 0:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading1());
                        b70VarI.u();
                        break;
                    case 1:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading2());
                        b70VarI.u();
                        break;
                    case 2:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading3());
                        b70VarI.u();
                        break;
                    case 3:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading4());
                        b70VarI.u();
                        break;
                    case 4:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading5());
                        b70VarI.u();
                        break;
                    default:
                        this.f47218b.L.V4(aVarQ2, new TL_iv.pageBlockHeading6());
                        b70VarI.u();
                        break;
                }
            }
        });
        b70VarJ.y().f22911a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        b70VarJ.y().f22911a.setTextSize(1, SharedConfig.fontSize - 3);
        boolean z11 = aVarQ2 != null && p3.C3(aVarQ2.f47028b);
        v1 v1Var = new v1(context, R.drawable.iv_h);
        v1Var.a(z10);
        int i16 = g6.G8;
        v1Var.d = i16;
        b70VarI.j(z11, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new gh.f3(b70VarI, b70VarJ, 11));
        b70VarI.y().f22911a.setTypeface(AndroidUtilities.bold());
        b70VarI.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        b70VarI.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new i1(x1Var, aVarQ2, 3));
        b70VarI.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new i1(x1Var, aVarQ2, 4));
        boolean z12 = aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockPullquote);
        v1 v1Var2 = new v1(context, R.drawable.iv_pullquote);
        v1Var2.a(z10);
        v1Var2.d = i16;
        b70VarI.j(z12, 0, v1Var2, LocaleController.getString(R.string.ArticlePullquote), new i1(x1Var, aVarQ2, 0));
        b70VarI.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        b70VarI.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new i1(x1Var, aVarQ2, 1));
        boolean z13 = aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockFooter);
        v1 v1Var3 = new v1(context, R.drawable.iv_footer);
        v1Var3.a(z10);
        v1Var3.d = i16;
        b70VarI.j(z13, 0, v1Var3, LocaleController.getString(R.string.ArticleFooter), new i1(x1Var, aVarQ2, 2));
        b70VarI.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        b70VarI.Z();
        x1Var.f47573t0 = b70VarI;
    }

    public static void Z(x1 x1Var, boolean z10, boolean z11) {
        if (x1Var.F0 == z10 && z11) {
            return;
        }
        x1Var.F0 = z10;
        float f10 = z10 ? 1.15f : 1.0f;
        if (z11) {
            x1Var.f47572s0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(er.h).start();
        } else {
            x1Var.f47572s0.animate().cancel();
            x1Var.f47572s0.setScaleX(f10);
            x1Var.f47572s0.setScaleY(f10);
        }
        x1Var.f47572s0.setColorFilter(new PorterDuffColorFilter(x1Var.getThemedColor(z10 ? g6.f23284q7 : g6.G6), PorterDuff.Mode.SRC_IN));
        oi0 animatedDrawable = x1Var.f47572s0.getAnimatedDrawable();
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

    public static d1 a0(x1 x1Var) {
        d1 focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            d1 d1Var = x1Var.N0;
            return d1Var != null ? d1Var : x1Var.L.P2();
        }
        x1Var.N0 = focusedEditTextOrNull;
        x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int b0(x1 x1Var, d1 d1Var) {
        return (d1Var != x1Var.N0 || x1Var.L.getFocusedEditTextOrNull() == d1Var) ? Math.max(0, d1Var.getSelectionEnd()) : Math.min(x1Var.O0, d1Var.length());
    }

    public static String g0(int i10) {
        if (i10 == 1) {
            return LocaleController.getString(R.string.AccDescrIVTextStyle);
        }
        if (i10 == 2) {
            return LocaleController.getString(R.string.AccDescrIVListStyle);
        }
        if (i10 == 4) {
            return LocaleController.getString(R.string.AccDescrIVTable);
        }
        if (i10 == 7) {
            return LocaleController.getString(R.string.AccDescrIVFormula);
        }
        if (i10 != 9) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrIVDetails);
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
        final int i10 = 0;
        final org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3VarO.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(g6.K(AndroidUtilities.dp(80.0f), g6.v0(g6.Oh, c6Var)));
        linearLayout.addView(imageView, z5.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        TextView textViewI = pa.i(linearLayout, textView, z5.t(-1, -2, 49, 25, 16, 25, 0), context);
        textViewI.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        textViewI.setTextSize(1, 14.0f);
        textViewI.setGravity(17);
        textViewI.setTextColor(g6.v0(i11, c6Var));
        linearLayout.addView(textViewI, z5.t(-1, -2, 49, 25, 11, 25, 0));
        lh.d dVarG = rl.g(24, context, c6Var, true);
        dVarG.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(dVarG, z5.t(-1, 48, 49, 14, 31, 14, 0));
        lh.d dVarG2 = rl.g(24, context, c6Var, false);
        dVarG2.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(dVarG2, z5.t(-1, 48, 49, 14, 2, 14, 6));
        e3VarO.show();
        dVarG.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e3VarO.dismiss();
                        runnable2.run();
                        break;
                    default:
                        e3VarO.dismiss();
                        runnable2.run();
                        break;
                }
            }
        });
        final int i12 = 1;
        dVarG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        e3VarO.dismiss();
                        runnable.run();
                        break;
                    default:
                        e3VarO.dismiss();
                        runnable.run();
                        break;
                }
            }
        });
    }

    public final void A0() {
        int i10 = 0;
        boolean z10 = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t1) obj).setPremiumLocked(z10);
        }
    }

    public final void B0() {
        if (this.f47574u0 == null) {
            return;
        }
        boolean zM3 = this.L.M3();
        this.f47574u0.setEnabled(zM3);
        this.f47574u0.animate().alpha(zM3 ? 1.0f : 0.5f).setDuration(150L).start();
    }

    public final void C0() {
        wo0 wo0Var = this.f47574u0;
        if (wo0Var == null) {
            return;
        }
        wo0Var.setLocked(m0());
    }

    public final t1 c0(int i10, int i11, boolean z10) {
        t1 t1Var = new t1(this.f47548a0.getContext(), i10, getResourceProvider());
        if (z10) {
            t1Var.e();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i11));
        t1Var.setContentDescription(g0(i11));
        this.f47550b0.add(t1Var);
        LinearLayout linearLayout = this.f47548a0;
        linearLayout.addView(t1Var, z5.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return t1Var;
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
        nh.a2 a2Var = new nh.a2(this, 1);
        this.D0 = a2Var;
        this.K.f35387r.add(a2Var);
        p3 p3Var = new p3(context, this.currentAccount, getResourceProvider(), new m5.o(this, 19));
        this.L = p3Var;
        p3Var.setFileRefParentObject(this.f47569r);
        this.K.addView(this.L, z5.e(-1, -1, 119));
        this.K.addView(this.L.getOverlayView(), z5.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f47549b;
        if (richMessage != null) {
            p3 p3Var2 = this.L;
            ArrayList arrayList2 = p3Var2.f47348h3;
            p3Var2.f47346g3 = richMessage;
            p3.W2(arrayList2, richMessage.blocks, p3Var2.f47350i3);
            p3Var2.V3();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                p3Var2.v4((a) arrayList2.get(i10));
            }
            p3Var2.U2.N(false);
        } else {
            String str = this.f47556f;
            if (str != null) {
                p3 p3Var3 = this.L;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f47564n;
                HashMap map = p3Var3.f47350i3;
                ArrayList arrayList3 = p3Var3.f47348h3;
                if (!TextUtils.isEmpty(charSequence)) {
                    p3.W2(arrayList3, u4.b(charSequence), map);
                }
                arrayList3.addAll(p3Var3.w4(v3.z(str, map)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    p3.W2(arrayList3, u4.b(charSequence2), map);
                }
                p3Var3.V3();
                p3Var3.U2.N(false);
            } else {
                CharSequence charSequence3 = this.f47547a;
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
        int i11 = g6.f23053d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i11), g6.l1(0.0f, getThemedColor(i11))}));
        this.K.addView(this.M, z5.e(-1, 68, 55));
        View view2 = new View(context);
        this.N = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{g6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11)}));
        this.K.addView(this.N, z5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setClipChildren(false);
        this.O.setClipToPadding(false);
        this.K.addView(this.O, z5.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.P;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.P;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = g6.f23144i6;
        imageView3.setBackground(new w1(g6.Z(themedColor, g6.v(themedColor2, getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.P;
        int i13 = g6.G6;
        int themedColor3 = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        b6.a(this.P);
        this.P.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.P.setOnClickListener(new f1(this, 1));
        this.O.addView(this.P, z5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(0);
        this.Q.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.O.addView(this.Q, z5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.R = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.R.setScaleType(scaleType);
        this.R.setBackground(g6.f0(getThemedColor(i12), 1, -1));
        this.R.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        b6.a(this.R);
        this.R.setContentDescription(LocaleController.getString(R.string.Undo));
        this.R.setOnClickListener(new f1(this, 2));
        this.Q.addView(this.R, z5.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.S = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.S.setScaleType(scaleType);
        this.S.setBackground(g6.f0(getThemedColor(i12), 1, -1));
        this.S.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        b6.a(this.S);
        this.S.setContentDescription(LocaleController.getString(R.string.Redo));
        this.S.setOnClickListener(new f1(this, 3));
        this.Q.addView(this.S, z5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.U.setClipToPadding(false);
        this.K.addView(this.U, z5.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.V.setClipToPadding(false);
        this.U.addView(this.V, z5.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.W = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.W.setClipChildren(false);
        this.W.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.W, z5.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        this.V.addView(frameLayout4, z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.Y = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.Y.setScaleType(scaleType);
        this.Y.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.Y.setBackground(new w1(g6.Z(getThemedColor(i11), g6.v(getThemedColor(i11), getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.W.addView(this.Y, z5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        b6.a(this.Y);
        this.Y.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.Y.setOnClickListener(new f1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        frameLayout5.addView(frameLayout6, z5.e(-2, 44, 81));
        r1 r1Var = new r1(context, 0);
        this.Z = r1Var;
        r1Var.setClipToOutline(true);
        this.Z.setOutlineProvider(new cg.l1(19));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f47548a0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f47548a0.setOrientation(0);
        this.Z.addView(this.f47548a0);
        frameLayout6.addView(this.Z, z5.c(-1.0f, -1));
        mg mgVar = new mg(context, 24);
        this.X = mgVar;
        mgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.X.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.X.setBackground(g6.Z(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.X.j(kg.f30100e, false);
        this.f47548a0.addView(this.X, z5.q(38, 38, 16));
        b6.a(this.X);
        this.X.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.X.setOnClickListener(new f1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new org.telegram.ui.web.c(4, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new f1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new f1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new f1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f47552c0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.f47552c0.setScaleType(scaleType);
        this.f47552c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.f47552c0.setBackground(g6.Z(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.f47548a0.addView(this.f47552c0, z5.t(38, 38, 16, 2, 0, 0, 0));
        b6.a(this.f47552c0);
        this.f47552c0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.f47552c0.setOnClickListener(new f1(this, 9));
        this.W.addView(frameLayout5, z5.l(1.0f, 0, 44));
        ra1 ra1Var = new ra1(this, context, 19);
        this.f47553d0 = ra1Var;
        ra1Var.setOrientation(0);
        this.f47553d0.setClipToPadding(false);
        this.f47553d0.setClipChildren(false);
        this.f47553d0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.f47553d0, z5.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f47570r0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f47570r0.setClipToPadding(false);
        this.f47570r0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.f47570r0, z5.e(80, 60, 81));
        ri0 ri0Var = new ri0(context);
        this.f47572s0 = ri0Var;
        ri0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        oi0 animatedDrawable = this.f47572s0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.f47572s0.setScaleType(scaleType);
        this.f47572s0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.f47572s0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.f47570r0.addView(this.f47572s0, z5.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.f47553d0.addView(frameLayout8, z5.c(44.0f, -2));
        s1 s1Var = new s1(this, context);
        this.f47557f0 = s1Var;
        s1Var.setHorizontalScrollBarEnabled(false);
        this.f47557f0.setClipToOutline(true);
        this.f47557f0.setOutlineProvider(new cg.l1(20));
        frameLayout8.addView(this.f47557f0, z5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f47555e0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f47555e0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f47557f0.addView(this.f47555e0, new FrameLayout.LayoutParams(-2, -1));
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
        this.f47568q0 = t1Var;
        t1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.f47568q0.setOnClickListener(new f1(this, 11));
        LinearLayout linearLayout5 = this.f47555e0;
        linearLayout5.addView(this.f47568q0, z5.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        t1 t1Var2 = new t1(context, R.drawable.iv_button, getResourceProvider());
        this.f47565n0 = t1Var2;
        t1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.f47565n0.setOnClickListener(new f1(this, 12));
        LinearLayout linearLayout6 = this.f47555e0;
        linearLayout6.addView(this.f47565n0, z5.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f47561j0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f47561j0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f47561j0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.f47553d0.addView(this.f47561j0, z5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var3 = new t1(context, R.drawable.media_link_24, getResourceProvider());
        this.m0 = t1Var3;
        t1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.m0.setOnClickListener(new f1(this, 13));
        this.f47561j0.addView(this.m0, z5.q(38, 38, 16));
        t1 t1Var4 = new t1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.f47566o0 = t1Var4;
        t1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.f47566o0.setOnClickListener(new f1(this, 14));
        this.f47561j0.addView(this.f47566o0, z5.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f47562k0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f47562k0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f47562k0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.f47553d0.addView(this.f47562k0, z5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var5 = new t1(context, R.drawable.iv_math, getResourceProvider());
        this.f47567p0 = t1Var5;
        t1Var5.e();
        arrayList.add(this.f47567p0);
        this.f47567p0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.f47567p0.setOnClickListener(new f1(this, 15));
        this.f47562k0.addView(this.f47567p0, z5.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f47560i0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f47560i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f47560i0.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.f47553d0.addView(this.f47560i0, 0, z5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        t1 t1Var6 = new t1(context, 0, getResourceProvider());
        this.f47563l0 = t1Var6;
        t1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.f47563l0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.f47563l0.setOnClickListener(new f1(this, 16));
        this.f47560i0.addView(this.f47563l0, z5.q(38, 38, 16));
        wo0 wo0Var = new wo0((Object) this, context, this.f47569r != null ? R.drawable.input_done : l0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider(), 3);
        this.f47574u0 = wo0Var;
        wo0Var.setBackground(new w1(g6.b0(AndroidUtilities.dp(22.0f), getThemedColor(g6.Yd))));
        b6.a(this.f47574u0);
        this.W.addView(this.f47574u0, z5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f47574u0.setContentDescription(LocaleController.getString(R.string.Send));
        this.f47574u0.setOnClickListener(new f1(this, 0));
        this.f47574u0.setOnLongClickListener(new lh.b5(this, 3));
        C0();
        this.K.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.K.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        A0();
        if (this.f47554e) {
            this.L.C2();
            this.f47554e = false;
        }
        q1 q1Var = this.K;
        this.fragmentView = q1Var;
        return q1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z10) {
        t1 t1Var = new t1(context, i10, getResourceProvider());
        if (z10) {
            t1Var.e();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i11));
        t1Var.setContentDescription(i0(i11));
        t1Var.setOnClickListener(new hh.z0(this, i11, 25));
        this.f47559h0.add(t1Var);
        LinearLayout linearLayout = this.f47555e0;
        linearLayout.addView(t1Var, z5.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            C0();
            A0();
        }
    }

    public final void e0(boolean z10) {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.M0, z10 ? 1.0f : 0.0f);
        this.L0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g1(this, 0));
        this.L0.setInterpolator(er.h);
        this.L0.setDuration(250L);
        this.L0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        yy yyVar = this.f47577w0;
        if (yyVar == null || (layoutParams = (FrameLayout.LayoutParams) yyVar.getLayoutParams()) == null) {
            return;
        }
        int iJ0 = j0();
        q1 q1Var = this.K;
        int iRound = Math.round((((q1Var == null ? j0() : Math.max(j0(), ((q1Var.getMeasuredHeight() - this.K.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.P0)) - iJ0) * this.M0) + iJ0);
        if (layoutParams.height != iRound) {
            layoutParams.height = iRound;
            this.f47577w0.setLayoutParams(layoutParams);
        }
    }

    public final void h0() {
        FrameLayout.LayoutParams layoutParams;
        yy yyVar = this.f47577w0;
        if (yyVar != null && (layoutParams = (FrameLayout.LayoutParams) yyVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.P0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.f47577w0.setLayoutParams(layoutParams);
            }
        }
        f0();
        int iMax = Math.max(Math.max(this.f47582z0, this.P0), this.Q0);
        this.L.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + iMax);
        p3 p3Var = this.L;
        int i12 = this.P0;
        int i13 = this.Q0;
        int i14 = this.f47582z0;
        p3Var.K3 = i12;
        p3Var.L3 = i13;
        p3Var.M3 = i14;
        int i15 = -iMax;
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
        if (p3Var == null || !p3Var.f47352j3.y()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final int j0() {
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.B0 : this.A0;
        return i10 <= 0 ? AndroidUtilities.dp(200.0f) : i10;
    }

    public final void k0(boolean z10) {
        if (this.f47581y0) {
            this.f47581y0 = false;
            yy yyVar = this.f47577w0;
            if (yyVar != null) {
                yyVar.u(false);
                this.f47577w0.C();
            }
        }
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        this.M0 = 0.0f;
        this.N0 = null;
        yy yyVar2 = this.f47577w0;
        if (yyVar2 != null) {
            yyVar2.setTranslationY(0.0f);
            this.f47577w0.setVisibility(8);
        }
        if (this.f47579x0 || this.f47582z0 != 0) {
            this.f47579x0 = false;
            this.f47582z0 = 0;
            h0();
        }
        mg mgVar = this.X;
        if (mgVar != null) {
            mgVar.j(kg.f30100e, z10);
        }
    }

    public final boolean l0() {
        rn rnVar;
        return this.f47569r == null && (rnVar = this.F) != null && rnVar.c();
    }

    public final boolean m0() {
        if (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        p3 p3Var = this.L;
        return u4.f(p3Var.f47348h3, p3Var.f47350i3);
    }

    public final void n0() {
        g3 g3VarH2 = this.L.h2();
        if (g3VarH2 == null) {
            return;
        }
        TL_iv.RichMessage richMessageA = g3VarH2.a();
        if (richMessageA.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
        e0Var.n0(richMessageA);
        e0Var.f27884g0 = new n6(g3VarH2, 18);
        e0Var.show();
    }

    public final void o0(int i10, int i11) {
        p3 p3Var = this.L;
        p3Var.Y3 = p3Var.Q2();
        gi giVar = new gi(getParentActivity(), this, false, false, true, getResourceProvider());
        giVar.V1 = new n1(this, giVar);
        giVar.f28650f0.setIncludeVideosInGallery(true);
        giVar.f28650f0.f0();
        giVar.J1(1, true);
        giVar.h1(i10);
        giVar.f28681p2 = new m1(this, giVar);
        giVar.U = new m1(this, giVar);
        giVar.T = new o1(this, giVar);
        giVar.r1();
        if (i11 != 0) {
            giVar.A1(i11);
        }
        giVar.setFocusable(true);
        giVar.show();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 != -1 || i10 != 21) {
            if (i11 != -1 || (i10 != 1 && i10 != 14)) {
                super.onActivityResultFragment(i10, i11, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.L.e2(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        p3 p3Var = this.L;
        Uri data = intent.getData();
        if (data == null) {
            p3Var.getClass();
        } else {
            if (p3Var.getContext() == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new zh1(28, p3Var, data));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.f47581y0;
        if (z11) {
            if (z11) {
                this.f47581y0 = false;
                yy yyVar = this.f47577w0;
                if (yyVar != null) {
                    yyVar.u(false);
                    this.f47577w0.C();
                }
                e0(false);
                return false;
            }
        } else {
            if (this.f47579x0) {
                k0(true);
                return false;
            }
            if (!this.L.F2()) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        int i10 = 1;
        if (!z10 && !this.R0) {
            q0();
            this.R0 = true;
        }
        if (AndroidUtilities.isTablet() || this.f47571s == null || this.v == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        qg.g gVar = this.f47571s;
        this.f47578x = gVar.f46542f;
        gVar.f46541e = false;
        gVar.invalidate();
        this.v.setAlpha(0.0f);
        int i11 = 4;
        this.v.f26189v1.setVisibility(4);
        v0();
        float f10 = z10 ? 0.0f : 1.0f;
        this.E = f10;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        this.A = true;
        this.K.invalidate();
        valueAnimatorOfFloat.addUpdateListener(new g1(this, i10));
        valueAnimatorOfFloat.addListener(new fk0(21, this, runnable));
        if (z10) {
            FrameLayout frameLayout = this.O;
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.O;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.L, (Property<p3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.M, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.N, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.O;
            Property property3 = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.O;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.L, (Property<p3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.M, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.N, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(er.h);
        this.K.post(new lt0(animatorSet, i11));
        return animatorSet;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        nh.a2 a2Var;
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
        ni0 ni0Var = this.K0;
        if (ni0Var != null) {
            ni0Var.i();
            this.K0 = null;
        }
        p3 p3Var = this.L;
        if (p3Var != null) {
            p3Var.G2();
        }
        m.t3 t3Var = this.f47575v0;
        if (t3Var != null) {
            t3Var.c();
        }
        super.onFragmentDestroy();
        yy yyVar = this.f47577w0;
        if (yyVar != null) {
            yyVar.E();
        }
        q1 q1Var = this.K;
        if (q1Var == null || (a2Var = this.D0) == null) {
            return;
        }
        q1Var.f35387r.remove(a2Var);
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
        b70 b70Var;
        i0.c cVarF = m1Var.f46619a.f(3);
        int i10 = m1Var.f46619a.f(8).d;
        this.Q0 = i10;
        int i11 = i10 - cVarF.d;
        boolean z10 = this.C0;
        boolean z11 = i11 > AndroidUtilities.dp(20.0f);
        this.C0 = z11;
        if (z11 && i11 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.B0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.B0).commit();
            } else {
                this.A0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.A0).commit();
            }
        }
        if (this.C0 && !z10 && this.f47579x0 && !this.f47581y0) {
            k0(false);
        }
        if (!this.C0 && z10 && (b70Var = this.f47573t0) != null) {
            b70Var.u();
            this.f47573t0 = null;
        }
        onInsets(cVarF.f10489a, cVarF.f10490b, cVarF.f10491c, cVarF.d);
        return r0.m1.f46618b;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        p3 p3Var;
        int i10;
        p3 p3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.f47551c) >= 0 && (p3Var2 = this.L) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f47551c = -1;
            if (p3Var2.Y1(i10, i11)) {
                return;
            }
            p3Var2.post(new j2(p3Var2, i10, i11, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.f47549b == null && this.f47556f == null) || (p3Var = this.L) == null || p3Var.a3()) {
            return;
        }
        p3Var.post(new b(p3Var, 5));
    }

    public final boolean q0() {
        Runnable runnable;
        if (this.F == null || this.f47569r != null || !this.L.r2()) {
            return false;
        }
        TL_iv.RichMessage richMessageJ2 = this.I ? null : this.L.j2();
        if (richMessageJ2 == null && (runnable = this.H) != null) {
            runnable.run();
        }
        ck ckVar = this.F.U;
        if (richMessageJ2 != null && !this.I) {
            p3 p3Var = this.L;
            if (p3Var.k3() && !u4.f(p3Var.f47348h3, p3Var.f47350i3) && ckVar != null) {
                SpannableStringBuilder spannableStringBuilderK = u4.k(this.L.f47348h3);
                rn rnVar = ckVar.K2;
                if (ckVar.A0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderK);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, ckVar.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.t5.class);
                if (t5VarArr != null) {
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        t5Var.applyFontMetrics(ckVar.A0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.k5.g());
                    }
                }
                hi0.a(spannableStringBuilder);
                if (rnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(ckVar.M).saveDraft(rnVar.a(), rnVar.B7(rnVar.f42095j5), charSequenceArr[0], MediaDataController.getInstance(ckVar.M).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                ckVar.setRichDraftPreview(null);
                if (ckVar.A0.getText() != null) {
                    ckVar.A0.getText().clear();
                }
                ckVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long jA = this.F.a();
        rn rnVar2 = this.F;
        mediaDataController.saveDraft(jA, rnVar2.B7(rnVar2.f42095j5), "", null, null, null, null, 0L, false, false, richMessageJ2);
        TL_iv.RichMessage richMessage = richMessageJ2;
        if (ckVar == null) {
            return true;
        }
        ckVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            p3 p3Var = this.L;
            Objects.requireNonNull(p3Var);
            p0(parentActivity, new b(p3Var, 0), new e1(this, 4), getResourceProvider());
            return;
        }
        if (l0()) {
            org.telegram.ui.Components.y4.M(getParentActivity(), this.F.a(), new o0.b(this, 17), getResourceProvider());
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
            return;
        }
        if (this.F == null || !this.L.k3() || this.L.m3()) {
            return;
        }
        if (!this.L.M3()) {
            B0();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            ck ckVar = this.F.U;
            if (ckVar == null) {
                return;
            }
            this.I = true;
            Runnable runnable = this.G;
            if (runnable != null) {
                runnable.run();
            }
            ckVar.R0(u4.k(this.L.f47348h3), z10, i10, i11);
            finishFragment();
            return;
        }
        this.I = true;
        final ArrayList arrayListZ2 = this.L.Z2();
        if (arrayListZ2.isEmpty()) {
            return;
        }
        final ArrayList arrayListB2 = this.L.B2();
        final ArrayList arrayListY2 = this.L.y2();
        final ArrayList arrayListA = t4.a(this.currentAccount, arrayListZ2);
        final long jA = this.F.a();
        rn rnVar = this.F;
        final MessageObject messageObject = rnVar.f42095j5;
        final MessageObject messageObject2 = rnVar.T3;
        final long jN8 = rnVar.N8();
        final SendMessageChatArguments sendMessageChatArgumentsC8 = this.F.C8();
        final MessageObject messageObject3 = this.f47569r;
        ?? r10 = new Runnable() {
            @Override
            public final void run() {
                x1.X(this.f47232a, messageObject3, arrayListZ2, arrayListB2, arrayListY2, arrayListA, jA, messageObject, messageObject2, z10, i10, i11, sendMessageChatArgumentsC8, jN8);
            }
        };
        Runnable runnable2 = this.G;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (i10 == 0 || messageObject3 != null) {
            r10.run();
            finishFragment();
        } else {
            this.J0 = r10;
            finishFragment();
        }
    }

    public final void t0(boolean z10) {
        ArrayList arrayList = this.f47559h0;
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
        t1 t1Var2 = this.f47565n0;
        if (t1Var2 != null) {
            t1Var2.setEnabled(z11);
        }
        t1 t1Var3 = this.f47566o0;
        if (t1Var3 != null) {
            t1Var3.setEnabled(z10);
        }
        t1 t1Var4 = this.f47567p0;
        if (t1Var4 != null) {
            t1Var4.setEnabled(z10);
        }
    }

    public final void v0() {
        qg.g gVar = this.f47571s;
        int[] iArr = this.B;
        gVar.getLocationInWindow(iArr);
        if (this.f47580y == null) {
            this.f47580y = new RectF();
        }
        RectF rectF = new RectF(this.f47578x.getBounds());
        this.f47580y = rectF;
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
        a aVarQ2;
        int i10;
        j9 textSelectionHelper = this.L.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            aVarQ2 = this.L.Q2();
        } else {
            int i11 = textSelectionHelper.f24540u0;
            aVarQ2 = i11 == textSelectionHelper.f24543x0 ? this.L.y4(i11) : null;
        }
        if (this.L.R2() != null) {
            i10 = 4;
        } else if (aVarQ2 == null) {
            i10 = 0;
        } else if (aVarQ2.a() || aVarQ2.b() || aVarQ2.c()) {
            i10 = 2;
        } else {
            TL_iv.PageBlock pageBlock = aVarQ2.f47028b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                i10 = 2;
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                i10 = 4;
            } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                i10 = 8;
            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                i10 = 1;
            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                i10 = 3;
            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                i10 = 5;
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                i10 = 6;
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                i10 = 7;
            } else {
                i10 = 0;
            }
        }
        ArrayList arrayList = this.f47550b0;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            t1 t1Var = (t1) obj;
            int iIntValue = ((Integer) t1Var.getTag()).intValue();
            t1Var.setSelected(i10 == iIntValue);
            if (i10 == iIntValue) {
                t1Var.setEnabled(true);
                if (aVarQ2 == null) {
                    t1Var.a();
                } else if (i10 == 1) {
                    TL_iv.PageBlock pageBlock2 = aVarQ2.f47028b;
                    if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                        t1Var.f(R.drawable.iv_h1);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        t1Var.f(R.drawable.iv_h2);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        t1Var.f(R.drawable.iv_h3);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        t1Var.f(R.drawable.iv_h4);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        t1Var.f(R.drawable.iv_h5);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        t1Var.f(R.drawable.iv_h6);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                        t1Var.f(R.drawable.iv_code);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                        t1Var.f(R.drawable.iv_quote);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                        t1Var.f(R.drawable.iv_pullquote);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        t1Var.f(R.drawable.iv_footer);
                    } else {
                        t1Var.a();
                    }
                } else if (i10 == 2) {
                    if (aVarQ2.a()) {
                        t1Var.f(R.drawable.iv_todo);
                    } else if (aVarQ2.c()) {
                        t1Var.f(R.drawable.iv_ordered_list);
                    } else {
                        t1Var.a();
                    }
                } else if (i10 == 8) {
                    t1Var.f(R.drawable.iv_details);
                } else {
                    t1Var.a();
                }
            } else {
                t1Var.setEnabled(i10 != 4);
                t1Var.a();
            }
        }
    }

    public final void x0(int i10, boolean z10) {
        if (this.G0 == i10) {
            return;
        }
        this.G0 = i10;
        if (z10) {
            this.W.setVisibility(0);
            ViewPropertyAnimator duration = this.W.animate().alpha(this.G0 == 0 ? 1.0f : 0.0f).scaleX(this.G0 == 0 ? 1.0f : 0.8f).scaleY(this.G0 == 0 ? 1.0f : 0.8f).translationY(this.G0 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new e1(this, 1)).start();
            this.f47553d0.setVisibility(0);
            this.f47553d0.animate().alpha(this.G0 == 1 ? 1.0f : 0.0f).scaleX(this.G0 == 1 ? 1.0f : 0.8f).scaleY(this.G0 == 1 ? 1.0f : 0.8f).translationY(this.G0 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(erVar).withEndAction(new e1(this, 2)).start();
            this.f47570r0.setVisibility(0);
            this.f47570r0.animate().alpha(this.G0 == 2 ? 1.0f : 0.0f).scaleX(this.G0 == 2 ? 1.0f : 0.8f).scaleY(this.G0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(erVar).withEndAction(new e1(this, 3)).start();
            return;
        }
        this.W.setVisibility(i10 == 0 ? 0 : 8);
        this.W.setAlpha(i10 == 0 ? 1.0f : 0.0f);
        this.W.setScaleX(i10 == 0 ? 1.0f : 0.8f);
        this.W.setScaleY(i10 == 0 ? 1.0f : 0.8f);
        this.W.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.f47553d0.setVisibility(i10 == 1 ? 0 : 8);
        this.f47553d0.setAlpha(i10 == 1 ? 1.0f : 0.0f);
        this.f47553d0.setScaleX(i10 == 1 ? 1.0f : 0.8f);
        this.f47553d0.setScaleY(i10 == 1 ? 1.0f : 0.8f);
        this.f47553d0.setTranslationY(i10 == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.f47570r0.setVisibility(i10 != 2 ? 8 : 0);
        this.f47570r0.setAlpha(i10 == 2 ? 1.0f : 0.0f);
        this.f47570r0.setScaleX(i10 == 2 ? 1.0f : 0.8f);
        this.f47570r0.setScaleY(i10 == 2 ? 1.0f : 0.8f);
    }

    public final void y0() {
        boolean z10;
        boolean z11;
        j9 textSelectionHelper = this.L.getTextSelectionHelper();
        ArrayList arrayList = this.f47559h0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        t1 t1Var = this.f47568q0;
        boolean z12 = false;
        if (t1Var != null) {
            p3 p3Var = this.L;
            int[] iArrB4 = p3Var.B4();
            t1Var.setSelected(iArrB4 != null && p3Var.H3(iArrB4[0], iArrB4[1]));
        }
        if (this.L.L3()) {
            j9 textSelectionHelper2 = this.L.getTextSelectionHelper();
            int i10 = textSelectionHelper2.f24540u0;
            int i11 = textSelectionHelper2.f24541v0;
            int i12 = textSelectionHelper2.f24544y0;
            int i13 = textSelectionHelper2.f24542w0;
            int i14 = textSelectionHelper2.f24545z0;
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                t1 t1Var2 = (t1) obj;
                t1Var2.setSelected(this.L.K3(((Integer) t1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
            }
            boolean z13 = i11 == i12;
            d1 d1VarN4 = z13 ? this.L.N4(i10, i11) : null;
            int iMax = Math.max(0, Math.min(i13, i14));
            int iMax2 = d1VarN4 == null ? 0 : Math.max(0, Math.min(Math.max(i13, i14), d1VarN4.length()));
            t1 t1Var3 = this.m0;
            if (t1Var3 != null) {
                t1Var3.setSelected(d1VarN4 != null && iMax < iMax2 && v5.h(d1VarN4.getText(), iMax, iMax2));
            }
            t1 t1Var4 = this.f47566o0;
            if (t1Var4 != null) {
                if (d1VarN4 != null && iMax < iMax2 && v5.g(d1VarN4.getText(), iMax, iMax2)) {
                    z12 = true;
                }
                t1Var4.setSelected(z12);
            }
            t0(true);
            u0(z13, this.L.l2());
            return;
        }
        if (this.L.w3()) {
            j9 textSelectionHelper3 = this.L.getTextSelectionHelper();
            d1 d1VarS2 = this.L.s2(textSelectionHelper3.f24540u0);
            int i16 = textSelectionHelper3.f24542w0;
            int i17 = textSelectionHelper3.f24545z0;
            int iMax3 = d1VarS2 == null ? 0 : Math.max(0, Math.min(Math.min(i16, i17), d1VarS2.length()));
            int iMax4 = d1VarS2 == null ? 0 : Math.max(0, Math.min(Math.max(i16, i17), d1VarS2.length()));
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                t1 t1Var5 = (t1) obj2;
                t1Var5.setSelected((d1VarS2 == null || iMax3 >= iMax4 || (((Integer) t1Var5.getTag()).intValue() & d1VarS2.getCurrentStyle(iMax3, iMax4)) == 0) ? false : true);
            }
            t1 t1Var6 = this.m0;
            if (t1Var6 != null) {
                t1Var6.setSelected(d1VarS2 != null && iMax3 < iMax4 && v5.h(d1VarS2.getText(), iMax3, iMax4));
            }
            t1 t1Var7 = this.f47566o0;
            if (t1Var7 != null) {
                if (d1VarS2 != null && iMax3 < iMax4 && v5.g(d1VarS2.getText(), iMax3, iMax4)) {
                    z12 = true;
                }
                t1Var7.setSelected(z12);
            }
            t0(true);
            u0(true, this.L.l2());
            return;
        }
        int i19 = textSelectionHelper.f24540u0;
        int i20 = textSelectionHelper.f24543x0;
        int i21 = textSelectionHelper.f24542w0;
        int i22 = textSelectionHelper.f24545z0;
        boolean z14 = i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.L.f47357l4.size();
        int size3 = arrayList.size();
        int i23 = 0;
        while (i23 < size3) {
            int i24 = i23 + 1;
            t1 t1Var8 = (t1) arrayList.get(i23);
            t1Var8.setSelected(z14 && this.L.J3(((Integer) t1Var8.getTag()).intValue(), i19, i21, i20, i22));
            i23 = i24;
        }
        t0(!this.L.I3());
        t1 t1Var9 = this.m0;
        if (t1Var9 != null) {
            if (z14) {
                Editable editableH4 = this.L.H4(i19, i21, i20, i22);
                if (editableH4 == null ? false : v5.h(editableH4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            t1Var9.setSelected(z11);
        }
        t1 t1Var10 = this.f47566o0;
        if (t1Var10 != null) {
            if (z14) {
                Editable editableH5 = this.L.H4(i19, i21, i20, i22);
                if (editableH5 == null ? false : v5.g(editableH5, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            t1Var10.setSelected(z10);
        }
        if (z14 && i19 == i20) {
            z12 = true;
        }
        u0(z12, this.L.l2());
    }

    public final void z0() {
        boolean zR2 = this.L.r2();
        b2 b2Var = this.L.F3;
        boolean z10 = (b2Var == null || b2Var.f47064c.isEmpty()) ? false : true;
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setEnabled(zR2);
            this.R.setAlpha(zR2 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            this.S.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public x1(String str) {
        super(null);
        this.f47551c = -1;
        this.d = -1;
        this.f47576w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f47550b0 = new ArrayList();
        this.f47558g0 = Integer.MAX_VALUE;
        this.f47559h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f47556f = str;
    }

    public x1(TL_iv.RichMessage richMessage) {
        super(null);
        this.f47551c = -1;
        this.d = -1;
        this.f47576w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.f47550b0 = new ArrayList();
        this.f47558g0 = Integer.MAX_VALUE;
        this.f47559h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f47549b = richMessage;
    }
}
