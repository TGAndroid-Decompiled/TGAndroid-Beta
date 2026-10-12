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
    public final Window f39718a;
    public final jg.g f39719b;
    public final jg.g f39720c;
    public final lg.c d;
    public final RadialProgressView e;
    public final TextView f39721f;
    public final d61 h;
    public final ArrayList f39722n;
    public ta1 f39723r;
    public final int f39724s;

    public ra1(Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39722n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f39718a = ((Activity) context).getWindow();
        } else {
            this.f39718a = null;
        }
        this.f39724s = i10;
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
        this.h = new d61(context, 2);
        lg.c cVar = new lg.c(getContext(), c6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final ra1 f38633b;

            {
                this.f38633b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38633b.h(true);
                        return;
                    case 1:
                        this.f38633b.c();
                        return;
                    default:
                        this.f38633b.f39720c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f39719b = new jg.g(getContext(), null);
                            jg.g gVar = new jg.g(getContext(), null);
                            this.f39720c = gVar;
                            gVar.f13064t0.f14709y = true;
                        } else {
                            this.f39719b = new jg.g(getContext(), null);
                            jg.g gVar2 = new jg.g(getContext(), null);
                            this.f39720c = gVar2;
                            gVar2.f13064t0.f14709y = true;
                        }
                    } else {
                        jg.q qVar = new jg.q(getContext());
                        this.f39719b = qVar;
                        qVar.f13064t0.E = true;
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
                        qVar2.f13048h1 = true;
                        this.f39720c = qVar2;
                    }
                } else {
                    jg.g gVar3 = new jg.g(getContext(), null);
                    gVar3.f13068w0 = true;
                    gVar3.f13070x0 = true;
                    this.f39719b = gVar3;
                    jg.g gVar4 = new jg.g(getContext(), null);
                    this.f39720c = gVar4;
                    gVar4.f13064t0.f14709y = true;
                }
            } else {
                this.f39719b = new jg.p(getContext(), c6Var);
                jg.p pVar = new jg.p(getContext(), c6Var);
                this.f39720c = pVar;
                pVar.f13064t0.f14709y = true;
            }
        } else {
            this.f39719b = new jg.g(getContext(), c6Var);
            jg.g gVar5 = new jg.g(getContext(), c6Var);
            this.f39720c = gVar5;
            gVar5.f13064t0.f14709y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39719b.f13029a = fVar;
        this.f39720c.f13029a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f39719b);
        frameLayout.addView(this.f39719b.f13064t0, -2, -2);
        frameLayout.addView(this.f39720c);
        frameLayout.addView(this.f39720c.f13064t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.a6.a(44.0f, 0.0f, 0.0f, 0.0f, 60.0f, 44, 17));
        TextView textView = new TextView(context);
        this.f39721f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, -2, 17));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20177s5, c6Var));
        this.f39719b.setDateSelectionListener(new nq0(this, 18));
        this.f39719b.f13064t0.d(false, false);
        this.f39719b.f13064t0.setOnTouchListener(new Object());
        this.f39719b.f13064t0.setOnClickListener(new View.OnClickListener(this) {
            public final ra1 f38633b;

            {
                this.f38633b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38633b.h(true);
                        return;
                    case 1:
                        this.f38633b.c();
                        return;
                    default:
                        this.f38633b.f39720c.c(false);
                        return;
                }
            }
        });
        this.f39720c.f13064t0.setOnClickListener(new View.OnClickListener(this) {
            public final ra1 f38633b;

            {
                this.f38633b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38633b.h(true);
                        return;
                    case 1:
                        this.f38633b.c();
                        return;
                    default:
                        this.f38633b.f39720c.c(false);
                        return;
                }
            }
        });
        this.f39719b.setVisibility(0);
        this.f39720c.setVisibility(4);
        this.f39719b.setHeader(this.d);
        e.addView(this.d, w7.a6.d(52.0f, -1));
        e.addView(frameLayout, w7.a6.d(-2.0f, -1));
        e.addView(this.h, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 7));
        if (this.f39724s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e.setClipChildren(false);
            e.setClipToPadding(false);
        }
        addView(e);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f7;
        Window window = this.f39718a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        jg.g gVar = this.f39719b;
        gVar.J = false;
        jg.g gVar2 = this.f39720c;
        gVar2.J = false;
        gVar.f13072y0 = 2;
        gVar2.f13072y0 = 1;
        final ?? obj = new Object();
        jg.j jVar = gVar.f13045g0;
        obj.f14727b = jVar.f13087l;
        obj.f14726a = jVar.f13086k;
        int binarySearch = Arrays.binarySearch(this.f39723r.d.f14249a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f39723r.d.f14249a.length - 1;
        }
        obj.f14728c = this.f39723r.d.f14250b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f13073z0 = obj;
        gVar.f13073z0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f39723r.d.d.size(); i10++) {
            if (((kg.a) this.f39723r.d.d.get(i10)).f14243a[binarySearch] > j11) {
                j11 = ((kg.a) this.f39723r.d.d.get(i10)).f14243a[binarySearch];
            }
            if (((kg.a) this.f39723r.d.d.get(i10)).f14243a[binarySearch] < j12) {
                j12 = ((kg.a) this.f39723r.d.d.get(i10)).f14243a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = gVar.f13067w;
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
                jg.g gVar3 = ra1Var.f39719b;
                float f14 = gVar3.F0;
                jg.j jVar2 = gVar3.f13045g0;
                float f15 = jVar2.f13087l;
                float f16 = jVar2.f13086k;
                float f17 = ((f14 / (f15 - f16)) * f16) - jg.g.f13014k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                lg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f14728c) - f17;
                jVar3.f14729f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg.g gVar4 = ra1Var.f39720c;
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
        jg.g gVar = this.f39719b;
        gVar.G();
        gVar.invalidate();
        jg.g gVar2 = this.f39720c;
        gVar2.G();
        gVar2.invalidate();
        lg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        ta1 ta1Var = this.f39723r;
        if (ta1Var != null && (bVar = ta1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f39723r.d.d.size(); i11++) {
                if (((kg.a) this.f39723r.d.d.get(i11)).f14247g >= 0 && org.telegram.ui.ActionBar.g6.d1(((kg.a) this.f39723r.d.d.get(i11)).f14247g)) {
                    i10 = org.telegram.ui.ActionBar.g6.x0(null, ((kg.a) this.f39723r.d.d.get(i11)).f14247g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false)) < 0.5d) {
                    i10 = ((kg.a) this.f39723r.d.d.get(i11)).f14248i;
                } else {
                    i10 = ((kg.a) this.f39723r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f39722n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.e10 e10Var = ((qa1) arrayList2.get(i11)).f39367a;
                    e10Var.getClass();
                    e10Var.f24556r = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false);
                    e10Var.v = -1;
                    e10Var.f24557s = i10;
                    e10Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19973h6, false));
        this.f39721f.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20177s5, false));
    }

    public final void e(ta1 ta1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (ta1Var != null) {
            String str = ta1Var.f40340j;
            lg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            jg.g gVar = this.f39719b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            jg.j jVar = gVar.f13045g0;
            jg.g gVar2 = this.f39720c;
            gVar2.setLandscape(z11);
            this.f39723r = ta1Var;
            boolean z13 = ta1Var.f40342l;
            ArrayList arrayList2 = this.f39722n;
            d61 d61Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f39721f;
            if (!z13 && !ta1Var.f40334a) {
                textView.setVisibility(8);
                lg.e eVar = gVar.f13064t0;
                boolean z14 = ta1Var.f40344n;
                eVar.f14700a = z14;
                cVar.c(!z14);
                if (ta1Var.d == null && ta1Var.f40337f != null) {
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
                    jVar.f13086k = 0.0f;
                    jVar.f13087l = 1.0f;
                    jVar.f13079a.A(true, false, false);
                }
                cVar.setUseWeekInterval(ta1Var.f40345o);
                gVar.f13064t0.setUseWeek(ta1Var.f40345o);
                lg.e eVar2 = gVar.f13064t0;
                if (this.f39723r.f40338g == null && this.f39724s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f13064t0.F = false;
                eVar2.setEnabled(eVar2.F);
                lg.e eVar3 = gVar2.f13064t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                d61Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        lg.f fVar = (lg.f) arrayList.get(i10);
                        qa1 qa1Var = new qa1(this, i10);
                        qa1Var.f39368b = fVar;
                        String str2 = fVar.f14710a.d;
                        org.telegram.ui.Components.e10 e10Var = qa1Var.f39367a;
                        e10Var.setText(str2);
                        e10Var.a(fVar.f14720n, false);
                        e10Var.setOnTouchListener(new Object());
                        e10Var.setOnClickListener(new bz0(7, qa1Var, fVar));
                        e10Var.setOnLongClickListener(new bi.g3(6, qa1Var, fVar));
                    }
                }
                long j10 = this.f39723r.f40336c;
                if (j10 > 0) {
                    gVar.f13063s0 = Arrays.binarySearch(gVar.f13047h0.f14249a, j10);
                    gVar.f13065u0 = true;
                    gVar.f13064t0.setVisibility(0);
                    gVar.f13066v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f13086k) - jg.g.f13014k1);
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
                    gVar.f13072y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f13073z0 = obj;
                    obj.f14729f = 0.0f;
                    ofFloat.addUpdateListener(new f21(this, 12));
                    ofFloat.addListener(new pa1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = ta1Var.f40335b;
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
        jg.g gVar = this.f39719b;
        long selectedDate = gVar.getSelectedDate();
        kg.b bVar = this.f39723r.e;
        jg.g gVar2 = this.f39720c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f39723r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f39723r.d.d.size();
                arrayList = this.f39722n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((kg.a) bVar.d.get(i12)).f14245c.equals(((kg.a) this.f39723r.d.d.get(i10)).f14245c)) {
                            boolean z12 = ((qa1) arrayList.get(i10)).f39367a.f24552b;
                            ((lg.f) arrayList2.get(i12)).f14720n = z12;
                            lg.f fVar = (lg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f14721o = f7;
                            ((qa1) arrayList.get(i10)).f39367a.f24553c = true;
                            ((qa1) arrayList.get(i10)).f39367a.animate().alpha(1.0f).start();
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
                    ((qa1) arrayList.get(i10)).f39367a.f24553c = false;
                    ((qa1) arrayList.get(i10)).f39367a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f39723r.d.d.size(); i13++) {
                    ((qa1) arrayList.get(i13)).f39367a.f24553c = true;
                    ((qa1) arrayList.get(i13)).f39367a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f39723r.f40336c = selectedDate;
        gVar.f13064t0.setAlpha(0.0f);
        gVar.f13066v0 = 0.0f;
        gVar.f13065u0 = false;
        gVar.f13050i1 = false;
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
            gVar.f13072y0 = 0;
            gVar2.f13072y0 = 0;
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
        ta1 ta1Var = this.f39723r;
        if (ta1Var != null && (bVar = ta1Var.d) != null && bVar.f14249a != null) {
            lg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f14689a;
            jg.g gVar = this.f39719b;
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
            gVar.f13064t0.f14703f.setAlpha(1.0f);
            jg.g gVar2 = this.f39720c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f39723r.f40336c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f39722n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f39718a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    qa1 qa1Var = (qa1) obj;
                    qa1Var.f39367a.setAlpha(1.0f);
                    qa1Var.f39367a.f24553c = true;
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
                qa1Var2.f39367a.animate().alpha(1.0f).start();
                qa1Var2.f39367a.f24553c = true;
            }
            a2.start();
        }
    }
}
