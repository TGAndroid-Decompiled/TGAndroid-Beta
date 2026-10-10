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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z11;
import org.telegram.ui.q50;
import w7.x5;
import w7.z5;
import yh.j7;
import yh.m5;
import yh.p7;
public class j1 extends FrameLayout {
    public static final int[] f51339l0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final rg.c1 F;
    public final rg.c1 G;
    public final TextView H;
    public final TextView I;
    public final rg.t0 J;
    public final q50 K;
    public final TextView L;
    public final TextView M;
    public z11 N;
    public m11 O;
    public m11 P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final g6 U;
    public rg.k V;
    public TL_stars.StarGift W;
    public final int f51340a;
    public boolean f51341a0;
    public final e6 f51342b;
    public boolean f51343b0;
    public final eq0 f51344c;
    public TL_stars.SavedStarGift f51345c0;
    public final FrameLayout d;
    public boolean f51346d0;
    public final g1 f51347e;
    public boolean f51348e0;
    public final k1 f51349f;
    public boolean f51350f0;
    public boolean f51351g0;
    public final j9 h;
    public rg.k f51352h0;
    public TLRPC.Document f51353i0;
    public TL_stars.SavedStarGift f51354j0;
    public dq f51355k0;
    public final y9 f51356n;
    public final FrameLayout.LayoutParams f51357r;
    public final FrameLayout.LayoutParams f51358s;
    public final FrameLayout v;
    public final ImageView f51359w;
    public final TextView f51360x;
    public final y9 f51361y;

    public j1(Context context, int i10, e6 e6Var) {
        super(context);
        int i11;
        int i12;
        this.Q = new Rect();
        this.U = new g6(this, 0L, 320L, is.h);
        this.f51340a = i10;
        this.f51342b = e6Var;
        z5.b(this, 0.04f, 1.5f);
        this.f51344c = new eq0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        g1 g1Var = new g1(frameLayout, e6Var, true);
        this.f51347e = g1Var;
        frameLayout.setBackground(g1Var);
        addView(frameLayout, x5.e(-1, -1, 119));
        k1 k1Var = new k1(context);
        this.f51349f = k1Var;
        addView(k1Var, x5.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
        y9 y9Var = new y9(context);
        this.f51361y = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams a2 = x5.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17);
        this.E = a2;
        frameLayout.addView(y9Var, a2);
        rg.c1 c1Var = new rg.c1(context, 3, e6Var);
        this.F = c1Var;
        c1Var.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var, x5.a(30.0f, 0.0f, 38.0f, 0.0f, 0.0f, 30, 49));
        rg.c1 c1Var2 = new rg.c1(context, 4, e6Var);
        this.G = c1Var2;
        c1Var2.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var2, x5.e(44, 44, 17));
        c1Var2.setAlpha(0.0f);
        c1Var2.setScaleX(0.3f);
        c1Var2.setScaleY(0.3f);
        c1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = i6.G6;
        textView.setTextColor(i6.w0(i13, e6Var));
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, x5.a(-2.0f, 0.0f, 89.0f, 0.0f, 0.0f, -1, 48), context);
        this.I = g10;
        g10.setTextColor(i6.w0(i13, e6Var));
        g10.setGravity(17);
        g10.setTextSize(1, 12.0f);
        frameLayout.addView(g10, x5.a(-2.0f, 0.0f, 107.0f, 0.0f, 0.0f, -1, 48));
        rg.t0 t0Var = new rg.t0(this, context, 2);
        this.J = t0Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(t0Var, x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 11.0f, -2, 81));
        q50 q50Var = new q50(context);
        this.K = q50Var;
        q50Var.setBackgroundColor(-16776961);
        t0Var.addView(q50Var, x5.d(0.0f, 0));
        t0Var.addView(textView2, x5.e(-2, 26, 17));
        if (i6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        q50Var.setBackground(new o1(i11));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (i6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, x5.a(-2.0f, 0.0f, 161.0f, 0.0f, 8.0f, -2, 49));
        this.h = new j9((e6) null);
        y9 y9Var2 = new y9(context);
        this.f51356n = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        y9Var2.setVisibility(8);
        FrameLayout.LayoutParams a10 = x5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51);
        this.f51357r = a10;
        frameLayout.addView(y9Var2, a10);
        this.f51358s = x5.a(20.0f, 5.0f, 5.0f, 2.0f, 2.0f, 20, 51);
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
        frameLayout2.addView(imageView, x5.b(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, x5.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51));
        ImageView imageView2 = new ImageView(context);
        this.f51359w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, x5.a(20.0f, 3.0f, 3.0f, 3.0f, 3.0f, 20, 51));
        TextView textView4 = new TextView(context);
        this.f51360x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, x5.a(17.0f, 4.0f, 4.0f, 0.0f, 0.0f, -2, 51));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        k1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f51345c0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(o80 o80Var, Canvas canvas, float f7, float f10, float f11) {
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
        g1 g1Var = this.f51347e;
        g1Var.setBounds(0, 0, (int) f7, (int) f10);
        g1Var.b(canvas2, f11);
        g1Var.getPadding(this.Q);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        y9 y9Var = this.f51361y;
        float f15 = f10 - f12;
        y9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        y9Var.getImageReceiver().draw(canvas2);
        if (y9Var.getImageReceiver().isLottieRunning()) {
            o80Var.invalidate();
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
        y9 y9Var2 = this.f51356n;
        if (y9Var2.getVisibility() == 0 && y9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            y9Var2.draw(canvas2);
            canvas2.restore();
        }
        k1 k1Var = this.f51349f;
        if (k1Var.getVisibility() == 0 && k1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = f13;
            float lerp2 = AndroidUtilities.lerp(f14, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-k1Var.getWidth(), 0.0f);
            k1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f14 = f13;
        }
        if (uniqueStarGift != null) {
            if (this.O == null) {
                this.O = new m11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.P == null) {
                this.P = new m11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            m11 m11Var = this.O;
            m11Var.f28613p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            m11Var.c((f7 - this.O.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.O.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            m11 m11Var2 = this.P;
            m11Var2.f28613p = f7 - AndroidUtilities.dp(8.0f);
            m11Var2.c((f7 - this.P.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.P.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        rg.t0 t0Var = this.J;
        if (t0Var != null && t0Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(t0Var.getX(), t0Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, t0Var.getWidth(), t0Var.getHeight(), (int) (t0Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            t0Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f51359w;
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
        if (this.f51355k0 == null) {
            dq dqVar = new dq(getContext(), 21, null);
            this.f51355k0 = dqVar;
            dqVar.b(-1, i6.f20801d6, i6.f20930k7);
            this.f51355k0.setDrawUnchecked(false);
            this.d.addView(this.f51355k0, x5.a(24.0f, 4.0f, 4.0f, 4.0f, 4.0f, 24, 51));
        }
        this.f51356n.setVisibility(8);
        this.f51355k0.a(z10, z11);
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
            scaleX.scaleY(f12).withEndAction(new h1(this, z10, 1)).start();
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
        if (!this.R && this.T && !this.f51350f0 && (savedStarGift = this.f51345c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        if (!this.R && z10 && !this.f51350f0 && (savedStarGift = this.f51345c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
            this.f51344c.a(canvas, e7);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        float f10;
        this.f51347e.f(z10, z11);
        float f11 = 0.0f;
        ImageView imageView = this.f51359w;
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
            translationX.translationY(f11).setDuration(320L).setInterpolator(is.h).start();
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
            scaleX.scaleY(f12).withEndAction(new h1(this, z10, 0)).start();
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
        throw new UnsupportedOperationException("Method not decompiled: xh.j1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.W;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.W;
        if (starGift != null) {
            return starGift.f20269id;
        }
        return 0L;
    }

    public rg.k getPremiumTier() {
        return this.V;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f51345c0;
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
        z11 z11Var = this.N;
        if (z11Var != null) {
            z11Var.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) m5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        g1 g1Var = this.f51347e;
        g1Var.d(stargiftattributebackdrop);
        g1Var.e((TL_stars.starGiftAttributePattern) m5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        g1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        y9 y9Var = this.f51361y;
        y9Var.setTranslationY(0.0f);
        rg.c1 c1Var = this.F;
        c1Var.H = true;
        c1Var.I = false;
        c1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(i6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        c1Var.setBlendWithColor(num);
        rg.c1 c1Var2 = this.G;
        c1Var2.H = true;
        c1Var2.I = false;
        c1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(i6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        c1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f51359w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(i6.K(AndroidUtilities.dp(20.0f), i6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(i6.K(AndroidUtilities.dp(20.0f), i6.w0(i6.Oh, this.f51342b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        y9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f51354j0 == savedStarGift) {
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(is.h).withEndAction(new u2.p0(10, this, savedStarGift)).start();
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
        y9 y9Var2 = this.f51356n;
        y9Var2.setColorFilter(null);
        y9Var2.setLayoutParams(this.f51357r);
        int i15 = this.f51340a;
        if (z16 && savedStarGift.name_hidden) {
            y9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            y9Var2.setVisibility(0);
            fr a2 = j7.a(44, "anonymous");
            j3 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f26498e = dp;
            a2.f26499f = dp2;
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
        q50 q50Var = this.K;
        rg.t0 t0Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            er[] erVarArr = new er[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z12 = true;
                textView.setText(p7.V0(true, "XTR " + ((Object) p7.K0(savedStarGift.gift.getResellAmount(zf.b.f54488b).o(), 1.0f, ',')), 0.95f, erVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(p7.S0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, erVarArr));
            }
            er erVar = erVarArr[0];
            if (erVar != null) {
                erVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = i6.v(stargiftattributebackdrop.center_color | (-16777216), i6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            q50Var.setBackground(new o1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(i6.c0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) t0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) t0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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
                textView.setText(p7.Y0(false, org.telegram.messenger.q.h(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            if (z13) {
                i12 = -1;
            } else if (i6.I.q()) {
                i12 = -1333971;
            } else {
                i12 = -4229632;
            }
            textView.setTextColor(i12);
            int i17 = 1088989954;
            if (z13) {
                i13 = 1090519039;
            } else if (i6.I.q()) {
                i13 = 518759725;
            } else {
                i13 = 1088989954;
            }
            q50Var.setBackground(new o1(i13));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i17 = 1090519039;
            } else if (i6.I.q()) {
                i17 = 518759725;
            }
            imageView.setBackground(i6.c0(dp3, i17));
            if (z13) {
                i14 = -1;
            } else if (i6.I.q()) {
                i14 = -1333971;
            } else {
                i14 = -4229632;
            }
            imageView.setColorFilter(i14);
            ((FrameLayout.LayoutParams) t0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) t0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f51354j0 = savedStarGift;
        this.f51352h0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f51345c0;
        this.V = null;
        this.W = null;
        this.f51343b0 = false;
        this.f51345c0 = savedStarGift;
        this.f51346d0 = false;
        this.f51348e0 = false;
        this.f51350f0 = z11;
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
        y9 y9Var = this.f51361y;
        if (document == null) {
            y9Var.b();
            this.f51353i0 = null;
        } else if (this.f51353i0 == document) {
        } else {
            this.f51353i0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            y9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, i6.f20745a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.f51345c0;
        e6 e6Var = this.f51342b;
        k1 k1Var = this.f51349f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                k1Var.setVisibility(0);
                if (this.f51345c0.gift.resell_amount != null) {
                    int v = i6.v(i6.w0(i6.f20801d6, e6Var), i6.m1(0.04f, i6.w0(i6.G6, e6Var)));
                    k1Var.setColor(i6.w0(i6.uj, e6Var));
                    k1Var.setStrokeColor(v);
                    k1Var.setBackdrop(null);
                    k1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                k1Var.setColor(i6.w0(i6.Li, e6Var));
                k1Var.setStrokeColor(0);
                k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) m5.l(this.f51345c0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                k1Var.b(org.telegram.messenger.q.h(this.f51345c0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                k1Var.setVisibility(0);
                k1Var.setColor(i6.w0(i6.Li, e6Var));
                k1Var.setStrokeColor(0);
                k1Var.setBackdrop(null);
                k1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f51345c0.gift.availability_total, 0)), true);
                return;
            } else {
                k1Var.setBackdrop(null);
                k1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.W;
        if (starGift2 != null) {
            if (!this.f51348e0 && !this.f51351g0) {
                if (this.f51346d0 && starGift2.availability_resale > 0) {
                    k1Var.setVisibility(0);
                    k1Var.setColor(i6.w0(i6.uj, e6Var));
                    k1Var.setStrokeColor(0);
                    k1Var.setBackdrop(null);
                    k1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f51343b0) {
                    k1Var.setVisibility(0);
                    k1Var.setColor(i6.w0(i6.Li, e6Var));
                    k1Var.setStrokeColor(0);
                    k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) m5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    k1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        k1Var.setVisibility(0);
                        k1Var.setColor(i6.w0(i6.Mi, e6Var));
                        k1Var.setStrokeColor(0);
                        k1Var.setBackdrop(null);
                        k1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        k1Var.setVisibility(0);
                        k1Var.setBackdrop(null);
                        k1Var.a(-2650077, -4227818);
                        k1Var.setStrokeColor(0);
                        if (this.W.auction_start_date > ConnectionsManager.getInstance(this.f51340a).getCurrentTime()) {
                            k1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            k1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        k1Var.setVisibility(0);
                        k1Var.setBackdrop(null);
                        k1Var.a(-2650077, -4227818);
                        k1Var.setStrokeColor(0);
                        k1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z10) {
                        k1Var.setVisibility(0);
                        k1Var.setColor(i6.w0(i6.Li, e6Var));
                        k1Var.setStrokeColor(0);
                        k1Var.setBackdrop(null);
                        k1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        k1Var.setBackdrop(null);
                        k1Var.setStrokeColor(0);
                        k1Var.setVisibility(8);
                        return;
                    }
                }
            }
            k1Var.setVisibility(0);
            k1Var.setColor(i6.w0(i6.Li, e6Var));
            k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) m5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k1Var.setStrokeColor(0);
            k1Var.b(org.telegram.messenger.q.h(this.W.num, ',', new StringBuilder("#")), true);
            return;
        }
        rg.k kVar = this.V;
        if (kVar != null) {
            if (kVar.b() > 0) {
                k1Var.setVisibility(0);
                k1Var.setBackdrop(null);
                k1Var.a(-2535425, -8229377);
                k1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.V.b()));
                k1Var.f51369b = formatString;
                k1Var.f51368a.f(12, formatString, true);
                return;
            }
            k1Var.setVisibility(8);
            k1Var.setBackdrop(null);
            k1Var.setStrokeColor(0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: xh.j1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.f51361y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        k1 k1Var = this.f51349f;
        k1Var.setColor(i10);
        k1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f51349f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        k1 k1Var = this.f51349f;
        k1Var.setVisibility(0);
        k1Var.setColor(i6.w0(i6.Li, this.f51342b));
        k1Var.setStrokeColor(0);
        k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) m5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
