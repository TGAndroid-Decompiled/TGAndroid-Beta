package org.telegram.ui;
public final class vk extends org.telegram.ui.Components.vl0 {
    public final zn f43073l;

    public vk(zn znVar, wj wjVar, zj zjVar) {
        super(wjVar, zjVar);
        this.f43073l = znVar;
    }

    public final void e(int i10) {
        if (this.f43073l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f31837b = i10;
    }
}
