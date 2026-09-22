package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.y;
public final class e implements KeyListener {
    public final KeyListener f41409a;
    public final ob.a f41410b;

    public e(KeyListener keyListener) {
        ob.a aVar = new ob.a(19);
        this.f41409a = keyListener;
        this.f41410b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f41409a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f41409a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean g10;
        boolean z10;
        this.f41410b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                g10 = false;
            } else {
                g10 = y.g(editable, keyEvent, true);
            }
        } else {
            g10 = y.g(editable, keyEvent, false);
        }
        if (g10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f41409a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f41409a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f41409a.onKeyUp(view, editable, i10, keyEvent);
    }
}
