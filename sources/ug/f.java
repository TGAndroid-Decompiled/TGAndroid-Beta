package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
public final class f extends View implements x5 {
    public lg.b f49227a;
    public lg.b f49228b;
    public int f49229c;
    public int d;
    public qg.c f49230e;
    public int f49231f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f49227a.setBounds(0, 0, getMeasuredWidth(), this.f49229c);
        this.f49228b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(lg.a aVar, og.d dVar) {
        ng.d c3 = aVar.c(this, null, false);
        c3.n(dVar);
        lg.b bVar = new lg.b(c3);
        this.f49227a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        ng.d c6 = aVar.c(this, null, false);
        c6.n(dVar);
        lg.b bVar2 = new lg.b(c6);
        this.f49228b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        qg.c cVar = this.f49230e;
        if (cVar != null && (i10 = this.f49231f) != -1) {
            cVar.a(g6.w0(null, i10, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f49227a.draw(canvas);
        this.f49228b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f49228b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f49227a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        lg.b bVar = this.f49227a;
        if (bVar.f15240q != i10) {
            bVar.f15240q = i10;
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
        if (this.f49229c != i10) {
            this.f49229c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f49227a.f15239p = z10;
        this.f49228b.f15239p = z10;
    }

    public void setup(lg.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i10) {
        this.f49231f = i10;
        if (this.f49230e == null) {
            qg.c cVar = new qg.c();
            this.f49230e = cVar;
            cVar.a(g6.w0(null, i10, false));
            setup(new lg.a(this.f49230e));
        }
    }
}
