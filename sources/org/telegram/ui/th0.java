package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class th0 {
    public boolean f50281a;
    public boolean f50282b;
    public int f50283c;
    public int d;
    public TLRPC.Document f50284e;
    public String f50285f;
    public String f50286g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f50286g)) {
            return Uri.fromFile(new File(this.f50286g));
        }
        TLRPC.Document document = this.f50284e;
        if (document != null) {
            String str = document.file_name_fixed;
            String A = org.telegram.messenger.w7.A(document);
            if (A != null) {
                String lowerCase = A.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a8.p0.D(str, ".", lowerCase);
                }
                File file = new File(org.telegram.messenger.g0.E0(), str);
                if (!file.exists()) {
                    try {
                        org.telegram.messenger.w7.G(i7);
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f50284e), file);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                return Uri.fromFile(file);
            }
            return null;
        }
        return null;
    }
}
