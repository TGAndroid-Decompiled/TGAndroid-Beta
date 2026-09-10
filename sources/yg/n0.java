package yg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import xh.l8;
public abstract class n0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final p5 D;
    public int E;
    public final br F;
    public final n6 G;
    public final n6 H;
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
    public i9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final f6 X;
    public final xc Y;
    public final l8 Z;
    public final TLRPC.ReactionCount f47067a;
    public final hj0 f47068a0;
    public final boolean f47069b;
    public int f47071c;
    public int d;
    public int e;
    public boolean f47074e0;
    public int f47075f;
    public ImageReceiver f47076f0;
    public int f47077g;
    public p5 f47078g0;
    public int h;
    public int f47079i;
    public int f47080j;
    public final int f47081k;
    public final boolean f47083m;
    public boolean f47084n;
    public String f47085o;
    public boolean f47086p;
    public boolean f47087q;
    public final TLRPC.Reaction f47088r;
    public final p0 f47089s;
    public boolean f47091u;
    public final String v;
    public int f47092w;
    public int f47093x;
    public int f47094y;
    public int f47095z;
    public boolean f47082l = true;
    public final Rect f47090t = new Rect();
    public final RectF f47070b0 = new RectF();
    public final RectF f47072c0 = new RectF();
    public final Path f47073d0 = new Path();

    public n0(n0 n0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, f6 f6Var) {
        l8 l8Var;
        int i11;
        hj0 hj0Var;
        hi.s0 s0Var = new hi.s0(this, 10);
        this.V = i10;
        this.W = view;
        this.Y = new xc(view);
        this.X = f6Var;
        this.S = z11;
        if (n0Var != null) {
            this.F = n0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new br(view, false, null);
        }
        if (this.G == null) {
            n6 n6Var = new n6(true, true, true, false);
            this.G = n6Var;
            n6Var.E = true;
            n6Var.k(0.4f, 320L, wr.h);
            n6Var.t(AndroidUtilities.dp(13.0f));
            n6Var.setCallback(s0Var);
            n6Var.u(AndroidUtilities.bold());
            n6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            n6 n6Var2 = new n6(false, false, false, true);
            this.H = n6Var2;
            n6Var2.t(AndroidUtilities.dp(12.0f));
            n6Var2.setCallback(s0Var);
            n6Var2.u(AndroidUtilities.bold());
            n6Var2.G = AndroidUtilities.displaySize.x;
            n6Var2.v = 0.35f;
        }
        this.f47067a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f47088r = reaction;
        p0 d = p0.d(reaction);
        this.f47089s = d;
        int i12 = reactionCount.count;
        this.f47092w = i12;
        this.f47086p = reactionCount.chosen;
        this.f47080j = i12;
        this.f47081k = reactionCount.chosen_order;
        this.f47069b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f47085o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f47085o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f47085o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        br brVar = this.F;
        brVar.G = false;
        brVar.f21869a = true;
        if (reaction != null) {
            if (d.f47098a) {
                this.f47083m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (n0Var != null && (hj0Var = n0Var.f47068a0) != null) {
                        this.f47068a0 = hj0Var;
                    } else {
                        this.f47068a0 = new hj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f47068a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (n0Var == null || (l8Var = n0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    l8Var = new l8(1, i11);
                }
                this.Z = l8Var;
            } else if (d.f47101f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f47101f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.f17872a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f47102g != 0) {
                this.D = new p5(j(), i10, d.f47102g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = q0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f47091u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f47091u) {
            n6 n6Var3 = this.G;
            n6Var3.q(Emoji.replaceEmoji(this.v, n6Var3.f25424a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof pn0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f47092w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            n6 n6Var4 = this.G;
            if (n6Var4 != null) {
                n6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f47092w, false);
        }
        br brVar2 = this.F;
        brVar2.I = 2;
        brVar2.f21890z = 3;
    }

    public final void a() {
        this.f47074e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        i9 i9Var = this.T;
        if (i9Var != null) {
            i9Var.g();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.a(this.W);
        }
    }

    public final void b() {
        this.f47074e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        i9 i9Var = this.T;
        if (i9Var != null) {
            i9Var.h();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f47076f0;
        if (imageReceiver != null || this.f47078g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f47076f0 = null;
            } else if (this.f47078g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f47078g0.o(view);
                this.f47078g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r32, float r33, float r34, float r35, float r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: yg.n0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f47092w;
        if ((i10 != 0 && (!this.S || this.f47091u || i10 != 1)) || this.F.f21877l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f26033k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        p5 p5Var2 = this.D;
        if (p5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            p5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f47082l && (this.f47083m || this.f47080j > 1 || !n() || !this.Q)) {
            ImageReceiver l4 = l();
            if (l4 != null) {
                z10 = (l4.getLottieAnimation() == null || !l4.getLottieAnimation().u()) ? true : true;
                if (f7 != 1.0f) {
                    l4.setAlpha(f7);
                    if (f7 <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    }
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f23660l0) {
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
            this.f47084n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f47084n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        l8 l8Var = this.Z;
        if (l8Var != null) {
            RectF rectF = l8Var.f45677c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                l8Var.g(rectF);
                boolean d = l8Var.d();
                l8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f47073d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    l8Var.a(canvas, this.K);
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
            RectF rectF2 = this.f47070b0;
            float f10 = rectF2.left;
            float f11 = rectF.left;
            Path path = this.f47073d0;
            if (f10 != f11 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                q0.h(rectF2, this.f47072c0, path);
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
            Collections.sort(arrayList, q0.f47108c0);
            if (this.T == null) {
                i9 i9Var = new i9(this.W, false);
                this.T = i9Var;
                i9Var.v = 250L;
                wr wrVar = ii.n.V;
                i9Var.f23950s = AndroidUtilities.dp(20.0f);
                this.T.f23947p = AndroidUtilities.dp(100.0f);
                i9 i9Var2 = this.T;
                i9Var2.f23946o = this.B;
                i9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f47074e0) {
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
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f26033k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            hj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f26033k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            hj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.d(f7, this.f47079i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f7, this.f47077g, i0.a.d(k(), this.J, this.L));
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
