package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class sh0 {
    public boolean f49913a;
    public boolean f49914b;
    public int f49915c;
    public int d;
    public TLRPC.Document f49916e;
    public String f49917f;
    public String f49918g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f49918g)) {
            return Uri.fromFile(new File(this.f49918g));
        }
        TLRPC.Document document = this.f49916e;
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
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f49916e), file);
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
