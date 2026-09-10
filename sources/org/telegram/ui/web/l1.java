package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class l1 {
    public final HashMap f38008a = new HashMap();
    public File f38009b;
    public long f38010c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new k1(this.f38009b, this.f38010c, this.d));
        HashMap hashMap = this.f38008a;
        m1 m1Var = (m1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (m1Var == null) {
            str = null;
        } else {
            str = m1Var.f38017a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        m1 m1Var2 = (m1) hashMap.get("content-transfer-encoding");
        if (m1Var2 != null) {
            str2 = m1Var2.f38017a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new n1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
