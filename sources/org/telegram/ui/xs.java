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
public final class xs extends org.telegram.ui.Components.tj0 {
    public final int f52091f3;
    public final Object f52092g3;

    public xs(int i3, Context context, Object obj) {
        super(context, null);
        this.f52091f3 = i3;
        this.f52092g3 = obj;
    }

    @Override
    public Integer V0(int i3) {
        vy vyVar;
        int i10;
        switch (this.f52091f3) {
            case 0:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f52092g3);
                org.telegram.ui.ActionBar.e6 e6Var = this.f38460o2;
                if (i3 == b02) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28102p7, e6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var));
            case 1:
                ArrayList arrayList = ((ez) this.f52092g3).Q;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    vyVar = (vy) arrayList.get(i3);
                } else {
                    vyVar = null;
                }
                org.telegram.ui.ActionBar.e6 e6Var2 = this.f38460o2;
                if (vyVar != null && vyVar.f50639l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28102p7, e6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var2));
            case 7:
                i10 = ((SessionsActivity) this.f52092g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.e6 e6Var3 = this.f38460o2;
                if (i3 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28102p7, e6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var3));
            default:
                return super.V0(i3);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int L;
        ArrayList arrayList;
        View view;
        switch (this.f52091f3) {
            case 2:
                if (getAdapter() == ((wz) this.f52092g3).V) {
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        if (T(getChildAt(i3)).f55544f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i3).getX(), (getChildAt(i3).getY() - getChildAt(i3).getMeasuredHeight()) + org.telegram.messenger.g0.L(2.0f));
                            getChildAt(i3).draw(canvas);
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
                e40 e40Var = (e40) this.f52092g3;
                if (e40Var.A0 != null && e40Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = e40Var.A0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.d2) e40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    e40Var.A0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 5:
                la0 la0Var = (la0) this.f52092g3;
                RectF rectF = la0Var.f47240a0;
                if (la0Var.Z != null) {
                    int L2 = org.telegram.messenger.g0.L(12.0f);
                    la0Var.Z.setBounds(-L2, la0Var.f47242b0 - L2, getWidth() + L2, getHeight() + L2);
                    la0Var.Z.draw(canvas);
                    int i10 = la0Var.I0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.g0.L(10.0f) + la0Var.f47242b0, (getWidth() + L3) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.k6.f28171t0.setColor(la0Var.getThemedColor(org.telegram.ui.ActionBar.k6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                bm0 bm0Var = (bm0) this.f52092g3;
                Paint paint = bm0Var.f44080x;
                RectF rectF2 = bm0Var.f44078s;
                RectF rectF3 = bm0Var.f44077r;
                RectF rectF4 = bm0Var.f44076n;
                u4.b0 b0Var = bm0Var.f44072b;
                if (!bm0Var.f44075f.isEmpty()) {
                    float e10 = bm0Var.f44074e.e(false, bm0Var.d);
                    double d = e10;
                    int j10 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                    int j11 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                    View m10 = b0Var.m(j10);
                    View m11 = b0Var.m(j11);
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
                        org.telegram.messenger.g0.Z1(rectF4, rectF3, e10 - j10, rectF2);
                        paint.setColor(bm0Var.f44081y);
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
        switch (this.f52091f3) {
            case 5:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((la0) this.f52092g3).f47242b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f52091f3) {
            case 2:
                if (getAdapter() == ((wz) this.f52092g3).V && T(view).f55544f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f52091f3) {
            case 6:
                super.invalidate();
                ml0 ml0Var = ((bm0) this.f52092g3).G;
                if (ml0Var != null) {
                    ml0Var.run();
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
        switch (this.f52091f3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.i3(new fz(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i3, Rect rect) {
        switch (this.f52091f3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i3, rect);
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f52091f3) {
            case 3:
                if ((view instanceof yz) && ((yz) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public xs(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f52091f3 = i3;
        this.f52092g3 = obj;
    }
}
