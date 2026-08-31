package qh;

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
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.za;
public final class ba extends qv0 {
    public float A0;
    public final ca B0;
    public final ai f45024t0;
    public final ScaleGestureDetector f45025u0;
    public boolean f45026v0;
    public boolean f45027w0;
    public boolean f45028x0;
    public float f45029y0;
    public float f45030z0;

    public ba(ca caVar, Activity activity) {
        super(activity, null);
        this.B0 = caVar;
        this.f45028x0 = false;
        this.f45024t0 = new ai(activity, new z9(this));
        this.f45025u0 = new ScaleGestureDetector(activity, new aa(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        ca caVar = this.B0;
        float width = bitmap.getWidth() / caVar.f45115n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = caVar.U0.getTextureView();
        if (textureView == null) {
            textureView = caVar.U0.f45484r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(caVar.f45089e0.getX() + caVar.f45128r.getX(), caVar.f45089e0.getY() + caVar.f45128r.getY());
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
        canvas.translate(caVar.f45128r.getX(), caVar.f45128r.getY());
        for (int i10 = 0; i10 < caVar.f45128r.getChildCount(); i10++) {
            View childAt = caVar.f45128r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == caVar.f45089e0) {
                    for (int i11 = 0; i11 < caVar.f45089e0.getChildCount(); i11++) {
                        View childAt2 = caVar.f45089e0.getChildAt(i11);
                        if (childAt2 != caVar.U0 && childAt2 != caVar.f45154y0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: qh.ba.dispatchDraw(android.graphics.Canvas):void");
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
        this.f45026v0 = false;
        ca caVar = this.B0;
        u uVar = caVar.F0;
        boolean z10 = true;
        if (uVar != null && uVar.f46137e) {
            float y10 = caVar.F0.getY() + caVar.f45093f0.getY() + caVar.f45128r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + caVar.F0.getHeight()) || this.f45027w0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z4 = true;
                }
                this.f45027w0 = z4;
                return super.dispatchTouchEvent(motionEvent);
            }
            caVar.F0.a(false, true);
            caVar.m0(true);
        }
        if (this.f45027w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f45027w0 = false;
        }
        this.f45025u0.onTouchEvent(motionEvent);
        this.f45024t0.J(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f45026v0) {
            if (caVar.f45128r.getTranslationY() > 0.0f) {
                if (caVar.H > 0.4f) {
                    caVar.q(true);
                } else {
                    ca.c(caVar);
                }
            } else {
                c9 c9Var = caVar.J0;
                if (c9Var != null && c9Var.getTranslationY() > 0.0f && !caVar.I0) {
                    caVar.f((caVar.N1 || caVar.J0.getTranslationY() >= ((float) caVar.J0.getPadding())) ? false : false);
                }
            }
            caVar.I0 = false;
            caVar.T = false;
            caVar.U = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        ca caVar = this.B0;
        return (height - caVar.f45128r.getBottom()) + caVar.R;
    }

    public int getBottomPadding2() {
        return getHeight() - this.B0.f45128r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ca caVar = this.B0;
        return (height - caVar.Y) - caVar.f45128r.getBottom();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ag.l lVar;
        mz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ca caVar = this.B0;
        int i15 = caVar.W;
        int measuredHeight2 = caVar.f45105j0.getMeasuredHeight();
        if (caVar.S) {
            i15 = 0;
        }
        int i16 = caVar.P;
        int b10 = k7.o.b((measuredWidth - i16) / 2, caVar.V, (measuredWidth - caVar.X) - i16);
        int i17 = caVar.P + b10;
        if (caVar.S) {
            i14 = caVar.Q;
        } else {
            int i18 = caVar.Y;
            int i19 = caVar.Q;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (caVar.G == 1) {
                float f10 = caVar.E.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                    i14 = caVar.Q;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = caVar.Q;
        }
        caVar.f45128r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        caVar.f45132s.f45182b.layout(0, 0, measuredWidth, measuredHeight);
        wo woVar = caVar.f45159z2;
        if (woVar != null) {
            woVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        c9 c9Var = caVar.J0;
        if (c9Var != null) {
            c9Var.layout((measuredWidth - c9Var.getMeasuredWidth()) / 2, 0, (caVar.J0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        r9 r9Var = caVar.Z0;
        if (r9Var != null && (emojiView = r9Var.f45517f.getEmojiView()) != null) {
            emojiView.layout(caVar.V, (measuredHeight - caVar.Y) - emojiView.getMeasuredHeight(), measuredWidth - caVar.X, measuredHeight - caVar.Y);
        }
        f9 f9Var = caVar.f45134s1;
        if (f9Var != null) {
            mz mzVar = f9Var.f44968m2;
            if (mzVar != null) {
                mzVar.layout(caVar.V, (measuredHeight - caVar.Y) - mzVar.getMeasuredHeight(), measuredWidth - caVar.X, measuredHeight - caVar.Y);
            }
            rk0 rk0Var = caVar.f45134s1.W1;
            if (rk0Var != null) {
                int i21 = caVar.V;
                rk0Var.layout(i21, caVar.W, rk0Var.getMeasuredWidth() + i21, caVar.f45134s1.W1.getMeasuredHeight() + caVar.W);
                if (caVar.f45134s1.W1.getReactionsWindow() != null) {
                    lVar = caVar.f45134s1.W1.getReactionsWindow().f16035c;
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    int i22 = caVar.V;
                    lVar.layout(i22, caVar.W, lVar.getMeasuredWidth() + i22, lVar.getMeasuredHeight() + caVar.W);
                }
            }
        }
        l9 l9Var = caVar.f45120o1;
        if (l9Var != null) {
            l9Var.f45036e.setPadding(0, caVar.W, 0, caVar.Y);
            caVar.f45120o1.layout(0, 0, measuredWidth, measuredHeight);
            caVar.f45120o1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        m9 m9Var = caVar.f45123p1;
        if (m9Var != null) {
            m9Var.f45276f.setPadding(0, caVar.W, 0, caVar.Y);
            caVar.f45123p1.layout(0, 0, measuredWidth, measuredHeight);
            caVar.f45123p1.f45275e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof m0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof za) {
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
        ca caVar = this.B0;
        int i15 = (size - caVar.V) - caVar.X;
        int i16 = caVar.W;
        int i17 = caVar.Y;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        caVar.R = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            caVar.P = i15;
            caVar.Q = ceil;
            if (i18 > i19 - i16) {
                z4 = true;
            } else {
                z4 = false;
            }
            caVar.S = z4;
        } else {
            caVar.S = false;
            int i20 = ((size2 - dp) - i17) - i16;
            caVar.Q = i20;
            caVar.P = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - caVar.Q;
        if (caVar.S) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        caVar.R = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (caVar.S) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        caVar.f45128r.measure(View.MeasureSpec.makeMeasureSpec(caVar.P, 1073741824), View.MeasureSpec.makeMeasureSpec(caVar.Q + caVar.R, 1073741824));
        caVar.f45132s.f45182b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        wo woVar = caVar.f45159z2;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        c9 c9Var = caVar.J0;
        if (c9Var != null) {
            c9Var.measure(View.MeasureSpec.makeMeasureSpec(caVar.P, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        r9 r9Var = caVar.Z0;
        if (r9Var != null) {
            mz emojiView = r9Var.f45517f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        f9 f9Var = caVar.f45134s1;
        if (f9Var != null) {
            mz mzVar = f9Var.f44968m2;
            if (mzVar != null) {
                mzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(caVar.f45134s1.f44968m2.getLayoutParams().height, 1073741824));
            }
            rk0 rk0Var = caVar.f45134s1.W1;
            if (rk0Var != null) {
                measureChild(rk0Var, i10, i11);
                if (caVar.f45134s1.W1.getReactionsWindow() != null) {
                    measureChild(caVar.f45134s1.W1.getReactionsWindow().f16035c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof m0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof za) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (caVar.S) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        l9 l9Var = caVar.f45120o1;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            caVar.f45120o1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        m9 m9Var = caVar.f45123p1;
        if (m9Var != null) {
            m9Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            caVar.f45123p1.f45275e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
