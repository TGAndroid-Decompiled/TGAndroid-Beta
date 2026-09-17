package rg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m2 {
    public String f45330a;
    public String f45331b;
    public String f45332c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f45333e;
    public TLRPC.TL_messageMediaDocument f45334f;
    public TLRPC.InputFile f45335g;
    public boolean h;
    public long f45336i;
    public TLRPC.StickerSet f45337j;
    public TLRPC.Document f45338k;
    public String f45339l;
    public Utilities.Callback2 f45340m;
    public Utilities.Callback f45341n;
    public boolean f45342o;
    public ArrayList f45343p;
    public ArrayList f45344q;
    public MessageObject f45345r;
    public VideoEditedInfo f45346s;
    public float f45347t;
    public float f45348u;

    public final void a() {
        ArrayList arrayList = this.f45344q;
        ArrayList arrayList2 = this.f45343p;
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
        if (this.f45340m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45346s == null) {
            return f7 * this.f45348u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f45348u, 0.5f, this.f45347t * 0.5f, f7);
    }
}
