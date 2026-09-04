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
    public final int f40351a = 0;
    public final Paint f40352b;
    public Path f40353c;
    public Object d;
    public final Object f40354e;

    public s9(org.telegram.ui.Components.hn0 hn0Var, Context context) {
        super(context);
        this.f40354e = hn0Var;
        this.f40353c = new Path();
        this.d = new RectF();
        this.f40352b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40351a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20862o6, ((org.telegram.ui.Components.hn0) this.f40354e).f26764c));
                Paint paint = this.f40352b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f40353c;
                Paint paint2 = ah.k1.V;
                ah.k1.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f40351a) {
            case 0:
                org.telegram.ui.Components.x80 x80Var = (org.telegram.ui.Components.x80) this.f40353c;
                if (x80Var != null) {
                    canvas.drawPath(x80Var, this.f40352b);
                }
                if (((org.telegram.ui.Components.a90) this.f40354e).f(canvas)) {
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
        switch (this.f40351a) {
            case 1:
                org.telegram.ui.Components.hn0 hn0Var = (org.telegram.ui.Components.hn0) this.f40354e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < hn0Var.getChildCount(); i15++) {
                    width = Math.min(width, hn0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, hn0Var.getChildAt(i15).getRight());
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
        switch (this.f40351a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.l51[] l51VarArr = (org.telegram.ui.Components.l51[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.l51.class);
                    if (l51VarArr != null && l51VarArr.length > 0) {
                        org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(0);
                        this.f40353c = x80Var;
                        x80Var.f32457n = false;
                        for (int i14 = 0; i14 < l51VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(l51VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(l51VarArr[i14]);
                            ((org.telegram.ui.Components.x80) this.f40353c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.x80 x80Var2 = (org.telegram.ui.Components.x80) this.f40353c;
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
                            x80Var2.f32458o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.x80) this.f40353c);
                        }
                        ((org.telegram.ui.Components.x80) this.f40353c).f32457n = true;
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
        switch (this.f40351a) {
            case 0:
                org.telegram.ui.Components.a90 a90Var = (org.telegram.ui.Components.a90) this.f40354e;
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
                            a90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = e90Var;
                                e90Var.d(771751935);
                                a90Var.a((org.telegram.ui.Components.e90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.e90) this.d).f25623i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.e90) this.d).f25623i);
                                org.telegram.ui.Components.x80 b10 = ((org.telegram.ui.Components.e90) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.e90 e90Var2 = (org.telegram.ui.Components.e90) this.d;
                                if (e90Var2 != null) {
                                    CharacterStyle characterStyle = e90Var2.f25623i;
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
                    a90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public s9(Context context, Paint paint) {
        super(context);
        this.f40352b = paint;
        this.f40354e = new org.telegram.ui.Components.a90(this);
    }
}
