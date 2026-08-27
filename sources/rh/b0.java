package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.xl;

public final class b0 extends View {

    public final RichMessageLayout.RichButton f47057a;

    public final int f47058b;

    public boolean f47059c;
    public boolean d;

    public final xl f47060e;

    public final e0 f47061f;

    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f47061f = e0Var;
        this.f47058b = i10;
        RichMessageLayout.RichButton richButtonCreateEditorPageButton = RichMessageLayout.createEditorPageButton(e0Var.f47113n, i0.a.d(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), e0Var.f47114r, pageButton, new qf.b(this, 10));
        this.f47057a = richButtonCreateEditorPageButton;
        this.f47060e = new xl(this, i10, 29);
        richButtonCreateEditorPageButton.width = richButtonCreateEditorPageButton.getPreferredWidth();
        setContentDescription(v5.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47057a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.f47060e);
        this.f47057a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f47057a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f47057a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        c0 c0Var;
        a aVar;
        char c10;
        int actionMasked = motionEvent.getActionMasked();
        xl xlVar = this.f47060e;
        RichMessageLayout.RichButton richButton = this.f47057a;
        if (actionMasked == 0) {
            this.f47059c = true;
            this.d = false;
            richButton.setPressed(true);
            AndroidUtilities.runOnUIThread(xlVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.f47059c && !this.d;
            this.f47059c = false;
            richButton.setPressed(false);
            AndroidUtilities.cancelRunOnUIThread(xlVar);
            if (z10 && (c0Var = (e0Var = this.f47061f).A) != null && (aVar = e0Var.f47594a) != null) {
                p3 p3Var = ((h3) c0Var).f47181a;
                TL_iv.PageBlock pageBlock = aVar.f47028b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i10 = this.f47058b;
                    if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                        b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
                        if (pageButton != null) {
                            TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                            if (richButtonStyle != null && richButtonStyle.bg_primary) {
                                c10 = 2;
                            } else if (richButtonStyle == null || !richButtonStyle.bg_danger) {
                                c10 = (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0;
                            } else {
                                c10 = 3;
                            }
                            if (richButtonStyle == null) {
                                richButtonStyle = new TL_keyboard.RichButtonStyle();
                            }
                            richButtonStyle.flags = 0;
                            richButtonStyle.bg_primary = c10 == 1;
                            richButtonStyle.bg_danger = c10 == 2;
                            richButtonStyle.bg_success = c10 == 3;
                            richButtonStyle.link = false;
                            pageButton.style = richButtonStyle;
                        }
                        p3Var.U2.N(false);
                        b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.f47340d3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.f47059c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(xlVar);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.f47059c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(xlVar);
                return true;
            }
        }
        return true;
    }
}
