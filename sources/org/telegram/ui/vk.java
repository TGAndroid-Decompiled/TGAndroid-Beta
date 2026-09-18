package org.telegram.ui;
public final class vk extends org.telegram.ui.Components.pk0 {
    public final bo f38468l;

    public vk(bo boVar, vj vjVar, yj yjVar) {
        super(vjVar, yjVar);
        this.f38468l = boVar;
    }

    public final void f(int i10) {
        if (this.f38468l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f27064b = i10;
    }
}
