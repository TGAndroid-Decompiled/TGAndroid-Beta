package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.qd;
public final class b0 extends View {
    public final RichMessageLayout.RichButton f46299a;
    public final int f46300b;
    public boolean f46301c;
    public boolean d;
    public final qd f46302e;
    public final e0 f46303f;

    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i9) {
        super(context);
        this.f46303f = e0Var;
        this.f46300b = i9;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(e0Var.f46355n, org.telegram.messenger.l0.b(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), e0Var.f46356r, pageButton, new pf.o1(this, 3));
        this.f46299a = createEditorPageButton;
        this.f46302e = new qd(this, i9, 29);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(u5.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46299a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.f46302e);
        this.f46299a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f46299a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        RichMessageLayout.RichButton richButton = this.f46299a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        e0 e0Var;
        c0 c0Var;
        a aVar;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        qd qdVar = this.f46302e;
        RichMessageLayout.RichButton richButton = this.f46299a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f46301c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(qdVar);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f46301c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(qdVar);
                    return true;
                }
            } else {
                if (this.f46301c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f46301c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                if (z10 && (c0Var = (e0Var = this.f46303f).A) != null && (aVar = e0Var.f46834a) != null) {
                    o3 o3Var = ((g3) c0Var).f46405a;
                    TL_iv.PageBlock pageBlock = aVar.f46269b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i9 = this.f46300b;
                        if (i9 >= 0 && i9 < pageblockbuttonrow.buttons.size()) {
                            b2 b2Var = o3Var.F3;
                            if (b2Var != null) {
                                b2Var.d();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i9);
                            if (pageButton != null) {
                                TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                                if (richButtonStyle != null && richButtonStyle.bg_primary) {
                                    c10 = 2;
                                } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                                    c10 = 3;
                                } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                                    c10 = 0;
                                } else {
                                    c10 = 1;
                                }
                                if (richButtonStyle == null) {
                                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                                }
                                richButtonStyle.flags = 0;
                                if (c10 == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                richButtonStyle.bg_primary = z11;
                                if (c10 == 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                richButtonStyle.bg_danger = z12;
                                if (c10 == 3) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                richButtonStyle.bg_success = z13;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            o3Var.U2.N(false);
                            b2 b2Var2 = o3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                            o3Var.f46565d3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f46301c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(qdVar, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
