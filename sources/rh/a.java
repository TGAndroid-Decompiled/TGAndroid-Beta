package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45622a;
    public final TLRPC.Document f45623b;
    public final String f45624c;
    public final MessageObject d;
    public final String f45625e;
    public boolean f45626f;
    public boolean f45627g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45622a = i10;
        this.d = messageObject;
        this.f45623b = document;
        this.f45624c = str;
        this.f45625e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45624c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45622a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45623b).exists();
        }
        this.f45626f = z10;
        String str2 = this.f45625e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45627g = z11;
    }
}
