package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class a extends FrameLayout {
    public final fi.d f59428a;
    public final View f59429b;
    public final h6 f59430c;
    public final Paint d;
    public boolean f59431e;

    public a(Context context, h6 h6Var) {
        super(context);
        this.d = new Paint(1);
        this.f59430c = h6Var;
        View view = new View(context);
        this.f59429b = view;
        addView(view, ha.o(-1, -1));
        fi.d dVar = new fi.d(context, h6Var, true);
        this.f59428a = dVar;
        addView(dVar, ha.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z9) {
        this.f59431e = true;
        fi.d dVar = this.f59428a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i7, z9);
        dVar.i(id.M0(2131753193, null), z9, true);
        t6.h(m6.f27963h5, this.f59429b, this.f59430c);
    }

    public final void b(boolean z9) {
        this.f59428a.setLoading(z9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f59431e) {
            int w02 = m6.w0(m6.f27834a7, this.f59430c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z9) {
        this.f59431e = false;
        fi.d dVar = this.f59428a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(id.a0("Close", null, 2131752041, new Object[0]), false, true);
        this.f59431e = z9;
    }

    public void setOkStyle(boolean z9) {
        String a02;
        this.f59431e = false;
        fi.d dVar = this.f59428a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z9) {
            a02 = id.a0("BoostingUseLink", null, 2131753174, new Object[0]);
        } else {
            a02 = id.a0("OK", null, 2131747831, new Object[0]);
        }
        dVar.i(a02, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f59428a.setOnClickListener(onClickListener);
    }
}
