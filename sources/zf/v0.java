package zf;

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
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.tu0;

public abstract class v0 extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public float D;
    public final ArrayList E;
    public final Rect F;

    public final int f50723a;

    public final yf.s1 f50724b;

    public final DispatchQueue f50725c;
    public final MediaController.CropState d;

    public final yf.b1 f50726e;

    public final Bitmap f50727f;
    public final int h;

    public final boolean f50728n;

    public final FrameLayout f50729r;

    public final TextView f50730s;
    public final TextView v;

    public final w1 f50731w;

    public tu0 f50732x;

    public boolean f50733y;

    public v0(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        o0.b bVar = new o0.b(this, 22);
        this.E = new ArrayList();
        this.F = new Rect();
        this.f50723a = i10;
        this.f50728n = context instanceof BubbleActivity;
        yf.s1 s1Var = new yf.s1();
        this.f50724b = s1Var;
        s1Var.f50076a = new t0();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.f50725c = dispatchQueue;
        this.d = cropState;
        this.f50727f = bitmap;
        this.h = i11;
        yf.p0 p0Var = new yf.p0(getPaintingSize(), bitmap2, i11, null);
        p0Var.G = true;
        yf.b1 b1Var = new yf.b1(context, p0Var, bitmap, null, null);
        this.f50726e = b1Var;
        b1Var.setAlpha(0.0f);
        b1Var.setDelegate(new u0(this));
        b1Var.setUndoStore(s1Var);
        b1Var.setQueue(dispatchQueue);
        b1Var.setVisibility(4);
        b1Var.setBrush(new yf.f());
        b1Var.setBrushSize(bVar.get());
        b1Var.setColor(-65536);
        addView(b1Var, z5.e(-1, -1, 51));
        w1 w1Var = new w1(context);
        this.f50731w = w1Var;
        w1Var.b(0.05f, 1.0f);
        w1Var.setBrushWeight(bVar.get());
        w1Var.setRenderView(b1Var);
        w1Var.setValueOverride(bVar);
        w1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w1Var.setAlpha(0.0f);
        addView(w1Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50729r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, z5.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f50730s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(g6.f0(g6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView textViewH = pa.h(frameLayout, textView, z5.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = textViewH;
        pa.m(15.0f, 1, textViewH);
        int i12 = g6.f23449zf;
        textViewH.setBackground(g6.f0(g6.l1(0.15f, g6.w0(null, i12, false)), 3, -1));
        textViewH.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textViewH.setText(LocaleController.getString(R.string.Save).toUpperCase());
        textViewH.setTextColor(g6.w0(null, i12, false));
        textViewH.setGravity(17);
        frameLayout.addView(textViewH, z5.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private tu0 getPaintingSize() {
        tu0 tu0Var = this.f50732x;
        if (tu0Var != null) {
            return tu0Var;
        }
        Bitmap bitmap = this.f50727f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        tu0 tu0Var2 = new tu0(width, height);
        float f10 = 1280;
        tu0Var2.f32893a = f10;
        float fFloor = (float) Math.floor((f10 * height) / width);
        tu0Var2.f32894b = fFloor;
        if (fFloor > f10) {
            tu0Var2.f32894b = f10;
            tu0Var2.f32893a = (float) Math.floor((f10 * width) / height);
        }
        this.f50732x = tu0Var2;
        return tu0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        yf.b1 b1Var = this.f50726e;
        float translationX = ((x8 - b1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b1Var.getScaleX();
        float y10 = ((motionEvent.getY() - b1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / b1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b1Var.getRotation());
        double d10 = y10;
        float measuredWidth = (b1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (b1Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.b(radians, d10, Math.sin(radians) * d));
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(measuredWidth, measuredHeight);
        b1Var.e(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        this.A = f11;
        float f18 = 0.0f + f12;
        this.B = f18;
        yf.b1 b1Var = this.f50726e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f19 = cropState.cropScale * 1.0f;
            int measuredWidth = b1Var.getMeasuredWidth();
            int measuredHeight = b1Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float f20 = measuredWidth;
            float f21 = measuredHeight;
            float fMax = Math.max(f14 / ((int) (cropState.cropPw * f20)), f15 / ((int) (cropState.cropPh * f21)));
            f16 = f19 * fMax;
            float fC = com.google.android.recaptcha.internal.a.C(cropState.cropPx, f20, f10, fMax);
            float f22 = cropState.cropScale;
            f11 += fC * f22;
            f18 += cropState.cropPy * f21 * f10 * fMax * f22;
            f17 = cropState.cropRotate + i10 + f13;
        } else {
            f16 = this.D * 1.0f;
            f17 = f13;
        }
        float f23 = f10 * f16;
        float f24 = Float.isNaN(f23) ? 1.0f : f23;
        b1Var.setScaleX(f24);
        b1Var.setScaleY(f24);
        b1Var.setTranslationX(f11);
        b1Var.setTranslationY(f18);
        b1Var.setRotation(f17);
        b1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if (view == this.f50726e && (cropState = this.d) != null) {
            canvas.save();
            i10 = this.f50728n ? 0 : AndroidUtilities.statusBarHeight;
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
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.A;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i10 + this.B;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, additionalBottom), Math.min(fCeil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public int getAdditionalBottom() {
        return 0;
    }

    public int getAdditionalTop() {
        return 0;
    }

    public Bitmap getBitmap() {
        Bitmap bitmapC = this.f50726e.c(false, false);
        int i10 = this.h;
        if (i10 == 0) {
            return bitmapC;
        }
        int width = bitmapC.getWidth();
        int height = bitmapC.getHeight();
        if ((i10 / 90) % 2 != 0) {
            width = bitmapC.getHeight();
            height = bitmapC.getWidth();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(width / 2.0f, height / 2.0f);
        canvas.rotate(-i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-bitmapC.getWidth()) / 2.0f, (-bitmapC.getHeight()) / 2.0f, bitmapC.getWidth() / 2.0f, bitmapC.getHeight() / 2.0f);
        canvas.drawBitmap(bitmapC, (Rect) null, rectF, new Paint(3));
        bitmapC.recycle();
        return bitmapCreateBitmap;
    }

    public yf.b1 getRenderView() {
        return this.f50726e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f50728n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        yf.b1 b1Var = this.f50726e;
        int iCeil = (int) Math.ceil((i14 - b1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - b1Var.getMeasuredHeight()) / 2;
        b1Var.layout(iCeil, measuredHeight, b1Var.getMeasuredWidth() + iCeil, b1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f50729r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float height;
        float width;
        this.C = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.f50727f;
        if (bitmap != null) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else {
            height = size2;
            width = size;
        }
        float fFloor = size;
        float fFloor2 = (float) Math.floor((fFloor * height) / width);
        float f10 = i12;
        if (fFloor2 > f10) {
            fFloor = (float) Math.floor((width * f10) / height);
            fFloor2 = f10;
        }
        this.f50726e.measure(View.MeasureSpec.makeMeasureSpec((int) fFloor, 1073741824), View.MeasureSpec.makeMeasureSpec((int) fFloor2, 1073741824));
        this.D = 1.0f;
        measureChild(this.f50731w, i10, i11);
        measureChild(this.f50729r, i10, i11);
        this.C = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.E;
            arrayList.clear();
            Rect rect = this.F;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z10) {
        if (this.f50733y == z10) {
            return;
        }
        this.f50733y = z10;
        this.f50726e.setBrush(z10 ? new yf.d() : new yf.f());
    }
}
