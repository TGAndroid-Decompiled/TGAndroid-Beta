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
public final class t9 extends TextView {
    public final int f38591a = 0;
    public final Paint f38592b;
    public Path f38593c;
    public Object d;
    public final Object e;

    public t9(org.telegram.ui.Components.on0 on0Var, Context context) {
        super(context);
        this.e = on0Var;
        this.f38593c = new Path();
        this.d = new RectF();
        this.f38592b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f38591a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20103o6, ((org.telegram.ui.Components.on0) this.e).f27602c));
                Paint paint = this.f38592b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f38593c;
                Paint paint2 = mg.r0.V;
                mg.r0.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f38591a) {
            case 0:
                org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) this.f38593c;
                if (y80Var != null) {
                    canvas.drawPath(y80Var, this.f38592b);
                }
                if (((org.telegram.ui.Components.b90) this.e).f(canvas)) {
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f38591a) {
            case 1:
                org.telegram.ui.Components.on0 on0Var = (org.telegram.ui.Components.on0) this.e;
                super.onLayout(z4, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < on0Var.getChildCount(); i15++) {
                    width = Math.min(width, on0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, on0Var.getChildAt(i15).getRight());
                }
                setPivotX((width + i14) / 2.0f);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        switch (this.f38591a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.m51[] m51VarArr = (org.telegram.ui.Components.m51[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.m51.class);
                    if (m51VarArr != null && m51VarArr.length > 0) {
                        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(0);
                        this.f38593c = y80Var;
                        y80Var.f30937n = false;
                        for (int i14 = 0; i14 < m51VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(m51VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(m51VarArr[i14]);
                            ((org.telegram.ui.Components.y80) this.f38593c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.y80 y80Var2 = (org.telegram.ui.Components.y80) this.f38593c;
                            if (i12 != 0) {
                                if (i12 > 0) {
                                    f10 = 5.0f;
                                } else {
                                    f10 = -2.0f;
                                }
                                i13 = AndroidUtilities.dp(f10) + i12;
                            } else {
                                i13 = 0;
                            }
                            y80Var2.f30938o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.y80) this.f38593c);
                        }
                        ((org.telegram.ui.Components.y80) this.f38593c).f30937n = true;
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
        switch (this.f38591a) {
            case 0:
                org.telegram.ui.Components.b90 b90Var = (org.telegram.ui.Components.b90) this.e;
                Layout layout = getLayout();
                float f10 = 0;
                int x10 = (int) (motionEvent.getX() - f10);
                int y10 = (int) (motionEvent.getY() - f10);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y10);
                    float f11 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f11);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f11 && layout.getLineWidth(lineForVertical) + lineLeft >= f11 && y10 >= 0 && y10 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            b90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = f90Var;
                                f90Var.d(771751935);
                                b90Var.a((org.telegram.ui.Components.f90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.f90) this.d).f24815i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.f90) this.d).f24815i);
                                org.telegram.ui.Components.y80 b10 = ((org.telegram.ui.Components.f90) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.f90 f90Var2 = (org.telegram.ui.Components.f90) this.d;
                                if (f90Var2 != null) {
                                    CharacterStyle characterStyle = f90Var2.f24815i;
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
                    b90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t9(Context context, Paint paint) {
        super(context);
        this.f38592b = paint;
        this.e = new org.telegram.ui.Components.b90(this);
    }
}
