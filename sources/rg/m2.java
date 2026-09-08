package rg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m2 {
    public String f45329a;
    public String f45330b;
    public String f45331c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f45332e;
    public TLRPC.TL_messageMediaDocument f45333f;
    public TLRPC.InputFile f45334g;
    public boolean h;
    public long f45335i;
    public TLRPC.StickerSet f45336j;
    public TLRPC.Document f45337k;
    public String f45338l;
    public Utilities.Callback2 f45339m;
    public Utilities.Callback f45340n;
    public boolean f45341o;
    public ArrayList f45342p;
    public ArrayList f45343q;
    public MessageObject f45344r;
    public VideoEditedInfo f45345s;
    public float f45346t;
    public float f45347u;

    public final void a() {
        ArrayList arrayList = this.f45343q;
        ArrayList arrayList2 = this.f45342p;
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
        if (this.f45339m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45345s == null) {
            return f7 * this.f45347u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f45347u, 0.5f, this.f45346t * 0.5f, f7);
    }
}
