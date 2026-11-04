package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class a extends FrameLayout {
    public final gi.d f60461a;
    public final View f60462b;
    public final e6 f60463c;
    public final Paint d;
    public boolean f60464e;

    public a(Context context, e6 e6Var) {
        super(context);
        this.d = new Paint(1);
        this.f60463c = e6Var;
        View view = new View(context);
        this.f60462b = view;
        addView(view, mf.o(-1, -1));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.f60461a = dVar;
        addView(dVar, mf.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i3, boolean z10) {
        this.f60464e = true;
        gi.d dVar = this.f60461a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i3, z10);
        dVar.i(bd.M0(2131753193, null), z10, true);
        r6.i(k6.f27954h5, this.f60462b, this.f60463c);
    }

    public final void b(boolean z10) {
        this.f60461a.setLoading(z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f60464e) {
            int w02 = k6.w0(k6.f27824a7, this.f60463c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.f60464e = false;
        gi.d dVar = this.f60461a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(bd.a0("Close", null, 2131752041, new Object[0]), false, true);
        this.f60464e = z10;
    }

    public void setOkStyle(boolean z10) {
        String a02;
        this.f60464e = false;
        gi.d dVar = this.f60461a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        if (z10) {
            a02 = bd.a0("BoostingUseLink", null, 2131753174, new Object[0]);
        } else {
            a02 = bd.a0("OK", null, 2131747839, new Object[0]);
        }
        dVar.i(a02, false, true);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f60461a.setOnClickListener(onClickListener);
    }
}
