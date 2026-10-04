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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zc;
import yh.j8;
public abstract class m0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final q5 D;
    public int E;
    public final yq F;
    public final o6 G;
    public final o6 H;
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
    public j9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final d6 X;
    public final zc Y;
    public final j8 Z;
    public final TLRPC.ReactionCount f53443a;
    public final kj0 f53444a0;
    public final boolean f53445b;
    public int f53447c;
    public int d;
    public int f53450e;
    public boolean f53451e0;
    public int f53452f;
    public ImageReceiver f53453f0;
    public int f53454g;
    public q5 f53455g0;
    public int h;
    public int f53456i;
    public int f53457j;
    public final int f53458k;
    public final boolean f53460m;
    public boolean f53461n;
    public String f53462o;
    public boolean f53463p;
    public boolean f53464q;
    public final TLRPC.Reaction f53465r;
    public final o0 f53466s;
    public boolean f53468u;
    public final String v;
    public int f53469w;
    public int f53470x;
    public int f53471y;
    public int f53472z;
    public boolean f53459l = true;
    public final Rect f53467t = new Rect();
    public final RectF f53446b0 = new RectF();
    public final RectF f53448c0 = new RectF();
    public final Path f53449d0 = new Path();

    public m0(m0 m0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, d6 d6Var) {
        j8 j8Var;
        int i11;
        kj0 kj0Var;
        ah.d dVar = new ah.d(this, 11);
        this.V = i10;
        this.W = view;
        this.Y = new zc(view);
        this.X = d6Var;
        this.S = z11;
        if (m0Var != null) {
            this.F = m0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new yq(view, false, null);
        }
        if (this.G == null) {
            o6 o6Var = new o6(true, true, true, false);
            this.G = o6Var;
            o6Var.E = true;
            o6Var.k(0.4f, 320L, tr.h);
            o6Var.t(AndroidUtilities.dp(13.0f));
            o6Var.setCallback(dVar);
            o6Var.u(AndroidUtilities.bold());
            o6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            o6 o6Var2 = new o6(false, false, false, true);
            this.H = o6Var2;
            o6Var2.t(AndroidUtilities.dp(12.0f));
            o6Var2.setCallback(dVar);
            o6Var2.u(AndroidUtilities.bold());
            o6Var2.G = AndroidUtilities.displaySize.x;
            o6Var2.v = 0.35f;
        }
        this.f53443a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f53465r = reaction;
        o0 d = o0.d(reaction);
        this.f53466s = d;
        int i12 = reactionCount.count;
        this.f53469w = i12;
        this.f53463p = reactionCount.chosen;
        this.f53457j = i12;
        this.f53458k = reactionCount.chosen_order;
        this.f53445b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f53462o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f53462o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f53462o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        yq yqVar = this.F;
        yqVar.G = false;
        yqVar.f33210a = true;
        if (reaction != null) {
            if (d.f53475a) {
                this.f53460m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (m0Var != null && (kj0Var = m0Var.f53444a0) != null) {
                        this.f53444a0 = kj0Var;
                    } else {
                        this.f53444a0 = new kj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f53444a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (m0Var == null || (j8Var = m0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    j8Var = new j8(1, i11);
                }
                this.Z = j8Var;
            } else if (d.f53479f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f53479f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, i6.f20761a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f53480g != 0) {
                this.D = new q5(j(), i10, d.f53480g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.f33213e = p0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f53468u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f53468u) {
            o6 o6Var3 = this.G;
            o6Var3.q(Emoji.replaceEmoji(this.v, o6Var3.f29238a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof yn0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f53469w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            o6 o6Var4 = this.G;
            if (o6Var4 != null) {
                o6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f53469w, false);
        }
        yq yqVar2 = this.F;
        yqVar2.I = 2;
        yqVar2.f33232z = 3;
    }

    public final void a() {
        this.f53451e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        j9 j9Var = this.T;
        if (j9Var != null) {
            j9Var.g();
        }
        q5 q5Var = this.D;
        if (q5Var != null) {
            q5Var.a(this.W);
        }
    }

    public final void b() {
        this.f53451e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        j9 j9Var = this.T;
        if (j9Var != null) {
            j9Var.h();
        }
        q5 q5Var = this.D;
        if (q5Var != null) {
            q5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f53453f0;
        if (imageReceiver != null || this.f53455g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f53453f0 = null;
            } else if (this.f53455g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f53455g0.o(view);
                this.f53455g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r32, float r33, float r34, float r35, float r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: zg.m0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f53469w;
        if ((i10 != 0 && (!this.S || this.f53468u || i10 != 1)) || this.F.f33219l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        q5 q5Var = this.D;
        if (q5Var == null || (imageReceiver = q5Var.f29908k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        q5 q5Var2 = this.D;
        if (q5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            q5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f53459l && (this.f53460m || this.f53457j > 1 || !n() || !this.Q)) {
            ImageReceiver l4 = l();
            if (l4 != null) {
                z10 = (l4.getLottieAnimation() == null || !l4.getLottieAnimation().u()) ? true : true;
                if (f7 != 1.0f) {
                    l4.setAlpha(f7);
                    if (f7 <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    }
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f28132k0) {
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
            this.f53461n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f53461n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        j8 j8Var = this.Z;
        if (j8Var != null) {
            RectF rectF = j8Var.f51487c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                j8Var.g(rectF);
                boolean d = j8Var.d();
                j8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f53449d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    j8Var.a(canvas, this.K);
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
            RectF rectF2 = this.f53446b0;
            float f10 = rectF2.left;
            float f11 = rectF.left;
            Path path = this.f53449d0;
            if (f10 != f11 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                p0.h(rectF2, this.f53448c0, path);
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
            Collections.sort(arrayList, p0.f53485c0);
            if (this.T == null) {
                j9 j9Var = new j9(this.W, false);
                this.T = j9Var;
                j9Var.v = 250L;
                tr trVar = ji.n.V;
                j9Var.f27676s = AndroidUtilities.dp(20.0f);
                this.T.f27673p = AndroidUtilities.dp(100.0f);
                j9 j9Var2 = this.T;
                j9Var2.f27672o = this.B;
                j9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f53451e0) {
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
        q5 q5Var = this.D;
        if (q5Var == null || (imageReceiver = q5Var.f29908k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            kj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        q5 q5Var = this.D;
        if (q5Var == null || (imageReceiver = q5Var.f29908k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            kj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.d(f7, this.f53456i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f7, this.f53454g, i0.a.d(k(), this.J, this.L));
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
