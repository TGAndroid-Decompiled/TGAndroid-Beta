package pg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f40103a;
    public String f40104b;
    public String f40105c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f40106f;
    public TLRPC.InputFile f40107g;
    public boolean h;
    public long f40108i;
    public TLRPC.StickerSet f40109j;
    public TLRPC.Document f40110k;
    public String f40111l;
    public Utilities.Callback2 f40112m;
    public Utilities.Callback f40113n;
    public boolean f40114o;
    public ArrayList f40115p;
    public ArrayList f40116q;
    public MessageObject f40117r;
    public VideoEditedInfo f40118s;
    public float f40119t;
    public float f40120u;

    public final void a() {
        ArrayList arrayList = this.f40116q;
        ArrayList arrayList2 = this.f40115p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7;
        if (this.f40112m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f40118s == null) {
            return f7 * this.f40120u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f40120u, 0.5f, this.f40119t * 0.5f, f7);
    }
}
