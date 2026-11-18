package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class vh0 {
    public boolean f52794a;
    public boolean f52795b;
    public int f52796c;
    public int d;
    public TLRPC.Document f52797e;
    public String f52798f;
    public String f52799g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f52799g)) {
            return Uri.fromFile(new File(this.f52799g));
        }
        TLRPC.Document document = this.f52797e;
        if (document != null) {
            String str = document.file_name_fixed;
            String A = org.telegram.messenger.w7.A(document);
            if (A != null) {
                String lowerCase = A.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a8.p0.E(str, ".", lowerCase);
                }
                File file = new File(org.telegram.messenger.g0.E0(), str);
                if (!file.exists()) {
                    try {
                        org.telegram.messenger.w7.G(i7);
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f52797e), file);
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
