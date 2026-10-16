package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class zb extends w7.a6 {
    public MessageObject f42257a;
    public int f42258b = 0;
    public boolean f42259c = true;
    public int d = 0;
    public int e;
    public final ac f42260f;

    public zb(ac acVar) {
        this.f42260f = acVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42257a;
        ac acVar = this.f42260f;
        if (messageObject != null) {
            int indexOf = acVar.f33852o0.indexOf(messageObject) + acVar.E.f40913f;
            if (indexOf >= 0) {
                acVar.f33864x.i1(indexOf, this.e, false);
            }
        } else {
            acVar.f33864x.i1(this.f42258b, this.d, this.f42259c);
        }
        this.f42257a = null;
        acVar.V = true;
        acVar.d1();
        AndroidUtilities.runOnUIThread(new su0(this, 21));
    }

    @Override
    public final void c() {
        ac acVar = this.f42260f;
        acVar.K0 = acVar.getNotificationCenter().setAnimationInProgress(acVar.K0, ac.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f42260f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
