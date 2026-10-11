package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.x;
public final class e implements KeyListener {
    public final KeyListener f46018a;
    public final ob.a f46019b;

    public e(KeyListener keyListener) {
        ob.a aVar = new ob.a(19);
        this.f46018a = keyListener;
        this.f46019b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f46018a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f46018a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean j3;
        boolean z10;
        this.f46019b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                j3 = false;
            } else {
                j3 = x.j(editable, keyEvent, true);
            }
        } else {
            j3 = x.j(editable, keyEvent, false);
        }
        if (j3) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f46018a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f46018a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f46018a.onKeyUp(view, editable, i10, keyEvent);
    }
}
