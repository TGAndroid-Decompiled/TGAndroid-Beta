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
public abstract class ra1 extends FrameLayout {
    public final Window f39437a;
    public final jg.g f39438b;
    public final jg.g f39439c;
    public final lg.c d;
    public final RadialProgressView e;
    public final TextView f39440f;
    public final d61 h;
    public final ArrayList f39441n;
    public ta1 f39442r;
    public final int f39443s;

    public ra1(Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39441n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f39437a = ((Activity) context).getWindow();
        } else {
            this.f39437a = null;
        }
        this.f39443s = i10;
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        this.h = new d61(context, 2);
        lg.c cVar = new lg.c(getContext(), c6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final ra1 f38349b;

            {
                this.f38349b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38349b.h(true);
                        return;
                    case 1:
                        this.f38349b.c();
                        return;
                    default:
                        this.f38349b.f39439c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f39438b = new jg.g(getContext(), null);
                            jg.g gVar = new jg.g(getContext(), null);
                            this.f39439c = gVar;
                            gVar.f13068t0.f14709y = true;
                        } else {
                            this.f39438b = new jg.g(getContext(), null);
                            jg.g gVar2 = new jg.g(getContext(), null);
                            this.f39439c = gVar2;
                            gVar2.f13068t0.f14709y = true;
                        }
                    } else {
                        jg.q qVar = new jg.q(getContext());
                        this.f39438b = qVar;
                        qVar.f13068t0.E = true;
                        ?? qVar2 = new jg.q(getContext());
                        qVar2.M1 = -1;
                        qVar2.N1 = new RectF();
                        qVar2.P1 = AndroidUtilities.dp(9.0f);
                        qVar2.Q1 = AndroidUtilities.dp(13.0f);
                        qVar2.R1 = new String[101];
                        qVar2.T1 = 1.0f;
                        qVar2.U1 = 0;
                        qVar2.V1 = -1;
                        qVar2.W1 = -1;
                        for (int i11 = 1; i11 <= 100; i11++) {
                            qVar2.R1[i11] = a1.g.m(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f13052h1 = true;
                        this.f39439c = qVar2;
                    }
                } else {
                    jg.g gVar3 = new jg.g(getContext(), null);
                    gVar3.f13072w0 = true;
                    gVar3.f13074x0 = true;
                    this.f39438b = gVar3;
                    jg.g gVar4 = new jg.g(getContext(), null);
                    this.f39439c = gVar4;
                    gVar4.f13068t0.f14709y = true;
                }
            } else {
                this.f39438b = new jg.p(getContext(), c6Var);
                jg.p pVar = new jg.p(getContext(), c6Var);
                this.f39439c = pVar;
                pVar.f13068t0.f14709y = true;
            }
        } else {
            this.f39438b = new jg.g(getContext(), c6Var);
            jg.g gVar5 = new jg.g(getContext(), c6Var);
            this.f39439c = gVar5;
            gVar5.f13068t0.f14709y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39438b.f13033a = fVar;
        this.f39439c.f13033a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f39438b);
        frameLayout.addView(this.f39438b.f13068t0, -2, -2);
        frameLayout.addView(this.f39439c);
        frameLayout.addView(this.f39439c.f13068t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.z5.a(44.0f, 0.0f, 0.0f, 0.0f, 60.0f, 44, 17));
        TextView textView = new TextView(context);
        this.f39440f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, -2, 17));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19877s5, c6Var));
        this.f39438b.setDateSelectionListener(new lq0(this, 18));
        this.f39438b.f13068t0.d(false, false);
        this.f39438b.f13068t0.setOnTouchListener(new Object());
        this.f39438b.f13068t0.setOnClickListener(new View.OnClickListener(this) {
            public final ra1 f38349b;

            {
                this.f38349b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38349b.h(true);
                        return;
                    case 1:
                        this.f38349b.c();
                        return;
                    default:
                        this.f38349b.f39439c.c(false);
                        return;
                }
            }
        });
        this.f39439c.f13068t0.setOnClickListener(new View.OnClickListener(this) {
            public final ra1 f38349b;

            {
                this.f38349b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38349b.h(true);
                        return;
                    case 1:
                        this.f38349b.c();
                        return;
                    default:
                        this.f38349b.f39439c.c(false);
                        return;
                }
            }
        });
        this.f39438b.setVisibility(0);
        this.f39439c.setVisibility(4);
        this.f39438b.setHeader(this.d);
        e.addView(this.d, w7.z5.d(52.0f, -1));
        e.addView(frameLayout, w7.z5.d(-2.0f, -1));
        e.addView(this.h, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 7));
        if (this.f39443s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e.setClipChildren(false);
            e.setClipToPadding(false);
        }
        addView(e);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f7;
        Window window = this.f39437a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        jg.g gVar = this.f39438b;
        gVar.J = false;
        jg.g gVar2 = this.f39439c;
        gVar2.J = false;
        gVar.f13076y0 = 2;
        gVar2.f13076y0 = 1;
        final ?? obj = new Object();
        jg.j jVar = gVar.f13049g0;
        obj.f14727b = jVar.f13091l;
        obj.f14726a = jVar.f13090k;
        int binarySearch = Arrays.binarySearch(this.f39442r.d.f14251a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f39442r.d.f14251a.length - 1;
        }
        obj.f14728c = this.f39442r.d.f14252b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f13077z0 = obj;
        gVar.f13077z0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f39442r.d.d.size(); i10++) {
            if (((kg.a) this.f39442r.d.d.get(i10)).f14245a[binarySearch] > j11) {
                j11 = ((kg.a) this.f39442r.d.d.get(i10)).f14245a[binarySearch];
            }
            if (((kg.a) this.f39442r.d.d.get(i10)).f14245a[binarySearch] < j12) {
                j12 = ((kg.a) this.f39442r.d.d.get(i10)).f14245a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = gVar.f13071w;
        final float f12 = (f10 - f11) / (gVar.v - f11);
        gVar.q(obj);
        gVar2.q(obj);
        float f13 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f13 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f13);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ra1 ra1Var = ra1.this;
                jg.g gVar3 = ra1Var.f39438b;
                float f14 = gVar3.F0;
                jg.j jVar2 = gVar3.f13049g0;
                float f15 = jVar2.f13091l;
                float f16 = jVar2.f13090k;
                float f17 = ((f14 / (f15 - f16)) * f16) - jg.g.f13018k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                lg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f14728c) - f17;
                jVar3.f14729f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg.g gVar4 = ra1Var.f39439c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(ta1 ta1Var);

    public abstract void c();

    public final void d() {
        kg.b bVar;
        ArrayList arrayList;
        int i10;
        jg.g gVar = this.f39438b;
        gVar.G();
        gVar.invalidate();
        jg.g gVar2 = this.f39439c;
        gVar2.G();
        gVar2.invalidate();
        lg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        ta1 ta1Var = this.f39442r;
        if (ta1Var != null && (bVar = ta1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f39442r.d.d.size(); i11++) {
                if (((kg.a) this.f39442r.d.d.get(i11)).f14249g >= 0 && org.telegram.ui.ActionBar.g6.d1(((kg.a) this.f39442r.d.d.get(i11)).f14249g)) {
                    i10 = org.telegram.ui.ActionBar.g6.x0(null, ((kg.a) this.f39442r.d.d.get(i11)).f14249g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false)) < 0.5d) {
                    i10 = ((kg.a) this.f39442r.d.d.get(i11)).f14250i;
                } else {
                    i10 = ((kg.a) this.f39442r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f39441n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.e10 e10Var = ((qa1) arrayList2.get(i11)).f39086a;
                    e10Var.getClass();
                    e10Var.f24251r = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false);
                    e10Var.v = -1;
                    e10Var.f24252s = i10;
                    e10Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19673h6, false));
        this.f39440f.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19877s5, false));
    }

    public final void e(ta1 ta1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (ta1Var != null) {
            String str = ta1Var.f40055j;
            lg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            jg.g gVar = this.f39438b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            jg.j jVar = gVar.f13049g0;
            jg.g gVar2 = this.f39439c;
            gVar2.setLandscape(z11);
            this.f39442r = ta1Var;
            boolean z13 = ta1Var.f40057l;
            ArrayList arrayList2 = this.f39441n;
            d61 d61Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f39440f;
            if (!z13 && !ta1Var.f40049a) {
                textView.setVisibility(8);
                lg.e eVar = gVar.f13068t0;
                boolean z14 = ta1Var.f40059n;
                eVar.f14700a = z14;
                cVar.c(!z14);
                if (ta1Var.d == null && ta1Var.f40052f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(ta1Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(ta1Var.d) && ta1Var.h) {
                    jVar.f13090k = 0.0f;
                    jVar.f13091l = 1.0f;
                    jVar.f13083a.A(true, false, false);
                }
                cVar.setUseWeekInterval(ta1Var.f40060o);
                gVar.f13068t0.setUseWeek(ta1Var.f40060o);
                lg.e eVar2 = gVar.f13068t0;
                if (this.f39442r.f40053g == null && this.f39443s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f13068t0.F = false;
                eVar2.setEnabled(eVar2.F);
                lg.e eVar3 = gVar2.f13068t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                d61Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        lg.f fVar = (lg.f) arrayList.get(i10);
                        qa1 qa1Var = new qa1(this, i10);
                        qa1Var.f39087b = fVar;
                        String str2 = fVar.f14710a.d;
                        org.telegram.ui.Components.e10 e10Var = qa1Var.f39086a;
                        e10Var.setText(str2);
                        e10Var.a(fVar.f14720n, false);
                        e10Var.setOnTouchListener(new Object());
                        e10Var.setOnClickListener(new bz0(7, qa1Var, fVar));
                        e10Var.setOnLongClickListener(new bi.g3(6, qa1Var, fVar));
                    }
                }
                long j10 = this.f39442r.f40051c;
                if (j10 > 0) {
                    gVar.f13067s0 = Arrays.binarySearch(gVar.f13051h0.f14251a, j10);
                    gVar.f13069u0 = true;
                    gVar.f13068t0.setVisibility(0);
                    gVar.f13070v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f13090k) - jg.g.f13018k1);
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
                if (z10) {
                    gVar.f13076y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f13077z0 = obj;
                    obj.f14729f = 0.0f;
                    ofFloat.addUpdateListener(new f21(this, 12));
                    ofFloat.addListener(new pa1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = ta1Var.f40050b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            d61Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        jg.g gVar = this.f39438b;
        long selectedDate = gVar.getSelectedDate();
        kg.b bVar = this.f39442r.e;
        jg.g gVar2 = this.f39439c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f39442r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f39442r.d.d.size();
                arrayList = this.f39441n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((kg.a) bVar.d.get(i12)).f14247c.equals(((kg.a) this.f39442r.d.d.get(i10)).f14247c)) {
                            boolean z12 = ((qa1) arrayList.get(i10)).f39086a.f24247b;
                            ((lg.f) arrayList2.get(i12)).f14720n = z12;
                            lg.f fVar = (lg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f14721o = f7;
                            ((qa1) arrayList.get(i10)).f39086a.f24248c = true;
                            ((qa1) arrayList.get(i10)).f39086a.animate().alpha(1.0f).start();
                            if (z12) {
                                i11++;
                            }
                            z11 = true;
                        } else {
                            i12++;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    ((qa1) arrayList.get(i10)).f39086a.f24248c = false;
                    ((qa1) arrayList.get(i10)).f39086a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f39442r.d.d.size(); i13++) {
                    ((qa1) arrayList.get(i13)).f39086a.f24248c = true;
                    ((qa1) arrayList.get(i13)).f39086a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f39442r.f40051c = selectedDate;
        gVar.f13068t0.setAlpha(0.0f);
        gVar.f13070v0 = 0.0f;
        gVar.f13069u0 = false;
        gVar.f13054i1 = false;
        gVar2.G();
        lg.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f13076y0 = 0;
            gVar2.f13076y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new pa1(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        kg.b bVar;
        ta1 ta1Var = this.f39442r;
        if (ta1Var != null && (bVar = ta1Var.d) != null && bVar.f14251a != null) {
            lg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f14689a;
            jg.g gVar = this.f39438b;
            cVar.b(gVar.getStartDate(), gVar.getEndDate());
            if (z10) {
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
            gVar.f13068t0.f14703f.setAlpha(1.0f);
            jg.g gVar2 = this.f39439c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f39442r.f40051c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f39441n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f39437a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    qa1 qa1Var = (qa1) obj;
                    qa1Var.f39086a.setAlpha(1.0f);
                    qa1Var.f39086a.f24248c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new pa1(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                qa1 qa1Var2 = (qa1) obj2;
                qa1Var2.f39086a.animate().alpha(1.0f).start();
                qa1Var2.f39086a.f24248c = true;
            }
            a2.start();
        }
    }
}
