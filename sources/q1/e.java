package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.x;
public final class e implements KeyListener {
    public final KeyListener f45953a;
    public final ob.a f45954b;

    public e(KeyListener keyListener) {
        ob.a aVar = new ob.a(19);
        this.f45953a = keyListener;
        this.f45954b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f45953a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f45953a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean v;
        boolean z10;
        this.f45954b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                v = false;
            } else {
                v = x.v(editable, keyEvent, true);
            }
        } else {
            v = x.v(editable, keyEvent, false);
        }
        if (v) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f45953a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f45953a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f45953a.onKeyUp(view, editable, i10, keyEvent);
    }
}
