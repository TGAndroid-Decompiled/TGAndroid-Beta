package pg;

import android.graphics.Canvas;
public final class d extends b {
    public final sg.a E;

    public d(sg.a aVar) {
        this.E = aVar;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, this.E);
    }

    @Override
    public final sg.a i() {
        return this.E;
    }
}
