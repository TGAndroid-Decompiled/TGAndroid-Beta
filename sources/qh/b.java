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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.me0;
public final class b extends FrameLayout implements me0, te.b, b6 {
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
    public final TextView f54150a;
    public final dh0 f54151b;
    public l9 f54152c;
    public g6 d;
    public final Paint f54153e;
    public final i6 f54154f;
    public final te.a h;
    public final te.a f54155n;
    public final te.a f54156r;
    public int f54157s;
    public int f54158w;
    public int f54159x;
    public boolean f54160y;

    public b(Context context) {
        super(context);
        this.f54153e = new Paint(1);
        this.h = new te.a(0, this, se.a.f55017a, 320L, false);
        xq xqVar = xq.h;
        this.f54155n = new te.a(1, this, xqVar, 380L, false);
        this.f54156r = new te.a(2, this, xqVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f54151b = imageView;
        addView((View) imageView, ha.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f54150a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(g0.o());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, ha.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        i6 i6Var = new i6(false, false, false);
        this.f54154f = i6Var;
        i6Var.x(g0.o());
        i6Var.setCallback(this);
        i6Var.f34587b = 17;
        i6Var.u(-1);
        i6Var.w(g0.L(10.0f));
    }

    public static b c(Context context, g6 g6Var, a aVar, int i7) {
        b bVar = new b(context);
        bVar.d = g6Var;
        bVar.D = aVar;
        bVar.f54150a.setText(id.M0(i7, null));
        bVar.b(false);
        bVar.f54151b.setLayoutParams(ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54159x = l6.w0(l6.Ql, g6Var);
        bVar.f54157s = l6.w0(l6.Ol, g6Var);
        bVar.f54158w = l6.w0(l6.Pl, g6Var);
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
        int i7 = this.f54159x;
        int i10 = this.f54157s;
        te.a aVar = this.h;
        int f10 = i0.a.f(aVar.f55499e, i7, i10);
        int f11 = i0.a.f(aVar.f55499e, this.f54159x, this.f54158w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        l9 l9Var = this.f54152c;
        if (l9Var != null && this.M) {
            l9Var.setColorFilter(porterDuffColorFilter);
            this.f54152c.invalidate();
        }
        this.f54151b.setColorFilter(porterDuffColorFilter);
        this.f54150a.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.Ql));
        hashSet.add(Integer.valueOf(l6.Ol));
        hashSet.add(Integer.valueOf(l6.Pl));
    }

    public final void b(boolean z9) {
        int i7;
        boolean z10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        String str;
        boolean z11 = this.h.f55500f;
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
                    l9 l9Var = this.f54152c;
                    hc b10 = hc.b(document);
                    hc b11 = hc.b(document);
                    if (!z12) {
                        rzVar = t5.f(document, l6.f27809a7, 1.0f, null);
                    }
                    l9Var.m(b10, "24_24_lastframe", b11, "24_24_lastframe", rzVar, this.E);
                    this.P = document.f26962id;
                }
            } else {
                this.f54152c.b();
            }
            a();
            return;
        }
        a aVar = this.D;
        if (aVar != null) {
            int i11 = aVar.f54147b;
            int i12 = aVar.f54146a;
            int i13 = aVar.f54148c;
            dh0 dh0Var = this.f54151b;
            if (i13 != -1) {
                dh0Var.setImageResource(i13);
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
                    dh0Var.f(i7, 24, 24, null);
                    z10 = true;
                }
                if (z10) {
                    ah0 animatedDrawable = dh0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z11) {
                            animatedDrawable.P(this.D.d);
                            if (animatedDrawable.f31820a0 >= this.D.f54149e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f31820a0;
                            int i15 = this.D.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f31820a0;
                            a aVar2 = this.D;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.f54149e - 1);
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
                    dh0Var.f(i7, 24, 24, null);
                    dh0Var.getAnimatedDrawable().h = false;
                    if (z9) {
                        dh0Var.getAnimatedDrawable().M(0);
                        dh0Var.d();
                        return;
                    }
                    dh0Var.getAnimatedDrawable().T(true, 0.99f);
                }
            } else {
                if (dh0Var.getAnimatedDrawable() == null) {
                    dh0Var.f(this.D.f54146a, 24, 24, null);
                }
                ah0 animatedDrawable2 = dh0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f31826e;
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
                        dh0Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.F.measureText(this.f54150a.getText().toString());
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
            f10 = this.h.f55499e;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF = V;
        float f12 = 1.0f;
        Paint paint = this.f54153e;
        if (i7 > 0 && !this.K) {
            paint.setColor(l6.r1(se.a.f55017a.getInterpolation(f10) * 0.09f, this.f54157s));
            rectF.set(0.0f, 0.0f, f11, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a10 = j9.a(this.S, 0.0f, 1.0f) * g0.T1(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f54160y) {
            f12 = this.f54155n.f55499e;
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
            i6 i6Var = this.f54154f;
            float max = Math.max(N4, i6Var.c() + g0.L(8.0f));
            float N5 = g0.N(9.333f);
            float N6 = g0.N(8.0f);
            float f14 = max / 2.0f;
            float f15 = N4 / 2.0f;
            rectF.set((N2 - f14) - N, (N3 - f15) - N, f14 + N2 + N, f15 + N3 + N);
            canvas.scale(f13, f13, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, l6.Cm);
            rectF.inset(N, N);
            if (this.f54160y) {
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
                paint.setColor(i0.a.f(this.f54156r.f55499e, l6.x0(null, l6.Vl, false), l6.x0(null, l6.f28125r7, false)));
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
        this.f54154f.t(str, z10, true);
        this.f54155n.a(!TextUtils.isEmpty(str), z10);
        this.f54156r.a(z9, z10);
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
        this.f54150a.setTypeface(o4);
    }

    public final void g() {
        this.f54159x = l6.w0(l6.Ql, this.d);
        this.f54157s = l6.w0(l6.Ol, this.d);
        this.f54158w = l6.w0(l6.Pl, this.d);
        a();
        invalidate();
    }

    public l9 getBackupImageView() {
        return this.f54152c;
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
            this.f54151b.setTranslationX(measuredWidth);
            this.f54150a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i7) {
        this.R = i7;
        this.Q = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.f54150a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        dh0 dh0Var = this.f54151b;
        dh0Var.setScaleX(f10);
        dh0Var.setScaleY(f10);
        l9 l9Var = this.f54152c;
        if (l9Var != null) {
            l9Var.setScaleX(f10);
            this.f54152c.setScaleY(f10);
        }
        this.S = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z9) {
        this.f54160y = z9;
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
        this.f54151b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.f54150a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float L = g0.L(f10);
        TextView textView = this.f54150a;
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
            this.f54151b.setTranslationX(measuredWidth);
            this.f54150a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        if (this.f54159x == l6.w0(l6.Ql, this.d) && this.f54157s == l6.w0(l6.Ol, this.d) && this.f54158w == l6.w0(l6.Pl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
