package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f46468a;
    public String f46469b;
    public String f46470c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f46471e;
    public TLRPC.TL_messageMediaDocument f46472f;
    public TLRPC.InputFile f46473g;
    public boolean h;
    public long f46474i;
    public TLRPC.StickerSet f46475j;
    public TLRPC.Document f46476k;
    public String f46477l;
    public Utilities.Callback2 f46478m;
    public Utilities.Callback f46479n;
    public boolean f46480o;
    public ArrayList f46481p;
    public ArrayList f46482q;
    public MessageObject f46483r;
    public VideoEditedInfo f46484s;
    public float f46485t;
    public float f46486u;

    public final void a() {
        ArrayList arrayList = this.f46482q;
        ArrayList arrayList2 = this.f46481p;
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
        if (this.f46478m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f46484s == null) {
            return f7 * this.f46486u;
        }
        return com.google.android.gms.internal.vision.e2.A(this.f46486u, 0.5f, this.f46485t * 0.5f, f7);
    }
}
