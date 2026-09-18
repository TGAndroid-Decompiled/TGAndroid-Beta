package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.y;
public final class e implements KeyListener {
    public final KeyListener f41113a;
    public final ob.a f41114b;

    public e(KeyListener keyListener) {
        ob.a aVar = new ob.a(19);
        this.f41113a = keyListener;
        this.f41114b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f41113a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f41113a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean o9;
        boolean z10;
        this.f41114b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                o9 = false;
            } else {
                o9 = y.o(editable, keyEvent, true);
            }
        } else {
            o9 = y.o(editable, keyEvent, false);
        }
        if (o9) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f41113a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f41113a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f41113a.onKeyUp(view, editable, i10, keyEvent);
    }
}
