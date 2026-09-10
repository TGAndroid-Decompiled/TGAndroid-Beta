package xh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.xa;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.eo;
import org.telegram.ui.hn0;
import org.telegram.ui.s91;
public final class r8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final zh.k0 G;
    public final zh.f0 H;
    public final tp I;
    public final eg0 J;
    public final MessageObject K;
    public final ArrayList L;
    public final a M;
    public zh.o1 N;
    public int O;
    public th.e P;
    public final uq[] Q;
    public boolean R;
    public boolean S;
    public eo T;
    public View U;
    public ValueAnimator V;
    public final org.telegram.ui.ActionBar.f6 f45988b;
    public final int f45989c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f45990f;
    public final FrameLayout h;
    public final LinearLayout f45991n;
    public final f8 f45992r;
    public final FrameLayout f45993s;
    public final FrameLayout v;
    public final w9 f45994w;
    public final bi.d f45995x;
    public final q8 f45996y;

    public r8(Context context, final int i10, final long j3, eo eoVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        TLRPC.MessageReactor messageReactor;
        TLRPC.MessageReactor messageReactor2;
        TLRPC.Chat chat;
        boolean z12;
        String formatString;
        Context context2;
        long j11;
        int i11;
        this.Q = new uq[1];
        this.S = false;
        this.f45988b = f6Var;
        this.f45989c = i10;
        this.K = messageObject;
        this.L = arrayList;
        this.d = z11;
        this.e = z10;
        a aVar = new a(context, i10, f6Var);
        this.M = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, w7.a6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.c6.a(aVar);
        aVar.setOnClickListener(new s91(context, 2, f6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor4.peer_id);
                if (messageReactor4.anonymous && messageReactor4.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor4.my || peerDialogId == clientUserId) {
                    messageReactor3 = messageReactor4;
                }
            }
            messageReactor = messageReactor3;
        } else {
            messageReactor = null;
        }
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z11) {
            if (arrayList != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    } else if (((TLRPC.MessageReactor) arrayList.get(i13)).my) {
                        TLRPC.MessageReactor messageReactor5 = (TLRPC.MessageReactor) arrayList.get(i13);
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.E = j10;
        } else {
            this.E = v5.y(i10, false).A(messageObject);
        }
        long j12 = this.E;
        this.F = j12 != 2666000 ? j12 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45990f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, w7.a6.n(-1, -2));
        this.f45992r = new f8(this, context, f6Var, z11, i10);
        int i14 = 9;
        int[] iArr = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j13 = MessagesController.getInstance(i10).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                break;
            }
            int i16 = iArr[i15];
            int i17 = i15;
            if (i16 > j13) {
                arrayList2.add(Integer.valueOf((int) j13));
                break;
            }
            arrayList2.add(Integer.valueOf(i16));
            if (iArr[i17] == j13) {
                break;
            }
            i15 = i17 + 1;
            i14 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            iArr2[i18] = ((Integer) arrayList2.get(i18)).intValue();
        }
        f8 f8Var = this.f45992r;
        f8Var.f45826e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                f8Var.setAlpha(0.5f);
            }
            this.h.addView(this.f45992r, w7.a6.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z13) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f45991n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.a6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45993s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18016i5, f6Var)));
        w9 w9Var = new w9(context);
        this.f45994w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(w9Var, w7.a6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18179r5, f6Var);
        boolean z14 = z13;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.a6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.a6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.a6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.c6.a(frameLayout2);
        p.g(i10).o();
        hn0 hn0Var = new hn0(context, 3);
        int i19 = org.telegram.ui.ActionBar.j6.G6;
        hn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i19, f6Var));
        hn0Var.setTextSize(1, 20.0f);
        hn0Var.setGravity(17);
        hn0Var.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        hn0Var.setTypeface(AndroidUtilities.bold());
        hn0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(hn0Var, w7.a6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), mode));
        w7.c6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final r8 f45321b;

            {
                this.f45321b = this;
            }

            @Override
            public final void onClick(View view) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f45321b.dismiss();
                        return;
                    default:
                        r8 r8Var = this.f45321b;
                        tp tpVar = r8Var.I;
                        tpVar.a(!tpVar.f27462a.f21057q, true);
                        if (tpVar.f27462a.f21057q) {
                            j14 = r8Var.F;
                        } else {
                            j14 = 2666000;
                        }
                        r8Var.E = j14;
                        r8Var.r();
                        q8 q8Var = r8Var.f45996y;
                        if (q8Var != null) {
                            q8Var.setMyPrivacy(r8Var.E);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.a6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.a6.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.MessageReactor messageReactor6 = messageReactor;
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        em.n(i19, f6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor6 != null) {
            messageReactor2 = messageReactor6;
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor2.count);
            chat = chat2;
            z12 = false;
        } else {
            messageReactor2 = messageReactor6;
            chat = chat2;
            z12 = false;
            formatString = LocaleController.formatString(R.string.StarsReactionText, chat2 == null ? "" : chat2.title);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z12));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.a6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z14) {
            if (!z11) {
                linearLayout3.addView(new g8(context, f6Var), w7.a6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            q8 q8Var = new q8(this, context, z11);
            this.f45996y = q8Var;
            q8Var.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l4.longValue();
                    r8 r8Var = r8.this;
                    boolean z15 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new h8(r8Var, bundle, z15));
                        r8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new i8(r8Var, bundle2, z15));
                    }
                    r8Var.dismiss();
                }
            });
            this.f45990f.addView(q8Var, w7.a6.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17929d7, f6Var));
            if (!z11 && (z10 || messageReactor2 != null)) {
                this.f45990f.addView(view, w7.a6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f45996y = null;
        }
        if (z11) {
            int i20 = org.telegram.ui.ActionBar.j6.f18034j5;
            TextView b10 = w7.e6.b(context, 20.0f, i20, true, f6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f45990f.addView(b10, w7.a6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.e6.b(context, 14.0f, i20, false, f6Var);
            b11.setGravity(17);
            if (z10) {
                i11 = R.string.LiveStoryReactText;
            } else {
                i11 = z14 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText;
            }
            em.p(i11, new Object[]{DialogObject.getName(j3)}, b11);
            this.f45990f.addView(b11, w7.a6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.G = obj2;
            obj2.f48577c = this.E;
            obj2.f48579g = 50L;
            obj2.e = true;
            zh.f0 f0Var = new zh.f0(i10, context, true);
            this.H = f0Var;
            f0Var.set(obj2);
            this.f45990f.addView(f0Var, w7.a6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        tp tpVar = new tp(context, 21, f6Var);
        this.I = tpVar;
        tpVar.b(org.telegram.ui.ActionBar.j6.f18000h7, org.telegram.ui.ActionBar.j6.f18036j7, org.telegram.ui.ActionBar.j6.f18056k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(this.E != 2666000, false);
        q8 q8Var2 = this.f45996y;
        if (q8Var2 != null) {
            q8Var2.setMyPrivacy(this.E);
        }
        tpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        em.n(i19, f6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(tpVar, w7.a6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.a6.q(-2, -2, 16));
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final r8 f45321b;

            {
                this.f45321b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f45321b.dismiss();
                        return;
                    default:
                        r8 r8Var = this.f45321b;
                        tp tpVar2 = r8Var.I;
                        tpVar2.a(!tpVar2.f27462a.f21057q, true);
                        if (tpVar2.f27462a.f21057q) {
                            j14 = r8Var.F;
                        } else {
                            j14 = 2666000;
                        }
                        r8Var.E = j14;
                        r8Var.r();
                        q8 q8Var3 = r8Var.f45996y;
                        if (q8Var3 != null) {
                            q8Var3.setMyPrivacy(r8Var.E);
                            return;
                        }
                        return;
                }
            }
        });
        w7.c6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 6, 6));
        if (!z11 && (z10 || messageReactor2 != null)) {
            this.f45990f.addView(linearLayout4, w7.a6.t(-2, -2, 1, 0, z14 ? 10 : 4, 0, 10));
        }
        bi.d dVar = new bi.d(context, f6Var, true);
        this.f45995x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f45990f.addView(dVar, w7.a6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(z7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.Q), true, true);
        if (z10) {
            j11 = 0;
            context2 = context;
            dVar.setOnClickListener(new n6(this, messageObject, eoVar, i10, z11, context, f6Var, j3, chat));
        } else {
            context2 = context;
            j11 = 0;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                r8.m(r8.this, i10, f6Var, j3, z11);
            }
        });
        m90 m90Var = new m90(context2, f6Var);
        m90Var.setTextSize(1, 13.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
        if (z11 && !z10) {
            m90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new ci.a(context2, 12)));
        }
        m90Var.setGravity(17);
        m90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18054k5));
        if (z10 || z11) {
            this.f45990f.addView(m90Var, w7.a6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f45990f);
        eg0 eg0Var = new eg0(context2, 1, 2, 4);
        this.J = eg0Var;
        rg.a aVar2 = eg0Var.f41485b;
        aVar2.f41471w = org.telegram.ui.ActionBar.j6.fk;
        aVar2.f41472x = org.telegram.ui.ActionBar.j6.gk;
        aVar2.b();
        eg0Var.f41485b.h = 1.0f;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        this.container.addView(eg0Var, w7.a6.c(150.0f, 150));
        this.f45992r.setValue(50);
        if (arrayList != null) {
            long j14 = j11;
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i21)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            j14 = messageReactor2 != null ? j14 - messageReactor2.count : j14;
            if (j14 > j11) {
                this.f45992r.setStarsTop(j14 + 1);
            }
        }
    }

    public static void m(r8 r8Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z10) {
        long j10;
        boolean z11;
        r8 r8Var2 = r8Var;
        p g10 = p.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.f45851l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        w70 F = w70.F(r8Var2.containerView, f6Var, r8Var2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f17342id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = i12;
                    } else {
                        j10 = -chat.f17195id;
                    }
                }
                r8Var2 = r8Var;
                i11 = i12;
            }
            if (j10 == j3) {
                i11 = i12;
            } else {
                long j11 = r8Var2.E;
                if (j10 != j11 && (j11 != 0 || j10 != UserConfig.getInstance(i10).getClientUserId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                F.g(tLObject, z11, new xa(r8Var2, j10, z10, 6));
                r8Var2 = r8Var;
                i11 = i12;
            }
        }
        F.f28702t = false;
        F.Y = true;
        F.f28701s = 0;
        F.V(5);
        F.Z();
    }

    @Override
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        float f7;
        float f10;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float[] fArr = {f7};
        a aVar = this.M;
        arrayList.add(ObjectAnimator.ofFloat(aVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(aVar, property2, f10));
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(aVar, property3, f11));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f45992r.f45833k0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            q(true);
        }
    }

    @Override
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.R && !this.S) {
            this.S = true;
            MessageObject messageObject = this.K;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.E)) {
                messageObject.setMyPaidReactionDialogId(this.E);
                p5 b10 = p5.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f45989c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j3 = b10.f45877a;
                int i11 = b10.f45878b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j3);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j10 = this.E;
                if (j10 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j10 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.E);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f45877a), Integer.valueOf(i11), Long.valueOf(this.E));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new bi.c2(this, 26));
            }
        }
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.dismissInternal();
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar = this.M;
        if (f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    public final void o(final xh.s5 r17) {
        throw new UnsupportedOperationException("Method not decompiled: xh.r8.o(xh.s5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f45989c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f45989c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final boolean p() {
        if (!this.d) {
            p g10 = p.g(this.f45989c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f45851l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f45993s;
        int i10 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != p()) {
            if (!p()) {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                if (p()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f45991n, changeBounds);
            }
        }
    }

    public final void r() {
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.f23286p = 0.42f;
        long j3 = this.E;
        w9 w9Var = this.f45994w;
        if (j3 == 2666000) {
            g9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.j6.f17912c8;
            org.telegram.ui.ActionBar.f6 f6Var = this.f45988b;
            g9Var.i(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            w9Var.e(null, g9Var);
            return;
        }
        int i11 = this.f45989c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.E));
            g9Var.r(user);
            w9Var.e(user, g9Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.E));
        g9Var.q(chat);
        w9Var.e(chat, g9Var);
    }

    public final void s(long j3) {
        q8 q8Var;
        long j10;
        long j11;
        boolean z10;
        long j12 = 0;
        if ((!this.d || this.e || j3 <= 0) && (q8Var = this.f45996y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f45989c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.L;
            if (arrayList2 != null) {
                j11 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j13 = j12;
                    boolean z11 = messageReactor.anonymous;
                    if (z11) {
                        if (messageReactor.my) {
                            peerDialogId = clientUserId;
                        } else {
                            peerDialogId = (-i11) - i10;
                        }
                    }
                    if (!messageReactor.my && peerDialogId != clientUserId) {
                        long j14 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f45728a = z11;
                        obj.f45729b = false;
                        obj.f45730c = peerDialogId;
                        obj.d = j14;
                        arrayList.add(obj);
                    } else {
                        j11 = messageReactor.count;
                    }
                    i11++;
                    j12 = j13;
                    i10 = 1;
                }
                j10 = j12;
            } else {
                j10 = 0;
                j11 = 0;
            }
            long j15 = j11 + j3;
            if (j15 > j10) {
                if (this.E == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f45728a = z10;
                obj2.f45729b = true;
                obj2.f45730c = clientUserId;
                obj2.d = j15;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new sg.p(14));
            q8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
