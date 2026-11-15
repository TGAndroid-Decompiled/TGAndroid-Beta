package org.telegram.ui;

import j$.util.Objects;
public final class yy0 extends rg.a {
    public final org.telegram.messenger.ov f53784c;
    public final String d;

    public yy0(int i7) {
        super(i7, false);
        this.f53784c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.ov ovVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || yy0.class != obj.getClass()) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        if (this.f56015a != yy0Var.f56015a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, yy0Var.d);
        }
        org.telegram.messenger.ov ovVar2 = this.f53784c;
        if (ovVar2 == null || (ovVar = yy0Var.f53784c) == null || ovVar2.d == ovVar.d) {
            return true;
        }
        return false;
    }

    public yy0(org.telegram.messenger.ov ovVar) {
        super(2, false);
        this.f53784c = ovVar;
    }

    public yy0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.f53784c = null;
    }
}
