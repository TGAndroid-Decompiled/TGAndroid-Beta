package yh;

import ai.fb;
import ai.ga;
import ai.hd;
import ai.md;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zq;
import org.telegram.ui.x10;
import w7.b6;
import w7.z5;
public class h1 extends FrameLayout {
    public static final int[] f50308n0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final sg.b1 F;
    public final sg.b1 G;
    public final TextView H;
    public final TextView I;
    public final rg.n2 J;
    public final x10 K;
    public final TextView L;
    public final TextView M;
    public fb N;
    public boolean O;
    public float P;
    public d11 Q;
    public d11 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final f6 W;
    public final int f50309a;
    public sg.k f50310a0;
    public final d6 f50311b;
    public TL_stars.StarGift f50312b0;
    public final up0 f50313c;
    public boolean f50314c0;
    public final FrameLayout d;
    public boolean f50315d0;
    public final e1 e;
    public TL_stars.SavedStarGift f50316e0;
    public final i1 f50317f;
    public boolean f50318f0;
    public boolean f50319g0;
    public final h9 h;
    public boolean f50320h0;
    public boolean f50321i0;
    public sg.k f50322j0;
    public TLRPC.Document f50323k0;
    public TL_stars.SavedStarGift f50324l0;
    public xp m0;
    public final w9 f50325n;
    public final FrameLayout.LayoutParams f50326r;
    public final FrameLayout.LayoutParams f50327s;
    public final FrameLayout v;
    public final ImageView f50328w;
    public final TextView f50329x;
    public final w9 f50330y;

    public h1(Context context, int i10, d6 d6Var) {
        super(context);
        int i11;
        int i12;
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new f6(this, 0L, 320L, bs.h);
        this.f50309a = i10;
        this.f50311b = d6Var;
        b6.b(this, 0.04f, 1.5f);
        this.f50313c = new up0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e1 e1Var = new e1(frameLayout, d6Var, true);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, z5.e(-1, -1, 119));
        i1 i1Var = new i1(context);
        this.f50317f = i1Var;
        addView(i1Var, z5.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
        w9 w9Var = new w9(context);
        this.f50330y = w9Var;
        w9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams a2 = z5.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17);
        this.E = a2;
        frameLayout.addView(w9Var, a2);
        sg.b1 b1Var = new sg.b1(context, 3, d6Var);
        this.F = b1Var;
        b1Var.setImageReceiver(w9Var.getImageReceiver());
        frameLayout.addView(b1Var, z5.a(30.0f, 0.0f, 38.0f, 0.0f, 0.0f, 30, 49));
        sg.b1 b1Var2 = new sg.b1(context, 4, d6Var);
        this.G = b1Var2;
        b1Var2.setImageReceiver(w9Var.getImageReceiver());
        frameLayout.addView(b1Var2, z5.e(44, 44, 17));
        b1Var2.setAlpha(0.0f);
        b1Var2.setScaleX(0.3f);
        b1Var2.setScaleY(0.3f);
        b1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = h6.G6;
        org.telegram.ui.Cells.c1.q(i13, d6Var, textView, 17);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout, textView, z5.a(-2.0f, 0.0f, 89.0f, 0.0f, 0.0f, -1, 48), context);
        this.I = j10;
        org.telegram.ui.Cells.c1.q(i13, d6Var, j10, 17);
        j10.setTextSize(1, 12.0f);
        frameLayout.addView(j10, z5.a(-2.0f, 0.0f, 107.0f, 0.0f, 0.0f, -1, 48));
        rg.n2 n2Var = new rg.n2(this, context, 5);
        this.J = n2Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(n2Var, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 11.0f, -2, 81));
        x10 x10Var = new x10(context);
        this.K = x10Var;
        x10Var.setBackgroundColor(-16776961);
        n2Var.addView(x10Var, z5.d(0.0f, 0));
        n2Var.addView(textView2, z5.e(-2, 26, 17));
        if (h6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        x10Var.setBackground(new m1(i11));
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
        frameLayout.addView(textView3, z5.a(-2.0f, 0.0f, 161.0f, 0.0f, 8.0f, -2, 49));
        this.h = new h9((d6) null);
        w9 w9Var2 = new w9(context);
        this.f50325n = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        w9Var2.setVisibility(8);
        FrameLayout.LayoutParams a10 = z5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51);
        this.f50326r = a10;
        frameLayout.addView(w9Var2, a10);
        this.f50327s = z5.a(20.0f, 5.0f, 5.0f, 2.0f, 2.0f, 20, 51);
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
        frameLayout2.addView(imageView, z5.b(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, z5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51));
        ImageView imageView2 = new ImageView(context);
        this.f50328w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, z5.a(20.0f, 3.0f, 3.0f, 3.0f, 3.0f, 20, 51));
        TextView textView4 = new TextView(context);
        this.f50329x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, z5.a(17.0f, 4.0f, 4.0f, 0.0f, 0.0f, -2, 51));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        i1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f50316e0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(g80 g80Var, Canvas canvas, float f7, float f10, float f11) {
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
        e1 e1Var = this.e;
        e1Var.setBounds(0, 0, (int) f7, (int) f10);
        e1Var.b(canvas2, f11);
        e1Var.getPadding(this.S);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        w9 w9Var = this.f50330y;
        float f15 = f10 - f12;
        w9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        w9Var.getImageReceiver().draw(canvas2);
        if (w9Var.getImageReceiver().isLottieRunning()) {
            g80Var.invalidate();
        }
        sg.b1 b1Var = this.F;
        if (b1Var.getVisibility() == 0 && b1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f7 - b1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(b1Var.getY(), (f15 - b1Var.getMeasuredHeight()) / 2.0f, f11));
            f13 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, b1Var.getWidth(), b1Var.getHeight(), (int) (b1Var.getAlpha() * (1.0f - f11) * 255.0f), 31);
            b1Var.draw(canvas2);
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
        w9 w9Var2 = this.f50325n;
        if (w9Var2.getVisibility() == 0 && w9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            w9Var2.draw(canvas2);
            canvas2.restore();
        }
        i1 i1Var = this.f50317f;
        if (i1Var.getVisibility() == 0 && i1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = f13;
            float lerp2 = AndroidUtilities.lerp(f14, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-i1Var.getWidth(), 0.0f);
            i1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f14 = f13;
        }
        if (uniqueStarGift != null) {
            if (this.Q == null) {
                this.Q = new d11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.R == null) {
                this.R = new d11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            d11 d11Var = this.Q;
            d11Var.f25454p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            d11Var.c((f7 - this.Q.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.Q.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            d11 d11Var2 = this.R;
            d11Var2.f25454p = f7 - AndroidUtilities.dp(8.0f);
            d11Var2.c((f7 - this.R.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.R.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        rg.n2 n2Var = this.J;
        if (n2Var != null && n2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(n2Var.getX(), n2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, n2Var.getWidth(), n2Var.getHeight(), (int) (n2Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            n2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f50328w;
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
        if (this.m0 == null) {
            xp xpVar = new xp(getContext(), 21, null);
            this.m0 = xpVar;
            xpVar.b(-1, h6.f20993d6, h6.f21121k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, z5.a(24.0f, 4.0f, 4.0f, 4.0f, 4.0f, 24, 51));
        }
        this.f50325n.setVisibility(8);
        this.m0.a(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        int i10;
        float f7;
        TL_stars.SavedStarGift savedStarGift;
        float f10;
        if (this.T == z10) {
            return;
        }
        this.T = z10;
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
            scaleX.scaleY(f12).withEndAction(new f1(this, z10, 1)).start();
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
        if (!this.T && this.V && !this.f50320h0 && (savedStarGift = this.f50316e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        f(z12, z11);
        k();
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        TL_stars.SavedStarGift savedStarGift;
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        if (!z11) {
            this.W.a(z10);
        }
        invalidate();
        if (!this.T && z10 && !this.f50320h0 && (savedStarGift = this.f50316e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        float e = this.W.e(this.V);
        if (e > 0.0f) {
            this.f50313c.a(canvas, e);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        float f10;
        this.e.f(z10, z11);
        float f11 = 0.0f;
        ImageView imageView = this.f50328w;
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
            translationX.translationY(f11).setDuration(320L).setInterpolator(bs.h).start();
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
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.3f;
        sg.b1 b1Var = this.G;
        if (z11) {
            b1Var.setVisibility(0);
            ViewPropertyAnimator animate = b1Var.animate();
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
            scaleX.scaleY(f12).withEndAction(new f1(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        b1Var.setVisibility(i10);
        if (z10) {
            f11 = 1.0f;
        }
        b1Var.setAlpha(f11);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.3f;
        }
        b1Var.setScaleX(f7);
        if (z10) {
            f12 = 1.0f;
        }
        b1Var.setScaleY(f12);
    }

    public final void g(org.telegram.tgnet.tl.TL_stars.StarGift r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: yh.h1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.f50312b0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f50312b0;
        if (starGift != null) {
            return starGift.f20503id;
        }
        return 0L;
    }

    public sg.k getPremiumTier() {
        return this.f50310a0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f50316e0;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        int i10;
        float f7;
        float f10;
        int i11;
        long j10;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        float f11;
        float f12;
        fb fbVar = this.N;
        if (fbVar != null) {
            fbVar.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e((TL_stars.starGiftAttributePattern) ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        e1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        w9 w9Var = this.f50330y;
        w9Var.setTranslationY(0.0f);
        sg.b1 b1Var = this.F;
        b1Var.H = true;
        b1Var.I = false;
        b1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(h6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        b1Var.setBlendWithColor(num);
        sg.b1 b1Var2 = this.G;
        b1Var2.H = true;
        b1Var2.I = false;
        b1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(h6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        b1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f50328w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(h6.K(AndroidUtilities.dp(20.0f), h6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(h6.K(AndroidUtilities.dp(20.0f), h6.w0(h6.Oh, this.f50311b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        w9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f50324l0 == savedStarGift) {
            b1Var.setVisibility(0);
            ViewPropertyAnimator animate = b1Var.animate();
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(bs.h).withEndAction(new uf.c(17, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            b1Var.setAlpha(f7);
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            b1Var.setScaleX(f10);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            }
            b1Var.setScaleY(f13);
            if (savedStarGift.unsaved) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b1Var.setVisibility(i11);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        w9 w9Var2 = this.f50325n;
        w9Var2.setColorFilter(null);
        w9Var2.setLayoutParams(this.f50326r);
        int i15 = this.f50309a;
        if (z16 && savedStarGift.name_hidden) {
            w9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            w9Var2.setVisibility(0);
            zq a2 = hd.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f33002f = dp2;
            w9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            int i16 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
            h9 h9Var = this.h;
            if (i16 > 0) {
                TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    w9Var2.setVisibility(0);
                    h9Var.r(user);
                    w9Var2.e(user, h9Var);
                } else {
                    w9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    w9Var2.setVisibility(0);
                    h9Var.q(chat);
                    w9Var2.e(chat, h9Var);
                } else {
                    w9Var2.setVisibility(8);
                }
            }
        }
        x10 x10Var = this.K;
        rg.n2 n2Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            yq[] yqVarArr = new yq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z12 = true;
                textView.setText(md.n1(md.V0(true, "XTR " + ((Object) md.K0(savedStarGift.gift.getResellAmount(ag.c.f636b).o(), 1.0f, ',')), 0.95f, yqVarArr, 0.0f, 1.0f), true));
            } else {
                z12 = true;
                textView.setText(md.S0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, yqVarArr));
            }
            yq yqVar = yqVarArr[0];
            if (yqVar != null) {
                yqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = h6.v(stargiftattributebackdrop.center_color | (-16777216), h6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            x10Var.setBackground(new m1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(h6.c0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) n2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) n2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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
                long j11 = starGift2.stars;
                z13 = z16;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(md.Y0(false, org.telegram.messenger.g0.h(Math.max(j11, j12), ',', sb2), 0.66f, null));
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
            x10Var.setBackground(new m1(i13));
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
            ((FrameLayout.LayoutParams) n2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) n2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f50324l0 = savedStarGift;
        this.f50322j0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f50316e0;
        this.f50310a0 = null;
        this.f50312b0 = null;
        this.f50315d0 = false;
        this.f50316e0 = savedStarGift;
        this.f50318f0 = false;
        this.f50319g0 = false;
        this.f50320h0 = z11;
        this.Q = null;
        this.R = null;
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
        k();
        if (savedStarGift2 != savedStarGift) {
            return false;
        }
        return z12;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        w9 w9Var = this.f50330y;
        if (document == null) {
            w9Var.b();
            this.f50323k0 = null;
        } else if (this.f50323k0 == document) {
        } else {
            this.f50323k0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            w9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, h6.f20935a7, 0.3f), tLObject);
        }
    }

    public final void j(boolean z10, boolean z11, float f7) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String h;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        boolean z12;
        if (this.P != f7) {
            this.P = f7;
            TL_stars.TL_starGiftUnique uniqueStarGift2 = getUniqueStarGift();
            ColorMatrixColorFilter colorMatrixColorFilter = null;
            if (uniqueStarGift2 == null) {
                stargiftattributebackdrop = null;
            } else {
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ga.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            }
            if (stargiftattributebackdrop == null) {
                i10 = -11184811;
            } else {
                i10 = stargiftattributebackdrop.pattern_color | (-16777216);
            }
            float f10 = 1.0f - f7;
            if (f7 > 0.0f) {
                colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{f10, 0.0f, 0.0f, 0.0f, Color.red(i10) * f7, 0.0f, f10, 0.0f, 0.0f, Color.green(i10) * f7, 0.0f, 0.0f, f10, 0.0f, Color.blue(i10) * f7, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f7), 0.0f});
            }
            w9 w9Var = this.f50330y;
            w9Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = w9Var.getImageReceiver();
            int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            imageReceiver.setAllowStartLottieAnimation(z12);
            if (i11 > 0) {
                w9Var.getImageReceiver().stopAnimation();
                uj0 lottieAnimation = w9Var.getImageReceiver().getLottieAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.N(0, false, false);
                }
            }
            w9Var.invalidate();
        }
        if (this.O != z10) {
            this.O = z10;
            if (getUniqueStarGift() != null) {
                if (z10) {
                    h = LocaleController.getString(R.string.WalletGiftOnCard);
                } else {
                    h = org.telegram.messenger.g0.h(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                i1 i1Var = this.f50317f;
                if (z11) {
                    i1Var.getClass();
                    i1Var.f50343b = h;
                    i1Var.f50342a.g(10, h);
                    return;
                }
                i1Var.b(h, true);
            }
        }
    }

    public final void k() {
        TL_stars.SavedStarGift savedStarGift = this.f50316e0;
        d6 d6Var = this.f50311b;
        i1 i1Var = this.f50317f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                i1Var.setVisibility(0);
                if (this.f50316e0.gift.resell_amount != null) {
                    int v = h6.v(h6.w0(h6.f20993d6, d6Var), h6.m1(0.04f, h6.w0(h6.G6, d6Var)));
                    i1Var.setColor(h6.w0(h6.uj, d6Var));
                    i1Var.setStrokeColor(v);
                    i1Var.setBackdrop(null);
                    i1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                i1Var.setColor(h6.w0(h6.Li, d6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ga.l(this.f50316e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                i1Var.b(org.telegram.messenger.g0.h(this.f50316e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                i1Var.setVisibility(0);
                i1Var.setColor(h6.w0(h6.Li, d6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop(null);
                i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f50316e0.gift.availability_total, 0)), true);
                return;
            } else {
                i1Var.setBackdrop(null);
                i1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.f50312b0;
        if (starGift2 != null) {
            if (!this.f50319g0 && !this.f50321i0) {
                if (this.f50318f0 && starGift2.availability_resale > 0) {
                    i1Var.setVisibility(0);
                    i1Var.setColor(h6.w0(h6.uj, d6Var));
                    i1Var.setStrokeColor(0);
                    i1Var.setBackdrop(null);
                    i1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f50315d0) {
                    i1Var.setVisibility(0);
                    i1Var.setColor(h6.w0(h6.Li, d6Var));
                    i1Var.setStrokeColor(0);
                    i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ga.l(this.f50312b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f50312b0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        i1Var.setVisibility(0);
                        i1Var.setColor(h6.w0(h6.Mi, d6Var));
                        i1Var.setStrokeColor(0);
                        i1Var.setBackdrop(null);
                        i1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        i1Var.setVisibility(0);
                        i1Var.setBackdrop(null);
                        i1Var.a(-2650077, -4227818);
                        i1Var.setStrokeColor(0);
                        if (this.f50312b0.auction_start_date > ConnectionsManager.getInstance(this.f50309a).getCurrentTime()) {
                            i1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            i1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        i1Var.setVisibility(0);
                        i1Var.setBackdrop(null);
                        i1Var.a(-2650077, -4227818);
                        i1Var.setStrokeColor(0);
                        i1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z10) {
                        i1Var.setVisibility(0);
                        i1Var.setColor(h6.w0(h6.Li, d6Var));
                        i1Var.setStrokeColor(0);
                        i1Var.setBackdrop(null);
                        i1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        i1Var.setBackdrop(null);
                        i1Var.setStrokeColor(0);
                        i1Var.setVisibility(8);
                        return;
                    }
                }
            }
            i1Var.setVisibility(0);
            i1Var.setColor(h6.w0(h6.Li, d6Var));
            i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ga.l(this.f50312b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i1Var.setStrokeColor(0);
            i1Var.b(org.telegram.messenger.g0.h(this.f50312b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        sg.k kVar = this.f50310a0;
        if (kVar != null) {
            if (kVar.b() > 0) {
                i1Var.setVisibility(0);
                i1Var.setBackdrop(null);
                i1Var.a(-2535425, -8229377);
                i1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.f50310a0.b()));
                i1Var.f50343b = formatString;
                i1Var.f50342a.f(12, formatString, true);
                return;
            }
            i1Var.setVisibility(8);
            i1Var.setBackdrop(null);
            i1Var.setStrokeColor(0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: yh.h1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.f50330y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        i1 i1Var = this.f50317f;
        i1Var.setColor(i10);
        i1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f50317f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        i1 i1Var = this.f50317f;
        i1Var.setVisibility(0);
        i1Var.setColor(h6.w0(h6.Li, this.f50311b));
        i1Var.setStrokeColor(0);
        i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ga.l(this.f50312b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
