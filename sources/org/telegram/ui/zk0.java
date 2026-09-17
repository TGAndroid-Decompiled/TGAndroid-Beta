package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class zk0 {
    public boolean f43452a;
    public boolean f43453b;
    public int f43454c;
    public int d;
    public TLRPC.Document f43455e;
    public String f43456f;
    public String f43457g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f43457g)) {
            return Uri.fromFile(new File(this.f43457g));
        }
        TLRPC.Document document = this.f43455e;
        if (document != null) {
            String str = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension != null) {
                String lowerCase = documentExtension.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a4.a.C(str, ".", lowerCase);
                }
                File file = new File(AndroidUtilities.getCacheDir(), str);
                if (!file.exists()) {
                    try {
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f43455e), file);
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
