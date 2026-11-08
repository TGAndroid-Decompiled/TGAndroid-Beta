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
import c8.ha;
import c8.j9;
import ia.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.rz;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ke0;
public final class b extends FrameLayout implements ke0, te.b, a6 {
    public static final RectF V = new RectF();
    public a D;
    public TLRPC.TL_attachMenuBot E;
    public final TextPaint F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public boolean Q;
    public int R;
    public float S;
    public TextPaint T;
    public w8 U;
    public final TextView f54138a;
    public final ch0 f54139b;
    public l9 f54140c;
    public f6 d;
    public final Paint f54141e;
    public final i6 f54142f;
    public final te.a h;
    public final te.a f54143n;
    public final te.a f54144r;
    public int f54145s;
    public int f54146w;
    public int f54147x;
    public boolean f54148y;

    public b(Context context) {
        super(context);
        this.f54141e = new Paint(1);
        this.h = new te.a(0, this, se.a.f55005a, 320L, false);
        xq xqVar = xq.h;
        this.f54143n = new te.a(1, this, xqVar, 380L, false);
        this.f54144r = new te.a(2, this, xqVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f54139b = imageView;
        addView((View) imageView, ha.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f54138a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(g0.o());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, ha.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        i6 i6Var = new i6(false, false, false);
        this.f54142f = i6Var;
        i6Var.x(g0.o());
        i6Var.setCallback(this);
        i6Var.f34552b = 17;
        i6Var.u(-1);
        i6Var.w(g0.L(10.0f));
    }

    public static b c(Context context, f6 f6Var, a aVar, int i7) {
        b bVar = new b(context);
        bVar.d = f6Var;
        bVar.D = aVar;
        bVar.f54138a.setText(id.M0(i7, null));
        bVar.b(false);
        bVar.f54139b.setLayoutParams(ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54147x = k6.w0(k6.Ql, f6Var);
        bVar.f54145s = k6.w0(k6.Ol, f6Var);
        bVar.f54146w = k6.w0(k6.Pl, f6Var);
        bVar.a();
        return bVar;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            a();
        }
        invalidate();
    }

    public final void a() {
        int i7 = this.f54147x;
        int i10 = this.f54145s;
        te.a aVar = this.h;
        int f10 = i0.a.f(aVar.f55487e, i7, i10);
        int f11 = i0.a.f(aVar.f55487e, this.f54147x, this.f54146w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        l9 l9Var = this.f54140c;
        if (l9Var != null && this.M) {
            l9Var.setColorFilter(porterDuffColorFilter);
            this.f54140c.invalidate();
        }
        this.f54139b.setColorFilter(porterDuffColorFilter);
        this.f54138a.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ql));
        hashSet.add(Integer.valueOf(k6.Ol));
        hashSet.add(Integer.valueOf(k6.Pl));
    }

    public final void b(boolean z9) {
        int i7;
        boolean z10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        String str;
        boolean z11 = this.h.f55488f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.E;
        rz rzVar = null;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = ui.R1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i10);
                    i10++;
                    tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                    String str2 = tL_attachMenuBotIcon.name;
                    if (z11) {
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
                tL_attachMenuBotIcon = ui.k0(this.E);
                z12 = false;
            }
            if (tL_attachMenuBotIcon != null && (document = tL_attachMenuBotIcon.icon) != null) {
                if (this.P != document.f26962id) {
                    l9 l9Var = this.f54140c;
                    hc b10 = hc.b(document);
                    hc b11 = hc.b(document);
                    if (!z12) {
                        rzVar = t5.f(document, k6.f27796a7, 1.0f, null);
                    }
                    l9Var.m(b10, "24_24_lastframe", b11, "24_24_lastframe", rzVar, this.E);
                    this.P = document.f26962id;
                }
            } else {
                this.f54140c.b();
            }
            a();
            return;
        }
        a aVar = this.D;
        if (aVar != null) {
            int i11 = aVar.f54135b;
            int i12 = aVar.f54134a;
            int i13 = aVar.f54136c;
            ch0 ch0Var = this.f54139b;
            if (i13 != -1) {
                ch0Var.setImageResource(i13);
                a();
                return;
            }
            if (z11) {
                i7 = i12;
            } else {
                i7 = i11;
            }
            if (aVar.d != -1) {
                if (this.N != z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.O != i7) {
                    this.O = i7;
                    ch0Var.f(i7, 24, 24, null);
                    z10 = true;
                }
                if (z10) {
                    zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z11) {
                            animatedDrawable.P(this.D.d);
                            if (animatedDrawable.f40989a0 >= this.D.f54137e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f40989a0;
                            int i15 = this.D.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f40989a0;
                            a aVar2 = this.D;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.f54137e - 1);
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
                this.N = z11;
            } else if (i12 != i11) {
                if (this.O != i7) {
                    this.O = i7;
                    ch0Var.f(i7, 24, 24, null);
                    ch0Var.getAnimatedDrawable().h = false;
                    if (z9) {
                        ch0Var.getAnimatedDrawable().M(0);
                        ch0Var.d();
                        return;
                    }
                    ch0Var.getAnimatedDrawable().T(true, 0.99f);
                }
            } else {
                if (ch0Var.getAnimatedDrawable() == null) {
                    ch0Var.f(this.D.f54134a, 24, 24, null);
                }
                zg0 animatedDrawable2 = ch0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f40995e;
                    if (this.N != z11) {
                        this.N = z11;
                        if (z11) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.M(0);
                            animatedDrawable2.P(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.M(iArr[0]);
                            animatedDrawable2.P(0);
                        }
                        ch0Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.F.measureText(this.f54138a.getText().toString());
        return Math.min(g0.L(84.0f), (int) ((g0.T1(g0.N(16.0f), g0.L(8.0f), j9.a((measureText - g0.L(40.0f)) / g0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f10;
        boolean z9;
        if (this.G) {
            width = this.H;
        } else {
            width = getWidth();
        }
        float f11 = width;
        if (this.I) {
            f10 = this.J;
        } else {
            f10 = this.h.f55487e;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF = V;
        float f12 = 1.0f;
        Paint paint = this.f54141e;
        if (i7 > 0 && !this.K) {
            paint.setColor(k6.r1(se.a.f55005a.getInterpolation(f10) * 0.09f, this.f54145s));
            rectF.set(0.0f, 0.0f, f11, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a10 = j9.a(this.S, 0.0f, 1.0f) * g0.T1(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f54148y) {
            f12 = this.f54143n.f55487e;
        }
        float f13 = f12 * this.S;
        int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            canvas.saveLayer(0.0f, 0.0f, f11, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i10 > 0) {
            canvas.save();
            float N = g0.N(1.33f);
            float N2 = g0.N(11.0f) + (f11 / 2.0f);
            float N3 = g0.N(10.0f);
            float N4 = g0.N(16.0f);
            i6 i6Var = this.f54142f;
            float max = Math.max(N4, i6Var.c() + g0.L(8.0f));
            float N5 = g0.N(9.333f);
            float N6 = g0.N(8.0f);
            float f14 = max / 2.0f;
            float f15 = N4 / 2.0f;
            rectF.set((N2 - f14) - N, (N3 - f15) - N, f14 + N2 + N, f15 + N3 + N);
            canvas.scale(f13, f13, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, k6.Cm);
            rectF.inset(N, N);
            if (this.f54148y) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(2131232748).mutate();
                }
                e.d().f(0.0f, 0.0f, g0.L(96.0f), g0.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, e.d().e());
                int N7 = (int) (N2 - g0.N(7.0f));
                int N8 = (int) (N3 - g0.N(7.0f));
                this.L.setBounds(N7, N8, g0.L(14.0f) + N7, g0.L(14.0f) + N8);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.f(this.f54144r.f55487e, k6.x0(null, k6.Vl, false), k6.x0(null, k6.f28112r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                i6Var.p(rectF);
                i6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z9) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z9, boolean z10) {
        this.f54142f.t(str, z10, true);
        this.f54143n.a(!TextUtils.isEmpty(str), z10);
        this.f54144r.a(z9, z10);
    }

    public final void f(boolean z9, boolean z10) {
        Typeface o4;
        this.h.a(z9, z10);
        b(z10);
        if (z9) {
            o4 = g0.o1("fonts/rextrabold.ttf");
        } else {
            o4 = g0.o();
        }
        this.f54138a.setTypeface(o4);
    }

    public final void g() {
        this.f54147x = k6.w0(k6.Ql, this.d);
        this.f54145s = k6.w0(k6.Ol, this.d);
        this.f54146w = k6.w0(k6.Pl, this.d);
        a();
        invalidate();
    }

    public l9 getBackupImageView() {
        return this.f54140c;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.R, 1073741824), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.f54139b.setTranslationX(measuredWidth);
            this.f54138a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i7) {
        this.R = i7;
        this.Q = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.f54138a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        ch0 ch0Var = this.f54139b;
        ch0Var.setScaleX(f10);
        ch0Var.setScaleY(f10);
        l9 l9Var = this.f54140c;
        if (l9Var != null) {
            l9Var.setScaleX(f10);
            this.f54140c.setScaleY(f10);
        }
        this.S = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z9) {
        this.f54148y = z9;
    }

    public void setSkipDrawSelector(boolean z9) {
        if (this.K != z9) {
            this.K = z9;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.D = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f54139b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.f54138a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float L = g0.L(f10);
        TextView textView = this.f54138a;
        if (textView.getTextSize() != L) {
            textView.setTextSize(1, f10);
            this.F.setTextSize(L);
        }
    }

    public void setVisualWidth(float f10) {
        this.G = true;
        if (this.H != f10) {
            this.H = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.f54139b.setTranslationX(measuredWidth);
            this.f54138a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        if (this.f54147x == k6.w0(k6.Ql, this.d) && this.f54145s == k6.w0(k6.Ol, this.d) && this.f54146w == k6.w0(k6.Pl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
