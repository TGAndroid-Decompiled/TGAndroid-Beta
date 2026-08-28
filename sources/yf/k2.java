package yf;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k2 {
    public String f49906a;
    public String f49907b;
    public String f49908c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f49909e;
    public TLRPC.TL_messageMediaDocument f49910f;
    public TLRPC.InputFile f49911g;
    public boolean h;
    public long f49912i;
    public TLRPC.StickerSet f49913j;
    public TLRPC.Document f49914k;
    public String f49915l;
    public Utilities.Callback2 f49916m;
    public Utilities.Callback f49917n;
    public boolean f49918o;
    public ArrayList f49919p;
    public ArrayList f49920q;
    public MessageObject f49921r;
    public VideoEditedInfo f49922s;
    public float f49923t;
    public float f49924u;

    public final void a() {
        ArrayList arrayList = this.f49920q;
        ArrayList arrayList2 = this.f49919p;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            try {
                ((File) obj).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            try {
                ((File) obj2).delete();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f10;
        if (this.f49916m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f49922s == null) {
            return f10 * this.f49924u;
        }
        return e2.c.B(this.f49924u, 0.5f, this.f49923t * 0.5f, f10);
    }
}
