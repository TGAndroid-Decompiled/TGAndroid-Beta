package zf;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;

public abstract class i extends FrameLayout {

    public final Paint f50428a;

    public final Paint f50429b;

    public final Paint f50430c;
    public int d;

    public final y5 f50431e;

    public boolean f50432f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f50428a = paint;
        Paint paint2 = new Paint(1);
        this.f50429b = paint2;
        Paint paint3 = new Paint(1);
        this.f50430c = paint3;
        this.f50431e = new y5(this, 0L, 250L, er.h);
        this.f50432f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint3.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f10, float f11);

    public final void b() {
        j jVar = this.h;
        yj0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f34911a;
        layoutParams.topMargin = (int) selectionBounds.f34912b;
        layoutParams.width = (int) selectionBounds.f34913c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.f50431e.e(this.f50432f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zC;
        boolean z10;
        double dAtan2;
        h hVar;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        j jVar = this.h;
        h hVar2 = jVar.B;
        e eVar = jVar.E;
        float[] fArr = jVar.f50452c0;
        float[] fArr2 = jVar.f50450b0;
        float[] fArr3 = jVar.f50448a0;
        hVar2.v(rawX, rawY, fArr3);
        boolean z11 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z11) {
            if (Build.VERSION.SDK_INT >= 29) {
                jVar.B.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            } else {
                z11 = false;
            }
        }
        if (z11) {
            fArr[0] = (fArr3[0] + fArr2[0]) / 2.0f;
            fArr[1] = (fArr3[1] + fArr2[1]) / 2.0f;
        } else {
            fArr[0] = fArr3[0];
            fArr[1] = fArr3[1];
        }
        if (jVar.V != z11) {
            jVar.f50449b = fArr3[0];
            jVar.f50451c = fArr3[1];
            jVar.d = fArr2[0];
            jVar.f50454e = fArr2[1];
            jVar.f50456f = fArr[0];
            jVar.h = fArr[1];
            this.f50432f = !z11;
            invalidate();
        }
        jVar.V = z11;
        float[] fArr4 = jVar.f50452c0;
        float f10 = fArr4[0];
        float f11 = fArr4[1];
        if (actionMasked == 0) {
            jVar.W = false;
            int iA = a(motionEvent.getX(), motionEvent.getY());
            if (iA != 0) {
                this.d = iA;
                jVar.f50449b = fArr3[0];
                jVar.f50451c = fArr3[1];
                jVar.f50456f = f10;
                jVar.h = f11;
                jVar.f50464r = false;
                if (getParent() instanceof d) {
                    ((d) getParent()).invalidate();
                }
                if (iA == 3 && (jVar instanceof b2)) {
                    AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                }
                zC = true;
            } else {
                zC = false;
            }
        } else if (actionMasked == 1) {
            if (actionMasked == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            jVar.d(z10);
            this.d = 0;
            this.f50432f = true;
            invalidate();
            zC = true;
        } else {
            if (actionMasked == 2) {
                int i10 = this.d;
                if (i10 == 3) {
                    float[] fArr5 = jVar.f50448a0;
                    float f12 = fArr5[0];
                    float f13 = fArr5[1];
                    float[] fArr6 = jVar.f50450b0;
                    zC = jVar.c(f12, f13, z11, fArr6[0], fArr6[1]);
                } else if (i10 != 0) {
                    float f14 = f10 - jVar.f50449b;
                    float f15 = f11 - jVar.f50451c;
                    if (jVar.f50465s || Math.abs(f14) > AndroidUtilities.dp(2.0f) || Math.abs(f15) > AndroidUtilities.dp(2.0f)) {
                        if (!jVar.f50465s && (hVar = jVar.B) != null) {
                            hVar.y();
                        }
                        jVar.f50465s = true;
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        int[] iArrW = jVar.B.w(jVar);
                        float fA = h7.y.a(iArrW[0], iArrW[1], jVar.f50449b, jVar.f50451c);
                        float fA2 = h7.y.a(iArrW[0], iArrW[1], f10, f11);
                        float f16 = 0.0f;
                        if (fA > 0.0f) {
                            jVar.j(fA2 / fA);
                        }
                        int i11 = this.d;
                        if (i11 == 1) {
                            dAtan2 = Math.atan2(iArrW[1] - f11, iArrW[0] - f10);
                        } else {
                            if (i11 == 2) {
                                dAtan2 = Math.atan2(f11 - iArrW[1], f10 - iArrW[0]);
                            }
                            jVar.f((float) Math.toDegrees(f16));
                            jVar.f50449b = f10;
                            jVar.f50451c = f11;
                        }
                        f16 = (float) dAtan2;
                        jVar.f((float) Math.toDegrees(f16));
                        jVar.f50449b = f10;
                        jVar.f50451c = f11;
                    }
                    zC = true;
                }
            } else if (actionMasked == 3) {
                if (actionMasked == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jVar.d(z10);
                this.d = 0;
                this.f50432f = true;
                invalidate();
                zC = true;
            }
            zC = false;
        }
        jVar.W = z11;
        return super.onTouchEvent(motionEvent) || zC;
    }
}
