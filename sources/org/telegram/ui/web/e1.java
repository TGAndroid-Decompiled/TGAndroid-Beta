package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class e1 {
    public final HashMap f42826a = new HashMap();
    public File f42827b;
    public long f42828c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new d1(this.f42828c, this.d, this.f42827b));
        HashMap hashMap = this.f42826a;
        f1 f1Var = (f1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (f1Var == null) {
            str = null;
        } else {
            str = f1Var.f42833a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        f1 f1Var2 = (f1) hashMap.get("content-transfer-encoding");
        if (f1Var2 != null) {
            str2 = f1Var2.f42833a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new lc.z(bufferedInputStream, 1);
        }
        return bufferedInputStream;
    }
}
