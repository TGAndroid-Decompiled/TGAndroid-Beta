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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.iw0;
import w7.z5;
public abstract class w0 extends FrameLayout {
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int f46101a;
    public final qg.v1 f46102b;
    public final DispatchQueue f46103c;
    public final MediaController.CropState d;
    public final qg.e1 e;
    public final Bitmap f46104f;
    public final int h;
    public final boolean f46105n;
    public final FrameLayout f46106r;
    public final TextView f46107s;
    public final TextView v;
    public final x1 f46108w;
    public iw0 f46109x;
    public boolean f46110y;

    public w0(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        w1 t1Var = new ki.t1(this, 25);
        this.I = new ArrayList();
        this.J = new Rect();
        this.f46101a = i10;
        this.f46105n = context instanceof BubbleActivity;
        qg.v1 v1Var = new qg.v1();
        this.f46102b = v1Var;
        v1Var.f45105a = new Object();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.f46103c = dispatchQueue;
        this.d = cropState;
        this.f46104f = bitmap;
        this.h = i11;
        qg.s0 s0Var = new qg.s0(getPaintingSize(), bitmap2, i11, null);
        s0Var.G = true;
        qg.e1 e1Var = new qg.e1(context, s0Var, bitmap, null, null);
        this.e = e1Var;
        e1Var.setAlpha(0.0f);
        e1Var.setDelegate(new v0(this));
        e1Var.setUndoStore(v1Var);
        e1Var.setQueue(dispatchQueue);
        e1Var.setVisibility(4);
        e1Var.setBrush(new Object());
        e1Var.setBrushSize(t1Var.get());
        e1Var.setColor(-65536);
        addView(e1Var, z5.e(-1, -1, 51));
        x1 x1Var = new x1(context);
        this.f46108w = x1Var;
        x1Var.b(0.05f, 1.0f);
        x1Var.setBrushWeight(t1Var.get());
        x1Var.setRenderView(e1Var);
        x1Var.setValueOverride(t1Var);
        x1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        x1Var.setAlpha(0.0f);
        addView(x1Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46106r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, z5.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f46107s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(k6.g0(k6.o1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout, textView, z5.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = j10;
        k3.m(15.0f, 1, j10);
        int i12 = k6.f21596zf;
        org.telegram.ui.Cells.y g02 = k6.g0(k6.o1(0.15f, k6.x0(null, i12, false)), 3, -1);
        n6 M = r6.M(0.15f, i12);
        j10.setBackground(g02);
        r6.k(j10, g02, null, M, null);
        j10.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        j10.setText(LocaleController.getString(R.string.Save).toUpperCase());
        r6.W(j10, i12, null);
        j10.setGravity(17);
        frameLayout.addView(j10, z5.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private iw0 getPaintingSize() {
        float f7;
        float f10;
        iw0 iw0Var = this.f46109x;
        if (iw0Var != null) {
            return iw0Var;
        }
        Bitmap bitmap = this.f46104f;
        iw0 iw0Var2 = new iw0(bitmap.getWidth(), bitmap.getHeight());
        float f11 = 1280;
        iw0Var2.f27465a = f11;
        float floor = (float) Math.floor((f11 * f10) / f7);
        iw0Var2.f27466b = floor;
        if (floor > f11) {
            iw0Var2.f27466b = f11;
            iw0Var2.f27465a = (float) Math.floor((f11 * f7) / f10);
        }
        this.f46109x = iw0Var2;
        return iw0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        qg.e1 e1Var = this.e;
        float translationX = ((x10 - e1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / e1Var.getScaleX();
        float y3 = ((motionEvent.getY() - e1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / e1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-e1Var.getRotation());
        double d10 = y3;
        float measuredWidth = (e1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (e1Var.getMeasuredHeight() / 2.0f) + ((float) i2.o1.f(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        e1Var.e(obtain);
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
        qg.e1 e1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f21 = cropState.cropScale * 1.0f;
            int measuredWidth = e1Var.getMeasuredWidth();
            int measuredHeight = e1Var.getMeasuredHeight();
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
        e1Var.setScaleX(f20);
        e1Var.setScaleY(f20);
        e1Var.setTranslationX(f10);
        e1Var.setTranslationY(f19);
        e1Var.setRotation(f16);
        e1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            if (!this.f46105n) {
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

    public qg.e1 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f46105n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        qg.e1 e1Var = this.e;
        int ceil = (int) Math.ceil((i14 - e1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - e1Var.getMeasuredHeight()) / 2;
        e1Var.layout(ceil, measuredHeight, e1Var.getMeasuredWidth() + ceil, e1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f46106r;
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
        Bitmap bitmap = this.f46104f;
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
        measureChild(this.f46108w, i10, i11);
        measureChild(this.f46106r, i10, i11);
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
        if (this.f46110y == z10) {
            return;
        }
        this.f46110y = z10;
        if (z10) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.e.setBrush(r22);
    }
}
