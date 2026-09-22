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
public final class qu0 extends vh.o {
    public final org.telegram.ui.Cells.aa R;
    public ArrayList S;
    public boolean T;
    public Layout U;
    public org.telegram.ui.Components.t5 V;
    public boolean W;
    public org.telegram.ui.Components.g90 f36942a0;
    public Layout f36943b0;
    public Path f36944c0;

    public qu0(Context context, ou0 ou0Var, org.telegram.ui.Cells.aa aaVar, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.f44455x = new org.telegram.ui.Components.b90(this) {
            public final qu0 f36682b;

            {
                this.f36682b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        qu0 qu0Var = this.f36682b;
                        qu0Var.getClass();
                        ((Utilities.Callback2) callback2).run(clickableSpan, qu0Var);
                        return;
                    default:
                        qu0 qu0Var2 = this.f36682b;
                        ((Utilities.Callback3) callback2).run(clickableSpan, qu0Var2, new pl0(qu0Var2, 21));
                        return;
                }
            }
        };
        this.f44456y = new org.telegram.ui.Components.b90(this) {
            public final qu0 f36682b;

            {
                this.f36682b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        qu0 qu0Var = this.f36682b;
                        qu0Var.getClass();
                        ((Utilities.Callback2) callback3).run(clickableSpan, qu0Var);
                        return;
                    default:
                        qu0 qu0Var2 = this.f36682b;
                        ((Utilities.Callback3) callback3).run(clickableSpan, qu0Var2, new pl0(qu0Var2, 21));
                        return;
                }
            }
        };
        this.R = aaVar;
        w7.d6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(w7.x5.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new k60(ou0Var, 19));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.W) {
            Layout layout = getLayout();
            Path path = this.f36944c0;
            if (path == null || this.f36943b0 != layout) {
                if (path == null) {
                    this.f36944c0 = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    int i11 = 0;
                    float f10 = 0.0f;
                    while (i11 < layout.getLineCount()) {
                        float f11 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i11) - f11;
                        float lineRight = layout.getLineRight(i11) + f11;
                        if (i11 == 0) {
                            f10 = layout.getLineTop(i11) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i11);
                        if (i11 >= layout.getLineCount() - 1) {
                            f7 = (dp2 / 3.0f) + lineBottom;
                        } else {
                            f7 = lineBottom;
                        }
                        this.f36944c0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f7, Path.Direction.CW);
                        i11++;
                        f10 = f7;
                    }
                }
                this.f36943b0 = layout;
            }
            if (this.f36942a0 == null) {
                org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90();
                this.f36942a0 = g90Var;
                g90Var.f24277x = this.f36944c0;
                g90Var.j(4.0f);
                this.f36942a0.f(org.telegram.ui.ActionBar.i6.l1(0.3f, -1), org.telegram.ui.ActionBar.i6.l1(0.1f, -1), org.telegram.ui.ActionBar.i6.l1(0.2f, -1), org.telegram.ui.ActionBar.i6.l1(0.7f, -1));
                this.f36942a0.setCallback(this);
            }
            this.f36942a0.setBounds(0, 0, getWidth(), getHeight());
            this.f36942a0.draw(canvas);
        }
        if (this.W) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.S != null && this.T) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i12 = 0; i12 < this.S.size(); i12++) {
                org.telegram.ui.Components.oi0 oi0Var = (org.telegram.ui.Components.oi0) this.S.get(i12);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.T) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = 0;
                }
                getPaint();
                oi0Var.a(canvas, width + i10, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.W) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, getLayout(), this.V, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.x5.release(this, this.V);
        this.S = org.telegram.ui.Components.si0.e(null, this.S);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.aa aaVar = this.R;
        if (aaVar != null && aaVar.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (aaVar != null && getStaticTextLayout() != null && aaVar.f19792u0 == this) {
                aaVar.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.U != getLayout()) {
            boolean z10 = true;
            int i10 = 0;
            this.V = org.telegram.ui.Components.x5.update(0, this, this.V, getLayout());
            this.S = org.telegram.ui.Components.si0.e(getLayout(), this.S);
            z10 = (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.ri0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.ri0.class)).length <= 0) ? false : false;
            this.T = z10;
            if (z10) {
                i10 = 32;
            }
            w7.d6.a(this, 16.0f, 8.0f, i10 + 16, 8.0f);
            this.U = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.V = org.telegram.ui.Components.x5.update(0, this, this.V, getLayout());
        this.S = org.telegram.ui.Components.si0.e(getLayout(), this.S);
    }

    public void setLoading(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        invalidate();
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        if (z10 != isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f36942a0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
