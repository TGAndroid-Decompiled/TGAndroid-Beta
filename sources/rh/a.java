package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45623a;
    public final TLRPC.Document f45624b;
    public final String f45625c;
    public final MessageObject d;
    public final String f45626e;
    public boolean f45627f;
    public boolean f45628g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45623a = i10;
        this.d = messageObject;
        this.f45624b = document;
        this.f45625c = str;
        this.f45626e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45625c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45623a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45624b).exists();
        }
        this.f45627f = z10;
        String str2 = this.f45626e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45628g = z11;
    }
}
