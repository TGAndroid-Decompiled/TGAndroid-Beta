package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.x5;
public final class a extends FrameLayout {
    public final di.d f48524a;
    public final View f48525b;
    public final f6 f48526c;
    public final Paint d;
    public boolean f48527e;

    public a(Context context, f6 f6Var) {
        super(context);
        this.d = new Paint(1);
        this.f48526c = f6Var;
        View view = new View(context);
        this.f48525b = view;
        addView(view, x5.n(-1, -1));
        di.d dVar = new di.d(context, f6Var, true);
        this.f48524a = dVar;
        addView(dVar, x5.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.f48527e = true;
        di.d dVar = this.f48524a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f48525b.setBackgroundColor(j6.v0(j6.f20762h5, this.f48526c));
    }

    public final void b(boolean z10) {
        this.f48524a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f48527e) {
            int v02 = j6.v0(j6.f20635a7, this.f48526c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f48527e = false;
        di.d dVar = this.f48524a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.f48527e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.f48527e = false;
        di.d dVar = this.f48524a;
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
        this.f48524a.setOnClickListener(onClickListener);
    }
}
