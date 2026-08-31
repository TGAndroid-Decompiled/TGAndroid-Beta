package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class rb extends k7.d6 {
    public MessageObject f40909a;
    public int f40910b = 0;
    public boolean f40911c = true;
    public int d = 0;
    public int f40912e;
    public final sb f40913f;

    public rb(sb sbVar) {
        this.f40913f = sbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40909a;
        sb sbVar = this.f40913f;
        if (messageObject != null) {
            int indexOf = sbVar.f41204p0.indexOf(messageObject) + sbVar.F.f39701f;
            if (indexOf >= 0) {
                sbVar.D.i1(indexOf, this.f40912e, false);
            }
        } else {
            sbVar.D.i1(this.f40910b, this.d, this.f40911c);
        }
        this.f40909a = null;
        sbVar.W = true;
        sbVar.e1();
        AndroidUtilities.runOnUIThread(new tt0(this, 21));
    }

    @Override
    public final void c() {
        sb sbVar = this.f40913f;
        sbVar.L0 = sbVar.getNotificationCenter().setAnimationInProgress(sbVar.L0, sb.V0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f40913f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
