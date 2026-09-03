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
import ph.i8;
public final class c0 extends View {
    public final RichMessageLayout.RichButton f45910a;
    public final int f45911b;
    public boolean f45912c;
    public boolean d;
    public final i8 e;
    public final f0 f45913f;

    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f45913f = f0Var;
        this.f45911b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(f0Var.f45961n, kf.k0.c(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), f0Var.f45962r, pageButton, new ga(this, 27));
        this.f45910a = createEditorPageButton;
        this.e = new i8(this, i10, 4);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(y5.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45910a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f45910a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f45910a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f45910a;
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
        i8 i8Var = this.e;
        RichMessageLayout.RichButton richButton = this.f45910a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f45912c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(i8Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f45912c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(i8Var);
                    return true;
                }
            } else {
                if (this.f45912c && !this.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f45912c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(i8Var);
                if (z4 && (d0Var = (f0Var = this.f45913f).B) != null && (aVar = f0Var.f46414a) != null) {
                    s3 s3Var = ((k3) d0Var).f46056a;
                    TL_iv.PageBlock pageBlock = aVar.f45853b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f45911b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            d2 d2Var = s3Var.G3;
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
                            s3Var.V2.N(false);
                            d2 d2Var2 = s3Var.G3;
                            if (d2Var2 != null) {
                                d2Var2.h();
                            }
                            s3Var.f46209e3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f45912c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(i8Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
