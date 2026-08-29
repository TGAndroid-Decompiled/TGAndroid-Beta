package p4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final String f45566a;
    public final long f45567b;
    public final List f45568c;
    public final List d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f45566a = str;
        this.f45567b = j10;
        this.f45568c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
