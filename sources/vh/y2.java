package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.w9;
public abstract class y2 extends FrameLayout {
    public final RectF D;
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.t5 J;
    public qz0 K;
    public final Path L;
    public boolean M;
    public final w9 f52191a;
    public final ii f52192b;
    public ArrayList f52193c;
    public ArrayList d;
    public ArrayList e;
    public int f52194f;
    public final d0 h;
    public final dc f52195n;
    public final RectF f52196r;
    public final RectF f52197s;
    public final Paint f52198w;
    public qz0 f52199x;
    public final Path f52200y;

    public y2(Context context, th.b bVar, s9 s9Var) {
        super(context);
        this.f52193c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final k7 k7Var = (k7) this;
        this.h = new d0(k7Var, 10);
        this.f52195n = new dc(this);
        this.f52196r = new RectF();
        this.f52197s = new RectF();
        Paint paint = new Paint(1);
        this.f52198w = paint;
        Path path = new Path();
        this.f52200y = path;
        this.D = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.i0.L(4.33f), -org.telegram.messenger.i0.L(4.33f));
        path.lineTo(org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(4.33f));
        path.moveTo(-org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(4.33f));
        path.lineTo(org.telegram.messenger.i0.L(4.33f), -org.telegram.messenger.i0.L(4.33f));
        this.f52191a = new w9(s9Var, this, 0, !k7Var.O.f51658r0.c());
        setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(44.0f));
        ii iiVar = new ii(k7Var, context, d20.f15147s0, (t2) new j20() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                int i11 = 0;
                k7 k7Var2 = k7Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        p51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < k7Var2.d.size(); i13++) {
                            Integer num = (Integer) k7Var2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = w2.f52086b;
                            a51 K = a51.K(w2.class);
                            K.d = intValue;
                            K.G = (n5) k7Var2.f52193c.get(intValue);
                            K.f24305z = i12;
                            if (k7Var2.f52194f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f24287f = k7Var2.e.contains(num);
                            K.D = new rh.r0(k7Var2, intValue, 1);
                            arrayList.add(K);
                            if (k7Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        p51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        k7Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            k7Var2.d.add(Integer.valueOf(((a51) obj3).d));
                        }
                        org.telegram.messenger.i0.d0(k7Var2.f52192b, new ph.h1(k7Var2, 24));
                        return;
                }
            }
        }, new rh.d0(k7Var, 26), bVar);
        this.f52192b = iiVar;
        iiVar.f30819f3.f29295r = false;
        iiVar.setClipToPadding(false);
        iiVar.setClipChildren(false);
        iiVar.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        addView(iiVar, w7.b6.e(-2, 120, 85));
        iiVar.z1(true);
        iiVar.E1(new j20() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                int i11 = 0;
                k7 k7Var2 = k7Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        p51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < k7Var2.d.size(); i13++) {
                            Integer num = (Integer) k7Var2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = w2.f52086b;
                            a51 K = a51.K(w2.class);
                            K.d = intValue;
                            K.G = (n5) k7Var2.f52193c.get(intValue);
                            K.f24305z = i12;
                            if (k7Var2.f52194f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f24287f = k7Var2.e.contains(num);
                            K.D = new rh.r0(k7Var2, intValue, 1);
                            arrayList.add(K);
                            if (k7Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        p51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        k7Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            k7Var2.d.add(Integer.valueOf(((a51) obj3).d));
                        }
                        org.telegram.messenger.i0.d0(k7Var2.f52192b, new ph.h1(k7Var2, 24));
                        return;
                }
            }
        }, true);
        c(false, false);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10) {
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
        }
        k7 k7Var = (k7) this;
        boolean c10 = k7Var.O.f51658r0.c();
        w9 w9Var = this.f52191a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = k7Var.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                w9Var.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = w9Var.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f7, f7, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint3);
                }
                paint.setAlpha((int) (f10 * 51.0f));
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
        }
        if (i10 < 0) {
            canvas.restore();
        }
    }

    public final int b(int i10) {
        if (!this.d.contains(Integer.valueOf(i10))) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < Math.min(i10, this.f52193c.size()); i12++) {
            if (this.d.contains(Integer.valueOf(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public final void c(boolean z10, boolean z11) {
        int i10;
        float f7;
        float f10;
        if (this.M != z10) {
            this.M = z10;
            ii iiVar = this.f52192b;
            iiVar.animate().cancel();
            float f11 = 0.0f;
            float f12 = 0.65f;
            if (z11) {
                iiVar.setVisibility(0);
                ViewPropertyAnimator animate = iiVar.animate();
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.65f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f12 = 1.0f;
                }
                z20.m(scaleX.scaleY(f12).setListener(new sg.y(11, this, z10)).setUpdateListener(new qh.e0(this, 29)), gr.h, 360L);
            } else {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                iiVar.setVisibility(i10);
                if (z10) {
                    f11 = 1.0f;
                }
                iiVar.setAlpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.65f;
                }
                iiVar.setScaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                iiVar.setScaleY(f12);
                invalidate();
            }
            if (z10 && this.I) {
                this.I = false;
                invalidate();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.f52195n.a(0.1f);
        canvas.save();
        RectF rectF = this.f52196r;
        rectF.set(getWidth() - org.telegram.messenger.i0.L(42.0f), getHeight() - org.telegram.messenger.i0.L(34.0f), getWidth() - org.telegram.messenger.i0.L(12.0f), getHeight() - org.telegram.messenger.i0.L(4.0f));
        RectF rectF2 = this.f52197s;
        rectF2.set(rectF);
        rectF2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.f52198w;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.i0.L(0.9f), paint);
        qz0 qz0Var = this.f52199x;
        ii iiVar = this.f52192b;
        if (qz0Var != null) {
            qz0Var.c(rectF.centerX() - (this.f52199x.f29774c / 2.0f), rectF.centerY() - org.telegram.messenger.i0.L(0.6f), 1.0f - iiVar.getAlpha(), -1, canvas);
        }
        if (iiVar.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (iiVar.getAlpha() * 255.0f));
            canvas.drawPath(this.f52200y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float d = this.J.d(this.I);
            if (d > 0.0f) {
                float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, d);
                float k10 = this.K.k() + org.telegram.messenger.i0.L(11.0f) + org.telegram.messenger.i0.L(11.0f);
                float L = org.telegram.messenger.i0.L(32.0f);
                float f7 = rectF.right;
                float L2 = rectF.top - org.telegram.messenger.i0.L(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(rectF.right - k10, (rectF.top - org.telegram.messenger.i0.L(9.66f)) - L, f7, L2);
                rectF3.set(rectF3.right - (rectF3.width() * T1), rectF3.bottom - (rectF3.height() * T1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * org.telegram.messenger.i0.L(4.0f));
                Path path = this.H;
                path.rewind();
                float L3 = org.telegram.messenger.i0.L(8.0f);
                float f10 = rectF3.left;
                float f11 = rectF3.top;
                RectF rectF4 = this.G;
                rectF4.set(f10, f11, f10 + L3, f11 + L3);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f12 = rectF3.right;
                float f13 = rectF3.top;
                rectF4.set(f12 - L3, f13, f12, f13 + L3);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f14 = rectF3.right;
                float f15 = rectF3.bottom;
                rectF4.set(f14 - L3, f15 - L3, f14, f15);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - org.telegram.messenger.i0.L(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - org.telegram.messenger.i0.L(14.5f), rectF3.bottom + org.telegram.messenger.i0.L(5.66f));
                path.lineTo(rectF3.right - org.telegram.messenger.i0.L(21.0f), rectF3.bottom);
                float f16 = rectF3.left;
                float f17 = rectF3.bottom;
                rectF4.set(f16, f17 - L3, f16 + L3, f17);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += org.telegram.messenger.i0.L(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, L3, d);
                canvas.restore();
                canvas.save();
                canvas.scale(T1, T1, rectF3.right, rectF3.bottom);
                this.K.c((rectF.right - k10) + org.telegram.messenger.i0.L(11.0f), (rectF.top - org.telegram.messenger.i0.L(9.66f)) - (L / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ii iiVar = this.f52192b;
        if (view == iiVar) {
            float x10 = iiVar.getX();
            float y3 = iiVar.getY();
            float x11 = iiVar.getX() + iiVar.getWidth();
            float y10 = iiVar.getY() + iiVar.getHeight();
            RectF rectF = this.D;
            rectF.set(x10, y3, x11, y10);
            org.telegram.messenger.i0.i3(rectF, iiVar.getScaleX(), iiVar.getPivotX() + iiVar.getX(), iiVar.getPivotY() + iiVar.getY());
            a(canvas, rectF, org.telegram.messenger.i0.L(10.0f), iiVar.getAlpha());
            Path path = this.L;
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ii iiVar = this.f52192b;
        iiVar.setPivotX(iiVar.getWidth() - org.telegram.messenger.i0.L(15.0f));
        iiVar.setPivotY(iiVar.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f52196r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        dc dcVar = this.f52195n;
        if (action == 0) {
            dcVar.c(contains);
            if (this.M && !contains) {
                if (!this.D.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                dcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.f25390i) {
                c(!this.M, true);
            }
            dcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        if (!dcVar.f25390i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f52194f == i10) {
            return;
        }
        this.f52194f = i10;
        org.telegram.messenger.i0.d0(this.f52192b, new ag.s2(this, i10, 6));
    }
}
