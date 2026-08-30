package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import ph.ga;
import ph.j8;
public final class b0 extends View {
    public final RichMessageLayout.RichButton f45810a;
    public final int f45811b;
    public boolean f45812c;
    public boolean d;
    public final j8 e;
    public final e0 f45813f;

    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f45813f = e0Var;
        this.f45811b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(e0Var.f45864n, kh.a2.c(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), e0Var.f45865r, pageButton, new ga(this, 26));
        this.f45810a = createEditorPageButton;
        this.e = new j8(this, i10, 4);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(x5.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45810a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f45810a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f45810a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f45810a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        e0 e0Var;
        c0 c0Var;
        a aVar;
        char c3;
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        j8 j8Var = this.e;
        RichMessageLayout.RichButton richButton = this.f45810a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f45812c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(j8Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f45812c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(j8Var);
                    return true;
                }
            } else {
                if (this.f45812c && !this.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f45812c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(j8Var);
                if (z4 && (c0Var = (e0Var = this.f45813f).B) != null && (aVar = e0Var.f46283a) != null) {
                    r3 r3Var = ((j3) c0Var).f45959a;
                    TL_iv.PageBlock pageBlock = aVar.f45775b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f45811b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            c2 c2Var = r3Var.G3;
                            if (c2Var != null) {
                                c2Var.d();
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
                            c2 c2Var2 = r3Var.G3;
                            if (c2Var2 != null) {
                                c2Var2.h();
                            }
                            r3Var.f46112e3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f45812c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(j8Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
