package sf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
public final class o extends EditTextBoldCursor {
    public final f5 f47907b;
    public int f47908c;
    public final n6 d;
    public final c6 f47909e;

    public o(Context context, c6 c6Var) {
        super(context);
        this.f47909e = c6Var;
        this.f47907b = new f5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.d = n6Var;
        n6Var.k(0.2f, 160L, jr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f30862b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f47908c < 0) {
            i10 = g6.f23279p7;
        } else {
            i10 = g6.P5;
        }
        int a2 = this.f47907b.a(g6.v0(i10, this.f47909e), false);
        n6 n6Var = this.d;
        n6Var.r(a2);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        n6 n6Var = this.d;
        if (n6Var != null) {
            this.f47908c = 32 - charSequence.length();
            n6Var.b();
            String str = "";
            if (this.f47908c <= 4) {
                str = "" + this.f47908c;
            }
            n6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
