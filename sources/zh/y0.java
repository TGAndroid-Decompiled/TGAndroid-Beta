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
import bi.dd;
import bi.ea;
import bi.pb;
import bi.yc;
import c8.ha;
import c8.ka;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.l00;
public class y0 extends FrameLayout implements a6 {
    public static final int[] f60583v0 = {-2781403, -3635939};
    public final l9 D;
    public FrameLayout.LayoutParams E;
    public final ug.z0 F;
    public final ug.z0 G;
    public final TextView H;
    public final TextView I;
    public final v41 J;
    public final l00 K;
    public final TextView L;
    public final TextView M;
    public pb N;
    public boolean O;
    public float P;
    public my0 Q;
    public my0 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final w5 W;
    public final int f60584a;
    public ug.j f60585a0;
    public final f6 f60586b;
    public TL_stars.StarGift f60587b0;
    public final en0 f60588c;
    public boolean f60589c0;
    public final FrameLayout d;
    public boolean f60590d0;
    public final v0 f60591e;
    public TL_stars.SavedStarGift f60592e0;
    public final z0 f60593f;
    public boolean f60594f0;
    public boolean f60595g0;
    public final w8 h;
    public boolean f60596h0;
    public boolean f60597i0;
    public ug.j f60598j0;
    public TLRPC.Document f60599k0;
    public TL_stars.SavedStarGift f60600l0;
    public wo m0;
    public final l9 f60601n;
    public int f60602n0;
    public boolean f60603o0;
    public boolean f60604p0;
    public int f60605q0;
    public final FrameLayout.LayoutParams f60606r;
    public int[] f60607r0;
    public final FrameLayout.LayoutParams f60608s;
    public int f60609s0;
    public boolean f60610t0;
    public boolean f60611u0;
    public final FrameLayout f60612w;
    public final ImageView f60613x;
    public final TextView f60614y;

    public y0(int i7, Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new w5(this, 0L, 320L, xq.h);
        this.f60602n0 = -1;
        this.f60611u0 = k6.I.q();
        this.f60584a = i7;
        this.f60586b = f6Var;
        ka.b(this, 0.04f, 1.5f);
        this.f60588c = new en0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        v0 v0Var = new v0(frameLayout, f6Var, true);
        this.f60591e = v0Var;
        frameLayout.setBackground(v0Var);
        addView(frameLayout, ha.e(-1, -1, 119));
        z0 z0Var = new z0(context);
        this.f60593f = z0Var;
        addView(z0Var, ha.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        l9 l9Var = new l9(context);
        this.D = l9Var;
        l9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = ha.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(l9Var, d);
        ug.z0 z0Var2 = new ug.z0(3, context, f6Var);
        this.F = z0Var2;
        z0Var2.setImageReceiver(l9Var.getImageReceiver());
        frameLayout.addView(z0Var2, ha.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        ug.z0 z0Var3 = new ug.z0(4, context, f6Var);
        this.G = z0Var3;
        z0Var3.setImageReceiver(l9Var.getImageReceiver());
        frameLayout.addView(z0Var3, ha.e(44, 44, 17));
        z0Var3.setAlpha(0.0f);
        z0Var3.setScaleX(0.3f);
        z0Var3.setScaleY(0.3f);
        z0Var3.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i12 = k6.G6;
        r6.V(textView, i12, f6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView i13 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = i13;
        r6.V(i13, i12, f6Var);
        i13.setGravity(17);
        i13.setTextSize(1, 12.0f);
        frameLayout.addView(i13, ha.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        v41 v41Var = new v41(13, context, this);
        this.J = v41Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(v41Var, ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        l00 l00Var = new l00(context);
        this.K = l00Var;
        l00Var.setBackgroundColor(-16776961);
        v41Var.addView(l00Var, ha.c(0.0f, 0));
        v41Var.addView(textView2, ha.e(-2, 26, 17));
        if (k6.I.q()) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        l00Var.setBackground(new d1(i10));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (k6.I.q()) {
            i11 = -1333971;
        } else {
            i11 = -2722014;
        }
        textView3.setTextColor(i11);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, ha.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new w8((f6) null);
        l9 l9Var2 = new l9(context);
        this.f60601n = l9Var2;
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        l9Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = ha.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f60606r = d2;
        frameLayout.addView(l9Var2, d2);
        this.f60608s = ha.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f60612w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232201);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, ha.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, ha.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.f60613x = imageView;
        imageView.setImageResource(2131231954);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, ha.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f60614y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, ha.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        z0Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f60592e0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    private void setRibbonColorKey(int i7) {
        this.f60593f.setColor(k6.w0(i7, this.f60586b));
        this.f60602n0 = i7;
    }

    public final void a() {
        int i7;
        int i10;
        boolean q10 = k6.I.q();
        this.f60611u0 = q10;
        if (this.f60610t0) {
            i7 = 1090519039;
        } else if (q10) {
            i7 = 518759725;
        } else {
            i7 = 1088989954;
        }
        if (q10) {
            i10 = -1333971;
        } else if (this.f60609s0 == 2) {
            i10 = -4229632;
        } else {
            i10 = -2722014;
        }
        this.K.setBackground(new d1(i7));
        this.L.setTextColor(i10);
        ImageView imageView = this.f60613x;
        imageView.setColorFilter(i10);
        imageView.setBackground(k6.d0(org.telegram.messenger.g0.L(10.0f), i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.zj));
        hashSet.add(Integer.valueOf(k6.Aj));
        hashSet.add(Integer.valueOf(k6.ik));
        hashSet.add(Integer.valueOf(k6.kk));
        hashSet.add(Integer.valueOf(k6.f27852d6));
    }

    public void b(i60 i60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        float f14;
        v41 v41Var;
        float f15;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f16;
        Canvas canvas2 = canvas;
        l9 l9Var = this.f60601n;
        l9 l9Var2 = this.D;
        v0 v0Var = this.f60591e;
        z0 z0Var = this.f60593f;
        Rect rect = this.S;
        FrameLayout frameLayout = this.f60612w;
        ImageView imageView2 = this.f60613x;
        v41 v41Var2 = this.J;
        ug.z0 z0Var2 = this.F;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f13 = org.telegram.messenger.g0.L(63.0f) * f12;
        } else {
            f13 = 0.0f;
        }
        v0Var.setBounds(0, 0, (int) f10, (int) f11);
        v0Var.b(canvas2, f12);
        v0Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f17 = f11 - f13;
        l9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f17 - W1) / 2.0f, W1, W1);
        l9Var2.getImageReceiver().h(canvas2, null);
        zg0 B = l9Var2.getImageReceiver().B();
        if (B != null && B.f41003k0) {
            i60Var.invalidate();
        }
        if (z0Var2.getVisibility() == 0 && z0Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f10 - z0Var2.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(z0Var2.getY(), (f17 - z0Var2.getMeasuredHeight()) / 2.0f, f12));
            f14 = 1.0f;
            v41Var = v41Var2;
            f15 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, z0Var2.getWidth(), z0Var2.getHeight(), (int) (z0Var2.getAlpha() * (1.0f - f12) * 255.0f), 31);
            z0Var2.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f14 = 1.0f;
            v41Var = v41Var2;
            f15 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (l9Var.getVisibility() == 0 && l9Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            l9Var.draw(canvas2);
            canvas2.restore();
        }
        if (z0Var.getVisibility() == 0 && z0Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(2.0f));
            f16 = f14;
            float T1 = org.telegram.messenger.g0.T1(f16, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-z0Var.getWidth(), f15);
            z0Var.draw(canvas2);
            canvas2.restore();
        } else {
            f16 = f14;
        }
        if (tL_starGiftUnique != null) {
            if (this.Q == null) {
                this.Q = new my0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.R == null) {
                this.R = new my0(id.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            my0 my0Var = this.Q;
            my0Var.f36158p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f18 = f16 - f12;
            my0Var.c((f10 - this.Q.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.Q.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), f12, -1, canvas);
            my0 my0Var2 = this.R;
            my0Var2.f36158p = f10 - org.telegram.messenger.g0.L(8.0f);
            my0Var2.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (v41Var != null && v41Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(v41Var.getX(), v41Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, v41Var.getWidth(), v41Var.getHeight(), (int) (v41Var.getAlpha() * (f16 - f12) * 255.0f), 31);
            v41Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f16 - f12) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z9, boolean z10) {
        if (this.m0 == null) {
            wo woVar = new wo(21, getContext(), null);
            this.m0 = woVar;
            woVar.b(-1, k6.f27852d6, k6.f27982k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, ha.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f60601n.setVisibility(8);
        this.m0.a(z9, z10);
    }

    public final void d(boolean z9, boolean z10) {
        int i7;
        float f10;
        TL_stars.SavedStarGift savedStarGift;
        float f11;
        if (this.T == z9) {
            return;
        }
        this.T = z9;
        float f12 = 0.0f;
        boolean z11 = false;
        float f13 = 0.3f;
        FrameLayout frameLayout = this.f60612w;
        if (z10) {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z9) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z9) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).withEndAction(new w0(this, z9, 1)).start();
        } else {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            if (z9) {
                f12 = 1.0f;
            }
            frameLayout.setAlpha(f12);
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            frameLayout.setScaleX(f10);
            if (z9) {
                f13 = 1.0f;
            }
            frameLayout.setScaleY(f13);
        }
        if (!this.T && this.V && !this.f60596h0 && (savedStarGift = this.f60592e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z11 = true;
        }
        g(z11, z10);
        l();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.W.d(this.V);
        if (d > 0.0f) {
            this.f60588c.a(canvas, d);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z9, boolean z10) {
        boolean z11;
        TL_stars.SavedStarGift savedStarGift;
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        if (!z10) {
            this.W.a(z9);
        }
        invalidate();
        if (!this.T && z9 && !this.f60596h0 && (savedStarGift = this.f60592e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z11 = true;
        } else {
            z11 = false;
        }
        g(z11, z10);
    }

    public final void f(boolean z9, boolean z10) {
        float f10;
        float f11;
        this.f60591e.f(z9, z10);
        float f12 = 0.0f;
        ImageView imageView = this.f60613x;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z9) {
                f11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f11);
            if (z9) {
                f12 = org.telegram.messenger.g0.L(6.0f);
            }
            translationX.translationY(f12).setDuration(320L).setInterpolator(xq.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z9) {
            f10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = 0.0f;
        }
        imageView.setTranslationX(f10);
        if (z9) {
            f12 = org.telegram.messenger.g0.L(6.0f);
        }
        imageView.setTranslationY(f12);
    }

    public final void g(boolean z9, boolean z10) {
        float f10;
        float f11;
        if (this.U == z9) {
            return;
        }
        this.U = z9;
        float f12 = 0.0f;
        int i7 = 0;
        float f13 = 0.3f;
        ug.z0 z0Var = this.G;
        if (z10) {
            z0Var.setVisibility(0);
            ViewPropertyAnimator animate = z0Var.animate();
            if (z9) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z9) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).withEndAction(new w0(this, z9, 0)).start();
            return;
        }
        if (!z9) {
            i7 = 8;
        }
        z0Var.setVisibility(i7);
        if (z9) {
            f12 = 1.0f;
        }
        z0Var.setAlpha(f12);
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.3f;
        }
        z0Var.setScaleX(f10);
        if (z9) {
            f13 = 1.0f;
        }
        z0Var.setScaleY(f13);
    }

    public TL_stars.StarGift getGift() {
        return this.f60587b0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f60587b0;
        if (starGift != null) {
            return starGift.f27185id;
        }
        return 0L;
    }

    public ug.j getPremiumTier() {
        return this.f60585a0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f60592e0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: zh.y0.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z9, boolean z10) {
        Integer num;
        Integer num2;
        int i7;
        float f10;
        float f11;
        int i10;
        long j3;
        boolean z11;
        l00 l00Var;
        boolean z12;
        boolean z13;
        boolean z14;
        float f12;
        float f13;
        pb pbVar = this.N;
        if (pbVar != null) {
            pbVar.run();
            this.N = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        v0 v0Var = this.f60591e;
        v0Var.d(stargiftattributebackdrop);
        v0Var.e((TL_stars.starGiftAttributePattern) ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        v0Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        l9 l9Var = this.D;
        l9Var.setTranslationY(0.0f);
        ug.z0 z0Var = this.F;
        z0Var.H = true;
        z0Var.I = false;
        z0Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(k6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        z0Var.setBlendWithColor(num);
        ug.z0 z0Var2 = this.G;
        z0Var2.H = true;
        z0Var2.I = false;
        z0Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(k6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        z0Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.f60613x;
        imageView.setVisibility(i7);
        FrameLayout frameLayout = this.f60612w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(k6.L(org.telegram.messenger.g0.L(20.0f), k6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            int i11 = k6.Ci;
            f6 f6Var = this.f60586b;
            r6.C(frameLayout, k6.L(L, k6.w0(i11, f6Var)), r6.N(i11), f6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        l9Var.setLayoutParams(layoutParams);
        float f14 = 0.4f;
        if (this.f60600l0 == savedStarGift) {
            z0Var.setVisibility(0);
            ViewPropertyAnimator animate = z0Var.animate();
            if (savedStarGift.unsaved) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (savedStarGift.unsaved) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(350L).setInterpolator(xq.h).withEndAction(new yf.b(7, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            z0Var.setAlpha(f10);
            if (savedStarGift.unsaved) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            z0Var.setScaleX(f11);
            if (savedStarGift.unsaved) {
                f14 = 1.0f;
            }
            z0Var.setScaleY(f14);
            if (savedStarGift.unsaved) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            z0Var.setVisibility(i10);
        }
        boolean z15 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        l9 l9Var2 = this.f60601n;
        l9Var2.setColorFilter(null);
        this.f60604p0 = false;
        l9Var2.setLayoutParams(this.f60606r);
        int i12 = this.f60584a;
        if (z15 && savedStarGift.name_hidden) {
            l9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            l9Var2.setVisibility(0);
            xp a10 = yc.a(44, "anonymous");
            j3 = 0;
            int L2 = org.telegram.messenger.g0.L(16.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            a10.f40355e = L2;
            a10.f40356f = L3;
            l9Var2.setImageDrawable(a10);
        } else {
            j3 = 0;
            long o4 = m5.o(savedStarGift.from_id);
            int i13 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
            w8 w8Var = this.h;
            if (i13 > 0) {
                TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(o4));
                if (a22 != null) {
                    l9Var2.setVisibility(0);
                    w8Var.r(a22);
                    l9Var2.e(a22, w8Var);
                } else {
                    l9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(-o4));
                if (M0 != null) {
                    l9Var2.setVisibility(0);
                    w8Var.q(M0);
                    l9Var2.e(M0, w8Var);
                } else {
                    l9Var2.setVisibility(8);
                }
            }
        }
        l00 l00Var2 = this.K;
        v41 v41Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            wp[] wpVarArr = new wp[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && m5.o(starGift.owner_id) == p10.i(i12).e()) {
                z14 = true;
                textView.setText(dd.s1(dd.X0(true, "XTR " + ((Object) dd.M0(savedStarGift.gift.getResellAmount(cg.b.f6163b).o(), 1.0f, ',')), 0.95f, wpVarArr, 0.0f, 1.0f), true));
            } else {
                z14 = true;
                textView.setText(dd.U0("XTR " + id.E(savedStarGift.gift.getResellStars(), ','), 0.95f, wpVarArr));
            }
            wp wpVar = wpVarArr[0];
            if (wpVar != null) {
                wpVar.f40020r = 0.0f;
                wpVar.f40021s = org.telegram.messenger.g0.L(0.5f);
            }
            int w10 = k6.w(stargiftattributebackdrop.center_color | (-16777216), k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.f60609s0 = 0;
            l00Var2.setBackground(new d1(1895825407, w10));
            textView.setTextColor(-1);
            imageView.setBackground(k6.d0(org.telegram.messenger.g0.L(10.0f), w10));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) v41Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) v41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(79.0f);
            z11 = z14;
        } else {
            if (z9) {
                textView.setVisibility(8);
                this.E.topMargin = org.telegram.messenger.g0.L(12.0f);
                this.E.bottomMargin = org.telegram.messenger.g0.L(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.E;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            }
            if (z15) {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                jg.g.v(textView, 1, 12.0f, null, 2131750060);
                z11 = true;
                l00Var = l00Var2;
            } else {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j10 = starGift2.stars;
                z11 = true;
                l00Var = l00Var2;
                long j11 = savedStarGift.convert_stars;
                if (j11 <= j3) {
                    j11 = starGift2.convert_stars;
                }
                textView.setText(dd.a1(false, jg.g.m(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            if (z15) {
                this.f60609s0 = 0;
                textView.setTextColor(-1);
                l00Var.setBackground(new d1(1090519039));
                imageView.setBackground(k6.d0(org.telegram.messenger.g0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.f60609s0 = 2;
                this.f60610t0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) v41Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) v41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        }
        this.M.setVisibility(8);
        this.f60600l0 = savedStarGift;
        this.f60598j0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f60592e0;
        this.f60585a0 = null;
        this.f60587b0 = null;
        this.f60590d0 = false;
        this.f60592e0 = savedStarGift;
        this.f60594f0 = false;
        this.f60595g0 = false;
        this.f60596h0 = z10;
        this.Q = null;
        this.R = null;
        if (savedStarGift.pinned_to_top && (!z15 || savedStarGift.name_hidden)) {
            z12 = z11;
        } else {
            z12 = false;
        }
        if (savedStarGift2 == savedStarGift) {
            z13 = z11;
        } else {
            z13 = false;
        }
        d(z12, z13);
        l();
        if (savedStarGift2 != savedStarGift) {
            return false;
        }
        return z11;
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        l9 l9Var = this.D;
        if (document == null) {
            l9Var.b();
            this.f60599k0 = null;
        } else if (this.f60599k0 == document) {
        } else {
            this.f60599k0 = document;
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            l9Var.m(hc.b(document), "80_80_nolimit_pcache", hc.c(w10, document), "80_80_nolimit_pcache", t5.f(document, k6.f27796a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z9, boolean z10, float f10) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String m10;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i7;
        ColorMatrixColorFilter colorMatrixColorFilter;
        boolean z11;
        if (this.P != f10) {
            this.P = f10;
            TL_stars.TL_starGiftUnique uniqueStarGift2 = getUniqueStarGift();
            if (uniqueStarGift2 == null) {
                stargiftattributebackdrop = null;
            } else {
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            }
            if (stargiftattributebackdrop == null) {
                i7 = -11184811;
            } else {
                i7 = stargiftattributebackdrop.pattern_color | (-16777216);
            }
            float f11 = 1.0f - f10;
            if (f10 <= 0.0f) {
                colorMatrixColorFilter = null;
            } else {
                colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{f11, 0.0f, 0.0f, 0.0f, Color.red(i7) * f10, 0.0f, f11, 0.0f, 0.0f, Color.green(i7) * f10, 0.0f, 0.0f, f11, 0.0f, Color.blue(i7) * f10, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f10), 0.0f});
            }
            l9 l9Var = this.D;
            l9Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = l9Var.getImageReceiver();
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            imageReceiver.f21222u0 = z11;
            if (i10 > 0) {
                l9Var.getImageReceiver().Q0();
                zg0 B = l9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            l9Var.invalidate();
        }
        if (this.O != z9) {
            this.O = z9;
            if (getUniqueStarGift() != null) {
                if (z9) {
                    m10 = id.M0(2131743107, null);
                } else {
                    m10 = jg.g.m(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                z0 z0Var = this.f60593f;
                if (z10) {
                    z0Var.getClass();
                    z0Var.f60621b = m10;
                    z0Var.f60620a.g(10, m10);
                    return;
                }
                z0Var.b(m10, true);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f60592e0;
        z0 z0Var = this.f60593f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                z0Var.setVisibility(0);
                if (this.f60592e0.gift.resell_amount != null) {
                    int i7 = k6.f27852d6;
                    f6 f6Var = this.f60586b;
                    int w10 = k6.w(k6.w0(i7, f6Var), k6.r1(0.04f, k6.w0(k6.G6, f6Var)));
                    setRibbonColorKey(k6.ik);
                    z0Var.setStrokeColor(w10);
                    this.f60603o0 = true;
                    z0Var.setBackdrop(null);
                    z0Var.b(id.M0(2131750090, null), false);
                    return;
                }
                setRibbonColorKey(k6.zj);
                z0Var.setStrokeColor(0);
                this.f60603o0 = false;
                z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.f60592e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                z0Var.b(jg.g.m(this.f60592e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                z0Var.setVisibility(0);
                setRibbonColorKey(k6.zj);
                z0Var.setStrokeColor(0);
                this.f60603o0 = false;
                z0Var.setBackdrop(null);
                z0Var.b(id.a0(null, null, 2131750136, org.telegram.messenger.g0.o0(this.f60592e0.gift.availability_total, 0)), true);
                return;
            } else {
                z0Var.setBackdrop(null);
                z0Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.f60587b0;
        if (starGift2 != null) {
            if (!this.f60595g0 && !this.f60597i0) {
                if (this.f60594f0 && starGift2.availability_resale > 0) {
                    z0Var.setVisibility(0);
                    setRibbonColorKey(k6.ik);
                    z0Var.setStrokeColor(0);
                    this.f60603o0 = false;
                    z0Var.setBackdrop(null);
                    z0Var.b(id.M0(2131750031, null), false);
                    return;
                } else if (this.f60590d0) {
                    z0Var.setVisibility(0);
                    setRibbonColorKey(k6.zj);
                    z0Var.setStrokeColor(0);
                    this.f60603o0 = false;
                    z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.f60587b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    z0Var.b(id.a0(null, null, 2131750136, org.telegram.messenger.g0.o0(this.f60587b0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z9 = starGift2.limited;
                    if (z9 && starGift2.availability_remains <= 0) {
                        z0Var.setVisibility(0);
                        setRibbonColorKey(k6.Aj);
                        z0Var.setStrokeColor(0);
                        this.f60603o0 = false;
                        z0Var.setBackdrop(null);
                        z0Var.b(id.M0(2131749977, null), true);
                        return;
                    } else if (starGift2.auction) {
                        z0Var.setVisibility(0);
                        z0Var.setBackdrop(null);
                        this.f60602n0 = -1;
                        z0Var.a(-2650077, -4227818);
                        z0Var.setStrokeColor(0);
                        this.f60603o0 = false;
                        if (this.f60587b0.auction_start_date > ConnectionsManager.getInstance(this.f60584a).getCurrentTime()) {
                            z0Var.b(id.M0(2131750134, null), true);
                            return;
                        } else {
                            z0Var.b(id.M0(2131750135, null), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        z0Var.setVisibility(0);
                        z0Var.setBackdrop(null);
                        this.f60602n0 = -1;
                        z0Var.a(-2650077, -4227818);
                        z0Var.setStrokeColor(0);
                        this.f60603o0 = false;
                        z0Var.b(id.M0(2131750133, null), true);
                        return;
                    } else if (z9) {
                        z0Var.setVisibility(0);
                        setRibbonColorKey(k6.zj);
                        z0Var.setStrokeColor(0);
                        this.f60603o0 = false;
                        z0Var.setBackdrop(null);
                        z0Var.b(id.M0(2131750132, null), true);
                        return;
                    } else {
                        z0Var.setBackdrop(null);
                        z0Var.setStrokeColor(0);
                        this.f60603o0 = false;
                        z0Var.setVisibility(8);
                        return;
                    }
                }
            }
            z0Var.setVisibility(0);
            setRibbonColorKey(k6.zj);
            z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.f60587b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            z0Var.setStrokeColor(0);
            this.f60603o0 = false;
            z0Var.b(jg.g.m(this.f60587b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        ug.j jVar = this.f60585a0;
        if (jVar != null) {
            if (jVar.b() > 0) {
                z0Var.setVisibility(0);
                z0Var.setBackdrop(null);
                this.f60602n0 = -1;
                z0Var.a(-2535425, -8229377);
                z0Var.setStrokeColor(0);
                this.f60603o0 = false;
                String a02 = id.a0(null, null, 2131749665, Integer.valueOf(this.f60585a0.b()));
                z0Var.f60621b = a02;
                z0Var.f60620a.f(12, a02, true);
                return;
            }
            z0Var.setVisibility(8);
            z0Var.setBackdrop(null);
            z0Var.setStrokeColor(0);
            this.f60603o0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: zh.y0.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i7) {
        this.D.setLayerNum(i7);
    }

    public void setImageSize(int i7) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i7;
        layoutParams.height = i7;
    }

    public void setRibbonColor(int i7) {
        this.f60602n0 = -1;
        z0 z0Var = this.f60593f;
        z0Var.setColor(i7);
        z0Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f60593f.b(str, true);
    }

    public void setRibbonTextOneOf(int i7) {
        z0 z0Var = this.f60593f;
        z0Var.setVisibility(0);
        setRibbonColorKey(k6.zj);
        z0Var.setStrokeColor(0);
        this.f60603o0 = false;
        z0Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) ea.l(this.f60587b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        z0Var.b(id.a0(null, null, 2131750136, org.telegram.messenger.g0.o0(i7, 0)), true);
    }

    @Override
    public final void updateColors() {
        int w02;
        l9 l9Var;
        int w03;
        int i7;
        try {
            boolean q10 = k6.I.q();
            if (q10 != this.f60611u0) {
                this.f60611u0 = q10;
                if (this.f60609s0 != 0 && this.K != null && this.L != null && this.f60613x != null) {
                    a();
                }
                TextView textView = this.M;
                if (textView != null) {
                    if (q10) {
                        i7 = -1333971;
                    } else {
                        i7 = -2722014;
                    }
                    textView.setTextColor(i7);
                }
            }
            z0 z0Var = this.f60593f;
            f6 f6Var = this.f60586b;
            if (z0Var != null) {
                int i10 = this.f60602n0;
                if (i10 >= 0) {
                    b1 b1Var = z0Var.f60620a;
                    ((Paint) b1Var.f220b).setColor(k6.w0(i10, f6Var));
                    b1Var.invalidateSelf();
                }
                if (this.f60603o0) {
                    z0Var.setStrokeColor(k6.w(k6.w0(k6.f27852d6, f6Var), k6.r1(0.04f, k6.w0(k6.G6, f6Var))));
                }
                z0Var.invalidate();
            }
            if (this.f60604p0 && (l9Var = this.f60601n) != null && (w03 = k6.w0(k6.kk, f6Var)) != this.f60605q0) {
                this.f60605q0 = w03;
                l9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            v0 v0Var = this.f60591e;
            if (v0Var != null) {
                int[] iArr = this.f60607r0;
                if (iArr != null && v0Var.f60557m == iArr && (iArr[0] != (w02 = k6.w0(k6.Aj, f6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    v0Var.f60558n = null;
                }
                v0Var.invalidateSelf();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
