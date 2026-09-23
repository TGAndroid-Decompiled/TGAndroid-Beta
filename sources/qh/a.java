package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f41696a;
    public final TLRPC.Document f41697b;
    public final String f41698c;
    public final MessageObject d;
    public final String e;
    public boolean f41699f;
    public boolean f41700g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f41696a = i10;
        this.d = messageObject;
        this.f41697b = document;
        this.f41698c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f41698c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f41696a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f41697b).exists();
        }
        this.f41699f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f41700g = z11;
    }
}
