package zh;

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
import bi.h7;
import fi.o6;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zp;
import org.telegram.ui.un;
public final class i0 extends org.telegram.ui.ActionBar.k3 {
    public final int E;
    public int F;
    public boolean G;
    public final h0 H;
    public final TL_stars.TL_starGiftUnique I;
    public final long J;
    public bi.m4 K;
    public boolean L;
    public final z4 f53037b;
    public final jh.m f53038c;
    public final hh.e d;
    public final ch.b e;
    public final jh.f f53039f;
    public final rh.i h;
    public final f0 f53040n;
    public final FrameLayout f53041r;
    public final zp f53042s;
    public final TextView v;
    public final s6 f53043w;
    public final ImageView f53044x;
    public final Drawable f53045y;

    public i0(Context context, u6 u6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (u6) null, true, true);
        boolean z10;
        un unVar;
        this.f53038c = new jh.m();
        rh.i iVar = new rh.i(new bi.a4(this, 1));
        this.h = iVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.I = tL_starGiftUnique;
        this.J = j10;
        this.E = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        ?? obj = new Object();
        this.d = obj;
        ch.b bVar = new ch.b(obj);
        this.e = bVar;
        e0 e0Var = new e0(this, context);
        this.containerView = e0Var;
        int i10 = this.backgroundPaddingLeft;
        e0Var.setPadding(i10, 0, i10, 0);
        jh.k kVar = new jh.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar.f6301f = kVar;
        bVar.f6302g = viewGroup;
        rh.e eVar = new rh.e(this.container);
        ViewGroup viewGroup2 = this.containerView;
        iVar.f47628y = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = o6.e(null, this.currentAccount, j10, y6.I.q());
        this.f53045y = e;
        e0Var.U(e);
        z4 z4Var = new z4(context, this.currentAccount, u6Var);
        this.f53037b = z4Var;
        z4Var.a(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        z4Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        z4Var.setLayoutBackground(new l6(z4Var, this.containerView, AndroidUtilities.dp(18.0f), r("paintChatActionBackground")));
        e0Var.addView(z4Var, gb1.i(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.f53039f = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(iVar);
        fVar.setInputIslandBubbleDrawable(bVar.c(fVar, gh.c.b(u6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(bVar.c(fVar, gh.c.b(u6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f0 f0Var = new f0(this, AndroidUtilities.getActivity(), e0Var);
        this.f53040n = f0Var;
        f0Var.setInAppInsetsController(iVar);
        f0Var.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        f0Var.f25989y4 = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        f0Var.f25984x4 = false;
        if (!AndroidUtilities.isInMultiwindow && ((unVar = f0Var.P2) == null || !unVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0Var.f25897i2 = z10;
        f0Var.S0(false, false, false);
        f0Var.d1(true, false);
        f0Var.f25991z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        f0Var.getSendButton().setAlpha(0.0f);
        f0Var.getEditField().setMaxLines(3);
        f0Var.setCustomWindowView(this.container);
        f0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f0Var, gb1.h(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(fVar.getFadeView(), gb1.g(-1.0f, -1));
        this.containerView.addView(fVar, gb1.g(-1.0f, -1));
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
        s6 s6Var = new s6(context, false, false, false);
        this.f53043w = s6Var;
        s6Var.setAllowCancel(true);
        s6Var.setScaleProperty(0.6f);
        s6Var.setVisibility(8);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        f7.Z(s6Var, y6.f23748y6, u6Var);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(17);
        this.containerView.addView(s6Var, gb1.h(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? vgVar = new vg(R.drawable.send_plane_24, context, u6Var, false);
        this.H = vgVar;
        int dp = AndroidUtilities.dp(38.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        vgVar.I = dp;
        vgVar.J = dp2;
        vgVar.M = AndroidUtilities.dp(6.0f);
        vgVar.N = AndroidUtilities.dp(8.0f);
        vgVar.f33657h0 = true;
        this.containerView.addView((View) vgVar, gb1.i(110, 50, 85));
        vgVar.setScrimViewBackgroundColor(getThemedColor(y6.f23356d6));
        vgVar.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f52932b;

            {
                this.f52932b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f52932b;
                        if (i0Var.E - i0Var.F < 0) {
                            AndroidUtilities.shakeView(i0Var.f53043w);
                            return;
                        }
                        bi.m4 m4Var = i0Var.K;
                        if (m4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f53040n.getTextWithEntities();
                            boolean z11 = i0Var.G;
                            h7 h7Var = (h7) m4Var.f5081c;
                            i0 i0Var2 = (i0) m4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) m4Var.e;
                            long j11 = m4Var.f5080b;
                            bg.b bVar2 = (bg.b) m4Var.f5082f;
                            if (!i0Var2.L) {
                                h7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, i0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f52932b;
                        boolean z12 = i0Var3.G;
                        i0Var3.G = !z12;
                        i0Var3.f53042s.a(z12, true);
                        return;
                    default:
                        this.f52932b.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v = textView;
        int i11 = y6.f23453ic;
        org.telegram.messenger.t.r(textView, i11, u6Var, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(new l6(textView, this.containerView, AndroidUtilities.dp(23.0f) / 2, r("paintChatActionBackground")));
        this.containerView.addView(textView, gb1.i(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53041r = frameLayout;
        TextView textView2 = new TextView(context);
        f7.V(textView2, i11, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, gb1.h(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        zp zpVar = new zp(context, 18, u6Var);
        this.f53042s = zpVar;
        zpVar.getCheckBoxBase().j(true);
        zpVar.getCheckBoxBase().e = 0.9f;
        zpVar.b(i11, i11, y6.f23485k7);
        zpVar.setDrawUnchecked(true);
        zpVar.a(!this.G, false);
        z4Var.getLayout().V = new bi.a4(this, 2);
        z4Var.getLayout().U = new bi.a4(this, 3);
        zpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(zpVar, gb1.h(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new l6(frameLayout, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f52932b;

            {
                this.f52932b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f52932b;
                        if (i0Var.E - i0Var.F < 0) {
                            AndroidUtilities.shakeView(i0Var.f53043w);
                            return;
                        }
                        bi.m4 m4Var = i0Var.K;
                        if (m4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f53040n.getTextWithEntities();
                            boolean z11 = i0Var.G;
                            h7 h7Var = (h7) m4Var.f5081c;
                            i0 i0Var2 = (i0) m4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) m4Var.e;
                            long j11 = m4Var.f5080b;
                            bg.b bVar2 = (bg.b) m4Var.f5082f;
                            if (!i0Var2.L) {
                                h7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, i0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f52932b;
                        boolean z12 = i0Var3.G;
                        i0Var3.G = !z12;
                        i0Var3.f53042s.a(z12, true);
                        return;
                    default:
                        this.f52932b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout, gb1.i(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.f53044x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        l6 l6Var = new l6(imageView, this.containerView, AndroidUtilities.dp(16.0f), r("paintChatActionBackground"));
        int dp3 = AndroidUtilities.dp(32.0f);
        int dp4 = AndroidUtilities.dp(32.0f);
        Matrix matrix = ih.d.f14315a;
        imageView.setBackground(new ih.c(dp3, dp4, l6Var));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f52932b;

            {
                this.f52932b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i0 i0Var = this.f52932b;
                        if (i0Var.E - i0Var.F < 0) {
                            AndroidUtilities.shakeView(i0Var.f53043w);
                            return;
                        }
                        bi.m4 m4Var = i0Var.K;
                        if (m4Var != null) {
                            TLRPC.TL_textWithEntities textWithEntities = i0Var.f53040n.getTextWithEntities();
                            boolean z11 = i0Var.G;
                            h7 h7Var = (h7) m4Var.f5081c;
                            i0 i0Var2 = (i0) m4Var.d;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) m4Var.e;
                            long j11 = m4Var.f5080b;
                            bg.b bVar2 = (bg.b) m4Var.f5082f;
                            if (!i0Var2.L) {
                                h7Var.C2(tL_starGiftUnique2, j11, bVar2, textWithEntities, z11, i0Var2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        i0 i0Var3 = this.f52932b;
                        boolean z12 = i0Var3.G;
                        i0Var3.G = !z12;
                        i0Var3.f53042s.a(z12, true);
                        return;
                    default:
                        this.f52932b.dismiss();
                        return;
                }
            }
        });
        this.containerView.addView(imageView, gb1.i(56, 56, 53));
        gb1.c(frameLayout, 0.05f, 1.2f);
        gb1.b(imageView);
        ViewGroup viewGroup3 = this.containerView;
        x2.e eVar2 = new x2.e(this, 6);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(viewGroup3, eVar2);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onBackPressed() {
        f0 f0Var = this.f53040n;
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
        qc.a(this.container, new bh.c0(this, 12));
        u40 u40Var = u40.f33246s;
        if (u40Var.c()) {
            u40Var.b();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.J);
            StringBuilder sb2 = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            new wc(this.container, this.resourcesProvider).W(Arrays.asList(userOrChat), LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2))), null).k(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.setScrimViewBackgroundColor(getThemedColor(y6.f23356d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q() {
        rh.i iVar = this.h;
        int i10 = iVar.f(647).f13451b;
        float inputBubbleHeight = this.f53039f.getInputBubbleHeight() + iVar.d() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        z4 z4Var = this.f53037b;
        FrameLayout frameLayout = this.f53041r;
        z4Var.setTranslationY(Math.min((((AndroidUtilities.dp(36.0f) + i10) - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - z4Var.getHeight()) / 2.0f), ((((this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f)) - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - z4Var.getHeight()));
        z4Var.invalidate();
        float y3 = z4Var.getY() - AndroidUtilities.dp(33.0f);
        TextView textView = this.v;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.f53044x;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint r(String str) {
        Paint paint;
        u6 u6Var = this.resourcesProvider;
        if (u6Var != null) {
            paint = u6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return y6.U0("paintChatActionBackground");
    }
}
