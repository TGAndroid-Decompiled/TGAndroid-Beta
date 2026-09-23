package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.x5;
public final class a extends FrameLayout {
    public final ci.d f44247a;
    public final View f44248b;
    public final d6 f44249c;
    public final Paint d;
    public boolean e;

    public a(Context context, d6 d6Var) {
        super(context);
        this.d = new Paint(1);
        this.f44249c = d6Var;
        View view = new View(context);
        this.f44248b = view;
        addView(view, x5.n(-1, -1));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f44247a = dVar;
        addView(dVar, x5.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        ci.d dVar = this.f44247a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f44248b.setBackgroundColor(h6.v0(h6.f18859h5, this.f44249c));
    }

    public final void b(boolean z10) {
        this.f44247a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v02 = h6.v0(h6.f18733a7, this.f44249c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        ci.d dVar = this.f44247a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.e = false;
        ci.d dVar = this.f44247a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z10) {
            formatString = LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]);
        } else {
            formatString = LocaleController.formatString("OK", R.string.OK, new Object[0]);
        }
        dVar.g(formatString, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f44247a.setOnClickListener(onClickListener);
    }
}
