package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.y;
public final class e implements KeyListener {
    public final KeyListener f41374a;
    public final ob.a f41375b;

    public e(KeyListener keyListener) {
        ob.a aVar = new ob.a(19);
        this.f41374a = keyListener;
        this.f41375b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f41374a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f41374a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean r10;
        boolean z10;
        this.f41375b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                r10 = false;
            } else {
                r10 = y.r(editable, keyEvent, true);
            }
        } else {
            r10 = y.r(editable, keyEvent, false);
        }
        if (r10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f41374a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f41374a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f41374a.onKeyUp(view, editable, i10, keyEvent);
    }
}
