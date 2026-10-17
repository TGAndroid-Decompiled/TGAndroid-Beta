package rg;

import com.google.android.gms.internal.cast.a6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k2 {
    public String f45458a;
    public String f45459b;
    public String f45460c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45461f;
    public TLRPC.InputFile f45462g;
    public boolean h;
    public long f45463i;
    public TLRPC.StickerSet f45464j;
    public TLRPC.Document f45465k;
    public String f45466l;
    public Utilities.Callback2 f45467m;
    public Utilities.Callback f45468n;
    public boolean f45469o;
    public ArrayList f45470p;
    public ArrayList f45471q;
    public MessageObject f45472r;
    public VideoEditedInfo f45473s;
    public float f45474t;
    public float f45475u;

    public final void a() {
        ArrayList arrayList = this.f45471q;
        ArrayList arrayList2 = this.f45470p;
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
        if (this.f45467m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45473s == null) {
            return f7 * this.f45475u;
        }
        return a6.A(this.f45475u, 0.5f, this.f45474t * 0.5f, f7);
    }
}
