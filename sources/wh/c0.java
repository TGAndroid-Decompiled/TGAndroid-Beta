package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import qh.d8;
import qh.u9;
public final class c0 extends View {
    public final RichMessageLayout.RichButton f49716a;
    public final int f49717b;
    public boolean f49718c;
    public boolean d;
    public final d8 f49719e;
    public final f0 f49720f;

    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f49720f = f0Var;
        this.f49717b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(f0Var.f49772n, l.d.c(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), f0Var.f49773r, pageButton, new u9(this, 28));
        this.f49716a = createEditorPageButton;
        this.f49719e = new d8(this, i10, 5);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(x5.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49716a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.f49719e);
        this.f49716a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f49716a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f49716a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        f0 f0Var;
        d0 d0Var;
        a aVar;
        char c3;
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        d8 d8Var = this.f49719e;
        RichMessageLayout.RichButton richButton = this.f49716a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f49718c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(d8Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f49718c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(d8Var);
                    return true;
                }
            } else {
                if (this.f49718c && !this.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f49718c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(d8Var);
                if (z4 && (d0Var = (f0Var = this.f49720f).B) != null && (aVar = f0Var.f50211a) != null) {
                    r3 r3Var = ((j3) d0Var).f49848a;
                    TL_iv.PageBlock pageBlock = aVar.f49653b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f49717b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            d2 d2Var = r3Var.G3;
                            if (d2Var != null) {
                                d2Var.d();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
                            if (pageButton != null) {
                                TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                                if (richButtonStyle != null && richButtonStyle.bg_primary) {
                                    c3 = 2;
                                } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                                    c3 = 3;
                                } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                                    c3 = 0;
                                } else {
                                    c3 = 1;
                                }
                                if (richButtonStyle == null) {
                                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                                }
                                richButtonStyle.flags = 0;
                                if (c3 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                richButtonStyle.bg_primary = z10;
                                if (c3 == 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                richButtonStyle.bg_danger = z11;
                                if (c3 == 3) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                richButtonStyle.bg_success = z12;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            r3Var.V2.N(false);
                            d2 d2Var2 = r3Var.G3;
                            if (d2Var2 != null) {
                                d2Var2.h();
                            }
                            r3Var.f50016e3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f49718c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(d8Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
