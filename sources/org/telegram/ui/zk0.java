package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class zk0 {
    public boolean f44870a;
    public boolean f44871b;
    public int f44872c;
    public int d;
    public TLRPC.Document f44873e;
    public String f44874f;
    public String f44875g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f44875g)) {
            return Uri.fromFile(new File(this.f44875g));
        }
        TLRPC.Document document = this.f44873e;
        if (document != null) {
            String str = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension != null) {
                String lowerCase = documentExtension.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a1.g.D(str, ".", lowerCase);
                }
                File file = new File(AndroidUtilities.getCacheDir(), str);
                if (!file.exists()) {
                    try {
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f44873e), file);
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                return Uri.fromFile(file);
            }
            return null;
        }
        return null;
    }
}
