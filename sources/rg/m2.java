package rg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m2 {
    public String f45301a;
    public String f45302b;
    public String f45303c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f45304e;
    public TLRPC.TL_messageMediaDocument f45305f;
    public TLRPC.InputFile f45306g;
    public boolean h;
    public long f45307i;
    public TLRPC.StickerSet f45308j;
    public TLRPC.Document f45309k;
    public String f45310l;
    public Utilities.Callback2 f45311m;
    public Utilities.Callback f45312n;
    public boolean f45313o;
    public ArrayList f45314p;
    public ArrayList f45315q;
    public MessageObject f45316r;
    public VideoEditedInfo f45317s;
    public float f45318t;
    public float f45319u;

    public final void a() {
        ArrayList arrayList = this.f45315q;
        ArrayList arrayList2 = this.f45314p;
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
        if (this.f45311m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45317s == null) {
            return f7 * this.f45319u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f45319u, 0.5f, this.f45318t * 0.5f, f7);
    }
}
