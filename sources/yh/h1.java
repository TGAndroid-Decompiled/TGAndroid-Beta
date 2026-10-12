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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.x50;
import w7.a6;
import zh.j7;
import zh.n5;
import zh.p7;
public class h1 extends FrameLayout {
    public static final int[] f48891l0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final sg.c1 F;
    public final sg.c1 G;
    public final TextView H;
    public final TextView I;
    public final sg.p0 J;
    public final x50 K;
    public final TextView L;
    public final TextView M;
    public u11 N;
    public h11 O;
    public h11 P;
    public final Rect Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final g6 U;
    public sg.k V;
    public TL_stars.StarGift W;
    public final int f48892a;
    public boolean f48893a0;
    public final c6 f48894b;
    public boolean f48895b0;
    public final zp0 f48896c;
    public TL_stars.SavedStarGift f48897c0;
    public final FrameLayout d;
    public boolean f48898d0;
    public final e1 e;
    public boolean f48899e0;
    public final i1 f48900f;
    public boolean f48901f0;
    public boolean f48902g0;
    public final k9 h;
    public sg.k f48903h0;
    public TLRPC.Document f48904i0;
    public TL_stars.SavedStarGift f48905j0;
    public aq f48906k0;
    public final z9 f48907n;
    public final FrameLayout.LayoutParams f48908r;
    public final FrameLayout.LayoutParams f48909s;
    public final FrameLayout v;
    public final ImageView f48910w;
    public final TextView f48911x;
    public final z9 f48912y;

    public h1(Context context, int i10, c6 c6Var) {
        super(context);
        int i11;
        int i12;
        this.Q = new Rect();
        this.U = new g6(this, 0L, 320L, es.h);
        this.f48892a = i10;
        this.f48894b = c6Var;
        w7.c6.b(this, 0.04f, 1.5f);
        this.f48896c = new zp0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e1 e1Var = new e1(frameLayout, c6Var, true);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, a6.e(-1, -1, 119));
        i1 i1Var = new i1(context);
        this.f48900f = i1Var;
        addView(i1Var, a6.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
        z9 z9Var = new z9(context);
        this.f48912y = z9Var;
        z9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams a2 = a6.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17);
        this.E = a2;
        frameLayout.addView(z9Var, a2);
        sg.c1 c1Var = new sg.c1(context, 3, c6Var);
        this.F = c1Var;
        c1Var.setImageReceiver(z9Var.getImageReceiver());
        frameLayout.addView(c1Var, a6.a(30.0f, 0.0f, 38.0f, 0.0f, 0.0f, 30, 49));
        sg.c1 c1Var2 = new sg.c1(context, 4, c6Var);
        this.G = c1Var2;
        c1Var2.setImageReceiver(z9Var.getImageReceiver());
        frameLayout.addView(c1Var2, a6.e(44, 44, 17));
        c1Var2.setAlpha(0.0f);
        c1Var2.setScaleX(0.3f);
        c1Var2.setScaleY(0.3f);
        c1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        textView.setGravity(17);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout, textView, a6.a(-2.0f, 0.0f, 89.0f, 0.0f, 0.0f, -1, 48), context);
        this.I = h;
        h.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        h.setGravity(17);
        h.setTextSize(1, 12.0f);
        frameLayout.addView(h, a6.a(-2.0f, 0.0f, 107.0f, 0.0f, 0.0f, -1, 48));
        sg.p0 p0Var = new sg.p0(this, context, 3);
        this.J = p0Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(p0Var, a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 11.0f, -2, 81));
        x50 x50Var = new x50(context);
        this.K = x50Var;
        x50Var.setBackgroundColor(-16776961);
        p0Var.addView(x50Var, a6.d(0.0f, 0));
        p0Var.addView(textView2, a6.e(-2, 26, 17));
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        x50Var.setBackground(new m1(i11));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, a6.a(-2.0f, 0.0f, 161.0f, 0.0f, 8.0f, -2, 49));
        this.h = new k9((c6) null);
        z9 z9Var2 = new z9(context);
        this.f48907n = z9Var2;
        z9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        z9Var2.setVisibility(8);
        FrameLayout.LayoutParams a10 = a6.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51);
        this.f48908r = a10;
        frameLayout.addView(z9Var2, a10);
        this.f48909s = a6.a(20.0f, 5.0f, 5.0f, 2.0f, 2.0f, 20, 51);
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
        frameLayout2.addView(imageView, a6.b(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, a6.a(20.0f, 2.0f, 2.0f, 2.0f, 2.0f, 20, 51));
        ImageView imageView2 = new ImageView(context);
        this.f48910w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, a6.a(20.0f, 3.0f, 3.0f, 3.0f, 3.0f, 20, 51));
        TextView textView4 = new TextView(context);
        this.f48911x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, a6.a(17.0f, 4.0f, 4.0f, 0.0f, 0.0f, -2, 51));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        i1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f48897c0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(k80 k80Var, Canvas canvas, float f7, float f10, float f11) {
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
        e1Var.getPadding(this.Q);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        z9 z9Var = this.f48912y;
        float f15 = f10 - f12;
        z9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        z9Var.getImageReceiver().draw(canvas2);
        if (z9Var.getImageReceiver().isLottieRunning()) {
            k80Var.invalidate();
        }
        sg.c1 c1Var = this.F;
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
        z9 z9Var2 = this.f48907n;
        if (z9Var2.getVisibility() == 0 && z9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            z9Var2.draw(canvas2);
            canvas2.restore();
        }
        i1 i1Var = this.f48900f;
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
            if (this.O == null) {
                this.O = new h11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.P == null) {
                this.P = new h11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            h11 h11Var = this.O;
            h11Var.f25483p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            h11Var.c((f7 - this.O.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.O.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            h11 h11Var2 = this.P;
            h11Var2.f25483p = f7 - AndroidUtilities.dp(8.0f);
            h11Var2.c((f7 - this.P.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.P.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        sg.p0 p0Var = this.J;
        if (p0Var != null && p0Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(p0Var.getX(), p0Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, p0Var.getWidth(), p0Var.getHeight(), (int) (p0Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            p0Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f48910w;
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
        if (this.f48906k0 == null) {
            aq aqVar = new aq(getContext(), 21, null);
            this.f48906k0 = aqVar;
            aqVar.b(-1, org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.f20029k7);
            this.f48906k0.setDrawUnchecked(false);
            this.d.addView(this.f48906k0, a6.a(24.0f, 4.0f, 4.0f, 4.0f, 4.0f, 24, 51));
        }
        this.f48907n.setVisibility(8);
        this.f48906k0.a(z10, z11);
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
        if (!this.R && this.T && !this.f48901f0 && (savedStarGift = this.f48897c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        if (!this.R && z10 && !this.f48901f0 && (savedStarGift = this.f48897c0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
            this.f48896c.a(canvas, e);
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
        ImageView imageView = this.f48910w;
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
            translationX.translationY(f11).setDuration(320L).setInterpolator(es.h).start();
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
        sg.c1 c1Var = this.G;
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
            scaleX.scaleY(f12).withEndAction(new f1(this, z10, 0)).start();
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
        throw new UnsupportedOperationException("Method not decompiled: yh.h1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.W;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.W;
        if (starGift != null) {
            return starGift.f19441id;
        }
        return 0L;
    }

    public sg.k getPremiumTier() {
        return this.V;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f48897c0;
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
        u11 u11Var = this.N;
        if (u11Var != null) {
            u11Var.run();
            this.N = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e((TL_stars.starGiftAttributePattern) n5.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        e1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        z9 z9Var = this.f48912y;
        z9Var.setTranslationY(0.0f);
        sg.c1 c1Var = this.F;
        c1Var.H = true;
        c1Var.I = false;
        c1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        c1Var.setBlendWithColor(num);
        sg.c1 c1Var2 = this.G;
        c1Var2.H = true;
        c1Var2.I = false;
        c1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        c1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f48910w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.f48894b)));
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        z9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f48905j0 == savedStarGift) {
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(es.h).withEndAction(new s9.b(26, this, savedStarGift)).start();
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
        z9 z9Var2 = this.f48907n;
        z9Var2.setColorFilter(null);
        z9Var2.setLayoutParams(this.f48908r);
        int i15 = this.f48892a;
        if (z16 && savedStarGift.name_hidden) {
            z9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            z9Var2.setVisibility(0);
            cr a2 = j7.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f24194f = dp2;
            z9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            int i16 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
            k9 k9Var = this.h;
            if (i16 > 0) {
                TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    z9Var2.setVisibility(0);
                    k9Var.r(user);
                    z9Var2.e(user, k9Var);
                } else {
                    z9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    z9Var2.setVisibility(0);
                    k9Var.q(chat);
                    z9Var2.e(chat, k9Var);
                } else {
                    z9Var2.setVisibility(8);
                }
            }
        }
        x50 x50Var = this.K;
        sg.p0 p0Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            br[] brVarArr = new br[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z12 = true;
                textView.setText(p7.V0(true, "XTR " + ((Object) p7.K0(savedStarGift.gift.getResellAmount(ag.b.f630b).o(), 1.0f, ',')), 0.95f, brVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(p7.S0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, brVarArr));
            }
            br brVar = brVarArr[0];
            if (brVar != null) {
                brVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.m1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            x50Var.setBackground(new m1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), v));
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
                long j11 = starGift2.stars;
                z13 = z16;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(p7.Y0(false, org.telegram.messenger.q.i(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z13) {
                i12 = -1;
            } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                i12 = -1333971;
            } else {
                i12 = -4229632;
            }
            textView.setTextColor(i12);
            int i17 = 1088989954;
            if (z13) {
                i13 = 1090519039;
            } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                i13 = 518759725;
            } else {
                i13 = 1088989954;
            }
            x50Var.setBackground(new m1(i13));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i17 = 1090519039;
            } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                i17 = 518759725;
            }
            imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(dp3, i17));
            if (z13) {
                i14 = -1;
            } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                i14 = -1333971;
            } else {
                i14 = -4229632;
            }
            imageView.setColorFilter(i14);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f48905j0 = savedStarGift;
        this.f48903h0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f48897c0;
        this.V = null;
        this.W = null;
        this.f48895b0 = false;
        this.f48897c0 = savedStarGift;
        this.f48898d0 = false;
        this.f48899e0 = false;
        this.f48901f0 = z11;
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
        z9 z9Var = this.f48912y;
        if (document == null) {
            z9Var.b();
            this.f48904i0 = null;
        } else if (this.f48904i0 == document) {
        } else {
            this.f48904i0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            z9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f19843a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.f48897c0;
        c6 c6Var = this.f48894b;
        i1 i1Var = this.f48900f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                i1Var.setVisibility(0);
                if (this.f48897c0.gift.resell_amount != null) {
                    int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var), org.telegram.ui.ActionBar.g6.m1(0.04f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var)));
                    i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, c6Var));
                    i1Var.setStrokeColor(v);
                    i1Var.setBackdrop(null);
                    i1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.f48897c0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                i1Var.b(org.telegram.messenger.q.i(this.f48897c0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                i1Var.setVisibility(0);
                i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
                i1Var.setStrokeColor(0);
                i1Var.setBackdrop(null);
                i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f48897c0.gift.availability_total, 0)), true);
                return;
            } else {
                i1Var.setBackdrop(null);
                i1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.W;
        if (starGift2 != null) {
            if (!this.f48899e0 && !this.f48902g0) {
                if (this.f48898d0 && starGift2.availability_resale > 0) {
                    i1Var.setVisibility(0);
                    i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, c6Var));
                    i1Var.setStrokeColor(0);
                    i1Var.setBackdrop(null);
                    i1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f48895b0) {
                    i1Var.setVisibility(0);
                    i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
                    i1Var.setStrokeColor(0);
                    i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        i1Var.setVisibility(0);
                        i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Mi, c6Var));
                        i1Var.setStrokeColor(0);
                        i1Var.setBackdrop(null);
                        i1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        i1Var.setVisibility(0);
                        i1Var.setBackdrop(null);
                        i1Var.a(-2650077, -4227818);
                        i1Var.setStrokeColor(0);
                        if (this.W.auction_start_date > ConnectionsManager.getInstance(this.f48892a).getCurrentTime()) {
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
                        i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
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
            i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, c6Var));
            i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i1Var.setStrokeColor(0);
            i1Var.b(org.telegram.messenger.q.i(this.W.num, ',', new StringBuilder("#")), true);
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
                i1Var.f48920b = formatString;
                i1Var.f48919a.f(12, formatString, true);
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
        this.f48912y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        i1 i1Var = this.f48900f;
        i1Var.setColor(i10);
        i1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f48900f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        i1 i1Var = this.f48900f;
        i1Var.setVisibility(0);
        i1Var.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Li, this.f48894b));
        i1Var.setStrokeColor(0);
        i1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) n5.l(this.W.attributes, TL_stars.starGiftAttributeBackdrop.class));
        i1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
