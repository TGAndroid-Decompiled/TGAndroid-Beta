package org.telegram.ui;
public final class vk extends org.telegram.ui.Components.ul0 {
    public final zn f43107l;

    public vk(zn znVar, wj wjVar, zj zjVar) {
        super(wjVar, zjVar);
        this.f43107l = znVar;
    }

    public final void e(int i10) {
        if (this.f43107l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f31630b = i10;
    }
}
