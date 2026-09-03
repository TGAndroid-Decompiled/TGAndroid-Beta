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
public abstract class x91 extends FrameLayout {
    public final Window f42965a;
    public final wf.g f42966b;
    public final wf.g f42967c;
    public final yf.c d;
    public final RadialProgressView f42968e;
    public final TextView f42969f;
    public final h51 h;
    public final ArrayList f42970n;
    public z91 f42971r;
    public final int f42972s;

    public x91(Context context, int i10, wf.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f42970n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f42965a = ((Activity) context).getWindow();
        } else {
            this.f42965a = null;
        }
        this.f42972s = i10;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        this.h = new h51(context, 2);
        yf.c cVar = new yf.c(getContext(), g6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final x91 f41482b;

            {
                this.f41482b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41482b.h(true);
                        return;
                    case 1:
                        this.f41482b.c();
                        return;
                    default:
                        this.f41482b.f42967c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f42966b = new wf.g(getContext(), null);
                            wf.g gVar = new wf.g(getContext(), null);
                            this.f42967c = gVar;
                            gVar.f49606q0.f50957y = true;
                        } else {
                            this.f42966b = new wf.g(getContext(), null);
                            wf.g gVar2 = new wf.g(getContext(), null);
                            this.f42967c = gVar2;
                            gVar2.f49606q0.f50957y = true;
                        }
                    } else {
                        wf.q qVar = new wf.q(getContext());
                        this.f42966b = qVar;
                        qVar.f49606q0.B = true;
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
                        qVar2.f49591e1 = true;
                        this.f42967c = qVar2;
                    }
                } else {
                    wf.g gVar3 = new wf.g(getContext(), null);
                    gVar3.f49611t0 = true;
                    gVar3.f49612u0 = true;
                    this.f42966b = gVar3;
                    wf.g gVar4 = new wf.g(getContext(), null);
                    this.f42967c = gVar4;
                    gVar4.f49606q0.f50957y = true;
                }
            } else {
                this.f42966b = new wf.p(getContext(), g6Var);
                wf.p pVar = new wf.p(getContext(), g6Var);
                this.f42967c = pVar;
                pVar.f49606q0.f50957y = true;
            }
        } else {
            this.f42966b = new wf.g(getContext(), g6Var);
            wf.g gVar5 = new wf.g(getContext(), g6Var);
            this.f42967c = gVar5;
            gVar5.f49606q0.f50957y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42966b.f49578a = fVar;
        this.f42967c.f49578a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f42968e = radialProgressView;
        frameLayout.addView(this.f42966b);
        frameLayout.addView(this.f42966b.f49606q0, -2, -2);
        frameLayout.addView(this.f42967c);
        frameLayout.addView(this.f42967c.f49606q0, -2, -2);
        frameLayout.addView(radialProgressView, k7.c6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f42969f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s5, g6Var));
        this.f42966b.setDateSelectionListener(new kl0(this, 19));
        this.f42966b.f49606q0.d(false, false);
        this.f42966b.f49606q0.setOnTouchListener(new Object());
        this.f42966b.f49606q0.setOnClickListener(new View.OnClickListener(this) {
            public final x91 f41482b;

            {
                this.f41482b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41482b.h(true);
                        return;
                    case 1:
                        this.f41482b.c();
                        return;
                    default:
                        this.f41482b.f42967c.c(false);
                        return;
                }
            }
        });
        this.f42967c.f49606q0.setOnClickListener(new View.OnClickListener(this) {
            public final x91 f41482b;

            {
                this.f41482b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41482b.h(true);
                        return;
                    case 1:
                        this.f41482b.c();
                        return;
                    default:
                        this.f41482b.f42967c.c(false);
                        return;
                }
            }
        });
        this.f42966b.setVisibility(0);
        this.f42967c.setVisibility(4);
        this.f42966b.setHeader(this.d);
        f10.addView(this.d, k7.c6.c(52.0f, -1));
        f10.addView(frameLayout, k7.c6.c(-2.0f, -1));
        f10.addView(this.h, k7.c6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f42972s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z4) {
        float f10;
        Window window = this.f42965a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        wf.g gVar = this.f42966b;
        gVar.G = false;
        wf.g gVar2 = this.f42967c;
        gVar2.G = false;
        gVar.f49613v0 = 2;
        gVar2.f49613v0 = 1;
        final ?? obj = new Object();
        wf.j jVar = gVar.f49587d0;
        obj.f50976b = jVar.f49636l;
        obj.f50975a = jVar.f49635k;
        int binarySearch = Arrays.binarySearch(this.f42971r.d.f50583a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f42971r.d.f50583a.length - 1;
        }
        obj.f50977c = this.f42971r.d.f50584b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f49615w0 = obj;
        gVar.f49615w0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f42971r.d.d.size(); i10++) {
            if (((xf.a) this.f42971r.d.d.get(i10)).f50576a[binarySearch] > j11) {
                j11 = ((xf.a) this.f42971r.d.d.get(i10)).f50576a[binarySearch];
            }
            if (((xf.a) this.f42971r.d.d.get(i10)).f50576a[binarySearch] < j12) {
                j12 = ((xf.a) this.f42971r.d.d.get(i10)).f50576a[binarySearch];
            }
        }
        float f11 = ((float) j12) + ((float) (j11 - j12));
        float f12 = gVar.f49614w;
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
                x91 x91Var = x91.this;
                wf.g gVar3 = x91Var.f42966b;
                float f15 = gVar3.C0;
                wf.j jVar2 = gVar3.f49587d0;
                float f16 = jVar2.f49636l;
                float f17 = jVar2.f49635k;
                float f18 = ((f15 / (f16 - f17)) * f17) - wf.g.f49560h1;
                RectF rectF = gVar3.E0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                yf.j jVar3 = obj;
                jVar3.f50978e = height;
                jVar3.d = (gVar3.D0 * jVar3.f50977c) - f18;
                jVar3.f50979f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf.g gVar4 = x91Var.f42967c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(z91 z91Var);

    public abstract void c();

    public final void d() {
        xf.b bVar;
        ArrayList arrayList;
        int i10;
        wf.g gVar = this.f42966b;
        gVar.G();
        gVar.invalidate();
        wf.g gVar2 = this.f42967c;
        gVar2.G();
        gVar2.invalidate();
        yf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        z91 z91Var = this.f42971r;
        if (z91Var != null && (bVar = z91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f42971r.d.d.size(); i11++) {
                if (((xf.a) this.f42971r.d.d.get(i11)).f50581g >= 0 && org.telegram.ui.ActionBar.k6.c1(((xf.a) this.f42971r.d.d.get(i11)).f50581g)) {
                    i10 = org.telegram.ui.ActionBar.k6.w0(null, ((xf.a) this.f42971r.d.d.get(i11)).f50581g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false)) < 0.5d) {
                    i10 = ((xf.a) this.f42971r.d.d.get(i11)).f50582i;
                } else {
                    i10 = ((xf.a) this.f42971r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f42970n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.t00 t00Var = ((w91) arrayList2.get(i11)).f42389a;
                    t00Var.getClass();
                    t00Var.f31232r = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false);
                    t00Var.v = -1;
                    t00Var.f31233s = i10;
                    t00Var.invalidate();
                }
            }
        }
        this.f42968e.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21734h6, false));
        this.f42969f.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21930s5, false));
    }

    public final void e(z91 z91Var, boolean z4) {
        boolean z10;
        boolean z11;
        if (z91Var != null) {
            String str = z91Var.f43866j;
            yf.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            wf.g gVar = this.f42966b;
            gVar.setLandscape(z10);
            ArrayList arrayList = gVar.d;
            wf.j jVar = gVar.f49587d0;
            wf.g gVar2 = this.f42967c;
            gVar2.setLandscape(z10);
            this.f42971r = z91Var;
            boolean z12 = z91Var.f43868l;
            ArrayList arrayList2 = this.f42970n;
            h51 h51Var = this.h;
            RadialProgressView radialProgressView = this.f42968e;
            TextView textView = this.f42969f;
            if (!z12 && !z91Var.f43859a) {
                textView.setVisibility(8);
                yf.e eVar = gVar.f49606q0;
                boolean z13 = z91Var.f43870n;
                eVar.f50947a = z13;
                cVar.c(!z13);
                if (z91Var.d == null && z91Var.f43863f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(z91Var);
                    gVar.D(null);
                    return;
                }
                if (!z4) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(z91Var.d) && z91Var.h) {
                    jVar.f49635k = 0.0f;
                    jVar.f49636l = 1.0f;
                    jVar.f49627a.A(true, false, false);
                }
                cVar.setUseWeekInterval(z91Var.f43871o);
                gVar.f49606q0.setUseWeek(z91Var.f43871o);
                yf.e eVar2 = gVar.f49606q0;
                if (this.f42971r.f43864g == null && this.f42972s != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                eVar2.C = z11;
                gVar2.f49606q0.C = false;
                eVar2.setEnabled(eVar2.C);
                yf.e eVar3 = gVar2.f49606q0;
                eVar3.setEnabled(eVar3.C);
                int size = arrayList.size();
                h51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        yf.f fVar = (yf.f) arrayList.get(i10);
                        w91 w91Var = new w91(this, i10);
                        w91Var.f42390b = fVar;
                        String str2 = fVar.f50958a.d;
                        org.telegram.ui.Components.t00 t00Var = w91Var.f42389a;
                        t00Var.setText(str2);
                        t00Var.a(fVar.f50969n, false);
                        t00Var.setOnTouchListener(new Object());
                        t00Var.setOnClickListener(new hb0(22, w91Var, fVar));
                        t00Var.setOnLongClickListener(new oh.g2(6, w91Var, fVar));
                    }
                }
                long j10 = this.f42971r.f43861c;
                if (j10 > 0) {
                    gVar.f49605p0 = Arrays.binarySearch(gVar.f49590e0.f50583a, j10);
                    gVar.f49608r0 = true;
                    gVar.f49606q0.setVisibility(0);
                    gVar.f49610s0 = 1.0f;
                    gVar.x((gVar.D0 * jVar.f49635k) - wf.g.f49560h1);
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
                    gVar.f49613v0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f49615w0 = obj;
                    obj.f50979f = 0.0f;
                    ofFloat.addUpdateListener(new n11(this, 12));
                    ofFloat.addListener(new v91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = z91Var.f43860b;
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
        wf.g gVar = this.f42966b;
        long selectedDate = gVar.getSelectedDate();
        xf.b bVar = this.f42971r.f43862e;
        wf.g gVar2 = this.f42967c;
        if (!z4 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f42971r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f42971r.d.d.size();
                arrayList = this.f42970n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((xf.a) bVar.d.get(i12)).f50578c.equals(((xf.a) this.f42971r.d.d.get(i10)).f50578c)) {
                            boolean z11 = ((w91) arrayList.get(i10)).f42389a.f31227b;
                            ((yf.f) arrayList2.get(i12)).f50969n = z11;
                            yf.f fVar = (yf.f) arrayList2.get(i12);
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f50970o = f10;
                            ((w91) arrayList.get(i10)).f42389a.f31228c = true;
                            ((w91) arrayList.get(i10)).f42389a.animate().alpha(1.0f).start();
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
                    ((w91) arrayList.get(i10)).f42389a.f31228c = false;
                    ((w91) arrayList.get(i10)).f42389a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f42971r.d.d.size(); i13++) {
                    ((w91) arrayList.get(i13)).f42389a.f31228c = true;
                    ((w91) arrayList.get(i13)).f42389a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f42971r.f43861c = selectedDate;
        gVar.f49606q0.setAlpha(0.0f);
        gVar.f49610s0 = 0.0f;
        gVar.f49608r0 = false;
        gVar.f49594f1 = false;
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
            gVar.f49613v0 = 0;
            gVar2.f49613v0 = 0;
            gVar.G = false;
            gVar2.G = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new v91(this, 0));
        a2.start();
    }

    public final void h(boolean z4) {
        xf.b bVar;
        z91 z91Var = this.f42971r;
        if (z91Var != null && (bVar = z91Var.d) != null && bVar.f50583a != null) {
            yf.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f50934a;
            wf.g gVar = this.f42966b;
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
            gVar.f49606q0.f50951f.setAlpha(1.0f);
            wf.g gVar2 = this.f42967c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f42971r.f43861c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f42970n;
            if (!z4) {
                gVar2.setVisibility(4);
                gVar.G = true;
                gVar2.G = false;
                gVar.invalidate();
                Window window = this.f42965a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    w91 w91Var = (w91) obj;
                    w91Var.f42389a.setAlpha(1.0f);
                    w91Var.f42389a.f31228c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new v91(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                w91 w91Var2 = (w91) obj2;
                w91Var2.f42389a.animate().alpha(1.0f).start();
                w91Var2.f42389a.f31228c = true;
            }
            a2.start();
        }
    }
}
