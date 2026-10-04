package xh;

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
import ci.b7;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
import org.telegram.ui.ze;
import w7.b6;
import w7.z5;
public final class j0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final i0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public ze K;
    public boolean L;
    public final a5 f50022b;
    public final hh.l f50023c;
    public final fh.e d;
    public final ah.c f50024e;
    public final hh.g f50025f;
    public final ph.i h;
    public final g0 f50026n;
    public final FrameLayout f50027r;
    public final qp f50028s;
    public final TextView v;
    public final p6 f50029w;
    public final ImageView f50030x;
    public final Drawable f50031y;

    public j0(Context context, d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (d6) null, true, true);
        boolean z10;
        yn ynVar;
        this.f50023c = new hh.l();
        ph.i iVar = new ph.i(new d0(this, 0));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        ah.c cVar = new ah.c(obj);
        this.f50024e = cVar;
        f0 f0Var = new f0(this, context);
        this.containerView = f0Var;
        int i10 = this.backgroundPaddingLeft;
        f0Var.setPadding(i10, 0, i10, 0);
        hh.k kVar = new hh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        cVar.f459f = kVar;
        cVar.f460g = viewGroup;
        ph.e eVar = new ph.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f44724y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e7 = b7.e(null, this.currentAccount, j3, i6.I.q());
        this.f50031y = e7;
        f0Var.V(e7);
        a5 a5Var = new a5(context, this.currentAccount, d6Var);
        this.f50022b = a5Var;
        a5Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        a5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        a5Var.setLayoutBackground(new u5(a5Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        f0Var.addView(a5Var, z5.e(-2, -2, 48));
        hh.g gVar = new hh.g(context);
        this.f50025f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(cVar.c(gVar, eh.b.b(d6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(cVar.c(gVar, eh.b.b(d6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.f50026n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.f23990y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.f23985x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((ynVar = g0Var.P2) == null || !ynVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.f23902i2 = z10;
        g0Var.U0(false, false, false);
        g0Var.f1(true, false);
        g0Var.f23992z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), z5.c(-1.0f, -1));
        this.containerView.addView(gVar, z5.c(-1.0f, -1));
        g0Var.setDelegate(new h0(this, tL_starGiftUnique));
        rf rfVar = g0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = rfVar.getFilters();
        if (filters == null) {
            rfVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            rfVar.setFilters(inputFilterArr);
        }
        p6 p6Var = new p6(context, false, false, false);
        this.f50029w = p6Var;
        p6Var.setAllowCancel(true);
        p6Var.setScaleProperty(0.6f);
        p6Var.setVisibility(8);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTextColor(getThemedColor(i6.f21205y6));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setGravity(17);
        this.containerView.addView(p6Var, z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? wgVar = new wg(R.drawable.send_plane_24, context, d6Var, false);
        this.H = wgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        wgVar.I = dp;
        wgVar.J = dp2;
        wgVar.M = AndroidUtilities.dp(6.0f);
        wgVar.N = AndroidUtilities.dp(8.0f);
        wgVar.f32544h0 = true;
        this.containerView.addView((View) wgVar, z5.e(110, 50, 85));
        wgVar.setScrimViewBackgroundColor(getThemedColor(i6.f20818d6));
        wgVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f49923b;

            {
                this.f49923b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f49923b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f50029w);
                            return;
                        }
                        ze zeVar = j0Var.K;
                        if (zeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f50026n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.x3 x3Var = (yh.x3) zeVar.f43759c;
                            j0 j0Var2 = (j0) zeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.f43760e;
                            long j10 = zeVar.f43758b;
                            zf.b bVar = (zf.b) zeVar.f43761f;
                            if (!j0Var2.L) {
                                x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f49923b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f50028s.a(z12, true);
                        return;
                    default:
                        this.f49923b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = i6.f20915ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new u5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, z5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50027r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        qp qpVar = new qp(context, 18, d6Var);
        this.f50028s = qpVar;
        qpVar.getCheckBoxBase().j(true);
        qpVar.getCheckBoxBase().f24083e = 0.9f;
        qpVar.b(i11, i11, i6.f20948k7);
        qpVar.setDrawUnchecked(true);
        qpVar.a(!this.G, false);
        a5Var.getLayout().R = new d0(this, 1);
        qpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(qpVar, z5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new u5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f49923b;

            {
                this.f49923b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f49923b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f50029w);
                            return;
                        }
                        ze zeVar = j0Var.K;
                        if (zeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f50026n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.x3 x3Var = (yh.x3) zeVar.f43759c;
                            j0 j0Var2 = (j0) zeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.f43760e;
                            long j10 = zeVar.f43758b;
                            zf.b bVar = (zf.b) zeVar.f43761f;
                            if (!j0Var2.L) {
                                x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f49923b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f50028s.a(z12, true);
                        return;
                    default:
                        this.f49923b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, z5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f50030x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        u5 u5Var = new u5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.f10881a;
        imageView.setBackground(new gh.c(dp3, dp4, u5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f49923b;

            {
                this.f49923b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f49923b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f50029w);
                            return;
                        }
                        ze zeVar = j0Var.K;
                        if (zeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f50026n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.x3 x3Var = (yh.x3) zeVar.f43759c;
                            j0 j0Var2 = (j0) zeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.f43760e;
                            long j10 = zeVar.f43758b;
                            zf.b bVar = (zf.b) zeVar.f43761f;
                            if (!j0Var2.L) {
                                x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f49923b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f50028s.a(z12, true);
                        return;
                    default:
                        this.f49923b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, z5.e(56, 56, 53));
        b6.b(frameLayout, 0.05f, 1.2f);
        b6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        r2.s sVar = new r2.s(this, 18);
        WeakHashMap weakHashMap = r0.i0.f45596a;
        r0.a0.j(viewGroup3, sVar);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ph.i iVar = this.h;
        int i10 = iVar.e(647).f11526b;
        float inputBubbleHeight = this.f50025f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        a5 a5Var = this.f50022b;
        FrameLayout frameLayout = this.f50027r;
        a5Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - a5Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - a5Var.getHeight()));
        a5Var.invalidate();
        float y3 = a5Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f50030x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    @Override
    public final void onBackPressed() {
        g0 g0Var = this.f50026n;
        if (g0Var != null && g0Var.t0()) {
            g0Var.m0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        rc.a(this.container, new ai.w4(this, 10));
        n40 n40Var = n40.f28858s;
        if (n40Var.c()) {
            n40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new yc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        Paint paint;
        d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            paint = d6Var.H("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return i6.S0("paintChatActionBackground");
    }
}
