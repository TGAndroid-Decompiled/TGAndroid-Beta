package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class wh0 {
    public boolean f53436a;
    public boolean f53437b;
    public int f53438c;
    public int d;
    public TLRPC.Document f53439e;
    public String f53440f;
    public String f53441g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f53441g)) {
            return Uri.fromFile(new File(this.f53441g));
        }
        TLRPC.Document document = this.f53439e;
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
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f53439e), file);
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
