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
import org.telegram.messenger.id;
import org.telegram.messenger.q5;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;
public abstract class o0 extends FrameLayout {
    public boolean D;
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int f55884a;
    public final sg.l1 f55885b;
    public final q5 f55886c;
    public final ye d;
    public final sg.v0 f55887e;
    public final Bitmap f55888f;
    public final int h;
    public final boolean f55889n;
    public final FrameLayout f55890r;
    public final TextView f55891s;
    public final TextView f55892w;
    public final m1 f55893x;
    public ot0 f55894y;

    public o0(Context context, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ye yeVar) {
        super(context);
        l1 vyVar = new vy(this, 20);
        this.I = new ArrayList();
        this.J = new Rect();
        this.f55884a = i7;
        this.f55889n = context instanceof BubbleActivity;
        sg.l1 l1Var = new sg.l1();
        this.f55885b = l1Var;
        l1Var.f55147a = new w7.s(24, false);
        q5 q5Var = new q5("MaskPaint", true);
        this.f55886c = q5Var;
        this.d = yeVar;
        this.f55888f = bitmap;
        this.h = i10;
        sg.j0 j0Var = new sg.j0(getPaintingSize(), bitmap2, i10, null);
        j0Var.G = true;
        sg.v0 v0Var = new sg.v0(context, j0Var, bitmap, null, null);
        this.f55887e = v0Var;
        v0Var.setAlpha(0.0f);
        v0Var.setDelegate(new rt(this, 17));
        v0Var.setUndoStore(l1Var);
        v0Var.setQueue(q5Var);
        v0Var.setVisibility(4);
        v0Var.setBrush(new Object());
        v0Var.setBrushSize(vyVar.get());
        v0Var.setColor(-65536);
        addView(v0Var, ha.e(-1, -1, 51));
        m1 m1Var = new m1(context);
        this.f55893x = m1Var;
        m1Var.b(0.05f, 1.0f);
        m1Var.setBrushWeight(vyVar.get());
        m1Var.setRenderView(v0Var);
        m1Var.setValueOverride(vyVar);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ha.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f55890r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, ha.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f55891s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(l6.h0(l6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        textView.setText(id.M0(2131752589, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.f55892w = i11;
        com.google.android.recaptcha.internal.a.q(i11, 1, 15.0f);
        int i12 = l6.f28056ng;
        org.telegram.ui.Cells.y h02 = l6.h0(l6.r1(0.15f, l6.x0(null, i12, false)), 3, -1);
        o6 K = s6.K(0.15f, i12);
        i11.setBackground(h02);
        s6.j(i11, h02, null, K, null);
        i11.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        i11.setText(id.M0(2131745946, null).toUpperCase());
        s6.U(i11, i12, null);
        i11.setGravity(17);
        frameLayout.addView(i11, ha.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private ot0 getPaintingSize() {
        float f10;
        float f11;
        ot0 ot0Var = this.f55894y;
        if (ot0Var != null) {
            return ot0Var;
        }
        Bitmap bitmap = this.f55888f;
        ot0 ot0Var2 = new ot0(bitmap.getWidth(), bitmap.getHeight());
        float f12 = 1280;
        ot0Var2.f36801a = f12;
        float floor = (float) Math.floor((f12 * f11) / f10);
        ot0Var2.f36802b = floor;
        if (floor > f12) {
            ot0Var2.f36802b = f12;
            ot0Var2.f36801a = (float) Math.floor((f12 * f10) / f11);
        }
        this.f55894y = ot0Var2;
        return ot0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        sg.v0 v0Var = this.f55887e;
        float translationX = ((x10 - v0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / v0Var.getScaleX();
        float y10 = ((motionEvent.getY() - v0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / v0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-v0Var.getRotation());
        double d2 = y10;
        float measuredWidth = (v0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (v0Var.getMeasuredHeight() / 2.0f) + ((float) jg.g.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        v0Var.e(obtain);
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
        sg.v0 v0Var = this.f55887e;
        ye yeVar = this.d;
        if (yeVar != null) {
            float f22 = yeVar.f26637c * 1.0f;
            int measuredWidth = v0Var.getMeasuredWidth();
            int measuredHeight = v0Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i7 = yeVar.f26642k;
                if (i7 == 90 || i7 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f14 / ((int) (yeVar.f26638e * f18)), f15 / ((int) (yeVar.f26639f * f19)));
                f16 = f22 * max;
                float D = com.google.android.recaptcha.internal.a.D(yeVar.f26635a, measuredWidth, f10, max);
                float f23 = yeVar.f26637c;
                f11 += D * f23;
                f20 += yeVar.f26636b * measuredHeight * f10 * max * f23;
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
        v0Var.setScaleX(f21);
        v0Var.setScaleY(f21);
        v0Var.setTranslationX(f11);
        v0Var.setTranslationY(f20);
        v0Var.setRotation(f17);
        v0Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ye yeVar;
        int i7 = 0;
        if (view == this.f55887e && (yeVar = this.d) != null) {
            canvas.save();
            if (!this.f55889n) {
                i7 = org.telegram.messenger.g0.f22557m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = yeVar.f26642k;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * yeVar.f26638e)) / yeVar.f26637c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * yeVar.f26639f)) / yeVar.f26637c);
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
        Bitmap c10 = this.f55887e.c(false, false);
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

    public sg.v0 getRenderView() {
        return this.f55887e;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (!this.f55889n) {
            Typeface typeface = org.telegram.messenger.g0.f22535a;
        }
        sg.v0 v0Var = this.f55887e;
        int ceil = (int) Math.ceil((i13 - v0Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i14 - v0Var.getMeasuredHeight()) / 2;
        v0Var.layout(ceil, measuredHeight, v0Var.getMeasuredWidth() + ceil, v0Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f55890r;
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
        int i11 = org.telegram.messenger.g0.f22563q.y;
        Bitmap bitmap = this.f55888f;
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
        this.f55887e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.H = 1.0f;
        measureChild(this.f55893x, i7, i10);
        measureChild(this.f55890r, i7, i10);
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
        this.f55887e.setBrush(r22);
    }
}
