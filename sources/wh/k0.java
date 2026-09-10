package wh;

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
import bi.e8;
import bi.rd;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xg;
import org.telegram.ui.eo;
import org.telegram.ui.ze;
import w7.a6;
import w7.c6;
public final class k0 extends org.telegram.ui.ActionBar.h3 {
    public final int E;
    public int F;
    public boolean G;
    public final j0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public ze K;
    public boolean L;
    public final z4 f44162b;
    public final gh.l f44163c;
    public final eh.e d;
    public final zg.a e;
    public final gh.g f44164f;
    public final oh.i h;
    public final h0 f44165n;
    public final FrameLayout f44166r;
    public final tp f44167s;
    public final TextView v;
    public final o6 f44168w;
    public final ImageView f44169x;
    public final Drawable f44170y;

    public k0(Context context, f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (f6) null, true, true);
        boolean z10;
        eo eoVar;
        this.f44163c = new gh.l();
        oh.i iVar = new oh.i(new e0(this, 0));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        zg.a aVar = new zg.a(obj);
        this.e = aVar;
        g0 g0Var = new g0(this, context);
        this.containerView = g0Var;
        int i10 = this.backgroundPaddingLeft;
        g0Var.setPadding(i10, 0, i10, 0);
        gh.k kVar = new gh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar.d = kVar;
        aVar.e = viewGroup;
        oh.e eVar = new oh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f14600y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = e8.e(null, this.currentAccount, j3, j6.I.q());
        this.f44170y = e;
        g0Var.V(e);
        z4 z4Var = new z4(context, this.currentAccount, f6Var);
        this.f44162b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new w5(z4Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        g0Var.addView(z4Var, a6.e(-2, -2, 48));
        gh.g gVar = new gh.g(context);
        this.f44164f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(aVar.c(gVar, dh.c.b(f6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(aVar.c(gVar, dh.c.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        h0 h0Var = new h0(this, AndroidUtilities.getActivity(), g0Var);
        this.f44165n = h0Var;
        h0Var.setInAppInsetsController(iVar);
        h0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        h0Var.f20952x4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        h0Var.f20946w4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((eoVar = h0Var.O2) == null || !eoVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.f20864h2 = z10;
        h0Var.V0(false, false, false);
        h0Var.g1(true, false);
        h0Var.f20955y1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        h0Var.getSendButton().setAlpha(0.0f);
        h0Var.getEditField().setMaxLines(3);
        h0Var.setCustomWindowView(this.container);
        h0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(h0Var, a6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), a6.c(-1.0f, -1));
        this.containerView.addView(gVar, a6.c(-1.0f, -1));
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
        o6 o6Var = new o6(context, false, false, false);
        this.f44168w = o6Var;
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        o6Var.setVisibility(8);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(getThemedColor(j6.f18306y6));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(17);
        this.containerView.addView(o6Var, a6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? xgVar = new xg(R.drawable.send_plane_24, context, f6Var, false);
        this.H = xgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        xgVar.I = dp;
        xgVar.J = dp2;
        xgVar.M = AndroidUtilities.dp(6.0f);
        xgVar.N = AndroidUtilities.dp(8.0f);
        xgVar.f29028h0 = true;
        this.containerView.addView((View) xgVar, a6.e(110, 50, 85));
        xgVar.setScrimViewBackgroundColor(getThemedColor(j6.f17928d6));
        xgVar.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f44085b;

            {
                this.f44085b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f44085b;
                        if (k0Var.E - k0Var.F < 0) {
                            AndroidUtilities.shakeView(k0Var.f44168w);
                            return;
                        }
                        ze zeVar = k0Var.K;
                        if (zeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f44165n.getTextWithEntities();
                            boolean z11 = k0Var.G;
                            xh.x3 x3Var = (xh.x3) zeVar.f39268c;
                            k0 k0Var2 = (k0) zeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.e;
                            long j10 = zeVar.f39267b;
                            yf.b bVar = (yf.b) zeVar.f39269f;
                            if (!k0Var2.L) {
                                x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, k0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f44085b;
                        boolean z12 = k0Var3.G;
                        k0Var3.G = !z12;
                        k0Var3.f44167s.a(z12, true);
                        return;
                    default:
                        this.f44085b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = j6.f18023ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new w5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, a6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44166r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, a6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        tp tpVar = new tp(context, 18, f6Var);
        this.f44167s = tpVar;
        tpVar.getCheckBoxBase().j(true);
        tpVar.getCheckBoxBase().e = 0.9f;
        tpVar.b(i11, i11, j6.f18056k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(!this.G, false);
        z4Var.getLayout().R = new e0(this, 1);
        tpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(tpVar, a6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new w5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f44085b;

            {
                this.f44085b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f44085b;
                        if (k0Var.E - k0Var.F < 0) {
                            AndroidUtilities.shakeView(k0Var.f44168w);
                            return;
                        }
                        ze zeVar = k0Var.K;
                        if (zeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f44165n.getTextWithEntities();
                            boolean z11 = k0Var.G;
                            xh.x3 x3Var = (xh.x3) zeVar.f39268c;
                            k0 k0Var2 = (k0) zeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.e;
                            long j10 = zeVar.f39267b;
                            yf.b bVar = (yf.b) zeVar.f39269f;
                            if (!k0Var2.L) {
                                x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, k0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f44085b;
                        boolean z12 = k0Var3.G;
                        k0Var3.G = !z12;
                        k0Var3.f44167s.a(z12, true);
                        return;
                    default:
                        this.f44085b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, a6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f44169x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        w5 w5Var = new w5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = fh.d.f8290a;
        imageView.setBackground(new fh.c(dp3, dp4, w5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k0 f44085b;

            {
                this.f44085b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k0 k0Var = this.f44085b;
                        if (k0Var.E - k0Var.F < 0) {
                            AndroidUtilities.shakeView(k0Var.f44168w);
                            return;
                        }
                        ze zeVar = k0Var.K;
                        if (zeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = k0Var.f44165n.getTextWithEntities();
                            boolean z11 = k0Var.G;
                            xh.x3 x3Var = (xh.x3) zeVar.f39268c;
                            k0 k0Var2 = (k0) zeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) zeVar.e;
                            long j10 = zeVar.f39267b;
                            yf.b bVar = (yf.b) zeVar.f39269f;
                            if (!k0Var2.L) {
                                x3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, k0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        k0 k0Var3 = this.f44085b;
                        boolean z12 = k0Var3.G;
                        k0Var3.G = !z12;
                        k0Var3.f44167s.a(z12, true);
                        return;
                    default:
                        this.f44085b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, a6.e(56, 56, 53));
        c6.b(frameLayout, 0.05f, 1.2f);
        c6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        th.e eVar2 = new th.e(this, 5);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(viewGroup3, eVar2);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        oh.i iVar = this.h;
        int i10 = iVar.e(647).f10075b;
        float inputBubbleHeight = this.f44164f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        z4 z4Var = this.f44162b;
        FrameLayout frameLayout = this.f44166r;
        z4Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - z4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - z4Var.getHeight()));
        z4Var.invalidate();
        float y3 = z4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f44169x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    @Override
    public final void onBackPressed() {
        h0 h0Var = this.f44165n;
        if (h0Var != null && h0Var.t0()) {
            h0Var.m0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        pc.a(this.container, new rd(this, 7));
        t40 t40Var = t40.f27310s;
        if (t40Var.c()) {
            t40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new wc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), hc.b.l(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        Paint paint;
        f6 f6Var = this.resourcesProvider;
        if (f6Var != null) {
            paint = f6Var.F("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return j6.S0("paintChatActionBackground");
    }
}
