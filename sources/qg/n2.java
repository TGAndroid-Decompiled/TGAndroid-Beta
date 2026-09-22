package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f41476a;
    public String f41477b;
    public String f41478c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41479f;
    public TLRPC.InputFile f41480g;
    public boolean h;
    public long f41481i;
    public TLRPC.StickerSet f41482j;
    public TLRPC.Document f41483k;
    public String f41484l;
    public Utilities.Callback2 f41485m;
    public Utilities.Callback f41486n;
    public boolean f41487o;
    public ArrayList f41488p;
    public ArrayList f41489q;
    public MessageObject f41490r;
    public VideoEditedInfo f41491s;
    public float f41492t;
    public float f41493u;

    public final void a() {
        ArrayList arrayList = this.f41489q;
        ArrayList arrayList2 = this.f41488p;
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
        if (this.f41485m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41491s == null) {
            return f7 * this.f41493u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41493u, 0.5f, this.f41492t * 0.5f, f7);
    }
}
