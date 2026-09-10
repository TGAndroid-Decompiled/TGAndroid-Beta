package zh;

import android.view.TextureView;
public abstract class r extends TextureView {
    @Override
    public void invalidate() {
        if (p.f48762c) {
            p.f48761b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (p.f48762c) {
            p.f48761b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
