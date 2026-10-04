package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f45142a;
    public String f45143b;
    public String f45144c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f45145e;
    public TLRPC.TL_messageMediaDocument f45146f;
    public TLRPC.InputFile f45147g;
    public boolean h;
    public long f45148i;
    public TLRPC.StickerSet f45149j;
    public TLRPC.Document f45150k;
    public String f45151l;
    public Utilities.Callback2 f45152m;
    public Utilities.Callback f45153n;
    public boolean f45154o;
    public ArrayList f45155p;
    public ArrayList f45156q;
    public MessageObject f45157r;
    public VideoEditedInfo f45158s;
    public float f45159t;
    public float f45160u;

    public final void a() {
        ArrayList arrayList = this.f45156q;
        ArrayList arrayList2 = this.f45155p;
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
        if (this.f45152m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45158s == null) {
            return f7 * this.f45160u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f45160u, 0.5f, this.f45159t * 0.5f, f7);
    }
}
