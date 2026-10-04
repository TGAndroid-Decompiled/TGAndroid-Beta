package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45436a;
    public final TLRPC.Document f45437b;
    public final String f45438c;
    public final MessageObject d;
    public final String f45439e;
    public boolean f45440f;
    public boolean f45441g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45436a = i10;
        this.d = messageObject;
        this.f45437b = document;
        this.f45438c = str;
        this.f45439e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45438c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45436a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45437b).exists();
        }
        this.f45440f = z10;
        String str2 = this.f45439e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45441g = z11;
    }
}
