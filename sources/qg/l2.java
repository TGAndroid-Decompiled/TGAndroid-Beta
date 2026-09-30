package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41837a;
    public String f41838b;
    public String f41839c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41840f;
    public TLRPC.InputFile f41841g;
    public boolean h;
    public long f41842i;
    public TLRPC.StickerSet f41843j;
    public TLRPC.Document f41844k;
    public String f41845l;
    public Utilities.Callback2 f41846m;
    public Utilities.Callback f41847n;
    public boolean f41848o;
    public ArrayList f41849p;
    public ArrayList f41850q;
    public MessageObject f41851r;
    public VideoEditedInfo f41852s;
    public float f41853t;
    public float f41854u;

    public final void a() {
        ArrayList arrayList = this.f41850q;
        ArrayList arrayList2 = this.f41849p;
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
        if (this.f41846m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41852s == null) {
            return f7 * this.f41854u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41854u, 0.5f, this.f41853t * 0.5f, f7);
    }
}
