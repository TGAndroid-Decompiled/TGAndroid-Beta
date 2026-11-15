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
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ou;
import org.telegram.messenger.q5;
import org.telegram.messenger.xe;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.nt0;
public abstract class o0 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int f57485a;
    public final sg.k1 f57486b;
    public final q5 f57487c;
    public final xe d;
    public final sg.u0 f57488e;
    public final Bitmap f57489f;
    public final int h;
    public final boolean f57490n;
    public final FrameLayout f57491r;
    public final TextView f57492s;
    public final TextView f57493w;
    public final m1 f57494x;
    public nt0 f57495y;

    public o0(Context context, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, xe xeVar) {
        super(context);
        l1 ouVar = new ou(this, 27);
        this.J = new ArrayList();
        this.K = new Rect();
        this.f57485a = i7;
        this.f57490n = context instanceof BubbleActivity;
        sg.k1 k1Var = new sg.k1();
        this.f57486b = k1Var;
        k1Var.f56697a = new qb.a(25);
        q5 q5Var = new q5("MaskPaint", true);
        this.f57487c = q5Var;
        this.d = xeVar;
        this.f57489f = bitmap;
        this.h = i10;
        sg.i0 i0Var = new sg.i0(getPaintingSize(), bitmap2, i10, null);
        i0Var.G = true;
        sg.u0 u0Var = new sg.u0(context, i0Var, bitmap, null, null);
        this.f57488e = u0Var;
        u0Var.setAlpha(0.0f);
        u0Var.setDelegate(new ff(this, 19));
        u0Var.setUndoStore(k1Var);
        u0Var.setQueue(q5Var);
        u0Var.setVisibility(4);
        u0Var.setBrush(new Object());
        u0Var.setBrushSize(ouVar.get());
        u0Var.setColor(-65536);
        addView(u0Var, ja.e(-1, -1, 51));
        m1 m1Var = new m1(context);
        this.f57494x = m1Var;
        m1Var.b(0.05f, 1.0f);
        m1Var.setBrushWeight(ouVar.get());
        m1Var.setRenderView(u0Var);
        m1Var.setValueOverride(ouVar);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ja.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f57491r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, ja.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f57492s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(j6.h0(j6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(hd.M0(2131752589, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, ja.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.f57493w = k10;
        i5.c.v(k10, 1, 15.0f);
        int i11 = j6.f29098qg;
        org.telegram.ui.Cells.y h02 = j6.h0(j6.r1(0.15f, j6.x0(null, i11, false)), 3, -1);
        m6 K = q6.K(0.15f, i11);
        k10.setBackground(h02);
        q6.j(k10, h02, null, K, null);
        k10.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        k10.setText(hd.M0(2131745946, null).toUpperCase());
        q6.U(k10, i11, null);
        k10.setGravity(17);
        frameLayout.addView(k10, ja.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private nt0 getPaintingSize() {
        float f10;
        float f11;
        nt0 nt0Var = this.f57495y;
        if (nt0Var != null) {
            return nt0Var;
        }
        Bitmap bitmap = this.f57489f;
        nt0 nt0Var2 = new nt0(bitmap.getWidth(), bitmap.getHeight());
        float f12 = 1280;
        nt0Var2.f37702a = f12;
        float floor = (float) Math.floor((f12 * f11) / f10);
        nt0Var2.f37703b = floor;
        if (floor > f12) {
            nt0Var2.f37703b = f12;
            nt0Var2.f37702a = (float) Math.floor((f12 * f10) / f11);
        }
        this.f57495y = nt0Var2;
        return nt0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        sg.u0 u0Var = this.f57488e;
        float translationX = ((x10 - u0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / u0Var.getScaleX();
        float y10 = ((motionEvent.getY() - u0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / u0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-u0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (u0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (u0Var.getMeasuredHeight() / 2.0f) + ((float) i5.c.c(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        u0Var.e(obtain);
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
        sg.u0 u0Var = this.f57488e;
        xe xeVar = this.d;
        if (xeVar != null) {
            float f22 = xeVar.f27491c * 1.0f;
            int measuredWidth = u0Var.getMeasuredWidth();
            int measuredHeight = u0Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i7 = xeVar.f27496k;
                if (i7 == 90 || i7 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f14 / ((int) (xeVar.f27492e * f18)), f15 / ((int) (xeVar.f27493f * f19)));
                f16 = f22 * max;
                float D = com.google.android.gms.internal.vision.e2.D(xeVar.f27489a, measuredWidth, f10, max);
                float f23 = xeVar.f27491c;
                f11 += D * f23;
                f20 += xeVar.f27490b * measuredHeight * f10 * max * f23;
                f17 = xeVar.d + i7 + f13;
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
        u0Var.setScaleX(f21);
        u0Var.setScaleY(f21);
        u0Var.setTranslationX(f11);
        u0Var.setTranslationY(f20);
        u0Var.setRotation(f17);
        u0Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        xe xeVar;
        int i7 = 0;
        if (view == this.f57488e && (xeVar = this.d) != null) {
            canvas.save();
            if (!this.f57490n) {
                i7 = org.telegram.messenger.g0.f23605m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = xeVar.f27496k;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * xeVar.f27492e)) / xeVar.f27491c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * xeVar.f27493f)) / xeVar.f27491c);
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
        Bitmap c10 = this.f57488e.c(false, false);
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

    public sg.u0 getRenderView() {
        return this.f57488e;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (!this.f57490n) {
            Typeface typeface = org.telegram.messenger.g0.f23583a;
        }
        sg.u0 u0Var = this.f57488e;
        int ceil = (int) Math.ceil((i13 - u0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - u0Var.getMeasuredHeight()) / 2;
        u0Var.layout(ceil, measuredHeight, u0Var.getMeasuredWidth() + ceil, u0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f57491r;
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
        int i11 = org.telegram.messenger.g0.f23611q.y;
        Bitmap bitmap = this.f57489f;
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
        this.f57488e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.I = 1.0f;
        measureChild(this.f57494x, i7, i10);
        measureChild(this.f57491r, i7, i10);
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
        this.f57488e.setBrush(r22);
    }
}
