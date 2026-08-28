package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rl0 extends FrameLayout {
    public final int f42460a;
    public Object f42461b;
    public float f42462c;
    public final KeyEvent.Callback d;

    public rl0(Context context, EditTextBoldCursor editTextBoldCursor, int i9) {
        super(context);
        this.f42460a = i9;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f42460a) {
            case 0:
                if (((StaticLayout) this.f42461b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f42462c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f42461b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f42461b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f42462c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f42461b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f42461b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f42462c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f42461b).draw(canvas);
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
    public final void onMeasure(int i9, int i10) {
        switch (this.f42460a) {
            case 0:
                int size = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout = ((EditTextBoldCursor) this.d).getErrorLayout(size);
                this.f42461b = errorLayout;
                if (errorLayout != null) {
                    int lineCount = errorLayout.getLineCount();
                    int i11 = 0;
                    if (lineCount > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f42461b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f42461b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i11 < lineCount) {
                                if (((StaticLayout) this.f42461b).getLineLeft(i11) != 0.0f) {
                                    this.f42462c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f42461b).getLineWidth(i11));
                                    if (i11 == lineCount - 1) {
                                        this.f42462c = size - f10;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i9, i10);
                return;
            case 1:
                int size2 = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout2 = ((EditTextBoldCursor) this.d).getErrorLayout(size2);
                this.f42461b = errorLayout2;
                if (errorLayout2 != null) {
                    int lineCount2 = errorLayout2.getLineCount();
                    int i12 = 0;
                    if (lineCount2 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f42461b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f42461b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i12 < lineCount2) {
                                if (((StaticLayout) this.f42461b).getLineLeft(i12) != 0.0f) {
                                    this.f42462c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f42461b).getLineWidth(i12));
                                    if (i12 == lineCount2 - 1) {
                                        this.f42462c = size2 - f11;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i9, i10);
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout3 = ((EditTextBoldCursor) this.d).getErrorLayout(size3);
                this.f42461b = errorLayout3;
                if (errorLayout3 != null) {
                    int lineCount3 = errorLayout3.getLineCount();
                    int i13 = 0;
                    if (lineCount3 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f42461b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f42461b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f12 = 0.0f;
                        while (true) {
                            if (i13 < lineCount3) {
                                if (((StaticLayout) this.f42461b).getLineLeft(i13) != 0.0f) {
                                    this.f42462c = 0.0f;
                                } else {
                                    f12 = Math.max(f12, ((StaticLayout) this.f42461b).getLineWidth(i13));
                                    if (i13 == lineCount3 - 1) {
                                        this.f42462c = size3 - f12;
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                org.telegram.ui.Components.wh0 wh0Var = (org.telegram.ui.Components.wh0) this.d;
                org.telegram.ui.Components.pi0 pi0Var = wh0Var.h;
                float measuredHeight = (wh0Var.f34231f / 768.0f) * ((org.telegram.ui.Components.ge) this.f42461b).getMeasuredHeight();
                if (this.f42462c != measuredHeight) {
                    this.f42462c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = pi0Var.getLayoutParams();
                    int i14 = (int) measuredHeight;
                    pi0Var.getLayoutParams().width = i14;
                    layoutParams.height = i14;
                    super.onMeasure(i9, i10);
                    return;
                }
                return;
        }
    }

    public rl0(org.telegram.ui.Components.wh0 wh0Var, Context context, org.telegram.ui.Components.ge geVar) {
        super(context);
        this.f42460a = 3;
        this.d = wh0Var;
        this.f42461b = geVar;
    }
}
