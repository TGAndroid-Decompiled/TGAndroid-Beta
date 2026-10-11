package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f46434a;
    public String f46435b;
    public String f46436c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f46437e;
    public TLRPC.TL_messageMediaDocument f46438f;
    public TLRPC.InputFile f46439g;
    public boolean h;
    public long f46440i;
    public TLRPC.StickerSet f46441j;
    public TLRPC.Document f46442k;
    public String f46443l;
    public Utilities.Callback2 f46444m;
    public Utilities.Callback f46445n;
    public boolean f46446o;
    public ArrayList f46447p;
    public ArrayList f46448q;
    public MessageObject f46449r;
    public VideoEditedInfo f46450s;
    public float f46451t;
    public float f46452u;

    public final void a() {
        ArrayList arrayList = this.f46448q;
        ArrayList arrayList2 = this.f46447p;
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
        if (this.f46444m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f46450s == null) {
            return f7 * this.f46452u;
        }
        return com.google.android.gms.internal.vision.e2.A(this.f46452u, 0.5f, this.f46451t * 0.5f, f7);
    }
}
