package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45752a;
    public final TLRPC.Document f45753b;
    public final String f45754c;
    public final MessageObject d;
    public final String e;
    public boolean f45755f;
    public boolean f45756g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45752a = i10;
        this.d = messageObject;
        this.f45753b = document;
        this.f45754c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45754c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45752a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45753b).exists();
        }
        this.f45755f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45756g = z11;
    }
}
