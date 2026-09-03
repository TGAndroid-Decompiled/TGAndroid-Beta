package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public abstract class y91 extends FrameLayout {
    public final Window f40189a;
    public final vf.g f40190b;
    public final vf.g f40191c;
    public final xf.c d;
    public final RadialProgressView e;
    public final TextView f40192f;
    public final h51 h;
    public final ArrayList f40193n;
    public aa1 f40194r;
    public final int f40195s;

    public y91(Context context, int i10, vf.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f40193n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f40189a = ((Activity) context).getWindow();
        } else {
            this.f40189a = null;
        }
        this.f40195s = i10;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        this.h = new h51(context, 2);
        xf.c cVar = new xf.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final y91 f38721b;

            {
                this.f38721b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38721b.h(true);
                        return;
                    case 1:
                        this.f38721b.c();
                        return;
                    default:
                        this.f38721b.f40191c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f40190b = new vf.g(getContext(), null);
                            vf.g gVar = new vf.g(getContext(), null);
                            this.f40191c = gVar;
                            gVar.f45809q0.f47044y = true;
                        } else {
                            this.f40190b = new vf.g(getContext(), null);
                            vf.g gVar2 = new vf.g(getContext(), null);
                            this.f40191c = gVar2;
                            gVar2.f45809q0.f47044y = true;
                        }
                    } else {
                        vf.q qVar = new vf.q(getContext());
                        this.f40190b = qVar;
                        qVar.f45809q0.B = true;
                        ?? qVar2 = new vf.q(getContext());
                        qVar2.J1 = -1;
                        qVar2.K1 = new RectF();
                        qVar2.M1 = AndroidUtilities.dp(9.0f);
                        qVar2.N1 = AndroidUtilities.dp(13.0f);
                        qVar2.O1 = new String[101];
                        qVar2.Q1 = 1.0f;
                        qVar2.R1 = 0;
                        qVar2.S1 = -1;
                        qVar2.T1 = -1;
                        for (int i11 = 1; i11 <= 100; i11++) {
                            qVar2.O1[i11] = android.support.v4.media.a.l(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.L1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f45794e1 = true;
                        this.f40191c = qVar2;
                    }
                } else {
                    vf.g gVar3 = new vf.g(getContext(), null);
                    gVar3.f45814t0 = true;
                    gVar3.f45815u0 = true;
                    this.f40190b = gVar3;
                    vf.g gVar4 = new vf.g(getContext(), null);
                    this.f40191c = gVar4;
                    gVar4.f45809q0.f47044y = true;
                }
            } else {
                this.f40190b = new vf.p(getContext(), f6Var);
                vf.p pVar = new vf.p(getContext(), f6Var);
                this.f40191c = pVar;
                pVar.f45809q0.f47044y = true;
            }
        } else {
            this.f40190b = new vf.g(getContext(), f6Var);
            vf.g gVar5 = new vf.g(getContext(), f6Var);
            this.f40191c = gVar5;
            gVar5.f45809q0.f47044y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40190b.f45782a = fVar;
        this.f40191c.f45782a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f40190b);
        frameLayout.addView(this.f40190b.f45809q0, -2, -2);
        frameLayout.addView(this.f40191c);
        frameLayout.addView(this.f40191c.f45809q0, -2, -2);
        frameLayout.addView(radialProgressView, k7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f40192f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20149s5, f6Var));
        this.f40190b.setDateSelectionListener(new kl0(this, 19));
        this.f40190b.f45809q0.d(false, false);
        this.f40190b.f45809q0.setOnTouchListener(new Object());
        this.f40190b.f45809q0.setOnClickListener(new View.OnClickListener(this) {
            public final y91 f38721b;

            {
                this.f38721b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38721b.h(true);
                        return;
                    case 1:
                        this.f38721b.c();
                        return;
                    default:
                        this.f38721b.f40191c.c(false);
                        return;
                }
            }
        });
        this.f40191c.f45809q0.setOnClickListener(new View.OnClickListener(this) {
            public final y91 f38721b;

            {
                this.f38721b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38721b.h(true);
                        return;
                    case 1:
                        this.f38721b.c();
                        return;
                    default:
                        this.f38721b.f40191c.c(false);
                        return;
                }
            }
        });
        this.f40190b.setVisibility(0);
        this.f40191c.setVisibility(4);
        this.f40190b.setHeader(this.d);
        f10.addView(this.d, k7.b6.c(52.0f, -1));
        f10.addView(frameLayout, k7.b6.c(-2.0f, -1));
        f10.addView(this.h, k7.b6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f40195s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z4) {
        float f10;
        Window window = this.f40189a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        vf.g gVar = this.f40190b;
        gVar.G = false;
        vf.g gVar2 = this.f40191c;
        gVar2.G = false;
        gVar.f45816v0 = 2;
        gVar2.f45816v0 = 1;
        final ?? obj = new Object();
        vf.j jVar = gVar.f45791d0;
        obj.f47062b = jVar.f45837l;
        obj.f47061a = jVar.f45836k;
        int binarySearch = Arrays.binarySearch(this.f40194r.d.f46606a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f40194r.d.f46606a.length - 1;
        }
        obj.f47063c = this.f40194r.d.f46607b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f45818w0 = obj;
        gVar.f45818w0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f40194r.d.d.size(); i10++) {
            if (((wf.a) this.f40194r.d.d.get(i10)).f46600a[binarySearch] > j11) {
                j11 = ((wf.a) this.f40194r.d.d.get(i10)).f46600a[binarySearch];
            }
            if (((wf.a) this.f40194r.d.d.get(i10)).f46600a[binarySearch] < j12) {
                j12 = ((wf.a) this.f40194r.d.d.get(i10)).f46600a[binarySearch];
            }
        }
        float f11 = ((float) j12) + ((float) (j11 - j12));
        float f12 = gVar.f45817w;
        final float f13 = (f11 - f12) / (gVar.v - f12);
        gVar.q(obj);
        gVar2.q(obj);
        float f14 = 1.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f14 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f14);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                y91 y91Var = y91.this;
                vf.g gVar3 = y91Var.f40190b;
                float f15 = gVar3.C0;
                vf.j jVar2 = gVar3.f45791d0;
                float f16 = jVar2.f45837l;
                float f17 = jVar2.f45836k;
                float f18 = ((f15 / (f16 - f17)) * f17) - vf.g.f45764h1;
                RectF rectF = gVar3.E0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                xf.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.D0 * jVar3.f47063c) - f18;
                jVar3.f47064f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf.g gVar4 = y91Var.f40191c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(aa1 aa1Var);

    public abstract void c();

    public final void d() {
        wf.b bVar;
        ArrayList arrayList;
        int i10;
        vf.g gVar = this.f40190b;
        gVar.G();
        gVar.invalidate();
        vf.g gVar2 = this.f40191c;
        gVar2.G();
        gVar2.invalidate();
        xf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        aa1 aa1Var = this.f40194r;
        if (aa1Var != null && (bVar = aa1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f40194r.d.d.size(); i11++) {
                if (((wf.a) this.f40194r.d.d.get(i11)).f46604g >= 0 && org.telegram.ui.ActionBar.j6.c1(((wf.a) this.f40194r.d.d.get(i11)).f46604g)) {
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, ((wf.a) this.f40194r.d.d.get(i11)).f46604g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false)) < 0.5d) {
                    i10 = ((wf.a) this.f40194r.d.d.get(i11)).f46605i;
                } else {
                    i10 = ((wf.a) this.f40194r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f40193n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.t00 t00Var = ((x91) arrayList2.get(i11)).f39943a;
                    t00Var.getClass();
                    t00Var.f28856r = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false);
                    t00Var.v = -1;
                    t00Var.f28857s = i10;
                    t00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19953h6, false));
        this.f40192f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20149s5, false));
    }

    public final void e(aa1 aa1Var, boolean z4) {
        boolean z10;
        boolean z11;
        if (aa1Var != null) {
            String str = aa1Var.f32532j;
            xf.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            vf.g gVar = this.f40190b;
            gVar.setLandscape(z10);
            ArrayList arrayList = gVar.d;
            vf.j jVar = gVar.f45791d0;
            vf.g gVar2 = this.f40191c;
            gVar2.setLandscape(z10);
            this.f40194r = aa1Var;
            boolean z12 = aa1Var.f32534l;
            ArrayList arrayList2 = this.f40193n;
            h51 h51Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f40192f;
            if (!z12 && !aa1Var.f32526a) {
                textView.setVisibility(8);
                xf.e eVar = gVar.f45809q0;
                boolean z13 = aa1Var.f32536n;
                eVar.f47035a = z13;
                cVar.c(!z13);
                if (aa1Var.d == null && aa1Var.f32529f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(aa1Var);
                    gVar.D(null);
                    return;
                }
                if (!z4) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(aa1Var.d) && aa1Var.h) {
                    jVar.f45836k = 0.0f;
                    jVar.f45837l = 1.0f;
                    jVar.f45829a.A(true, false, false);
                }
                cVar.setUseWeekInterval(aa1Var.f32537o);
                gVar.f45809q0.setUseWeek(aa1Var.f32537o);
                xf.e eVar2 = gVar.f45809q0;
                if (this.f40194r.f32530g == null && this.f40195s != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                eVar2.C = z11;
                gVar2.f45809q0.C = false;
                eVar2.setEnabled(eVar2.C);
                xf.e eVar3 = gVar2.f45809q0;
                eVar3.setEnabled(eVar3.C);
                int size = arrayList.size();
                h51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        xf.f fVar = (xf.f) arrayList.get(i10);
                        x91 x91Var = new x91(this, i10);
                        x91Var.f39944b = fVar;
                        String str2 = fVar.f47045a.d;
                        org.telegram.ui.Components.t00 t00Var = x91Var.f39943a;
                        t00Var.setText(str2);
                        t00Var.a(fVar.f47055n, false);
                        t00Var.setOnTouchListener(new Object());
                        t00Var.setOnClickListener(new ib0(22, x91Var, fVar));
                        t00Var.setOnLongClickListener(new nh.f2(6, x91Var, fVar));
                    }
                }
                long j10 = this.f40194r.f32528c;
                if (j10 > 0) {
                    gVar.f45808p0 = Arrays.binarySearch(gVar.f45793e0.f46606a, j10);
                    gVar.f45811r0 = true;
                    gVar.f45809q0.setVisibility(0);
                    gVar.f45813s0 = 1.0f;
                    gVar.x((gVar.D0 * jVar.f45836k) - vf.g.f45764h1);
                    try {
                        gVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g(true);
                } else {
                    h(false);
                    gVar.invalidate();
                }
                d();
                if (z4) {
                    gVar.f45816v0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f45818w0 = obj;
                    obj.f47064f = 0.0f;
                    ofFloat.addUpdateListener(new o11(this, 12));
                    ofFloat.addListener(new w91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = aa1Var.f32527b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            h51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z4) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        vf.g gVar = this.f40190b;
        long selectedDate = gVar.getSelectedDate();
        wf.b bVar = this.f40194r.e;
        vf.g gVar2 = this.f40191c;
        if (!z4 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f40194r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f40194r.d.d.size();
                arrayList = this.f40193n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((wf.a) bVar.d.get(i12)).f46602c.equals(((wf.a) this.f40194r.d.d.get(i10)).f46602c)) {
                            boolean z11 = ((x91) arrayList.get(i10)).f39943a.f28852b;
                            ((xf.f) arrayList2.get(i12)).f47055n = z11;
                            xf.f fVar = (xf.f) arrayList2.get(i12);
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f47056o = f10;
                            ((x91) arrayList.get(i10)).f39943a.f28853c = true;
                            ((x91) arrayList.get(i10)).f39943a.animate().alpha(1.0f).start();
                            if (z11) {
                                i11++;
                            }
                            z10 = true;
                        } else {
                            i12++;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    ((x91) arrayList.get(i10)).f39943a.f28853c = false;
                    ((x91) arrayList.get(i10)).f39943a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f40194r.d.d.size(); i13++) {
                    ((x91) arrayList.get(i13)).f39943a.f28853c = true;
                    ((x91) arrayList.get(i13)).f39943a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f40194r.f32528c = selectedDate;
        gVar.f45809q0.setAlpha(0.0f);
        gVar.f45813s0 = 0.0f;
        gVar.f45811r0 = false;
        gVar.f45797f1 = false;
        gVar2.G();
        xf.c cVar = this.d;
        if (!z4) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z4) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f45816v0 = 0;
            gVar2.f45816v0 = 0;
            gVar.G = false;
            gVar2.G = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new w91(this, 0));
        a2.start();
    }

    public final void h(boolean z4) {
        wf.b bVar;
        aa1 aa1Var = this.f40194r;
        if (aa1Var != null && (bVar = aa1Var.d) != null && bVar.f46606a != null) {
            xf.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f47024a;
            vf.g gVar = this.f40190b;
            cVar.b(gVar.getStartDate(), gVar.getEndDate());
            if (z4) {
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.3f);
                textView2.setScaleY(0.3f);
                textView2.setPivotX(0.0f);
                textView2.setPivotY(0.0f);
                textView2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
                textView.setAlpha(1.0f);
                textView.setTranslationX(0.0f);
                textView.setTranslationY(0.0f);
                textView.setScaleX(1.0f);
                textView.setScaleY(1.0f);
                textView.setPivotY(AndroidUtilities.dp(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            gVar.f45809q0.f47038f.setAlpha(1.0f);
            vf.g gVar2 = this.f40191c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f40194r.f32528c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f40193n;
            if (!z4) {
                gVar2.setVisibility(4);
                gVar.G = true;
                gVar2.G = false;
                gVar.invalidate();
                Window window = this.f40189a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    x91 x91Var = (x91) obj;
                    x91Var.f39943a.setAlpha(1.0f);
                    x91Var.f39943a.f28853c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new w91(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                x91 x91Var2 = (x91) obj2;
                x91Var2.f39943a.animate().alpha(1.0f).start();
                x91Var2.f39943a.f28853c = true;
            }
            a2.start();
        }
    }
}
