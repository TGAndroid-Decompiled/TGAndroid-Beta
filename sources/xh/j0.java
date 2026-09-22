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
import ci.d7;
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
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xe;
import org.telegram.ui.zn;
import w7.a6;
import w7.y5;
public final class j0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final i0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public xe K;
    public boolean L;
    public final a5 f46234b;
    public final hh.l f46235c;
    public final fh.e d;
    public final ah.c e;
    public final hh.g f46236f;
    public final ph.i h;
    public final g0 f46237n;
    public final FrameLayout f46238r;
    public final np f46239s;
    public final TextView v;
    public final o6 f46240w;
    public final ImageView f46241x;
    public final Drawable f46242y;

    public j0(Context context, f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (f6) null, true, true);
        boolean z10;
        zn znVar;
        this.f46235c = new hh.l();
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
        cVar.f422f = kVar;
        cVar.f423g = viewGroup;
        ph.e eVar = new ph.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f41397y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = d7.e(null, this.currentAccount, j3, j6.I.q());
        this.f46242y = e;
        f0Var.V(e);
        a5 a5Var = new a5(context, this.currentAccount, f6Var);
        this.f46234b = a5Var;
        a5Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        a5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        a5Var.setLayoutBackground(new v5(a5Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        f0Var.addView(a5Var, y5.e(-2, -2, 48));
        hh.g gVar = new hh.g(context);
        this.f46236f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(cVar.c(gVar, eh.b.b(f6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(cVar.c(gVar, eh.b.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.f46237n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.f22109y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.f22104x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((znVar = g0Var.P2) == null || !znVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.f22021i2 = z10;
        g0Var.U0(false, false, false);
        g0Var.f1(true, false);
        g0Var.f22111z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, y5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), y5.c(-1.0f, -1));
        this.containerView.addView(gVar, y5.c(-1.0f, -1));
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
        o6 o6Var = new o6(context, false, false, false);
        this.f46240w = o6Var;
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        o6Var.setVisibility(8);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(getThemedColor(j6.f19492y6));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(17);
        this.containerView.addView(o6Var, y5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? ugVar = new ug(R.drawable.send_plane_24, context, f6Var, false);
        this.H = ugVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        ugVar.I = dp;
        ugVar.J = dp2;
        ugVar.M = AndroidUtilities.dp(6.0f);
        ugVar.N = AndroidUtilities.dp(8.0f);
        ugVar.f28769h0 = true;
        this.containerView.addView((View) ugVar, y5.e(110, 50, 85));
        ugVar.setScrimViewBackgroundColor(getThemedColor(j6.f19109d6));
        ugVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f46159b;

            {
                this.f46159b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f46159b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f46240w);
                            return;
                        }
                        xe xeVar = j0Var.K;
                        if (xeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f46237n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.y3 y3Var = (yh.y3) xeVar.f39565c;
                            j0 j0Var2 = (j0) xeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                            long j10 = xeVar.f39564b;
                            zf.b bVar = (zf.b) xeVar.f39566f;
                            if (!j0Var2.L) {
                                y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f46159b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f46239s.a(z12, true);
                        return;
                    default:
                        this.f46159b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = j6.f19205ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new v5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, y5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46238r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, y5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        np npVar = new np(context, 18, f6Var);
        this.f46239s = npVar;
        npVar.getCheckBoxBase().j(true);
        npVar.getCheckBoxBase().e = 0.9f;
        npVar.b(i11, i11, j6.f19238k7);
        npVar.setDrawUnchecked(true);
        npVar.a(!this.G, false);
        a5Var.getLayout().R = new d0(this, 1);
        npVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(npVar, y5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new v5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f46159b;

            {
                this.f46159b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f46159b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f46240w);
                            return;
                        }
                        xe xeVar = j0Var.K;
                        if (xeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f46237n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.y3 y3Var = (yh.y3) xeVar.f39565c;
                            j0 j0Var2 = (j0) xeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                            long j10 = xeVar.f39564b;
                            zf.b bVar = (zf.b) xeVar.f39566f;
                            if (!j0Var2.L) {
                                y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f46159b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f46239s.a(z12, true);
                        return;
                    default:
                        this.f46159b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, y5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f46241x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        v5 v5Var = new v5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.f10010a;
        imageView.setBackground(new gh.c(dp3, dp4, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f46159b;

            {
                this.f46159b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f46159b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f46240w);
                            return;
                        }
                        xe xeVar = j0Var.K;
                        if (xeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f46237n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.y3 y3Var = (yh.y3) xeVar.f39565c;
                            j0 j0Var2 = (j0) xeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.e;
                            long j10 = xeVar.f39564b;
                            zf.b bVar = (zf.b) xeVar.f39566f;
                            if (!j0Var2.L) {
                                y3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f46159b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f46239s.a(z12, true);
                        return;
                    default:
                        this.f46159b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, y5.e(56, 56, 53));
        a6.b(frameLayout, 0.05f, 1.2f);
        a6.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        r5.d dVar = new r5.d(this, 16);
        WeakHashMap weakHashMap = r0.i0.f42163a;
        r0.a0.j(viewGroup3, dVar);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ph.i iVar = this.h;
        int i10 = iVar.e(647).f10593b;
        float inputBubbleHeight = this.f46236f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        a5 a5Var = this.f46234b;
        FrameLayout frameLayout = this.f46238r;
        a5Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - a5Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - a5Var.getHeight()));
        a5Var.invalidate();
        float y3 = a5Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f46241x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    @Override
    public final void onBackPressed() {
        g0 g0Var = this.f46237n;
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
        pc.a(this.container, new ai.w4(this, 10));
        j40 j40Var = j40.f25275s;
        if (j40Var.c()) {
            j40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new xc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), hg.k0.j(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        Paint paint;
        f6 f6Var = this.resourcesProvider;
        if (f6Var != null) {
            paint = f6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return j6.S0("paintChatActionBackground");
    }
}
