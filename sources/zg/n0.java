package zg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xi0;
import yh.k8;
public abstract class n0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final o5 D;
    public int E;
    public final vq F;
    public final m6 G;
    public final m6 H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public h9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final e6 X;
    public final wc Y;
    public final k8 Z;
    public final TLRPC.ReactionCount f49092a;
    public final xi0 f49093a0;
    public final boolean f49094b;
    public int f49096c;
    public int d;
    public int e;
    public boolean f49099e0;
    public int f49100f;
    public ImageReceiver f49101f0;
    public int f49102g;
    public o5 f49103g0;
    public int h;
    public int f49104i;
    public int f49105j;
    public final int f49106k;
    public final boolean f49108m;
    public boolean f49109n;
    public String f49110o;
    public boolean f49111p;
    public boolean f49112q;
    public final TLRPC.Reaction f49113r;
    public final p0 f49114s;
    public boolean f49116u;
    public final String v;
    public int f49117w;
    public int f49118x;
    public int f49119y;
    public int f49120z;
    public boolean f49107l = true;
    public final Rect f49115t = new Rect();
    public final RectF f49095b0 = new RectF();
    public final RectF f49097c0 = new RectF();
    public final Path f49098d0 = new Path();

    public n0(n0 n0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, e6 e6Var) {
        k8 k8Var;
        int i11;
        xi0 xi0Var;
        i.f fVar = new i.f(this, 10);
        this.V = i10;
        this.W = view;
        this.Y = new wc(view);
        this.X = e6Var;
        this.S = z11;
        if (n0Var != null) {
            this.F = n0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new vq(view, false, null);
        }
        if (this.G == null) {
            m6 m6Var = new m6(true, true, true, false);
            this.G = m6Var;
            m6Var.E = true;
            m6Var.k(0.4f, 320L, qr.h);
            m6Var.t(AndroidUtilities.dp(13.0f));
            m6Var.setCallback(fVar);
            m6Var.u(AndroidUtilities.bold());
            m6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            m6 m6Var2 = new m6(false, false, false, true);
            this.H = m6Var2;
            m6Var2.t(AndroidUtilities.dp(12.0f));
            m6Var2.setCallback(fVar);
            m6Var2.u(AndroidUtilities.bold());
            m6Var2.G = AndroidUtilities.displaySize.x;
            m6Var2.v = 0.35f;
        }
        this.f49092a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f49113r = reaction;
        p0 d = p0.d(reaction);
        this.f49114s = d;
        int i12 = reactionCount.count;
        this.f49117w = i12;
        this.f49111p = reactionCount.chosen;
        this.f49105j = i12;
        this.f49106k = reactionCount.chosen_order;
        this.f49094b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f49110o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f49110o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f49110o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        vq vqVar = this.F;
        vqVar.G = false;
        vqVar.f29393a = true;
        if (reaction != null) {
            if (d.f49124a) {
                this.f49108m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (n0Var != null && (xi0Var = n0Var.f49093a0) != null) {
                        this.f49093a0 = xi0Var;
                    } else {
                        this.f49093a0 = new xi0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f49093a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (n0Var == null || (k8Var = n0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    k8Var = new k8(1, i11);
                }
                this.Z = k8Var;
            } else if (d.f49127f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f49127f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, i6.f18780a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f49128g != 0) {
                this.D = new o5(j(), i10, d.f49128g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = q0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f49116u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f49116u) {
            m6 m6Var3 = this.G;
            m6Var3.q(Emoji.replaceEmoji(this.v, m6Var3.f26085a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof gn0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f49117w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            m6 m6Var4 = this.G;
            if (m6Var4 != null) {
                m6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f49117w, false);
        }
        vq vqVar2 = this.F;
        vqVar2.I = 2;
        vqVar2.f29414z = 3;
    }

    public final void a() {
        this.f49099e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        h9 h9Var = this.T;
        if (h9Var != null) {
            h9Var.g();
        }
        o5 o5Var = this.D;
        if (o5Var != null) {
            o5Var.a(this.W);
        }
    }

    public final void b() {
        this.f49099e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        h9 h9Var = this.T;
        if (h9Var != null) {
            h9Var.h();
        }
        o5 o5Var = this.D;
        if (o5Var != null) {
            o5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f49101f0;
        if (imageReceiver != null || this.f49103g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f49101f0 = null;
            } else if (this.f49103g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f49103g0.o(view);
                this.f49103g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r32, float r33, float r34, float r35, float r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: zg.n0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f49117w;
        if ((i10 != 0 && (!this.S || this.f49116u || i10 != 1)) || this.F.f29401l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        o5 o5Var = this.D;
        if (o5Var == null || (imageReceiver = o5Var.f26692k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        o5 o5Var2 = this.D;
        if (o5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            o5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f49107l && (this.f49108m || this.f49105j > 1 || !n() || !this.Q)) {
            ImageReceiver l4 = l();
            if (l4 != null) {
                z10 = (l4.getLottieAnimation() == null || !l4.getLottieAnimation().u()) ? true : true;
                if (f7 != 1.0f) {
                    l4.setAlpha(f7);
                    if (f7 <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    }
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f29960l0) {
                    float alpha = l4.getAlpha() - 0.08f;
                    if (alpha <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    } else {
                        l4.setAlpha(alpha);
                    }
                    this.W.invalidate();
                    z10 = true;
                }
                l4.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
                l4.draw(canvas);
            } else {
                z10 = true;
            }
            if (z10) {
                imageReceiver.draw(canvas);
            }
            this.f49109n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f49109n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        k8 k8Var = this.Z;
        if (k8Var != null) {
            RectF rectF = k8Var.f47380c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                k8Var.g(rectF);
                boolean d = k8Var.d();
                k8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f49098d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    k8Var.a(canvas, this.K);
                    canvas.restore();
                }
                return d;
            }
            return false;
        }
        return false;
    }

    public final void h(Canvas canvas, RectF rectF, float f7, Paint paint) {
        if (this.S) {
            RectF rectF2 = this.f49095b0;
            float f10 = rectF2.left;
            float f11 = rectF.left;
            Path path = this.f49098d0;
            if (f10 != f11 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                q0.h(rectF2, this.f49097c0, path);
            }
            canvas.drawPath(path, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    public boolean i() {
        return true;
    }

    public int j() {
        if (this.S) {
            return 18;
        }
        return 3;
    }

    public float k() {
        return 0.0f;
    }

    public ImageReceiver l() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public final void p(ArrayList arrayList) {
        this.U = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, q0.f49141c0);
            if (this.T == null) {
                h9 h9Var = new h9(this.W, false);
                this.T = h9Var;
                h9Var.v = 250L;
                qr qrVar = ji.n.V;
                h9Var.f24630s = AndroidUtilities.dp(20.0f);
                this.T.f24627p = AndroidUtilities.dp(100.0f);
                h9 h9Var2 = this.T;
                h9Var2.f24626o = this.B;
                h9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f49099e0) {
                this.T.g();
            }
            for (int i10 = 0; i10 < arrayList.size() && i10 != 3; i10++) {
                this.T.l(i10, (TLObject) arrayList.get(i10), this.V);
            }
            this.T.b(false, true);
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        o5 o5Var = this.D;
        if (o5Var == null || (imageReceiver = o5Var.f26692k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            b6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        o5 o5Var = this.D;
        if (o5Var == null || (imageReceiver = o5Var.f26692k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            b6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.d(f7, this.f49104i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f7, this.f49102g, i0.a.d(k(), this.J, this.L));
        this.O = d;
        int i11 = this.h;
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.8f) {
            i10 = 0;
        } else {
            i10 = 1526726655;
        }
        this.P = i0.a.d(f7, i11, i10);
    }

    public void o() {
    }
}
