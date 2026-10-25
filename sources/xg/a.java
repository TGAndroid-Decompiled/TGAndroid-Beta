package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class a extends FrameLayout {
    public final fi.d f51748a;
    public final View f51749b;
    public final u6 f51750c;
    public final Paint d;
    public boolean e;

    public a(Context context, u6 u6Var) {
        super(context);
        this.d = new Paint(1);
        this.f51750c = u6Var;
        View view = new View(context);
        this.f51749b = view;
        addView(view, gb1.r(-1, -1));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.f51748a = dVar;
        addView(dVar, gb1.h(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        fi.d dVar = this.f51748a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.i(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        f7.i(y6.f23425h5, this.f51749b, this.f51750c);
    }

    public final void b(boolean z10) {
        this.f51748a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = y6.w0(y6.f23297a7, this.f51750c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        fi.d dVar = this.f51748a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.e = false;
        fi.d dVar = this.f51748a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z10) {
            formatString = LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]);
        } else {
            formatString = LocaleController.formatString("OK", R.string.OK, new Object[0]);
        }
        dVar.i(formatString, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f51748a.setOnClickListener(onClickListener);
    }
}
