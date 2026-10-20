package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45734a;
    public final TLRPC.Document f45735b;
    public final String f45736c;
    public final MessageObject d;
    public final String e;
    public boolean f45737f;
    public boolean f45738g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45734a = i10;
        this.d = messageObject;
        this.f45735b = document;
        this.f45736c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45736c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45734a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45735b).exists();
        }
        this.f45737f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45738g = z11;
    }
}
