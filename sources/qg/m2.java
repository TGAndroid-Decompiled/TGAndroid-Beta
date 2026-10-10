package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m2 {
    public String f46442a;
    public String f46443b;
    public String f46444c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f46445e;
    public TLRPC.TL_messageMediaDocument f46446f;
    public TLRPC.InputFile f46447g;
    public boolean h;
    public long f46448i;
    public TLRPC.StickerSet f46449j;
    public TLRPC.Document f46450k;
    public String f46451l;
    public Utilities.Callback2 f46452m;
    public Utilities.Callback f46453n;
    public boolean f46454o;
    public ArrayList f46455p;
    public ArrayList f46456q;
    public MessageObject f46457r;
    public VideoEditedInfo f46458s;
    public float f46459t;
    public float f46460u;

    public final void a() {
        ArrayList arrayList = this.f46456q;
        ArrayList arrayList2 = this.f46455p;
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
        if (this.f46452m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f46458s == null) {
            return f7 * this.f46460u;
        }
        return com.google.android.gms.internal.vision.e2.A(this.f46460u, 0.5f, this.f46459t * 0.5f, f7);
    }
}
