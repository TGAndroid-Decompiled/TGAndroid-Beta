package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f42015a;
    public final TLRPC.Document f42016b;
    public final String f42017c;
    public final MessageObject d;
    public final String e;
    public boolean f42018f;
    public boolean f42019g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f42015a = i10;
        this.d = messageObject;
        this.f42016b = document;
        this.f42017c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f42017c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f42015a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f42016b).exists();
        }
        this.f42018f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f42019g = z11;
    }
}
