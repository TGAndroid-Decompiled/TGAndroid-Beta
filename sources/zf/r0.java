package zf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r0 implements Comparator {
    public final a0.h f55636a;
    public final ArrayList f55637b;

    public r0(a0.h hVar, ArrayList arrayList) {
        this.f55636a = hVar;
        this.f55637b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long j10;
        long j11;
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f19943id;
        } else {
            j10 = -((TLRPC.Chat) tLObject).f19794id;
        }
        if (tLObject2 instanceof TLRPC.User) {
            j11 = ((TLRPC.User) tLObject2).f19943id;
        } else {
            j11 = -((TLRPC.Chat) tLObject2).f19794id;
        }
        a0.h hVar = this.f55636a;
        if (hVar.h(j10) < 0 || hVar.h(j11) < 0) {
            if (hVar.h(j10) < 0) {
                if (hVar.h(j11) < 0) {
                    Long valueOf = Long.valueOf(j10);
                    ArrayList arrayList = this.f55637b;
                    int indexOf = arrayList.indexOf(valueOf);
                    int indexOf2 = arrayList.indexOf(Long.valueOf(j11));
                    if (indexOf != -1 && indexOf2 != -1) {
                        if (indexOf >= indexOf2) {
                            if (indexOf != indexOf2) {
                                return 1;
                            }
                            return 0;
                        }
                    } else if (indexOf == -1 || indexOf2 != -1) {
                        if (indexOf == -1 && indexOf2 != -1) {
                            return 1;
                        }
                        return 0;
                    }
                } else {
                    return 1;
                }
            }
            return -1;
        }
        return 0;
    }
}
