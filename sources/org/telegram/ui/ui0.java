package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class ui0 {
    public boolean f41955a;
    public boolean f41956b;
    public int f41957c;
    public int d;
    public TLRPC.Document e;
    public String f41958f;
    public String f41959g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f41959g)) {
            return Uri.fromFile(new File(this.f41959g));
        }
        TLRPC.Document document = this.e;
        if (document != null) {
            String str = document.file_name_fixed;
            String A = org.telegram.messenger.b8.A(document);
            if (A != null) {
                String lowerCase = A.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a1.g.C(str, ".", lowerCase);
                }
                File file = new File(org.telegram.messenger.i0.E0(), str);
                if (!file.exists()) {
                    try {
                        org.telegram.messenger.b8.G(i10);
                        org.telegram.messenger.i0.E(org.telegram.messenger.b8.I(this.e), file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return Uri.fromFile(file);
            }
            return null;
        }
        return null;
    }
}
