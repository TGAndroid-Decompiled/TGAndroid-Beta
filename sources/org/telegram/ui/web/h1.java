package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class h1 {
    public final HashMap f44048a = new HashMap();
    public File f44049b;
    public long f44050c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new g1(this.f44049b, this.f44050c, this.d));
        HashMap hashMap = this.f44048a;
        i1 i1Var = (i1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (i1Var == null) {
            str = null;
        } else {
            str = i1Var.f44066a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        i1 i1Var2 = (i1) hashMap.get("content-transfer-encoding");
        if (i1Var2 != null) {
            str2 = i1Var2.f44066a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new j1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
