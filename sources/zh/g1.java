package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.ca;
import bi.dd;
import bi.fb;
import bi.yc;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.z10;
public class g1 extends FrameLayout implements p6 {
    public static final int[] f52980v0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final tg.c1 F;
    public final tg.c1 G;
    public final TextView H;
    public final TextView I;
    public final p5 J;
    public final z10 K;
    public final TextView L;
    public final TextView M;
    public fb N;
    public boolean O;
    public float P;
    public q11 Q;
    public q11 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final h6 W;
    public final int f52981a;
    public tg.k f52982a0;
    public final u6 f52983b;
    public TL_stars.StarGift f52984b0;
    public final eq0 f52985c;
    public boolean f52986c0;
    public final FrameLayout d;
    public boolean f52987d0;
    public final d1 e;
    public TL_stars.SavedStarGift f52988e0;
    public final h1 f52989f;
    public boolean f52990f0;
    public boolean f52991g0;
    public final j9 h;
    public boolean f52992h0;
    public boolean f52993i0;
    public tg.k f52994j0;
    public TLRPC.Document f52995k0;
    public TL_stars.SavedStarGift f52996l0;
    public zp m0;
    public final y9 f52997n;
    public int f52998n0;
    public boolean f52999o0;
    public boolean f53000p0;
    public int f53001q0;
    public final FrameLayout.LayoutParams f53002r;
    public int[] f53003r0;
    public final FrameLayout.LayoutParams f53004s;
    public int f53005s0;
    public boolean f53006t0;
    public boolean f53007u0;
    public final FrameLayout v;
    public final ImageView f53008w;
    public final TextView f53009x;
    public final y9 f53010y;

    public g1(Context context, int i10, u6 u6Var) {
        super(context);
        int i11;
        int i12;
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new h6(this, 0L, 320L, ds.h);
        this.f52998n0 = -1;
        this.f53007u0 = y6.I.q();
        this.f52981a = i10;
        this.f52983b = u6Var;
        gb1.c(this, 0.04f, 1.5f);
        this.f52985c = new eq0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        d1 d1Var = new d1(frameLayout, u6Var, true);
        this.e = d1Var;
        frameLayout.setBackground(d1Var);
        addView(frameLayout, gb1.i(-1, -1, 119));
        h1 h1Var = new h1(context);
        this.f52989f = h1Var;
        addView(h1Var, gb1.h(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        y9 y9Var = new y9(context);
        this.f53010y = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams h = gb1.h(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = h;
        frameLayout.addView(y9Var, h);
        tg.c1 c1Var = new tg.c1(context, 3, u6Var);
        this.F = c1Var;
        c1Var.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var, gb1.h(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        tg.c1 c1Var2 = new tg.c1(context, 4, u6Var);
        this.G = c1Var2;
        c1Var2.setImageReceiver(y9Var.getImageReceiver());
        frameLayout.addView(c1Var2, gb1.i(44, 44, 17));
        c1Var2.setAlpha(0.0f);
        c1Var2.setScaleX(0.3f);
        c1Var2.setScaleY(0.3f);
        c1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = y6.G6;
        f7.V(textView, i13, u6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, gb1.h(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = k10;
        f7.V(k10, i13, u6Var);
        k10.setGravity(17);
        k10.setTextSize(1, 12.0f);
        frameLayout.addView(k10, gb1.h(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        p5 p5Var = new p5(this, context, 8);
        this.J = p5Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(p5Var, gb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        z10 z10Var = new z10(context);
        this.K = z10Var;
        z10Var.setBackgroundColor(-16776961);
        p5Var.addView(z10Var, gb1.g(0.0f, 0));
        p5Var.addView(textView2, gb1.i(-2, 26, 17));
        if (y6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        z10Var.setBackground(new m1(i11));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (y6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, gb1.h(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new j9((u6) null);
        y9 y9Var2 = new y9(context);
        this.f52997n = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        y9Var2.setVisibility(8);
        FrameLayout.LayoutParams h10 = gb1.h(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f53002r = h10;
        frameLayout.addView(y9Var2, h10);
        this.f53004s = gb1.h(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, gb1.e(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, gb1.h(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f53008w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, gb1.h(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f53009x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, gb1.h(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        h1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f52988e0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    private void setRibbonColorKey(int i10) {
        this.f52989f.setColor(y6.w0(i10, this.f52983b));
        this.f52998n0 = i10;
    }

    public final void a() {
        int i10;
        int i11;
        boolean q5 = y6.I.q();
        this.f53007u0 = q5;
        if (this.f53006t0) {
            i10 = 1090519039;
        } else if (q5) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        if (q5) {
            i11 = -1333971;
        } else if (this.f53005s0 == 2) {
            i11 = -4229632;
        } else {
            i11 = -2722014;
        }
        this.K.setBackground(new m1(i10));
        this.L.setTextColor(i11);
        ImageView imageView = this.f53008w;
        imageView.setColorFilter(i11);
        imageView.setBackground(y6.c0(AndroidUtilities.dp(10.0f), i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Li));
        hashSet.add(Integer.valueOf(y6.Mi));
        hashSet.add(Integer.valueOf(y6.uj));
        hashSet.add(Integer.valueOf(y6.wj));
        hashSet.add(Integer.valueOf(y6.f23356d6));
    }

    public void b(i80 i80Var, Canvas canvas, float f7, float f10, float f11) {
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
        d1 d1Var = this.e;
        d1Var.setBounds(0, 0, (int) f7, (int) f10);
        d1Var.b(canvas2, f11);
        d1Var.getPadding(this.S);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        y9 y9Var = this.f53010y;
        float f15 = f10 - f12;
        y9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        y9Var.getImageReceiver().draw(canvas2);
        if (y9Var.getImageReceiver().isLottieRunning()) {
            i80Var.invalidate();
        }
        tg.c1 c1Var = this.F;
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
        y9 y9Var2 = this.f52997n;
        if (y9Var2.getVisibility() == 0 && y9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            y9Var2.draw(canvas2);
            canvas2.restore();
        }
        h1 h1Var = this.f52989f;
        if (h1Var.getVisibility() == 0 && h1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f7 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = f13;
            float lerp2 = AndroidUtilities.lerp(f14, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-h1Var.getWidth(), 0.0f);
            h1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f14 = f13;
        }
        if (uniqueStarGift != null) {
            if (this.Q == null) {
                this.Q = new q11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.R == null) {
                this.R = new q11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            q11 q11Var = this.Q;
            q11Var.f31800p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            q11Var.c((f7 - this.Q.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.Q.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            q11 q11Var2 = this.R;
            q11Var2.f31800p = f7 - AndroidUtilities.dp(8.0f);
            q11Var2.c((f7 - this.R.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.R.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        p5 p5Var = this.J;
        if (p5Var != null && p5Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(p5Var.getX(), p5Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, p5Var.getWidth(), p5Var.getHeight(), (int) (p5Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            p5Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f53008w;
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

    public final void c(boolean z10, boolean z11) {
        if (this.m0 == null) {
            zp zpVar = new zp(getContext(), 21, null);
            this.m0 = zpVar;
            zpVar.b(-1, y6.f23356d6, y6.f23485k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, gb1.h(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f52997n.setVisibility(8);
        this.m0.a(z10, z11);
    }

    public final void d(boolean z10, boolean z11) {
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
            scaleX.scaleY(f12).withEndAction(new e1(this, z10, 1)).start();
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
        if (!this.T && this.V && !this.f52992h0 && (savedStarGift = this.f52988e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        g(z12, z11);
        l();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float e = this.W.e(this.V);
        if (e > 0.0f) {
            this.f52985c.a(canvas, e);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
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
        if (!this.T && z10 && !this.f52992h0 && (savedStarGift = this.f52988e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        } else {
            z12 = false;
        }
        g(z12, z11);
    }

    public final void f(boolean z10, boolean z11) {
        float f7;
        float f10;
        this.e.f(z10, z11);
        float f11 = 0.0f;
        ImageView imageView = this.f53008w;
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
            translationX.translationY(f11).setDuration(320L).setInterpolator(ds.h).start();
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

    public final void g(boolean z10, boolean z11) {
        float f7;
        float f10;
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.3f;
        tg.c1 c1Var = this.G;
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
            scaleX.scaleY(f12).withEndAction(new e1(this, z10, 0)).start();
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

    public TL_stars.StarGift getGift() {
        return this.f52984b0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f52984b0;
        if (starGift != null) {
            return starGift.f22256id;
        }
        return 0L;
    }

    public tg.k getPremiumTier() {
        return this.f52982a0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f52988e0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: zh.g1.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        int i10;
        float f7;
        float f10;
        int i11;
        long j10;
        boolean z12;
        z10 z10Var;
        boolean z13;
        boolean z14;
        boolean z15;
        float f11;
        float f12;
        fb fbVar = this.N;
        if (fbVar != null) {
            fbVar.run();
            this.N = null;
        }
        j(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        d1 d1Var = this.e;
        d1Var.d(stargiftattributebackdrop);
        d1Var.e((TL_stars.starGiftAttributePattern) ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        d1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        y9 y9Var = this.f53010y;
        y9Var.setTranslationY(0.0f);
        tg.c1 c1Var = this.F;
        c1Var.H = true;
        c1Var.I = false;
        c1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(y6.o1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        c1Var.setBlendWithColor(num);
        tg.c1 c1Var2 = this.G;
        c1Var2.H = true;
        c1Var2.I = false;
        c1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(y6.o1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        c1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f53008w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(y6.K(AndroidUtilities.dp(20.0f), y6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            int i12 = y6.Oh;
            u6 u6Var = this.f52983b;
            f7.C(frameLayout, y6.K(dp, y6.w0(i12, u6Var)), f7.N(i12), u6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        y9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f52996l0 == savedStarGift) {
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(ds.h).withEndAction(new vi.i0(10, this, savedStarGift)).start();
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
        y9 y9Var2 = this.f52997n;
        y9Var2.setColorFilter(null);
        this.f53000p0 = false;
        y9Var2.setLayoutParams(this.f53002r);
        int i13 = this.f52981a;
        if (z16 && savedStarGift.name_hidden) {
            y9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            y9Var2.setVisibility(0);
            ar a2 = yc.a(44, "anonymous");
            j10 = 0;
            int dp2 = AndroidUtilities.dp(16.0f);
            int dp3 = AndroidUtilities.dp(16.0f);
            a2.e = dp2;
            a2.f26595f = dp3;
            y9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            int i14 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
            j9 j9Var = this.h;
            if (i14 > 0) {
                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    y9Var2.setVisibility(0);
                    j9Var.r(user);
                    y9Var2.f(user, j9Var);
                } else {
                    y9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    y9Var2.setVisibility(0);
                    j9Var.q(chat);
                    y9Var2.f(chat, j9Var);
                } else {
                    y9Var2.setVisibility(8);
                }
            }
        }
        z10 z10Var2 = this.K;
        p5 p5Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            zq[] zqVarArr = new zq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i13).getClientUserId()) {
                z15 = true;
                textView.setText(dd.o1(dd.T0(true, "XTR " + ((Object) dd.I0(savedStarGift.gift.getResellAmount(bg.b.f3981b).o(), 1.0f, ',')), 0.95f, zqVarArr, 0.0f, 1.0f), true));
            } else {
                z15 = true;
                textView.setText(dd.Q0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, zqVarArr));
            }
            zq zqVar = zqVarArr[0];
            if (zqVar != null) {
                zqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = y6.v(stargiftattributebackdrop.center_color | (-16777216), y6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.f53005s0 = 0;
            z10Var2.setBackground(new m1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(y6.c0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z12 = z15;
        } else {
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
                z12 = true;
                z10Var = z10Var2;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j11 = starGift2.stars;
                z12 = true;
                z10Var = z10Var2;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(dd.W0(false, org.telegram.messenger.t.i(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z16) {
                this.f53005s0 = 0;
                textView.setTextColor(-1);
                z10Var.setBackground(new m1(1090519039));
                imageView.setBackground(y6.c0(AndroidUtilities.dp(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.f53005s0 = 2;
                this.f53006t0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f52996l0 = savedStarGift;
        this.f52994j0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f52988e0;
        this.f52982a0 = null;
        this.f52984b0 = null;
        this.f52987d0 = false;
        this.f52988e0 = savedStarGift;
        this.f52990f0 = false;
        this.f52991g0 = false;
        this.f52992h0 = z11;
        this.Q = null;
        this.R = null;
        if (savedStarGift.pinned_to_top && (!z16 || savedStarGift.name_hidden)) {
            z13 = z12;
        } else {
            z13 = false;
        }
        if (savedStarGift2 == savedStarGift) {
            z14 = z12;
        } else {
            z14 = false;
        }
        d(z13, z14);
        l();
        if (savedStarGift2 != savedStarGift) {
            return false;
        }
        return z12;
    }

    public final void j(TLObject tLObject, TLRPC.Document document) {
        y9 y9Var = this.f53010y;
        if (document == null) {
            y9Var.b();
            this.f52995k0 = null;
        } else if (this.f52995k0 == document) {
        } else {
            this.f52995k0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            y9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, y6.f23299a7, 0.3f), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f7) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String i10;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i11;
        boolean z12;
        if (this.P != f7) {
            this.P = f7;
            TL_stars.TL_starGiftUnique uniqueStarGift2 = getUniqueStarGift();
            ColorMatrixColorFilter colorMatrixColorFilter = null;
            if (uniqueStarGift2 == null) {
                stargiftattributebackdrop = null;
            } else {
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            }
            if (stargiftattributebackdrop == null) {
                i11 = -11184811;
            } else {
                i11 = stargiftattributebackdrop.pattern_color | (-16777216);
            }
            float f10 = 1.0f - f7;
            if (f7 > 0.0f) {
                colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{f10, 0.0f, 0.0f, 0.0f, Color.red(i11) * f7, 0.0f, f10, 0.0f, 0.0f, Color.green(i11) * f7, 0.0f, 0.0f, f10, 0.0f, Color.blue(i11) * f7, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f7), 0.0f});
            }
            y9 y9Var = this.f53010y;
            y9Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = y9Var.getImageReceiver();
            int i12 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i12 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            imageReceiver.setAllowStartLottieAnimation(z12);
            if (i12 > 0) {
                y9Var.getImageReceiver().stopAnimation();
                xj0 lottieAnimation = y9Var.getImageReceiver().getLottieAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.N(0, false, false);
                }
            }
            y9Var.invalidate();
        }
        if (this.O != z10) {
            this.O = z10;
            if (getUniqueStarGift() != null) {
                if (z10) {
                    i10 = LocaleController.getString(R.string.WalletGiftOnCard);
                } else {
                    i10 = org.telegram.messenger.t.i(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                h1 h1Var = this.f52989f;
                if (z11) {
                    h1Var.getClass();
                    h1Var.f53024b = i10;
                    h1Var.f53023a.g(10, i10);
                    return;
                }
                h1Var.b(i10, true);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f52988e0;
        h1 h1Var = this.f52989f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                h1Var.setVisibility(0);
                if (this.f52988e0.gift.resell_amount != null) {
                    int i10 = y6.f23356d6;
                    u6 u6Var = this.f52983b;
                    int v = y6.v(y6.w0(i10, u6Var), y6.o1(0.04f, y6.w0(y6.G6, u6Var)));
                    setRibbonColorKey(y6.uj);
                    h1Var.setStrokeColor(v);
                    this.f52999o0 = true;
                    h1Var.setBackdrop(null);
                    h1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                setRibbonColorKey(y6.Li);
                h1Var.setStrokeColor(0);
                this.f52999o0 = false;
                h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.f52988e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                h1Var.b(org.telegram.messenger.t.i(this.f52988e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                h1Var.setVisibility(0);
                setRibbonColorKey(y6.Li);
                h1Var.setStrokeColor(0);
                this.f52999o0 = false;
                h1Var.setBackdrop(null);
                h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f52988e0.gift.availability_total, 0)), true);
                return;
            } else {
                h1Var.setBackdrop(null);
                h1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.f52984b0;
        if (starGift2 != null) {
            if (!this.f52991g0 && !this.f52993i0) {
                if (this.f52990f0 && starGift2.availability_resale > 0) {
                    h1Var.setVisibility(0);
                    setRibbonColorKey(y6.uj);
                    h1Var.setStrokeColor(0);
                    this.f52999o0 = false;
                    h1Var.setBackdrop(null);
                    h1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f52987d0) {
                    h1Var.setVisibility(0);
                    setRibbonColorKey(y6.Li);
                    h1Var.setStrokeColor(0);
                    this.f52999o0 = false;
                    h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.f52984b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f52984b0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        h1Var.setVisibility(0);
                        setRibbonColorKey(y6.Mi);
                        h1Var.setStrokeColor(0);
                        this.f52999o0 = false;
                        h1Var.setBackdrop(null);
                        h1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        h1Var.setVisibility(0);
                        h1Var.setBackdrop(null);
                        this.f52998n0 = -1;
                        h1Var.a(-2650077, -4227818);
                        h1Var.setStrokeColor(0);
                        this.f52999o0 = false;
                        if (this.f52984b0.auction_start_date > ConnectionsManager.getInstance(this.f52981a).getCurrentTime()) {
                            h1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            h1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        h1Var.setVisibility(0);
                        h1Var.setBackdrop(null);
                        this.f52998n0 = -1;
                        h1Var.a(-2650077, -4227818);
                        h1Var.setStrokeColor(0);
                        this.f52999o0 = false;
                        h1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z10) {
                        h1Var.setVisibility(0);
                        setRibbonColorKey(y6.Li);
                        h1Var.setStrokeColor(0);
                        this.f52999o0 = false;
                        h1Var.setBackdrop(null);
                        h1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        h1Var.setBackdrop(null);
                        h1Var.setStrokeColor(0);
                        this.f52999o0 = false;
                        h1Var.setVisibility(8);
                        return;
                    }
                }
            }
            h1Var.setVisibility(0);
            setRibbonColorKey(y6.Li);
            h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.f52984b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h1Var.setStrokeColor(0);
            this.f52999o0 = false;
            h1Var.b(org.telegram.messenger.t.i(this.f52984b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        tg.k kVar = this.f52982a0;
        if (kVar != null) {
            if (kVar.b() > 0) {
                h1Var.setVisibility(0);
                h1Var.setBackdrop(null);
                this.f52998n0 = -1;
                h1Var.a(-2535425, -8229377);
                h1Var.setStrokeColor(0);
                this.f52999o0 = false;
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.f52982a0.b()));
                h1Var.f53024b = formatString;
                h1Var.f53023a.f(12, formatString, true);
                return;
            }
            h1Var.setVisibility(8);
            h1Var.setBackdrop(null);
            h1Var.setStrokeColor(0);
            this.f52999o0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: zh.g1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.f53010y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        this.f52998n0 = -1;
        h1 h1Var = this.f52989f;
        h1Var.setColor(i10);
        h1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f52989f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        h1 h1Var = this.f52989f;
        h1Var.setVisibility(0);
        setRibbonColorKey(y6.Li);
        h1Var.setStrokeColor(0);
        this.f52999o0 = false;
        h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ca.l(this.f52984b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }

    @Override
    public final void updateColors() {
        int w02;
        y9 y9Var;
        int w03;
        int i10;
        try {
            boolean q5 = y6.I.q();
            if (q5 != this.f53007u0) {
                this.f53007u0 = q5;
                if (this.f53005s0 != 0 && this.K != null && this.L != null && this.f53008w != null) {
                    a();
                }
                TextView textView = this.M;
                if (textView != null) {
                    if (q5) {
                        i10 = -1333971;
                    } else {
                        i10 = -2722014;
                    }
                    textView.setTextColor(i10);
                }
            }
            h1 h1Var = this.f52989f;
            u6 u6Var = this.f52983b;
            if (h1Var != null) {
                int i11 = this.f52998n0;
                if (i11 >= 0) {
                    j1 j1Var = h1Var.f53023a;
                    ((Paint) j1Var.f27245b).setColor(y6.w0(i11, u6Var));
                    j1Var.invalidateSelf();
                }
                if (this.f52999o0) {
                    h1Var.setStrokeColor(y6.v(y6.w0(y6.f23356d6, u6Var), y6.o1(0.04f, y6.w0(y6.G6, u6Var))));
                }
                h1Var.invalidate();
            }
            if (this.f53000p0 && (y9Var = this.f52997n) != null && (w03 = y6.w0(y6.wj, u6Var)) != this.f53001q0) {
                this.f53001q0 = w03;
                y9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            d1 d1Var = this.e;
            if (d1Var != null) {
                int[] iArr = this.f53003r0;
                if (iArr != null && d1Var.f52942m == iArr && (iArr[0] != (w02 = y6.w0(y6.Mi, u6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    d1Var.f52943n = null;
                }
                d1Var.invalidateSelf();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
