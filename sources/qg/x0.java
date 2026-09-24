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
import org.telegram.ui.Components.uv0;
import w7.y5;
public abstract class x0 extends FrameLayout {
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int f41968a;
    public final pg.w1 f41969b;
    public final DispatchQueue f41970c;
    public final MediaController.CropState d;
    public final pg.f1 e;
    public final Bitmap f41971f;
    public final int h;
    public final boolean f41972n;
    public final FrameLayout f41973r;
    public final TextView f41974s;
    public final TextView v;
    public final x1 f41975w;
    public uv0 f41976x;
    public boolean f41977y;

    public x0(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        w1 uVar = new k2.u(this, 20);
        this.I = new ArrayList();
        this.J = new Rect();
        this.f41968a = i10;
        this.f41972n = context instanceof BubbleActivity;
        pg.w1 w1Var = new pg.w1();
        this.f41969b = w1Var;
        w1Var.f41287a = new Object();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.f41970c = dispatchQueue;
        this.d = cropState;
        this.f41971f = bitmap;
        this.h = i11;
        pg.s0 s0Var = new pg.s0(getPaintingSize(), bitmap2, i11, null);
        s0Var.G = true;
        pg.f1 f1Var = new pg.f1(context, s0Var, bitmap, null, null);
        this.e = f1Var;
        f1Var.setAlpha(0.0f);
        f1Var.setDelegate(new w0(this));
        f1Var.setUndoStore(w1Var);
        f1Var.setQueue(dispatchQueue);
        f1Var.setVisibility(4);
        f1Var.setBrush(new Object());
        f1Var.setBrushSize(uVar.get());
        f1Var.setColor(-65536);
        addView(f1Var, y5.e(-1, -1, 51));
        x1 x1Var = new x1(context);
        this.f41975w = x1Var;
        x1Var.b(0.05f, 1.0f);
        x1Var.setBrushWeight(uVar.get());
        x1Var.setRenderView(f1Var);
        x1Var.setValueOverride(uVar);
        x1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        x1Var.setAlpha(0.0f);
        addView(x1Var, y5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41973r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, y5.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f41974s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(h6.f0(h6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, y5.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = h;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, h);
        int i12 = h6.f19456zf;
        h.setBackground(h6.f0(h6.l1(0.15f, h6.w0(null, i12, false)), 3, -1));
        h.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        h.setText(LocaleController.getString(R.string.Save).toUpperCase());
        h.setTextColor(h6.w0(null, i12, false));
        h.setGravity(17);
        frameLayout.addView(h, y5.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private uv0 getPaintingSize() {
        float f7;
        float f10;
        uv0 uv0Var = this.f41976x;
        if (uv0Var != null) {
            return uv0Var;
        }
        Bitmap bitmap = this.f41971f;
        uv0 uv0Var2 = new uv0(bitmap.getWidth(), bitmap.getHeight());
        float f11 = 1280;
        uv0Var2.f28926a = f11;
        float floor = (float) Math.floor((f11 * f10) / f7);
        uv0Var2.f28927b = floor;
        if (floor > f11) {
            uv0Var2.f28927b = f11;
            uv0Var2.f28926a = (float) Math.floor((f11 * f7) / f10);
        }
        this.f41976x = uv0Var2;
        return uv0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        pg.f1 f1Var = this.e;
        float translationX = ((x10 - f1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / f1Var.getScaleX();
        float y3 = ((motionEvent.getY() - f1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / f1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-f1Var.getRotation());
        double d10 = y3;
        float measuredWidth = (f1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (f1Var.getMeasuredHeight() / 2.0f) + ((float) hg.c.e(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        f1Var.e(obtain);
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
        pg.f1 f1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f21 = cropState.cropScale * 1.0f;
            int measuredWidth = f1Var.getMeasuredWidth();
            int measuredHeight = f1Var.getMeasuredHeight();
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
        f1Var.setScaleX(f20);
        f1Var.setScaleY(f20);
        f1Var.setTranslationX(f10);
        f1Var.setTranslationY(f19);
        f1Var.setRotation(f16);
        f1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        MediaController.CropState cropState;
        int i10 = 0;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            if (!this.f41972n) {
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

    public pg.f1 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f41972n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        pg.f1 f1Var = this.e;
        int ceil = (int) Math.ceil((i14 - f1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - f1Var.getMeasuredHeight()) / 2;
        f1Var.layout(ceil, measuredHeight, f1Var.getMeasuredWidth() + ceil, f1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f41973r;
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
        Bitmap bitmap = this.f41971f;
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
        measureChild(this.f41975w, i10, i11);
        measureChild(this.f41973r, i10, i11);
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
        if (this.f41977y == z10) {
            return;
        }
        this.f41977y = z10;
        if (z10) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.e.setBrush(r22);
    }
}
