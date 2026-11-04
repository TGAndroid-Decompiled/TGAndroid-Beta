package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class b1 {
    public final HashMap f50818a = new HashMap();
    public File f50819b;
    public long f50820c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new a1(this.f50820c, this.d, this.f50819b));
        HashMap hashMap = this.f50818a;
        c1 c1Var = (c1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (c1Var == null) {
            str = null;
        } else {
            str = c1Var.f50824a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        c1 c1Var2 = (c1) hashMap.get("content-transfer-encoding");
        if (c1Var2 != null) {
            str2 = c1Var2.f50824a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new oc.y(bufferedInputStream, 1);
        }
        return bufferedInputStream;
    }
}
