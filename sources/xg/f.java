package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
public final class f extends View implements b6 {
    public og.b f50577a;
    public og.b f50578b;
    public int f50579c;
    public int d;
    public tg.c f50580e;
    public int f50581f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f50577a.setBounds(0, 0, getMeasuredWidth(), this.f50579c);
        this.f50578b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(og.a aVar, rg.d dVar) {
        qg.b c3 = aVar.c(this, null, false);
        c3.n(dVar);
        og.b bVar = new og.b(c3);
        this.f50577a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        qg.b c10 = aVar.c(this, null, false);
        c10.n(dVar);
        og.b bVar2 = new og.b(c10);
        this.f50578b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        tg.c cVar = this.f50580e;
        if (cVar != null && (i10 = this.f50581f) != -1) {
            cVar.a(k6.w0(null, i10, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f50577a.draw(canvas);
        this.f50578b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f50578b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f50577a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        og.b bVar = this.f50577a;
        if (bVar.f16770q != i10) {
            bVar.f16770q = i10;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i10) {
        if (this.f50579c != i10) {
            this.f50579c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z4) {
        this.f50577a.f16769p = z4;
        this.f50578b.f16769p = z4;
    }

    public void setup(og.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i10) {
        this.f50581f = i10;
        if (this.f50580e == null) {
            tg.c cVar = new tg.c();
            this.f50580e = cVar;
            cVar.a(k6.w0(null, i10, false));
            setup(new og.a(this.f50580e));
        }
    }
}
