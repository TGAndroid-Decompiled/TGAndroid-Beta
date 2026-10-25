package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class k1 {
    public final HashMap f45292a = new HashMap();
    public File f45293b;
    public long f45294c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new j1(this.f45294c, this.d, this.f45293b));
        HashMap hashMap = this.f45292a;
        l1 l1Var = (l1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (l1Var == null) {
            str = null;
        } else {
            str = l1Var.f45308a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        l1 l1Var2 = (l1) hashMap.get("content-transfer-encoding");
        if (l1Var2 != null) {
            str2 = l1Var2.f45308a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new m1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
