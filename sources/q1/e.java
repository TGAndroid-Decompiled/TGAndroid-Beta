package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f46205a;
    public final ab.b f46206b;

    public e(KeyListener keyListener) {
        ab.b bVar = new ab.b(22);
        this.f46205a = keyListener;
        this.f46206b = bVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f46205a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f46205a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean m10;
        boolean z10;
        this.f46206b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                m10 = false;
            } else {
                m10 = ze.b.m(editable, keyEvent, true);
            }
        } else {
            m10 = ze.b.m(editable, keyEvent, false);
        }
        if (m10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f46205a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f46205a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f46205a.onKeyUp(view, editable, i10, keyEvent);
    }
}
