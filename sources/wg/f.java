package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.j6;
public final class f extends View implements a6 {
    public ng.b f46564a;
    public ng.b f46565b;
    public int f46566c;
    public int d;
    public sg.c e;
    public int f46567f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f46564a.setBounds(0, 0, getMeasuredWidth(), this.f46566c);
        this.f46565b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ng.a aVar, qg.d dVar) {
        pg.b c3 = aVar.c(this, null, false);
        c3.n(dVar);
        ng.b bVar = new ng.b(c3);
        this.f46564a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        pg.b c10 = aVar.c(this, null, false);
        c10.n(dVar);
        ng.b bVar2 = new ng.b(c10);
        this.f46565b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void e() {
        int i10;
        sg.c cVar = this.e;
        if (cVar != null && (i10 = this.f46567f) != -1) {
            cVar.a(j6.w0(null, i10, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f46564a.draw(canvas);
        this.f46565b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f46565b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f46564a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        ng.b bVar = this.f46564a;
        if (bVar.f14986q != i10) {
            bVar.f14986q = i10;
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
        if (this.f46566c != i10) {
            this.f46566c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z4) {
        this.f46564a.f14985p = z4;
        this.f46565b.f14985p = z4;
    }

    public void setup(ng.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i10) {
        this.f46567f = i10;
        if (this.e == null) {
            sg.c cVar = new sg.c();
            this.e = cVar;
            cVar.a(j6.w0(null, i10, false));
            setup(new ng.a(this.e));
        }
    }
}
