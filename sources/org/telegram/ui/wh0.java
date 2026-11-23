package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class wh0 {
    public boolean f53402a;
    public boolean f53403b;
    public int f53404c;
    public int d;
    public TLRPC.Document f53405e;
    public String f53406f;
    public String f53407g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f53407g)) {
            return Uri.fromFile(new File(this.f53407g));
        }
        TLRPC.Document document = this.f53405e;
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
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f53405e), file);
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
