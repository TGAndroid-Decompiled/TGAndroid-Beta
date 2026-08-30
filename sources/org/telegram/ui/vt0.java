package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vt0 extends ih.s {
    public final org.telegram.ui.Cells.w9 O;
    public ArrayList P;
    public boolean Q;
    public Layout R;
    public org.telegram.ui.Components.q5 S;
    public boolean T;
    public org.telegram.ui.Components.i90 U;
    public Layout V;
    public Path W;

    public vt0(Context context, tt0 tt0Var, org.telegram.ui.Cells.w9 w9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.f7661x = new org.telegram.ui.Components.d90(this) {
            public final vt0 f39000b;

            {
                this.f39000b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        vt0 vt0Var = this.f39000b;
                        vt0Var.getClass();
                        ((Utilities.Callback2) callback2).run(clickableSpan, vt0Var);
                        return;
                    default:
                        vt0 vt0Var2 = this.f39000b;
                        ((Utilities.Callback3) callback2).run(clickableSpan, vt0Var2, new el0(vt0Var2, 22));
                        return;
                }
            }
        };
        this.f7662y = new org.telegram.ui.Components.d90(this) {
            public final vt0 f39000b;

            {
                this.f39000b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        vt0 vt0Var = this.f39000b;
                        vt0Var.getClass();
                        ((Utilities.Callback2) callback3).run(clickableSpan, vt0Var);
                        return;
                    default:
                        vt0 vt0Var2 = this.f39000b;
                        ((Utilities.Callback3) callback3).run(clickableSpan, vt0Var2, new el0(vt0Var2, 22));
                        return;
                }
            }
        };
        this.O = w9Var;
        k7.h6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(k7.b6.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new e60(tt0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float f10;
        if (this.T) {
            Layout layout = getLayout();
            Path path = this.W;
            if (path == null || this.V != layout) {
                if (path == null) {
                    this.W = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    int i11 = 0;
                    float f11 = 0.0f;
                    while (i11 < layout.getLineCount()) {
                        float f12 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i11) - f12;
                        float lineRight = layout.getLineRight(i11) + f12;
                        if (i11 == 0) {
                            f11 = layout.getLineTop(i11) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i11);
                        if (i11 >= layout.getLineCount() - 1) {
                            f10 = (dp2 / 3.0f) + lineBottom;
                        } else {
                            f10 = lineBottom;
                        }
                        this.W.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f11, getPaddingLeft() + lineRight, getPaddingTop() + f10, Path.Direction.CW);
                        i11++;
                        f11 = f10;
                    }
                }
                this.V = layout;
            }
            if (this.U == null) {
                org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90();
                this.U = i90Var;
                i90Var.f25651x = this.W;
                i90Var.j(4.0f);
                this.U.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
                this.U.setCallback(this);
            }
            this.U.setBounds(0, 0, getWidth(), getHeight());
            this.U.draw(canvas);
        }
        if (this.T) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.P != null && this.Q) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i12 = 0; i12 < this.P.size(); i12++) {
                org.telegram.ui.Components.vi0 vi0Var = (org.telegram.ui.Components.vi0) this.P.get(i12);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.Q) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = 0;
                }
                getPaint();
                vi0Var.a(canvas, width + i10, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.T) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, getLayout(), this.S, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release(this, this.S);
        this.P = org.telegram.ui.Components.zi0.e(null, this.P);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.w9 w9Var = this.O;
        if (w9Var != null && w9Var.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (w9Var != null && getStaticTextLayout() != null && w9Var.f22551u0 == this) {
                w9Var.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.R != getLayout()) {
            boolean z4 = true;
            int i10 = 0;
            this.S = org.telegram.ui.Components.u5.update(0, this, this.S, getLayout());
            this.P = org.telegram.ui.Components.zi0.e(getLayout(), this.P);
            z4 = (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.yi0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.yi0.class)).length <= 0) ? false : false;
            this.Q = z4;
            if (z4) {
                i10 = 32;
            }
            k7.h6.a(this, 16.0f, 8.0f, i10 + 16, 8.0f);
            this.R = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.S = org.telegram.ui.Components.u5.update(0, this, this.S, getLayout());
        this.P = org.telegram.ui.Components.zi0.e(getLayout(), this.P);
    }

    public void setLoading(boolean z4) {
        if (this.T == z4) {
            return;
        }
        this.T = z4;
        invalidate();
    }

    @Override
    public void setPressed(boolean z4) {
        boolean z10;
        if (z4 != isPressed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setPressed(z4);
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.U && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
