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
public final class r9 extends TextView {
    public final int f50875a = 0;
    public final Paint f50876b;
    public Path f50877c;
    public Object d;
    public final Object f50878e;

    public r9(org.telegram.ui.Components.ul0 ul0Var, Context context) {
        super(context);
        this.f50878e = ul0Var;
        this.f50877c = new Path();
        this.d = new RectF();
        this.f50876b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f50875a) {
            case 1:
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.15f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29049o6, ((org.telegram.ui.Components.ul0) this.f50878e).f40098c));
                Paint paint = this.f50876b;
                paint.setColor(r12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f50877c;
                Paint paint2 = ch.q0.S;
                ch.q0.h(rectF, org.telegram.messenger.g0.P, path);
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
        switch (this.f50875a) {
            case 0:
                org.telegram.ui.Components.u70 u70Var = (org.telegram.ui.Components.u70) this.f50877c;
                if (u70Var != null) {
                    canvas.drawPath(u70Var, this.f50876b);
                }
                if (((n2.o0) this.f50878e).h(canvas)) {
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f50875a) {
            case 1:
                org.telegram.ui.Components.ul0 ul0Var = (org.telegram.ui.Components.ul0) this.f50878e;
                super.onLayout(z10, i7, i10, i11, i12);
                int width = getWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < ul0Var.getChildCount(); i14++) {
                    width = Math.min(width, ul0Var.getChildAt(i14).getLeft());
                    i13 = Math.max(i13, ul0Var.getChildAt(i14).getRight());
                }
                setPivotX((width + i13) / 2.0f);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        float f10;
        switch (this.f50875a) {
            case 0:
                super.onMeasure(i7, i10);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.f41[] f41VarArr = (org.telegram.ui.Components.f41[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.f41.class);
                    if (f41VarArr != null && f41VarArr.length > 0) {
                        org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(0);
                        this.f50877c = u70Var;
                        u70Var.f39946n = false;
                        for (int i13 = 0; i13 < f41VarArr.length; i13++) {
                            int spanStart = spanned.getSpanStart(f41VarArr[i13]);
                            int spanEnd = spanned.getSpanEnd(f41VarArr[i13]);
                            ((org.telegram.ui.Components.u70) this.f50877c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i11 = getPaint().baselineShift;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.Components.u70 u70Var2 = (org.telegram.ui.Components.u70) this.f50877c;
                            if (i11 != 0) {
                                if (i11 > 0) {
                                    f10 = 5.0f;
                                } else {
                                    f10 = -2.0f;
                                }
                                i12 = org.telegram.messenger.g0.L(f10) + i11;
                            } else {
                                i12 = 0;
                            }
                            u70Var2.f39947o = i12;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.u70) this.f50877c);
                        }
                        ((org.telegram.ui.Components.u70) this.f50877c).f39946n = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f50875a) {
            case 0:
                n2.o0 o0Var = (n2.o0) this.f50878e;
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
                            o0Var.f(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.a80 a80Var = new org.telegram.ui.Components.a80(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = a80Var;
                                a80Var.d(771751935);
                                o0Var.b((org.telegram.ui.Components.a80) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.a80) this.d).f32922i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.a80) this.d).f32922i);
                                org.telegram.ui.Components.u70 b10 = ((org.telegram.ui.Components.a80) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.a80 a80Var2 = (org.telegram.ui.Components.a80) this.d;
                                if (a80Var2 != null) {
                                    CharacterStyle characterStyle = a80Var2.f32922i;
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
                    o0Var.f(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public r9(Context context, Paint paint) {
        super(context);
        this.f50876b = paint;
        this.f50878e = new n2.o0(this);
    }
}
