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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.a50;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xg;
import org.telegram.ui.xe;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
public final class l0 extends org.telegram.ui.ActionBar.f3 {
    public final int E;
    public int F;
    public boolean G;
    public final k0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public xe K;
    public boolean L;
    public final a5 f51330b;
    public final hh.k f51331c;
    public final fh.e d;
    public final ah.c f51332e;
    public final hh.f f51333f;
    public final ph.i h;
    public final i0 f51334n;
    public final FrameLayout f51335r;
    public final dq f51336s;
    public final TextView v;
    public final r6 f51337w;
    public final ImageView f51338x;
    public final Drawable f51339y;

    public l0(Context context, e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (e6) null, true, true);
        boolean z10;
        zn znVar;
        this.f51331c = new hh.k();
        ph.i iVar = new ph.i(new f0(this, 0));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        ah.c cVar = new ah.c(obj);
        this.f51332e = cVar;
        h0 h0Var = new h0(this, context);
        this.containerView = h0Var;
        int i10 = this.backgroundPaddingLeft;
        h0Var.setPadding(i10, 0, i10, 0);
        hh.j jVar = new hh.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        cVar.f545f = jVar;
        cVar.f546g = viewGroup;
        ph.e eVar = new ph.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f45880y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e7 = b7.e(null, this.currentAccount, j3, i6.I.q());
        this.f51339y = e7;
        h0Var.V(e7);
        a5 a5Var = new a5(context, this.currentAccount, e6Var);
        this.f51330b = a5Var;
        a5Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        a5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        a5Var.setLayoutBackground(new v5(a5Var, this.containerView, AndroidUtilities.dp(18.0f), r("paintChatActionBackground")));
        h0Var.addView(a5Var, x5.e(-2, -2, 48));
        hh.f fVar = new hh.f(context);
        this.f51333f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, eh.b.b(e6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, eh.b.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        i0 i0Var = new i0(this, AndroidUtilities.getActivity(), h0Var);
        this.f51334n = i0Var;
        i0Var.setInAppInsetsController(iVar);
        i0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        i0Var.f23993y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        i0Var.f23988x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((znVar = i0Var.P2) == null || !znVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0Var.f23905i2 = z10;
        i0Var.T0(false, false, false);
        i0Var.e1(true, false);
        i0Var.f23995z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        i0Var.getSendButton().setAlpha(0.0f);
        i0Var.getEditField().setMaxLines(3);
        i0Var.setCustomWindowView(this.container);
        i0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(i0Var, x5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        this.containerView.addView(fVar.getFadeView(), x5.d(-1.0f, -1));
        this.containerView.addView(fVar, x5.d(-1.0f, -1));
        i0Var.setDelegate(new j0(this, tL_starGiftUnique));
        sf sfVar = i0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = sfVar.getFilters();
        if (filters == null) {
            sfVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            sfVar.setFilters(inputFilterArr);
        }
        r6 r6Var = new r6(context, false, false, false);
        this.f51337w = r6Var;
        r6Var.setAllowCancel(true);
        r6Var.setScaleProperty(0.6f);
        r6Var.setVisibility(8);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTextColor(getThemedColor(i6.f21181y6));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setGravity(17);
        this.containerView.addView(r6Var, x5.a(20.0f, 3.0f, 0.0f, 3.0f, 54.0f, 56, 85));
        ?? xgVar = new xg(R.drawable.send_plane_24, context, e6Var, false);
        this.H = xgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        xgVar.I = dp;
        xgVar.J = dp2;
        xgVar.M = AndroidUtilities.dp(6.0f);
        xgVar.N = AndroidUtilities.dp(8.0f);
        xgVar.f32840h0 = true;
        this.containerView.addView((View) xgVar, x5.e(110, 50, 85));
        xgVar.setScrimViewBackgroundColor(getThemedColor(i6.f20797d6));
        xgVar.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f51225b;

            {
                this.f51225b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f51225b;
                        if (l0Var.E - l0Var.F < 0) {
                            AndroidUtilities.shakeView(l0Var.f51337w);
                            return;
                        }
                        xe xeVar = l0Var.K;
                        if (xeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = l0Var.f51334n.getTextWithEntities();
                            boolean z11 = l0Var.G;
                            yh.s3 s3Var = (yh.s3) xeVar.f44007c;
                            l0 l0Var2 = (l0) xeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.f44008e;
                            long j10 = xeVar.f44006b;
                            zf.b bVar = (zf.b) xeVar.f44009f;
                            if (!l0Var2.L) {
                                s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, l0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var3 = this.f51225b;
                        boolean z12 = l0Var3.G;
                        l0Var3.G = !z12;
                        l0Var3.f51336s.a(z12, true);
                        return;
                    default:
                        this.f51225b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = i6.f20894ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new v5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, r("paintChatActionBackground")));
        this.containerView.addView(textView, x5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51335r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, x5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        dq dqVar = new dq(context, 18, e6Var);
        this.f51336s = dqVar;
        dqVar.getCheckBoxBase().j(true);
        dqVar.getCheckBoxBase().f24086e = 0.9f;
        dqVar.b(i11, i11, i6.f20926k7);
        dqVar.setDrawUnchecked(true);
        dqVar.a(!this.G, false);
        a5Var.getLayout().R = new f0(this, 1);
        dqVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(dqVar, x5.a(18.0f, 10.0f, 0.0f, 0.0f, 0.0f, 18, 19));
        frameLayout.setBackground(new v5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f51225b;

            {
                this.f51225b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f51225b;
                        if (l0Var.E - l0Var.F < 0) {
                            AndroidUtilities.shakeView(l0Var.f51337w);
                            return;
                        }
                        xe xeVar = l0Var.K;
                        if (xeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = l0Var.f51334n.getTextWithEntities();
                            boolean z11 = l0Var.G;
                            yh.s3 s3Var = (yh.s3) xeVar.f44007c;
                            l0 l0Var2 = (l0) xeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.f44008e;
                            long j10 = xeVar.f44006b;
                            zf.b bVar = (zf.b) xeVar.f44009f;
                            if (!l0Var2.L) {
                                s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, l0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var3 = this.f51225b;
                        boolean z12 = l0Var3.G;
                        l0Var3.G = !z12;
                        l0Var3.f51336s.a(z12, true);
                        return;
                    default:
                        this.f51225b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, x5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f51338x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        v5 v5Var = new v5(imageView, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.f10887a;
        imageView.setBackground(new gh.c(dp3, dp4, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f51225b;

            {
                this.f51225b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f51225b;
                        if (l0Var.E - l0Var.F < 0) {
                            AndroidUtilities.shakeView(l0Var.f51337w);
                            return;
                        }
                        xe xeVar = l0Var.K;
                        if (xeVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = l0Var.f51334n.getTextWithEntities();
                            boolean z11 = l0Var.G;
                            yh.s3 s3Var = (yh.s3) xeVar.f44007c;
                            l0 l0Var2 = (l0) xeVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) xeVar.f44008e;
                            long j10 = xeVar.f44006b;
                            zf.b bVar = (zf.b) xeVar.f44009f;
                            if (!l0Var2.L) {
                                s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, l0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var3 = this.f51225b;
                        boolean z12 = l0Var3.G;
                        l0Var3.G = !z12;
                        l0Var3.f51336s.a(z12, true);
                        return;
                    default:
                        this.f51225b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, x5.e(56, 56, 53));
        z5.b(frameLayout, 0.05f, 1.2f);
        z5.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        r5.d dVar = new r5.d(this, 16);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(viewGroup3, dVar);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onBackPressed() {
        i0 i0Var = this.f51334n;
        if (i0Var != null && i0Var.r0()) {
            i0Var.k0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        tc.a(this.container, new ai.x4(this, 10));
        a50 a50Var = a50.f24604s;
        if (a50Var.c()) {
            a50Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new ad(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final void q() {
        ph.i iVar = this.h;
        int i10 = iVar.f(647).f11577b;
        float inputBubbleHeight = this.f51333f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        a5 a5Var = this.f51330b;
        FrameLayout frameLayout = this.f51335r;
        a5Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - a5Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - a5Var.getHeight()));
        a5Var.invalidate();
        float y3 = a5Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f51338x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint r(String str) {
        Paint paint;
        e6 e6Var = this.resourcesProvider;
        if (e6Var != null) {
            paint = e6Var.F("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return i6.T0("paintChatActionBackground");
    }
}
