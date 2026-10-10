package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.x5;
public final class a extends FrameLayout {
    public final ci.d f49607a;
    public final View f49608b;
    public final e6 f49609c;
    public final Paint d;
    public boolean f49610e;

    public a(Context context, e6 e6Var) {
        super(context);
        this.d = new Paint(1);
        this.f49609c = e6Var;
        View view = new View(context);
        this.f49608b = view;
        addView(view, x5.n(-1, -1));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.f49607a = dVar;
        addView(dVar, x5.a(48.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 17));
    }

    public final void a(int i10, boolean z10) {
        this.f49610e = true;
        ci.d dVar = this.f49607a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f49608b.setBackgroundColor(i6.w0(i6.f20872h5, this.f49609c));
    }

    public final void b(boolean z10) {
        this.f49607a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f49610e) {
            int w02 = i6.w0(i6.f20745a7, this.f49609c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f49610e = false;
        ci.d dVar = this.f49607a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.f49610e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.f49610e = false;
        ci.d dVar = this.f49607a;
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
        this.f49607a.setOnClickListener(onClickListener);
    }
}
