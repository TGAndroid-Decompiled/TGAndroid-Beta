package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class a extends FrameLayout {
    public final bi.d f42665a;
    public final View f42666b;
    public final f6 f42667c;
    public final Paint d;
    public boolean e;

    public a(Context context, f6 f6Var) {
        super(context);
        this.d = new Paint(1);
        this.f42667c = f6Var;
        View view = new View(context);
        this.f42666b = view;
        addView(view, a6.n(-1, -1));
        bi.d dVar = new bi.d(context, f6Var, true);
        this.f42665a = dVar;
        addView(dVar, a6.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        bi.d dVar = this.f42665a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.f42666b.setBackgroundColor(j6.v0(j6.f17998h5, this.f42667c));
    }

    public final void b(boolean z10) {
        this.f42665a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v02 = j6.v0(j6.f17872a7, this.f42667c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        bi.d dVar = this.f42665a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        String formatString;
        this.e = false;
        bi.d dVar = this.f42665a;
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
        this.f42665a.setOnClickListener(onClickListener);
    }
}
