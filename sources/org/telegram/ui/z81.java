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
public abstract class z81 extends FrameLayout {
    public final Window f43664a;
    public final jg.g f43665b;
    public final jg.g f43666c;
    public final lg.c d;
    public final RadialProgressView e;
    public final TextView f43667f;
    public final j41 h;
    public final ArrayList f43668n;
    public b91 f43669r;
    public final int f43670s;

    public z81(Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f43668n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f43664a = ((Activity) context).getWindow();
        } else {
            this.f43664a = null;
        }
        this.f43670s = i10;
        LinearLayout e = org.telegram.messenger.kk.e(context, 1);
        this.h = new j41(context, 2);
        lg.c cVar = new lg.c(getContext(), d6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final z81 f42142b;

            {
                this.f42142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42142b.h(true);
                        return;
                    case 1:
                        this.f42142b.c();
                        return;
                    default:
                        this.f42142b.f43666c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f43665b = new jg.g(getContext(), null);
                            jg.g gVar = new jg.g(getContext(), null);
                            this.f43666c = gVar;
                            gVar.f14480t0.f16052y = true;
                        } else {
                            this.f43665b = new jg.g(getContext(), null);
                            jg.g gVar2 = new jg.g(getContext(), null);
                            this.f43666c = gVar2;
                            gVar2.f14480t0.f16052y = true;
                        }
                    } else {
                        jg.q qVar = new jg.q(getContext());
                        this.f43665b = qVar;
                        qVar.f14480t0.E = true;
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
                        qVar2.f14464h1 = true;
                        this.f43666c = qVar2;
                    }
                } else {
                    jg.g gVar3 = new jg.g(getContext(), null);
                    gVar3.f14484w0 = true;
                    gVar3.f14486x0 = true;
                    this.f43665b = gVar3;
                    jg.g gVar4 = new jg.g(getContext(), null);
                    this.f43666c = gVar4;
                    gVar4.f14480t0.f16052y = true;
                }
            } else {
                this.f43665b = new jg.p(getContext(), d6Var);
                jg.p pVar = new jg.p(getContext(), d6Var);
                this.f43666c = pVar;
                pVar.f14480t0.f16052y = true;
            }
        } else {
            this.f43665b = new jg.g(getContext(), d6Var);
            jg.g gVar5 = new jg.g(getContext(), d6Var);
            this.f43666c = gVar5;
            gVar5.f14480t0.f16052y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43665b.f14445a = fVar;
        this.f43666c.f14445a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f43665b);
        frameLayout.addView(this.f43665b.f14480t0, -2, -2);
        frameLayout.addView(this.f43666c);
        frameLayout.addView(this.f43666c.f14480t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.z5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f43667f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21263s5, d6Var));
        this.f43665b.setDateSelectionListener(new pp0(this, 18));
        this.f43665b.f14480t0.d(false, false);
        this.f43665b.f14480t0.setOnTouchListener(new Object());
        this.f43665b.f14480t0.setOnClickListener(new View.OnClickListener(this) {
            public final z81 f42142b;

            {
                this.f42142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42142b.h(true);
                        return;
                    case 1:
                        this.f42142b.c();
                        return;
                    default:
                        this.f42142b.f43666c.c(false);
                        return;
                }
            }
        });
        this.f43666c.f14480t0.setOnClickListener(new View.OnClickListener(this) {
            public final z81 f42142b;

            {
                this.f42142b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42142b.h(true);
                        return;
                    case 1:
                        this.f42142b.c();
                        return;
                    default:
                        this.f42142b.f43666c.c(false);
                        return;
                }
            }
        });
        this.f43665b.setVisibility(0);
        this.f43666c.setVisibility(4);
        this.f43665b.setHeader(this.d);
        e.addView(this.d, w7.z5.c(52.0f, -1));
        e.addView(frameLayout, w7.z5.c(-2.0f, -1));
        e.addView(this.h, w7.z5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f43670s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e.setClipChildren(false);
            e.setClipToPadding(false);
        }
        addView(e);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f7;
        Window window = this.f43664a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        jg.g gVar = this.f43665b;
        gVar.J = false;
        jg.g gVar2 = this.f43666c;
        gVar2.J = false;
        gVar.f14488y0 = 2;
        gVar2.f14488y0 = 1;
        final ?? obj = new Object();
        jg.j jVar = gVar.f14461g0;
        obj.f16070b = jVar.f14503l;
        obj.f16069a = jVar.f14502k;
        int binarySearch = Arrays.binarySearch(this.f43669r.d.f15052a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f43669r.d.f15052a.length - 1;
        }
        obj.f16071c = this.f43669r.d.f15053b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f14489z0 = obj;
        gVar.f14489z0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f43669r.d.d.size(); i10++) {
            if (((kg.a) this.f43669r.d.d.get(i10)).f15046a[binarySearch] > j11) {
                j11 = ((kg.a) this.f43669r.d.d.get(i10)).f15046a[binarySearch];
            }
            if (((kg.a) this.f43669r.d.d.get(i10)).f15046a[binarySearch] < j12) {
                j12 = ((kg.a) this.f43669r.d.d.get(i10)).f15046a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = gVar.f14483w;
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
                z81 z81Var = z81.this;
                jg.g gVar3 = z81Var.f43665b;
                float f14 = gVar3.F0;
                jg.j jVar2 = gVar3.f14461g0;
                float f15 = jVar2.f14503l;
                float f16 = jVar2.f14502k;
                float f17 = ((f14 / (f15 - f16)) * f16) - jg.g.f14430k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                lg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f16071c) - f17;
                jVar3.f16072f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg.g gVar4 = z81Var.f43666c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(b91 b91Var);

    public abstract void c();

    public final void d() {
        kg.b bVar;
        ArrayList arrayList;
        int i10;
        jg.g gVar = this.f43665b;
        gVar.G();
        gVar.invalidate();
        jg.g gVar2 = this.f43666c;
        gVar2.G();
        gVar2.invalidate();
        lg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        b91 b91Var = this.f43669r;
        if (b91Var != null && (bVar = b91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f43669r.d.d.size(); i11++) {
                if (((kg.a) this.f43669r.d.d.get(i11)).f15050g >= 0 && org.telegram.ui.ActionBar.h6.d1(((kg.a) this.f43669r.d.d.get(i11)).f15050g)) {
                    i10 = org.telegram.ui.ActionBar.h6.x0(null, ((kg.a) this.f43669r.d.d.get(i11)).f15050g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false)) < 0.5d) {
                    i10 = ((kg.a) this.f43669r.d.d.get(i11)).f15051i;
                } else {
                    i10 = ((kg.a) this.f43669r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f43668n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.a10 a10Var = ((y81) arrayList2.get(i11)).f43389a;
                    a10Var.getClass();
                    a10Var.f24450r = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false);
                    a10Var.v = -1;
                    a10Var.f24451s = i10;
                    a10Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21059h6, false));
        this.f43667f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21263s5, false));
    }

    public final void e(b91 b91Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (b91Var != null) {
            String str = b91Var.f35541j;
            lg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            jg.g gVar = this.f43665b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            jg.j jVar = gVar.f14461g0;
            jg.g gVar2 = this.f43666c;
            gVar2.setLandscape(z11);
            this.f43669r = b91Var;
            boolean z13 = b91Var.f35543l;
            ArrayList arrayList2 = this.f43668n;
            j41 j41Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f43667f;
            if (!z13 && !b91Var.f35535a) {
                textView.setVisibility(8);
                lg.e eVar = gVar.f14480t0;
                boolean z14 = b91Var.f35545n;
                eVar.f16043a = z14;
                cVar.c(!z14);
                if (b91Var.d == null && b91Var.f35538f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(b91Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(b91Var.d) && b91Var.h) {
                    jVar.f14502k = 0.0f;
                    jVar.f14503l = 1.0f;
                    jVar.f14495a.A(true, false, false);
                }
                cVar.setUseWeekInterval(b91Var.f35546o);
                gVar.f14480t0.setUseWeek(b91Var.f35546o);
                lg.e eVar2 = gVar.f14480t0;
                if (this.f43669r.f35539g == null && this.f43670s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f14480t0.F = false;
                eVar2.setEnabled(eVar2.F);
                lg.e eVar3 = gVar2.f14480t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                j41Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        lg.f fVar = (lg.f) arrayList.get(i10);
                        y81 y81Var = new y81(this, i10);
                        y81Var.f43390b = fVar;
                        String str2 = fVar.f16053a.d;
                        org.telegram.ui.Components.a10 a10Var = y81Var.f43389a;
                        a10Var.setText(str2);
                        a10Var.a(fVar.f16063n, false);
                        a10Var.setOnTouchListener(new Object());
                        a10Var.setOnClickListener(new cf0(17, y81Var, fVar));
                        a10Var.setOnLongClickListener(new ci.m2(6, y81Var, fVar));
                    }
                }
                long j10 = this.f43669r.f35537c;
                if (j10 > 0) {
                    gVar.f14479s0 = Arrays.binarySearch(gVar.f14463h0.f15052a, j10);
                    gVar.f14481u0 = true;
                    gVar.f14480t0.setVisibility(0);
                    gVar.f14482v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f14502k) - jg.g.f14430k1);
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
                    gVar.f14488y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f14489z0 = obj;
                    obj.f16072f = 0.0f;
                    ofFloat.addUpdateListener(new c11(this, 10));
                    ofFloat.addListener(new x81(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = b91Var.f35536b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            j41Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        jg.g gVar = this.f43665b;
        long selectedDate = gVar.getSelectedDate();
        kg.b bVar = this.f43669r.e;
        jg.g gVar2 = this.f43666c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f43669r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f43669r.d.d.size();
                arrayList = this.f43668n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((kg.a) bVar.d.get(i12)).f15048c.equals(((kg.a) this.f43669r.d.d.get(i10)).f15048c)) {
                            boolean z12 = ((y81) arrayList.get(i10)).f43389a.f24446b;
                            ((lg.f) arrayList2.get(i12)).f16063n = z12;
                            lg.f fVar = (lg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f16064o = f7;
                            ((y81) arrayList.get(i10)).f43389a.f24447c = true;
                            ((y81) arrayList.get(i10)).f43389a.animate().alpha(1.0f).start();
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
                    ((y81) arrayList.get(i10)).f43389a.f24447c = false;
                    ((y81) arrayList.get(i10)).f43389a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f43669r.d.d.size(); i13++) {
                    ((y81) arrayList.get(i13)).f43389a.f24447c = true;
                    ((y81) arrayList.get(i13)).f43389a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f43669r.f35537c = selectedDate;
        gVar.f14480t0.setAlpha(0.0f);
        gVar.f14482v0 = 0.0f;
        gVar.f14481u0 = false;
        gVar.f14466i1 = false;
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
            gVar.f14488y0 = 0;
            gVar2.f14488y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new x81(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        kg.b bVar;
        b91 b91Var = this.f43669r;
        if (b91Var != null && (bVar = b91Var.d) != null && bVar.f15052a != null) {
            lg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f16032a;
            jg.g gVar = this.f43665b;
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
            gVar.f14480t0.f16046f.setAlpha(1.0f);
            jg.g gVar2 = this.f43666c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f43669r.f35537c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f43668n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f43664a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    y81 y81Var = (y81) obj;
                    y81Var.f43389a.setAlpha(1.0f);
                    y81Var.f43389a.f24447c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new x81(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                y81 y81Var2 = (y81) obj2;
                y81Var2.f43389a.animate().alpha(1.0f).start();
                y81Var2.f43389a.f24447c = true;
            }
            a2.start();
        }
    }
}
