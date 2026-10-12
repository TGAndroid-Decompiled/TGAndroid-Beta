package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f46599a;
    public final TLRPC.Document f46600b;
    public final String f46601c;
    public final MessageObject d;
    public final String f46602e;
    public boolean f46603f;
    public boolean f46604g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f46599a = i10;
        this.d = messageObject;
        this.f46600b = document;
        this.f46601c = str;
        this.f46602e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f46601c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f46599a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f46600b).exists();
        }
        this.f46603f = z10;
        String str2 = this.f46602e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f46604g = z11;
    }
}
