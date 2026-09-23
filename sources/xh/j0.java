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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.xc;
import org.telegram.ui.we;
import org.telegram.ui.xn;
import w7.x5;
import w7.z5;
public final class j0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final i0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public we K;
    public boolean L;
    public final a5 f45865b;
    public final hh.l f45866c;
    public final fh.e d;
    public final ah.c e;
    public final hh.g f45867f;
    public final ph.i h;
    public final g0 f45868n;
    public final FrameLayout f45869r;
    public final op f45870s;
    public final TextView v;
    public final p6 f45871w;
    public final ImageView f45872x;
    public final Drawable f45873y;

    public j0(Context context, d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (d6) null, true, true);
        boolean z10;
        xn xnVar;
        this.f45866c = new hh.l();
        ph.i iVar = new ph.i(new d0(this, 0));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        ah.c cVar = new ah.c(obj);
        this.e = cVar;
        f0 f0Var = new f0(this, context);
        this.containerView = f0Var;
        int i10 = this.backgroundPaddingLeft;
        f0Var.setPadding(i10, 0, i10, 0);
        hh.k kVar = new hh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        cVar.f425f = kVar;
        cVar.f426g = viewGroup;
        ph.e eVar = new ph.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f41026y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = b7.e(null, this.currentAccount, j3, h6.I.q());
        this.f45873y = e;
        f0Var.V(e);
        a5 a5Var = new a5(context, this.currentAccount, d6Var);
        this.f45865b = a5Var;
        a5Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        a5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        a5Var.setLayoutBackground(new u5(a5Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        f0Var.addView(a5Var, x5.e(-2, -2, 48));
        hh.g gVar = new hh.g(context);
        this.f45867f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(cVar.c(gVar, eh.b.b(d6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(cVar.c(gVar, eh.b.b(d6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.f45868n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.f21843y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.f21838x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((xnVar = g0Var.O2) == null || !xnVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.f21749h2 = z10;
        g0Var.W0(false, false, false);
        g0Var.h1(true, false);
        g0Var.f21841y1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, x5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), x5.c(-1.0f, -1));
        this.containerView.addView(gVar, x5.c(-1.0f, -1));
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
        p6 p6Var = new p6(context, false, false, false);
        this.f45871w = p6Var;
        p6Var.setAllowCancel(true);
        p6Var.setScaleProperty(0.6f);
        p6Var.setVisibility(8);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTextColor(getThemedColor(h6.f19170y6));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setGravity(17);
        this.containerView.addView(p6Var, x5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? ugVar = new ug(R.drawable.send_plane_24, context, d6Var, false);
        this.H = ugVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        ugVar.I = dp;
        ugVar.J = dp2;
        ugVar.M = AndroidUtilities.dp(6.0f);
        ugVar.N = AndroidUtilities.dp(8.0f);
        ugVar.f28492h0 = true;
        this.containerView.addView((View) ugVar, x5.e(110, 50, 85));
        ugVar.setScrimViewBackgroundColor(getThemedColor(h6.f18789d6));
        ugVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f45790b;

            {
                this.f45790b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f45790b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f45871w);
                            return;
                        }
                        we weVar = j0Var.K;
                        if (weVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f45868n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.y3 y3Var = (yh.y3) weVar.f38602c;
                            j0 j0Var2 = (j0) weVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) weVar.e;
                            long j10 = weVar.f38601b;
                            zf.b bVar = (zf.b) weVar.f38603f;
                            if (!j0Var2.L) {
                                y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f45790b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f45870s.a(z12, true);
                        return;
                    default:
                        this.f45790b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = h6.f18884ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new u5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, x5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45869r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, x5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        op opVar = new op(context, 18, d6Var);
        this.f45870s = opVar;
        opVar.getCheckBoxBase().j(true);
        opVar.getCheckBoxBase().e = 0.9f;
        opVar.b(i11, i11, h6.f18917k7);
        opVar.setDrawUnchecked(true);
        opVar.a(!this.G, false);
        a5Var.getLayout().R = new d0(this, 1);
        opVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(opVar, x5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new u5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f45790b;

            {
                this.f45790b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f45790b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f45871w);
                            return;
                        }
                        we weVar = j0Var.K;
                        if (weVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f45868n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.y3 y3Var = (yh.y3) weVar.f38602c;
                            j0 j0Var2 = (j0) weVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) weVar.e;
                            long j10 = weVar.f38601b;
                            zf.b bVar = (zf.b) weVar.f38603f;
                            if (!j0Var2.L) {
                                y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f45790b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f45870s.a(z12, true);
                        return;
                    default:
                        this.f45790b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, x5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f45872x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        u5 u5Var = new u5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.f9992a;
        imageView.setBackground(new gh.c(dp3, dp4, u5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f45790b;

            {
                this.f45790b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f45790b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f45871w);
                            return;
                        }
                        we weVar = j0Var.K;
                        if (weVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f45868n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.y3 y3Var = (yh.y3) weVar.f38602c;
                            j0 j0Var2 = (j0) weVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) weVar.e;
                            long j10 = weVar.f38601b;
                            zf.b bVar = (zf.b) weVar.f38603f;
                            if (!j0Var2.L) {
                                y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f45790b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f45870s.a(z12, true);
                        return;
                    default:
                        this.f45790b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, x5.e(56, 56, 53));
        z5.b(frameLayout, 0.05f, 1.2f);
        z5.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        r5.d dVar = new r5.d(this, 16);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(viewGroup3, dVar);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ph.i iVar = this.h;
        int i10 = iVar.e(647).f10577b;
        float inputBubbleHeight = this.f45867f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        a5 a5Var = this.f45865b;
        FrameLayout frameLayout = this.f45869r;
        a5Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - a5Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - a5Var.getHeight()));
        a5Var.invalidate();
        float y3 = a5Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f45872x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    @Override
    public final void onBackPressed() {
        g0 g0Var = this.f45868n;
        if (g0Var != null && g0Var.u0()) {
            g0Var.n0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        qc.a(this.container, new ai.w4(this, 10));
        k40 k40Var = k40.f25505s;
        if (k40Var.c()) {
            k40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new xc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), hg.c.k(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        Paint paint;
        d6 d6Var = this.resourcesProvider;
        if (d6Var != null) {
            paint = d6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return h6.S0("paintChatActionBackground");
    }
}
