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
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.za;
public final class aa extends pv0 {
    public float A0;
    public final ba B0;
    public final ai f45001t0;
    public final ScaleGestureDetector f45002u0;
    public boolean f45003v0;
    public boolean f45004w0;
    public boolean f45005x0;
    public float f45006y0;
    public float f45007z0;

    public aa(ba baVar, Activity activity) {
        super(activity, null);
        this.B0 = baVar;
        this.f45005x0 = false;
        this.f45001t0 = new ai(activity, new y9(this));
        this.f45002u0 = new ScaleGestureDetector(activity, new z9(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        ba baVar = this.B0;
        float width = bitmap.getWidth() / baVar.f45081n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = baVar.U0.getTextureView();
        if (textureView == null) {
            textureView = baVar.U0.f45454r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(baVar.f45055e0.getX() + baVar.f45094r.getX(), baVar.f45055e0.getY() + baVar.f45094r.getY());
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
        canvas.translate(baVar.f45094r.getX(), baVar.f45094r.getY());
        for (int i10 = 0; i10 < baVar.f45094r.getChildCount(); i10++) {
            View childAt = baVar.f45094r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == baVar.f45055e0) {
                    for (int i11 = 0; i11 < baVar.f45055e0.getChildCount(); i11++) {
                        View childAt2 = baVar.f45055e0.getChildAt(i11);
                        if (childAt2 != baVar.U0 && childAt2 != baVar.f45120y0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: qh.aa.dispatchDraw(android.graphics.Canvas):void");
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
        this.f45003v0 = false;
        ba baVar = this.B0;
        u uVar = baVar.F0;
        boolean z10 = true;
        if (uVar != null && uVar.f46152e) {
            float y10 = baVar.F0.getY() + baVar.f45059f0.getY() + baVar.f45094r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + baVar.F0.getHeight()) || this.f45004w0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z4 = true;
                }
                this.f45004w0 = z4;
                return super.dispatchTouchEvent(motionEvent);
            }
            baVar.F0.a(false, true);
            baVar.m0(true);
        }
        if (this.f45004w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f45004w0 = false;
        }
        this.f45002u0.onTouchEvent(motionEvent);
        this.f45001t0.J(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f45003v0) {
            if (baVar.f45094r.getTranslationY() > 0.0f) {
                if (baVar.H > 0.4f) {
                    baVar.q(true);
                } else {
                    ba.c(baVar);
                }
            } else {
                b9 b9Var = baVar.J0;
                if (b9Var != null && b9Var.getTranslationY() > 0.0f && !baVar.I0) {
                    baVar.f((baVar.N1 || baVar.J0.getTranslationY() >= ((float) baVar.J0.getPadding())) ? false : false);
                }
            }
            baVar.I0 = false;
            baVar.T = false;
            baVar.U = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        ba baVar = this.B0;
        return (height - baVar.f45094r.getBottom()) + baVar.R;
    }

    public int getBottomPadding2() {
        return getHeight() - this.B0.f45094r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ba baVar = this.B0;
        return (height - baVar.Y) - baVar.f45094r.getBottom();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        ag.l lVar;
        mz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ba baVar = this.B0;
        int i15 = baVar.W;
        int measuredHeight2 = baVar.f45071j0.getMeasuredHeight();
        if (baVar.S) {
            i15 = 0;
        }
        int i16 = baVar.P;
        int b10 = k7.o.b((measuredWidth - i16) / 2, baVar.V, (measuredWidth - baVar.X) - i16);
        int i17 = baVar.P + b10;
        if (baVar.S) {
            i14 = baVar.Q;
        } else {
            int i18 = baVar.Y;
            int i19 = baVar.Q;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (baVar.G == 1) {
                float f10 = baVar.E.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                    i14 = baVar.Q;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = baVar.Q;
        }
        baVar.f45094r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        baVar.f45098s.f45148b.layout(0, 0, measuredWidth, measuredHeight);
        wo woVar = baVar.f45125z2;
        if (woVar != null) {
            woVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        b9 b9Var = baVar.J0;
        if (b9Var != null) {
            b9Var.layout((measuredWidth - b9Var.getMeasuredWidth()) / 2, 0, (baVar.J0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        q9 q9Var = baVar.Z0;
        if (q9Var != null && (emojiView = q9Var.f45574f.getEmojiView()) != null) {
            emojiView.layout(baVar.V, (measuredHeight - baVar.Y) - emojiView.getMeasuredHeight(), measuredWidth - baVar.X, measuredHeight - baVar.Y);
        }
        e9 e9Var = baVar.f45100s1;
        if (e9Var != null) {
            mz mzVar = e9Var.f44945m2;
            if (mzVar != null) {
                mzVar.layout(baVar.V, (measuredHeight - baVar.Y) - mzVar.getMeasuredHeight(), measuredWidth - baVar.X, measuredHeight - baVar.Y);
            }
            qk0 qk0Var = baVar.f45100s1.W1;
            if (qk0Var != null) {
                int i21 = baVar.V;
                qk0Var.layout(i21, baVar.W, qk0Var.getMeasuredWidth() + i21, baVar.f45100s1.W1.getMeasuredHeight() + baVar.W);
                if (baVar.f45100s1.W1.getReactionsWindow() != null) {
                    lVar = baVar.f45100s1.W1.getReactionsWindow().f16037c;
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    int i22 = baVar.V;
                    lVar.layout(i22, baVar.W, lVar.getMeasuredWidth() + i22, lVar.getMeasuredHeight() + baVar.W);
                }
            }
        }
        k9 k9Var = baVar.f45086o1;
        if (k9Var != null) {
            k9Var.f45131e.setPadding(0, baVar.W, 0, baVar.Y);
            baVar.f45086o1.layout(0, 0, measuredWidth, measuredHeight);
            baVar.f45086o1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        l9 l9Var = baVar.f45089p1;
        if (l9Var != null) {
            l9Var.f45324f.setPadding(0, baVar.W, 0, baVar.Y);
            baVar.f45089p1.layout(0, 0, measuredWidth, measuredHeight);
            baVar.f45089p1.f45323e.layout(0, 0, measuredWidth, measuredHeight);
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
        ba baVar = this.B0;
        int i15 = (size - baVar.V) - baVar.X;
        int i16 = baVar.W;
        int i17 = baVar.Y;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        baVar.R = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            baVar.P = i15;
            baVar.Q = ceil;
            if (i18 > i19 - i16) {
                z4 = true;
            } else {
                z4 = false;
            }
            baVar.S = z4;
        } else {
            baVar.S = false;
            int i20 = ((size2 - dp) - i17) - i16;
            baVar.Q = i20;
            baVar.P = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - baVar.Q;
        if (baVar.S) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        baVar.R = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (baVar.S) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        baVar.f45094r.measure(View.MeasureSpec.makeMeasureSpec(baVar.P, 1073741824), View.MeasureSpec.makeMeasureSpec(baVar.Q + baVar.R, 1073741824));
        baVar.f45098s.f45148b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        wo woVar = baVar.f45125z2;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        b9 b9Var = baVar.J0;
        if (b9Var != null) {
            b9Var.measure(View.MeasureSpec.makeMeasureSpec(baVar.P, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        q9 q9Var = baVar.Z0;
        if (q9Var != null) {
            mz emojiView = q9Var.f45574f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        e9 e9Var = baVar.f45100s1;
        if (e9Var != null) {
            mz mzVar = e9Var.f44945m2;
            if (mzVar != null) {
                mzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(baVar.f45100s1.f44945m2.getLayoutParams().height, 1073741824));
            }
            qk0 qk0Var = baVar.f45100s1.W1;
            if (qk0Var != null) {
                measureChild(qk0Var, i10, i11);
                if (baVar.f45100s1.W1.getReactionsWindow() != null) {
                    measureChild(baVar.f45100s1.W1.getReactionsWindow().f16037c, i10, i11);
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
                if (baVar.S) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        k9 k9Var = baVar.f45086o1;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            baVar.f45086o1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        l9 l9Var = baVar.f45089p1;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            baVar.f45089p1.f45323e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
