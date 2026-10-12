package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.sw0;
import w7.w5;
public abstract class w0 extends FrameLayout {
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int f46524a;
    public final pg.u1 f46525b;
    public final DispatchQueue f46526c;
    public final MediaController.CropState d;
    public final pg.d1 f46527e;
    public final Bitmap f46528f;
    public final int h;
    public final boolean f46529n;
    public final FrameLayout f46530r;
    public final TextView f46531s;
    public final TextView v;
    public final w1 f46532w;
    public sw0 f46533x;
    public boolean f46534y;

    public w0(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        v1 y0Var = new m.y0(this, 16);
        this.I = new ArrayList();
        this.J = new Rect();
        this.f46524a = i10;
        this.f46529n = context instanceof BubbleActivity;
        pg.u1 u1Var = new pg.u1();
        this.f46525b = u1Var;
        u1Var.f45695a = new Object();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.f46526c = dispatchQueue;
        this.d = cropState;
        this.f46528f = bitmap;
        this.h = i11;
        pg.r0 r0Var = new pg.r0(getPaintingSize(), bitmap2, i11, null);
        r0Var.G = true;
        pg.d1 d1Var = new pg.d1(context, r0Var, bitmap, null, null);
        this.f46527e = d1Var;
        d1Var.setAlpha(0.0f);
        d1Var.setDelegate(new v0(this));
        d1Var.setUndoStore(u1Var);
        d1Var.setQueue(dispatchQueue);
        d1Var.setVisibility(4);
        d1Var.setBrush(new Object());
        d1Var.setBrushSize(y0Var.get());
        d1Var.setColor(-65536);
        addView(d1Var, w5.e(-1, -1, 51));
        w1 w1Var = new w1(context);
        this.f46532w = w1Var;
        w1Var.b(0.05f, 1.0f);
        w1Var.setBrushWeight(y0Var.get());
        w1Var.setRenderView(d1Var);
        w1Var.setValueOverride(y0Var);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, w5.d(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46530r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, w5.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f46531s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(h6.g0(h6.m1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w5.a(44.0f, -8.0f, 0.0f, 0.0f, 0.0f, -2, 3), context);
        this.v = g10;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, g10);
        int i12 = h6.f20972zf;
        g10.setBackground(h6.g0(h6.m1(0.15f, h6.x0(null, i12, false)), 3, -1));
        g10.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        g10.setText(LocaleController.getString(R.string.Save).toUpperCase());
        g10.setTextColor(h6.x0(null, i12, false));
        g10.setGravity(17);
        frameLayout.addView(g10, w5.a(44.0f, 0.0f, 0.0f, -8.0f, 0.0f, -2, 5));
    }

    private sw0 getPaintingSize() {
        float f7;
        float f10;
        sw0 sw0Var = this.f46533x;
        if (sw0Var != null) {
            return sw0Var;
        }
        Bitmap bitmap = this.f46528f;
        sw0 sw0Var2 = new sw0(bitmap.getWidth(), bitmap.getHeight());
        float f11 = 1280;
        sw0Var2.f30696a = f11;
        float floor = (float) Math.floor((f11 * f10) / f7);
        sw0Var2.f30697b = floor;
        if (floor > f11) {
            sw0Var2.f30697b = f11;
            sw0Var2.f30696a = (float) Math.floor((f11 * f7) / f10);
        }
        this.f46533x = sw0Var2;
        return sw0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        pg.d1 d1Var = this.f46527e;
        float translationX = ((x10 - d1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / d1Var.getScaleX();
        float y3 = ((motionEvent.getY() - d1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / d1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-d1Var.getRotation());
        double d10 = y3;
        float measuredWidth = (d1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (d1Var.getMeasuredHeight() / 2.0f) + ((float) hg.c.e(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        d1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        this.E = f10;
        float f19 = 0.0f + f11;
        this.F = f19;
        float f20 = 1.0f;
        pg.d1 d1Var = this.f46527e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f21 = cropState.cropScale * 1.0f;
            int measuredWidth = d1Var.getMeasuredWidth();
            int measuredHeight = d1Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i10 = cropState.transformRotation;
                if (i10 == 90 || i10 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f13 / ((int) (cropState.cropPw * f17)), f14 / ((int) (cropState.cropPh * f18)));
                f15 = f21 * max;
                float C = com.google.android.gms.internal.vision.e2.C(cropState.cropPx, measuredWidth, f7, max);
                float f22 = cropState.cropScale;
                f10 += C * f22;
                f19 += cropState.cropPy * measuredHeight * f7 * max * f22;
                f16 = cropState.cropRotate + i10 + f12;
            } else {
                return;
            }
        } else {
            f15 = this.H * 1.0f;
            f16 = f12;
        }
        float f23 = f7 * f15;
        if (!Float.isNaN(f23)) {
            f20 = f23;
        }
        d1Var.setScaleX(f20);
        d1Var.setScaleY(f20);
        d1Var.setTranslationX(f10);
        d1Var.setTranslationY(f19);
        d1Var.setRotation(f16);
        d1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        MediaController.CropState cropState;
        int i10 = 0;
        if (view == this.f46527e && (cropState = this.d) != null) {
            canvas.save();
            if (!this.f46529n) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = cropState.transformRotation;
            if (i11 == 90 || i11 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.E;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i10 + this.F;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i10 != 0) {
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
        Bitmap c10 = this.f46527e.c(false, false);
        int i10 = this.h;
        if (i10 != 0) {
            int width = c10.getWidth();
            int height = c10.getHeight();
            if ((i10 / 90) % 2 != 0) {
                width = c10.getHeight();
                height = c10.getWidth();
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(width / 2.0f, height / 2.0f);
            canvas.rotate(-i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((-c10.getWidth()) / 2.0f, (-c10.getHeight()) / 2.0f, c10.getWidth() / 2.0f, c10.getHeight() / 2.0f);
            canvas.drawBitmap(c10, (Rect) null, rectF, new Paint(3));
            c10.recycle();
            return createBitmap;
        }
        return c10;
    }

    public pg.d1 getRenderView() {
        return this.f46527e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f46529n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        pg.d1 d1Var = this.f46527e;
        int ceil = (int) Math.ceil((i14 - d1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - d1Var.getMeasuredHeight()) / 2;
        d1Var.layout(ceil, measuredHeight, d1Var.getMeasuredWidth() + ceil, d1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f46530r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        this.G = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.f46528f;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            f7 = bitmap.getHeight();
        } else {
            f7 = size2;
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * f7) / f10);
        float f12 = i12;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / f7);
            floor = f12;
        }
        this.f46527e.measure(View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.H = 1.0f;
        measureChild(this.f46532w, i10, i11);
        measureChild(this.f46530r, i10, i11);
        this.G = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.I;
            arrayList.clear();
            Rect rect = this.J;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
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

    public void setEraser(boolean z10) {
        ?? r22;
        if (this.f46534y == z10) {
            return;
        }
        this.f46534y = z10;
        if (z10) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.f46527e.setBrush(r22);
    }
}
