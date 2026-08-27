package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

public final class h1 {

    public final HashMap f43848a = new HashMap();

    public File f43849b;

    public long f43850c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new g1(this.f43849b, this.f43850c, this.d));
        HashMap map = this.f43848a;
        i1 i1Var = (i1) map.get("content-transfer-encoding");
        if ("base64".equals(i1Var == null ? null : i1Var.f43864a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        i1 i1Var2 = (i1) map.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(i1Var2 != null ? i1Var2.f43864a : null) ? new j1(bufferedInputStream) : bufferedInputStream;
    }
}
