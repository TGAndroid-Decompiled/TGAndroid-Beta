package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f42043a;
    public final TLRPC.Document f42044b;
    public final String f42045c;
    public final MessageObject d;
    public final String e;
    public boolean f42046f;
    public boolean f42047g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f42043a = i10;
        this.d = messageObject;
        this.f42044b = document;
        this.f42045c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f42045c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f42043a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f42044b).exists();
        }
        this.f42046f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f42047g = z11;
    }
}
