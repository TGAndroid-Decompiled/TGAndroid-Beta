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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zg;
import org.telegram.ui.bf;
import org.telegram.ui.eo;
import w7.w5;
import w7.y5;
public final class l0 extends org.telegram.ui.ActionBar.e3 {
    public final int E;
    public int F;
    public boolean G;
    public final k0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public bf K;
    public boolean L;
    public final z4 f51551b;
    public final hh.k f51552c;
    public final fh.e d;
    public final ah.c f51553e;
    public final hh.f f51554f;
    public final ph.i h;
    public final i0 f51555n;
    public final FrameLayout f51556r;
    public final fq f51557s;
    public final TextView v;
    public final r6 f51558w;
    public final ImageView f51559x;
    public final Drawable f51560y;

    public l0(Context context, c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (c6) null, true, true);
        boolean z10;
        eo eoVar;
        this.f51552c = new hh.k();
        ph.i iVar = new ph.i(new f0(this, 0));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j3;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        ah.c cVar = new ah.c(obj);
        this.f51553e = cVar;
        h0 h0Var = new h0(this, context);
        this.containerView = h0Var;
        int i10 = this.backgroundPaddingLeft;
        h0Var.setPadding(i10, 0, i10, 0);
        hh.j jVar = new hh.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        cVar.f547f = jVar;
        cVar.f548g = viewGroup;
        ph.e eVar = new ph.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f45763y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e7 = b7.e(null, this.currentAccount, j3, h6.I.q());
        this.f51560y = e7;
        h0Var.V(e7);
        z4 z4Var = new z4(context, this.currentAccount, c6Var);
        this.f51551b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new t5(z4Var, this.containerView, AndroidUtilities.dp(18.0f), r("paintChatActionBackground")));
        h0Var.addView(z4Var, w5.e(-2, -2, 48));
        hh.f fVar = new hh.f(context);
        this.f51554f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, eh.b.b(c6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, eh.b.b(c6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        i0 i0Var = new i0(this, AndroidUtilities.getActivity(), h0Var);
        this.f51555n = i0Var;
        i0Var.setInAppInsetsController(iVar);
        i0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        i0Var.f23628b5 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        i0Var.f23621a5 = false;
        if (!AndroidUtilities.isInMultiwindow && ((eoVar = i0Var.P2) == null || !eoVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0Var.f23670i2 = z10;
        i0Var.X0(false, false, false);
        i0Var.i1(true, false);
        i0Var.f23771z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        i0Var.getSendButton().setAlpha(0.0f);
        i0Var.getEditField().setMaxLines(3);
        i0Var.setCustomWindowView(this.container);
        i0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(i0Var, w5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        this.containerView.addView(fVar.getFadeView(), w5.d(-1.0f, -1));
        this.containerView.addView(fVar, w5.d(-1.0f, -1));
        i0Var.setDelegate(new j0(this, tL_starGiftUnique));
        uf ufVar = i0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = ufVar.getFilters();
        if (filters == null) {
            ufVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            ufVar.setFilters(inputFilterArr);
        }
        r6 r6Var = new r6(context, false, false, false);
        this.f51558w = r6Var;
        r6Var.setAllowCancel(true);
        r6Var.setScaleProperty(0.6f);
        r6Var.setVisibility(8);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTextColor(getThemedColor(h6.f20945y6));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setGravity(17);
        this.containerView.addView(r6Var, w5.a(20.0f, 3.0f, 0.0f, 3.0f, 54.0f, 56, 85));
        ?? zgVar = new zg(R.drawable.send_plane_24, context, c6Var, false);
        this.H = zgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        zgVar.I = dp;
        zgVar.J = dp2;
        zgVar.M = AndroidUtilities.dp(6.0f);
        zgVar.N = AndroidUtilities.dp(8.0f);
        zgVar.f33364h0 = true;
        this.containerView.addView((View) zgVar, w5.e(110, 50, 85));
        zgVar.setScrimViewBackgroundColor(getThemedColor(h6.f20559d6));
        zgVar.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f51473b;

            {
                this.f51473b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f51473b;
                        if (l0Var.E - l0Var.F < 0) {
                            AndroidUtilities.shakeView(l0Var.f51558w);
                            return;
                        }
                        bf bfVar = l0Var.K;
                        if (bfVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = l0Var.f51555n.getTextWithEntities();
                            boolean z11 = l0Var.G;
                            yh.s3 s3Var = (yh.s3) bfVar.f36149c;
                            l0 l0Var2 = (l0) bfVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) bfVar.f36150e;
                            long j10 = bfVar.f36148b;
                            zf.b bVar = (zf.b) bfVar.f36151f;
                            if (!l0Var2.L) {
                                s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, l0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var3 = this.f51473b;
                        boolean z12 = l0Var3.G;
                        l0Var3.G = !z12;
                        l0Var3.f51557s.a(z12, true);
                        return;
                    default:
                        this.f51473b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = h6.f20656ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new t5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, r("paintChatActionBackground")));
        this.containerView.addView(textView, w5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51556r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, w5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        fq fqVar = new fq(context, 18, c6Var);
        this.f51557s = fqVar;
        fqVar.getCheckBoxBase().j(true);
        fqVar.getCheckBoxBase().f23863e = 0.9f;
        fqVar.b(i11, i11, h6.f20688k7);
        fqVar.setDrawUnchecked(true);
        fqVar.a(!this.G, false);
        z4Var.getLayout().R = new f0(this, 1);
        fqVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(fqVar, w5.a(18.0f, 10.0f, 0.0f, 0.0f, 0.0f, 18, 19));
        frameLayout.setBackground(new t5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f51473b;

            {
                this.f51473b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f51473b;
                        if (l0Var.E - l0Var.F < 0) {
                            AndroidUtilities.shakeView(l0Var.f51558w);
                            return;
                        }
                        bf bfVar = l0Var.K;
                        if (bfVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = l0Var.f51555n.getTextWithEntities();
                            boolean z11 = l0Var.G;
                            yh.s3 s3Var = (yh.s3) bfVar.f36149c;
                            l0 l0Var2 = (l0) bfVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) bfVar.f36150e;
                            long j10 = bfVar.f36148b;
                            zf.b bVar = (zf.b) bfVar.f36151f;
                            if (!l0Var2.L) {
                                s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, l0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var3 = this.f51473b;
                        boolean z12 = l0Var3.G;
                        l0Var3.G = !z12;
                        l0Var3.f51557s.a(z12, true);
                        return;
                    default:
                        this.f51473b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, w5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f51559x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        t5 t5Var = new t5(imageView, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.f10885a;
        imageView.setBackground(new gh.c(dp3, dp4, t5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f51473b;

            {
                this.f51473b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l0 l0Var = this.f51473b;
                        if (l0Var.E - l0Var.F < 0) {
                            AndroidUtilities.shakeView(l0Var.f51558w);
                            return;
                        }
                        bf bfVar = l0Var.K;
                        if (bfVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = l0Var.f51555n.getTextWithEntities();
                            boolean z11 = l0Var.G;
                            yh.s3 s3Var = (yh.s3) bfVar.f36149c;
                            l0 l0Var2 = (l0) bfVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) bfVar.f36150e;
                            long j10 = bfVar.f36148b;
                            zf.b bVar = (zf.b) bfVar.f36151f;
                            if (!l0Var2.L) {
                                s3Var.d2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, l0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        l0 l0Var3 = this.f51473b;
                        boolean z12 = l0Var3.G;
                        l0Var3.G = !z12;
                        l0Var3.f51557s.a(z12, true);
                        return;
                    default:
                        this.f51473b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, w5.e(56, 56, 53));
        y5.b(frameLayout, 0.05f, 1.2f);
        y5.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        r5.d dVar = new r5.d(this, 16);
        WeakHashMap weakHashMap = r0.i0.f46981a;
        r0.a0.i(viewGroup3, dVar);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onBackPressed() {
        i0 i0Var = this.f51555n;
        if (i0Var != null && i0Var.u0()) {
            i0Var.n0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        sc.a(this.container, new ai.x4(this, 10));
        d50 d50Var = d50.f25245s;
        if (d50Var.c()) {
            d50Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new zc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), hg.c.k(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final void q() {
        ph.i iVar = this.h;
        int i10 = iVar.f(647).f11575b;
        float inputBubbleHeight = this.f51554f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        z4 z4Var = this.f51551b;
        FrameLayout frameLayout = this.f51556r;
        z4Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - z4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - z4Var.getHeight()));
        z4Var.invalidate();
        float y3 = z4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f51559x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint r(String str) {
        Paint paint;
        c6 c6Var = this.resourcesProvider;
        if (c6Var != null) {
            paint = c6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return h6.T0("paintChatActionBackground");
    }
}
