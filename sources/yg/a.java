package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class a extends FrameLayout {
    public final hi.e f61329a;
    public final View f61330b;
    public final i6 f61331c;
    public final Paint d;
    public boolean f61332e;

    public a(Context context, i6 i6Var) {
        super(context);
        this.d = new Paint(1);
        this.f61331c = i6Var;
        View view = new View(context);
        this.f61330b = view;
        addView(view, na.o(-1, -1));
        hi.e eVar = new hi.e(context, i6Var, true);
        this.f61329a = eVar;
        addView(eVar, na.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z10) {
        this.f61332e = true;
        hi.e eVar = this.f61329a;
        eVar.k();
        eVar.setShowZero(true);
        eVar.setEnabled(true);
        eVar.c(i7, z10);
        eVar.i(gd.N0(2131753190, null), z10, true);
        u6.h(n6.f29524h5, this.f61330b, this.f61331c);
    }

    public final void b(boolean z10) {
        this.f61329a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f61332e) {
            int w02 = n6.w0(n6.f29394a7, this.f61331c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f61332e = false;
        hi.e eVar = this.f61329a;
        eVar.setShowZero(false);
        eVar.setEnabled(true);
        eVar.i(gd.a0("Close", null, 2131752029, new Object[0]), false, true);
        this.f61332e = z10;
    }

    public void setOkStyle(boolean z10) {
        String a02;
        this.f61332e = false;
        hi.e eVar = this.f61329a;
        eVar.setShowZero(false);
        eVar.setEnabled(true);
        if (z10) {
            a02 = gd.a0("BoostingUseLink", null, 2131753171, new Object[0]);
        } else {
            a02 = gd.a0("OK", null, 2131747637, new Object[0]);
        }
        eVar.i(a02, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f61329a.setOnClickListener(onClickListener);
    }
}
