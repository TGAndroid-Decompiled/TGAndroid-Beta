package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class r9 extends TextView {

    public final int f41870a = 0;

    public final Paint f41871b;

    public Path f41872c;
    public Object d;

    public final Object f41873e;

    public r9(org.telegram.ui.Components.um0 um0Var, Context context) {
        super(context);
        this.f41873e = um0Var;
        this.f41872c = new Path();
        this.d = new RectF();
        this.f41871b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41870a) {
            case 1:
                int iL1 = org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23251o6, ((org.telegram.ui.Components.um0) this.f41873e).f33128c));
                Paint paint = this.f41871b;
                paint.setColor(iL1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f41872c;
                Paint paint2 = ig.r0.V;
                ig.r0.h(rectF, AndroidUtilities.rectTmp, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f41870a) {
            case 0:
                org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) this.f41872c;
                if (j80Var != null) {
                    canvas.drawPath(j80Var, this.f41871b);
                }
                if (((org.telegram.ui.Components.m80) this.f41873e).f(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41870a) {
            case 1:
                org.telegram.ui.Components.um0 um0Var = (org.telegram.ui.Components.um0) this.f41873e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int iMax = 0;
                for (int i14 = 0; i14 < um0Var.getChildCount(); i14++) {
                    width = Math.min(width, um0Var.getChildAt(i14).getLeft());
                    iMax = Math.max(iMax, um0Var.getChildAt(i14).getRight());
                }
                setPivotX((width + iMax) / 2.0f);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f41870a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.r41[] r41VarArr = (org.telegram.ui.Components.r41[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.r41.class);
                    if (r41VarArr != null && r41VarArr.length > 0) {
                        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(0);
                        this.f41872c = j80Var;
                        j80Var.f29649n = false;
                        for (int i12 = 0; i12 < r41VarArr.length; i12++) {
                            int spanStart = spanned.getSpanStart(r41VarArr[i12]);
                            int spanEnd = spanned.getSpanEnd(r41VarArr[i12]);
                            ((org.telegram.ui.Components.j80) this.f41872c).d(getLayout(), spanStart, 0.0f);
                            int i13 = getText() != null ? getPaint().baselineShift : 0;
                            org.telegram.ui.Components.j80 j80Var2 = (org.telegram.ui.Components.j80) this.f41872c;
                            j80Var2.f29650o = i13 != 0 ? AndroidUtilities.dp(i13 > 0 ? 5.0f : -2.0f) + i13 : 0;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.j80) this.f41872c);
                        }
                        ((org.telegram.ui.Components.j80) this.f41872c).f29649n = true;
                        break;
                    }
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41870a) {
            case 0:
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) this.f41873e;
                Layout layout = getLayout();
                float f10 = 0;
                int x8 = (int) (motionEvent.getX() - f10);
                int y10 = (int) (motionEvent.getY() - f10);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y10);
                    float f11 = x8;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f11);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f11 && layout.getLineWidth(lineForVertical) + lineLeft >= f11 && y10 >= 0 && y10 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            m80Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.q80 q80Var = new org.telegram.ui.Components.q80(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = q80Var;
                                q80Var.d(771751935);
                                m80Var.a((org.telegram.ui.Components.q80) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.q80) this.d).f31841i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.q80) this.d).f31841i);
                                org.telegram.ui.Components.j80 j80VarB = ((org.telegram.ui.Components.q80) this.d).b();
                                j80VarB.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, j80VarB);
                                return true;
                            }
                            if (motionEvent.getAction() != 1) {
                                return true;
                            }
                            org.telegram.ui.Components.q80 q80Var2 = (org.telegram.ui.Components.q80) this.d;
                            if (q80Var2 != null) {
                                CharacterStyle characterStyle = q80Var2.f31841i;
                                ClickableSpan clickableSpan = clickableSpanArr[0];
                                if (characterStyle == clickableSpan) {
                                    clickableSpan.onClick(this);
                                }
                            }
                            this.d = null;
                            return true;
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    m80Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public r9(Context context, Paint paint) {
        super(context);
        this.f41871b = paint;
        this.f41873e = new org.telegram.ui.Components.m80(this);
    }
}
