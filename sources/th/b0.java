package th;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class b0 extends View {
    public final RichMessageLayout.RichButton f48357a;
    public final int f48358b;
    public boolean f48359c;
    public boolean d;
    public final sf.p1 f48360e;
    public final e0 f48361f;

    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f48361f = e0Var;
        this.f48358b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(e0Var.f48413n, j7.l1.d(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), e0Var.f48414r, pageButton, new org.telegram.ui.web.t1(this, 24));
        this.f48357a = createEditorPageButton;
        this.f48360e = new sf.p1(this, i10, 2);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(v5.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48357a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.f48360e);
        this.f48357a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f48357a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f48357a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        e0 e0Var;
        c0 c0Var;
        a aVar;
        char c3;
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        sf.p1 p1Var = this.f48360e;
        RichMessageLayout.RichButton richButton = this.f48357a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f48359c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(p1Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f48359c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(p1Var);
                    return true;
                }
            } else {
                if (this.f48359c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f48359c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(p1Var);
                if (z10 && (c0Var = (e0Var = this.f48361f).A) != null && (aVar = e0Var.f48892a) != null) {
                    p3 p3Var = ((h3) c0Var).f48481a;
                    TL_iv.PageBlock pageBlock = aVar.f48328b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f48358b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            b2 b2Var = p3Var.F3;
                            if (b2Var != null) {
                                b2Var.d();
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
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                richButtonStyle.bg_primary = z11;
                                if (c3 == 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                richButtonStyle.bg_danger = z12;
                                if (c3 == 3) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                richButtonStyle.bg_success = z13;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            p3Var.U2.N(false);
                            b2 b2Var2 = p3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                            p3Var.f48638d3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f48359c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(p1Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
