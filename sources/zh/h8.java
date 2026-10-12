package zh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
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
import di.n9;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.z9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.es0;
import org.telegram.ui.ff;
import org.telegram.ui.fo;
import org.telegram.ui.jg0;
import org.telegram.ui.mn0;
import org.telegram.ui.u91;
public final class h8 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final bi.e1 G;
    public final bi.z0 H;
    public final View I;
    public final aq J;
    public final jg0 K;
    public final MessageObject L;
    public final ArrayList M;
    public final a N;
    public bi.h3 O;
    public int P;
    public a1.c Q;
    public final br[] R;
    public boolean S;
    public boolean T;
    public fo U;
    public View V;
    public ValueAnimator W;
    public final org.telegram.ui.ActionBar.c6 f50640b;
    public final int f50641c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f50642f;
    public final FrameLayout h;
    public final LinearLayout f50643n;
    public final v7 f50644r;
    public final FrameLayout f50645s;
    public final FrameLayout v;
    public final z9 f50646w;
    public final di.d f50647x;
    public final g8 f50648y;

    public h8(Context context, final int i10, final long j10, fo foVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        String formatString;
        Context context2;
        long j12;
        int i11;
        this.R = new br[1];
        this.T = false;
        this.f50640b = c6Var;
        this.f50641c = i10;
        this.L = messageObject;
        this.M = arrayList;
        this.d = z11;
        this.e = z10;
        a aVar = new a(context, i10, c6Var);
        this.N = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, w7.a6.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.c6.a(aVar);
        aVar.setOnClickListener(new u91(context, 2, c6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor3.my || peerDialogId == clientUserId) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
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
                        TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) arrayList.get(i13);
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.E = j11;
        } else {
            this.E = n5.y(i10, false).A(messageObject);
        }
        long j13 = this.E;
        this.F = j13 != 2666000 ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f50642f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, w7.a6.n(-1, -2));
        this.f50644r = new v7(this, context, c6Var, z11, i10);
        int i14 = 9;
        int[] iArr = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j14 = MessagesController.getInstance(i10).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                break;
            }
            int i16 = iArr[i15];
            int i17 = i15;
            if (i16 > j14) {
                arrayList2.add(Integer.valueOf((int) j14));
                break;
            }
            arrayList2.add(Integer.valueOf(i16));
            if (iArr[i17] == j14) {
                break;
            }
            i15 = i17 + 1;
            i14 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            iArr2[i18] = ((Integer) arrayList2.get(i18)).intValue();
        }
        v7 v7Var = this.f50644r;
        v7Var.f50464e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                v7Var.setAlpha(0.5f);
            }
            this.h.addView(this.f50644r, w7.a6.a(-2.0f, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z13) ? 0.0f : -40.0f, -1, 55));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f50643n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50645s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19989i5, c6Var)));
        z9 z9Var = new z9(context);
        this.f50646w = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        z9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        t();
        frameLayout3.addView(z9Var, w7.a6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20157r5, c6Var);
        boolean z14 = z13;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.a6.a(18.0f, 0.0f, 0.0f, 4.0f, 0.0f, 18, 21));
        frameLayout2.addView(frameLayout3, w7.a6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.a6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.c6.a(frameLayout2);
        p.g(i10).o();
        mn0 mn0Var = new mn0(context, 4);
        int i19 = org.telegram.ui.ActionBar.g6.G6;
        mn0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
        mn0Var.setTextSize(1, 20.0f);
        mn0Var.setGravity(17);
        mn0Var.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        mn0Var.setTypeface(AndroidUtilities.bold());
        mn0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(mn0Var, w7.a6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        s(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, c6Var), mode));
        w7.c6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f51165b;

            {
                this.f51165b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f51165b.dismiss();
                        return;
                    default:
                        h8 h8Var = this.f51165b;
                        aq aqVar = h8Var.J;
                        aqVar.a(!aqVar.f23604a.f23092q, true);
                        if (aqVar.f23604a.f23092q) {
                            j15 = h8Var.F;
                        } else {
                            j15 = 2666000;
                        }
                        h8Var.E = j15;
                        h8Var.t();
                        g8 g8Var = h8Var.f50648y;
                        if (g8Var != null) {
                            g8Var.setMyPrivacy(h8Var.E);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.a6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.a6.a(-2.0f, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f, -1, 55));
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        yh.n(i19, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor.count);
            z12 = false;
        } else {
            z12 = false;
            formatString = LocaleController.formatString(R.string.StarsReactionText, chat == null ? "" : chat.title);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z12));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.a6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z14) {
            if (!z11) {
                linearLayout3.addView(new w7(context, c6Var), w7.a6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            g8 g8Var = new g8(this, context, z11);
            this.f50648y = g8Var;
            g8Var.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    int i20 = (l4.longValue() > 0L ? 1 : (l4.longValue() == 0L ? 0 : -1));
                    h8 h8Var = h8.this;
                    boolean z15 = z11;
                    if (i20 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new x7(h8Var, bundle, z15));
                        h8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new y7(h8Var, bundle2, z15));
                    }
                    h8Var.dismiss();
                }
            });
            this.f50642f.addView(g8Var, w7.a6.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.I = view;
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, c6Var));
            if (!z11 && (z10 || messageReactor != null)) {
                this.f50642f.addView(view, w7.a6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f50648y = null;
            this.I = null;
        }
        if (z11) {
            int i20 = org.telegram.ui.ActionBar.g6.f20007j5;
            TextView b10 = w7.e6.b(context, 20.0f, i20, true, c6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f50642f.addView(b10, w7.a6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.e6.b(context, 14.0f, i20, false, c6Var);
            b11.setGravity(17);
            if (z10) {
                i11 = R.string.LiveStoryReactText;
            } else {
                i11 = z14 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText;
            }
            yh.q(i11, new Object[]{DialogObject.getName(j10)}, b11);
            this.f50642f.addView(b11, w7.a6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.G = obj2;
            obj2.f2972c = this.E;
            obj2.f2974g = 50L;
            obj2.e = true;
            bi.z0 z0Var = new bi.z0(i10, context, true);
            this.H = z0Var;
            z0Var.set(obj2);
            this.f50642f.addView(z0Var, w7.a6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        aq aqVar = new aq(context, 21, c6Var);
        this.J = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.g6.f19974h7, org.telegram.ui.ActionBar.g6.f20009j7, org.telegram.ui.ActionBar.g6.f20029k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(this.E != 2666000, false);
        g8 g8Var2 = this.f50648y;
        if (g8Var2 != null) {
            g8Var2.setMyPrivacy(this.E);
        }
        aqVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        yh.n(i19, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(aqVar, w7.a6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.a6.q(-2, -2, 16));
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f51165b;

            {
                this.f51165b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f51165b.dismiss();
                        return;
                    default:
                        h8 h8Var = this.f51165b;
                        aq aqVar2 = h8Var.J;
                        aqVar2.a(!aqVar2.f23604a.f23092q, true);
                        if (aqVar2.f23604a.f23092q) {
                            j15 = h8Var.F;
                        } else {
                            j15 = 2666000;
                        }
                        h8Var.E = j15;
                        h8Var.t();
                        g8 g8Var3 = h8Var.f50648y;
                        if (g8Var3 != null) {
                            g8Var3.setMyPrivacy(h8Var.E);
                            return;
                        }
                        return;
                }
            }
        });
        w7.c6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 6, 6));
        if (!z11 && (z10 || messageReactor != null)) {
            this.f50642f.addView(linearLayout4, w7.a6.t(-2, -2, 1, 0, z14 ? 10 : 4, 0, 10));
        }
        di.d dVar = new di.d(context, c6Var, true);
        this.f50647x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f50642f.addView(dVar, w7.a6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        u(0L);
        dVar.g(p7.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.R), true, true);
        if (z10) {
            j12 = 0;
            context2 = context;
            dVar.setOnClickListener(new f6(this, messageObject, foVar, i10, z11, context, c6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                h8.n(h8.this, i10, c6Var, j10, z11);
            }
        });
        da0 da0Var = new da0(context2, c6Var);
        da0Var.setTextSize(1, 13.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var));
        if (z11 && !z10) {
            da0Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new ei.a(context2, 12)));
        }
        da0Var.setGravity(17);
        da0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20027k5));
        if (z10 || z11) {
            this.f50642f.addView(da0Var, w7.a6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f50642f);
        jg0 jg0Var = new jg0(context2, 1, 2, 4);
        this.K = jg0Var;
        tg.g gVar = jg0Var.f45740b;
        gVar.f45724z = org.telegram.ui.ActionBar.g6.fk;
        gVar.A = org.telegram.ui.ActionBar.g6.gk;
        gVar.b();
        jg0Var.f45740b.f45710k = 1.0f;
        jg0Var.setVisibility(4);
        jg0Var.setPaused(true);
        this.container.addView(jg0Var, w7.a6.d(150.0f, 150));
        this.f50644r.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i21)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor != null ? j15 - messageReactor.count : j15;
            if (j15 > j12) {
                this.f50644r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void n(h8 h8Var, int i10, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z10) {
        long j11;
        boolean z11;
        h8 h8Var2 = h8Var;
        p g10 = p.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.f50966l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        m80 F = m80.F(h8Var2.containerView, c6Var, h8Var2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).f19363id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = i12;
                    } else {
                        j11 = -chat.f19216id;
                    }
                }
                h8Var2 = h8Var;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = h8Var2.E;
                if (j11 != j12 && (j12 != 0 || j11 != UserConfig.getInstance(i10).getClientUserId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                F.g(tLObject, z11, new n9(h8Var2, j11, z10, 6));
                h8Var2 = h8Var;
                i11 = i12;
            }
        }
        F.f27299t = false;
        F.Y = true;
        F.f27298s = 0;
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
        a aVar = this.N;
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
        if (this.f50644r.f50471k0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            s(true);
        }
    }

    @Override
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.S && !this.T) {
            this.T = true;
            MessageObject messageObject = this.L;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.E)) {
                messageObject.setMyPaidReactionDialogId(this.E);
                h5 b10 = h5.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f50641c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.f50628a;
                int i11 = b10.f50629b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.E;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.E);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f50628a), Integer.valueOf(i11), Long.valueOf(this.E));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new bi.z7(this, 29));
            }
        }
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.dismissInternal();
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar = this.N;
        if (f7 >= aVar.getX() && f7 <= aVar.getX() + aVar.getWidth() && f10 >= aVar.getY() && f10 <= aVar.getY() + aVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f7, f10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f50641c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50641c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final void q(final k5 k5Var) {
        ah.g1 g1Var;
        View view;
        ah.j1 j1Var;
        bi.h3 h3Var;
        View view2;
        ah.j1 j1Var2;
        ah.g1 g1Var2;
        MessageObject messageObject;
        v7 v7Var = this.f50644r;
        jg0 jg0Var = this.K;
        MessageObject messageObject2 = this.L;
        if (messageObject2 != null && (view2 = this.U.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.V;
            if (view3 instanceof org.telegram.ui.Cells.u1) {
                j1Var2 = ((org.telegram.ui.Cells.u1) view3).N;
                j1Var2.getClass();
                g1Var2 = j1Var2.m("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.x0) {
                j1Var2 = ((org.telegram.ui.Cells.x0) view3).E0;
                j1Var2.getClass();
                g1Var2 = j1Var2.m("stars");
            } else {
                j1Var2 = null;
                g1Var2 = null;
            }
            if (g1Var2 == null && j1Var2 != null) {
                MessageObject.GroupedMessages c92 = this.U.c9(messageObject2);
                if (c92 != null && !c92.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = c92.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            MessageObject messageObject3 = arrayList.get(i10);
                            i10++;
                            messageObject = messageObject3;
                            MessageObject.GroupedMessagePosition position = c92.getPosition(messageObject);
                            if (position != null) {
                                int i11 = position.flags;
                                if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            messageObject = null;
                            break;
                        }
                    }
                    if (messageObject != null) {
                        view3 = this.U.t8(messageObject.getId(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Cells.u1) {
                        j1Var2 = ((org.telegram.ui.Cells.u1) view3).N;
                        j1Var2.getClass();
                        g1Var2 = j1Var2.m("stars");
                    }
                } else {
                    return;
                }
            }
            if (g1Var2 != null) {
                j1Var = j1Var2;
                g1Var = g1Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.O == null) {
            return;
        } else {
            g1Var = null;
            view = null;
            j1Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        v7Var.getLocationInWindow(iArr);
        rectF.set(v7Var.G.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        q7 q7Var = new q7(this, 2);
        jg0Var.U = q7Var;
        if (jg0Var.T) {
            jg0Var.U = null;
            q7Var.run();
        }
        if (g1Var != null) {
            g1Var.f751l = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ah.g1 g1Var3 = g1Var;
        bi.z0[] z0VarArr = new bi.z0[1];
        if (this.d && (h3Var = this.O) != null) {
            z0VarArr[0] = h3Var.d(this.P);
        }
        final RectF rectF2 = new RectF();
        final ff ffVar = new ff(this, z0VarArr, iArr, rectF2, view, j1Var, g1Var3, 16);
        View view4 = view;
        ffVar.run();
        jg0Var.setPaused(false);
        jg0Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        jg0Var.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        jg0Var.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        jg0Var.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        jg0Var.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ffVar.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                h8 h8Var = h8.this;
                jg0 jg0Var2 = h8Var.K;
                jg0Var2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                jg0Var2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                jg0Var2.setScaleX(lerp);
                jg0Var2.setScaleY(lerp);
                tg.g gVar = jg0Var2.f45740b;
                gVar.d = 360.0f * floatValue;
                gVar.f45710k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        h8Var.container.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = k5Var;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.W.addListener(new z7(this, g1Var3, view4, z0VarArr, zArr, rectF2, k5Var));
        this.W.setDuration(800L);
        this.W.setInterpolator(new org.telegram.ui.Cells.m2(5));
        this.W.start();
    }

    public final boolean r() {
        if (!this.d) {
            p g10 = p.g(this.f50641c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f50966l;
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

    public final void s(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f50645s;
        int i10 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != r()) {
            if (!r()) {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                if (r()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f50643n, changeBounds);
            }
        }
    }

    public final void t() {
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.f26627p = 0.42f;
        long j10 = this.E;
        int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        z9 z9Var = this.f50646w;
        if (i10 == 0) {
            k9Var.g(21);
            int i11 = org.telegram.ui.ActionBar.g6.f19884c8;
            org.telegram.ui.ActionBar.c6 c6Var = this.f50640b;
            k9Var.i(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
            z9Var.e(null, k9Var);
            return;
        }
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f50641c;
        if (i12 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.E));
            k9Var.r(user);
            z9Var.e(user, k9Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.E));
        k9Var.q(chat);
        z9Var.e(chat, k9Var);
    }

    public final void u(long j10) {
        g8 g8Var;
        long j11;
        long j12;
        boolean z10;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (g8Var = this.f50648y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f50641c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.M;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z11 = messageReactor.anonymous;
                    if (z11) {
                        if (messageReactor.my) {
                            peerDialogId = clientUserId;
                        } else {
                            peerDialogId = (-i11) - i10;
                        }
                    }
                    if (!messageReactor.my && peerDialogId != clientUserId) {
                        long j15 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f50358a = z11;
                        obj.f50359b = false;
                        obj.f50360c = peerDialogId;
                        obj.d = j15;
                        arrayList.add(obj);
                    } else {
                        j12 = messageReactor.count;
                    }
                    i11++;
                    j13 = j14;
                    i10 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                if (this.E == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f50358a = z10;
                obj2.f50359b = true;
                obj2.f50360c = clientUserId;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new es0(29));
            g8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
