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
public final class u9 extends TextView {
    public final int f41881a = 0;
    public final Paint f41882b;
    public Path f41883c;
    public Object d;
    public final Object e;

    public u9(org.telegram.ui.Components.go0 go0Var, Context context) {
        super(context);
        this.e = go0Var;
        this.f41883c = new Path();
        this.d = new RectF();
        this.f41882b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41881a) {
            case 1:
                int m12 = org.telegram.ui.ActionBar.h6.m1(0.15f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21193o6, ((org.telegram.ui.Components.go0) this.e).f26616c));
                Paint paint = this.f41882b;
                paint.setColor(m12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f41883c;
                Paint paint2 = ah.j1.V;
                ah.j1.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f41881a) {
            case 0:
                org.telegram.ui.Components.r90 r90Var = (org.telegram.ui.Components.r90) this.f41883c;
                if (r90Var != null) {
                    canvas.drawPath(r90Var, this.f41882b);
                }
                if (((org.telegram.ui.Components.u90) this.e).f(canvas)) {
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
        switch (this.f41881a) {
            case 1:
                org.telegram.ui.Components.go0 go0Var = (org.telegram.ui.Components.go0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < go0Var.getChildCount(); i15++) {
                    width = Math.min(width, go0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, go0Var.getChildAt(i15).getRight());
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
        switch (this.f41881a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.l61[] l61VarArr = (org.telegram.ui.Components.l61[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.l61.class);
                    if (l61VarArr != null && l61VarArr.length > 0) {
                        org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(0);
                        this.f41883c = r90Var;
                        r90Var.f29897n = false;
                        for (int i14 = 0; i14 < l61VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(l61VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(l61VarArr[i14]);
                            ((org.telegram.ui.Components.r90) this.f41883c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.r90 r90Var2 = (org.telegram.ui.Components.r90) this.f41883c;
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
                            r90Var2.f29898o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.r90) this.f41883c);
                        }
                        ((org.telegram.ui.Components.r90) this.f41883c).f29897n = true;
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
        switch (this.f41881a) {
            case 0:
                org.telegram.ui.Components.u90 u90Var = (org.telegram.ui.Components.u90) this.e;
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
                            u90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = y90Var;
                                y90Var.d(771751935);
                                u90Var.a((org.telegram.ui.Components.y90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.y90) this.d).f32601i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.y90) this.d).f32601i);
                                org.telegram.ui.Components.r90 b10 = ((org.telegram.ui.Components.y90) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.y90 y90Var2 = (org.telegram.ui.Components.y90) this.d;
                                if (y90Var2 != null) {
                                    CharacterStyle characterStyle = y90Var2.f32601i;
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
                    u90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public u9(Context context, Paint paint) {
        super(context);
        this.f41882b = paint;
        this.e = new org.telegram.ui.Components.u90(this);
    }
}
