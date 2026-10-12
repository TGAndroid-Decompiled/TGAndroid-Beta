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
public final class xk extends TextView {
    public final int f41890a;
    public Object f41891b;

    public xk(Object obj, Context context, int i10) {
        super(context);
        this.f41890a = i10;
        this.f41891b = obj;
    }

    public void a(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f41891b;
        if (fragmentContextView.N != i10) {
            org.telegram.ui.Components.d20 d20Var = fragmentContextView.d;
            d20Var.setPadding(d20Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41890a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = dp;
                rectF.set(f7, f7, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f41891b).O.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                b91 b91Var = (b91) this.f41891b;
                org.telegram.ui.Components.voip.h hVar = b91Var.f34467c;
                if (hVar.f30197g <= 1.0f) {
                    SessionsActivity sessionsActivity = b91Var.d;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f30196f = getMeasuredWidth();
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
        switch (this.f41890a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f41891b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f41891b = hVar;
                    hVar.f30200k = false;
                    hVar.f30202m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f41891b).f30196f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f41891b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f41891b);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41890a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((dj1) this.f41891b).G();
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
        switch (this.f41890a) {
            case 1:
                super.onMeasure(i10, i11);
                a(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.v41) this.f41891b).f29888b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
            default:
                super.onMeasure(i10, i11);
                return;
            case 6:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((org.telegram.ui.Wallet.i8) this.f41891b).U));
                return;
            case 7:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.x1) this.f41891b).f41555c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f41890a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f41891b).O.f30196f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41890a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    a(0);
                    ((FragmentContextView) this.f41891b).N = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public xk(Activity activity, Paint paint) {
        super(activity);
        this.f41890a = 4;
        this.f41891b = paint;
    }

    public xk(Context context) {
        super(context);
        this.f41890a = 0;
    }
}
