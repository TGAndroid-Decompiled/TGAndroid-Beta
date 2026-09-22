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
    public final int f37297a = 0;
    public final Paint f37298b;
    public Path f37299c;
    public Object d;
    public final Object e;

    public s9(org.telegram.ui.Components.hn0 hn0Var, Context context) {
        super(context);
        this.e = hn0Var;
        this.f37299c = new Path();
        this.d = new RectF();
        this.f37298b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37297a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.i6.l1(0.15f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19035o6, ((org.telegram.ui.Components.hn0) this.e).f24730c));
                Paint paint = this.f37298b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f37299c;
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
        switch (this.f37297a) {
            case 0:
                org.telegram.ui.Components.w80 w80Var = (org.telegram.ui.Components.w80) this.f37299c;
                if (w80Var != null) {
                    canvas.drawPath(w80Var, this.f37298b);
                }
                if (((org.telegram.ui.Components.z80) this.e).f(canvas)) {
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
        switch (this.f37297a) {
            case 1:
                org.telegram.ui.Components.hn0 hn0Var = (org.telegram.ui.Components.hn0) this.e;
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
        switch (this.f37297a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.m51[] m51VarArr = (org.telegram.ui.Components.m51[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.m51.class);
                    if (m51VarArr != null && m51VarArr.length > 0) {
                        org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(0);
                        this.f37299c = w80Var;
                        w80Var.f29657n = false;
                        for (int i14 = 0; i14 < m51VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(m51VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(m51VarArr[i14]);
                            ((org.telegram.ui.Components.w80) this.f37299c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.w80 w80Var2 = (org.telegram.ui.Components.w80) this.f37299c;
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
                            w80Var2.f29658o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.w80) this.f37299c);
                        }
                        ((org.telegram.ui.Components.w80) this.f37299c).f29657n = true;
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
        switch (this.f37297a) {
            case 0:
                org.telegram.ui.Components.z80 z80Var = (org.telegram.ui.Components.z80) this.e;
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
                            z80Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = d90Var;
                                d90Var.d(771751935);
                                z80Var.a((org.telegram.ui.Components.d90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.d90) this.d).f23247i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.d90) this.d).f23247i);
                                org.telegram.ui.Components.w80 b10 = ((org.telegram.ui.Components.d90) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.d90 d90Var2 = (org.telegram.ui.Components.d90) this.d;
                                if (d90Var2 != null) {
                                    CharacterStyle characterStyle = d90Var2.f23247i;
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
                    z80Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public s9(Context context, Paint paint) {
        super(context);
        this.f37298b = paint;
        this.e = new org.telegram.ui.Components.z80(this);
    }
}
