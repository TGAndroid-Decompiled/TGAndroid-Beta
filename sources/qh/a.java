package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f46763a;
    public final TLRPC.Document f46764b;
    public final String f46765c;
    public final MessageObject d;
    public final String f46766e;
    public boolean f46767f;
    public boolean f46768g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f46763a = i10;
        this.d = messageObject;
        this.f46764b = document;
        this.f46765c = str;
        this.f46766e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f46765c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f46763a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f46764b).exists();
        }
        this.f46767f = z10;
        String str2 = this.f46766e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f46768g = z11;
    }
}
