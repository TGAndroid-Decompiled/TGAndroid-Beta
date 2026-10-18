package yh;

import ai.k7;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ei.r6;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;
public final class j0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final i0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public ai.q4 K;
    public boolean L;
    public final z4 f50347b;
    public final ih.k f50348c;
    public final gh.e d;
    public final bh.b e;
    public final ih.f f50349f;
    public final qh.i h;
    public final g0 f50350n;
    public final FrameLayout f50351r;
    public final xp f50352s;
    public final TextView v;
    public final q6 f50353w;
    public final ImageView f50354x;
    public final Drawable f50355y;

    public j0(Context context, d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (d6) null, true, true);
        boolean z10;
        sn snVar;
        this.f50348c = new ih.k();
        qh.i iVar = new qh.i(new ai.h4(this, 1));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j10;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        bh.b bVar = new bh.b(obj);
        this.e = bVar;
        f0 f0Var = new f0(this, context);
        this.containerView = f0Var;
        int i10 = this.backgroundPaddingLeft;
        f0Var.setPadding(i10, 0, i10, 0);
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.f4362f = jVar;
        bVar.f4363g = viewGroup;
        qh.e eVar = new qh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f44782y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = r6.e(null, this.currentAccount, j10, h6.I.q());
        this.f50355y = e;
        f0Var.V(e);
        z4 z4Var = new z4(context, this.currentAccount, d6Var);
        this.f50347b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new u5(z4Var, this.containerView, AndroidUtilities.dp(18.0f), q("paintChatActionBackground")));
        f0Var.addView(z4Var, z5.e(-2, -2, 48));
        ih.f fVar = new ih.f(context);
        this.f50349f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, fh.c.b(d6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, fh.c.b(d6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.f50350n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.f24054y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.f24049x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((snVar = g0Var.P2) == null || !snVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.f23965i2 = z10;
        g0Var.S0(false, false, false);
        g0Var.d1(true, false);
        g0Var.f24056z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, z5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        this.containerView.addView(fVar.getFadeView(), z5.d(-1.0f, -1));
        this.containerView.addView(fVar, z5.d(-1.0f, -1));
        g0Var.setDelegate(new h0(this, tL_starGiftUnique));
        pf pfVar = g0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = pfVar.getFilters();
        if (filters == null) {
            pfVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            pfVar.setFilters(inputFilterArr);
        }
        q6 q6Var = new q6(context, false, false, false);
        this.f50353w = q6Var;
        q6Var.setAllowCancel(true);
        q6Var.setScaleProperty(0.6f);
        q6Var.setVisibility(8);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(getThemedColor(h6.f21381y6));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity(17);
        this.containerView.addView(q6Var, z5.a(20.0f, 3.0f, 0.0f, 3.0f, 54.0f, 56, 85));
        ?? vgVar = new vg(R.drawable.send_plane_24, context, d6Var, false);
        this.H = vgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        vgVar.I = dp;
        vgVar.J = dp2;
        vgVar.M = AndroidUtilities.dp(6.0f);
        vgVar.N = AndroidUtilities.dp(8.0f);
        vgVar.f31272h0 = true;
        this.containerView.addView((View) vgVar, z5.e(110, 50, 85));
        vgVar.setScrimViewBackgroundColor(getThemedColor(h6.f20993d6));
        vgVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f50251b;

            {
                this.f50251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f50251b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f50353w);
                            return;
                        }
                        ai.q4 q4Var = j0Var.K;
                        if (q4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f50350n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            k7 k7Var = (k7) q4Var.f2060c;
                            j0 j0Var2 = (j0) q4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) q4Var.e;
                            long j11 = q4Var.f2059b;
                            ag.c cVar = (ag.c) q4Var.f2061f;
                            if (!j0Var2.L) {
                                k7Var.w2(tL_starGiftUnique2, j11, cVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f50251b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f50352s.a(z12, true);
                        return;
                    default:
                        this.f50251b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = h6.f21087ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new u5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, q("paintChatActionBackground")));
        this.containerView.addView(textView, z5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50351r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, z5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        xp xpVar = new xp(context, 18, d6Var);
        this.f50352s = xpVar;
        xpVar.getCheckBoxBase().j(true);
        xpVar.getCheckBoxBase().e = 0.9f;
        xpVar.b(i11, i11, h6.f21121k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(!this.G, false);
        z4Var.getLayout().R = new ai.h4(this, 2);
        xpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(xpVar, z5.a(18.0f, 10.0f, 0.0f, 0.0f, 0.0f, 18, 19));
        frameLayout.setBackground(new u5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), q("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f50251b;

            {
                this.f50251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f50251b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f50353w);
                            return;
                        }
                        ai.q4 q4Var = j0Var.K;
                        if (q4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f50350n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            k7 k7Var = (k7) q4Var.f2060c;
                            j0 j0Var2 = (j0) q4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) q4Var.e;
                            long j11 = q4Var.f2059b;
                            ag.c cVar = (ag.c) q4Var.f2061f;
                            if (!j0Var2.L) {
                                k7Var.w2(tL_starGiftUnique2, j11, cVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f50251b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f50352s.a(z12, true);
                        return;
                    default:
                        this.f50251b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, z5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f50354x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        u5 u5Var = new u5(imageView, this.containerView, AndroidUtilities.dp(16.0f), q("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = hh.d.f12122a;
        imageView.setBackground(new hh.c(dp3, dp4, u5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f50251b;

            {
                this.f50251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f50251b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f50353w);
                            return;
                        }
                        ai.q4 q4Var = j0Var.K;
                        if (q4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f50350n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            k7 k7Var = (k7) q4Var.f2060c;
                            j0 j0Var2 = (j0) q4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) q4Var.e;
                            long j11 = q4Var.f2059b;
                            ag.c cVar = (ag.c) q4Var.f2061f;
                            if (!j0Var2.L) {
                                k7Var.w2(tL_starGiftUnique2, j11, cVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f50251b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f50352s.a(z12, true);
                        return;
                    default:
                        this.f50251b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, z5.e(56, 56, 53));
        b6.b(frameLayout, 0.05f, 1.2f);
        b6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        qg.g0 g0Var2 = new qg.g0(this, 29);
        WeakHashMap weakHashMap = r0.i0.f44864a;
        r0.a0.i(viewGroup3, g0Var2);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onBackPressed() {
        g0 g0Var = this.f50350n;
        if (g0Var != null && g0Var.r0()) {
            g0Var.k0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        qc.a(this.container, new ah.m0(this, 11));
        s40 s40Var = s40.f30193s;
        if (s40Var.c()) {
            s40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new xc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final void p() {
        qh.i iVar = this.h;
        int i10 = iVar.f(647).f12287b;
        float inputBubbleHeight = this.f50349f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        z4 z4Var = this.f50347b;
        FrameLayout frameLayout = this.f50351r;
        z4Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - z4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - z4Var.getHeight()));
        z4Var.invalidate();
        float y3 = z4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f50354x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint q(String str) {
        Paint paint;
        d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            paint = d6Var.n("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return h6.T0("paintChatActionBackground");
    }
}
