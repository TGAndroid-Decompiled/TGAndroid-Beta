package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.be;
import b8.mf;
import ha.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fe0;
public final class b extends FrameLayout implements fe0, qe.b, z5 {
    public static final RectF W = new RectF();
    public a E;
    public TLRPC.TL_attachMenuBot F;
    public final TextPaint G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public boolean L;
    public Drawable M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public float T;
    public TextPaint U;
    public u8 V;
    public final TextView f54528a;
    public final fh0 f54529b;
    public k9 f54530c;
    public e6 d;
    public final Paint f54531e;
    public final g6 f54532f;
    public final qe.a h;
    public final qe.a f54533n;
    public final qe.a f54534r;
    public int f54535s;
    public int f54536w;
    public int f54537x;
    public boolean f54538y;

    public b(Context context) {
        super(context);
        this.f54531e = new Paint(1);
        this.h = new qe.a(0, this, pe.a.f53446a, 320L, false);
        xq xqVar = xq.h;
        this.f54533n = new qe.a(1, this, xqVar, 380L, false);
        this.f54534r = new qe.a(2, this, xqVar, 380L, false);
        this.T = 1.0f;
        ?? imageView = new ImageView(context);
        this.f54529b = imageView;
        addView((View) imageView, mf.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f54528a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(g0.o());
        textView.setGravity(17);
        this.G = new TextPaint(textView.getPaint());
        addView(textView, mf.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        g6 g6Var = new g6(false, false, false);
        this.f54532f = g6Var;
        g6Var.x(g0.o());
        g6Var.setCallback(this);
        g6Var.f33983b = 17;
        g6Var.u(-1);
        g6Var.w(g0.L(10.0f));
    }

    public static b c(Context context, e6 e6Var, a aVar, int i3) {
        b bVar = new b(context);
        bVar.d = e6Var;
        bVar.E = aVar;
        bVar.f54528a.setText(bd.M0(i3, null));
        bVar.b(false);
        bVar.f54529b.setLayoutParams(mf.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54537x = k6.w0(k6.Ql, e6Var);
        bVar.f54535s = k6.w0(k6.Ol, e6Var);
        bVar.f54536w = k6.w0(k6.Pl, e6Var);
        bVar.a();
        return bVar;
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            a();
        }
        invalidate();
    }

    public final void a() {
        int i3 = this.f54537x;
        int i10 = this.f54535s;
        qe.a aVar = this.h;
        int f10 = i0.a.f(aVar.f53840e, i3, i10);
        int f11 = i0.a.f(aVar.f53840e, this.f54537x, this.f54536w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        k9 k9Var = this.f54530c;
        if (k9Var != null && this.N) {
            k9Var.setColorFilter(porterDuffColorFilter);
            this.f54530c.invalidate();
        }
        this.f54529b.setColorFilter(porterDuffColorFilter);
        this.f54528a.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ql));
        hashSet.add(Integer.valueOf(k6.Ol));
        hashSet.add(Integer.valueOf(k6.Pl));
    }

    public final void b(boolean z10) {
        int i3;
        boolean z11;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        String str;
        boolean z12 = this.h.f53841f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.F;
        jz jzVar = null;
        boolean z13 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = li.S1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i10);
                    i10++;
                    tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                    String str2 = tL_attachMenuBotIcon.name;
                    if (z12) {
                        str = "android_active_animated";
                    } else {
                        str = "android_animated";
                    }
                    if (str2.equals(str)) {
                        break;
                    }
                } else {
                    tL_attachMenuBotIcon = null;
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = li.k0(this.F);
                z13 = false;
            }
            if (tL_attachMenuBotIcon != null && (document = tL_attachMenuBotIcon.icon) != null) {
                if (this.Q != document.f27007id) {
                    k9 k9Var = this.f54530c;
                    ac b10 = ac.b(document);
                    ac b11 = ac.b(document);
                    if (!z13) {
                        jzVar = t5.f(document, k6.f27824a7, 1.0f, null);
                    }
                    k9Var.m(b10, "24_24_lastframe", b11, "24_24_lastframe", jzVar, this.F);
                    this.Q = document.f27007id;
                }
            } else {
                this.f54530c.b();
            }
            a();
            return;
        }
        a aVar = this.E;
        if (aVar != null) {
            int i11 = aVar.f54525b;
            int i12 = aVar.f54524a;
            int i13 = aVar.f54526c;
            fh0 fh0Var = this.f54529b;
            if (i13 != -1) {
                fh0Var.setImageResource(i13);
                a();
                return;
            }
            if (z12) {
                i3 = i12;
            } else {
                i3 = i11;
            }
            if (aVar.d != -1) {
                if (this.O != z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.P != i3) {
                    this.P = i3;
                    fh0Var.f(i3, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.E.d);
                            if (animatedDrawable.f32721b0 >= this.E.f54527e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f32721b0;
                            int i15 = this.E.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f32721b0;
                            a aVar2 = this.E;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.f54527e - 1);
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.P(0);
                                animatedDrawable.M(0);
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.O = z12;
            } else if (i12 != i11) {
                if (this.P != i3) {
                    this.P = i3;
                    fh0Var.f(i3, 24, 24, null);
                    fh0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        fh0Var.getAnimatedDrawable().M(0);
                        fh0Var.d();
                        return;
                    }
                    fh0Var.getAnimatedDrawable().T(true, 0.99f);
                }
            } else {
                if (fh0Var.getAnimatedDrawable() == null) {
                    fh0Var.f(this.E.f54524a, 24, 24, null);
                }
                ch0 animatedDrawable2 = fh0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f32725e;
                    if (this.O != z12) {
                        this.O = z12;
                        if (z12) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.M(0);
                            animatedDrawable2.P(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.M(iArr[0]);
                            animatedDrawable2.P(0);
                        }
                        fh0Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.G.measureText(this.f54528a.getText().toString());
        return Math.min(g0.L(84.0f), (int) ((g0.T1(g0.N(16.0f), g0.L(8.0f), be.a((measureText - g0.L(40.0f)) / g0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f10;
        boolean z10;
        if (this.H) {
            width = this.I;
        } else {
            width = getWidth();
        }
        float f11 = width;
        if (this.J) {
            f10 = this.K;
        } else {
            f10 = this.h.f53840e;
        }
        int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF = W;
        float f12 = 1.0f;
        Paint paint = this.f54531e;
        if (i3 > 0 && !this.L) {
            paint.setColor(k6.r1(pe.a.f53446a.getInterpolation(f10) * 0.09f, this.f54535s));
            rectF.set(0.0f, 0.0f, f11, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a10 = be.a(this.T, 0.0f, 1.0f) * g0.T1(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f54538y) {
            f12 = this.f54533n.f53840e;
        }
        float f13 = f12 * this.T;
        int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, f11, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i10 > 0) {
            canvas.save();
            float N = g0.N(1.33f);
            float N2 = g0.N(11.0f) + (f11 / 2.0f);
            float N3 = g0.N(10.0f);
            float N4 = g0.N(16.0f);
            g6 g6Var = this.f54532f;
            float max = Math.max(N4, g6Var.c() + g0.L(8.0f));
            float N5 = g0.N(9.333f);
            float N6 = g0.N(8.0f);
            float f14 = max / 2.0f;
            float f15 = N4 / 2.0f;
            rectF.set((N2 - f14) - N, (N3 - f15) - N, f14 + N2 + N, f15 + N3 + N);
            canvas.scale(f13, f13, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, k6.Cm);
            rectF.inset(N, N);
            if (this.f54538y) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(2131232746).mutate();
                }
                e.d().f(0.0f, 0.0f, g0.L(96.0f), g0.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, e.d().e());
                int N7 = (int) (N2 - g0.N(7.0f));
                int N8 = (int) (N3 - g0.N(7.0f));
                this.M.setBounds(N7, N8, g0.L(14.0f) + N7, g0.L(14.0f) + N8);
                this.M.draw(canvas);
            } else {
                paint.setColor(i0.a.f(this.f54534r.f53840e, k6.x0(null, k6.Vl, false), k6.x0(null, k6.f28141r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                g6Var.p(rectF);
                g6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z10, boolean z11) {
        this.f54532f.t(str, z11, true);
        this.f54533n.a(!TextUtils.isEmpty(str), z11);
        this.f54534r.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        Typeface o10;
        this.h.a(z10, z11);
        b(z11);
        if (z10) {
            o10 = g0.o1("fonts/rextrabold.ttf");
        } else {
            o10 = g0.o();
        }
        this.f54528a.setTypeface(o10);
    }

    public final void g() {
        this.f54537x = k6.w0(k6.Ql, this.d);
        this.f54535s = k6.w0(k6.Ol, this.d);
        this.f54536w = k6.w0(k6.Pl, this.d);
        a();
        invalidate();
    }

    public k9 getBackupImageView() {
        return this.f54530c;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.R) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.S, 1073741824), i10);
        } else {
            super.onMeasure(i3, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (this.H) {
            float measuredWidth = (this.I - getMeasuredWidth()) / 2.0f;
            this.f54529b.setTranslationX(measuredWidth);
            this.f54528a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i3) {
        this.S = i3;
        this.R = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.f54528a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        fh0 fh0Var = this.f54529b;
        fh0Var.setScaleX(f10);
        fh0Var.setScaleY(f10);
        k9 k9Var = this.f54530c;
        if (k9Var != null) {
            k9Var.setScaleX(f10);
            this.f54530c.setScaleY(f10);
        }
        this.T = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f54538y = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.E = aVar;
        this.F = null;
        this.P = 0;
        this.Q = 0L;
        this.f54529b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.f54528a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float L = g0.L(f10);
        TextView textView = this.f54528a;
        if (textView.getTextSize() != L) {
            textView.setTextSize(1, f10);
            this.G.setTextSize(L);
        }
    }

    public void setVisualWidth(float f10) {
        this.H = true;
        if (this.I != f10) {
            this.I = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.f54529b.setTranslationX(measuredWidth);
            this.f54528a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        if (this.f54537x == k6.w0(k6.Ql, this.d) && this.f54535s == k6.w0(k6.Ol, this.d) && this.f54536w == k6.w0(k6.Pl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
