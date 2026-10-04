package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f45134a;
    public String f45135b;
    public String f45136c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f45137e;
    public TLRPC.TL_messageMediaDocument f45138f;
    public TLRPC.InputFile f45139g;
    public boolean h;
    public long f45140i;
    public TLRPC.StickerSet f45141j;
    public TLRPC.Document f45142k;
    public String f45143l;
    public Utilities.Callback2 f45144m;
    public Utilities.Callback f45145n;
    public boolean f45146o;
    public ArrayList f45147p;
    public ArrayList f45148q;
    public MessageObject f45149r;
    public VideoEditedInfo f45150s;
    public float f45151t;
    public float f45152u;

    public final void a() {
        ArrayList arrayList = this.f45148q;
        ArrayList arrayList2 = this.f45147p;
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
        if (this.f45144m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45150s == null) {
            return f7 * this.f45152u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f45152u, 0.5f, this.f45151t * 0.5f, f7);
    }
}
