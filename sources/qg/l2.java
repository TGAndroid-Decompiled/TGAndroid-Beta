package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f45149a;
    public String f45150b;
    public String f45151c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f45152e;
    public TLRPC.TL_messageMediaDocument f45153f;
    public TLRPC.InputFile f45154g;
    public boolean h;
    public long f45155i;
    public TLRPC.StickerSet f45156j;
    public TLRPC.Document f45157k;
    public String f45158l;
    public Utilities.Callback2 f45159m;
    public Utilities.Callback f45160n;
    public boolean f45161o;
    public ArrayList f45162p;
    public ArrayList f45163q;
    public MessageObject f45164r;
    public VideoEditedInfo f45165s;
    public float f45166t;
    public float f45167u;

    public final void a() {
        ArrayList arrayList = this.f45163q;
        ArrayList arrayList2 = this.f45162p;
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
        if (this.f45159m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45165s == null) {
            return f7 * this.f45167u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f45167u, 0.5f, this.f45166t * 0.5f, f7);
    }
}
