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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.v9;
import org.telegram.ui.s50;
import w7.b6;
import w7.y5;
import yh.q7;
import yh.u5;
import yh.w7;
public class j1 extends FrameLayout {
    public static final int[] f46222l0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final rg.b1 F;
    public final rg.b1 G;
    public final TextView H;
    public final TextView I;
    public final h1 J;
    public final s50 K;
    public final TextView L;
    public final TextView M;
    public h11 N;
    public u01 O;
    public u01 P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final d6 U;
    public rg.k V;
    public TL_stars.StarGift W;
    public final int f46223a;
    public boolean f46224a0;
    public final f6 f46225b;
    public boolean f46226b0;
    public final lp0 f46227c;
    public TL_stars.SavedStarGift f46228c0;
    public final FrameLayout d;
    public boolean f46229d0;
    public final f1 e;
    public boolean f46230e0;
    public final k1 f46231f;
    public boolean f46232f0;
    public boolean f46233g0;
    public final g9 h;
    public rg.k f46234h0;
    public TLRPC.Document f46235i0;
    public TL_stars.SavedStarGift f46236j0;
    public np f46237k0;
    public final v9 f46238n;
    public final FrameLayout.LayoutParams f46239r;
    public final FrameLayout.LayoutParams f46240s;
    public final FrameLayout v;
    public final ImageView f46241w;
    public final TextView f46242x;
    public final v9 f46243y;

    public j1(Context context, int i10, f6 f6Var) {
        super(context);
        int i11;
        int i12;
        this.Q = new Rect();
        this.U = new d6(this, 0L, 320L, qr.h);
        this.f46223a = i10;
        this.f46225b = f6Var;
        b6.b(this, 0.04f, 1.5f);
        this.f46227c = new lp0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        f1 f1Var = new f1(frameLayout, f6Var, true);
        this.e = f1Var;
        frameLayout.setBackground(f1Var);
        addView(frameLayout, y5.e(-1, -1, 119));
        k1 k1Var = new k1(context);
        this.f46231f = k1Var;
        addView(k1Var, y5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        v9 v9Var = new v9(context);
        this.f46243y = v9Var;
        v9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = y5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(v9Var, d);
        rg.b1 b1Var = new rg.b1(context, 3, f6Var);
        this.F = b1Var;
        b1Var.setImageReceiver(v9Var.getImageReceiver());
        frameLayout.addView(b1Var, y5.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        rg.b1 b1Var2 = new rg.b1(context, 4, f6Var);
        this.G = b1Var2;
        b1Var2.setImageReceiver(v9Var.getImageReceiver());
        frameLayout.addView(b1Var2, y5.e(44, 44, 17));
        b1Var2.setAlpha(0.0f);
        b1Var2.setScaleX(0.3f);
        b1Var2.setScaleY(0.3f);
        b1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = j6.G6;
        textView.setTextColor(j6.v0(i13, f6Var));
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, y5.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = h;
        h.setTextColor(j6.v0(i13, f6Var));
        h.setGravity(17);
        h.setTextSize(1, 12.0f);
        frameLayout.addView(h, y5.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        h1 h1Var = new h1(this, context, 0);
        this.J = h1Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(h1Var, y5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        s50 s50Var = new s50(context);
        this.K = s50Var;
        s50Var.setBackgroundColor(-16776961);
        h1Var.addView(s50Var, y5.c(0.0f, 0));
        h1Var.addView(textView2, y5.e(-2, 26, 17));
        if (j6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        s50Var.setBackground(new o1(i11));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (j6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, y5.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new g9((f6) null);
        v9 v9Var2 = new v9(context);
        this.f46238n = v9Var2;
        v9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        v9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = y5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f46239r = d10;
        frameLayout.addView(v9Var2, d10);
        this.f46240s = y5.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, y5.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, y5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46241w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, y5.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f46242x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, y5.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        k1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f46228c0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(t70 t70Var, Canvas canvas, float f7, float f10, float f11) {
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
        f1 f1Var = this.e;
        f1Var.setBounds(0, 0, (int) f7, (int) f10);
        f1Var.b(canvas2, f11);
        f1Var.getPadding(this.Q);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        v9 v9Var = this.f46243y;
        float f15 = f10 - f12;
        v9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        v9Var.getImageReceiver().draw(canvas2);
        if (v9Var.getImageReceiver().isLottieRunning()) {
            t70Var.invalidate();
        }
        rg.b1 b1Var = this.F;
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
        v9 v9Var2 = this.f46238n;
        if (v9Var2.getVisibility() == 0 && v9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            v9Var2.draw(canvas2);
            canvas2.restore();
        }
        k1 k1Var = this.f46231f;
        if (k1Var.getVisibility() == 0 && k1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-k1Var.getWidth(), 0.0f);
            k1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f14 = 1.0f;
        }
        if (uniqueStarGift != null) {
            if (this.O == null) {
                this.O = new u01(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.P == null) {
                this.P = new u01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            u01 u01Var = this.O;
            u01Var.f28503p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            u01Var.c((f7 - this.O.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.O.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            u01 u01Var2 = this.P;
            u01Var2.f28503p = f7 - AndroidUtilities.dp(8.0f);
            u01Var2.c((f7 - this.P.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.P.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        h1 h1Var = this.J;
        if (h1Var != null && h1Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(h1Var.getX(), h1Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, h1Var.getWidth(), h1Var.getHeight(), (int) (h1Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            h1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f46241w;
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
        if (this.f46237k0 == null) {
            np npVar = new np(getContext(), 21, null);
            this.f46237k0 = npVar;
            npVar.b(-1, j6.f19094d6, j6.f19223k7);
            this.f46237k0.setDrawUnchecked(false);
            this.d.addView(this.f46237k0, y5.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f46238n.setVisibility(8);
        this.f46237k0.a(z10, z11);
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
        if (!this.R && this.T && !this.f46232f0 && (savedStarGift = this.f46228c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        if (!this.R && z10 && !this.f46232f0 && (savedStarGift = this.f46228c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        float e = this.U.e(this.T);
        if (e > 0.0f) {
            this.f46227c.a(canvas, e);
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
        ImageView imageView = this.f46241w;
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
            translationX.translationY(f11).setDuration(320L).setInterpolator(qr.h).start();
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
        rg.b1 b1Var = this.G;
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
            scaleX.scaleY(f12).withEndAction(new g1(this, z10, 0)).start();
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

    public final void g(org.telegram.tgnet.tl.TL_stars.StarGift r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: xh.j1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.W;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.W;
        if (starGift != null) {
            return starGift.f18553id;
        }
        return 0L;
    }

    public rg.k getPremiumTier() {
        return this.V;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f46228c0;
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
        h11 h11Var = this.N;
        if (h11Var != null) {
            h11Var.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        f1 f1Var = this.e;
        f1Var.d(stargiftattributebackdrop);
        f1Var.e((TL_stars.starGiftAttributePattern) u5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        f1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        v9 v9Var = this.f46243y;
        v9Var.setTranslationY(0.0f);
        rg.b1 b1Var = this.F;
        b1Var.H = true;
        b1Var.I = false;
        b1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        b1Var.setBlendWithColor(num);
        rg.b1 b1Var2 = this.G;
        b1Var2.H = true;
        b1Var2.I = false;
        b1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        b1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f46241w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.v0(j6.Oh, this.f46225b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        v9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f46236j0 == savedStarGift) {
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(qr.h).withEndAction(new u2.j0(11, this, savedStarGift)).start();
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
        v9 v9Var2 = this.f46238n;
        v9Var2.setColorFilter(null);
        v9Var2.setLayoutParams(this.f46239r);
        int i15 = this.f46223a;
        if (z16 && savedStarGift.name_hidden) {
            v9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            v9Var2.setVisibility(0);
            pq a2 = q7.a(44, "anonymous");
            j3 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f27422f = dp2;
            v9Var2.setImageDrawable(a2);
        } else {
            j3 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            g9 g9Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    v9Var2.setVisibility(0);
                    g9Var.r(user);
                    v9Var2.e(user, g9Var);
                } else {
                    v9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    v9Var2.setVisibility(0);
                    g9Var.q(chat);
                    v9Var2.e(chat, g9Var);
                } else {
                    v9Var2.setVisibility(8);
                }
            }
        }
        s50 s50Var = this.K;
        h1 h1Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            oq[] oqVarArr = new oq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z12 = true;
                textView.setText(w7.U0(true, "XTR " + ((Object) w7.J0(savedStarGift.gift.getResellAmount(zf.b.f49255b).o(), 1.0f, ',')), 0.95f, oqVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(w7.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, oqVarArr));
            }
            oq oqVar = oqVarArr[0];
            if (oqVar != null) {
                oqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            s50Var.setBackground(new o1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(j6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) h1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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
                textView.setText(w7.X0(false, hg.k0.j(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            if (z13) {
                i12 = -1;
            } else if (j6.I.q()) {
                i12 = -1333971;
            } else {
                i12 = -4229632;
            }
            textView.setTextColor(i12);
            int i16 = 1088989954;
            if (z13) {
                i13 = 1090519039;
            } else if (j6.I.q()) {
                i13 = 518759725;
            } else {
                i13 = 1088989954;
            }
            s50Var.setBackground(new o1(i13));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i16 = 1090519039;
            } else if (j6.I.q()) {
                i16 = 518759725;
            }
            imageView.setBackground(j6.b0(dp3, i16));
            if (z13) {
                i14 = -1;
            } else if (j6.I.q()) {
                i14 = -1333971;
            } else {
                i14 = -4229632;
            }
            imageView.setColorFilter(i14);
            ((FrameLayout.LayoutParams) h1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f46236j0 = savedStarGift;
        this.f46234h0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f46228c0;
        this.V = null;
        this.W = null;
        this.f46226b0 = false;
        this.f46228c0 = savedStarGift;
        this.f46229d0 = false;
        this.f46230e0 = false;
        this.f46232f0 = z11;
        this.O = null;
        this.P = null;
        if (savedStarGift.pinned_to_top && (!z13 || savedStarGift.name_hidden)) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (savedStarGift2 == savedStarGift) {
            z15 = true;
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
        v9 v9Var = this.f46243y;
        if (document == null) {
            v9Var.b();
            this.f46235i0 = null;
        } else if (this.f46235i0 == document) {
        } else {
            this.f46235i0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            v9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, j6.f19038a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.f46228c0;
        f6 f6Var = this.f46225b;
        k1 k1Var = this.f46231f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                k1Var.setVisibility(0);
                if (this.f46228c0.gift.resell_amount != null) {
                    int v = j6.v(j6.v0(j6.f19094d6, f6Var), j6.l1(0.04f, j6.v0(j6.G6, f6Var)));
                    k1Var.setColor(j6.v0(j6.uj, f6Var));
                    k1Var.setStrokeColor(v);
                    k1Var.setBackdrop(null);
                    k1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                k1Var.setColor(j6.v0(j6.Li, f6Var));
                k1Var.setStrokeColor(0);
                k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u5.l(this.f46228c0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                k1Var.b(hg.k0.j(this.f46228c0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                k1Var.setVisibility(0);
                k1Var.setColor(j6.v0(j6.Li, f6Var));
                k1Var.setStrokeColor(0);
                k1Var.setBackdrop(null);
                k1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f46228c0.gift.availability_total, 0)), true);
                return;
            } else {
                k1Var.setBackdrop(null);
                k1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.W;
        if (starGift2 != null) {
            if (!this.f46230e0 && !this.f46233g0) {
                if (this.f46229d0 && starGift2.availability_resale > 0) {
                    k1Var.setVisibility(0);
                    k1Var.setColor(j6.v0(j6.uj, f6Var));
                    k1Var.setStrokeColor(0);
                    k1Var.setBackdrop(null);
                    k1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f46226b0) {
                    k1Var.setVisibility(0);
                    k1Var.setColor(j6.v0(j6.Li, f6Var));
                    k1Var.setStrokeColor(0);
                    k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    k1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        k1Var.setVisibility(0);
                        k1Var.setColor(j6.v0(j6.Mi, f6Var));
                        k1Var.setStrokeColor(0);
                        k1Var.setBackdrop(null);
                        k1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        k1Var.setVisibility(0);
                        k1Var.setBackdrop(null);
                        k1Var.a(-2650077, -4227818);
                        k1Var.setStrokeColor(0);
                        if (this.W.auction_start_date > ConnectionsManager.getInstance(this.f46223a).getCurrentTime()) {
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
                        k1Var.setColor(j6.v0(j6.Li, f6Var));
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
            k1Var.setColor(j6.v0(j6.Li, f6Var));
            k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k1Var.setStrokeColor(0);
            k1Var.b(hg.k0.j(this.W.num, ',', new StringBuilder("#")), true);
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
                k1Var.f46271b = formatString;
                k1Var.f46270a.e(12, formatString, true);
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
        this.f46243y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        k1 k1Var = this.f46231f;
        k1Var.setColor(i10);
        k1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f46231f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        k1 k1Var = this.f46231f;
        k1Var.setVisibility(0);
        k1Var.setColor(j6.v0(j6.Li, this.f46225b));
        k1Var.setStrokeColor(0);
        k1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
