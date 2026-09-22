package yh;

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
import ci.r9;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.eg0;
import org.telegram.ui.hn0;
import org.telegram.ui.kb1;
import org.telegram.ui.l91;
public final class p8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final ai.m1 G;
    public final ai.h1 H;
    public final np I;
    public final eg0 J;
    public final MessageObject K;
    public final ArrayList L;
    public final a M;
    public ai.r3 N;
    public int O;
    public a1.c P;
    public final oq[] Q;
    public boolean R;
    public boolean S;
    public bo T;
    public View U;
    public ValueAnimator V;
    public final org.telegram.ui.ActionBar.e6 f47580b;
    public final int f47581c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f47582f;
    public final FrameLayout h;
    public final LinearLayout f47583n;
    public final d8 f47584r;
    public final FrameLayout f47585s;
    public final FrameLayout v;
    public final u9 f47586w;
    public final ci.d f47587x;
    public final o8 f47588y;

    public p8(Context context, final int i10, final long j3, bo boVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        String formatString;
        Context context2;
        long j11;
        int i11;
        this.Q = new oq[1];
        this.S = false;
        this.f47580b = e6Var;
        this.f47581c = i10;
        this.K = messageObject;
        this.L = arrayList;
        this.d = z11;
        this.e = z10;
        a aVar = new a(context, i10, e6Var);
        this.M = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, w7.x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new l91(context, 2, e6Var));
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
            this.E = j10;
        } else {
            this.E = u5.y(i10, false).A(messageObject);
        }
        long j12 = this.E;
        this.F = j12 != 2666000 ? j12 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f47582f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, w7.x5.n(-1, -2));
        this.f47584r = new d8(this, context, e6Var, z11, i10);
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
        d8 d8Var = this.f47584r;
        d8Var.f47432e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                d8Var.setAlpha(0.5f);
            }
            this.h.addView(this.f47584r, w7.x5.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z13) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f47583n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.x5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f47585s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18922i5, e6Var)));
        u9 u9Var = new u9(context);
        this.f47586w = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        u9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(u9Var, w7.x5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19088r5, e6Var);
        boolean z14 = z13;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.x5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.x5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.x5.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.z5.a(frameLayout2);
        o.g(i10).o();
        hn0 hn0Var = new hn0(context, 4);
        int i19 = org.telegram.ui.ActionBar.i6.G6;
        hn0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        hn0Var.setTextSize(1, 20.0f);
        hn0Var.setGravity(17);
        hn0Var.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        hn0Var.setTypeface(AndroidUtilities.bold());
        hn0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(hn0Var, w7.x5.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, e6Var), mode));
        w7.z5.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final p8 f46930b;

            {
                this.f46930b = this;
            }

            @Override
            public final void onClick(View view) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f46930b.dismiss();
                        return;
                    default:
                        p8 p8Var = this.f46930b;
                        np npVar = p8Var.I;
                        npVar.a(!npVar.f26546a.f21969q, true);
                        if (npVar.f26546a.f21969q) {
                            j14 = p8Var.F;
                        } else {
                            j14 = 2666000;
                        }
                        p8Var.E = j14;
                        p8Var.r();
                        o8 o8Var = p8Var.f47588y;
                        if (o8Var != null) {
                            o8Var.setMyPrivacy(p8Var.E);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.x5.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.x5.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        vl.o(i19, e6Var, textView, 1, 14.0f);
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
            linearLayout3.addView(textView, w7.x5.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z14) {
            if (!z11) {
                linearLayout3.addView(new e8(context, e6Var), w7.x5.t(-1, 30, 55, 0, 20, 0, 0));
            }
            o8 o8Var = new o8(this, context, z11);
            this.f47588y = o8Var;
            o8Var.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l4.longValue();
                    p8 p8Var = p8.this;
                    boolean z15 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new f8(p8Var, bundle, z15));
                        p8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new g8(p8Var, bundle2, z15));
                    }
                    p8Var.dismiss();
                }
            });
            this.f47582f.addView(o8Var, w7.x5.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18835d7, e6Var));
            if (!z11 && (z10 || messageReactor != null)) {
                this.f47582f.addView(view, w7.x5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.f47588y = null;
        }
        if (z11) {
            int i20 = org.telegram.ui.ActionBar.i6.f18940j5;
            TextView b10 = w7.b6.b(context, 20.0f, i20, true, e6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f47582f.addView(b10, w7.x5.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.b6.b(context, 14.0f, i20, false, e6Var);
            b11.setGravity(17);
            if (z10) {
                i11 = R.string.LiveStoryReactText;
            } else {
                i11 = z14 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText;
            }
            vl.q(i11, new Object[]{DialogObject.getName(j3)}, b11);
            this.f47582f.addView(b11, w7.x5.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.G = obj2;
            obj2.f1226c = this.E;
            obj2.f1228g = 50L;
            obj2.e = true;
            ai.h1 h1Var = new ai.h1(i10, context, true);
            this.H = h1Var;
            h1Var.set(obj2);
            this.f47582f.addView(h1Var, w7.x5.t(-2, -2, 17, 32, 0, 32, 20));
        }
        np npVar = new np(context, 21, e6Var);
        this.I = npVar;
        npVar.b(org.telegram.ui.ActionBar.i6.f18906h7, org.telegram.ui.ActionBar.i6.f18942j7, org.telegram.ui.ActionBar.i6.f18962k7);
        npVar.setDrawUnchecked(true);
        npVar.a(this.E != 2666000, false);
        o8 o8Var2 = this.f47588y;
        if (o8Var2 != null) {
            o8Var2.setMyPrivacy(this.E);
        }
        npVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        vl.o(i19, e6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(npVar, w7.x5.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.x5.q(-2, -2, 16));
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final p8 f46930b;

            {
                this.f46930b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f46930b.dismiss();
                        return;
                    default:
                        p8 p8Var = this.f46930b;
                        np npVar2 = p8Var.I;
                        npVar2.a(!npVar2.f26546a.f21969q, true);
                        if (npVar2.f26546a.f21969q) {
                            j14 = p8Var.F;
                        } else {
                            j14 = 2666000;
                        }
                        p8Var.E = j14;
                        p8Var.r();
                        o8 o8Var3 = p8Var.f47588y;
                        if (o8Var3 != null) {
                            o8Var3.setMyPrivacy(p8Var.E);
                            return;
                        }
                        return;
                }
            }
        });
        w7.z5.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18923i6, e6Var), 6, 6));
        if (!z11 && (z10 || messageReactor != null)) {
            this.f47582f.addView(linearLayout4, w7.x5.t(-2, -2, 1, 0, z14 ? 10 : 4, 0, 10));
        }
        ci.d dVar = new ci.d(context, e6Var, true);
        this.f47587x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f47582f.addView(dVar, w7.x5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(x7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.Q), true, true);
        if (z10) {
            j11 = 0;
            context2 = context;
            dVar.setOnClickListener(new m6(this, messageObject, boVar, i10, z11, context, e6Var, j3, chat));
        } else {
            context2 = context;
            j11 = 0;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                p8.m(p8.this, i10, e6Var, j3, z11);
            }
        });
        c90 c90Var = new c90(context2, e6Var);
        c90Var.setTextSize(1, 13.0f);
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19234z6, e6Var));
        if (z11 && !z10) {
            c90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        } else {
            c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new di.a(context2, 12)));
        }
        c90Var.setGravity(17);
        c90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f18960k5));
        if (z10 || z11) {
            this.f47582f.addView(c90Var, w7.x5.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f47582f);
        eg0 eg0Var = new eg0(context2, 1, 2, 4);
        this.J = eg0Var;
        sg.a aVar2 = eg0Var.f42933b;
        aVar2.f42921w = org.telegram.ui.ActionBar.i6.fk;
        aVar2.f42922x = org.telegram.ui.ActionBar.i6.gk;
        aVar2.b();
        eg0Var.f42933b.h = 1.0f;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        this.container.addView(eg0Var, w7.x5.c(150.0f, 150));
        this.f47584r.setValue(50);
        if (arrayList != null) {
            long j14 = j11;
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i21)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            j14 = messageReactor != null ? j14 - messageReactor.count : j14;
            if (j14 > j11) {
                this.f47584r.setStarsTop(j14 + 1);
            }
        }
    }

    public static void m(p8 p8Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, long j3, boolean z10) {
        long j10;
        boolean z11;
        p8 p8Var2 = p8Var;
        o g10 = o.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.f47508l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        n70 F = n70.F(p8Var2.containerView, e6Var, p8Var2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f18256id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = i12;
                    } else {
                        j10 = -chat.f18109id;
                    }
                }
                p8Var2 = p8Var;
                i11 = i12;
            }
            if (j10 == j3) {
                i11 = i12;
            } else {
                long j11 = p8Var2.E;
                if (j10 != j11 && (j11 != 0 || j10 != UserConfig.getInstance(i10).getClientUserId())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                F.g(tLObject, z11, new r9(p8Var2, j10, z10, 6));
                p8Var2 = p8Var;
                i11 = i12;
            }
        }
        F.f26368t = false;
        F.Y = true;
        F.f26367s = 0;
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
        if (this.f47584r.f47439k0) {
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
                o5 b10 = o5.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.f47581c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j3 = b10.f47537a;
                int i11 = b10.f47538b;
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
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.f47537a), Integer.valueOf(i11), Long.valueOf(this.E));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new ai.m8(this, 29));
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

    public final void o(final yh.r5 r17) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p8.o(yh.r5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f47581c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f47581c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final boolean p() {
        if (!this.d) {
            o g10 = o.g(this.f47581c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f47508l;
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
        FrameLayout frameLayout = this.f47585s;
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
                TransitionManager.beginDelayedTransition(this.f47583n, changeBounds);
            }
        }
    }

    public final void r() {
        f9 f9Var = new f9((org.telegram.ui.ActionBar.e6) null);
        f9Var.f23866p = 0.42f;
        long j3 = this.E;
        u9 u9Var = this.f47586w;
        if (j3 == 2666000) {
            f9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.i6.f18818c8;
            org.telegram.ui.ActionBar.e6 e6Var = this.f47580b;
            f9Var.i(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
            u9Var.e(null, f9Var);
            return;
        }
        int i11 = this.f47581c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.E));
            f9Var.r(user);
            u9Var.e(user, f9Var);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.E));
        f9Var.q(chat);
        u9Var.e(chat, f9Var);
    }

    public final void s(long j3) {
        o8 o8Var;
        long j10;
        long j11;
        boolean z10;
        long j12 = 0;
        if ((!this.d || this.e || j3 <= 0) && (o8Var = this.f47588y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.f47581c).getClientUserId();
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
                        obj.f47329a = z11;
                        obj.f47330b = false;
                        obj.f47331c = peerDialogId;
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
                obj2.f47329a = z10;
                obj2.f47330b = true;
                obj2.f47331c = clientUserId;
                obj2.d = j15;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new kb1(23));
            o8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
