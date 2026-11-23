package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.r5;
import org.telegram.messenger.we;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.xt0;
public abstract class t0 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int f58233a;
    public final sg.j1 f58234b;
    public final r5 f58235c;
    public final we d;
    public final sg.t0 f58236e;
    public final Bitmap f58237f;
    public final int h;
    public final boolean f58238n;
    public final FrameLayout f58239r;
    public final TextView f58240s;
    public final TextView f58241w;
    public final r1 f58242x;
    public xt0 f58243y;

    public t0(Context context, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, we weVar) {
        super(context);
        q1 aaVar = new aa(this, 21);
        this.J = new ArrayList();
        this.K = new Rect();
        this.f58233a = i7;
        this.f58238n = context instanceof BubbleActivity;
        sg.j1 j1Var = new sg.j1();
        this.f58234b = j1Var;
        j1Var.f57386a = new qb.a(25);
        r5 r5Var = new r5("MaskPaint", true);
        this.f58235c = r5Var;
        this.d = weVar;
        this.f58237f = bitmap;
        this.h = i10;
        sg.h0 h0Var = new sg.h0(getPaintingSize(), bitmap2, i10, null);
        h0Var.G = true;
        sg.t0 t0Var = new sg.t0(context, h0Var, bitmap, null, null);
        this.f58236e = t0Var;
        t0Var.setAlpha(0.0f);
        t0Var.setDelegate(new i5(this));
        t0Var.setUndoStore(j1Var);
        t0Var.setQueue(r5Var);
        t0Var.setVisibility(4);
        t0Var.setBrush(new Object());
        t0Var.setBrushSize(aaVar.get());
        t0Var.setColor(-65536);
        addView(t0Var, na.e(-1, -1, 51));
        r1 r1Var = new r1(context);
        this.f58242x = r1Var;
        r1Var.b(0.05f, 1.0f);
        r1Var.setBrushWeight(aaVar.get());
        r1Var.setRenderView(t0Var);
        r1Var.setValueOverride(aaVar);
        r1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        r1Var.setAlpha(0.0f);
        addView(r1Var, na.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f58239r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, na.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f58240s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(n6.h0(n6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(gd.N0(2131752577, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, na.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.f58241w = m10;
        i5.c.x(m10, 1, 15.0f);
        int i11 = n6.f29700qg;
        org.telegram.ui.Cells.y h02 = n6.h0(n6.r1(0.15f, n6.x0(null, i11, false)), 3, -1);
        q6 K = u6.K(0.15f, i11);
        m10.setBackground(h02);
        u6.j(m10, h02, null, K, null);
        m10.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        m10.setText(gd.N0(2131745750, null).toUpperCase());
        u6.U(m10, i11, null);
        m10.setGravity(17);
        frameLayout.addView(m10, na.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private xt0 getPaintingSize() {
        float f10;
        float f11;
        xt0 xt0Var = this.f58243y;
        if (xt0Var != null) {
            return xt0Var;
        }
        Bitmap bitmap = this.f58237f;
        xt0 xt0Var2 = new xt0(bitmap.getWidth(), bitmap.getHeight());
        float f12 = 1280;
        xt0Var2.f42189a = f12;
        float floor = (float) Math.floor((f12 * f11) / f10);
        xt0Var2.f42190b = floor;
        if (floor > f12) {
            xt0Var2.f42190b = f12;
            xt0Var2.f42189a = (float) Math.floor((f12 * f10) / f11);
        }
        this.f58243y = xt0Var2;
        return xt0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        sg.t0 t0Var = this.f58236e;
        float translationX = ((x10 - t0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / t0Var.getScaleX();
        float y10 = ((motionEvent.getY() - t0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / t0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-t0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (t0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (t0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        t0Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        float f18;
        float f19;
        this.F = f11;
        float f20 = 0.0f + f12;
        this.G = f20;
        float f21 = 1.0f;
        sg.t0 t0Var = this.f58236e;
        we weVar = this.d;
        if (weVar != null) {
            float f22 = weVar.f27770c * 1.0f;
            int measuredWidth = t0Var.getMeasuredWidth();
            int measuredHeight = t0Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i7 = weVar.f27775k;
                if (i7 == 90 || i7 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f14 / ((int) (weVar.f27771e * f18)), f15 / ((int) (weVar.f27772f * f19)));
                f16 = f22 * max;
                float D = com.google.android.gms.internal.vision.e2.D(weVar.f27768a, measuredWidth, f10, max);
                float f23 = weVar.f27770c;
                f11 += D * f23;
                f20 += weVar.f27769b * measuredHeight * f10 * max * f23;
                f17 = weVar.d + i7 + f13;
            } else {
                return;
            }
        } else {
            f16 = this.I * 1.0f;
            f17 = f13;
        }
        float f24 = f10 * f16;
        if (!Float.isNaN(f24)) {
            f21 = f24;
        }
        t0Var.setScaleX(f21);
        t0Var.setScaleY(f21);
        t0Var.setTranslationX(f11);
        t0Var.setTranslationY(f20);
        t0Var.setRotation(f17);
        t0Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        we weVar;
        int i7 = 0;
        if (view == this.f58236e && (weVar = this.d) != null) {
            canvas.save();
            if (!this.f58238n) {
                i7 = org.telegram.messenger.g0.f24220m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = weVar.f27775k;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * weVar.f27771e)) / weVar.f27770c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * weVar.f27772f)) / weVar.f27770c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.F;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + i7 + this.G;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i7 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i7 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public int getAdditionalBottom() {
        return 0;
    }

    public int getAdditionalTop() {
        return 0;
    }

    public Bitmap getBitmap() {
        Bitmap c10 = this.f58236e.c(false, false);
        int i7 = this.h;
        if (i7 != 0) {
            int width = c10.getWidth();
            int height = c10.getHeight();
            if ((i7 / 90) % 2 != 0) {
                width = c10.getHeight();
                height = c10.getWidth();
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(width / 2.0f, height / 2.0f);
            canvas.rotate(-i7);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((-c10.getWidth()) / 2.0f, (-c10.getHeight()) / 2.0f, c10.getWidth() / 2.0f, c10.getHeight() / 2.0f);
            canvas.drawBitmap(c10, (Rect) null, rectF, new Paint(3));
            c10.recycle();
            return createBitmap;
        }
        return c10;
    }

    public sg.t0 getRenderView() {
        return this.f58236e;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (!this.f58238n) {
            Typeface typeface = org.telegram.messenger.g0.f24198a;
        }
        sg.t0 t0Var = this.f58236e;
        int ceil = (int) Math.ceil((i13 - t0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - t0Var.getMeasuredHeight()) / 2;
        t0Var.layout(ceil, measuredHeight, t0Var.getMeasuredWidth() + ceil, t0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f58239r;
        frameLayout.layout(0, i14 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i14);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        this.H = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int i11 = org.telegram.messenger.g0.f24226q.y;
        Bitmap bitmap = this.f58237f;
        if (bitmap != null) {
            f11 = bitmap.getWidth();
            f10 = bitmap.getHeight();
        } else {
            f10 = size2;
            f11 = size;
        }
        float f12 = size;
        float floor = (float) Math.floor((f12 * f10) / f11);
        float f13 = i11;
        if (floor > f13) {
            f12 = (float) Math.floor((f11 * f13) / f10);
            floor = f13;
        }
        this.f58236e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.I = 1.0f;
        measureChild(this.f58242x, i7, i10);
        measureChild(this.f58239r, i7, i10);
        this.H = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.J;
            arrayList.clear();
            Rect rect = this.K;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z10) {
        ?? r22;
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        if (z10) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.f58236e.setBrush(r22);
    }
}
