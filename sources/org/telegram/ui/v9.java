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
public final class v9 extends TextView {
    public final int f38495a = 0;
    public final Paint f38496b;
    public Path f38497c;
    public Object d;
    public final Object e;

    public v9(org.telegram.ui.Components.wn0 wn0Var, Context context) {
        super(context);
        this.e = wn0Var;
        this.f38497c = new Path();
        this.d = new RectF();
        this.f38496b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f38495a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.i6.l1(0.15f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19259o6, ((org.telegram.ui.Components.wn0) this.e).f30120c));
                Paint paint = this.f38496b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f38497c;
                Paint paint2 = zg.q0.V;
                zg.q0.h(rectF, AndroidUtilities.rectTmp, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f38495a) {
            case 0:
                org.telegram.ui.Components.j90 j90Var = (org.telegram.ui.Components.j90) this.f38497c;
                if (j90Var != null) {
                    canvas.drawPath(j90Var, this.f38496b);
                }
                if (((org.telegram.ui.Components.m90) this.e).f(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38495a) {
            case 1:
                org.telegram.ui.Components.wn0 wn0Var = (org.telegram.ui.Components.wn0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < wn0Var.getChildCount(); i15++) {
                    width = Math.min(width, wn0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, wn0Var.getChildAt(i15).getRight());
                }
                setPivotX((width + i14) / 2.0f);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        switch (this.f38495a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.b61[] b61VarArr = (org.telegram.ui.Components.b61[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.b61.class);
                    if (b61VarArr != null && b61VarArr.length > 0) {
                        org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(0);
                        this.f38497c = j90Var;
                        j90Var.f25416n = false;
                        for (int i14 = 0; i14 < b61VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(b61VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(b61VarArr[i14]);
                            ((org.telegram.ui.Components.j90) this.f38497c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.j90 j90Var2 = (org.telegram.ui.Components.j90) this.f38497c;
                            if (i12 != 0) {
                                if (i12 > 0) {
                                    f7 = 5.0f;
                                } else {
                                    f7 = -2.0f;
                                }
                                i13 = AndroidUtilities.dp(f7) + i12;
                            } else {
                                i13 = 0;
                            }
                            j90Var2.f25417o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.j90) this.f38497c);
                        }
                        ((org.telegram.ui.Components.j90) this.f38497c).f25416n = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38495a) {
            case 0:
                org.telegram.ui.Components.m90 m90Var = (org.telegram.ui.Components.m90) this.e;
                Layout layout = getLayout();
                float f7 = 0;
                int x10 = (int) (motionEvent.getX() - f7);
                int y3 = (int) (motionEvent.getY() - f7);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y3);
                    float f10 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && y3 >= 0 && y3 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            m90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = q90Var;
                                q90Var.d(771751935);
                                m90Var.a((org.telegram.ui.Components.q90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.q90) this.d).f27627i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.q90) this.d).f27627i);
                                org.telegram.ui.Components.j90 b10 = ((org.telegram.ui.Components.q90) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.q90 q90Var2 = (org.telegram.ui.Components.q90) this.d;
                                if (q90Var2 != null) {
                                    CharacterStyle characterStyle = q90Var2.f27627i;
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
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    m90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public v9(Context context, Paint paint) {
        super(context);
        this.f38496b = paint;
        this.e = new org.telegram.ui.Components.m90(this);
    }
}
