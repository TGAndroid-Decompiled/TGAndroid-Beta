package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zs extends org.telegram.ui.Components.pj0 {
    public final int f52670e3;
    public final Object f52671f3;

    public zs(int i7, Context context, Object obj) {
        super(context, null);
        this.f52670e3 = i7;
        this.f52671f3 = obj;
    }

    @Override
    public Integer V0(int i7) {
        yy yyVar;
        int i10;
        switch (this.f52670e3) {
            case 0:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f52671f3);
                org.telegram.ui.ActionBar.f6 f6Var = this.f36981n2;
                if (i7 == b02) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var));
            case 1:
                ArrayList arrayList = ((gz) this.f52671f3).P;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    yyVar = (yy) arrayList.get(i7);
                } else {
                    yyVar = null;
                }
                org.telegram.ui.ActionBar.f6 f6Var2 = this.f36981n2;
                if (yyVar != null && yyVar.f52354l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073p7, f6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var2));
            case 7:
                i10 = ((SessionsActivity) this.f52671f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.f6 f6Var3 = this.f36981n2;
                if (i7 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073p7, f6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var3));
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int L;
        ArrayList arrayList;
        View view;
        switch (this.f52670e3) {
            case 2:
                if (getAdapter() == ((yz) this.f52671f3).U) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f57048f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i7).getX(), (getChildAt(i7).getY() - getChildAt(i7).getMeasuredHeight()) + org.telegram.messenger.g0.L(2.0f));
                            getChildAt(i7).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                super.dispatchDraw(canvas);
                j40 j40Var = (j40) this.f52671f3;
                if (j40Var.f46838z0 != null && j40Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = j40Var.f46838z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.f2) j40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    j40Var.f46838z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 5:
                pa0 pa0Var = (pa0) this.f52671f3;
                RectF rectF = pa0Var.Z;
                if (pa0Var.Y != null) {
                    int L2 = org.telegram.messenger.g0.L(12.0f);
                    pa0Var.Y.setBounds(-L2, pa0Var.f48724a0 - L2, getWidth() + L2, getHeight() + L2);
                    pa0Var.Y.draw(canvas);
                    int i10 = pa0Var.H0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.g0.L(10.0f) + pa0Var.f48724a0, (getWidth() + L3) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.k6.f28143t0.setColor(pa0Var.getThemedColor(org.telegram.ui.ActionBar.k6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28143t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                gm0 gm0Var = (gm0) this.f52671f3;
                Paint paint = gm0Var.f46039x;
                RectF rectF2 = gm0Var.f46037s;
                RectF rectF3 = gm0Var.f46036r;
                RectF rectF4 = gm0Var.f46035n;
                v4.b0 b0Var = gm0Var.f46031b;
                if (!gm0Var.f46034f.isEmpty()) {
                    float e10 = gm0Var.f46033e.e(false, gm0Var.d);
                    double d = e10;
                    int j3 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                    int j10 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                    View m10 = b0Var.m(j3);
                    View m11 = b0Var.m(j10);
                    if (m10 != null || m11 != null) {
                        if (m10 != null) {
                            view = m10;
                        } else {
                            view = m11;
                        }
                        rectF4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF3.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        org.telegram.messenger.g0.Z1(rectF4, rectF3, e10 - j3, rectF2);
                        paint.setColor(gm0Var.f46040y);
                        float height = rectF2.height() / 2.0f;
                        canvas.drawRoundRect(rectF2, height, height, paint);
                        super.dispatchDraw(canvas);
                        return;
                    }
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f52670e3) {
            case 5:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((pa0) this.f52671f3).f48724a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f52670e3) {
            case 2:
                if (getAdapter() == ((yz) this.f52671f3).U && T(view).f57048f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f52670e3) {
            case 6:
                super.invalidate();
                rl0 rl0Var = ((gm0) this.f52671f3).F;
                if (rl0Var != null) {
                    rl0Var.run();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f52670e3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.i3(new hz(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f52670e3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f52670e3) {
            case 3:
                if ((view instanceof a00) && ((a00) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public zs(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.f52670e3 = i7;
        this.f52671f3 = obj;
    }
}
