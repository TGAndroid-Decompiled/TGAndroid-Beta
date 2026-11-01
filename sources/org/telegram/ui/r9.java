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
    public final int f41011a = 0;
    public final Paint f41012b;
    public Path f41013c;
    public Object d;
    public final Object e;

    public r9(org.telegram.ui.Components.sm0 sm0Var, Context context) {
        super(context);
        this.e = sm0Var;
        this.f41013c = new Path();
        this.d = new RectF();
        this.f41012b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41011a) {
            case 1:
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21135o6, ((org.telegram.ui.Components.sm0) this.e).f30337c));
                Paint paint = this.f41012b;
                paint.setColor(r12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f41013c;
                Paint paint2 = sg.p0.S;
                sg.p0.h(rectF, org.telegram.messenger.i0.P, path);
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
        switch (this.f41011a) {
            case 0:
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) this.f41013c;
                if (k80Var != null) {
                    canvas.drawPath(k80Var, this.f41012b);
                }
                if (((ji.a) this.e).h(canvas)) {
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
        switch (this.f41011a) {
            case 1:
                org.telegram.ui.Components.sm0 sm0Var = (org.telegram.ui.Components.sm0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < sm0Var.getChildCount(); i15++) {
                    width = Math.min(width, sm0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, sm0Var.getChildAt(i15).getRight());
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
        switch (this.f41011a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.f51[] f51VarArr = (org.telegram.ui.Components.f51[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.f51.class);
                    if (f51VarArr != null && f51VarArr.length > 0) {
                        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(0);
                        this.f41013c = k80Var;
                        k80Var.f27779n = false;
                        for (int i14 = 0; i14 < f51VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(f51VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(f51VarArr[i14]);
                            ((org.telegram.ui.Components.k80) this.f41013c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.k80 k80Var2 = (org.telegram.ui.Components.k80) this.f41013c;
                            if (i12 != 0) {
                                if (i12 > 0) {
                                    f7 = 5.0f;
                                } else {
                                    f7 = -2.0f;
                                }
                                i13 = org.telegram.messenger.i0.L(f7) + i12;
                            } else {
                                i13 = 0;
                            }
                            k80Var2.f27780o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.k80) this.f41013c);
                        }
                        ((org.telegram.ui.Components.k80) this.f41013c).f27779n = true;
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
        switch (this.f41011a) {
            case 0:
                ji.a aVar = (ji.a) this.e;
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
                            aVar.f(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.q80 q80Var = new org.telegram.ui.Components.q80(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = q80Var;
                                q80Var.d(771751935);
                                aVar.b((org.telegram.ui.Components.q80) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.q80) this.d).f29671i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.q80) this.d).f29671i);
                                org.telegram.ui.Components.k80 b10 = ((org.telegram.ui.Components.q80) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.q80 q80Var2 = (org.telegram.ui.Components.q80) this.d;
                                if (q80Var2 != null) {
                                    CharacterStyle characterStyle = q80Var2.f29671i;
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
                    aVar.f(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public r9(Context context, Paint paint) {
        super(context);
        this.f41012b = paint;
        this.e = new ji.a(this);
    }
}
