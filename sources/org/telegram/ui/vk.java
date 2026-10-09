package org.telegram.ui;
public final class vk extends org.telegram.ui.Components.tl0 {
    public final zn f42892l;

    public vk(zn znVar, wj wjVar, zj zjVar) {
        super(wjVar, zjVar);
        this.f42892l = znVar;
    }

    public final void e(int i10) {
        if (this.f42892l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f31224b = i10;
    }
}
