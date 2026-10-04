package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45435a;
    public final TLRPC.Document f45436b;
    public final String f45437c;
    public final MessageObject d;
    public final String f45438e;
    public boolean f45439f;
    public boolean f45440g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45435a = i10;
        this.d = messageObject;
        this.f45436b = document;
        this.f45437c = str;
        this.f45438e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45437c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45435a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45436b).exists();
        }
        this.f45439f = z10;
        String str2 = this.f45438e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45440g = z11;
    }
}
