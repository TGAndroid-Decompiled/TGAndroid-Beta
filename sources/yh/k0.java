package yh;

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
import di.a7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.zc;
import org.telegram.ui.df;
import org.telegram.ui.fo;
import w7.b6;
import w7.z5;
public final class k0 extends org.telegram.ui.ActionBar.e3 {
    public final int E;
    public int F;
    public boolean G;
    public final j0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public df K;
    public boolean L;
    public final y4 f48926b;
    public final ih.k f48927c;
    public final gh.e d;
    public final bh.b e;
    public final ih.f f48928f;
    public final qh.i h;
    public final h0 f48929n;
    public final FrameLayout f48930r;
    public final aq f48931s;
    public final TextView v;
    public final s6 f48932w;
    public final ImageView f48933x;
    public final Drawable f48934y;

    public k0(Context context, c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (c6) null, true, true);
        boolean z10;
        fo foVar;
        this.f48927c = new ih.k();
        qh.i iVar = new qh.i(new e0(this, 0));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j10;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        bh.b bVar = new bh.b(obj);
        this.e = bVar;
        g0 g0Var = new g0(this, context);
        this.containerView = g0Var;
        int i10 = this.backgroundPaddingLeft;
        g0Var.setPadding(i10, 0, i10, 0);
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.f2749f = jVar;
        bVar.f2750g = viewGroup;
        qh.e eVar = new qh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f43389y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = a7.e(null, this.currentAccount, j10, g6.I.q());
        this.f48934y = e;
        g0Var.V(e);
        y4 y4Var = new y4(context, this.currentAccount, c6Var);
        this.f48926b = y4Var;
        y4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        y4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        y4Var.setLayoutBackground(new t5(y4Var, this.containerView, AndroidUtilities.dp(18.0f), r("paintChatActionBackground")));
        g0Var.addView(y4Var, z5.e(-2, -2, 48));
        ih.f fVar = new ih.f(context);
        this.f48928f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, fh.b.b(c6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, fh.b.b(c6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        h0 h0Var = new h0(this, AndroidUtilities.getActivity(), g0Var);
        this.f48929n = h0Var;
        h0Var.setInAppInsetsController(iVar);
        h0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        h0Var.f22692y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        h0Var.f22687x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((foVar = h0Var.P2) == null || !foVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.f22603i2 = z10;
        h0Var.S0(false, false, false);
        h0Var.d1(true, false);
        h0Var.f22694z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        h0Var.getSendButton().setAlpha(0.0f);
        h0Var.getEditField().setMaxLines(3);
        h0Var.setCustomWindowView(this.container);
        h0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(h0Var, z5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        this.containerView.addView(fVar.getFadeView(), z5.d(-1.0f, -1));
        this.containerView.addView(fVar, z5.d(-1.0f, -1));
        h0Var.setDelegate(new i0(this, tL_starGiftUnique));
        rf rfVar = h0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = rfVar.getFilters();
        if (filters == null) {
            rfVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            rfVar.setFilters(inputFilterArr);
        }
        s6 s6Var = new s6(context, false, false, false);
        this.f48932w = s6Var;
        s6Var.setAllowCancel(true);
        s6Var.setScaleProperty(0.6f);
        s6Var.setVisibility(8);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTextColor(getThemedColor(g6.f19988y6));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(17);
        this.containerView.addView(s6Var, z5.a(20.0f, 3.0f, 0.0f, 3.0f, 54.0f, 56, 85));
        ?? wgVar = new wg(R.drawable.send_plane_24, context, c6Var, false);
        this.H = wgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        wgVar.I = dp;
        wgVar.J = dp2;
        wgVar.M = AndroidUtilities.dp(6.0f);
        wgVar.N = AndroidUtilities.dp(8.0f);
        wgVar.f30557h0 = true;
        this.containerView.addView((View) wgVar, z5.e(110, 50, 85));
        wgVar.setScrimViewBackgroundColor(getThemedColor(g6.f19601d6));
        wgVar.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f48854b;

            {
                this.f48854b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f48854b;
                        if (k0Var.E - k0Var.F < 0) {
                            AndroidUtilities.shakeView(k0Var.f48932w);
                            return;
                        }
                        df dfVar = k0Var.K;
                        if (dfVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f48929n.getTextWithEntities();
                            boolean z11 = k0Var.G;
                            zh.r3 r3Var = (zh.r3) dfVar.f34975c;
                            k0 k0Var2 = (k0) dfVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) dfVar.e;
                            long j11 = dfVar.f34974b;
                            ag.b bVar2 = (ag.b) dfVar.f34976f;
                            if (!k0Var2.L) {
                                r3Var.d2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, k0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f48854b;
                        boolean z12 = k0Var3.G;
                        k0Var3.G = !z12;
                        k0Var3.f48931s.a(z12, true);
                        return;
                    default:
                        this.f48854b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = g6.f19695ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new t5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, r("paintChatActionBackground")));
        this.containerView.addView(textView, z5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48930r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, z5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        aq aqVar = new aq(context, 18, c6Var);
        this.f48931s = aqVar;
        aqVar.getCheckBoxBase().j(true);
        aqVar.getCheckBoxBase().e = 0.9f;
        aqVar.b(i11, i11, g6.f19729k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(!this.G, false);
        y4Var.getLayout().R = new e0(this, 1);
        aqVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(aqVar, z5.a(18.0f, 10.0f, 0.0f, 0.0f, 0.0f, 18, 19));
        frameLayout.setBackground(new t5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f48854b;

            {
                this.f48854b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f48854b;
                        if (k0Var.E - k0Var.F < 0) {
                            AndroidUtilities.shakeView(k0Var.f48932w);
                            return;
                        }
                        df dfVar = k0Var.K;
                        if (dfVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f48929n.getTextWithEntities();
                            boolean z11 = k0Var.G;
                            zh.r3 r3Var = (zh.r3) dfVar.f34975c;
                            k0 k0Var2 = (k0) dfVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) dfVar.e;
                            long j11 = dfVar.f34974b;
                            ag.b bVar2 = (ag.b) dfVar.f34976f;
                            if (!k0Var2.L) {
                                r3Var.d2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, k0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f48854b;
                        boolean z12 = k0Var3.G;
                        k0Var3.G = !z12;
                        k0Var3.f48931s.a(z12, true);
                        return;
                    default:
                        this.f48854b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, z5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f48933x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        t5 t5Var = new t5(imageView, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = hh.d.f10815a;
        imageView.setBackground(new hh.c(dp3, dp4, t5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f48854b;

            {
                this.f48854b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f48854b;
                        if (k0Var.E - k0Var.F < 0) {
                            AndroidUtilities.shakeView(k0Var.f48932w);
                            return;
                        }
                        df dfVar = k0Var.K;
                        if (dfVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f48929n.getTextWithEntities();
                            boolean z11 = k0Var.G;
                            zh.r3 r3Var = (zh.r3) dfVar.f34975c;
                            k0 k0Var2 = (k0) dfVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) dfVar.e;
                            long j11 = dfVar.f34974b;
                            ag.b bVar2 = (ag.b) dfVar.f34976f;
                            if (!k0Var2.L) {
                                r3Var.d2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, k0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f48854b;
                        boolean z12 = k0Var3.G;
                        k0Var3.G = !z12;
                        k0Var3.f48931s.a(z12, true);
                        return;
                    default:
                        this.f48854b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, z5.e(56, 56, 53));
        b6.b(frameLayout, 0.05f, 1.2f);
        b6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        rg.b0 b0Var = new rg.b0(this, 20);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(viewGroup3, b0Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onBackPressed() {
        h0 h0Var = this.f48929n;
        if (h0Var != null && h0Var.r0()) {
            h0Var.k0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        sc.a(this.container, new ah.m0(this, 11));
        w40 w40Var = w40.f30466s;
        if (w40Var.c()) {
            w40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new zc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final void q() {
        qh.i iVar = this.h;
        int i10 = iVar.f(647).f10893b;
        float inputBubbleHeight = this.f48928f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        y4 y4Var = this.f48926b;
        FrameLayout frameLayout = this.f48930r;
        y4Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - y4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - y4Var.getHeight()));
        y4Var.invalidate();
        float y3 = y4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f48933x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint r(String str) {
        Paint paint;
        c6 c6Var = this.resourcesProvider;
        if (c6Var != null) {
            paint = c6Var.F("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return g6.T0("paintChatActionBackground");
    }
}
