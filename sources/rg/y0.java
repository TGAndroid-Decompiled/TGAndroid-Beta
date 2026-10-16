package rg;

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
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import ji.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.iw0;
import w7.z5;
public abstract class y0 extends FrameLayout {
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int f44366a;
    public final qg.t1 f44367b;
    public final DispatchQueue f44368c;
    public final MediaController.CropState d;
    public final qg.c1 e;
    public final Bitmap f44369f;
    public final int h;
    public final boolean f44370n;
    public final FrameLayout f44371r;
    public final TextView f44372s;
    public final TextView v;
    public final y1 f44373w;
    public iw0 f44374x;
    public boolean f44375y;

    public y0(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        x1 w4Var = new w4(this, 23);
        this.I = new ArrayList();
        this.J = new Rect();
        this.f44366a = i10;
        this.f44370n = context instanceof BubbleActivity;
        qg.t1 t1Var = new qg.t1();
        this.f44367b = t1Var;
        t1Var.f43327a = new Object();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.f44368c = dispatchQueue;
        this.d = cropState;
        this.f44369f = bitmap;
        this.h = i11;
        qg.q0 q0Var = new qg.q0(getPaintingSize(), bitmap2, i11, null);
        q0Var.G = true;
        qg.c1 c1Var = new qg.c1(context, q0Var, bitmap, null, null);
        this.e = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setDelegate(new x0(this));
        c1Var.setUndoStore(t1Var);
        c1Var.setQueue(dispatchQueue);
        c1Var.setVisibility(4);
        c1Var.setBrush(new Object());
        c1Var.setBrushSize(w4Var.get());
        c1Var.setColor(-65536);
        addView(c1Var, z5.e(-1, -1, 51));
        y1 y1Var = new y1(context);
        this.f44373w = y1Var;
        y1Var.b(0.05f, 1.0f);
        y1Var.setBrushWeight(w4Var.get());
        y1Var.setRenderView(c1Var);
        y1Var.setValueOverride(w4Var);
        y1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        y1Var.setAlpha(0.0f);
        addView(y1Var, z5.d(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44371r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, z5.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f44372s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(g6.g0(g6.m1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, z5.a(44.0f, -8.0f, 0.0f, 0.0f, 0.0f, -2, 3), context);
        this.v = g10;
        k3.m(15.0f, 1, g10);
        int i12 = g6.f20013zf;
        g10.setBackground(g6.g0(g6.m1(0.15f, g6.x0(null, i12, false)), 3, -1));
        g10.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        g10.setText(LocaleController.getString(R.string.Save).toUpperCase());
        g10.setTextColor(g6.x0(null, i12, false));
        g10.setGravity(17);
        frameLayout.addView(g10, z5.a(44.0f, 0.0f, 0.0f, -8.0f, 0.0f, -2, 5));
    }

    private iw0 getPaintingSize() {
        float f7;
        float f10;
        iw0 iw0Var = this.f44374x;
        if (iw0Var != null) {
            return iw0Var;
        }
        Bitmap bitmap = this.f44369f;
        iw0 iw0Var2 = new iw0(bitmap.getWidth(), bitmap.getHeight());
        float f11 = 1280;
        iw0Var2.f25809a = f11;
        float floor = (float) Math.floor((f11 * f10) / f7);
        iw0Var2.f25810b = floor;
        if (floor > f11) {
            iw0Var2.f25810b = f11;
            iw0Var2.f25809a = (float) Math.floor((f11 * f7) / f10);
        }
        this.f44374x = iw0Var2;
        return iw0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        qg.c1 c1Var = this.e;
        float translationX = ((x10 - c1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c1Var.getScaleX();
        float y3 = ((motionEvent.getY() - c1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / c1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c1Var.getRotation());
        double d10 = y3;
        float measuredWidth = (c1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (c1Var.getMeasuredHeight() / 2.0f) + ((float) i2.d.f(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c1Var.e(obtain);
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
        qg.c1 c1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f21 = cropState.cropScale * 1.0f;
            int measuredWidth = c1Var.getMeasuredWidth();
            int measuredHeight = c1Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i10 = cropState.transformRotation;
                if (i10 == 90 || i10 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f13 / ((int) (cropState.cropPw * f17)), f14 / ((int) (cropState.cropPh * f18)));
                f15 = f21 * max;
                float C = k3.C(cropState.cropPx, measuredWidth, f7, max);
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
        c1Var.setScaleX(f20);
        c1Var.setScaleY(f20);
        c1Var.setTranslationX(f10);
        c1Var.setTranslationY(f19);
        c1Var.setRotation(f16);
        c1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            if (!this.f44370n) {
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
        boolean drawChild = super.drawChild(canvas, view, j10);
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
        Bitmap c10 = this.e.c(false, false);
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

    public qg.c1 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f44370n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        qg.c1 c1Var = this.e;
        int ceil = (int) Math.ceil((i14 - c1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - c1Var.getMeasuredHeight()) / 2;
        c1Var.layout(ceil, measuredHeight, c1Var.getMeasuredWidth() + ceil, c1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f44371r;
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
        Bitmap bitmap = this.f44369f;
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
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.H = 1.0f;
        measureChild(this.f44373w, i10, i11);
        measureChild(this.f44371r, i10, i11);
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
        if (this.f44375y == z10) {
            return;
        }
        this.f44375y = z10;
        if (z10) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.e.setBrush(r22);
    }
}
