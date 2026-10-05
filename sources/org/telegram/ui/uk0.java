package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class uk0 {
    public boolean f41287a;
    public boolean f41288b;
    public int f41289c;
    public int d;
    public TLRPC.Document f41290e;
    public String f41291f;
    public String f41292g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f41292g)) {
            return Uri.fromFile(new File(this.f41292g));
        }
        TLRPC.Document document = this.f41290e;
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
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f41290e), file);
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
