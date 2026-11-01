package vh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.vy;
public final class n8 extends vu0 {
    public final m2.t f51586f0;
    public final ScaleGestureDetector f51587g0;
    public boolean f51588h0;
    public boolean f51589i0;
    public boolean f51590j0;
    public float f51591k0;
    public float f51592l0;
    public float m0;
    public final o8 f51593n0;

    public n8(o8 o8Var, Activity activity) {
        super(activity, null);
        this.f51593n0 = o8Var;
        this.f51590j0 = false;
        this.f51586f0 = new m2.t((Context) activity, (r10) new l8(this));
        this.f51587g0 = new ScaleGestureDetector(activity, new m8(this));
    }

    public final void X(float f7, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        o8 o8Var = this.f51593n0;
        float width = bitmap.getWidth() / o8Var.f51659n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = o8Var.X0.getTextureView();
        if (textureView == null) {
            textureView = o8Var.X0.f51437r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(o8Var.f51643h0.getX() + o8Var.f51672r.getX(), o8Var.f51643h0.getY() + o8Var.f51672r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f7), (int) (textureView.getHeight() / f7));
                float f10 = 1.0f / width;
                canvas.scale(f10, f10);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(o8Var.f51672r.getX(), o8Var.f51672r.getY());
        for (int i10 = 0; i10 < o8Var.f51672r.getChildCount(); i10++) {
            View childAt = o8Var.f51672r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == o8Var.f51643h0) {
                    for (int i11 = 0; i11 < o8Var.f51643h0.getChildCount(); i11++) {
                        View childAt2 = o8Var.f51643h0.getChildAt(i11);
                        if (childAt2 != o8Var.X0 && childAt2 != o8Var.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: vh.n8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f51593n0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f51588h0 = false;
        o8 o8Var = this.f51593n0;
        t tVar = o8Var.I0;
        boolean z11 = true;
        if (tVar != null && tVar.e) {
            float y3 = o8Var.I0.getY() + o8Var.f51646i0.getY() + o8Var.f51672r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + o8Var.I0.getHeight()) || this.f51589i0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f51589i0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            o8Var.I0.a(false, true);
            o8Var.l0(true);
        }
        if (this.f51589i0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f51589i0 = false;
        }
        this.f51587g0.onTouchEvent(motionEvent);
        this.f51586f0.I(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f51588h0) {
            if (o8Var.f51672r.getTranslationY() > 0.0f) {
                if (o8Var.K > 0.4f) {
                    o8Var.p(true);
                } else {
                    o8.b(o8Var);
                }
            } else {
                m2 m2Var = o8Var.M0;
                if (m2Var != null && m2Var.getTranslationY() > 0.0f && !o8Var.L0) {
                    if (o8Var.Q1 || o8Var.M0.getTranslationY() >= o8Var.M0.getPadding()) {
                        z11 = false;
                    }
                    o8Var.e(z11);
                }
            }
            o8Var.L0 = false;
            o8Var.W = false;
            o8Var.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        o8 o8Var = this.f51593n0;
        return (height - o8Var.f51672r.getBottom()) + o8Var.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f51593n0.f51672r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        o8 o8Var = this.f51593n0;
        return (height - o8Var.f51623b0) - o8Var.f51672r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ph.k kVar;
        vy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8 o8Var = this.f51593n0;
        int i15 = o8Var.Z;
        int measuredHeight2 = o8Var.m0.getMeasuredHeight();
        if (o8Var.V) {
            i15 = 0;
        }
        int i16 = o8Var.S;
        int b10 = w7.u.b((measuredWidth - i16) / 2, o8Var.Y, (measuredWidth - o8Var.f51620a0) - i16);
        int i17 = o8Var.S + b10;
        if (o8Var.V) {
            i14 = o8Var.T;
        } else {
            int i18 = o8Var.f51623b0;
            int i19 = o8Var.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (o8Var.J == 1) {
                float f7 = o8Var.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = o8Var.T;
                }
            }
            if (i20 - i15 >= org.telegram.messenger.i0.L(40.0f)) {
                i15 = i20;
            }
            i14 = o8Var.T;
        }
        o8Var.f51672r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        o8Var.f51676s.f52245b.layout(0, 0, measuredWidth, measuredHeight);
        y7 y7Var = o8Var.C2;
        if (y7Var != null) {
            y7Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        m2 m2Var = o8Var.M0;
        if (m2Var != null) {
            m2Var.layout((measuredWidth - m2Var.getMeasuredWidth()) / 2, 0, (o8Var.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        e8 e8Var = o8Var.f51628c1;
        if (e8Var != null && (emojiView = e8Var.f51355f.getEmojiView()) != null) {
            emojiView.layout(o8Var.Y, (measuredHeight - o8Var.f51623b0) - emojiView.getMeasuredHeight(), measuredWidth - o8Var.f51620a0, measuredHeight - o8Var.f51623b0);
        }
        s7 s7Var = o8Var.f51687v1;
        if (s7Var != null) {
            vy vyVar = s7Var.Y1;
            if (vyVar != null) {
                vyVar.layout(o8Var.Y, (measuredHeight - o8Var.f51623b0) - vyVar.getMeasuredHeight(), measuredWidth - o8Var.f51620a0, measuredHeight - o8Var.f51623b0);
            }
            nj0 nj0Var = o8Var.f51687v1.I1;
            if (nj0Var != null) {
                int i21 = o8Var.Y;
                nj0Var.layout(i21, o8Var.Z, nj0Var.getMeasuredWidth() + i21, o8Var.f51687v1.I1.getMeasuredHeight() + o8Var.Z);
                if (o8Var.f51687v1.I1.getReactionsWindow() != null) {
                    kVar = o8Var.f51687v1.I1.getReactionsWindow().f48288c;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    int i22 = o8Var.Y;
                    kVar.layout(i22, o8Var.Z, kVar.getMeasuredWidth() + i22, kVar.getMeasuredHeight() + o8Var.Z);
                }
            }
        }
        z7 z7Var = o8Var.f51674r1;
        if (z7Var != null) {
            z7Var.e.setPadding(0, o8Var.Z, 0, o8Var.f51623b0);
            o8Var.f51674r1.layout(0, 0, measuredWidth, measuredHeight);
            o8Var.f51674r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        a8 a8Var = o8Var.f51678s1;
        if (a8Var != null) {
            a8Var.f51192f.setPadding(0, o8Var.Z, 0, o8Var.f51623b0);
            o8Var.f51678s1.layout(0, 0, measuredWidth, measuredHeight);
            o8Var.f51678s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof m0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof oa) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        o8 o8Var = this.f51593n0;
        int i16 = (size - o8Var.Y) - o8Var.f51620a0;
        int i17 = o8Var.Z;
        int i18 = o8Var.f51623b0;
        int ceil = (int) Math.ceil((i16 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.i0.L(48.0f);
        o8Var.U = L;
        int i19 = ceil + L;
        int i20 = size2 - i18;
        if (i19 <= i20) {
            o8Var.S = i16;
            o8Var.T = ceil;
            if (i19 > i20 - i17) {
                z10 = true;
            } else {
                z10 = false;
            }
            o8Var.V = z10;
        } else {
            o8Var.V = false;
            o8Var.T = ((size2 - L) - i18) - i17;
            o8Var.S = (int) Math.ceil((i12 * 9.0f) / 16.0f);
        }
        int i21 = size2 - o8Var.T;
        if (o8Var.V) {
            i13 = 0;
        } else {
            i13 = i17;
        }
        o8Var.U = Utilities.j(i21 - i13, org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (o8Var.V) {
            i14 = systemUiVisibility | 4;
        } else {
            i14 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i14);
        o8Var.f51672r.measure(View.MeasureSpec.makeMeasureSpec(o8Var.S, 1073741824), View.MeasureSpec.makeMeasureSpec(o8Var.T + o8Var.U, 1073741824));
        o8Var.f51676s.f52245b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        y7 y7Var = o8Var.C2;
        if (y7Var != null) {
            y7Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        m2 m2Var = o8Var.M0;
        if (m2Var != null) {
            m2Var.measure(View.MeasureSpec.makeMeasureSpec(o8Var.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        e8 e8Var = o8Var.f51628c1;
        if (e8Var != null) {
            vy emojiView = e8Var.f51355f.getEmojiView();
            Q();
            org.telegram.messenger.i0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        s7 s7Var = o8Var.f51687v1;
        if (s7Var != null) {
            vy vyVar = s7Var.Y1;
            if (vyVar != null) {
                vyVar.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(o8Var.f51687v1.Y1.getLayoutParams().height, 1073741824));
            }
            nj0 nj0Var = o8Var.f51687v1.I1;
            if (nj0Var != null) {
                measureChild(nj0Var, i10, i11);
                if (o8Var.f51687v1.I1.getReactionsWindow() != null) {
                    measureChild(o8Var.f51687v1.I1.getReactionsWindow().f48288c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof m0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof oa) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                int L2 = org.telegram.messenger.i0.L(340.0f);
                if (o8Var.V) {
                    i15 = 0;
                } else {
                    i15 = i17;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i15), 1073741824));
            }
        }
        z7 z7Var = o8Var.f51674r1;
        if (z7Var != null) {
            z7Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            o8Var.f51674r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        a8 a8Var = o8Var.f51678s1;
        if (a8Var != null) {
            a8Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            o8Var.f51678s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
