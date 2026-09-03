package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class rb extends k7.d6 {
    public MessageObject f40801a;
    public int f40802b = 0;
    public boolean f40803c = true;
    public int d = 0;
    public int f40804e;
    public final sb f40805f;

    public rb(sb sbVar) {
        this.f40805f = sbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40801a;
        sb sbVar = this.f40805f;
        if (messageObject != null) {
            int indexOf = sbVar.f41108p0.indexOf(messageObject) + sbVar.F.f39637f;
            if (indexOf >= 0) {
                sbVar.D.i1(indexOf, this.f40804e, false);
            }
        } else {
            sbVar.D.i1(this.f40802b, this.d, this.f40803c);
        }
        this.f40801a = null;
        sbVar.W = true;
        sbVar.e1();
        AndroidUtilities.runOnUIThread(new yt0(this, 21));
    }

    @Override
    public final void c() {
        sb sbVar = this.f40805f;
        sbVar.L0 = sbVar.getNotificationCenter().setAnimationInProgress(sbVar.L0, sb.V0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f40805f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
