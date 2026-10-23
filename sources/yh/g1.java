package yh;

import ai.gb;
import ai.ha;
import ai.id;
import ai.nd;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.e50;
import w7.z5;
public class g1 extends FrameLayout implements b6 {
    public static final int[] f50702v0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams E;
    public final sg.c1 F;
    public final sg.c1 G;
    public final TextView H;
    public final TextView I;
    public final rg.y1 J;
    public final e50 K;
    public final TextView L;
    public final TextView M;
    public gb N;
    public boolean O;
    public float P;
    public i11 Q;
    public i11 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final f6 W;
    public final int f50703a;
    public sg.k f50704a0;
    public final g6 f50705b;
    public TL_stars.StarGift f50706b0;
    public final zp0 f50707c;
    public boolean f50708c0;
    public final FrameLayout d;
    public boolean f50709d0;
    public final d1 e;
    public TL_stars.SavedStarGift f50710e0;
    public final h1 f50711f;
    public boolean f50712f0;
    public boolean f50713g0;
    public final h9 h;
    public boolean f50714h0;
    public boolean f50715i0;
    public sg.k f50716j0;
    public TLRPC.Document f50717k0;
    public TL_stars.SavedStarGift f50718l0;
    public xp m0;
    public final w9 f50719n;
    public int f50720n0;
    public boolean f50721o0;
    public boolean f50722p0;
    public int f50723q0;
    public final FrameLayout.LayoutParams f50724r;
    public int[] f50725r0;
    public final FrameLayout.LayoutParams f50726s;
    public int f50727s0;
    public boolean f50728t0;
    public boolean f50729u0;
    public final FrameLayout v;
    public final ImageView f50730w;
    public final TextView f50731x;
    public final w9 f50732y;

    public g1(Context context, int i10, g6 g6Var) {
        super(context);
        int i11;
        int i12;
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new f6(this, 0L, 320L, bs.h);
        this.f50720n0 = -1;
        this.f50729u0 = k6.I.q();
        this.f50703a = i10;
        this.f50705b = g6Var;
        w7.b6.b(this, 0.04f, 1.5f);
        this.f50707c = new zp0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        d1 d1Var = new d1(frameLayout, g6Var, true);
        this.e = d1Var;
        frameLayout.setBackground(d1Var);
        addView(frameLayout, z5.e(-1, -1, 119));
        h1 h1Var = new h1(context);
        this.f50711f = h1Var;
        addView(h1Var, z5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        w9 w9Var = new w9(context);
        this.f50732y = w9Var;
        w9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = z5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(w9Var, d);
        sg.c1 c1Var = new sg.c1(context, 3, g6Var);
        this.F = c1Var;
        c1Var.setImageReceiver(w9Var.getImageReceiver());
        frameLayout.addView(c1Var, z5.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        sg.c1 c1Var2 = new sg.c1(context, 4, g6Var);
        this.G = c1Var2;
        c1Var2.setImageReceiver(w9Var.getImageReceiver());
        frameLayout.addView(c1Var2, z5.e(44, 44, 17));
        c1Var2.setAlpha(0.0f);
        c1Var2.setScaleX(0.3f);
        c1Var2.setScaleY(0.3f);
        c1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = k6.G6;
        r6.W(textView, i13, g6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout, textView, z5.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = j10;
        r6.W(j10, i13, g6Var);
        j10.setGravity(17);
        j10.setTextSize(1, 12.0f);
        frameLayout.addView(j10, z5.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        rg.y1 y1Var = new rg.y1(this, context, 6);
        this.J = y1Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(y1Var, z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        e50 e50Var = new e50(context);
        this.K = e50Var;
        e50Var.setBackgroundColor(-16776961);
        y1Var.addView(e50Var, z5.c(0.0f, 0));
        y1Var.addView(textView2, z5.e(-2, 26, 17));
        if (k6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        e50Var.setBackground(new l1(i11));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (k6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, z5.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new h9((g6) null);
        w9 w9Var2 = new w9(context);
        this.f50719n = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        w9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = z5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f50724r = d10;
        frameLayout.addView(w9Var2, d10);
        this.f50726s = z5.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, z5.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, z5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f50730w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, z5.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f50731x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, z5.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        h1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f50710e0;
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
        this.f50711f.setColor(k6.w0(i10, this.f50705b));
        this.f50720n0 = i10;
    }

    public final void a() {
        int i10;
        int i11;
        boolean q6 = k6.I.q();
        this.f50729u0 = q6;
        if (this.f50728t0) {
            i10 = 1090519039;
        } else if (q6) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        if (q6) {
            i11 = -1333971;
        } else if (this.f50727s0 == 2) {
            i11 = -4229632;
        } else {
            i11 = -2722014;
        }
        this.K.setBackground(new l1(i10));
        this.L.setTextColor(i11);
        ImageView imageView = this.f50730w;
        imageView.setColorFilter(i11);
        imageView.setBackground(k6.c0(AndroidUtilities.dp(10.0f), i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Li));
        hashSet.add(Integer.valueOf(k6.Mi));
        hashSet.add(Integer.valueOf(k6.uj));
        hashSet.add(Integer.valueOf(k6.wj));
        hashSet.add(Integer.valueOf(k6.f21183d6));
    }

    public void b(h80 h80Var, Canvas canvas, float f7, float f10, float f11) {
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
        w9 w9Var = this.f50732y;
        float f15 = f10 - f12;
        w9Var.getImageReceiver().setImageCoords((f7 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        w9Var.getImageReceiver().draw(canvas2);
        if (w9Var.getImageReceiver().isLottieRunning()) {
            h80Var.invalidate();
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
        w9 w9Var2 = this.f50719n;
        if (w9Var2.getVisibility() == 0 && w9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            w9Var2.draw(canvas2);
            canvas2.restore();
        }
        h1 h1Var = this.f50711f;
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
                this.Q = new i11(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.R == null) {
                this.R = new i11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            i11 i11Var = this.Q;
            i11Var.f27174p = f7 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            i11Var.c((f7 - this.Q.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.Q.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            i11 i11Var2 = this.R;
            i11Var2.f27174p = f7 - AndroidUtilities.dp(8.0f);
            i11Var2.c((f7 - this.R.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.R.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        rg.y1 y1Var = this.J;
        if (y1Var != null && y1Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(y1Var.getX(), y1Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, y1Var.getWidth(), y1Var.getHeight(), (int) (y1Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            y1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f50730w;
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
            xp xpVar = new xp(getContext(), 21, null);
            this.m0 = xpVar;
            xpVar.b(-1, k6.f21183d6, k6.f21311k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, z5.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f50719n.setVisibility(8);
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
        if (!this.T && this.V && !this.f50714h0 && (savedStarGift = this.f50710e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
            this.f50707c.a(canvas, e);
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
        if (!this.T && z10 && !this.f50714h0 && (savedStarGift = this.f50710e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        ImageView imageView = this.f50730w;
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
        return this.f50706b0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f50706b0;
        if (starGift != null) {
            return starGift.f20567id;
        }
        return 0L;
    }

    public sg.k getPremiumTier() {
        return this.f50704a0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f50710e0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.g1.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
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
        e50 e50Var;
        boolean z13;
        boolean z14;
        boolean z15;
        float f11;
        float f12;
        gb gbVar = this.N;
        if (gbVar != null) {
            gbVar.run();
            this.N = null;
        }
        j(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        d1 d1Var = this.e;
        d1Var.d(stargiftattributebackdrop);
        d1Var.e((TL_stars.starGiftAttributePattern) ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        d1Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        w9 w9Var = this.f50732y;
        w9Var.setTranslationY(0.0f);
        sg.c1 c1Var = this.F;
        c1Var.H = true;
        c1Var.I = false;
        c1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(k6.o1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        c1Var.setBlendWithColor(num);
        sg.c1 c1Var2 = this.G;
        c1Var2.H = true;
        c1Var2.I = false;
        c1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(k6.o1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        c1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f50730w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(k6.K(AndroidUtilities.dp(20.0f), k6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            int i12 = k6.Oh;
            g6 g6Var = this.f50705b;
            r6.D(frameLayout, k6.K(dp, k6.w0(i12, g6Var)), r6.O(i12), g6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        w9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f50718l0 == savedStarGift) {
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(bs.h).withEndAction(new u2.k0(19, this, savedStarGift)).start();
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
        w9 w9Var2 = this.f50719n;
        w9Var2.setColorFilter(null);
        this.f50722p0 = false;
        w9Var2.setLayoutParams(this.f50724r);
        int i13 = this.f50703a;
        if (z16 && savedStarGift.name_hidden) {
            w9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            w9Var2.setVisibility(0);
            yq a2 = id.a(44, "anonymous");
            j10 = 0;
            int dp2 = AndroidUtilities.dp(16.0f);
            int dp3 = AndroidUtilities.dp(16.0f);
            a2.e = dp2;
            a2.f33015f = dp3;
            w9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            int i14 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
            h9 h9Var = this.h;
            if (i14 > 0) {
                TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    w9Var2.setVisibility(0);
                    h9Var.r(user);
                    w9Var2.e(user, h9Var);
                } else {
                    w9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    w9Var2.setVisibility(0);
                    h9Var.q(chat);
                    w9Var2.e(chat, h9Var);
                } else {
                    w9Var2.setVisibility(8);
                }
            }
        }
        e50 e50Var2 = this.K;
        rg.y1 y1Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            xq[] xqVarArr = new xq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i13).getClientUserId()) {
                z15 = true;
                textView.setText(nd.n1(nd.V0(true, "XTR " + ((Object) nd.K0(savedStarGift.gift.getResellAmount(ag.b.f634b).o(), 1.0f, ',')), 0.95f, xqVarArr, 0.0f, 1.0f), true));
            } else {
                z15 = true;
                textView.setText(nd.S0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, xqVarArr));
            }
            xq xqVar = xqVarArr[0];
            if (xqVar != null) {
                xqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = k6.v(stargiftattributebackdrop.center_color | (-16777216), k6.o1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.f50727s0 = 0;
            e50Var2.setBackground(new l1(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(k6.c0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) y1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) y1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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
                e50Var = e50Var2;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j11 = starGift2.stars;
                z12 = true;
                e50Var = e50Var2;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(nd.Y0(false, i2.o1.m(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z16) {
                this.f50727s0 = 0;
                textView.setTextColor(-1);
                e50Var.setBackground(new l1(1090519039));
                imageView.setBackground(k6.c0(AndroidUtilities.dp(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.f50727s0 = 2;
                this.f50728t0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) y1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) y1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.M.setVisibility(8);
        this.f50718l0 = savedStarGift;
        this.f50716j0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f50710e0;
        this.f50704a0 = null;
        this.f50706b0 = null;
        this.f50709d0 = false;
        this.f50710e0 = savedStarGift;
        this.f50712f0 = false;
        this.f50713g0 = false;
        this.f50714h0 = z11;
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
        w9 w9Var = this.f50732y;
        if (document == null) {
            w9Var.b();
            this.f50717k0 = null;
        } else if (this.f50717k0 == document) {
        } else {
            this.f50717k0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            w9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, k6.f21125a7, 0.3f), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f7) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String m10;
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
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ha.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
            w9 w9Var = this.f50732y;
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
                yj0 lottieAnimation = w9Var.getImageReceiver().getLottieAnimation();
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
                    m10 = LocaleController.getString(R.string.WalletGiftOnCard);
                } else {
                    m10 = i2.o1.m(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                h1 h1Var = this.f50711f;
                if (z11) {
                    h1Var.getClass();
                    h1Var.f50745b = m10;
                    h1Var.f50744a.g(10, m10);
                    return;
                }
                h1Var.b(m10, true);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f50710e0;
        h1 h1Var = this.f50711f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                h1Var.setVisibility(0);
                if (this.f50710e0.gift.resell_amount != null) {
                    int i10 = k6.f21183d6;
                    g6 g6Var = this.f50705b;
                    int v = k6.v(k6.w0(i10, g6Var), k6.o1(0.04f, k6.w0(k6.G6, g6Var)));
                    setRibbonColorKey(k6.uj);
                    h1Var.setStrokeColor(v);
                    this.f50721o0 = true;
                    h1Var.setBackdrop(null);
                    h1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                setRibbonColorKey(k6.Li);
                h1Var.setStrokeColor(0);
                this.f50721o0 = false;
                h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ha.l(this.f50710e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                h1Var.b(i2.o1.m(this.f50710e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                h1Var.setVisibility(0);
                setRibbonColorKey(k6.Li);
                h1Var.setStrokeColor(0);
                this.f50721o0 = false;
                h1Var.setBackdrop(null);
                h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f50710e0.gift.availability_total, 0)), true);
                return;
            } else {
                h1Var.setBackdrop(null);
                h1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.f50706b0;
        if (starGift2 != null) {
            if (!this.f50713g0 && !this.f50715i0) {
                if (this.f50712f0 && starGift2.availability_resale > 0) {
                    h1Var.setVisibility(0);
                    setRibbonColorKey(k6.uj);
                    h1Var.setStrokeColor(0);
                    this.f50721o0 = false;
                    h1Var.setBackdrop(null);
                    h1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.f50709d0) {
                    h1Var.setVisibility(0);
                    setRibbonColorKey(k6.Li);
                    h1Var.setStrokeColor(0);
                    this.f50721o0 = false;
                    h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ha.l(this.f50706b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.f50706b0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        h1Var.setVisibility(0);
                        setRibbonColorKey(k6.Mi);
                        h1Var.setStrokeColor(0);
                        this.f50721o0 = false;
                        h1Var.setBackdrop(null);
                        h1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        h1Var.setVisibility(0);
                        h1Var.setBackdrop(null);
                        this.f50720n0 = -1;
                        h1Var.a(-2650077, -4227818);
                        h1Var.setStrokeColor(0);
                        this.f50721o0 = false;
                        if (this.f50706b0.auction_start_date > ConnectionsManager.getInstance(this.f50703a).getCurrentTime()) {
                            h1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            h1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        h1Var.setVisibility(0);
                        h1Var.setBackdrop(null);
                        this.f50720n0 = -1;
                        h1Var.a(-2650077, -4227818);
                        h1Var.setStrokeColor(0);
                        this.f50721o0 = false;
                        h1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z10) {
                        h1Var.setVisibility(0);
                        setRibbonColorKey(k6.Li);
                        h1Var.setStrokeColor(0);
                        this.f50721o0 = false;
                        h1Var.setBackdrop(null);
                        h1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        h1Var.setBackdrop(null);
                        h1Var.setStrokeColor(0);
                        this.f50721o0 = false;
                        h1Var.setVisibility(8);
                        return;
                    }
                }
            }
            h1Var.setVisibility(0);
            setRibbonColorKey(k6.Li);
            h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ha.l(this.f50706b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h1Var.setStrokeColor(0);
            this.f50721o0 = false;
            h1Var.b(i2.o1.m(this.f50706b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        sg.k kVar = this.f50704a0;
        if (kVar != null) {
            if (kVar.b() > 0) {
                h1Var.setVisibility(0);
                h1Var.setBackdrop(null);
                this.f50720n0 = -1;
                h1Var.a(-2535425, -8229377);
                h1Var.setStrokeColor(0);
                this.f50721o0 = false;
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.f50704a0.b()));
                h1Var.f50745b = formatString;
                h1Var.f50744a.f(12, formatString, true);
                return;
            }
            h1Var.setVisibility(8);
            h1Var.setBackdrop(null);
            h1Var.setStrokeColor(0);
            this.f50721o0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: yh.g1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.f50732y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        this.f50720n0 = -1;
        h1 h1Var = this.f50711f;
        h1Var.setColor(i10);
        h1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f50711f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        h1 h1Var = this.f50711f;
        h1Var.setVisibility(0);
        setRibbonColorKey(k6.Li);
        h1Var.setStrokeColor(0);
        this.f50721o0 = false;
        h1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ha.l(this.f50706b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        h1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }

    @Override
    public final void updateColors() {
        int w02;
        w9 w9Var;
        int w03;
        int i10;
        try {
            boolean q6 = k6.I.q();
            if (q6 != this.f50729u0) {
                this.f50729u0 = q6;
                if (this.f50727s0 != 0 && this.K != null && this.L != null && this.f50730w != null) {
                    a();
                }
                TextView textView = this.M;
                if (textView != null) {
                    if (q6) {
                        i10 = -1333971;
                    } else {
                        i10 = -2722014;
                    }
                    textView.setTextColor(i10);
                }
            }
            h1 h1Var = this.f50711f;
            g6 g6Var = this.f50705b;
            if (h1Var != null) {
                int i11 = this.f50720n0;
                if (i11 >= 0) {
                    j1 j1Var = h1Var.f50744a;
                    ((Paint) j1Var.f24829b).setColor(k6.w0(i11, g6Var));
                    j1Var.invalidateSelf();
                }
                if (this.f50721o0) {
                    h1Var.setStrokeColor(k6.v(k6.w0(k6.f21183d6, g6Var), k6.o1(0.04f, k6.w0(k6.G6, g6Var))));
                }
                h1Var.invalidate();
            }
            if (this.f50722p0 && (w9Var = this.f50719n) != null && (w03 = k6.w0(k6.wj, g6Var)) != this.f50723q0) {
                this.f50723q0 = w03;
                w9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            d1 d1Var = this.e;
            if (d1Var != null) {
                int[] iArr = this.f50725r0;
                if (iArr != null && d1Var.f50653m == iArr && (iArr[0] != (w02 = k6.w0(k6.Mi, g6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    d1Var.f50654n = null;
                }
                d1Var.invalidateSelf();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
