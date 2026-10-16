package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.z5;
public final class a extends FrameLayout {
    public final di.d f47554a;
    public final View f47555b;
    public final c6 f47556c;
    public final Paint d;
    public boolean e;

    public a(Context context, c6 c6Var) {
        super(context);
        this.d = new Paint(1);
        this.f47556c = c6Var;
        View view = new View(context);
        this.f47555b = view;
        addView(view, z5.n(-1, -1));
        di.d dVar = new di.d(context, c6Var, true);
        this.f47554a = dVar;
        addView(dVar, z5.a(48.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 17));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        di.d dVar = this.f47554a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f47555b.setBackgroundColor(g6.w0(g6.f19672h5, this.f47556c));
    }

    public final void b(boolean z10) {
        this.f47554a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = g6.w0(g6.f19543a7, this.f47556c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        di.d dVar = this.f47554a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.e = false;
        di.d dVar = this.f47554a;
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
        this.f47554a.setOnClickListener(onClickListener);
    }
}
