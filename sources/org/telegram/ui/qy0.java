package org.telegram.ui;

import j$.util.Objects;
public final class qy0 extends sg.a {
    public final org.telegram.messenger.iv f48971c;
    public final String d;

    public qy0(int i3) {
        super(i3, false);
        this.f48971c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.iv ivVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || qy0.class != obj.getClass()) {
            return false;
        }
        qy0 qy0Var = (qy0) obj;
        if (this.f54715a != qy0Var.f54715a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, qy0Var.d);
        }
        org.telegram.messenger.iv ivVar2 = this.f48971c;
        if (ivVar2 == null || (ivVar = qy0Var.f48971c) == null || ivVar2.d == ivVar.d) {
            return true;
        }
        return false;
    }

    public qy0(org.telegram.messenger.iv ivVar) {
        super(2, false);
        this.f48971c = ivVar;
    }

    public qy0(int i3, String str) {
        super(i3, false);
        this.d = str;
        this.f48971c = null;
    }
}
