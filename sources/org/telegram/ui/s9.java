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
public final class s9 extends TextView {
    public final int f41611a = 0;
    public final Paint f41612b;
    public Path f41613c;
    public Object d;
    public final Object f41614e;

    public s9(org.telegram.ui.Components.no0 no0Var, Context context) {
        super(context);
        this.f41614e = no0Var;
        this.f41613c = new Path();
        this.d = new RectF();
        this.f41612b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41611a) {
            case 1:
                int m12 = org.telegram.ui.ActionBar.i6.m1(0.15f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21000o6, ((org.telegram.ui.Components.no0) this.f41614e).f29221c));
                Paint paint = this.f41612b;
                paint.setColor(m12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f41613c;
                Paint paint2 = zg.o0.V;
                zg.o0.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f41611a) {
            case 0:
                org.telegram.ui.Components.y90 y90Var = (org.telegram.ui.Components.y90) this.f41613c;
                if (y90Var != null) {
                    canvas.drawPath(y90Var, this.f41612b);
                }
                if (((org.telegram.ui.Components.ba0) this.f41614e).f(canvas)) {
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
        switch (this.f41611a) {
            case 1:
                org.telegram.ui.Components.no0 no0Var = (org.telegram.ui.Components.no0) this.f41614e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < no0Var.getChildCount(); i15++) {
                    width = Math.min(width, no0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, no0Var.getChildAt(i15).getRight());
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
        switch (this.f41611a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.t61[] t61VarArr = (org.telegram.ui.Components.t61[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.t61.class);
                    if (t61VarArr != null && t61VarArr.length > 0) {
                        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(0);
                        this.f41613c = y90Var;
                        y90Var.f33174n = false;
                        for (int i14 = 0; i14 < t61VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(t61VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(t61VarArr[i14]);
                            ((org.telegram.ui.Components.y90) this.f41613c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.y90 y90Var2 = (org.telegram.ui.Components.y90) this.f41613c;
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
                            y90Var2.f33175o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.y90) this.f41613c);
                        }
                        ((org.telegram.ui.Components.y90) this.f41613c).f33174n = true;
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
        switch (this.f41611a) {
            case 0:
                org.telegram.ui.Components.ba0 ba0Var = (org.telegram.ui.Components.ba0) this.f41614e;
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
                            ba0Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = fa0Var;
                                fa0Var.d(771751935);
                                ba0Var.a((org.telegram.ui.Components.fa0) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.fa0) this.d).f26330i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.fa0) this.d).f26330i);
                                org.telegram.ui.Components.y90 b10 = ((org.telegram.ui.Components.fa0) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.fa0 fa0Var2 = (org.telegram.ui.Components.fa0) this.d;
                                if (fa0Var2 != null) {
                                    CharacterStyle characterStyle = fa0Var2.f26330i;
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
                    ba0Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public s9(Context context, Paint paint) {
        super(context);
        this.f41612b = paint;
        this.f41614e = new org.telegram.ui.Components.ba0(this);
    }
}
