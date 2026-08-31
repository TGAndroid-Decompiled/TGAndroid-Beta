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
    public final int f41529a = 0;
    public final Paint f41530b;
    public Path f41531c;
    public Object d;
    public final Object f41532e;

    public t9(org.telegram.ui.Components.pn0 pn0Var, Context context) {
        super(context);
        this.f41532e = pn0Var;
        this.f41531c = new Path();
        this.d = new RectF();
        this.f41530b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41529a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.k6.l1(0.15f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21857o6, ((org.telegram.ui.Components.pn0) this.f41532e).f30130c));
                Paint paint = this.f41530b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f41531c;
                Paint paint2 = ng.r0.V;
                ng.r0.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f41529a) {
            case 0:
                org.telegram.ui.Components.z80 z80Var = (org.telegram.ui.Components.z80) this.f41531c;
                if (z80Var != null) {
                    canvas.drawPath(z80Var, this.f41530b);
                }
                if (((org.telegram.ui.Components.d90) this.f41532e).f(canvas)) {
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
        switch (this.f41529a) {
            case 1:
                org.telegram.ui.Components.pn0 pn0Var = (org.telegram.ui.Components.pn0) this.f41532e;
                super.onLayout(z4, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < pn0Var.getChildCount(); i15++) {
                    width = Math.min(width, pn0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, pn0Var.getChildAt(i15).getRight());
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
        switch (this.f41529a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.n51[] n51VarArr = (org.telegram.ui.Components.n51[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.n51.class);
                    if (n51VarArr != null && n51VarArr.length > 0) {
                        org.telegram.ui.Components.z80 z80Var = new org.telegram.ui.Components.z80(0);
                        this.f41531c = z80Var;
                        z80Var.f33820n = false;
                        for (int i14 = 0; i14 < n51VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(n51VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(n51VarArr[i14]);
                            ((org.telegram.ui.Components.z80) this.f41531c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.z80 z80Var2 = (org.telegram.ui.Components.z80) this.f41531c;
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
                            z80Var2.f33821o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.z80) this.f41531c);
                        }
                        ((org.telegram.ui.Components.z80) this.f41531c).f33820n = true;
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
        switch (this.f41529a) {
            case 0:
                org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) this.f41532e;
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
                            d90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = h90Var;
                                h90Var.d(771751935);
                                d90Var.a((org.telegram.ui.Components.h90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.h90) this.d).f27417i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.h90) this.d).f27417i);
                                org.telegram.ui.Components.z80 b10 = ((org.telegram.ui.Components.h90) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.h90 h90Var2 = (org.telegram.ui.Components.h90) this.d;
                                if (h90Var2 != null) {
                                    CharacterStyle characterStyle = h90Var2.f27417i;
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
                    d90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t9(Context context, Paint paint) {
        super(context);
        this.f41530b = paint;
        this.f41532e = new org.telegram.ui.Components.d90(this);
    }
}
