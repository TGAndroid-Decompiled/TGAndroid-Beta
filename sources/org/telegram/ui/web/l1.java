package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class l1 {
    public final HashMap f42283a = new HashMap();
    public File f42284b;
    public long f42285c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new k1(this.f42285c, this.d, this.f42284b));
        HashMap hashMap = this.f42283a;
        m1 m1Var = (m1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (m1Var == null) {
            str = null;
        } else {
            str = m1Var.f42292a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        m1 m1Var2 = (m1) hashMap.get("content-transfer-encoding");
        if (m1Var2 != null) {
            str2 = m1Var2.f42292a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new n1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
