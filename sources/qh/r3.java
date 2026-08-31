package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.k60;
import org.telegram.ui.qd1;
public abstract class r3 extends FrameLayout {
    public final Paint B;
    public final RectF C;
    public final RectF D;
    public final Path E;
    public boolean F;
    public final org.telegram.ui.Components.z5 G;
    public l01 H;
    public final Path I;
    public boolean J;
    public final org.telegram.ui.Components.fa f45934a;
    public final m3 f45935b;
    public ArrayList f45936c;
    public ArrayList d;
    public ArrayList f45937e;
    public int f45938f;
    public final org.telegram.ui.web.s0 h;
    public final rc f45939n;
    public final RectF f45940r;
    public final RectF f45941s;
    public final Paint v;
    public l01 f45942w;
    public final Path f45943x;
    public final RectF f45944y;

    public r3(Context context, oh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f45936c = new ArrayList();
        this.d = new ArrayList();
        this.f45937e = new ArrayList();
        final u8 u8Var = (u8) this;
        this.h = new org.telegram.ui.web.s0(u8Var, 21);
        this.f45939n = new rc(this);
        this.f45940r = new RectF();
        this.f45941s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f45943x = path;
        this.f45944y = new RectF();
        this.B = new Paint(1);
        this.C = new RectF();
        this.D = new RectF();
        this.E = new Path();
        this.G = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.I = new Path();
        this.J = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f45934a = new org.telegram.ui.Components.fa(baVar, this, 0, !u8Var.L.f45119o0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        m3 m3Var = new m3(u8Var, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z4;
                int i10 = r2;
                int i11 = 0;
                u8 u8Var2 = u8Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        x51 x51Var = (x51) obj2;
                        x51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < u8Var2.d.size(); i13++) {
                            Integer num = (Integer) u8Var2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = p3.f45877a;
                            j51 J = j51.J(p3.class);
                            J.d = intValue;
                            J.G = (s6) u8Var2.f45936c.get(intValue);
                            J.f28027z = i12;
                            if (u8Var2.f45938f == intValue) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            J.K(z4);
                            J.f28009f = u8Var2.f45937e.contains(num);
                            J.D = new mh.x0(u8Var2, intValue, 23);
                            arrayList.add(J);
                            if (u8Var2.f45937e.contains(num)) {
                                i12++;
                            }
                        }
                        x51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        u8Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            u8Var2.d.add(Integer.valueOf(((j51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) u8Var2.f45935b, (h5.d) new ng.i(u8Var2, 4));
                        return;
                }
            }
        }, new mh.m5(u8Var, 26), bVar);
        this.f45935b = m3Var;
        m3Var.V2.f32957r = false;
        m3Var.setClipToPadding(false);
        m3Var.setClipChildren(false);
        m3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(m3Var, k7.c6.e(-2, 120, 85));
        m3Var.w1(true);
        m3Var.B1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z4;
                int i10 = r2;
                int i11 = 0;
                u8 u8Var2 = u8Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        x51 x51Var = (x51) obj2;
                        x51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < u8Var2.d.size(); i13++) {
                            Integer num = (Integer) u8Var2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = p3.f45877a;
                            j51 J = j51.J(p3.class);
                            J.d = intValue;
                            J.G = (s6) u8Var2.f45936c.get(intValue);
                            J.f28027z = i12;
                            if (u8Var2.f45938f == intValue) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            J.K(z4);
                            J.f28009f = u8Var2.f45937e.contains(num);
                            J.D = new mh.x0(u8Var2, intValue, 23);
                            arrayList.add(J);
                            if (u8Var2.f45937e.contains(num)) {
                                i12++;
                            }
                        }
                        x51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        u8Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            u8Var2.d.add(Integer.valueOf(((j51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) u8Var2.f45935b, (h5.d) new ng.i(u8Var2, 4));
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

    public final void a(Canvas canvas, RectF rectF, float f10, float f11) {
        int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f11), 31);
        }
        u8 u8Var = (u8) this;
        boolean c3 = u8Var.L.f45119o0.c();
        org.telegram.ui.Components.fa faVar = this.f45934a;
        Paint paint = this.B;
        if (c3) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = u8Var.K;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                faVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = faVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint3);
                }
                paint.setAlpha((int) (f11 * 51.0f));
                canvas.drawRoundRect(rectF, f10, f10, paint);
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
        for (int i12 = 0; i12 < Math.min(i10, this.f45936c.size()); i12++) {
            if (this.d.contains(Integer.valueOf(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public final void c(boolean z4, boolean z10) {
        int i10;
        float f10;
        float f11;
        if (this.J != z4) {
            this.J = z4;
            m3 m3Var = this.f45935b;
            m3Var.animate().cancel();
            float f12 = 0.0f;
            float f13 = 0.65f;
            if (z10) {
                m3Var.setVisibility(0);
                ViewPropertyAnimator animate = m3Var.animate();
                if (z4) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.65f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z4) {
                    f13 = 1.0f;
                }
                org.telegram.ui.b.p(scaleX.scaleY(f13).setListener(new qd1(10, this, z4)).setUpdateListener(new oh.f5(this, 17)), pr.h, 360L);
            } else {
                if (z4) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                m3Var.setVisibility(i10);
                if (z4) {
                    f12 = 1.0f;
                }
                m3Var.setAlpha(f12);
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.65f;
                }
                m3Var.setScaleX(f10);
                if (z4) {
                    f13 = 1.0f;
                }
                m3Var.setScaleY(f13);
                invalidate();
            }
            if (z4 && this.F) {
                this.F = false;
                invalidate();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.f45939n.a(0.1f);
        canvas.save();
        RectF rectF = this.f45940r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f45941s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        l01 l01Var = this.f45942w;
        m3 m3Var = this.f45935b;
        if (l01Var != null) {
            l01Var.c(rectF.centerX() - (this.f45942w.f28521c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - m3Var.getAlpha(), -1, canvas);
        }
        if (m3Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (m3Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f45943x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.H != null) {
            float e6 = this.G.e(this.F);
            if (e6 > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e6);
                float l10 = this.H.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp = AndroidUtilities.dp(32.0f);
                float f10 = rectF.right;
                float dp2 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.C;
                rectF3.set(rectF.right - l10, (rectF.top - AndroidUtilities.dp(9.66f)) - dp, f10, dp2);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e6) * AndroidUtilities.dp(4.0f));
                Path path = this.E;
                path.rewind();
                float dp3 = AndroidUtilities.dp(8.0f);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                RectF rectF4 = this.D;
                rectF4.set(f11, f12, f11 + dp3, f12 + dp3);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f13 = rectF3.right;
                float f14 = rectF3.top;
                rectF4.set(f13 - dp3, f14, f13, f14 + dp3);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f15 = rectF3.right;
                float f16 = rectF3.bottom;
                rectF4.set(f15 - dp3, f16 - dp3, f15, f16);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - AndroidUtilities.dp(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - AndroidUtilities.dp(14.5f), rectF3.bottom + AndroidUtilities.dp(5.66f));
                path.lineTo(rectF3.right - AndroidUtilities.dp(21.0f), rectF3.bottom);
                float f17 = rectF3.left;
                float f18 = rectF3.bottom;
                rectF4.set(f17, f18 - dp3, f17 + dp3, f18);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += AndroidUtilities.dp(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, dp3, e6);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.H.c((rectF.right - l10) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp / 2.0f), e6, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        m3 m3Var = this.f45935b;
        if (view == m3Var) {
            float x10 = m3Var.getX();
            float y10 = m3Var.getY();
            float x11 = m3Var.getX() + m3Var.getWidth();
            float y11 = m3Var.getY() + m3Var.getHeight();
            RectF rectF = this.f45944y;
            rectF.set(x10, y10, x11, y11);
            AndroidUtilities.scaleRect(rectF, m3Var.getScaleX(), m3Var.getPivotX() + m3Var.getX(), m3Var.getPivotY() + m3Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), m3Var.getAlpha());
            Path path = this.I;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        m3 m3Var = this.f45935b;
        m3Var.setPivotX(m3Var.getWidth() - AndroidUtilities.dp(15.0f));
        m3Var.setPivotY(m3Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f45940r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        rc rcVar = this.f45939n;
        if (action == 0) {
            rcVar.c(contains);
            if (this.J && !contains) {
                if (!this.f45944y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                rcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (rcVar.h) {
                c(!this.J, true);
            }
            rcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
        }
        if (!rcVar.h && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f45938f == i10) {
            return;
        }
        this.f45938f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.f45935b, (h5.d) new k60(this, i10, 1));
    }
}
