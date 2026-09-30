package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class k1 {
    public final HashMap f39216a = new HashMap();
    public File f39217b;
    public long f39218c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new j1(this.f39218c, this.d, this.f39217b));
        HashMap hashMap = this.f39216a;
        l1 l1Var = (l1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (l1Var == null) {
            str = null;
        } else {
            str = l1Var.f39226a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        l1 l1Var2 = (l1) hashMap.get("content-transfer-encoding");
        if (l1Var2 != null) {
            str2 = l1Var2.f39226a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new m1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
