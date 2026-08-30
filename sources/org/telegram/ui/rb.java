package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class rb extends k7.c6 {
    public MessageObject f37965a;
    public int f37966b = 0;
    public boolean f37967c = true;
    public int d = 0;
    public int e;
    public final sb f37968f;

    public rb(sb sbVar) {
        this.f37968f = sbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37965a;
        sb sbVar = this.f37968f;
        if (messageObject != null) {
            int indexOf = sbVar.f38269p0.indexOf(messageObject) + sbVar.F.f36863f;
            if (indexOf >= 0) {
                sbVar.D.i1(indexOf, this.e, false);
            }
        } else {
            sbVar.D.i1(this.f37966b, this.d, this.f37967c);
        }
        this.f37965a = null;
        sbVar.W = true;
        sbVar.e1();
        AndroidUtilities.runOnUIThread(new rt0(this, 21));
    }

    @Override
    public final void c() {
        sb sbVar = this.f37968f;
        sbVar.L0 = sbVar.getNotificationCenter().setAnimationInProgress(sbVar.L0, sb.V0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f37968f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
