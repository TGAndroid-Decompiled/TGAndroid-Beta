package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class a extends FrameLayout {
    public final hi.d f61210a;
    public final View f61211b;
    public final h6 f61212c;
    public final Paint d;
    public boolean f61213e;

    public a(Context context, h6 h6Var) {
        super(context);
        this.d = new Paint(1);
        this.f61212c = h6Var;
        View view = new View(context);
        this.f61211b = view;
        addView(view, na.o(-1, -1));
        hi.d dVar = new hi.d(context, h6Var, true);
        this.f61210a = dVar;
        addView(dVar, na.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z10) {
        this.f61213e = true;
        hi.d dVar = this.f61210a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i7, z10);
        dVar.i(hd.N0(2131753190, null), z10, true);
        t6.h(m6.f29420h5, this.f61211b, this.f61212c);
    }

    public final void b(boolean z10) {
        this.f61210a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f61213e) {
            int w02 = m6.w0(m6.f29290a7, this.f61212c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f61213e = false;
        hi.d dVar = this.f61210a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(hd.a0("Close", null, 2131752029, new Object[0]), false, true);
        this.f61213e = z10;
    }

    public void setOkStyle(boolean z10) {
        String a02;
        this.f61213e = false;
        hi.d dVar = this.f61210a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z10) {
            a02 = hd.a0("BoostingUseLink", null, 2131753171, new Object[0]);
        } else {
            a02 = hd.a0("OK", null, 2131747637, new Object[0]);
        }
        dVar.i(a02, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f61210a.setOnClickListener(onClickListener);
    }
}
