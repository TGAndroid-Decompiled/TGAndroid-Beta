package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class a extends FrameLayout {
    public final ei.d f49388a;
    public final View f49389b;
    public final g6 f49390c;
    public final Paint d;
    public boolean e;

    public a(Context context, g6 g6Var) {
        super(context);
        this.d = new Paint(1);
        this.f49390c = g6Var;
        View view = new View(context);
        this.f49389b = view;
        addView(view, z5.n(-1, -1));
        ei.d dVar = new ei.d(context, g6Var, true);
        this.f49388a = dVar;
        addView(dVar, z5.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        ei.d dVar = this.f49388a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.i(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        r6.i(k6.f21255h5, this.f49389b, this.f49390c);
    }

    public final void b(boolean z10) {
        this.f49388a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = k6.w0(k6.f21126a7, this.f49390c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        ei.d dVar = this.f49388a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.e = false;
        ei.d dVar = this.f49388a;
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
        this.f49388a.setOnClickListener(onClickListener);
    }
}
