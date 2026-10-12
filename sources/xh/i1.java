package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.y9;
import org.telegram.ui.s50;
import w7.w5;
import w7.y5;
import yh.j7;
import yh.n5;
import yh.p7;
public class i1 extends FrameLayout {
    public static final int[] f51516l0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final rg.c1 F;
    public final rg.c1 G;
    public final TextView H;
    public final TextView I;
    public final rg.p0 J;
    public final s50 K;
    public final TextView L;
    public final TextView M;
    public e21 N;
    public r11 O;
    public r11 P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final g6 U;
    public rg.k V;
    public TL_stars.StarGift W;
    public final int f51517a;
    public boolean f51518a0;
    public final c6 f51519b;
    public boolean f51520b0;
    public final jq0 f51521c;
    public TL_stars.SavedStarGift f51522c0;
    public final FrameLayout d;
    public boolean f51523d0;
    public final f1 f51524e;
    public boolean f51525e0;
    public final j1 f51526f;
    public boolean f51527f0;
    public boolean f51528g0;
    public final j9 h;
    public rg.k f51529h0;
    public TLRPC.Document f51530i0;
    public TL_stars.SavedStarGift f51531j0;
    public fq f51532k0;
    public final y9 f51533n;
    public final FrameLayout.LayoutParams f51534r;
    public final FrameLayout.LayoutParams f51535s;
    public final FrameLayout v;
    public final ImageView f51536w;
    public final TextView f51537x;
    public final y9 f51538y;

    public i1(Context context, int i10, c6 c6Var) {
        super(context);
        int i11;
        int i12;
        this.Q = new Rect();
        this.U = new g6(this, 0L, 320L, js.h);
        this.f51517a = i10;
        this.f51519b = c6Var;
        y5.b(this, 0.04f, 1.5f);
        this.f51521c = new jq0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        f1 f1Var = new f1(frameLayout, c6Var, true);
        this.f51524e = f1Var;
        frameLayout.setBackground(f1Var);
        addView(frameLayout, w5.e(-1, -1, 119));
        j1 j1Var = new j1(context);
        this.f51526f = j1Var;
        addView(j1Var, w5.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
        y9 y9Var = new y9(context);
        this.f51538y = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams a2 = w5.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17);
        this.E = a2;
        frameLayout.addView(y9Var, a2);
        rg.c1 c1Var = new rg.c1(context, 3, c6Var);
        this.F = c1Var;
        c1Var.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var, w5.a(30.0f, 0.0f, 38.0f, 0.0f, 0.0f, 30, 49));
        rg.c1 c1Var2 = new rg.c1(context, 4, c6Var);
        this.G = c1Var2;
        c1Var2.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var2, w5.e(44, 44, 17));
        c1Var2.setAlpha(0.0f);
        c1Var2.setScaleX(0.3f);
        c1Var2.setScaleY(0.3f);
        c1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = h6.G6;
        textView.setTextColor(h6.w0(i13, c6Var));
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w5.a(-2.0f, 0.0f, 89.0f, 0.0f, 0.0f, -1, 48), context);
        this.I = g10;
        g10.setTextColor(h6.w0(i13, c6Var));
        g10.setGravity(17);
        g10.setTextSize(1, 12.0f);
        frameLayout.addView(g10, w5.a(-2.0f, 0.0f, 107.0f, 0.0f, 0.0f, -1, 48));
        rg.p0 p0Var = new rg.p0(this, context, 3);
        this.J = p0Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(p0Var, w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 11.0f, -2, 81));
        s50 s50Var = new s50(context);
        this.K = s50Var;
        s50Var.setBackgroundColor(-16776961);
        p0Var.addView(s50Var, w5.d(0.0f, 0));
        p0Var.addView(textView2, w5.e(-2, 26, 17));
        if (h6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        s50Var.setBackground(new n1(i11));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (h6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, w5.a(-2.0f, 0.0f, 161.0f, 0.0f, 8.0f, -2, 49));
        this.h = new j9((c6) null);
        y9 y9Var2 = new y9(context);
        this.f51533n = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        y9Var2.setVisibility(8);
        FrameLayout.LayoutParams a10 = w5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51);
        this.f51534r = a10;
        frameLayout.addView(y9Var2, a10);
        this.f51535s = w5.a(20.0f, 5.0f, 5.0f, 2.0f, 2.0f, 20, 51);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.v = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_limit_pin);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, w5.b(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, w5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51));
        ImageView imageView2 = new ImageView(context);
        this.f51536w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, w5.a(20.0f, 3.0f, 3.0f, 3.0f, 3.0f, 20, 51));
        TextView textView4 = new TextView(context);
        this.f51537x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, w5.a(17.0f, 4.0f, 4.0f, 0.0f, 0.0f, -2, 51));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        j1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f51522c0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(q80 q80Var, Canvas canvas, float f7, float f10, float f11) {
        float f12;
        Rect rect;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f7 / 2.0f, f10 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f12 = AndroidUtilities.dp(63.0f) * f11;
        } else {
            f12 = 0.0f;
        }
        f1 f1Var = this.f51524e;
        f1Var.setBounds(0, 0, (int) f7, (int) f10);
        f1Var.b(canvas2, f11);
        f1Var.getPadding(this.Q);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        y9 y9Var = this.f51538y;
        float f15 = f10 - f12;
        y9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        y9Var.getImageReceiver().draw(canvas2);
        if (y9Var.getImageReceiver().isLottieRunning()) {
            q80Var.invalidate();
        }
        rg.c1 c1Var = this.F;
        if (c1Var.getVisibility() == 0 && c1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f7 - c1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(c1Var.getY(), (f15 - c1Var.getMeasuredHeight()) / 2.0f, f11));
            f13 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, c1Var.getWidth(), c1Var.getHeight(), (int) (c1Var.getAlpha() * (1.0f - f11) * 255.0f), 31);
            c1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f13 = 1.0f;
        }
        FrameLayout frameLayout = this.v;
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        y9 y9Var2 = this.f51533n;
        if (y9Var2.getVisibility() == 0 && y9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            y9Var2.draw(canvas2);
            canvas2.restore();
        }
        j1 j1Var = this.f51526f;
        if (j1Var.getVisibility() == 0 && j1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = f13;
            float lerp2 = AndroidUtilities.lerp(f14, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-j1Var.getWidth(), 0.0f);
            j1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f14 = f13;
        }
        if (uniqueStarGift != null) {
            if (this.O == null) {
                this.O = new r11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.P == null) {
                this.P = new r11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            r11 r11Var = this.O;
            r11Var.f30000p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            r11Var.c((f7 - this.O.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.O.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            r11 r11Var2 = this.P;
            r11Var2.f30000p = f7 - AndroidUtilities.dp(8.0f);
            r11Var2.c((f7 - this.P.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.P.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        rg.p0 p0Var = this.J;
        if (p0Var != null && p0Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(p0Var.getX(), p0Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, p0Var.getWidth(), p0Var.getHeight(), (int) (p0Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            p0Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f51536w;
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f14 - f11) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f51532k0 == null) {
            fq fqVar = new fq(getContext(), 21, null);
            this.f51532k0 = fqVar;
            fqVar.b(-1, h6.f20560d6, h6.f20689k7);
            this.f51532k0.setDrawUnchecked(false);
            this.d.addView(this.f51532k0, w5.a(24.0f, 4.0f, 4.0f, 4.0f, 4.0f, 24, 51));
        }
        this.f51533n.setVisibility(8);
        this.f51532k0.a(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        int i10;
        float f7;
        TL_stars.SavedStarGift savedStarGift;
        float f10;
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        float f11 = 0.0f;
        boolean z12 = false;
        float f12 = 0.3f;
        FrameLayout frameLayout = this.v;
        if (z11) {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            scaleX.scaleY(f12).withEndAction(new g1(this, z10, 1)).start();
        } else {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                f11 = 1.0f;
            }
            frameLayout.setAlpha(f11);
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.3f;
            }
            frameLayout.setScaleX(f7);
            if (z10) {
                f12 = 1.0f;
            }
            frameLayout.setScaleY(f12);
        }
        if (!this.R && this.T && !this.f51527f0 && (savedStarGift = this.f51522c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        f(z12, z11);
        j();
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        TL_stars.SavedStarGift savedStarGift;
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        if (!z11) {
            this.U.a(z10);
        }
        invalidate();
        if (!this.R && z10 && !this.f51527f0 && (savedStarGift = this.f51522c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        } else {
            z12 = false;
        }
        f(z12, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float e7 = this.U.e(this.T);
        if (e7 > 0.0f) {
            this.f51521c.a(canvas, e7);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        float f10;
        this.f51524e.f(z10, z11);
        float f11 = 0.0f;
        ImageView imageView = this.f51536w;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = AndroidUtilities.dp(6.0f);
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f10);
            if (z10) {
                f11 = AndroidUtilities.dp(6.0f);
            }
            translationX.translationY(f11).setDuration(320L).setInterpolator(js.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z10) {
            f7 = AndroidUtilities.dp(6.0f);
        } else {
            f7 = 0.0f;
        }
        imageView.setTranslationX(f7);
        if (z10) {
            f11 = AndroidUtilities.dp(6.0f);
        }
        imageView.setTranslationY(f11);
    }

    public final void f(boolean z10, boolean z11) {
        float f7;
        float f10;
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.3f;
        rg.c1 c1Var = this.G;
        if (z11) {
            c1Var.setVisibility(0);
            ViewPropertyAnimator animate = c1Var.animate();
            if (z10) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            scaleX.scaleY(f12).withEndAction(new g1(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        c1Var.setVisibility(i10);
        if (z10) {
            f11 = 1.0f;
        }
        c1Var.setAlpha(f11);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.3f;
        }
        c1Var.setScaleX(f7);
        if (z10) {
            f12 = 1.0f;
        }
        c1Var.setScaleY(f12);
    }

    public final void g(org.telegram.tgnet.tl.TL_stars.StarGift r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: xh.i1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.W;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.W;
        if (starGift != null) {
            return starGift.f20032id;
        }
        return 0L;
    }

    public rg.k getPremiumTier() {
        return this.V;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f51522c0;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        int i10;
        float f7;
        float f10;
        int i11;
        long j3;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        float f11;
        float f12;
        e21 e21Var = this.N;
        if (e21Var != null) {
            e21Var.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        f1 f1Var = this.f51524e;
        f1Var.d(stargiftattributebackdrop);
        f1Var.e((TL_stars.starGiftAttributePattern) n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        f1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        y9 y9Var = this.f51538y;
        y9Var.setTranslationY(0.0f);
        rg.c1 c1Var = this.F;
        c1Var.H = true;
        c1Var.I = false;
        c1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(h6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        c1Var.setBlendWithColor(num);
        rg.c1 c1Var2 = this.G;
        c1Var2.H = true;
        c1Var2.I = false;
        c1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(h6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        c1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f51536w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(h6.K(AndroidUtilities.dp(20.0f), h6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(h6.K(AndroidUtilities.dp(20.0f), h6.w0(h6.Oh, this.f51519b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        y9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f51531j0 == savedStarGift) {
            c1Var.setVisibility(0);
            ViewPropertyAnimator animate = c1Var.animate();
            if (savedStarGift.unsaved) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (savedStarGift.unsaved) {
                f12 = 1.0f;
            } else {
                f12 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(js.h).withEndAction(new tg.y(14, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            c1Var.setAlpha(f7);
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            c1Var.setScaleX(f10);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            }
            c1Var.setScaleY(f13);
            if (savedStarGift.unsaved) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c1Var.setVisibility(i11);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        y9 y9Var2 = this.f51533n;
        y9Var2.setColorFilter(null);
        y9Var2.setLayoutParams(this.f51534r);
        int i15 = this.f51517a;
        if (z16 && savedStarGift.name_hidden) {
            y9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            y9Var2.setVisibility(0);
            hr a2 = j7.a(44, "anonymous");
            j3 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f26878e = dp;
            a2.f26879f = dp2;
            y9Var2.setImageDrawable(a2);
        } else {
            j3 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            int i16 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
            j9 j9Var = this.h;
            if (i16 > 0) {
                TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    y9Var2.setVisibility(0);
                    j9Var.r(user);
                    y9Var2.e(user, j9Var);
                } else {
                    y9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    y9Var2.setVisibility(0);
                    j9Var.q(chat);
                    y9Var2.e(chat, j9Var);
                } else {
                    y9Var2.setVisibility(8);
                }
            }
        }
        s50 s50Var = this.K;
        rg.p0 p0Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            gr[] grVarArr = new gr[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z12 = true;
                textView.setText(p7.V0(true, "XTR " + ((Object) p7.K0(savedStarGift.gift.getResellAmount(zf.b.f54676b).o(), 1.0f, ',')), 0.95f, grVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(p7.S0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, grVarArr));
            }
            gr grVar = grVarArr[0];
            if (grVar != null) {
                grVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = h6.v(stargiftattributebackdrop.center_color | (-16777216), h6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            s50Var.setBackground(new n1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(h6.c0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z13 = z16;
        } else {
            z12 = true;
            if (z10) {
                textView.setVisibility(8);
                this.E.topMargin = AndroidUtilities.dp(12.0f);
                this.E.bottomMargin = AndroidUtilities.dp(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.E;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            }
            if (z16) {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                textView.setTextSize(1, 12.0f);
                textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                z13 = z16;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j10 = starGift2.stars;
                z13 = z16;
                long j11 = savedStarGift.convert_stars;
                if (j11 <= j3) {
                    j11 = starGift2.convert_stars;
                }
                textView.setText(p7.Y0(false, hg.c.k(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            if (z13) {
                i12 = -1;
            } else if (h6.I.q()) {
                i12 = -1333971;
            } else {
                i12 = -4229632;
            }
            textView.setTextColor(i12);
            int i17 = 1088989954;
            if (z13) {
                i13 = 1090519039;
            } else if (h6.I.q()) {
                i13 = 518759725;
            } else {
                i13 = 1088989954;
            }
            s50Var.setBackground(new n1(i13));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i17 = 1090519039;
            } else if (h6.I.q()) {
                i17 = 518759725;
            }
            imageView.setBackground(h6.c0(dp3, i17));
            if (z13) {
                i14 = -1;
            } else if (h6.I.q()) {
                i14 = -1333971;
            } else {
                i14 = -4229632;
            }
            imageView.setColorFilter(i14);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f51531j0 = savedStarGift;
        this.f51529h0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f51522c0;
        this.V = null;
        this.W = null;
        this.f51520b0 = false;
        this.f51522c0 = savedStarGift;
        this.f51523d0 = false;
        this.f51525e0 = false;
        this.f51527f0 = z11;
        this.O = null;
        this.P = null;
        if (savedStarGift.pinned_to_top && (!z13 || savedStarGift.name_hidden)) {
            z14 = z12;
        } else {
            z14 = false;
        }
        if (savedStarGift2 == savedStarGift) {
            z15 = z12;
        } else {
            z15 = false;
        }
        c(z14, z15);
        j();
        if (savedStarGift2 != savedStarGift) {
            return false;
        }
        return z12;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        y9 y9Var = this.f51538y;
        if (document == null) {
            y9Var.b();
            this.f51530i0 = null;
        } else if (this.f51530i0 == document) {
        } else {
            this.f51530i0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            y9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, h6.f20504a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.f51522c0;
        c6 c6Var = this.f51519b;
        j1 j1Var = this.f51526f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                j1Var.setVisibility(0);
                if (this.f51522c0.gift.resell_amount != null) {
                    int v = h6.v(h6.w0(h6.f20560d6, c6Var), h6.m1(0.04f, h6.w0(h6.G6, c6Var)));
                    j1Var.setColor(h6.w0(h6.uj, c6Var));
                    j1Var.setStrokeColor(v);
                    j1Var.setBackdrop(null);
                    j1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                j1Var.setColor(h6.w0(h6.Li, c6Var));
                j1Var.setStrokeColor(0);
                j1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.f51522c0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                j1Var.b(hg.c.k(this.f51522c0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                j1Var.setVisibility(0);
                j1Var.setColor(h6.w0(h6.Li, c6Var));
                j1Var.setStrokeColor(0);
                j1Var.setBackdrop(null);
                j1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f51522c0.gift.availability_total, 0)), true);
                return;
            } else {
                j1Var.setBackdrop(null);
                j1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.W;
        if (starGift2 != null) {
            if (!this.f51525e0 && !this.f51528g0) {
                if (this.f51523d0 && starGift2.availability_resale > 0) {
                    j1Var.setVisibility(0);
                    j1Var.setColor(h6.w0(h6.uj, c6Var));
                    j1Var.setStrokeColor(0);
                    j1Var.setBackdrop(null);
                    j1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f51520b0) {
                    j1Var.setVisibility(0);
                    j1Var.setColor(h6.w0(h6.Li, c6Var));
                    j1Var.setStrokeColor(0);
                    j1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    j1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        j1Var.setVisibility(0);
                        j1Var.setColor(h6.w0(h6.Mi, c6Var));
                        j1Var.setStrokeColor(0);
                        j1Var.setBackdrop(null);
                        j1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        j1Var.setVisibility(0);
                        j1Var.setBackdrop(null);
                        j1Var.a(-2650077, -4227818);
                        j1Var.setStrokeColor(0);
                        if (this.W.auction_start_date > ConnectionsManager.getInstance(this.f51517a).getCurrentTime()) {
                            j1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            j1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        j1Var.setVisibility(0);
                        j1Var.setBackdrop(null);
                        j1Var.a(-2650077, -4227818);
                        j1Var.setStrokeColor(0);
                        j1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z10) {
                        j1Var.setVisibility(0);
                        j1Var.setColor(h6.w0(h6.Li, c6Var));
                        j1Var.setStrokeColor(0);
                        j1Var.setBackdrop(null);
                        j1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        j1Var.setBackdrop(null);
                        j1Var.setStrokeColor(0);
                        j1Var.setVisibility(8);
                        return;
                    }
                }
            }
            j1Var.setVisibility(0);
            j1Var.setColor(h6.w0(h6.Li, c6Var));
            j1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            j1Var.setStrokeColor(0);
            j1Var.b(hg.c.k(this.W.num, ',', new StringBuilder("#")), true);
            return;
        }
        rg.k kVar = this.V;
        if (kVar != null) {
            if (kVar.b() > 0) {
                j1Var.setVisibility(0);
                j1Var.setBackdrop(null);
                j1Var.a(-2535425, -8229377);
                j1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.V.b()));
                j1Var.f51546b = formatString;
                j1Var.f51545a.f(12, formatString, true);
                return;
            }
            j1Var.setVisibility(8);
            j1Var.setBackdrop(null);
            j1Var.setStrokeColor(0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: xh.i1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.f51538y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        j1 j1Var = this.f51526f;
        j1Var.setColor(i10);
        j1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f51526f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        j1 j1Var = this.f51526f;
        j1Var.setVisibility(0);
        j1Var.setColor(h6.w0(h6.Li, this.f51519b));
        j1Var.setStrokeColor(0);
        j1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
        j1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
