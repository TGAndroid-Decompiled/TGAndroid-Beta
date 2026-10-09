package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m2 {
    public String f46398a;
    public String f46399b;
    public String f46400c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f46401e;
    public TLRPC.TL_messageMediaDocument f46402f;
    public TLRPC.InputFile f46403g;
    public boolean h;
    public long f46404i;
    public TLRPC.StickerSet f46405j;
    public TLRPC.Document f46406k;
    public String f46407l;
    public Utilities.Callback2 f46408m;
    public Utilities.Callback f46409n;
    public boolean f46410o;
    public ArrayList f46411p;
    public ArrayList f46412q;
    public MessageObject f46413r;
    public VideoEditedInfo f46414s;
    public float f46415t;
    public float f46416u;

    public final void a() {
        ArrayList arrayList = this.f46412q;
        ArrayList arrayList2 = this.f46411p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7;
        if (this.f46408m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f46414s == null) {
            return f7 * this.f46416u;
        }
        return com.google.android.gms.internal.vision.e2.A(this.f46416u, 0.5f, this.f46415t * 0.5f, f7);
    }
}
