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
public final class w9 extends TextView {
    public final int f45010a = 0;
    public final Paint f45011b;
    public Path f45012c;
    public Object d;
    public final Object e;

    public w9(org.telegram.ui.Components.oo0 oo0Var, Context context) {
        super(context);
        this.e = oo0Var;
        this.f45012c = new Path();
        this.d = new RectF();
        this.f45011b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f45010a) {
            case 1:
                int o12 = org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23558o6, ((org.telegram.ui.Components.oo0) this.e).f31336c));
                Paint paint = this.f45011b;
                paint.setColor(o12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f45012c;
                Paint paint2 = bh.y0.V;
                bh.y0.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f45010a) {
            case 0:
                org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) this.f45012c;
                if (s90Var != null) {
                    canvas.drawPath(s90Var, this.f45011b);
                }
                if (((org.telegram.ui.Components.w90) this.e).f(canvas)) {
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
        switch (this.f45010a) {
            case 1:
                org.telegram.ui.Components.oo0 oo0Var = (org.telegram.ui.Components.oo0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < oo0Var.getChildCount(); i15++) {
                    width = Math.min(width, oo0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, oo0Var.getChildAt(i15).getRight());
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
        switch (this.f45010a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.x61[] x61VarArr = (org.telegram.ui.Components.x61[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.x61.class);
                    if (x61VarArr != null && x61VarArr.length > 0) {
                        org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(0);
                        this.f45012c = s90Var;
                        s90Var.f32484n = false;
                        for (int i14 = 0; i14 < x61VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(x61VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(x61VarArr[i14]);
                            ((org.telegram.ui.Components.s90) this.f45012c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.s90 s90Var2 = (org.telegram.ui.Components.s90) this.f45012c;
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
                            s90Var2.f32485o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.s90) this.f45012c);
                        }
                        ((org.telegram.ui.Components.s90) this.f45012c).f32484n = true;
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
        switch (this.f45010a) {
            case 0:
                org.telegram.ui.Components.w90 w90Var = (org.telegram.ui.Components.w90) this.e;
                Layout layout = getLayout();
                float f7 = 0;
                int x9 = (int) (motionEvent.getX() - f7);
                int y3 = (int) (motionEvent.getY() - f7);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y3);
                    float f10 = x9;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && y3 >= 0 && y3 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            w90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = aa0Var;
                                aa0Var.d(771751935);
                                w90Var.a((org.telegram.ui.Components.aa0) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.aa0) this.d).f26445i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.aa0) this.d).f26445i);
                                org.telegram.ui.Components.s90 b10 = ((org.telegram.ui.Components.aa0) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.aa0 aa0Var2 = (org.telegram.ui.Components.aa0) this.d;
                                if (aa0Var2 != null) {
                                    CharacterStyle characterStyle = aa0Var2.f26445i;
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
                    w90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public w9(Context context, Paint paint) {
        super(context);
        this.f45011b = paint;
        this.e = new org.telegram.ui.Components.w90(this);
    }
}
