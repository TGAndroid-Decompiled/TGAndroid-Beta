package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class i1 {
    public final HashMap f39532a = new HashMap();
    public File f39533b;
    public long f39534c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new h1(this.f39533b, this.f39534c, this.d));
        HashMap hashMap = this.f39532a;
        j1 j1Var = (j1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (j1Var == null) {
            str = null;
        } else {
            str = j1Var.f39543a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        j1 j1Var2 = (j1) hashMap.get("content-transfer-encoding");
        if (j1Var2 != null) {
            str2 = j1Var2.f39543a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new k1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
