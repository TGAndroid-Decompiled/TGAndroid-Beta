package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.FragmentContextView;
public final class uk extends TextView {
    public final int f37289a;
    public Object f37290b;

    public uk(Object obj, Context context, int i10) {
        super(context);
        this.f37289a = i10;
        this.f37290b = obj;
    }

    public void a(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f37290b;
        if (fragmentContextView.M != i10) {
            org.telegram.ui.Components.a20 a20Var = fragmentContextView.d;
            a20Var.setPadding(a20Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.M) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.M = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37289a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = dp;
                rectF.set(f7, f7, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f37290b).N.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                w81 w81Var = (w81) this.f37290b;
                org.telegram.ui.Components.voip.h hVar = w81Var.f37750c;
                if (hVar.f28148g <= 1.0f) {
                    SessionsActivity sessionsActivity = w81Var.d;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f28147f = getMeasuredWidth();
                        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF2, null);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37289a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f37290b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f37290b = hVar;
                    hVar.f28151k = false;
                    hVar.f28153m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f37290b).f28147f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f37290b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f37290b);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37289a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((zi1) this.f37290b).H();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37289a) {
            case 1:
                super.onMeasure(i10, i11);
                a(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.g41) this.f37290b).f23233b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.a2) this.f37290b).f37860c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f37289a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f37290b).N.f28147f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f37289a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    a(0);
                    ((FragmentContextView) this.f37290b).M = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public uk(Activity activity, Paint paint) {
        super(activity);
        this.f37289a = 4;
        this.f37290b = paint;
    }

    public uk(Context context) {
        super(context);
        this.f37289a = 0;
    }
}
