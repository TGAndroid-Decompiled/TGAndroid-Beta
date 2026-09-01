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
public abstract class r91 extends FrameLayout {
    public final Window f40867a;
    public final wf.g f40868b;
    public final wf.g f40869c;
    public final yf.c d;
    public final RadialProgressView f40870e;
    public final TextView f40871f;
    public final c51 h;
    public final ArrayList f40872n;
    public t91 f40873r;
    public final int f40874s;

    public r91(Context context, int i10, wf.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f40872n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f40867a = ((Activity) context).getWindow();
        } else {
            this.f40867a = null;
        }
        this.f40874s = i10;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        this.h = new c51(context, 2);
        yf.c cVar = new yf.c(getContext(), g6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final r91 f39361b;

            {
                this.f39361b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39361b.h(true);
                        return;
                    case 1:
                        this.f39361b.c();
                        return;
                    default:
                        this.f39361b.f40869c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f40868b = new wf.g(getContext(), null);
                            wf.g gVar = new wf.g(getContext(), null);
                            this.f40869c = gVar;
                            gVar.f49570q0.f50921y = true;
                        } else {
                            this.f40868b = new wf.g(getContext(), null);
                            wf.g gVar2 = new wf.g(getContext(), null);
                            this.f40869c = gVar2;
                            gVar2.f49570q0.f50921y = true;
                        }
                    } else {
                        wf.q qVar = new wf.q(getContext());
                        this.f40868b = qVar;
                        qVar.f49570q0.B = true;
                        ?? qVar2 = new wf.q(getContext());
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
                        qVar2.f49555e1 = true;
                        this.f40869c = qVar2;
                    }
                } else {
                    wf.g gVar3 = new wf.g(getContext(), null);
                    gVar3.f49575t0 = true;
                    gVar3.f49576u0 = true;
                    this.f40868b = gVar3;
                    wf.g gVar4 = new wf.g(getContext(), null);
                    this.f40869c = gVar4;
                    gVar4.f49570q0.f50921y = true;
                }
            } else {
                this.f40868b = new wf.p(getContext(), g6Var);
                wf.p pVar = new wf.p(getContext(), g6Var);
                this.f40869c = pVar;
                pVar.f49570q0.f50921y = true;
            }
        } else {
            this.f40868b = new wf.g(getContext(), g6Var);
            wf.g gVar5 = new wf.g(getContext(), g6Var);
            this.f40869c = gVar5;
            gVar5.f49570q0.f50921y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40868b.f49542a = fVar;
        this.f40869c.f49542a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f40870e = radialProgressView;
        frameLayout.addView(this.f40868b);
        frameLayout.addView(this.f40868b.f49570q0, -2, -2);
        frameLayout.addView(this.f40869c);
        frameLayout.addView(this.f40869c.f49570q0, -2, -2);
        frameLayout.addView(radialProgressView, k7.c6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f40871f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21928s5, g6Var));
        this.f40868b.setDateSelectionListener(new kl0(this, 19));
        this.f40868b.f49570q0.d(false, false);
        this.f40868b.f49570q0.setOnTouchListener(new Object());
        this.f40868b.f49570q0.setOnClickListener(new View.OnClickListener(this) {
            public final r91 f39361b;

            {
                this.f39361b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39361b.h(true);
                        return;
                    case 1:
                        this.f39361b.c();
                        return;
                    default:
                        this.f39361b.f40869c.c(false);
                        return;
                }
            }
        });
        this.f40869c.f49570q0.setOnClickListener(new View.OnClickListener(this) {
            public final r91 f39361b;

            {
                this.f39361b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39361b.h(true);
                        return;
                    case 1:
                        this.f39361b.c();
                        return;
                    default:
                        this.f39361b.f40869c.c(false);
                        return;
                }
            }
        });
        this.f40868b.setVisibility(0);
        this.f40869c.setVisibility(4);
        this.f40868b.setHeader(this.d);
        f10.addView(this.d, k7.c6.c(52.0f, -1));
        f10.addView(frameLayout, k7.c6.c(-2.0f, -1));
        f10.addView(this.h, k7.c6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f40874s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z4) {
        float f10;
        Window window = this.f40867a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        wf.g gVar = this.f40868b;
        gVar.G = false;
        wf.g gVar2 = this.f40869c;
        gVar2.G = false;
        gVar.f49577v0 = 2;
        gVar2.f49577v0 = 1;
        final ?? obj = new Object();
        wf.j jVar = gVar.f49551d0;
        obj.f50940b = jVar.f49600l;
        obj.f50939a = jVar.f49599k;
        int binarySearch = Arrays.binarySearch(this.f40873r.d.f50547a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f40873r.d.f50547a.length - 1;
        }
        obj.f50941c = this.f40873r.d.f50548b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f49579w0 = obj;
        gVar.f49579w0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f40873r.d.d.size(); i10++) {
            if (((xf.a) this.f40873r.d.d.get(i10)).f50540a[binarySearch] > j11) {
                j11 = ((xf.a) this.f40873r.d.d.get(i10)).f50540a[binarySearch];
            }
            if (((xf.a) this.f40873r.d.d.get(i10)).f50540a[binarySearch] < j12) {
                j12 = ((xf.a) this.f40873r.d.d.get(i10)).f50540a[binarySearch];
            }
        }
        float f11 = ((float) j12) + ((float) (j11 - j12));
        float f12 = gVar.f49578w;
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
                r91 r91Var = r91.this;
                wf.g gVar3 = r91Var.f40868b;
                float f15 = gVar3.C0;
                wf.j jVar2 = gVar3.f49551d0;
                float f16 = jVar2.f49600l;
                float f17 = jVar2.f49599k;
                float f18 = ((f15 / (f16 - f17)) * f17) - wf.g.f49524h1;
                RectF rectF = gVar3.E0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                yf.j jVar3 = obj;
                jVar3.f50942e = height;
                jVar3.d = (gVar3.D0 * jVar3.f50941c) - f18;
                jVar3.f50943f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf.g gVar4 = r91Var.f40869c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(t91 t91Var);

    public abstract void c();

    public final void d() {
        xf.b bVar;
        ArrayList arrayList;
        int i10;
        wf.g gVar = this.f40868b;
        gVar.G();
        gVar.invalidate();
        wf.g gVar2 = this.f40869c;
        gVar2.G();
        gVar2.invalidate();
        yf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        t91 t91Var = this.f40873r;
        if (t91Var != null && (bVar = t91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f40873r.d.d.size(); i11++) {
                if (((xf.a) this.f40873r.d.d.get(i11)).f50545g >= 0 && org.telegram.ui.ActionBar.k6.c1(((xf.a) this.f40873r.d.d.get(i11)).f50545g)) {
                    i10 = org.telegram.ui.ActionBar.k6.w0(null, ((xf.a) this.f40873r.d.d.get(i11)).f50545g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false)) < 0.5d) {
                    i10 = ((xf.a) this.f40873r.d.d.get(i11)).f50546i;
                } else {
                    i10 = ((xf.a) this.f40873r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f40872n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.t00 t00Var = ((q91) arrayList2.get(i11)).f40414a;
                    t00Var.getClass();
                    t00Var.f31220r = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false);
                    t00Var.v = -1;
                    t00Var.f31221s = i10;
                    t00Var.invalidate();
                }
            }
        }
        this.f40870e.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21732h6, false));
        this.f40871f.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21928s5, false));
    }

    public final void e(t91 t91Var, boolean z4) {
        boolean z10;
        boolean z11;
        if (t91Var != null) {
            String str = t91Var.f41549j;
            yf.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            wf.g gVar = this.f40868b;
            gVar.setLandscape(z10);
            ArrayList arrayList = gVar.d;
            wf.j jVar = gVar.f49551d0;
            wf.g gVar2 = this.f40869c;
            gVar2.setLandscape(z10);
            this.f40873r = t91Var;
            boolean z12 = t91Var.f41551l;
            ArrayList arrayList2 = this.f40872n;
            c51 c51Var = this.h;
            RadialProgressView radialProgressView = this.f40870e;
            TextView textView = this.f40871f;
            if (!z12 && !t91Var.f41542a) {
                textView.setVisibility(8);
                yf.e eVar = gVar.f49570q0;
                boolean z13 = t91Var.f41553n;
                eVar.f50911a = z13;
                cVar.c(!z13);
                if (t91Var.d == null && t91Var.f41546f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(t91Var);
                    gVar.D(null);
                    return;
                }
                if (!z4) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(t91Var.d) && t91Var.h) {
                    jVar.f49599k = 0.0f;
                    jVar.f49600l = 1.0f;
                    jVar.f49591a.A(true, false, false);
                }
                cVar.setUseWeekInterval(t91Var.f41554o);
                gVar.f49570q0.setUseWeek(t91Var.f41554o);
                yf.e eVar2 = gVar.f49570q0;
                if (this.f40873r.f41547g == null && this.f40874s != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                eVar2.C = z11;
                gVar2.f49570q0.C = false;
                eVar2.setEnabled(eVar2.C);
                yf.e eVar3 = gVar2.f49570q0;
                eVar3.setEnabled(eVar3.C);
                int size = arrayList.size();
                c51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        yf.f fVar = (yf.f) arrayList.get(i10);
                        q91 q91Var = new q91(this, i10);
                        q91Var.f40415b = fVar;
                        String str2 = fVar.f50922a.d;
                        org.telegram.ui.Components.t00 t00Var = q91Var.f40414a;
                        t00Var.setText(str2);
                        t00Var.a(fVar.f50933n, false);
                        t00Var.setOnTouchListener(new Object());
                        t00Var.setOnClickListener(new hb0(22, q91Var, fVar));
                        t00Var.setOnLongClickListener(new oh.g2(6, q91Var, fVar));
                    }
                }
                long j10 = this.f40873r.f41544c;
                if (j10 > 0) {
                    gVar.f49569p0 = Arrays.binarySearch(gVar.f49554e0.f50547a, j10);
                    gVar.f49572r0 = true;
                    gVar.f49570q0.setVisibility(0);
                    gVar.f49574s0 = 1.0f;
                    gVar.x((gVar.D0 * jVar.f49599k) - wf.g.f49524h1);
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
                    gVar.f49577v0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f49579w0 = obj;
                    obj.f50943f = 0.0f;
                    ofFloat.addUpdateListener(new j11(this, 12));
                    ofFloat.addListener(new p91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = t91Var.f41543b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            c51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z4) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        wf.g gVar = this.f40868b;
        long selectedDate = gVar.getSelectedDate();
        xf.b bVar = this.f40873r.f41545e;
        wf.g gVar2 = this.f40869c;
        if (!z4 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f40873r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f40873r.d.d.size();
                arrayList = this.f40872n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((xf.a) bVar.d.get(i12)).f50542c.equals(((xf.a) this.f40873r.d.d.get(i10)).f50542c)) {
                            boolean z11 = ((q91) arrayList.get(i10)).f40414a.f31215b;
                            ((yf.f) arrayList2.get(i12)).f50933n = z11;
                            yf.f fVar = (yf.f) arrayList2.get(i12);
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f50934o = f10;
                            ((q91) arrayList.get(i10)).f40414a.f31216c = true;
                            ((q91) arrayList.get(i10)).f40414a.animate().alpha(1.0f).start();
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
                    ((q91) arrayList.get(i10)).f40414a.f31216c = false;
                    ((q91) arrayList.get(i10)).f40414a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f40873r.d.d.size(); i13++) {
                    ((q91) arrayList.get(i13)).f40414a.f31216c = true;
                    ((q91) arrayList.get(i13)).f40414a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f40873r.f41544c = selectedDate;
        gVar.f49570q0.setAlpha(0.0f);
        gVar.f49574s0 = 0.0f;
        gVar.f49572r0 = false;
        gVar.f49558f1 = false;
        gVar2.G();
        yf.c cVar = this.d;
        if (!z4) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z4) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f49577v0 = 0;
            gVar2.f49577v0 = 0;
            gVar.G = false;
            gVar2.G = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new p91(this, 0));
        a2.start();
    }

    public final void h(boolean z4) {
        xf.b bVar;
        t91 t91Var = this.f40873r;
        if (t91Var != null && (bVar = t91Var.d) != null && bVar.f50547a != null) {
            yf.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f50898a;
            wf.g gVar = this.f40868b;
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
            gVar.f49570q0.f50915f.setAlpha(1.0f);
            wf.g gVar2 = this.f40869c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f40873r.f41544c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f40872n;
            if (!z4) {
                gVar2.setVisibility(4);
                gVar.G = true;
                gVar2.G = false;
                gVar.invalidate();
                Window window = this.f40867a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    q91 q91Var = (q91) obj;
                    q91Var.f40414a.setAlpha(1.0f);
                    q91Var.f40414a.f31216c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new p91(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                q91 q91Var2 = (q91) obj2;
                q91Var2.f40414a.animate().alpha(1.0f).start();
                q91Var2.f40414a.f31216c = true;
            }
            a2.start();
        }
    }
}
