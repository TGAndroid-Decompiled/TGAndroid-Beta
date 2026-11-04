package s1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p4.q;
public final class e implements KeyListener {
    public final KeyListener f54581a;
    public final kb.a f54582b;

    public e(KeyListener keyListener) {
        kb.a aVar = new kb.a(23);
        this.f54581a = keyListener;
        this.f54582b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f54581a.clearMetaKeyState(view, editable, i3);
    }

    @Override
    public final int getInputType() {
        return this.f54581a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean f10;
        boolean z10;
        this.f54582b.getClass();
        if (i3 != 67) {
            if (i3 != 112) {
                f10 = false;
            } else {
                f10 = q.f(editable, keyEvent, true);
            }
        } else {
            f10 = q.f(editable, keyEvent, false);
        }
        if (f10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f54581a.onKeyDown(view, editable, i3, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f54581a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f54581a.onKeyUp(view, editable, i3, keyEvent);
    }
}
