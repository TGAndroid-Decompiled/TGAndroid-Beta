package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class a extends FrameLayout {
    public final hi.d f60632a;
    public final View f60633b;
    public final e6 f60634c;
    public final Paint d;
    public boolean f60635e;

    public a(Context context, e6 e6Var) {
        super(context);
        this.d = new Paint(1);
        this.f60634c = e6Var;
        View view = new View(context);
        this.f60633b = view;
        addView(view, ja.o(-1, -1));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f60632a = dVar;
        addView(dVar, ja.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z10) {
        this.f60635e = true;
        hi.d dVar = this.f60632a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i7, z10);
        dVar.i(hd.M0(2131753193, null), z10, true);
        q6.h(j6.f28922h5, this.f60633b, this.f60634c);
    }

    public final void b(boolean z10) {
        this.f60632a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f60635e) {
            int w02 = j6.w0(j6.f28792a7, this.f60634c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f60635e = false;
        hi.d dVar = this.f60632a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(hd.a0("Close", null, 2131752041, new Object[0]), false, true);
        this.f60635e = z10;
    }

    public void setOkStyle(boolean z10) {
        String a02;
        this.f60635e = false;
        hi.d dVar = this.f60632a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z10) {
            a02 = hd.a0("BoostingUseLink", null, 2131753174, new Object[0]);
        } else {
            a02 = hd.a0("OK", null, 2131747831, new Object[0]);
        }
        dVar.i(a02, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f60632a.setOnClickListener(onClickListener);
    }
}
