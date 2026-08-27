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

public final class sl0 extends FrameLayout {

    public final int f42664a;

    public Object f42665b;

    public float f42666c;
    public final KeyEvent.Callback d;

    public sl0(Context context, EditTextBoldCursor editTextBoldCursor, int i10) {
        super(context);
        this.f42664a = i10;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f42664a) {
            case 0:
                if (((StaticLayout) this.f42665b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f42666c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f42665b).draw(canvas);
                    canvas.restore();
                }
                break;
            case 1:
                if (((StaticLayout) this.f42665b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f42666c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f42665b).draw(canvas);
                    canvas.restore();
                }
                break;
            case 2:
                if (((StaticLayout) this.f42665b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f42666c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f42665b).draw(canvas);
                    canvas.restore();
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f42664a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout = ((EditTextBoldCursor) this.d).getErrorLayout(size);
                this.f42665b = errorLayout;
                if (errorLayout != null) {
                    int lineCount = errorLayout.getLineCount();
                    if (lineCount > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f42665b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f42665b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float fMax = 0.0f;
                        for (int i12 = 0; i12 < lineCount; i12++) {
                            if (((StaticLayout) this.f42665b).getLineLeft(i12) != 0.0f) {
                                this.f42666c = 0.0f;
                            } else {
                                fMax = Math.max(fMax, ((StaticLayout) this.f42665b).getLineWidth(i12));
                                if (i12 == lineCount - 1) {
                                    this.f42666c = size - fMax;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i10, i11);
                break;
            case 1:
                int size2 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout2 = ((EditTextBoldCursor) this.d).getErrorLayout(size2);
                this.f42665b = errorLayout2;
                if (errorLayout2 != null) {
                    int lineCount2 = errorLayout2.getLineCount();
                    if (lineCount2 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f42665b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f42665b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float fMax2 = 0.0f;
                        for (int i13 = 0; i13 < lineCount2; i13++) {
                            if (((StaticLayout) this.f42665b).getLineLeft(i13) != 0.0f) {
                                this.f42666c = 0.0f;
                            } else {
                                fMax2 = Math.max(fMax2, ((StaticLayout) this.f42665b).getLineWidth(i13));
                                if (i13 == lineCount2 - 1) {
                                    this.f42666c = size2 - fMax2;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i10, i11);
                break;
            case 2:
                int size3 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout3 = ((EditTextBoldCursor) this.d).getErrorLayout(size3);
                this.f42665b = errorLayout3;
                if (errorLayout3 != null) {
                    int lineCount3 = errorLayout3.getLineCount();
                    if (lineCount3 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f42665b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f42665b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float fMax3 = 0.0f;
                        for (int i14 = 0; i14 < lineCount3; i14++) {
                            if (((StaticLayout) this.f42665b).getLineLeft(i14) != 0.0f) {
                                this.f42666c = 0.0f;
                            } else {
                                fMax3 = Math.max(fMax3, ((StaticLayout) this.f42665b).getLineWidth(i14));
                                if (i14 == lineCount3 - 1) {
                                    this.f42666c = size3 - fMax3;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                org.telegram.ui.Components.yh0 yh0Var = (org.telegram.ui.Components.yh0) this.d;
                org.telegram.ui.Components.ri0 ri0Var = yh0Var.h;
                float measuredHeight = (yh0Var.f34907f / 768.0f) * ((org.telegram.ui.Components.ce) this.f42665b).getMeasuredHeight();
                if (this.f42666c != measuredHeight) {
                    this.f42666c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = ri0Var.getLayoutParams();
                    int i15 = (int) measuredHeight;
                    ri0Var.getLayoutParams().width = i15;
                    layoutParams.height = i15;
                    super.onMeasure(i10, i11);
                }
                break;
        }
    }

    public sl0(org.telegram.ui.Components.yh0 yh0Var, Context context, org.telegram.ui.Components.ce ceVar) {
        super(context);
        this.f42664a = 3;
        this.d = yh0Var;
        this.f42665b = ceVar;
    }
}
