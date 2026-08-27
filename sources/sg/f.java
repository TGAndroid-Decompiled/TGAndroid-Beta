package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;

public final class f extends View implements x5 {

    public jg.b f47911a;

    public jg.b f47912b;

    public int f47913c;
    public int d;

    public og.c f47914e;

    public int f47915f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f47911a.setBounds(0, 0, getMeasuredWidth(), this.f47913c);
        this.f47912b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(jg.a aVar, mg.d dVar) {
        lg.d dVarC = aVar.c(this, null, false);
        dVarC.n(dVar);
        jg.b bVar = new jg.b(dVarC);
        this.f47911a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        lg.d dVarC2 = aVar.c(this, null, false);
        dVarC2.n(dVar);
        jg.b bVar2 = new jg.b(dVarC2);
        this.f47912b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void d() {
        int i10;
        og.c cVar = this.f47914e;
        if (cVar == null || (i10 = this.f47915f) == -1) {
            return;
        }
        cVar.a(g6.w0(null, i10, false));
        invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f47911a.draw(canvas);
        this.f47912b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f47912b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f47911a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        jg.b bVar = this.f47911a;
        if (bVar.f12959q != i10) {
            bVar.f12959q = i10;
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
        if (this.f47913c != i10) {
            this.f47913c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f47911a.f12958p = z10;
        this.f47912b.f12958p = z10;
    }

    public void setup(jg.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i10) {
        this.f47915f = i10;
        if (this.f47914e == null) {
            og.c cVar = new og.c();
            this.f47914e = cVar;
            cVar.a(g6.w0(null, i10, false));
            setup(new jg.a(this.f47914e));
        }
    }
}
