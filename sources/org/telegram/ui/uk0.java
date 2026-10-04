package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class uk0 {
    public boolean f41252a;
    public boolean f41253b;
    public int f41254c;
    public int d;
    public TLRPC.Document f41255e;
    public String f41256f;
    public String f41257g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f41257g)) {
            return Uri.fromFile(new File(this.f41257g));
        }
        TLRPC.Document document = this.f41255e;
        if (document != null) {
            String str = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension != null) {
                String lowerCase = documentExtension.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a4.a.D(str, ".", lowerCase);
                }
                File file = new File(AndroidUtilities.getCacheDir(), str);
                if (!file.exists()) {
                    try {
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f41255e), file);
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
