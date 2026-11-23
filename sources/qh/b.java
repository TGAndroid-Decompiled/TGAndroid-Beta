package qh;

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
import c8.m9;
import c8.na;
import ia.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.fc;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.kz;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.me0;
public final class b extends FrameLayout implements me0, te.b, c6 {
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
    public a9 V;
    public final TextView f56279a;
    public final qh0 f56280b;
    public p9 f56281c;
    public i6 d;
    public final Paint f56282e;
    public final m6 f56283f;
    public final te.a h;
    public final te.a f56284n;
    public final te.a f56285r;
    public int f56286s;
    public int f56287w;
    public int f56288x;
    public boolean f56289y;

    public b(Context context) {
        super(context);
        this.f56282e = new Paint(1);
        this.h = new te.a(0, this, se.a.f57270a, 320L, false);
        kr krVar = kr.h;
        this.f56284n = new te.a(1, this, krVar, 380L, false);
        this.f56285r = new te.a(2, this, krVar, 380L, false);
        this.T = 1.0f;
        ?? imageView = new ImageView(context);
        this.f56280b = imageView;
        addView((View) imageView, na.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f56279a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(g0.o());
        textView.setGravity(17);
        this.G = new TextPaint(textView.getPaint());
        addView(textView, na.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        m6 m6Var = new m6(false, false, false);
        this.f56283f = m6Var;
        m6Var.x(g0.o());
        m6Var.setCallback(this);
        m6Var.f37394b = 17;
        m6Var.u(-1);
        m6Var.w(g0.L(10.0f));
    }

    public static b c(Context context, i6 i6Var, a aVar, int i7) {
        b bVar = new b(context);
        bVar.d = i6Var;
        bVar.E = aVar;
        bVar.f56279a.setText(gd.N0(i7, null));
        bVar.b(false);
        bVar.f56280b.setLayoutParams(na.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56288x = n6.w0(n6.Tl, i6Var);
        bVar.f56286s = n6.w0(n6.Rl, i6Var);
        bVar.f56287w = n6.w0(n6.Sl, i6Var);
        bVar.a();
        return bVar;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            a();
        }
        invalidate();
    }

    public final void a() {
        int i7 = this.f56288x;
        int i10 = this.f56286s;
        te.a aVar = this.h;
        int f10 = i0.a.f(aVar.f57779e, i7, i10);
        int f11 = i0.a.f(aVar.f57779e, this.f56288x, this.f56287w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        p9 p9Var = this.f56281c;
        if (p9Var != null && this.N) {
            p9Var.setColorFilter(porterDuffColorFilter);
            this.f56281c.invalidate();
        }
        this.f56280b.setColorFilter(porterDuffColorFilter);
        this.f56279a.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Tl));
        hashSet.add(Integer.valueOf(n6.Rl));
        hashSet.add(Integer.valueOf(n6.Sl));
    }

    public final void b(boolean z10) {
        int i7;
        boolean z11;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        String str;
        boolean z12 = this.h.f57780f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.F;
        kz kzVar = null;
        boolean z13 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = ri.U1;
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
                tL_attachMenuBotIcon = ri.m0(this.F);
                z13 = false;
            }
            if (tL_attachMenuBotIcon != null && (document = tL_attachMenuBotIcon.icon) != null) {
                if (this.Q != document.f28498id) {
                    p9 p9Var = this.f56281c;
                    fc b10 = fc.b(document);
                    fc b11 = fc.b(document);
                    if (!z13) {
                        kzVar = u5.f(document, n6.f29394a7, 1.0f, null);
                    }
                    p9Var.m(b10, "24_24_lastframe", b11, "24_24_lastframe", kzVar, this.F);
                    this.Q = document.f28498id;
                }
            } else {
                this.f56281c.b();
            }
            a();
            return;
        }
        a aVar = this.E;
        if (aVar != null) {
            int i11 = aVar.f56276b;
            int i12 = aVar.f56275a;
            int i13 = aVar.f56277c;
            qh0 qh0Var = this.f56280b;
            if (i13 != -1) {
                qh0Var.setImageResource(i13);
                a();
                return;
            }
            if (z12) {
                i7 = i12;
            } else {
                i7 = i11;
            }
            if (aVar.d != -1) {
                if (this.O != z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.P != i7) {
                    this.P = i7;
                    qh0Var.f(i7, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    nh0 animatedDrawable = qh0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.E.d);
                            if (animatedDrawable.f37801b0 >= this.E.f56278e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f37801b0;
                            int i15 = this.E.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f37801b0;
                            a aVar2 = this.E;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.f56278e - 1);
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
                if (this.P != i7) {
                    this.P = i7;
                    qh0Var.f(i7, 24, 24, null);
                    qh0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        qh0Var.getAnimatedDrawable().M(0);
                        qh0Var.d();
                        return;
                    }
                    qh0Var.getAnimatedDrawable().T(true, 0.99f);
                }
            } else {
                if (qh0Var.getAnimatedDrawable() == null) {
                    qh0Var.f(this.E.f56275a, 24, 24, null);
                }
                nh0 animatedDrawable2 = qh0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f37805e;
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
                        qh0Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.G.measureText(this.f56279a.getText().toString());
        return Math.min(g0.L(84.0f), (int) ((g0.T1(g0.N(16.0f), g0.L(8.0f), m9.a((measureText - g0.L(40.0f)) / g0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
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
            f10 = this.h.f57779e;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF = W;
        float f12 = 1.0f;
        Paint paint = this.f56282e;
        if (i7 > 0 && !this.L) {
            paint.setColor(n6.r1(se.a.f57270a.getInterpolation(f10) * 0.09f, this.f56286s));
            rectF.set(0.0f, 0.0f, f11, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a10 = m9.a(this.T, 0.0f, 1.0f) * g0.T1(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f56289y) {
            f12 = this.f56284n.f57779e;
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
            m6 m6Var = this.f56283f;
            float max = Math.max(N4, m6Var.c() + g0.L(8.0f));
            float N5 = g0.N(9.333f);
            float N6 = g0.N(8.0f);
            float f14 = max / 2.0f;
            float f15 = N4 / 2.0f;
            rectF.set((N2 - f14) - N, (N3 - f15) - N, f14 + N2 + N, f15 + N3 + N);
            canvas.scale(f13, f13, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, n6.Fm);
            rectF.inset(N, N);
            if (this.f56289y) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(2131232753).mutate();
                }
                e.d().f(0.0f, 0.0f, g0.L(96.0f), g0.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, e.d().e());
                int N7 = (int) (N2 - g0.N(7.0f));
                int N8 = (int) (N3 - g0.N(7.0f));
                this.M.setBounds(N7, N8, g0.L(14.0f) + N7, g0.L(14.0f) + N8);
                this.M.draw(canvas);
            } else {
                paint.setColor(i0.a.f(this.f56285r.f57779e, n6.x0(null, n6.Yl, false), n6.x0(null, n6.f29711r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                m6Var.p(rectF);
                m6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z10, boolean z11) {
        this.f56283f.t(str, z11, true);
        this.f56284n.a(!TextUtils.isEmpty(str), z11);
        this.f56285r.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        Typeface o4;
        this.h.a(z10, z11);
        b(z11);
        if (z10) {
            o4 = g0.o1("fonts/rextrabold.ttf");
        } else {
            o4 = g0.o();
        }
        this.f56279a.setTypeface(o4);
    }

    public final void g() {
        this.f56288x = n6.w0(n6.Tl, this.d);
        this.f56286s = n6.w0(n6.Rl, this.d);
        this.f56287w = n6.w0(n6.Sl, this.d);
        a();
        invalidate();
    }

    public p9 getBackupImageView() {
        return this.f56281c;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.R) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.S, 1073741824), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.H) {
            float measuredWidth = (this.I - getMeasuredWidth()) / 2.0f;
            this.f56280b.setTranslationX(measuredWidth);
            this.f56279a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i7) {
        this.S = i7;
        this.R = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.f56279a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        qh0 qh0Var = this.f56280b;
        qh0Var.setScaleX(f10);
        qh0Var.setScaleY(f10);
        p9 p9Var = this.f56281c;
        if (p9Var != null) {
            p9Var.setScaleX(f10);
            this.f56281c.setScaleY(f10);
        }
        this.T = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f56289y = z10;
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
        this.f56280b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.f56279a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float L = g0.L(f10);
        TextView textView = this.f56279a;
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
            this.f56280b.setTranslationX(measuredWidth);
            this.f56279a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        if (this.f56288x == n6.w0(n6.Tl, this.d) && this.f56286s == n6.w0(n6.Rl, this.d) && this.f56287w == n6.w0(n6.Sl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
