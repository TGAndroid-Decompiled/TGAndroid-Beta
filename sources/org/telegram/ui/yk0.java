package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class yk0 {
    public boolean f44360a;
    public boolean f44361b;
    public int f44362c;
    public int d;
    public TLRPC.Document f44363e;
    public String f44364f;
    public String f44365g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f44365g)) {
            return Uri.fromFile(new File(this.f44365g));
        }
        TLRPC.Document document = this.f44363e;
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
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f44363e), file);
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
