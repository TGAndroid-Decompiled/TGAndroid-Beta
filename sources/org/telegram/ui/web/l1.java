package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class l1 {
    public final HashMap f39089a = new HashMap();
    public File f39090b;
    public long f39091c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new k1(this.f39091c, this.d, this.f39090b));
        HashMap hashMap = this.f39089a;
        m1 m1Var = (m1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (m1Var == null) {
            str = null;
        } else {
            str = m1Var.f39098a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        m1 m1Var2 = (m1) hashMap.get("content-transfer-encoding");
        if (m1Var2 != null) {
            str2 = m1Var2.f39098a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new n1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
