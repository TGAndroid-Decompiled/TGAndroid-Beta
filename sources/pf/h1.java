package pf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
public final class h1 extends EditTextBoldCursor {
    public final b5 f45646b;
    public int f45647c;
    public final i6 d;
    public final b6 f45648e;

    public h1(Context context, b6 b6Var) {
        super(context);
        this.f45648e = b6Var;
        this.f45646b = new b5(this);
        i6 i6Var = new i6(false, true, true, false);
        this.d = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.f29333b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        if (this.f45647c < 0) {
            i9 = f6.f23212p7;
        } else {
            i9 = f6.P5;
        }
        int a2 = this.f45646b.a(f6.v0(i9, this.f45648e), false);
        i6 i6Var = this.d;
        i6Var.r(a2);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        i6 i6Var = this.d;
        if (i6Var != null) {
            this.f45647c = 32 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.f45647c <= 4) {
                str = "" + this.f45647c;
            }
            i6Var.q(str, true, true);
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
