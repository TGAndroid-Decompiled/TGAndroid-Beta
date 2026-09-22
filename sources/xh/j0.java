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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.we;
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
    public final z4 f45928b;
    public final hh.l f45929c;
    public final fh.e d;
    public final ah.c e;
    public final hh.g f45930f;
    public final ph.i h;
    public final g0 f45931n;
    public final FrameLayout f45932r;
    public final np f45933s;
    public final TextView v;
    public final n6 f45934w;
    public final ImageView f45935x;
    public final Drawable f45936y;

    public j0(Context context, e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (e6) null, true, true);
        boolean z10;
        bo boVar;
        this.f45929c = new hh.l();
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
        iVar.f41070y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = d7.e(null, this.currentAccount, j3, i6.I.q());
        this.f45936y = e;
        f0Var.V(e);
        z4 z4Var = new z4(context, this.currentAccount, e6Var);
        this.f45928b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new v5(z4Var, this.containerView, AndroidUtilities.dp(18.0f), p("paintChatActionBackground")));
        f0Var.addView(z4Var, x5.e(-2, -2, 48));
        hh.g gVar = new hh.g(context);
        this.f45930f = gVar;
        gVar.setClipChildren(false);
        gVar.setWindowInsetsProvider(iVar);
        gVar.setInputIslandBubbleDrawable(cVar.c(gVar, eh.b.b(e6Var), false));
        gVar.setUnderKeyboardBackgroundDrawable(cVar.c(gVar, eh.b.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = gVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = gVar.getInAppKeyboardBubbleContainer();
        g0 g0Var = new g0(this, AndroidUtilities.getActivity(), f0Var);
        this.f45931n = g0Var;
        g0Var.setInAppInsetsController(iVar);
        g0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        g0Var.f21869y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        g0Var.f21864x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((boVar = g0Var.O2) == null || !boVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.f21775h2 = z10;
        g0Var.W0(false, false, false);
        g0Var.h1(true, false);
        g0Var.f21867y1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        g0Var.getSendButton().setAlpha(0.0f);
        g0Var.getEditField().setMaxLines(3);
        g0Var.setCustomWindowView(this.container);
        g0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(g0Var, x5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(gVar.getFadeView(), x5.c(-1.0f, -1));
        this.containerView.addView(gVar, x5.c(-1.0f, -1));
        g0Var.setDelegate(new h0(this, tL_starGiftUnique));
        of ofVar = g0Var.E0;
        Object obj2 = new Object();
        InputFilter[] filters = ofVar.getFilters();
        if (filters == null) {
            ofVar.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            ofVar.setFilters(inputFilterArr);
        }
        n6 n6Var = new n6(context, false, false, false);
        this.f45934w = n6Var;
        n6Var.setAllowCancel(true);
        n6Var.setScaleProperty(0.6f);
        n6Var.setVisibility(8);
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setTextColor(getThemedColor(i6.f19215y6));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setGravity(17);
        this.containerView.addView(n6Var, x5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? tgVar = new tg(R.drawable.send_plane_24, context, e6Var, false);
        this.H = tgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        tgVar.I = dp;
        tgVar.J = dp2;
        tgVar.M = AndroidUtilities.dp(6.0f);
        tgVar.N = AndroidUtilities.dp(8.0f);
        tgVar.f28118h0 = true;
        this.containerView.addView((View) tgVar, x5.e(110, 50, 85));
        tgVar.setScrimViewBackgroundColor(getThemedColor(i6.f18834d6));
        tgVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f45830b;

            {
                this.f45830b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f45830b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f45934w);
                            return;
                        }
                        we weVar = j0Var.K;
                        if (weVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f45931n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.z3 z3Var = (yh.z3) weVar.f38857c;
                            j0 j0Var2 = (j0) weVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) weVar.e;
                            long j10 = weVar.f38856b;
                            zf.b bVar = (zf.b) weVar.f38858f;
                            if (!j0Var2.L) {
                                z3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f45830b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f45933s.a(z12, true);
                        return;
                    default:
                        this.f45830b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = i6.f18929ic;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new v5(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, p("paintChatActionBackground")));
        this.containerView.addView(textView, x5.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45932r = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, x5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        np npVar = new np(context, 18, e6Var);
        this.f45933s = npVar;
        npVar.getCheckBoxBase().j(true);
        npVar.getCheckBoxBase().e = 0.9f;
        npVar.b(i11, i11, i6.f18962k7);
        npVar.setDrawUnchecked(true);
        npVar.a(!this.G, false);
        z4Var.getLayout().R = new d0(this, 1);
        npVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(npVar, x5.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new v5(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f45830b;

            {
                this.f45830b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f45830b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f45934w);
                            return;
                        }
                        we weVar = j0Var.K;
                        if (weVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f45931n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.z3 z3Var = (yh.z3) weVar.f38857c;
                            j0 j0Var2 = (j0) weVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) weVar.e;
                            long j10 = weVar.f38856b;
                            zf.b bVar = (zf.b) weVar.f38858f;
                            if (!j0Var2.L) {
                                z3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f45830b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f45933s.a(z12, true);
                        return;
                    default:
                        this.f45830b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, x5.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f45935x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        v5 v5Var = new v5(imageView, this.containerView, AndroidUtilities.dp(16.0f), p("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = gh.d.f10006a;
        imageView.setBackground(new gh.c(dp3, dp4, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f45830b;

            {
                this.f45830b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j0 j0Var = this.f45830b;
                        if (j0Var.E - j0Var.F < 0) {
                            AndroidUtilities.shakeView(j0Var.f45934w);
                            return;
                        }
                        we weVar = j0Var.K;
                        if (weVar != null) {
                            TLRPC.TL_textWithEntities textWithEntities = j0Var.f45931n.getTextWithEntities();
                            boolean z11 = j0Var.G;
                            yh.z3 z3Var = (yh.z3) weVar.f38857c;
                            j0 j0Var2 = (j0) weVar.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) weVar.e;
                            long j10 = weVar.f38856b;
                            zf.b bVar = (zf.b) weVar.f38858f;
                            if (!j0Var2.L) {
                                z3Var.c2(tL_starGiftUnique2, j10, bVar, textWithEntities, z11, j0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        j0 j0Var3 = this.f45830b;
                        boolean z12 = j0Var3.G;
                        j0Var3.G = !z12;
                        j0Var3.f45933s.a(z12, true);
                        return;
                    default:
                        this.f45830b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, x5.e(56, 56, 53));
        z5.b(frameLayout, 0.05f, 1.2f);
        z5.a(imageView);
        ViewGroup viewGroup3 = this.containerView;
        r5.e eVar2 = new r5.e(this, 15);
        WeakHashMap weakHashMap = r0.i0.f41839a;
        r0.a0.j(viewGroup3, eVar2);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o() {
        ph.i iVar = this.h;
        int i10 = iVar.e(647).f10591b;
        float inputBubbleHeight = this.f45930f.getInputBubbleHeight() + iVar.c() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        z4 z4Var = this.f45928b;
        FrameLayout frameLayout = this.f45932r;
        z4Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - z4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - z4Var.getHeight()));
        z4Var.invalidate();
        float y3 = z4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f45935x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    @Override
    public final void onBackPressed() {
        g0 g0Var = this.f45931n;
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
        oc.a(this.container, new ai.w4(this, 10));
        j40 j40Var = j40.f25220s;
        if (j40Var.c()) {
            j40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new vc(this.container, this.resourcesProvider).V(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), hg.c.k(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    public final Paint p(String str) {
        Paint paint;
        e6 e6Var = this.resourcesProvider;
        if (e6Var != null) {
            paint = e6Var.G("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return i6.S0("paintChatActionBackground");
    }
}
