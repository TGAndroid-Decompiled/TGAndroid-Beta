package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r60 extends org.telegram.ui.Components.ll0 {
    public final int X2;
    public final Object Y2;

    public r60(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.X2) {
            case 3:
                ((zh.s0) this.Y2).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override
    public Integer V0(int i10) {
        int i11;
        switch (this.X2) {
            case 2:
                i11 = ((SessionsActivity) this.Y2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.f6 f6Var = this.f28224p2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20880p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.X2) {
            case 0:
                super.dispatchDraw(canvas);
                t60 t60Var = (t60) this.Y2;
                if (t60Var.f40634z0 != null && t60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = t60Var.f40634z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) t60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    t60Var.f40634z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                aq0 aq0Var = (aq0) this.Y2;
                Paint paint = aq0Var.f34534w;
                RectF rectF = aq0Var.f34533s;
                RectF rectF2 = aq0Var.f34532r;
                RectF rectF3 = aq0Var.f34531n;
                s4.c0 c0Var = aq0Var.f34527b;
                if (!aq0Var.f34530f.isEmpty()) {
                    float d = aq0Var.f34529e.d(aq0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), arrayList.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                    View m10 = c0Var.m(clamp);
                    View m11 = c0Var.m(clamp2);
                    if (m10 != null || m11 != null) {
                        if (m10 != null) {
                            view = m10;
                        } else {
                            view = m11;
                        }
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF2.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(aq0Var.f34535x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        return;
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.X2) {
            case 1:
                super.invalidate();
                lp0 lp0Var = ((aq0) this.Y2).F;
                if (lp0Var != null) {
                    lp0Var.run();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 3:
                zh.s0 s0Var = (zh.s0) this.Y2;
                s0Var.s();
                super.onLayout(z10, i10, i11, i12, i13);
                s0Var.Q(2);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    public r60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.X2 = 2;
        this.Y2 = sessionsActivity;
    }
}
