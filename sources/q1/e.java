package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f40463a;
    public final ob.a f40464b;

    public e(KeyListener keyListener) {
        ob.a aVar = new ob.a(19);
        this.f40463a = keyListener;
        this.f40464b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f40463a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f40463a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean I;
        boolean z10;
        this.f40464b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                I = false;
            } else {
                I = of.b.I(editable, keyEvent, true);
            }
        } else {
            I = of.b.I(editable, keyEvent, false);
        }
        if (I) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f40463a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f40463a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f40463a.onKeyUp(view, editable, i10, keyEvent);
    }
}
