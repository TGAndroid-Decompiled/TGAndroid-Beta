package yh;

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
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.t50;
import w7.x5;
import w7.z5;
import zh.p7;
import zh.s5;
import zh.v7;
public class h1 extends FrameLayout {
    public static final int[] f50305l0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final sg.e1 F;
    public final sg.e1 G;
    public final TextView H;
    public final TextView I;
    public final sg.l1 J;
    public final t50 K;
    public final TextView L;
    public final TextView M;
    public s01 N;
    public f01 O;
    public f01 P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final e6 U;
    public sg.k V;
    public TL_stars.StarGift W;
    public final int f50306a;
    public boolean f50307a0;
    public final f6 f50308b;
    public boolean f50309b0;
    public final zo0 f50310c;
    public TL_stars.SavedStarGift f50311c0;
    public final FrameLayout d;
    public boolean f50312d0;
    public final e1 f50313e;
    public boolean f50314e0;
    public final i1 f50315f;
    public boolean f50316f0;
    public boolean f50317g0;
    public final i9 h;
    public sg.k f50318h0;
    public TLRPC.Document f50319i0;
    public TL_stars.SavedStarGift f50320j0;
    public mp f50321k0;
    public final x9 f50322n;
    public final FrameLayout.LayoutParams f50323r;
    public final FrameLayout.LayoutParams f50324s;
    public final FrameLayout v;
    public final ImageView f50325w;
    public final TextView f50326x;
    public final x9 f50327y;

    public h1(Context context, int i10, f6 f6Var) {
        super(context);
        int i11;
        int i12;
        this.Q = new Rect();
        this.U = new e6(this, 0L, 320L, pr.h);
        this.f50306a = i10;
        this.f50308b = f6Var;
        z5.b(this, 0.04f, 1.5f);
        this.f50310c = new zo0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e1 e1Var = new e1(frameLayout, f6Var, true);
        this.f50313e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, x5.e(-1, -1, 119));
        i1 i1Var = new i1(context);
        this.f50315f = i1Var;
        addView(i1Var, x5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        x9 x9Var = new x9(context);
        this.f50327y = x9Var;
        x9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = x5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(x9Var, d);
        sg.e1 e1Var2 = new sg.e1(context, 3, f6Var);
        this.F = e1Var2;
        e1Var2.setImageReceiver(x9Var.getImageReceiver());
        frameLayout.addView(e1Var2, x5.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        sg.e1 e1Var3 = new sg.e1(context, 4, f6Var);
        this.G = e1Var3;
        e1Var3.setImageReceiver(x9Var.getImageReceiver());
        frameLayout.addView(e1Var3, x5.e(44, 44, 17));
        e1Var3.setAlpha(0.0f);
        e1Var3.setScaleX(0.3f);
        e1Var3.setScaleY(0.3f);
        e1Var3.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = j6.G6;
        textView.setTextColor(j6.v0(i13, f6Var));
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
        TextView f7 = p6.f(frameLayout, textView, x5.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = f7;
        f7.setTextColor(j6.v0(i13, f6Var));
        f7.setGravity(17);
        f7.setTextSize(1, 12.0f);
        frameLayout.addView(f7, x5.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        sg.l1 l1Var = new sg.l1(this, context, 1);
        this.J = l1Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(l1Var, x5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        t50 t50Var = new t50(context);
        this.K = t50Var;
        t50Var.setBackgroundColor(-16776961);
        l1Var.addView(t50Var, x5.c(0.0f, 0));
        l1Var.addView(textView2, x5.e(-2, 26, 17));
        if (j6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        t50Var.setBackground(new m1(i11));
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
        frameLayout.addView(textView3, x5.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new i9((f6) null);
        x9 x9Var2 = new x9(context);
        this.f50322n = x9Var2;
        x9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        x9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = x5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f50323r = d10;
        frameLayout.addView(x9Var2, d10);
        this.f50324s = x5.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, x5.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, x5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f50325w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, x5.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f50326x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, x5.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        i1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f50311c0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(l70 l70Var, Canvas canvas, float f7, float f10, float f11) {
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
        e1 e1Var = this.f50313e;
        e1Var.setBounds(0, 0, (int) f7, (int) f10);
        e1Var.b(canvas2, f11);
        e1Var.getPadding(this.Q);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        x9 x9Var = this.f50327y;
        float f15 = f10 - f12;
        x9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        x9Var.getImageReceiver().draw(canvas2);
        if (x9Var.getImageReceiver().isLottieRunning()) {
            l70Var.invalidate();
        }
        sg.e1 e1Var2 = this.F;
        if (e1Var2.getVisibility() == 0 && e1Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f7 - e1Var2.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(e1Var2.getY(), (f15 - e1Var2.getMeasuredHeight()) / 2.0f, f11));
            f13 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, e1Var2.getWidth(), e1Var2.getHeight(), (int) (e1Var2.getAlpha() * (1.0f - f11) * 255.0f), 31);
            e1Var2.draw(canvas2);
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
        x9 x9Var2 = this.f50322n;
        if (x9Var2.getVisibility() == 0 && x9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            x9Var2.draw(canvas2);
            canvas2.restore();
        }
        i1 i1Var = this.f50315f;
        if (i1Var.getVisibility() == 0 && i1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-i1Var.getWidth(), 0.0f);
            i1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f14 = 1.0f;
        }
        if (uniqueStarGift != null) {
            if (this.O == null) {
                this.O = new f01(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.P == null) {
                this.P = new f01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            f01 f01Var = this.O;
            f01Var.f25858p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            f01Var.c((f7 - this.O.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.O.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            f01 f01Var2 = this.P;
            f01Var2.f25858p = f7 - AndroidUtilities.dp(8.0f);
            f01Var2.c((f7 - this.P.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.P.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        sg.l1 l1Var = this.J;
        if (l1Var != null && l1Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(l1Var.getX(), l1Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, l1Var.getWidth(), l1Var.getHeight(), (int) (l1Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            l1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f50325w;
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
        if (this.f50321k0 == null) {
            mp mpVar = new mp(getContext(), 21, null);
            this.f50321k0 = mpVar;
            mpVar.b(-1, j6.f20663d6, j6.f20792k7);
            this.f50321k0.setDrawUnchecked(false);
            this.d.addView(this.f50321k0, x5.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f50322n.setVisibility(8);
        this.f50321k0.a(z10, z11);
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
        if (!this.R && this.T && !this.f50316f0 && (savedStarGift = this.f50311c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        if (!this.R && z10 && !this.f50316f0 && (savedStarGift = this.f50311c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
            this.f50310c.a(canvas, e7);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        float f10;
        this.f50313e.f(z10, z11);
        float f11 = 0.0f;
        ImageView imageView = this.f50325w;
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
            translationX.translationY(f11).setDuration(320L).setInterpolator(pr.h).start();
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
        sg.e1 e1Var = this.G;
        if (z11) {
            e1Var.setVisibility(0);
            ViewPropertyAnimator animate = e1Var.animate();
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
        e1Var.setVisibility(i10);
        if (z10) {
            f11 = 1.0f;
        }
        e1Var.setAlpha(f11);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.3f;
        }
        e1Var.setScaleX(f7);
        if (z10) {
            f12 = 1.0f;
        }
        e1Var.setScaleY(f12);
    }

    public final void g(org.telegram.tgnet.tl.TL_stars.StarGift r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: yh.h1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.W;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.W;
        if (starGift != null) {
            return starGift.f20097id;
        }
        return 0L;
    }

    public sg.k getPremiumTier() {
        return this.V;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f50311c0;
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
        s01 s01Var = this.N;
        if (s01Var != null) {
            s01Var.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e1 e1Var = this.f50313e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e((TL_stars.starGiftAttributePattern) s5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        e1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        x9 x9Var = this.f50327y;
        x9Var.setTranslationY(0.0f);
        sg.e1 e1Var2 = this.F;
        e1Var2.H = true;
        e1Var2.I = false;
        e1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        e1Var2.setBlendWithColor(num);
        sg.e1 e1Var3 = this.G;
        e1Var3.H = true;
        e1Var3.I = false;
        e1Var3.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(j6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        e1Var3.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f50325w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(j6.K(AndroidUtilities.dp(20.0f), j6.v0(j6.Oh, this.f50308b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        x9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f50320j0 == savedStarGift) {
            e1Var2.setVisibility(0);
            ViewPropertyAnimator animate = e1Var2.animate();
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(pr.h).withEndAction(new ug.r(11, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            e1Var2.setAlpha(f7);
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            e1Var2.setScaleX(f10);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            }
            e1Var2.setScaleY(f13);
            if (savedStarGift.unsaved) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            e1Var2.setVisibility(i11);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        x9 x9Var2 = this.f50322n;
        x9Var2.setColorFilter(null);
        x9Var2.setLayoutParams(this.f50323r);
        int i15 = this.f50306a;
        if (z16 && savedStarGift.name_hidden) {
            x9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            x9Var2.setVisibility(0);
            oq a2 = p7.a(44, "anonymous");
            j3 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f29162e = dp;
            a2.f29163f = dp2;
            x9Var2.setImageDrawable(a2);
        } else {
            j3 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            i9 i9Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    x9Var2.setVisibility(0);
                    i9Var.r(user);
                    x9Var2.e(user, i9Var);
                } else {
                    x9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    x9Var2.setVisibility(0);
                    i9Var.q(chat);
                    x9Var2.e(chat, i9Var);
                } else {
                    x9Var2.setVisibility(8);
                }
            }
        }
        t50 t50Var = this.K;
        sg.l1 l1Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            nq[] nqVarArr = new nq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z12 = true;
                textView.setText(v7.U0(true, "XTR " + ((Object) v7.J0(savedStarGift.gift.getResellAmount(zf.b.f51625b).o(), 1.0f, ',')), 0.95f, nqVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(v7.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, nqVarArr));
            }
            nq nqVar = nqVarArr[0];
            if (nqVar != null) {
                nqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = j6.v(stargiftattributebackdrop.center_color | (-16777216), j6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            t50Var.setBackground(new m1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(j6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) l1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) l1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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
                textView.setText(v7.X0(false, i2.g.k(Math.max(j10, j11), ',', sb2), 0.66f, null));
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
            t50Var.setBackground(new m1(i13));
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
            ((FrameLayout.LayoutParams) l1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) l1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f50320j0 = savedStarGift;
        this.f50318h0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f50311c0;
        this.V = null;
        this.W = null;
        this.f50309b0 = false;
        this.f50311c0 = savedStarGift;
        this.f50312d0 = false;
        this.f50314e0 = false;
        this.f50316f0 = z11;
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
        x9 x9Var = this.f50327y;
        if (document == null) {
            x9Var.b();
            this.f50319i0 = null;
        } else if (this.f50319i0 == document) {
        } else {
            this.f50319i0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            x9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, j6.f20607a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.f50311c0;
        f6 f6Var = this.f50308b;
        i1 i1Var = this.f50315f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                i1Var.setVisibility(0);
                if (this.f50311c0.gift.resell_amount != null) {
                    int v = j6.v(j6.v0(j6.f20663d6, f6Var), j6.l1(0.04f, j6.v0(j6.G6, f6Var)));
                    i1Var.setColor(j6.v0(j6.uj, f6Var));
                    i1Var.setStrokeColor(v);
                    i1Var.setBackdrop(null);
                    i1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                i1Var.setColor(j6.v0(j6.Li, f6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s5.l(this.f50311c0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                i1Var.b(i2.g.k(this.f50311c0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                i1Var.setVisibility(0);
                i1Var.setColor(j6.v0(j6.Li, f6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop(null);
                i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f50311c0.gift.availability_total, 0)), true);
                return;
            } else {
                i1Var.setBackdrop(null);
                i1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.W;
        if (starGift2 != null) {
            if (!this.f50314e0 && !this.f50317g0) {
                if (this.f50312d0 && starGift2.availability_resale > 0) {
                    i1Var.setVisibility(0);
                    i1Var.setColor(j6.v0(j6.uj, f6Var));
                    i1Var.setStrokeColor(0);
                    i1Var.setBackdrop(null);
                    i1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f50309b0) {
                    i1Var.setVisibility(0);
                    i1Var.setColor(j6.v0(j6.Li, f6Var));
                    i1Var.setStrokeColor(0);
                    i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        i1Var.setVisibility(0);
                        i1Var.setColor(j6.v0(j6.Mi, f6Var));
                        i1Var.setStrokeColor(0);
                        i1Var.setBackdrop(null);
                        i1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        i1Var.setVisibility(0);
                        i1Var.setBackdrop(null);
                        i1Var.a(-2650077, -4227818);
                        i1Var.setStrokeColor(0);
                        if (this.W.auction_start_date > ConnectionsManager.getInstance(this.f50306a).getCurrentTime()) {
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
                        i1Var.setColor(j6.v0(j6.Li, f6Var));
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
            i1Var.setColor(j6.v0(j6.Li, f6Var));
            i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i1Var.setStrokeColor(0);
            i1Var.b(i2.g.k(this.W.num, ',', new StringBuilder("#")), true);
            return;
        }
        sg.k kVar = this.V;
        if (kVar != null) {
            if (kVar.b() > 0) {
                i1Var.setVisibility(0);
                i1Var.setBackdrop(null);
                i1Var.a(-2535425, -8229377);
                i1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.V.b()));
                i1Var.f50333b = formatString;
                i1Var.f50332a.e(12, formatString, true);
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
        this.f50327y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        i1 i1Var = this.f50315f;
        i1Var.setColor(i10);
        i1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f50315f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        i1 i1Var = this.f50315f;
        i1Var.setVisibility(0);
        i1Var.setColor(j6.v0(j6.Li, this.f50308b));
        i1Var.setStrokeColor(0);
        i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
        i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
