package ri;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class e extends Drawable {
    public final Rect f56669a = new Rect();
    public r f56670b = q.f();
    public int f56671c = 255;
    public float d;
    public float f56672e;

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

    public abstract void f(int i7);

    public abstract void g(r rVar);

    @Override
    public final int getAlpha() {
        return this.f56671c;
    }

    public final void i(float f10, float f11) {
        if (this.d == f10 && this.f56672e == f11) {
            return;
        }
        this.d = f10;
        this.f56672e = f11;
        h();
    }

    public abstract boolean j();

    @Override
    public final void setAlpha(int i7) {
        if (this.f56671c != i7) {
            this.f56671c = i7;
            f(i7);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
