package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f41507a;
    public String f41508b;
    public String f41509c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41510f;
    public TLRPC.InputFile f41511g;
    public boolean h;
    public long f41512i;
    public TLRPC.StickerSet f41513j;
    public TLRPC.Document f41514k;
    public String f41515l;
    public Utilities.Callback2 f41516m;
    public Utilities.Callback f41517n;
    public boolean f41518o;
    public ArrayList f41519p;
    public ArrayList f41520q;
    public MessageObject f41521r;
    public VideoEditedInfo f41522s;
    public float f41523t;
    public float f41524u;

    public final void a() {
        ArrayList arrayList = this.f41520q;
        ArrayList arrayList2 = this.f41519p;
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
        if (this.f41516m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41522s == null) {
            return f7 * this.f41524u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41524u, 0.5f, this.f41523t * 0.5f, f7);
    }
}
