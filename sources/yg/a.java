package yg;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f50199a;
    public final TLRPC.Document f50200b;
    public final String f50201c;
    public final MessageObject d;
    public final String f50202e;
    public boolean f50203f;
    public boolean f50204g;

    public a(int i9, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f50199a = i9;
        this.d = messageObject;
        this.f50200b = document;
        this.f50201c = str;
        this.f50202e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f50201c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i9 = this.f50199a;
        if (!z10) {
            z10 = FileLoader.getInstance(i9).getPathToAttach(this.f50200b).exists();
        }
        this.f50203f = z10;
        String str2 = this.f50202e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i9).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f50204g = z11;
    }
}
