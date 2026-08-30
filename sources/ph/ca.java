package ph;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.uo;
public final class ca extends qv0 {
    public float A0;
    public final da B0;
    public final ja.c f41394t0;
    public final ScaleGestureDetector f41395u0;
    public boolean f41396v0;
    public boolean f41397w0;
    public boolean f41398x0;
    public float f41399y0;
    public float f41400z0;

    public ca(da daVar, Activity activity) {
        super(activity, null);
        this.B0 = daVar;
        this.f41398x0 = false;
        this.f41394t0 = new ja.c(activity, new aa(this));
        this.f41395u0 = new ScaleGestureDetector(activity, new ba(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        da daVar = this.B0;
        float width = bitmap.getWidth() / daVar.f41512n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = daVar.U0.getTextureView();
        if (textureView == null) {
            textureView = daVar.U0.f41899r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(daVar.f41486e0.getX() + daVar.f41525r.getX(), daVar.f41486e0.getY() + daVar.f41525r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f10), (int) (textureView.getHeight() / f10));
                float f11 = 1.0f / width;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(daVar.f41525r.getX(), daVar.f41525r.getY());
        for (int i10 = 0; i10 < daVar.f41525r.getChildCount(); i10++) {
            View childAt = daVar.f41525r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == daVar.f41486e0) {
                    for (int i11 = 0; i11 < daVar.f41486e0.getChildCount(); i11++) {
                        View childAt2 = daVar.f41486e0.getChildAt(i11);
                        if (childAt2 != daVar.U0 && childAt2 != daVar.f41551y0 && childAt2.getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            childAt2.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    childAt.draw(canvas);
                }
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: ph.ca.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.B0.M();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4 = false;
        this.f41396v0 = false;
        da daVar = this.B0;
        u uVar = daVar.F0;
        boolean z10 = true;
        if (uVar != null && uVar.e) {
            float y10 = daVar.F0.getY() + daVar.f41490f0.getY() + daVar.f41525r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + daVar.F0.getHeight()) || this.f41397w0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z4 = true;
                }
                this.f41397w0 = z4;
                return super.dispatchTouchEvent(motionEvent);
            }
            daVar.F0.a(false, true);
            daVar.m0(true);
        }
        if (this.f41397w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f41397w0 = false;
        }
        this.f41395u0.onTouchEvent(motionEvent);
        this.f41394t0.v0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f41396v0) {
            if (daVar.f41525r.getTranslationY() > 0.0f) {
                if (daVar.H > 0.4f) {
                    daVar.q(true);
                } else {
                    da.c(daVar);
                }
            } else {
                e9 e9Var = daVar.J0;
                if (e9Var != null && e9Var.getTranslationY() > 0.0f && !daVar.I0) {
                    daVar.f((daVar.N1 || daVar.J0.getTranslationY() >= ((float) daVar.J0.getPadding())) ? false : false);
                }
            }
            daVar.I0 = false;
            daVar.T = false;
            daVar.U = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        da daVar = this.B0;
        return (height - daVar.f41525r.getBottom()) + daVar.R;
    }

    public int getBottomPadding2() {
        return getHeight() - this.B0.f41525r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        da daVar = this.B0;
        return (height - daVar.Y) - daVar.f41525r.getBottom();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ah.d dVar;
        kz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        da daVar = this.B0;
        int i15 = daVar.W;
        int measuredHeight2 = daVar.f41502j0.getMeasuredHeight();
        if (daVar.S) {
            i15 = 0;
        }
        int i16 = daVar.P;
        int b10 = k7.n.b((measuredWidth - i16) / 2, daVar.V, (measuredWidth - daVar.X) - i16);
        int i17 = daVar.P + b10;
        if (daVar.S) {
            i14 = daVar.Q;
        } else {
            int i18 = daVar.Y;
            int i19 = daVar.Q;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (daVar.G == 1) {
                float f10 = daVar.E.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                    i14 = daVar.Q;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = daVar.Q;
        }
        daVar.f41525r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        daVar.f41529s.f41422b.layout(0, 0, measuredWidth, measuredHeight);
        uo uoVar = daVar.f41556z2;
        if (uoVar != null) {
            uoVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        e9 e9Var = daVar.J0;
        if (e9Var != null) {
            e9Var.layout((measuredWidth - e9Var.getMeasuredWidth()) / 2, 0, (daVar.J0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null && (emojiView = t9Var.f41809f.getEmojiView()) != null) {
            emojiView.layout(daVar.V, (measuredHeight - daVar.Y) - emojiView.getMeasuredHeight(), measuredWidth - daVar.X, measuredHeight - daVar.Y);
        }
        h9 h9Var = daVar.f41531s1;
        if (h9Var != null) {
            kz kzVar = h9Var.f41349m2;
            if (kzVar != null) {
                kzVar.layout(daVar.V, (measuredHeight - daVar.Y) - kzVar.getMeasuredHeight(), measuredWidth - daVar.X, measuredHeight - daVar.Y);
            }
            pk0 pk0Var = daVar.f41531s1.W1;
            if (pk0Var != null) {
                int i21 = daVar.V;
                pk0Var.layout(i21, daVar.W, pk0Var.getMeasuredWidth() + i21, daVar.f41531s1.W1.getMeasuredHeight() + daVar.W);
                if (daVar.f41531s1.W1.getReactionsWindow() != null) {
                    dVar = daVar.f41531s1.W1.getReactionsWindow().f13974c;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    int i22 = daVar.V;
                    dVar.layout(i22, daVar.W, dVar.getMeasuredWidth() + i22, dVar.getMeasuredHeight() + daVar.W);
                }
            }
        }
        n9 n9Var = daVar.f41517o1;
        if (n9Var != null) {
            n9Var.e.setPadding(0, daVar.W, 0, daVar.Y);
            daVar.f41517o1.layout(0, 0, measuredWidth, measuredHeight);
            daVar.f41517o1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        o9 o9Var = daVar.f41520p1;
        if (o9Var != null) {
            o9Var.f41596f.setPadding(0, daVar.W, 0, daVar.Y);
            daVar.f41520p1.layout(0, 0, measuredWidth, measuredHeight);
            daVar.f41520p1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof m0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        da daVar = this.B0;
        int i15 = (size - daVar.V) - daVar.X;
        int i16 = daVar.W;
        int i17 = daVar.Y;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        daVar.R = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            daVar.P = i15;
            daVar.Q = ceil;
            if (i18 > i19 - i16) {
                z4 = true;
            } else {
                z4 = false;
            }
            daVar.S = z4;
        } else {
            daVar.S = false;
            int i20 = ((size2 - dp) - i17) - i16;
            daVar.Q = i20;
            daVar.P = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - daVar.Q;
        if (daVar.S) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        daVar.R = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (daVar.S) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        daVar.f41525r.measure(View.MeasureSpec.makeMeasureSpec(daVar.P, 1073741824), View.MeasureSpec.makeMeasureSpec(daVar.Q + daVar.R, 1073741824));
        daVar.f41529s.f41422b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        uo uoVar = daVar.f41556z2;
        if (uoVar != null) {
            uoVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        e9 e9Var = daVar.J0;
        if (e9Var != null) {
            e9Var.measure(View.MeasureSpec.makeMeasureSpec(daVar.P, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            kz emojiView = t9Var.f41809f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        h9 h9Var = daVar.f41531s1;
        if (h9Var != null) {
            kz kzVar = h9Var.f41349m2;
            if (kzVar != null) {
                kzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(daVar.f41531s1.f41349m2.getLayoutParams().height, 1073741824));
            }
            pk0 pk0Var = daVar.f41531s1.W1;
            if (pk0Var != null) {
                measureChild(pk0Var, i10, i11);
                if (daVar.f41531s1.W1.getReactionsWindow() != null) {
                    measureChild(daVar.f41531s1.W1.getReactionsWindow().f13974c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof m0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (daVar.S) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        n9 n9Var = daVar.f41517o1;
        if (n9Var != null) {
            n9Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            daVar.f41517o1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        o9 o9Var = daVar.f41520p1;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            daVar.f41520p1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
