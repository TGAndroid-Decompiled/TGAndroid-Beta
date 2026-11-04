package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class rq0 extends org.telegram.ui.Components.tj0 {
    public final int f49264f3 = 0;
    public final Paint f49265g3;
    public final Object f49266h3;
    public final Object i3;

    public rq0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.f49265g3 = paint;
        this.i3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        qq0 qq0Var = new qq0(this);
        setItemAnimator(qq0Var);
        qq0Var.C = false;
        qq0Var.f55567m = false;
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
        paint.setColor(2130706432);
        this.f49266h3 = context.getResources().getDrawable(2131232529).mutate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f49264f3) {
            case 1:
                Path path = (Path) this.f49266h3;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
                Paint paint = this.f49265g3;
                paint.setColor(x02);
                canvas.drawPath(path, paint);
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f49264f3) {
            case 1:
                if (((ks0) this.i3).f47012n.f41655r0 >= 1.0f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f49264f3) {
            case 0:
                RectF rectF = (RectF) this.i3;
                Drawable drawable = (Drawable) this.f49266h3;
                super.onDraw(canvas);
                int childCount = getChildCount();
                if (childCount > 0) {
                    int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(87.0f);
                    drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.messenger.g0.L(6.0f));
                    drawable.draw(canvas);
                    int i3 = Integer.MIN_VALUE;
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = getChildAt(i11);
                        i10 = (int) Math.min(i10, Math.floor(childAt.getX()));
                        i3 = (int) Math.max(i3, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
                    }
                    if (i10 != Integer.MAX_VALUE && i3 != Integer.MIN_VALUE) {
                        rectF.set(i10 - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + i3, org.telegram.messenger.g0.L(103.0f));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f49265g3);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f49264f3) {
            case 1:
                if (((ks0) this.i3).f47012n.f41655r0 >= 1.0f) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f49264f3) {
            case 1:
                super.onSizeChanged(i3, i10, i11, i12);
                PremiumPreviewFragment premiumPreviewFragment = ((ks0) this.i3).f47012n;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList = premiumPreviewFragment.d;
                    if (i13 < arrayList.size()) {
                        premiumPreviewFragment.N.a((ms0) arrayList.get(i13), false);
                        premiumPreviewFragment.N.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
                        ((ms0) arrayList.get(i13)).h = i14;
                        i14 += premiumPreviewFragment.N.getMeasuredHeight();
                        i13++;
                    } else {
                        premiumPreviewFragment.P = i14;
                        return;
                    }
                }
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    public rq0(ks0 ks0Var, Context context) {
        super(context, null);
        this.i3 = ks0Var;
        Paint paint = new Paint(1);
        this.f49265g3 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
        this.f49266h3 = new Path();
    }
}
