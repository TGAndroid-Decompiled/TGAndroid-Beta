package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class a extends FrameLayout {
    public final hi.d f61200a;
    public final View f61201b;
    public final i6 f61202c;
    public final Paint d;
    public boolean f61203e;

    public a(Context context, i6 i6Var) {
        super(context);
        this.d = new Paint(1);
        this.f61202c = i6Var;
        View view = new View(context);
        this.f61201b = view;
        addView(view, ma.o(-1, -1));
        hi.d dVar = new hi.d(context, i6Var, true);
        this.f61200a = dVar;
        addView(dVar, ma.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z10) {
        this.f61203e = true;
        hi.d dVar = this.f61200a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i7, z10);
        dVar.i(gd.M0(2131753191, null), z10, true);
        u6.h(n6.f29467h5, this.f61201b, this.f61202c);
    }

    public final void b(boolean z10) {
        this.f61200a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f61203e) {
            int w02 = n6.w0(n6.f29337a7, this.f61202c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f61203e = false;
        hi.d dVar = this.f61200a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(gd.a0("Close", null, 2131752030, new Object[0]), false, true);
        this.f61203e = z10;
    }

    public void setOkStyle(boolean z10) {
        String a02;
        this.f61203e = false;
        hi.d dVar = this.f61200a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z10) {
            a02 = gd.a0("BoostingUseLink", null, 2131753172, new Object[0]);
        } else {
            a02 = gd.a0("OK", null, 2131747638, new Object[0]);
        }
        dVar.i(a02, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f61200a.setOnClickListener(onClickListener);
    }
}
