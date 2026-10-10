package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f46698a;
    public final TLRPC.Document f46699b;
    public final String f46700c;
    public final MessageObject d;
    public final String f46701e;
    public boolean f46702f;
    public boolean f46703g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f46698a = i10;
        this.d = messageObject;
        this.f46699b = document;
        this.f46700c = str;
        this.f46701e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f46700c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f46698a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f46699b).exists();
        }
        this.f46702f = z10;
        String str2 = this.f46701e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f46703g = z11;
    }
}
