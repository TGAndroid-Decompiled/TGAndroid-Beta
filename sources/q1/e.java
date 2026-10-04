package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.y;
public final class e implements KeyListener {
    public final KeyListener f44746a;
    public final ob.a f44747b;

    public e(KeyListener keyListener) {
        ob.a aVar = new ob.a(19);
        this.f44746a = keyListener;
        this.f44747b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f44746a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f44746a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean v;
        boolean z10;
        this.f44747b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                v = false;
            } else {
                v = y.v(editable, keyEvent, true);
            }
        } else {
            v = y.v(editable, keyEvent, false);
        }
        if (v) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f44746a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f44746a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f44746a.onKeyUp(view, editable, i10, keyEvent);
    }
}
