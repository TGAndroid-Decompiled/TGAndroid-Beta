package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f41502a;
    public String f41503b;
    public String f41504c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41505f;
    public TLRPC.InputFile f41506g;
    public boolean h;
    public long f41507i;
    public TLRPC.StickerSet f41508j;
    public TLRPC.Document f41509k;
    public String f41510l;
    public Utilities.Callback2 f41511m;
    public Utilities.Callback f41512n;
    public boolean f41513o;
    public ArrayList f41514p;
    public ArrayList f41515q;
    public MessageObject f41516r;
    public VideoEditedInfo f41517s;
    public float f41518t;
    public float f41519u;

    public final void a() {
        ArrayList arrayList = this.f41515q;
        ArrayList arrayList2 = this.f41514p;
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
        if (this.f41511m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41517s == null) {
            return f7 * this.f41519u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41519u, 0.5f, this.f41518t * 0.5f, f7);
    }
}
