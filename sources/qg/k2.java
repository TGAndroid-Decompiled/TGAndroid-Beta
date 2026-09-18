package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k2 {
    public String f41703a;
    public String f41704b;
    public String f41705c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41706f;
    public TLRPC.InputFile f41707g;
    public boolean h;
    public long f41708i;
    public TLRPC.StickerSet f41709j;
    public TLRPC.Document f41710k;
    public String f41711l;
    public Utilities.Callback2 f41712m;
    public Utilities.Callback f41713n;
    public boolean f41714o;
    public ArrayList f41715p;
    public ArrayList f41716q;
    public MessageObject f41717r;
    public VideoEditedInfo f41718s;
    public float f41719t;
    public float f41720u;

    public final void a() {
        ArrayList arrayList = this.f41716q;
        ArrayList arrayList2 = this.f41715p;
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
        if (this.f41712m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41718s == null) {
            return f7 * this.f41720u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41720u, 0.5f, this.f41719t * 0.5f, f7);
    }
}
