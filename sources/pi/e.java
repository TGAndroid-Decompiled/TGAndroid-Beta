package pi;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class e extends Drawable {
    public final Rect f53577a = new Rect();
    public r f53578b = q.f();
    public int f53579c = 255;
    public float d;
    public float f53580e;

    public abstract void a();

    public void b(Rect rect) {
        rect.set(getBounds());
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public abstract boolean e();

    public abstract void f(int i3);

    public abstract void g(r rVar);

    @Override
    public final int getAlpha() {
        return this.f53579c;
    }

    public final void i(float f10, float f11) {
        if (this.d == f10 && this.f53580e == f11) {
            return;
        }
        this.d = f10;
        this.f53580e = f11;
        h();
    }

    public abstract boolean j();

    @Override
    public final void setAlpha(int i3) {
        if (this.f53579c != i3) {
            this.f53579c = i3;
            f(i3);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
