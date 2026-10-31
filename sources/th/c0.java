package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.y60;
import org.telegram.ui.ex0;
import rh.h8;
public final class c0 extends FrameLayout implements y60 {
    public final nh.p D;
    public final TextView E;
    public final TextView F;
    public final dq[] G;
    public final dq[] H;
    public int I;
    public ValueAnimator J;
    public h0 K;
    public final Paint L;
    public boolean f48812a;
    public boolean f48813b;
    public final int f48814c;
    public final boolean d;
    public Drawable e;
    public float f48815f;
    public final ai.b h;
    public final LinearLayout f48816n;
    public final nh.p f48817r;
    public final nh.p f48818s;
    public CharSequence f48819w;
    public final g9 f48820x;
    public final r8 f48821y;

    public c0(int i10, Context context, boolean z10) {
        super(context);
        this.f48812a = false;
        this.f48813b = true;
        this.f48815f = 0.5f;
        this.G = new dq[1];
        this.H = new dq[1];
        this.L = new Paint(1);
        this.f48814c = i10;
        this.d = z10;
        ai.b bVar = new ai.b(this, context);
        this.h = bVar;
        bVar.setOrientation(0);
        addView(bVar, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f48821y = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.f48820x = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(11.0f));
        bVar.addView(g9Var, w7.b6.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bVar.addView(linearLayout, w7.b6.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f48816n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.b6.o(-2, -2));
        nh.p pVar = new nh.p(context);
        this.f48817r = pVar;
        pVar.setTextColor(-1);
        pVar.setTextSize(1, 14.0f);
        pVar.setGravity(3);
        pVar.setTypeface(org.telegram.messenger.i0.o());
        linearLayout2.addView(pVar, w7.b6.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        nh.p pVar2 = new nh.p(context);
        this.f48818s = pVar2;
        pVar2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.55f, -1));
        pVar2.setTextSize(1, 12.0f);
        pVar2.setGravity(5);
        linearLayout2.addView(pVar2, w7.b6.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        nh.p pVar3 = new nh.p(context);
        this.D = pVar3;
        pVar3.setTextColor(-1);
        pVar3.setTextSize(1, 14.0f);
        pVar3.setShadowLayer(org.telegram.messenger.i0.L(2.5f), 0.0f, org.telegram.messenger.i0.L(1.5f), org.telegram.ui.ActionBar.t6.r1(0.6f, -16777216));
        zs.i(pVar3);
        linearLayout.addView(pVar3, w7.b6.o(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.i0.L(4.66f), 0, org.telegram.messenger.i0.L(4.66f), 0);
        textView.setVisibility(8);
        bVar.addView(textView, w7.b6.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        bVar.addView(textView2, w7.b6.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        ai.b bVar = this.h;
        if (bVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(bVar.getX(), bVar.getY(), bVar.getX() + bVar.getWidth(), bVar.getY() + bVar.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f48815f * 255.0f));
                this.h.invalidate();
            }
        }
        h0 h0Var = this.K;
        if (h0Var != null && this.e != null) {
            this.I = h0Var.f49006a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 13));
            this.J.addListener(new sg.r(this, 4));
            this.J.setDuration(350L);
            this.J.setInterpolator(gr.h);
            this.J.start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(h0 h0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i10;
        boolean z11;
        String str2;
        int i11;
        boolean z12;
        int i12;
        CharSequence subSequence;
        int i13;
        this.K = h0Var;
        ai.b bVar = this.h;
        if ((h0Var == null || this.I != h0Var.f49006a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f48815f * 255.0f));
                bVar.invalidate();
            }
        }
        int i14 = (h0Var.f49008c > 0L ? 1 : (h0Var.f49008c == 0L ? 0 : -1));
        g9 g9Var = this.f48820x;
        r8 r8Var = this.f48821y;
        int i15 = this.f48814c;
        if (i14 >= 0) {
            TLRPC.User Z1 = vp.r1(i15).Z1(Long.valueOf(h0Var.f49008c));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
            str = h20.k(Z1);
        } else {
            TLRPC.Chat L0 = vp.r1(i15).L0(Long.valueOf(-h0Var.f49008c));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
        }
        int b10 = o.b(i15, (int) h0Var.f49010g, 3);
        int b11 = o.b(i15, (int) h0Var.f49010g, 4);
        int b12 = o.b(i15, (int) h0Var.f49010g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z13 = h0Var.f49007b;
        String str3 = " ";
        boolean z14 = this.d;
        float f7 = 1.0f;
        nh.p pVar = this.D;
        if (z13 && h0Var.f49010g <= 0) {
            z10 = z14;
        } else {
            if (h0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + h0Var.h));
                z10 = z14;
                dq dqVar = new dq(0, new fq(getContext(), h0Var.h));
                dqVar.f25509s = org.telegram.messenger.i0.L(1.0f);
                spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z14;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, pVar.getPaint(), org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i10 = 33;
                spannableStringBuilder.setSpan(new a0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int b13 = o.b(i15, (int) h0Var.f49010g, 1);
        int b14 = o.b(i15, (int) h0Var.f49010g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = h0Var.f49009f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = jj.j0(tL_textWithEntities, false, false, pVar.getPaint());
            this.f48819w = j02;
            if (j02 == null) {
                z11 = true;
                str2 = " ";
                subSequence = null;
            } else {
                int length = j02.length();
                z11 = true;
                int i16 = 0;
                while (true) {
                    if (i16 < length) {
                        char charAt = j02.charAt(i16);
                        if (!Character.isWhitespace(charAt)) {
                            i12 = length;
                            if (charAt != 10240 && charAt != 12644 && charAt != 65440) {
                                break;
                            }
                        } else {
                            i12 = length;
                        }
                        i16++;
                        length = i12;
                    } else {
                        i12 = length;
                        break;
                    }
                }
                int i17 = i12;
                while (true) {
                    if (i16 < i17) {
                        char charAt2 = j02.charAt(i17 - 1);
                        if (!Character.isWhitespace(charAt2)) {
                            str2 = str3;
                            if (charAt2 != 10240 && charAt2 != 12644) {
                                if (charAt2 != 65440) {
                                    break;
                                }
                                i17--;
                                str3 = str2;
                            }
                        } else {
                            str2 = str3;
                        }
                        i17--;
                        str3 = str2;
                    } else {
                        str2 = str3;
                        break;
                    }
                }
                if (i16 <= 0 && i17 >= j02.length()) {
                    subSequence = j02;
                } else {
                    subSequence = j02.subSequence(i16, i17);
                }
            }
            this.f48819w = subSequence;
            if (subSequence.length() > b13 && !h0Var.f49007b) {
                i13 = 0;
                this.f48819w = this.f48819w.subSequence(0, b13);
            } else {
                i13 = 0;
            }
            CharSequence charSequence = this.f48819w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannable.getSpans(i13, charSequence.length(), org.telegram.ui.Components.o5.class);
                org.telegram.messenger.h6[] h6VarArr = (org.telegram.messenger.h6[]) spannable.getSpans(i13, this.f48819w.length(), org.telegram.messenger.h6.class);
                if (o5VarArr.length + h6VarArr.length > b14 && !h0Var.f49007b) {
                    ArrayList arrayList = new ArrayList();
                    int i18 = 0;
                    while (i18 < o5VarArr.length) {
                        org.telegram.ui.Components.o5[] o5VarArr2 = o5VarArr;
                        int i19 = i18;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(o5VarArr2[i18])), Integer.valueOf(spannable.getSpanEnd(o5VarArr2[i19]))));
                        i18 = i19 + 1;
                        o5VarArr = o5VarArr2;
                    }
                    int i20 = 0;
                    while (i20 < h6VarArr.length) {
                        int i21 = i20;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(h6VarArr[i20])), Integer.valueOf(spannable.getSpanEnd(h6VarArr[i21]))));
                        i20 = i21 + 1;
                    }
                    Collections.sort(arrayList, new ex0(22));
                    if (!(this.f48819w instanceof SpannableStringBuilder)) {
                        this.f48819w = new SpannableStringBuilder(this.f48819w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.f48819w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!h0Var.f49007b) {
                this.f48819w = org.telegram.messenger.i0.M2(this.f48819w);
            }
            spannableStringBuilder.append(this.f48819w);
        } else {
            z11 = true;
            str2 = " ";
            this.f48819w = "";
        }
        pVar.setText(org.telegram.messenger.k6.m(spannableStringBuilder, pVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        if (h0Var.f49007b && h0Var.f49010g <= 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f48816n.setVisibility(i11);
        long j10 = h0Var.f49010g;
        int i22 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TextView textView = this.F;
        TextView textView2 = this.E;
        if (i22 > 0) {
            if (j10 >= 250) {
                z12 = z11;
            } else {
                z12 = false;
            }
            this.f48812a = z12;
            bVar.setWillNotDraw(!z12);
            bVar.invalidate();
            pVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.i0.L(13.0f);
            int i23 = org.telegram.ui.ActionBar.t6.f20865a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            bVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            if (!z10) {
                f7 = 0.65f;
            }
            float f10 = f7;
            this.f48815f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (!h0Var.e) {
                textView.setVisibility(0);
                textView.setText(h8.W0(false, i0.a.k(h0Var.f49010g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(13.0f), org.telegram.ui.ActionBar.t6.r1(0.25f, b12)));
                textView2.setText(h8.W0(false, i0.a.k(h0Var.f49010g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, org.telegram.messenger.i0.L(0.66f), 1.0f));
                dq dqVar2 = this.G[0];
                if (dqVar2 != null) {
                    dqVar2.f25503a = this.f48813b;
                }
            }
        } else if (h0Var.f49007b) {
            this.f48812a = false;
            bVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(13.0f), -16777216);
            this.e = d02;
            bVar.setBackground(d02);
            Drawable drawable3 = this.e;
            this.f48815f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            pVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.o5.l(i15, h0Var.f49008c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) cd.L0(2131748835, null));
            spannableStringBuilder2.setSpan(new z(0), length2, spannableStringBuilder2.length(), 33);
            this.f48817r.setText(spannableStringBuilder2);
            this.f48818s.setText(cd.L0(2131748838, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.f48812a = false;
            bVar.setWillNotDraw(true);
            pVar.setShadowLayer(org.telegram.messenger.i0.L(2.5f), 0.0f, org.telegram.messenger.i0.L(1.5f), org.telegram.ui.ActionBar.t6.r1(0.6f, -16777216));
            this.e = null;
            bVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        bVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.f48813b = z10;
        dq dqVar = this.G[0];
        if (dqVar != null && dqVar.f25503a != z10) {
            dqVar.f25503a = z10;
            this.E.invalidate();
        }
    }
}
