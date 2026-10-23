package yh;

import ai.l7;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.x5;
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
public final class i0 extends org.telegram.ui.ActionBar.h3 {
    public final int E;
    public int F;
    public boolean G;
    public final h0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public ai.r4 K;
    public boolean L;
    public final y4 f50749b;
    public final ih.m f50750c;
    public final gh.e d;
    public final bh.b e;
    public final ih.f f50751f;
    public final qh.i h;
    public final f0 f50752n;
    public final FrameLayout f50753r;
    public final xp f50754s;
    public final TextView v;
    public final q6 f50755w;
    public final ImageView f50756x;
    public final Drawable f50757y;

    public i0(Context context, g6 g6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (g6) null, true, true);
        boolean z10;
        sn snVar;
        this.f50750c = new ih.m();
        qh.i iVar = new qh.i(new ai.f4(this, 1));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j10;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        bh.b bVar = new bh.b(obj);
        this.e = bVar;
        e0 e0Var = new e0(this, context);
        this.containerView = e0Var;
        int i10 = this.backgroundPaddingLeft;
        e0Var.setPadding(i10, 0, i10, 0);
        ih.k kVar = new ih.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.f4365f = kVar;
        bVar.f4366g = viewGroup;
        qh.e eVar = new qh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f45161y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = r6.e(null, this.currentAccount, j10, k6.I.q());
        this.f50757y = e;
        e0Var.U(e);
        y4 y4Var = new y4(context, this.currentAccount, g6Var);
        this.f50749b = y4Var;
        y4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        y4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        y4Var.setLayoutBackground(new x5(y4Var, this.containerView, AndroidUtilities.dp(18.0f), s("paintChatActionBackground")));
        e0Var.addView(y4Var, z5.e(-2, -2, 48));
        ih.f fVar = new ih.f(context);
        this.f50751f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, fh.c.b(g6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, fh.c.b(g6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f0 f0Var = new f0(this, AndroidUtilities.getActivity(), e0Var);
        this.f50752n = f0Var;
        f0Var.setInAppInsetsController(iVar);
        f0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        f0Var.f24196y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        f0Var.f24191x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((snVar = f0Var.P2) == null || !snVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0Var.f24104i2 = z10;
        f0Var.S0(false, false, false);
        f0Var.d1(true, false);
        f0Var.f24198z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        f0Var.getSendButton().setAlpha(0.0f);
        f0Var.getEditField().setMaxLines(3);
        f0Var.setCustomWindowView(this.container);
        f0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f0Var, z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), z5.c(-1.0f, -1));
        this.containerView.addView(fVar, z5.c(-1.0f, -1));
        f0Var.setDelegate(new g0(this, tL_starGiftUnique));
        pf pfVar = f0Var.E0;
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
        this.f50755w = q6Var;
        q6Var.setAllowCancel(true);
        q6Var.setScaleProperty(0.6f);
        q6Var.setVisibility(8);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.r6.a0(q6Var, k6.f21571y6, g6Var);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity(17);
        this.containerView.addView(q6Var, z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? vgVar = new vg(R.drawable.send_plane_24, context, g6Var, false);
        this.H = vgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        vgVar.I = dp;
        vgVar.J = dp2;
        vgVar.M = AndroidUtilities.dp(6.0f);
        vgVar.N = AndroidUtilities.dp(8.0f);
        vgVar.f31458h0 = true;
        this.containerView.addView((View) vgVar, z5.e(110, 50, 85));
        vgVar.setScrimViewBackgroundColor(getThemedColor(k6.f21183d6));
        vgVar.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f50643b;

            {
                this.f50643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f50643b;
                        if (i0Var.E - i0Var.F < 0) {
                            AndroidUtilities.shakeView(i0Var.f50755w);
                            return;
                        }
                        ai.r4 r4Var = i0Var.K;
                        if (r4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f50752n.getTextWithEntities();
                            boolean z11 = i0Var.G;
                            l7 l7Var = (l7) r4Var.f2113c;
                            i0 i0Var2 = (i0) r4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) r4Var.e;
                            long j11 = r4Var.f2112b;
                            ag.b bVar2 = (ag.b) r4Var.f2114f;
                            if (!i0Var2.L) {
                                l7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, i0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f50643b;
                        boolean z12 = i0Var3.G;
                        i0Var3.G = !z12;
                        i0Var3.f50754s.a(z12, true);
                        return;
                    default:
                        this.f50643b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = k6.f21277ic;
        org.telegram.messenger.v0.q(textView, i11, g6Var, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new x5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, s("paintChatActionBackground")));
        this.containerView.addView(textView, z5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50753r = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        xp xpVar = new xp(context, 18, g6Var);
        this.f50754s = xpVar;
        xpVar.getCheckBoxBase().j(true);
        xpVar.getCheckBoxBase().e = 0.9f;
        xpVar.b(i11, i11, k6.f21311k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(!this.G, false);
        y4Var.getLayout().V = new ai.f4(this, 2);
        y4Var.getLayout().U = new ai.f4(this, 3);
        xpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(xpVar, z5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new x5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), s("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f50643b;

            {
                this.f50643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f50643b;
                        if (i0Var.E - i0Var.F < 0) {
                            AndroidUtilities.shakeView(i0Var.f50755w);
                            return;
                        }
                        ai.r4 r4Var = i0Var.K;
                        if (r4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f50752n.getTextWithEntities();
                            boolean z11 = i0Var.G;
                            l7 l7Var = (l7) r4Var.f2113c;
                            i0 i0Var2 = (i0) r4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) r4Var.e;
                            long j11 = r4Var.f2112b;
                            ag.b bVar2 = (ag.b) r4Var.f2114f;
                            if (!i0Var2.L) {
                                l7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, i0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f50643b;
                        boolean z12 = i0Var3.G;
                        i0Var3.G = !z12;
                        i0Var3.f50754s.a(z12, true);
                        return;
                    default:
                        this.f50643b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, z5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f50756x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        x5 x5Var = new x5(imageView, this.containerView, AndroidUtilities.dp(16.0f), s("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = hh.d.f12149a;
        imageView.setBackground(new hh.c(dp3, dp4, x5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f50643b;

            {
                this.f50643b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f50643b;
                        if (i0Var.E - i0Var.F < 0) {
                            AndroidUtilities.shakeView(i0Var.f50755w);
                            return;
                        }
                        ai.r4 r4Var = i0Var.K;
                        if (r4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f50752n.getTextWithEntities();
                            boolean z11 = i0Var.G;
                            l7 l7Var = (l7) r4Var.f2113c;
                            i0 i0Var2 = (i0) r4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) r4Var.e;
                            long j11 = r4Var.f2112b;
                            ag.b bVar2 = (ag.b) r4Var.f2114f;
                            if (!i0Var2.L) {
                                l7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, i0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f50643b;
                        boolean z12 = i0Var3.G;
                        i0Var3.G = !z12;
                        i0Var3.f50754s.a(z12, true);
                        return;
                    default:
                        this.f50643b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, z5.e(56, 56, 53));
        b6.b(frameLayout, 0.05f, 1.2f);
        b6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        qg.g0 g0Var = new qg.g0(this, 29);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(viewGroup3, g0Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onBackPressed() {
        f0 f0Var = this.f50752n;
        if (f0Var != null && f0Var.q0()) {
            f0Var.j0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        qc.a(this.container, new ah.m0(this, 11));
        s40 s40Var = s40.f30375s;
        if (s40Var.c()) {
            s40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new xc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), i2.o1.m(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.setScrimViewBackgroundColor(getThemedColor(k6.f21183d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void r() {
        qh.i iVar = this.h;
        int i10 = iVar.f(647).f12316b;
        float inputBubbleHeight = this.f50751f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        y4 y4Var = this.f50749b;
        FrameLayout frameLayout = this.f50753r;
        y4Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - y4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - y4Var.getHeight()));
        y4Var.invalidate();
        float y3 = y4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f50756x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint s(String str) {
        Paint paint;
        g6 g6Var = this.resourcesProvider;
        if (g6Var != null) {
            paint = g6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return k6.U0("paintChatActionBackground");
    }
}
