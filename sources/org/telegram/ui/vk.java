package org.telegram.ui;
public final class vk extends org.telegram.ui.Components.pk0 {
    public final bo f38463l;

    public vk(bo boVar, vj vjVar, yj yjVar) {
        super(vjVar, yjVar);
        this.f38463l = boVar;
    }

    public final void f(int i10) {
        if (this.f38463l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f27061b = i10;
    }
}
