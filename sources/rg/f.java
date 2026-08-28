package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
public final class f extends View implements w5 {
    public ig.b f47190a;
    public ig.b f47191b;
    public int f47192c;
    public int d;
    public ng.c f47193e;
    public int f47194f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.f47190a.setBounds(0, 0, getMeasuredWidth(), this.f47192c);
        this.f47191b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ig.a aVar, lg.d dVar) {
        kg.d c10 = aVar.c(this, null, false);
        c10.n(dVar);
        ig.b bVar = new ig.b(c10);
        this.f47190a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        kg.d c11 = aVar.c(this, null, false);
        c11.n(dVar);
        ig.b bVar2 = new ig.b(c11);
        this.f47191b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override
    public final void d() {
        int i9;
        ng.c cVar = this.f47193e;
        if (cVar != null && (i9 = this.f47194f) != -1) {
            cVar.a(f6.w0(null, i9, false));
            invalidate();
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f47190a.draw(canvas);
        this.f47191b.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        a();
    }

    public void setFadeHeightBottom(int i9) {
        this.f47191b.b(i9, true);
    }

    public void setFadeHeightTop(int i9) {
        this.f47190a.b(-i9, true);
    }

    public void setFadeTopAlpha(int i9) {
        ig.b bVar = this.f47190a;
        if (bVar.f11147q != i9) {
            bVar.f11147q = i9;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i9) {
        if (this.d != i9) {
            this.d = i9;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i9) {
        if (this.f47192c != i9) {
            this.f47192c = i9;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f47190a.f11146p = z10;
        this.f47191b.f11146p = z10;
    }

    public void setup(ig.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i9) {
        this.f47194f = i9;
        if (this.f47193e == null) {
            ng.c cVar = new ng.c();
            this.f47193e = cVar;
            cVar.a(f6.w0(null, i9, false));
            setup(new ig.a(this.f47193e));
        }
    }
}
