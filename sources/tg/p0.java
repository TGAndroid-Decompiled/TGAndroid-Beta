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
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.r5;
import org.telegram.messenger.we;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.yt0;
public abstract class p0 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int f58110a;
    public final sg.k1 f58111b;
    public final r5 f58112c;
    public final we d;
    public final sg.u0 f58113e;
    public final Bitmap f58114f;
    public final int h;
    public final boolean f58115n;
    public final FrameLayout f58116r;
    public final TextView f58117s;
    public final TextView f58118w;
    public final n1 f58119x;
    public yt0 f58120y;

    public p0(Context context, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, we weVar) {
        super(context);
        m1 jnVar = new jn(this, 20);
        this.J = new ArrayList();
        this.K = new Rect();
        this.f58110a = i7;
        this.f58115n = context instanceof BubbleActivity;
        sg.k1 k1Var = new sg.k1();
        this.f58111b = k1Var;
        k1Var.f57312a = new qb.a(25);
        r5 r5Var = new r5("MaskPaint", true);
        this.f58112c = r5Var;
        this.d = weVar;
        this.f58114f = bitmap;
        this.h = i10;
        sg.i0 i0Var = new sg.i0(getPaintingSize(), bitmap2, i10, null);
        i0Var.G = true;
        sg.u0 u0Var = new sg.u0(context, i0Var, bitmap, null, null);
        this.f58113e = u0Var;
        u0Var.setAlpha(0.0f);
        u0Var.setDelegate(new qf(this, 20));
        u0Var.setUndoStore(k1Var);
        u0Var.setQueue(r5Var);
        u0Var.setVisibility(4);
        u0Var.setBrush(new Object());
        u0Var.setBrushSize(jnVar.get());
        u0Var.setColor(-65536);
        addView(u0Var, ma.e(-1, -1, 51));
        n1 n1Var = new n1(context);
        this.f58119x = n1Var;
        n1Var.b(0.05f, 1.0f);
        n1Var.setBrushWeight(jnVar.get());
        n1Var.setRenderView(u0Var);
        n1Var.setValueOverride(jnVar);
        n1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        n1Var.setAlpha(0.0f);
        addView(n1Var, ma.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f58116r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, ma.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f58117s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(m6.h0(m6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(gd.N0(2131752577, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, ma.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.f58118w = m10;
        i5.c.x(m10, 1, 15.0f);
        int i11 = m6.f29627qg;
        org.telegram.ui.Cells.y h02 = m6.h0(m6.r1(0.15f, m6.x0(null, i11, false)), 3, -1);
        p6 K = t6.K(0.15f, i11);
        m10.setBackground(h02);
        t6.j(m10, h02, null, K, null);
        m10.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        m10.setText(gd.N0(2131745750, null).toUpperCase());
        t6.U(m10, i11, null);
        m10.setGravity(17);
        frameLayout.addView(m10, ma.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private yt0 getPaintingSize() {
        float f10;
        float f11;
        yt0 yt0Var = this.f58120y;
        if (yt0Var != null) {
            return yt0Var;
        }
        Bitmap bitmap = this.f58114f;
        yt0 yt0Var2 = new yt0(bitmap.getWidth(), bitmap.getHeight());
        float f12 = 1280;
        yt0Var2.f42553a = f12;
        float floor = (float) Math.floor((f12 * f11) / f10);
        yt0Var2.f42554b = floor;
        if (floor > f12) {
            yt0Var2.f42554b = f12;
            yt0Var2.f42553a = (float) Math.floor((f12 * f10) / f11);
        }
        this.f58120y = yt0Var2;
        return yt0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        sg.u0 u0Var = this.f58113e;
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
        sg.u0 u0Var = this.f58113e;
        we weVar = this.d;
        if (weVar != null) {
            float f22 = weVar.f27704c * 1.0f;
            int measuredWidth = u0Var.getMeasuredWidth();
            int measuredHeight = u0Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i7 = weVar.f27709k;
                if (i7 == 90 || i7 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f14 / ((int) (weVar.f27705e * f18)), f15 / ((int) (weVar.f27706f * f19)));
                f16 = f22 * max;
                float D = com.google.android.gms.internal.vision.e2.D(weVar.f27702a, measuredWidth, f10, max);
                float f23 = weVar.f27704c;
                f11 += D * f23;
                f20 += weVar.f27703b * measuredHeight * f10 * max * f23;
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
        we weVar;
        int i7 = 0;
        if (view == this.f58113e && (weVar = this.d) != null) {
            canvas.save();
            if (!this.f58115n) {
                i7 = org.telegram.messenger.g0.f24140m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = weVar.f27709k;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * weVar.f27705e)) / weVar.f27704c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * weVar.f27706f)) / weVar.f27704c);
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
        Bitmap c10 = this.f58113e.c(false, false);
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
        return this.f58113e;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (!this.f58115n) {
            Typeface typeface = org.telegram.messenger.g0.f24118a;
        }
        sg.u0 u0Var = this.f58113e;
        int ceil = (int) Math.ceil((i13 - u0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - u0Var.getMeasuredHeight()) / 2;
        u0Var.layout(ceil, measuredHeight, u0Var.getMeasuredWidth() + ceil, u0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f58116r;
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
        int i11 = org.telegram.messenger.g0.f24146q.y;
        Bitmap bitmap = this.f58114f;
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
        this.f58113e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.I = 1.0f;
        measureChild(this.f58119x, i7, i10);
        measureChild(this.f58116r, i7, i10);
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
        this.f58113e.setBrush(r22);
    }
}
