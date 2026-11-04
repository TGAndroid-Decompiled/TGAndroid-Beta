package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vi0 extends FrameLayout {
    public final int f50540a;
    public Object f50541b;
    public float f50542c;
    public final KeyEvent.Callback d;

    public vi0(Context context, EditTextBoldCursor editTextBoldCursor, int i3) {
        super(context);
        this.f50540a = i3;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f50540a) {
            case 0:
                if (((StaticLayout) this.f50541b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.f50542c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.f50541b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f50541b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.f50542c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.f50541b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f50541b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.f50542c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.f50541b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.Components.og0 og0Var;
        switch (this.f50540a) {
            case 0:
                int size = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p10 = ((EditTextBoldCursor) this.d).p(size);
                this.f50541b = p10;
                if (p10 != null) {
                    int lineCount = p10.getLineCount();
                    int i11 = 0;
                    if (lineCount > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f50541b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f50541b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.bd.f21784a0) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i11 < lineCount) {
                                if (((StaticLayout) this.f50541b).getLineLeft(i11) != 0.0f) {
                                    this.f50542c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f50541b).getLineWidth(i11));
                                    if (i11 == lineCount - 1) {
                                        this.f50542c = size - f10;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i3, i10);
                return;
            case 1:
                int size2 = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p11 = ((EditTextBoldCursor) this.d).p(size2);
                this.f50541b = p11;
                if (p11 != null) {
                    int lineCount2 = p11.getLineCount();
                    int i12 = 0;
                    if (lineCount2 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f50541b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f50541b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.bd.f21784a0) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i12 < lineCount2) {
                                if (((StaticLayout) this.f50541b).getLineLeft(i12) != 0.0f) {
                                    this.f50542c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f50541b).getLineWidth(i12));
                                    if (i12 == lineCount2 - 1) {
                                        this.f50542c = size2 - f11;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i3, i10);
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p12 = ((EditTextBoldCursor) this.d).p(size3);
                this.f50541b = p12;
                if (p12 != null) {
                    int lineCount3 = p12.getLineCount();
                    int i13 = 0;
                    if (lineCount3 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f50541b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f50541b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.bd.f21784a0) {
                        float f12 = 0.0f;
                        while (true) {
                            if (i13 < lineCount3) {
                                if (((StaticLayout) this.f50541b).getLineLeft(i13) != 0.0f) {
                                    this.f50542c = 0.0f;
                                } else {
                                    f12 = Math.max(f12, ((StaticLayout) this.f50541b).getLineWidth(i13));
                                    if (i13 == lineCount3 - 1) {
                                        this.f50542c = size3 - f12;
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i3, i10);
                return;
            default:
                super.onMeasure(i3, i10);
                org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Components.og0) this.d).f36827o1;
                float measuredHeight = (og0Var.f36826n1 / 768.0f) * ((lg.k) this.f50541b).getMeasuredHeight();
                if (this.f50542c != measuredHeight) {
                    this.f50542c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = fh0Var.getLayoutParams();
                    int i14 = (int) measuredHeight;
                    fh0Var.getLayoutParams().width = i14;
                    layoutParams.height = i14;
                    super.onMeasure(i3, i10);
                    return;
                }
                return;
        }
    }

    public vi0(org.telegram.ui.Components.og0 og0Var, Context context, lg.k kVar) {
        super(context);
        this.f50540a = 3;
        this.d = og0Var;
        this.f50541b = kVar;
    }
}
