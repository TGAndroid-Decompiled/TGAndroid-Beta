package ph;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.messenger.o5;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.x60;
import org.telegram.ui.do0;
import rh.c8;
import rh.h8;
import w7.b6;
import w7.e6;
public class c1 extends FrameLayout implements k6 {
    public static final int[] f44983v0 = {-2781403, -3635939};
    public final g9 D;
    public FrameLayout.LayoutParams E;
    public final kg.l1 F;
    public final kg.l1 G;
    public final TextView H;
    public final TextView I;
    public final org.telegram.ui.Components.voip.i0 J;
    public final do0 K;
    public final TextView L;
    public final TextView M;
    public d01 N;
    public boolean O;
    public float P;
    public qz0 Q;
    public qz0 R;
    public final Rect S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final t5 W;
    public final int f44984a;
    public kg.m f44985a0;
    public final p6 f44986b;
    public TL_stars.StarGift f44987b0;
    public final fo0 f44988c;
    public boolean f44989c0;
    public final FrameLayout d;
    public boolean f44990d0;
    public final z0 e;
    public TL_stars.SavedStarGift f44991e0;
    public final d1 f44992f;
    public boolean f44993f0;
    public boolean f44994g0;
    public final r8 h;
    public boolean f44995h0;
    public boolean f44996i0;
    public kg.m f44997j0;
    public TLRPC.Document f44998k0;
    public TL_stars.SavedStarGift f44999l0;
    public ep m0;
    public final g9 f45000n;
    public int f45001n0;
    public boolean f45002o0;
    public boolean f45003p0;
    public int f45004q0;
    public final FrameLayout.LayoutParams f45005r;
    public int[] f45006r0;
    public final FrameLayout.LayoutParams f45007s;
    public int f45008s0;
    public boolean f45009t0;
    public boolean f45010u0;
    public final FrameLayout f45011w;
    public final ImageView f45012x;
    public final TextView f45013y;

    public c1(int i10, Context context, p6 p6Var) {
        super(context);
        int i11;
        int i12;
        this.P = -1.0f;
        this.S = new Rect();
        this.W = new t5(this, 0L, 320L, gr.h);
        this.f45001n0 = -1;
        this.f45010u0 = t6.I.q();
        this.f44984a = i10;
        this.f44986b = p6Var;
        e6.b(this, 0.04f, 1.5f);
        this.f44988c = new fo0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        z0 z0Var = new z0(frameLayout, p6Var, true);
        this.e = z0Var;
        frameLayout.setBackground(z0Var);
        addView(frameLayout, b6.e(-1, -1, 119));
        d1 d1Var = new d1(context);
        this.f44992f = d1Var;
        addView(d1Var, b6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        g9 g9Var = new g9(context);
        this.D = g9Var;
        g9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = b6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.E = d;
        frameLayout.addView(g9Var, d);
        kg.l1 l1Var = new kg.l1(3, context, p6Var);
        this.F = l1Var;
        l1Var.setImageReceiver(g9Var.getImageReceiver());
        frameLayout.addView(l1Var, b6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        kg.l1 l1Var2 = new kg.l1(4, context, p6Var);
        this.G = l1Var2;
        l1Var2.setImageReceiver(g9Var.getImageReceiver());
        frameLayout.addView(l1Var2, b6.e(44, 44, 17));
        l1Var2.setAlpha(0.0f);
        l1Var2.setScaleX(0.3f);
        l1Var2.setScaleY(0.3f);
        l1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.H = textView;
        int i13 = t6.G6;
        a7.V(textView, i13, p6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, b6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.I = l4;
        a7.V(l4, i13, p6Var);
        l4.setGravity(17);
        l4.setTextSize(1, 12.0f);
        frameLayout.addView(l4, b6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, context, 4);
        this.J = i0Var;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(i0Var, b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        do0 do0Var = new do0(context);
        this.K = do0Var;
        do0Var.setBackgroundColor(-16776961);
        i0Var.addView(do0Var, b6.c(0.0f, 0));
        i0Var.addView(textView2, b6.e(-2, 26, 17));
        if (t6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        do0Var.setBackground(new i1(i11));
        TextView textView3 = new TextView(context);
        this.M = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (t6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, b6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new r8((p6) null);
        g9 g9Var2 = new g9(context);
        this.f45000n = g9Var2;
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        g9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = b6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f45005r = d10;
        frameLayout.addView(g9Var2, d10);
        this.f45007s = b6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45011w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e = z20.e(context, 2131232200);
        e.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e, b6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, b6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.f45012x = imageView;
        imageView.setImageResource(2131231953);
        imageView.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, b6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f45013y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.i0.o());
        textView4.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, b6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        d1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f44991e0;
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
        this.f44992f.setColor(t6.w0(i10, this.f44986b));
        this.f45001n0 = i10;
    }

    public final void a() {
        int i10;
        int i11;
        boolean q6 = t6.I.q();
        this.f45010u0 = q6;
        if (this.f45009t0) {
            i10 = 1090519039;
        } else if (q6) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        if (q6) {
            i11 = -1333971;
        } else if (this.f45008s0 == 2) {
            i11 = -4229632;
        } else {
            i11 = -2722014;
        }
        this.K.setBackground(new i1(i10));
        this.L.setTextColor(i11);
        ImageView imageView = this.f45012x;
        imageView.setColorFilter(i11);
        imageView.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), i10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.zj));
        hashSet.add(Integer.valueOf(t6.Aj));
        hashSet.add(Integer.valueOf(t6.ik));
        hashSet.add(Integer.valueOf(t6.kk));
        hashSet.add(Integer.valueOf(t6.f20929d6));
    }

    public void b(x60 x60Var, Canvas canvas, float f7, float f10, float f11) {
        float f12;
        float f13;
        org.telegram.ui.Components.voip.i0 i0Var;
        float f14;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f15;
        Canvas canvas2 = canvas;
        g9 g9Var = this.f45000n;
        g9 g9Var2 = this.D;
        z0 z0Var = this.e;
        d1 d1Var = this.f44992f;
        Rect rect = this.S;
        FrameLayout frameLayout = this.f45011w;
        ImageView imageView2 = this.f45012x;
        org.telegram.ui.Components.voip.i0 i0Var2 = this.J;
        kg.l1 l1Var = this.F;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f7 / 2.0f, f10 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f12 = org.telegram.messenger.i0.L(63.0f) * f11;
        } else {
            f12 = 0.0f;
        }
        z0Var.setBounds(0, 0, (int) f7, (int) f10);
        z0Var.b(canvas2, f11);
        z0Var.getPadding(rect);
        float W1 = org.telegram.messenger.i0.W1(f11, org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(120.0f));
        float f16 = f10 - f12;
        g9Var2.getImageReceiver().y0((f7 - W1) / 2.0f, (f16 - W1) / 2.0f, W1, W1);
        g9Var2.getImageReceiver().h(canvas2, null);
        bi0 B = g9Var2.getImageReceiver().B();
        if (B != null && B.f24765k0) {
            x60Var.invalidate();
        }
        if (l1Var.getVisibility() == 0 && l1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f7 - l1Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.i0.T1(l1Var.getY(), (f16 - l1Var.getMeasuredHeight()) / 2.0f, f11));
            f13 = 1.0f;
            i0Var = i0Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, l1Var.getWidth(), l1Var.getHeight(), (int) (l1Var.getAlpha() * (1.0f - f11) * 255.0f), 31);
            l1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f13 = 1.0f;
            i0Var = i0Var2;
            f14 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(2.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (g9Var.getVisibility() == 0 && g9Var.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.L(2.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top);
            g9Var.draw(canvas2);
            canvas2.restore();
        }
        if (d1Var.getVisibility() == 0 && d1Var.getAlpha() > f14) {
            canvas2.save();
            canvas2.translate(f7 - org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(2.0f));
            f15 = f13;
            float T1 = org.telegram.messenger.i0.T1(f15, 1.25f, f11);
            canvas2.scale(T1, T1);
            canvas2.translate(-d1Var.getWidth(), f14);
            d1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f15 = f13;
        }
        if (tL_starGiftUnique != null) {
            if (this.Q == null) {
                this.Q = new qz0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.i0.o());
            }
            if (this.R == null) {
                this.R = new qz0(cd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            qz0 qz0Var = this.Q;
            qz0Var.f29784p = f7 - org.telegram.messenger.i0.L(8.0f);
            float f17 = f15 - f11;
            qz0Var.c((f7 - this.Q.k()) / 2.0f, ((f10 - org.telegram.messenger.i0.L(40.0f)) - (this.Q.i() / 2.0f)) + (org.telegram.messenger.i0.L(50.0f) * f17), f11, -1, canvas);
            qz0 qz0Var2 = this.R;
            qz0Var2.f29784p = f7 - org.telegram.messenger.i0.L(8.0f);
            qz0Var2.c((f7 - this.R.k()) / 2.0f, ((f10 - org.telegram.messenger.i0.L(19.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.i0.L(50.0f) * f17), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        if (i0Var != null && i0Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(i0Var.getX(), i0Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, i0Var.getWidth(), i0Var.getHeight(), (int) (i0Var.getAlpha() * (f15 - f11) * 255.0f), 31);
            i0Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f15 - f11) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z10, boolean z11) {
        if (this.m0 == null) {
            ep epVar = new ep(21, getContext(), null);
            this.m0 = epVar;
            epVar.b(-1, t6.f20929d6, t6.f21059k7);
            this.m0.setDrawUnchecked(false);
            this.d.addView(this.m0, b6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f45000n.setVisibility(8);
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
        FrameLayout frameLayout = this.f45011w;
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
            scaleX.scaleY(f12).withEndAction(new a1(this, z10, 1)).start();
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
        if (!this.T && this.V && !this.f44995h0 && (savedStarGift = this.f44991e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        g(z12, z11);
        l();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.W.d(this.V);
        if (d > 0.0f) {
            this.f44988c.a(canvas, d);
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
        if (!this.T && z10 && !this.f44995h0 && (savedStarGift = this.f44991e0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        ImageView imageView = this.f45012x;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = org.telegram.messenger.i0.L(6.0f);
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f10);
            if (z10) {
                f11 = org.telegram.messenger.i0.L(6.0f);
            }
            translationX.translationY(f11).setDuration(320L).setInterpolator(gr.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z10) {
            f7 = org.telegram.messenger.i0.L(6.0f);
        } else {
            f7 = 0.0f;
        }
        imageView.setTranslationX(f7);
        if (z10) {
            f11 = org.telegram.messenger.i0.L(6.0f);
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
        kg.l1 l1Var = this.G;
        if (z11) {
            l1Var.setVisibility(0);
            ViewPropertyAnimator animate = l1Var.animate();
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
            scaleX.scaleY(f12).withEndAction(new a1(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        l1Var.setVisibility(i10);
        if (z10) {
            f11 = 1.0f;
        }
        l1Var.setAlpha(f11);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.3f;
        }
        l1Var.setScaleX(f7);
        if (z10) {
            f12 = 1.0f;
        }
        l1Var.setScaleY(f12);
    }

    public TL_stars.StarGift getGift() {
        return this.f44987b0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f44987b0;
        if (starGift != null) {
            return starGift.f20021id;
        }
        return 0L;
    }

    public kg.m getPremiumTier() {
        return this.f44985a0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f44991e0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: ph.c1.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
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
        do0 do0Var;
        boolean z13;
        boolean z14;
        boolean z15;
        float f11;
        float f12;
        d01 d01Var = this.N;
        if (d01Var != null) {
            d01Var.run();
            this.N = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        z0 z0Var = this.e;
        z0Var.d(stargiftattributebackdrop);
        z0Var.e((TL_stars.starGiftAttributePattern) rh.e6.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        z0Var.g(null);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        g9 g9Var = this.D;
        g9Var.setTranslationY(0.0f);
        kg.l1 l1Var = this.F;
        l1Var.H = true;
        l1Var.I = false;
        l1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(t6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        l1Var.setBlendWithColor(num);
        kg.l1 l1Var2 = this.G;
        l1Var2.H = true;
        l1Var2.I = false;
        l1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(t6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        l1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f45012x;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.f45011w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(t6.L(org.telegram.messenger.i0.L(20.0f), t6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.i0.L(20.0f);
            int i12 = t6.Ci;
            p6 p6Var = this.f44986b;
            a7.C(frameLayout, t6.L(L, t6.w0(i12, p6Var)), a7.N(i12), p6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.gravity = 17;
        g9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f44999l0 == savedStarGift) {
            l1Var.setVisibility(0);
            ViewPropertyAnimator animate = l1Var.animate();
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
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(gr.h).withEndAction(new org.telegram.ui.web.v1(9, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            l1Var.setAlpha(f7);
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            l1Var.setScaleX(f10);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            }
            l1Var.setScaleY(f13);
            if (savedStarGift.unsaved) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            l1Var.setVisibility(i11);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        g9 g9Var2 = this.f45000n;
        g9Var2.setColorFilter(null);
        this.f45003p0 = false;
        g9Var2.setLayoutParams(this.f45005r);
        int i13 = this.f44984a;
        if (z16 && savedStarGift.name_hidden) {
            g9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            g9Var2.setVisibility(0);
            eq a2 = c8.a(44, "anonymous");
            j10 = 0;
            int L2 = org.telegram.messenger.i0.L(16.0f);
            int L3 = org.telegram.messenger.i0.L(16.0f);
            a2.e = L2;
            a2.f25842f = L3;
            g9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long o10 = o5.o(savedStarGift.from_id);
            int i14 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
            r8 r8Var = this.h;
            if (i14 > 0) {
                TLRPC.User Z1 = vp.r1(i13).Z1(Long.valueOf(o10));
                if (Z1 != null) {
                    g9Var2.setVisibility(0);
                    r8Var.r(Z1);
                    g9Var2.e(Z1, r8Var);
                } else {
                    g9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat L0 = vp.r1(i13).L0(Long.valueOf(-o10));
                if (L0 != null) {
                    g9Var2.setVisibility(0);
                    r8Var.q(L0);
                    g9Var2.e(L0, r8Var);
                } else {
                    g9Var2.setVisibility(8);
                }
            }
        }
        do0 do0Var2 = this.K;
        org.telegram.ui.Components.voip.i0 i0Var = this.J;
        TextView textView = this.L;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.E;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            dq[] dqVarArr = new dq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && o5.o(starGift.owner_id) == d20.i(i13).e()) {
                z15 = true;
                textView.setText(h8.r1(h8.W0(true, "XTR " + ((Object) h8.L0(savedStarGift.gift.getResellAmount(sf.b.f48257b).o(), 1.0f, ',')), 0.95f, dqVarArr, 0.0f, 1.0f), true));
            } else {
                z15 = true;
                textView.setText(h8.T0("XTR " + cd.E(savedStarGift.gift.getResellStars(), ','), 0.95f, dqVarArr));
            }
            dq dqVar = dqVarArr[0];
            if (dqVar != null) {
                dqVar.f25508r = 0.0f;
                dqVar.f25509s = org.telegram.messenger.i0.L(0.5f);
            }
            int w9 = t6.w(stargiftattributebackdrop.center_color | (-16777216), t6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.f45008s0 = 0;
            do0Var2.setBackground(new i1(1895825407, w9));
            textView.setTextColor(-1);
            imageView.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), w9));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) i0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(79.0f);
            z12 = z15;
        } else {
            if (z10) {
                textView.setVisibility(8);
                this.E.topMargin = org.telegram.messenger.i0.L(12.0f);
                this.E.bottomMargin = org.telegram.messenger.i0.L(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.E;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            }
            if (z16) {
                textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                sc.e.u(textView, 1, 12.0f, null, 2131750068);
                z12 = true;
                do0Var = do0Var2;
            } else {
                textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j11 = starGift2.stars;
                z12 = true;
                do0Var = do0Var2;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(h8.Z0(false, i0.a.k(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z16) {
                this.f45008s0 = 0;
                textView.setTextColor(-1);
                do0Var.setBackground(new i1(1090519039));
                imageView.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.f45008s0 = 2;
                this.f45009t0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) i0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(103.0f);
        }
        this.M.setVisibility(8);
        this.f44999l0 = savedStarGift;
        this.f44997j0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f44991e0;
        this.f44985a0 = null;
        this.f44987b0 = null;
        this.f44990d0 = false;
        this.f44991e0 = savedStarGift;
        this.f44993f0 = false;
        this.f44994g0 = false;
        this.f44995h0 = z11;
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

    public final void j(TLRPC.Document document, TLObject tLObject) {
        g9 g9Var = this.D;
        if (document == null) {
            g9Var.b();
            this.f44998k0 = null;
        } else if (this.f44998k0 == document) {
        } else {
            this.f44998k0 = document;
            TLRPC.PhotoSize w9 = b8.w(document.thumbs, org.telegram.messenger.i0.L(100.0f), false, null, false);
            g9Var.m(ic.b(document), "80_80_nolimit_pcache", ic.c(w9, document), "80_80_nolimit_pcache", v5.f(document, t6.f20872a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f7) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String k10;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        ColorMatrixColorFilter colorMatrixColorFilter;
        boolean z12;
        if (this.P != f7) {
            this.P = f7;
            TL_stars.TL_starGiftUnique uniqueStarGift2 = getUniqueStarGift();
            if (uniqueStarGift2 == null) {
                stargiftattributebackdrop = null;
            } else {
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            }
            if (stargiftattributebackdrop == null) {
                i10 = -11184811;
            } else {
                i10 = stargiftattributebackdrop.pattern_color | (-16777216);
            }
            float f10 = 1.0f - f7;
            if (f7 <= 0.0f) {
                colorMatrixColorFilter = null;
            } else {
                colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{f10, 0.0f, 0.0f, 0.0f, Color.red(i10) * f7, 0.0f, f10, 0.0f, 0.0f, Color.green(i10) * f7, 0.0f, 0.0f, f10, 0.0f, Color.blue(i10) * f7, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f7), 0.0f});
            }
            g9 g9Var = this.D;
            g9Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = g9Var.getImageReceiver();
            int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            imageReceiver.f14410u0 = z12;
            if (i11 > 0) {
                g9Var.getImageReceiver().Q0();
                bi0 B = g9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            g9Var.invalidate();
        }
        if (this.O != z10) {
            this.O = z10;
            if (getUniqueStarGift() != null) {
                if (z10) {
                    k10 = cd.L0(2131743130, null);
                } else {
                    k10 = i0.a.k(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                d1 d1Var = this.f44992f;
                if (z11) {
                    d1Var.getClass();
                    d1Var.f45021b = k10;
                    d1Var.f45020a.g(10, k10);
                    return;
                }
                d1Var.b(k10, true);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f44991e0;
        d1 d1Var = this.f44992f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                d1Var.setVisibility(0);
                if (this.f44991e0.gift.resell_amount != null) {
                    int i10 = t6.f20929d6;
                    p6 p6Var = this.f44986b;
                    int w9 = t6.w(t6.w0(i10, p6Var), t6.r1(0.04f, t6.w0(t6.G6, p6Var)));
                    setRibbonColorKey(t6.ik);
                    d1Var.setStrokeColor(w9);
                    this.f45002o0 = true;
                    d1Var.setBackdrop(null);
                    d1Var.b(cd.L0(2131750098, null), false);
                    return;
                }
                setRibbonColorKey(t6.zj);
                d1Var.setStrokeColor(0);
                this.f45002o0 = false;
                d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.f44991e0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                d1Var.b(i0.a.k(this.f44991e0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                d1Var.setVisibility(0);
                setRibbonColorKey(t6.zj);
                d1Var.setStrokeColor(0);
                this.f45002o0 = false;
                d1Var.setBackdrop(null);
                d1Var.b(cd.a0(null, null, 2131750144, org.telegram.messenger.i0.o0(this.f44991e0.gift.availability_total, 0)), true);
                return;
            } else {
                d1Var.setBackdrop(null);
                d1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.f44987b0;
        if (starGift2 != null) {
            if (!this.f44994g0 && !this.f44996i0) {
                if (this.f44993f0 && starGift2.availability_resale > 0) {
                    d1Var.setVisibility(0);
                    setRibbonColorKey(t6.ik);
                    d1Var.setStrokeColor(0);
                    this.f45002o0 = false;
                    d1Var.setBackdrop(null);
                    d1Var.b(cd.L0(2131750039, null), false);
                    return;
                } else if (this.f44990d0) {
                    d1Var.setVisibility(0);
                    setRibbonColorKey(t6.zj);
                    d1Var.setStrokeColor(0);
                    this.f45002o0 = false;
                    d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.f44987b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    d1Var.b(cd.a0(null, null, 2131750144, org.telegram.messenger.i0.o0(this.f44987b0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        d1Var.setVisibility(0);
                        setRibbonColorKey(t6.Aj);
                        d1Var.setStrokeColor(0);
                        this.f45002o0 = false;
                        d1Var.setBackdrop(null);
                        d1Var.b(cd.L0(2131749985, null), true);
                        return;
                    } else if (starGift2.auction) {
                        d1Var.setVisibility(0);
                        d1Var.setBackdrop(null);
                        this.f45001n0 = -1;
                        d1Var.a(-2650077, -4227818);
                        d1Var.setStrokeColor(0);
                        this.f45002o0 = false;
                        if (this.f44987b0.auction_start_date > ConnectionsManager.getInstance(this.f44984a).getCurrentTime()) {
                            d1Var.b(cd.L0(2131750142, null), true);
                            return;
                        } else {
                            d1Var.b(cd.L0(2131750143, null), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        d1Var.setVisibility(0);
                        d1Var.setBackdrop(null);
                        this.f45001n0 = -1;
                        d1Var.a(-2650077, -4227818);
                        d1Var.setStrokeColor(0);
                        this.f45002o0 = false;
                        d1Var.b(cd.L0(2131750141, null), true);
                        return;
                    } else if (z10) {
                        d1Var.setVisibility(0);
                        setRibbonColorKey(t6.zj);
                        d1Var.setStrokeColor(0);
                        this.f45002o0 = false;
                        d1Var.setBackdrop(null);
                        d1Var.b(cd.L0(2131750140, null), true);
                        return;
                    } else {
                        d1Var.setBackdrop(null);
                        d1Var.setStrokeColor(0);
                        this.f45002o0 = false;
                        d1Var.setVisibility(8);
                        return;
                    }
                }
            }
            d1Var.setVisibility(0);
            setRibbonColorKey(t6.zj);
            d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.f44987b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            d1Var.setStrokeColor(0);
            this.f45002o0 = false;
            d1Var.b(i0.a.k(this.f44987b0.num, ',', new StringBuilder("#")), true);
            return;
        }
        kg.m mVar = this.f44985a0;
        if (mVar != null) {
            if (mVar.b() > 0) {
                d1Var.setVisibility(0);
                d1Var.setBackdrop(null);
                this.f45001n0 = -1;
                d1Var.a(-2535425, -8229377);
                d1Var.setStrokeColor(0);
                this.f45002o0 = false;
                String a02 = cd.a0(null, null, 2131749673, Integer.valueOf(this.f44985a0.b()));
                d1Var.f45021b = a02;
                d1Var.f45020a.f(12, a02, true);
                return;
            }
            d1Var.setVisibility(8);
            d1Var.setBackdrop(null);
            d1Var.setStrokeColor(0);
            this.f45002o0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: ph.c1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.D.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.E;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        this.f45001n0 = -1;
        d1 d1Var = this.f44992f;
        d1Var.setColor(i10);
        d1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f44992f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        d1 d1Var = this.f44992f;
        d1Var.setVisibility(0);
        setRibbonColorKey(t6.zj);
        d1Var.setStrokeColor(0);
        this.f45002o0 = false;
        d1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) rh.e6.l(this.f44987b0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        d1Var.b(cd.a0(null, null, 2131750144, org.telegram.messenger.i0.o0(i10, 0)), true);
    }

    @Override
    public final void updateColors() {
        int w02;
        g9 g9Var;
        int w03;
        int i10;
        try {
            boolean q6 = t6.I.q();
            if (q6 != this.f45010u0) {
                this.f45010u0 = q6;
                if (this.f45008s0 != 0 && this.K != null && this.L != null && this.f45012x != null) {
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
            d1 d1Var = this.f44992f;
            p6 p6Var = this.f44986b;
            if (d1Var != null) {
                int i11 = this.f45001n0;
                if (i11 >= 0) {
                    f1 f1Var = d1Var.f45020a;
                    ((Paint) f1Var.f26491b).setColor(t6.w0(i11, p6Var));
                    f1Var.invalidateSelf();
                }
                if (this.f45002o0) {
                    d1Var.setStrokeColor(t6.w(t6.w0(t6.f20929d6, p6Var), t6.r1(0.04f, t6.w0(t6.G6, p6Var))));
                }
                d1Var.invalidate();
            }
            if (this.f45003p0 && (g9Var = this.f45000n) != null && (w03 = t6.w0(t6.kk, p6Var)) != this.f45004q0) {
                this.f45004q0 = w03;
                g9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            z0 z0Var = this.e;
            if (z0Var != null) {
                int[] iArr = this.f45006r0;
                if (iArr != null && z0Var.f45372m == iArr && (iArr[0] != (w02 = t6.w0(t6.Aj, p6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    z0Var.f45373n = null;
                }
                z0Var.invalidateSelf();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
