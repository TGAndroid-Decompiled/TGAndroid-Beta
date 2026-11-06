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
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.q5;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.uy;
public abstract class o0 extends FrameLayout {
    public boolean D;
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int f55779a;
    public final sg.m1 f55780b;
    public final q5 f55781c;
    public final ye d;
    public final sg.w0 f55782e;
    public final Bitmap f55783f;
    public final int h;
    public final boolean f55784n;
    public final FrameLayout f55785r;
    public final TextView f55786s;
    public final TextView f55787w;
    public final m1 f55788x;
    public mt0 f55789y;

    public o0(Context context, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ye yeVar) {
        super(context);
        l1 uyVar = new uy(this, 20);
        this.I = new ArrayList();
        this.J = new Rect();
        this.f55779a = i7;
        this.f55784n = context instanceof BubbleActivity;
        sg.m1 m1Var = new sg.m1();
        this.f55780b = m1Var;
        m1Var.f55054a = new w7.s(24, false);
        q5 q5Var = new q5("MaskPaint", true);
        this.f55781c = q5Var;
        this.d = yeVar;
        this.f55783f = bitmap;
        this.h = i10;
        sg.j0 j0Var = new sg.j0(getPaintingSize(), bitmap2, i10, null);
        j0Var.G = true;
        sg.w0 w0Var = new sg.w0(context, j0Var, bitmap, null, null);
        this.f55782e = w0Var;
        w0Var.setAlpha(0.0f);
        w0Var.setDelegate(new qt(this, 17));
        w0Var.setUndoStore(m1Var);
        w0Var.setQueue(q5Var);
        w0Var.setVisibility(4);
        w0Var.setBrush(new Object());
        w0Var.setBrushSize(uyVar.get());
        w0Var.setColor(-65536);
        addView(w0Var, ha.e(-1, -1, 51));
        m1 m1Var2 = new m1(context);
        this.f55788x = m1Var2;
        m1Var2.b(0.05f, 1.0f);
        m1Var2.setBrushWeight(uyVar.get());
        m1Var2.setRenderView(w0Var);
        m1Var2.setValueOverride(uyVar);
        m1Var2.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var2.setAlpha(0.0f);
        addView(m1Var2, ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f55785r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, ha.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f55786s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(k6.h0(k6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(hd.M0(2131752589, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.f55787w = i11;
        com.google.android.recaptcha.internal.a.q(i11, 1, 15.0f);
        int i12 = k6.f28040ng;
        org.telegram.ui.Cells.y h02 = k6.h0(k6.r1(0.15f, k6.x0(null, i12, false)), 3, -1);
        n6 L = r6.L(0.15f, i12);
        i11.setBackground(h02);
        r6.k(i11, h02, null, L, null);
        i11.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        i11.setText(hd.M0(2131745947, null).toUpperCase());
        r6.V(i11, i12, null);
        i11.setGravity(17);
        frameLayout.addView(i11, ha.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private mt0 getPaintingSize() {
        float f10;
        float f11;
        mt0 mt0Var = this.f55789y;
        if (mt0Var != null) {
            return mt0Var;
        }
        Bitmap bitmap = this.f55783f;
        mt0 mt0Var2 = new mt0(bitmap.getWidth(), bitmap.getHeight());
        float f12 = 1280;
        mt0Var2.f36086a = f12;
        float floor = (float) Math.floor((f12 * f11) / f10);
        mt0Var2.f36087b = floor;
        if (floor > f12) {
            mt0Var2.f36087b = f12;
            mt0Var2.f36086a = (float) Math.floor((f12 * f10) / f11);
        }
        this.f55789y = mt0Var2;
        return mt0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        sg.w0 w0Var = this.f55782e;
        float translationX = ((x10 - w0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / w0Var.getScaleX();
        float y10 = ((motionEvent.getY() - w0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / w0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-w0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (w0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (w0Var.getMeasuredHeight() / 2.0f) + ((float) jg.g.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        w0Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        float f18;
        float f19;
        this.E = f11;
        float f20 = 0.0f + f12;
        this.F = f20;
        float f21 = 1.0f;
        sg.w0 w0Var = this.f55782e;
        ye yeVar = this.d;
        if (yeVar != null) {
            float f22 = yeVar.f26628c * 1.0f;
            int measuredWidth = w0Var.getMeasuredWidth();
            int measuredHeight = w0Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i7 = yeVar.f26633k;
                if (i7 == 90 || i7 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f14 / ((int) (yeVar.f26629e * f18)), f15 / ((int) (yeVar.f26630f * f19)));
                f16 = f22 * max;
                float D = com.google.android.recaptcha.internal.a.D(yeVar.f26626a, measuredWidth, f10, max);
                float f23 = yeVar.f26628c;
                f11 += D * f23;
                f20 += yeVar.f26627b * measuredHeight * f10 * max * f23;
                f17 = yeVar.d + i7 + f13;
            } else {
                return;
            }
        } else {
            f16 = this.H * 1.0f;
            f17 = f13;
        }
        float f24 = f10 * f16;
        if (!Float.isNaN(f24)) {
            f21 = f24;
        }
        w0Var.setScaleX(f21);
        w0Var.setScaleY(f21);
        w0Var.setTranslationX(f11);
        w0Var.setTranslationY(f20);
        w0Var.setRotation(f17);
        w0Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ye yeVar;
        int i7 = 0;
        if (view == this.f55782e && (yeVar = this.d) != null) {
            canvas.save();
            if (!this.f55784n) {
                i7 = org.telegram.messenger.g0.f22538m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = yeVar.f26633k;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * yeVar.f26629e)) / yeVar.f26628c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * yeVar.f26630f)) / yeVar.f26628c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.E;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + i7 + this.F;
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
        Bitmap c10 = this.f55782e.c(false, false);
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

    public sg.w0 getRenderView() {
        return this.f55782e;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (!this.f55784n) {
            Typeface typeface = org.telegram.messenger.g0.f22516a;
        }
        sg.w0 w0Var = this.f55782e;
        int ceil = (int) Math.ceil((i13 - w0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - w0Var.getMeasuredHeight()) / 2;
        w0Var.layout(ceil, measuredHeight, w0Var.getMeasuredWidth() + ceil, w0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f55785r;
        frameLayout.layout(0, i14 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i14);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        this.G = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int i11 = org.telegram.messenger.g0.f22544q.y;
        Bitmap bitmap = this.f55783f;
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
        this.f55782e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.H = 1.0f;
        measureChild(this.f55788x, i7, i10);
        measureChild(this.f55785r, i7, i10);
        this.G = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.I;
            arrayList.clear();
            Rect rect = this.J;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z9) {
        ?? r22;
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        if (z9) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.f55782e.setBrush(r22);
    }
}
