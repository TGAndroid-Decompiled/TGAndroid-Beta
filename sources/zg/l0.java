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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.s5;
import yh.b8;
public abstract class l0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final s5 D;
    public int E;
    public final lr F;
    public final q6 G;
    public final q6 H;
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
    public l9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final d6 X;
    public final bd Y;
    public final b8 Z;
    public final TLRPC.ReactionCount f54667a;
    public final ek0 f54668a0;
    public final boolean f54669b;
    public int f54671c;
    public int d;
    public int f54674e;
    public boolean f54675e0;
    public int f54676f;
    public ImageReceiver f54677f0;
    public int f54678g;
    public s5 f54679g0;
    public int h;
    public int f54680i;
    public int f54681j;
    public final int f54682k;
    public final boolean f54684m;
    public boolean f54685n;
    public String f54686o;
    public boolean f54687p;
    public boolean f54688q;
    public final TLRPC.Reaction f54689r;
    public final n0 f54690s;
    public boolean f54692u;
    public final String v;
    public int f54693w;
    public int f54694x;
    public int f54695y;
    public int f54696z;
    public boolean f54683l = true;
    public final Rect f54691t = new Rect();
    public final RectF f54670b0 = new RectF();
    public final RectF f54672c0 = new RectF();
    public final Path f54673d0 = new Path();

    public l0(l0 l0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, d6 d6Var) {
        b8 b8Var;
        int i11;
        ek0 ek0Var;
        i.f fVar = new i.f(this, 10);
        this.V = i10;
        this.W = view;
        this.Y = new bd(view);
        this.X = d6Var;
        this.S = z11;
        if (l0Var != null) {
            this.F = l0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new lr(view, false, null);
        }
        if (this.G == null) {
            q6 q6Var = new q6(true, true, true);
            this.G = q6Var;
            q6Var.K = true;
            q6Var.n(0.4f, 320L, is.h);
            q6Var.w(AndroidUtilities.dp(13.0f));
            q6Var.setCallback(fVar);
            q6Var.x(AndroidUtilities.bold());
            q6Var.M = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            q6 q6Var2 = new q6(false, false, false, true, false);
            this.H = q6Var2;
            q6Var2.w(AndroidUtilities.dp(12.0f));
            q6Var2.setCallback(fVar);
            q6Var2.x(AndroidUtilities.bold());
            q6Var2.M = AndroidUtilities.displaySize.x;
            q6Var2.A = 0.35f;
        }
        this.f54667a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f54689r = reaction;
        n0 d = n0.d(reaction);
        this.f54690s = d;
        int i12 = reactionCount.count;
        this.f54693w = i12;
        this.f54687p = reactionCount.chosen;
        this.f54681j = i12;
        this.f54682k = reactionCount.chosen_order;
        this.f54669b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f54686o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f54686o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f54686o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        lr lrVar = this.F;
        lrVar.G = false;
        lrVar.f28420a = true;
        if (reaction != null) {
            if (d.f54700a) {
                this.f54684m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (l0Var != null && (ek0Var = l0Var.f54668a0) != null) {
                        this.f54668a0 = ek0Var;
                    } else {
                        this.f54668a0 = new ek0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f54668a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (l0Var == null || (b8Var = l0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    b8Var = new b8(1, i11);
                }
                this.Z = b8Var;
            } else if (d.f54704f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f54704f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, h6.f20730a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f54705g != 0) {
                this.D = new s5(j(), i10, d.f54705g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.f28423e = o0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f54692u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f54692u) {
            q6 q6Var3 = this.G;
            q6Var3.t(Emoji.replaceEmoji(this.v, q6Var3.f30017a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof no0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f54693w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            q6 q6Var4 = this.G;
            if (q6Var4 != null) {
                q6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f54693w, false);
        }
        lr lrVar2 = this.F;
        lrVar2.I = 2;
        lrVar2.f28442z = 3;
    }

    public final void a() {
        this.f54675e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        l9 l9Var = this.T;
        if (l9Var != null) {
            l9Var.g();
        }
        s5 s5Var = this.D;
        if (s5Var != null) {
            s5Var.a(this.W);
        }
    }

    public final void b() {
        this.f54675e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        l9 l9Var = this.T;
        if (l9Var != null) {
            l9Var.h();
        }
        s5 s5Var = this.D;
        if (s5Var != null) {
            s5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f54677f0;
        if (imageReceiver != null || this.f54679g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f54677f0 = null;
            } else if (this.f54679g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f54679g0.o(view);
                this.f54679g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r31, float r32, float r33, float r34, float r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.l0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f54693w;
        if ((i10 != 0 && (!this.S || this.f54692u || i10 != 1)) || this.F.f28429l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.f30634k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        s5 s5Var2 = this.D;
        if (s5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            s5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f54683l && (this.f54684m || this.f54681j > 1 || !n() || !this.Q)) {
            ImageReceiver l4 = l();
            if (l4 != null) {
                if (l4.getLottieAnimation() == null || !l4.getLottieAnimation().u()) {
                    z10 = true;
                }
                if (f7 != 1.0f) {
                    l4.setAlpha(f7);
                    if (f7 <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    }
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f26051k0) {
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
            this.f54685n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f54685n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        b8 b8Var = this.Z;
        if (b8Var != null) {
            RectF rectF = b8Var.f52397c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                b8Var.g(rectF);
                boolean d = b8Var.d();
                b8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f54673d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    b8Var.a(canvas, this.K);
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
            RectF rectF2 = this.f54670b0;
            int i10 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f54673d0;
            if (i10 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                o0.h(rectF2, this.f54672c0, path);
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
            Collections.sort(arrayList, o0.f54708c0);
            if (this.T == null) {
                l9 l9Var = new l9(this.W, false);
                this.T = l9Var;
                l9Var.v = 250L;
                is isVar = ji.n.V;
                l9Var.f28254s = AndroidUtilities.dp(20.0f);
                this.T.f28251p = AndroidUtilities.dp(100.0f);
                l9 l9Var2 = this.T;
                l9Var2.f28250o = this.B;
                l9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f54675e0) {
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
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.f30634k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            ek0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            f6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.f30634k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            ek0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            f6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.d(f7, this.f54680i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f7, this.f54678g, i0.a.d(k(), this.J, this.L));
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
